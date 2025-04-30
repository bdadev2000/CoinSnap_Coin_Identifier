package com.bykv.vk.openvk.component.video.zp;

import android.content.Context;
import com.bykv.vk.openvk.component.video.api.zp.lMd;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp {
    private static lMd COT = null;
    public static int KS = 10;
    public static int jU = 10;
    public static int lMd = 10;
    public static int zp = 10;

    public static int COT() {
        return jU;
    }

    public static int KS() {
        return lMd;
    }

    public static int jU() {
        return KS;
    }

    public static int lMd() {
        return zp;
    }

    public static void zp(Context context) {
        com.bykv.vk.openvk.component.video.api.HWF.zp.zp(context);
    }

    public static void zp(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            zp = jSONObject.optInt("splash", 10);
            lMd = jSONObject.optInt("reward", 10);
            KS = jSONObject.optInt("brand", 10);
            int optInt = jSONObject.optInt("other", 10);
            jU = optInt;
            if (zp < 0) {
                zp = 10;
            }
            if (lMd < 0) {
                lMd = 10;
            }
            if (KS < 0) {
                KS = 10;
            }
            if (optInt < 0) {
                jU = 10;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void zp(lMd lmd) {
        COT = lmd;
    }

    public static void zp() {
        lMd lmd = COT;
        if (lmd != null) {
            lmd.jU();
        }
    }
}
