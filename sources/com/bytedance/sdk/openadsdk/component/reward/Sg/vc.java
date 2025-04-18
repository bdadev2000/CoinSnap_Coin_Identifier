package com.bytedance.sdk.openadsdk.component.reward.Sg;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.qO;

/* loaded from: classes.dex */
public class vc {
    @NonNull
    public static Sg YFl(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        Wwa wwa = yFl.Sg;
        if ((wwa instanceof qO) && ((qO) wwa).Wm()) {
            return new wN(yFl);
        }
        if (Ne.Wwa(wwa)) {
            return new NjR(yFl);
        }
        if (DSW.YFl(wwa)) {
            return new DSW(yFl);
        }
        if (qsH.YFl(wwa)) {
            return new qsH(yFl);
        }
        if (NjR.YFl(wwa)) {
            return new NjR(yFl);
        }
        if (tN.YFl(wwa)) {
            return new tN(yFl);
        }
        return new AlY(yFl);
    }
}
