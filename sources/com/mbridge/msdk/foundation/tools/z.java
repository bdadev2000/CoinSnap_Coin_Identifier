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

/* loaded from: classes4.dex */
public final class z extends j {
    private static String A = "";
    private static Object B = null;
    private static int C = 0;
    private static int D = 0;
    private static String E = "";

    /* renamed from: e, reason: collision with root package name */
    private static String f13643e = "";

    /* renamed from: f, reason: collision with root package name */
    private static String f13644f = "";

    /* renamed from: g, reason: collision with root package name */
    private static int f13645g = -1;

    /* renamed from: h, reason: collision with root package name */
    private static String f13646h = "";

    /* renamed from: i, reason: collision with root package name */
    private static int f13647i = -1;

    /* renamed from: j, reason: collision with root package name */
    private static int f13648j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static String f13649k = "";

    /* renamed from: l, reason: collision with root package name */
    private static int f13650l = -1;

    /* renamed from: m, reason: collision with root package name */
    private static String f13651m = "";

    /* renamed from: n, reason: collision with root package name */
    private static String f13652n = "";

    /* renamed from: o, reason: collision with root package name */
    private static volatile int f13653o = -1;

    /* renamed from: p, reason: collision with root package name */
    private static String f13654p = "";

    /* renamed from: q, reason: collision with root package name */
    private static String f13655q = "";

    /* renamed from: r, reason: collision with root package name */
    private static int f13656r = -1;

    /* renamed from: s, reason: collision with root package name */
    private static int f13657s = -1;

    /* renamed from: t, reason: collision with root package name */
    private static int f13658t = 0;
    private static String u = "";

    /* renamed from: v, reason: collision with root package name */
    private static String f13659v = null;

    /* renamed from: w, reason: collision with root package name */
    private static int f13660w = 0;

    /* renamed from: x, reason: collision with root package name */
    private static String f13661x = "";

    /* renamed from: y, reason: collision with root package name */
    private static int f13662y = -1;

    /* renamed from: z, reason: collision with root package name */
    private static int f13663z;

    private static void B() {
        String str = Build.VERSION.RELEASE;
        String h10 = h();
        String str2 = Build.DISPLAY;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(h10)) {
            StringBuilder p10 = a4.j.p("Mozilla/5.0 (Linux; Android ", str, "; ", h10, " Build/");
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            f13661x = vd.e.h(p10, str2, ") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
            return;
        }
        f13661x = "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
    }

