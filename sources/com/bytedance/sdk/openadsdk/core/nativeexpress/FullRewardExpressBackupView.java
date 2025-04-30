package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class FullRewardExpressBackupView extends BackupView {
    private FrameLayout rV;
    private NativeExpressView tG;
    private FrameLayout zp;

    public FullRewardExpressBackupView(@NonNull Context context) {
        super(context);
        this.lMd = context;
    }

    private void KS() {
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(this.lMd);
        this.zp = pAGFrameLayout;
        addView(pAGFrameLayout, new FrameLayout.LayoutParams(-1, -1));
        PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(this.lMd);
        this.rV = pAGFrameLayout2;
        this.zp.addView(pAGFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
        this.rV.removeAllViews();
    }

    private void lMd() {
        this.QR = WNy.lMd(this.lMd, this.tG.getExpectExpressWidth());
        this.ku = WNy.lMd(this.lMd, this.tG.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.QR, this.ku);
        }
        layoutParams.width = this.QR;
        layoutParams.height = this.ku;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.KS.Gzh();
        KS();
    }

    public View getBackupContainerBackgroundView() {
        return this.zp;
    }

    public FrameLayout getVideoContainer() {
        return this.rV;
    }

    public void zp(com.bytedance.sdk.openadsdk.core.model.woN won, NativeExpressView nativeExpressView) {
        if (won == null) {
            return;
        }
        setBackgroundColor(-1);
        this.KS = won;
        this.tG = nativeExpressView;
        if (won.Dp() == 7) {
            this.HWF = "rewarded_video";
        } else {
            this.HWF = "fullscreen_interstitial_ad";
        }
        lMd();
        this.tG.addView(this, new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    public void zp(View view, int i9, com.bytedance.sdk.openadsdk.core.model.tG tGVar) {
        NativeExpressView nativeExpressView = this.tG;
        if (nativeExpressView != null) {
            nativeExpressView.zp(view, i9, tGVar);
        }
    }
}
