package com.safedk.android.analytics.events;

import android.os.Bundle;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.p;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.k;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class RedirectEvent extends StatsEvent implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final int f29823a = 120000;

    /* renamed from: b, reason: collision with root package name */
    public static final String f29824b = "redirect";

    /* renamed from: c, reason: collision with root package name */
    public static final String f29825c = "redirect_url";
    public static final String d = "redirect_type";
    public static final String e = "foreground_activity";

    /* renamed from: f, reason: collision with root package name */
    public static final String f29826f = "max_events";

    /* renamed from: g, reason: collision with root package name */
    public static final String f29827g = "touch_ts";

    /* renamed from: h, reason: collision with root package name */
    public static final String f29828h = "external";

    /* renamed from: i, reason: collision with root package name */
    public static final String f29829i = "internal";

    /* renamed from: j, reason: collision with root package name */
    public static final String f29830j = "customtab";

    /* renamed from: k, reason: collision with root package name */
    public static final String f29831k = "suspected_store_kit";

    /* renamed from: l, reason: collision with root package name */
    private static final String f29832l = "RedirectEvent";
    private static final long serialVersionUID = 4907228751695554606L;

    /* renamed from: m, reason: collision with root package name */
    private String f29833m;

    /* renamed from: n, reason: collision with root package name */
    private String f29834n;

    /* renamed from: o, reason: collision with root package name */
    private String f29835o;

    /* renamed from: p, reason: collision with root package name */
    private String f29836p;

    /* renamed from: q, reason: collision with root package name */
    private MaxEvents f29837q;

    /* renamed from: r, reason: collision with root package name */
    private long f29838r;

    public RedirectEvent(String sdk, String redirectUrl, String redirectType, String foregroundActivity, long timestamp, long touchTs) {
        super(sdk, StatsCollector.EventType.redirect);
        this.f29837q = null;
        Logger.d(f29832l, "RedirectEvent ctor started, sdk=" + sdk + ", redirectUrl=" + redirectUrl + ", redirectType=" + redirectType + ", foregroundActivity=" + foregroundActivity + " ,timestamp=" + timestamp + ", touchTs=" + touchTs);
        Logger.d(f29832l, "RedirectEvent ctor SdksMapping.getSdkNameByPackage()=" + SdksMapping.getSdkNameByPackage(sdk));
        Logger.d(f29832l, "RedirectEvent ctor SdksMapping.getSdkPackageByClass()=" + SdksMapping.getSdkPackageByClass(sdk));
        String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(sdk);
        if (sdkUUIDByPackage != null && SdksMapping.getAllSdkVersionsMap() != null && SdksMapping.getAllSdkVersionsMap().get(sdkUUIDByPackage) != null) {
            this.f29833m = SdksMapping.getAllSdkVersionsMap().get(sdkUUIDByPackage);
            Logger.d(f29832l, "RedirectEvent ctor sdkVersion=" + this.f29833m);
        } else {
            Logger.d(f29832l, "RedirectEvent ctor cannot find version for sdk " + sdk + " , SdkVersionsMap=" + SdksMapping.getAllSdkVersionsMap());
        }
        this.f29834n = redirectUrl;
        this.f29835o = redirectType;
        this.f29836p = foregroundActivity;
        this.f29838r = k.b(touchTs);
        this.I = false;
    }

    public void a(MaxEvents maxEvents) {
        synchronized (p.a()) {
            this.f29837q = (MaxEvents) maxEvents.clone();
            Logger.d(f29832l, "setMaxEvents , added " + this.f29837q.size() + " items. content : " + this.f29837q);
        }
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public StatsCollector.EventType b() {
        return StatsCollector.EventType.redirect;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public String c() {
        StringBuilder sb = new StringBuilder();
        sb.append(StatsCollector.EventType.redirect + "_");
        sb.append(this.f29834n == null ? "_" : this.f29834n + "_");
        sb.append(this.G);
        Logger.d(f29832l, "Getting key from object : " + sb.toString());
        return sb.toString();
    }

    public static String a(Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append(StatsCollector.EventType.redirect + "_");
        if (bundle.getString("redirect_url") == null) {
            sb.append("_");
        } else {
            sb.append(bundle.getString("redirect_url") + "_");
        }
        sb.append(bundle.getLong("timestamp"));
        Logger.d(f29832l, "Getting key from bundle : " + sb.toString());
        return sb.toString();
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public void a(StatsEvent statsEvent) {
        if (((RedirectEvent) statsEvent).I) {
            this.I = true;
        }
        if (((RedirectEvent) statsEvent).d() != null && d() == null) {
            a(((RedirectEvent) statsEvent).d());
        }
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public Bundle e() {
        Bundle e2 = super.e();
        e2.putString("sdk_version", this.f29833m);
        e2.putString("redirect_url", this.f29834n);
        e2.putString("redirect_type", this.f29835o);
        e2.putString("foreground_activity", this.f29836p);
        e2.putLong(f29827g, this.f29838r);
        if (this.f29837q != null && this.f29837q.size() > 0) {
            synchronized (p.a()) {
                e2.putParcelableArrayList(f29826f, this.f29837q.a());
            }
        }
        Logger.d(f29832l, "Redirect Event toBundle : " + e2.toString());
        return e2;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public boolean a_() {
        return System.currentTimeMillis() - this.G > 120000 || this.f29834n != null || this.I;
    }

    public String d() {
        return this.f29834n;
    }

    public void a(String str) {
        this.f29834n = str;
    }
}
