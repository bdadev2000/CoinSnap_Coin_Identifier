package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.fragment.app.FragmentTransaction;
import com.applovin.impl.L;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.MBDownloadConfig;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper;
import com.mbridge.msdk.foundation.download.resource.ResourceConfig;
import com.mbridge.msdk.foundation.download.utils.ILogger;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.MIMManager;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ai extends m {

    /* renamed from: a, reason: collision with root package name */
    private static int f16005a = 0;
    private static int b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static int f16006c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static int f16007d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static int f16008e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f16009f = 7;

    /* renamed from: g, reason: collision with root package name */
    private static int f16010g = 14;

    /* renamed from: h, reason: collision with root package name */
    private static int f16011h = 19;

    /* renamed from: i, reason: collision with root package name */
    private static int f16012i = 16;

    /* renamed from: j, reason: collision with root package name */
    private static int f16013j = 26;

    /* renamed from: k, reason: collision with root package name */
    private static char[] f16014k = {'.', 'X'};
    private static char[] l = {'A', 'p', 'p', 'l', 'i', 'c', 'a', 't', 'i', 'o', 'n', 'I', 'n', 'f', 'o'};
    private static int m = 1;

    /* renamed from: n, reason: collision with root package name */
    private static boolean f16015n = true;

    /* renamed from: o, reason: collision with root package name */
    private static volatile Boolean f16016o = null;

    /* renamed from: p, reason: collision with root package name */
    private static String f16017p = "[一-龥]";

    /* renamed from: q, reason: collision with root package name */
    private static Pattern f16018q = Pattern.compile("[一-龥]");

    /* renamed from: r, reason: collision with root package name */
    private static Map<String, String> f16019r;

    /* renamed from: s, reason: collision with root package name */
    private static Map<String, String> f16020s;

    public static int a(int i9) {
        if ((i9 > 100 && i9 < 199) || i9 == 2) {
            return 1;
        }
        if ((i9 <= 200 || i9 >= 299) && i9 != 4) {
            return (i9 <= 500 || i9 >= 599) ? -1 : 5;
        }
        return 2;
    }

    public static int b(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                packageInfo = WebView.getCurrentWebViewPackage();
            } else {
                packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            }
            com.mbridge.msdk.c.g b8 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b8 == null) {
                com.mbridge.msdk.c.h.a();
                b8 = com.mbridge.msdk.c.i.a();
            }
            if (packageInfo == null || TextUtils.isEmpty(packageInfo.versionName) || !packageInfo.versionName.equals("77.0.3865.92")) {
                return b8.az();
            }
            return 5;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int c(Context context) {
        if (context != null) {
            return 0;
        }
        try {
            if (context.getResources().getIdentifier("config_showNavigationBar", "bool", "android") != 0) {
                return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return 0;
    }

    public static float d(Context context) {
        if (context == null) {
            return 2.5f;
        }
        try {
            float f9 = context.getResources().getDisplayMetrics().density;
            if (f9 == 0.0f) {
                return 2.5f;
            }
            return f9;
        } catch (Exception e4) {
            e4.printStackTrace();
            return 2.5f;
        }
    }

    public static int e(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return n(context).heightPixels;
        } catch (Exception e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    public static int f(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return n(context).widthPixels;
        } catch (Exception e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    public static int g(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    public static int h(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    public static float i(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int j(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    public static boolean k(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public static boolean l(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("SameTools", "isNetworkAvailable", e4);
            }
            return false;
        }
    }

    public static boolean m(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return "wifi".equals(activeNetworkInfo.getTypeName().toLowerCase(Locale.US));
            }
            return false;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    private static DisplayMetrics n(Context context) {
        if (context == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (Throwable th) {
            th.printStackTrace();
            return context.getResources().getDisplayMetrics();
        }
    }

    public static String a(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                HashMap hashMap = new HashMap();
                hashMap.put(str2, str3);
                return a(str, hashMap);
            }
            return str;
        } catch (Exception e4) {
            ad.b("SameTools", e4.getMessage());
            return str;
        }
    }

    public static synchronized String d(String str) {
        synchronized (ai.class) {
            String str2 = com.mbridge.msdk.foundation.controller.c.m().k() + "_" + str;
            Map<String, String> map = f16020s;
            if (map == null || !map.containsKey(str2)) {
                return null;
            }
            return f16020s.get(str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean i(java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L56
            if (r4 == 0) goto L4c
            java.lang.String r0 = "dyview"
            java.lang.String r0 = r4.getQueryParameter(r0)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L56
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L56
            if (r2 == 0) goto L24
            java.lang.String r0 = "view"
            java.lang.String r0 = r4.getQueryParameter(r0)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L56
            goto L24
        L21:
            r4 = move-exception
            r0 = r1
            goto L4d
        L24:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L56
            r3 = 1
            if (r2 != 0) goto L37
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L56
            goto L31
        L30:
            r0 = -1
        L31:
            int r0 = r0 % 2
            if (r0 != 0) goto L37
            r0 = r3
            goto L38
        L37:
            r0 = r1
        L38:
            java.lang.String r2 = "natmp"
            java.lang.String r4 = r4.getQueryParameter(r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            if (r4 != 0) goto L46
            r1 = r3
            goto L4c
        L46:
            r1 = r0
            goto L4c
        L48:
            r1 = r0
            goto L56
        L4a:
            r4 = move-exception
            goto L4d
        L4c:
            return r1
        L4d:
            java.lang.String r2 = "SameTools"
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L48
            com.mbridge.msdk.foundation.tools.ad.b(r2, r4)     // Catch: java.lang.Throwable -> L48
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ai.i(java.lang.String):boolean");
    }

    public static final synchronized String e(String str) {
        String str2;
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        JSONObject jSONObject;
        Map<String, String> map;
        synchronized (ai.class) {
            try {
                try {
                    str2 = com.mbridge.msdk.foundation.controller.c.m().k() + "_" + str;
                    com.mbridge.msdk.c.g b8 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                    if (b8 != null) {
                        z8 = b8.aA();
                        z9 = b8.aF();
                        i10 = Math.max(0, b8.ab());
                    } else {
                        z8 = true;
                        i10 = 3;
                        z9 = false;
                    }
                } catch (Exception e4) {
                    ad.b("SameTools", e4.getMessage());
                }
                if (z9 && i10 != 0) {
                    if (z8 && (map = f16019r) != null && map.containsKey(str2)) {
                        return f16019r.get(str2);
                    }
                    StringBuilder sb = new StringBuilder("");
                    StackTraceElement[] stackTrace = new Exception().getStackTrace();
                    if (stackTrace != null && stackTrace.length > 0) {
                        List<String> a6 = a(stackTrace);
                        Collections.reverse(a6);
                        ArrayList arrayList = new ArrayList();
                        for (String str3 : a6) {
                            if (!str3.startsWith(MBridgeConstans.APPLICATION_STACK_COM_ANDROID) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_OS) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_APP) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_REFLECT_METHOD) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_VIEW) && !arrayList.contains(str3)) {
                                arrayList.add(str3);
                            }
                        }
                        int min = Math.min(arrayList.size(), i10);
                        if (min > 0) {
                            for (i9 = 0; i9 < min; i9++) {
                                sb.append((String) arrayList.get(i9));
                                if (i9 < min - 1) {
                                    sb.append("|");
                                }
                            }
                        }
                        if (TextUtils.isEmpty(sb.toString())) {
                            jSONObject = null;
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("1", sb.toString());
                        }
                        if (jSONObject != null && jSONObject.length() > 0) {
                            String a9 = a.a(jSONObject.toString());
                            if (z8 && !TextUtils.isEmpty(a9)) {
                                if (f16019r == null) {
                                    f16019r = new HashMap();
                                }
                                f16019r.put(str2, a9);
                            }
                            return a9;
                        }
                        return "";
                    }
                    return "";
                }
                return "";
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int f(String str) {
        try {
            return ((Integer) Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("getWXAppSupportAPI", null).invoke(z.b(str), null)).intValue();
        } catch (Throwable th) {
            ad.b("SameTools", th.getMessage());
            return 0;
        }
    }

    public static Object g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory").getMethod("createWXAPI", Context.class, String.class).invoke(null, com.mbridge.msdk.foundation.controller.c.m().c(), str);
        } catch (ClassNotFoundException e4) {
            ad.b("SameTools", e4.getMessage());
            return null;
        } catch (IllegalAccessException e9) {
            ad.b("SameTools", e9.getMessage());
            return null;
        } catch (NoSuchMethodException e10) {
            ad.b("SameTools", e10.getMessage());
            return null;
        } catch (InvocationTargetException e11) {
            ad.b("SameTools", e11.getMessage());
            return null;
        }
    }

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_CAN_ANIM);
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            return queryParameter.equals("1");
        } catch (Exception e4) {
            ad.b("SameTools", e4.getMessage());
            return false;
        }
    }

    public static <T extends String> boolean k(T t9) {
        return t9 == null || t9.length() == 0;
    }

    public static double m(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0.0d;
            }
            return Double.parseDouble(str);
        } catch (Exception e4) {
            e4.printStackTrace();
            return 0.0d;
        }
    }

    public static String c(String str) {
        ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> a6;
        List<String> c9;
        if (TextUtils.isEmpty(str) || (a6 = com.mbridge.msdk.foundation.same.a.b.a(str)) == null || a6.size() <= 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (com.mbridge.msdk.foundation.entity.c cVar : a6.values()) {
            if (cVar != null) {
                long e4 = cVar.e();
                long f9 = cVar.f();
                long currentTimeMillis = System.currentTimeMillis();
                if (e4 <= 0) {
                    com.mbridge.msdk.c.g f10 = L.f(com.mbridge.msdk.c.h.a());
                    if (f10 == null) {
                        com.mbridge.msdk.c.h.a();
                        f10 = com.mbridge.msdk.c.i.a();
                    }
                    if ((f10.aa() * 1000) + f9 >= currentTimeMillis) {
                        c9 = cVar.c();
                        if (c9 != null) {
                            arrayList.addAll(c9);
                        }
                    }
                } else if ((e4 * 1000) + f9 >= currentTimeMillis) {
                    c9 = cVar.c();
                    if (c9 != null && c9.size() > 0) {
                        arrayList.addAll(c9);
                    }
                }
            }
        }
        if (arrayList.size() <= 0) {
            return "";
        }
        HashSet hashSet = new HashSet(arrayList);
        arrayList.clear();
        arrayList.addAll(hashSet);
        return arrayList.toString();
    }

    public static boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter("isplayableec");
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            return queryParameter.equals("0");
        } catch (Exception e4) {
            ad.b("SameTools", e4.getMessage());
            return false;
        }
    }

    private static String a(String str, Map<String, String> map) {
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                StringBuilder sb = new StringBuilder(str);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry != null && !TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                        String value = entry.getValue();
                        if (str.contains(entry.getKey())) {
                            if (value.equals("0")) {
                                sb = new StringBuilder(str.replaceAll("(" + entry.getKey() + "[^&]*)", ""));
                            } else {
                                sb = new StringBuilder(str.replaceAll("(" + entry.getKey() + "[^&]*)", entry.getKey() + entry.getValue()));
                            }
                        } else if (!value.equals("0")) {
                            sb.append(entry.getKey() + entry.getValue());
                        }
                    }
                }
                return sb.toString();
            }
            return str;
        } catch (Exception e4) {
            ad.b("SameTools", e4.getMessage());
            return str;
        }
    }

    public static String d() {
        String str;
        try {
            str = UUID.randomUUID().toString() + System.currentTimeMillis();
        } catch (Throwable th) {
            th.printStackTrace();
            str = "";
        }
        if (!an.a(str)) {
            return str;
        }
        return System.currentTimeMillis() + "";
    }

    public static <T extends String> boolean j(T t9) {
        return t9 != null && t9.length() > 0;
    }

    public static BitmapDrawable n(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (decodeByteArray != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(decodeByteArray);
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                bitmapDrawable.setTileModeXY(tileMode, tileMode);
                return bitmapDrawable;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    public static void j() {
        HandlerThread handlerThread = new HandlerThread("mb_db_thread");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MBDownloadConfig.Builder builder = new MBDownloadConfig.Builder();
        builder.setDatabaseHandler(handler);
        builder.setDatabaseOpenHelper(new IDatabaseOpenHelper() { // from class: com.mbridge.msdk.foundation.tools.ai.2
            @Override // com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper
            public final SQLiteDatabase getReadableDatabase() {
                return com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()).c();
            }

            @Override // com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper
            public final SQLiteDatabase getWritableDatabase() {
                return com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()).d();
            }
        });
        builder.setLogger(new ILogger() { // from class: com.mbridge.msdk.foundation.tools.ai.3
            @Override // com.mbridge.msdk.foundation.download.utils.ILogger
            public final void log(String str, String str2) {
                ad.a(str, str2);
            }

            @Override // com.mbridge.msdk.foundation.download.utils.ILogger
            public final void log(String str, Exception exc) {
                ad.a(str, exc.getMessage());
            }
        });
        MBDownloadManager.getInstance().initialize(com.mbridge.msdk.foundation.controller.c.m().c(), builder.build(), new ResourceConfig.Builder().setMaxStorageSpace(100L).setMaxStorageTime(259200000L).build());
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return -1;
            }
            String queryParameter = parse.getQueryParameter("dyview");
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = parse.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            }
            if (TextUtils.isEmpty(queryParameter)) {
                return -1;
            }
            try {
                return Integer.parseInt(queryParameter);
            } catch (Exception unused) {
                return -1;
            }
        } catch (Exception e4) {
            ad.b("SameTools", e4.getMessage());
            return -1;
        }
    }

    public static boolean f() {
        if (TextUtils.isEmpty(com.mbridge.msdk.foundation.controller.c.m().h())) {
            return false;
        }
        try {
            Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
            Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram");
            return true;
        } catch (ClassNotFoundException e4) {
            ad.b("SameTools", e4.getMessage());
            return false;
        }
    }

    public static boolean h() {
        NetworkInfo networkInfo;
        try {
            ConnectivityManager a6 = u.a();
            if (a6 != null && (networkInfo = a6.getNetworkInfo(17)) != null) {
                return networkInfo.isConnected();
            }
            return false;
        } catch (Exception e4) {
            ad.b("SameTools", e4.getMessage());
            return false;
        }
    }

    public static synchronized int d(Context context, String str) {
        int i9;
        synchronized (ai.class) {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        i9 = b(str, context) != null ? 1 : 0;
                    } catch (Exception unused) {
                        i9 = 3;
                    }
                }
            }
            if (context == null) {
                i9 = 5;
            } else {
                i9 = TextUtils.isEmpty(str) ? 2 : 4;
            }
        }
        return i9;
    }

    public static boolean g() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean i() {
        try {
            if (com.mbridge.msdk.foundation.controller.c.m().c() == null) {
                return false;
            }
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (property2 == null) {
                property2 = "-1";
            }
            int parseInt = Integer.parseInt(property2);
            ad.a("address = ", property + "~");
            ad.a("port = ", parseInt + "~");
            return (TextUtils.isEmpty(property) || parseInt == -1) ? false : true;
        } catch (Throwable th) {
            ad.b("SameTools", th.getMessage());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[Catch: Exception -> 0x001c, LOOP:0: B:18:0x004c->B:19:0x004e, LOOP_END, TryCatch #0 {Exception -> 0x001c, blocks: (B:3:0x0002, B:5:0x0014, B:6:0x001e, B:8:0x0025, B:10:0x002c, B:12:0x0042, B:16:0x0048, B:19:0x004e, B:22:0x0056, B:24:0x005c), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(int r6) {
        /*
            java.lang.String r0 = ""
            com.mbridge.msdk.c.h r1 = com.mbridge.msdk.c.h.a()     // Catch: java.lang.Exception -> L1c
            com.mbridge.msdk.foundation.controller.c r2 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L1c
            java.lang.String r2 = r2.k()     // Catch: java.lang.Exception -> L1c
            com.mbridge.msdk.c.g r1 = r1.b(r2)     // Catch: java.lang.Exception -> L1c
            if (r1 != 0) goto L1e
            com.mbridge.msdk.c.h.a()     // Catch: java.lang.Exception -> L1c
            com.mbridge.msdk.c.g r1 = com.mbridge.msdk.c.i.a()     // Catch: java.lang.Exception -> L1c
            goto L1e
        L1c:
            r6 = move-exception
            goto L61
        L1e:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Exception -> L1c
            r2.<init>()     // Catch: java.lang.Exception -> L1c
            if (r1 == 0) goto L56
            int r1 = r1.q()     // Catch: java.lang.Exception -> L1c
            r3 = 1
            if (r1 != r3) goto L56
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L1c
            android.content.Context r1 = r1.c()     // Catch: java.lang.Exception -> L1c
            com.mbridge.msdk.foundation.db.g r1 = com.mbridge.msdk.foundation.db.g.a(r1)     // Catch: java.lang.Exception -> L1c
            com.mbridge.msdk.foundation.db.j r1 = com.mbridge.msdk.foundation.db.j.a(r1)     // Catch: java.lang.Exception -> L1c
            long[] r1 = r1.b()     // Catch: java.lang.Exception -> L1c
            if (r1 == 0) goto L56
            int r3 = r1.length     // Catch: java.lang.Exception -> L1c
            if (r3 <= r6) goto L4b
            if (r6 != 0) goto L48
            goto L4b
        L48:
            int r6 = r3 - r6
            goto L4c
        L4b:
            r6 = 0
        L4c:
            if (r6 >= r3) goto L56
            r4 = r1[r6]     // Catch: java.lang.Exception -> L1c
            r2.put(r4)     // Catch: java.lang.Exception -> L1c
            int r6 = r6 + 1
            goto L4c
        L56:
            int r6 = r2.length()     // Catch: java.lang.Exception -> L1c
            if (r6 <= 0) goto L64
            java.lang.String r0 = a(r2)     // Catch: java.lang.Exception -> L1c
            goto L64
        L61:
            r6.printStackTrace()
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ai.b(int):java.lang.String");
    }

    public static String a(String str) {
        try {
            if (an.b(str)) {
                return URLEncoder.encode(str, "utf-8");
            }
            return "";
        } catch (Throwable th) {
            ad.b("SameTools", th.getMessage(), th);
            return "";
        }
    }

    public static void a(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        try {
            imageView.setImageResource(0);
            imageView.setImageDrawable(null);
            imageView.setImageURI(null);
            imageView.setImageBitmap(null);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    public static final void a(final int i9, final ImageView imageView, final CampaignEx campaignEx, Context context, boolean z8, final com.mbridge.msdk.foundation.d.a aVar) {
        if (imageView == null || campaignEx == null) {
            return;
        }
        ad.a("configPrivacyButton", "configPrivacyButton");
        boolean z9 = campaignEx.getPrivacyButtonTemplateVisibility() == 0;
        ad.a("configPrivacyButton", "privacyButtonVisibilityGone: " + z9 + " isIgnoreCampaignPrivacyConfig: " + z8);
        if (!z8 && z9) {
            try {
                imageView.setVisibility(8);
                return;
            } catch (Exception e4) {
                ad.b("SameTools", e4.getMessage());
                return;
            }
        }
        if (TextUtils.isEmpty(a(campaignEx))) {
            try {
                imageView.setVisibility(8);
                return;
            } catch (Exception e9) {
                ad.b("SameTools", e9.getMessage());
                return;
            }
        }
        try {
            imageView.setVisibility(0);
        } catch (Exception e10) {
            ad.b("SameTools", e10.getMessage());
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.foundation.tools.ai.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    ai.a(campaignEx, aVar, i9, (String) imageView.getTag());
                } catch (Exception e11) {
                    ad.b("SameTools", e11.getMessage());
                }
            }
        });
    }

    public static JSONArray b(Context context, String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            com.mbridge.msdk.c.g b8 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b8 == null) {
                com.mbridge.msdk.c.h.a();
                b8 = com.mbridge.msdk.c.i.a();
            }
            if (b8 != null && b8.q() == 1) {
                ad.c("SameTools", "fqci cfc:" + b8.q());
                long[] b9 = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(context)).b();
                if (b9 != null) {
                    for (long j7 : b9) {
                        ad.c("SameTools", "cfc campaignIds:" + b9);
                        jSONArray.put(j7);
                    }
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return jSONArray;
    }

    private static final char[] c(int i9) {
        StringBuilder sb;
        if (i9 == 0) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(ah.f16003a, f16009f)));
            sb.append(f16014k[f16008e]);
            sb.append(String.valueOf(Arrays.copyOfRange(ah.f16003a, f16009f, f16010g)));
            sb.append(f16014k[f16008e]);
            sb.append(String.valueOf(Arrays.copyOfRange(ah.f16003a, f16010g, f16012i)));
            sb.append(f16014k[f16008e]);
            sb.append(String.valueOf(ag.f15996a));
        } else if (i9 == 1) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(ah.f16003a, f16009f)));
            sb.append(f16014k[f16008e]);
            sb.append(String.valueOf(Arrays.copyOfRange(ah.f16003a, f16009f, f16010g)));
            sb.append(f16014k[f16008e]);
            sb.append(String.valueOf(Arrays.copyOfRange(ah.f16003a, f16011h, f16013j)));
        } else if (i9 == 2) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOfRange(ah.f16003a, f16012i, f16011h)));
            sb.append(String.valueOf(l));
        } else if (i9 != 3) {
            sb = null;
        } else {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOfRange(ah.f16003a, f16012i, f16011h)));
            sb.append(String.valueOf(ag.f15996a));
        }
        return sb.toString().toCharArray();
    }

    public static synchronized boolean c(Context context, String str) {
        boolean z8;
        synchronized (ai.class) {
            z8 = false;
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        if (b(str, context) != null) {
                            z8 = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return z8;
    }

    public static int e() {
        try {
            return ((Integer) Class.forName("com.tencent.mm.opensdk.constants.Build").getField("SDK_INT").get(null)).intValue();
        } catch (Throwable th) {
            ad.b("SameTools", th.getMessage());
            return 0;
        }
    }

    public static int b() {
        int i9 = m;
        m = i9 + 1;
        return i9;
    }

    public static String a(CampaignEx campaignEx) {
        com.mbridge.msdk.c.g b8;
        CampaignEx.a adchoice;
        String str = "";
        if (campaignEx != null) {
            try {
                str = campaignEx.getPrivacyUrl();
            } catch (Exception e4) {
                ad.b("SameTools", e4.getMessage());
                return "";
            }
        }
        if (TextUtils.isEmpty(str) && campaignEx != null && (adchoice = campaignEx.getAdchoice()) != null) {
            str = adchoice.c();
        }
        if (TextUtils.isEmpty(str) && (b8 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k())) != null) {
            str = b8.g();
        }
        return TextUtils.isEmpty(str) ? com.mbridge.msdk.foundation.same.net.e.d.f().f15830f : str;
    }

    private static Object b(String str, Context context) {
        try {
            return Class.forName(String.valueOf(c(f16005a))).getMethod(String.valueOf(c(f16006c)), String.class, Integer.TYPE).invoke(Class.forName(String.valueOf(c(b))).getMethod(String.valueOf(c(f16007d)), null).invoke(context, null), str, Integer.valueOf(FragmentTransaction.TRANSIT_EXIT_MASK));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean c(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                return campaignEx.getRetarget_offer() == 1;
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        return false;
    }

    public static int c(String str, String str2) {
        return a(str, str2, 0);
    }

    public static final String c() {
        return MIMManager.a.a().c();
    }

    public static boolean b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            return !TextUtils.isEmpty(campaignEx.getDeepLinkURL());
        }
        return false;
    }

    public static List<String> b(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                String optString = jSONArray.optString(i9);
                if (an.b(optString)) {
                    arrayList.add(optString);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            ad.b("SameTools", th.getMessage(), th);
            return null;
        }
    }

    public static void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.d.a aVar, int i9, String str) {
        if (campaignEx == null) {
            return;
        }
        try {
            String str2 = campaignEx.getCampaignUnitId() + "_" + i9;
            com.mbridge.msdk.foundation.d.b.a().c(str2);
            com.mbridge.msdk.foundation.d.b.a().a(str2, campaignEx);
            com.mbridge.msdk.foundation.d.b.a().a(str2, aVar);
            com.mbridge.msdk.foundation.d.b.a().a(str2, i9);
            com.mbridge.msdk.foundation.d.b.a().a(str2, str);
            com.mbridge.msdk.foundation.d.b.a().a(str2).e();
        } catch (Throwable th) {
            ad.b("SameTools", "feedback error", th);
        }
    }

    public static synchronized void b(String str, String str2) {
        synchronized (ai.class) {
            try {
                if (f16020s == null) {
                    f16020s = new HashMap();
                }
                f16020s.put(com.mbridge.msdk.foundation.controller.c.m().k() + "_" + str, str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int b(Context context, float f9) {
        float f10 = 2.5f;
        if (context != null) {
            try {
                float f11 = context.getResources().getDisplayMetrics().density;
                if (f11 != 0.0f) {
                    f10 = f11;
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        return (int) ((f9 / f10) + 0.5f);
    }

    public static int a(Context context, float f9) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f9 * resources.getDisplayMetrics().density) + 0.5f);
    }

    public static String b(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = jSONObject.getJSONObject("device");
                if (jSONObject2 == null) {
                    return str;
                }
                if (jSONObject2.has(str2)) {
                    if (str3.equals("0")) {
                        jSONObject2.remove(str2);
                    } else {
                        jSONObject2.put(str2, str3);
                    }
                } else {
                    if (str3.equals("0")) {
                        return str;
                    }
                    jSONObject2.put(str2, str3);
                }
                return jSONObject.toString();
            } catch (Exception e4) {
                ad.b("SameTools", e4.getMessage());
            }
        }
        return str;
    }

    public static double a(Double d2) {
        try {
            String format = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US)).format(d2);
            if (an.b(format)) {
                return Double.parseDouble(format);
            }
            return 0.0d;
        } catch (Exception e4) {
            e4.printStackTrace();
            return 0.0d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r2 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r2 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long a(java.io.File r4) throws java.lang.Exception {
        /*
            r0 = 0
            r2 = 0
            boolean r3 = r4.exists()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L2b
            if (r3 == 0) goto L1c
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L2b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L2b
            int r4 = r3.available()     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L18
            long r0 = (long) r4
            r2 = r3
            goto L1f
        L15:
            r4 = move-exception
            r2 = r3
            goto L25
        L18:
            r2 = r3
            goto L2b
        L1a:
            r4 = move-exception
            goto L25
        L1c:
            r4.createNewFile()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L2b
        L1f:
            if (r2 == 0) goto L2e
        L21:
            r2.close()     // Catch: java.lang.Exception -> L2e
            goto L2e
        L25:
            if (r2 == 0) goto L2a
            r2.close()     // Catch: java.lang.Exception -> L2a
        L2a:
            throw r4
        L2b:
            if (r2 == 0) goto L2e
            goto L21
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ai.a(java.io.File):long");
    }

    public static String a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return "";
        }
        com.mbridge.msdk.c.g b8 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (b8 == null) {
            com.mbridge.msdk.c.h.a();
            b8 = com.mbridge.msdk.c.i.a();
        }
        int W2 = b8.W();
        if (jSONArray.length() > W2) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i9 = 0; i9 < W2; i9++) {
                try {
                    jSONArray2.put(jSONArray.get(i9));
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
            }
            return jSONArray2.toString();
        }
        return jSONArray.toString();
    }

    public static String a(Context context, String str) {
        String str2;
        str2 = "";
        try {
            JSONArray b8 = b(context, str);
            str2 = b8.length() > 0 ? a(b8) : "";
            ad.c("SameTools", "get excludes:" + str2);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return str2;
    }

    public static final int a() {
        if (f16016o == null) {
            try {
                f16016o = MIMManager.a.a().d();
            } catch (Exception e4) {
                ad.b("SameTools", e4.getMessage());
            }
        }
        if (f16016o != null) {
            return f16016o.booleanValue() ? 1 : 0;
        }
        return -1;
    }

    public static synchronized String a(Context context, String str, String str2) {
        String sb;
        synchronized (ai.class) {
            StringBuilder sb2 = new StringBuilder(str2);
            try {
                sb2.append(a(str2, context, str));
            } catch (Exception unused) {
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:13:0x0025
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    private static synchronized java.lang.String a(java.lang.String r2, android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.Class<com.mbridge.msdk.foundation.tools.ai> r0 = com.mbridge.msdk.foundation.tools.ai.class
            monitor-enter(r0)
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            java.util.Set r2 = r2.getQueryParameterNames()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            if (r2 == 0) goto L1d
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            if (r2 <= 0) goto L1d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            java.lang.String r1 = "&rtins_type="
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            goto L2c
        L1b:
            r2 = move-exception
            goto L46
        L1d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            java.lang.String r1 = "?rtins_type="
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L25
            goto L2c
        L25:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "&rtins_type="
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b
        L2c:
            java.lang.Object r3 = b(r4, r3)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L3c
            if (r3 == 0) goto L37
            r3 = 1
            r2.append(r3)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L3c
            goto L40
        L37:
            r3 = 2
            r2.append(r3)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L3c
            goto L40
        L3c:
            r3 = 0
            r2.append(r3)     // Catch: java.lang.Throwable -> L1b
        L40:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return r2
        L46:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ai.a(java.lang.String, android.content.Context, java.lang.String):java.lang.String");
    }

    private static List<String> a(StackTraceElement[] stackTraceElementArr) {
        ArrayList arrayList = new ArrayList();
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                arrayList.add(stackTraceElement.getClassName());
            }
        }
        return arrayList;
    }

    public static ImageView a(ImageView imageView, BitmapDrawable bitmapDrawable, DisplayMetrics displayMetrics) {
        try {
            bitmapDrawable.setTargetDensity(displayMetrics);
            imageView.setBackground(bitmapDrawable);
            imageView.setClickable(false);
            imageView.setFocusable(false);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return imageView;
    }

    public static void a(View view) {
        if (view == null) {
            return;
        }
        try {
            view.setSystemUiVisibility(4102);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, CampaignEx campaignEx, int i9) {
        if (TextUtils.isEmpty(str) || campaignEx == null || com.mbridge.msdk.foundation.controller.c.m().c() == null) {
            return;
        }
        com.mbridge.msdk.foundation.db.i a6 = com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
        fVar.a(System.currentTimeMillis());
        fVar.b(str);
        fVar.a(campaignEx.getId());
        fVar.a(i9);
        a6.a(fVar);
    }

    public static boolean a(String str, Context context) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0 || jSONObject.optInt("v", -1) != -1) ? false : true;
    }

    public static boolean a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            try {
                try {
                    Uri parse = Uri.parse(str2);
                    if (parse != null) {
                        return !TextUtils.isEmpty(parse.getQueryParameter(str));
                    }
                    return false;
                } catch (Exception e4) {
                    ad.b("SameTools", e4.getMessage());
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        try {
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
            return 0;
        } catch (Throwable th) {
            ad.b("SameTools", th.getMessage(), th);
            return 0;
        }
    }

    public static int a(String str, String str2, int i9) {
        if (TextUtils.isEmpty(str)) {
            return i9;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(str2);
                return TextUtils.isEmpty(queryParameter) ? i9 : (int) Math.round(Double.valueOf(String.valueOf(queryParameter)).doubleValue());
            }
        } catch (Exception e4) {
            ad.b("SameTools", e4.getMessage());
        }
        return i9;
    }
}
