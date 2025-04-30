package com.mbridge.msdk.dycreator.baseview.cusview;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes3.dex */
public class MBridgeTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private ObjectAnimator f15139a;

    public MBridgeTextView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f15139a;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f15139a;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f15139a = objectAnimator;
    }

    public MBridgeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeTextView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }
}
