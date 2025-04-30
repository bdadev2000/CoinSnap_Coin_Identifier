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
import com.applovin.impl.AbstractC0719l0;
import com.applovin.impl.c4;
import com.applovin.impl.dm;
import com.applovin.impl.kn;
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

    /* renamed from: D */
    private static final AtomicReference f10935D = new AtomicReference();

    /* renamed from: E */
    private static final AtomicReference f10936E = new AtomicReference();

    /* renamed from: F */
    private static final AtomicReference f10937F = new AtomicReference();

    /* renamed from: A */
    private final int f10938A;

    /* renamed from: B */
    private final k f10939B;

    /* renamed from: C */
    private final Context f10940C;

    /* renamed from: a */
    private final i f10941a;
    private final j b;

    /* renamed from: c */
    private final d f10942c;

    /* renamed from: d */
    private final e f10943d;

    /* renamed from: e */
    private final g f10944e;

    /* renamed from: f */
    private final h f10945f;

    /* renamed from: g */
    private final String f10946g;

    /* renamed from: h */
    private final String f10947h;

    /* renamed from: i */
    private final double f10948i;

    /* renamed from: j */
    private final boolean f10949j;

    /* renamed from: k */
    private String f10950k;
    private long l;
    private final b m;

    /* renamed from: n */
    private boolean f10951n;

    /* renamed from: o */
    private f f10952o;

    /* renamed from: p */
    private f f10953p;

    /* renamed from: q */
    private f f10954q;

    /* renamed from: r */
    private f f10955r;

    /* renamed from: s */
    private f f10956s;

    /* renamed from: t */
    private f f10957t;

    /* renamed from: u */
    private f f10958u;

    /* renamed from: v */
    private final int f10959v;

    /* renamed from: w */
    private final int f10960w;

    /* renamed from: x */
    private final int f10961x;

    /* renamed from: y */
    private final int f10962y;

    /* renamed from: z */
    private final int f10963z;

    /* loaded from: classes.dex */
    public class a implements dm.a {
        public a() {
        }

        @Override // com.applovin.impl.dm.a
        public void a(AbstractC0719l0.a aVar) {
            n.f10935D.set(aVar);
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        private final String f10965a;
        private final String b;

        /* renamed from: c */
        private final String f10966c;

        /* renamed from: d */
        private final String f10967d;

        /* renamed from: e */
        private final String f10968e;

        /* renamed from: f */
        private final Long f10969f;

        /* renamed from: g */
        private final long f10970g;

        /* renamed from: h */
        private final int f10971h;

        /* renamed from: i */
        private final int f10972i;

        public /* synthetic */ b(n nVar, a aVar) {
            this();
        }

        public Long a() {
            return this.f10969f;
        }

        public long b() {
            return this.f10970g;
        }

        public Long c() {
            k kVar = n.this.f10939B;
            qj qjVar = qj.f10370f;
            Long l = (Long) kVar.a(qjVar);
            if (l != null) {
                return l;
            }
            n.this.f10939B.b(qjVar, Long.valueOf(this.f10970g));
            return null;
        }

        public String d() {
            return this.f10968e;
        }

        public String e() {
            return this.f10965a;
        }

        public String f() {
            return this.f10966c;
        }

        public int g() {
            return this.f10972i;
        }

        public String h() {
            return this.b;
        }

        public int i() {
            return this.f10971h;
        }

        public String j() {
            return this.f10967d;
        }

        private b() {
            PackageManager packageManager = n.this.f10940C.getPackageManager();
            ApplicationInfo applicationInfo = n.this.f10940C.getApplicationInfo();
            File file = new File(applicationInfo.sourceDir);
            PackageInfo packageInfo = packageManager.getPackageInfo(n.this.f10940C.getPackageName(), 0);
            this.f10965a = packageManager.getApplicationLabel(applicationInfo).toString();
            this.b = packageInfo.versionName;
            this.f10971h = packageInfo.versionCode;
            String str = applicationInfo.packageName;
            this.f10966c = str;
            this.f10967d = StringUtils.toShortSHA1Hash(str);
            this.f10970g = file.lastModified();
            this.f10969f = Long.valueOf(packageInfo.firstInstallTime);
            this.f10972i = applicationInfo.targetSdkVersion;
            this.f10968e = packageManager.getInstallerPackageName(str);
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private final String f10974a;
        private final int b;

        public c(String str, int i9) {
            this.f10974a = str;
            this.b = i9;
        }

        public String a() {
            return this.f10974a;
        }

        public int b() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a */
        private f f10975a;
        private f b;

        /* renamed from: c */
        private f f10976c;

        /* renamed from: d */
        private f f10977d;

        /* renamed from: e */
        private f f10978e;

        /* renamed from: f */
        private final AudioManager f10979f;

        public /* synthetic */ d(n nVar, a aVar) {
            this();
        }

        public Integer a() {
            f fVar = this.f10975a;
            if (fVar != null && !fVar.b()) {
                Integer num = (Integer) this.f10975a.f10986a;
                num.getClass();
                return num;
            }
            if (this.f10979f == null) {
                return null;
            }
            try {
                f fVar2 = new f(n.this, Integer.valueOf((int) (this.f10979f.getStreamVolume(3) * ((Float) n.this.f10939B.a(oj.f9781i4)).floatValue())), n.this.f10960w, null);
                this.f10975a = fVar2;
                Integer num2 = (Integer) fVar2.f10986a;
                num2.getClass();
                return num2;
            } catch (Throwable th) {
                n.this.f10939B.L();
                if (t.a()) {
                    n.this.f10939B.L().a("DataProvider", "Unable to collect device volume", th);
                }
                return null;
            }
        }

        public int b() {
            f fVar = this.f10976c;
            if (fVar != null && !fVar.b()) {
                return ((Integer) this.f10976c.f10986a).intValue();
            }
            n nVar = n.this;
            f fVar2 = new f(nVar, Integer.valueOf(nVar.f10939B.m().a()), n.this.f10961x, null);
            this.f10976c = fVar2;
            return ((Integer) fVar2.f10986a).intValue();
        }

        public String c() {
            f fVar = this.b;
            if (fVar != null && !fVar.b()) {
                return (String) this.b.f10986a;
            }
            if (this.f10979f == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            if (x3.g()) {
                for (AudioDeviceInfo audioDeviceInfo : this.f10979f.getDevices(2)) {
                    sb.append(audioDeviceInfo.getType());
                    sb.append(",");
                }
            } else {
                if (this.f10979f.isWiredHeadsetOn()) {
                    sb.append("3,");
                }
                if (this.f10979f.isBluetoothScoOn()) {
                    sb.append("7,");
                }
                if (this.f10979f.isBluetoothA2dpOn()) {
                    sb.append(8);
                }
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(sb2)) {
                n.this.f10939B.L();
                if (t.a()) {
                    n.this.f10939B.L().a("DataProvider", "No sound outputs detected");
                }
            }
            f fVar2 = new f(n.this, sb2, r3.f10962y, null);
            this.b = fVar2;
            return (String) fVar2.f10986a;
        }

        public Boolean d() {
            f fVar = this.f10977d;
            if (fVar != null && !fVar.b()) {
                Boolean bool = (Boolean) this.f10977d.f10986a;
                bool.getClass();
                return bool;
            }
            AudioManager audioManager = this.f10979f;
            if (audioManager == null) {
                return null;
            }
            f fVar2 = new f(n.this, Boolean.valueOf(audioManager.isMusicActive()), n.this.f10962y, null);
            this.f10977d = fVar2;
            Boolean bool2 = (Boolean) fVar2.f10986a;
            bool2.getClass();
            return bool2;
        }

        public Boolean e() {
            f fVar = this.f10978e;
            if (fVar != null && !fVar.b()) {
                Boolean bool = (Boolean) this.f10978e.f10986a;
                bool.getClass();
                return bool;
            }
            AudioManager audioManager = this.f10979f;
            if (audioManager == null) {
                return null;
            }
            f fVar2 = new f(n.this, Boolean.valueOf(audioManager.isSpeakerphoneOn()), n.this.f10962y, null);
            this.f10978e = fVar2;
            Boolean bool2 = (Boolean) fVar2.f10986a;
            bool2.getClass();
            return bool2;
        }

        private d() {
            this.f10979f = (AudioManager) n.this.f10940C.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        }
    }

    /* loaded from: classes.dex */
    public class e {

        /* renamed from: a */
        private f f10981a;
        private f b;

        /* renamed from: c */
        private f f10982c;

        /* renamed from: d */
        private final Intent f10983d;

        /* renamed from: e */
        private BatteryManager f10984e;

        public /* synthetic */ e(n nVar, a aVar) {
            this();
        }

        public Integer a() {
            int i9;
            BatteryManager batteryManager;
            f fVar = this.f10981a;
            if (fVar != null && !fVar.b()) {
                Integer num = (Integer) this.f10981a.f10986a;
                num.getClass();
                return num;
            }
            if (x3.f() && (batteryManager = this.f10984e) != null) {
                i9 = batteryManager.getIntProperty(4);
            } else {
                Intent intent = this.f10983d;
                if (intent == null) {
                    return null;
                }
                int intExtra = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                int intExtra2 = this.f10983d.getIntExtra("scale", -1);
                if (intExtra < 0 || intExtra2 < 0) {
                    return null;
                }
                i9 = (int) ((intExtra / intExtra2) * 100.0f);
            }
            f fVar2 = new f(n.this, Integer.valueOf(i9), n.this.f10961x, null);
            this.f10981a = fVar2;
            Integer num2 = (Integer) fVar2.f10986a;
            num2.getClass();
            return num2;
        }

        public Integer b() {
            int intExtra;
            BatteryManager batteryManager;
            f fVar = this.b;
            if (fVar != null && !fVar.b()) {
                Integer num = (Integer) this.b.f10986a;
                num.getClass();
                return num;
            }
            if (x3.i() && (batteryManager = this.f10984e) != null) {
                intExtra = batteryManager.getIntProperty(6);
            } else {
                Intent intent = this.f10983d;
                if (intent == null || (intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1)) < 0) {
                    return null;
                }
            }
            f fVar2 = new f(n.this, Integer.valueOf(intExtra), n.this.f10961x, null);
            this.b = fVar2;
            Integer num2 = (Integer) fVar2.f10986a;
            num2.getClass();
            return num2;
        }

        public Boolean c() {
            f fVar = this.f10982c;
            if (fVar != null && !fVar.b()) {
                Boolean bool = (Boolean) this.f10982c.f10986a;
                bool.getClass();
                return bool;
            }
            boolean z8 = false;
            if (x3.d()) {
                if (Settings.Global.getInt(n.this.f10940C.getContentResolver(), "stay_on_while_plugged_in", -1) > 0) {
                    z8 = true;
                }
                this.f10982c = new f(n.this, Boolean.valueOf(z8), n.this.f10961x, null);
            } else {
                Intent intent = this.f10983d;
                if (intent == null) {
                    return null;
                }
                int intExtra = (intent.getIntExtra("plugged", -1) & 1) | 14;
                n nVar = n.this;
                if (intExtra > 0) {
                    z8 = true;
                }
                this.f10982c = new f(nVar, Boolean.valueOf(z8), n.this.f10961x, null);
            }
            Boolean bool2 = (Boolean) this.f10982c.f10986a;
            bool2.getClass();
            return bool2;
        }

        private e() {
            this.f10983d = n.this.f10940C.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (x3.f()) {
                this.f10984e = (BatteryManager) n.this.f10940C.getSystemService("batterymanager");
            }
        }
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a */
        private final Object f10986a;
        private final long b;

        public /* synthetic */ f(n nVar, Object obj, long j7, a aVar) {
            this(obj, j7);
        }

        private f(Object obj, long j7) {
            this.f10986a = obj;
            this.b = a() + j7;
        }

        private long a() {
            return System.currentTimeMillis() / 1000;
        }

        public boolean b() {
            return !((Boolean) n.this.f10939B.a(oj.G3)).booleanValue() || this.b - a() <= 0;
        }
    }

    /* loaded from: classes.dex */
    public class g {

        /* renamed from: a */
        private int f10988a;
        private int b;

        /* renamed from: c */
        private int f10989c;

        /* renamed from: d */
        private float f10990d;

        /* renamed from: e */
        private float f10991e;

        /* renamed from: f */
        private float f10992f;

        /* renamed from: g */
        private double f10993g;

        /* renamed from: h */
        private final Boolean f10994h;

        public /* synthetic */ g(n nVar, a aVar) {
            this();
        }

        public float a() {
            return this.f10992f;
        }

        public int b() {
            return this.f10989c;
        }

        public int c() {
            return this.f10988a;
        }

        public int d() {
            return this.b;
        }

        public Boolean e() {
            return this.f10994h;
        }

        public double f() {
            return this.f10993g;
        }

        public float g() {
            return this.f10990d;
        }

        public float h() {
            return this.f10991e;
        }

        private g() {
            Boolean bool;
            boolean isScreenHdr;
            if (x3.i()) {
                isScreenHdr = n.this.f10940C.getResources().getConfiguration().isScreenHdr();
                bool = Boolean.valueOf(isScreenHdr);
            } else {
                bool = null;
            }
            this.f10994h = bool;
            DisplayMetrics displayMetrics = n.this.f10940C.getResources().getDisplayMetrics();
            if (displayMetrics == null) {
                return;
            }
            this.f10992f = displayMetrics.density;
            this.f10990d = displayMetrics.xdpi;
            this.f10991e = displayMetrics.ydpi;
            this.f10989c = displayMetrics.densityDpi;
            Point b = x3.b(n.this.f10940C);
            int i9 = b.x;
            this.f10988a = i9;
            this.b = b.y;
            this.f10993g = Math.sqrt(Math.pow(this.b, 2.0d) + Math.pow(i9, 2.0d)) / this.f10990d;
        }
    }

    /* loaded from: classes.dex */
    public class h {

        /* renamed from: a */
        private long f10996a;
        private f b;

        /* renamed from: c */
        private f f10997c;

        /* renamed from: d */
        private f f10998d;

        /* renamed from: e */
        private final ActivityManager f10999e;

        public /* synthetic */ h(n nVar, a aVar) {
            this();
        }

        public Long a() {
            f fVar = this.b;
            if (fVar != null && !fVar.b()) {
                Long l = (Long) this.b.f10986a;
                l.getClass();
                return l;
            }
            ActivityManager.MemoryInfo a6 = zp.a(this.f10999e);
            if (a6 == null) {
                return null;
            }
            f fVar2 = new f(n.this, Long.valueOf(a6.availMem), n.this.f10959v, null);
            this.b = fVar2;
            Long l2 = (Long) fVar2.f10986a;
            l2.getClass();
            return l2;
        }

        public Long b() {
            f fVar = this.f10997c;
            if (fVar != null && !fVar.b()) {
                Long l = (Long) this.f10997c.f10986a;
                l.getClass();
                return l;
            }
            ActivityManager.MemoryInfo a6 = zp.a(this.f10999e);
            if (a6 == null) {
                return null;
            }
            f fVar2 = new f(n.this, Long.valueOf(a6.threshold), n.this.f10959v, null);
            this.f10997c = fVar2;
            Long l2 = (Long) fVar2.f10986a;
            l2.getClass();
            return l2;
        }

        public long c() {
            return this.f10996a;
        }

        public Boolean d() {
            f fVar = this.f10998d;
            if (fVar != null && !fVar.b()) {
                Boolean bool = (Boolean) this.f10998d.f10986a;
                bool.getClass();
                return bool;
            }
            ActivityManager.MemoryInfo a6 = zp.a(this.f10999e);
            if (a6 == null) {
                return null;
            }
            f fVar2 = new f(n.this, Boolean.valueOf(a6.lowMemory), n.this.f10959v, null);
            this.f10998d = fVar2;
            Boolean bool2 = (Boolean) fVar2.f10986a;
            bool2.getClass();
            return bool2;
        }

        private h() {
            ActivityManager.MemoryInfo a6;
            ActivityManager activityManager = (ActivityManager) n.this.f10940C.getSystemService("activity");
            this.f10999e = activityManager;
            if (activityManager == null || (a6 = zp.a(activityManager)) == null) {
                return;
            }
            this.f10996a = a6.totalMem;
        }
    }

    /* loaded from: classes.dex */
    public class i {

        /* renamed from: a */
        private final PowerManager f11001a;

        public /* synthetic */ i(n nVar, a aVar) {
            this();
        }

        public Integer a() {
            if (n.this.f10952o != null && !n.this.f10952o.b()) {
                Integer num = (Integer) n.this.f10952o.f10986a;
                num.getClass();
                return num;
            }
            if (this.f11001a != null && x3.f()) {
                n nVar = n.this;
                nVar.f10952o = new f(nVar, Integer.valueOf(this.f11001a.isPowerSaveMode() ? 1 : 0), n.this.f10961x, null);
                Integer num2 = (Integer) n.this.f10952o.f10986a;
                num2.getClass();
                return num2;
            }
            return null;
        }

        private i() {
            this.f11001a = (PowerManager) n.this.f10940C.getSystemService("power");
        }
    }

    /* loaded from: classes.dex */
    public class j {

        /* renamed from: a */
        private final TelephonyManager f11002a;
        private String b;

        /* renamed from: c */
        private String f11003c;

        /* renamed from: d */
        private String f11004d;

        /* renamed from: e */
        private String f11005e;

        /* renamed from: f */
        private String f11006f;

        /* renamed from: g */
        private f f11007g;

        public /* synthetic */ j(n nVar, a aVar) {
            this();
        }

        public String a() {
            return this.f11004d;
        }

        public String b() {
            return this.f11003c;
        }

        public Integer c() {
            f fVar = this.f11007g;
            if (fVar != null && !fVar.b()) {
                Integer num = (Integer) this.f11007g.f10986a;
                num.getClass();
                return num;
            }
            if (x3.a("android.permission.READ_PHONE_STATE", n.this.f10940C) && this.f11002a != null && x3.h()) {
                f fVar2 = new f(n.this, Integer.valueOf(this.f11002a.getDataNetworkType()), n.this.f10938A, null);
                this.f11007g = fVar2;
                Integer num2 = (Integer) fVar2.f10986a;
                num2.getClass();
                return num2;
            }
            return null;
        }

        public String d() {
            return this.f11005e;
        }

        public String e() {
            return this.f11006f;
        }

        private j() {
            TelephonyManager telephonyManager = (TelephonyManager) n.this.f10940C.getSystemService("phone");
            this.f11002a = telephonyManager;
            if (telephonyManager == null) {
                return;
            }
            this.f11003c = telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH);
            try {
                this.f11004d = telephonyManager.getNetworkOperatorName();
            } catch (Throwable th) {
                n.this.f10939B.L();
                if (t.a()) {
                    n.this.f10939B.L().a("DataProvider", "Unable to collect carrier", th);
                }
            }
            try {
                this.b = this.f11002a.getNetworkOperator();
            } catch (Throwable th2) {
                n.this.f10939B.L();
                if (t.a()) {
                    n.this.f10939B.L().a("DataProvider", "Unable to collect get network operator", th2);
                }
            }
            String str = this.b;
            if (str == null) {
                return;
            }
            int min = Math.min(3, str.length());
            this.f11005e = this.b.substring(0, min);
            this.f11006f = this.b.substring(min);
        }
    }

    public n(k kVar) {
        String str;
        boolean z8;
        this.f10939B = kVar;
        Context k6 = k.k();
        this.f10940C = k6;
        this.f10959v = ((Integer) kVar.a(oj.f9566C4)).intValue();
        this.f10960w = ((Integer) kVar.a(oj.f9574D4)).intValue();
        this.f10961x = ((Integer) kVar.a(oj.f9582E4)).intValue();
        this.f10962y = ((Integer) kVar.a(oj.F4)).intValue();
        this.f10963z = ((Integer) kVar.a(oj.f9595G4)).intValue();
        this.f10938A = ((Integer) kVar.a(oj.f9602H4)).intValue();
        this.f10941a = new i(this, null);
        this.b = new j(this, null);
        this.f10942c = new d(this, null);
        this.f10943d = new e(this, null);
        this.f10944e = new g(this, null);
        this.f10945f = new h(this, null);
        if (AppLovinSdkUtils.isFireOS(k6)) {
            str = "fireos";
        } else {
            str = "android";
        }
        this.f10946g = str;
        int orientation = AppLovinSdkUtils.getOrientation(k6);
        if (orientation == 1) {
            this.f10947h = "portrait";
        } else if (orientation == 2) {
            this.f10947h = "landscape";
        } else {
            this.f10947h = "none";
        }
        this.f10948i = Math.round((TimeZone.getDefault().getOffset(new Date().getTime()) * 10.0d) / 3600000.0d) / 10.0d;
        SensorManager sensorManager = (SensorManager) k6.getSystemService("sensor");
        if (sensorManager != null && sensorManager.getDefaultSensor(4) != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f10949j = z8;
        if (x3.h()) {
            LocaleList locales = k6.getResources().getConfiguration().getLocales();
            StringBuilder sb = new StringBuilder();
            for (int i9 = 0; i9 < locales.size(); i9++) {
                sb.append(locales.get(i9));
                sb.append(",");
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            this.f10950k = sb.toString();
        }
        try {
            this.l = Environment.getDataDirectory().getTotalSpace();
        } catch (Throwable th) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("DataProvider", "Unable to collect total disk space.", th);
            }
        }
        this.m = new b(this, null);
    }

    public /* synthetic */ void I() {
        f10937F.set(this.f10942c.a());
    }

    public long A() {
        return this.l;
    }

    public Integer B() {
        return (Integer) f10937F.get();
    }

    public boolean C() {
        boolean z8;
        if (this.f10940C.getResources().getConfiguration().keyboard == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean hasSystemFeature = this.f10940C.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
        boolean hasSystemFeature2 = this.f10940C.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        if (!z8) {
            return false;
        }
        if (!hasSystemFeature && !hasSystemFeature2) {
            return false;
        }
        return true;
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
        return this.f10949j;
    }

    public boolean F() {
        ConnectivityManager connectivityManager;
        if (!x3.h() || (connectivityManager = (ConnectivityManager) this.f10940C.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            if (connectivityManager.getRestrictBackgroundStatus() != 3) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            this.f10939B.L();
            if (t.a()) {
                this.f10939B.L().a("DataProvider", "Unable to collect constrained network info.", th);
            }
            return false;
        }
    }

    public boolean G() {
        return this.f10951n;
    }

    public boolean H() {
        f fVar = this.f10954q;
        if (fVar != null && !fVar.b()) {
            return ((Boolean) this.f10954q.f10986a).booleanValue();
        }
        f fVar2 = new f(this, Boolean.valueOf(zp.j()), this.f10962y, null);
        this.f10954q = fVar2;
        return ((Boolean) fVar2.f10986a).booleanValue();
    }

    public void J() {
        sm l02 = this.f10939B.l0();
        dm dmVar = new dm(this.f10939B, new a());
        sm.b bVar = sm.b.OTHER;
        l02.a((xl) dmVar, bVar);
        this.f10939B.l0().a((xl) new kn(this.f10939B, true, "setDeviceVolume", new z(this, 5)), bVar);
    }

    public AbstractC0719l0.a d() {
        List<String> testDeviceAdvertisingIds;
        AbstractC0719l0.a b8 = AbstractC0719l0.b(this.f10940C);
        if (b8 == null) {
            return new AbstractC0719l0.a();
        }
        if (((Boolean) this.f10939B.a(oj.f9608I3)).booleanValue()) {
            if (b8.c() && !((Boolean) this.f10939B.a(oj.f9601H3)).booleanValue()) {
                b8.a("");
            }
            f10935D.set(b8);
        } else {
            b8 = new AbstractC0719l0.a();
        }
        if (this.f10939B.C0().get()) {
            testDeviceAdvertisingIds = this.f10939B.g0().getTestDeviceAdvertisingIds();
        } else {
            testDeviceAdvertisingIds = this.f10939B.I() != null ? this.f10939B.I().getTestDeviceAdvertisingIds() : null;
        }
        if (testDeviceAdvertisingIds != null) {
            String a6 = b8.a();
            if (StringUtils.isValidString(a6)) {
                this.f10951n = testDeviceAdvertisingIds.contains(a6);
            }
            c h6 = h();
            String a9 = h6 != null ? h6.a() : null;
            if (StringUtils.isValidString(a9)) {
                this.f10951n = testDeviceAdvertisingIds.contains(a9) | this.f10951n;
            }
        } else {
            this.f10951n = false;
        }
        return b8;
    }

    public e j() {
        return this.f10943d;
    }

    public Float k() {
        f fVar = this.f10955r;
        if (fVar != null && !fVar.b()) {
            Float f9 = (Float) this.f10955r.f10986a;
            f9.getClass();
            return f9;
        }
        if (this.f10939B.e0() == null) {
            return null;
        }
        f fVar2 = new f(this, Float.valueOf(this.f10939B.e0().a()), this.f10959v, null);
        this.f10955r = fVar2;
        Float f10 = (Float) fVar2.f10986a;
        f10.getClass();
        return f10;
    }

    public Float l() {
        f fVar = this.f10956s;
        if (fVar != null && !fVar.b()) {
            Float f9 = (Float) this.f10956s.f10986a;
            f9.getClass();
            return f9;
        }
        if (this.f10939B.e0() == null) {
            return null;
        }
        f fVar2 = new f(this, Float.valueOf(this.f10939B.e0().b()), this.f10959v, null);
        this.f10956s = fVar2;
        Float f10 = (Float) fVar2.f10986a;
        f10.getClass();
        return f10;
    }

    public g m() {
        return this.f10944e;
    }

    public float n() {
        try {
            return Settings.System.getFloat(this.f10940C.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e4) {
            this.f10939B.L();
            if (t.a()) {
                this.f10939B.L().a("DataProvider", "Error collecting font scale", e4);
                return -1.0f;
            }
            return -1.0f;
        }
    }

    public Long o() {
        f fVar = this.f10953p;
        if (fVar != null && !fVar.b()) {
            Long l = (Long) this.f10953p.f10986a;
            l.getClass();
            return l;
        }
        try {
            f fVar2 = new f(this, Long.valueOf(Environment.getDataDirectory().getFreeSpace()), this.f10962y, null);
            this.f10953p = fVar2;
            Long l2 = (Long) fVar2.f10986a;
            l2.getClass();
            return l2;
        } catch (Throwable th) {
            this.f10939B.L();
            if (t.a()) {
                this.f10939B.L().a("DataProvider", "Unable to collect free space.", th);
                return null;
            }
            return null;
        }
    }

    public String p() {
        return this.f10950k;
    }

    public h q() {
        return this.f10945f;
    }

    public String r() {
        f fVar = this.f10957t;
        if (fVar != null && !fVar.b()) {
            return (String) this.f10957t.f10986a;
        }
        f fVar2 = new f(this, c4.g(this.f10939B), this.f10938A, null);
        this.f10957t = fVar2;
        return (String) fVar2.f10986a;
    }

    public String s() {
        ActivityManager activityManager = (ActivityManager) this.f10940C.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public String t() {
        return this.f10947h;
    }

    public String u() {
        return this.f10946g;
    }

    public i v() {
        return this.f10941a;
    }

    public Integer w() {
        f fVar = this.f10958u;
        if (fVar != null && !fVar.b()) {
            Integer num = (Integer) this.f10958u.f10986a;
            num.getClass();
            return num;
        }
        try {
            f fVar2 = new f(this, Integer.valueOf((int) ((Settings.System.getInt(this.f10940C.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)), this.f10960w, null);
            this.f10958u = fVar2;
            Integer num2 = (Integer) fVar2.f10986a;
            num2.getClass();
            return num2;
        } catch (Settings.SettingNotFoundException e4) {
            this.f10939B.L();
            if (t.a()) {
                this.f10939B.L().a("DataProvider", "Unable to collect screen brightness", e4);
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
        return this.b;
    }

    public double z() {
        return this.f10948i;
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
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
    public long e() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.n.e():long");
    }

    public AbstractC0719l0.a f() {
        return (AbstractC0719l0.a) f10935D.get();
    }

    public b g() {
        return this.m;
    }

    public c h() {
        return (c) f10936E.get();
    }

    public d i() {
        return this.f10942c;
    }

    public static void a(c cVar) {
        f10936E.set(cVar);
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.f10940C.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void a(AbstractC0719l0.a aVar) {
        f10935D.set(aVar);
    }

    private boolean a(String str) {
        return b(str) == 1;
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
}
