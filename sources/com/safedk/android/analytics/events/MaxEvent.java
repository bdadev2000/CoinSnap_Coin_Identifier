package com.safedk.android.analytics.events;

import android.os.Bundle;
import com.safedk.android.utils.Logger;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
public class MaxEvent implements Serializable, Comparable<MaxEvent> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29810a = "event";

    /* renamed from: b, reason: collision with root package name */
    public static final String f29811b = "ts";

    /* renamed from: c, reason: collision with root package name */
    public static final String f29812c = "ad_format";
    public static final String d = "network";
    public static final String e = "creative_id";

    /* renamed from: f, reason: collision with root package name */
    public static final String f29813f = "dsp_name";

    /* renamed from: g, reason: collision with root package name */
    private static final String f29814g = "MaxEvent";

    /* renamed from: h, reason: collision with root package name */
    private String f29815h;

    /* renamed from: i, reason: collision with root package name */
    private Long f29816i;

    /* renamed from: j, reason: collision with root package name */
    private String f29817j;

    /* renamed from: k, reason: collision with root package name */
    private String f29818k;

    /* renamed from: l, reason: collision with root package name */
    private String f29819l;

    /* renamed from: m, reason: collision with root package name */
    private String f29820m;

    public String a() {
        return this.f29820m;
    }

    public String b() {
        return this.f29815h;
    }

    public void a(String str) {
        this.f29815h = str;
    }

    public long c() {
        return this.f29816i.longValue();
    }

    public String d() {
        return this.f29817j;
    }

    public String e() {
        return this.f29818k;
    }

    public String f() {
        return this.f29819l;
    }

    public MaxEvent(String event, long timestamp, String adFormat, String network, String creativeId, String dspName) {
        this.f29815h = event;
        this.f29816i = Long.valueOf(timestamp);
        this.f29817j = adFormat;
        this.f29818k = network;
        this.f29820m = creativeId;
        this.f29819l = dspName;
        Logger.d(f29814g, "New MaxEvent created , event=" + event + ", timestamp=" + timestamp + ", adFormat=" + adFormat + ", network=" + network + ", creativeId=" + creativeId + ", dspName=" + dspName);
    }

    public Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putString(f29810a, this.f29815h);
        bundle.putLong(f29811b, this.f29816i.longValue());
        bundle.putString("ad_format", this.f29817j);
        bundle.putString(d, this.f29818k);
        bundle.putString("creative_id", this.f29820m);
        if (this.f29819l != null) {
            bundle.putString("dsp_name", this.f29819l);
        }
        Logger.d(f29814g, "MaxEvent toBundle : " + bundle.toString());
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("event:" + this.f29815h + ",");
        sb.append("ts:" + this.f29816i);
        sb.append("(" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(this.f29816i.longValue() * 1000)) + "),");
        sb.append("ad_format:" + this.f29817j + ",");
        sb.append("network:" + this.f29818k + ",");
        sb.append("creative_id:" + this.f29820m);
        if (this.f29819l != null) {
            sb.append(",DSP_NAME:" + this.f29819l);
        }
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(MaxEvent maxEvent) {
        return this.f29816i.compareTo(maxEvent.f29816i);
    }
}
