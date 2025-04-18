package com.bytedance.sdk.component.adexpress.vc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes.dex */
public class Ne extends RelativeLayout {
    private TextView AlY;
    private AnimatorSet DSW;
    private AnimatorSet NjR;
    private ImageView Sg;
    private ImageView YFl;
    private int eT;

    /* renamed from: nc, reason: collision with root package name */
    private String f10408nc;
    private AnimatorSet qsH;
    private ImageView tN;

    /* renamed from: vc, reason: collision with root package name */
    private AnimatorSet f10409vc;
    private TextView wN;

    public Ne(Context context) {
        super(context);
        this.f10409vc = new AnimatorSet();
        this.DSW = new AnimatorSet();
        this.qsH = new AnimatorSet();
        this.NjR = new AnimatorSet();
        this.eT = 100;
        YFl(context);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.f10409vc;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Sg();
    }

    public void setGuideText(String str) {
        TextView textView = this.AlY;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.wN != null) {
            if (TextUtils.isEmpty(str)) {
                this.wN.setText("");
            } else {
                this.wN.setText(str);
            }
        }
    }

    public void tN() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.YFl, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.YFl, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.YFl, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), -this.eT));
        ofFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), this.eT));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.vc.Ne.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (Ne.this.tN != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) Ne.this.tN.getLayoutParams();
                    layoutParams.height = num.intValue();
                    Ne.this.tN.setLayoutParams(layoutParams);
                }
            }
        });
        ofInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.tN, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.tN, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.Sg, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.Sg, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.Sg, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.Sg, "scaleY", 0.0f, 1.0f);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.Sg, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), -this.eT));
        ofFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.DSW.setDuration(50L);
        this.NjR.setDuration(1500L);
        this.qsH.setDuration(50L);
        this.DSW.playTogether(ofFloat2, ofFloat7, ofFloat5);
        this.qsH.playTogether(ofFloat, ofFloat6, ofFloat8, ofFloat9, ofFloat4);
        this.NjR.playTogether(ofFloat3, ofInt, ofFloat10);
        this.f10409vc.playSequentially(this.qsH, this.NjR, this.DSW);
    }

    public void Sg() {
        try {
            AnimatorSet animatorSet = this.f10409vc;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.qsH;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.DSW;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.NjR;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.Sg(e2.getMessage());
        }
    }

    public void YFl(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.AlY.YFl();
        }
        if (CampaignEx.CLICKMODE_ON.equals(this.f10408nc)) {
            addView(com.bytedance.sdk.component.adexpress.tN.YFl.vc(context));
            this.eT = (int) (this.eT * 1.25d);
        } else {
            addView(com.bytedance.sdk.component.adexpress.tN.YFl.wN(context));
        }
        this.YFl = (ImageView) findViewById(2097610734);
        this.Sg = (ImageView) findViewById(2097610735);
        this.AlY = (TextView) findViewById(2097610730);
        this.tN = (ImageView) findViewById(2097610733);
        this.wN = (TextView) findViewById(2097610731);
    }

    public Ne(Context context, String str) {
        super(context);
        this.f10409vc = new AnimatorSet();
        this.DSW = new AnimatorSet();
        this.qsH = new AnimatorSet();
        this.NjR = new AnimatorSet();
        this.eT = 100;
        setClipChildren(false);
        this.f10408nc = str;
        YFl(context);
    }

    public void YFl() {
        tN();
        this.f10409vc.start();
        this.f10409vc.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.vc.Ne.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                Ne.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.vc.Ne.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Ne.this.f10409vc.start();
                    }
                }, 200L);
            }
        });
    }
}
