package com.bytedance.sdk.openadsdk.core.zp;

import com.bytedance.sdk.openadsdk.core.model.lMd;
import com.bytedance.sdk.openadsdk.core.woN;
import com.bytedance.sdk.openadsdk.utils.QUv;

/* loaded from: classes.dex */
public class zp implements woN.zp {
    private final woN.zp zp;

    public zp(woN.zp zpVar) {
        this.zp = zpVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.woN.zp
    public void zp(final int i9, final String str) {
        if (this.zp != null) {
            if (QUv.COT()) {
                this.zp.zp(i9, str);
            } else {
                QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zp.zp.1
                    @Override // java.lang.Runnable
                    public void run() {
                        zp.this.zp.zp(i9, str);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.woN.zp
    public void zp(final com.bytedance.sdk.openadsdk.core.model.zp zpVar, final lMd lmd) {
        if (this.zp != null) {
            if (QUv.COT()) {
                this.zp.zp(zpVar, lmd);
            } else {
                QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zp.zp.2
                    @Override // java.lang.Runnable
                    public void run() {
                        zp.this.zp.zp(zpVar, lmd);
                    }
                });
            }
        }
    }
}
