package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.applovin.impl.a4;
import com.applovin.impl.ca;
import com.applovin.impl.d4;
import com.applovin.impl.da;
import com.applovin.impl.e4;
import com.applovin.impl.em;
import com.applovin.impl.gc;
import com.applovin.impl.jn;
import com.applovin.impl.l0;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.sr;
import com.applovin.impl.tm;
import com.applovin.impl.uj;
import com.applovin.impl.vi;
import com.applovin.impl.wh;
import com.applovin.impl.wp;
import com.applovin.impl.yl;
import com.applovin.impl.yp;
import com.applovin.impl.z3;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.NativeProtocol;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.events.MaxEvent;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: i */
    private static final AtomicReference f26689i = new AtomicReference();

    /* renamed from: j */
    private static final AtomicReference f26690j = new AtomicReference();

    /* renamed from: a */
    private final j f26691a;

    /* renamed from: b */
    private final n f26692b;

    /* renamed from: c */
    private final Context f26693c;
    private final Map d;

    /* renamed from: f */
    private final Map f26694f;

    /* renamed from: g */
    private boolean f26695g;
    private final Object e = new Object();

    /* renamed from: h */
    private final AtomicReference f26696h = new AtomicReference();

    /* loaded from: classes2.dex */
    public class a implements em.a {
        public a() {
        }

        @Override // com.applovin.impl.em.a
        public void a(l0.a aVar) {
            k.f26689i.set(aVar);
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        public final String f26698a;

        /* renamed from: b */
        public final int f26699b;

        public b(String str, int i2) {
            this.f26698a = str;
            this.f26699b = i2;
        }
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a */
        public int f26700a = -1;

        /* renamed from: b */
        public int f26701b = -1;

        /* renamed from: c */
        public Boolean f26702c = null;
    }

    public k(j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f26691a = jVar;
        this.f26692b = jVar.J();
        this.f26693c = j.l();
        this.d = y();
        this.f26694f = x();
    }

    private Map E() {
        return yp.a(a(null, true, false));
    }

    private JSONArray H() {
        if (z3.f()) {
            return CollectionUtils.toJSONArray(Build.SUPPORTED_ABIS);
        }
        JSONArray jSONArray = new JSONArray();
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI);
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI2);
        return jSONArray;
    }

    private boolean I() {
        try {
            if (!b()) {
                if (!c()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean J() {
        ConnectivityManager connectivityManager;
        if (z3.h() && (connectivityManager = (ConnectivityManager) this.f26693c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th) {
                this.f26691a.J();
                if (n.a()) {
                    this.f26691a.J().a("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    private Boolean K() {
        if (z3.i()) {
            return Boolean.valueOf(this.f26693c.getResources().getConfiguration().isScreenHdr());
        }
        return null;
    }

    public /* synthetic */ void M() {
        this.f26696h.set(n());
    }

    private boolean c() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i2 = 0; i2 < 9; i2++) {
            if (new File(c(strArr[i2])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long d() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.k.d():long");
    }

    private String g() {
        int orientation = AppLovinSdkUtils.getOrientation(this.f26693c);
        return orientation == 1 ? "portrait" : orientation == 2 ? "landscape" : IntegrityManager.INTEGRITY_TYPE_NONE;
    }

    private c h() {
        c cVar = new c();
        Intent registerReceiver = this.f26693c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.f26701b = -1;
        } else {
            cVar.f26701b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        cVar.f26700a = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        if (z3.d()) {
            cVar.f26702c = Boolean.valueOf(Settings.Global.getInt(this.f26693c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0);
        } else {
            cVar.f26702c = Boolean.valueOf(((registerReceiver.getIntExtra("plugged", -1) & 1) | 14) > 0);
        }
        return cVar;
    }

    private String i() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f26693c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (Throwable th) {
            if (!n.a()) {
                return "";
            }
            this.f26692b.a("DataCollector", "Unable to collect carrier", th);
            return "";
        }
    }

    private String k() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f26693c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    private String m() {
        if (!z3.h()) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            LocaleList locales = this.f26693c.getResources().getConfiguration().getLocales();
            for (int i2 = 0; i2 < locales.size(); i2++) {
                sb.append(locales.get(i2));
                sb.append(",");
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private Integer n() {
        if (((AudioManager) this.f26693c.getSystemService("audio")) == null) {
            return null;
        }
        try {
            return Integer.valueOf((int) (r0.getStreamVolume(3) * ((Float) this.f26691a.a(sj.o4)).floatValue()));
        } catch (Throwable th) {
            this.f26691a.J();
            if (n.a()) {
                this.f26691a.J().a("DataCollector", "Unable to collect device volume", th);
            }
            return null;
        }
    }

    private float o() {
        try {
            return Settings.System.getFloat(this.f26693c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e) {
            if (!n.a()) {
                return -1.0f;
            }
            this.f26692b.a("DataCollector", "Error collecting font scale", e);
            return -1.0f;
        }
    }

    private boolean p() {
        SensorManager sensorManager = (SensorManager) this.f26693c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private Map q() {
        HashMap hashMap = new HashMap();
        CollectionUtils.putIntegerIfValid("IABTCF_gdprApplies", this.f26691a.k0().g(), hashMap);
        CollectionUtils.putStringIfValid("IABTCF_TCString", this.f26691a.k0().k(), hashMap);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.f26691a.k0().c(), hashMap);
        return hashMap;
    }

    private Boolean r() {
        AudioManager audioManager = (AudioManager) this.f26693c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    private Boolean s() {
        AudioManager audioManager = (AudioManager) this.f26693c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    private String t() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f26693c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!n.a()) {
                return "";
            }
            this.f26692b.a("DataCollector", "Unable to collect mobile country code", th);
            return "";
        }
    }

    private String u() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f26693c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!n.a()) {
                return "";
            }
            this.f26692b.a("DataCollector", "Unable to collect mobile network code", th);
            return "";
        }
    }

    private String w() {
        AudioManager audioManager = (AudioManager) this.f26693c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (z3.g()) {
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                sb.append(audioDeviceInfo.getType());
                sb.append(",");
            }
        } else {
            if (audioManager.isWiredHeadsetOn()) {
                sb.append("3,");
            }
            if (audioManager.isBluetoothScoOn()) {
                sb.append("7,");
            }
            if (audioManager.isBluetoothA2dpOn()) {
                sb.append(8);
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2) && n.a()) {
            this.f26692b.a("DataCollector", "No sound outputs detected");
        }
        return sb2;
    }

    private Map x() {
        PackageInfo packageInfo;
        HashMap hashMap = new HashMap();
        PackageManager packageManager = this.f26693c.getPackageManager();
        ApplicationInfo applicationInfo = this.f26693c.getApplicationInfo();
        long lastModified = new File(applicationInfo.sourceDir).lastModified();
        String str = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.f26693c.getPackageName(), 0);
            try {
                str = packageManager.getInstallerPackageName(applicationInfo.packageName);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            packageInfo = null;
        }
        hashMap.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, packageManager.getApplicationLabel(applicationInfo));
        hashMap.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        hashMap.put("app_version_code", Integer.valueOf(packageInfo != null ? packageInfo.versionCode : -1));
        hashMap.put("package_name", applicationInfo.packageName);
        hashMap.put("vz", StringUtils.toShortSHA1Hash(applicationInfo.packageName));
        if (str == null) {
            str = "";
        }
        hashMap.put("installer_name", str);
        hashMap.put("tg", wp.a(this.f26691a));
        hashMap.put("debug", Boolean.valueOf(yp.c(this.f26691a)));
        hashMap.put("ia", Long.valueOf(lastModified));
        hashMap.put("alts_ms", Long.valueOf(j.k()));
        hashMap.put("j8", Boolean.valueOf(j.y0()));
        hashMap.put("ps_tpg", Boolean.valueOf(wh.d(this.f26693c)));
        hashMap.put("ps_apg", Boolean.valueOf(wh.b(this.f26693c)));
        hashMap.put("ps_capg", Boolean.valueOf(wh.c(this.f26693c)));
        hashMap.put("ps_aipg", Boolean.valueOf(wh.a(this.f26693c)));
        j jVar = this.f26691a;
        uj ujVar = uj.f27331f;
        Long l2 = (Long) jVar.a(ujVar);
        if (l2 != null) {
            hashMap.put("ia_v2", l2);
        } else {
            this.f26691a.b(ujVar, Long.valueOf(lastModified));
        }
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        hashMap.put("omid_sdk_version", this.f26691a.W().c());
        CollectionUtils.putStringIfValid("ad_review_sdk_version", com.applovin.impl.v.b(), hashMap);
        hashMap.put("api_did", this.f26691a.a(sj.f26917g));
        hashMap.put("first_install_v3_ms", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : "");
        hashMap.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        if (z3.h()) {
            hashMap.put("min_sdk", Integer.valueOf(applicationInfo.minSdkVersion));
        }
        hashMap.put("epv", Integer.valueOf(yp.f()));
        if (this.f26691a.B0()) {
            hashMap.put("unity_version", yp.a(this.f26691a.g0()));
        }
        return hashMap;
    }

    private Map y() {
        HashMap hashMap = new HashMap(34);
        hashMap.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("brand", Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        hashMap.put("aida", Boolean.valueOf(l0.a()));
        hashMap.put("locale", Locale.getDefault().toString());
        hashMap.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put(AppLovinBridge.e, v());
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("tz_offset", Double.valueOf(z()));
        hashMap.put("gy", Boolean.valueOf(p()));
        hashMap.put("country_code", k());
        hashMap.put("mcc", t());
        hashMap.put("mnc", u());
        hashMap.put("carrier", i());
        hashMap.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f26693c)));
        hashMap.put("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        hashMap.put("hdr", K());
        hashMap.put("supported_abis", H());
        DisplayMetrics displayMetrics = this.f26693c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            hashMap.put("adns", Float.valueOf(displayMetrics.density));
            hashMap.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            hashMap.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            hashMap.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            z3.a a2 = z3.a(this.f26693c, this.f26691a);
            if (a2 != null) {
                hashMap.put("tl_cr", Integer.valueOf(a2.c()));
                hashMap.put("tr_cr", Integer.valueOf(a2.d()));
                hashMap.put("bl_cr", Integer.valueOf(a2.a()));
                hashMap.put("br_cr", Integer.valueOf(a2.b()));
            }
        }
        hashMap.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        hashMap.put("tbalsi_ms", Long.valueOf(this.f26691a.I() - j.k()));
        CollectionUtils.putBooleanIfValid("psase", Boolean.valueOf(wh.e(this.f26693c)), hashMap);
        CollectionUtils.putStringIfValid("process_name", yp.b(this.f26693c), hashMap);
        CollectionUtils.putBooleanIfValid("is_main_process", yp.g(this.f26693c), hashMap);
        try {
            PackageInfo packageInfo = this.f26693c.getPackageManager().getPackageInfo("com.android.vending", 0);
            hashMap.put("ps_version", packageInfo.versionName);
            hashMap.put("ps_version_code", Integer.valueOf(packageInfo.versionCode));
        } catch (Throwable unused) {
            hashMap.put("ps_version", "");
            hashMap.put("ps_version_code", -1);
        }
        a(hashMap);
        return hashMap;
    }

    private double z() {
        return Math.round((TimeZone.getDefault().getOffset(new Date().getTime()) * 10.0d) / 3600000.0d) / 10.0d;
    }

    public Map A() {
        Map map = CollectionUtils.map(this.f26694f);
        map.put("first_install", Boolean.valueOf(this.f26691a.v0()));
        map.put("first_install_v2", Boolean.valueOf(!this.f26691a.t0()));
        map.put("test_ads", Boolean.valueOf(this.f26695g));
        map.put("muted", Boolean.valueOf(this.f26691a.g0().isMuted()));
        if (((Boolean) this.f26691a.a(sj.R3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f26691a.q0().c(), map);
        }
        if (((Boolean) this.f26691a.a(sj.U3)).booleanValue()) {
            map.put("compass_random_token", this.f26691a.q());
        }
        if (((Boolean) this.f26691a.a(sj.W3)).booleanValue()) {
            map.put("applovin_random_token", this.f26691a.a0());
        }
        map.putAll(q());
        if (this.f26691a.Z() != null) {
            CollectionUtils.putJsonArrayIfValid("ps_topics", this.f26691a.Z().a(), map);
        }
        return map;
    }

    public b B() {
        return (b) f26690j.get();
    }

    public String C() {
        String encodeToString = Base64.encodeToString(new JSONObject(E()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.f26691a.a(sj.q5)).booleanValue() ? vi.b(encodeToString, yp.a(this.f26691a), vi.a.a(((Integer) this.f26691a.a(sj.r5)).intValue()), this.f26691a.b0(), this.f26691a) : encodeToString;
    }

    public String D() {
        ActivityManager activityManager = (ActivityManager) this.f26693c.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public Map F() {
        return CollectionUtils.map(this.f26694f);
    }

    public Map G() {
        return CollectionUtils.map(this.d);
    }

    public boolean L() {
        return this.f26695g;
    }

    public void N() {
        tm j02 = this.f26691a.j0();
        em emVar = new em(this.f26691a, new a());
        tm.b bVar = tm.b.OTHER;
        j02.a((yl) emVar, bVar);
        this.f26691a.j0().a((yl) new jn(this.f26691a, true, "setDeviceVolume", new s(this, 3)), bVar);
    }

    public void O() {
        synchronized (this.e) {
            a(this.d);
        }
    }

    public Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put("sc", this.f26691a.a(sj.f26935m));
        hashMap.put("sc2", this.f26691a.a(sj.f26937n));
        hashMap.put("sc3", this.f26691a.a(sj.f26940o));
        hashMap.put("server_installed_at", this.f26691a.a(sj.f26943p));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f26691a.a(uj.G), hashMap);
        return hashMap;
    }

    public l0.a f() {
        l0.a b2 = l0.b(this.f26693c);
        if (b2 == null) {
            return new l0.a();
        }
        if (((Boolean) this.f26691a.a(sj.P3)).booleanValue()) {
            if (b2.c() && !((Boolean) this.f26691a.a(sj.O3)).booleanValue()) {
                b2.a("");
            }
            f26689i.set(b2);
        } else {
            b2 = new l0.a();
        }
        List<String> testDeviceAdvertisingIds = this.f26691a.z0().get() ? this.f26691a.g0().getTestDeviceAdvertisingIds() : this.f26691a.H() != null ? this.f26691a.H().getTestDeviceAdvertisingIds() : null;
        if (testDeviceAdvertisingIds != null) {
            String a2 = b2.a();
            if (StringUtils.isValidString(a2)) {
                this.f26695g = testDeviceAdvertisingIds.contains(a2);
            }
            b B = B();
            String str = B != null ? B.f26698a : null;
            if (StringUtils.isValidString(str)) {
                this.f26695g = testDeviceAdvertisingIds.contains(str) | this.f26695g;
            }
        } else {
            this.f26695g = false;
        }
        return b2;
    }

    public Map j() {
        d4.d a2 = this.f26691a.s().a();
        if (a2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("lrm_ts_ms", String.valueOf(a2.c()));
        hashMap.put("lrm_url", a2.d());
        hashMap.put("lrm_ct_ms", String.valueOf(a2.a()));
        hashMap.put("lrm_rs", String.valueOf(a2.b()));
        return hashMap;
    }

    public Map l() {
        return a(false);
    }

    public String v() {
        return AppLovinSdkUtils.isFireOS(this.f26693c) ? "fireos" : "android";
    }

    public /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String C = C();
            if (StringUtils.isValidString(C)) {
                this.f26691a.J();
                if (n.a()) {
                    this.f26691a.J().a("DataCollector", "Successfully retrieved bid token");
                }
                gc.a(appLovinBidTokenCollectionListener, C);
                return;
            }
            this.f26691a.J();
            if (n.a()) {
                this.f26691a.J().b("DataCollector", "Empty bid token");
            }
            gc.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th) {
            if (n.a()) {
                this.f26692b.a("DataCollector", "Failed to collect bid token", th);
            }
            this.f26691a.E().a("DataCollector", "collectBidToken", th);
            gc.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    public void a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f26691a.j0().a((yl) new jn(this.f26691a, ((Boolean) this.f26691a.a(sj.b4)).booleanValue(), "DataCollector", new androidx.core.content.res.a(16, this, appLovinBidTokenCollectionListener)), tm.b.CORE);
    }

    private String c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = str.charAt(i2);
            for (int i3 = 9; i3 >= 0; i3--) {
                cArr[i2] = (char) (cArr[i2] ^ iArr[i3]);
            }
        }
        return new String(cArr);
    }

    public Map a(Map map, boolean z2, boolean z3) {
        HashMap hashMap = new HashMap(64);
        Map a2 = a(z2);
        Map A = A();
        Map j2 = j();
        Map d02 = this.f26691a.d0();
        if (z3) {
            hashMap.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, a2);
            hashMap.put("app_info", A);
            if (j2 != null) {
                hashMap.put("connection_info", j2);
            }
            if (map != null) {
                hashMap.put("ad_info", map);
            }
            if (!CollectionUtils.isEmpty(d02)) {
                hashMap.put("segments", d02);
            }
        } else {
            hashMap.putAll(a2);
            hashMap.putAll(A);
            if (j2 != null) {
                hashMap.putAll(j2);
            }
            if (map != null) {
                hashMap.putAll(map);
            }
            if (!CollectionUtils.isEmpty(d02)) {
                hashMap.putAll(d02);
            }
        }
        hashMap.put("accept", "custom_size,launch_app,video");
        hashMap.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f26691a.O(), hashMap);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f26691a.z(), hashMap);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f26691a.a(sj.a4), hashMap);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f26691a.m0()), hashMap);
        if (!((Boolean) this.f26691a.a(sj.o5)).booleanValue()) {
            hashMap.put("sdk_key", this.f26691a.b0());
        }
        hashMap.putAll(e());
        if (((Boolean) this.f26691a.a(sj.P4)).booleanValue()) {
            da D = this.f26691a.D();
            hashMap.put("li", Long.valueOf(D.b(ca.e)));
            hashMap.put("si", Long.valueOf(D.b(ca.f23244h)));
            hashMap.put("mad", Long.valueOf(D.b(ca.f23242f)));
            hashMap.put("msad", Long.valueOf(D.b(ca.f23245i)));
            hashMap.put("pf", Long.valueOf(D.b(ca.f23249m)));
            hashMap.put("mpf", Long.valueOf(D.b(ca.f23256t)));
            hashMap.put("gpf", Long.valueOf(D.b(ca.f23250n)));
            hashMap.put("asoac", Long.valueOf(D.b(ca.f23254r)));
        }
        hashMap.put(ImpressionLog.x, UUID.randomUUID().toString());
        return hashMap;
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.f26693c.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
    }

    public Map a(boolean z2) {
        Map map;
        synchronized (this.e) {
            map = CollectionUtils.map(this.d);
        }
        return a(map, z2);
    }

    private void a(Map map) {
        if (((Boolean) this.f26691a.a(sj.i4)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(d()));
        }
        if (((Boolean) this.f26691a.a(sj.j4)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(o()));
        }
        if (((Boolean) this.f26691a.a(sj.q4)).booleanValue() && yp.d(this.f26691a)) {
            sr.a(this.f26691a);
        }
        if (((Boolean) this.f26691a.a(sj.D4)).booleanValue()) {
            sr.b(this.f26691a);
        }
        if (((Boolean) this.f26691a.a(sj.p4)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.f26691a.a(sj.l4)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(J()));
        }
        if (((Boolean) this.f26691a.a(sj.t4)).booleanValue()) {
            boolean z2 = false;
            boolean z3 = this.f26693c.getResources().getConfiguration().keyboard == 2;
            boolean hasSystemFeature = this.f26693c.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
            boolean hasSystemFeature2 = this.f26693c.getPackageManager().hasSystemFeature("android.hardware.type.pc");
            if (z3 && (hasSystemFeature || hasSystemFeature2)) {
                z2 = true;
            }
            map.put("is_pc", Boolean.valueOf(z2));
        }
        if (((Boolean) this.f26691a.a(sj.F4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", D(), map);
        }
    }

    private Map a(Map map, boolean z2) {
        l0.a f2;
        PowerManager powerManager;
        Map map2 = CollectionUtils.map(map);
        Point b2 = z3.b(this.f26693c);
        map2.put("dx", Integer.valueOf(b2.x));
        map2.put("dy", Integer.valueOf(b2.y));
        if (this.f26693c.getResources().getDisplayMetrics() != null) {
            map2.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(b2.y, 2.0d) + Math.pow(b2.x, 2.0d)) / r4.xdpi));
        }
        map2.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f26693c)));
        if (z2) {
            f2 = (l0.a) f26689i.get();
            if (f2 != null) {
                N();
            } else if (yp.h()) {
                f2 = new l0.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                f2 = f();
            }
        } else {
            f2 = f();
        }
        String a2 = f2.a();
        if (StringUtils.isValidString(a2)) {
            map2.put("idfa", a2);
        }
        map2.put("dnt", Boolean.valueOf(f2.c()));
        map2.put("dnt_code", f2.b().b());
        b bVar = (b) f26690j.get();
        if (((Boolean) this.f26691a.a(sj.Q3)).booleanValue() && bVar != null) {
            map2.put("idfv", bVar.f26698a);
            map2.put("idfv_scope", Integer.valueOf(bVar.f26699b));
        }
        Boolean b3 = a4.b().b(this.f26693c);
        if (b3 != null) {
            map2.put("huc", b3);
        }
        Boolean b4 = a4.c().b(this.f26693c);
        if (b4 != null) {
            map2.put("aru", b4);
        }
        Boolean b5 = a4.a().b(this.f26693c);
        if (b5 != null) {
            map2.put("dns", b5);
        }
        if (((Boolean) this.f26691a.a(sj.c4)).booleanValue()) {
            c h2 = h();
            CollectionUtils.putIntegerIfValid("act", Integer.valueOf(h2.f26700a), map2);
            CollectionUtils.putIntegerIfValid("acm", Integer.valueOf(h2.f26701b), map2);
            CollectionUtils.putBooleanIfValid("sowpie", h2.f26702c, map2);
        }
        if (((Boolean) this.f26691a.a(sj.k4)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.f26691a.f0().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.f26691a.a(sj.n4)).booleanValue()) {
            map2.put(ImpressionLog.C, Boolean.valueOf(I()));
        }
        Integer n2 = z2 ? (Integer) this.f26696h.get() : n();
        if (n2 != null) {
            map2.put("volume", n2);
        }
        CollectionUtils.putBooleanIfValid("ma", r(), map2);
        CollectionUtils.putBooleanIfValid("spo", s(), map2);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.f26691a.f0().isApplicationPaused()), map2);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.f26691a.f0().getAppEnteredForegroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.f26691a.f0().getAppEnteredBackgroundTimeMillis()), map2);
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.f26693c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e) {
            if (n.a()) {
                this.f26692b.a("DataCollector", "Unable to collect screen brightness", e);
            }
        }
        if (((Boolean) this.f26691a.a(sj.q4)).booleanValue() && yp.d(this.f26691a)) {
            sr.a(this.f26691a);
            String a3 = sr.a();
            if (StringUtils.isValidString(a3)) {
                map2.put("ua", a3);
            }
        }
        if (((Boolean) this.f26691a.a(sj.D4)).booleanValue()) {
            sr.b(this.f26691a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(sr.d()), map2);
            CollectionUtils.putStringIfValid("wvv", sr.c(), map2);
            CollectionUtils.putStringIfValid("wvpn", sr.b(), map2);
        }
        if (((Boolean) this.f26691a.a(sj.e4)).booleanValue()) {
            try {
                map2.put("fs", Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th) {
                map2.put("fs", -1);
                map2.put("tds", -1);
                if (n.a()) {
                    this.f26692b.a("DataCollector", "Unable to collect total & free space.", th);
                }
            }
        }
        if (((Boolean) this.f26691a.a(sj.f4)).booleanValue()) {
            ActivityManager.MemoryInfo a4 = yp.a((ActivityManager) this.f26693c.getSystemService("activity"));
            if (a4 != null) {
                map2.put("fm", Long.valueOf(a4.availMem));
                map2.put("tm", Long.valueOf(a4.totalMem));
                map2.put("lmt", Long.valueOf(a4.threshold));
                map2.put("lm", Boolean.valueOf(a4.lowMemory));
            } else {
                map2.put("fm", -1);
                map2.put("tm", -1);
                map2.put("lmt", -1);
            }
        }
        if (((Boolean) this.f26691a.a(sj.g4)).booleanValue() && z3.a("android.permission.READ_PHONE_STATE", this.f26693c) && z3.h()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.f26693c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.f26691a.a(sj.d4)).booleanValue()) {
            String w = w();
            if (!TextUtils.isEmpty(w)) {
                map2.put("so", w);
            }
        }
        map2.put("orientation_lock", g());
        if (((Boolean) this.f26691a.a(sj.h4)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(yp.j()));
        }
        if (z3.f() && (powerManager = (PowerManager) this.f26693c.getSystemService("power")) != null) {
            map2.put("lpm", Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.f26691a.a(sj.r4)).booleanValue() && this.f26691a.e0() != null) {
            map2.put("da", Float.valueOf(this.f26691a.e0().a()));
        }
        if (((Boolean) this.f26691a.a(sj.s4)).booleanValue() && this.f26691a.e0() != null) {
            map2.put("dm", Float.valueOf(this.f26691a.e0().b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.f26691a.n().a()));
        map2.put(MaxEvent.d, e4.g(this.f26691a));
        String m2 = m();
        if (StringUtils.isValidString(m2)) {
            map2.put("kb", m2);
        }
        ArrayService m3 = this.f26691a.m();
        if (m3.isAppHubInstalled()) {
            if (m3.getIsDirectDownloadEnabled() != null) {
                map2.put("ah_dd_enabled", m3.getIsDirectDownloadEnabled());
            }
            map2.put("ah_sdk_version_code", Long.valueOf(m3.getAppHubVersionCode()));
            map2.put("ah_random_user_token", StringUtils.emptyIfNull(m3.getRandomUserToken()));
            map2.put("ah_sdk_package_name", StringUtils.emptyIfNull(m3.getAppHubPackageName()));
        }
        return map2;
    }

    public static void a(l0.a aVar) {
        f26689i.set(aVar);
    }

    public static void a(b bVar) {
        f26690j.set(bVar);
    }

    private boolean a(String str) {
        return b(str) == 1;
    }
}
