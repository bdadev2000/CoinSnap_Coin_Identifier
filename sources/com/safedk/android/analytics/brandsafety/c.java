package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public class c {
    protected static final String S = "network_name";

    /* renamed from: a, reason: collision with root package name */
    public static final String f29369a = "AdInfo";

    /* renamed from: b, reason: collision with root package name */
    public static final String f29370b = "image_hash";

    /* renamed from: c, reason: collision with root package name */
    public static final String f29371c = "sdk_package";
    public static final String d = "sdk_uid";
    public static final String e = "type";

    /* renamed from: f, reason: collision with root package name */
    public static final String f29372f = "ad_format_type";

    /* renamed from: g, reason: collision with root package name */
    public static final String f29373g = "response_code";

    /* renamed from: h, reason: collision with root package name */
    public static final String f29374h = "image_url";

    /* renamed from: i, reason: collision with root package name */
    public static final String f29375i = "image_id";

    /* renamed from: j, reason: collision with root package name */
    public static final String f29376j = "image_orientation";

    /* renamed from: k, reason: collision with root package name */
    public static final String f29377k = "text";

    /* renamed from: l, reason: collision with root package name */
    public static final String f29378l = "safedk_version";
    public Bundle A;
    String B;
    String C;
    String D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    public boolean I;
    AdNetworkDiscovery.WebViewResourceMatchingMethod J;
    String K;
    String L;
    String M;
    boolean N;
    boolean O;
    String P;
    String Q;
    final ImpressionLog R;
    protected boolean T;
    public boolean U;
    private final List<l> V;

    /* renamed from: m, reason: collision with root package name */
    protected List<String> f29379m;

    /* renamed from: n, reason: collision with root package name */
    protected List<String> f29380n;

    /* renamed from: o, reason: collision with root package name */
    long f29381o;

    /* renamed from: p, reason: collision with root package name */
    public BrandSafetyUtils.AdType f29382p;

    /* renamed from: q, reason: collision with root package name */
    protected String f29383q;

    /* renamed from: r, reason: collision with root package name */
    long f29384r;

    /* renamed from: s, reason: collision with root package name */
    String f29385s;

    /* renamed from: t, reason: collision with root package name */
    String f29386t;

    /* renamed from: u, reason: collision with root package name */
    BrandSafetyUtils.ScreenShotOrientation f29387u;

    /* renamed from: v, reason: collision with root package name */
    String f29388v;
    boolean w;
    String x;

    /* renamed from: y, reason: collision with root package name */
    int f29389y;

    /* renamed from: z, reason: collision with root package name */
    int f29390z;

    public c(String[] strArr, int i2, Bundle bundle, String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, BrandSafetyUtils.AdType adType) {
        this(str, str2, str3, screenShotOrientation, null, adType);
        if (strArr != null) {
            this.C = strArr[0];
            this.B = strArr[1];
        }
        this.A = bundle;
        this.f29390z = i2;
    }

    public c(int i2, Bundle bundle, String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, BrandSafetyUtils.AdType adType) {
        this(str, str2, str3, screenShotOrientation, null, adType);
        this.A = bundle;
        this.f29390z = i2;
    }

    public c(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, BrandSafetyUtils.AdType adType) {
        this.f29379m = null;
        this.f29380n = null;
        this.f29381o = 0L;
        this.f29387u = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.w = false;
        this.x = null;
        this.f29389y = 0;
        this.B = null;
        this.C = null;
        this.V = new ArrayList();
        this.D = null;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
        this.L = null;
        this.M = null;
        this.N = false;
        this.O = false;
        this.P = null;
        this.Q = null;
        this.R = new ImpressionLog();
        this.U = false;
        Logger.d(f29369a, "AdInfo ctor started, hashValue = " + str + ", fileName = " + str4 + ", maxSdk = " + str2 + ", adType = " + (adType != null ? adType.name() : ""));
        this.f29388v = str2;
        this.f29384r = System.currentTimeMillis();
        this.f29382p = adType;
        j jVar = new j(str, str4, screenShotOrientation);
        synchronized (this) {
            this.V.add(new l(str3, jVar, str2, adType));
        }
        if (str2 != null) {
            this.J = CreativeInfoManager.a(str2);
        }
    }

    public c(String str, long j2, BrandSafetyUtils.AdType adType) {
        this.f29379m = null;
        this.f29380n = null;
        this.f29381o = 0L;
        this.f29387u = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.w = false;
        this.x = null;
        this.f29389y = 0;
        this.B = null;
        this.C = null;
        this.V = new ArrayList();
        this.D = null;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
        this.L = null;
        this.M = null;
        this.N = false;
        this.O = false;
        this.P = null;
        this.Q = null;
        this.R = new ImpressionLog();
        this.U = false;
        Logger.d(f29369a, "AdInfo ctor started, maxSdk = " + str + ", timestamp = " + this.f29384r + ", adType = " + (adType != null ? adType.name() : ""));
        this.f29388v = str;
        this.f29384r = j2;
        this.f29382p = adType;
    }

    public long a() {
        return this.f29384r;
    }

    public String b() {
        return this.f29386t;
    }

    public void a(String str) {
        this.f29386t = str;
    }

    public String c() {
        return this.f29388v;
    }

    public synchronized void b(String str) {
        this.f29388v = str;
    }

    public boolean d() {
        return this.w;
    }

    public void a(boolean z2) {
        this.w = z2;
    }

    public String e() {
        return this.x;
    }

    public boolean c(String str) {
        l h2 = h();
        if (this.x != null || h2 == null || (h2.e() != null && (!TextUtils.isEmpty(h2.e().M()) || h2.e().ah()))) {
            return false;
        }
        this.x = str;
        return true;
    }

    public boolean f() {
        return this.D != null;
    }

    public void a(CreativeInfo creativeInfo) {
        if (creativeInfo != null) {
            if (CreativeInfoManager.a(this.f29388v, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false)) {
                if (this.D != null && !creativeInfo.ah()) {
                    creativeInfo.ai();
                    String h2 = creativeInfo.h();
                    if (h2 != null) {
                        creativeInfo.c(h2 + CreativeInfo.aJ);
                    }
                }
            } else if (creativeInfo.ah()) {
                if (this.D == null) {
                    this.D = UUID.randomUUID().toString();
                    Logger.d(f29369a, "set CI, generate multi ad UUID: " + this.D);
                } else {
                    synchronized (this) {
                        this.V.add(new l(UUID.randomUUID().toString()));
                        Logger.d(f29369a, "set CI, create new impression for multi ad, impression list: " + this.V);
                    }
                }
            }
            l h3 = h();
            Logger.d(f29369a, "set CI, impression: " + h3);
            if (h3 != null) {
                if (!creativeInfo.ah() && h3.e() != null && h3.e().L() != null && !h3.e().L().equals(creativeInfo.L())) {
                    Logger.d(f29369a, "set CI, failed to set CI due to unmatched IDs: old: " + creativeInfo.L() + ", new: " + h3.e().L());
                    return;
                } else {
                    if (h3.d()) {
                        creativeInfo.e();
                    }
                    h3.a(creativeInfo);
                }
            }
            Logger.d(f29369a, "set CI, number of CIs: " + j().size() + ", impression IDs: " + E() + ", multi ad UUID: " + this.D);
        }
    }

    public List<l> g() {
        return this.V;
    }

    public synchronized l h() {
        l lVar;
        if (this.f29379m != null && this.D == null) {
            Iterator<l> it = this.V.iterator();
            while (it.hasNext()) {
                lVar = it.next();
                if (lVar.e() != null && this.f29379m.contains(lVar.e().af())) {
                    break;
                }
            }
        }
        if (!this.V.isEmpty()) {
            lVar = this.V.get(this.V.size() - 1);
        } else {
            Logger.d(f29369a, "Failed to get active impression, view hierarchy: " + this.f29379m + ", impression IDs: " + E());
            lVar = null;
        }
        return lVar;
    }

    public CreativeInfo i() {
        l h2 = h();
        if (h2 != null) {
            return h2.e();
        }
        return null;
    }

    public synchronized List<CreativeInfo> j() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (l lVar : this.V) {
            if (lVar.e() != null) {
                arrayList.add(lVar.e());
            }
        }
        return arrayList;
    }

    public synchronized List<CreativeInfo> k() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (l lVar : this.V) {
            if (lVar.e() != null && this.f29379m != null && this.f29379m.contains(lVar.e().af())) {
                arrayList.add(lVar.e());
            }
        }
        return arrayList;
    }

    public j l() {
        l h2 = h();
        if (h2 != null) {
            return h2.f29740b;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        r0 = r0.f29740b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized com.safedk.android.analytics.brandsafety.j d(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.List<com.safedk.android.analytics.brandsafety.l> r0 = r3.V     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L25
        L7:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L23
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L25
            com.safedk.android.analytics.brandsafety.l r0 = (com.safedk.android.analytics.brandsafety.l) r0     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = r0.f29739a     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L7
            java.lang.String r2 = r0.f29739a     // Catch: java.lang.Throwable -> L25
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L7
            com.safedk.android.analytics.brandsafety.j r0 = r0.f29740b     // Catch: java.lang.Throwable -> L25
        L21:
            monitor-exit(r3)
            return r0
        L23:
            r0 = 0
            goto L21
        L25:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.c.d(java.lang.String):com.safedk.android.analytics.brandsafety.j");
    }

    public synchronized List<j> m() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (l lVar : this.V) {
            if (lVar.f29740b != null) {
                arrayList.add(lVar.f29740b);
            }
        }
        return arrayList;
    }

    public String n() {
        l h2 = h();
        return h2 != null ? h2.f29739a : "";
    }

    private synchronized List<String> E() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<l> it = this.V.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f29739a);
        }
        return arrayList;
    }

    public String o() {
        return this.B;
    }

    public String p() {
        return this.C;
    }

    public void a(String[] strArr) {
        this.C = strArr[0];
        this.B = strArr[1];
    }

    public int q() {
        return this.f29390z;
    }

    public Bundle r() {
        return this.A;
    }

    public int s() {
        return this.f29389y;
    }

    public void b(boolean z2) {
        this.E = z2;
    }

    public void c(boolean z2) {
        this.F = z2;
    }

    public void d(boolean z2) {
        this.G = z2;
    }

    public String t() {
        return this.f29383q;
    }

    public void u() {
        l h2 = h();
        if (h2 != null && h2.e() != null) {
            List<String> W = h2.e().W();
            if (W != null && !W.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = W.iterator();
                while (it.hasNext()) {
                    sb.append(it.next()).append("\n");
                }
                this.f29383q = sb.toString();
                return;
            }
            return;
        }
        Logger.d(f29369a, "Cannot extract text as Creative info object is null");
    }

    public long v() {
        return this.f29381o;
    }

    public String toString() {
        return " maxAdSdk: " + (this.f29388v != null ? this.f29388v : "") + " impression IDs: " + E() + " clickUrl: " + (this.x != null ? this.x : "") + " viewAddress: " + (this.K != null ? this.K : "");
    }

    public String w() {
        return this.L;
    }

    public List<String> x() {
        return this.f29379m;
    }

    public void a(List<String> list) {
        Logger.d(f29369a, "setting view hierarchy : " + list);
        this.f29379m = list;
    }

    public void b(List<WeakReference<WebView>> list) {
        StringBuilder sb = new StringBuilder("setViewsAddresses added [");
        this.f29380n = new ArrayList();
        synchronized (list) {
            for (WeakReference<WebView> weakReference : list) {
                if (weakReference != null && weakReference.get() != null) {
                    String a2 = BrandSafetyUtils.a(weakReference.get());
                    this.f29380n.add(a2);
                    sb.append(a2 + " ");
                }
            }
            sb.append("]");
            Logger.d(f29369a, sb.toString());
        }
    }

    public String y() {
        if (this.A == null || !this.A.containsKey(BrandSafetyEvent.f29784k) || TextUtils.isEmpty(this.A.getString(BrandSafetyEvent.f29784k))) {
            return null;
        }
        return this.A.getString(BrandSafetyEvent.f29784k);
    }

    public String z() {
        if (this.A == null || !this.A.containsKey("creative_id") || TextUtils.isEmpty(this.A.getString("creative_id"))) {
            return null;
        }
        return this.A.getString("creative_id");
    }

    public String A() {
        if (this.A == null || !this.A.containsKey("network_name") || TextUtils.isEmpty(this.A.getString("network_name"))) {
            return null;
        }
        return this.A.getString("network_name");
    }

    public String B() {
        return this.Q;
    }

    public void e(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.Q == null) {
                this.Q = str;
            } else if (!this.Q.contains(str)) {
                this.Q += ImpressionLog.P + str;
            }
        }
    }

    public void a(String str, ImpressionLog.a... aVarArr) {
        this.R.a(str, aVarArr);
    }

    public void a(Long l2, Long l3, String str, ImpressionLog.a... aVarArr) {
        this.R.a(l2, l3, str, aVarArr);
    }

    public void b(String str, ImpressionLog.a... aVarArr) {
        this.R.b(str, aVarArr);
    }

    public void a(ImpressionLog impressionLog) {
        this.R.a(impressionLog);
    }

    public synchronized void e(boolean z2) {
        this.V.clear();
        this.f29379m = null;
        this.f29381o = 0L;
        this.f29383q = null;
        this.f29384r = System.currentTimeMillis();
        this.f29385s = null;
        this.f29386t = null;
        this.f29387u = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.f29388v = null;
        this.w = false;
        this.x = null;
        this.f29389y = 0;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = false;
        this.F = false;
        this.G = false;
        h().f29747k = false;
        this.I = false;
        this.J = AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
        this.N = false;
        this.O = false;
        if (z2) {
            this.P = null;
        }
        this.Q = null;
    }

    public void C() {
        this.L = null;
        this.K = null;
        if (h() != null && h().a() != null) {
            h().a((String) null);
        }
        this.A = null;
        this.f29390z = 0;
        this.B = null;
        this.C = null;
    }

    public void D() {
        e(true);
        C();
    }

    public void a(d dVar, Bundle bundle, int i2) {
        this.L = dVar.f29647c;
        this.K = dVar.f29649g;
        if (h() != null) {
            h().a(dVar.f29649g);
        }
        this.A = bundle;
        this.f29390z = i2;
    }
}
