package com.bytedance.sdk.openadsdk.pDU;

import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.openadsdk.AlY.YFl.vc;
import com.bytedance.sdk.openadsdk.core.Ne;
import com.bytedance.sdk.openadsdk.pDU.YFl.wN;
import com.bytedance.sdk.openadsdk.utils.mn;

/* loaded from: classes.dex */
public class YFl {
    public static void YFl() {
        if (mn.wN()) {
            mn.YFl(new qsH("DailyTaskHelper") { // from class: com.bytedance.sdk.openadsdk.pDU.YFl.1
                @Override // java.lang.Runnable
                public void run() {
                    YFl.tN();
                }
            });
        } else {
            tN();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tN() {
        com.bytedance.sdk.openadsdk.AlY.YFl.YFl.Sg();
        wN.AlY();
        vc.YFl();
        Ne.YFl();
    }
}
