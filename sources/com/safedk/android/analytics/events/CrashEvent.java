package com.safedk.android.analytics.events;

import android.os.Build;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.events.base.StatsEventWithBundle;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.io.IOException;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class CrashEvent extends StatsEventWithBundle implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f29803a = "is_caught";

    /* renamed from: b, reason: collision with root package name */
    protected static final String f29804b = "is_emulator";

    /* renamed from: c, reason: collision with root package name */
    protected static final String f29805c = "is_debug";
    protected static final String d = "generic";
    public static final String e = "report";

    /* renamed from: f, reason: collision with root package name */
    public static final String f29806f = "events";

    /* renamed from: g, reason: collision with root package name */
    public static final String f29807g = "sdk_versions_map";

    /* renamed from: h, reason: collision with root package name */
    public static final String f29808h = "sdk_key";

    /* renamed from: j, reason: collision with root package name */
    private static final String f29809j = "CrashEvent";
    private static final long serialVersionUID = 0;

    public CrashEvent(JSONObject report) {
        super(null, StatsCollector.EventType.crash, report);
    }

    public CrashEvent(String sdk, StatsCollector.EventType eventType, JSONObject report) {
        super(sdk, eventType, report);
    }

    @Override // com.safedk.android.analytics.events.base.StatsEventWithBundle
    public JSONObject d() throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put(e, jSONObject2);
        JSONArray jSONArray = new JSONArray();
        jSONObject2.put(f29806f, jSONArray);
        JSONObject d2 = super.d();
        d2.put(StatsEvent.f29841z, b().toString());
        d2.put("timestamp", this.G);
        d2.put(f29803a, a());
        d2.put(f29804b, Build.FINGERPRINT.contains(d));
        d2.put(f29805c, SafeDK.getInstance().n());
        String str = JsonUtils.EMPTY_JSON;
        JSONObject M = SafeDK.getInstance().M();
        if (M != null) {
            str = M.toString();
            Logger.d(f29809j, "sdkVersionsJSON=" + M.toString());
        } else {
            Logger.d(f29809j, "sdkVersionsJSON is null");
        }
        d2.put(f29807g, str);
        jSONArray.put(d2);
        jSONObject2.put("metadata", k.a(SafeDK.getInstance().w().c()));
        jSONObject.put("sdk_key", SafeDK.getInstance().w().a());
        return jSONObject;
    }

    protected boolean a() {
        return false;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public StatsCollector.EventType b() {
        return StatsCollector.EventType.crash;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public String c() {
        return "";
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public void a(StatsEvent statsEvent) {
    }
}
