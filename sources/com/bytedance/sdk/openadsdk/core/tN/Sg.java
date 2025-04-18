package com.bytedance.sdk.openadsdk.core.tN;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.qsH.qO;

/* loaded from: classes.dex */
public class Sg extends tN {
    public Sg(@NonNull Context context, Wwa wwa, AdSlot adSlot) {
        super(context, wwa, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.core.tN.tN
    public void YFl() {
        com.bytedance.sdk.openadsdk.core.qsH.Wwa wwa = new com.bytedance.sdk.openadsdk.core.qsH.Wwa(this.YFl, this.tN, this.AlY, this.f10754vc);
        this.Sg = wwa;
        addView(wwa, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.wN;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    public com.bytedance.sdk.openadsdk.multipro.Sg.YFl getVideoModel() {
        qO qOVar = this.Sg;
        if (qOVar != null) {
            return ((com.bytedance.sdk.openadsdk.core.qsH.Wwa) qOVar).getVideoModel();
        }
        return null;
    }
}
