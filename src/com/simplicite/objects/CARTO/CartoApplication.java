package com.simplicite.objects.CARTO;

import com.simplicite.commons.Application.*;
import java.util.*;
import com.simplicite.util.*;
import com.simplicite.util.tools.*;
import org.json.*;
/**
 * Business object CartoApplication
 */
public class CartoApplication extends ObjectDB {
	private static final long serialVersionUID = 1L;


	public Object createReport(PrintTemplate pt) {
    	JSONObject data = getData(this);
        data.put("chart", getParameter("CHART"));
        String html = renderTemplateWithData("REPORT", data);
        try {
            pt.setFilename(getDisplay() + ".pdf");
            pt.setMIMEType(HTTPTool.MIME_TYPE_PDF);
            Grant g = getGrant();
            return HTMLToPDFTool.toPDF(html);
        } catch (Throwable e) {
            AppLog.error(e.getMessage(), e, getGrant());
            return e.getMessage();
        }
    }
    
    private JSONObject getData(ObjectDB o){
    	JSONObject data = new JSONObject();
    	for (ObjectField of : o.getFields()) {
            data.put(of.getName(), of.getDisplayValue());
        }
        return data;
    }

	private String renderTemplateWithData(String templateName, JSONObject data){
		return MustacheTool.apply(HTMLTool.getResourceHTMLContent(this, templateName), data);
	}
}