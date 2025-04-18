package com.bytedance.sdk.openadsdk.tN;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class eT extends View {
    private final int YFl;

    public eT(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(getMeasuredWidth(), this.YFl);
    }

    public eT(Context context, int i10) {
        super(context);
        setBackgroundColor(i10);
        this.YFl = GS.tN(getContext(), 0.66f);
    }
}
