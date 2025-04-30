package com.bytedance.sdk.openadsdk.lMd.zp;

import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.utils.FP;
import com.bytedance.sdk.openadsdk.utils.QUv;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class vDp implements com.bytedance.sdk.openadsdk.dT.KS.zp {
    public static final vDp zp = new vDp();

    private vDp() {
    }

    @Override // com.bytedance.sdk.openadsdk.dT.KS.zp
    public void zp(com.bytedance.sdk.openadsdk.dT.lMd lmd) {
        zp(lmd, false);
    }

    @Override // com.bytedance.sdk.openadsdk.dT.KS.zp
    public void zp(final com.bytedance.sdk.openadsdk.dT.lMd lmd, final boolean z8) {
        zp(new com.bytedance.sdk.component.ku.ku("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.lMd.zp.vDp.1
            @Override // java.lang.Runnable
            public void run() {
                byte b;
                try {
                    com.bytedance.sdk.openadsdk.dT.zp.lMd logStats = lmd.getLogStats();
                    if (logStats == null) {
                        return;
                    }
                    com.bytedance.sdk.component.HWF.zp.jU.zp.zp zpVar = new com.bytedance.sdk.component.HWF.zp.jU.zp.zp(FP.zp(), logStats.zp());
                    zpVar.KS((byte) 0);
                    if (z8) {
                        b = 2;
                    } else {
                        b = 3;
                    }
                    zpVar.lMd(b);
                    zpVar.zp((byte) 1);
                    if (com.bytedance.sdk.component.HWF.zp.lMd.lMd()) {
                        jU.zp(KVG.zp(), com.bytedance.sdk.openadsdk.multipro.lMd.KS());
                    }
                    com.bytedance.sdk.component.HWF.zp.lMd.zp(zpVar);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void zp(com.bytedance.sdk.component.ku.ku kuVar) {
        if (kuVar == null) {
            return;
        }
        if (!QUv.HWF()) {
            QUv.lMd(kuVar, 5);
        } else {
            kuVar.run();
        }
    }
}
