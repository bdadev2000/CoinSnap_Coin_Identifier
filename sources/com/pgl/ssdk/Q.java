package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Q {

    /* renamed from: a, reason: collision with root package name */
    public static int f19550a = 504;
    public static String b = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f19551c = "";

    /* renamed from: d, reason: collision with root package name */
    private static Context f19552d;

    public static void a(Context context, String str) {
        if (f19552d == null) {
            f19552d = context;
        }
        int i9 = f19550a;
        if (i9 == 102 || i9 == 202 || i9 == 200) {
            return;
        }
        System.currentTimeMillis();
        b = str;
        f19550a = 102;
        AbstractC2049c.a(new S(context, null));
    }

    public static synchronized String b() {
        String str;
        synchronized (Q.class) {
            try {
                if (TextUtils.isEmpty(f19551c)) {
                    f19551c = (String) com.pgl.ssdk.ces.a.meta(303, f19552d, null);
                }
                str = f19551c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static void c() {
        Context context = f19552d;
        if (context != null) {
            f19550a = 102;
            AbstractC2049c.a(new S(context, null));
            com.pgl.ssdk.ces.c.f().a();
            v.a();
        }
    }

    public static synchronized Object a(byte[] bArr) {
        synchronized (Q.class) {
            if (bArr == null) {
                return null;
            }
            return com.pgl.ssdk.ces.a.meta(302, f19552d, bArr);
        }
    }

    public static String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("os", "Android");
            jSONObject.put("version", "6.0.0.0.overseas-rc.5");
            String str = f19551c;
            if (str != null && str.length() > 0) {
                jSONObject.put("token_id", f19551c);
            } else {
                try {
                    jSONObject.put("token_id", b());
                } catch (Throwable unused) {
                    jSONObject.put("token_id", "");
                }
            }
            jSONObject.put("code", f19550a);
            return Base64.encodeToString(jSONObject.toString().getBytes(), 2);
        } catch (Throwable unused2) {
            return "";
        }
    }
}
