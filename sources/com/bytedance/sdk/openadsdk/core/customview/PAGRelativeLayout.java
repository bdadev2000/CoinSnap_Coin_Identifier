package com.bytedance.sdk.openadsdk.core.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class PAGRelativeLayout extends RelativeLayout {
    public PAGRelativeLayout(@NonNull Context context) {
        super(context);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
    }

    @Override // android.widget.RelativeLayout
    public void setGravity(int i9) {
        super.setGravity(zp.zp(i9));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(zp.zp(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i9, int i10, int i11, int i12) {
        super.setPaddingRelative(i9, i10, i11, i12);
    }

    public PAGRelativeLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }
}
