package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.woN;

/* loaded from: classes.dex */
public class zp {
    public static void zp(com.bytedance.sdk.openadsdk.core.model.zp zpVar, int i9) {
        if (zpVar == null || zpVar.KS() == null || zpVar.KS().size() <= 0) {
            return;
        }
        if (i9 >= zpVar.KS().size()) {
            i9 = 0;
        }
        zp(zpVar.KS().get(i9), !TextUtils.isEmpty(jU.zp(KVG.zp()).zp(r1)));
    }

    public static void zp(final woN won, final boolean z8) {
        com.bytedance.sdk.openadsdk.core.tG.lMd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.1
            @Override // java.lang.Runnable
            public void run() {
                if (woN.this == null) {
                    return;
                }
                try {
                    Context zp = KVG.zp();
                    AdSlot QUv = woN.this.QUv();
                    if (QUv != null) {
                        COT.zp(zp).zp(QUv.getCodeId());
                        if (z8) {
                            COT.zp(zp).lMd(QUv);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
