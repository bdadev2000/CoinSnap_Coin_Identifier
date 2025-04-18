package com.facebook.appevents.integrity;

import com.facebook.FacebookSdk;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.a;

/* loaded from: classes3.dex */
public final class RedactedEventsManager {
    private static boolean enabled;

    @NotNull
    public static final RedactedEventsManager INSTANCE = new RedactedEventsManager();

    @NotNull
    private static Map<String, HashSet<String>> redactedEvents = new HashMap();

    private RedactedEventsManager() {
    }

    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(RedactedEventsManager.class)) {
            return;
        }
        try {
            enabled = false;
            redactedEvents = new HashMap();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RedactedEventsManager.class);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(RedactedEventsManager.class)) {
            return;
        }
        try {
            INSTANCE.loadRedactedEvents();
            if (!redactedEvents.isEmpty()) {
                enabled = true;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RedactedEventsManager.class);
        }
    }

    private final String getRedactionString(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            for (String str2 : redactedEvents.keySet()) {
                HashSet<String> hashSet = redactedEvents.get(str2);
                if (hashSet != null && hashSet.contains(str)) {
                    return str2;
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final void loadRedactedEvents() {
        int length;
        HashSet<String> convertJSONArrayToHashSet;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
            int i2 = 0;
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null) {
                return;
            }
            try {
                redactedEvents = new HashMap();
                JSONArray redactedEvents2 = queryAppSettings.getRedactedEvents();
                if (redactedEvents2 == null || redactedEvents2.length() == 0 || (length = redactedEvents2.length()) <= 0) {
                    return;
                }
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject jSONObject = redactedEvents2.getJSONObject(i2);
                    boolean has = jSONObject.has(SDKConstants.PARAM_KEY);
                    boolean has2 = jSONObject.has("value");
                    if (has && has2) {
                        String string = jSONObject.getString(SDKConstants.PARAM_KEY);
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        if (string != null && (convertJSONArrayToHashSet = Utility.convertJSONArrayToHashSet(jSONArray)) != null) {
                            redactedEvents.put(string, convertJSONArrayToHashSet);
                        }
                    }
                    if (i3 >= length) {
                        return;
                    } else {
                        i2 = i3;
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @NotNull
    public static final String processEventsRedaction(@NotNull String str) {
        if (CrashShieldHandler.isObjectCrashing(RedactedEventsManager.class)) {
            return null;
        }
        try {
            a.s(str, "eventName");
            if (enabled) {
                String redactionString = INSTANCE.getRedactionString(str);
                if (redactionString != null) {
                    return redactionString;
                }
            }
            return str;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RedactedEventsManager.class);
            return null;
        }
    }
}
