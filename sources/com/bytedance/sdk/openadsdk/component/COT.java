package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class COT implements com.bytedance.sdk.openadsdk.apiImpl.KS.lMd {
    private final AtomicBoolean lMd = new AtomicBoolean(false);
    private final PAGAppOpenAdInteractionListener zp;

    public COT(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.zp = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.KS.lMd
    public void KS() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (!this.lMd.getAndSet(true) && (pAGAppOpenAdInteractionListener = this.zp) != null) {
            pAGAppOpenAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.KS.lMd
    public void lMd() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.zp;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.zp;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.KS.lMd
    public void zp() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.zp;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdShowed();
        }
    }
}
