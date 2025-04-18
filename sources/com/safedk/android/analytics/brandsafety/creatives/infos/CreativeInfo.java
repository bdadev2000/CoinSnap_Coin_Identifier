package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.a;
import com.safedk.android.analytics.brandsafety.creatives.e;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.io.Serializable;
import java.net.URLEncoder;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class CreativeInfo implements Serializable {
    public static final String A = "details?id=";
    public static final String B = "isVideoAd";
    public static final String C = "isPlayable";
    public static final String D = "campaign_id";
    public static final String L = "buyer_id";
    public static final String S = "ad_system";

    /* renamed from: a, reason: collision with root package name */
    private static final String f29615a = "CreativeInfo";
    public static final String aF = "native";
    public static final String aG = "native_banner";
    public static final String aH = "/ad_count_";
    public static final String aI = "/multiple_ads";
    public static final String aJ = "/multi_ad";
    public static final String aK = "webview_resource_urls_expanded";
    public static final String aL = "matchingMethodAddress";
    public static final String aM = "title:";
    public static final String aN = "mainImg:";
    public static final String aO = "icon:";
    public static final String aP = "body:";
    public static final String aQ = "cta:";
    public static final String aR = "star:";
    public static final String aS = "advertiser:";
    public static final String aT = "element:";
    public static final String aU = "ad_domain";
    public static final String ak = "end_card_url";
    public static final String al = "html";
    public static final String am = "vast_ad_tag_uris";
    public static final String an = "log";
    public static final String ao = "event_id";
    public static final String ap = "text:";
    public static final String aq = "video:";

    /* renamed from: b, reason: collision with root package name */
    public static final String f29616b = "prefetchTimestamp";

    /* renamed from: c, reason: collision with root package name */
    public static final String f29617c = "ad_id";
    public static final String d = "creative_id";
    public static final String e = "video_url";

    /* renamed from: f, reason: collision with root package name */
    public static final String f29618f = "ci_matching_method";

    /* renamed from: g, reason: collision with root package name */
    public static final String f29619g = "ci_debug_info";

    /* renamed from: h, reason: collision with root package name */
    public static final String f29620h = "exact_";

    /* renamed from: i, reason: collision with root package name */
    public static final String f29621i = "exact_fbLabel";

    /* renamed from: j, reason: collision with root package name */
    public static final String f29622j = "exact_markup";

    /* renamed from: k, reason: collision with root package name */
    public static final String f29623k = "exact_video";

    /* renamed from: l, reason: collision with root package name */
    public static final String f29624l = "exact_resource";

    /* renamed from: m, reason: collision with root package name */
    public static final String f29625m = "exact_ad_id";

    /* renamed from: n, reason: collision with root package name */
    public static final String f29626n = "exact_ad_object";

    /* renamed from: o, reason: collision with root package name */
    public static final String f29627o = "heuristic_mediation";

    /* renamed from: p, reason: collision with root package name */
    public static final String f29628p = "heuristic_pending";

    /* renamed from: q, reason: collision with root package name */
    public static final String f29629q = "downstream_struct";

    /* renamed from: r, reason: collision with root package name */
    public static final String f29630r = "vast";

    /* renamed from: s, reason: collision with root package name */
    public static final String f29631s = "survey";
    private static final long serialVersionUID = 4107472620437040927L;

    /* renamed from: t, reason: collision with root package name */
    public static final String f29632t = "text";

    /* renamed from: u, reason: collision with root package name */
    public static final String f29633u = "playable";

    /* renamed from: v, reason: collision with root package name */
    public static final String f29634v = "image";
    public static final String w = "mraid";
    public static final String x = "dsp_creative_id";

    /* renamed from: y, reason: collision with root package name */
    public static final String f29635y = "webview_resource_urls";

    /* renamed from: z, reason: collision with root package name */
    public static final String f29636z = "prefetch_resource_urls";
    private BrandSafetyUtils.AdType E;
    protected String F;
    protected boolean G;
    protected boolean H;
    protected boolean I;
    protected String J;
    protected String K;
    protected String M;
    protected final HashSet<String> N;
    protected final HashSet<String> O;
    protected final HashSet<String> P;
    public String Q;
    Timestamp R;
    boolean T;
    boolean U;
    boolean V;
    boolean W;
    protected String X;
    private String Y;
    private boolean Z;
    private String aA;
    private String aB;
    private boolean aC;
    private String aD;
    private String aE;
    protected String aV;
    protected String aW;
    protected String aX;
    protected String aY;
    protected final HashSet<String> aZ;
    private String aa;
    private long ab;
    private String ac;
    private String ad;
    private int ae;
    private boolean af;
    private boolean ag;
    private String ah;
    private String ai;
    private List<String> aj;
    protected String ar;
    protected String as;
    protected String at;
    protected final HashSet<String> au;
    boolean av;
    public final ArrayList<String> aw;
    public final Set<String> ax;
    public boolean ay;
    private transient View az;
    boolean ba;
    protected boolean bb;
    protected final ImpressionLog bc;
    private final List<String> bd;
    private boolean be;
    private boolean bf;

    public void e() {
        this.af = true;
    }

    public View f() {
        return this.az;
    }

    public void a(View view) {
        this.az = view;
    }

    public boolean g() {
        return this.Z;
    }

    public String h() {
        return this.F;
    }

    public void c(String str) {
        this.F = str;
    }

    public void d(String str) {
        if (str != null) {
            if (this.F == null) {
                this.F = "";
            }
            this.F += str;
        }
    }

    public String i() {
        Logger.d(f29615a, "getAdUnitId started with the stored value: " + this.aV);
        return this.aV;
    }

    public void e(String str) {
        Logger.d(f29615a, "setAdUnitId started with ad unit id: " + str);
        this.aV = str;
    }

    public boolean j() {
        return this.I;
    }

    public String k() {
        return this.as;
    }

    public void a(boolean z2) {
        this.aC = z2;
    }

    public boolean l() {
        return this.aC;
    }

    public String m() {
        return this.aD;
    }

    public void f(String str) {
        this.aD = str;
    }

    public void g(String str) {
        this.aY = str;
    }

    public String n() {
        return this.aY;
    }

    public void h(String str) {
        this.K = str;
    }

    public String o() {
        return this.M;
    }

    public HashSet<String> p() {
        return this.N;
    }

    public HashSet<String> q() {
        return this.O;
    }

    public HashSet<String> r() {
        return this.aZ;
    }

    public HashSet<String> s() {
        return this.P;
    }

    public String t() {
        return this.Q;
    }

    public HashSet<String> u() {
        return this.au;
    }

    public void b(boolean z2) {
        this.V = z2;
    }

    public void c(boolean z2) {
        this.av = z2;
    }

    public boolean v() {
        return this.T || this.V;
    }

    public boolean w() {
        return this.W;
    }

    public void d(boolean z2) {
        Logger.d(f29615a, "VideoAd property has been set to " + z2);
        this.T = z2;
    }

    public boolean x() {
        return this.U;
    }

    public void e(boolean z2) {
        this.U = z2;
    }

    public boolean y() {
        return this.V;
    }

    public boolean z() {
        return this.av;
    }

    public String A() {
        return this.X;
    }

    public boolean B() {
        return this.bb;
    }

    public void f(boolean z2) {
        this.bb = z2;
    }

    public void C() {
        this.bf = true;
    }

    public boolean D() {
        return this.bf;
    }

    public ImpressionLog E() {
        return this.bc;
    }

    public CreativeInfo() {
        this.af = false;
        this.bd = new ArrayList();
        this.az = null;
        this.Z = false;
        this.aV = null;
        this.G = false;
        this.H = false;
        this.ab = 0L;
        this.aC = false;
        this.ag = false;
        this.be = true;
        this.ah = null;
        this.N = new HashSet<>();
        this.O = new HashSet<>();
        this.aZ = new HashSet<>();
        this.P = new HashSet<>();
        this.au = new LinkedHashSet();
        this.T = false;
        this.U = false;
        this.av = false;
        this.V = false;
        this.W = false;
        this.ba = false;
        this.bb = false;
        this.bc = new ImpressionLog();
        this.aw = new ArrayList<>();
        this.ax = new HashSet();
        this.ay = false;
    }

    public CreativeInfo(BrandSafetyUtils.AdType adType, String sdk, String id, String creativeId, String clickUrl, String videoUrl, String downstreamStruct) {
        this.af = false;
        this.bd = new ArrayList();
        this.az = null;
        this.Z = false;
        this.aV = null;
        this.G = false;
        this.H = false;
        this.ab = 0L;
        this.aC = false;
        this.ag = false;
        this.be = true;
        this.ah = null;
        this.N = new HashSet<>();
        this.O = new HashSet<>();
        this.aZ = new HashSet<>();
        this.P = new HashSet<>();
        this.au = new LinkedHashSet();
        this.T = false;
        this.U = false;
        this.av = false;
        this.V = false;
        this.W = false;
        this.ba = false;
        this.bb = false;
        this.bc = new ImpressionLog();
        this.aw = new ArrayList<>();
        this.ax = new HashSet();
        this.ay = false;
        this.E = adType;
        this.aa = sdk;
        this.Y = id;
        i(creativeId);
        t(clickUrl);
        o(videoUrl);
        this.ag = true;
        this.ab = k.b(SystemClock.elapsedRealtime());
        this.F = downstreamStruct;
        this.T = TextUtils.isEmpty(videoUrl) ? false : true;
        this.bc.a(ImpressionLog.f29251a, new ImpressionLog.a[0]);
        ac();
    }

    public void i(String str) {
        this.ac = str;
    }

    public void j(String str) {
        this.aB = str;
    }

    public void k(String str) {
        this.ar = str;
    }

    public void l(String str) {
        this.aA = str;
    }

    public void m(String str) {
        this.as = str;
    }

    public static CreativeInfo n(String str) {
        CreativeInfo creativeInfo = new CreativeInfo();
        creativeInfo.Y = str;
        return creativeInfo;
    }

    public String F() {
        return this.K;
    }

    public String G() {
        StringBuilder sb = new StringBuilder();
        if (this.G) {
            sb.append(this.Y);
        }
        sb.append(this.ac);
        sb.append(this.J);
        return sb.toString();
    }

    public String H() {
        return this.J;
    }

    public void o(String str) {
        this.J = D(str);
        z(this.J);
    }

    public String I() {
        return this.aE;
    }

    public void p(String str) {
        if (BrandSafetyEvent.AdFormatType.LEADER.name().equals(str)) {
            this.aE = BrandSafetyEvent.AdFormatType.BANNER.name();
        } else {
            this.aE = str;
        }
    }

    public void q(String str) {
        Logger.d(f29615a, "setPackageName: " + str);
        this.M = str;
    }

    public void a(String str, Set<String> set) {
        a(Arrays.asList(str), set);
    }

    public void a(List<String> list, Set<String> set) {
        Logger.d(f29615a, "add recommendations: " + list + ", resources list: " + set);
        if (list != null) {
            synchronized (this.aw) {
                this.aw.addAll(list);
            }
            Logger.d(f29615a, "add recommendations added : " + list);
        }
        if (set != null) {
            synchronized (this.ax) {
                this.ax.addAll(set);
            }
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                String D2 = D(it.next());
                if (!TextUtils.isEmpty(D2)) {
                    synchronized (this.ax) {
                        this.ax.add(D2);
                    }
                    synchronized (this.O) {
                        if (this.O.contains(D2)) {
                            Logger.d(f29615a, "removing recommendation resource " + D2 + " from WebView resource urls");
                            this.O.remove(D2);
                        }
                    }
                }
            }
        }
    }

    public Bundle d() {
        Bundle bundle = new Bundle();
        boolean a2 = CreativeInfoManager.a(this.aa, AdNetworkConfiguration.SHOULD_REPORT_AD_ID_ON_CI_CREATION, true);
        if (!TextUtils.isEmpty(this.Y) && a2) {
            bundle.putString(f29617c, this.Y);
        }
        if (this.H) {
            bundle.putLong(f29616b, this.ab);
        }
        if (!TextUtils.isEmpty(this.ac)) {
            bundle.putString("creative_id", this.ac);
        }
        if (!TextUtils.isEmpty(this.aB)) {
            bundle.putString(x, this.aB);
        }
        if (!TextUtils.isEmpty(this.ar)) {
            bundle.putString(L, this.ar);
        }
        if (!TextUtils.isEmpty(this.as)) {
            bundle.putString(S, this.as);
        }
        if (!TextUtils.isEmpty(this.J)) {
            bundle.putString(e, this.J);
        }
        if (!TextUtils.isEmpty(this.at)) {
            bundle.putString(ak, this.at);
        }
        if (!TextUtils.isEmpty(this.ah)) {
            bundle.putString(f29618f, this.ah);
        }
        if (!TextUtils.isEmpty(this.ai)) {
            bundle.putString(f29619g, this.ai);
        }
        if (!TextUtils.isEmpty(this.F)) {
            bundle.putString(f29629q, this.F);
        }
        if (!TextUtils.isEmpty(this.K)) {
            bundle.putString("zone_id", this.K);
        }
        bundle.putString("ad_format_type", this.aE);
        if (!TextUtils.isEmpty(this.M)) {
            bundle.putString(BrandSafetyEvent.f29780g, this.M);
        }
        bundle.putString("sdk_version", this.Q);
        if (!TextUtils.isEmpty(this.aY)) {
            bundle.putString(aU, this.aY);
        }
        synchronized (this.N) {
            if (this.N != null && !this.N.isEmpty()) {
                bundle.putStringArrayList(BrandSafetyEvent.f29781h, new ArrayList<>(this.N));
            }
        }
        synchronized (this.O) {
            if (this.O != null && !this.O.isEmpty()) {
                bundle.putStringArrayList(f29635y, new ArrayList<>(this.O));
            }
        }
        synchronized (this.aZ) {
            if (this.aZ != null && !this.aZ.isEmpty()) {
                bundle.putStringArrayList(aK, new ArrayList<>(this.aZ));
            }
        }
        synchronized (this.P) {
            if (this.P != null && !this.P.isEmpty()) {
                bundle.putStringArrayList(f29636z, new ArrayList<>(this.P));
            }
        }
        synchronized (this.au) {
            if (this.au != null && !this.au.isEmpty()) {
                bundle.putStringArrayList(am, new ArrayList<>(this.au));
            }
        }
        synchronized (this.aw) {
            if (this.ay && this.aw != null && !this.aw.isEmpty()) {
                bundle.putStringArrayList(BrandSafetyEvent.f29794u, new ArrayList<>(this.aw));
            }
        }
        return bundle;
    }

    public boolean c() {
        return this.ac == null;
    }

    public boolean J() {
        return !this.ag;
    }

    public BrandSafetyUtils.AdType K() {
        return this.E;
    }

    public void a(BrandSafetyUtils.AdType adType) {
        if (adType == null) {
            Logger.d(f29615a, "setAdType - ad type is null, not setting");
            return;
        }
        Logger.d(f29615a, "setAdType - set to ad type: " + adType + " for ci with id: " + this.Y);
        this.E = adType;
        ac();
    }

    public String L() {
        return this.Y;
    }

    public void r(String str) {
        this.Y = str;
    }

    public String M() {
        return this.ad;
    }

    public String N() {
        return this.ac;
    }

    public String O() {
        return this.aB;
    }

    public String P() {
        return this.ar;
    }

    public String Q() {
        return this.aa;
    }

    public void s(String str) {
        this.aa = str;
    }

    public String R() {
        return this.aA;
    }

    public int S() {
        return this.ae;
    }

    public void a(int i2) {
        this.ae = i2;
    }

    public void t(String str) {
        this.ad = str;
        if (TextUtils.isEmpty(this.M)) {
            q(a(str));
        }
    }

    public void g(boolean z2) {
        this.I = z2;
    }

    public void a(String str, String str2) {
        this.ah = str;
        if (str2 != null) {
            u("mi=" + str2);
        }
    }

    public void u(String str) {
        if (str != null) {
            if (this.ai == null) {
                this.ai = str;
            } else if (!this.ai.contains(str)) {
                this.ai += ImpressionLog.P + str;
            } else {
                Logger.d(f29615a, "setDebugInfo ci debug info already contains the string. skipping. content : " + str);
            }
        }
    }

    public void T() {
        this.ai = null;
    }

    public String U() {
        return this.ai;
    }

    public String V() {
        return this.ah;
    }

    public boolean a(Map<Integer, CreativeInfo> map) {
        if (this.ae == 0) {
            return false;
        }
        synchronized (map) {
            map.put(Integer.valueOf(this.ae), this);
        }
        return true;
    }

    public boolean b(Map<Integer, CreativeInfo> map) {
        CreativeInfo remove;
        if (this.ae == 0) {
            return false;
        }
        synchronized (map) {
            remove = map.remove(Integer.valueOf(this.ae));
        }
        return remove != null;
    }

    public boolean c(Map<String, CreativeInfo> map) {
        CreativeInfo remove;
        if (!WebView.class.getCanonicalName().equals(this.aW)) {
            return false;
        }
        synchronized (map) {
            remove = map.remove(this.aW);
        }
        return remove != null;
    }

    public void a(List<String> list) {
        this.aj = list;
    }

    public List<String> W() {
        return this.aj;
    }

    public void b(List<String> list) {
        if (list != null) {
            for (String str : list) {
                String D2 = D(str);
                String E = E(str);
                if (!TextUtils.isEmpty(D2)) {
                    if (b(str) || b(D2) || b(E) || str.startsWith(aT)) {
                        Logger.d(f29615a, "classifyPrefetchUrl " + this.aa + " url is a prefetch url " + str);
                        z(D2);
                    } else if (v(D2) && !D2.equals(this.ad)) {
                        Logger.d(f29615a, "classifyPrefetchUrl " + this.aa + " url is a dsp url " + str);
                        x(D2);
                    } else {
                        Logger.d(f29615a, "classifyPrefetchUrl " + this.aa + " url is not a prefetch nor a dsp url and will be discarded : " + str);
                    }
                }
            }
        }
    }

    public void c(List<String> list) {
        if (list != null) {
            k.b(f29615a, "add prefetch urls : " + list.toString());
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                z(it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean v(String str) {
        return e.a(this.aa, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(String str) {
        return k.a(str, (Map<String, String>) null);
    }

    public void w(String str) {
        if (v(str)) {
            x(str);
        }
    }

    public void a(ArrayList<String> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                x(it.next());
            }
        }
    }

    public void x(String str) {
        String D2 = D(str);
        if (!TextUtils.isEmpty(D2) && !this.au.contains(D2)) {
            if (!this.ax.contains(D2)) {
                Logger.d(f29615a, "add dsp domain url - adding the following url: " + D2);
                synchronized (this.N) {
                    this.N.add(D2);
                }
                return;
            }
            Logger.d(f29615a, "add dsp domain url: avoid adding a recommendation resource" + D2);
            this.ay = true;
        }
    }

    public void y(String str) {
        String D2 = !str.startsWith("text:") ? D(str) : str;
        if (!TextUtils.isEmpty(D2)) {
            if (!this.ax.contains(D2)) {
                if (this.bd != null && !this.bd.contains(D2)) {
                    if (this.af) {
                        if (!str.startsWith("text:")) {
                            this.aZ.add(D2);
                            return;
                        }
                        return;
                    } else {
                        synchronized (this.O) {
                            this.O.add(D2);
                        }
                        Logger.d(f29615a, "Resource was added successfully to CI, resource: " + D2);
                        return;
                    }
                }
                Logger.d(f29615a, "add resource url: Url is in the WebView urls exclusion list, will not be added : " + D2);
                return;
            }
            Logger.d(f29615a, "add resource url: avoid adding a recommendation resource: " + D2);
            this.ay = true;
        }
    }

    public void b(ArrayList<String> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                y(it.next());
            }
        }
    }

    public void z(String str) {
        String D2 = D(str);
        if (!TextUtils.isEmpty(D2)) {
            if (this.bd != null && !this.bd.contains(D2)) {
                synchronized (this.P) {
                    this.P.add(D2);
                }
                return;
            }
            Logger.d(f29615a, "add prefetch Url: Url is in the WebView urls exclusion list , will not be added : " + D2);
        }
    }

    public void A(String str) {
        if (str != null) {
            if (this.bd != null && !this.bd.contains(str)) {
                synchronized (this.P) {
                    this.P.add("text:" + str.trim());
                }
                return;
            }
            Logger.d(f29615a, "add prefetch text: already in the list, will not be added: " + str);
        }
    }

    public void B(String str) {
        if (str != null) {
            if (this.bd != null && !this.bd.contains(str)) {
                synchronized (this.P) {
                    this.P.add(aT + str);
                }
                return;
            }
            Logger.d(f29615a, "add prefetch element: already in the list, will not be added: " + str);
        }
    }

    public void C(String str) {
        String D2 = D(str);
        if (!TextUtils.isEmpty(D2)) {
            synchronized (this.au) {
                this.au.add(D2);
            }
        }
        synchronized (this.N) {
            this.N.remove(D2);
        }
    }

    public String toString() {
        Bundle d2 = d();
        d2.putBoolean(B, this.T | this.V);
        d2.putBoolean(C, this.W);
        return "matchingObjectAddress=" + this.aW + ", event_id" + ImpressionLog.R + this.aD + ", id=" + this.Y + ", stopCollectingResources=" + this.aC + ", " + d2;
    }

    public String X() {
        Bundle bundle = new Bundle();
        bundle.putString(f29617c, this.Y);
        if (this.aW != null) {
            bundle.putString(aL, this.aW);
        }
        if (this.aD != null) {
            bundle.putString("event_id", this.aD);
        }
        return bundle.toString();
    }

    private String a(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(A)) == -1) {
            return null;
        }
        int indexOf2 = str.indexOf("&", indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        Logger.d(f29615a, "Extracting package name:  package id: " + indexOf + " package id index: " + indexOf2 + " click url: " + str);
        return str.substring(indexOf + A.length(), indexOf2);
    }

    public Timestamp Y() {
        return this.R;
    }

    public static String D(String str) {
        if (!TextUtils.isEmpty(str)) {
            return k.k(k.F(str));
        }
        return str;
    }

    protected String E(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return URLEncoder.encode(str, "UTF-8");
            } catch (Throwable th) {
                Logger.d(f29615a, "Failure in encode url. This url will be sent as is in the next event. " + th.getMessage() + ". Url=" + str);
                return str;
            }
        }
        return str;
    }

    public void Z() {
        this.Z = true;
    }

    public void F(String str) {
        this.X = str;
    }

    public String aa() {
        return this.ac;
    }

    public long ab() {
        return this.ab;
    }

    public void ac() {
        a i2 = CreativeInfoManager.i(this.aa);
        if (i2 != null) {
            if (K().equals(BrandSafetyUtils.AdType.INTERSTITIAL)) {
                this.R = new Timestamp(System.currentTimeMillis() + i2.e(AdNetworkConfiguration.FULL_SCREEN_CI_MAX_AGE));
                Logger.d(f29615a, "set expiration time - sdk: " + this.aa + ", inter max age: " + i2.e(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE));
            } else if (K().equals(BrandSafetyUtils.AdType.BANNER) || K().equals(BrandSafetyUtils.AdType.MREC) || K().equals(BrandSafetyUtils.AdType.NATIVE)) {
                this.R = new Timestamp(System.currentTimeMillis() + i2.e(AdNetworkConfiguration.BANNER_CI_MAX_AGE));
                Logger.d(f29615a, "set expiration time - sdk: " + this.aa + ", banner/mrec/native max age: " + i2.e(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE));
            }
        }
    }

    public boolean ad() {
        return this.be;
    }

    public void h(boolean z2) {
        this.be = z2;
    }

    public String ae() {
        return this.aX;
    }

    public String af() {
        return this.aW;
    }

    public void a(Object obj) {
        if (obj != null) {
            this.aX = obj.getClass().getCanonicalName();
            this.aW = BrandSafetyUtils.a(obj);
        } else {
            this.aX = null;
            this.aW = null;
        }
        Logger.d(f29615a, "set matching object - type: " + this.aX + ", address: " + this.aW + ", ad id: " + this.Y);
    }

    public void b(String str, String str2) {
        this.aW = str;
        this.aX = str2;
    }

    public void ag() {
        long j2 = this.ab;
        this.ab = k.b(SystemClock.elapsedRealtime());
        Logger.d(f29615a, "prefetch timestamp reset. old value = " + j2 + ", new value = " + this.ab);
    }

    public void G(String str) {
        String D2 = D(str);
        this.bd.add(D2);
        H(D2);
    }

    private void H(String str) {
        if (this.O.contains(str)) {
            Logger.d(f29615a, "removing url from WebView resource urls : " + str);
            this.O.remove(str);
        }
    }

    public boolean ah() {
        return this.ba;
    }

    public void ai() {
        this.ba = true;
    }

    public void a(CreativeInfo creativeInfo) {
    }

    public static List<String> a(List<CreativeInfo> list, String str) {
        ArrayList arrayList = new ArrayList();
        if (str == null || list == null || list.size() == 0) {
            return arrayList;
        }
        String lowerCase = str.toLowerCase();
        for (CreativeInfo creativeInfo : list) {
            if (lowerCase.equals("id")) {
                arrayList.add(creativeInfo.ac);
            } else if (lowerCase.equals("clickurl")) {
                arrayList.add(creativeInfo.ad);
            } else if (lowerCase.equals("adid")) {
                arrayList.add(creativeInfo.Y);
            }
        }
        return arrayList;
    }

    public void a(String str, ImpressionLog.a... aVarArr) {
        try {
            this.bc.a(str, aVarArr);
        } catch (NullPointerException e2) {
            Logger.d(f29615a, "add impression log event failed: type=" + str + ", impressionLog=" + this.bc);
        }
    }

    public void a(Long l2, Long l3, String str, ImpressionLog.a... aVarArr) {
        try {
            this.bc.a(l2, l3, str, aVarArr);
        } catch (NullPointerException e2) {
            Logger.d(f29615a, "add impression log event failed: type=" + str + ", impressionLog=" + this.bc);
        }
    }
}
