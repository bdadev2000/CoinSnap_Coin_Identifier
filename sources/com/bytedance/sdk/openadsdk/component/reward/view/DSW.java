package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class DSW extends com.bytedance.sdk.openadsdk.core.wN.tN {
    private final com.bytedance.sdk.openadsdk.component.reward.YFl.YFl YFl;

    public DSW(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        super(yFl.BPI);
        this.YFl = yFl;
        if (yFl.UT == null) {
            setFitsSystemWindows(true);
        }
    }

    public void YFl(com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2) {
        RFEndCardBackUpLayout qsH;
        sg2.YFl(this);
        if (this.YFl.YFl != 1 && (qsH = sg2.qsH()) != null) {
            addView(qsH, new FrameLayout.LayoutParams(-1, -1));
        }
        YFl(sg2.NjR(), this);
        YFl(sg2.nc(), this);
    }

    private void YFl(View view, ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
