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
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.AnalyticsEvents;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import com.safedk.android.utils.Logger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes3.dex */
public abstract class yp {

    /* renamed from: a */
    private static final int[] f28227a = {60, 60, 24, 7, 4, 12};

    /* renamed from: b */
    private static final String[] f28228b = {" second", " minute", " hour", " day", " week", " month"};

    /* renamed from: c */
    private static final String[] f28229c = {"s", "m", "h", "d", "w", ImpressionLog.H};
    private static final DecimalFormat d = new DecimalFormat();
    private static final Random e = new Random();

    /* renamed from: f */
    private static Boolean f28230f;

    /* renamed from: g */
    private static Boolean f28231g;

    /* renamed from: h */
    private static String f28232h;

    /* renamed from: i */
    private static Boolean f28233i;

    /* loaded from: classes3.dex */
    public class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    public static double a(long j2) {
        return j2 / 1024.0d;
    }

    public static float b(float f2) {
        return f2 * 1000.0f;
    }

    public static double d(long j2) {
        return j2 / 1000.0d;
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
        Boolean bool = f28233i;
        if (bool != null) {
            return bool;
        }
        try {
            String a2 = t0.a(context).a();
            String b2 = b(context);
            if (b2 == null) {
                return null;
            }
            if (b2.equals(a2)) {
                Boolean bool2 = Boolean.TRUE;
                f28233i = bool2;
                return bool2;
            }
            if (TextUtils.isEmpty(a2) && b2.equals(context.getPackageName())) {
                Boolean bool3 = Boolean.TRUE;
                f28233i = bool3;
                return bool3;
            }
            Boolean bool4 = Boolean.FALSE;
            f28233i = bool4;
            return bool4;
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.b("Utils", "Unable to determine if the current process is the main process", th);
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

    public static boolean k(Context context) {
        if (context == null) {
            context = com.applovin.impl.sdk.j.l();
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
        if (queryIntentActivities.isEmpty()) {
            return null;
        }
        return queryIntentActivities.get(0).activityInfo.name;
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, com.safedk.android.utils.g.f30048a);
        p02.startActivity(p12);
    }

    public static int a(int i2, int i3) {
        return (i2 < 0 || i2 > 100) ? i3 : i2;
    }

    public static int b(int i2) {
        return i2 * 1024;
    }

    public static void c() {
    }

    public static Context d(Context context) {
        return j(context) ? context : com.applovin.impl.sdk.j.l();
    }

    public static boolean e(com.applovin.impl.sdk.j jVar) {
        if (((Boolean) jVar.a(sj.D2)).booleanValue()) {
            return jVar.g0().isMuted();
        }
        return ((Boolean) jVar.a(sj.B2)).booleanValue();
    }

    public static boolean f(Context context) {
        if (f28230f == null) {
            f28230f = Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
        }
        return f28230f.booleanValue();
    }

    public static boolean h(Context context) {
        if (f28231g == null) {
            f28231g = Boolean.valueOf("com.applovin.apps.playables".equals(context.getPackageName()));
        }
        return f28231g.booleanValue();
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
            com.applovin.impl.sdk.n.c("Utils", "Unable to check Network Interfaces", th);
            return false;
        }
    }

    public static void a() {
    }

    public static long b(long j2) {
        return j2 * 8;
    }

    public static double c(long j2) {
        return a(b(j2));
    }

    public static boolean d(com.applovin.impl.sdk.j jVar) {
        String str = jVar.g0().getExtraParameters().get("user_agent_collection_enabled");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return true;
    }

    public static boolean i() {
        return !a("com.applovin.sdk.AppLovinSdk");
    }

    public static boolean k() {
        Context l2 = com.applovin.impl.sdk.j.l();
        if (l2 != null) {
            return t0.a(l2).a("applovin.sdk.verbose_logging");
        }
        return false;
    }

    public static boolean a(long j2, long j3) {
        return (j2 & j3) != 0;
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

    public static boolean a(MaxAdFormat maxAdFormat, MaxAdFormat maxAdFormat2) {
        return (maxAdFormat == null || maxAdFormat2 == null || (maxAdFormat != maxAdFormat2 && ((!maxAdFormat.isAdViewAd() || !maxAdFormat2.isAdViewAd()) && (!maxAdFormat.isFullscreenAd() || !maxAdFormat2.isFullscreenAd())))) ? false : true;
    }

    public static String b(Context context) {
        int myPid;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        if (StringUtils.isValidString(f28232h)) {
            return f28232h;
        }
        try {
            myPid = Process.myPid();
            runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.b("Utils", "Unable to determine process name", th);
        }
        if (runningAppProcesses == null) {
            com.applovin.impl.sdk.n.c("Utils", "No running app processes. Unable to determine process name");
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (myPid == runningAppProcessInfo.pid) {
                String str = runningAppProcessInfo.processName;
                f28232h = str;
                return str;
            }
        }
        return null;
    }

    public static String d(String str) {
        return (str == null || str.length() <= 4) ? "NOKEY" : str.substring(str.length() - 4);
    }

    public static int e(String str) {
        int i2 = 0;
        for (String str2 : str.replaceAll("-beta", ".").split("\\.")) {
            if (str2.length() > 2) {
                com.applovin.impl.sdk.n.h("Utils", "Version number components cannot be longer than two digits -> ".concat(str));
                return i2;
            }
            i2 = (i2 * 100) + Integer.parseInt(str2);
        }
        return !str.contains("-beta") ? (i2 * 100) + 99 : i2;
    }

    public static List a(boolean z2, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar, Context context) {
        Uri t02;
        if (bVar instanceof aq) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = new ArrayList(bVar.h()).iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!jVar.B().c(uri.getLastPathSegment(), context)) {
                jVar.J();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.J().b("Utils", "Cached HTML asset missing: " + uri);
                }
                arrayList.add(uri);
            }
        }
        if (z2 && (t02 = bVar.t0()) != null && !jVar.B().c(t02.getLastPathSegment(), context)) {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().b("Utils", "Cached video missing: " + t02);
            }
            arrayList.add(t02);
        }
        return arrayList;
    }

    public static boolean c(com.applovin.impl.sdk.j jVar) {
        String str = jVar.g0().getExtraParameters().get("run_in_release_mode");
        return ((StringUtils.isValidString(str) && Boolean.parseBoolean(str)) || (com.applovin.impl.sdk.j.l().getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static boolean g() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("Utils", "Exception thrown while getting memory state.", th);
        }
        int i2 = runningAppProcessInfo.importance;
        return i2 == 100 || i2 == 200;
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

    public static long c(String str) {
        if (!StringUtils.isValidString(str)) {
            return Long.MAX_VALUE;
        }
        try {
            return Color.parseColor(str);
        } catch (Throwable unused) {
            return Long.MAX_VALUE;
        }
    }

    public static long c(float f2) {
        return a(b(f2));
    }

    public static long c(byte[] bArr) {
        return a(bArr, 0);
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
            com.applovin.impl.sdk.n.c("Utils", "Unable to get Android SDK codename", th);
            return "";
        }
    }

    public static String b(Class cls, String str) {
        try {
            Field a2 = a(cls, str);
            a2.setAccessible(true);
            return (String) a2.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String d() {
        try {
            return Build.VERSION.RELEASE + " (" + e() + " - API " + Build.VERSION.SDK_INT + ")";
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("Utils", "Unable to get Android OS info", th);
            return "";
        }
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

    public static String b(String str) {
        return str.replace("ALPlayableAnalytics.trackEvent = ", "ALPlayableAnalytics.trackEvent = function (eventName) {const SDK_URL = 'applovin://com.applovin.sdk/playable_event';if (!Object.values(ALPlayableEvent).includes(eventName)) {var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=0&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();return;}var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=1&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();}; ALPlayableAnalytics.trackEvent_ignore = ");
    }

    public static boolean b(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 31 && bArr[1] == -117;
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

    public static void b(String str, String str2) {
        if (str == null || str.length() <= b(8)) {
            return;
        }
        com.applovin.impl.sdk.n.j(str2, "Provided custom data parameter longer than supported (" + str.length() + " bytes, " + b(8) + " maximum)");
    }

    public static void a(Closeable closeable, com.applovin.impl.sdk.j jVar) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th) {
            if (jVar != null) {
                jVar.J();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.J().a("Utils", "Unable to close stream: " + closeable, th);
                }
            }
        }
    }

    public static WebView b(Context context, String str) {
        return a(context, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(AppLovinAd appLovinAd, com.applovin.impl.sdk.j jVar) {
        if (appLovinAd instanceof AppLovinAdBase) {
            AppLovinAdBase appLovinAdBase = (AppLovinAdBase) appLovinAd;
            String b02 = jVar.b0();
            String b03 = appLovinAdBase.getSdk().b0();
            if (b02.equals(b03)) {
                return;
            }
            String str = "Ad was loaded from sdk with key: " + b03 + ", but is being rendered from sdk with key: " + b02;
            com.applovin.impl.sdk.n.h("AppLovinAd", str);
            jVar.D().c(ca.f23253q);
            a(str, appLovinAdBase, "AppLovinAd", jVar);
        }
    }

    public static int a(String str, String str2) {
        String digitsOnlyVersionString = StringUtils.toDigitsOnlyVersionString(str);
        String digitsOnlyVersionString2 = StringUtils.toDigitsOnlyVersionString(str2);
        try {
            String[] split = digitsOnlyVersionString.split("\\.");
            String[] split2 = digitsOnlyVersionString2.split("\\.");
            int max = Math.max(split.length, split2.length);
            for (int i2 = 0; i2 < max; i2++) {
                boolean isValidString = StringUtils.isValidString(split[i2]);
                String str3 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                String str4 = isValidString ? split[i2] : AppEventsConstants.EVENT_PARAM_VALUE_NO;
                if (StringUtils.isValidString(split2[i2])) {
                    str3 = split2[i2];
                }
                int parseInt = Integer.parseInt(str4);
                int parseInt2 = Integer.parseInt(str3);
                if (parseInt < parseInt2) {
                    return -1;
                }
                if (parseInt > parseInt2) {
                    return 1;
                }
            }
            return 0;
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("Utils", "Failed to process version string.", th);
            return 0;
        }
    }

    public static boolean b(com.applovin.impl.sdk.j jVar) {
        if (!z3.e()) {
            return true;
        }
        try {
            JSONObject.wrap(JSONObject.NULL);
            return true;
        } catch (Throwable th) {
            jVar.J();
            if (!com.applovin.impl.sdk.n.a()) {
                return false;
            }
            jVar.J().d("Utils", "Failed to wrap JSONObject with exception", th);
            return false;
        }
    }

    public static void a(HttpURLConnection httpURLConnection, com.applovin.impl.sdk.j jVar) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            AppLovinNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
        } catch (Throwable th) {
            if (jVar != null) {
                jVar.J();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.J().a("Utils", "Unable to disconnect connection: " + httpURLConnection, th);
                }
            }
        }
    }

    public static boolean b(List list) {
        Context l2 = com.applovin.impl.sdk.j.l();
        if (l2 == null) {
            com.applovin.impl.sdk.n.h("Utils", "Failed to check whether or not app is member of package names");
            return false;
        }
        return list.contains(l2.getPackageName());
    }

    public static String a(Map map, boolean z2) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z2) {
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
            sb.append(SignatureVisitor.INSTANCEOF);
            sb.append(value);
        }
        return sb.toString();
    }

    private static long a(float f2) {
        return Math.round(f2);
    }

    public static String a(Object obj) {
        if (obj instanceof ge) {
            return ((ge) obj).S();
        }
        if (af.a(obj)) {
            return ((com.applovin.impl.sdk.ad.b) obj).H();
        }
        return null;
    }

    public static int a(Context context) {
        z3.d();
        return Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0);
    }

    public static String a(nh nhVar) {
        if (nhVar == null) {
            return "Unknown error";
        }
        Throwable cause = nhVar.getCause();
        String message = cause != null ? cause.getMessage() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        return "Code: " + nhVar.f25710a + ", Name: " + nhVar.a() + ", Message: " + nhVar.getMessage() + ", Cause Class: " + (cause != null ? cause.getClass().getName() : "") + ", Cause Message: " + message;
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

    public static String a(Uri uri, String str, com.applovin.impl.sdk.j jVar) {
        List c2 = jVar.c(sj.f26904a1);
        String lastPathSegment = uri.getLastPathSegment();
        if (c2.contains(lastPathSegment)) {
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
        Integer num = (Integer) jVar.a(sj.f26906b1);
        int length = StringUtils.emptyIfNull(str).length() + StringUtils.emptyIfNull(encodeUriString).length();
        if (length > num.intValue() && StringUtils.isValidString(encodeUriString)) {
            encodeUriString = encodeUriString.substring(length - num.intValue());
        }
        return (StringUtils.isValidString(encodeUriString) && StringUtils.isValidString(str)) ? androidx.compose.foundation.text.input.a.j(str, encodeUriString) : encodeUriString;
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
            com.applovin.impl.sdk.n.b("Utils", "Unable to collect memory info.", th);
            return null;
        }
    }

    public static List a(JSONObject jSONObject, String str, String str2, com.applovin.impl.sdk.j jVar) {
        return a(jSONObject, str, null, str2, null, false, jVar);
    }

    public static List a(JSONObject jSONObject, String str, Map map, String str2, Map map2, boolean z2, com.applovin.impl.sdk.j jVar) {
        if (map == null) {
            map = new HashMap(1);
        }
        Map map3 = map;
        map3.put("{CLCODE}", str);
        return a(jSONObject, map3, str2, map2, z2, jVar);
    }

    public static List a(JSONObject jSONObject, Map map, String str, Map map2, boolean z2, com.applovin.impl.sdk.j jVar) {
        ArrayList arrayList = new ArrayList(jSONObject.length() + 1);
        if (StringUtils.isValidString(str)) {
            arrayList.add(new s(str, null, map2, z2));
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
                    arrayList.add(new s(replace, optString, map2, z2));
                }
            } catch (Throwable th) {
                jVar.J();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.J().a("Utils", "Failed to create and add postback url.", th);
                }
            }
        }
        return arrayList;
    }

    public static String a(long j2, boolean z2) {
        String[] strArr = z2 ? f28228b : f28229c;
        long currentTimeMillis = (System.currentTimeMillis() - j2) / 1000;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            long j3 = f28227a[i2];
            if (currentTimeMillis < j3) {
                if (currentTimeMillis <= 0) {
                    return z2 ? "just now" : "now";
                }
                return String.format("%d%s%s%s", Long.valueOf(currentTimeMillis), strArr[i2], (!z2 || currentTimeMillis <= 1) ? "" : "s", z2 ? " ago" : "");
            }
            currentTimeMillis /= j3;
        }
        return z2 ? "just now" : "now";
    }

    public static String a(int i2, Context context, com.applovin.impl.sdk.j jVar) {
        if (i2 == 0) {
            return "";
        }
        try {
            InputStream openRawResource = context.getResources().openRawResource(i2);
            try {
                byte[] bArr = new byte[openRawResource.available()];
                openRawResource.read(bArr);
                return new String(bArr);
            } catch (IOException e2) {
                if (jVar != null) {
                    jVar.J();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.J().a("Utils", "Opening raw resource file threw exception", e2);
                    }
                }
                return "";
            } finally {
                a(openRawResource, jVar);
            }
        } catch (Throwable th) {
            if (jVar != null) {
                jVar.J();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.J().a("Utils", "Failed to retrieve resource " + i2, th);
                }
            }
            return "";
        }
    }

    public static long a(com.applovin.impl.sdk.j jVar) {
        long longValue = ((Long) jVar.a(sj.J5)).longValue();
        long longValue2 = ((Long) jVar.a(sj.K5)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        return (longValue <= 0 || longValue2 <= 0) ? currentTimeMillis : (longValue - longValue2) + currentTimeMillis;
    }

    public static boolean a(double d2) {
        if (d2 >= 100.0d) {
            return true;
        }
        return d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && ((double) e.nextFloat()) < d2 / 100.0d;
    }

    public static String a(AppLovinSdkSettings appLovinSdkSettings) {
        String emptyIfNull = StringUtils.emptyIfNull(appLovinSdkSettings.getExtraParameters().get("applovin_unity_metadata"));
        if (TextUtils.isEmpty(emptyIfNull)) {
            return null;
        }
        Map<String, String> tryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(emptyIfNull, new JSONObject()));
        if (CollectionUtils.isEmpty(tryToStringMap)) {
            return null;
        }
        return tryToStringMap.get("UnityVersion");
    }

    public static int a(int i2) {
        return a(i2, 95);
    }

    public static h0 a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        return h0.a(AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", null)), AppLovinAdType.fromString(JsonUtils.getString(jSONObject, AppEventsConstants.EVENT_PARAM_AD_TYPE, null)), JsonUtils.getString(jSONObject, "zone_id", null), true, JsonUtils.getBoolean(jSONObject, "is_direct_sold", Boolean.FALSE).booleanValue());
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

    public static /* synthetic */ void a(Context context, String str) {
        Toast makeText = Toast.makeText(context, str, 0);
        makeText.setMargin(0.0f, 0.1f);
        makeText.show();
    }

    public static void a(String str, MaxAdFormat maxAdFormat, JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject.has("no_fill_reason")) {
            Object object = JsonUtils.getObject(jSONObject, "no_fill_reason", new Object());
            StringBuilder v2 = android.support.v4.media.d.v("\n**************************************************\nNO FILL received:\n..ID: \"", str, "\"\n..FORMAT: \"");
            v2.append(maxAdFormat != null ? maxAdFormat.getLabel() : "None");
            v2.append("\"\n..SDK KEY: \"");
            v2.append(jVar.b0());
            v2.append("\"\n..PACKAGE NAME: \"");
            v2.append(com.applovin.impl.sdk.j.l().getPackageName());
            v2.append("\"\n..Reason: ");
            v2.append(object);
            v2.append("\n**************************************************\n");
            String sb = v2.toString();
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().b("AppLovinSdk", sb);
            }
        }
    }

    public static AppLovinAd a(AppLovinAd appLovinAd, com.applovin.impl.sdk.j jVar) {
        if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
            return appLovinAd;
        }
        com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd;
        AppLovinAd dequeueAd = jVar.i().dequeueAd(cVar.getAdZone());
        jVar.J();
        if (com.applovin.impl.sdk.n.a()) {
            jVar.J().a("Utils", "Dequeued ad for dummy ad: " + dequeueAd);
        }
        if (dequeueAd != null) {
            cVar.a(dequeueAd);
            ((AppLovinAdImpl) dequeueAd).setDummyAd(cVar);
            return dequeueAd;
        }
        return cVar.e();
    }

    public static void a(com.applovin.impl.sdk.j jVar, String str) {
        String b02 = jVar.b0();
        if (!((Boolean) jVar.a(sj.G)).booleanValue() || b02 == null || b02.length() == 86) {
            return;
        }
        a(TextUtils.isEmpty(b02) ? "Empty SDK key" : "Invalid SDK key length", str, jVar);
    }

    public static void a(String str, String str2, Map map) {
        if (map.containsKey(str)) {
            map.put(str2, map.get(str));
            map.remove(str);
        }
    }

    private static void a(String str, AppLovinAdBase appLovinAdBase, String str2, com.applovin.impl.sdk.j jVar) {
        StringBuilder sb = new StringBuilder("sdkKey=");
        sb.append(jVar.b0());
        if (appLovinAdBase != null) {
            sb.append(",adSdkKey=");
            sb.append(appLovinAdBase.getSdk().b0());
        }
        HashMap hashMap = new HashMap();
        CollectionUtils.putStringIfValid("details", sb.toString(), hashMap);
        CollectionUtils.putStringIfValid("error_message", str, hashMap);
        jVar.E().a(la.L, str2, (Map) hashMap);
    }

    private static void a(String str, String str2, com.applovin.impl.sdk.j jVar) {
        a(str, (AppLovinAdBase) null, str2, jVar);
    }

    public static boolean a(sj sjVar, com.applovin.impl.sdk.j jVar) {
        String str = jVar.g0().getExtraParameters().get("enable_black_screen_fixes");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return ((Boolean) jVar.a(sjVar)).booleanValue();
    }

    public static boolean a(String str, com.applovin.impl.sdk.j jVar) {
        if (str == null) {
            return false;
        }
        return StringUtils.containsAtLeastOneSubstring(str, jVar.c(sj.R0));
    }

    public static void a(MaxError maxError, String str, Context context) {
        StringBuilder sb = new StringBuilder();
        if (maxError.getCode() == -5001) {
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : maxError.getWaterfall().getNetworkResponses()) {
                MaxError error = maxNetworkResponseInfo.getError();
                String name = maxNetworkResponseInfo.getMediatedNetwork().getName();
                sb.append(androidx.compose.foundation.text.input.a.m("\nFailed to load ", str, " from ", name, ":\n"));
                sb.append("\nMAX Error " + error.getCode() + ": " + error.getMessage() + "\n");
                StringBuilder v2 = android.support.v4.media.d.v("\n", name, " Error ");
                v2.append(error.getMediatedNetworkErrorCode());
                v2.append(": ");
                v2.append(error.getMediatedNetworkErrorMessage());
                v2.append("\n\n");
                sb.append(v2.toString());
            }
        } else {
            StringBuilder v3 = android.support.v4.media.d.v("Failed to load ", str, " with error ");
            v3.append(maxError.getCode());
            v3.append(": ");
            v3.append(maxError.getMessage());
            sb.append(v3.toString());
        }
        a("", sb.toString(), context);
    }

    public static void a(String str, Context context) {
        AppLovinSdkUtils.runOnUiThread(new kw(5, context, str));
    }

    public static void a(String str, MaxAd maxAd, Context context) {
        Toast.makeText(context, maxAd.getFormat().getLabel() + ": " + str, 1).show();
    }

    public static void a(Uri uri, Activity activity, com.applovin.impl.sdk.j jVar) {
        if (activity == null) {
            activity = jVar.n0();
        }
        Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
        intent.putExtra("sdk_key", jVar.b0());
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, uri.toString());
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
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

    public static long a(byte[] bArr, int i2) {
        int i3 = i2 + 8;
        if (bArr.length < i3) {
            throw new IllegalArgumentException("byte array must be at least 8 bytes long");
        }
        long j2 = 0;
        while (i2 < i3) {
            j2 |= (bArr[i2] & 255) << (i2 * 8);
            i2++;
        }
        return j2;
    }

    public static Map a(Map map, com.applovin.impl.sdk.j jVar) {
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
            com.applovin.impl.sdk.n.c("Utils", "Failed to parse double from String: " + str, th);
            return d2;
        }
    }

    public static WebView a(Context context, String str, boolean z2) {
        try {
            WebView webView = new WebView(context);
            if (z2) {
                webView.setWebViewClient(new pi());
            }
            return webView;
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("Utils", "Failed to initialize WebView for " + str + ".", th);
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
}
