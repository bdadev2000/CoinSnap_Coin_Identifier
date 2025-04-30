package com.bytedance.sdk.openadsdk.core.customview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class PAGEditText extends EditText {
    public PAGEditText(Context context) {
        super(context);
        zp();
    }

    private void zp() {
        setTextDirection(5);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i9, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public void setGravity(int i9) {
        super.setGravity(zp.zp(i9));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(zp.zp(this, layoutParams));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i9, int i10, int i11, int i12) {
        super.setPaddingRelative(i9, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }
}
