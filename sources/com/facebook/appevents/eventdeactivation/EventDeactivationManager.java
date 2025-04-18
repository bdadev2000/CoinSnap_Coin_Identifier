package com.facebook.appevents.eventdeactivation;

import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEvent;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.safedk.android.analytics.events.CrashEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.a;

@RestrictTo
/* loaded from: classes2.dex */
public final class EventDeactivationManager {
    private static boolean enabled;

    @NotNull
    public static final EventDeactivationManager INSTANCE = new EventDeactivationManager();

    @NotNull
    private static final List<DeprecatedParamFilter> deprecatedParamFilters = new ArrayList();

    @NotNull
    private static final Set<String> deprecatedEvents = new HashSet();

    /* loaded from: classes2.dex */
    public static final class DeprecatedParamFilter {

        @NotNull
        private List<String> deprecateParams;

        @NotNull
        private String eventName;

        public DeprecatedParamFilter(@NotNull String str, @NotNull List<String> list) {
            a.s(str, "eventName");
            a.s(list, "deprecateParams");
            this.eventName = str;
            this.deprecateParams = list;
        }

        @NotNull
        public final List<String> getDeprecateParams() {
            return this.deprecateParams;
        }

        @NotNull
        public final String getEventName() {
            return this.eventName;
        }

        public final void setDeprecateParams(@NotNull List<String> list) {
            a.s(list, "<set-?>");
            this.deprecateParams = list;
        }

        public final void setEventName(@NotNull String str) {
            a.s(str, "<set-?>");
            this.eventName = str;
        }
    }

    private EventDeactivationManager() {
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(EventDeactivationManager.class)) {
            return;
        }
        try {
            enabled = true;
            INSTANCE.initialize();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, EventDeactivationManager.class);
        }
    }

    private final synchronized void initialize() {
        FetchedAppSettings queryAppSettings;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
            queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
        } catch (Exception unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return;
        }
        if (queryAppSettings == null) {
            return;
        }
        String restrictiveDataSetting = queryAppSettings.getRestrictiveDataSetting();
        if (restrictiveDataSetting != null && restrictiveDataSetting.length() > 0) {
            JSONObject jSONObject = new JSONObject(restrictiveDataSetting);
            deprecatedParamFilters.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2 != null) {
                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                        Set<String> set = deprecatedEvents;
                        a.r(next, SDKConstants.PARAM_KEY);
                        set.add(next);
                    } else {
                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                        a.r(next, SDKConstants.PARAM_KEY);
                        DeprecatedParamFilter deprecatedParamFilter = new DeprecatedParamFilter(next, new ArrayList());
                        if (optJSONArray != null) {
                            deprecatedParamFilter.setDeprecateParams(Utility.convertJSONArrayToList(optJSONArray));
                        }
                        deprecatedParamFilters.add(deprecatedParamFilter);
                    }
                }
            }
        }
    }

    public static final void processDeprecatedParameters(@NotNull Map<String, String> map, @NotNull String str) {
        if (CrashShieldHandler.isObjectCrashing(EventDeactivationManager.class)) {
            return;
        }
        try {
            a.s(map, "parameters");
            a.s(str, "eventName");
            if (enabled) {
                ArrayList<String> arrayList = new ArrayList(map.keySet());
                for (DeprecatedParamFilter deprecatedParamFilter : new ArrayList(deprecatedParamFilters)) {
                    if (a.g(deprecatedParamFilter.getEventName(), str)) {
                        for (String str2 : arrayList) {
                            if (deprecatedParamFilter.getDeprecateParams().contains(str2)) {
                                map.remove(str2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, EventDeactivationManager.class);
        }
    }

    public static final void processEvents(@NotNull List<AppEvent> list) {
        if (CrashShieldHandler.isObjectCrashing(EventDeactivationManager.class)) {
            return;
        }
        try {
            a.s(list, CrashEvent.f29806f);
            if (enabled) {
                Iterator<AppEvent> it = list.iterator();
                while (it.hasNext()) {
                    if (deprecatedEvents.contains(it.next().getName())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, EventDeactivationManager.class);
        }
    }
}
