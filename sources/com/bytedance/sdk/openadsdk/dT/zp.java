package com.bytedance.sdk.openadsdk.dT;

import com.bytedance.sdk.component.ku.ku;
import com.bytedance.sdk.openadsdk.dT.zp.jU;
import com.bytedance.sdk.openadsdk.lMd.zp.HWF;
import com.bytedance.sdk.openadsdk.utils.QUv;

/* loaded from: classes.dex */
public class zp {
    /* JADX INFO: Access modifiers changed from: private */
    public static void KS() {
        com.bytedance.sdk.openadsdk.lMd.zp.zp.lMd();
        jU.jU();
        HWF.zp();
    }

    public static void zp() {
        if (QUv.COT()) {
            QUv.zp(new ku("DailyTaskHelper") { // from class: com.bytedance.sdk.openadsdk.dT.zp.1
                @Override // java.lang.Runnable
                public void run() {
                    zp.KS();
                }
            });
        } else {
            KS();
        }
    }
}
