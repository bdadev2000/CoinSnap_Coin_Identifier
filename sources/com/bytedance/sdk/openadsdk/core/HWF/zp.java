package com.bytedance.sdk.openadsdk.core.HWF;

import android.content.Context;
import com.bytedance.sdk.component.QR.KS.ku;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.Bj.KS;
import com.bytedance.sdk.openadsdk.Bj.lMd;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.settings.COT;

/* loaded from: classes.dex */
public class zp {
    public static boolean zp = false;
    private static final int lMd = Integer.parseInt("1371");
    private static long KS = System.currentTimeMillis();

    public static void lMd() {
        if (!zp) {
            return;
        }
        COT jU = KVG.jU();
        if (jU.YW()) {
            long TS = jU.TS();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - KS >= TS) {
                KS = currentTimeMillis;
                Context zp2 = KVG.zp();
                if (zp2 == null) {
                    return;
                }
                ku.zp().zp(lMd, zp2).KS();
            }
        }
    }

    public static void zp() {
        Context zp2;
        if (!KVG.jU().YW() || zp || (zp2 = KVG.zp()) == null) {
            return;
        }
        try {
            KS.zp().lMd().zp(zp2, true, new lMd(zp2));
            KS.zp().lMd().zp(zp2, com.bytedance.sdk.openadsdk.multipro.lMd.KS());
            KS = System.currentTimeMillis();
            zp = true;
        } catch (Exception e4) {
            tG.zp("TncHelper", "initTTAdNet: ", e4.getMessage());
        }
    }
}
