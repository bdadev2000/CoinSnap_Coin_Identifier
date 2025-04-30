package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.icu.util.VersionInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class zp {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f12676a = {60, 60, 24, 7, 4, 12};
    private static final String[] b = {" second", " minute", " hour", " day", " week", " month"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f12677c = {"s", "m", "h", "d", "w", "mth"};

    /* renamed from: d, reason: collision with root package name */
    private static final DecimalFormat f12678d = new DecimalFormat();

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f12679e;

    /* renamed from: f, reason: collision with root package name */
    private static Boolean f12680f;

    /* renamed from: g, reason: collision with root package name */
    private static String f12681g;

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f12682h;

    /* loaded from: classes.dex */
    public class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onCachedResourcesChecked(boolean z8);
    }

    public static double a(long j7) {
        return j7 / 1024.0d;
    }

    public static float b(float f9) {
        return f9 * 1000.0f;
    }

    public static double d(long j7) {
        return j7 / 1000.0d;
    }

    public static boolean j(Context context) {
        if (context == null) {
            return false;
        }
        try {
            context.getResources();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean k(Context context) {
        if (context == null) {
            context = com.applovin.impl.sdk.k.k();
        }
        if (context != null) {
            return C0758t0.a(context).a("applovin.sdk.verbose_logging", false);
        }
        return false;
    }

    public static String l(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (!queryIntentActivities.isEmpty()) {
            return queryIntentActivities.get(0).activityInfo.name;
        }
        return null;
    }

    public static int a(int i9, int i10) {
        return (i9 < 0 || i9 > 100) ? i10 : i9;
    }

    public static int b(int i9) {
        return i9 * 1024;
    }

    public static void c() {
    }

    public static Context d(Context context) {
        return j(context) ? context : com.applovin.impl.sdk.k.k();
    }

    public static boolean e(Context context) {
        return C0758t0.a(context).a("applovin.sdk.is_test_environment");
    }

    public static int f() {
        return 2015001;
    }

    public static Boolean g(Context context) {
        if (context == null) {
            return null;
        }
        Boolean bool = f12682h;
        if (bool != null) {
            return bool;
        }
        try {
            String a6 = C0758t0.a(context).a();
            String b8 = b(context);
            if (b8 == null) {
                return null;
            }
            if (b8.equals(a6)) {
                Boolean bool2 = Boolean.TRUE;
                f12682h = bool2;
                return bool2;
            }
            if (TextUtils.isEmpty(a6) && b8.equals(context.getPackageName())) {
                Boolean bool3 = Boolean.TRUE;
                f12682h = bool3;
                return bool3;
            }
            Boolean bool4 = Boolean.FALSE;
            f12682h = bool4;
            return bool4;
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.b("Utils", "Unable to determine if the current process is the main process", th);
            return null;
        }
    }

    public static boolean h() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean i(Context context) {
        String packageName = context.getPackageName();
        return "com.revolverolver.fliptrickster".equals(packageName) || "com.mindstormstudios.idlemakeover".equals(packageName);
    }

    public static boolean j() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                String displayName = networkInterfaces.nextElement().getDisplayName();
                if (displayName.contains("tun") || displayName.contains("ppp") || displayName.contains("ipsec")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("Utils", "Unable to check Network Interfaces", th);
            return false;
        }
    }

    public static void a() {
    }

    public static long b(long j7) {
        return j7 * 8;
    }

    public static double c(long j7) {
        return a(b(j7));
    }

    public static boolean d(com.applovin.impl.sdk.k kVar) {
        String str = (String) Q7.n0.d(kVar, "user_agent_collection_enabled");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return true;
    }

    public static boolean e(com.applovin.impl.sdk.k kVar) {
        if (((Boolean) kVar.a(oj.f9890y2)).booleanValue()) {
            return kVar.g0().isMuted();
        }
        return ((Boolean) kVar.a(oj.w2)).booleanValue();
    }

    public static int f(String str) {
        int i9 = 0;
        for (String str2 : str.replaceAll("-beta", ".").split("\\.")) {
            if (str2.length() > 2) {
                com.applovin.impl.sdk.t.h("Utils", "Version number components cannot be longer than two digits -> ".concat(str));
                return i9;
            }
            i9 = (i9 * 100) + Integer.parseInt(str2);
        }
        return !str.contains("-beta") ? (i9 * 100) + 99 : i9;
    }

    public static boolean h(Context context) {
        if (f12680f == null) {
            f12680f = Boolean.valueOf("com.applovin.apps.playables".equals(context.getPackageName()));
        }
        return f12680f.booleanValue();
    }

    public static boolean k() {
        Context k6 = com.applovin.impl.sdk.k.k();
        if (k6 != null) {
            return C0758t0.a(k6).a("applovin.sdk.verbose_logging");
        }
        return false;
    }

    public static boolean a(long j7, long j9) {
        return (j7 & j9) != 0;
    }

    public static void b() {
    }

    public static int c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getRotation();
    }

    public static boolean i() {
        return !a("com.applovin.sdk.AppLovinSdk");
    }

    public static boolean a(MaxAdFormat maxAdFormat, MaxAdFormat maxAdFormat2) {
        return (maxAdFormat == null || maxAdFormat2 == null || (maxAdFormat != maxAdFormat2 && (!maxAdFormat.isBannerOrLeaderAd() || !maxAdFormat2.isBannerOrLeaderAd()))) ? false : true;
    }

    public static String b(Context context) {
        int myPid;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        if (StringUtils.isValidString(f12681g)) {
            return f12681g;
        }
        try {
            myPid = Process.myPid();
            runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.b("Utils", "Unable to determine process name", th);
        }
        if (runningAppProcesses == null) {
            com.applovin.impl.sdk.t.c("Utils", "No running app processes. Unable to determine process name");
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (myPid == runningAppProcessInfo.pid) {
                String str = runningAppProcessInfo.processName;
                f12681g = str;
                return str;
            }
        }
        return null;
    }

    public static List a(boolean z8, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, Context context) {
        Uri s02;
        if (bVar instanceof bq) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = new ArrayList(bVar.i()).iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!kVar.D().b(uri.getLastPathSegment(), context)) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().b("Utils", "Cached HTML asset missing: " + uri);
                }
                arrayList.add(uri);
            }
        }
        if (z8 && (s02 = bVar.s0()) != null && !kVar.D().b(s02.getLastPathSegment(), context)) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("Utils", "Cached video missing: " + s02);
            }
            arrayList.add(s02);
        }
        return arrayList;
    }

    public static boolean c(String str) {
        return str != null && (str.contains("applovin.com") || str.contains("applvn.com"));
    }

    public static String e(String str) {
        if (str != null && str.length() > 4) {
            return str.substring(str.length() - 4);
        }
        return "NOKEY";
    }

    public static boolean c(com.applovin.impl.sdk.k kVar) {
        String str = (String) Q7.n0.d(kVar, "run_in_release_mode");
        return ((StringUtils.isValidString(str) && Boolean.parseBoolean(str)) || (com.applovin.impl.sdk.k.k().getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static String e() {
        try {
            for (Field field : Build.VERSION_CODES.class.getFields()) {
                if (field.getInt(null) == Build.VERSION.SDK_INT) {
                    return field.getName();
                }
            }
            return "";
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("Utils", "Unable to get Android SDK codename", th);
            return "";
        }
    }

    public static boolean f(Context context) {
        if (f12679e == null) {
            f12679e = Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
        }
        return f12679e.booleanValue();
    }

    public static long d(String str) {
        if (!StringUtils.isValidString(str)) {
            return Long.MAX_VALUE;
        }
        try {
            return Color.parseColor(str);
        } catch (Throwable unused) {
            return Long.MAX_VALUE;
        }
    }

    public static boolean g() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("Utils", "Exception thrown while getting memory state.", th);
        }
        int i9 = runningAppProcessInfo.importance;
        return i9 == 100 || i9 == 200;
    }

    public static byte[] d(byte[] bArr) {
        if (bArr == null || bArr.length == 0 || !b(bArr)) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr2);
            if (read > 0) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static String b(Class cls, String str) {
        try {
            Field a6 = a(cls, str);
            a6.setAccessible(true);
            return (String) a6.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long c(float f9) {
        return a(b(f9));
    }

    public static void a(final boolean z8, final com.applovin.impl.sdk.ad.b bVar, final com.applovin.impl.sdk.k kVar, final Context context, b bVar2) {
        final WeakReference weakReference = new WeakReference(bVar2);
        kVar.l0().a(new kn(kVar, "checkIfAdContainsUnavailableCachedResources", new Runnable() { // from class: com.applovin.impl.G3
            @Override // java.lang.Runnable
            public final void run() {
                zp.a(weakReference, bVar, kVar, context, z8);
            }
        }));
    }

    public static long c(byte[] bArr) {
        return a(bArr, 0);
    }

    public static String b(String str) {
        return str.replace("ALPlayableAnalytics.trackEvent = ", "ALPlayableAnalytics.trackEvent = function (eventName) {const SDK_URL = 'applovin://com.applovin.sdk/playable_event';if (!Object.values(ALPlayableEvent).includes(eventName)) {var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=0&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();return;}var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=1&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();}; ALPlayableAnalytics.trackEvent_ignore = ");
    }

    public static boolean b(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 31 && bArr[1] == -117;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void b(String str, String str2) {
        if (str == null || str.length() <= b(8)) {
            return;
        }
        com.applovin.impl.sdk.t.j(str2, "Provided custom data parameter longer than supported (" + str.length() + " bytes, " + b(8) + " maximum)");
    }

    public static boolean a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (a((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String d() {
        try {
            return Build.VERSION.RELEASE + " (" + e() + " - API " + Build.VERSION.SDK_INT + ")";
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("Utils", "Unable to get Android OS info", th);
            return "";
        }
    }

    public static WebView b(Context context, String str) {
        return a(context, str, false);
    }

    public static void a(Closeable closeable, com.applovin.impl.sdk.k kVar) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th) {
            if (kVar != null) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("Utils", "Unable to close stream: " + closeable, th);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(AppLovinAd appLovinAd, com.applovin.impl.sdk.k kVar) {
        if (appLovinAd instanceof AppLovinAdBase) {
            String d02 = kVar.d0();
            String d03 = ((AppLovinAdBase) appLovinAd).getSdk().d0();
            if (d02.equals(d03)) {
                return;
            }
            com.applovin.impl.sdk.t.h("AppLovinAd", "Ad was loaded from sdk with key: " + d03 + ", but is being rendered from sdk with key: " + d02);
            kVar.F().c(aa.f6607q);
        }
    }

    public static int a(String str, String str2) {
        try {
            int compareTo = VersionInfo.getInstance(StringUtils.toDigitsOnlyVersionString(str)).compareTo(VersionInfo.getInstance(StringUtils.toDigitsOnlyVersionString(str2)));
            return compareTo == 0 ? compareTo : compareTo > 0 ? 1 : -1;
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("Utils", "Failed to process version string.", th);
            return 0;
        }
    }

    public static boolean b(com.applovin.impl.sdk.k kVar) {
        if (!x3.e()) {
            return true;
        }
        try {
            JSONObject.wrap(JSONObject.NULL);
            return true;
        } catch (Throwable th) {
            kVar.L();
            if (!com.applovin.impl.sdk.t.a()) {
                return false;
            }
            kVar.L().d("Utils", "Failed to wrap JSONObject with exception", th);
            return false;
        }
    }

    public static void a(HttpURLConnection httpURLConnection, com.applovin.impl.sdk.k kVar) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            if (kVar != null) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("Utils", "Unable to disconnect connection: " + httpURLConnection, th);
                }
            }
        }
    }

    public static String a(Map map, boolean z8) {
        if (map != null && !map.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            if (z8) {
                TreeMap treeMap = new TreeMap(new a());
                treeMap.putAll(map);
                map = treeMap;
            }
            for (Map.Entry entry : map.entrySet()) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                Object value = entry.getValue();
                if (value instanceof String) {
                    String str = (String) value;
                    if (str.contains("&")) {
                        value = str.replace("&", "%26");
                    }
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(value);
            }
            return sb.toString();
        }
        return "";
    }

    public static boolean b(List list) {
        Context k6 = com.applovin.impl.sdk.k.k();
        if (k6 == null) {
            com.applovin.impl.sdk.t.h("Utils", "Failed to check whether or not app is member of package names");
            return false;
        }
        return list.contains(k6.getPackageName());
    }

    private static long a(float f9) {
        return Math.round(f9);
    }

    private static List a(List list, com.applovin.impl.sdk.k kVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                arrayList.add(Class.forName(str));
            } catch (ClassNotFoundException unused) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().b("Utils", "Failed to create class for name: " + str);
                }
            }
        }
        return arrayList;
    }

    public static String a(Object obj) {
        if (obj instanceof be) {
            return ((be) obj).Q();
        }
        if (ve.b(obj)) {
            return ((com.applovin.impl.sdk.ad.b) obj).H();
        }
        return null;
    }

    public static int a(Context context) {
        x3.d();
        return Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0);
    }

    public static String a(kh khVar, com.applovin.impl.sdk.k kVar) {
        if (khVar == null) {
            return "Unknown error";
        }
        Throwable cause = khVar.getCause();
        String message = cause != null ? cause.getMessage() : "Unknown";
        String name = cause != null ? cause.getClass().getName() : "";
        StringBuilder sb = new StringBuilder("Code: ");
        sb.append(khVar.f8692a);
        sb.append(", Name: ");
        sb.append(khVar.a());
        sb.append(", Message: ");
        sb.append(khVar.getMessage());
        return Q7.n0.m(sb, ", Cause Class: ", name, ", Cause Message: ", message);
    }

    public static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return a(superclass, str);
        }
    }

    public static String a(Uri uri, String str, com.applovin.impl.sdk.k kVar) {
        List c9 = kVar.c(oj.f9722a1);
        String lastPathSegment = uri.getLastPathSegment();
        if (c9.contains(lastPathSegment)) {
            return lastPathSegment;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String queryParameter = uri.getQueryParameter(it.next());
            if (StringUtils.isValidString(queryParameter)) {
                arrayList.add(queryParameter);
            }
        }
        arrayList.addAll(uri.getPathSegments());
        String encodeUriString = StringUtils.encodeUriString(TextUtils.join("_", arrayList));
        Integer num = (Integer) kVar.a(oj.f9728b1);
        int length = StringUtils.emptyIfNull(str).length() + StringUtils.emptyIfNull(encodeUriString).length();
        if (length > num.intValue() && StringUtils.isValidString(encodeUriString)) {
            encodeUriString = encodeUriString.substring(length - num.intValue());
        }
        return (StringUtils.isValidString(encodeUriString) && StringUtils.isValidString(str)) ? com.mbridge.msdk.foundation.entity.o.j(str, encodeUriString) : encodeUriString;
    }

    public static ActivityManager.MemoryInfo a(ActivityManager activityManager) {
        if (activityManager == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.b("Utils", "Unable to collect memory info.", th);
            return null;
        }
    }

    public static Map a(AppLovinSdkSettings appLovinSdkSettings) {
        try {
            Field a6 = a(appLovinSdkSettings.getClass(), "metaData");
            if (a6 != null) {
                a6.setAccessible(true);
            }
            return (Map) a6.get(appLovinSdkSettings);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List a(JSONObject jSONObject, String str, String str2, com.applovin.impl.sdk.k kVar) {
        return a(jSONObject, str, null, str2, null, false, kVar);
    }

    public static List a(JSONObject jSONObject, String str, Map map, String str2, Map map2, boolean z8, com.applovin.impl.sdk.k kVar) {
        if (map == null) {
            map = new HashMap(1);
        }
        Map map3 = map;
        map3.put("{CLCODE}", str);
        return a(jSONObject, map3, str2, map2, z8, kVar);
    }

    public static List a(JSONObject jSONObject, Map map, String str, Map map2, boolean z8, com.applovin.impl.sdk.k kVar) {
        ArrayList arrayList = new ArrayList(jSONObject.length() + 1);
        if (StringUtils.isValidString(str)) {
            arrayList.add(new C0745s(str, null, map2, z8));
        }
        if (jSONObject.length() <= 0) {
            return arrayList;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    String optString = jSONObject.optString(next);
                    String replace = StringUtils.replace(next, map);
                    if (AppLovinSdkUtils.isValidString(optString)) {
                        optString = StringUtils.replace(optString, map);
                    }
                    arrayList.add(new C0745s(replace, optString, map2, z8));
                }
            } catch (Throwable th) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("Utils", "Failed to create and add postback url.", th);
                }
            }
        }
        return arrayList;
    }

    public static String a(long j7, boolean z8) {
        String str;
        String[] strArr = z8 ? b : f12677c;
        long currentTimeMillis = (System.currentTimeMillis() - j7) / 1000;
        for (int i9 = 0; i9 < strArr.length; i9++) {
            long j9 = f12676a[i9];
            if (currentTimeMillis < j9) {
                if (currentTimeMillis <= 0) {
                    return z8 ? "just now" : "now";
                }
                String str2 = "";
                if (!z8 || currentTimeMillis <= 1) {
                    str = "";
                } else {
                    str = "s";
                }
                if (z8) {
                    str2 = " ago";
                }
                return String.format("%d%s%s%s", Long.valueOf(currentTimeMillis), strArr[i9], str, str2);
            }
            currentTimeMillis /= j9;
        }
        return z8 ? "just now" : "now";
    }

    public static String a(int i9, Context context, com.applovin.impl.sdk.k kVar) {
        if (i9 == 0) {
            return "";
        }
        try {
            InputStream openRawResource = context.getResources().openRawResource(i9);
            try {
                byte[] bArr = new byte[openRawResource.available()];
                openRawResource.read(bArr);
                return new String(bArr);
            } catch (IOException e4) {
                if (kVar != null) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().a("Utils", "Opening raw resource file threw exception", e4);
                    }
                }
                return "";
            } finally {
                a((Closeable) openRawResource, kVar);
            }
        } catch (Throwable th) {
            if (kVar != null) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("Utils", "Failed to retrieve resource " + i9, th);
                }
            }
            return "";
        }
    }

    public static long a(com.applovin.impl.sdk.k kVar) {
        long longValue = ((Long) kVar.a(oj.f9583E5)).longValue();
        long longValue2 = ((Long) kVar.a(oj.F5)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        return (longValue <= 0 || longValue2 <= 0) ? currentTimeMillis : (longValue - longValue2) + currentTimeMillis;
    }

    public static boolean a(Integer num) {
        return num.intValue() > 0 && num.intValue() <= 100 && ((int) (Math.random() * 100.0d)) + 1 <= num.intValue();
    }

    public static int a(int i9) {
        return a(i9, 95);
    }

    public static C0703h0 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        return C0703h0.a(AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", null)), AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", null)), JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, null), true, JsonUtils.getBoolean(jSONObject, "is_direct_sold", Boolean.FALSE).booleanValue());
    }

    public static byte[] a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean a(AppLovinAdSize appLovinAdSize) {
        return appLovinAdSize == AppLovinAdSize.BANNER || appLovinAdSize == AppLovinAdSize.MREC || appLovinAdSize == AppLovinAdSize.LEADER;
    }

    public static boolean a(String str, List list) {
        return StringUtils.startsWithAtLeastOnePrefix(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(WeakReference weakReference, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, Context context, boolean z8) {
        final b bVar2 = (b) weakReference.get();
        if (bVar2 == null) {
            return;
        }
        if (bVar instanceof bq) {
            final int i9 = 0;
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.F3
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i9) {
                        case 0:
                            bVar2.onCachedResourcesChecked(true);
                            return;
                        case 1:
                            bVar2.onCachedResourcesChecked(false);
                            return;
                        case 2:
                            bVar2.onCachedResourcesChecked(false);
                            return;
                        default:
                            bVar2.onCachedResourcesChecked(true);
                            return;
                    }
                }
            });
            return;
        }
        Iterator it = new ArrayList(bVar.i()).iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!kVar.D().c(uri.getLastPathSegment(), context)) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().b("Utils", "Cached HTML asset unavailable: " + uri);
                }
                final int i10 = 1;
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.F3
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                bVar2.onCachedResourcesChecked(true);
                                return;
                            case 1:
                                bVar2.onCachedResourcesChecked(false);
                                return;
                            case 2:
                                bVar2.onCachedResourcesChecked(false);
                                return;
                            default:
                                bVar2.onCachedResourcesChecked(true);
                                return;
                        }
                    }
                });
                return;
            }
        }
        if (z8) {
            Uri s02 = bVar.s0();
            if (!kVar.D().c(s02.getLastPathSegment(), context)) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().b("Utils", "Cached video unavailable: " + s02);
                }
                final int i11 = 2;
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.F3
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                bVar2.onCachedResourcesChecked(true);
                                return;
                            case 1:
                                bVar2.onCachedResourcesChecked(false);
                                return;
                            case 2:
                                bVar2.onCachedResourcesChecked(false);
                                return;
                            default:
                                bVar2.onCachedResourcesChecked(true);
                                return;
                        }
                    }
                });
                return;
            }
        }
        final int i12 = 3;
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.F3
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        bVar2.onCachedResourcesChecked(true);
                        return;
                    case 1:
                        bVar2.onCachedResourcesChecked(false);
                        return;
                    case 2:
                        bVar2.onCachedResourcesChecked(false);
                        return;
                    default:
                        bVar2.onCachedResourcesChecked(true);
                        return;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, String str) {
        Toast makeText = Toast.makeText(context, str, 0);
        makeText.setMargin(0.0f, 0.1f);
        makeText.show();
    }

    public static void a(String str, MaxAdFormat maxAdFormat, JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject.has("no_fill_reason")) {
            Object object = JsonUtils.getObject(jSONObject, "no_fill_reason", new Object());
            StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("\n**************************************************\nNO FILL received:\n..ID: \"", str, "\"\n..FORMAT: \"");
            n2.append(maxAdFormat != null ? maxAdFormat.getLabel() : "None");
            n2.append("\"\n..SDK KEY: \"");
            n2.append(kVar.d0());
            n2.append("\"\n..PACKAGE NAME: \"");
            n2.append(com.applovin.impl.sdk.k.k().getPackageName());
            n2.append("\"\n..Reason: ");
            n2.append(object);
            n2.append("\n**************************************************\n");
            String sb = n2.toString();
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("AppLovinSdk", sb);
            }
        }
    }

    public static AppLovinAd a(AppLovinAd appLovinAd, com.applovin.impl.sdk.k kVar) {
        if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
            return appLovinAd;
        }
        com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd;
        AppLovinAd dequeueAd = kVar.i().dequeueAd(cVar.getAdZone());
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            kVar.L().a("Utils", "Dequeued ad for dummy ad: " + dequeueAd);
        }
        if (dequeueAd != null) {
            cVar.a(dequeueAd);
            ((AppLovinAdImpl) dequeueAd).setDummyAd(cVar);
            return dequeueAd;
        }
        return cVar.e();
    }

    public static boolean a(Object obj, List list, com.applovin.impl.sdk.k kVar) {
        if (list == null) {
            return false;
        }
        Iterator it = a(list, kVar).iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isInstance(obj)) {
                if (obj instanceof Map) {
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        if (!(entry.getKey() instanceof String)) {
                            kVar.L();
                            if (com.applovin.impl.sdk.t.a()) {
                                kVar.L().a("Utils", "Invalid key type used. Map keys should be of type String.");
                            }
                            return false;
                        }
                        if (!a(entry.getValue(), list, kVar)) {
                            return false;
                        }
                    }
                    return true;
                }
                if (!(obj instanceof List)) {
                    return true;
                }
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    if (!a(it2.next(), list, kVar)) {
                        return false;
                    }
                }
                return true;
            }
        }
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            kVar.L().a("Utils", "Object '" + obj + "' does not match any of the required types '" + list + "'.");
        }
        return false;
    }

    public static void a(String str, String str2, Map map) {
        if (map.containsKey(str)) {
            map.put(str2, map.get(str));
            map.remove(str);
        }
    }

    public static Object a(Object obj, com.applovin.impl.sdk.k kVar) {
        int intValue;
        String valueOf;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    valueOf = (String) key;
                } else {
                    valueOf = String.valueOf(key);
                }
                hashMap.put(valueOf, a(entry.getValue(), kVar));
            }
            return hashMap;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next(), kVar));
            }
            return arrayList;
        }
        if (obj instanceof Date) {
            return String.valueOf(((Date) obj).getTime());
        }
        String valueOf2 = String.valueOf(obj);
        if (!(obj instanceof String)) {
            return (!(obj instanceof Uri) || (intValue = ((Integer) kVar.a(oj.f9682U0)).intValue()) <= 0 || valueOf2.length() <= intValue) ? valueOf2 : valueOf2.substring(0, intValue);
        }
        int intValue2 = ((Integer) kVar.a(oj.f9676T0)).intValue();
        return (intValue2 <= 0 || valueOf2.length() <= intValue2) ? valueOf2 : valueOf2.substring(0, intValue2);
    }

    public static boolean a(oj ojVar, com.applovin.impl.sdk.k kVar) {
        String str = (String) Q7.n0.d(kVar, "enable_black_screen_fixes");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return ((Boolean) kVar.a(ojVar)).booleanValue();
    }

    public static void a(MaxError maxError, String str, Context context) {
        StringBuilder sb = new StringBuilder();
        if (maxError.getCode() == -5001) {
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : maxError.getWaterfall().getNetworkResponses()) {
                MaxError error = maxNetworkResponseInfo.getError();
                String name = maxNetworkResponseInfo.getMediatedNetwork().getName();
                sb.append(Q7.n0.j("\nFailed to load ", str, " from ", name, ":\n"));
                sb.append("\nMAX Error " + error.getCode() + ": " + error.getMessage() + "\n");
                StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("\n", name, " Error ");
                n2.append(error.getMediatedNetworkErrorCode());
                n2.append(": ");
                n2.append(error.getMediatedNetworkErrorMessage());
                n2.append("\n\n");
                sb.append(n2.toString());
            }
        } else {
            StringBuilder n9 = com.mbridge.msdk.foundation.entity.o.n("Failed to load ", str, " with error ");
            n9.append(maxError.getCode());
            n9.append(": ");
            n9.append(maxError.getMessage());
            sb.append(n9.toString());
        }
        a("", sb.toString(), context);
    }

    public static void a(String str, Context context) {
        AppLovinSdkUtils.runOnUiThread(new P2(7, context, str));
    }

    public static void a(String str, MaxAd maxAd, Context context) {
        Toast.makeText(context, maxAd.getFormat().getLabel() + ": " + str, 1).show();
    }

    public static void a(Uri uri, Activity activity, com.applovin.impl.sdk.k kVar) {
        if (activity == null) {
            activity = kVar.p0();
        }
        Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, kVar.d0());
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, uri.toString());
        activity.startActivity(intent);
    }

    public static Map a(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                hashMap.put((String) entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return hashMap;
    }

    public static long a(byte[] bArr, int i9) {
        int i10 = i9 + 8;
        if (bArr.length < i10) {
            throw new IllegalArgumentException("byte array must be at least 8 bytes long");
        }
        long j7 = 0;
        while (i9 < i10) {
            j7 |= (bArr[i9] & 255) << (i9 * 8);
            i9++;
        }
        return j7;
    }

    public static Map a(Map map, com.applovin.impl.sdk.k kVar) {
        Map map2 = CollectionUtils.map(map);
        for (String str : map2.keySet()) {
            String str2 = (String) map2.get(str);
            if (str2 != null) {
                map2.put(str, StringUtils.encodeUriString(str2));
            }
        }
        return map2;
    }

    public static double a(String str, double d2) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("Utils", "Failed to parse double from String: " + str, th);
            return d2;
        }
    }

    public static WebView a(Context context, String str, boolean z8) {
        try {
            WebView webView = new WebView(context);
            if (z8) {
                webView.setWebViewClient(new com.applovin.impl.sdk.x());
            }
            return webView;
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("Utils", "Failed to initialize WebView for " + str + ".", th);
            return null;
        }
    }

    public static void a(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        thread.start();
    }

    public static void a(String str, String str2, Context context) {
        new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(R.string.ok, (DialogInterface.OnClickListener) null).create().show();
    }

    public static String a(double d2, int i9) {
        DecimalFormat decimalFormat = f12678d;
        decimalFormat.setMaximumFractionDigits(i9);
        return decimalFormat.format(d2);
    }
}
