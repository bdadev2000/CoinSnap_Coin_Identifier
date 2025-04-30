package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class BannerExpressVideoView extends BannerExpressView {
    public BannerExpressVideoView(@NonNull Context context, woN won, AdSlot adSlot) {
        super(context, won, adSlot);
    }

    public com.bytedance.sdk.openadsdk.multipro.lMd.zp getVideoModel() {
        NativeExpressView nativeExpressView = this.lMd;
        if (nativeExpressView != null) {
            return ((NativeExpressVideoView) nativeExpressView).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView
    public void zp() {
        NativeExpressVideoView nativeExpressVideoView = new NativeExpressVideoView(this.zp, this.jU, this.COT, this.YW);
        this.lMd = nativeExpressVideoView;
        addView(nativeExpressVideoView, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.HWF;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView
    public void zp(woN won, AdSlot adSlot) {
        NativeExpressVideoView nativeExpressVideoView = new NativeExpressVideoView(this.zp, won, adSlot, this.YW);
        this.KS = nativeExpressVideoView;
        nativeExpressVideoView.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressVideoView.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                PAGBannerAdWrapperListener pAGBannerAdWrapperListener = BannerExpressVideoView.this.HWF;
                if (pAGBannerAdWrapperListener != null) {
                    pAGBannerAdWrapperListener.onAdClicked();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i9) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i9) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f9, float f10) {
                BannerExpressVideoView.this.zp(f9, f10);
                BannerExpressVideoView.this.COT();
            }
        });
        WNy.zp((View) this.KS, 8);
        addView(this.KS, new ViewGroup.LayoutParams(-1, -1));
    }
}
