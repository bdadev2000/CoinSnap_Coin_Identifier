package com.vungle.ads.internal.network;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import bh.c1;
import bh.d0;
import bh.f1;
import bh.g1;
import bh.i3;
import bh.p0;
import bh.w0;
import bh.z0;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.VungleAds$WrapperFramework;
import com.vungle.ads.e3;
import com.vungle.ads.g3;
import com.vungle.ads.internal.protos.Sdk$MetricBatch;
import com.vungle.ads.internal.protos.Sdk$SDKErrorBatch;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import wh.e0;
import wh.f0;
import wh.g0;
import wh.k0;
import wh.l0;
import wh.m0;
import wh.o0;
import wh.r0;
import wh.s0;
import wh.t0;
import wh.u0;
import wh.x0;
import wh.y0;

/* loaded from: classes4.dex */
public final class y {
    private static final String BASE_URL;
    public static final o Companion;
    private static final String MANUFACTURER_AMAZON = "Amazon";
    private static final String TAG = "VungleApiClient";
    private static VungleAds$WrapperFramework WRAPPER_FRAMEWORK_SELECTED;
    private static String headerUa;
    private static final Json json;
    private static final Set<f0> logInterceptors;
    private static final Set<f0> networkInterceptors;
    private VungleApi api;
    private d0 appBody;
    private String appSetId;
    private final Context applicationContext;
    private i3 baseDeviceInfo;
    private final eh.b filePreferences;
    private VungleApi gzipApi;
    private Boolean isGooglePlayServicesAvailable;
    private final com.vungle.ads.internal.platform.d platform;
    private f0 responseInterceptor;
    private Map<String, Long> retryAfterDataMap;
    private final Lazy signalManager$delegate;
    private String uaString;

    static {
        String defaultHeader;
        o oVar = new o(null);
        Companion = oVar;
        BASE_URL = "https://config.ads.vungle.com/";
        defaultHeader = oVar.defaultHeader();
        headerUa = defaultHeader;
        networkInterceptors = new HashSet();
        logInterceptors = new HashSet();
        json = JsonKt.Json$default(null, n.INSTANCE, 1, null);
    }

