package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.DSPAdChoice;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;

/* loaded from: classes.dex */
public class PAGAppOpenBaseLayout extends PAGRelativeLayout {
    PAGTextView Bj;
    ButtonFlash COT;
    PAGLinearLayout HWF;
    PAGImageView KS;
    TTRoundRectImageView QR;
    final PAGAppOpenTopBarView YW;
    TTRoundRectImageView dT;
    PAGLogoView jU;
    PAGTextView ku;
    PAGFrameLayout lMd;
    DSPAdChoice tG;
    PAGTextView vDp;
    PAGImageView zp;

    public PAGAppOpenBaseLayout(Context context) {
        super(context);
        this.YW = new PAGAppOpenTopBarView(context);
    }

    public PAGLogoView getAdLogo() {
        return this.jU;
    }

    public TTRoundRectImageView getAppIcon() {
        return this.QR;
    }

    public PAGTextView getAppName() {
        return this.ku;
    }

    public PAGImageView getBackImage() {
        return this.zp;
    }

    public ButtonFlash getClickButton() {
        return this.COT;
    }

    public PAGTextView getContent() {
        return this.vDp;
    }

    public DSPAdChoice getDspAdChoice() {
        return this.tG;
    }

    public TTRoundRectImageView getIconOnlyView() {
        return this.dT;
    }

    public PAGImageView getImageView() {
        return this.KS;
    }

    public PAGTextView getTitle() {
        return this.Bj;
    }

    public TextView getTopDisLike() {
        PAGAppOpenTopBarView pAGAppOpenTopBarView = this.YW;
        if (pAGAppOpenTopBarView != null) {
            return pAGAppOpenTopBarView.getTopDislike();
        }
        return null;
    }

    public TextView getTopSkip() {
        PAGAppOpenTopBarView pAGAppOpenTopBarView = this.YW;
        if (pAGAppOpenTopBarView != null) {
            return pAGAppOpenTopBarView.getTopSkip();
        }
        return null;
    }

    public PAGLinearLayout getUserInfo() {
        return this.HWF;
    }

    public PAGFrameLayout getVideoContainer() {
        return this.lMd;
    }
}
