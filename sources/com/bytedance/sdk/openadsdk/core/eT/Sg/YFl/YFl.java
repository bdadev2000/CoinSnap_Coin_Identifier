package com.bytedance.sdk.openadsdk.core.eT.Sg.YFl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class YFl extends com.bytedance.adsdk.ugeno.NjR.Sg.YFl {
    private final com.bytedance.adsdk.ugeno.NjR.Sg.YFl Sg;
    private final com.bytedance.adsdk.ugeno.NjR.Sg.YFl YFl;

    public YFl(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.NjR.Sg.YFl yFl = new com.bytedance.adsdk.ugeno.NjR.Sg.YFl(context);
        this.YFl = yFl;
        addView(yFl, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.NjR.Sg.YFl yFl2 = new com.bytedance.adsdk.ugeno.NjR.Sg.YFl(context);
        this.Sg = yFl2;
        yFl2.setBackgroundColor(0);
        addView(yFl2, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.NjR.Sg.YFl getVideoView() {
        return this.YFl;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.Sg.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.Sg.setOnTouchListener(onTouchListener);
    }
}
