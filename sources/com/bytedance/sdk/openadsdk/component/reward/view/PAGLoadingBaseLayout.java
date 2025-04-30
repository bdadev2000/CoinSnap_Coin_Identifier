package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Color;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.TwoSemicirclesView;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class PAGLoadingBaseLayout extends PAGRelativeLayout {
    PAGLogoView COT;
    PAGLinearLayout HWF;
    PAGProgressBar KS;
    TwoSemicirclesView QR;
    PAGTextView jU;
    TwoSemicirclesView ku;
    PAGTextView lMd;
    TTRoundRectImageView zp;

    public PAGLoadingBaseLayout(@NonNull Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        setBackgroundColor(Color.parseColor("#161823"));
    }

    @Nullable
    public TwoSemicirclesView getInnerCircle() {
        return this.QR;
    }

    @Nullable
    public PAGTextView getLoadingAppName() {
        return this.lMd;
    }

    @Nullable
    public TTRoundRectImageView getLoadingIcon() {
        return this.zp;
    }

    @Nullable
    public PAGLogoView getLoadingLogo() {
        return this.COT;
    }

    @Nullable
    public PAGProgressBar getLoadingProgressBar() {
        return this.KS;
    }

    @Nullable
    public PAGTextView getLoadingProgressNumber() {
        return this.jU;
    }

    @Nullable
    public TwoSemicirclesView getOuterCircle() {
        return this.ku;
    }

    @Nullable
    public PAGLinearLayout getWaveContainer() {
        return this.HWF;
    }

    public void zp(Context context) {
        this.COT = new PAGLogoView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, WNy.lMd(context, 14.0f));
        layoutParams.setMarginStart(WNy.lMd(context, 20.0f));
        layoutParams.leftMargin = WNy.lMd(context, 20.0f);
        layoutParams.bottomMargin = WNy.lMd(context, 20.0f);
        layoutParams.addRule(12);
        this.COT.setLayoutParams(layoutParams);
    }
}
