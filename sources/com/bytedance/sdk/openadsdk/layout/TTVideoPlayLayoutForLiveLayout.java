package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.ku;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class TTVideoPlayLayoutForLiveLayout extends PAGRelativeLayout {
    public TTVideoPlayLayoutForLiveLayout(Context context) {
        this(context, null);
    }

    private void zp(Context context) {
        setBackgroundColor(Color.parseColor("#000000"));
        setId(520093726);
        int lMd = WNy.lMd(context, 60.0f);
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setId(vDp.fw);
        pAGFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        pAGFrameLayout.setBackgroundColor(0);
        addView(pAGFrameLayout);
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(vDp.pdH);
        pAGImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        pAGImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        pAGFrameLayout.addView(pAGImageView);
        PAGProgressBar pAGProgressBar = new PAGProgressBar(context);
        pAGProgressBar.setId(vDp.hl);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(lMd, lMd);
        layoutParams.gravity = 17;
        pAGProgressBar.setLayoutParams(layoutParams);
        pAGProgressBar.setIndeterminateDrawable(ku.zp(context, "tt_video_loading_progress_bar"));
        pAGFrameLayout.addView(pAGProgressBar);
        PAGImageView pAGImageView2 = new PAGImageView(context);
        pAGImageView2.setId(vDp.jyq);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        pAGImageView2.setLayoutParams(layoutParams2);
        pAGImageView2.setScaleType(ImageView.ScaleType.CENTER);
        pAGImageView2.setImageDrawable(ku.zp(context, "tt_play_movebar_textpage"));
        pAGImageView2.setVisibility(8);
        addView(pAGImageView2);
        View tTVideoAdCoverLayout = new TTVideoAdCoverLayout(context);
        tTVideoAdCoverLayout.setId(vDp.sm);
        tTVideoAdCoverLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(tTVideoAdCoverLayout);
    }

    public TTVideoPlayLayoutForLiveLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTVideoPlayLayoutForLiveLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        zp(context);
    }
}
