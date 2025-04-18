package com.bytedance.sdk.openadsdk.core.wN;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class AlY extends ImageView {
    public AlY(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(NjR.YFl(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    public AlY(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AlY(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
