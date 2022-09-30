package com.simplicite.objects.CARTO;

import java.util.*;
import com.simplicite.util.*;
import com.simplicite.util.tools.*;

/**
 * Business object CartoUser
 */
public class CartoUser extends com.simplicite.objects.System.SimpleUser {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void postLoad() {
		super.postLoad();
		// hide most of the SimpleUser fields, keeping only email & login
		getField("usr_image_id").setVisible(ObjectField.VIS_HIDDEN);
		//getField("usr_email").setVisible(ObjectField.VIS_HIDDEN);
		getField("usr_lang").setVisible(ObjectField.VIS_HIDDEN);
		getField("usr_cell_num").setVisible(ObjectField.VIS_HIDDEN);
		getField("usr_active").setVisible(ObjectField.VIS_HIDDEN);
		getField("usr_home_id").setVisible(ObjectField.VIS_HIDDEN);
		getField("row_module_id").setVisible(ObjectField.VIS_HIDDEN);
		
	}
	
	@Override
	public List<String> preValidate() {
		// set some mandatory SimpleUser fields
		setFieldValue("row_module_id", ModuleDB.getModuleId("ApplicationUsers"));
		//following does not work because usr_menu is not part of SimpleUser
		// we manage it in a postSave query to avoid adding a useless object attribute
		//setFieldValue("usr_menu", "1");
		
		return super.preValidate();
	}
	
}