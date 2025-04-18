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
import androidx.core.app.NotificationCompat;
import com.applovin.impl.aa;
import com.applovin.impl.b4;
import com.applovin.impl.ba;
import com.applovin.impl.bc;
import com.applovin.impl.c4;
import com.applovin.impl.dm;
import com.applovin.impl.kn;
import com.applovin.impl.l0;
import com.applovin.impl.oj;
import com.applovin.impl.qi;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.th;
import com.applovin.impl.tr;
import com.applovin.impl.x3;
import com.applovin.impl.xl;
import com.applovin.impl.xp;
import com.applovin.impl.y3;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import h.o0;
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

/* loaded from: classes.dex */
public class l {

    /* renamed from: i */
    private static final AtomicReference f7757i = new AtomicReference();

    /* renamed from: j */
    private static final AtomicReference f7758j = new AtomicReference();
    private final k a;

    /* renamed from: b */
    private final t f7759b;

    /* renamed from: c */
    private final Context f7760c;

    /* renamed from: d */
    private final Map f7761d;

    /* renamed from: f */
    private final Map f7763f;

    /* renamed from: g */
    private boolean f7764g;

    /* renamed from: e */
    private final Object f7762e = new Object();

    /* renamed from: h */
    private final AtomicReference f7765h = new AtomicReference();

    /* loaded from: classes.dex */
    public class a implements dm.a {
        public a() {
        }

