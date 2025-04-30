package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.ku;

/* loaded from: classes.dex */
public abstract class TTInteractionStyleBaseFrameLayout extends PAGFrameLayout {
    protected PAGTextView COT;
    protected PAGTextView HWF;
    protected TTRoundRectImageView KS;
    protected PAGTextView jU;
    protected PAGImageView lMd;
    protected PAGFrameLayout zp;

    public TTInteractionStyleBaseFrameLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        zp(context);
    }

    public PAGFrameLayout COT(Context context) {
        return new PAGFrameLayout(context);
    }

    public PAGImageView HWF(Context context) {
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return pAGImageView;
    }

    public PAGTextView KS(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setMaxLines(1);
        pAGTextView.setSingleLine();
        pAGTextView.setTextColor(Color.parseColor("#FF999999"));
        pAGTextView.setTextSize(2, 12.0f);
        return pAGTextView;
    }

    public TTRoundRectImageView QR(Context context) {
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        tTRoundRectImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        tTRoundRectImageView.setBackgroundColor(0);
        return tTRoundRectImageView;
    }

    public FrameLayout getTtAdContainer() {
        return this.zp;
    }

    public TextView getTtFullAdAppName() {
        return this.jU;
    }

    public TextView getTtFullAdDesc() {
        return this.COT;
    }

    public TextView getTtFullAdDownload() {
        return this.HWF;
    }

    public TTRoundRectImageView getTtFullAdIcon() {
        return this.KS;
    }

    public ImageView getTtFullImg() {
        return this.lMd;
    }

    public PAGTextView jU(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setBackground(ku.zp(context, "tt_backup_btn_1"));
        pAGTextView.setGravity(17);
        pAGTextView.setText(cz.lMd(context, "tt_video_download_apk"));
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 14.0f);
        return pAGTextView;
    }

    public PAGLogoView ku(Context context) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.setId(520093739);
        return pAGLogoView;
    }

    public PAGTextView lMd(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setMaxLines(1);
        pAGTextView.setTextColor(Color.parseColor("#FF999999"));
        pAGTextView.setTextSize(2, 16.0f);
        return pAGTextView;
    }

    public abstract void zp(Context context);
}
