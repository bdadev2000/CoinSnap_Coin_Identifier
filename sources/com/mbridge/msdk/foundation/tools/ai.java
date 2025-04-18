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
import android.widget.ImageView;
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
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ai extends m {
    private static int a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static int f13563b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static int f13564c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static int f13565d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static int f13566e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f13567f = 7;

    /* renamed from: g, reason: collision with root package name */
    private static int f13568g = 14;

    /* renamed from: h, reason: collision with root package name */
    private static int f13569h = 19;

    /* renamed from: i, reason: collision with root package name */
    private static int f13570i = 16;

    /* renamed from: j, reason: collision with root package name */
    private static int f13571j = 26;

    /* renamed from: k, reason: collision with root package name */
    private static char[] f13572k = {'.', 'X'};

    /* renamed from: l, reason: collision with root package name */
    private static char[] f13573l = {'A', 'p', 'p', 'l', 'i', 'c', 'a', 't', 'i', 'o', 'n', 'I', 'n', 'f', 'o'};

    /* renamed from: m, reason: collision with root package name */
    private static int f13574m = 1;

    /* renamed from: n, reason: collision with root package name */
    private static boolean f13575n = true;

    /* renamed from: o, reason: collision with root package name */
    private static volatile Boolean f13576o = null;

    /* renamed from: p, reason: collision with root package name */
    private static String f13577p = "[一-龥]";

    /* renamed from: q, reason: collision with root package name */
    private static Pattern f13578q = Pattern.compile("[一-龥]");

    /* renamed from: r, reason: collision with root package name */
    private static Map<String, String> f13579r;

    /* renamed from: s, reason: collision with root package name */
    private static Map<String, String> f13580s;

    public static int a(int i10) {
        if ((i10 > 100 && i10 < 199) || i10 == 2) {
            return 1;
        }
        if ((i10 <= 200 || i10 >= 299) && i10 != 4) {
            return (i10 <= 500 || i10 >= 599) ? -1 : 5;
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
                packageInfo = kotlin.io.path.b.b();
            } else {
                packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            }
            com.mbridge.msdk.c.g b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b3 == null) {
                com.mbridge.msdk.c.h.a();
                b3 = com.mbridge.msdk.c.i.a();
            }
            if (packageInfo == null || TextUtils.isEmpty(packageInfo.versionName) || !packageInfo.versionName.equals("77.0.3865.92")) {
                return b3.az();
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
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return 0;
    }

    public static float d(Context context) {
        if (context == null) {
            return 2.5f;
        }
        try {
            float f10 = context.getResources().getDisplayMetrics().density;
            if (f10 == 0.0f) {
                return 2.5f;
            }
            return f10;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 2.5f;
        }
    }

    public static int e(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return n(context).heightPixels;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static int f(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return n(context).widthPixels;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static int g(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static int h(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e2) {
            e2.printStackTrace();
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
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static boolean k(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
        } catch (Exception e2) {
            e2.printStackTrace();
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
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("SameTools", "isNetworkAvailable", e2);
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
        } catch (Exception e2) {
            e2.printStackTrace();
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
        } catch (Throwable th2) {
            th2.printStackTrace();
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
        } catch (Exception e2) {
            ad.b("SameTools", e2.getMessage());
            return str;
        }
    }

    public static synchronized String d(String str) {
        synchronized (ai.class) {
            String str2 = com.mbridge.msdk.foundation.controller.c.m().k() + "_" + str;
            Map<String, String> map = f13580s;
            if (map == null || !map.containsKey(str2)) {
                return null;
            }
            return f13580s.get(str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
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
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L54
            if (r4 == 0) goto L46
            java.lang.String r0 = "dyview"
            java.lang.String r0 = r4.getQueryParameter(r0)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L54
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L54
            if (r2 == 0) goto L20
            java.lang.String r0 = "view"
            java.lang.String r0 = r4.getQueryParameter(r0)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L54
        L20:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L54
            r3 = 1
            if (r2 != 0) goto L33
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L54
            goto L2d
        L2c:
            r0 = -1
        L2d:
            int r0 = r0 % 2
            if (r0 != 0) goto L33
            r0 = r3
            goto L34
        L33:
            r0 = r1
        L34:
            java.lang.String r2 = "natmp"
            java.lang.String r4 = r4.getQueryParameter(r2)     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L53
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L53
            if (r4 != 0) goto L42
            r1 = r3
            goto L46
        L42:
            r1 = r0
            goto L46
        L44:
            r4 = move-exception
            goto L49
        L46:
            return r1
        L47:
            r4 = move-exception
            r0 = r1
        L49:
            java.lang.String r2 = "SameTools"
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L53
            com.mbridge.msdk.foundation.tools.ad.b(r2, r4)     // Catch: java.lang.Throwable -> L53
            return r1
        L53:
            r1 = r0
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ai.i(java.lang.String):boolean");
    }

    public static final synchronized String e(String str) {
        String str2;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        JSONObject jSONObject;
        Map<String, String> map;
        synchronized (ai.class) {
            try {
                str2 = com.mbridge.msdk.foundation.controller.c.m().k() + "_" + str;
                com.mbridge.msdk.c.g b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                if (b3 != null) {
                    z10 = b3.aA();
                    z11 = b3.aF();
                    i11 = Math.max(0, b3.ab());
                } else {
                    z10 = true;
                    i11 = 3;
                    z11 = false;
                }
            } catch (Exception e2) {
                ad.b("SameTools", e2.getMessage());
            }
            if (z11 && i11 != 0) {
                if (z10 && (map = f13579r) != null && map.containsKey(str2)) {
                    return f13579r.get(str2);
                }
                StringBuilder sb2 = new StringBuilder("");
                StackTraceElement[] stackTrace = new Exception().getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    List<String> a10 = a(stackTrace);
                    Collections.reverse(a10);
                    ArrayList arrayList = new ArrayList();
                    for (String str3 : a10) {
                        if (!str3.startsWith(MBridgeConstans.APPLICATION_STACK_COM_ANDROID) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_OS) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_APP) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_REFLECT_METHOD) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_VIEW) && !arrayList.contains(str3)) {
                            arrayList.add(str3);
                        }
                    }
                    int min = Math.min(arrayList.size(), i11);
                    if (min > 0) {
                        for (i10 = 0; i10 < min; i10++) {
                            sb2.append((String) arrayList.get(i10));
                            if (i10 < min - 1) {
                                sb2.append("|");
                            }
                        }
                    }
                    if (TextUtils.isEmpty(sb2.toString())) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject();
                        jSONObject.put("1", sb2.toString());
                    }
                    if (jSONObject == null || jSONObject.length() <= 0) {
                        return "";
                    }
                    String a11 = a.a(jSONObject.toString());
                    if (z10 && !TextUtils.isEmpty(a11)) {
                        if (f13579r == null) {
                            f13579r = new HashMap();
                        }
                        f13579r.put(str2, a11);
                    }
                    return a11;
                }
                return "";
            }
            return "";
        }
    }

    public static int f(String str) {
        try {
            return ((Integer) Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("getWXAppSupportAPI", new Class[0]).invoke(z.b(str), new Object[0])).intValue();
        } catch (Throwable th2) {
            ad.b("SameTools", th2.getMessage());
            return 0;
        }
    }

    public static Object g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory").getMethod("createWXAPI", Context.class, String.class).invoke(null, com.mbridge.msdk.foundation.controller.c.m().c(), str);
        } catch (ClassNotFoundException e2) {
            ad.b("SameTools", e2.getMessage());
            return null;
        } catch (IllegalAccessException e10) {
            ad.b("SameTools", e10.getMessage());
            return null;
        } catch (NoSuchMethodException e11) {
            ad.b("SameTools", e11.getMessage());
            return null;
        } catch (InvocationTargetException e12) {
            ad.b("SameTools", e12.getMessage());
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
        } catch (Exception e2) {
            ad.b("SameTools", e2.getMessage());
            return false;
        }
    }

    public static <T extends String> boolean k(T t5) {
        return t5 == null || t5.length() == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (((r3 * 1000) + r5) >= r7) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r10 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        r2 = r2.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r2 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r2.size() <= 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        r0.addAll(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
    
        if (((r3.aa() * 1000) + r5) >= r7) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.lang.String r14) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.util.concurrent.ConcurrentHashMap r14 = com.mbridge.msdk.foundation.same.a.b.a(r14)
            if (r14 == 0) goto L91
            int r0 = r14.size()
            if (r0 <= 0) goto L91
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r14 = r14.values()
            java.util.Iterator r14 = r14.iterator()
        L22:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r14.next()
            com.mbridge.msdk.foundation.entity.c r2 = (com.mbridge.msdk.foundation.entity.c) r2
            if (r2 == 0) goto L22
            long r3 = r2.e()
            long r5 = r2.f()
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 0
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            r10 = 1
            r11 = 0
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r9 <= 0) goto L4d
            long r3 = r3 * r12
            long r3 = r3 + r5
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 < 0) goto L69
            goto L6a
        L4d:
            com.mbridge.msdk.c.h r3 = com.mbridge.msdk.c.h.a()
            com.mbridge.msdk.c.g r3 = com.applovin.impl.mediation.ads.e.d(r3)
            if (r3 != 0) goto L5e
            com.mbridge.msdk.c.h.a()
            com.mbridge.msdk.c.g r3 = com.mbridge.msdk.c.i.a()
        L5e:
            long r3 = r3.aa()
            long r3 = r3 * r12
            long r3 = r3 + r5
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 < 0) goto L69
            goto L6a
        L69:
            r10 = r11
        L6a:
            if (r10 == 0) goto L22
            java.util.List r2 = r2.c()
            if (r2 == 0) goto L22
            int r3 = r2.size()
            if (r3 <= 0) goto L22
            r0.addAll(r2)
            goto L22
        L7c:
            int r14 = r0.size()
            if (r14 <= 0) goto L91
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>(r0)
            r0.clear()
            r0.addAll(r14)
            java.lang.String r1 = r0.toString()
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ai.c(java.lang.String):java.lang.String");
    }

    public static double m(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0.0d;
            }
            return Double.parseDouble(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0.0d;
        }
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
        } catch (Exception e2) {
            ad.b("SameTools", e2.getMessage());
            return false;
        }
    }

    private static String a(String str, Map<String, String> map) {
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                StringBuilder sb2 = new StringBuilder(str);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry != null && !TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                        String value = entry.getValue();
                        if (str.contains(entry.getKey())) {
                            if (value.equals("0")) {
                                sb2 = new StringBuilder(str.replaceAll("(" + entry.getKey() + "[^&]*)", ""));
                            } else {
                                sb2 = new StringBuilder(str.replaceAll("(" + entry.getKey() + "[^&]*)", entry.getKey() + entry.getValue()));
                            }
                        } else if (!value.equals("0")) {
                            sb2.append(entry.getKey() + entry.getValue());
                        }
                    }
                }
                return sb2.toString();
            }
            return str;
        } catch (Exception e2) {
            ad.b("SameTools", e2.getMessage());
            return str;
        }
    }

    public static String d() {
        String str;
        try {
            str = UUID.randomUUID().toString() + System.currentTimeMillis();
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        if (!an.a(str)) {
            return str;
        }
        return System.currentTimeMillis() + "";
    }

    public static <T extends String> boolean j(T t5) {
        return t5 != null && t5.length() > 0;
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
        } catch (Throwable th2) {
            th2.printStackTrace();
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
        } catch (Exception e2) {
            ad.b("SameTools", e2.getMessage());
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
        } catch (ClassNotFoundException e2) {
            ad.b("SameTools", e2.getMessage());
            return false;
        }
    }

    public static boolean h() {
        NetworkInfo networkInfo;
        try {
            ConnectivityManager a10 = u.a();
            if (a10 != null && (networkInfo = a10.getNetworkInfo(17)) != null) {
                return networkInfo.isConnected();
            }
            return false;
        } catch (Exception e2) {
            ad.b("SameTools", e2.getMessage());
            return false;
        }
    }

    public static synchronized int d(Context context, String str) {
        int i10;
        synchronized (ai.class) {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        i10 = b(str, context) != null ? 1 : 0;
                    } catch (Exception unused) {
                        i10 = 3;
                    }
                }
            }
            if (context == null) {
                i10 = 5;
            } else {
                i10 = TextUtils.isEmpty(str) ? 2 : 4;
            }
        }
        return i10;
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
        } catch (Throwable th2) {
            ad.b("SameTools", th2.getMessage());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[Catch: Exception -> 0x005e, LOOP:0: B:18:0x0049->B:19:0x004b, LOOP_END, TryCatch #0 {Exception -> 0x005e, blocks: (B:3:0x0002, B:5:0x0014, B:6:0x001b, B:8:0x0022, B:10:0x0029, B:12:0x003f, B:16:0x0045, B:19:0x004b, B:22:0x0053, B:24:0x0059), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(int r6) {
        /*
            java.lang.String r0 = ""
            com.mbridge.msdk.c.h r1 = com.mbridge.msdk.c.h.a()     // Catch: java.lang.Exception -> L5e
            com.mbridge.msdk.foundation.controller.c r2 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L5e
            java.lang.String r2 = r2.k()     // Catch: java.lang.Exception -> L5e
            com.mbridge.msdk.c.g r1 = r1.b(r2)     // Catch: java.lang.Exception -> L5e
            if (r1 != 0) goto L1b
            com.mbridge.msdk.c.h.a()     // Catch: java.lang.Exception -> L5e
            com.mbridge.msdk.c.g r1 = com.mbridge.msdk.c.i.a()     // Catch: java.lang.Exception -> L5e
        L1b:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Exception -> L5e
            r2.<init>()     // Catch: java.lang.Exception -> L5e
            if (r1 == 0) goto L53
            int r1 = r1.q()     // Catch: java.lang.Exception -> L5e
            r3 = 1
            if (r1 != r3) goto L53
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L5e
            android.content.Context r1 = r1.c()     // Catch: java.lang.Exception -> L5e
            com.mbridge.msdk.foundation.db.g r1 = com.mbridge.msdk.foundation.db.g.a(r1)     // Catch: java.lang.Exception -> L5e
            com.mbridge.msdk.foundation.db.j r1 = com.mbridge.msdk.foundation.db.j.a(r1)     // Catch: java.lang.Exception -> L5e
            long[] r1 = r1.b()     // Catch: java.lang.Exception -> L5e
            if (r1 == 0) goto L53
            int r3 = r1.length     // Catch: java.lang.Exception -> L5e
            if (r3 <= r6) goto L48
            if (r6 != 0) goto L45
            goto L48
        L45:
            int r6 = r3 - r6
            goto L49
        L48:
            r6 = 0
        L49:
            if (r6 >= r3) goto L53
            r4 = r1[r6]     // Catch: java.lang.Exception -> L5e
            r2.put(r4)     // Catch: java.lang.Exception -> L5e
            int r6 = r6 + 1
            goto L49
        L53:
            int r6 = r2.length()     // Catch: java.lang.Exception -> L5e
            if (r6 <= 0) goto L62
            java.lang.String r0 = a(r2)     // Catch: java.lang.Exception -> L5e
            goto L62
        L5e:
            r6 = move-exception
            r6.printStackTrace()
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ai.b(int):java.lang.String");
    }

    public static String a(String str) {
        try {
            return an.b(str) ? URLEncoder.encode(str, "utf-8") : "";
        } catch (Throwable th2) {
            ad.b("SameTools", th2.getMessage(), th2);
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
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }

    public static final void a(final int i10, final ImageView imageView, final CampaignEx campaignEx, Context context, boolean z10, final com.mbridge.msdk.foundation.d.a aVar) {
        if (imageView == null || campaignEx == null) {
            return;
        }
        ad.a("configPrivacyButton", "configPrivacyButton");
        boolean z11 = campaignEx.getPrivacyButtonTemplateVisibility() == 0;
        ad.a("configPrivacyButton", "privacyButtonVisibilityGone: " + z11 + " isIgnoreCampaignPrivacyConfig: " + z10);
        if (!z10 && z11) {
            try {
                imageView.setVisibility(8);
                return;
            } catch (Exception e2) {
                ad.b("SameTools", e2.getMessage());
                return;
            }
        }
        if (TextUtils.isEmpty(a(campaignEx))) {
            try {
                imageView.setVisibility(8);
                return;
            } catch (Exception e10) {
                ad.b("SameTools", e10.getMessage());
                return;
            }
        }
        try {
            imageView.setVisibility(0);
        } catch (Exception e11) {
            ad.b("SameTools", e11.getMessage());
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.foundation.tools.ai.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    ai.a(campaignEx, aVar, i10, (String) imageView.getTag());
                } catch (Exception e12) {
                    ad.b("SameTools", e12.getMessage());
                }
            }
        });
    }

    public static JSONArray b(Context context, String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            com.mbridge.msdk.c.g b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b3 == null) {
                com.mbridge.msdk.c.h.a();
                b3 = com.mbridge.msdk.c.i.a();
            }
            if (b3 != null && b3.q() == 1) {
                ad.c("SameTools", "fqci cfc:" + b3.q());
                long[] b10 = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(context)).b();
                if (b10 != null) {
                    for (long j3 : b10) {
                        ad.c("SameTools", "cfc campaignIds:" + b10);
                        jSONArray.put(j3);
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONArray;
    }

    private static final char[] c(int i10) {
        StringBuilder sb2;
        if (i10 == 0) {
            sb2 = new StringBuilder();
            sb2.append(String.valueOf(Arrays.copyOf(ah.a, f13567f)));
            sb2.append(f13572k[f13566e]);
            sb2.append(String.valueOf(Arrays.copyOfRange(ah.a, f13567f, f13568g)));
            sb2.append(f13572k[f13566e]);
            sb2.append(String.valueOf(Arrays.copyOfRange(ah.a, f13568g, f13570i)));
            sb2.append(f13572k[f13566e]);
            sb2.append(String.valueOf(ag.a));
        } else if (i10 == 1) {
            sb2 = new StringBuilder();
            sb2.append(String.valueOf(Arrays.copyOf(ah.a, f13567f)));
            sb2.append(f13572k[f13566e]);
            sb2.append(String.valueOf(Arrays.copyOfRange(ah.a, f13567f, f13568g)));
            sb2.append(f13572k[f13566e]);
            sb2.append(String.valueOf(Arrays.copyOfRange(ah.a, f13569h, f13571j)));
        } else if (i10 == 2) {
            sb2 = new StringBuilder();
            sb2.append(String.valueOf(Arrays.copyOfRange(ah.a, f13570i, f13569h)));
            sb2.append(String.valueOf(f13573l));
        } else if (i10 != 3) {
            sb2 = null;
        } else {
            sb2 = new StringBuilder();
            sb2.append(String.valueOf(Arrays.copyOfRange(ah.a, f13570i, f13569h)));
            sb2.append(String.valueOf(ag.a));
        }
        return sb2.toString().toCharArray();
    }

    public static synchronized boolean c(Context context, String str) {
        boolean z10;
        synchronized (ai.class) {
            z10 = false;
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        if (b(str, context) != null) {
                            z10 = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return z10;
    }

    public static int e() {
        try {
            return ((Integer) Class.forName("com.tencent.mm.opensdk.constants.Build").getField("SDK_INT").get(null)).intValue();
        } catch (Throwable th2) {
            ad.b("SameTools", th2.getMessage());
            return 0;
        }
    }

    public static String a(CampaignEx campaignEx) {
        com.mbridge.msdk.c.g b3;
        CampaignEx.a adchoice;
        String str = "";
        if (campaignEx != null) {
            try {
                str = campaignEx.getPrivacyUrl();
            } catch (Exception e2) {
                ad.b("SameTools", e2.getMessage());
                return "";
            }
        }
        if (TextUtils.isEmpty(str) && campaignEx != null && (adchoice = campaignEx.getAdchoice()) != null) {
            str = adchoice.c();
        }
        if (TextUtils.isEmpty(str) && (b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k())) != null) {
            str = b3.g();
        }
        return TextUtils.isEmpty(str) ? com.mbridge.msdk.foundation.same.net.e.d.f().f13396f : str;
    }

    public static int b() {
        int i10 = f13574m;
        f13574m = i10 + 1;
        return i10;
    }

    public static boolean c(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                return campaignEx.getRetarget_offer() == 1;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    private static Object b(String str, Context context) {
        try {
            return Class.forName(String.valueOf(c(a))).getMethod(String.valueOf(c(f13564c)), String.class, Integer.TYPE).invoke(Class.forName(String.valueOf(c(f13563b))).getMethod(String.valueOf(c(f13565d)), new Class[0]).invoke(context, new Object[0]), str, 8192);
        } catch (Throwable unused) {
            return null;
        }
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
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String optString = jSONArray.optString(i10);
                if (an.b(optString)) {
                    arrayList.add(optString);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            ad.b("SameTools", th2.getMessage(), th2);
            return null;
        }
    }

    public static void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.d.a aVar, int i10, String str) {
        if (campaignEx == null) {
            return;
        }
        try {
            String str2 = campaignEx.getCampaignUnitId() + "_" + i10;
            com.mbridge.msdk.foundation.d.b.a().c(str2);
            com.mbridge.msdk.foundation.d.b.a().a(str2, campaignEx);
            com.mbridge.msdk.foundation.d.b.a().a(str2, aVar);
            com.mbridge.msdk.foundation.d.b.a().a(str2, i10);
            com.mbridge.msdk.foundation.d.b.a().a(str2, str);
            com.mbridge.msdk.foundation.d.b.a().a(str2).e();
        } catch (Throwable th2) {
            ad.b("SameTools", "feedback error", th2);
        }
    }

    public static synchronized void b(String str, String str2) {
        synchronized (ai.class) {
            if (f13580s == null) {
                f13580s = new HashMap();
            }
            f13580s.put(com.mbridge.msdk.foundation.controller.c.m().k() + "_" + str, str2);
        }
    }

    public static int a(Context context, float f10) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f10 * resources.getDisplayMetrics().density) + 0.5f);
    }

    public static int b(Context context, float f10) {
        float f11 = 2.5f;
        if (context != null) {
            try {
                float f12 = context.getResources().getDisplayMetrics().density;
                if (f12 != 0.0f) {
                    f11 = f12;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return (int) ((f10 / f11) + 0.5f);
    }

    public static double a(Double d10) {
        try {
            String format = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US)).format(d10);
            if (an.b(format)) {
                return Double.parseDouble(format);
            }
            return 0.0d;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0.0d;
        }
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
            } catch (Exception e2) {
                ad.b("SameTools", e2.getMessage());
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r2 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long a(java.io.File r4) throws java.lang.Exception {
        /*
            r0 = 0
            r2 = 0
            boolean r3 = r4.exists()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L2a
            if (r3 == 0) goto L1a
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L2a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L2a
            int r4 = r3.available()     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L18
            long r0 = (long) r4
            r2 = r3
            goto L1d
        L15:
            r4 = move-exception
            r2 = r3
            goto L24
        L18:
            r2 = r3
            goto L2a
        L1a:
            r4.createNewFile()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L2a
        L1d:
            if (r2 == 0) goto L2d
        L1f:
            r2.close()     // Catch: java.lang.Exception -> L2d
            goto L2d
        L23:
            r4 = move-exception
        L24:
            if (r2 == 0) goto L29
            r2.close()     // Catch: java.lang.Exception -> L29
        L29:
            throw r4
        L2a:
            if (r2 == 0) goto L2d
            goto L1f
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ai.a(java.io.File):long");
    }

    public static String a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return "";
        }
        com.mbridge.msdk.c.g b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (b3 == null) {
            com.mbridge.msdk.c.h.a();
            b3 = com.mbridge.msdk.c.i.a();
        }
        int W = b3.W();
        if (jSONArray.length() > W) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i10 = 0; i10 < W; i10++) {
                try {
                    jSONArray2.put(jSONArray.get(i10));
                } catch (JSONException e2) {
                    e2.printStackTrace();
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
            JSONArray b3 = b(context, str);
            str2 = b3.length() > 0 ? a(b3) : "";
            ad.c("SameTools", "get excludes:" + str2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return str2;
    }

    public static final int a() {
        if (f13576o == null) {
            try {
                f13576o = MIMManager.a.a().d();
            } catch (Exception e2) {
                ad.b("SameTools", e2.getMessage());
            }
        }
        if (f13576o != null) {
            return f13576o.booleanValue() ? 1 : 0;
        }
        return -1;
    }

    public static synchronized String a(Context context, String str, String str2) {
        String sb2;
        synchronized (ai.class) {
            StringBuilder sb3 = new StringBuilder(str2);
            try {
                sb3.append(a(str2, context, str));
            } catch (Exception unused) {
            }
            sb2 = sb3.toString();
        }
        return sb2;
    }

    private static synchronized String a(String str, Context context, String str2) {
        StringBuilder sb2;
        String sb3;
        synchronized (ai.class) {
            try {
                Set<String> queryParameterNames = Uri.parse(str).getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    sb2 = new StringBuilder("&rtins_type=");
                } else {
                    sb2 = new StringBuilder("?rtins_type=");
                }
            } catch (Exception unused) {
                sb2 = new StringBuilder("&rtins_type=");
            }
            try {
                if (b(str2, context) != null) {
                    sb2.append(1);
                } else {
                    sb2.append(2);
                }
            } catch (Exception unused2) {
                sb2.append(0);
            }
            sb3 = sb2.toString();
        }
        return sb3;
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
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return imageView;
    }

    public static void a(View view) {
        if (view == null) {
            return;
        }
        try {
            view.setSystemUiVisibility(4102);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void a(String str, CampaignEx campaignEx, int i10) {
        if (TextUtils.isEmpty(str) || campaignEx == null || com.mbridge.msdk.foundation.controller.c.m().c() == null) {
            return;
        }
        com.mbridge.msdk.foundation.db.i a10 = com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
        fVar.a(System.currentTimeMillis());
        fVar.b(str);
        fVar.a(campaignEx.getId());
        fVar.a(i10);
        a10.a(fVar);
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
                } catch (Exception e2) {
                    ad.b("SameTools", e2.getMessage());
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
        } catch (Throwable th2) {
            ad.b("SameTools", th2.getMessage(), th2);
            return 0;
        }
    }

    public static int a(String str, String str2, int i10) {
        if (TextUtils.isEmpty(str)) {
            return i10;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(str2);
                return TextUtils.isEmpty(queryParameter) ? i10 : (int) Math.round(Double.valueOf(String.valueOf(queryParameter)).doubleValue());
            }
        } catch (Exception e2) {
            ad.b("SameTools", e2.getMessage());
        }
        return i10;
    }
}
