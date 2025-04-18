package com.safedk.android.analytics.events;

import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.io.Serializable;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class CaughtCrashEvent extends CrashEvent implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final String f29802j = "CaughtCrashEvent";
    private static final long serialVersionUID = 0;

    public CaughtCrashEvent(JSONObject report) {
        super(null, StatsCollector.EventType.crash, report);
    }

    @Override // com.safedk.android.analytics.events.CrashEvent
    protected boolean a() {
        return true;
    }

    @Override // com.safedk.android.analytics.events.CrashEvent, com.safedk.android.analytics.events.base.StatsEvent
    public StatsCollector.EventType b() {
        return StatsCollector.EventType.crash;
    }

    @Override // com.safedk.android.analytics.events.CrashEvent, com.safedk.android.analytics.events.base.StatsEvent
    public String c() {
        return "";
    }

    @Override // com.safedk.android.analytics.events.CrashEvent, com.safedk.android.analytics.events.base.StatsEvent
    public void a(StatsEvent statsEvent) {
    }
}
