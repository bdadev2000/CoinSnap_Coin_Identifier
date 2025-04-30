package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;

/* loaded from: classes.dex */
public class RewardFullBaseLayout extends PAGFrameLayout {
    public RewardFullBaseLayout(Context context) {
        super(context);
    }

    public void zp(com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd) {
        lmd.zp(this);
        RFEndCardBackUpLayout ku = lmd.ku();
        if (ku != null) {
            addView(ku, new FrameLayout.LayoutParams(-1, -1));
        }
        zp(lmd.YW(), this);
        zp(lmd.dT(), this);
    }

    private void zp(View view, ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
