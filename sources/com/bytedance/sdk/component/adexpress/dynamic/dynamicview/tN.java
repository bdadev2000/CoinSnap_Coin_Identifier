package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes.dex */
public class tN extends vc {
    private Runnable Ne;
    ObjectAnimator Sg;
    ObjectAnimator YFl;
    private int aIu;
    private boolean wXo;

    public tN(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        this.aIu = 0;
        this.wXo = false;
        this.Ne = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tN.1
            @Override // java.lang.Runnable
            public void run() {
                tN.this.YFl();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.GS
    public void Sg() {
        removeCallbacks(this.Ne);
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
        postDelayed(this.Ne, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl() {
        final View childAt;
        final View childAt2 = getChildAt(this.aIu);
        int i10 = this.aIu;
        if (i10 == 0) {
            this.wXo = false;
        }
        if (i10 + 1 < getChildCount() && ((ViewGroup) getChildAt(this.aIu + 1)).getChildCount() > 0) {
            childAt = getChildAt(this.aIu + 1);
            this.YFl = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (-(getChildAt(this.aIu).getWidth() + this.DSW)) / 2);
        } else {
            this.wXo = true;
            childAt = getChildAt(this.aIu - 1);
            this.YFl = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (getChildAt(this.aIu).getWidth() + this.DSW) / 2);
        }
        this.YFl.setInterpolator(new LinearInterpolator());
        this.YFl.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tN.2
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
        if (this.wXo) {
            this.Sg = ObjectAnimator.ofFloat(childAt, "translationX", (-(childAt.getWidth() + this.DSW)) / 2, 0.0f);
        } else {
            this.Sg = ObjectAnimator.ofFloat(childAt, "translationX", (childAt.getWidth() + this.DSW) / 2, 0.0f);
        }
        this.Sg.setInterpolator(new LinearInterpolator());
        this.Sg.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tN.3
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
                childAt.setVisibility(0);
            }
        });
        this.YFl.setDuration(500L);
        this.Sg.setDuration(500L);
        this.YFl.start();
        this.Sg.start();
        if (this.wXo) {
            this.aIu--;
        } else {
            this.aIu++;
        }
        postDelayed(this.Ne, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }
}