        @Override // com.applovin.impl.dm.a
        public void a(l0.a aVar) {
            l.f7757i.set(aVar);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final String a;

        /* renamed from: b */
        public final int f7766b;

        public b(String str, int i10) {
            this.a = str;
            this.f7766b = i10;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public int a = -1;

        /* renamed from: b */
        public int f7767b = -1;

        /* renamed from: c */
        public Boolean f7768c = null;
    }

    public l(k kVar) {
        if (kVar != null) {
            this.a = kVar;
            this.f7759b = kVar.L();
            this.f7760c = k.k();
            this.f7761d = y();
            this.f7763f = x();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    private Map E() {
        return zp.a(a(null, true, false));
    }

    private JSONArray H() {
        if (x3.f()) {
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
        if (x3.h() && (connectivityManager = (ConnectivityManager) this.f7760c.getSystemService("connectivity")) != null) {
            try {
                if (connectivityManager.getRestrictBackgroundStatus() != 3) {
                    return false;
                }
                return true;
            } catch (Throwable th2) {
                this.a.L();
                if (t.a()) {
                    this.a.L().a("DataCollector", "Unable to collect constrained network info.", th2);
                }
            }
        }
        return false;
    }

    private Boolean K() {
        boolean isScreenHdr;
        if (!x3.i()) {
            return null;
        }
        isScreenHdr = this.f7760c.getResources().getConfiguration().isScreenHdr();
        return Boolean.valueOf(isScreenHdr);
    }

    public /* synthetic */ void M() {
        this.f7765h.set(n());
    }

    private boolean c() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i10 = 0; i10 < 9; i10++) {
            if (new File(c(strArr[i10])).exists()) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.l.d():long");
    }

    private String g() {
        int orientation = AppLovinSdkUtils.getOrientation(this.f7760c);
        return orientation == 1 ? "portrait" : orientation == 2 ? "landscape" : "none";
    }

    private c h() {
        int i10;
        int i11;
        int i12;
        c cVar = new c();
        Intent registerReceiver = this.f7760c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            i10 = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
        } else {
            i10 = -1;
        }
        if (registerReceiver != null) {
            i11 = registerReceiver.getIntExtra("scale", -1);
        } else {
            i11 = -1;
        }
        if (i10 > 0 && i11 > 0) {
            cVar.f7767b = (int) ((i10 / i11) * 100.0f);
        } else {
            cVar.f7767b = -1;
        }
        if (registerReceiver != null) {
            i12 = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        } else {
            i12 = -1;
        }
        cVar.a = i12;
        boolean z10 = false;
        if (x3.d()) {
            if (Settings.Global.getInt(this.f7760c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0) {
                z10 = true;
            }
            cVar.f7768c = Boolean.valueOf(z10);
        } else {
            if (((registerReceiver.getIntExtra("plugged", -1) & 1) | 14) > 0) {
                z10 = true;
            }
            cVar.f7768c = Boolean.valueOf(z10);
        }
        return cVar;
    }

    private String i() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f7760c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                return telephonyManager.getNetworkOperatorName();
            } catch (Throwable th2) {
                if (t.a()) {
                    this.f7759b.a("DataCollector", "Unable to collect carrier", th2);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    private String k() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f7760c.getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH);
        }
        return "";
    }

    private String m() {
        if (!x3.h()) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            LocaleList locales = this.f7760c.getResources().getConfiguration().getLocales();
            for (int i10 = 0; i10 < locales.size(); i10++) {
                sb2.append(locales.get(i10));
                sb2.append(",");
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private Integer n() {
        if (((AudioManager) this.f7760c.getSystemService(MimeTypes.BASE_TYPE_AUDIO)) == null) {
            return null;
        }
        try {
            return Integer.valueOf((int) (r0.getStreamVolume(3) * ((Float) this.a.a(oj.f6677i4)).floatValue()));
        } catch (Throwable th2) {
            this.a.L();
            if (t.a()) {
                this.a.L().a("DataCollector", "Unable to collect device volume", th2);
            }
            return null;
        }
    }

    private float o() {
        try {
            return Settings.System.getFloat(this.f7760c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e2) {
            if (t.a()) {
                this.f7759b.a("DataCollector", "Error collecting font scale", e2);
                return -1.0f;
            }
            return -1.0f;
        }
    }

    private boolean p() {
        SensorManager sensorManager = (SensorManager) this.f7760c.getSystemService("sensor");
        if (sensorManager != null && sensorManager.getDefaultSensor(4) != null) {
            return true;
        }
        return false;
    }

    private Map q() {
        HashMap hashMap = new HashMap();
        CollectionUtils.putIntegerIfValid("IABTCF_gdprApplies", this.a.m0().g(), hashMap);
        CollectionUtils.putStringIfValid("IABTCF_TCString", this.a.m0().k(), hashMap);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.a.m0().c(), hashMap);
        return hashMap;
    }

    private Boolean r() {
        AudioManager audioManager = (AudioManager) this.f7760c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    private Boolean s() {
        AudioManager audioManager = (AudioManager) this.f7760c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    private String t() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f7760c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                return networkOperator.substring(0, Math.min(3, networkOperator.length()));
            } catch (Throwable th2) {
                if (t.a()) {
                    this.f7759b.a("DataCollector", "Unable to collect mobile country code", th2);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    private String u() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f7760c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                return networkOperator.substring(Math.min(3, networkOperator.length()));
            } catch (Throwable th2) {
                if (t.a()) {
                    this.f7759b.a("DataCollector", "Unable to collect mobile network code", th2);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    private String w() {
        AudioManager audioManager = (AudioManager) this.f7760c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager != null) {
            StringBuilder sb2 = new StringBuilder();
            if (x3.g()) {
                for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                    sb2.append(audioDeviceInfo.getType());
                    sb2.append(",");
                }
            } else {
                if (audioManager.isWiredHeadsetOn()) {
                    sb2.append("3,");
                }
                if (audioManager.isBluetoothScoOn()) {
                    sb2.append("7,");
                }
                if (audioManager.isBluetoothA2dpOn()) {
                    sb2.append(8);
                }
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            String sb3 = sb2.toString();
            if (TextUtils.isEmpty(sb3) && t.a()) {
                this.f7759b.a("DataCollector", "No sound outputs detected");
            }
            return sb3;
        }
        return null;
    }

    private Map x() {
        PackageInfo packageInfo;
        String str;
        int i10;
        HashMap hashMap = new HashMap();
        PackageManager packageManager = this.f7760c.getPackageManager();
        ApplicationInfo applicationInfo = this.f7760c.getApplicationInfo();
        long lastModified = new File(applicationInfo.sourceDir).lastModified();
        String str2 = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.f7760c.getPackageName(), 0);
            try {
                str2 = packageManager.getInstallerPackageName(applicationInfo.packageName);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            packageInfo = null;
        }
        hashMap.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        Object obj = "";
        if (packageInfo == null) {
            str = "";
        } else {
            str = packageInfo.versionName;
        }
        hashMap.put("app_version", str);
        if (packageInfo != null) {
            i10 = packageInfo.versionCode;
        } else {
            i10 = -1;
        }
        hashMap.put("app_version_code", Integer.valueOf(i10));
        hashMap.put(CampaignEx.JSON_KEY_PACKAGE_NAME, applicationInfo.packageName);
        hashMap.put("vz", StringUtils.toShortSHA1Hash(applicationInfo.packageName));
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("installer_name", str2);
        hashMap.put("tg", xp.a(this.a));
        hashMap.put("debug", Boolean.valueOf(zp.c(this.a)));
        hashMap.put("ia", Long.valueOf(lastModified));
        hashMap.put("alts_ms", Long.valueOf(k.j()));
        hashMap.put("j8", Boolean.valueOf(k.B0()));
        hashMap.put("ps_tpg", Boolean.valueOf(th.d(this.f7760c)));
        hashMap.put("ps_apg", Boolean.valueOf(th.b(this.f7760c)));
        hashMap.put("ps_capg", Boolean.valueOf(th.c(this.f7760c)));
        hashMap.put("ps_aipg", Boolean.valueOf(th.a(this.f7760c)));
        k kVar = this.a;
        qj qjVar = qj.f7225f;
        Long l10 = (Long) kVar.a(qjVar);
        if (l10 != null) {
            hashMap.put("ia_v2", l10);
        } else {
            this.a.b(qjVar, Long.valueOf(lastModified));
        }
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        hashMap.put("omid_sdk_version", this.a.Y().c());
        CollectionUtils.putStringIfValid("ad_review_sdk_version", com.applovin.impl.v.b(), hashMap);
        hashMap.put("api_did", this.a.a(oj.f6656g));
        if (packageInfo != null) {
            obj = Long.valueOf(packageInfo.firstInstallTime);
        }
        hashMap.put("first_install_v3_ms", obj);
        hashMap.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        hashMap.put("epv", Integer.valueOf(zp.f()));
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
        hashMap.put("model", Build.MODEL);
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("platform", v());
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("tz_offset", Double.valueOf(z()));
        hashMap.put("gy", Boolean.valueOf(p()));
        hashMap.put("country_code", k());
        hashMap.put("mcc", t());
        hashMap.put("mnc", u());
        hashMap.put("carrier", i());
        hashMap.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f7760c)));
        hashMap.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f7760c)));
        hashMap.put("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        hashMap.put("hdr", K());
        hashMap.put("supported_abis", H());
        DisplayMetrics displayMetrics = this.f7760c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            hashMap.put("adns", Float.valueOf(displayMetrics.density));
            hashMap.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            hashMap.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            hashMap.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            Point b3 = x3.b(this.f7760c);
            hashMap.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(b3.y, 2.0d) + Math.pow(b3.x, 2.0d)) / displayMetrics.xdpi));
            x3.a a10 = x3.a(this.f7760c, this.a);
            if (a10 != null) {
                hashMap.put("tl_cr", Integer.valueOf(a10.c()));
                hashMap.put("tr_cr", Integer.valueOf(a10.d()));
                hashMap.put("bl_cr", Integer.valueOf(a10.a()));
                hashMap.put("br_cr", Integer.valueOf(a10.b()));
            }
        }
        hashMap.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        hashMap.put("tbalsi_ms", Long.valueOf(this.a.J() - k.j()));
        CollectionUtils.putBooleanIfValid("psase", Boolean.valueOf(th.e(this.f7760c)), hashMap);
        CollectionUtils.putStringIfValid("process_name", zp.b(this.f7760c), hashMap);
        CollectionUtils.putBooleanIfValid("is_main_process", zp.g(this.f7760c), hashMap);
        try {
            PackageInfo packageInfo = this.f7760c.getPackageManager().getPackageInfo("com.android.vending", 0);
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
        Map map = CollectionUtils.map(this.f7763f);
        map.put("first_install", Boolean.valueOf(this.a.z0()));
        map.put("first_install_v2", Boolean.valueOf(!this.a.w0()));
        map.put("test_ads", Boolean.valueOf(this.f7764g));
        map.put("muted", Boolean.valueOf(this.a.g0().isMuted()));
        if (((Boolean) this.a.a(oj.K3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.a.t0().c(), map);
        }
        if (((Boolean) this.a.a(oj.N3)).booleanValue()) {
            map.put("compass_random_token", this.a.p());
        }
        if (((Boolean) this.a.a(oj.P3)).booleanValue()) {
            map.put("applovin_random_token", this.a.c0());
        }
        if (this.a.r0() != null) {
            String name = this.a.r0().getName();
            if (StringUtils.isValidString(name)) {
                map.put("user_segment_name", name);
            }
        }
        map.putAll(q());
        if (this.a.b0() != null) {
            CollectionUtils.putJsonArrayIfValid("ps_topics", this.a.b0().a(), map);
        }
        return map;
    }

    public b B() {
        return (b) f7758j.get();
    }

    public String C() {
        String encodeToString = Base64.encodeToString(new JSONObject(E()).toString().getBytes(Charset.defaultCharset()), 2);
        if (((Boolean) this.a.a(oj.f6701l5)).booleanValue()) {
            return qi.b(encodeToString, zp.a(this.a), qi.a.a(((Integer) this.a.a(oj.f6709m5)).intValue()), this.a.d0(), this.a);
        }
        return encodeToString;
    }

    public String D() {
        ActivityManager activityManager = (ActivityManager) this.f7760c.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public Map F() {
        return CollectionUtils.map(this.f7763f);
    }

    public Map G() {
        return CollectionUtils.map(this.f7761d);
    }

    public boolean L() {
        return this.f7764g;
    }

    public Map N() {
        if (!this.a.g0().isLocationCollectionEnabled() || !((Boolean) this.a.a(oj.I4)).booleanValue()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        s K = this.a.K();
        boolean e2 = K.e();
        hashMap.put("loc_services_enabled", Boolean.valueOf(e2));
        if (!e2) {
            return hashMap;
        }
        hashMap.put("loc_auth", Boolean.valueOf(K.c()));
        if (K.d()) {
            double a10 = K.a();
            k kVar = this.a;
            oj ojVar = oj.K4;
            hashMap.put("loc_lat", zp.a(a10, ((Integer) kVar.a(ojVar)).intValue()));
            hashMap.put("loc_long", zp.a(K.b(), ((Integer) this.a.a(ojVar)).intValue()));
        }
        return hashMap;
    }

    public void O() {
        sm l02 = this.a.l0();
        dm dmVar = new dm(this.a, new a());
        sm.b bVar = sm.b.OTHER;
        l02.a((xl) dmVar, bVar);
        this.a.l0().a((xl) new kn(this.a, true, "setDeviceVolume", new z(this, 4)), bVar);
    }

    public void P() {
        synchronized (this.f7762e) {
            a(this.f7761d);
        }
    }

    public Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put("sc", this.a.a(oj.f6735q));
        hashMap.put("sc2", this.a.a(oj.f6743r));
        hashMap.put("sc3", this.a.a(oj.f6750s));
        hashMap.put("server_installed_at", this.a.a(oj.f6757t));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.a.a(qj.H), hashMap);
        return hashMap;
    }

    public l0.a f() {
        List<String> list;
        l0.a b3 = l0.b(this.f7760c);
        if (b3 == null) {
            return new l0.a();
        }
        if (((Boolean) this.a.a(oj.I3)).booleanValue()) {
            if (b3.c() && !((Boolean) this.a.a(oj.H3)).booleanValue()) {
                b3.a("");
            }
            f7757i.set(b3);
        } else {
            b3 = new l0.a();
        }
        String str = null;
        if (this.a.C0().get()) {
            list = this.a.g0().getTestDeviceAdvertisingIds();
        } else if (this.a.I() != null) {
            list = this.a.I().getTestDeviceAdvertisingIds();
        } else {
            list = null;
        }
        if (list != null) {
            String a10 = b3.a();
            if (StringUtils.isValidString(a10)) {
                this.f7764g = list.contains(a10);
            }
            b B = B();
            if (B != null) {
                str = B.a;
            }
            if (StringUtils.isValidString(str)) {
                this.f7764g = list.contains(str) | this.f7764g;
            }
        } else {
            this.f7764g = false;
        }
        return b3;
    }

    public Map j() {
        b4.d a10 = this.a.r().a();
        if (a10 == null) {
            return null;
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("lrm_ts_ms", String.valueOf(a10.c()));
        hashMap.put("lrm_url", a10.d());
        hashMap.put("lrm_ct_ms", String.valueOf(a10.a()));
        hashMap.put("lrm_rs", String.valueOf(a10.b()));
        return hashMap;
    }

    public Map l() {
        return a(false);
    }

    public String v() {
        return AppLovinSdkUtils.isFireOS(this.f7760c) ? "fireos" : "android";
    }

    public /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String C = C();
            if (StringUtils.isValidString(C)) {
                this.a.L();
                if (t.a()) {
                    this.a.L().a("DataCollector", "Successfully retrieved bid token");
                }
                bc.a(appLovinBidTokenCollectionListener, C);
                return;
            }
            this.a.L();
            if (t.a()) {
                this.a.L().b("DataCollector", "Empty bid token");
            }
            bc.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th2) {
            if (t.a()) {
                this.f7759b.a("DataCollector", "Failed to collect bid token", th2);
            }
            this.a.B().a("DataCollector", "collectBidToken", th2);
            bc.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    public void a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.a.l0().a((xl) new kn(this.a, ((Boolean) this.a.a(oj.V3)).booleanValue(), "DataCollector", new o0(18, this, appLovinBidTokenCollectionListener)), sm.b.CORE);
    }

    private String c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = str.charAt(i10);
            for (int i11 = 9; i11 >= 0; i11--) {
                cArr[i10] = (char) (cArr[i10] ^ iArr[i11]);
            }
        }
        return new String(cArr);
    }

    public Map a(Map map, boolean z10, boolean z11) {
        HashMap hashMap = new HashMap(64);
        Map a10 = a(z10);
        Map A = A();
        Map j3 = j();
        Map N = N();
        Map k02 = this.a.k0();
        if (z11) {
            hashMap.put("device_info", a10);
            hashMap.put("app_info", A);
            if (j3 != null) {
                hashMap.put("connection_info", j3);
            }
            if (map != null) {
                hashMap.put("ad_info", map);
            }
            if (N != null) {
                hashMap.put("location_info", N);
            }
            if (k02 != null && !k02.isEmpty()) {
                hashMap.put("targeting_data", k02);
            }
        } else {
            hashMap.putAll(a10);
            hashMap.putAll(A);
            if (j3 != null) {
                hashMap.putAll(j3);
            }
            if (map != null) {
                hashMap.putAll(map);
            }
            if (N != null) {
                hashMap.putAll(N);
            }
            if (k02 != null && !k02.isEmpty()) {
                hashMap.putAll(k02);
            }
        }
        hashMap.put("accept", "custom_size,launch_app,video");
        hashMap.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.a.Q(), hashMap);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.a.A(), hashMap);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.a.a(oj.U3), hashMap);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.a.o0()), hashMap);
        if (!((Boolean) this.a.a(oj.f6685j5)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.a.d0());
        }
        hashMap.putAll(e());
        if (((Boolean) this.a.a(oj.L4)).booleanValue()) {
            ba F = this.a.F();
            hashMap.put("li", Long.valueOf(F.b(aa.f3615e)));
            hashMap.put("si", Long.valueOf(F.b(aa.f3618h)));
            hashMap.put("mad", Long.valueOf(F.b(aa.f3616f)));
            hashMap.put("msad", Long.valueOf(F.b(aa.f3619i)));
            hashMap.put("pf", Long.valueOf(F.b(aa.f3623m)));
            hashMap.put("mpf", Long.valueOf(F.b(aa.f3630t)));
            hashMap.put("gpf", Long.valueOf(F.b(aa.f3624n)));
            hashMap.put("asoac", Long.valueOf(F.b(aa.f3628r)));
        }
        hashMap.put("rid", UUID.randomUUID().toString());
        return hashMap;
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.f7760c.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
    }

    public Map a(boolean z10) {
        Map map;
        synchronized (this.f7762e) {
            map = CollectionUtils.map(this.f7761d);
        }
        return a(map, z10);
    }

    private void a(Map map) {
        if (((Boolean) this.a.a(oj.f6631c4)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(d()));
        }
        if (((Boolean) this.a.a(oj.f6639d4)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(o()));
        }
        if (((Boolean) this.a.a(oj.f6692k4)).booleanValue() && zp.d(this.a)) {
            tr.a(this.a);
        }
        if (((Boolean) this.a.a(oj.f6791x4)).booleanValue()) {
            tr.b(this.a);
        }
        if (((Boolean) this.a.a(oj.f6684j4)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.a.a(oj.f6653f4)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(J()));
        }
        if (((Boolean) this.a.a(oj.f6716n4)).booleanValue()) {
            boolean z10 = true;
            boolean z11 = this.f7760c.getResources().getConfiguration().keyboard == 2;
            boolean hasSystemFeature = this.f7760c.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
            boolean hasSystemFeature2 = this.f7760c.getPackageManager().hasSystemFeature("android.hardware.type.pc");
            if (!z11 || (!hasSystemFeature && !hasSystemFeature2)) {
                z10 = false;
            }
            map.put("is_pc", Boolean.valueOf(z10));
        }
        if (((Boolean) this.a.a(oj.f6806z4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", D(), map);
        }
    }

    private Map a(Map map, boolean z10) {
        l0.a f10;
        PowerManager powerManager;
        Map map2 = CollectionUtils.map(map);
        Point b3 = x3.b(this.f7760c);
        map2.put("dx", Integer.valueOf(b3.x));
        map2.put("dy", Integer.valueOf(b3.y));
        if (z10) {
            f10 = (l0.a) f7757i.get();
            if (f10 != null) {
                O();
            } else if (zp.h()) {
                f10 = new l0.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                f10 = f();
            }
        } else {
            f10 = f();
        }
        String a10 = f10.a();
        if (StringUtils.isValidString(a10)) {
            map2.put("idfa", a10);
        }
        map2.put("dnt", Boolean.valueOf(f10.c()));
        map2.put("dnt_code", f10.b().b());
        b bVar = (b) f7758j.get();
        if (((Boolean) this.a.a(oj.J3)).booleanValue() && bVar != null) {
            map2.put("idfv", bVar.a);
            map2.put("idfv_scope", Integer.valueOf(bVar.f7766b));
        }
        Boolean b10 = y3.b().b(this.f7760c);
        if (b10 != null) {
            map2.put("huc", b10);
        }
        Boolean b11 = y3.c().b(this.f7760c);
        if (b11 != null) {
            map2.put("aru", b11);
        }
        Boolean b12 = y3.a().b(this.f7760c);
        if (b12 != null) {
            map2.put("dns", b12);
        }
        if (((Boolean) this.a.a(oj.W3)).booleanValue()) {
            c h10 = h();
            CollectionUtils.putIntegerIfValid("act", Integer.valueOf(h10.a), map2);
            CollectionUtils.putIntegerIfValid("acm", Integer.valueOf(h10.f7767b), map2);
            CollectionUtils.putBooleanIfValid("sowpie", h10.f7768c, map2);
        }
        if (((Boolean) this.a.a(oj.f6645e4)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.a.f0().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.a.a(oj.f6669h4)).booleanValue()) {
            map2.put("adr", Boolean.valueOf(I()));
        }
        Integer n10 = z10 ? (Integer) this.f7765h.get() : n();
        if (n10 != null) {
            map2.put("volume", n10);
        }
        CollectionUtils.putBooleanIfValid("ma", r(), map2);
        CollectionUtils.putBooleanIfValid("spo", s(), map2);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.a.f0().isApplicationPaused()), map2);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.a.f0().getAppEnteredForegroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.a.f0().getAppEnteredBackgroundTimeMillis()), map2);
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.f7760c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e2) {
            if (t.a()) {
                this.f7759b.a("DataCollector", "Unable to collect screen brightness", e2);
            }
        }
        if (((Boolean) this.a.a(oj.f6692k4)).booleanValue() && zp.d(this.a)) {
            tr.a(this.a);
            String a11 = tr.a();
            if (StringUtils.isValidString(a11)) {
                map2.put("ua", a11);
            }
        }
        if (((Boolean) this.a.a(oj.f6791x4)).booleanValue()) {
            tr.b(this.a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(tr.d()), map2);
            CollectionUtils.putStringIfValid("wvv", tr.c(), map2);
            CollectionUtils.putStringIfValid("wvpn", tr.b(), map2);
        }
        if (((Boolean) this.a.a(oj.Y3)).booleanValue()) {
            try {
                map2.put("fs", Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th2) {
                map2.put("fs", -1);
                map2.put("tds", -1);
                if (t.a()) {
                    this.f7759b.a("DataCollector", "Unable to collect total & free space.", th2);
                }
            }
        }
        if (((Boolean) this.a.a(oj.Z3)).booleanValue()) {
            ActivityManager.MemoryInfo a12 = zp.a((ActivityManager) this.f7760c.getSystemService("activity"));
            if (a12 != null) {
                map2.put("fm", Long.valueOf(a12.availMem));
                map2.put("tm", Long.valueOf(a12.totalMem));
                map2.put("lmt", Long.valueOf(a12.threshold));
                map2.put("lm", Boolean.valueOf(a12.lowMemory));
            } else {
                map2.put("fm", -1);
                map2.put("tm", -1);
                map2.put("lmt", -1);
            }
        }
        if (((Boolean) this.a.a(oj.f6617a4)).booleanValue() && x3.a("android.permission.READ_PHONE_STATE", this.f7760c) && x3.h()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.f7760c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.a.a(oj.X3)).booleanValue()) {
            String w10 = w();
            if (!TextUtils.isEmpty(w10)) {
                map2.put("so", w10);
            }
        }
        map2.put("orientation_lock", g());
        if (((Boolean) this.a.a(oj.f6623b4)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(zp.j()));
        }
        if (x3.f() && (powerManager = (PowerManager) this.f7760c.getSystemService("power")) != null) {
            map2.put("lpm", Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.a.a(oj.f6700l4)).booleanValue() && this.a.e0() != null) {
            map2.put("da", Float.valueOf(this.a.e0().a()));
        }
        if (((Boolean) this.a.a(oj.f6708m4)).booleanValue() && this.a.e0() != null) {
            map2.put("dm", Float.valueOf(this.a.e0().b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.a.m().a()));
        map2.put("network", c4.g(this.a));
        String m10 = m();
        if (StringUtils.isValidString(m10)) {
            map2.put("kb", m10);
        }
        ArrayService l10 = this.a.l();
        if (l10.isAppHubInstalled()) {
            if (l10.getIsDirectDownloadEnabled() != null) {
                map2.put("ah_dd_enabled", l10.getIsDirectDownloadEnabled());
            }
            map2.put("ah_sdk_version_code", Long.valueOf(l10.getAppHubVersionCode()));
            map2.put("ah_random_user_token", StringUtils.emptyIfNull(l10.getRandomUserToken()));
            map2.put("ah_sdk_package_name", StringUtils.emptyIfNull(l10.getAppHubPackageName()));
        }
        return map2;
    }

    public static void a(l0.a aVar) {
        f7757i.set(aVar);
    }

    public static void a(b bVar) {
        f7758j.set(bVar);
    }

    private boolean a(String str) {
        return b(str) == 1;
    }
}
