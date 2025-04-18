package com.bytedance.sdk.openadsdk.core.wN;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class Sg extends EditText {
    public Sg(Context context) {
        super(context);
        YFl();
    }

    private void YFl() {
        setTextDirection(5);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        super.setGravity(NjR.YFl(i10));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(NjR.YFl(this, layoutParams));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }
}
