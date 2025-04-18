package com.applovin.impl.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import com.applovin.impl.aa;
import com.applovin.impl.b4;
import com.applovin.impl.ba;
import com.applovin.impl.bc;
import com.applovin.impl.kn;
import com.applovin.impl.l0;
import com.applovin.impl.oj;
import com.applovin.impl.qi;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.th;
import com.applovin.impl.tr;
import com.applovin.impl.xl;
import com.applovin.impl.xp;
import com.applovin.impl.y3;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import h.o0;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m {
    private final k a;

    /* renamed from: c */
    private final n f7770c;

    /* renamed from: e */
    private final Object f7772e = new Object();

    /* renamed from: g */
    private final Object f7774g = new Object();

    /* renamed from: b */
    private final Context f7769b = k.k();

    /* renamed from: d */
    private final Map f7771d = g();

    /* renamed from: f */
    private final Map f7773f = f();

    public m(k kVar) {
        this.a = kVar;
        this.f7770c = kVar.z();
    }

    public /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String h10 = h();
            if (StringUtils.isValidString(h10)) {
                this.a.L();
                if (t.a()) {
                    this.a.L().a("DataCollectorV2", "Successfully retrieved bid token");
                }
                bc.a(appLovinBidTokenCollectionListener, h10);
                return;
            }
            this.a.L();
            if (t.a()) {
                this.a.L().b("DataCollectorV2", "Empty bid token");
            }
            bc.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th2) {
            this.a.L();
            if (t.a()) {
                this.a.L().a("DataCollectorV2", "Failed to collect bid token", th2);
            }
            this.a.B().a("DataCollectorV2", "collectBidToken", th2);
            bc.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    private Map e() {
        if (!this.a.g0().isLocationCollectionEnabled() || !((Boolean) this.a.a(oj.I4)).booleanValue()) {
            return null;
        }
        HashMap hashMap = new HashMap(4);
        s K = this.a.K();
        boolean e2 = K.e();
        CollectionUtils.putBooleanIfValid("loc_services_enabled", Boolean.valueOf(e2), hashMap);
        if (!e2) {
            return hashMap;
        }
        CollectionUtils.putBooleanIfValid("loc_auth", Boolean.valueOf(K.c()), hashMap);
        if (!this.a.K().d()) {
            return hashMap;
        }
        double a = K.a();
        k kVar = this.a;
        oj ojVar = oj.K4;
        CollectionUtils.putStringIfValid("loc_lat", zp.a(a, ((Integer) kVar.a(ojVar)).intValue()), hashMap);
        CollectionUtils.putStringIfValid("loc_long", zp.a(K.b(), ((Integer) this.a.a(ojVar)).intValue()), hashMap);
        return hashMap;
    }

    private Map f() {
        HashMap hashMap = new HashMap(22);
        CollectionUtils.putStringIfValid("app_name", this.f7770c.g().e(), hashMap);
        CollectionUtils.putStringIfValid("app_version", this.f7770c.g().h(), hashMap);
        CollectionUtils.putStringIfValid(CampaignEx.JSON_KEY_PACKAGE_NAME, this.f7770c.g().f(), hashMap);
        CollectionUtils.putStringIfValid("vz", this.f7770c.g().j(), hashMap);
        CollectionUtils.putStringIfValid("installer_name", this.f7770c.g().d(), hashMap);
        CollectionUtils.putIntegerIfValid("app_version_code", Integer.valueOf(this.f7770c.g().i()), hashMap);
        CollectionUtils.putIntegerIfValid("target_sdk", Integer.valueOf(this.f7770c.g().g()), hashMap);
        CollectionUtils.putLongIfValid("first_install_v3_ms", this.f7770c.g().a(), hashMap);
        CollectionUtils.putLongIfValid("ia", Long.valueOf(this.f7770c.g().b()), hashMap);
        CollectionUtils.putLongIfValid("ia_v2", this.f7770c.g().c(), hashMap);
        CollectionUtils.putStringIfValid("tg", xp.a(this.a), hashMap);
        CollectionUtils.putStringIfValid("sdk_version", AppLovinSdk.VERSION, hashMap);
        CollectionUtils.putStringIfValid("omid_sdk_version", this.a.Y().c(), hashMap);
        CollectionUtils.putStringIfValid("ad_review_sdk_version", com.applovin.impl.v.b(), hashMap);
        CollectionUtils.putStringIfValid("api_did", (String) this.a.a(oj.f6656g), hashMap);
        CollectionUtils.putBooleanIfValid("debug", Boolean.valueOf(zp.c(this.a)), hashMap);
        CollectionUtils.putBooleanIfValid("j8", Boolean.valueOf(k.B0()), hashMap);
        CollectionUtils.putIntegerIfValid("epv", Integer.valueOf(zp.f()), hashMap);
        CollectionUtils.putLongIfValid("alts_ms", Long.valueOf(k.j()), hashMap);
        CollectionUtils.putBooleanIfValid("ps_tpg", Boolean.valueOf(th.d(this.f7769b)), hashMap);
        CollectionUtils.putBooleanIfValid("ps_apg", Boolean.valueOf(th.b(this.f7769b)), hashMap);
        CollectionUtils.putBooleanIfValid("ps_capg", Boolean.valueOf(th.c(this.f7769b)), hashMap);
        CollectionUtils.putBooleanIfValid("ps_aipg", Boolean.valueOf(th.a(this.f7769b)), hashMap);
        return hashMap;
    }

    private Map g() {
        String str;
        HashMap hashMap = new HashMap(36);
        CollectionUtils.putStringIfValid("kb", this.f7770c.p(), hashMap);
        CollectionUtils.putBooleanIfValid("gy", Boolean.valueOf(this.f7770c.E()), hashMap);
        CollectionUtils.putDoubleIfValid("tz_offset", Double.valueOf(this.f7770c.z()), hashMap);
        CollectionUtils.putLongIfValid("tm", Long.valueOf(this.f7770c.q().c()), hashMap);
        CollectionUtils.putLongIfValid("tds", Long.valueOf(this.f7770c.A()), hashMap);
        CollectionUtils.putStringIfValid("country_code", this.f7770c.y().b(), hashMap);
        CollectionUtils.putStringIfValid("carrier", this.f7770c.y().a(), hashMap);
        CollectionUtils.putStringIfValid("mcc", this.f7770c.y().d(), hashMap);
        CollectionUtils.putStringIfValid("mnc", this.f7770c.y().e(), hashMap);
        CollectionUtils.putIntegerIfValid("adnsd", Integer.valueOf(this.f7770c.m().b()), hashMap);
        CollectionUtils.putIntegerIfValid("dx", Integer.valueOf(this.f7770c.m().c()), hashMap);
        CollectionUtils.putIntegerIfValid("dy", Integer.valueOf(this.f7770c.m().d()), hashMap);
        CollectionUtils.putFloatIfValid("adns", Float.valueOf(this.f7770c.m().a()), hashMap);
        CollectionUtils.putFloatIfValid("xdpi", Float.valueOf(this.f7770c.m().g()), hashMap);
        CollectionUtils.putFloatIfValid("ydpi", Float.valueOf(this.f7770c.m().h()), hashMap);
        CollectionUtils.putDoubleIfValid("screen_size_in", Double.valueOf(this.f7770c.m().f()), hashMap);
        CollectionUtils.putBooleanIfValid("hdr", this.f7770c.m().e(), hashMap);
        CollectionUtils.putStringIfValid("orientation_lock", this.f7770c.t(), hashMap);
        CollectionUtils.putIntegerIfValid("api_level", Integer.valueOf(Build.VERSION.SDK_INT), hashMap);
        CollectionUtils.putStringIfValid("brand", Build.MANUFACTURER, hashMap);
        CollectionUtils.putStringIfValid("brand_name", Build.BRAND, hashMap);
        CollectionUtils.putStringIfValid("hardware", Build.HARDWARE, hashMap);
        CollectionUtils.putStringIfValid("locale", Locale.getDefault().toString(), hashMap);
        CollectionUtils.putStringIfValid("model", Build.MODEL, hashMap);
        CollectionUtils.putStringIfValid("os", Build.VERSION.RELEASE, hashMap);
        CollectionUtils.putStringIfValid("revision", Build.DEVICE, hashMap);
        if (AppLovinSdkUtils.isFireOS(this.f7769b)) {
            str = "fireos";
        } else {
            str = "android";
        }
        CollectionUtils.putStringIfValid("platform", str, hashMap);
        CollectionUtils.putBooleanIfValid("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()), hashMap);
        CollectionUtils.putBooleanIfValid("aida", Boolean.valueOf(l0.a()), hashMap);
        CollectionUtils.putBooleanIfValid("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f7769b)), hashMap);
        CollectionUtils.putBooleanIfValid("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f7769b)), hashMap);
        CollectionUtils.putLongIfValid("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()), hashMap);
        CollectionUtils.putLongIfValid("tbalsi_ms", Long.valueOf(this.a.J() - k.j()), hashMap);
        CollectionUtils.putIntegerIfValid("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()), hashMap);
        CollectionUtils.putJsonArrayIfValid("supported_abis", this.f7770c.x(), hashMap);
        CollectionUtils.putBooleanIfValid("psase", Boolean.valueOf(th.e(this.f7769b)), hashMap);
        CollectionUtils.putStringIfValid("process_name", zp.b(this.f7769b), hashMap);
        CollectionUtils.putBooleanIfValid("is_main_process", zp.g(this.f7769b), hashMap);
        try {
            PackageInfo packageInfo = this.f7769b.getPackageManager().getPackageInfo("com.android.vending", 0);
            CollectionUtils.putStringIfValid("ps_version", packageInfo.versionName, hashMap);
            CollectionUtils.putIntegerIfValid("ps_version_code", Integer.valueOf(packageInfo.versionCode), hashMap);
        } catch (Throwable unused) {
            CollectionUtils.putStringIfValid("ps_version", "", hashMap);
            CollectionUtils.putIntegerIfValid("ps_version_code", -1, hashMap);
        }
        a(hashMap);
        return hashMap;
    }

    private Map i() {
        return zp.a(a(null, true, false));
    }

    public Map c() {
        b4.d a = this.a.r().a();
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("lrm_ts_ms", String.valueOf(a.c()));
        hashMap.put("lrm_url", a.d());
        hashMap.put("lrm_ct_ms", String.valueOf(a.a()));
        hashMap.put("lrm_rs", String.valueOf(a.b()));
        return hashMap;
    }

    public Map d() {
        return a(false);
    }

    public String h() {
        String encodeToString = Base64.encodeToString(new JSONObject(i()).toString().getBytes(Charset.defaultCharset()), 2);
        if (((Boolean) this.a.a(oj.f6701l5)).booleanValue()) {
            return qi.b(encodeToString, zp.a(this.a), qi.a.a(((Integer) this.a.a(oj.f6709m5)).intValue()), this.a.d0(), this.a);
        }
        return encodeToString;
    }

    public Map j() {
        return this.f7773f;
    }

    public Map k() {
        return this.f7771d;
    }

    public void l() {
        synchronized (this.f7772e) {
            a(this.f7771d);
        }
    }

    public void a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.a.l0().a((xl) new kn(this.a, ((Boolean) this.a.a(oj.V3)).booleanValue(), "DataCollectorV2", new o0(19, this, appLovinBidTokenCollectionListener)), sm.b.CORE);
    }

    public Map a(Map map, boolean z10, boolean z11) {
        HashMap hashMap;
        Map a = a(z10);
        Map b3 = b();
        Map c10 = c();
        Map e2 = e();
        Map k02 = this.a.k0();
        Map a10 = a();
        if (z11) {
            hashMap = new HashMap(a10.size() + 19);
            hashMap.put("device_info", a);
            hashMap.put("app_info", b3);
            if (c10 != null) {
                hashMap.put("connection_info", c10);
            }
            if (map != null) {
                hashMap.put("ad_info", map);
            }
            if (e2 != null) {
                hashMap.put("location_info", e2);
            }
            if (k02 != null) {
                hashMap.put("targeting_data", k02);
            }
        } else {
            hashMap = new HashMap(a10.size() + b3.size() + a.size() + 14 + (map != null ? map.size() : 0) + (e2 != null ? e2.size() : 0) + (k02 != null ? k02.size() : 0));
            hashMap.putAll(a);
            hashMap.putAll(b3);
            if (c10 != null) {
                hashMap.putAll(c10);
            }
            if (map != null) {
                hashMap.putAll(map);
            }
            if (e2 != null) {
                hashMap.putAll(e2);
            }
            if (k02 != null && !k02.isEmpty()) {
                hashMap.putAll(k02);
            }
        }
        hashMap.putAll(a10);
        hashMap.put("accept", "custom_size,launch_app,video");
        hashMap.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.a.Q(), hashMap);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.a.A(), hashMap);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.a.a(oj.U3), hashMap);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.a.o0()), hashMap);
        CollectionUtils.putStringIfValid("rid", UUID.randomUUID().toString(), hashMap);
        if (!((Boolean) this.a.a(oj.f6685j5)).booleanValue()) {
            CollectionUtils.putStringIfValid(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.a.d0(), hashMap);
        }
        if (((Boolean) this.a.a(oj.L4)).booleanValue()) {
            ba F = this.a.F();
            CollectionUtils.putLongIfValid("li", Long.valueOf(F.b(aa.f3615e)), hashMap);
            CollectionUtils.putLongIfValid("si", Long.valueOf(F.b(aa.f3618h)), hashMap);
            CollectionUtils.putLongIfValid("mad", Long.valueOf(F.b(aa.f3616f)), hashMap);
            CollectionUtils.putLongIfValid("msad", Long.valueOf(F.b(aa.f3619i)), hashMap);
            CollectionUtils.putLongIfValid("pf", Long.valueOf(F.b(aa.f3623m)), hashMap);
            CollectionUtils.putLongIfValid("mpf", Long.valueOf(F.b(aa.f3630t)), hashMap);
            CollectionUtils.putLongIfValid("gpf", Long.valueOf(F.b(aa.f3624n)), hashMap);
            CollectionUtils.putLongIfValid("asoac", Long.valueOf(F.b(aa.f3628r)), hashMap);
        }
        return hashMap;
    }

    public Map b() {
        Map map;
        synchronized (this.f7774g) {
            map = CollectionUtils.map(this.f7773f);
        }
        CollectionUtils.putBooleanIfValid("first_install", Boolean.valueOf(this.a.z0()), map);
        CollectionUtils.putBooleanIfValid("first_install_v2", Boolean.valueOf(!this.a.w0()), map);
        CollectionUtils.putBooleanIfValid("test_ads", Boolean.valueOf(this.f7770c.G()), map);
        CollectionUtils.putBooleanIfValid("muted", Boolean.valueOf(this.a.g0().isMuted()), map);
        if (this.a.r0() != null) {
            CollectionUtils.putStringIfValid("user_segment_name", this.a.r0().getName(), map);
        }
        CollectionUtils.putIntegerIfValid("IABTCF_gdprApplies", this.a.m0().g(), map);
        CollectionUtils.putStringIfValid("IABTCF_TCString", this.a.m0().k(), map);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.a.m0().c(), map);
        if (((Boolean) this.a.a(oj.K3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.a.t0().c(), map);
        }
        if (((Boolean) this.a.a(oj.N3)).booleanValue()) {
            CollectionUtils.putStringIfValid("compass_random_token", this.a.p(), map);
        }
        if (((Boolean) this.a.a(oj.P3)).booleanValue()) {
            CollectionUtils.putStringIfValid("applovin_random_token", this.a.c0(), map);
        }
        if (this.a.b0() != null) {
            CollectionUtils.putJsonArrayIfValid("ps_topics", this.a.b0().a(), map);
        }
        return map;
    }

    public Map a(boolean z10) {
        Map map;
        l0.a d10;
        synchronized (this.f7772e) {
            map = CollectionUtils.map(this.f7771d);
        }
        if (z10) {
            d10 = this.f7770c.f();
            if (d10 != null) {
                this.f7770c.J();
            } else if (zp.h()) {
                d10 = new l0.a();
                map.put("inc", Boolean.TRUE);
            } else {
                d10 = this.f7770c.d();
            }
        } else {
            d10 = this.f7770c.d();
        }
        CollectionUtils.putBooleanIfValid("huc", y3.b().b(this.f7769b), map);
        CollectionUtils.putBooleanIfValid("aru", y3.c().b(this.f7769b), map);
        CollectionUtils.putBooleanIfValid("dns", y3.a().b(this.f7769b), map);
        CollectionUtils.putBooleanIfValid("dnt", Boolean.valueOf(d10.c()), map);
        CollectionUtils.putStringIfValid("dnt_code", d10.b().b(), map);
        CollectionUtils.putStringIfValid("idfa", d10.a(), map);
        n.c h10 = this.f7770c.h();
        if (h10 != null) {
            CollectionUtils.putStringIfValid("idfv", h10.a(), map);
            CollectionUtils.putIntegerIfValid("idfv_scope", Integer.valueOf(h10.b()), map);
        }
        CollectionUtils.putIntegerIfValid("volume", z10 ? this.f7770c.B() : this.f7770c.i().a(), map);
        CollectionUtils.putIntegerIfValid("lpm", this.f7770c.v().a(), map);
        CollectionUtils.putIntegerIfValid("sb", this.f7770c.w(), map);
        CollectionUtils.putIntegerIfValid("mute_switch", Integer.valueOf(this.f7770c.i().b()), map);
        CollectionUtils.putLongIfValid("fs", this.f7770c.o(), map);
        CollectionUtils.putStringIfValid("network", this.f7770c.r(), map);
        CollectionUtils.putBooleanIfValid("ma", this.f7770c.i().d(), map);
        CollectionUtils.putBooleanIfValid("spo", this.f7770c.i().e(), map);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.a.f0().isApplicationPaused()), map);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.a.f0().getAppEnteredForegroundTimeMillis()), map);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.a.f0().getAppEnteredBackgroundTimeMillis()), map);
        if (((Boolean) this.a.a(oj.Z3)).booleanValue()) {
            CollectionUtils.putLongIfValid("fm", this.f7770c.q().a(), map);
            CollectionUtils.putLongIfValid("lmt", this.f7770c.q().b(), map);
            CollectionUtils.putBooleanIfValid("lm", this.f7770c.q().d(), map);
        }
        if (((Boolean) this.a.a(oj.f6617a4)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("rat", this.f7770c.y().c(), map);
        }
        if (((Boolean) this.a.a(oj.X3)).booleanValue()) {
            CollectionUtils.putStringIfValid("so", this.f7770c.i().c(), map);
        }
        if (((Boolean) this.a.a(oj.f6623b4)).booleanValue()) {
            CollectionUtils.putBooleanIfValid("vs", Boolean.valueOf(this.f7770c.H()), map);
        }
        if (((Boolean) this.a.a(oj.f6700l4)).booleanValue()) {
            CollectionUtils.putFloatIfValid("da", this.f7770c.k(), map);
        }
        if (((Boolean) this.a.a(oj.f6708m4)).booleanValue()) {
            CollectionUtils.putFloatIfValid("dm", this.f7770c.l(), map);
        }
        if (((Boolean) this.a.a(oj.W3)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("act", this.f7770c.j().b(), map);
            CollectionUtils.putIntegerIfValid("acm", this.f7770c.j().a(), map);
            CollectionUtils.putBooleanIfValid("sowpie", this.f7770c.j().c(), map);
        }
        if (((Boolean) this.a.a(oj.f6669h4)).booleanValue()) {
            CollectionUtils.putBooleanIfValid("adr", Boolean.valueOf(this.f7770c.D()), map);
        }
        if (((Boolean) this.a.a(oj.f6645e4)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("mtl", Integer.valueOf(this.a.f0().getLastTrimMemoryLevel()), map);
        }
        if (((Boolean) this.a.a(oj.f6692k4)).booleanValue() && zp.d(this.a)) {
            tr.a(this.a);
            CollectionUtils.putStringIfValid("ua", tr.a(), map);
        }
        if (((Boolean) this.a.a(oj.f6791x4)).booleanValue()) {
            tr.b(this.a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(tr.d()), map);
            CollectionUtils.putStringIfValid("wvv", tr.c(), map);
            CollectionUtils.putStringIfValid("wvpn", tr.b(), map);
        }
        ArrayService l10 = this.a.l();
        if (l10.isAppHubInstalled()) {
            if (l10.getIsDirectDownloadEnabled() != null) {
                CollectionUtils.putBooleanIfValid("ah_dd_enabled", l10.getIsDirectDownloadEnabled(), map);
            }
            CollectionUtils.putLongIfValid("ah_sdk_version_code", Long.valueOf(l10.getAppHubVersionCode()), map);
            CollectionUtils.putStringIfValid("ah_random_user_token", StringUtils.emptyIfNull(l10.getRandomUserToken()), map);
            CollectionUtils.putStringIfValid("ah_sdk_package_name", StringUtils.emptyIfNull(l10.getAppHubPackageName()), map);
        }
        return map;
    }

    private void a(Map map) {
        if (((Boolean) this.a.a(oj.f6692k4)).booleanValue() && zp.d(this.a)) {
            tr.a(this.a);
        }
        if (((Boolean) this.a.a(oj.f6791x4)).booleanValue()) {
            tr.b(this.a);
        }
        if (((Boolean) this.a.a(oj.f6631c4)).booleanValue() && !map.containsKey("af")) {
            CollectionUtils.putLongIfValid("af", Long.valueOf(this.f7770c.e()), map);
        }
        if (((Boolean) this.a.a(oj.f6639d4)).booleanValue() && !map.containsKey("font")) {
            CollectionUtils.putFloatIfValid("font", Float.valueOf(this.f7770c.n()), map);
        }
        if (((Boolean) this.a.a(oj.f6684j4)).booleanValue() && !map.containsKey("sua")) {
            CollectionUtils.putStringIfValid("sua", System.getProperty("http.agent"), map);
        }
        if (((Boolean) this.a.a(oj.f6653f4)).booleanValue() && !map.containsKey("network_restricted")) {
            CollectionUtils.putBooleanIfValid("network_restricted", Boolean.valueOf(this.f7770c.F()), map);
        }
        if (((Boolean) this.a.a(oj.f6716n4)).booleanValue()) {
            CollectionUtils.putBooleanIfValid("is_pc", Boolean.valueOf(this.f7770c.C()), map);
        }
        if (((Boolean) this.a.a(oj.f6806z4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", this.f7770c.s(), map);
        }
    }

    public Map a() {
        HashMap hashMap = new HashMap(5);
        CollectionUtils.putStringIfValid("sc", (String) this.a.a(oj.f6735q), hashMap);
        CollectionUtils.putStringIfValid("sc2", (String) this.a.a(oj.f6743r), hashMap);
        CollectionUtils.putStringIfValid("sc3", (String) this.a.a(oj.f6750s), hashMap);
        CollectionUtils.putStringIfValid("server_installed_at", (String) this.a.a(oj.f6757t), hashMap);
        CollectionUtils.putStringIfValid("persisted_data", (String) this.a.a(qj.H), hashMap);
        return hashMap;
    }
}
