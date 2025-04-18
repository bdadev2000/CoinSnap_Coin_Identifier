package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.safedk.android.analytics.events.CrashEvent;
import com.safedk.android.analytics.events.MaxEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class SessionEventsState {

    @NotNull
    private List<AppEvent> accumulatedEvents;

    @NotNull
    private final String anonymousAppDeviceGUID;

    @NotNull
    private final AttributionIdentifiers attributionIdentifiers;

    @NotNull
    private final List<AppEvent> inFlightEvents;
    private int numSkippedEventsDueToFullBuffer;

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SessionEventsState";
    private static final int MAX_ACCUMULATED_LOG_EVENTS = 1000;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public SessionEventsState(@NotNull AttributionIdentifiers attributionIdentifiers, @NotNull String str) {
        p0.a.s(attributionIdentifiers, "attributionIdentifiers");
        p0.a.s(str, "anonymousAppDeviceGUID");
        this.attributionIdentifiers = attributionIdentifiers;
        this.anonymousAppDeviceGUID = str;
        this.accumulatedEvents = new ArrayList();
        this.inFlightEvents = new ArrayList();
    }

    public final synchronized void accumulatePersistedEvents(@NotNull List<AppEvent> list) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            p0.a.s(list, CrashEvent.f29806f);
            this.accumulatedEvents.addAll(list);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final synchronized void addEvent(@NotNull AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            p0.a.s(appEvent, MaxEvent.f29810a);
            if (this.accumulatedEvents.size() + this.inFlightEvents.size() >= MAX_ACCUMULATED_LOG_EVENTS) {
                this.numSkippedEventsDueToFullBuffer++;
            } else {
                this.accumulatedEvents.add(appEvent);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final synchronized void clearInFlightAndStats(boolean z2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        if (z2) {
            try {
                this.accumulatedEvents.addAll(this.inFlightEvents);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return;
            }
        }
        this.inFlightEvents.clear();
        this.numSkippedEventsDueToFullBuffer = 0;
    }

    public final synchronized int getAccumulatedEventCount() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return this.accumulatedEvents.size();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    @NotNull
    public final synchronized List<AppEvent> getEventsToPersist() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            List<AppEvent> list = this.accumulatedEvents;
            this.accumulatedEvents = new ArrayList();
            return list;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final int populateRequest(@NotNull GraphRequest graphRequest, @NotNull Context context, boolean z2, boolean z3) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            p0.a.s(graphRequest, "request");
            p0.a.s(context, "applicationContext");
            synchronized (this) {
                try {
                    int i2 = this.numSkippedEventsDueToFullBuffer;
                    EventDeactivationManager eventDeactivationManager = EventDeactivationManager.INSTANCE;
                    EventDeactivationManager.processEvents(this.accumulatedEvents);
                    this.inFlightEvents.addAll(this.accumulatedEvents);
                    this.accumulatedEvents.clear();
                    JSONArray jSONArray = new JSONArray();
                    for (AppEvent appEvent : this.inFlightEvents) {
                        if (appEvent.isChecksumValid()) {
                            if (!z2 && appEvent.isImplicit()) {
                            }
                            jSONArray.put(appEvent.getJsonObject());
                        } else {
                            Utility utility = Utility.INSTANCE;
                            Utility.logd(TAG, p0.a.z0(appEvent, "Event with invalid checksum: "));
                        }
                    }
                    if (jSONArray.length() == 0) {
                        return 0;
                    }
                    populateRequest(graphRequest, context, i2, jSONArray, z3);
                    return jSONArray.length();
                } finally {
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    private final void populateRequest(GraphRequest graphRequest, Context context, int i2, JSONArray jSONArray, boolean z2) {
        JSONObject jSONObject;
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                AppEventsLoggerUtility appEventsLoggerUtility = AppEventsLoggerUtility.INSTANCE;
                jSONObject = AppEventsLoggerUtility.getJSONObjectForGraphAPICall(AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, this.attributionIdentifiers, this.anonymousAppDeviceGUID, z2, context);
                if (this.numSkippedEventsDueToFullBuffer > 0) {
                    jSONObject.put("num_skipped_events", i2);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            graphRequest.setGraphObject(jSONObject);
            Bundle parameters = graphRequest.getParameters();
            String jSONArray2 = jSONArray.toString();
            p0.a.r(jSONArray2, "events.toString()");
            parameters.putString("custom_events", jSONArray2);
            graphRequest.setTag(jSONArray2);
            graphRequest.setParameters(parameters);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
