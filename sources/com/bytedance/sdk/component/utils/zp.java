package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class zp {

    /* renamed from: com.bytedance.sdk.component.utils.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0092zp {
        static final Random zp = zp.KS();
    }

    public static String KS(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String zp = zp(str.substring(1, 33), 32);
        String substring = str.substring(33, 49);
        return (substring == null || zp == null) ? str : com.bytedance.sdk.component.jU.zp.lMd(str.substring(49), substring, zp);
    }

    public static String lMd(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String zp = zp();
        String zp2 = zp(zp, 32);
        String lMd = lMd();
        return AbstractC2914a.k("3", zp, lMd, (zp2 == null || lMd == null) ? null : com.bytedance.sdk.component.jU.zp.zp(str, lMd, zp2));
    }

    public static JSONObject zp(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return zp(jSONObject.toString());
    }

    public static JSONObject zp(String str) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            try {
                String lMd = lMd(str);
                if (!TextUtils.isEmpty(lMd)) {
                    jSONObject.put("message", lMd);
                    jSONObject.put("cypher", 3);
                } else {
                    jSONObject.put("message", str);
                    jSONObject.put("cypher", 0);
                }
            } catch (Throwable unused) {
                jSONObject.put("message", str);
                jSONObject.put("cypher", 0);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return jSONObject;
    }

    public static Random KS() {
        SecureRandom instanceStrong;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                instanceStrong = SecureRandom.getInstanceStrong();
                return instanceStrong;
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    public static String lMd() {
        String zp = zp(8);
        if (zp == null || zp.length() != 16) {
            return null;
        }
        return zp;
    }

    public static String zp() {
        String zp = zp(16);
        if (zp == null || zp.length() != 32) {
            return null;
        }
        return zp;
    }

    public static String zp(String str, int i9) {
        if (str == null || str.length() != i9) {
            return null;
        }
        int i10 = i9 / 2;
        return str.substring(i10, i9) + str.substring(0, i10);
    }

    public static String zp(int i9) {
        try {
            byte[] bArr = new byte[i9];
            C0092zp.zp.nextBytes(bArr);
            return COT.zp(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
