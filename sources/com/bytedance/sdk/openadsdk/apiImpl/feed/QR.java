package com.bytedance.sdk.openadsdk.apiImpl.feed;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.QUv;

/* loaded from: classes.dex */
public class QR implements HWF {
    private final PAGNativeAdInteractionListener zp;

    public QR(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.zp = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.HWF
    public boolean lMd() {
        if (this.zp != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.QR.1
            @Override // java.lang.Runnable
            public void run() {
                if (QR.this.zp != null) {
                    QR.this.zp.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.HWF
    public void zp(PAGNativeAd pAGNativeAd) {
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.QR.2
            @Override // java.lang.Runnable
            public void run() {
                if (QR.this.zp != null) {
                    QR.this.zp.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.HWF
    public void zp() {
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.QR.3
            @Override // java.lang.Runnable
            public void run() {
                if (QR.this.zp != null) {
                    QR.this.zp.onAdDismissed();
                }
            }
        });
    }
}
