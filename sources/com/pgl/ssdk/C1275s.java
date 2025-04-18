package com.pgl.ssdk;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.pgl.ssdk.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1275s {
    private static String a;

    /* renamed from: b, reason: collision with root package name */
    private static long[][] f16575b;

    /* renamed from: c, reason: collision with root package name */
    private static String f16576c;

    /* renamed from: com.pgl.ssdk.s$a */
    /* loaded from: classes4.dex */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(C1275s.f16576c)) {
                String unused = C1275s.f16576c = C1275s.b();
                L.b(C1278v.b(), "romtype", C1275s.f16576c);
            }
        }
    }

    public static JSONArray[] b(Context context) {
        if (f16575b == null) {
            f16575b = (long[][]) com.pgl.ssdk.ces.a.meta(157, context, null);
        }
        long[][] jArr = f16575b;
        if (jArr != null && jArr.length == 2) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            long[][] jArr2 = f16575b;
            long[] jArr3 = jArr2[0];
            long[] jArr4 = jArr2[1];
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            for (int i10 = 0; i10 < jArr3.length; i10++) {
                try {
                    jSONArray.put(i10, currentTimeMillis - jArr3[i10]);
                    jSONArray2.put(i10, currentTimeMillis - jArr4[i10]);
                } catch (JSONException unused) {
                }
            }
            return new JSONArray[]{jSONArray, jSONArray2};
        }
        f16575b = null;
        return null;
    }

    private static boolean c(String str) {
        try {
            return new File(str).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String c() {
        if (!TextUtils.isEmpty(f16576c)) {
            return f16576c;
        }
        String a10 = L.a(C1278v.b(), "romtype", null);
        f16576c = a10;
        if (!TextUtils.isEmpty(a10)) {
            return f16576c;
        }
        AbstractC1260c.a(new a());
        return "";
    }

    public static String a(Context context) {
        String str = a;
        if (str != null) {
            return str;
        }
        String string = Settings.Global.getString(context.getContentResolver(), "boot_count");
        a = string;
        return string;
    }

    private static boolean b(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String b() {
        return (b("com.samsung.android.knox.SemPersonaManager") || b("com.samsung.android.knoxguard.KnoxGuardManager")) ? Constants.REFERRER_API_SAMSUNG : (b("androidhnext.Manifest") || b("androidhnext.R")) ? "honor" : (b("androidhwext.Manifest") || b("androidhwext.R")) ? "huawei" : (b("oppo.Manifest") || b("oppo.R") || b("oplus.Manifest") || b("oplus.R") || b("com.oneplus.Manifest") || b("com.oneplus.R")) ? "oppo" : (b("vivo.Manifest") || b("vivo.R")) ? Constants.REFERRER_API_VIVO : (b("miui.Manifest") || b("miui.R") || b("miui.os.Build")) ? Constants.REFERRER_API_XIAOMI : (b("lineageos.platform.Manifest") || b("lineageos.platform.R")) ? "lineage" : c("/system/framework/com.motorola.motosignature.jar") ? "moto" : (c("/system/framework/transsion-framework.jar") || c("/system/framework/transsion-services.jar")) ? "transsion" : "other";
    }
}