    private static long C() {
        Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (c10 != null) {
            ActivityManager activityManager = (ActivityManager) c10.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
        return 0L;
    }

    private static String D() {
        String str;
        if (!TextUtils.isEmpty(f13646h)) {
            return f13646h;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            str = (String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
        } catch (Throwable th2) {
            ad.b("SameDiTool", th2.getMessage());
            str = null;
        }
        try {
            if (!TextUtils.isEmpty(str) && str.equals("harmony")) {
                jSONObject.put("osType", str);
                try {
                    Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
                    jSONObject.put("version", (String) cls2.getMethod("getVersion", new Class[0]).invoke(cls2, new Object[0]));
                } catch (Throwable th3) {
                    ad.b("SameDiTool", th3.getMessage());
                }
                try {
                    jSONObject.put("pure_state", Settings.Secure.getInt(com.mbridge.msdk.foundation.controller.c.m().c().getContentResolver(), "pure_mode_state", -1));
                } catch (Throwable th4) {
                    ad.b("SameDiTool", th4.getMessage());
                }
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    jSONObject2 = x.b(jSONObject2);
                }
                f13646h = jSONObject2;
            } else {
                f13646h = "android";
            }
        } catch (Throwable th5) {
            ad.b("SameDiTool", th5.getMessage());
        }
        return f13646h;
    }

    public static String a(Context context, int i10) {
        TelephonyManager telephonyManager;
        if (i10 == 0 || i10 == 9) {
            return "";
        }
        try {
            return (!com.mbridge.msdk.foundation.same.a.f13294z || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : String.valueOf(telephonyManager.getNetworkType());
        } catch (Throwable th2) {
            ad.b("SameDiTool", th2.getMessage(), th2);
            return "";
        }
    }

    public static int b(int i10) {
        switch (i10) {
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
        if (D == 0) {
            D = ai.f(str);
        }
        return D;
    }

    public static int f() {
        try {
        } catch (Throwable th2) {
            ad.b("SameDiTool", th2.getMessage(), th2);
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return 0;
        }
        Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
        long j3 = 0;
        long longValue = ((Long) al.a(c10, "FreeRamSize", 0L)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - longValue > 1800000 || f13656r == -1) {
            Context c11 = com.mbridge.msdk.foundation.controller.c.m().c();
            if (c11 != null) {
                ActivityManager activityManager = (ActivityManager) c11.getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                j3 = memoryInfo.availMem;
            }
            f13656r = Long.valueOf((j3 / 1000) / 1000).intValue();
            al.b(c10, "FreeRamSize", Long.valueOf(currentTimeMillis));
        }
        return f13656r;
    }

    public static String g() {
        if (TextUtils.isEmpty(f13661x)) {
            f(com.mbridge.msdk.foundation.controller.c.m().c());
        }
        return f13661x;
    }

    public static String h() {
        return !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.MODEL;
    }

    public static String i() {
        com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA);
        return "";
    }

    public static void j() {
        try {
            Object a = al.a(com.mbridge.msdk.foundation.controller.c.m().c(), MBridgeConstans.SP_GA_ID, "");
            Object a10 = al.a(com.mbridge.msdk.foundation.controller.c.m().c(), MBridgeConstans.SP_GA_ID_LIMIT, 0);
            if (a instanceof String) {
                String str = (String) a;
                if (!TextUtils.isEmpty(str)) {
                    e.a(str);
                }
                if (a10 instanceof Integer) {
                    e.f13612d = ((Integer) a10).intValue();
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("SameDiTool", e2.getMessage());
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
        return !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.MANUFACTURER;
    }

    public static String m() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static String n() {
        Context c10;
        long a;
        long C2;
        String z10;
        String str;
        String str2;
        String str3 = "";
        try {
            c10 = com.mbridge.msdk.foundation.controller.c.m().c();
            a = y.a();
            C2 = C();
            z10 = z(c10);
            str = "app_tki_" + a + "_" + C2 + "_" + z10;
            str2 = (String) al.a(c10, str, "");
            try {
            } catch (Exception e2) {
                e = e2;
                str3 = str2;
                e.printStackTrace();
                return str3;
            }
        } catch (Exception e10) {
            e = e10;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("1", z10);
            jSONObject.put(MBridgeConstans.API_REUQEST_CATEGORY_APP, String.valueOf(C2));
            jSONObject.put("3", String.valueOf(a));
            jSONObject.put("4", "");
            jSONObject.put(CampaignEx.CLICKMODE_ON, "");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        str3 = a.a(jSONObject.toString());
        al.b(c10, str, str3);
        return str3;
    }

    public static int o() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return 0;
        }
        if (f13657s < 1) {
            try {
                Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
                long longValue = ((Long) al.a(c10, "TotalRamSize", 0L)).longValue();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - longValue > 1800000 || f13657s == -1) {
                    f13657s = Long.valueOf((C() / 1000) / 1000).intValue();
                    al.b(c10, "TotalRamSize", Long.valueOf(currentTimeMillis));
                }
            } catch (Throwable th2) {
                ad.b("SameDiTool", th2.getMessage(), th2);
            }
        }
        return f13657s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        if (r1 == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        if (r1 == 0) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String p() {
        /*
            java.lang.String r0 = "SameDiTool"
            com.mbridge.msdk.foundation.controller.authoritycontroller.c r1 = com.mbridge.msdk.foundation.controller.authoritycontroller.c.j()
            java.lang.String r2 = "authority_general_data"
            boolean r1 = r1.c(r2)
            if (r1 != 0) goto L11
            java.lang.String r0 = ""
            return r0
        L11:
            int r1 = com.mbridge.msdk.foundation.tools.z.f13660w
            java.lang.String r2 = "GB"
            if (r1 <= 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = com.mbridge.msdk.foundation.tools.z.f13660w
            java.lang.String r0 = vd.e.g(r0, r1, r2)
            return r0
        L23:
            java.lang.String r1 = "/proc/meminfo"
            r3 = 0
            com.mbridge.msdk.foundation.tools.z.f13660w = r3
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L8a
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L8a
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6f
            r5 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6f
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.lang.String r5 = "\\s+"
            java.lang.String[] r3 = r3.split(r5)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r5 = 1
            r3 = r3[r5]     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r1.close()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r3 == 0) goto L62
            java.lang.Float r5 = new java.lang.Float     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            float r3 = r3.floatValue()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r6 = 1233125376(0x49800000, float:1048576.0)
            float r3 = r3 / r6
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            double r5 = r5.doubleValue()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            double r5 = java.lang.Math.ceil(r5)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            int r3 = (int) r5     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            com.mbridge.msdk.foundation.tools.z.f13660w = r3     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
        L62:
            r4.close()     // Catch: java.io.IOException -> L86
            goto L86
        L66:
            r3 = move-exception
            goto L78
        L68:
            r3 = move-exception
            goto L8e
        L6a:
            r1 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L78
        L6f:
            r1 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L8e
        L74:
            r1 = move-exception
            r4 = r3
            r3 = r1
            r1 = r4
        L78:
            java.lang.String r5 = r3.getMessage()     // Catch: java.lang.Throwable -> Lad
            com.mbridge.msdk.foundation.tools.ad.b(r0, r5, r3)     // Catch: java.lang.Throwable -> Lad
            if (r4 == 0) goto L84
            r4.close()     // Catch: java.io.IOException -> L84
        L84:
            if (r1 == 0) goto La1
        L86:
            r1.close()     // Catch: java.io.IOException -> L9d
            goto La1
        L8a:
            r1 = move-exception
            r4 = r3
            r3 = r1
            r1 = r4
        L8e:
            java.lang.String r5 = r3.getMessage()     // Catch: java.lang.Throwable -> Lad
            com.mbridge.msdk.foundation.tools.ad.b(r0, r5, r3)     // Catch: java.lang.Throwable -> Lad
            if (r4 == 0) goto L9a
            r4.close()     // Catch: java.io.IOException -> L9a
        L9a:
            if (r1 == 0) goto La1
            goto L86
        L9d:
            r0 = move-exception
            r0.printStackTrace()
        La1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = com.mbridge.msdk.foundation.tools.z.f13660w
            java.lang.String r0 = vd.e.g(r0, r1, r2)
            return r0
        Lad:
            r0 = move-exception
            if (r4 == 0) goto Lb3
            r4.close()     // Catch: java.io.IOException -> Lb3
        Lb3:
            if (r1 == 0) goto Lbd
            r1.close()     // Catch: java.io.IOException -> Lb9
            goto Lbd
        Lb9:
            r1 = move-exception
            r1.printStackTrace()
        Lbd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.z.p():java.lang.String");
    }

    public static int q(Context context) {
        if (context == null) {
            return f13663z;
        }
        int i10 = f13663z;
        if (i10 != 0) {
            return i10;
        }
        try {
            int i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            f13663z = i11;
            return i11;
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static int r() {
        try {
            if (ai.h()) {
                return 1;
            }
            return ai.i() ? 2 : 0;
        } catch (Exception e2) {
            ad.b("SameDiTool", e2.getMessage());
            return 0;
        }
    }

    public static int s() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static int t() {
        return f13662y;
    }

    public static int u() {
        if (C == 0) {
            C = ai.e();
        }
        return C;
    }

    public static int v() {
        return f13650l;
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
                        if (!TextUtils.isEmpty(str) && !str.equals(z.f13661x)) {
                            String unused2 = z.f13661x = str;
                            z.y(context);
                        }
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }).start();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Context context) {
        try {
            al.b(context, "mbridge_ua", f13661x);
        } catch (Throwable th2) {
            ad.b("SameDiTool", th2.getMessage(), th2);
        }
    }

    private static String z(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(f13644f)) {
                    f13644f = ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
                }
            } else {
                f13644f = "";
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            f13644f = "";
        }
        return f13644f;
    }

    public static Object b(String str) {
        if (B == null) {
            B = ai.g(str);
        }
        return B;
    }

    public static String e(Context context) {
        if (context == null) {
            return f13655q;
        }
        try {
            if (TextUtils.isEmpty(f13655q)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
                f13655q = str;
                return str;
            }
            return f13655q;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static int i(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap h10 = h(context);
            return h10.get("width") == null ? displayMetrics.widthPixels : ((Integer) h10.get("width")).intValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static int t(Context context) {
        if (context == null) {
            return f13658t;
        }
        if (f13658t == 0) {
            try {
                f13658t = context.getApplicationInfo().targetSdkVersion;
            } catch (Exception e2) {
                ad.b("SameDiTool", e2.getMessage());
            }
        }
        return f13658t;
    }

    public static boolean v(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static String w() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f13654p)) {
            f13654p = s() + "";
        }
        return f13654p;
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
        } catch (Exception e2) {
            ad.b("SameDiTool", "", e2);
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
        } catch (Exception e2) {
            ad.b("SameDiTool", e2.getMessage(), e2);
        }
        return hashMap;
    }

    public static String k(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(f13652n)) {
                    if (context == null) {
                        f13652n = "";
                        return f13651m;
                    }
                    String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                    if (ai.j(simOperator)) {
                        f13652n = simOperator.substring(Math.min(3, simOperator.length()));
                    }
                }
            } else {
                f13652n = "";
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            f13652n = "";
        }
        return f13652n;
    }

    public static int l(Context context) {
        try {
            final Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                return f13653o;
            }
            if (c10 == null) {
                return f13653o;
            }
            if (f13653o != -1) {
                try {
                    Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.foundation.tools.z.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                ConnectivityManager connectivityManager = (ConnectivityManager) c10.getSystemService("connectivity");
                                if (connectivityManager != null && com.mbridge.msdk.foundation.same.a.f13294z) {
                                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                    if (activeNetworkInfo == null) {
                                        int unused = z.f13653o = 0;
                                        return;
                                    }
                                    if (activeNetworkInfo.getType() == 1) {
                                        int unused2 = z.f13653o = 9;
                                        return;
                                    }
                                    TelephonyManager telephonyManager = (TelephonyManager) c10.getSystemService("phone");
                                    if (telephonyManager == null) {
                                        int unused3 = z.f13653o = 0;
                                    } else {
                                        int unused4 = z.f13653o = z.b(telephonyManager.getNetworkType());
                                    }
                                }
                            } catch (Exception e2) {
                                ad.b("SameDiTool", e2.getMessage(), e2);
                                int unused5 = z.f13653o = 0;
                            }
                        }
                    };
                    if (com.mbridge.msdk.foundation.same.f.b.d().getActiveCount() < 1) {
                        com.mbridge.msdk.foundation.same.f.b.d().execute(runnable);
                    }
                } catch (Throwable th2) {
                    ad.b("SameDiTool", th2.getMessage());
                }
                return f13653o;
            }
            f13653o = 0;
            return f13653o;
        } catch (Exception e2) {
            ad.b("SameDiTool", e2.getMessage(), e2);
            f13653o = 0;
            return f13653o;
        }
    }

    public static String m(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        try {
            return Settings.System.getString(context.getContentResolver(), "time_12_24");
        } catch (Exception e2) {
            ad.b("SameDiTool", e2.getMessage(), e2);
            return "";
        } catch (Throwable th2) {
            ad.b("SameDiTool", th2.getMessage(), th2);
            return "";
        }
    }

    public static String s(Context context) {
        Locale locale;
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return "";
        }
        if (TextUtils.isEmpty(f13649k)) {
            if (context == null) {
                return "en-US";
            }
            try {
                if (context.getResources() == null || context.getResources().getConfiguration() == null || (locale = context.getResources().getConfiguration().locale) == null) {
                    return "en-US";
                }
                String languageTag = locale.toLanguageTag();
                f13649k = languageTag;
                return languageTag;
            } catch (Throwable th2) {
                ad.a("SameDiTool", th2.getMessage());
                f13649k = "en-US";
            }
        }
        return f13649k;
    }

    public static String y() {
        try {
        } catch (Throwable th2) {
            ad.b("SameDiTool", th2.getMessage(), th2);
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
            return "";
        }
        if (TextUtils.isEmpty(u)) {
            new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.z.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        String unused = z.u = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                }
            }).start();
            return u;
        }
        return u;
    }

    public static void c(int i10) {
        f13650l = i10;
    }

    public static int g(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return 0;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            HashMap h10 = h(context);
            return h10.get("height") == null ? displayMetrics.heightPixels : ((Integer) h10.get("height")).intValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static int r(Context context) {
        Configuration configuration;
        return (context == null || context.getResources() == null || (configuration = context.getResources().getConfiguration()) == null || configuration.orientation != 2) ? 1 : 2;
    }

    public static int u(Context context) {
        if (f13645g == -1) {
            f13645g = ai.c(context, "com.tencent.mm") ? 1 : 0;
        }
        return f13645g;
    }

    public static String x() {
        return !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) ? "" : Build.BRAND;
    }

    public static String a(String str, Context context) {
        try {
        } catch (Exception e2) {
            ad.b("SameDiTool", e2.getMessage(), e2);
        }
        if (!TextUtils.isEmpty(f13643e)) {
            return f13643e;
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            f13643e = context.getPackageManager().getInstallerPackageName(str);
            ad.a("SameDiTool", "PKGSource:" + f13643e);
        }
        return f13643e;
    }

    public static int q() {
        try {
        } catch (Exception e2) {
            f13648j = 0;
            ad.b("SameDiTool", e2.getMessage());
        }
        if (!af.a.a().a("v_a_d_p", false)) {
            return 0;
        }
        if (ai.h()) {
            f13648j = 1;
        } else if (ai.i()) {
            f13648j = 2;
        } else {
            f13648j = 0;
        }
        return f13648j;
    }

    public static int z() {
        if (f13647i == -1) {
            f13647i = ai.f() ? 1 : 0;
        }
        return f13647i;
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
            com.mbridge.msdk.foundation.same.a.B = false;
            com.mbridge.msdk.foundation.same.a.f13294z = ai.a("android.permission.ACCESS_NETWORK_STATE", context);
            t(context);
            D();
            e.e();
            try {
                com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.z.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.mbridge.msdk.e.c.a();
                        } catch (Exception e2) {
                            ad.b("SameDiTool", e2.getMessage());
                        }
                    }
                });
            } catch (Throwable th2) {
                ad.b("SameDiTool", th2.getMessage());
            }
        } catch (Throwable th3) {
            ad.b("SameDiTool", th3.getMessage());
        }
    }

    public static String j(Context context) {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                if (TextUtils.isEmpty(f13651m)) {
                    if (context == null) {
                        f13651m = "";
                        return "";
                    }
                    String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                    if (ai.j(simOperator)) {
                        f13651m = simOperator.substring(0, Math.min(3, simOperator.length()));
                    }
                }
            } else {
                f13651m = "";
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            f13651m = "";
        }
        return f13651m;
    }

    public static String f(Context context) {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return null;
        }
        if (TextUtils.isEmpty(f13661x)) {
            try {
                f13661x = al.a(context, "mbridge_ua", "").toString();
            } catch (Throwable th2) {
                ad.b("SameDiTool", th2.getMessage(), th2);
            }
        }
        try {
            if ((Looper.myLooper() == Looper.getMainLooper()) && !MBridgeConstans.DNT_GUA_ON_UI) {
                if (TextUtils.isEmpty(f13661x)) {
                    try {
                        f13661x = WebSettings.getDefaultUserAgent(context);
                    } catch (Throwable unused) {
                    }
                    if (TextUtils.isEmpty(f13661x)) {
                        try {
                            Constructor declaredConstructor = WebSettings.class.getDeclaredConstructor(Context.class, WebView.class);
                            declaredConstructor.setAccessible(true);
                            f13661x = ((WebSettings) declaredConstructor.newInstance(context, null)).getUserAgentString();
                            declaredConstructor.setAccessible(false);
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                        if (TextUtils.isEmpty(f13661x)) {
                            try {
                                f13661x = new WebView(context).getSettings().getUserAgentString();
                            } catch (Throwable th4) {
                                th4.printStackTrace();
                            }
                        }
                        if (TextUtils.isEmpty(f13661x)) {
                            B();
                        }
                    }
                } else {
                    x(context);
                }
            } else {
                if (TextUtils.isEmpty(f13661x)) {
                    B();
                }
                x(context);
            }
        } catch (Throwable th5) {
            ad.b("SameDiTool", th5.getMessage(), th5);
        }
        y(context);
        return f13661x;
    }

    public static String n(Context context) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA) || context == null) {
            return "";
        }
        if (!TextUtils.isEmpty(f13659v)) {
            return f13659v;
        }
        BufferedReader bufferedReader2 = null;
        try {
            try {
                try {
                    fileReader = new FileReader("/proc/meminfo");
                    try {
                        bufferedReader = new BufferedReader(fileReader, 8192);
                    } catch (IOException e2) {
                        e = e2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e10) {
                    e = e10;
                    fileReader = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileReader = null;
                }
                try {
                    String formatFileSize = Formatter.formatFileSize(context, Long.valueOf(bufferedReader.readLine().split("\\s+")[1]).longValue() * 1024);
                    f13659v = formatFileSize;
                    try {
                        bufferedReader.close();
                    } catch (IOException e11) {
                        ad.b("SameDiTool", e11.getMessage(), e11);
                    }
                    try {
                        fileReader.close();
                    } catch (IOException e12) {
                        ad.b("SameDiTool", e12.getMessage(), e12);
                    }
                    return formatFileSize;
                } catch (IOException e13) {
                    e = e13;
                    bufferedReader2 = bufferedReader;
                    ad.b("SameDiTool", e.getMessage(), e);
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
                } catch (Throwable th4) {
                    th = th4;
                    bufferedReader2 = bufferedReader;
                    ad.b("SameDiTool", th.getMessage(), th);
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e15) {
                            ad.b("SameDiTool", e15.getMessage(), e15);
                        }
                    }
                    if (fileReader != null) {
                        fileReader.close();
                    }
                    return "";
                }
            } catch (IOException e16) {
                ad.b("SameDiTool", e16.getMessage(), e16);
                return "";
            }
        } finally {
        }
    }

    public static String p(Context context) {
        if (context == null) {
            return A;
        }
        try {
            if (TextUtils.isEmpty(A)) {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                A = str;
                return str;
            }
            return A;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
