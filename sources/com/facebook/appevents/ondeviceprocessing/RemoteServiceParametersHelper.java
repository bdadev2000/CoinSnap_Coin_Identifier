package com.facebook.appevents.ondeviceprocessing;

import android.os.Bundle;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.safedk.android.analytics.events.MaxEvent;
import e0.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public final class RemoteServiceParametersHelper {

    @NotNull
    public static final RemoteServiceParametersHelper INSTANCE = new RemoteServiceParametersHelper();
    private static final String TAG = "RemoteServiceWrapper";

    private RemoteServiceParametersHelper() {
    }

    @Nullable
    public static final Bundle buildEventsBundle(@NotNull RemoteServiceWrapper.EventType eventType, @NotNull String str, @NotNull List<AppEvent> list) {
        if (CrashShieldHandler.isObjectCrashing(RemoteServiceParametersHelper.class)) {
            return null;
        }
        try {
            p0.a.s(eventType, "eventType");
            p0.a.s(str, "applicationId");
            p0.a.s(list, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString(MaxEvent.f29810a, eventType.toString());
            bundle.putString("app_id", str);
            if (RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS == eventType) {
                JSONArray buildEventsJson = INSTANCE.buildEventsJson(list, str);
                if (buildEventsJson.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", buildEventsJson.toString());
            }
            return bundle;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, RemoteServiceParametersHelper.class);
            return null;
        }
    }

    private final JSONArray buildEventsJson(List<AppEvent> list, String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList b12 = u.b1(list);
            EventDeactivationManager.processEvents(b12);
            boolean includeImplicitEvents = includeImplicitEvents(str);
            Iterator it = b12.iterator();
            while (it.hasNext()) {
                AppEvent appEvent = (AppEvent) it.next();
                if (appEvent.isChecksumValid()) {
                    if (!(!appEvent.isImplicit())) {
                        if (appEvent.isImplicit() && includeImplicitEvents) {
                        }
                    }
                    jSONArray.put(appEvent.getJsonObject());
                } else {
                    Utility utility = Utility.INSTANCE;
                    Utility.logd(TAG, p0.a.z0(appEvent, "Event with invalid checksum: "));
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final boolean includeImplicitEvents(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(str, false);
            if (queryAppSettings != null) {
                return queryAppSettings.supportsImplicitLogging();
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
