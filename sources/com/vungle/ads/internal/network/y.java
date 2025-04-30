package com.vungle.ads.internal.network;

import a.AbstractC0325a;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import c7.C0615A;
import c7.C0617a0;
import c7.C0623d0;
import c7.C0629g0;
import c7.C0631h0;
import c7.D;
import c7.P;
import c7.T;
import c7.X;
import c7.Y0;
import c7.i1;
import c7.j1;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.vungle.ads.InterfaceC2130o;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.VungleAds$WrapperFramework;
import com.vungle.ads.f1;
import com.vungle.ads.h1;
import com.vungle.ads.internal.F;
import com.vungle.ads.internal.protos.Sdk$MetricBatch;
import com.vungle.ads.internal.protos.Sdk$SDKErrorBatch;
import f7.C2275b;
import g7.C2309c;
import g7.EnumC2307a;
import i8.C;
import i8.G;
import i8.I;
import i8.L;
import i8.M;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;

/* loaded from: classes3.dex */
public final class y {
    private static final String BASE_URL;
    public static final o Companion;
    private static final String MANUFACTURER_AMAZON = "Amazon";
    private static final String TAG = "VungleApiClient";
    private static VungleAds$WrapperFramework WRAPPER_FRAMEWORK_SELECTED;
    private static String headerUa;
    private static final f8.b json;
    private static final Set<i8.w> logInterceptors;
    private static final Set<i8.w> networkInterceptors;
    private VungleApi api;
    private D appBody;
    private String appSetId;
    private final Context applicationContext;
    private j1 baseDeviceInfo;
    private final C2275b filePreferences;
    private VungleApi gzipApi;
    private Boolean isGooglePlayServicesAvailable;
    private final com.vungle.ads.internal.platform.d platform;
    private i8.w responseInterceptor;
    private Map<String, Long> retryAfterDataMap;
    private final InterfaceC2717f signalManager$delegate;
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
        json = R2.b.a(n.INSTANCE);
    }

    public y(Context context, com.vungle.ads.internal.platform.d dVar, C2275b c2275b) {
        G7.j.e(context, "applicationContext");
        G7.j.e(dVar, "platform");
        G7.j.e(c2275b, "filePreferences");
        this.applicationContext = context;
        this.platform = dVar;
        this.filePreferences = c2275b;
        this.uaString = System.getProperty("http.agent");
        this.appSetId = "";
        ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
        this.signalManager$delegate = AbstractC2712a.c(EnumC2718g.b, new x(context));
        this.retryAfterDataMap = new ConcurrentHashMap();
        this.responseInterceptor = new i8.w() { // from class: com.vungle.ads.internal.network.m
            @Override // i8.w
            public final I intercept(i8.v vVar) {
                I m63responseInterceptor$lambda0;
                m63responseInterceptor$lambda0 = y.m63responseInterceptor$lambda0(y.this, (n8.f) vVar);
                return m63responseInterceptor$lambda0;
            }
        };
        i8.y yVar = new i8.y();
        i8.w wVar = this.responseInterceptor;
        G7.j.e(wVar, "interceptor");
        ArrayList arrayList = yVar.f20897c;
        arrayList.add(wVar);
        s sVar = new s();
        if (!sVar.equals(yVar.m)) {
            yVar.f20915w = null;
        }
        yVar.m = sVar;
        i8.z zVar = new i8.z(yVar);
        arrayList.add(new r());
        i8.z zVar2 = new i8.z(yVar);
        this.api = new B(zVar);
        this.gzipApi = new B(zVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, w8.g, w8.f] */
    private final String bodyToString(G g9) {
        try {
            ?? obj = new Object();
            if (g9 == 0) {
                return "";
            }
            g9.writeTo(obj);
            return obj.readUtf8();
        } catch (Exception unused) {
            return "";
        }
    }

    private final I defaultErrorResponse(C c9) {
        J1.k kVar = new J1.k(3);
        G7.j.e(c9, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        i8.A a6 = i8.A.HTTP_1_1;
        L l = M.Companion;
        Pattern pattern = i8.x.f20893c;
        i8.x u8 = r8.k.u("application/json; charset=utf-8");
        l.getClass();
        return new I(c9, a6, "Server is busy", 500, null, kVar.e(), L.a("{\"Error\":\"Server is busy\"}", u8), null, null, null, 0L, 0L, null);
    }

    public static /* synthetic */ void getAppBody$vungle_ads_release$annotations() {
    }

    private final j1 getBasicDeviceBody(Context context) {
        String str;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        G7.j.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        String str2 = Build.MANUFACTURER;
        G7.j.d(str2, "MANUFACTURER");
        String str3 = Build.MODEL;
        G7.j.d(str3, "MODEL");
        String str4 = Build.VERSION.RELEASE;
        G7.j.d(str4, "RELEASE");
        String carrierName$vungle_ads_release = com.vungle.ads.internal.platform.b.Companion.getCarrierName$vungle_ads_release(context);
        if ("Amazon".equals(str2)) {
            str = "amazon";
        } else {
            str = "android";
        }
        j1 j1Var = new j1(str2, str3, str4, carrierName$vungle_ads_release, str, displayMetrics.widthPixels, displayMetrics.heightPixels, this.uaString, (String) null, (Integer) null, (c7.f1) null, 1792, (G7.f) null);
        try {
            String userAgent = ((com.vungle.ads.internal.platform.b) this.platform).getUserAgent();
            this.uaString = userAgent;
            j1Var.setUa(userAgent);
            initUserAgentLazy();
        } catch (Exception e4) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Cannot Get UserAgent. Setting Default Device UserAgent." + e4.getLocalizedMessage());
        }
        return j1Var;
    }

    private final String getConnectionType() {
        if (z2.i.a(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            Object systemService = this.applicationContext.getSystemService("connectivity");
            G7.j.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
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

    private final j1 getDeviceBody() throws IllegalStateException {
        return getDeviceBody$vungle_ads_release(false);
    }

    private final C0617a0 getExtBody(boolean z8) {
        String generateSignals;
        String configExtension = F.INSTANCE.getConfigExtension();
        if (configExtension != null && configExtension.length() == 0) {
            configExtension = this.filePreferences.getString("config_extension");
        }
        if (z8) {
            try {
                generateSignals = getSignalManager().generateSignals();
            } catch (Exception e4) {
                com.vungle.ads.internal.util.v.Companion.e(TAG, "Couldn't convert signals for sending. Error: " + e4.getMessage());
            }
            if ((configExtension != null || configExtension.length() == 0) && (generateSignals == null || generateSignals.length() == 0)) {
                return null;
            }
            return new C0617a0(configExtension, generateSignals);
        }
        generateSignals = null;
        if (configExtension != null) {
        }
        return null;
    }

    public static /* synthetic */ C0617a0 getExtBody$default(y yVar, boolean z8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z8 = false;
        }
        return yVar.getExtBody(z8);
    }

    public static /* synthetic */ void getGzipApi$vungle_ads_release$annotations() {
    }

    private final String getPlacementID(G g9) {
        List<String> placements;
        try {
            f8.b bVar = json;
            C0623d0 request = ((C0631h0) bVar.a(AbstractC0325a.q(bVar.b, G7.s.b(C0631h0.class)), bodyToString(g9))).getRequest();
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

    private final C0629g0 getUserBody() {
        C0629g0 c0629g0 = new C0629g0((X) null, (P) null, (T) null, 7, (G7.f) null);
        C2309c c2309c = C2309c.INSTANCE;
        c0629g0.setGdpr(new X(c2309c.getConsentStatus(), c2309c.getConsentSource(), c2309c.getConsentTimestamp(), c2309c.getConsentMessageVersion()));
        c0629g0.setCcpa(new P(c2309c.getCcpaStatus()));
        if (c2309c.getCoppaStatus() != EnumC2307a.COPPA_NOTSET) {
            c0629g0.setCoppa(new T(c2309c.getCoppaStatus().getValue()));
        }
        return c0629g0;
    }

    private final void initUserAgentLazy() {
        h1 h1Var = new h1(com.vungle.ads.internal.protos.n.USER_AGENT_LOAD_DURATION_MS);
        h1Var.markStart();
        ((com.vungle.ads.internal.platform.b) this.platform).getUserAgentLazy(new t(h1Var, this));
    }

    public static /* synthetic */ C0631h0 requestBody$default(y yVar, boolean z8, int i9, Object obj) throws IllegalStateException {
        if ((i9 & 1) != 0) {
            z8 = false;
        }
        return yVar.requestBody(z8);
    }

    /* renamed from: responseInterceptor$lambda-0 */
    public static final I m63responseInterceptor$lambda0(y yVar, i8.v vVar) {
        G7.j.e(yVar, "this$0");
        G7.j.e(vVar, "chain");
        C c9 = ((n8.f) vVar).f21866e;
        try {
            try {
                I b = ((n8.f) vVar).b(c9);
                String b8 = b.f20778h.b("Retry-After");
                if (b8 != null && b8.length() != 0) {
                    try {
                        long parseLong = Long.parseLong(b8);
                        if (parseLong > 0) {
                            String b9 = c9.f20754a.b();
                            long currentTimeMillis = (parseLong * 1000) + System.currentTimeMillis();
                            if (b9.endsWith(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                                String placementID = yVar.getPlacementID(c9.f20756d);
                                if (placementID.length() > 0) {
                                    yVar.retryAfterDataMap.put(placementID, Long.valueOf(currentTimeMillis));
                                    return b;
                                }
                                return b;
                            }
                            return b;
                        }
                        return b;
                    } catch (Exception unused) {
                        com.vungle.ads.internal.util.v.Companion.d(TAG, "Retry-After value is not an valid value");
                        return b;
                    }
                }
                return b;
            } catch (OutOfMemoryError unused2) {
                com.vungle.ads.internal.util.v.Companion.e(TAG, "OOM for " + c9.f20754a);
                return yVar.defaultErrorResponse(c9);
            }
        } catch (Exception e4) {
            com.vungle.ads.internal.util.v.Companion.e(TAG, "Exception: " + e4.getMessage() + " for " + c9.f20754a);
            return yVar.defaultErrorResponse(c9);
        }
    }

    public final void addPlaySvcAvailabilityInCookie(boolean z8) {
        this.filePreferences.put("isPlaySvcAvailable", z8).apply();
    }

    public final boolean checkIsRetryAfterActive(String str) {
        long j7;
        G7.j.e(str, "placementID");
        Long l = this.retryAfterDataMap.get(str);
        if (l != null) {
            j7 = l.longValue();
        } else {
            j7 = 0;
        }
        if (j7 > System.currentTimeMillis()) {
            return true;
        }
        this.retryAfterDataMap.remove(str);
        return false;
    }

    public final InterfaceC2099a config() throws IOException {
        D d2 = this.appBody;
        if (d2 == null) {
            return null;
        }
        C0631h0 c0631h0 = new C0631h0(getDeviceBody$vungle_ads_release(true), d2, getUserBody(), (C0617a0) null, (C0623d0) null, 24, (G7.f) null);
        C0617a0 extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            c0631h0.setExt(extBody$default);
        }
        com.vungle.ads.internal.util.n nVar = com.vungle.ads.internal.util.n.INSTANCE;
        String str = BASE_URL;
        if (!nVar.isValidUrl(str)) {
            str = "https://config.ads.vungle.com/";
        }
        if (!O7.o.x(str, "/")) {
            str = str.concat("/");
        }
        return this.api.config(headerUa, str + "config", c0631h0);
    }

    public final D getAppBody$vungle_ads_release() {
        return this.appBody;
    }

    public final String getConnectionTypeDetail(int i9) {
        if (i9 == 1) {
            return "gprs";
        }
        if (i9 == 2) {
            return "edge";
        }
        if (i9 != 20) {
            switch (i9) {
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
                    switch (i9) {
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
        return "5g";
    }

    public final synchronized j1 getDeviceBody$vungle_ads_release(boolean z8) throws IllegalStateException {
        j1 copy$default;
        String str;
        Boolean bool;
        int i9;
        String str2;
        i1 i1Var;
        String str3;
        try {
            j1 j1Var = this.baseDeviceInfo;
            if (j1Var == null) {
                j1Var = getBasicDeviceBody(this.applicationContext);
                this.baseDeviceInfo = j1Var;
            }
            copy$default = j1.copy$default(j1Var, null, null, null, null, null, 0, 0, null, null, null, null, 2047, null);
            Y0 y02 = new Y0(null, null, 3, null);
            C0615A advertisingInfo = ((com.vungle.ads.internal.platform.b) this.platform).getAdvertisingInfo();
            if (advertisingInfo != null) {
                str = advertisingInfo.getAdvertisingId();
            } else {
                str = null;
            }
            if (advertisingInfo != null) {
                bool = Boolean.valueOf(advertisingInfo.getLimitAdTracking());
            } else {
                bool = null;
            }
            C2309c c2309c = C2309c.INSTANCE;
            if (c2309c.shouldSendAdIds()) {
                if (str != null) {
                    if ("Amazon".equals(Build.MANUFACTURER)) {
                        y02.setAmazonAdvertisingId(str);
                    } else {
                        y02.setGaid(str);
                    }
                    copy$default.setIfa(str);
                } else {
                    String androidId = ((com.vungle.ads.internal.platform.b) this.platform).getAndroidId();
                    if (androidId == null) {
                        str3 = "";
                    } else {
                        str3 = androidId;
                    }
                    copy$default.setIfa(str3);
                    if (androidId != null) {
                        y02.setAndroidId(androidId);
                    }
                }
            }
            if (!c2309c.shouldSendAdIds() || z8) {
                copy$default.setIfa(null);
                y02.setAndroidId(null);
                y02.setGaid(null);
                y02.setAmazonAdvertisingId(null);
            }
            Boolean bool2 = Boolean.TRUE;
            boolean z9 = false;
            if (G7.j.a(bool, bool2)) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            copy$default.setLmt(i9);
            y02.setGooglePlayServicesAvailable(bool2.equals(isGooglePlayServicesAvailable()));
            String appSetId = ((com.vungle.ads.internal.platform.b) this.platform).getAppSetId();
            this.appSetId = appSetId;
            if (appSetId != null && appSetId.length() != 0) {
                y02.setAppSetId(this.appSetId);
            }
            Intent registerReceiver = this.applicationContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra > 0 && intExtra2 > 0) {
                    y02.setBatteryLevel(intExtra / intExtra2);
                }
                int intExtra3 = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
                if (intExtra3 != -1) {
                    if (intExtra3 != 2 && intExtra3 != 5) {
                        str2 = "NOT_CHARGING";
                    } else {
                        int intExtra4 = registerReceiver.getIntExtra("plugged", -1);
                        if (intExtra4 != 1) {
                            if (intExtra4 != 2) {
                                if (intExtra4 != 4) {
                                    str2 = "BATTERY_PLUGGED_OTHERS";
                                } else {
                                    str2 = "BATTERY_PLUGGED_WIRELESS";
                                }
                            } else {
                                str2 = "BATTERY_PLUGGED_USB";
                            }
                        } else {
                            str2 = "BATTERY_PLUGGED_AC";
                        }
                    }
                } else {
                    str2 = "UNKNOWN";
                }
            } else {
                str2 = "UNKNOWN";
            }
            y02.setBatteryState(str2);
            Object systemService = this.applicationContext.getSystemService("power");
            G7.j.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            y02.setBatterySaverEnabled(((PowerManager) systemService).isPowerSaveMode() ? 1 : 0);
            String connectionType = getConnectionType();
            if (connectionType != null) {
                y02.setConnectionType(connectionType);
            }
            String connectionTypeDetail = getConnectionTypeDetail();
            if (connectionTypeDetail != null) {
                y02.setConnectionTypeDetail(connectionTypeDetail);
            }
            y02.setLocale(Locale.getDefault().toString());
            y02.setLanguage(Locale.getDefault().getLanguage());
            y02.setTimeZone(TimeZone.getDefault().getID());
            y02.setVolumeLevel(((com.vungle.ads.internal.platform.b) this.platform).getVolumeLevel());
            y02.setSoundEnabled(((com.vungle.ads.internal.platform.b) this.platform).isSoundEnabled() ? 1 : 0);
            String str4 = Build.MANUFACTURER;
            if ("Amazon".equals(str4)) {
                z9 = this.applicationContext.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
            } else {
                Object systemService2 = this.applicationContext.getSystemService("uimode");
                G7.j.c(systemService2, "null cannot be cast to non-null type android.app.UiModeManager");
                if (((UiModeManager) systemService2).getCurrentModeType() == 4) {
                    z9 = true;
                }
            }
            y02.setTv(z9);
            y02.setSideloadEnabled(((com.vungle.ads.internal.platform.b) this.platform).isSideLoaded());
            y02.setSdCardAvailable(((com.vungle.ads.internal.platform.b) this.platform).isSdCardPresent() ? 1 : 0);
            y02.setOsName(Build.FINGERPRINT);
            copy$default.setUa(this.uaString);
            if ("Amazon".equals(str4)) {
                i1Var = new i1((Y0) null, y02, 1, (G7.f) null);
            } else {
                i1Var = new i1(y02, (Y0) null, 2, (G7.f) null);
            }
            copy$default.setExt(new c7.f1(i1Var));
        } catch (Throwable th) {
            throw th;
        }
        return copy$default;
    }

    public final VungleApi getGzipApi$vungle_ads_release() {
        return this.gzipApi;
    }

    public final Boolean getPlayServicesAvailabilityFromAPI() {
        boolean z8;
        Boolean bool = null;
        try {
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
            G7.j.d(googleApiAvailabilityLight, "getInstance()");
            if (googleApiAvailabilityLight.isGooglePlayServicesAvailable(this.applicationContext) == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            bool = Boolean.valueOf(z8);
            addPlaySvcAvailabilityInCookie(z8);
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

    public final i8.w getResponseInterceptor$vungle_ads_release() {
        return this.responseInterceptor;
    }

    public final Map<String, Long> getRetryAfterDataMap$vungle_ads_release() {
        return this.retryAfterDataMap;
    }

    public final long getRetryAfterHeaderValue(String str) {
        G7.j.e(str, "placementID");
        Long l = this.retryAfterDataMap.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final synchronized void initialize(String str) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        try {
            G7.j.e(str, "appId");
            this.api.setAppId(str);
            this.gzipApi.setAppId(str);
            String str2 = "1.0";
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    PackageManager packageManager = this.applicationContext.getPackageManager();
                    String packageName = this.applicationContext.getPackageName();
                    of = PackageManager.PackageInfoFlags.of(0L);
                    packageInfo = packageManager.getPackageInfo(packageName, of);
                    G7.j.d(packageInfo, "{\n                    ap…      )\n                }");
                } else {
                    packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), 0);
                    G7.j.d(packageInfo, "{\n                    ap…      )\n                }");
                }
                String str3 = packageInfo.versionName;
                G7.j.d(str3, "packageInfo.versionName");
                str2 = str3;
            } catch (Exception unused) {
            }
            this.baseDeviceInfo = getBasicDeviceBody(this.applicationContext);
            String packageName2 = this.applicationContext.getPackageName();
            G7.j.d(packageName2, "applicationContext.packageName");
            this.appBody = new D(packageName2, str2, str);
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        } catch (Throwable th) {
            throw th;
        }
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

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        r11 = r11.raw();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r11 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        r1 = java.lang.Integer.valueOf(r11.f20776f);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.vungle.ads.internal.load.d pingTPAT(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.network.y.pingTPAT(java.lang.String):com.vungle.ads.internal.load.d");
    }

    public final void reportErrors(BlockingQueue<com.vungle.ads.internal.protos.d> blockingQueue, InterfaceC2130o interfaceC2130o) {
        G7.j.e(blockingQueue, "errors");
        G7.j.e(interfaceC2130o, "requestListener");
        String errorLoggingEndpoint = F.INSTANCE.getErrorLoggingEndpoint();
        if (errorLoggingEndpoint != null && errorLoggingEndpoint.length() != 0) {
            for (com.vungle.ads.internal.protos.d dVar : blockingQueue) {
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
            Iterator<com.vungle.ads.internal.protos.d> it = blockingQueue.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().build());
            }
            Sdk$SDKErrorBatch sdk$SDKErrorBatch = (Sdk$SDKErrorBatch) Sdk$SDKErrorBatch.newBuilder().addAllErrors(arrayList).build();
            i8.F f9 = G.Companion;
            byte[] byteArray = sdk$SDKErrorBatch.toByteArray();
            G7.j.d(byteArray, "batch.toByteArray()");
            Pattern pattern = i8.x.f20893c;
            i8.x u8 = r8.k.u("application/x-protobuf");
            int length = sdk$SDKErrorBatch.toByteArray().length;
            f9.getClass();
            ((h) this.api.sendErrors(headerUa, errorLoggingEndpoint, i8.F.a(u8, byteArray, 0, length))).enqueue(new u(interfaceC2130o));
            return;
        }
        interfaceC2130o.onFailure();
    }

    public final void reportMetrics(BlockingQueue<com.vungle.ads.internal.protos.k> blockingQueue, InterfaceC2130o interfaceC2130o) {
        G7.j.e(blockingQueue, "metrics");
        G7.j.e(interfaceC2130o, "requestListener");
        String metricsEndpoint = F.INSTANCE.getMetricsEndpoint();
        if (metricsEndpoint != null && metricsEndpoint.length() != 0) {
            for (com.vungle.ads.internal.protos.k kVar : blockingQueue) {
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
            Iterator<com.vungle.ads.internal.protos.k> it = blockingQueue.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().build());
            }
            Sdk$MetricBatch sdk$MetricBatch = (Sdk$MetricBatch) Sdk$MetricBatch.newBuilder().addAllMetrics(arrayList).build();
            i8.F f9 = G.Companion;
            Pattern pattern = i8.x.f20893c;
            i8.x u8 = r8.k.u("application/x-protobuf");
            byte[] byteArray = sdk$MetricBatch.toByteArray();
            G7.j.d(byteArray, "batch.toByteArray()");
            ((h) this.api.sendMetrics(headerUa, metricsEndpoint, i8.F.c(f9, u8, byteArray, 0, 12))).enqueue(new v(interfaceC2130o));
            return;
        }
        interfaceC2130o.onFailure();
    }

    public final InterfaceC2099a requestAd(String str, String str2, boolean z8) throws IllegalStateException {
        G7.j.e(str, "placement");
        String adsEndpoint = F.INSTANCE.getAdsEndpoint();
        if (adsEndpoint != null && adsEndpoint.length() != 0) {
            C0631h0 requestBody = requestBody(!r2.signalsDisabled());
            C0623d0 c0623d0 = new C0623d0(android.support.v4.media.session.a.w(str), Boolean.valueOf(z8), (String) null, (Long) null, (String) null, (String) null, (String) null, 124, (G7.f) null);
            if (str2 != null && str2.length() != 0) {
                c0623d0.setAdSize(str2);
            }
            requestBody.setRequest(c0623d0);
            return this.gzipApi.ads(headerUa, adsEndpoint, requestBody);
        }
        return null;
    }

    public final C0631h0 requestBody(boolean z8) throws IllegalStateException {
        C0631h0 c0631h0 = new C0631h0(getDeviceBody(), this.appBody, getUserBody(), (C0617a0) null, (C0623d0) null, 24, (G7.f) null);
        C0617a0 extBody = getExtBody(z8);
        if (extBody != null) {
            c0631h0.setExt(extBody);
        }
        return c0631h0;
    }

    public final InterfaceC2099a ri(C0623d0 c0623d0) {
        D d2;
        G7.j.e(c0623d0, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        String riEndpoint = F.INSTANCE.getRiEndpoint();
        if (riEndpoint == null || riEndpoint.length() == 0 || (d2 = this.appBody) == null) {
            return null;
        }
        C0631h0 c0631h0 = new C0631h0(getDeviceBody(), d2, getUserBody(), (C0617a0) null, (C0623d0) null, 24, (G7.f) null);
        c0631h0.setRequest(c0623d0);
        C0617a0 extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            c0631h0.setExt(extBody$default);
        }
        return this.api.ri(headerUa, riEndpoint, c0631h0);
    }

    public final void sendAdMarkup(String str, String str2) {
        G7.j.e(str, "adMarkup");
        G7.j.e(str2, "endpoint");
        VungleApi vungleApi = this.api;
        i8.F f9 = G.Companion;
        Pattern pattern = i8.x.f20893c;
        i8.x u8 = r8.k.u("application/json");
        f9.getClass();
        ((h) vungleApi.sendAdMarkup(str2, i8.F.b(str, u8))).enqueue(new w());
    }

    public final void setAppBody$vungle_ads_release(D d2) {
        this.appBody = d2;
    }

    public final void setGzipApi$vungle_ads_release(VungleApi vungleApi) {
        G7.j.e(vungleApi, "<set-?>");
        this.gzipApi = vungleApi;
    }

    public final void setResponseInterceptor$vungle_ads_release(i8.w wVar) {
        G7.j.e(wVar, "<set-?>");
        this.responseInterceptor = wVar;
    }

    public final void setRetryAfterDataMap$vungle_ads_release(Map<String, Long> map) {
        G7.j.e(map, "<set-?>");
        this.retryAfterDataMap = map;
    }

    public final String getConnectionTypeDetail() {
        if (z2.i.a(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        G7.j.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return getConnectionTypeDetail(activeNetworkInfo.getSubtype());
        }
        return AppLovinMediationProvider.UNKNOWN;
    }
}
