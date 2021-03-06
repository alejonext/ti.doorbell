/**
 * Copyright (c) 2011 by AlejoNext. All Rights Reserved.
 * Author: Alejo Next alejonext@gmail
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */
package ti.doorbell;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;

@Kroll.module(name="Doorbell", id="ti.doorbell")
public class DoorbellModule extends KrollModule
{
	private static final String TAG = "DoorbellModule";
	public static String MODULE_NAME = "AndroidDoorbellModule";
	// Standard Debugging variables
	private static final String LCAT = "DoorbellModule";
	private static final boolean DBG = TiConfig.LOGD;

	@Kroll.constant
	public static final String SHOW = "show";

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;

	public static Boolean TESTING = false;
	public static Boolean HIDEEMAIL = false;
	public static Boolean HIDEPOWEREDBY = false;

	public static String APIKEY;
	public static String APPID;
	public static String EMAIL;
	public static String EMAILHINT;
	public static String MESSAGEHINT;
	public static String NAME;
	public static String NEGATIVEBUTTONTEXT;
	public static String POSITIVEBUTTONTEXT;
	public static String TITLE;

	public DoorbellModule()
	{
		super();
	}


	@Kroll.method
	public void setAppId(String appId) {
		Log.d(TAG, "setAppId(): " + appId);
		APPID = appId;
	}

	@Kroll.method
	public void setApiKey(String apiKey) {
		Log.d(TAG, "setApiKey(): " + apiKey);
		APIKEY = apiKey;
	}

	@Kroll.method
	public void setTesting(Boolean testing) {
		Log.d(TAG, "setTesting(): " + testing);
		TESTING = testing;
	}
}

