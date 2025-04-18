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
import com.applovin.impl.zp;
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
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class zp {
    private static final int[] a = {60, 60, 24, 7, 4, 12};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f9484b = {" second", " minute", " hour", " day", " week", " month"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f9485c = {"s", "m", "h", "d", "w", "mth"};

    /* renamed from: d, reason: collision with root package name */
    private static final DecimalFormat f9486d = new DecimalFormat();

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f9487e;

    /* renamed from: f, reason: collision with root package name */
    private static Boolean f9488f;

    /* renamed from: g, reason: collision with root package name */
    private static String f9489g;

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f9490h;

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
        void onCachedResourcesChecked(boolean z10);
    }

    public static double a(long j3) {
        return j3 / 1024.0d;
    }

    public static float b(float f10) {
        return f10 * 1000.0f;
    }

    public static void c() {
    }

    public static double d(long j3) {
        return j3 / 1000.0d;
    }

    public static boolean k(Context context) {
        if (context == null) {
            context = com.applovin.impl.sdk.k.k();
        }
        if (context != null) {
            return t0.a(context).a("applovin.sdk.verbose_logging", false);
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

    public static int a(int i10, int i11) {
        return (i10 < 0 || i10 > 100) ? i11 : i10;
    }

    public static int b(int i10) {
        return i10 * LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
    }

    public static boolean c(com.applovin.impl.sdk.k kVar) {
        String str = (String) a4.j.b(kVar, "run_in_release_mode");
        return ((StringUtils.isValidString(str) && Boolean.parseBoolean(str)) || (com.applovin.impl.sdk.k.k().getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static boolean d(com.applovin.impl.sdk.k kVar) {
        String str = (String) a4.j.b(kVar, "user_agent_collection_enabled");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return true;
    }

    public static boolean e(Context context) {
        return t0.a(context).a("applovin.sdk.is_test_environment");
    }

    public static int f() {
        return 2015001;
    }

    public static Boolean g(Context context) {
        if (context == null) {
            return null;
        }
        Boolean bool = f9490h;
        if (bool != null) {
            return bool;
        }
        try {
            String a10 = t0.a(context).a();
            String b3 = b(context);
            if (b3 == null) {
                return null;
            }
            if (b3.equals(a10)) {
                Boolean bool2 = Boolean.TRUE;
                f9490h = bool2;
                return bool2;
            }
            if (TextUtils.isEmpty(a10) && b3.equals(context.getPackageName())) {
                Boolean bool3 = Boolean.TRUE;
                f9490h = bool3;
                return bool3;
            }
            Boolean bool4 = Boolean.FALSE;
            f9490h = bool4;
            return bool4;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.b("Utils", "Unable to determine if the current process is the main process", th2);
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

    public static void a() {
    }

    public static long b(long j3) {
        return j3 * 8;
    }

    public static boolean e(com.applovin.impl.sdk.k kVar) {
        if (((Boolean) kVar.a(oj.f6797y2)).booleanValue()) {
            return kVar.g0().isMuted();
        }
        return ((Boolean) kVar.a(oj.f6781w2)).booleanValue();
    }

    public static int f(String str) {
        int i10 = 0;
        for (String str2 : str.replaceAll("-beta", ".").split("\\.")) {
            if (str2.length() > 2) {
                com.applovin.impl.sdk.t.h("Utils", "Version number components cannot be longer than two digits -> ".concat(str));
                return i10;
            }
            i10 = (i10 * 100) + Integer.parseInt(str2);
        }
        return !str.contains("-beta") ? (i10 * 100) + 99 : i10;
    }

    public static boolean h(Context context) {
        if (f9488f == null) {
            f9488f = Boolean.valueOf("com.applovin.apps.playables".equals(context.getPackageName()));
        }
        return f9488f.booleanValue();
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
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("Utils", "Unable to check Network Interfaces", th2);
            return false;
        }
    }

    public static boolean k() {
        Context k10 = com.applovin.impl.sdk.k.k();
        if (k10 != null) {
            return t0.a(k10).a("applovin.sdk.verbose_logging");
        }
        return false;
    }

    public static boolean a(long j3, long j10) {
        return (j3 & j10) != 0;
    }

    public static void b() {
    }

    public static boolean i() {
        return !a("com.applovin.sdk.AppLovinSdk");
    }

    public static boolean a(oj ojVar, com.applovin.impl.sdk.k kVar) {
        String str = (String) a4.j.b(kVar, "enable_black_screen_fixes");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return ((Boolean) kVar.a(ojVar)).booleanValue();
    }

    public static String b(Context context) {
        int myPid;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        if (StringUtils.isValidString(f9489g)) {
            return f9489g;
        }
        try {
            myPid = Process.myPid();
            runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.b("Utils", "Unable to determine process name", th2);
        }
        if (runningAppProcesses == null) {
            com.applovin.impl.sdk.t.c("Utils", "No running app processes. Unable to determine process name");
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (myPid == runningAppProcessInfo.pid) {
                String str = runningAppProcessInfo.processName;
                f9489g = str;
                return str;
            }
        }
        return null;
    }

    public static String e(String str) {
        return (str == null || str.length() <= 4) ? "NOKEY" : str.substring(str.length() - 4);
    }

    public static Context d(Context context) {
        return j(context) ? context : com.applovin.impl.sdk.k.k();
    }

    public static String e() {
        try {
            for (Field field : Build.VERSION_CODES.class.getFields()) {
                if (field.getInt(null) == Build.VERSION.SDK_INT) {
                    return field.getName();
                }
            }
            return "";
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("Utils", "Unable to get Android SDK codename", th2);
            return "";
        }
    }

    public static double c(long j3) {
        return a(b(j3));
    }

    public static int c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getRotation();
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

    public static boolean f(Context context) {
        if (f9487e == null) {
            f9487e = Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
        }
        return f9487e.booleanValue();
    }

    public static boolean g() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("Utils", "Exception thrown while getting memory state.", th2);
        }
        int i10 = runningAppProcessInfo.importance;
        return i10 == 100 || i10 == 200;
    }

    public static boolean c(String str) {
        return str != null && (str.contains("applovin.com") || str.contains("applvn.com"));
    }

    public static byte[] d(byte[] bArr) {
        if (bArr == null || bArr.length == 0 || !b(bArr)) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        byte[] bArr2 = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
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

    public static boolean a(MaxAdFormat maxAdFormat, MaxAdFormat maxAdFormat2) {
        return (maxAdFormat == null || maxAdFormat2 == null || (maxAdFormat != maxAdFormat2 && (!maxAdFormat.isBannerOrLeaderAd() || !maxAdFormat2.isBannerOrLeaderAd()))) ? false : true;
    }

    public static List a(boolean z10, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, Context context) {
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
        if (z10 && (s02 = bVar.s0()) != null && !kVar.D().b(s02.getLastPathSegment(), context)) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("Utils", "Cached video missing: " + s02);
            }
            arrayList.add(s02);
        }
        return arrayList;
    }

    public static String b(Class cls, String str) {
        try {
            Field a10 = a(cls, str);
            a10.setAccessible(true);
            return (String) a10.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long c(float f10) {
        return a(b(f10));
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

    public static void b(String str, String str2) {
        if (str == null || str.length() <= b(8)) {
            return;
        }
        com.applovin.impl.sdk.t.j(str2, "Provided custom data parameter longer than supported (" + str.length() + " bytes, " + b(8) + " maximum)");
    }

    public static String d() {
        try {
            return Build.VERSION.RELEASE + " (" + e() + " - API " + Build.VERSION.SDK_INT + ")";
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("Utils", "Unable to get Android OS info", th2);
            return "";
        }
    }

    public static WebView b(Context context, String str) {
        return a(context, str, false);
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
            kVar.F().c(aa.f3627q);
        }
    }

    public static void a(final boolean z10, final com.applovin.impl.sdk.ad.b bVar, final com.applovin.impl.sdk.k kVar, final Context context, b bVar2) {
        final WeakReference weakReference = new WeakReference(bVar2);
        kVar.l0().a(new kn(kVar, "checkIfAdContainsUnavailableCachedResources", new Runnable() { // from class: com.applovin.impl.ow
            @Override // java.lang.Runnable
            public final void run() {
                zp.a(weakReference, bVar, kVar, context, z10);
            }
        }));
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

    public static boolean a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (a((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(com.applovin.impl.sdk.k kVar) {
        if (!x3.e()) {
            return true;
        }
        try {
            JSONObject.wrap(JSONObject.NULL);
            return true;
        } catch (Throwable th2) {
            kVar.L();
            if (!com.applovin.impl.sdk.t.a()) {
                return false;
            }
            kVar.L().d("Utils", "Failed to wrap JSONObject with exception", th2);
            return false;
        }
    }

    public static void a(Closeable closeable, com.applovin.impl.sdk.k kVar) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            if (kVar != null) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("Utils", "Unable to close stream: " + closeable, th2);
                }
            }
        }
    }

    public static boolean b(List list) {
        Context k10 = com.applovin.impl.sdk.k.k();
        if (k10 == null) {
            com.applovin.impl.sdk.t.h("Utils", "Failed to check whether or not app is member of package names");
            return false;
        }
        return list.contains(k10.getPackageName());
    }

    public static int a(String str, String str2) {
        try {
            int compareTo = VersionInfo.getInstance(StringUtils.toDigitsOnlyVersionString(str)).compareTo(VersionInfo.getInstance(StringUtils.toDigitsOnlyVersionString(str2)));
            return compareTo == 0 ? compareTo : compareTo > 0 ? 1 : -1;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("Utils", "Failed to process version string.", th2);
            return 0;
        }
    }

    public static void a(HttpURLConnection httpURLConnection, com.applovin.impl.sdk.k kVar) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Throwable th2) {
            if (kVar != null) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("Utils", "Unable to disconnect connection: " + httpURLConnection, th2);
                }
            }
        }
    }

    public static String a(Map map, boolean z10) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            TreeMap treeMap = new TreeMap(new a());
            treeMap.putAll(map);
            map = treeMap;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) value;
                if (str.contains("&")) {
                    value = str.replace("&", "%26");
                }
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(value);
        }
        return sb2.toString();
    }

    private static long a(float f10) {
        return Math.round(f10);
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
        StringBuilder sb2 = new StringBuilder("Code: ");
        sb2.append(khVar.a);
        sb2.append(", Name: ");
        sb2.append(khVar.a());
        sb2.append(", Message: ");
        sb2.append(khVar.getMessage());
        return a4.j.k(sb2, ", Cause Class: ", name, ", Cause Message: ", message);
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
        List c10 = kVar.c(oj.f6614a1);
        String lastPathSegment = uri.getLastPathSegment();
        if (c10.contains(lastPathSegment)) {
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
        Integer num = (Integer) kVar.a(oj.f6621b1);
        int length = StringUtils.emptyIfNull(str).length() + StringUtils.emptyIfNull(encodeUriString).length();
        if (length > num.intValue() && StringUtils.isValidString(encodeUriString)) {
            encodeUriString = encodeUriString.substring(length - num.intValue());
        }
        return (StringUtils.isValidString(encodeUriString) && StringUtils.isValidString(str)) ? eb.j.k(str, encodeUriString) : encodeUriString;
    }

    public static ActivityManager.MemoryInfo a(ActivityManager activityManager) {
        if (activityManager == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.b("Utils", "Unable to collect memory info.", th2);
            return null;
        }
    }

    public static Map a(AppLovinSdkSettings appLovinSdkSettings) {
        try {
            Field a10 = a(appLovinSdkSettings.getClass(), "metaData");
            if (a10 != null) {
                a10.setAccessible(true);
            }
            return (Map) a10.get(appLovinSdkSettings);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List a(JSONObject jSONObject, String str, String str2, com.applovin.impl.sdk.k kVar) {
        return a(jSONObject, str, null, str2, null, false, kVar);
    }

    public static List a(JSONObject jSONObject, String str, Map map, String str2, Map map2, boolean z10, com.applovin.impl.sdk.k kVar) {
        if (map == null) {
            map = new HashMap(1);
        }
        Map map3 = map;
        map3.put("{CLCODE}", str);
        return a(jSONObject, map3, str2, map2, z10, kVar);
    }

    public static List a(JSONObject jSONObject, Map map, String str, Map map2, boolean z10, com.applovin.impl.sdk.k kVar) {
        ArrayList arrayList = new ArrayList(jSONObject.length() + 1);
        if (StringUtils.isValidString(str)) {
            arrayList.add(new s(str, null, map2, z10));
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
                    arrayList.add(new s(replace, optString, map2, z10));
                }
            } catch (Throwable th2) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("Utils", "Failed to create and add postback url.", th2);
                }
            }
        }
        return arrayList;
    }

    public static String a(long j3, boolean z10) {
        String[] strArr = z10 ? f9484b : f9485c;
        long currentTimeMillis = (System.currentTimeMillis() - j3) / 1000;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            long j10 = a[i10];
            if (currentTimeMillis < j10) {
                if (currentTimeMillis <= 0) {
                    return z10 ? "just now" : "now";
                }
                return String.format("%d%s%s%s", Long.valueOf(currentTimeMillis), strArr[i10], (!z10 || currentTimeMillis <= 1) ? "" : "s", z10 ? " ago" : "");
            }
            currentTimeMillis /= j10;
        }
        return z10 ? "just now" : "now";
    }

    public static String a(int i10, Context context, com.applovin.impl.sdk.k kVar) {
        if (i10 == 0) {
            return "";
        }
        try {
            InputStream openRawResource = context.getResources().openRawResource(i10);
            try {
                byte[] bArr = new byte[openRawResource.available()];
                openRawResource.read(bArr);
                return new String(bArr);
            } catch (IOException e2) {
                if (kVar != null) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().a("Utils", "Opening raw resource file threw exception", e2);
                    }
                }
                return "";
            } finally {
                a((Closeable) openRawResource, kVar);
            }
        } catch (Throwable th2) {
            if (kVar != null) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("Utils", "Failed to retrieve resource " + i10, th2);
                }
            }
            return "";
        }
    }

    public static long a(com.applovin.impl.sdk.k kVar) {
        long longValue = ((Long) kVar.a(oj.E5)).longValue();
        long longValue2 = ((Long) kVar.a(oj.F5)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        return (longValue <= 0 || longValue2 <= 0) ? currentTimeMillis : (longValue - longValue2) + currentTimeMillis;
    }

    public static boolean a(Integer num) {
        return num.intValue() > 0 && num.intValue() <= 100 && ((int) (Math.random() * 100.0d)) + 1 <= num.intValue();
    }

    public static int a(int i10) {
        return a(i10, 95);
    }

    public static h0 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        return h0.a(AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", null)), AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", null)), JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, null), true, JsonUtils.getBoolean(jSONObject, "is_direct_sold", Boolean.FALSE).booleanValue());
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
    public static /* synthetic */ void a(WeakReference weakReference, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, Context context, boolean z10) {
        final b bVar2 = (b) weakReference.get();
        if (bVar2 == null) {
            return;
        }
        if (bVar instanceof bq) {
            final int i10 = 0;
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.pw
                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = i10;
                    zp.b bVar3 = bVar2;
                    switch (i11) {
                        case 0:
                            bVar3.onCachedResourcesChecked(true);
                            return;
                        case 1:
                            bVar3.onCachedResourcesChecked(false);
                            return;
                        case 2:
                            bVar3.onCachedResourcesChecked(false);
                            return;
                        default:
                            bVar3.onCachedResourcesChecked(true);
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
                final int i11 = 1;
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.pw
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        zp.b bVar3 = bVar2;
                        switch (i112) {
                            case 0:
                                bVar3.onCachedResourcesChecked(true);
                                return;
                            case 1:
                                bVar3.onCachedResourcesChecked(false);
                                return;
                            case 2:
                                bVar3.onCachedResourcesChecked(false);
                                return;
                            default:
                                bVar3.onCachedResourcesChecked(true);
                                return;
                        }
                    }
                });
                return;
            }
        }
        if (z10) {
            Uri s02 = bVar.s0();
            if (!kVar.D().c(s02.getLastPathSegment(), context)) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().b("Utils", "Cached video unavailable: " + s02);
                }
                final int i12 = 2;
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.pw
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        zp.b bVar3 = bVar2;
                        switch (i112) {
                            case 0:
                                bVar3.onCachedResourcesChecked(true);
                                return;
                            case 1:
                                bVar3.onCachedResourcesChecked(false);
                                return;
                            case 2:
                                bVar3.onCachedResourcesChecked(false);
                                return;
                            default:
                                bVar3.onCachedResourcesChecked(true);
                                return;
                        }
                    }
                });
                return;
            }
        }
        final int i13 = 3;
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.pw
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i13;
                zp.b bVar3 = bVar2;
                switch (i112) {
                    case 0:
                        bVar3.onCachedResourcesChecked(true);
                        return;
                    case 1:
                        bVar3.onCachedResourcesChecked(false);
                        return;
                    case 2:
                        bVar3.onCachedResourcesChecked(false);
                        return;
                    default:
                        bVar3.onCachedResourcesChecked(true);
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
            StringBuilder o10 = a4.j.o("\n**************************************************\nNO FILL received:\n..ID: \"", str, "\"\n..FORMAT: \"");
            o10.append(maxAdFormat != null ? maxAdFormat.getLabel() : "None");
            o10.append("\"\n..SDK KEY: \"");
            o10.append(kVar.d0());
            o10.append("\"\n..PACKAGE NAME: \"");
            o10.append(com.applovin.impl.sdk.k.k().getPackageName());
            o10.append("\"\n..Reason: ");
            o10.append(object);
            o10.append("\n**************************************************\n");
            String sb2 = o10.toString();
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("AppLovinSdk", sb2);
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
            return (!(obj instanceof Uri) || (intValue = ((Integer) kVar.a(oj.U0)).intValue()) <= 0 || valueOf2.length() <= intValue) ? valueOf2 : valueOf2.substring(0, intValue);
        }
        int intValue2 = ((Integer) kVar.a(oj.T0)).intValue();
        return (intValue2 <= 0 || valueOf2.length() <= intValue2) ? valueOf2 : valueOf2.substring(0, intValue2);
    }

    public static void a(MaxError maxError, String str, Context context) {
        StringBuilder sb2 = new StringBuilder();
        if (maxError.getCode() == -5001) {
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : maxError.getWaterfall().getNetworkResponses()) {
                MaxError error = maxNetworkResponseInfo.getError();
                String name = maxNetworkResponseInfo.getMediatedNetwork().getName();
                sb2.append(a4.j.h("\nFailed to load ", str, " from ", name, ":\n"));
                sb2.append("\nMAX Error " + error.getCode() + ": " + error.getMessage() + "\n");
                StringBuilder o10 = a4.j.o("\n", name, " Error ");
                o10.append(error.getMediatedNetworkErrorCode());
                o10.append(": ");
                o10.append(error.getMediatedNetworkErrorMessage());
                o10.append("\n\n");
                sb2.append(o10.toString());
            }
        } else {
            StringBuilder o11 = a4.j.o("Failed to load ", str, " with error ");
            o11.append(maxError.getCode());
            o11.append(": ");
            o11.append(maxError.getMessage());
            sb2.append(o11.toString());
        }
        a("", sb2.toString(), context);
    }

    public static void a(String str, Context context) {
        AppLovinSdkUtils.runOnUiThread(new zv(7, context, str));
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

    public static long a(byte[] bArr, int i10) {
        int i11 = i10 + 8;
        if (bArr.length < i11) {
            throw new IllegalArgumentException("byte array must be at least 8 bytes long");
        }
        long j3 = 0;
        while (i10 < i11) {
            j3 |= (bArr[i10] & 255) << (i10 * 8);
            i10++;
        }
        return j3;
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

    public static double a(String str, double d10) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("Utils", "Failed to parse double from String: " + str, th2);
            return d10;
        }
    }

    public static WebView a(Context context, String str, boolean z10) {
        try {
            WebView webView = new WebView(context);
            if (z10) {
                webView.setWebViewClient(new com.applovin.impl.sdk.x());
            }
            return webView;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("Utils", "Failed to initialize WebView for " + str + ".", th2);
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

    public static String a(double d10, int i10) {
        DecimalFormat decimalFormat = f9486d;
        decimalFormat.setMaximumFractionDigits(i10);
        return decimalFormat.format(d10);
    }
}
