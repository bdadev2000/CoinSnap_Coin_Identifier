package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class DSW extends com.bytedance.sdk.openadsdk.core.wN.AlY {
    private int Sg;
    private float YFl;

    public DSW(Context context) {
        super(context);
        this.YFl = 2.25f;
        this.Sg = 12;
        YFl();
    }

    public static com.bytedance.sdk.openadsdk.core.wN.AlY Sg(Context context) {
        return new DSW(context, 28, 5.0f);
    }

    private void YFl() {
        setBackground(AlY.YFl());
        setImageResource(com.bytedance.sdk.component.utils.qO.AlY(getContext(), "tt_close_btn"));
        int tN = GS.tN(getContext(), this.YFl);
        setPadding(tN, tN, tN, tN);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wN.AlY, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int tN = GS.tN(getContext(), this.Sg);
            layoutParams.width = tN;
            layoutParams.height = tN;
        }
        super.setLayoutParams(layoutParams);
    }

    public DSW(Context context, int i10, float f10) {
        super(context);
        this.YFl = f10;
        this.Sg = i10;
        YFl();
    }

    public static com.bytedance.sdk.openadsdk.core.wN.AlY YFl(Context context) {
        return new DSW(context);
    }
}
