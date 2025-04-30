package com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.lMd.KS;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.apiImpl.feed.ku;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class lMd extends ku {
    protected String Bj;
    protected AdSlot YW;
    protected NativeExpressView dT;
    protected final Context ku;
    private boolean vDp;

    public lMd(@NonNull Context context, woN won, AdSlot adSlot) {
        super(context, won, 5, true);
        this.Bj = "embeded_ad";
        this.vDp = false;
        this.lMd.ku(1);
        this.jU.zp(this);
        this.ku = context;
        this.YW = adSlot;
        zp();
        lMd();
    }

    private void lMd() {
        NativeExpressView nativeExpressView = this.dT;
        if (nativeExpressView != null) {
            nativeExpressView.setBackupListener(new KS() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.lMd.1
                @Override // com.bytedance.sdk.component.adexpress.lMd.KS
                public boolean zp(ViewGroup viewGroup, int i9) {
                    PAGFeedExpressBackupView pAGFeedExpressBackupView = new PAGFeedExpressBackupView(lMd.this.dT.getContext());
                    pAGFeedExpressBackupView.setExtraFuncationHelper(((ku) lMd.this).jU);
                    pAGFeedExpressBackupView.zp(lMd.this.dT);
                    return true;
                }
            });
        }
    }

    public void COT() {
        NativeExpressView nativeExpressView = this.dT;
        if (nativeExpressView != null) {
            nativeExpressView.YW();
        }
    }

    public void KS() {
        NativeExpressView nativeExpressView = this.dT;
        if (nativeExpressView != null) {
            nativeExpressView.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.lMd.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
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
                    if (!lMd.this.dT.tG()) {
                        lMd.this.zp(f9, f10);
                        if (lMd.this.vDp) {
                            lMd.this.dT.ku();
                            return;
                        }
                        return;
                    }
                    lMd lmd = lMd.this;
                    Context context = lmd.ku;
                    woN won = ((ku) lmd).lMd;
                    lMd lmd2 = lMd.this;
                    com.bytedance.sdk.openadsdk.apiImpl.feed.lMd lmd3 = new com.bytedance.sdk.openadsdk.apiImpl.feed.lMd(context, won, 5, lmd2.YW, ((ku) lmd2).jU, ((ku) lMd.this).zp);
                    lMd lmd4 = lMd.this;
                    if (lmd4 instanceof zp) {
                        lmd3.zp(((NativeExpressVideoView) lmd4.jU()).getVideoAdListener());
                    }
                    ((ku) lMd.this).jU.zp((com.bytedance.sdk.openadsdk.core.lMd.zp) lMd.this.dT.getClickCreativeListener());
                    PAGMediaView YW = ((ku) lMd.this).jU.YW();
                    if (YW == null) {
                        YW = new PAGMediaView(lMd.this.ku);
                    }
                    lMd.this.dT.addView(YW);
                }
            });
        }
    }

    public NativeExpressView jU() {
        return this.dT;
    }

    public void zp() {
        this.dT = new NativeExpressView(this.ku, this.lMd, this.YW, this.Bj);
        KS();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(float f9, float f10) {
        int lMd = WNy.lMd(this.ku, f9);
        int lMd2 = WNy.lMd(this.ku, f10);
        ViewGroup.LayoutParams layoutParams = this.dT.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(lMd, lMd2);
        }
        layoutParams.width = lMd;
        layoutParams.height = lMd2;
        this.dT.setLayoutParams(layoutParams);
    }

    public void zp(boolean z8) {
        this.vDp = z8;
    }
}
