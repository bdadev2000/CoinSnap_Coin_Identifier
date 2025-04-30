package com.mbridge.msdk.foundation.same.net.f;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static String f15851a = "h";
    public static String b = "i";

    /* renamed from: c, reason: collision with root package name */
    public static String f15852c = "coppa";

    /* renamed from: d, reason: collision with root package name */
    public static String f15853d = "d";

    /* renamed from: e, reason: collision with root package name */
    public static String f15854e = "e";

    /* renamed from: f, reason: collision with root package name */
    public static String f15855f = "a";

    /* renamed from: g, reason: collision with root package name */
    public static String f15856g = "f";

    /* renamed from: h, reason: collision with root package name */
    public static String f15857h = "g";

    /* renamed from: i, reason: collision with root package name */
    private static final String f15858i = "e";

    /* renamed from: j, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.foundation.same.net.c.a> f15859j = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    private Map<String, String> f15860k = new LinkedHashMap();

    public e() {
    }

    public final void a(String str, String str2) {
        if (str2 == null) {
            ad.b(f15858i, "add() value is null!");
        }
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.f15860k.put(str, str2);
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : this.f15860k.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return sb.toString();
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f15860k.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry.getKey(), "UTF-8"), URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.c.a> entry2 : this.f15859j.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry2.getKey(), "UTF-8"), URLEncoder.encode("FILE_NAME_" + entry2.getValue().a().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException unused) {
        } catch (JSONException e4) {
            ad.b(f15858i, e4.getMessage());
        }
        return jSONObject;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(28);
        try {
            for (Map.Entry<String, String> entry : this.f15860k.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.c.a> entry2 : this.f15859j.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry2.getKey(), "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode("FILE_NAME_" + entry2.getValue().a().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException e4) {
            ad.b(f15858i, e4.getMessage());
        }
        return sb.toString();
    }

    public e(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
        }
    }

    public final Map<String, String> a() {
        return this.f15860k;
    }

    public final void a(String str) {
        this.f15860k.remove(str);
        this.f15859j.remove(str);
    }
}
