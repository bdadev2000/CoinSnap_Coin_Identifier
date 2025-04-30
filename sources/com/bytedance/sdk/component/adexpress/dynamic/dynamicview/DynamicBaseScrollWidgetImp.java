package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes.dex */
public class DynamicBaseScrollWidgetImp extends DynamicBaseWidgetImp implements COT {
    private Runnable FP;
    private int cz;
    ObjectAnimator lMd;
    ObjectAnimator zp;

    public DynamicBaseScrollWidgetImp(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        this.cz = 0;
        this.FP = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseScrollWidgetImp.1
            @Override // java.lang.Runnable
            public void run() {
                DynamicBaseScrollWidgetImp.this.zp();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.COT
    public void lMd() {
        removeCallbacks(this.FP);
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
        postDelayed(this.FP, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp() {
        final View childAt = getChildAt(this.cz);
        final View childAt2 = getChildAt((this.cz + 1) % getChildCount());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "translationY", 0.0f, (-(getChildAt(this.cz).getHeight() + this.ku)) / 2);
        this.zp = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.zp.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseScrollWidgetImp.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", (childAt2.getHeight() + this.ku) / 2, 0.0f);
        this.lMd = ofFloat2;
        ofFloat2.setInterpolator(new LinearInterpolator());
        this.lMd.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseScrollWidgetImp.3
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
                childAt2.setVisibility(0);
            }
        });
        this.zp.setDuration(500L);
        this.lMd.setDuration(500L);
        this.zp.start();
        this.lMd.start();
        int i9 = this.cz + 1;
        this.cz = i9;
        this.cz = i9 % getChildCount();
        postDelayed(this.FP, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }
}
