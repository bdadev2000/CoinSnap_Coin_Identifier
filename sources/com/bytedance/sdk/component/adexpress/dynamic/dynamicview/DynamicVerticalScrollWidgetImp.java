package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;

/* loaded from: classes.dex */
public class DynamicVerticalScrollWidgetImp extends DynamicBaseWidgetImp implements COT {
    private boolean FP;
    private int cz;
    ObjectAnimator lMd;
    private Runnable ot;
    ObjectAnimator zp;

    public DynamicVerticalScrollWidgetImp(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        this.cz = 0;
        this.FP = false;
        this.ot = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicVerticalScrollWidgetImp.1
            @Override // java.lang.Runnable
            public void run() {
                DynamicVerticalScrollWidgetImp.this.zp();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.COT
    public void lMd() {
        removeCallbacks(this.ot);
        ObjectAnimator objectAnimator = this.zp;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.zp.cancel();
        }
        ObjectAnimator objectAnimator2 = this.lMd;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.lMd.cancel();
        }
        super.lMd();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.ku - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i9 != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.ot, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp() {
        View childAt;
        final View view;
        final View childAt2 = getChildAt(this.cz);
        int i9 = this.cz;
        if (i9 == 0) {
            this.FP = false;
        }
        boolean z8 = i9 + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.cz + 1)).getChildCount() <= 0;
        if (!this.tG.dT().COT().zp() && z8) {
            this.FP = true;
            view = getChildAt(this.cz - 1);
            this.zp = ObjectAnimator.ofFloat(childAt2, "translationY", 0.0f, (getChildAt(this.cz).getHeight() + this.ku) / 2);
        } else {
            if (z8) {
                childAt = getChildAt((this.cz + 2) % getChildCount());
            } else {
                childAt = getChildAt((this.cz + 1) % getChildCount());
            }
            this.zp = ObjectAnimator.ofFloat(childAt2, "translationY", 0.0f, (-(getChildAt(this.cz).getHeight() + this.ku)) / 2);
            if (z8) {
                this.cz++;
            }
            view = childAt;
        }
        this.zp.setInterpolator(new LinearInterpolator());
        this.zp.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicVerticalScrollWidgetImp.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt2.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        if (this.FP) {
            this.lMd = ObjectAnimator.ofFloat(view, "translationY", (-(view.getHeight() + this.ku)) / 2, 0.0f);
        } else {
            this.lMd = ObjectAnimator.ofFloat(view, "translationY", (view.getHeight() + this.ku) / 2, 0.0f);
        }
        this.lMd.setInterpolator(new LinearInterpolator());
        this.lMd.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicVerticalScrollWidgetImp.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                view.setVisibility(0);
            }
        });
        this.zp.setDuration(500L);
        this.lMd.setDuration(500L);
        this.zp.start();
        this.lMd.start();
        if (this.FP) {
            this.cz--;
        } else {
            int i10 = this.cz + 1;
            this.cz = i10;
            this.cz = i10 % getChildCount();
        }
        postDelayed(this.ot, 3000L);
    }
}
