package com.bytedance.sdk.openadsdk.AlY.YFl;

import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.utils.Ne;
import com.bytedance.sdk.openadsdk.utils.mn;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class YoT implements com.bytedance.sdk.openadsdk.pDU.tN.Sg {
    public static final YoT YFl = new YoT();

    private YoT() {
    }

    @Override // com.bytedance.sdk.openadsdk.pDU.tN.Sg
    public void YFl(com.bytedance.sdk.openadsdk.pDU.Sg sg2) {
        YFl(sg2, false);
    }

    @Override // com.bytedance.sdk.openadsdk.pDU.tN.Sg
    public void YFl(final com.bytedance.sdk.openadsdk.pDU.Sg sg2, final boolean z10) {
        YFl(new com.bytedance.sdk.component.qsH.qsH("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.AlY.YFl.YoT.1
            @Override // java.lang.Runnable
            public void run() {
                byte b3;
                try {
                    com.bytedance.sdk.openadsdk.pDU.YFl.tN logStats = sg2.getLogStats();
                    if (logStats == null) {
                        return;
                    }
                    com.bytedance.sdk.component.vc.YFl.AlY.YFl.YFl yFl = new com.bytedance.sdk.component.vc.YFl.AlY.YFl.YFl(Ne.YFl(), logStats.YFl());
                    yFl.tN((byte) 0);
                    if (z10) {
                        b3 = 2;
                    } else {
                        b3 = 3;
                    }
                    yFl.Sg(b3);
                    yFl.YFl((byte) 1);
                    if (com.bytedance.sdk.component.vc.YFl.Sg.Sg()) {
                        AlY.YFl(lG.YFl(), com.bytedance.sdk.openadsdk.multipro.Sg.tN());
                    }
                    com.bytedance.sdk.component.vc.YFl.Sg.YFl(yFl);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void YFl(com.bytedance.sdk.component.qsH.qsH qsh) {
        if (qsh == null) {
            return;
        }
        if (!mn.vc()) {
            mn.Sg(qsh, 5);
        } else {
            qsh.run();
        }
    }
}
