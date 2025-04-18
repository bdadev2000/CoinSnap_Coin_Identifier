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
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.c4;
import com.applovin.impl.dm;
import com.applovin.impl.kn;
import com.applovin.impl.l0;
import com.applovin.impl.oj;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.x3;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class n {
    private static final AtomicReference D = new AtomicReference();
    private static final AtomicReference E = new AtomicReference();
    private static final AtomicReference F = new AtomicReference();
    private final int A;
    private final k B;
    private final Context C;
    private final i a;

    /* renamed from: b, reason: collision with root package name */
    private final j f7775b;

    /* renamed from: c, reason: collision with root package name */
    private final d f7776c;

    /* renamed from: d, reason: collision with root package name */
    private final e f7777d;

    /* renamed from: e, reason: collision with root package name */
    private final g f7778e;

    /* renamed from: f, reason: collision with root package name */
    private final h f7779f;

    /* renamed from: g, reason: collision with root package name */
    private final String f7780g;

    /* renamed from: h, reason: collision with root package name */
    private final String f7781h;

    /* renamed from: i, reason: collision with root package name */
    private final double f7782i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f7783j;

    /* renamed from: k, reason: collision with root package name */
    private String f7784k;

    /* renamed from: l, reason: collision with root package name */
    private long f7785l;

    /* renamed from: m, reason: collision with root package name */
    private final b f7786m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f7787n;

    /* renamed from: o, reason: collision with root package name */
    private f f7788o;

    /* renamed from: p, reason: collision with root package name */
    private f f7789p;

    /* renamed from: q, reason: collision with root package name */
    private f f7790q;

    /* renamed from: r, reason: collision with root package name */
    private f f7791r;

    /* renamed from: s, reason: collision with root package name */
    private f f7792s;

    /* renamed from: t, reason: collision with root package name */
    private f f7793t;
    private f u;

    /* renamed from: v, reason: collision with root package name */
    private final int f7794v;

    /* renamed from: w, reason: collision with root package name */
    private final int f7795w;

    /* renamed from: x, reason: collision with root package name */
    private final int f7796x;

    /* renamed from: y, reason: collision with root package name */
    private final int f7797y;

    /* renamed from: z, reason: collision with root package name */
    private final int f7798z;

    /* loaded from: classes.dex */
    public class a implements dm.a {
        public a() {
        }

        @Override // com.applovin.impl.dm.a
        public void a(l0.a aVar) {
            n.D.set(aVar);
        }
    }

    /* loaded from: classes.dex */
    public class b {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final String f7799b;

        /* renamed from: c, reason: collision with root package name */
        private final String f7800c;

        /* renamed from: d, reason: collision with root package name */
        private final String f7801d;

        /* renamed from: e, reason: collision with root package name */
        private final String f7802e;

        /* renamed from: f, reason: collision with root package name */
        private final Long f7803f;

        /* renamed from: g, reason: collision with root package name */
        private final long f7804g;

        /* renamed from: h, reason: collision with root package name */
        private final int f7805h;

        /* renamed from: i, reason: collision with root package name */
        private final int f7806i;

        public /* synthetic */ b(n nVar, a aVar) {
            this();
        }

        public Long a() {
            return this.f7803f;
        }

        public long b() {
            return this.f7804g;
        }

        public Long c() {
            k kVar = n.this.B;
            qj qjVar = qj.f7225f;
            Long l10 = (Long) kVar.a(qjVar);
            if (l10 != null) {
                return l10;
            }
            n.this.B.b(qjVar, Long.valueOf(this.f7804g));
            return null;
        }

        public String d() {
            return this.f7802e;
        }

        public String e() {
            return this.a;
        }

        public String f() {
            return this.f7800c;
        }

        public int g() {
            return this.f7806i;
        }

        public String h() {
            return this.f7799b;
        }

        public int i() {
            return this.f7805h;
        }

        public String j() {
            return this.f7801d;
        }

        private b() {
            PackageManager packageManager = n.this.C.getPackageManager();
            ApplicationInfo applicationInfo = n.this.C.getApplicationInfo();
            File file = new File(applicationInfo.sourceDir);
            PackageInfo packageInfo = packageManager.getPackageInfo(n.this.C.getPackageName(), 0);
            this.a = packageManager.getApplicationLabel(applicationInfo).toString();
            this.f7799b = packageInfo.versionName;
            this.f7805h = packageInfo.versionCode;
            String str = applicationInfo.packageName;
            this.f7800c = str;
            this.f7801d = StringUtils.toShortSHA1Hash(str);
            this.f7804g = file.lastModified();
            this.f7803f = Long.valueOf(packageInfo.firstInstallTime);
            this.f7806i = applicationInfo.targetSdkVersion;
            this.f7802e = packageManager.getInstallerPackageName(str);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7808b;

        public c(String str, int i10) {
            this.a = str;
            this.f7808b = i10;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.f7808b;
        }
    }

    /* loaded from: classes.dex */
    public class d {
        private f a;

        /* renamed from: b, reason: collision with root package name */
        private f f7809b;

        /* renamed from: c, reason: collision with root package name */
        private f f7810c;

        /* renamed from: d, reason: collision with root package name */
        private f f7811d;

        /* renamed from: e, reason: collision with root package name */
        private f f7812e;

        /* renamed from: f, reason: collision with root package name */
        private final AudioManager f7813f;

        public /* synthetic */ d(n nVar, a aVar) {
            this();
        }

        public Integer a() {
            f fVar = this.a;
            if (fVar != null && !fVar.b()) {
                Integer num = (Integer) this.a.a;
                num.intValue();
                return num;
            }
            if (this.f7813f == null) {
                return null;
            }
            try {
                f fVar2 = new f(n.this, Integer.valueOf((int) (this.f7813f.getStreamVolume(3) * ((Float) n.this.B.a(oj.f6677i4)).floatValue())), n.this.f7795w, null);
                this.a = fVar2;
                Integer num2 = (Integer) fVar2.a;
                num2.intValue();
                return num2;
            } catch (Throwable th2) {
                n.this.B.L();
                if (t.a()) {
                    n.this.B.L().a("DataProvider", "Unable to collect device volume", th2);
                }
                return null;
            }
        }

        public int b() {
            f fVar = this.f7810c;
            if (fVar != null && !fVar.b()) {
                return ((Integer) this.f7810c.a).intValue();
            }
            n nVar = n.this;
            f fVar2 = new f(nVar, Integer.valueOf(nVar.B.m().a()), n.this.f7796x, null);
            this.f7810c = fVar2;
            return ((Integer) fVar2.a).intValue();
        }

        public String c() {
            f fVar = this.f7809b;
            if (fVar != null && !fVar.b()) {
                return (String) this.f7809b.a;
            }
            if (this.f7813f == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            if (x3.g()) {
                for (AudioDeviceInfo audioDeviceInfo : this.f7813f.getDevices(2)) {
                    sb2.append(audioDeviceInfo.getType());
                    sb2.append(",");
                }
            } else {
                if (this.f7813f.isWiredHeadsetOn()) {
                    sb2.append("3,");
                }
                if (this.f7813f.isBluetoothScoOn()) {
                    sb2.append("7,");
                }
                if (this.f7813f.isBluetoothA2dpOn()) {
                    sb2.append(8);
                }
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            String sb3 = sb2.toString();
            if (TextUtils.isEmpty(sb3)) {
                n.this.B.L();
                if (t.a()) {
                    n.this.B.L().a("DataProvider", "No sound outputs detected");
                }
            }
            f fVar2 = new f(n.this, sb3, r3.f7797y, null);
            this.f7809b = fVar2;
            return (String) fVar2.a;
        }

        public Boolean d() {
            f fVar = this.f7811d;
            if (fVar != null && !fVar.b()) {
                Boolean bool = (Boolean) this.f7811d.a;
                bool.booleanValue();
                return bool;
            }
            AudioManager audioManager = this.f7813f;
            if (audioManager == null) {
                return null;
            }
            f fVar2 = new f(n.this, Boolean.valueOf(audioManager.isMusicActive()), n.this.f7797y, null);
            this.f7811d = fVar2;
            Boolean bool2 = (Boolean) fVar2.a;
            bool2.booleanValue();
            return bool2;
        }

        public Boolean e() {
            f fVar = this.f7812e;
            if (fVar != null && !fVar.b()) {
                Boolean bool = (Boolean) this.f7812e.a;
                bool.booleanValue();
                return bool;
            }
            AudioManager audioManager = this.f7813f;
            if (audioManager == null) {
                return null;
            }
            f fVar2 = new f(n.this, Boolean.valueOf(audioManager.isSpeakerphoneOn()), n.this.f7797y, null);
            this.f7812e = fVar2;
            Boolean bool2 = (Boolean) fVar2.a;
            bool2.booleanValue();
            return bool2;
        }

        private d() {
            this.f7813f = (AudioManager) n.this.C.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        }
    }

    /* loaded from: classes.dex */
    public class e {
        private f a;

        /* renamed from: b, reason: collision with root package name */
        private f f7815b;

        /* renamed from: c, reason: collision with root package name */
        private f f7816c;

        /* renamed from: d, reason: collision with root package name */
        private final Intent f7817d;

        /* renamed from: e, reason: collision with root package name */
        private BatteryManager f7818e;

        public /* synthetic */ e(n nVar, a aVar) {
            this();
        }

        public Integer a() {
            int i10;
            BatteryManager batteryManager;
            f fVar = this.a;
            if (fVar != null && !fVar.b()) {
                Integer num = (Integer) this.a.a;
                num.intValue();
                return num;
            }
            if (x3.f() && (batteryManager = this.f7818e) != null) {
                i10 = batteryManager.getIntProperty(4);
            } else {
                Intent intent = this.f7817d;
                if (intent == null) {
                    return null;
                }
                int intExtra = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                int intExtra2 = this.f7817d.getIntExtra("scale", -1);
                if (intExtra < 0 || intExtra2 < 0) {
                    return null;
                }
                i10 = (int) ((intExtra / intExtra2) * 100.0f);
            }
            f fVar2 = new f(n.this, Integer.valueOf(i10), n.this.f7796x, null);
            this.a = fVar2;
            Integer num2 = (Integer) fVar2.a;
            num2.intValue();
            return num2;
        }

        public Integer b() {
            int intExtra;
            BatteryManager batteryManager;
            f fVar = this.f7815b;
            if (fVar != null && !fVar.b()) {
                Integer num = (Integer) this.f7815b.a;
                num.intValue();
                return num;
            }
            if (x3.i() && (batteryManager = this.f7818e) != null) {
                intExtra = batteryManager.getIntProperty(6);
            } else {
                Intent intent = this.f7817d;
                if (intent == null || (intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1)) < 0) {
                    return null;
                }
            }
            f fVar2 = new f(n.this, Integer.valueOf(intExtra), n.this.f7796x, null);
            this.f7815b = fVar2;
            Integer num2 = (Integer) fVar2.a;
            num2.intValue();
            return num2;
        }

        public Boolean c() {
            f fVar = this.f7816c;
            if (fVar != null && !fVar.b()) {
                Boolean bool = (Boolean) this.f7816c.a;
                bool.booleanValue();
                return bool;
            }
            boolean z10 = false;
            if (x3.d()) {
                if (Settings.Global.getInt(n.this.C.getContentResolver(), "stay_on_while_plugged_in", -1) > 0) {
                    z10 = true;
                }
                this.f7816c = new f(n.this, Boolean.valueOf(z10), n.this.f7796x, null);
            } else {
                Intent intent = this.f7817d;
                if (intent == null) {
                    return null;
                }
                int intExtra = (intent.getIntExtra("plugged", -1) & 1) | 14;
                n nVar = n.this;
                if (intExtra > 0) {
                    z10 = true;
                }
                this.f7816c = new f(nVar, Boolean.valueOf(z10), n.this.f7796x, null);
            }
            Boolean bool2 = (Boolean) this.f7816c.a;
            bool2.booleanValue();
            return bool2;
        }

        private e() {
            this.f7817d = n.this.C.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (x3.f()) {
                this.f7818e = (BatteryManager) n.this.C.getSystemService("batterymanager");
            }
        }
    }

    /* loaded from: classes.dex */
    public class f {
        private final Object a;

        /* renamed from: b, reason: collision with root package name */
        private final long f7820b;

        public /* synthetic */ f(n nVar, Object obj, long j3, a aVar) {
            this(obj, j3);
        }

        private f(Object obj, long j3) {
            this.a = obj;
            this.f7820b = a() + j3;
        }

        private long a() {
            return System.currentTimeMillis() / 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b() {
            return !((Boolean) n.this.B.a(oj.G3)).booleanValue() || this.f7820b - a() <= 0;
        }
    }

    /* loaded from: classes.dex */
    public class g {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private int f7822b;

        /* renamed from: c, reason: collision with root package name */
        private int f7823c;

        /* renamed from: d, reason: collision with root package name */
        private float f7824d;

        /* renamed from: e, reason: collision with root package name */
        private float f7825e;

        /* renamed from: f, reason: collision with root package name */
        private float f7826f;

        /* renamed from: g, reason: collision with root package name */
        private double f7827g;

        /* renamed from: h, reason: collision with root package name */
        private final Boolean f7828h;

        public /* synthetic */ g(n nVar, a aVar) {
            this();
        }

        public float a() {
            return this.f7826f;
        }

        public int b() {
            return this.f7823c;
        }

        public int c() {
            return this.a;
        }

        public int d() {
            return this.f7822b;
        }

        public Boolean e() {
            return this.f7828h;
        }

        public double f() {
            return this.f7827g;
        }

        public float g() {
            return this.f7824d;
        }

        public float h() {
            return this.f7825e;
        }

        private g() {
            Boolean bool;
            boolean isScreenHdr;
            if (x3.i()) {
                isScreenHdr = n.this.C.getResources().getConfiguration().isScreenHdr();
                bool = Boolean.valueOf(isScreenHdr);
            } else {
                bool = null;
            }
            this.f7828h = bool;
            DisplayMetrics displayMetrics = n.this.C.getResources().getDisplayMetrics();
            if (displayMetrics == null) {
                return;
            }
            this.f7826f = displayMetrics.density;
            this.f7824d = displayMetrics.xdpi;
            this.f7825e = displayMetrics.ydpi;
            this.f7823c = displayMetrics.densityDpi;
            Point b3 = x3.b(n.this.C);
            int i10 = b3.x;
            this.a = i10;
            this.f7822b = b3.y;
            this.f7827g = Math.sqrt(Math.pow(this.f7822b, 2.0d) + Math.pow(i10, 2.0d)) / this.f7824d;
        }
    }

    /* loaded from: classes.dex */
    public class h {
        private long a;

        /* renamed from: b, reason: collision with root package name */
        private f f7830b;

        /* renamed from: c, reason: collision with root package name */
        private f f7831c;

        /* renamed from: d, reason: collision with root package name */
        private f f7832d;

        /* renamed from: e, reason: collision with root package name */
        private final ActivityManager f7833e;

        public /* synthetic */ h(n nVar, a aVar) {
            this();
        }

        public Long a() {
            f fVar = this.f7830b;
            if (fVar != null && !fVar.b()) {
                Long l10 = (Long) this.f7830b.a;
                l10.longValue();
                return l10;
            }
            ActivityManager.MemoryInfo a = zp.a(this.f7833e);
            if (a == null) {
                return null;
            }
            f fVar2 = new f(n.this, Long.valueOf(a.availMem), n.this.f7794v, null);
            this.f7830b = fVar2;
            Long l11 = (Long) fVar2.a;
            l11.longValue();
            return l11;
        }

        public Long b() {
            f fVar = this.f7831c;
            if (fVar != null && !fVar.b()) {
                Long l10 = (Long) this.f7831c.a;
                l10.longValue();
                return l10;
            }
            ActivityManager.MemoryInfo a = zp.a(this.f7833e);
            if (a == null) {
                return null;
            }
            f fVar2 = new f(n.this, Long.valueOf(a.threshold), n.this.f7794v, null);
            this.f7831c = fVar2;
            Long l11 = (Long) fVar2.a;
            l11.longValue();
            return l11;
        }

        public long c() {
            return this.a;
        }

        public Boolean d() {
            f fVar = this.f7832d;
            if (fVar != null && !fVar.b()) {
                Boolean bool = (Boolean) this.f7832d.a;
                bool.booleanValue();
                return bool;
            }
            ActivityManager.MemoryInfo a = zp.a(this.f7833e);
            if (a == null) {
                return null;
            }
            f fVar2 = new f(n.this, Boolean.valueOf(a.lowMemory), n.this.f7794v, null);
            this.f7832d = fVar2;
            Boolean bool2 = (Boolean) fVar2.a;
            bool2.booleanValue();
            return bool2;
        }

        private h() {
            ActivityManager.MemoryInfo a;
            ActivityManager activityManager = (ActivityManager) n.this.C.getSystemService("activity");
            this.f7833e = activityManager;
            if (activityManager == null || (a = zp.a(activityManager)) == null) {
                return;
            }
            this.a = a.totalMem;
        }
    }

    /* loaded from: classes.dex */
    public class i {
        private final PowerManager a;

        public /* synthetic */ i(n nVar, a aVar) {
            this();
        }

        public Integer a() {
            if (n.this.f7788o != null && !n.this.f7788o.b()) {
                Integer num = (Integer) n.this.f7788o.a;
                num.intValue();
                return num;
            }
            if (this.a != null && x3.f()) {
                n nVar = n.this;
                nVar.f7788o = new f(nVar, Integer.valueOf(this.a.isPowerSaveMode() ? 1 : 0), n.this.f7796x, null);
                Integer num2 = (Integer) n.this.f7788o.a;
                num2.intValue();
                return num2;
            }
            return null;
        }

        private i() {
            this.a = (PowerManager) n.this.C.getSystemService("power");
        }
    }

    /* loaded from: classes.dex */
    public class j {
        private final TelephonyManager a;

        /* renamed from: b, reason: collision with root package name */
        private String f7836b;

        /* renamed from: c, reason: collision with root package name */
        private String f7837c;

        /* renamed from: d, reason: collision with root package name */
        private String f7838d;

        /* renamed from: e, reason: collision with root package name */
        private String f7839e;

        /* renamed from: f, reason: collision with root package name */
        private String f7840f;

        /* renamed from: g, reason: collision with root package name */
        private f f7841g;

        public /* synthetic */ j(n nVar, a aVar) {
            this();
        }

        public String a() {
            return this.f7838d;
        }

        public String b() {
            return this.f7837c;
        }

        public Integer c() {
            f fVar = this.f7841g;
            if (fVar != null && !fVar.b()) {
                Integer num = (Integer) this.f7841g.a;
                num.intValue();
                return num;
            }
            if (x3.a("android.permission.READ_PHONE_STATE", n.this.C) && this.a != null && x3.h()) {
                f fVar2 = new f(n.this, Integer.valueOf(this.a.getDataNetworkType()), n.this.A, null);
                this.f7841g = fVar2;
                Integer num2 = (Integer) fVar2.a;
                num2.intValue();
                return num2;
            }
            return null;
        }

        public String d() {
            return this.f7839e;
        }

        public String e() {
            return this.f7840f;
        }

        private j() {
            TelephonyManager telephonyManager = (TelephonyManager) n.this.C.getSystemService("phone");
            this.a = telephonyManager;
            if (telephonyManager == null) {
                return;
            }
            this.f7837c = telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH);
            try {
                this.f7838d = telephonyManager.getNetworkOperatorName();
            } catch (Throwable th2) {
                n.this.B.L();
                if (t.a()) {
                    n.this.B.L().a("DataProvider", "Unable to collect carrier", th2);
                }
            }
            try {
                this.f7836b = this.a.getNetworkOperator();
            } catch (Throwable th3) {
                n.this.B.L();
                if (t.a()) {
                    n.this.B.L().a("DataProvider", "Unable to collect get network operator", th3);
                }
            }
            String str = this.f7836b;
            if (str == null) {
                return;
            }
            int min = Math.min(3, str.length());
            this.f7839e = this.f7836b.substring(0, min);
            this.f7840f = this.f7836b.substring(min);
        }
    }

    public n(k kVar) {
        String str;
        boolean z10;
        this.B = kVar;
        Context k10 = k.k();
        this.C = k10;
        this.f7794v = ((Integer) kVar.a(oj.C4)).intValue();
        this.f7795w = ((Integer) kVar.a(oj.D4)).intValue();
        this.f7796x = ((Integer) kVar.a(oj.E4)).intValue();
        this.f7797y = ((Integer) kVar.a(oj.F4)).intValue();
        this.f7798z = ((Integer) kVar.a(oj.G4)).intValue();
        this.A = ((Integer) kVar.a(oj.H4)).intValue();
        a aVar = null;
        this.a = new i(this, aVar);
        this.f7775b = new j(this, aVar);
        this.f7776c = new d(this, aVar);
        this.f7777d = new e(this, aVar);
        this.f7778e = new g(this, aVar);
        this.f7779f = new h(this, aVar);
        if (AppLovinSdkUtils.isFireOS(k10)) {
            str = "fireos";
        } else {
            str = "android";
        }
        this.f7780g = str;
        int orientation = AppLovinSdkUtils.getOrientation(k10);
        if (orientation == 1) {
            this.f7781h = "portrait";
        } else if (orientation == 2) {
            this.f7781h = "landscape";
        } else {
            this.f7781h = "none";
        }
        this.f7782i = Math.round((TimeZone.getDefault().getOffset(new Date().getTime()) * 10.0d) / 3600000.0d) / 10.0d;
        SensorManager sensorManager = (SensorManager) k10.getSystemService("sensor");
        if (sensorManager != null && sensorManager.getDefaultSensor(4) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f7783j = z10;
        if (x3.h()) {
            LocaleList locales = k10.getResources().getConfiguration().getLocales();
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < locales.size(); i10++) {
                sb2.append(locales.get(i10));
                sb2.append(",");
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            this.f7784k = sb2.toString();
        }
        try {
            this.f7785l = Environment.getDataDirectory().getTotalSpace();
        } catch (Throwable th2) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("DataProvider", "Unable to collect total disk space.", th2);
            }
        }
        this.f7786m = new b(this, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        F.set(this.f7776c.a());
    }

    public long A() {
        return this.f7785l;
    }

    public Integer B() {
        return (Integer) F.get();
    }

    public boolean C() {
        boolean z10;
        if (this.C.getResources().getConfiguration().keyboard == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean hasSystemFeature = this.C.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
        boolean hasSystemFeature2 = this.C.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        if (z10 && (hasSystemFeature || hasSystemFeature2)) {
            return true;
        }
        return false;
    }

    public boolean D() {
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

    public boolean E() {
        return this.f7783j;
    }

    public boolean F() {
        ConnectivityManager connectivityManager;
        if (!x3.h() || (connectivityManager = (ConnectivityManager) this.C.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            if (connectivityManager.getRestrictBackgroundStatus() != 3) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            this.B.L();
            if (t.a()) {
                this.B.L().a("DataProvider", "Unable to collect constrained network info.", th2);
            }
            return false;
        }
    }

    public boolean G() {
        return this.f7787n;
    }

    public boolean H() {
        f fVar = this.f7790q;
        if (fVar != null && !fVar.b()) {
            return ((Boolean) this.f7790q.a).booleanValue();
        }
        f fVar2 = new f(this, Boolean.valueOf(zp.j()), this.f7797y, null);
        this.f7790q = fVar2;
        return ((Boolean) fVar2.a).booleanValue();
    }

    public void J() {
        sm l02 = this.B.l0();
        dm dmVar = new dm(this.B, new a());
        sm.b bVar = sm.b.OTHER;
        l02.a((xl) dmVar, bVar);
        this.B.l0().a((xl) new kn(this.B, true, "setDeviceVolume", new z(this, 5)), bVar);
    }

    public l0.a d() {
        List<String> testDeviceAdvertisingIds;
        l0.a b3 = l0.b(this.C);
        if (b3 == null) {
            return new l0.a();
        }
        if (((Boolean) this.B.a(oj.I3)).booleanValue()) {
            if (b3.c() && !((Boolean) this.B.a(oj.H3)).booleanValue()) {
                b3.a("");
            }
            D.set(b3);
        } else {
            b3 = new l0.a();
        }
        if (this.B.C0().get()) {
            testDeviceAdvertisingIds = this.B.g0().getTestDeviceAdvertisingIds();
        } else {
            testDeviceAdvertisingIds = this.B.I() != null ? this.B.I().getTestDeviceAdvertisingIds() : null;
        }
        if (testDeviceAdvertisingIds != null) {
            String a10 = b3.a();
            if (StringUtils.isValidString(a10)) {
                this.f7787n = testDeviceAdvertisingIds.contains(a10);
            }
            c h10 = h();
            String a11 = h10 != null ? h10.a() : null;
            if (StringUtils.isValidString(a11)) {
                this.f7787n = testDeviceAdvertisingIds.contains(a11) | this.f7787n;
            }
        } else {
            this.f7787n = false;
        }
        return b3;
    }

    public e j() {
        return this.f7777d;
    }

    public Float k() {
        f fVar = this.f7791r;
        if (fVar != null && !fVar.b()) {
            Float f10 = (Float) this.f7791r.a;
            f10.floatValue();
            return f10;
        }
        if (this.B.e0() == null) {
            return null;
        }
        f fVar2 = new f(this, Float.valueOf(this.B.e0().a()), this.f7794v, null);
        this.f7791r = fVar2;
        Float f11 = (Float) fVar2.a;
        f11.floatValue();
        return f11;
    }

    public Float l() {
        f fVar = this.f7792s;
        if (fVar != null && !fVar.b()) {
            Float f10 = (Float) this.f7792s.a;
            f10.floatValue();
            return f10;
        }
        if (this.B.e0() == null) {
            return null;
        }
        f fVar2 = new f(this, Float.valueOf(this.B.e0().b()), this.f7794v, null);
        this.f7792s = fVar2;
        Float f11 = (Float) fVar2.a;
        f11.floatValue();
        return f11;
    }

    public g m() {
        return this.f7778e;
    }

    public float n() {
        try {
            return Settings.System.getFloat(this.C.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e2) {
            this.B.L();
            if (t.a()) {
                this.B.L().a("DataProvider", "Error collecting font scale", e2);
                return -1.0f;
            }
            return -1.0f;
        }
    }

    public Long o() {
        f fVar = this.f7789p;
        if (fVar != null && !fVar.b()) {
            Long l10 = (Long) this.f7789p.a;
            l10.longValue();
            return l10;
        }
        try {
            f fVar2 = new f(this, Long.valueOf(Environment.getDataDirectory().getFreeSpace()), this.f7797y, null);
            this.f7789p = fVar2;
            Long l11 = (Long) fVar2.a;
            l11.longValue();
            return l11;
        } catch (Throwable th2) {
            this.B.L();
            if (t.a()) {
                this.B.L().a("DataProvider", "Unable to collect free space.", th2);
                return null;
            }
            return null;
        }
    }

    public String p() {
        return this.f7784k;
    }

    public h q() {
        return this.f7779f;
    }

    public String r() {
        f fVar = this.f7793t;
        if (fVar != null && !fVar.b()) {
            return (String) this.f7793t.a;
        }
        f fVar2 = new f(this, c4.g(this.B), this.A, null);
        this.f7793t = fVar2;
        return (String) fVar2.a;
    }

    public String s() {
        ActivityManager activityManager = (ActivityManager) this.C.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public String t() {
        return this.f7781h;
    }

    public String u() {
        return this.f7780g;
    }

    public i v() {
        return this.a;
    }

    public Integer w() {
        f fVar = this.u;
        if (fVar != null && !fVar.b()) {
            Integer num = (Integer) this.u.a;
            num.intValue();
            return num;
        }
        try {
            f fVar2 = new f(this, Integer.valueOf((int) ((Settings.System.getInt(this.C.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)), this.f7795w, null);
            this.u = fVar2;
            Integer num2 = (Integer) fVar2.a;
            num2.intValue();
            return num2;
        } catch (Settings.SettingNotFoundException e2) {
            this.B.L();
            if (t.a()) {
                this.B.L().a("DataProvider", "Unable to collect screen brightness", e2);
                return null;
            }
            return null;
        }
    }

    public JSONArray x() {
        if (x3.f()) {
            return CollectionUtils.toJSONArray(Build.SUPPORTED_ABIS);
        }
        JSONArray jSONArray = new JSONArray();
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI);
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI2);
        return jSONArray;
    }

    public j y() {
        return this.f7775b;
    }

    public double z() {
        return this.f7782i;
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
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
    public long e() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.n.e():long");
    }

    public l0.a f() {
        return (l0.a) D.get();
    }

    public b g() {
        return this.f7786m;
    }

    public c h() {
        return (c) E.get();
    }

    public d i() {
        return this.f7776c;
    }

    public static void a(c cVar) {
        E.set(cVar);
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.C.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void a(l0.a aVar) {
        D.set(aVar);
    }

    private boolean a(String str) {
        return b(str) == 1;
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
}
