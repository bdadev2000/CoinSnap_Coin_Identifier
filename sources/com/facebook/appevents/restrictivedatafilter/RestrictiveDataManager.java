package com.facebook.appevents.restrictivedatafilter;

import android.util.Log;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p0.a;

@RestrictTo
/* loaded from: classes3.dex */
public final class RestrictiveDataManager {

    @NotNull
    private static final String PROCESS_EVENT_NAME = "process_event_name";

    @NotNull
    private static final String REPLACEMENT_STRING = "_removed_";

    @NotNull
    private static final String RESTRICTIVE_PARAM = "restrictive_param";

    @NotNull
    private static final String RESTRICTIVE_PARAM_KEY = "_restrictedParams";
    private static boolean enabled;

    @NotNull
    public static final RestrictiveDataManager INSTANCE = new RestrictiveDataManager();
    private static final String TAG = RestrictiveDataManager.class.getCanonicalName();

    @NotNull
    private static final List<RestrictiveParamFilter> restrictiveParamFilters = new ArrayList();

    @NotNull
    private static final Set<String> restrictedEvents = new CopyOnWriteArraySet();

    /* loaded from: classes3.dex */
    public static final class RestrictiveParamFilter {

        @NotNull
        private String eventName;

        @NotNull
        private Map<String, String> restrictiveParams;

        public RestrictiveParamFilter(@NotNull String str, @NotNull Map<String, String> map) {
            a.s(str, "eventName");
            a.s(map, "restrictiveParams");
            this.eventName = str;
            this.restrictiveParams = map;
        }

        @NotNull
        public final String getEventName() {
            return this.eventName;
        }

        @NotNull
        public final Map<String, String> getRestrictiveParams() {
            return this.restrictiveParams;
        }

        public final void setEventName(@NotNull String str) {
            a.s(str, "<set-?>");
            this.eventName = str;
        }

        public final void setRestrictiveParams(@NotNull Map<String, String> map) {
            a.s(map, "<set-?>");
            this.restrictiveParams = map;
        }
    }

    private RestrictiveDataManager() {
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(RestrictiveDataManager.class)) {
            return;
        }
        try {
            enabled = true;
            INSTANCE.initialize();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RestrictiveDataManager.class);
        }
    }

    private final String getMatchedRuleType(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            try {
                for (RestrictiveParamFilter restrictiveParamFilter : new ArrayList(restrictiveParamFilters)) {
                    if (restrictiveParamFilter != null && a.g(str, restrictiveParamFilter.getEventName())) {
                        for (String str3 : restrictiveParamFilter.getRestrictiveParams().keySet()) {
                            if (a.g(str2, str3)) {
                                return restrictiveParamFilter.getRestrictiveParams().get(str3);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Log.w(TAG, "getMatchedRuleType failed", e);
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final void initialize() {
        String restrictiveDataSetting;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (queryAppSettings != null && (restrictiveDataSetting = queryAppSettings.getRestrictiveDataSetting()) != null && restrictiveDataSetting.length() != 0) {
                JSONObject jSONObject = new JSONObject(restrictiveDataSetting);
                restrictiveParamFilters.clear();
                restrictedEvents.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        JSONObject optJSONObject = jSONObject2.optJSONObject(RESTRICTIVE_PARAM);
                        a.r(next, SDKConstants.PARAM_KEY);
                        RestrictiveParamFilter restrictiveParamFilter = new RestrictiveParamFilter(next, new HashMap());
                        if (optJSONObject != null) {
                            restrictiveParamFilter.setRestrictiveParams(Utility.convertJSONObjectToStringMap(optJSONObject));
                            restrictiveParamFilters.add(restrictiveParamFilter);
                        }
                        if (jSONObject2.has(PROCESS_EVENT_NAME)) {
                            restrictedEvents.add(restrictiveParamFilter.getEventName());
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final boolean isRestrictedEvent(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return restrictedEvents.contains(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    @NotNull
    public static final String processEvent(@NotNull String str) {
        if (CrashShieldHandler.isObjectCrashing(RestrictiveDataManager.class)) {
            return null;
        }
        try {
            a.s(str, "eventName");
            return enabled ? INSTANCE.isRestrictedEvent(str) ? REPLACEMENT_STRING : str : str;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RestrictiveDataManager.class);
            return null;
        }
    }

    public static final void processParameters(@NotNull Map<String, String> map, @NotNull String str) {
        if (CrashShieldHandler.isObjectCrashing(RestrictiveDataManager.class)) {
            return;
        }
        try {
            a.s(map, "parameters");
            a.s(str, "eventName");
            if (enabled) {
                HashMap hashMap = new HashMap();
                for (String str2 : new ArrayList(map.keySet())) {
                    String matchedRuleType = INSTANCE.getMatchedRuleType(str, str2);
                    if (matchedRuleType != null) {
                        hashMap.put(str2, matchedRuleType);
                        map.remove(str2);
                    }
                }
                if (!hashMap.isEmpty()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        map.put(RESTRICTIVE_PARAM_KEY, jSONObject.toString());
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RestrictiveDataManager.class);
        }
    }
}
