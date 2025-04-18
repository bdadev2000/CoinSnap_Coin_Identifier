package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class GA extends View {
    private View Sg;
    private final YFl YFl;

    /* loaded from: classes.dex */
    public interface YFl {
        View YFl(Context context);
    }

    public GA(Context context, YFl yFl) {
        super(context);
        this.YFl = yFl;
        YFl();
    }

    private View Sg() {
        YFl yFl;
        if (this.Sg == null && (yFl = this.YFl) != null) {
            this.Sg = yFl.YFl(getContext());
            YFl(this.Sg, (ViewGroup) getParent());
        }
        return this.Sg;
    }

    private void YFl() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        View view = this.Sg;
        if (view != null) {
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            Sg();
        }
    }

    private void YFl(View view, ViewGroup viewGroup) {
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }
}
