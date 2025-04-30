package com.bytedance.sdk.openadsdk.core.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class PAGImageView extends ImageView {
    public PAGImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(zp.zp(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i9, int i10, int i11, int i12) {
        super.setPaddingRelative(i9, i10, i11, i12);
    }

    public PAGImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PAGImageView(Context context, @Nullable AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }
}
