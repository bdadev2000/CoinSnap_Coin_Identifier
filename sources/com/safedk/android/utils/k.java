package com.safedk.android.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.webkit.WebView;
import com.applovin.mediation.ads.MaxAdView;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.security.CertificateUtil;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class k {
    private static final String A = "http://play.google.com/store/apps/details?id=";

    /* renamed from: a, reason: collision with root package name */
    public static final String f30093a = "UNKNOWN_PROCESS";

    /* renamed from: b, reason: collision with root package name */
    public static final String f30094b = "Accept";
    public static final String d = "text:";
    public static final String e = "java.lang.String";

    /* renamed from: g, reason: collision with root package name */
    private static final String f30097g = "Utils";

    /* renamed from: h, reason: collision with root package name */
    private static boolean f30098h = false;

    /* renamed from: j, reason: collision with root package name */
    private static final String f30100j = "com.applovin.sdk.AppLovinSdk";

    /* renamed from: k, reason: collision with root package name */
    private static final String f30101k = "VERSION";

    /* renamed from: l, reason: collision with root package name */
    private static final String f30102l = "video/";

    /* renamed from: q, reason: collision with root package name */
    private static final String f30107q = "https://www.youtube.com/watch?v=";

    /* renamed from: t, reason: collision with root package name */
    private static String f30110t = null;
    private static final String x = "market://details?id=";

    /* renamed from: y, reason: collision with root package name */
    private static final String f30113y = "amzn://apps/android?p=";

    /* renamed from: z, reason: collision with root package name */
    private static final String f30114z = "samsungapps://ProductDetail/";

    /* renamed from: i, reason: collision with root package name */
    private static boolean f30099i = false;

    /* renamed from: c, reason: collision with root package name */
    public static final String f30095c = "mp4";

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f30103m = {"jpg", "jpeg", "gif", "png", f30095c, "m4v", "js", "css", CreativeInfo.al, "mkv", "3gp", "3gpp", "webm", "mp3", "htm", "svg", "3g2", "avi", "mpg", "mpeg", "mov", "qt", "zip", "webp", "raw", "image"};

    /* renamed from: n, reason: collision with root package name */
    private static final HashSet<String> f30104n = new HashSet<>(Arrays.asList(f30103m));

    /* renamed from: o, reason: collision with root package name */
    private static final String[] f30105o = {"image"};

    /* renamed from: p, reason: collision with root package name */
    private static final HashSet<String> f30106p = new HashSet<>(Arrays.asList(f30105o));

    /* renamed from: r, reason: collision with root package name */
    private static final List<String> f30108r = Arrays.asList("gif", "jpg", "jpeg", "png", "bmp");

    /* renamed from: s, reason: collision with root package name */
    private static final List<String> f30109s = Arrays.asList(f30095c, "m4v", "webm", "avi", "mpg", "mpeg", "mov", "qt", "3gp", "3gpp");

    /* renamed from: f, reason: collision with root package name */
    static Map<String, String> f30096f = new HashMap<String, String>() { // from class: com.safedk.android.utils.Utils$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            put("sms", "SMS MMS");
            put("calllog", "Call Log");
            put("packagemanager", "User Apps");
            put("advertising_identifier", "Identifier for Advertising");
        }
    };

    /* renamed from: u, reason: collision with root package name */
    private static final String[] f30111u = {"expire", "ei", "sig", "lsig", "mt", "lmt", "cpn"};

    /* renamed from: v, reason: collision with root package name */
    private static final String[] f30112v = {f30095c, "m4v", "mkv", "3gp", "3gpp", "webm", "mov", "webp"};
    private static final String[] w = {"jpg", "jpeg", "gif", "png", f30095c, "m4v", "mkv", "3gp", "3gpp", "webm", "mp3", "htm", "js", "css", CreativeInfo.al, "svg", "3g2", "avi", "mpg", "mpeg", "mov", "qt", "zip", "webp"};
    private static final Map<String, String> B = new HashMap();

    static {
        B.put(x, "https://play.google.com/store/apps/details?id=");
        B.put(f30113y, "https://www.amazon.com/gp/mas/dl/android?p=");
        B.put(f30114z, "https://www.samsungapps.com/appquery/appDetail.as?appId=");
        B.put(A, A);
    }

    public static String a() {
        if (f30110t == null) {
            f30110t = a(f30100j, f30101k);
        }
        return f30110t;
    }

    public static Object a(Object obj, String str) {
        Object obj2 = null;
        try {
            Field a2 = a((Class) obj.getClass(), str);
            a2.setAccessible(true);
            obj2 = a2.get(obj);
            Logger.d("reflection", str + " = " + obj2);
            return obj2;
        } catch (NoSuchFieldException e2) {
            Logger.w(f30097g, "Failed to get reflection field:" + str);
            return obj2;
        } catch (Exception e3) {
            Logger.e(f30097g, "Failed to get reflection field value", e3);
            return obj2;
        }
    }

    private static Field a(Class cls, String str) throws NoSuchFieldException {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e2) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                throw e2;
            }
            return a(superclass, str);
        }
    }

    public static String a(String str, String str2) {
        try {
            Field declaredField = Class.forName(str).getDeclaredField(str2);
            declaredField.setAccessible(true);
            return declaredField.isAccessible() ? (String) declaredField.get(null) : "";
        } catch (ClassNotFoundException e2) {
            Logger.d(f30097g, "Error retrieving field value. Class name :" + str + ", field name :" + str2, e2);
            return null;
        } catch (IllegalAccessException e3) {
            Logger.e(f30097g, "Error retrieving field value. Class name :" + str + ", field name :" + str2, e3);
            return null;
        } catch (IllegalArgumentException e4) {
            Logger.e(f30097g, "Error retrieving field value. Class name :" + str + ", field name :" + str2, e4);
            return null;
        } catch (NoSuchFieldException e5) {
            Logger.e(f30097g, "Error retrieving field value. Class name :" + str + ", field name :" + str2, e5);
            return null;
        } catch (SecurityException e6) {
            Logger.e(f30097g, "Error retrieving field value. Class name :" + str + ", field name :" + str2, e6);
            return null;
        }
    }

    public static Object b(Object obj, String str) {
        Object obj2 = null;
        try {
            Method method = obj.getClass().getMethod(str, new Class[0]);
            method.setAccessible(true);
            obj2 = method.invoke(obj, new Object[0]);
            Logger.d("reflection", str + " " + obj2);
            return obj2;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return obj2;
        } catch (Exception e3) {
            e3.printStackTrace();
            return obj2;
        }
    }

    public static long b() {
        return a(System.currentTimeMillis());
    }

    public static long a(long j2) {
        return (j2 / 60000) * 60;
    }

    public static long b(long j2) {
        return j2 / 1000;
    }

    public static boolean a(ArrayList<StatsEvent> arrayList) {
        for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
            StatsEvent statsEvent = arrayList.get(i2);
            StatsEvent statsEvent2 = arrayList.get(i2 + 1);
            int compareTo = statsEvent.compareTo(statsEvent2);
            if (compareTo > 0) {
                Logger.e(f30097g, "failed sort. first: " + statsEvent + " second: " + statsEvent2);
                Logger.e(f30097g, "compare score: " + compareTo);
                return false;
            }
        }
        return true;
    }

    public static String a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            char[] cArr = new char[65536];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            Logger.e(f30097g, "Failed to read configuration from input stream", e2);
        }
        return sb.toString();
    }

    public static long c(long j2) {
        return (j2 / 60) * 60000;
    }

    public static String a(Context context) {
        String str;
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    str = runningAppProcessInfo.processName;
                    break;
                }
            }
        }
        str = "";
        if (str.equals("")) {
            return f30093a;
        }
        return str;
    }

    public static String a(String str) {
        String str2 = f30096f.get(str);
        return TextUtils.isEmpty(str2) ? L(str) : str2;
    }

    private static String L(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
        }
        return str;
    }

    public static DisplayMetrics a(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } catch (Throwable th) {
            Logger.e(f30097g, "error during display metrics extraction");
        }
        return displayMetrics;
    }

    public static Map<String, String> b(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, (String) jSONObject.get(next));
                }
            } catch (JSONException e2) {
                Logger.e(f30097g, "exception while parsing json string to map", e2);
                return null;
            }
        }
        return hashMap;
    }

    public static JSONObject a(Map<String, String> map) {
        try {
            return new JSONObject(map.toString());
        } catch (JSONException e2) {
            Logger.e(f30097g, "exception while parsing map to JSON object", e2);
            return null;
        }
    }

    public static void b(String str, String str2) {
        if (Logger.getDebugMode()) {
            int length = str2.length() / 4000;
            for (int i2 = 0; i2 <= length; i2++) {
                int i3 = (i2 + 1) * 4000;
                if (i3 >= str2.length()) {
                    i3 = str2.length();
                }
                Logger.v(str, str2.substring(i2 * 4000, i3));
            }
        }
    }

    public static String c(String str, String str2) {
        try {
        } catch (Throwable th) {
            Logger.e(f30097g, "Exception in getting query param decoded : " + th.getMessage(), th);
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            Map<String, String> b2 = b(str, true);
            if (b2 != null && b2.containsKey(str2)) {
                Logger.d(f30097g, "param " + str2 + " value is " + b2.get(str2));
                return b2.get(str2);
            }
            return null;
        }
        return null;
    }

    public static String d(String str, String str2) {
        Map<String, String> b2;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || (b2 = b(str, true)) == null || !b2.containsKey(str2)) {
            return null;
        }
        Logger.d(f30097g, "param " + str2 + " value is " + b2.get(str2));
        return b2.get(str2);
    }

    public static Map<String, String> a(String str, boolean z2) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            for (String str3 : str.split("&")) {
                int indexOf = str3.indexOf(ImpressionLog.R);
                if (indexOf != -1) {
                    String substring = str3.substring(0, indexOf);
                    String decode = z2 ? URLDecoder.decode(substring, "UTF-8") : substring;
                    if (indexOf + 1 < str3.length()) {
                        str2 = str3.substring(indexOf + 1);
                        if (z2) {
                            str2 = URLDecoder.decode(str2, "UTF-8");
                        }
                    } else {
                        str2 = null;
                    }
                    linkedHashMap.put(decode, str2);
                }
            }
            return linkedHashMap;
        } catch (UnsupportedEncodingException e2) {
            Logger.e(f30097g, "Exception in splitQuery, queryParams = " + str, e2);
            return null;
        } catch (Throwable th) {
            Logger.e(f30097g, "Exception in splitQuery: " + th);
            return null;
        }
    }

    public static Map<String, String> b(String str, boolean z2) {
        try {
            if (str.contains("?")) {
                return a(str.substring(str.indexOf("?") + 1), z2);
            }
            return null;
        } catch (Throwable th) {
            Logger.e(f30097g, "Exception in splitQuery, url = " + str, th);
            return null;
        }
    }

    public static boolean c(String str) {
        String d2 = d(str);
        if (TextUtils.isEmpty(d2)) {
            return false;
        }
        return f30104n.contains(d2);
    }

    public static String d(String str) {
        int lastIndexOf;
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf2 = str.lastIndexOf(35);
            if (lastIndexOf2 > 0) {
                str = str.substring(0, lastIndexOf2);
            }
            int lastIndexOf3 = str.lastIndexOf(63);
            if (lastIndexOf3 > 0) {
                str = str.substring(0, lastIndexOf3);
            }
            int lastIndexOf4 = str.lastIndexOf(47);
            if (lastIndexOf4 >= 0) {
                str = str.substring(lastIndexOf4 + 1);
            }
            if (!str.isEmpty() && (lastIndexOf = str.lastIndexOf(46)) >= 0) {
                return str.substring(lastIndexOf + 1);
            }
        }
        return "";
    }

    public static boolean a(String str, Map<String, String> map) {
        boolean z2;
        boolean z3;
        if (TextUtils.isEmpty(str) || str.startsWith("data:text/html")) {
            return false;
        }
        String o2 = o(str);
        String d2 = d(o2);
        if (d2 != null && d2.length() > 0) {
            if (f30104n.contains(d2)) {
                Logger.d(f30097g, "should include resource url extension match: " + o2);
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            if (o2.toLowerCase().startsWith(f30107q.toLowerCase()) || o2.toLowerCase().startsWith("text:".toLowerCase())) {
                Logger.d(f30097g, "should include resource url prefix match :" + o2);
                z2 = true;
            } else {
                z2 = false;
            }
            String[] strArr = com.safedk.android.analytics.brandsafety.creatives.e.a().get(com.safedk.android.analytics.brandsafety.creatives.e.d);
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (o2.contains(str2)) {
                        Logger.d(f30097g, "should include resource url will be included (GENERAL_INCLUSION_LIST) : " + o2);
                        z2 = true;
                    }
                }
            }
            if (map != null && map.containsKey("Accept")) {
                String str3 = map.get("Accept");
                Logger.d(f30097g, "should include resource url 'Accept' header value is " + str3);
                if (str3 != null && str3.length() > 0 && (str3.contains(f30102l) || N(str3) || O(str3))) {
                    z3 = true;
                }
            }
            z3 = z2;
        }
        if (o2.startsWith("data:") || o2.startsWith("about:")) {
            Logger.d(f30097g, "should include resource url excluded : " + o2);
            z3 = false;
        }
        if (!z3) {
            return z3;
        }
        boolean M = M(o2);
        Logger.d(f30097g, "should include resource url: " + o2 + ", should excluded? " + M);
        return !M;
    }

    private static boolean M(String str) {
        String[] strArr = com.safedk.android.analytics.brandsafety.creatives.e.a().get(com.safedk.android.analytics.brandsafety.creatives.e.f29578c);
        if (strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    Logger.d(f30097g, "url will be excluded (GENERAL_EXCLUSION_LIST) : " + str);
                    return true;
                }
            }
        }
        String[] strArr2 = com.safedk.android.analytics.brandsafety.creatives.e.a().get(com.safedk.android.analytics.brandsafety.creatives.e.f29577b);
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                if (str.contains(str3)) {
                    Logger.d(f30097g, "url will be excluded (ATTRIBUTION_URLS): " + str);
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean N(String str) {
        Logger.d(f30097g, "header contains image mime type, headerValue = " + str + ", list: " + SafeDK.getInstance().u().toString());
        Iterator<String> it = SafeDK.getInstance().u().iterator();
        while (it.hasNext()) {
            if (str.contains("image/" + it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean O(String str) {
        Logger.d(f30097g, "header contains audio mime type, headerValue = " + str + ", list: " + SafeDK.getInstance().v().toString());
        Iterator<String> it = SafeDK.getInstance().v().iterator();
        while (it.hasNext()) {
            if (str.contains("audio/" + it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String e(String str) {
        return String.format(Locale.ENGLISH, "https://www.youtube.com/watch?v=%s", str);
    }

    public static ArrayList<String> f(String str) {
        String replaceAll;
        new ArrayList();
        StringBuffer stringBuffer = new StringBuffer(str);
        try {
            b(f30097g, "extract Urls from source with unicode unescape started, source length " + str.length());
            Matcher matcher = f.B().matcher(str);
            while (matcher.find()) {
                stringBuffer.replace(matcher.start(), matcher.end(), m(str.substring(matcher.start(), matcher.end())));
            }
            b(f30097g, "extract Urls from source with unicode unescape, unescapeUnicode  " + stringBuffer.toString());
            return g(replaceAll);
        } catch (Throwable th) {
            Logger.d(f30097g, "Exception in extract Urls from source with unicode unescape, : " + th.getMessage(), th);
            return g(replaceAll);
        } finally {
            g(k(stringBuffer.toString()).replaceAll("\\/\\*(.*?)\\*\\/", ""));
        }
    }

    public static ArrayList<String> g(String str) {
        HashSet hashSet = new HashSet();
        if (TextUtils.isEmpty(str)) {
            return new ArrayList<>();
        }
        try {
            Matcher matcher = f.D().matcher(str);
            while (matcher.find()) {
                String k2 = k(matcher.group(1).replace("\\/", RemoteSettings.FORWARD_SLASH_STRING));
                if (URLUtil.isValidUrl(k2)) {
                    hashSet.add(k2);
                } else {
                    try {
                        String decode = URLDecoder.decode(k2, "UTF-8");
                        if (URLUtil.isValidUrl(decode)) {
                            hashSet.add(decode);
                        }
                    } catch (IllegalArgumentException e2) {
                        Logger.d(f30097g, "extract urls from html - illegal argument exception occurred while decoding, so adding the original url instead: " + k2);
                        hashSet.add(k2);
                    }
                }
            }
            b(f30097g, "extract urls from html found: " + hashSet);
        } catch (Throwable th) {
            Logger.d(f30097g, "extract urls from html - exception when decoding url: " + th.getMessage());
        }
        return new ArrayList<>(hashSet);
    }

    public static ArrayList<String> h(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (str != null) {
            b(f30097g, "extract urls from source with special chars: , source: " + str);
            Matcher matcher = f.A().matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group(1).replace("\\/", RemoteSettings.FORWARD_SLASH_STRING));
            }
        }
        return arrayList;
    }

    public static ArrayList<String> i(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (str != null) {
            try {
                Logger.v(f30097g, "extract base64 encoded resource from source. regex pattern: " + f.y());
                Matcher matcher = f.y().matcher(str);
                while (matcher.find()) {
                    String group = matcher.group(2);
                    int P = P(group);
                    Logger.v(f30097g, "base64 encoded resource from source found. Hash: " + P + " , resource: " + group);
                    arrayList.add(matcher.group(1) + CertificateUtil.DELIMITER + P);
                }
            } catch (Throwable th) {
                Logger.d(f30097g, "Exception in base64 encoded resource extraction " + th.getMessage());
            }
        }
        return arrayList;
    }

    private static int P(String str) {
        int i2 = 0;
        if (str.length() == 0) {
            return 0;
        }
        int i3 = 0;
        while (true) {
            int i4 = i2;
            if (i3 >= str.length()) {
                return i4;
            }
            i2 = (str.charAt(i3) + ((i4 << 5) - i4)) | 0;
            i3++;
        }
    }

    public static String j(String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            i2++;
            if (charAt == '\\' && i2 < str.length()) {
                char charAt2 = str.charAt(i2);
                i2++;
                if (charAt2 == '\\' || charAt2 == '/' || charAt2 == '\"' || charAt2 == '\'') {
                    sb.append(charAt2);
                } else if (charAt2 == 'n') {
                    sb.append('\n');
                } else if (charAt2 == 'r') {
                    sb.append('\r');
                } else if (charAt2 == 't') {
                    sb.append('\t');
                } else if (charAt2 == 'b') {
                    sb.append('\b');
                } else if (charAt2 == 'f') {
                    sb.append('\f');
                } else if (charAt2 == 'u') {
                    StringBuilder sb2 = new StringBuilder();
                    if (i2 + 4 > str.length()) {
                        throw new RuntimeException("Not enough unicode digits! ");
                    }
                    for (char c2 : str.substring(i2, i2 + 4).toCharArray()) {
                        if (!Character.isLetterOrDigit(c2)) {
                            throw new RuntimeException("Bad character in unicode escape.");
                        }
                        sb2.append(Character.toLowerCase(c2));
                    }
                    i2 += 4;
                    sb.append((char) Integer.parseInt(sb2.toString(), 16));
                } else {
                    throw new RuntimeException("Illegal escape sequence: \\" + charAt2);
                }
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static String k(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                System.currentTimeMillis();
                String replace = n(l(str)).replace("&amp;", "&").replace("\\/", RemoteSettings.FORWARD_SLASH_STRING);
                while (replace.contains("&amp;")) {
                    replace = replace.replace("&amp;", "&");
                }
                while (replace.contains("&apos;")) {
                    replace = replace.replace("&apos;", "'");
                }
                while (replace.contains("&#39;")) {
                    replace = replace.replace("&#39;", "'");
                }
                while (replace.contains("&nbsp;")) {
                    replace = replace.replace("&nbsp;", " ");
                }
                if (replace.contains("[CDATA[") && replace.contains("&lt;") && replace.contains("&gt;") && replace.contains("&quot;")) {
                    int indexOf = replace.indexOf(com.safedk.android.analytics.brandsafety.creatives.e.e);
                    int lastIndexOf = replace.lastIndexOf("&quot;");
                    if (lastIndexOf != -1 && lastIndexOf > indexOf && !replace.substring(lastIndexOf).contains("[CDATA[")) {
                        replace = replace.substring(0, lastIndexOf);
                    }
                }
                return replace;
            } catch (Throwable th) {
                Logger.e(f30097g, "exception in selective decode. input param is " + str + "' , error : " + th.getMessage());
                return str;
            }
        }
        return str;
    }

    public static String l(String str) {
        Matcher matcher = f.x().matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, String.valueOf((char) Integer.parseInt(matcher.group(1), 16)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static String m(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.replace("\\\\x21", "!").replace("\\\\x22", "\"").replace("\\\\x23", "#").replace("\\\\x24", "$").replace("\\\\x25", "%").replace("\\\\x26", "&").replace("\\\\x27", "'").replace("\\\\x28", "(").replace("\\\\x29", ")").replace("\\\\x2a", "*").replace("\\\\x2b", "+").replace("\\\\x2c", ",").replace("\\\\x2d", "-").replace("\\\\x2e", ".").replace("\\\\x2f", RemoteSettings.FORWARD_SLASH_STRING).replace("\\\\x3a", CertificateUtil.DELIMITER).replace("\\\\x3b", ";").replace("\\\\x3c", "<").replace("\\\\x3d", ImpressionLog.R).replace("\\\\x3e", ">").replace("\\\\x3f", "?").replace("\\\\x40", "@").replace("\\\\x5b", "[").replace("\\\\x5d", "]").replace("\\x21", "!").replace("\\x22", "\"").replace("\\x23", "#").replace("\\x24", "$").replace("\\x25", "%").replace("\\x26", "&").replace("\\x27", "'").replace("\\x28", "(").replace("\\x29", ")").replace("\\x2a", "*").replace("\\x2b", "+").replace("\\x2c", ",").replace("\\x2f", RemoteSettings.FORWARD_SLASH_STRING).replace("\\x3a", CertificateUtil.DELIMITER).replace("\\x3b", ";").replace("\\x3c", "<").replace("\\x3d", ImpressionLog.R).replace("\\x3e", ">").replace("\\x3f", "?").replace("\\x40", "@").replace("\\x5b", "[").replace("\\x5d", "]").replace("&amp;", "&");
            } catch (Throwable th) {
                Logger.e(f30097g, "exception in unescapeUnicodeHex. input param is " + str + "' , error : " + th.getMessage());
                return str;
            }
        }
        return str;
    }

    public static String n(String str) {
        Matcher matcher = Pattern.compile("\\\\+x([0-9a-f]{2})").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, String.valueOf((char) Integer.parseInt(matcher.group(1), 16)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static String a(Pattern pattern, String str, int i2) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find() || matcher.groupCount() < i2) {
            return null;
        }
        return matcher.group(i2);
    }

    public static List<String> b(Pattern pattern, String str, int i2) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group(i2));
        }
        return arrayList;
    }

    public static List<String> a(Pattern pattern, String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }
        return arrayList;
    }

    public static List<Integer> b(Pattern pattern, String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            arrayList.add(Integer.valueOf(matcher.start()));
        }
        return arrayList;
    }

    public static List<MatchResult> c(Pattern pattern, String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.toMatchResult());
        }
        return arrayList;
    }

    public static boolean d(Pattern pattern, String str) {
        Logger.d(f30097g, "match exists for pattern: " + pattern.pattern());
        return pattern.matcher(str).find();
    }

    public static String e(Pattern pattern, String str) {
        Logger.d(f30097g, "get match for pattern: " + pattern.pattern());
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find() || matcher.groupCount() <= 0) {
            return null;
        }
        String group = matcher.group(1);
        Logger.d(f30097g, "match for pattern: " + group);
        return group;
    }

    public static String e(String str, String str2) {
        return !str.contains("?") ? str : str.replaceFirst("(?<=[?&])" + str2 + "=.*?(&|$)", "").replaceFirst("[?&]$", "");
    }

    public static String o(String str) {
        if (str != null && str.contains("?")) {
            return str.substring(0, str.indexOf("?"));
        }
        return str;
    }

    public static boolean p(String str) {
        return d(f.z(), str);
    }

    public static String q(String str) {
        if (p(str)) {
            for (String str2 : f30111u) {
                str = e(str, str2);
            }
        }
        return str;
    }

    public static String a(View view) {
        return view == null ? "" : view.getClass().getName() + " " + BrandSafetyUtils.a(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static View a(String str, String str2, View view) {
        View view2;
        try {
        } catch (Throwable th) {
            Logger.e(str, str2 + " exception in get absolute parent (input param is " + view + "' , error : " + th.getMessage());
            view2 = view;
        }
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            Logger.d(str, str2 + " get absolute parent, new view parent : " + parent);
            ViewParent viewParent = parent;
            while (viewParent.getParent() != null) {
                ViewParent parent2 = viewParent.getParent();
                Logger.d(str, str2 + " get absolute parent, new parent : " + parent2);
                viewParent = parent2;
            }
            view2 = (View) viewParent;
            Logger.d(str, str2 + " get absolute parent returning " + view2);
            return view2;
        }
        return view;
    }

    public static boolean b(View view) {
        try {
            if (view.getParent() == null) {
                return false;
            }
            if (view instanceof MaxAdView) {
                return true;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof MaxAdView) {
                return true;
            }
            while (parent.getParent() != null) {
                parent = parent.getParent();
                if (parent instanceof MaxAdView) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Logger.e(f30097g, "exception in get absolute parent (input param is " + view + "' , error : " + th.getMessage());
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0008, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.applovin.mediation.ads.MaxAdView c(android.view.View r5) {
        /*
            r1 = 0
            android.view.ViewParent r0 = r5.getParent()     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L9
            r0 = r1
        L8:
            return r0
        L9:
            boolean r0 = r5 instanceof com.applovin.mediation.ads.MaxAdView     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L11
            com.applovin.mediation.ads.MaxAdView r5 = (com.applovin.mediation.ads.MaxAdView) r5     // Catch: java.lang.Throwable -> L2d
            r0 = r5
            goto L8
        L11:
            android.view.ViewParent r0 = r5.getParent()     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r0 instanceof com.applovin.mediation.ads.MaxAdView     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L1c
            com.applovin.mediation.ads.MaxAdView r0 = (com.applovin.mediation.ads.MaxAdView) r0     // Catch: java.lang.Throwable -> L2d
            goto L8
        L1c:
            android.view.ViewParent r2 = r0.getParent()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L54
            android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r0 instanceof com.applovin.mediation.ads.MaxAdView     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L1c
            com.applovin.mediation.ads.MaxAdView r0 = (com.applovin.mediation.ads.MaxAdView) r0     // Catch: java.lang.Throwable -> L2d
            goto L8
        L2d:
            r0 = move-exception
            java.lang.String r2 = "Utils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "exception in get absolute parent (input param is "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r4 = "' , error : "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
            com.safedk.android.utils.Logger.e(r2, r0)
        L54:
            r0 = r1
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.utils.k.c(android.view.View):com.applovin.mediation.ads.MaxAdView");
    }

    public static void a(SortedMap<Integer, List<String>> sortedMap, int i2, String str) {
        if (!sortedMap.containsKey(Integer.valueOf(i2))) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            sortedMap.put(Integer.valueOf(i2), arrayList);
            return;
        }
        sortedMap.get(Integer.valueOf(i2)).add(str);
    }

    public static boolean r(String str) {
        if (str == null) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e2) {
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof URL) {
            return true;
        }
        try {
            new URL((String) obj);
            return true;
        } catch (MalformedURLException e2) {
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean s(String str) {
        String lowerCase = str.toLowerCase();
        return (lowerCase.contains("<html") && lowerCase.contains("</html>")) || (lowerCase.contains("<div") && lowerCase.contains("</div>")) || (lowerCase.contains("<script") && lowerCase.contains("</script>"));
    }

    public static String a(String str, int i2) {
        int i3 = 0;
        int indexOf = str.indexOf("<div", i2);
        int indexOf2 = str.indexOf("</div", i2);
        int i4 = i2;
        while (i4 < str.length()) {
            if (indexOf < indexOf2) {
                i3++;
                i4 = indexOf + 1;
                indexOf = str.indexOf("<div", i4);
            } else {
                i3--;
                i4 = indexOf2 + 1;
                if (i3 == 0) {
                    return str.substring(i2, indexOf2);
                }
                indexOf2 = str.indexOf("</div", i4);
            }
        }
        return null;
    }

    public static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static JSONObject a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                Object obj = bundle.get(str);
                if (obj instanceof Bundle) {
                    jSONObject.put(str, a((Bundle) obj));
                } else {
                    jSONObject.put(str, obj);
                }
            } catch (JSONException e2) {
            }
        }
        return jSONObject;
    }

    public static String a(Intent intent) {
        if (intent == null) {
            return "";
        }
        StringBuilder append = new StringBuilder("action: ").append(intent.getAction()).append(" data: ").append(intent.getDataString()).append(" extras: ");
        if (intent.getExtras() != null) {
            for (String str : intent.getExtras().keySet()) {
                append.append(str).append(ImpressionLog.R).append(intent.getExtras().get(str)).append(" ");
            }
        }
        return append.toString();
    }

    public static boolean t(String str) {
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException e2) {
            return false;
        }
    }

    public static boolean u(String str) {
        try {
            new JSONArray(str);
            return true;
        } catch (JSONException e2) {
            return false;
        }
    }

    public static boolean v(String str) {
        return t(str) || u(str);
    }

    public static String a(String str, String[] strArr) {
        if (strArr != null) {
            for (String str2 : strArr) {
                str = e(str, str2);
            }
            Logger.d(f30097g, "remove query param from Url returned '" + str);
        }
        return str;
    }

    public static boolean w(String str) {
        if (str == null) {
            return false;
        }
        for (String str2 : B.keySet()) {
            if (str.startsWith(str2) || str.startsWith(B.get(str2))) {
                return true;
            }
        }
        return false;
    }

    public static String x(String str) {
        for (String str2 : B.keySet()) {
            if (str.startsWith(str2)) {
                return str.replace(str2, B.get(str2));
            }
        }
        return str;
    }

    public static String y(String str) {
        int indexOf;
        for (String str2 : B.keySet()) {
            if (str.startsWith(str2)) {
                String replace = str.replace(str2, "");
                int indexOf2 = replace.indexOf(63);
                if (indexOf2 < 0) {
                    indexOf2 = replace.indexOf(38);
                }
                if (indexOf2 > 0) {
                    return str2 + replace.substring(0, indexOf2);
                }
                return str;
            }
            if (str.startsWith(B.get(str2)) && (indexOf = str.indexOf(38)) > 0) {
                str = str.substring(0, indexOf);
            }
        }
        return str;
    }

    public static boolean z(String str) {
        boolean z2 = false;
        if (str != null) {
            String lowerCase = o(str).toLowerCase();
            String[] strArr = f30112v;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (!lowerCase.endsWith("." + strArr[i2])) {
                    i2++;
                } else {
                    z2 = true;
                    break;
                }
            }
            Logger.d(f30097g, "is video media uri returned " + z2 + " for url = " + str);
        }
        return z2;
    }

    public static String A(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = o(str).toLowerCase();
        for (String str2 : f30112v) {
            if (lowerCase.endsWith("." + str2)) {
                Logger.d(f30097g, "get video media extension returned " + str2 + " for url = " + str);
                return str2;
            }
        }
        return null;
    }

    public static boolean B(String str) {
        Logger.d(f30097g, "isBinaryUrlExtension started, url = " + str);
        boolean z2 = false;
        for (String str2 : w) {
            if (str.endsWith(str2)) {
                Logger.d(f30097g, "is binary url extension returned true for url = " + str);
                z2 = true;
            }
        }
        return z2;
    }

    public static String d() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date());
    }

    public static String e() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date());
    }

    public static String a(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.getDefault()).format(date);
    }

    public static String C(String str) {
        try {
            Date date = new Date(new File(str).lastModified());
            if (date != null) {
                return a(date);
            }
        } catch (Throwable th) {
            Logger.d(f30097g, "Error extracting file last modified date from file " + str + " : " + th.getMessage(), th);
        }
        return "NA";
    }

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & UnsignedBytes.MAX_VALUE);
            if (hexString.length() == 1) {
                stringBuffer.append('0');
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    public static boolean a(String str, List<String> list) {
        if (str != null && list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean D(String str) {
        Iterator<String> it = f30108r.iterator();
        while (it.hasNext()) {
            if (str.endsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean E(String str) {
        String o2 = o(str);
        Iterator<String> it = f30109s.iterator();
        while (it.hasNext()) {
            if (o2.endsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(float f2, float f3) {
        boolean z2 = false;
        if (f3 == 0.0f || f2 == 0.0f) {
            Logger.d(f30097g, "Banner ratio height/width cannot be 0");
        } else {
            float f4 = f2 / f3;
            if ((f4 >= 6.0d && f4 <= 8.4d) || (f4 >= 12.0d && f4 <= 15.0d)) {
                z2 = true;
            }
            Logger.d(f30097g, "Banner ratio: " + f4 + " ? " + z2);
        }
        return z2;
    }

    public static boolean b(float f2, float f3) {
        boolean z2 = false;
        if (f3 == 0.0f || f2 == 0.0f) {
            Logger.d(f30097g, "MREC ratio height/width cannot be 0");
        } else {
            float f4 = f2 / f3;
            if (f4 >= 1.1d && f4 <= 1.3d) {
                z2 = true;
            }
            Logger.d(f30097g, "MREC ratio: " + f4 + " ? " + z2);
        }
        return z2;
    }

    public static boolean d(View view) {
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            while (parent != null) {
                Logger.d(f30097g, "is webview inside max ad view, view parent: " + parent);
                if (parent instanceof MaxAdView) {
                    Logger.d(f30097g, "is webview inside max ad view, max ad view found: " + parent);
                    return true;
                }
                if (parent.getParent() != null) {
                    parent = parent.getParent();
                }
            }
        }
        return false;
    }

    public static boolean b(String str, Map<String, String> map) {
        String str2;
        Logger.d(f30097g, "contains accept video header or has video extension, url: " + str + ", headers: " + map);
        if (map != null && map.containsKey("Accept") && (str2 = map.get("Accept")) != null && str2.length() > 0 && str2.contains(f30102l)) {
            Logger.d(f30097g, "identified video header, url: " + str + ", headers: " + map);
            return true;
        }
        if (str != null && E(str)) {
            Logger.d(f30097g, "identified video extension, url: " + str);
            return true;
        }
        return false;
    }

    public static String a(String str, Pattern pattern, int i2, String str2) {
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            stack.push(Integer.valueOf(matcher.start(i2)));
            stack2.push(Integer.valueOf(matcher.end(i2)));
        }
        StringBuilder sb = new StringBuilder(str);
        while (!stack.isEmpty()) {
            int intValue = ((Integer) stack.pop()).intValue();
            int intValue2 = ((Integer) stack2.pop()).intValue();
            if (intValue >= 0 && intValue2 >= 0) {
                Logger.d(f30097g, "replacing text of matching group. removing :  " + str.substring(intValue, intValue2));
                sb.replace(intValue, intValue2, str2);
            }
        }
        return sb.toString();
    }

    public static String F(String str) {
        if (str != null) {
            String G = G(str);
            if (G.contains("?") && str.contains("%3F") && G.indexOf("?") <= str.indexOf("%3F")) {
                Logger.d(f30097g, "decode URL if needed: " + str);
                return G;
            }
            return str;
        }
        return str;
    }

    public static String G(String str) {
        if (str != null) {
            try {
                return URLDecoder.decode(str, "UTF-8");
            } catch (Throwable th) {
                Logger.d(f30097g, "Exception decoding url " + str + " : " + th.getMessage());
                return str;
            }
        }
        return str;
    }

    public static String H(String str) {
        if (str != null && str.length() != 0) {
            return str.replace("&nbsp;", " ").replace("&quot;", "\"").replace("&apos;", "'").replace("&#39;", "'").replace("&lt;", "<").replace("&gt;", ">").replace("&amp;", "&").replaceAll("<\\s*?br\\s*?" + RemoteSettings.FORWARD_SLASH_STRING + "\\s*?>", "\n").replaceAll("<\\s*?span\\s+?" + AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE + "\\s*?" + ImpressionLog.R + "\\s*?\"white-space:pre\"\\s*?>&#9;<\\s*?" + RemoteSettings.FORWARD_SLASH_STRING + "\\s*?span\\s*?>", "\t");
        }
        return str;
    }

    public static String I(String str) {
        if (str != null && str.length() != 0) {
            try {
                return new String(Base64.decode(str, 0));
            } catch (IllegalArgumentException e2) {
                Logger.d(f30097g, "base64Decoder - failed to Base64 decode buffer (decoded): " + e2.getMessage());
                return str;
            }
        }
        return str;
    }

    public static boolean J(String str) {
        if (str.contains("{") && str.contains("}") && str.contains(CertificateUtil.DELIMITER) && str.contains("\"")) {
            return v(str);
        }
        return false;
    }

    public static boolean a(Collection<?> collection) {
        return collection == null || collection.size() == 0;
    }

    public static String a(ConcurrentHashMap<?, WeakReference<WebView>> concurrentHashMap, boolean z2) {
        StringBuilder sb = new StringBuilder("{");
        Iterator<Map.Entry<?, WeakReference<WebView>>> it = concurrentHashMap.entrySet().iterator();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < concurrentHashMap.size()) {
                Map.Entry<?, WeakReference<WebView>> next = it.next();
                sb.append(next.getKey()).append(ImpressionLog.R);
                if (next.getValue() != null && next.getValue().get() != null) {
                    if (z2) {
                        sb.append(BrandSafetyUtils.a(next.getValue().get()));
                    } else {
                        sb.append(next.getValue().get().toString());
                    }
                } else {
                    sb.append("null");
                }
                if (i3 < concurrentHashMap.size() - 1) {
                    sb.append(", ");
                }
                i2 = i3 + 1;
            } else {
                return sb.append("}").toString();
            }
        }
    }

    public static ArrayList<String> a(Collection<String> collection, int i2) {
        return a(collection, 0, i2);
    }

    public static ArrayList<String> a(Collection<String> collection, int i2, int i3) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().substring(i2, i3));
        }
        return arrayList;
    }

    public static boolean f(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        b(f30097g, "stringSimilarity: s1 is: " + str);
        b(f30097g, "stringSimilarity: s2 is: " + str2);
        if (str.length() != str2.length()) {
            Logger.d(f30097g, "stringSimilarity: they don't have the same length s1=" + str.length() + " s2=" + str2.length());
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) != str2.charAt(i2)) {
                Logger.d(f30097g, "stringSimilarity: they are not equal at char number i: s1[i]=" + str.charAt(i2) + " s2[i]=" + str2.charAt(i2));
                return false;
            }
        }
        Logger.d(f30097g, "stringSimilarity: they are equal!");
        return true;
    }

    public static boolean a(Reference<?> reference) {
        return (reference == null || reference.get() == null) ? false : true;
    }

    public static String b(Object obj) {
        return obj == null ? "null" : obj.toString();
    }

    public static String K(String str) {
        try {
            return new URI(o(str)).getHost();
        } catch (URISyntaxException e2) {
            Logger.e(f30097g, "getURLDomain - exception occurred: " + e2);
            return null;
        }
    }

    public static boolean a(WebView webView) {
        MaxAdView c2 = c(webView);
        if (c2 != null) {
            String a2 = BrandSafetyUtils.a(c2);
            SafeDK.getInstance().z();
            if (BannerFinder.d().containsKey(a2)) {
                SafeDK.getInstance().z();
                if (BannerFinder.d().get(a2) != null) {
                    SafeDK.getInstance().z();
                    if (BannerFinder.d().get(a2).equals(BrandSafetyUtils.AdType.MREC)) {
                        StringBuilder append = new StringBuilder().append("isMrecWebView returned true for webview = ").append(webView).append(", maxAdViewAddress = ").append(a2).append(", getMaxAdViewAddressToAdType= ");
                        SafeDK.getInstance().z();
                        Logger.d(f30097g, append.append(BannerFinder.d().toString()).toString());
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
