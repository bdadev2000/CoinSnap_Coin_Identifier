package com.bytedance.sdk.openadsdk.YFl.AlY;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.mn;

/* loaded from: classes.dex */
public class YFl implements PAGAppOpenAdLoadListener {
    private final PAGAppOpenAdLoadListener YFl;

    public YFl(PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        this.YFl = pAGAppOpenAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.wN
    public void onError(final int i10, final String str) {
        if (this.YFl == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.YFl.AlY.YFl.1
            @Override // java.lang.Runnable
            public void run() {
                if (YFl.this.YFl != null) {
                    YFl.this.YFl.onError(i10, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGAppOpenAd pAGAppOpenAd) {
        if (this.YFl == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.YFl.AlY.YFl.2
            @Override // java.lang.Runnable
            public void run() {
                if (YFl.this.YFl != null) {
                    YFl.this.YFl.onAdLoaded(pAGAppOpenAd);
                }
            }
        });
    }
}
