package com.applovin.impl.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import com.applovin.impl.AbstractC0719l0;
import com.applovin.impl.C0765v;
import com.applovin.impl.aa;
import com.applovin.impl.b4;
import com.applovin.impl.ba;
import com.applovin.impl.bc;
import com.applovin.impl.kn;
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
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a */
    private final k f10929a;

    /* renamed from: c */
    private final n f10930c;

    /* renamed from: e */
    private final Object f10932e = new Object();

    /* renamed from: g */
    private final Object f10934g = new Object();
    private final Context b = k.k();

    /* renamed from: d */
    private final Map f10931d = g();

    /* renamed from: f */
    private final Map f10933f = f();

    public m(k kVar) {
        this.f10929a = kVar;
        this.f10930c = kVar.z();
    }

    public /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String h6 = h();
            if (StringUtils.isValidString(h6)) {
                this.f10929a.L();
                if (t.a()) {
                    this.f10929a.L().a("DataCollectorV2", "Successfully retrieved bid token");
                }
                bc.a(appLovinBidTokenCollectionListener, h6);
                return;
            }
            this.f10929a.L();
            if (t.a()) {
                this.f10929a.L().b("DataCollectorV2", "Empty bid token");
            }
            bc.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th) {
            this.f10929a.L();
            if (t.a()) {
                this.f10929a.L().a("DataCollectorV2", "Failed to collect bid token", th);
            }
            this.f10929a.B().a("DataCollectorV2", "collectBidToken", th);
            bc.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    private Map e() {
        if (!this.f10929a.g0().isLocationCollectionEnabled() || !((Boolean) this.f10929a.a(oj.f9609I4)).booleanValue()) {
            return null;
        }
        HashMap hashMap = new HashMap(4);
        s K5 = this.f10929a.K();
        boolean e4 = K5.e();
        CollectionUtils.putBooleanIfValid("loc_services_enabled", Boolean.valueOf(e4), hashMap);
        if (!e4) {
            return hashMap;
        }
        CollectionUtils.putBooleanIfValid("loc_auth", Boolean.valueOf(K5.c()), hashMap);
        if (!this.f10929a.K().d()) {
            return hashMap;
        }
        double a6 = K5.a();
        k kVar = this.f10929a;
        oj ojVar = oj.f9621K4;
        CollectionUtils.putStringIfValid("loc_lat", zp.a(a6, ((Integer) kVar.a(ojVar)).intValue()), hashMap);
        CollectionUtils.putStringIfValid("loc_long", zp.a(K5.b(), ((Integer) this.f10929a.a(ojVar)).intValue()), hashMap);
        return hashMap;
    }

    private Map f() {
        HashMap hashMap = new HashMap(22);
        CollectionUtils.putStringIfValid("app_name", this.f10930c.g().e(), hashMap);
        CollectionUtils.putStringIfValid("app_version", this.f10930c.g().h(), hashMap);
        CollectionUtils.putStringIfValid(CampaignEx.JSON_KEY_PACKAGE_NAME, this.f10930c.g().f(), hashMap);
        CollectionUtils.putStringIfValid("vz", this.f10930c.g().j(), hashMap);
        CollectionUtils.putStringIfValid("installer_name", this.f10930c.g().d(), hashMap);
        CollectionUtils.putIntegerIfValid("app_version_code", Integer.valueOf(this.f10930c.g().i()), hashMap);
        CollectionUtils.putIntegerIfValid("target_sdk", Integer.valueOf(this.f10930c.g().g()), hashMap);
        CollectionUtils.putLongIfValid("first_install_v3_ms", this.f10930c.g().a(), hashMap);
        CollectionUtils.putLongIfValid("ia", Long.valueOf(this.f10930c.g().b()), hashMap);
        CollectionUtils.putLongIfValid("ia_v2", this.f10930c.g().c(), hashMap);
        CollectionUtils.putStringIfValid("tg", xp.a(this.f10929a), hashMap);
        CollectionUtils.putStringIfValid("sdk_version", AppLovinSdk.VERSION, hashMap);
        CollectionUtils.putStringIfValid("omid_sdk_version", this.f10929a.Y().c(), hashMap);
        CollectionUtils.putStringIfValid("ad_review_sdk_version", C0765v.b(), hashMap);
        CollectionUtils.putStringIfValid("api_did", (String) this.f10929a.a(oj.f9762g), hashMap);
        CollectionUtils.putBooleanIfValid("debug", Boolean.valueOf(zp.c(this.f10929a)), hashMap);
        CollectionUtils.putBooleanIfValid("j8", Boolean.valueOf(k.B0()), hashMap);
        CollectionUtils.putIntegerIfValid("epv", Integer.valueOf(zp.f()), hashMap);
        CollectionUtils.putLongIfValid("alts_ms", Long.valueOf(k.j()), hashMap);
        CollectionUtils.putBooleanIfValid("ps_tpg", Boolean.valueOf(th.d(this.b)), hashMap);
        CollectionUtils.putBooleanIfValid("ps_apg", Boolean.valueOf(th.b(this.b)), hashMap);
        CollectionUtils.putBooleanIfValid("ps_capg", Boolean.valueOf(th.c(this.b)), hashMap);
        CollectionUtils.putBooleanIfValid("ps_aipg", Boolean.valueOf(th.a(this.b)), hashMap);
        return hashMap;
    }

    private Map g() {
        String str;
        HashMap hashMap = new HashMap(36);
        CollectionUtils.putStringIfValid("kb", this.f10930c.p(), hashMap);
        CollectionUtils.putBooleanIfValid("gy", Boolean.valueOf(this.f10930c.E()), hashMap);
        CollectionUtils.putDoubleIfValid("tz_offset", Double.valueOf(this.f10930c.z()), hashMap);
        CollectionUtils.putLongIfValid("tm", Long.valueOf(this.f10930c.q().c()), hashMap);
        CollectionUtils.putLongIfValid("tds", Long.valueOf(this.f10930c.A()), hashMap);
        CollectionUtils.putStringIfValid("country_code", this.f10930c.y().b(), hashMap);
        CollectionUtils.putStringIfValid("carrier", this.f10930c.y().a(), hashMap);
        CollectionUtils.putStringIfValid("mcc", this.f10930c.y().d(), hashMap);
        CollectionUtils.putStringIfValid("mnc", this.f10930c.y().e(), hashMap);
        CollectionUtils.putIntegerIfValid("adnsd", Integer.valueOf(this.f10930c.m().b()), hashMap);
        CollectionUtils.putIntegerIfValid("dx", Integer.valueOf(this.f10930c.m().c()), hashMap);
        CollectionUtils.putIntegerIfValid("dy", Integer.valueOf(this.f10930c.m().d()), hashMap);
        CollectionUtils.putFloatIfValid("adns", Float.valueOf(this.f10930c.m().a()), hashMap);
        CollectionUtils.putFloatIfValid("xdpi", Float.valueOf(this.f10930c.m().g()), hashMap);
        CollectionUtils.putFloatIfValid("ydpi", Float.valueOf(this.f10930c.m().h()), hashMap);
        CollectionUtils.putDoubleIfValid("screen_size_in", Double.valueOf(this.f10930c.m().f()), hashMap);
        CollectionUtils.putBooleanIfValid("hdr", this.f10930c.m().e(), hashMap);
        CollectionUtils.putStringIfValid("orientation_lock", this.f10930c.t(), hashMap);
        CollectionUtils.putIntegerIfValid("api_level", Integer.valueOf(Build.VERSION.SDK_INT), hashMap);
        CollectionUtils.putStringIfValid("brand", Build.MANUFACTURER, hashMap);
        CollectionUtils.putStringIfValid("brand_name", Build.BRAND, hashMap);
        CollectionUtils.putStringIfValid("hardware", Build.HARDWARE, hashMap);
        CollectionUtils.putStringIfValid("locale", Locale.getDefault().toString(), hashMap);
        CollectionUtils.putStringIfValid("model", Build.MODEL, hashMap);
        CollectionUtils.putStringIfValid("os", Build.VERSION.RELEASE, hashMap);
        CollectionUtils.putStringIfValid("revision", Build.DEVICE, hashMap);
        if (AppLovinSdkUtils.isFireOS(this.b)) {
            str = "fireos";
        } else {
            str = "android";
        }
        CollectionUtils.putStringIfValid("platform", str, hashMap);
        CollectionUtils.putBooleanIfValid("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()), hashMap);
        CollectionUtils.putBooleanIfValid("aida", Boolean.valueOf(AbstractC0719l0.a()), hashMap);
        CollectionUtils.putBooleanIfValid("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.b)), hashMap);
        CollectionUtils.putBooleanIfValid("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.b)), hashMap);
        CollectionUtils.putLongIfValid("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()), hashMap);
        CollectionUtils.putLongIfValid("tbalsi_ms", Long.valueOf(this.f10929a.J() - k.j()), hashMap);
        CollectionUtils.putIntegerIfValid("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()), hashMap);
        CollectionUtils.putJsonArrayIfValid("supported_abis", this.f10930c.x(), hashMap);
        CollectionUtils.putBooleanIfValid("psase", Boolean.valueOf(th.e(this.b)), hashMap);
        CollectionUtils.putStringIfValid("process_name", zp.b(this.b), hashMap);
        CollectionUtils.putBooleanIfValid("is_main_process", zp.g(this.b), hashMap);
        try {
            PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo("com.android.vending", 0);
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
        b4.d a6 = this.f10929a.r().a();
        if (a6 == null) {
            return null;
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("lrm_ts_ms", String.valueOf(a6.c()));
        hashMap.put("lrm_url", a6.d());
        hashMap.put("lrm_ct_ms", String.valueOf(a6.a()));
        hashMap.put("lrm_rs", String.valueOf(a6.b()));
        return hashMap;
    }

    public Map d() {
        return a(false);
    }

    public String h() {
        String encodeToString = Base64.encodeToString(new JSONObject(i()).toString().getBytes(Charset.defaultCharset()), 2);
        if (((Boolean) this.f10929a.a(oj.f9802l5)).booleanValue()) {
            return qi.b(encodeToString, zp.a(this.f10929a), qi.a.a(((Integer) this.f10929a.a(oj.f9807m5)).intValue()), this.f10929a.d0(), this.f10929a);
        }
        return encodeToString;
    }

    public Map j() {
        return this.f10933f;
    }

    public Map k() {
        return this.f10931d;
    }

    public void l() {
        synchronized (this.f10932e) {
            a(this.f10931d);
        }
    }

    public void a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f10929a.l0().a((xl) new kn(this.f10929a, ((Boolean) this.f10929a.a(oj.f9692V3)).booleanValue(), "DataCollectorV2", new A4.d(18, this, appLovinBidTokenCollectionListener)), sm.b.CORE);
    }

    public Map a(Map map, boolean z8, boolean z9) {
        HashMap hashMap;
        Map a6 = a(z8);
        Map b = b();
        Map c9 = c();
        Map e4 = e();
        Map k02 = this.f10929a.k0();
        Map a9 = a();
        if (z9) {
            hashMap = new HashMap(a9.size() + 19);
            hashMap.put("device_info", a6);
            hashMap.put("app_info", b);
            if (c9 != null) {
                hashMap.put("connection_info", c9);
            }
            if (map != null) {
                hashMap.put("ad_info", map);
            }
            if (e4 != null) {
                hashMap.put("location_info", e4);
            }
            if (k02 != null) {
                hashMap.put("targeting_data", k02);
            }
        } else {
            hashMap = new HashMap(a9.size() + b.size() + a6.size() + 14 + (map != null ? map.size() : 0) + (e4 != null ? e4.size() : 0) + (k02 != null ? k02.size() : 0));
            hashMap.putAll(a6);
            hashMap.putAll(b);
            if (c9 != null) {
                hashMap.putAll(c9);
            }
            if (map != null) {
                hashMap.putAll(map);
            }
            if (e4 != null) {
                hashMap.putAll(e4);
            }
            if (k02 != null && !k02.isEmpty()) {
                hashMap.putAll(k02);
            }
        }
        hashMap.putAll(a9);
        hashMap.put("accept", "custom_size,launch_app,video");
        hashMap.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f10929a.Q(), hashMap);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f10929a.A(), hashMap);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f10929a.a(oj.f9685U3), hashMap);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f10929a.o0()), hashMap);
        CollectionUtils.putStringIfValid("rid", UUID.randomUUID().toString(), hashMap);
        if (!((Boolean) this.f10929a.a(oj.f9790j5)).booleanValue()) {
            CollectionUtils.putStringIfValid(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f10929a.d0(), hashMap);
        }
        if (((Boolean) this.f10929a.a(oj.f9627L4)).booleanValue()) {
            ba F4 = this.f10929a.F();
            CollectionUtils.putLongIfValid("li", Long.valueOf(F4.b(aa.f6597e)), hashMap);
            CollectionUtils.putLongIfValid("si", Long.valueOf(F4.b(aa.f6600h)), hashMap);
            CollectionUtils.putLongIfValid("mad", Long.valueOf(F4.b(aa.f6598f)), hashMap);
            CollectionUtils.putLongIfValid("msad", Long.valueOf(F4.b(aa.f6601i)), hashMap);
            CollectionUtils.putLongIfValid("pf", Long.valueOf(F4.b(aa.m)), hashMap);
            CollectionUtils.putLongIfValid("mpf", Long.valueOf(F4.b(aa.f6610t)), hashMap);
            CollectionUtils.putLongIfValid("gpf", Long.valueOf(F4.b(aa.f6604n)), hashMap);
            CollectionUtils.putLongIfValid("asoac", Long.valueOf(F4.b(aa.f6608r)), hashMap);
        }
        return hashMap;
    }

    public Map b() {
        Map map;
        synchronized (this.f10934g) {
            map = CollectionUtils.map(this.f10933f);
        }
        CollectionUtils.putBooleanIfValid("first_install", Boolean.valueOf(this.f10929a.z0()), map);
        CollectionUtils.putBooleanIfValid("first_install_v2", Boolean.valueOf(!this.f10929a.w0()), map);
        CollectionUtils.putBooleanIfValid("test_ads", Boolean.valueOf(this.f10930c.G()), map);
        CollectionUtils.putBooleanIfValid("muted", Boolean.valueOf(this.f10929a.g0().isMuted()), map);
        if (this.f10929a.r0() != null) {
            CollectionUtils.putStringIfValid("user_segment_name", this.f10929a.r0().getName(), map);
        }
        CollectionUtils.putIntegerIfValid("IABTCF_gdprApplies", this.f10929a.m0().g(), map);
        CollectionUtils.putStringIfValid("IABTCF_TCString", this.f10929a.m0().k(), map);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.f10929a.m0().c(), map);
        if (((Boolean) this.f10929a.a(oj.f9620K3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f10929a.t0().c(), map);
        }
        if (((Boolean) this.f10929a.a(oj.f9640N3)).booleanValue()) {
            CollectionUtils.putStringIfValid("compass_random_token", this.f10929a.p(), map);
        }
        if (((Boolean) this.f10929a.a(oj.f9652P3)).booleanValue()) {
            CollectionUtils.putStringIfValid("applovin_random_token", this.f10929a.c0(), map);
        }
        if (this.f10929a.b0() != null) {
            CollectionUtils.putJsonArrayIfValid("ps_topics", this.f10929a.b0().a(), map);
        }
        return map;
    }

    public Map a(boolean z8) {
        Map map;
        AbstractC0719l0.a d2;
        synchronized (this.f10932e) {
            map = CollectionUtils.map(this.f10931d);
        }
        if (z8) {
            d2 = this.f10930c.f();
            if (d2 != null) {
                this.f10930c.J();
            } else if (zp.h()) {
                d2 = new AbstractC0719l0.a();
                map.put("inc", Boolean.TRUE);
            } else {
                d2 = this.f10930c.d();
            }
        } else {
            d2 = this.f10930c.d();
        }
        CollectionUtils.putBooleanIfValid("huc", y3.b().b(this.b), map);
        CollectionUtils.putBooleanIfValid("aru", y3.c().b(this.b), map);
        CollectionUtils.putBooleanIfValid("dns", y3.a().b(this.b), map);
        CollectionUtils.putBooleanIfValid("dnt", Boolean.valueOf(d2.c()), map);
        CollectionUtils.putStringIfValid("dnt_code", d2.b().b(), map);
        CollectionUtils.putStringIfValid("idfa", d2.a(), map);
        n.c h6 = this.f10930c.h();
        if (h6 != null) {
            CollectionUtils.putStringIfValid("idfv", h6.a(), map);
            CollectionUtils.putIntegerIfValid("idfv_scope", Integer.valueOf(h6.b()), map);
        }
        CollectionUtils.putIntegerIfValid("volume", z8 ? this.f10930c.B() : this.f10930c.i().a(), map);
        CollectionUtils.putIntegerIfValid("lpm", this.f10930c.v().a(), map);
        CollectionUtils.putIntegerIfValid("sb", this.f10930c.w(), map);
        CollectionUtils.putIntegerIfValid("mute_switch", Integer.valueOf(this.f10930c.i().b()), map);
        CollectionUtils.putLongIfValid("fs", this.f10930c.o(), map);
        CollectionUtils.putStringIfValid("network", this.f10930c.r(), map);
        CollectionUtils.putBooleanIfValid("ma", this.f10930c.i().d(), map);
        CollectionUtils.putBooleanIfValid("spo", this.f10930c.i().e(), map);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.f10929a.f0().isApplicationPaused()), map);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.f10929a.f0().getAppEnteredForegroundTimeMillis()), map);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.f10929a.f0().getAppEnteredBackgroundTimeMillis()), map);
        if (((Boolean) this.f10929a.a(oj.f9718Z3)).booleanValue()) {
            CollectionUtils.putLongIfValid("fm", this.f10930c.q().a(), map);
            CollectionUtils.putLongIfValid("lmt", this.f10930c.q().b(), map);
            CollectionUtils.putBooleanIfValid("lm", this.f10930c.q().d(), map);
        }
        if (((Boolean) this.f10929a.a(oj.f9725a4)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("rat", this.f10930c.y().c(), map);
        }
        if (((Boolean) this.f10929a.a(oj.f9705X3)).booleanValue()) {
            CollectionUtils.putStringIfValid("so", this.f10930c.i().c(), map);
        }
        if (((Boolean) this.f10929a.a(oj.f9731b4)).booleanValue()) {
            CollectionUtils.putBooleanIfValid("vs", Boolean.valueOf(this.f10930c.H()), map);
        }
        if (((Boolean) this.f10929a.a(oj.f9801l4)).booleanValue()) {
            CollectionUtils.putFloatIfValid("da", this.f10930c.k(), map);
        }
        if (((Boolean) this.f10929a.a(oj.f9806m4)).booleanValue()) {
            CollectionUtils.putFloatIfValid("dm", this.f10930c.l(), map);
        }
        if (((Boolean) this.f10929a.a(oj.f9698W3)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("act", this.f10930c.j().b(), map);
            CollectionUtils.putIntegerIfValid("acm", this.f10930c.j().a(), map);
            CollectionUtils.putBooleanIfValid("sowpie", this.f10930c.j().c(), map);
        }
        if (((Boolean) this.f10929a.a(oj.f9774h4)).booleanValue()) {
            CollectionUtils.putBooleanIfValid("adr", Boolean.valueOf(this.f10930c.D()), map);
        }
        if (((Boolean) this.f10929a.a(oj.e4)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("mtl", Integer.valueOf(this.f10929a.f0().getLastTrimMemoryLevel()), map);
        }
        if (((Boolean) this.f10929a.a(oj.f9797k4)).booleanValue() && zp.d(this.f10929a)) {
            tr.a(this.f10929a);
            CollectionUtils.putStringIfValid("ua", tr.a(), map);
        }
        if (((Boolean) this.f10929a.a(oj.f9884x4)).booleanValue()) {
            tr.b(this.f10929a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(tr.d()), map);
            CollectionUtils.putStringIfValid("wvv", tr.c(), map);
            CollectionUtils.putStringIfValid("wvpn", tr.b(), map);
        }
        ArrayService l = this.f10929a.l();
        if (l.isAppHubInstalled()) {
            if (l.getIsDirectDownloadEnabled() != null) {
                CollectionUtils.putBooleanIfValid("ah_dd_enabled", l.getIsDirectDownloadEnabled(), map);
            }
            CollectionUtils.putLongIfValid("ah_sdk_version_code", Long.valueOf(l.getAppHubVersionCode()), map);
            CollectionUtils.putStringIfValid("ah_random_user_token", StringUtils.emptyIfNull(l.getRandomUserToken()), map);
            CollectionUtils.putStringIfValid("ah_sdk_package_name", StringUtils.emptyIfNull(l.getAppHubPackageName()), map);
        }
        return map;
    }

    private void a(Map map) {
        if (((Boolean) this.f10929a.a(oj.f9797k4)).booleanValue() && zp.d(this.f10929a)) {
            tr.a(this.f10929a);
        }
        if (((Boolean) this.f10929a.a(oj.f9884x4)).booleanValue()) {
            tr.b(this.f10929a);
        }
        if (((Boolean) this.f10929a.a(oj.f9739c4)).booleanValue() && !map.containsKey("af")) {
            CollectionUtils.putLongIfValid("af", Long.valueOf(this.f10930c.e()), map);
        }
        if (((Boolean) this.f10929a.a(oj.f9746d4)).booleanValue() && !map.containsKey("font")) {
            CollectionUtils.putFloatIfValid("font", Float.valueOf(this.f10930c.n()), map);
        }
        if (((Boolean) this.f10929a.a(oj.f9789j4)).booleanValue() && !map.containsKey("sua")) {
            CollectionUtils.putStringIfValid("sua", System.getProperty("http.agent"), map);
        }
        if (((Boolean) this.f10929a.a(oj.f9759f4)).booleanValue() && !map.containsKey("network_restricted")) {
            CollectionUtils.putBooleanIfValid("network_restricted", Boolean.valueOf(this.f10930c.F()), map);
        }
        if (((Boolean) this.f10929a.a(oj.f9812n4)).booleanValue()) {
            CollectionUtils.putBooleanIfValid("is_pc", Boolean.valueOf(this.f10930c.C()), map);
        }
        if (((Boolean) this.f10929a.a(oj.f9898z4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", this.f10930c.s(), map);
        }
    }

    public Map a() {
        HashMap hashMap = new HashMap(5);
        CollectionUtils.putStringIfValid("sc", (String) this.f10929a.a(oj.f9829q), hashMap);
        CollectionUtils.putStringIfValid("sc2", (String) this.f10929a.a(oj.f9837r), hashMap);
        CollectionUtils.putStringIfValid("sc3", (String) this.f10929a.a(oj.f9845s), hashMap);
        CollectionUtils.putStringIfValid("server_installed_at", (String) this.f10929a.a(oj.f9851t), hashMap);
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f10929a.a(qj.f10359H), hashMap);
        return hashMap;
    }
}
