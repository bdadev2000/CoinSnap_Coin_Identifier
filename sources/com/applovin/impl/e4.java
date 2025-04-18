package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import com.applovin.impl.d4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class e4 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f23579a = {7, 4, 2, 1, 11};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f23580b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f23581c = {15, 13};
    private static final int[] d = {20};

    public static String a(String str, com.applovin.impl.sdk.j jVar) {
        return a((String) jVar.a(sj.O0), str, jVar);
    }

    public static String b(String str, com.applovin.impl.sdk.j jVar) {
        return a((String) jVar.a(sj.N0), str, jVar);
    }

    public static Map c(com.applovin.impl.sdk.j jVar) {
        HashMap hashMap = new HashMap();
        String str = (String) jVar.a(sj.f26929k);
        if (StringUtils.isValidString(str)) {
            hashMap.put("device_token", str);
        } else if (!((Boolean) jVar.a(sj.o5)).booleanValue()) {
            hashMap.put("api_key", jVar.b0());
        }
        hashMap.putAll(yp.a(jVar.y().e()));
        return hashMap;
    }

    public static String d(com.applovin.impl.sdk.j jVar) {
        return a((String) jVar.a(sj.M0), "4.0/ad", jVar);
    }

    public static String e(com.applovin.impl.sdk.j jVar) {
        return a((String) jVar.a(sj.L0), "4.0/ad", jVar);
    }

    public static Long f(com.applovin.impl.sdk.j jVar) {
        d4.d a2 = jVar.s().a();
        if (a2 == null) {
            return null;
        }
        double c2 = yp.c(a2.b());
        double d2 = yp.d(a2.a());
        if (d2 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return null;
        }
        return Long.valueOf((long) (c2 / d2));
    }

    public static String g(com.applovin.impl.sdk.j jVar) {
        NetworkInfo b2 = b(com.applovin.impl.sdk.j.l());
        if (b2 == null) {
            return "unknown";
        }
        int type = b2.getType();
        int subtype = b2.getSubtype();
        return type == 1 ? "wifi" : type == 0 ? a(subtype, f23579a) ? "2g" : a(subtype, f23580b) ? "3g" : a(subtype, f23581c) ? "4g" : a(subtype, d) ? "5g" : "mobile" : "unknown";
    }

    public static String a(String str, String str2, com.applovin.impl.sdk.j jVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (jVar != null) {
            return str.concat(str2);
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static String b(com.applovin.impl.sdk.j jVar) {
        return a((String) jVar.a(sj.L0), ((Boolean) jVar.a(sj.z3)).booleanValue() ? "5.0/ad" : "4.0/ad", jVar);
    }

    private static NetworkInfo b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static void b(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            jVar.b(uj.G, string);
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().d("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    public static String a(com.applovin.impl.sdk.j jVar) {
        return a((String) jVar.a(sj.M0), ((Boolean) jVar.a(sj.z3)).booleanValue() ? "5.0/ad" : "4.0/ad", jVar);
    }

    public static void c(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (jVar != null) {
            try {
                if (jSONObject.has("settings")) {
                    tj h02 = jVar.h0();
                    if (jSONObject.isNull("settings")) {
                        return;
                    }
                    h02.a(jSONObject.getJSONObject("settings"));
                    h02.e();
                    return;
                }
                return;
            } catch (JSONException e) {
                jVar.J();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.J().a("ConnectionUtils", "Unable to parse settings out of API response", e);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static void a(int i2, com.applovin.impl.sdk.j jVar) {
        if (i2 == 401) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "SDK key \"" + jVar.b0() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
            return;
        }
        if (i2 == 418) {
            jVar.h0().a(sj.f26914f, Boolean.TRUE);
            jVar.h0().e();
        } else if (i2 >= 400 && i2 < 500) {
            if (((Boolean) jVar.a(sj.f26920h)).booleanValue()) {
                jVar.R0();
            }
        } else if (i2 == -1 && ((Boolean) jVar.a(sj.f26920h)).booleanValue()) {
            jVar.R0();
        }
    }

    private static boolean a(int i2, int[] iArr) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo b2 = b(context);
        if (b2 != null) {
            return b2.isConnected();
        }
        return false;
    }

    public static byte[] a(InputStream inputStream, com.applovin.impl.sdk.j jVar) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) jVar.a(sj.s3)).intValue()];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static void a(JSONObject jSONObject, boolean z2, com.applovin.impl.sdk.j jVar) {
        jVar.p().a(jSONObject, z2);
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.j.l()).edit();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    vj.a(next, object, (SharedPreferences) null, edit);
                }
            }
            edit.apply();
        }
    }
}
