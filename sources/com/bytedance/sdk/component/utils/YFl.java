package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import eb.j;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl {

    /* renamed from: com.bytedance.sdk.component.utils.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0092YFl {
        static final Random YFl = YFl.tN();
    }

    public static String Sg(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String YFl = YFl();
        String YFl2 = YFl(YFl, 32);
        String Sg = Sg();
        return j.l("3", YFl, Sg, (YFl2 == null || Sg == null) ? null : com.bytedance.sdk.component.AlY.YFl.YFl(str, Sg, YFl2));
    }

    public static JSONObject YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return YFl(jSONObject.toString());
    }

    public static String tN(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String YFl = YFl(str.substring(1, 33), 32);
        String substring = str.substring(33, 49);
        return (substring == null || YFl == null) ? str : com.bytedance.sdk.component.AlY.YFl.Sg(str.substring(49), substring, YFl);
    }

    public static JSONObject YFl(String str) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            try {
                String Sg = Sg(str);
                if (!TextUtils.isEmpty(Sg)) {
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, Sg);
                    jSONObject.put("cypher", 3);
                } else {
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                    jSONObject.put("cypher", 0);
                }
            } catch (Throwable unused) {
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                jSONObject.put("cypher", 0);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
        return jSONObject;
    }

    public static Random tN() {
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

    public static String Sg() {
        String YFl = YFl(8);
        if (YFl == null || YFl.length() != 16) {
            return null;
        }
        return YFl;
    }

    public static String YFl() {
        String YFl = YFl(16);
        if (YFl == null || YFl.length() != 32) {
            return null;
        }
        return YFl;
    }

    public static String YFl(String str, int i10) {
        if (str == null || str.length() != i10) {
            return null;
        }
        int i11 = i10 / 2;
        return str.substring(i11, i10) + str.substring(0, i11);
    }

    public static String YFl(int i10) {
        try {
            byte[] bArr = new byte[i10];
            C0092YFl.YFl.nextBytes(bArr);
            return wN.YFl(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
