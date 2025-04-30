package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.woN;

/* loaded from: classes.dex */
public class KS extends zp {
    public KS(Context context, woN won, AdSlot adSlot) {
        super(context, won, adSlot);
    }

    public com.bytedance.sdk.openadsdk.multipro.lMd.zp KS() {
        BannerExpressView bannerExpressView = this.zp;
        if (bannerExpressView != null) {
            return ((BannerExpressVideoView) bannerExpressView).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.zp
    public void zp(Context context, woN won, AdSlot adSlot) {
        BannerExpressVideoView bannerExpressVideoView = new BannerExpressVideoView(context, won, adSlot);
        this.zp = bannerExpressVideoView;
        bannerExpressVideoView.addOnAttachStateChangeListener(this.HWF);
    }
}
