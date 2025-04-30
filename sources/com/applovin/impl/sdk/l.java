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
import com.applovin.impl.AbstractC0719l0;
import com.applovin.impl.C0765v;
import com.applovin.impl.aa;
import com.applovin.impl.b4;
import com.applovin.impl.ba;
import com.applovin.impl.bc;
import com.applovin.impl.c4;
import com.applovin.impl.dm;
import com.applovin.impl.kn;
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
    private static final AtomicReference f10916i = new AtomicReference();

    /* renamed from: j */
    private static final AtomicReference f10917j = new AtomicReference();

    /* renamed from: a */
    private final k f10918a;
    private final t b;

    /* renamed from: c */
    private final Context f10919c;

    /* renamed from: d */
    private final Map f10920d;

    /* renamed from: f */
    private final Map f10922f;

    /* renamed from: g */
    private boolean f10923g;

    /* renamed from: e */
    private final Object f10921e = new Object();

    /* renamed from: h */
    private final AtomicReference f10924h = new AtomicReference();

    /* loaded from: classes.dex */
    public class a implements dm.a {
        public a() {
        }

        @Override // com.applovin.impl.dm.a
        public void a(AbstractC0719l0.a aVar) {
            l.f10916i.set(aVar);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final String f10926a;
        public final int b;

        public b(String str, int i9) {
            this.f10926a = str;
            this.b = i9;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public int f10927a = -1;
        public int b = -1;

        /* renamed from: c */
        public Boolean f10928c = null;
    }

    public l(k kVar) {
        if (kVar != null) {
            this.f10918a = kVar;
            this.b = kVar.L();
            this.f10919c = k.k();
            this.f10920d = y();
            this.f10922f = x();
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
        if (x3.h() && (connectivityManager = (ConnectivityManager) this.f10919c.getSystemService("connectivity")) != null) {
            try {
                if (connectivityManager.getRestrictBackgroundStatus() != 3) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                this.f10918a.L();
                if (t.a()) {
                    this.f10918a.L().a("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    private Boolean K() {
        boolean isScreenHdr;
        if (x3.i()) {
            isScreenHdr = this.f10919c.getResources().getConfiguration().isScreenHdr();
            return Boolean.valueOf(isScreenHdr);
        }
        return null;
    }

    public /* synthetic */ void M() {
        this.f10924h.set(n());
    }

    private boolean c() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i9 = 0; i9 < 9; i9++) {
            if (new File(c(strArr[i9])).exists()) {
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
        int orientation = AppLovinSdkUtils.getOrientation(this.f10919c);
        if (orientation == 1) {
            return "portrait";
        }
        if (orientation == 2) {
            return "landscape";
        }
        return "none";
    }

    private c h() {
        int i9;
        int i10;
        int i11;
        c cVar = new c();
        Intent registerReceiver = this.f10919c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            i9 = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
        } else {
            i9 = -1;
        }
        if (registerReceiver != null) {
            i10 = registerReceiver.getIntExtra("scale", -1);
        } else {
            i10 = -1;
        }
        if (i9 > 0 && i10 > 0) {
            cVar.b = (int) ((i9 / i10) * 100.0f);
        } else {
            cVar.b = -1;
        }
        if (registerReceiver != null) {
            i11 = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        } else {
            i11 = -1;
        }
        cVar.f10927a = i11;
        boolean z8 = false;
        if (x3.d()) {
            if (Settings.Global.getInt(this.f10919c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0) {
                z8 = true;
            }
            cVar.f10928c = Boolean.valueOf(z8);
        } else {
            if (((registerReceiver.getIntExtra("plugged", -1) & 1) | 14) > 0) {
                z8 = true;
            }
            cVar.f10928c = Boolean.valueOf(z8);
        }
        return cVar;
    }

    private String i() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f10919c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                return telephonyManager.getNetworkOperatorName();
            } catch (Throwable th) {
                if (t.a()) {
                    this.b.a("DataCollector", "Unable to collect carrier", th);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    private String k() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f10919c.getSystemService("phone");
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
            StringBuilder sb = new StringBuilder();
            LocaleList locales = this.f10919c.getResources().getConfiguration().getLocales();
            for (int i9 = 0; i9 < locales.size(); i9++) {
                sb.append(locales.get(i9));
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
        if (((AudioManager) this.f10919c.getSystemService(MimeTypes.BASE_TYPE_AUDIO)) == null) {
            return null;
        }
        try {
            return Integer.valueOf((int) (r0.getStreamVolume(3) * ((Float) this.f10918a.a(oj.f9781i4)).floatValue()));
        } catch (Throwable th) {
            this.f10918a.L();
            if (t.a()) {
                this.f10918a.L().a("DataCollector", "Unable to collect device volume", th);
            }
            return null;
        }
    }

    private float o() {
        try {
            return Settings.System.getFloat(this.f10919c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e4) {
            if (t.a()) {
                this.b.a("DataCollector", "Error collecting font scale", e4);
                return -1.0f;
            }
            return -1.0f;
        }
    }

    private boolean p() {
        SensorManager sensorManager = (SensorManager) this.f10919c.getSystemService("sensor");
        if (sensorManager != null && sensorManager.getDefaultSensor(4) != null) {
            return true;
        }
        return false;
    }

    private Map q() {
        HashMap hashMap = new HashMap();
        CollectionUtils.putIntegerIfValid("IABTCF_gdprApplies", this.f10918a.m0().g(), hashMap);
        CollectionUtils.putStringIfValid("IABTCF_TCString", this.f10918a.m0().k(), hashMap);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.f10918a.m0().c(), hashMap);
        return hashMap;
    }

    private Boolean r() {
        AudioManager audioManager = (AudioManager) this.f10919c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    private Boolean s() {
        AudioManager audioManager = (AudioManager) this.f10919c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    private String t() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f10919c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                return networkOperator.substring(0, Math.min(3, networkOperator.length()));
            } catch (Throwable th) {
                if (t.a()) {
                    this.b.a("DataCollector", "Unable to collect mobile country code", th);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    private String u() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f10919c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                return networkOperator.substring(Math.min(3, networkOperator.length()));
            } catch (Throwable th) {
                if (t.a()) {
                    this.b.a("DataCollector", "Unable to collect mobile network code", th);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    private String w() {
        AudioManager audioManager = (AudioManager) this.f10919c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager != null) {
            StringBuilder sb = new StringBuilder();
            if (x3.g()) {
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
            if (TextUtils.isEmpty(sb2) && t.a()) {
                this.b.a("DataCollector", "No sound outputs detected");
            }
            return sb2;
        }
        return null;
    }

    private Map x() {
        PackageInfo packageInfo;
        String str;
        int i9;
        HashMap hashMap = new HashMap();
        PackageManager packageManager = this.f10919c.getPackageManager();
        ApplicationInfo applicationInfo = this.f10919c.getApplicationInfo();
        long lastModified = new File(applicationInfo.sourceDir).lastModified();
        String str2 = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.f10919c.getPackageName(), 0);
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
            i9 = packageInfo.versionCode;
        } else {
            i9 = -1;
        }
        hashMap.put("app_version_code", Integer.valueOf(i9));
        hashMap.put(CampaignEx.JSON_KEY_PACKAGE_NAME, applicationInfo.packageName);
        hashMap.put("vz", StringUtils.toShortSHA1Hash(applicationInfo.packageName));
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("installer_name", str2);
        hashMap.put("tg", xp.a(this.f10918a));
        hashMap.put("debug", Boolean.valueOf(zp.c(this.f10918a)));
        hashMap.put("ia", Long.valueOf(lastModified));
        hashMap.put("alts_ms", Long.valueOf(k.j()));
        hashMap.put("j8", Boolean.valueOf(k.B0()));
        hashMap.put("ps_tpg", Boolean.valueOf(th.d(this.f10919c)));
        hashMap.put("ps_apg", Boolean.valueOf(th.b(this.f10919c)));
        hashMap.put("ps_capg", Boolean.valueOf(th.c(this.f10919c)));
        hashMap.put("ps_aipg", Boolean.valueOf(th.a(this.f10919c)));
        k kVar = this.f10918a;
        qj qjVar = qj.f10370f;
        Long l = (Long) kVar.a(qjVar);
        if (l != null) {
            hashMap.put("ia_v2", l);
        } else {
            this.f10918a.b(qjVar, Long.valueOf(lastModified));
        }
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        hashMap.put("omid_sdk_version", this.f10918a.Y().c());
        CollectionUtils.putStringIfValid("ad_review_sdk_version", C0765v.b(), hashMap);
        hashMap.put("api_did", this.f10918a.a(oj.f9762g));
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
        hashMap.put("aida", Boolean.valueOf(AbstractC0719l0.a()));
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
        hashMap.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f10919c)));
        hashMap.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f10919c)));
        hashMap.put("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        hashMap.put("hdr", K());
        hashMap.put("supported_abis", H());
        DisplayMetrics displayMetrics = this.f10919c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            hashMap.put("adns", Float.valueOf(displayMetrics.density));
            hashMap.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            hashMap.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            hashMap.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            Point b8 = x3.b(this.f10919c);
            hashMap.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(b8.y, 2.0d) + Math.pow(b8.x, 2.0d)) / displayMetrics.xdpi));
            x3.a a6 = x3.a(this.f10919c, this.f10918a);
            if (a6 != null) {
                hashMap.put("tl_cr", Integer.valueOf(a6.c()));
                hashMap.put("tr_cr", Integer.valueOf(a6.d()));
                hashMap.put("bl_cr", Integer.valueOf(a6.a()));
                hashMap.put("br_cr", Integer.valueOf(a6.b()));
            }
        }
        hashMap.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        hashMap.put("tbalsi_ms", Long.valueOf(this.f10918a.J() - k.j()));
        CollectionUtils.putBooleanIfValid("psase", Boolean.valueOf(th.e(this.f10919c)), hashMap);
        CollectionUtils.putStringIfValid("process_name", zp.b(this.f10919c), hashMap);
        CollectionUtils.putBooleanIfValid("is_main_process", zp.g(this.f10919c), hashMap);
        try {
            PackageInfo packageInfo = this.f10919c.getPackageManager().getPackageInfo("com.android.vending", 0);
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
        Map map = CollectionUtils.map(this.f10922f);
        map.put("first_install", Boolean.valueOf(this.f10918a.z0()));
        map.put("first_install_v2", Boolean.valueOf(!this.f10918a.w0()));
        map.put("test_ads", Boolean.valueOf(this.f10923g));
        map.put("muted", Boolean.valueOf(this.f10918a.g0().isMuted()));
        if (((Boolean) this.f10918a.a(oj.f9620K3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f10918a.t0().c(), map);
        }
        if (((Boolean) this.f10918a.a(oj.f9640N3)).booleanValue()) {
            map.put("compass_random_token", this.f10918a.p());
        }
        if (((Boolean) this.f10918a.a(oj.f9652P3)).booleanValue()) {
            map.put("applovin_random_token", this.f10918a.c0());
        }
        if (this.f10918a.r0() != null) {
            String name = this.f10918a.r0().getName();
            if (StringUtils.isValidString(name)) {
                map.put("user_segment_name", name);
            }
        }
        map.putAll(q());
        if (this.f10918a.b0() != null) {
            CollectionUtils.putJsonArrayIfValid("ps_topics", this.f10918a.b0().a(), map);
        }
        return map;
    }

    public b B() {
        return (b) f10917j.get();
    }

    public String C() {
        String encodeToString = Base64.encodeToString(new JSONObject(E()).toString().getBytes(Charset.defaultCharset()), 2);
        if (((Boolean) this.f10918a.a(oj.f9802l5)).booleanValue()) {
            return qi.b(encodeToString, zp.a(this.f10918a), qi.a.a(((Integer) this.f10918a.a(oj.f9807m5)).intValue()), this.f10918a.d0(), this.f10918a);
        }
        return encodeToString;
    }

    public String D() {
        ActivityManager activityManager = (ActivityManager) this.f10919c.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public Map F() {
        return CollectionUtils.map(this.f10922f);
    }

    public Map G() {
        return CollectionUtils.map(this.f10920d);
    }

    public boolean L() {
        return this.f10923g;
    }

    public Map N() {
        if (!this.f10918a.g0().isLocationCollectionEnabled() || !((Boolean) this.f10918a.a(oj.f9609I4)).booleanValue()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        s K5 = this.f10918a.K();
        boolean e4 = K5.e();
        hashMap.put("loc_services_enabled", Boolean.valueOf(e4));
        if (!e4) {
            return hashMap;
        }
        hashMap.put("loc_auth", Boolean.valueOf(K5.c()));
        if (K5.d()) {
            double a6 = K5.a();
            k kVar = this.f10918a;
            oj ojVar = oj.f9621K4;
            hashMap.put("loc_lat", zp.a(a6, ((Integer) kVar.a(ojVar)).intValue()));
            hashMap.put("loc_long", zp.a(K5.b(), ((Integer) this.f10918a.a(ojVar)).intValue()));
        }
        return hashMap;
    }

    public void O() {
        sm l02 = this.f10918a.l0();
        dm dmVar = new dm(this.f10918a, new a());
        sm.b bVar = sm.b.OTHER;
        l02.a((xl) dmVar, bVar);
        this.f10918a.l0().a((xl) new kn(this.f10918a, true, "setDeviceVolume", new z(this, 4)), bVar);
    }

    public void P() {
        synchronized (this.f10921e) {
            a(this.f10920d);
        }
    }

    public Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put("sc", this.f10918a.a(oj.f9829q));
        hashMap.put("sc2", this.f10918a.a(oj.f9837r));
        hashMap.put("sc3", this.f10918a.a(oj.f9845s));
        hashMap.put("server_installed_at", this.f10918a.a(oj.f9851t));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f10918a.a(qj.f10359H), hashMap);
        return hashMap;
    }

    public AbstractC0719l0.a f() {
        List<String> list;
        AbstractC0719l0.a b8 = AbstractC0719l0.b(this.f10919c);
        if (b8 == null) {
            return new AbstractC0719l0.a();
        }
        if (((Boolean) this.f10918a.a(oj.f9608I3)).booleanValue()) {
            if (b8.c() && !((Boolean) this.f10918a.a(oj.f9601H3)).booleanValue()) {
                b8.a("");
            }
            f10916i.set(b8);
        } else {
            b8 = new AbstractC0719l0.a();
        }
        String str = null;
        if (this.f10918a.C0().get()) {
            list = this.f10918a.g0().getTestDeviceAdvertisingIds();
        } else if (this.f10918a.I() != null) {
            list = this.f10918a.I().getTestDeviceAdvertisingIds();
        } else {
            list = null;
        }
        if (list != null) {
            String a6 = b8.a();
            if (StringUtils.isValidString(a6)) {
                this.f10923g = list.contains(a6);
            }
            b B5 = B();
            if (B5 != null) {
                str = B5.f10926a;
            }
            if (StringUtils.isValidString(str)) {
                this.f10923g = list.contains(str) | this.f10923g;
            }
        } else {
            this.f10923g = false;
        }
        return b8;
    }

    public Map j() {
        b4.d a6 = this.f10918a.r().a();
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

    public Map l() {
        return a(false);
    }

    public String v() {
        if (AppLovinSdkUtils.isFireOS(this.f10919c)) {
            return "fireos";
        }
        return "android";
    }

    public /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String C8 = C();
            if (StringUtils.isValidString(C8)) {
                this.f10918a.L();
                if (t.a()) {
                    this.f10918a.L().a("DataCollector", "Successfully retrieved bid token");
                }
                bc.a(appLovinBidTokenCollectionListener, C8);
                return;
            }
            this.f10918a.L();
            if (t.a()) {
                this.f10918a.L().b("DataCollector", "Empty bid token");
            }
            bc.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th) {
            if (t.a()) {
                this.b.a("DataCollector", "Failed to collect bid token", th);
            }
            this.f10918a.B().a("DataCollector", "collectBidToken", th);
            bc.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    public void a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f10918a.l0().a((xl) new kn(this.f10918a, ((Boolean) this.f10918a.a(oj.f9692V3)).booleanValue(), "DataCollector", new A4.d(17, this, appLovinBidTokenCollectionListener)), sm.b.CORE);
    }

    private String c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i9 = 0; i9 < length; i9++) {
            cArr[i9] = str.charAt(i9);
            for (int i10 = 9; i10 >= 0; i10--) {
                cArr[i9] = (char) (cArr[i9] ^ iArr[i10]);
            }
        }
        return new String(cArr);
    }

    public Map a(Map map, boolean z8, boolean z9) {
        HashMap hashMap = new HashMap(64);
        Map a6 = a(z8);
        Map A8 = A();
        Map j7 = j();
        Map N8 = N();
        Map k02 = this.f10918a.k0();
        if (z9) {
            hashMap.put("device_info", a6);
            hashMap.put("app_info", A8);
            if (j7 != null) {
                hashMap.put("connection_info", j7);
            }
            if (map != null) {
                hashMap.put("ad_info", map);
            }
            if (N8 != null) {
                hashMap.put("location_info", N8);
            }
            if (k02 != null && !k02.isEmpty()) {
                hashMap.put("targeting_data", k02);
            }
        } else {
            hashMap.putAll(a6);
            hashMap.putAll(A8);
            if (j7 != null) {
                hashMap.putAll(j7);
            }
            if (map != null) {
                hashMap.putAll(map);
            }
            if (N8 != null) {
                hashMap.putAll(N8);
            }
            if (k02 != null && !k02.isEmpty()) {
                hashMap.putAll(k02);
            }
        }
        hashMap.put("accept", "custom_size,launch_app,video");
        hashMap.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f10918a.Q(), hashMap);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f10918a.A(), hashMap);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f10918a.a(oj.f9685U3), hashMap);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f10918a.o0()), hashMap);
        if (!((Boolean) this.f10918a.a(oj.f9790j5)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f10918a.d0());
        }
        hashMap.putAll(e());
        if (((Boolean) this.f10918a.a(oj.f9627L4)).booleanValue()) {
            ba F4 = this.f10918a.F();
            hashMap.put("li", Long.valueOf(F4.b(aa.f6597e)));
            hashMap.put("si", Long.valueOf(F4.b(aa.f6600h)));
            hashMap.put("mad", Long.valueOf(F4.b(aa.f6598f)));
            hashMap.put("msad", Long.valueOf(F4.b(aa.f6601i)));
            hashMap.put("pf", Long.valueOf(F4.b(aa.m)));
            hashMap.put("mpf", Long.valueOf(F4.b(aa.f6610t)));
            hashMap.put("gpf", Long.valueOf(F4.b(aa.f6604n)));
            hashMap.put("asoac", Long.valueOf(F4.b(aa.f6608r)));
        }
        hashMap.put("rid", UUID.randomUUID().toString());
        return hashMap;
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.f10919c.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
    }

    public Map a(boolean z8) {
        Map map;
        synchronized (this.f10921e) {
            map = CollectionUtils.map(this.f10920d);
        }
        return a(map, z8);
    }

    private void a(Map map) {
        if (((Boolean) this.f10918a.a(oj.f9739c4)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(d()));
        }
        if (((Boolean) this.f10918a.a(oj.f9746d4)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(o()));
        }
        if (((Boolean) this.f10918a.a(oj.f9797k4)).booleanValue() && zp.d(this.f10918a)) {
            tr.a(this.f10918a);
        }
        if (((Boolean) this.f10918a.a(oj.f9884x4)).booleanValue()) {
            tr.b(this.f10918a);
        }
        if (((Boolean) this.f10918a.a(oj.f9789j4)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.f10918a.a(oj.f9759f4)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(J()));
        }
        if (((Boolean) this.f10918a.a(oj.f9812n4)).booleanValue()) {
            boolean z8 = false;
            boolean z9 = this.f10919c.getResources().getConfiguration().keyboard == 2;
            boolean hasSystemFeature = this.f10919c.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
            boolean hasSystemFeature2 = this.f10919c.getPackageManager().hasSystemFeature("android.hardware.type.pc");
            if (z9 && (hasSystemFeature || hasSystemFeature2)) {
                z8 = true;
            }
            map.put("is_pc", Boolean.valueOf(z8));
        }
        if (((Boolean) this.f10918a.a(oj.f9898z4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", D(), map);
        }
    }

    private Map a(Map map, boolean z8) {
        AbstractC0719l0.a f9;
        PowerManager powerManager;
        Map map2 = CollectionUtils.map(map);
        Point b8 = x3.b(this.f10919c);
        map2.put("dx", Integer.valueOf(b8.x));
        map2.put("dy", Integer.valueOf(b8.y));
        if (z8) {
            f9 = (AbstractC0719l0.a) f10916i.get();
            if (f9 != null) {
                O();
            } else if (zp.h()) {
                f9 = new AbstractC0719l0.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                f9 = f();
            }
        } else {
            f9 = f();
        }
        String a6 = f9.a();
        if (StringUtils.isValidString(a6)) {
            map2.put("idfa", a6);
        }
        map2.put("dnt", Boolean.valueOf(f9.c()));
        map2.put("dnt_code", f9.b().b());
        b bVar = (b) f10917j.get();
        if (((Boolean) this.f10918a.a(oj.f9614J3)).booleanValue() && bVar != null) {
            map2.put("idfv", bVar.f10926a);
            map2.put("idfv_scope", Integer.valueOf(bVar.b));
        }
        Boolean b9 = y3.b().b(this.f10919c);
        if (b9 != null) {
            map2.put("huc", b9);
        }
        Boolean b10 = y3.c().b(this.f10919c);
        if (b10 != null) {
            map2.put("aru", b10);
        }
        Boolean b11 = y3.a().b(this.f10919c);
        if (b11 != null) {
            map2.put("dns", b11);
        }
        if (((Boolean) this.f10918a.a(oj.f9698W3)).booleanValue()) {
            c h6 = h();
            CollectionUtils.putIntegerIfValid("act", Integer.valueOf(h6.f10927a), map2);
            CollectionUtils.putIntegerIfValid("acm", Integer.valueOf(h6.b), map2);
            CollectionUtils.putBooleanIfValid("sowpie", h6.f10928c, map2);
        }
        if (((Boolean) this.f10918a.a(oj.e4)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.f10918a.f0().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.f10918a.a(oj.f9774h4)).booleanValue()) {
            map2.put("adr", Boolean.valueOf(I()));
        }
        Integer n2 = z8 ? (Integer) this.f10924h.get() : n();
        if (n2 != null) {
            map2.put("volume", n2);
        }
        CollectionUtils.putBooleanIfValid("ma", r(), map2);
        CollectionUtils.putBooleanIfValid("spo", s(), map2);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.f10918a.f0().isApplicationPaused()), map2);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.f10918a.f0().getAppEnteredForegroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.f10918a.f0().getAppEnteredBackgroundTimeMillis()), map2);
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.f10919c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e4) {
            if (t.a()) {
                this.b.a("DataCollector", "Unable to collect screen brightness", e4);
            }
        }
        if (((Boolean) this.f10918a.a(oj.f9797k4)).booleanValue() && zp.d(this.f10918a)) {
            tr.a(this.f10918a);
            String a9 = tr.a();
            if (StringUtils.isValidString(a9)) {
                map2.put("ua", a9);
            }
        }
        if (((Boolean) this.f10918a.a(oj.f9884x4)).booleanValue()) {
            tr.b(this.f10918a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(tr.d()), map2);
            CollectionUtils.putStringIfValid("wvv", tr.c(), map2);
            CollectionUtils.putStringIfValid("wvpn", tr.b(), map2);
        }
        if (((Boolean) this.f10918a.a(oj.f9712Y3)).booleanValue()) {
            try {
                map2.put("fs", Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th) {
                map2.put("fs", -1);
                map2.put("tds", -1);
                if (t.a()) {
                    this.b.a("DataCollector", "Unable to collect total & free space.", th);
                }
            }
        }
        if (((Boolean) this.f10918a.a(oj.f9718Z3)).booleanValue()) {
            ActivityManager.MemoryInfo a10 = zp.a((ActivityManager) this.f10919c.getSystemService("activity"));
            if (a10 != null) {
                map2.put("fm", Long.valueOf(a10.availMem));
                map2.put("tm", Long.valueOf(a10.totalMem));
                map2.put("lmt", Long.valueOf(a10.threshold));
                map2.put("lm", Boolean.valueOf(a10.lowMemory));
            } else {
                map2.put("fm", -1);
                map2.put("tm", -1);
                map2.put("lmt", -1);
            }
        }
        if (((Boolean) this.f10918a.a(oj.f9725a4)).booleanValue() && x3.a("android.permission.READ_PHONE_STATE", this.f10919c) && x3.h()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.f10919c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.f10918a.a(oj.f9705X3)).booleanValue()) {
            String w2 = w();
            if (!TextUtils.isEmpty(w2)) {
                map2.put("so", w2);
            }
        }
        map2.put("orientation_lock", g());
        if (((Boolean) this.f10918a.a(oj.f9731b4)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(zp.j()));
        }
        if (x3.f() && (powerManager = (PowerManager) this.f10919c.getSystemService("power")) != null) {
            map2.put("lpm", Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.f10918a.a(oj.f9801l4)).booleanValue() && this.f10918a.e0() != null) {
            map2.put("da", Float.valueOf(this.f10918a.e0().a()));
        }
        if (((Boolean) this.f10918a.a(oj.f9806m4)).booleanValue() && this.f10918a.e0() != null) {
            map2.put("dm", Float.valueOf(this.f10918a.e0().b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.f10918a.m().a()));
        map2.put("network", c4.g(this.f10918a));
        String m = m();
        if (StringUtils.isValidString(m)) {
            map2.put("kb", m);
        }
        ArrayService l = this.f10918a.l();
        if (l.isAppHubInstalled()) {
            if (l.getIsDirectDownloadEnabled() != null) {
                map2.put("ah_dd_enabled", l.getIsDirectDownloadEnabled());
            }
            map2.put("ah_sdk_version_code", Long.valueOf(l.getAppHubVersionCode()));
            map2.put("ah_random_user_token", StringUtils.emptyIfNull(l.getRandomUserToken()));
            map2.put("ah_sdk_package_name", StringUtils.emptyIfNull(l.getAppHubPackageName()));
        }
        return map2;
    }

    public static void a(AbstractC0719l0.a aVar) {
        f10916i.set(aVar);
    }

    public static void a(b bVar) {
        f10917j.set(bVar);
    }

    private boolean a(String str) {
        return b(str) == 1;
    }
}
