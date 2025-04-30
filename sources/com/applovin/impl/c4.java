package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import com.applovin.impl.b4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c4 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f6954a = {7, 4, 2, 1, 11};
    private static final int[] b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f6955c = {15, 13};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f6956d = {20};

    public static String a(String str, com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(oj.f9623L0), str, kVar);
    }

    public static String b(String str, com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(oj.K0), str, kVar);
    }

    public static Map c(com.applovin.impl.sdk.k kVar) {
        HashMap hashMap = new HashMap();
        String str = (String) kVar.a(oj.f9792k);
        if (StringUtils.isValidString(str)) {
            hashMap.put("device_token", str);
        } else if (!((Boolean) kVar.a(oj.f9790j5)).booleanValue()) {
            hashMap.put("api_key", kVar.d0());
        }
        if (kVar.y() != null) {
            hashMap.putAll(zp.a(kVar.y().a()));
        } else {
            hashMap.putAll(zp.a(kVar.x().e()));
        }
        return hashMap;
    }

    public static String d(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(oj.f9611J0), "4.0/ad", kVar);
    }

    public static String e(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(oj.f9605I0), "4.0/ad", kVar);
    }

    public static Long f(com.applovin.impl.sdk.k kVar) {
        b4.d a6 = kVar.r().a();
        if (a6 == null) {
            return null;
        }
        double c9 = zp.c(a6.b());
        double d2 = zp.d(a6.a());
        if (d2 == 0.0d) {
            return null;
        }
        return Long.valueOf((long) (c9 / d2));
    }

    public static String g(com.applovin.impl.sdk.k kVar) {
        NetworkInfo b8 = b(com.applovin.impl.sdk.k.k());
        if (b8 == null) {
            return AppLovinMediationProvider.UNKNOWN;
        }
        int type = b8.getType();
        int subtype = b8.getSubtype();
        if (type == 1) {
            return "wifi";
        }
        if (type != 0) {
            return AppLovinMediationProvider.UNKNOWN;
        }
        if (a(subtype, f6954a)) {
            return "2g";
        }
        if (a(subtype, b)) {
            return "3g";
        }
        if (a(subtype, f6955c)) {
            return "4g";
        }
        if (a(subtype, f6956d)) {
            return "5g";
        }
        return "mobile";
    }

    public static int h(com.applovin.impl.sdk.k kVar) {
        NetworkInfo b8 = b(com.applovin.impl.sdk.k.k());
        if (b8 != null) {
            int type = b8.getType();
            int subtype = b8.getSubtype();
            if (type == 1) {
                return 2;
            }
            if (type == 0) {
                if (a(subtype, f6954a)) {
                    return 4;
                }
                if (a(subtype, b)) {
                    return 5;
                }
                if (a(subtype, f6955c)) {
                    return 6;
                }
                if (a(subtype, f6956d)) {
                    return 7;
                }
                return 3;
            }
        }
        return 0;
    }

    public static String a(String str, String str2, com.applovin.impl.sdk.k kVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (kVar != null) {
            return str.concat(str2);
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static String b(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(oj.f9605I0), ((Boolean) kVar.a(oj.f9833q3)).booleanValue() ? "5.0/ad" : "4.0/ad", kVar);
    }

    private static NetworkInfo b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static void b(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            kVar.b(qj.f10359H, string);
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().d("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(oj.f9611J0), ((Boolean) kVar.a(oj.f9833q3)).booleanValue() ? "5.0/ad" : "4.0/ad", kVar);
    }

    public static void a(int i9, com.applovin.impl.sdk.k kVar) {
        if (i9 == 401) {
            com.applovin.impl.sdk.t.h("AppLovinSdk", "SDK key \"" + kVar.d0() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
            return;
        }
        if (i9 == 418) {
            kVar.h0().a(oj.f9755f, Boolean.TRUE);
            kVar.h0().e();
        } else if (i9 >= 400 && i9 < 500) {
            if (((Boolean) kVar.a(oj.f9770h)).booleanValue()) {
                kVar.U0();
            }
        } else if (i9 == -1 && ((Boolean) kVar.a(oj.f9770h)).booleanValue()) {
            kVar.U0();
        }
    }

    public static void c(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (kVar != null) {
            try {
                if (jSONObject.has("settings")) {
                    pj h02 = kVar.h0();
                    if (jSONObject.isNull("settings")) {
                        return;
                    }
                    h02.a(jSONObject.getJSONObject("settings"));
                    h02.e();
                    return;
                }
                return;
            } catch (JSONException e4) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("ConnectionUtils", "Unable to parse settings out of API response", e4);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    private static boolean a(int i9, int[] iArr) {
        for (int i10 : iArr) {
            if (i10 == i9) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo b8 = b(context);
        if (b8 != null) {
            return b8.isConnected();
        }
        return false;
    }

    public static byte[] a(InputStream inputStream, com.applovin.impl.sdk.k kVar) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) kVar.a(oj.f9788j3)).intValue()];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static void a(JSONObject jSONObject, boolean z8, com.applovin.impl.sdk.k kVar) {
        kVar.o().a(jSONObject, z8);
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.k()).edit();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    sj.a(next, object, (SharedPreferences) null, edit);
                }
            }
            edit.apply();
        }
    }
}
