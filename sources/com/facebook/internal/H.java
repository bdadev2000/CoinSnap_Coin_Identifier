package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.FragmentTransaction;
import com.adjust.sdk.Constants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.sdk.AppLovinMediationProvider;
import com.facebook.C0785a;
import com.facebook.C1849l;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import u0.C2747b;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public static int f13579a = 0;
    public static long b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static long f13580c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static long f13581d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static String f13582e = "";

    /* renamed from: f, reason: collision with root package name */
    public static String f13583f = "";

    /* renamed from: g, reason: collision with root package name */
    public static String f13584g = "NoCarrier";

    /* renamed from: h, reason: collision with root package name */
    public static String f13585h = "";

    /* renamed from: i, reason: collision with root package name */
    public static Locale f13586i;

    public static boolean A(Context context) {
        Method t9 = t("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (t9 == null) {
            return false;
        }
        Object w2 = w(null, t9, context);
        if (!(w2 instanceof Integer) || !G7.j.a(w2, 0)) {
            return false;
        }
        return true;
    }

    public static final boolean B(String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean C(Uri uri) {
        if (uri != null && ("http".equalsIgnoreCase(uri.getScheme()) || Constants.SCHEME.equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme()))) {
            return true;
        }
        return false;
    }

    public static final ArrayList D(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                arrayList.add(jSONArray.getString(i9));
                if (i10 >= length) {
                    break;
                }
                i9 = i10;
            }
        }
        return arrayList;
    }

    public static final HashMap E(String str) {
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                G7.j.d(next, "key");
                String string = jSONObject.getString(next);
                G7.j.d(string, "jsonObject.getString(key)");
                hashMap.put(next, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final String F(Map map) {
        G7.j.e(map, "map");
        String str = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            G7.j.d(str, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return str;
    }

    public static final Bundle G(String str) {
        Bundle bundle = new Bundle();
        if (!B(str)) {
            if (str != null) {
                Object[] array = O7.g.V(str, new String[]{"&"}, 0, 6).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    int length = strArr.length;
                    int i9 = 0;
                    while (i9 < length) {
                        String str2 = strArr[i9];
                        i9++;
                        Object[] array2 = O7.g.V(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                        if (array2 != null) {
                            String[] strArr2 = (String[]) array2;
                            try {
                                if (strArr2.length == 2) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                                } else if (strArr2.length == 1) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), "");
                                }
                            } catch (UnsupportedEncodingException unused) {
                                com.facebook.r rVar = com.facebook.r.f13801a;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void H(Bundle bundle, JSONArray jSONArray) {
        G7.j.e(bundle, "bundle");
        if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray("media", (boolean[]) jSONArray);
            return;
        }
        if (jSONArray instanceof double[]) {
            bundle.putDoubleArray("media", (double[]) jSONArray);
            return;
        }
        if (jSONArray instanceof int[]) {
            bundle.putIntArray("media", (int[]) jSONArray);
        } else if (jSONArray instanceof long[]) {
            bundle.putLongArray("media", (long[]) jSONArray);
        } else {
            bundle.putString("media", jSONArray.toString());
        }
    }

    public static final HashMap I(Parcel parcel) {
        G7.j.e(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (readInt > 0) {
            int i9 = 0;
            do {
                i9++;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (readString != null && readString2 != null) {
                    hashMap.put(readString, readString2);
                }
            } while (i9 < readInt);
        }
        return hashMap;
    }

    public static final String J(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader = null;
            }
        } catch (Throwable th3) {
            bufferedInputStream = null;
            th = th3;
            inputStreamReader = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read != -1) {
                    sb.append(cArr, 0, read);
                } else {
                    String sb2 = sb.toString();
                    G7.j.d(sb2, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                    d(bufferedInputStream);
                    d(inputStreamReader);
                    return sb2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            d(bufferedInputStream);
            d(inputStreamReader);
            throw th;
        }
    }

    public static final void K(Runnable runnable) {
        try {
            com.facebook.r.c().execute(runnable);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void L(org.json.JSONObject r11, android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.H.L(org.json.JSONObject, android.content.Context):void");
    }

    public static final String M(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(O7.a.f2244a);
        G7.j.d(bytes, "(this as java.lang.String).getBytes(charset)");
        return v(Constants.SHA256, bytes);
    }

    public static final void N(Parcel parcel, Map map) {
        G7.j.e(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public static final Uri a(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(Constants.SCHEME);
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        G7.j.d(build, "builder.build()");
        return build;
    }

    public static void b(Context context, String str) {
        int i9;
        boolean z8;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        Object[] array = O7.g.V(cookie, new String[]{";"}, 0, 6).toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str2 = strArr[i10];
                i10++;
                Object[] array2 = O7.g.V(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                if (array2 != null) {
                    String[] strArr2 = (String[]) array2;
                    if (strArr2.length > 0) {
                        String str3 = strArr2[0];
                        int length2 = str3.length() - 1;
                        int i11 = 0;
                        boolean z9 = false;
                        while (i11 <= length2) {
                            if (!z9) {
                                i9 = i11;
                            } else {
                                i9 = length2;
                            }
                            if (G7.j.f(str3.charAt(i9), 32) <= 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (!z9) {
                                if (!z8) {
                                    z9 = true;
                                } else {
                                    i11++;
                                }
                            } else if (!z8) {
                                break;
                            } else {
                                length2--;
                            }
                        }
                        cookieManager.setCookie(str, G7.j.j("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;", str3.subSequence(i11, length2 + 1).toString()));
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            cookieManager.removeExpiredCookie();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final void c(Context context) {
        try {
            b(context, "facebook.com");
            b(context, ".facebook.com");
            b(context, "https://facebook.com");
            b(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final String e(String str) {
        if (B(str)) {
            return "";
        }
        return str;
    }

    public static final ArrayList f(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i9 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    String string = jSONArray.getString(i9);
                    G7.j.d(string, "jsonArray.getString(i)");
                    arrayList.add(string);
                    if (i10 < length) {
                        i9 = i10;
                    } else {
                        return arrayList;
                    }
                }
            } else {
                return arrayList;
            }
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final HashMap g(JSONObject jSONObject) {
        G7.j.e(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jSONObject.names();
        if (names == null) {
            return hashMap;
        }
        int length = names.length();
        if (length > 0) {
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                try {
                    String string = names.getString(i9);
                    G7.j.d(string, "keys.getString(i)");
                    Object obj = jSONObject.get(string);
                    if (obj instanceof JSONObject) {
                        obj = g((JSONObject) obj);
                    }
                    G7.j.d(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    hashMap.put(string, obj);
                } catch (JSONException unused) {
                }
                if (i10 >= length) {
                    break;
                }
                i9 = i10;
            }
        }
        return hashMap;
    }

    public static final HashMap h(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                G7.j.d(next, "key");
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    public static final int i(InputStream inputStream, OutputStream outputStream) {
        G7.j.e(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
                int i9 = 0;
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i9 += read;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i9;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final void j(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static final String k(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return AppLovinMediationProvider.UNKNOWN;
        }
        return context.getClass().getSimpleName();
    }

    public static final String l(Context context) {
        String string;
        try {
            com.facebook.r rVar = com.facebook.r.f13801a;
            AbstractC1839h.k();
            String str = com.facebook.r.f13804e;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i9 = applicationInfo.labelRes;
            if (i9 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i9);
                G7.j.d(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final Date m(Bundle bundle, String str, Date date) {
        long parseLong;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            parseLong = ((Number) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        if (parseLong == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((parseLong * 1000) + date.getTime());
    }

    public static final JSONObject n() {
        if (O2.a.b(H.class)) {
            return null;
        }
        try {
            String string = com.facebook.r.a().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            O2.a.a(H.class, th);
            return null;
        }
    }

    public static final String o() {
        com.facebook.r rVar = com.facebook.r.f13801a;
        return String.format("m.%s", Arrays.copyOf(new Object[]{com.facebook.r.f13814q}, 1));
    }

    public static final void p(final G g9, final String str) {
        String str2;
        String str3;
        G7.j.e(str, "accessToken");
        ConcurrentHashMap concurrentHashMap = D.f13573a;
        JSONObject jSONObject = (JSONObject) D.f13573a.get(str);
        if (jSONObject != null) {
            g9.c(jSONObject);
            return;
        }
        com.facebook.v vVar = new com.facebook.v() { // from class: com.facebook.internal.F
            @Override // com.facebook.v
            public final void a(com.facebook.F f9) {
                G g10 = G.this;
                G7.j.e(g10, "$callback");
                String str4 = str;
                G7.j.e(str4, "$accessToken");
                com.facebook.p pVar = f9.f13407c;
                if (pVar != null) {
                    g10.h(pVar.f13799k);
                    return;
                }
                ConcurrentHashMap concurrentHashMap2 = D.f13573a;
                JSONObject jSONObject2 = f9.f13408d;
                if (jSONObject2 != null) {
                    D.f13573a.put(str4, jSONObject2);
                    g10.c(jSONObject2);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
        };
        com.facebook.G g10 = com.facebook.G.b;
        Bundle bundle = new Bundle();
        Date date = C0785a.f13439n;
        C0785a m = com.facebook.appevents.g.m();
        if (m == null || (str2 = m.m) == null) {
            str2 = "facebook";
        }
        if (str2.equals("instagram")) {
            str3 = "id,name,profile_picture";
        } else {
            str3 = "id,name,first_name,middle_name,last_name";
        }
        bundle.putString("fields", str3);
        bundle.putString("access_token", str);
        com.facebook.C c9 = new com.facebook.C(null, "me", null, null, new com.facebook.w(0));
        c9.f13384d = bundle;
        c9.f13388h = g10;
        c9.j(vVar);
        c9.d();
    }

    public static final String q() {
        com.facebook.r rVar = com.facebook.r.f13801a;
        return String.format("m.%s", Arrays.copyOf(new Object[]{com.facebook.r.f13813p}, 1));
    }

    public static void r(Context context) {
        G7.j.e(context, "context");
        if (C1835d.a() != null) {
            C1835d.a();
            return;
        }
        C1835d c1835d = new C1835d(context);
        if (!O2.a.b(C1835d.class)) {
            try {
                if (!O2.a.b(c1835d)) {
                    try {
                        C2747b a6 = C2747b.a((Context) c1835d.b);
                        G7.j.d(a6, "getInstance(applicationContext)");
                        a6.b(c1835d, new IntentFilter("com.parse.bolts.measurement_event"));
                    } catch (Throwable th) {
                        O2.a.a(c1835d, th);
                    }
                }
            } catch (Throwable th2) {
                O2.a.a(C1835d.class, th2);
            }
        }
        if (!O2.a.b(C1835d.class)) {
            try {
                C1835d.f13610c = c1835d;
            } catch (Throwable th3) {
                O2.a.a(C1835d.class, th3);
            }
        }
        C1835d.a();
    }

    public static final Method s(Class cls, String str, Class... clsArr) {
        G7.j.e(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method t(String str, String str2, Class... clsArr) {
        try {
            return s(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Object u(JSONObject jSONObject, String str, String str2) {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt != null && !(opt instanceof JSONObject) && !(opt instanceof JSONArray)) {
            if (str2 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(str2, opt);
                return jSONObject2;
            }
            throw new C1849l("Got an unexpected non-JSON object.");
        }
        return opt;
    }

    public static String v(String str, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            G7.j.d(messageDigest, "hash");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            G7.j.d(digest, "digest");
            int length = digest.length;
            int i9 = 0;
            while (i9 < length) {
                byte b8 = digest[i9];
                i9++;
                sb.append(Integer.toHexString((b8 >> 4) & 15));
                sb.append(Integer.toHexString(b8 & Ascii.SI));
            }
            String sb2 = sb.toString();
            G7.j.d(sb2, "builder.toString()");
            return sb2;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Object w(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean x() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format("fb%s://applinks", Arrays.copyOf(new Object[]{com.facebook.r.b()}, 1))));
            Context a6 = com.facebook.r.a();
            PackageManager packageManager = a6.getPackageManager();
            String packageName = a6.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            G7.j.d(queryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                if (G7.j.a(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean y(Context context) {
        G7.j.e(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str != null) {
            G7.j.d(str, "DEVICE");
            Pattern compile = Pattern.compile(".+_cheets|cheets_.+");
            G7.j.d(compile, "compile(...)");
            if (compile.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean z() {
        if (O2.a.b(H.class)) {
            return false;
        }
        try {
            JSONObject n2 = n();
            if (n2 == null) {
                return false;
            }
            try {
                JSONArray jSONArray = n2.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                if (length > 0) {
                    int i9 = 0;
                    while (true) {
                        int i10 = i9 + 1;
                        String string = jSONArray.getString(i9);
                        G7.j.d(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        G7.j.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (lowerCase.equals("ldu")) {
                            return true;
                        }
                        if (i10 >= length) {
                            break;
                        }
                        i9 = i10;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th) {
            O2.a.a(H.class, th);
            return false;
        }
    }
}
