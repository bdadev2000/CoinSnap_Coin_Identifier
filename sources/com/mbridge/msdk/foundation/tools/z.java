package com.mbridge.msdk.foundation.tools;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.FragmentTransaction;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.af;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class z extends j {

    /* renamed from: A, reason: collision with root package name */
    private static String f16084A = "";

    /* renamed from: B, reason: collision with root package name */
    private static Object f16085B = null;

    /* renamed from: C, reason: collision with root package name */
    private static int f16086C = 0;

    /* renamed from: D, reason: collision with root package name */
    private static int f16087D = 0;

    /* renamed from: E, reason: collision with root package name */
    private static String f16088E = "";

    /* renamed from: e, reason: collision with root package name */
    private static String f16089e = "";

    /* renamed from: f, reason: collision with root package name */
    private static String f16090f = "";

    /* renamed from: g, reason: collision with root package name */
    private static int f16091g = -1;

    /* renamed from: h, reason: collision with root package name */
    private static String f16092h = "";

    /* renamed from: i, reason: collision with root package name */
    private static int f16093i = -1;

    /* renamed from: j, reason: collision with root package name */
    private static int f16094j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static String f16095k = "";
    private static int l = -1;
    private static String m = "";

    /* renamed from: n, reason: collision with root package name */
    private static String f16096n = "";

    /* renamed from: o, reason: collision with root package name */
    private static volatile int f16097o = -1;

    /* renamed from: p, reason: collision with root package name */
    private static String f16098p = "";

    /* renamed from: q, reason: collision with root package name */
    private static String f16099q = "";

    /* renamed from: r, reason: collision with root package name */
    private static int f16100r = -1;

    /* renamed from: s, reason: collision with root package name */
    private static int f16101s = -1;

    /* renamed from: t, reason: collision with root package name */
    private static int f16102t = 0;

    /* renamed from: u, reason: collision with root package name */
    private static String f16103u = "";

    /* renamed from: v, reason: collision with root package name */
    private static String f16104v = null;

    /* renamed from: w, reason: collision with root package name */
    private static int f16105w = 0;

    /* renamed from: x, reason: collision with root package name */
    private static String f16106x = "";

    /* renamed from: y, reason: collision with root package name */
    private static int f16107y = -1;

    /* renamed from: z, reason: collision with root package name */
    private static int f16108z;

    private static void B() {
        String str = Build.VERSION.RELEASE;
        String h6 = h();
        String str2 = Build.DISPLAY;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(h6)) {
            StringBuilder o3 = com.mbridge.msdk.foundation.entity.o.o("Mozilla/5.0 (Linux; Android ", str, "; ", h6, " Build/");
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            f16106x = AbstractC2914a.h(o3, str2, ") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
            return;
        }
        f16106x = "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
    }

    private static long C() {
        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (c9 != null) {
            ActivityManager activityManager = (ActivityManager) c9.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
        return 0L;
    }

    private static String D() {
        String str;
        if (!TextUtils.isEmpty(f16092h)) {
            return f16092h;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            str = (String) cls.getMethod("getOsBrand", null).invoke(cls, null);
        } catch (Throwable th) {
            ad.b("SameDiTool", th.getMessage());
            str = null;
        }
        try {
            if (!TextUtils.isEmpty(str) && str.equals("harmony")) {
                jSONObject.put("osType", str);
                try {
                    Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
                    jSONObject.put("version", (String) cls2.getMethod("getVersion", null).invoke(cls2, null));
                } catch (Throwable th2) {
                    ad.b("SameDiTool", th2.getMessage());
                }
                try {
                    jSONObject.put("pure_state", Settings.Secure.getInt(com.mbridge.msdk.foundation.controller.c.m().c().getContentResolver(), "pure_mode_state", -1));
                } catch (Throwable th3) {
                    ad.b("SameDiTool", th3.getMessage());
                }
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    jSONObject2 = x.b(jSONObject2);
                }
                f16092h = jSONObject2;
            } else {
                f16092h = "android";
            }
        } catch (Throwable th4) {
            ad.b("SameDiTool", th4.getMessage());
        }
        return f16092h;
    }

    public static String a(Context context, int i9) {
        TelephonyManager telephonyManager;
        if (i9 == 0 || i9 == 9) {
            return "";
        }
        try {
            if (!com.mbridge.msdk.foundation.same.a.f15698z || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                return "";
            }
            return String.valueOf(telephonyManager.getNetworkType());
        } catch (Throwable th) {
            ad.b("SameDiTool", th.getMessage(), th);
            return "";
        }
    }

    public static int b(int i9) {
        switch (i9) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    public static int c(String str) {
        if (f16087D == 0) {
            f16087D = ai.f(str);
        }
        return f16087D;
    }

    public static int f() {
        try {
        } catch (Throwable th) {
            ad.b("SameDiTool", th.getMessage(), th);
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return 0;
        }
        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
        long j7 = 0;
        long longValue = ((Long) al.a(c9, "FreeRamSize", 0L)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - longValue <= 1800000) {
            if (f16100r == -1) {
            }
            return f16100r;
        }
        Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (c10 != null) {
            ActivityManager activityManager = (ActivityManager) c10.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            j7 = memoryInfo.availMem;
        }
        f16100r = Long.valueOf((j7 / 1000) / 1000).intValue();
        al.b(c9, "FreeRamSize", Long.valueOf(currentTimeMillis));
        return f16100r;
    }

    public static String g() {
        if (TextUtils.isEmpty(f16106x)) {
            f(com.mbridge.msdk.foundation.controller.c.m().c());
        }
        return f16106x;
    }

    public static String h() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MODEL;
    }

    public static String i() {
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA);
        return "";
    }

    public static void j() {
        try {
            Object a6 = al.a(com.mbridge.msdk.foundation.controller.c.m().c(), MBridgeConstans.SP_GA_ID, "");
            Object a9 = al.a(com.mbridge.msdk.foundation.controller.c.m().c(), MBridgeConstans.SP_GA_ID_LIMIT, 0);
            if (a6 instanceof String) {
                String str = (String) a6;
                if (!TextUtils.isEmpty(str)) {
                    e.a(str);
                }
                if (a9 instanceof Integer) {
                    e.f16054d = ((Integer) a9).intValue();
                }
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("SameDiTool", e4.getMessage());
            }
        }
    }

    public static int k() {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return Build.VERSION.SDK_INT;
        }
        return -1;
    }

    public static String l() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER;
    }

    public static String m() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static String n() {
        Context c9;
        long a6;
        long C8;
        String z8;
        String str;
        String str2;
        String str3 = "";
        try {
            c9 = com.mbridge.msdk.foundation.controller.c.m().c();
            a6 = y.a();
            C8 = C();
            z8 = z(c9);
            str = "app_tki_" + a6 + "_" + C8 + "_" + z8;
            str2 = (String) al.a(c9, str, "");
        } catch (Exception e4) {
            e = e4;
        }
        try {
        } catch (Exception e9) {
            e = e9;
            str3 = str2;
            e.printStackTrace();
            return str3;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("1", z8);
            jSONObject.put(MBridgeConstans.API_REUQEST_CATEGORY_APP, String.valueOf(C8));
            jSONObject.put("3", String.valueOf(a6));
            jSONObject.put("4", "");
            jSONObject.put(CampaignEx.CLICKMODE_ON, "");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        str3 = a.a(jSONObject.toString());
        al.b(c9, str, str3);
        return str3;
    }

    public static int o() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return 0;
        }
        if (f16101s < 1) {
            try {
                Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
                long longValue = ((Long) al.a(c9, "TotalRamSize", 0L)).longValue();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - longValue <= 1800000) {
                    if (f16101s == -1) {
                    }
                }
                f16101s = Long.valueOf((C() / 1000) / 1000).intValue();
                al.b(c9, "TotalRamSize", Long.valueOf(currentTimeMillis));
            } catch (Throwable th) {
                ad.b("SameDiTool", th.getMessage(), th);
            }
        }
        return f16101s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static String p() {
        FileReader fileReader;
        Throwable th;
        Exception e4;
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (f16105w > 0) {
            return AbstractC2914a.g(new StringBuilder(), f16105w, "GB");
        }
        ?? r12 = "/proc/meminfo";
        f16105w = 0;
        try {
            try {
                try {
                    fileReader = new FileReader("/proc/meminfo");
                    try {
                        r12 = new BufferedReader(fileReader, FragmentTransaction.TRANSIT_EXIT_MASK);
                    } catch (Exception e9) {
                        e4 = e9;
                        r12 = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        r12 = 0;
                    }
                } catch (Exception e10) {
                    fileReader = null;
                    e4 = e10;
                    r12 = 0;
                } catch (Throwable th3) {
                    fileReader = null;
                    th = th3;
                    r12 = 0;
                }
                try {
                    String str = r12.readLine().split("\\s+")[1];
                    r12.close();
                    if (str != null) {
                        f16105w = (int) Math.ceil(new Float(Float.valueOf(str).floatValue() / 1048576.0f).doubleValue());
                    }
                    try {
                        fileReader.close();
                    } catch (IOException unused) {
                    }
                    r12.close();
                    r12 = r12;
                } catch (Exception e11) {
                    e4 = e11;
                    ad.b("SameDiTool", e4.getMessage(), e4);
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (r12 != 0) {
                        r12.close();
                        r12 = r12;
                    }
                    return AbstractC2914a.g(new StringBuilder(), f16105w, "GB");
                } catch (Throwable th4) {
                    th = th4;
                    ad.b("SameDiTool", th.getMessage(), th);
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (r12 != 0) {
                        r12.close();
                        r12 = r12;
                    }
                    return AbstractC2914a.g(new StringBuilder(), f16105w, "GB");
                }
            } catch (IOException e12) {
                e12.printStackTrace();
            }
            return AbstractC2914a.g(new StringBuilder(), f16105w, "GB");
        } finally {
        }
    }

    public static int q(Context context) {
        if (context == null) {
            return f16108z;
        }
        int i9 = f16108z;
        if (i9 != 0) {
            return i9;
        }
        try {
            int i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            f16108z = i10;
            return i10;
        } catch (Exception e4) {
            e4.printStackTrace();
            return -1;
        }
    }

    public static int r() {
        try {
            if (ai.h()) {
                return 1;
            }
            return ai.i() ? 2 : 0;
        } catch (Exception e4) {
            ad.b("SameDiTool", e4.getMessage());
            return 0;
        }
    }

    public static int s() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    public static int t() {
        return f16107y;
    }

    public static int u() {
        if (f16086C == 0) {
            f16086C = ai.e();
        }
        return f16086C;
    }

    public static int v() {
        return l;
    }

    private static void x(final Context context) {
        try {
            new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.z.2
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    try {
                        str = WebSettings.getDefaultUserAgent(context);
                    } catch (Throwable unused) {
                        str = null;
                    }
                    try {
                        if (!TextUtils.isEmpty(str) && !str.equals(z.f16106x)) {
                            String unused2 = z.f16106x = str;
                            z.y(context);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }).start();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Context context) {
        try {
            al.b(context, "mbridge_ua", f16106x);
        } catch (Throwable th) {
            ad.b("SameDiTool", th.getMessage(), th);
        }
    }

    private static String z(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(f16090f)) {
                    f16090f = ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
                }
            } else {
                f16090f = "";
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            f16090f = "";
        }
        return f16090f;
    }

    public static Object b(String str) {
        if (f16085B == null) {
            f16085B = ai.g(str);
        }
        return f16085B;
    }

    public static String e(Context context) {
        if (context == null) {
            return f16099q;
        }
        try {
            if (TextUtils.isEmpty(f16099q)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
                f16099q = str;
                return str;
            }
            return f16099q;
        } catch (Exception e4) {
            e4.printStackTrace();
            return "";
        }
    }

    public static int t(Context context) {
        if (context == null) {
            return f16102t;
        }
        if (f16102t == 0) {
            try {
                f16102t = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e4) {
                ad.b("SameDiTool", e4.getMessage());
            }
        }
        return f16102t;
    }

    public static boolean v(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static String w() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f16098p)) {
            f16098p = s() + "";
        }
        return f16098p;
    }

    public static void d(final Context context) {
        if (context == null) {
            return;
        }
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                e.b(context);
            } else {
                new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.z.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.b(context);
                    }
                });
            }
        } catch (Exception e4) {
            ad.b("SameDiTool", "", e4);
        }
    }

    public static int i(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap h6 = h(context);
            return h6.get("width") == null ? displayMetrics.widthPixels : ((Integer) h6.get("width")).intValue();
        } catch (Exception e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    public static String k(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(f16096n)) {
                    if (context == null) {
                        f16096n = "";
                        return m;
                    }
                    String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                    if (ai.j(simOperator)) {
                        f16096n = simOperator.substring(Math.min(3, simOperator.length()));
                    }
                }
            } else {
                f16096n = "";
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            f16096n = "";
        }
        return f16096n;
    }

    public static String s(Context context) {
        Locale locale;
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f16095k)) {
            if (context == null) {
                return "en-US";
            }
            try {
                if (context.getResources() == null || context.getResources().getConfiguration() == null || (locale = context.getResources().getConfiguration().locale) == null) {
                    return "en-US";
                }
                String languageTag = locale.toLanguageTag();
                f16095k = languageTag;
                return languageTag;
            } catch (Throwable th) {
                ad.a("SameDiTool", th.getMessage());
                f16095k = "en-US";
            }
        }
        return f16095k;
    }

    public static String y() {
        try {
        } catch (Throwable th) {
            ad.b("SameDiTool", th.getMessage(), th);
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
            return "";
        }
        if (TextUtils.isEmpty(f16103u)) {
            new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.z.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        String unused = z.f16103u = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }).start();
            return f16103u;
        }
        return f16103u;
    }

    public static void c(int i9) {
        l = i9;
    }

    public static int g(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap h6 = h(context);
            return h6.get("height") == null ? displayMetrics.heightPixels : ((Integer) h6.get("height")).intValue();
        } catch (Exception e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    public static HashMap h(Context context) {
        HashMap hashMap = new HashMap();
        if (context == null) {
            return hashMap;
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            hashMap.put("height", Integer.valueOf(displayMetrics.heightPixels));
            hashMap.put("width", Integer.valueOf(displayMetrics.widthPixels));
        } catch (Exception e4) {
            ad.b("SameDiTool", e4.getMessage(), e4);
        }
        return hashMap;
    }

    public static int l(Context context) {
        try {
            final Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return f16097o;
            }
            if (c9 == null) {
                return f16097o;
            }
            if (f16097o != -1) {
                try {
                    Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.foundation.tools.z.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                ConnectivityManager connectivityManager = (ConnectivityManager) c9.getSystemService("connectivity");
                                if (connectivityManager != null && com.mbridge.msdk.foundation.same.a.f15698z) {
                                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                    if (activeNetworkInfo == null) {
                                        int unused = z.f16097o = 0;
                                        return;
                                    }
                                    if (activeNetworkInfo.getType() == 1) {
                                        int unused2 = z.f16097o = 9;
                                        return;
                                    }
                                    TelephonyManager telephonyManager = (TelephonyManager) c9.getSystemService("phone");
                                    if (telephonyManager == null) {
                                        int unused3 = z.f16097o = 0;
                                    } else {
                                        int unused4 = z.f16097o = z.b(telephonyManager.getNetworkType());
                                    }
                                }
                            } catch (Exception e4) {
                                ad.b("SameDiTool", e4.getMessage(), e4);
                                int unused5 = z.f16097o = 0;
                            }
                        }
                    };
                    if (com.mbridge.msdk.foundation.same.f.b.d().getActiveCount() < 1) {
                        com.mbridge.msdk.foundation.same.f.b.d().execute(runnable);
                    }
                } catch (Throwable th) {
                    ad.b("SameDiTool", th.getMessage());
                }
                return f16097o;
            }
            f16097o = 0;
            return f16097o;
        } catch (Exception e4) {
            ad.b("SameDiTool", e4.getMessage(), e4);
            f16097o = 0;
            return f16097o;
        }
    }

    public static String m(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        try {
            return Settings.System.getString(context.getContentResolver(), "time_12_24");
        } catch (Exception e4) {
            ad.b("SameDiTool", e4.getMessage(), e4);
            return "";
        } catch (Throwable th) {
            ad.b("SameDiTool", th.getMessage(), th);
            return "";
        }
    }

    public static int r(Context context) {
        Configuration configuration;
        return (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null || configuration.orientation != 2) ? 1 : 2;
    }

    public static int u(Context context) {
        if (f16091g == -1) {
            f16091g = ai.c(context, "com.tencent.mm") ? 1 : 0;
        }
        return f16091g;
    }

    public static String x() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.BRAND;
    }

    public static int q() {
        try {
        } catch (Exception e4) {
            f16094j = 0;
            ad.b("SameDiTool", e4.getMessage());
        }
        if (!af.a.a().a("v_a_d_p", false)) {
            return 0;
        }
        if (ai.h()) {
            f16094j = 1;
        } else if (ai.i()) {
            f16094j = 2;
        } else {
            f16094j = 0;
        }
        return f16094j;
    }

    public static String a(String str, Context context) {
        try {
        } catch (Exception e4) {
            ad.b("SameDiTool", e4.getMessage(), e4);
        }
        if (!TextUtils.isEmpty(f16089e)) {
            return f16089e;
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            f16089e = context.getPackageManager().getInstallerPackageName(str);
            ad.a("SameDiTool", "PKGSource:" + f16089e);
        }
        return f16089e;
    }

    public static int z() {
        if (f16093i == -1) {
            f16093i = ai.f() ? 1 : 0;
        }
        return f16093i;
    }

    public static void o(Context context) {
        try {
            e.a(context);
            w();
            e(context);
            p(context);
            q(context);
            r(context);
            h();
            x();
            s(context);
            y();
            com.mbridge.msdk.foundation.same.a.f15655B = false;
            com.mbridge.msdk.foundation.same.a.f15698z = ai.a("android.permission.ACCESS_NETWORK_STATE", context);
            t(context);
            D();
            e.e();
            try {
                com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.z.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.mbridge.msdk.e.c.a();
                        } catch (Exception e4) {
                            ad.b("SameDiTool", e4.getMessage());
                        }
                    }
                });
            } catch (Throwable th) {
                ad.b("SameDiTool", th.getMessage());
            }
        } catch (Throwable th2) {
            ad.b("SameDiTool", th2.getMessage());
        }
    }

    public static String j(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(m)) {
                    if (context == null) {
                        m = "";
                        return "";
                    }
                    String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                    if (ai.j(simOperator)) {
                        m = simOperator.substring(0, Math.min(3, simOperator.length()));
                    }
                }
            } else {
                m = "";
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            m = "";
        }
        return m;
    }

    public static String f(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return null;
        }
        if (TextUtils.isEmpty(f16106x)) {
            try {
                f16106x = al.a(context, "mbridge_ua", "").toString();
            } catch (Throwable th) {
                ad.b("SameDiTool", th.getMessage(), th);
            }
        }
        try {
            if (Looper.myLooper() == Looper.getMainLooper() && !MBridgeConstans.DNT_GUA_ON_UI) {
                if (TextUtils.isEmpty(f16106x)) {
                    try {
                        f16106x = WebSettings.getDefaultUserAgent(context);
                    } catch (Throwable unused) {
                    }
                    if (TextUtils.isEmpty(f16106x)) {
                        try {
                            Constructor declaredConstructor = WebSettings.class.getDeclaredConstructor(Context.class, WebView.class);
                            declaredConstructor.setAccessible(true);
                            f16106x = ((WebSettings) declaredConstructor.newInstance(context, null)).getUserAgentString();
                            declaredConstructor.setAccessible(false);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                        if (TextUtils.isEmpty(f16106x)) {
                            try {
                                f16106x = new WebView(context).getSettings().getUserAgentString();
                            } catch (Throwable th3) {
                                th3.printStackTrace();
                            }
                        }
                        if (TextUtils.isEmpty(f16106x)) {
                            B();
                        }
                    }
                } else {
                    x(context);
                }
            } else {
                if (TextUtils.isEmpty(f16106x)) {
                    B();
                }
                x(context);
            }
        } catch (Throwable th4) {
            ad.b("SameDiTool", th4.getMessage(), th4);
        }
        y(context);
        return f16106x;
    }

    public static String n(Context context) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        if (!TextUtils.isEmpty(f16104v)) {
            return f16104v;
        }
        BufferedReader bufferedReader2 = null;
        try {
            try {
                try {
                    fileReader = new FileReader("/proc/meminfo");
                    try {
                        bufferedReader = new BufferedReader(fileReader, FragmentTransaction.TRANSIT_EXIT_MASK);
                    } catch (IOException e4) {
                        e = e4;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e9) {
                    e = e9;
                    fileReader = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileReader = null;
                }
                try {
                    String formatFileSize = Formatter.formatFileSize(context, Long.valueOf(bufferedReader.readLine().split("\\s+")[1]).longValue() * 1024);
                    f16104v = formatFileSize;
                    try {
                        bufferedReader.close();
                    } catch (IOException e10) {
                        ad.b("SameDiTool", e10.getMessage(), e10);
                    }
                    try {
                        fileReader.close();
                    } catch (IOException e11) {
                        ad.b("SameDiTool", e11.getMessage(), e11);
                    }
                    return formatFileSize;
                } catch (IOException e12) {
                    e = e12;
                    bufferedReader2 = bufferedReader;
                    ad.b("SameDiTool", e.getMessage(), e);
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e13) {
                            ad.b("SameDiTool", e13.getMessage(), e13);
                        }
                    }
                    if (fileReader != null) {
                        fileReader.close();
                    }
                    return "";
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader2 = bufferedReader;
                    ad.b("SameDiTool", th.getMessage(), th);
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e14) {
                            ad.b("SameDiTool", e14.getMessage(), e14);
                        }
                    }
                    if (fileReader != null) {
                        fileReader.close();
                    }
                    return "";
                }
            } catch (IOException e15) {
                ad.b("SameDiTool", e15.getMessage(), e15);
                return "";
            }
        } finally {
        }
    }

    public static String p(Context context) {
        if (context == null) {
            return f16084A;
        }
        try {
            if (TextUtils.isEmpty(f16084A)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                f16084A = str;
                return str;
            }
            return f16084A;
        } catch (Exception e4) {
            e4.printStackTrace();
            return "";
        }
    }
}
