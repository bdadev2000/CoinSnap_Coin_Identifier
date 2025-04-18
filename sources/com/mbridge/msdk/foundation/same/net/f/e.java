package com.mbridge.msdk.foundation.same.net.f;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Typography;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e {
    public static String a = "h";

    /* renamed from: b, reason: collision with root package name */
    public static String f13416b = "i";

    /* renamed from: c, reason: collision with root package name */
    public static String f13417c = "coppa";

    /* renamed from: d, reason: collision with root package name */
    public static String f13418d = "d";

    /* renamed from: e, reason: collision with root package name */
    public static String f13419e = "e";

    /* renamed from: f, reason: collision with root package name */
    public static String f13420f = "a";

    /* renamed from: g, reason: collision with root package name */
    public static String f13421g = "f";

    /* renamed from: h, reason: collision with root package name */
    public static String f13422h = "g";

    /* renamed from: i, reason: collision with root package name */
    private static final String f13423i = "e";

    /* renamed from: j, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.foundation.same.net.c.a> f13424j = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    private Map<String, String> f13425k = new LinkedHashMap();

    public e() {
    }

    public final void a(String str, String str2) {
        if (str2 == null) {
            ad.b(f13423i, "add() value is null!");
        }
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.f13425k.put(str, str2);
    }

    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : this.f13425k.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append(Typography.amp);
                }
                sb2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb2.append("=");
                sb2.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return sb2.toString();
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f13425k.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry.getKey(), "UTF-8"), URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.c.a> entry2 : this.f13424j.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry2.getKey(), "UTF-8"), URLEncoder.encode("FILE_NAME_" + entry2.getValue().a().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException unused) {
        } catch (JSONException e2) {
            ad.b(f13423i, e2.getMessage());
        }
        return jSONObject;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(28);
        try {
            for (Map.Entry<String, String> entry : this.f13425k.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append(Typography.amp);
                }
                sb2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb2.append('=');
                sb2.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.c.a> entry2 : this.f13424j.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append(Typography.amp);
                }
                sb2.append(URLEncoder.encode(entry2.getKey(), "UTF-8"));
                sb2.append('=');
                sb2.append(URLEncoder.encode("FILE_NAME_" + entry2.getValue().a().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException e2) {
            ad.b(f13423i, e2.getMessage());
        }
        return sb2.toString();
    }

    public e(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
        }
    }

    public final Map<String, String> a() {
        return this.f13425k;
    }

    public final void a(String str) {
        this.f13425k.remove(str);
        this.f13424j.remove(str);
    }
}