    public y(Context applicationContext, com.vungle.ads.internal.platform.d platform, eh.b filePreferences) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(filePreferences, "filePreferences");
        this.applicationContext = applicationContext;
        this.platform = platform;
        this.filePreferences = filePreferences;
        this.uaString = System.getProperty("http.agent");
        this.appSetId = "";
        ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
        this.signalManager$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new x(applicationContext));
        this.retryAfterDataMap = new ConcurrentHashMap();
        this.responseInterceptor = new f0() { // from class: com.vungle.ads.internal.network.m
            @Override // wh.f0
            public final u0 intercept(e0 e0Var) {
                u0 m43responseInterceptor$lambda0;
                m43responseInterceptor$lambda0 = y.m43responseInterceptor$lambda0(y.this, (ci.f) e0Var);
                return m43responseInterceptor$lambda0;
            }
        };
        k0 k0Var = new k0();
        f0 interceptor = this.responseInterceptor;
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        ArrayList arrayList = k0Var.f27089c;
        arrayList.add(interceptor);
        s proxySelector = new s();
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        if (!Intrinsics.areEqual(proxySelector, k0Var.f27099m)) {
            k0Var.f27108w = null;
        }
        k0Var.f27099m = proxySelector;
        l0 l0Var = new l0(k0Var);
        r interceptor2 = new r();
        Intrinsics.checkNotNullParameter(interceptor2, "interceptor");
        arrayList.add(interceptor2);
        l0 l0Var2 = new l0(k0Var);
        this.api = new b0(l0Var);
        this.gzipApi = new b0(l0Var2);
    }

    public static final /* synthetic */ String access$getBASE_URL$cp() {
        return BASE_URL;
    }

    public static final /* synthetic */ String access$getHeaderUa$cp() {
        return headerUa;
    }

    public static final /* synthetic */ VungleAds$WrapperFramework access$getWRAPPER_FRAMEWORK_SELECTED$cp() {
        return WRAPPER_FRAMEWORK_SELECTED;
    }

    public static final /* synthetic */ void access$setHeaderUa$cp(String str) {
        headerUa = str;
    }

    public static final /* synthetic */ void access$setWRAPPER_FRAMEWORK_SELECTED$cp(VungleAds$WrapperFramework vungleAds$WrapperFramework) {
        WRAPPER_FRAMEWORK_SELECTED = vungleAds$WrapperFramework;
    }

    private final String bodyToString(s0 s0Var) {
        try {
            ki.i iVar = new ki.i();
            if (s0Var == null) {
                return "";
            }
            s0Var.writeTo(iVar);
            return iVar.readUtf8();
        } catch (Exception unused) {
            return "";
        }
    }

    private final u0 defaultErrorResponse(o0 request) {
        t0 t0Var = new t0();
        Intrinsics.checkNotNullParameter(request, "request");
        t0Var.a = request;
        t0Var.f27201c = 500;
        m0 protocol = m0.HTTP_1_1;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        t0Var.f27200b = protocol;
        Intrinsics.checkNotNullParameter("Server is busy", PglCryptUtils.KEY_MESSAGE);
        t0Var.f27202d = "Server is busy";
        x0 x0Var = y0.Companion;
        Pattern pattern = g0.f27059d;
        g0 E = wh.a0.E("application/json; charset=utf-8");
        x0Var.getClass();
        t0Var.f27205g = x0.a("{\"Error\":\"Server is busy\"}", E);
        return t0Var.a();
    }

    public static /* synthetic */ void getAppBody$vungle_ads_release$annotations() {
    }

    private final i3 getBasicDeviceBody(Context context) {
        String str;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        String carrierName$vungle_ads_release = com.vungle.ads.internal.platform.b.Companion.getCarrierName$vungle_ads_release(context);
        if (Intrinsics.areEqual("Amazon", MANUFACTURER)) {
            str = "amazon";
        } else {
            str = "android";
        }
        i3 i3Var = new i3(MANUFACTURER, MODEL, RELEASE, carrierName$vungle_ads_release, str, displayMetrics.widthPixels, displayMetrics.heightPixels, this.uaString, (String) null, (Integer) null, (bh.e3) null, 1792, (DefaultConstructorMarker) null);
        try {
            String userAgent = ((com.vungle.ads.internal.platform.b) this.platform).getUserAgent();
            this.uaString = userAgent;
            i3Var.setUa(userAgent);
            initUserAgentLazy();
        } catch (Exception e2) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Cannot Get UserAgent. Setting Default Device UserAgent." + e2.getLocalizedMessage());
        }
        return i3Var;
    }

    private final String getConnectionType() {
        if (com.bumptech.glide.e.k(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            Object systemService = this.applicationContext.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1 && type != 6) {
                        if (type != 7) {
                            if (type != 9) {
                                return "UNKNOWN";
                            }
                            return "ETHERNET";
                        }
                        return "BLUETOOTH";
                    }
                    return "WIFI";
                }
                return "MOBILE";
            }
            return "NONE";
        }
        return null;
    }

    private final i3 getDeviceBody() throws IllegalStateException {
        return getDeviceBody$vungle_ads_release(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final bh.z0 getExtBody(boolean r8) {
        /*
            r7 = this;
            com.vungle.ads.internal.f0 r0 = com.vungle.ads.internal.f0.INSTANCE
            java.lang.String r0 = r0.getConfigExtension()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L17
            int r3 = r0.length()
            if (r3 != 0) goto L12
            r3 = r1
            goto L13
        L12:
            r3 = r2
        L13:
            if (r3 != r1) goto L17
            r3 = r1
            goto L18
        L17:
            r3 = r2
        L18:
            if (r3 == 0) goto L22
            eh.b r0 = r7.filePreferences
            java.lang.String r3 = "config_extension"
            java.lang.String r0 = r0.getString(r3)
        L22:
            r3 = 0
            if (r8 != 0) goto L27
        L25:
            r8 = r3
            goto L4b
        L27:
            com.vungle.ads.internal.signals.j r8 = r7.getSignalManager()     // Catch: java.lang.Exception -> L30
            java.lang.String r8 = r8.generateSignals()     // Catch: java.lang.Exception -> L30
            goto L4b
        L30:
            r8 = move-exception
            com.vungle.ads.internal.util.u r4 = com.vungle.ads.internal.util.v.Companion
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Couldn't convert signals for sending. Error: "
            r5.<init>(r6)
            java.lang.String r8 = r8.getMessage()
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            java.lang.String r5 = "VungleApiClient"
            r4.e(r5, r8)
            goto L25
        L4b:
            if (r0 == 0) goto L56
            int r4 = r0.length()
            if (r4 != 0) goto L54
            goto L56
        L54:
            r4 = r2
            goto L57
        L56:
            r4 = r1
        L57:
            if (r4 == 0) goto L66
            if (r8 == 0) goto L63
            int r4 = r8.length()
            if (r4 != 0) goto L62
            goto L63
        L62:
            r1 = r2
        L63:
            if (r1 == 0) goto L66
            return r3
        L66:
            bh.z0 r1 = new bh.z0
            r1.<init>(r0, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.network.y.getExtBody(boolean):bh.z0");
    }

    public static /* synthetic */ z0 getExtBody$default(y yVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return yVar.getExtBody(z10);
    }

    public static /* synthetic */ void getGzipApi$vungle_ads_release$annotations() {
    }

    private final String getPlacementID(s0 s0Var) {
        List<String> placements;
        try {
            Json json2 = json;
            String bodyToString = bodyToString(s0Var);
            KSerializer<Object> serializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(g1.class));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            c1 request = ((g1) json2.decodeFromString(serializer, bodyToString)).getRequest();
            if (request == null || (placements = request.getPlacements()) == null) {
                return "";
            }
            String str = placements.get(0);
            if (str == null) {
                return "";
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public static /* synthetic */ void getResponseInterceptor$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getRetryAfterDataMap$vungle_ads_release$annotations() {
    }

    private final com.vungle.ads.internal.signals.j getSignalManager() {
        return (com.vungle.ads.internal.signals.j) this.signalManager$delegate.getValue();
    }

    private final f1 getUserBody() {
        f1 f1Var = new f1((w0) null, (p0) null, (bh.s0) null, 7, (DefaultConstructorMarker) null);
        fh.c cVar = fh.c.INSTANCE;
        f1Var.setGdpr(new w0(cVar.getConsentStatus(), cVar.getConsentSource(), cVar.getConsentTimestamp(), cVar.getConsentMessageVersion()));
        f1Var.setCcpa(new p0(cVar.getCcpaStatus()));
        if (cVar.getCoppaStatus() != fh.a.COPPA_NOTSET) {
            f1Var.setCoppa(new bh.s0(cVar.getCoppaStatus().getValue()));
        }
        return f1Var;
    }

    private final void initUserAgentLazy() {
        g3 g3Var = new g3(com.vungle.ads.internal.protos.n.USER_AGENT_LOAD_DURATION_MS);
        g3Var.markStart();
        ((com.vungle.ads.internal.platform.b) this.platform).getUserAgentLazy(new t(g3Var, this));
    }

    public static /* synthetic */ g1 requestBody$default(y yVar, boolean z10, int i10, Object obj) throws IllegalStateException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return yVar.requestBody(z10);
    }

    /* renamed from: responseInterceptor$lambda-0 */
    public static final u0 m43responseInterceptor$lambda0(y this$0, e0 chain) {
        boolean z10;
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(chain, "chain");
        o0 o0Var = ((ci.f) chain).f2805e;
        try {
            try {
                u0 b3 = ((ci.f) chain).b(o0Var);
                String a = b3.f27218h.a("Retry-After");
                boolean z11 = true;
                if (a != null && a.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    try {
                        long parseLong = Long.parseLong(a);
                        if (parseLong > 0) {
                            String b10 = o0Var.a.b();
                            long currentTimeMillis = (parseLong * 1000) + System.currentTimeMillis();
                            endsWith$default = StringsKt__StringsJVMKt.endsWith$default(b10, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, false, 2, null);
                            if (endsWith$default) {
                                String placementID = this$0.getPlacementID(o0Var.f27153d);
                                if (placementID.length() <= 0) {
                                    z11 = false;
                                }
                                if (z11) {
                                    this$0.retryAfterDataMap.put(placementID, Long.valueOf(currentTimeMillis));
                                    return b3;
                                }
                                return b3;
                            }
                            return b3;
                        }
                        return b3;
                    } catch (Exception unused) {
                        com.vungle.ads.internal.util.v.Companion.d(TAG, "Retry-After value is not an valid value");
                        return b3;
                    }
                }
                return b3;
            } catch (Exception e2) {
                com.vungle.ads.internal.util.v.Companion.e(TAG, "Exception: " + e2.getMessage() + " for " + o0Var.a);
                return this$0.defaultErrorResponse(o0Var);
            }
        } catch (OutOfMemoryError unused2) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "OOM for " + o0Var.a);
            return this$0.defaultErrorResponse(o0Var);
        }
    }

    public final void addPlaySvcAvailabilityInCookie(boolean z10) {
        this.filePreferences.put("isPlaySvcAvailable", z10).apply();
    }

    public final boolean checkIsRetryAfterActive(String placementID) {
        long j3;
        Intrinsics.checkNotNullParameter(placementID, "placementID");
        Long l10 = this.retryAfterDataMap.get(placementID);
        if (l10 != null) {
            j3 = l10.longValue();
        } else {
            j3 = 0;
        }
        if (j3 > System.currentTimeMillis()) {
            return true;
        }
        this.retryAfterDataMap.remove(placementID);
        return false;
    }

    public final a config() throws IOException {
        boolean endsWith$default;
        d0 d0Var = this.appBody;
        if (d0Var == null) {
            return null;
        }
        g1 g1Var = new g1(getDeviceBody$vungle_ads_release(true), d0Var, getUserBody(), (z0) null, (c1) null, 24, (DefaultConstructorMarker) null);
        z0 extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            g1Var.setExt(extBody$default);
        }
        com.vungle.ads.internal.util.n nVar = com.vungle.ads.internal.util.n.INSTANCE;
        String str = BASE_URL;
        if (!nVar.isValidUrl(str)) {
            str = "https://config.ads.vungle.com/";
        }
        endsWith$default = StringsKt__StringsJVMKt.endsWith$default(str, "/", false, 2, null);
        if (!endsWith$default) {
            str = str + '/';
        }
        return this.api.config(headerUa, str + "config", g1Var);
    }

    public final d0 getAppBody$vungle_ads_release() {
        return this.appBody;
    }

    public final String getConnectionTypeDetail(int i10) {
        if (i10 == 1) {
            return "gprs";
        }
        if (i10 == 2) {
            return "edge";
        }
        if (i10 == 20) {
            return "5g";
        }
        switch (i10) {
            case 4:
                return "wcdma";
            case 5:
                return "cdma_evdo_0";
            case 6:
                return "cdma_evdo_a";
            case 7:
                return "cdma_1xrtt";
            case 8:
                return "hsdpa";
            case 9:
                return "hsupa";
            default:
                switch (i10) {
                    case 12:
                        return "cdma_evdo_b";
                    case 13:
                        return "lte";
                    case 14:
                        return "hrpd";
                    default:
                        return AppLovinMediationProvider.UNKNOWN;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4 A[Catch: all -> 0x01f7, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000d, B:8:0x0030, B:10:0x0038, B:11:0x0042, B:14:0x004c, B:16:0x0056, B:17:0x005d, B:18:0x005a, B:19:0x0061, B:22:0x006f, B:24:0x0074, B:26:0x0077, B:29:0x008b, B:31:0x0095, B:32:0x009e, B:34:0x00b8, B:39:0x00c4, B:40:0x00c9, B:42:0x00da, B:45:0x00eb, B:46:0x00f1, B:52:0x011e, B:54:0x013d, B:55:0x0140, B:57:0x0146, B:58:0x0149, B:61:0x0182, B:63:0x018f, B:64:0x01b4, B:67:0x01cd, B:69:0x01e2, B:70:0x01ed, B:75:0x01e8, B:76:0x019c, B:81:0x0101, B:92:0x009a, B:93:0x007f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da A[Catch: all -> 0x01f7, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000d, B:8:0x0030, B:10:0x0038, B:11:0x0042, B:14:0x004c, B:16:0x0056, B:17:0x005d, B:18:0x005a, B:19:0x0061, B:22:0x006f, B:24:0x0074, B:26:0x0077, B:29:0x008b, B:31:0x0095, B:32:0x009e, B:34:0x00b8, B:39:0x00c4, B:40:0x00c9, B:42:0x00da, B:45:0x00eb, B:46:0x00f1, B:52:0x011e, B:54:0x013d, B:55:0x0140, B:57:0x0146, B:58:0x0149, B:61:0x0182, B:63:0x018f, B:64:0x01b4, B:67:0x01cd, B:69:0x01e2, B:70:0x01ed, B:75:0x01e8, B:76:0x019c, B:81:0x0101, B:92:0x009a, B:93:0x007f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d A[Catch: all -> 0x01f7, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000d, B:8:0x0030, B:10:0x0038, B:11:0x0042, B:14:0x004c, B:16:0x0056, B:17:0x005d, B:18:0x005a, B:19:0x0061, B:22:0x006f, B:24:0x0074, B:26:0x0077, B:29:0x008b, B:31:0x0095, B:32:0x009e, B:34:0x00b8, B:39:0x00c4, B:40:0x00c9, B:42:0x00da, B:45:0x00eb, B:46:0x00f1, B:52:0x011e, B:54:0x013d, B:55:0x0140, B:57:0x0146, B:58:0x0149, B:61:0x0182, B:63:0x018f, B:64:0x01b4, B:67:0x01cd, B:69:0x01e2, B:70:0x01ed, B:75:0x01e8, B:76:0x019c, B:81:0x0101, B:92:0x009a, B:93:0x007f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146 A[Catch: all -> 0x01f7, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000d, B:8:0x0030, B:10:0x0038, B:11:0x0042, B:14:0x004c, B:16:0x0056, B:17:0x005d, B:18:0x005a, B:19:0x0061, B:22:0x006f, B:24:0x0074, B:26:0x0077, B:29:0x008b, B:31:0x0095, B:32:0x009e, B:34:0x00b8, B:39:0x00c4, B:40:0x00c9, B:42:0x00da, B:45:0x00eb, B:46:0x00f1, B:52:0x011e, B:54:0x013d, B:55:0x0140, B:57:0x0146, B:58:0x0149, B:61:0x0182, B:63:0x018f, B:64:0x01b4, B:67:0x01cd, B:69:0x01e2, B:70:0x01ed, B:75:0x01e8, B:76:0x019c, B:81:0x0101, B:92:0x009a, B:93:0x007f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018f A[Catch: all -> 0x01f7, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000d, B:8:0x0030, B:10:0x0038, B:11:0x0042, B:14:0x004c, B:16:0x0056, B:17:0x005d, B:18:0x005a, B:19:0x0061, B:22:0x006f, B:24:0x0074, B:26:0x0077, B:29:0x008b, B:31:0x0095, B:32:0x009e, B:34:0x00b8, B:39:0x00c4, B:40:0x00c9, B:42:0x00da, B:45:0x00eb, B:46:0x00f1, B:52:0x011e, B:54:0x013d, B:55:0x0140, B:57:0x0146, B:58:0x0149, B:61:0x0182, B:63:0x018f, B:64:0x01b4, B:67:0x01cd, B:69:0x01e2, B:70:0x01ed, B:75:0x01e8, B:76:0x019c, B:81:0x0101, B:92:0x009a, B:93:0x007f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e2 A[Catch: all -> 0x01f7, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000d, B:8:0x0030, B:10:0x0038, B:11:0x0042, B:14:0x004c, B:16:0x0056, B:17:0x005d, B:18:0x005a, B:19:0x0061, B:22:0x006f, B:24:0x0074, B:26:0x0077, B:29:0x008b, B:31:0x0095, B:32:0x009e, B:34:0x00b8, B:39:0x00c4, B:40:0x00c9, B:42:0x00da, B:45:0x00eb, B:46:0x00f1, B:52:0x011e, B:54:0x013d, B:55:0x0140, B:57:0x0146, B:58:0x0149, B:61:0x0182, B:63:0x018f, B:64:0x01b4, B:67:0x01cd, B:69:0x01e2, B:70:0x01ed, B:75:0x01e8, B:76:0x019c, B:81:0x0101, B:92:0x009a, B:93:0x007f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e8 A[Catch: all -> 0x01f7, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000d, B:8:0x0030, B:10:0x0038, B:11:0x0042, B:14:0x004c, B:16:0x0056, B:17:0x005d, B:18:0x005a, B:19:0x0061, B:22:0x006f, B:24:0x0074, B:26:0x0077, B:29:0x008b, B:31:0x0095, B:32:0x009e, B:34:0x00b8, B:39:0x00c4, B:40:0x00c9, B:42:0x00da, B:45:0x00eb, B:46:0x00f1, B:52:0x011e, B:54:0x013d, B:55:0x0140, B:57:0x0146, B:58:0x0149, B:61:0x0182, B:63:0x018f, B:64:0x01b4, B:67:0x01cd, B:69:0x01e2, B:70:0x01ed, B:75:0x01e8, B:76:0x019c, B:81:0x0101, B:92:0x009a, B:93:0x007f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019c A[Catch: all -> 0x01f7, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000d, B:8:0x0030, B:10:0x0038, B:11:0x0042, B:14:0x004c, B:16:0x0056, B:17:0x005d, B:18:0x005a, B:19:0x0061, B:22:0x006f, B:24:0x0074, B:26:0x0077, B:29:0x008b, B:31:0x0095, B:32:0x009e, B:34:0x00b8, B:39:0x00c4, B:40:0x00c9, B:42:0x00da, B:45:0x00eb, B:46:0x00f1, B:52:0x011e, B:54:0x013d, B:55:0x0140, B:57:0x0146, B:58:0x0149, B:61:0x0182, B:63:0x018f, B:64:0x01b4, B:67:0x01cd, B:69:0x01e2, B:70:0x01ed, B:75:0x01e8, B:76:0x019c, B:81:0x0101, B:92:0x009a, B:93:0x007f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized bh.i3 getDeviceBody$vungle_ads_release(boolean r15) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.network.y.getDeviceBody$vungle_ads_release(boolean):bh.i3");
    }

    public final VungleApi getGzipApi$vungle_ads_release() {
        return this.gzipApi;
    }

    public final Boolean getPlayServicesAvailabilityFromAPI() {
        boolean z10;
        Boolean bool = null;
        try {
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
            Intrinsics.checkNotNullExpressionValue(googleApiAvailabilityLight, "getInstance()");
            if (googleApiAvailabilityLight.isGooglePlayServicesAvailable(this.applicationContext) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            bool = Boolean.valueOf(z10);
            addPlaySvcAvailabilityInCookie(bool.booleanValue());
            return bool;
        } catch (Exception unused) {
            com.vungle.ads.internal.util.v.Companion.w(TAG, "Unexpected exception from Play services lib.");
            return bool;
        } catch (NoClassDefFoundError unused2) {
            com.vungle.ads.internal.util.v.Companion.w(TAG, "Play services Not available");
            Boolean bool2 = Boolean.FALSE;
            try {
                addPlaySvcAvailabilityInCookie(false);
                return bool2;
            } catch (Exception unused3) {
                com.vungle.ads.internal.util.v.Companion.w(TAG, "Failure to write GPS availability to DB");
                return bool2;
            }
        }
    }

    public final Boolean getPlayServicesAvailabilityFromCookie() {
        return this.filePreferences.getBoolean("isPlaySvcAvailable");
    }

    public final f0 getResponseInterceptor$vungle_ads_release() {
        return this.responseInterceptor;
    }

    public final Map<String, Long> getRetryAfterDataMap$vungle_ads_release() {
        return this.retryAfterDataMap;
    }

    public final long getRetryAfterHeaderValue(String placementID) {
        Intrinsics.checkNotNullParameter(placementID, "placementID");
        Long l10 = this.retryAfterDataMap.get(placementID);
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public final synchronized void initialize(String appId) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of2;
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.api.setAppId(appId);
        this.gzipApi.setAppId(appId);
        String str = "1.0";
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = this.applicationContext.getPackageManager();
                String packageName = this.applicationContext.getPackageName();
                of2 = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(packageName, of2);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n                    ap…      )\n                }");
            } else {
                packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n                    ap…      )\n                }");
            }
            String str2 = packageInfo.versionName;
            Intrinsics.checkNotNullExpressionValue(str2, "packageInfo.versionName");
            str = str2;
        } catch (Exception unused) {
        }
        this.baseDeviceInfo = getBasicDeviceBody(this.applicationContext);
        String packageName2 = this.applicationContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "applicationContext.packageName");
        this.appBody = new d0(packageName2, str, appId);
        this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
    }

    public final Boolean isGooglePlayServicesAvailable() {
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromCookie();
        }
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        }
        return this.isGooglePlayServicesAvailable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r0 = r0.raw();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r0 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        r3 = java.lang.Integer.valueOf(r0.f27216f);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.vungle.ads.internal.load.d pingTPAT(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.network.y.pingTPAT(java.lang.String):com.vungle.ads.internal.load.d");
    }

    public final void reportErrors(BlockingQueue<com.vungle.ads.internal.protos.d> errors, com.vungle.ads.o requestListener) {
        boolean z10;
        Intrinsics.checkNotNullParameter(errors, "errors");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        String errorLoggingEndpoint = com.vungle.ads.internal.f0.INSTANCE.getErrorLoggingEndpoint();
        if (errorLoggingEndpoint != null && errorLoggingEndpoint.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            requestListener.onFailure();
            return;
        }
        for (com.vungle.ads.internal.protos.d dVar : errors) {
            String connectionType = getConnectionType();
            if (connectionType != null) {
                dVar.setConnectionType(connectionType);
            }
            String connectionTypeDetail = getConnectionTypeDetail();
            if (connectionTypeDetail != null) {
                dVar.setConnectionTypeDetail(connectionTypeDetail);
                dVar.setConnectionTypeDetailAndroid(connectionTypeDetail);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<com.vungle.ads.internal.protos.d> it = errors.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().build());
        }
        Sdk$SDKErrorBatch sdk$SDKErrorBatch = (Sdk$SDKErrorBatch) Sdk$SDKErrorBatch.newBuilder().addAllErrors(arrayList).build();
        r0 r0Var = s0.Companion;
        byte[] byteArray = sdk$SDKErrorBatch.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "batch.toByteArray()");
        Pattern pattern = g0.f27059d;
        g0 E = wh.a0.E("application/x-protobuf");
        int length = sdk$SDKErrorBatch.toByteArray().length;
        r0Var.getClass();
        ((h) this.api.sendErrors(headerUa, errorLoggingEndpoint, r0.b(byteArray, E, 0, length))).enqueue(new u(requestListener));
    }

    public final void reportMetrics(BlockingQueue<com.vungle.ads.internal.protos.k> metrics, com.vungle.ads.o requestListener) {
        boolean z10;
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        String metricsEndpoint = com.vungle.ads.internal.f0.INSTANCE.getMetricsEndpoint();
        if (metricsEndpoint != null && metricsEndpoint.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            requestListener.onFailure();
            return;
        }
        for (com.vungle.ads.internal.protos.k kVar : metrics) {
            String connectionType = getConnectionType();
            if (connectionType != null) {
                kVar.setConnectionType(connectionType);
            }
            String connectionTypeDetail = getConnectionTypeDetail();
            if (connectionTypeDetail != null) {
                kVar.setConnectionTypeDetail(connectionTypeDetail);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<com.vungle.ads.internal.protos.k> it = metrics.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().build());
        }
        Sdk$MetricBatch sdk$MetricBatch = (Sdk$MetricBatch) Sdk$MetricBatch.newBuilder().addAllMetrics(arrayList).build();
        r0 r0Var = s0.Companion;
        Pattern pattern = g0.f27059d;
        g0 E = wh.a0.E("application/x-protobuf");
        byte[] byteArray = sdk$MetricBatch.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "batch.toByteArray()");
        ((h) this.api.sendMetrics(headerUa, metricsEndpoint, r0.c(r0Var, E, byteArray, 0, 12))).enqueue(new v(requestListener));
    }

    public final a requestAd(String placement, String str, boolean z10) throws IllegalStateException {
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(placement, "placement");
        String adsEndpoint = com.vungle.ads.internal.f0.INSTANCE.getAdsEndpoint();
        if (adsEndpoint != null && adsEndpoint.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return null;
        }
        g1 requestBody = requestBody(!r2.signalsDisabled());
        c1 c1Var = new c1(CollectionsKt.listOf(placement), Boolean.valueOf(z10), (String) null, (Long) null, (String) null, (String) null, (String) null, 124, (DefaultConstructorMarker) null);
        if (str != null && str.length() != 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z12) {
            c1Var.setAdSize(str);
        }
        requestBody.setRequest(c1Var);
        return this.gzipApi.ads(headerUa, adsEndpoint, requestBody);
    }

    public final g1 requestBody(boolean z10) throws IllegalStateException {
        g1 g1Var = new g1(getDeviceBody(), this.appBody, getUserBody(), (z0) null, (c1) null, 24, (DefaultConstructorMarker) null);
        z0 extBody = getExtBody(z10);
        if (extBody != null) {
            g1Var.setExt(extBody);
        }
        return g1Var;
    }

    public final a ri(c1 request) {
        boolean z10;
        d0 d0Var;
        Intrinsics.checkNotNullParameter(request, "request");
        String riEndpoint = com.vungle.ads.internal.f0.INSTANCE.getRiEndpoint();
        if (riEndpoint != null && riEndpoint.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 || (d0Var = this.appBody) == null) {
            return null;
        }
        g1 g1Var = new g1(getDeviceBody(), d0Var, getUserBody(), (z0) null, (c1) null, 24, (DefaultConstructorMarker) null);
        g1Var.setRequest(request);
        z0 extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            g1Var.setExt(extBody$default);
        }
        return this.api.ri(headerUa, riEndpoint, g1Var);
    }

    public final void sendAdMarkup(String adMarkup, String endpoint) {
        Intrinsics.checkNotNullParameter(adMarkup, "adMarkup");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        VungleApi vungleApi = this.api;
        r0 r0Var = s0.Companion;
        Pattern pattern = g0.f27059d;
        g0 E = wh.a0.E("application/json");
        r0Var.getClass();
        ((h) vungleApi.sendAdMarkup(endpoint, r0.a(adMarkup, E))).enqueue(new w());
    }

    public final void setAppBody$vungle_ads_release(d0 d0Var) {
        this.appBody = d0Var;
    }

    public final void setGzipApi$vungle_ads_release(VungleApi vungleApi) {
        Intrinsics.checkNotNullParameter(vungleApi, "<set-?>");
        this.gzipApi = vungleApi;
    }

    public final void setResponseInterceptor$vungle_ads_release(f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<set-?>");
        this.responseInterceptor = f0Var;
    }

    public final void setRetryAfterDataMap$vungle_ads_release(Map<String, Long> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.retryAfterDataMap = map;
    }

    public final String getConnectionTypeDetail() {
        if (com.bumptech.glide.e.k(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null ? getConnectionTypeDetail(activeNetworkInfo.getSubtype()) : AppLovinMediationProvider.UNKNOWN;
    }
}
