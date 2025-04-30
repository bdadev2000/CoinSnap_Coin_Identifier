package com.pgl.ssdk;

import android.content.Context;
import android.provider.Settings;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static String f19597a;
    private static long[][] b;

    public static String a(Context context) {
        String str = f19597a;
        if (str != null) {
            return str;
        }
        String string = Settings.Global.getString(context.getContentResolver(), "boot_count");
        f19597a = string;
        return string;
    }

    public static JSONArray[] b(Context context) {
        if (b == null) {
            b = (long[][]) com.pgl.ssdk.ces.a.meta(157, context, null);
        }
        long[][] jArr = b;
        if (jArr != null && jArr.length == 2) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            long[][] jArr2 = b;
            long[] jArr3 = jArr2[0];
            long[] jArr4 = jArr2[1];
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            for (int i9 = 0; i9 < jArr3.length; i9++) {
                try {
                    jSONArray.put(i9, currentTimeMillis - jArr3[i9]);
                    jSONArray2.put(i9, currentTimeMillis - jArr4[i9]);
                } catch (JSONException unused) {
                }
            }
            return new JSONArray[]{jSONArray, jSONArray2};
        }
        b = null;
        return null;
    }
}
