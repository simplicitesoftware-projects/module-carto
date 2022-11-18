package com.simplicite.extobjects.Application;

import java.util.*;

import com.simplicite.util.*;
import com.simplicite.util.exceptions.*;
import com.simplicite.util.tools.*;
import com.simplicite.webapp.web.StaticSiteExternalObject;

import org.json.*;
/**
 * External object CartoPublication
 */
public class CartoPublication extends ExternalObject { // or com.simplicite.webapp.web.ResponsiveExternalObject for a custom UI component
	                                                 // or com.simplicite.webapp.services.RESTServiceExternalObject for a custom API
	                                                 // etc.
	private static final long serialVersionUID = 1L;
	
	@Override
	public String display(Parameters param){
		try {
			appendMustache();
			ObjectDB app = getGrant().getTmpObject("CartoApplication");
			JSONObject appData = new JSONObject();
			if(app.select(param.getParameter("id"))){
				appData = getData(app);
				String c = app.getFieldValue("cartoAppCiatConf");
				String i = app.getFieldValue("cartoAppCiatIntegrity");
				String a = app.getFieldValue("cartoAppCiatAvailability");
				String t = app.getFieldValue("cartoAppTraceability");
				appData.put("c", c).put("i", i).put("a", a).put("t", t);
			}
			return javascript(getName() + ".render(ctn, "+appData+");");
		} catch (Exception e) {
			AppLog.error(null, e, getGrant());
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
}
