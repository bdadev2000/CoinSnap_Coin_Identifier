package com.bytedance.sdk.openadsdk.pDU.Sg;

import com.bytedance.sdk.component.qsH.tN;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.pDU.Sg;
import com.bytedance.sdk.openadsdk.pDU.YFl.AlY;

/* loaded from: classes.dex */
public class YFl implements tN {
    @Override // com.bytedance.sdk.component.qsH.tN
    public void YFl(final com.bytedance.sdk.component.qsH.Sg.YFl yFl) {
        com.bytedance.sdk.openadsdk.pDU.tN.YFl();
        com.bytedance.sdk.openadsdk.pDU.tN.YFl("stats_sdk_thread_num", false, new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.Sg.YFl.1
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                com.bytedance.sdk.component.qsH.Sg.YFl yFl2;
                if (!lG.AlY().Ld() || (yFl2 = yFl) == null || yFl2.YFl() == null) {
                    return null;
                }
                return AlY.Sg().YFl("stats_sdk_thread_num").Sg(yFl.YFl().toString());
            }
        });
    }
}
