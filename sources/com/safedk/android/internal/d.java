package com.safedk.android.internal;

import android.os.Bundle;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.p;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    public static final String A = "imageMimeTypesList";
    public static final String B = "videoMimeTypesList";
    public static final String C = "audioMimeTypesList";
    public static final String D = "maxBannerUniformPixelsPercentageToStopSampling";
    public static final String E = "minBannerUniformPixelsPercentageForUniformImage";
    public static final String F = "maxAttemptsToCaptureBannerImage";
    public static final String G = "bannerImageSamplingInterval";
    public static final String H = "bannerDimensionsMaxSize";
    public static final String I = "isBannersEnabled";
    public static final String J = "https://edge.safedk.com";
    public static final String K = "https://edge.safedk.com";
    public static final long L = 1200000;
    public static final int M = 20;
    public static final String N = "apng;bmp;gif;x-icon;x-icon;png;svg+xml;tiff";
    public static final String O = "wave;wav;x-wav;x-pn-wav;webm;ogg;";
    public static final String P = "webViewAnalysisIntervals";
    public static final List<Integer> Q = Arrays.asList(0, 2, 4, 8, 16, 32, 64);
    public static List<Integer> R = Q;
    private static final String S = "SafeDKConfiguration";
    private static final String T = "settings";
    private static final String U = "android";
    private static final String V = "images";
    private static final String W = "banners";
    private static final String X = "adCaching";
    private static final String Y = "general";
    private static final String Z = "timers";

    /* renamed from: a, reason: collision with root package name */
    public static final int f29934a = 300;
    private static final float aB = 90.0f;
    private static final int aD = 5;
    private static final int aF = 25000;
    private static final boolean aH = false;
    private static final int aJ = 10000;
    private static final int aL = 15000;
    private static final int aN = 15000;
    private static final int aX = 100;
    private static final String aa = "redirectClickTimeout";
    private static final String ab = "sdkSpecificMinUniformPixelsPercentageForUniformImage";
    private static final String ac = "sdkSpecificCachedCIMaxAge";
    private static final String ad = "sdkSpecificCachedCIExpiration";
    private static final int ae = 30000;
    private static final int af = 30000;
    private static final int av = 8192;
    private static final int ax = 540;
    private static final float az = 40.0f;

    /* renamed from: b, reason: collision with root package name */
    public static final int f29935b = 5000;
    private static final float ba = 40.0f;
    private static final float bc = 90.0f;
    private static final int be = 5;
    private static final int bg = 1;
    private static final int bi = 480;
    private static final boolean bk = true;
    private static final boolean bm = true;

    /* renamed from: c, reason: collision with root package name */
    public static final int f29936c = 500;
    public static final String d = "minValidImageSize";
    public static final String e = "interstitialDimensionsMaxSize";

    /* renamed from: f, reason: collision with root package name */
    public static final String f29937f = "maxUniformPixelsPercentageToStopSampling";

    /* renamed from: g, reason: collision with root package name */
    public static final String f29938g = "maxImagesToStoreOnDevice";

    /* renamed from: h, reason: collision with root package name */
    public static final String f29939h = "minImageSizeToStopSampling";

    /* renamed from: i, reason: collision with root package name */
    public static final String f29940i = "minUniformPixelsPercentageForUniformImage";

    /* renamed from: j, reason: collision with root package name */
    public static final String f29941j = "awsUploadTimeout";

    /* renamed from: k, reason: collision with root package name */
    public static final String f29942k = "resolveUrlTimeout";

    /* renamed from: l, reason: collision with root package name */
    public static final String f29943l = "clickValidityTimeout";

    /* renamed from: m, reason: collision with root package name */
    public static final String f29944m = "interstitialActivitiesToInclude";

    /* renamed from: n, reason: collision with root package name */
    public static final String f29945n = "interstitialActivitiesToExclude";

    /* renamed from: o, reason: collision with root package name */
    public static final String f29946o = "edgeServerUrl";

    /* renamed from: p, reason: collision with root package name */
    public static final String f29947p = "backupEdgeServerUrl";

    /* renamed from: q, reason: collision with root package name */
    public static final String f29948q = "devicesWithDebugLog";

    /* renamed from: r, reason: collision with root package name */
    public static final String f29949r = "cachedCreativeInfoMaxAge";

    /* renamed from: s, reason: collision with root package name */
    public static final String f29950s = "cachedMaxNumberOfItems";

    /* renamed from: t, reason: collision with root package name */
    public static final String f29951t = "cachedNumberOfItemsThreshold";

    /* renamed from: u, reason: collision with root package name */
    public static final String f29952u = "cacheSupportingSdkUUIDs";

    /* renamed from: v, reason: collision with root package name */
    public static final String f29953v = "safeDKDeactivation";
    public static final String w = "activePercentage";
    public static final String x = "deactivated";

    /* renamed from: y, reason: collision with root package name */
    public static final String f29954y = "alwaysTakeScreenshot";

    /* renamed from: z, reason: collision with root package name */
    public static final String f29955z = "disableWebViewTracking";
    private boolean ag = false;
    private int ah = 300;
    private boolean ai = false;
    private int aj = 5000;
    private int ak = f29936c;
    private int al = p.f29763c;
    private int am = p.f29763c;
    private boolean an = false;
    private boolean ao = true;
    private boolean ap = false;
    private boolean aq = false;
    private JSONObject ar = new JSONObject();
    private JSONObject as = new JSONObject();
    private ArrayList<String> at = new ArrayList<>(Arrays.asList(com.safedk.android.utils.g.d, com.safedk.android.utils.g.f30049b, com.safedk.android.utils.g.f30066u, com.safedk.android.utils.g.f30069z, com.safedk.android.utils.g.f30060o));
    private boolean au = false;
    private int aw = 8192;
    private int ay = ax;
    private float aA = 40.0f;
    private float aC = 90.0f;
    private int aE = 5;
    private long aG = 25000;
    private boolean aI = false;
    private int aK = aJ;
    private int aM = 15000;
    private int aO = 15000;
    private ArrayList<String> aP = new ArrayList<>();
    private ArrayList<String> aQ = new ArrayList<>();
    private String aR = "https://edge.safedk.com";
    private String aS = "https://edge.safedk.com";
    private ArrayList<String> aT = new ArrayList<>();
    private ArrayList<String> aU = new ArrayList<>();
    private long aV = L;
    private int aW = 20;
    private int aY = 100;
    private final boolean aZ = false;
    private float bb = 40.0f;
    private float bd = 90.0f;
    private int bf = 5;
    private int bh = 1;
    private int bj = bi;
    private boolean bl = true;
    private boolean bn = true;
    private List<String> bo = Arrays.asList(N.split(";"));
    private List<String> bp = Arrays.asList(O.split(";"));
    private boolean bq = false;

    public int a() {
        return this.al;
    }

    public int b() {
        return this.am;
    }

    public boolean c() {
        return this.au;
    }

    public int d() {
        return this.aw;
    }

    public int e() {
        return this.ay;
    }

    public float f() {
        return this.aA;
    }

    public float g() {
        return this.aC;
    }

    public boolean h() {
        return this.aI;
    }

    public int i() {
        return this.aE;
    }

    public long j() {
        return this.aG;
    }

    public int k() {
        return this.aK;
    }

    public int l() {
        return this.aM;
    }

    public int m() {
        return this.aO;
    }

    public float n() {
        return this.bb;
    }

    public float o() {
        return this.bd;
    }

    public int p() {
        return this.bf;
    }

    public int q() {
        return this.bh;
    }

    public int r() {
        return this.bj;
    }

    public boolean s() {
        return this.bl;
    }

    public boolean t() {
        return this.bn;
    }

    public List<String> u() {
        return this.bo;
    }

    public List<String> v() {
        return this.bp;
    }

    public static List<Integer> w() {
        return R;
    }

    public void a(boolean z2) {
        this.bq = z2;
    }

    public boolean x() {
        return this.aq;
    }

    public boolean y() {
        return !this.bq;
    }

    public void b(boolean z2) {
        this.ag = z2;
    }

    public boolean z() {
        return this.ag;
    }

    public int A() {
        return this.ah;
    }

    public void a(int i2) {
        this.aj = i2;
    }

    public void b(int i2) {
        this.ak = i2;
    }

    public boolean B() {
        return this.an;
    }

    public boolean C() {
        return this.ai;
    }

    public int D() {
        return this.aj;
    }

    public int E() {
        return this.ak;
    }

    public JSONObject F() {
        return this.ar;
    }

    public JSONObject G() {
        return this.as;
    }

    public Set<String> H() {
        return new HashSet(this.aT);
    }

    public boolean I() {
        return this.ap;
    }

    public int J() {
        return this.aY;
    }

    public boolean a(Bundle bundle, boolean z2) {
        Logger.d(S, "parseSettings started , bundle : " + (bundle == null ? "null" : bundle.toString()));
        Bundle bundle2 = bundle.getBundle(T);
        if (bundle2 == null) {
            if (z2) {
                Logger.e(S, "Settings bundle is null, cannot parse settings. Saved settings will be used");
            }
            return false;
        }
        Logger.d(S, "parseSettings starting DEACTIVATION");
        if (bundle2.containsKey(f29953v)) {
            Bundle bundle3 = bundle2.getBundle(f29953v);
            if (bundle3.containsKey(x)) {
                this.bq = bundle3.getBoolean(x, false);
                Logger.d(S, "parseSettings deactivated " + this.bq);
            } else {
                this.bq = false;
            }
            if (bundle3.containsKey(w)) {
                this.aY = (int) bundle3.getDouble(w, 100.0d);
                Logger.d(S, "parseSettings activePercentage " + this.aY);
            } else {
                this.aY = 100;
            }
            if (!this.bq && this.aY != 100) {
                Logger.d(S, "Checking active percentage");
                this.bq = !a(Double.valueOf((double) this.aY), SafeDK.getInstance().getUserId());
                Logger.d(S, "After active percentage deactivated=" + this.bq);
            }
        } else {
            this.bq = false;
            this.aY = 100;
            Logger.d(S, "parseSettings SAFE_DK_DEACTIVATION settings block does not exist. Default configuration values will be used.");
        }
        if (bundle2 != null && bundle2.containsKey(V)) {
            Bundle bundle4 = bundle2.getBundle(V);
            Logger.d(S, "parseSettings starting IMAGES : " + bundle4.toString());
            if (bundle4.containsKey(d)) {
                this.aw = bundle4.getInt(d, 8192);
                Logger.d(S, "parseSettings minValidImageSize " + this.aw);
            } else {
                this.aw = 8192;
            }
            if (bundle4.containsKey(e)) {
                this.ay = bundle4.getInt(e, ax);
                Logger.d(S, "parseSettings interstitialDimensionsMaxSize " + this.ay);
            } else {
                this.ay = ax;
            }
            if (bundle4.containsKey(f29937f)) {
                this.aA = (float) bundle4.getDouble(f29937f, 40.0d);
                Logger.d(S, "parseSettings maxUniformPixelsPercentageToStopSampling " + this.aA);
            } else {
                this.aA = 40.0f;
            }
            if (bundle4.containsKey(f29938g)) {
                this.aE = bundle4.getInt(f29938g, 5);
                Logger.d(S, "parseSettings maxImagesToStoreOnDevice " + this.aE);
            } else {
                this.aE = 5;
            }
            if (bundle4.containsKey(f29939h)) {
                this.aG = bundle4.getInt(f29939h, aF);
                Logger.d(S, "parseSettings minImageSizeToStopSampling " + this.aG);
            } else {
                this.aG = 25000L;
            }
            if (bundle4.containsKey(f29940i)) {
                this.aC = (float) bundle4.getDouble(f29940i, 90.0d);
                Logger.d(S, "parseSettings minUniformPixelsPercentageForUniformImage " + this.aC);
                CreativeInfoManager.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, this.aC);
            }
            if (bundle4.containsKey(f29954y)) {
                this.aI = bundle4.getBoolean(f29954y, false);
                Logger.d(S, "parseSettings alwaysTakeScreenshot " + this.aI);
            } else {
                this.aI = false;
            }
            try {
                if (bundle4.containsKey(ab)) {
                    Logger.d(S, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage " + bundle4.getBundle(ab));
                    Bundle bundle5 = bundle4.getBundle(ab);
                    for (String str : bundle5.keySet()) {
                        Logger.d(S, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage key = " + str + ", value = " + bundle5.getDouble(str));
                        double d2 = bundle5.getDouble(str);
                        String sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(str);
                        if (sdkPackageByPackageUUID != null) {
                            Logger.d(S, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage identified UUID = " + str + ", sdkPackageName = " + sdkPackageByPackageUUID + ", value = " + d2);
                            com.safedk.android.analytics.brandsafety.creatives.a i2 = CreativeInfoManager.i(sdkPackageByPackageUUID);
                            if (i2 != null) {
                                i2.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, (float) d2);
                                Logger.d(S, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage UUID = " + str + ", sdkPackageName = " + sdkPackageByPackageUUID + ", value = " + ((float) d2));
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                Logger.d(S, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage Exception : " + th.getMessage(), th);
            }
        } else {
            this.aw = 8192;
            this.ay = ax;
            this.aA = 40.0f;
            this.aE = 5;
            this.aG = 25000L;
            Logger.d(S, "minUniformPixelsPercentageForUniformImage set to " + this.aC);
            this.aI = false;
            Logger.d(S, "parseSettings IMAGES settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(S, "parseSettings starting BANNERS");
        if (bundle2 != null && bundle2.containsKey(W)) {
            Bundle bundle6 = bundle2.getBundle(W);
            if (bundle6.containsKey(D)) {
                this.bb = (float) bundle6.getDouble(D, 40.0d);
                Logger.d(S, "parseSettings maxBannerUniformPixelsPercentageToStopSampling " + this.bb);
            } else {
                this.bb = 40.0f;
            }
            if (bundle6.containsKey(E)) {
                this.bd = (float) bundle6.getDouble(E, 90.0d);
                Logger.d(S, "parseSettings minBannerUniformPixelsPercentageForUniformImage " + this.bd);
            } else {
                this.bd = 90.0f;
            }
            if (bundle6.containsKey(F)) {
                this.bf = bundle6.getInt(F, 5);
                Logger.d(S, "parseSettings maxAttemptsToCaptureBannerImage " + this.bf);
            } else {
                this.bf = 5;
            }
            if (bundle6.containsKey(G)) {
                this.bh = bundle6.getInt(G, 1);
                Logger.d(S, "parseSettings bannerImageSamplingInterval " + this.bh);
            } else {
                this.bh = 1;
            }
            if (bundle6.containsKey(H)) {
                this.bj = bundle6.getInt(H, bi);
                Logger.d(S, "parseSettings bannerDimensionsMaxSize " + this.bj);
            } else {
                this.bj = bi;
            }
            if (bundle6.containsKey(I)) {
                this.bl = bundle6.getBoolean(I, true);
                Logger.d(S, "parseSettings bannerIsEnabled " + this.bl);
            } else {
                this.bl = true;
            }
        } else {
            this.bb = 40.0f;
            this.bd = 90.0f;
            this.bf = 5;
            this.bh = 1;
            this.bj = bi;
            this.bl = true;
            Logger.d(S, "parseSettings BANNERS settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(S, "parseSettings starting TIMERS");
        if (bundle2.containsKey(Z)) {
            Bundle bundle7 = bundle2.getBundle(Z);
            if (bundle7.containsKey(f29941j)) {
                this.aK = (int) bundle7.getDouble(f29941j, 10000.0d);
                if (z2) {
                    this.aK *= 1000;
                }
                Logger.d(S, "parseSettings awsUploadTimeout (ms) " + this.aK);
            } else {
                this.aK = aJ;
            }
            if (bundle7.containsKey(f29942k)) {
                this.aM = (int) bundle7.getDouble(f29942k, 15000.0d);
                if (z2) {
                    this.aM *= 1000;
                }
                Logger.d(S, "parseSettings resolveUrlTimeout (ms) " + this.aM);
            } else {
                this.aM = 15000;
            }
            if (bundle7.containsKey(f29943l)) {
                this.aO = ((int) bundle7.getDouble(f29943l, 15000.0d)) * 1000;
                if (z2) {
                    this.aO *= 1000;
                }
                Logger.d(S, "parseSettings clickValidityTimeout (ms) " + this.aO);
            } else {
                this.aO = 15000;
            }
            if (bundle7.containsKey(aa)) {
                this.al = bundle7.getInt(aa, 30) * 1000;
                Logger.d(S, "parseSettings redirectClickTimeout (ms) value is " + this.al + ", isFromServer=" + z2);
            } else {
                this.al = p.f29763c;
            }
        } else {
            this.aK = aJ;
            this.aM = 15000;
            this.aO = 15000;
            this.al = p.f29763c;
            Logger.d(S, "parseSettings TIMERS settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(S, "parseSettings starting ANDROID");
        if (bundle2.containsKey("android")) {
            Bundle bundle8 = bundle2.getBundle("android");
            if (bundle8.containsKey(f29944m)) {
                this.aP = bundle8.getStringArrayList(f29944m);
                Logger.d(S, "parseSettings interstitialActivitiesToInclude " + this.aP);
            }
            if (bundle8.containsKey(f29945n)) {
                this.aQ = bundle8.getStringArrayList(f29945n);
                Logger.d(S, "parseSettings interstitialActivitiesToExclude " + this.aQ);
            }
            if ((this.aP != null && this.aP.size() > 0) || (this.aQ != null && this.aQ.size() > 0)) {
                Iterator<String> it = this.aP.iterator();
                while (it.hasNext()) {
                    BrandSafetyUtils.j(it.next());
                }
                Iterator<String> it2 = this.aQ.iterator();
                while (it2.hasNext()) {
                    BrandSafetyUtils.k(it2.next());
                }
            }
            if (bundle8.containsKey(f29955z)) {
                this.au = bundle8.getBoolean(f29955z, false);
                Logger.d(S, "parseSettings disableWebViewTracking " + this.au);
            }
            if (bundle8.containsKey(P)) {
                R = bundle8.getIntegerArrayList(P);
                Logger.d(S, "parseSettings chosen interstitial resource scanning intervals: " + R);
            } else {
                Logger.d(S, "parseSettings chosen default interstitial resource scanning intervals: ");
            }
        } else {
            Logger.d(S, "parseSettings ANDROID settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(S, "parseSettings starting GENERAL");
        if (bundle2.containsKey(Y)) {
            Bundle bundle9 = bundle2.getBundle(Y);
            if (bundle9.containsKey(f29946o)) {
                this.aR = bundle9.getString(f29946o, "https://edge.safedk.com");
                this.aR = a(this.aR);
                Logger.d(S, "parseSettings edgeServerUrl " + this.aR);
            } else {
                this.aR = "https://edge.safedk.com";
            }
            if (bundle9.containsKey(f29947p)) {
                this.aS = bundle9.getString(f29947p, "https://edge.safedk.com");
                this.aS = a(this.aS);
                Logger.d(S, "parseSettings backupEdgeServerUrl " + this.aS);
            } else {
                this.aS = "https://edge.safedk.com";
            }
            AppLovinBridge.receiveEdgeUrls(this.aR, this.aS);
            if (bundle9.containsKey(f29948q)) {
                this.aT = bundle9.getStringArrayList(f29948q);
                Logger.d(S, "parseSettings devicesWithDebugLog " + this.aT);
            }
        } else {
            Logger.d(S, "parseSettings GENERAL settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(S, "parseSettings starting Ad CACHING");
        if (bundle2.containsKey(X)) {
            Bundle bundle10 = bundle2.getBundle(X);
            if (bundle10.containsKey(f29949r)) {
                this.aV = (int) bundle10.getDouble(f29949r, 1200000.0d);
                Logger.d(S, "parseSettings cachedCreativeInfoMaxAge " + this.aV);
            } else {
                this.aV = L;
            }
            CreativeInfoManager.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, this.aV);
            if (bundle10.containsKey(f29950s)) {
                this.aW = bundle10.getInt(f29950s);
                Logger.d(S, "parseSettings cachedMaxNumberOfItems " + this.aW);
            } else {
                this.aW = 20;
            }
            if (bundle10.containsKey(f29952u)) {
                this.aU = bundle10.getStringArrayList(f29952u);
                Logger.d(S, "parseSettings cacheSupportingSdkUUIDs " + this.aU);
            }
            if (this.aU != null && this.aU.size() > 0) {
                a(this.aU);
            }
            try {
                if (bundle10.containsKey(ac)) {
                    Logger.d(S, "parseSettings sdkSpecificCachedCIMaxAge " + bundle10.getBundle(ac));
                    Bundle bundle11 = bundle10.getBundle(ac);
                    for (String str2 : bundle11.keySet()) {
                        Logger.d(S, "parseSettings sdkSpecificCachedCIMaxAge key = " + str2 + ", value = " + bundle11.getDouble(str2));
                        long j2 = (long) bundle11.getDouble(str2);
                        String sdkPackageByPackageUUID2 = SdksMapping.getSdkPackageByPackageUUID(str2);
                        if (sdkPackageByPackageUUID2 != null) {
                            Logger.d(S, "parseSettings sdkSpecificCachedCIMaxAge identified UUID = " + str2 + ", sdkPackageName = " + sdkPackageByPackageUUID2 + ", value = " + j2);
                            com.safedk.android.analytics.brandsafety.creatives.a i3 = CreativeInfoManager.i(sdkPackageByPackageUUID2);
                            if (i3 != null) {
                                i3.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, j2);
                                Logger.d(S, "parseSettings sdkSpecificCachedCIMaxAge UUID = " + str2 + ", sdkPackageName = " + sdkPackageByPackageUUID2 + ", value = " + j2);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                Logger.d(S, "parseSettings sdkSpecificCachedCreativeInfoMaxAge Exception : " + th2.getMessage(), th2);
            }
            try {
                if (bundle10.containsKey(ad)) {
                    Logger.d(S, "parseSettings sdkSpecificCachedCreativeInfoMaxAge " + bundle10.getBundle(ad));
                    Bundle bundle12 = bundle10.getBundle(ad);
                    for (String str3 : bundle12.keySet()) {
                        Logger.d(S, "parseSettings sdkSpecificCachedCIExpirationBundle key = " + str3 + ", value = " + bundle12.getBoolean(str3));
                        boolean z3 = bundle12.getBoolean(str3);
                        String sdkPackageByPackageUUID3 = SdksMapping.getSdkPackageByPackageUUID(str3);
                        if (sdkPackageByPackageUUID3 != null) {
                            Logger.d(S, "parseSettings sdkSpecificCachedCIExpirationBundle identified UUID = " + str3 + ", sdkPackageName = " + sdkPackageByPackageUUID3 + ", value = " + z3);
                            com.safedk.android.analytics.brandsafety.creatives.a i4 = CreativeInfoManager.i(sdkPackageByPackageUUID3);
                            if (i4 != null) {
                                i4.b(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_EXPIRATION, z3);
                                Logger.d(S, "parseSettings sdkSpecificCachedCIExpirationBundle UUID = " + str3 + ", sdkPackageName = " + sdkPackageByPackageUUID3 + ", value = " + z3);
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                Logger.d(S, "parseSettings sdkSpecificCachedCIExpirationBundle Exception : " + th3.getMessage(), th3);
            }
        } else {
            this.aV = L;
            this.aW = 20;
            Logger.d(S, "parseSettings AD_CACHING settings block does not exist. Default configuration values will be used.");
        }
        return true;
    }

    private void a(JSONObject jSONObject) throws JSONException {
        Logger.d(S, "Attempting to parse sdk specific uniformity threshold. setting : " + jSONObject);
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                int i2 = jSONObject.getInt(next);
                String sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(next);
                if (sdkPackageByPackageUUID != null) {
                    Logger.d(S, "Parse sdk specific uniformity threshold setting identified, UUID = " + next + ", sdkPackageName = " + sdkPackageByPackageUUID + ", value = " + i2);
                    com.safedk.android.analytics.brandsafety.creatives.a i3 = CreativeInfoManager.i(sdkPackageByPackageUUID);
                    if (i3 != null) {
                        i3.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, i2);
                        Logger.d(S, "Parse sdk specific uniformity threshold set, UUID = " + next + ", sdkPackageName = " + sdkPackageByPackageUUID + ", value = " + i2);
                    }
                }
            }
            return;
        }
        Logger.d(S, "Cannot parse sdk specific uniformity setting, json is null");
    }

    private void a(Bundle bundle) {
        Logger.d(S, "processSdkVersionsBundle started, bundle=" + bundle.toString());
    }

    private void a(ArrayList<String> arrayList) {
        this.at.clear();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            Logger.d(S, "Adding cacheSupportingSDKUUID " + next + " to cacheSupportedSdk List");
            this.at.add(next);
        }
    }

    private String a(String str) {
        if (str != null && str.length() > 0) {
            try {
                URL url = new URL(str);
                String protocol = url.getProtocol();
                String host = url.getHost();
                int port = url.getPort();
                if (port == -1) {
                    str = String.format("%s://%s", protocol, host);
                } else {
                    str = String.format("%s://%s:%d", protocol, host, Integer.valueOf(port));
                }
            } catch (MalformedURLException e2) {
                Logger.e(S, "Exception sanitizing server url:" + e2.getMessage(), e2);
            }
        }
        return str;
    }

    private boolean a(Double d2, String str) {
        Logger.d(S, "checkActivePercent started, activePercent=" + d2 + ", userId=" + str);
        float a2 = DeviceData.a("", str);
        Logger.d(S, "checkActivePercent hashValue ==" + a2);
        return ((double) a2) <= d2.doubleValue();
    }

    public long K() {
        return this.aV;
    }

    public int L() {
        return this.aW;
    }

    public ArrayList<String> M() {
        return this.at;
    }
}
