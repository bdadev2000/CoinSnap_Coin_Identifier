package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import ma.b;

/* loaded from: classes3.dex */
public final class Snackbar$SnackbarLayout extends b {
    public Snackbar$SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // ma.b, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int childCount = getChildCount();
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getLayoutParams().width == -1) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
            }
        }
    }

    @Override // ma.b, android.view.View
    public /* bridge */ /* synthetic */ void setBackground(@Nullable Drawable drawable) {
        super.setBackground(drawable);
    }

    @Override // ma.b, android.view.View
    public /* bridge */ /* synthetic */ void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // ma.b, android.view.View
    public /* bridge */ /* synthetic */ void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        super.setBackgroundTintList(colorStateList);
    }

    @Override // ma.b, android.view.View
    public /* bridge */ /* synthetic */ void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        super.setBackgroundTintMode(mode);
    }

    @Override // ma.b, android.view.View
    public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // ma.b, android.view.View
    public /* bridge */ /* synthetic */ void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }
}
