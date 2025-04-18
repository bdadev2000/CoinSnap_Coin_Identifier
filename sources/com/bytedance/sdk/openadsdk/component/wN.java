package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class wN implements com.bytedance.sdk.openadsdk.YFl.AlY.Sg {
    private final AtomicBoolean Sg = new AtomicBoolean(false);
    private final PAGAppOpenAdInteractionListener YFl;

    public wN(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.YFl = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.YFl.AlY.Sg
    public void Sg() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.YFl;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.YFl.AlY.Sg
    public void YFl() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.YFl;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.YFl;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.YFl.AlY.Sg
    public void tN() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (!this.Sg.getAndSet(true) && (pAGAppOpenAdInteractionListener = this.YFl) != null) {
            pAGAppOpenAdInteractionListener.onAdDismissed();
        }
    }
}
