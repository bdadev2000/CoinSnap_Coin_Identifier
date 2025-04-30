package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.FP;

/* loaded from: classes.dex */
public class ShakeAnimationView extends LinearLayout {
    private int Bj;
    private TextView COT;
    private TextView HWF;
    private ImageView KS;
    private zp QR;
    private int YW;
    private int dT;
    private FP jU;
    private LinearLayout ku;
    private TextView lMd;
    private TextView zp;

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ShakeAnimationView.this.KS != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new lMd(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        ShakeAnimationView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ShakeAnimationView.this.KS.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                ShakeAnimationView.this.KS.startAnimation(rotateAnimation);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class lMd implements Interpolator {
        private lMd() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f9) {
            return f9 <= 0.25f ? (f9 * (-2.0f)) + 0.5f : f9 <= 0.5f ? (f9 * 4.0f) - 1.0f : f9 <= 0.75f ? (f9 * (-4.0f)) + 3.0f : (f9 * 2.0f) - 1.5f;
        }

        public /* synthetic */ lMd(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface zp {
    }

    public ShakeAnimationView(Context context, View view, int i9, int i10, int i11) {
        super(context);
        this.YW = i9;
        this.dT = i10;
        this.Bj = i11;
        zp(context, view);
    }

    public LinearLayout getShakeLayout() {
        return this.ku;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.jU == null) {
                this.jU = new FP(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
    }

    public void setOnShakeViewListener(zp zpVar) {
        this.QR = zpVar;
    }

    public void setShakeText(String str) {
        if (TextUtils.isEmpty(str)) {
            this.COT.setVisibility(8);
            this.HWF.setVisibility(8);
        } else {
            this.COT.setText(str);
        }
    }

    public void zp(Context context, View view) {
        addView(view);
        this.ku = (LinearLayout) findViewById(2097610727);
        this.KS = (ImageView) findViewById(2097610725);
        this.zp = (TextView) findViewById(2097610724);
        this.lMd = (TextView) findViewById(2097610726);
        this.COT = (TextView) findViewById(2097610723);
        this.HWF = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.ku.setBackground(gradientDrawable);
    }

    public void zp() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }
}
