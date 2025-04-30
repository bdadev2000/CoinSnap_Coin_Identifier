package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class PangleViewStub extends View {
    private View lMd;
    private final zp zp;

    /* loaded from: classes.dex */
    public interface zp {
        View zp(Context context);
    }

    public PangleViewStub(Context context, zp zpVar) {
        super(context);
        this.zp = zpVar;
        zp();
    }

    private View lMd() {
        zp zpVar;
        if (this.lMd == null && (zpVar = this.zp) != null) {
            this.lMd = zpVar.zp(getContext());
            zp(this.lMd, (ViewGroup) getParent());
        }
        return this.lMd;
    }

    private void zp() {
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
    public void onMeasure(int i9, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        View view = this.lMd;
        if (view != null) {
            view.setVisibility(i9);
            return;
        }
        super.setVisibility(i9);
        if (i9 == 0 || i9 == 4) {
            lMd();
        }
    }

    private void zp(View view, ViewGroup viewGroup) {
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
