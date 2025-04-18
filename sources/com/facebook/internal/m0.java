package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinMediationProvider;
import com.mbridge.msdk.playercommon.exoplayer2.C;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes3.dex */
public abstract class m0 {
    public static int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static long f11049b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static long f11050c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static long f11051d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static String f11052e = "";

    /* renamed from: f, reason: collision with root package name */
    public static String f11053f = "";

    /* renamed from: g, reason: collision with root package name */
    public static String f11054g = "NoCarrier";

    /* renamed from: h, reason: collision with root package name */
    public static String f11055h = "";

    /* renamed from: i, reason: collision with root package name */
    public static Locale f11056i;

    public static final boolean A(Uri uri) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        if (uri != null) {
            equals = StringsKt__StringsJVMKt.equals("http", uri.getScheme(), true);
            if (!equals) {
                equals2 = StringsKt__StringsJVMKt.equals(Constants.SCHEME, uri.getScheme(), true);
                if (!equals2) {
                    equals3 = StringsKt__StringsJVMKt.equals("fbstaging", uri.getScheme(), true);
                    if (equals3) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final ArrayList B(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                arrayList.add(jsonArray.getString(i10));
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return arrayList;
    }

    public static final HashMap C(String str) {
        boolean z10;
        Intrinsics.checkNotNullParameter(str, "str");
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                Intrinsics.checkNotNullExpressionValue(key, "key");
                String string = jSONObject.getString(key);
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
                hashMap.put(key, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final String D(Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
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
            Intrinsics.checkNotNullExpressionValue(str, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return str;
    }

    public static final boolean E(Context context) {
        AutofillManager autofillManager;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) == null || !autofillManager.isAutofillSupported() || !autofillManager.isEnabled()) {
            return false;
        }
        return true;
    }

    public static final Bundle F(String str) {
        List split$default;
        List split$default2;
        Bundle bundle = new Bundle();
        if (!z(str)) {
            if (str != null) {
                split$default = StringsKt__StringsKt.split$default(str, new String[]{"&"}, false, 0, 6, (Object) null);
                Object[] array = split$default.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    int length = strArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        String str2 = strArr[i10];
                        i10++;
                        split$default2 = StringsKt__StringsKt.split$default(str2, new String[]{"="}, false, 0, 6, (Object) null);
                        Object[] array2 = split$default2.toArray(new String[0]);
                        if (array2 != null) {
                            String[] strArr2 = (String[]) array2;
                            try {
                                if (strArr2.length == 2) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                                } else if (strArr2.length == 1) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), "");
                                }
                            } catch (UnsupportedEncodingException unused) {
                                com.facebook.x xVar = com.facebook.x.a;
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
    public static final void G(Bundle bundle, JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (jSONArray instanceof Boolean) {
            bundle.putBoolean("media", ((Boolean) jSONArray).booleanValue());
            return;
        }
        if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray("media", (boolean[]) jSONArray);
            return;
        }
        if (jSONArray instanceof Double) {
            bundle.putDouble("media", ((Number) jSONArray).doubleValue());
            return;
        }
        if (jSONArray instanceof double[]) {
            bundle.putDoubleArray("media", (double[]) jSONArray);
            return;
        }
        if (jSONArray instanceof Integer) {
            bundle.putInt("media", ((Number) jSONArray).intValue());
            return;
        }
        if (jSONArray instanceof int[]) {
            bundle.putIntArray("media", (int[]) jSONArray);
            return;
        }
        if (jSONArray instanceof Long) {
            bundle.putLong("media", ((Number) jSONArray).longValue());
            return;
        }
        if (jSONArray instanceof long[]) {
            bundle.putLongArray("media", (long[]) jSONArray);
        } else if (jSONArray instanceof String) {
            bundle.putString("media", (String) jSONArray);
        } else {
            bundle.putString("media", jSONArray.toString());
        }
    }

    public static final HashMap H(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (readInt > 0) {
            int i10 = 0;
            do {
                i10++;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (readString != null && readString2 != null) {
                    hashMap.put(readString, readString2);
                }
            } while (i10 < readInt);
        }
        return hashMap;
    }

    public static final String I(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
            } catch (Throwable th3) {
                th2 = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th2 = th4;
            inputStreamReader = null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read != -1) {
                    sb2.append(cArr, 0, read);
                } else {
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                    d(bufferedInputStream);
                    d(inputStreamReader);
                    return sb3;
                }
            }
        } catch (Throwable th5) {
            th2 = th5;
            d(bufferedInputStream);
            d(inputStreamReader);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void J(org.json.JSONObject r11, android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.m0.J(org.json.JSONObject, android.content.Context):void");
    }

    public static final String K(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return t(Constants.SHA256, bytes);
    }

    public static final void L(Parcel parcel, Map map) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
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

    public static final boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : Intrinsics.areEqual(obj, obj2);
    }

    public static final Uri b(Bundle bundle, String str, String str2) {
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
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }

    public static void c(Context context, String str) {
        List split$default;
        List split$default2;
        int i10;
        boolean z10;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        split$default = StringsKt__StringsKt.split$default(cookie, new String[]{";"}, false, 0, 6, (Object) null);
        Object[] array = split$default.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i11 = 0;
            while (i11 < length) {
                String str2 = strArr[i11];
                i11++;
                split$default2 = StringsKt__StringsKt.split$default(str2, new String[]{"="}, false, 0, 6, (Object) null);
                Object[] array2 = split$default2.toArray(new String[0]);
                if (array2 != null) {
                    String[] strArr2 = (String[]) array2;
                    if (strArr2.length > 0) {
                        String str3 = strArr2[0];
                        int length2 = str3.length() - 1;
                        int i12 = 0;
                        boolean z11 = false;
                        while (i12 <= length2) {
                            if (!z11) {
                                i10 = i12;
                            } else {
                                i10 = length2;
                            }
                            if (Intrinsics.compare((int) str3.charAt(i10), 32) <= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z11) {
                                if (!z10) {
                                    z11 = true;
                                } else {
                                    i12++;
                                }
                            } else if (!z10) {
                                break;
                            } else {
                                length2--;
                            }
                        }
                        cookieManager.setCookie(str, Intrinsics.stringPlus(str3.subSequence(i12, length2 + 1).toString(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
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

    public static final void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final String e(String str) {
        return z(str) ? "" : str;
    }

    public static final ArrayList f(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    String string = jsonArray.getString(i10);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    arrayList.add(string);
                    if (i11 < length) {
                        i10 = i11;
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

    public static final HashMap g(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jsonObject.names();
        if (names == null) {
            return hashMap;
        }
        int length = names.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                try {
                    String string = names.getString(i10);
                    Intrinsics.checkNotNullExpressionValue(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = g((JSONObject) value);
                    }
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    hashMap.put(string, value);
                } catch (JSONException unused) {
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashMap;
    }

    public static final HashMap h(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            String optString = jsonObject.optString(key);
            if (optString != null) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                hashMap.put(key, optString);
            }
        }
        return hashMap;
    }

    public static final int i(InputStream inputStream, OutputStream outputStream) {
        BufferedInputStream bufferedInputStream;
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[8192];
            int i10 = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                i10 += read;
            }
            bufferedInputStream.close();
            if (inputStream != null) {
                inputStream.close();
            }
            return i10;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static final void j(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static final String k(Context context) {
        if (context == null) {
            return AbstractJsonLexerKt.NULL;
        }
        if (context == context.getApplicationContext()) {
            return AppLovinMediationProvider.UNKNOWN;
        }
        String simpleName = context.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    public static final String l(Context context) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            com.facebook.x xVar = com.facebook.x.a;
            x5.i.s();
            String str = com.facebook.x.f11425e;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i10);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final Date m(Bundle bundle, String str, Date dateBase) {
        long parseLong;
        Intrinsics.checkNotNullParameter(dateBase, "dateBase");
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
        return new Date((parseLong * 1000) + dateBase.getTime());
    }

    public static final JSONObject n() {
        if (m6.a.b(m0.class)) {
            return null;
        }
        try {
            String string = com.facebook.x.a().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            m6.a.a(m0.class, th2);
            return null;
        }
    }

    public static final void o(final l0 callback, final String accessToken) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ConcurrentHashMap concurrentHashMap = h0.a;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        JSONObject jSONObject = (JSONObject) h0.a.get(accessToken);
        if (jSONObject != null) {
            callback.a(jSONObject);
            return;
        }
        com.facebook.b0 b0Var = new com.facebook.b0() { // from class: com.facebook.internal.j0
            @Override // com.facebook.b0
            public final void a(com.facebook.k0 response) {
                l0 callback2 = l0.this;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                String key = accessToken;
                Intrinsics.checkNotNullParameter(key, "$accessToken");
                Intrinsics.checkNotNullParameter(response, "response");
                com.facebook.u uVar = response.f11168c;
                if (uVar != null) {
                    callback2.b(uVar.f11412k);
                    return;
                }
                ConcurrentHashMap concurrentHashMap2 = h0.a;
                JSONObject value = response.f11169d;
                if (value != null) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    h0.a.put(key, value);
                    callback2.a(value);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
        };
        Bundle bundle = new Bundle();
        Date date = com.facebook.a.f10880n;
        com.facebook.a n10 = z1.d.n();
        if (n10 == null || (str = n10.f10893m) == null) {
            str = "facebook";
        }
        if (Intrinsics.areEqual(str, "instagram")) {
            str2 = "id,name,profile_picture";
        } else {
            str2 = "id,name,first_name,middle_name,last_name";
        }
        bundle.putString("fields", str2);
        bundle.putString("access_token", accessToken);
        com.facebook.g0 g0Var = new com.facebook.g0(null, "me", null, null, new com.facebook.f(null, 2));
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        g0Var.f11006d = bundle;
        g0Var.k(com.facebook.l0.GET);
        g0Var.j(b0Var);
        g0Var.d();
    }

    public static final String p(Context context) {
        int i10 = x5.i.a;
        Intrinsics.checkNotNullParameter("context", "name");
        return com.facebook.x.b();
    }

    public static final Method q(Class clazz, String methodName, Class... parameterTypes) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method r(String className, String methodName, Class... parameterTypes) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            Class<?> clazz = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(clazz, "clazz");
            return q(clazz, methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Object s(String str, String str2, JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Object opt = jsonObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt != null && !(opt instanceof JSONObject) && !(opt instanceof JSONArray)) {
            if (str2 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(str2, opt);
                return jSONObject;
            }
            throw new com.facebook.q("Got an unexpected non-JSON object.");
        }
        return opt;
    }

    public static String t(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            Intrinsics.checkNotNullExpressionValue(hash, "hash");
            hash.update(bArr);
            byte[] digest = hash.digest();
            StringBuilder sb2 = new StringBuilder();
            Intrinsics.checkNotNullExpressionValue(digest, "digest");
            int length = digest.length;
            int i10 = 0;
            while (i10 < length) {
                byte b3 = digest[i10];
                i10++;
                sb2.append(Integer.toHexString((b3 >> 4) & 15));
                sb2.append(Integer.toHexString((b3 >> 0) & 15));
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "builder.toString()");
            return sb3;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Object u(Object obj, Method method, Object... args) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean v() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{com.facebook.x.b()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context a10 = com.facebook.x.a();
            PackageManager packageManager = a10.getPackageManager();
            String packageName = a10.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final boolean w(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String DEVICE = Build.DEVICE;
        if (DEVICE != null) {
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            if (new Regex(".+_cheets|cheets_.+").matches(DEVICE)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean x() {
        if (m6.a.b(m0.class)) {
            return false;
        }
        try {
            JSONObject n10 = n();
            if (n10 == null) {
                return false;
            }
            try {
                JSONArray jSONArray = n10.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        String string = jSONArray.getString(i10);
                        Intrinsics.checkNotNullExpressionValue(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (Intrinsics.areEqual(lowerCase, "ldu")) {
                            return true;
                        }
                        if (i11 >= length) {
                            break;
                        }
                        i10 = i11;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th2) {
            m6.a.a(m0.class, th2);
            return false;
        }
    }

    public static boolean y(Context context) {
        Method r6 = r("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (r6 == null) {
            return false;
        }
        Object u = u(null, r6, context);
        if ((u instanceof Integer) && Intrinsics.areEqual(u, (Object) 0)) {
            return true;
        }
        return false;
    }

    public static final boolean z(String str) {
        if (str != null) {
            return str.length() == 0;
        }
        return true;
    }
}
