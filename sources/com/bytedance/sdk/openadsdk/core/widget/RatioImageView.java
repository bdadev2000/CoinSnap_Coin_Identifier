package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;

/* loaded from: classes.dex */
public class RatioImageView extends PAGImageView {
    private float zp;

    public RatioImageView(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.customview.PAGImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = getLayoutParams().width;
        int i12 = getLayoutParams().height;
        float f9 = this.zp;
        if (f9 > 0.0f) {
            if (i11 == -2) {
                size = (int) (size2 * f9);
                mode = 1073741824;
            } else if (i12 == -2) {
                size2 = (int) (size / f9);
                mode2 = 1073741824;
            }
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    public void setRatio(float f9) {
        this.zp = f9;
    }

    public RatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
