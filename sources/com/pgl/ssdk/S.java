package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class S {
    public static int a = 504;

    /* renamed from: b, reason: collision with root package name */
    public static String f16528b = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f16529c = "";

    /* renamed from: d, reason: collision with root package name */
    private static Context f16530d;

    public static void a(Context context, String str) {
        if (f16530d == null) {
            f16530d = context;
        }
        int i10 = a;
        if (i10 == 102 || i10 == 202 || i10 == 200) {
            return;
        }
        System.currentTimeMillis();
        f16528b = str;
        a = 102;
        AbstractC1260c.a(new T(context, null));
    }

    public static synchronized String b() {
        String str;
        synchronized (S.class) {
            if (TextUtils.isEmpty(f16529c)) {
                f16529c = (String) com.pgl.ssdk.ces.a.meta(303, f16530d, null);
            }
            str = f16529c;
        }
        return str;
    }

    public static void c() {
        Context context = f16530d;
        if (context != null) {
            a = 102;
            AbstractC1260c.a(new T(context, null));
            com.pgl.ssdk.ces.c.g().a();
            C1278v.a();
        }
    }

    public static synchronized Object a(byte[] bArr) {
        synchronized (S.class) {
            if (bArr == null) {
                return null;
            }
            return com.pgl.ssdk.ces.a.meta(302, f16530d, bArr);
        }
    }

    public static String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("os", "Android");
            jSONObject.put("version", "6.3.0.0.overseas-rc.4");
            String str = f16529c;
            if (str != null && str.length() > 0) {
                jSONObject.put("token_id", f16529c);
            } else {
                try {
                    jSONObject.put("token_id", b());
                } catch (Throwable unused) {
                    jSONObject.put("token_id", "");
                }
            }
            jSONObject.put("code", a);
            return Base64.encodeToString(jSONObject.toString().getBytes(), 2);
        } catch (Throwable unused2) {
            return "";
        }
    }
}
