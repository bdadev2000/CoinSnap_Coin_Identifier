package com.mbridge.msdk.dycreator.baseview.cusview;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class MBridgeFramLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private AnimatorSet f15112a;

    public MBridgeFramLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f15112a;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f15112a;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f15112a = animatorSet;
    }

    public MBridgeFramLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeFramLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }
}
