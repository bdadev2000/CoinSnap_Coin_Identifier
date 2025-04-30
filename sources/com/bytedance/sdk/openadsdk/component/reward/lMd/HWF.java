package com.bytedance.sdk.openadsdk.component.reward.lMd;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.vwr;
import com.bytedance.sdk.openadsdk.core.model.woN;

/* loaded from: classes.dex */
public class HWF {
    @NonNull
    public static lMd zp(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar) {
        woN won = zpVar.zp;
        if ((won instanceof vwr) && ((vwr) won).THm()) {
            return new COT(zpVar);
        }
        if (cz.Bj(won)) {
            return new YW(zpVar);
        }
        if (QR.KS(won)) {
            return new QR(zpVar);
        }
        if (ku.zp(won)) {
            return new ku(zpVar);
        }
        if (YW.zp(won)) {
            return new YW(zpVar);
        }
        if (KS.zp(won)) {
            return new KS(zpVar);
        }
        return new jU(zpVar);
    }
}
