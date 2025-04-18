package com.safedk.android.analytics.brandsafety;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: n, reason: collision with root package name */
    private static final String f29738n = "ImpressionInfo";

    /* renamed from: a, reason: collision with root package name */
    String f29739a;

    /* renamed from: b, reason: collision with root package name */
    j f29740b;

    /* renamed from: c, reason: collision with root package name */
    String f29741c;
    RedirectData d;
    int e;

    /* renamed from: f, reason: collision with root package name */
    public HashSet<String> f29742f;

    /* renamed from: g, reason: collision with root package name */
    public HashSet<String> f29743g;

    /* renamed from: h, reason: collision with root package name */
    final ImpressionLog f29744h;

    /* renamed from: i, reason: collision with root package name */
    public String f29745i;

    /* renamed from: j, reason: collision with root package name */
    public BrandSafetyUtils.AdType f29746j;

    /* renamed from: k, reason: collision with root package name */
    boolean f29747k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f29748l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f29749m;

    /* renamed from: o, reason: collision with root package name */
    private CreativeInfo f29750o;

    /* renamed from: p, reason: collision with root package name */
    private String f29751p;

    /* renamed from: q, reason: collision with root package name */
    private List<String> f29752q;

    public String a() {
        return this.f29751p;
    }

    public void a(String str) {
        this.f29751p = str;
        if (str != null && !this.f29752q.contains(str)) {
            this.f29752q.add(str);
        }
    }

    public List<String> b() {
        return this.f29752q;
    }

    public l(String str) {
        this(str, null, null, null);
    }

    public l(String str, j jVar, String str2, BrandSafetyUtils.AdType adType) {
        this.f29741c = null;
        this.e = 0;
        this.f29742f = new HashSet<>();
        this.f29743g = new HashSet<>();
        this.f29744h = new ImpressionLog();
        this.f29745i = null;
        this.f29746j = null;
        this.f29747k = false;
        this.f29748l = false;
        this.f29749m = false;
        this.f29752q = new ArrayList();
        this.f29739a = str == null ? UUID.randomUUID().toString() : str;
        this.f29740b = jVar;
        this.f29750o = null;
        this.f29745i = str2;
        this.f29746j = adType;
    }

    public l(RedirectData redirectData) {
        this(null, null, null, null);
        this.d = redirectData;
    }

    public boolean c() {
        return this.d != null && this.d.f29328a;
    }

    public boolean d() {
        return this.d != null && this.d.f29329b;
    }

    public void a(RedirectData redirectData) {
        this.d = redirectData;
        this.e++;
        if (redirectData.f29329b && this.f29750o != null) {
            this.f29750o.e();
        }
    }

    public void a(CreativeInfo creativeInfo) {
        if (this.f29750o == null && creativeInfo != null) {
            a(ImpressionLog.f29261m, new ImpressionLog.a[0]);
        }
        this.f29750o = creativeInfo;
        if (creativeInfo != null) {
            synchronized (this.f29742f) {
                Logger.d(f29738n, "set creative info, removing webview resource urls ci = " + creativeInfo.L() + ", webview_resource_urls resourceUrlList = " + this.f29742f);
            }
            creativeInfo.q().addAll(this.f29742f);
            Logger.d(f29738n, "Impression set CI adding to webView resources " + this.f29742f.size() + " urls to a new size: " + creativeInfo.q().size());
            this.f29742f = new HashSet<>();
            creativeInfo.p().addAll(this.f29743g);
            this.f29743g = new HashSet<>();
            boolean a2 = CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
            if (creativeInfo.ah() && this.f29740b != null && !a2) {
                Logger.d(f29738n, "set creative info, removing image taken for multi-ad " + this.f29740b.f29692b);
                BrandSafetyUtils.d(this.f29740b.f29692b);
                this.f29740b = null;
            }
        }
    }

    public CreativeInfo e() {
        return this.f29750o;
    }

    public void f() {
        this.f29740b = null;
    }

    public void a(String str, ImpressionLog.a... aVarArr) {
        this.f29744h.a(str, aVarArr);
    }

    public void b(String str, ImpressionLog.a... aVarArr) {
        this.f29744h.b(str, aVarArr);
    }

    public String toString() {
        return "Impression: id=" + this.f29739a + ", image is: " + this.f29740b + ", CI is: " + this.f29750o;
    }
}
