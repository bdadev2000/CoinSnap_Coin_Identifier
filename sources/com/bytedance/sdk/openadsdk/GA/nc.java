package com.bytedance.sdk.openadsdk.GA;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.lG;

/* loaded from: classes.dex */
public abstract class nc extends com.bytedance.sdk.openadsdk.core.wN.tN {
    protected com.bytedance.sdk.openadsdk.core.wN.qsH AlY;
    protected com.bytedance.sdk.openadsdk.core.wN.AlY Sg;
    protected com.bytedance.sdk.openadsdk.core.wN.tN YFl;
    protected lG tN;

    /* renamed from: vc, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.wN.qsH f10518vc;
    protected com.bytedance.sdk.openadsdk.core.wN.qsH wN;

    public nc(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        YFl(context);
    }

    public com.bytedance.sdk.openadsdk.core.wN.qsH AlY(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        qsh.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_backup_btn_1"));
        qsh.setGravity(17);
        qsh.setText(qO.YFl(context, "tt_video_download_apk"));
        qsh.setTextColor(-1);
        qsh.setTextSize(2, 14.0f);
        return qsh;
    }

    public lG DSW(Context context) {
        lG lGVar = new lG(context);
        lGVar.setScaleType(ImageView.ScaleType.FIT_XY);
        lGVar.setBackgroundColor(0);
        return lGVar;
    }

    public com.bytedance.sdk.openadsdk.core.wN.qsH Sg(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        qsh.setEllipsize(TextUtils.TruncateAt.END);
        qsh.setMaxLines(1);
        qsh.setTextColor(Color.parseColor("#FF999999"));
        qsh.setTextSize(2, 16.0f);
        return qsh;
    }

    public abstract void YFl(Context context);

    public FrameLayout getTtAdContainer() {
        return this.YFl;
    }

    public TextView getTtFullAdAppName() {
        return this.AlY;
    }

    public TextView getTtFullAdDesc() {
        return this.wN;
    }

    public TextView getTtFullAdDownload() {
        return this.f10518vc;
    }

    public lG getTtFullAdIcon() {
        return this.tN;
    }

    public ImageView getTtFullImg() {
        return this.Sg;
    }

    public PAGLogoView qsH(Context context) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.setId(520093739);
        return pAGLogoView;
    }

    public com.bytedance.sdk.openadsdk.core.wN.qsH tN(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        qsh.setEllipsize(TextUtils.TruncateAt.END);
        qsh.setMaxLines(1);
        qsh.setSingleLine();
        qsh.setTextColor(Color.parseColor("#FF999999"));
        qsh.setTextSize(2, 12.0f);
        return qsh;
    }

    public com.bytedance.sdk.openadsdk.core.wN.AlY vc(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        alY.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return alY;
    }

    public com.bytedance.sdk.openadsdk.core.wN.tN wN(Context context) {
        return new com.bytedance.sdk.openadsdk.core.wN.tN(context);
    }
}
