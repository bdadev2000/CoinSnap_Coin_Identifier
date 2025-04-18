package com.bytedance.sdk.openadsdk.core.nc;

import android.content.Context;
import com.bytedance.sdk.component.DSW.tN.qsH;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.settings.vc;
import com.bytedance.sdk.openadsdk.lG.Sg;
import com.bytedance.sdk.openadsdk.lG.tN;

/* loaded from: classes.dex */
public class YFl {
    public static boolean YFl = false;
    private static final int Sg = Integer.parseInt("1371");
    private static long tN = System.currentTimeMillis();

    public static void Sg() {
        if (!YFl) {
            return;
        }
        vc AlY = lG.AlY();
        if (AlY.NjR()) {
            long YP = AlY.YP();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - tN >= YP) {
                tN = currentTimeMillis;
                Context YFl2 = lG.YFl();
                if (YFl2 == null) {
                    return;
                }
                qsH.YFl().YFl(Sg, YFl2).tN();
            }
        }
    }

    public static void YFl() {
        Context YFl2;
        if (!lG.AlY().NjR() || YFl || (YFl2 = lG.YFl()) == null) {
            return;
        }
        try {
            tN.YFl().Sg().YFl(YFl2, true, new Sg(YFl2));
            tN.YFl().Sg().YFl(YFl2, com.bytedance.sdk.openadsdk.multipro.Sg.tN());
            tN = System.currentTimeMillis();
            YFl = true;
        } catch (Exception e2) {
            YoT.YFl("TncHelper", "initTTAdNet: ", e2.getMessage());
        }
    }
}
