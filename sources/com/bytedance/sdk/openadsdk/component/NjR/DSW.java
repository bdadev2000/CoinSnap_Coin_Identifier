package com.bytedance.sdk.openadsdk.component.NjR;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class DSW extends com.bytedance.sdk.openadsdk.core.wN.DSW {
    private final com.bytedance.sdk.openadsdk.core.wN.AlY Sg;
    private final com.bytedance.sdk.openadsdk.core.wN.AlY YFl;

    public DSW(@NonNull Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        GS.tN(context, 12.0f);
        int tN = GS.tN(context, 16.0f);
        int tN2 = GS.tN(context, 20.0f);
        GS.tN(context, 24.0f);
        int tN3 = GS.tN(context, 28.0f);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        this.YFl = alY;
        alY.setId(520093713);
        int tN4 = GS.tN(getContext(), 5.0f);
        alY.setPadding(tN4, tN4, tN4, tN4);
        alY.setScaleType(ImageView.ScaleType.CENTER);
        alY.setBackground(com.bytedance.sdk.openadsdk.core.widget.AlY.YFl());
        alY.setImageResource(qO.AlY(lG.YFl(), "tt_reward_full_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(tN3, tN3);
        layoutParams.topMargin = tN2;
        layoutParams.leftMargin = tN;
        layoutParams.setMarginStart(tN);
        alY.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY2 = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        this.Sg = alY2;
        alY2.setId(520093714);
        alY2.setPadding(tN4, tN4, tN4, tN4);
        alY2.setScaleType(ImageView.ScaleType.CENTER);
        alY2.setBackground(com.bytedance.sdk.openadsdk.core.widget.AlY.YFl());
        alY2.setImageResource(qO.AlY(lG.YFl(), "tt_close_btn"));
        if (alY2.getDrawable() != null) {
            alY2.getDrawable().setAutoMirrored(true);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(tN3, tN3);
        layoutParams2.topMargin = tN2;
        layoutParams2.rightMargin = tN;
        layoutParams2.setMarginEnd(tN);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        alY2.setLayoutParams(layoutParams2);
        addView(alY);
        addView(alY2);
    }

    public View getTopDislike() {
        return this.YFl;
    }

    public com.bytedance.sdk.openadsdk.core.wN.AlY getTopSkip() {
        return this.Sg;
    }
}
