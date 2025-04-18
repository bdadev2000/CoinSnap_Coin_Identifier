package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes.dex */
public class AlY extends vc {
    ObjectAnimator Sg;
    ObjectAnimator YFl;
    private int aIu;
    private Runnable wXo;

    public AlY(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        this.aIu = 0;
        this.wXo = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AlY.1
            @Override // java.lang.Runnable
            public void run() {
                AlY.this.YFl();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.GS
    public void Sg() {
        removeCallbacks(this.wXo);
        ObjectAnimator objectAnimator = this.YFl;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.YFl.cancel();
        }
        ObjectAnimator objectAnimator2 = this.Sg;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.Sg.cancel();
        }
        super.Sg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.qsH - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i10 != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.wXo, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl() {
        final View childAt = getChildAt(this.aIu);
        final View childAt2 = getChildAt((this.aIu + 1) % getChildCount());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "translationY", 0.0f, (-(getChildAt(this.aIu).getHeight() + this.qsH)) / 2);
        this.YFl = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.YFl.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AlY.2
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
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", (childAt2.getHeight() + this.qsH) / 2, 0.0f);
        this.Sg = ofFloat2;
        ofFloat2.setInterpolator(new LinearInterpolator());
        this.Sg.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AlY.3
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
        this.YFl.setDuration(500L);
        this.Sg.setDuration(500L);
        this.YFl.start();
        this.Sg.start();
        int i10 = this.aIu + 1;
        this.aIu = i10;
        this.aIu = i10 % getChildCount();
        postDelayed(this.wXo, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }
}
