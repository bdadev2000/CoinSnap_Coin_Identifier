package com.bytedance.adsdk.ugeno.YFl;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* loaded from: classes.dex */
public class vc implements wN {
    private float AlY;
    private float Sg;
    private View YFl;
    private float tN;

    public vc(View view) {
        this.YFl = view;
    }

    public void Sg(float f10) {
        View view = this.YFl;
        if (view == null) {
            return;
        }
        this.tN = f10;
        view.postInvalidate();
    }

    public void YFl(float f10) {
        View view = this.YFl;
        if (view == null) {
            return;
        }
        this.Sg = f10;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.wN, com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.tN;
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.wN
    public float getShine() {
        return this.AlY;
    }

    public void tN(float f10) {
        View view = this.YFl;
        if (view == null) {
            return;
        }
        this.AlY = f10;
        view.postInvalidate();
    }

    public float YFl() {
        return this.Sg;
    }

    public void YFl(int i10) {
        View view = this.YFl;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i10);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i10);
        }
    }
}
