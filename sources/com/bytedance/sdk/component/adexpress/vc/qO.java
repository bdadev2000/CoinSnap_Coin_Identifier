package com.bytedance.sdk.component.adexpress.vc;

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
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qO extends LinearLayout {
    private com.bytedance.sdk.component.utils.aIu AlY;
    private YFl DSW;
    private int NjR;
    private TextView Sg;
    private TextView YFl;
    private JSONObject YoT;
    private int eT;

    /* renamed from: nc, reason: collision with root package name */
    private int f10424nc;
    private LinearLayout qsH;
    private ImageView tN;

    /* renamed from: vc, reason: collision with root package name */
    private TextView f10425vc;
    private TextView wN;

    /* renamed from: com.bytedance.sdk.component.adexpress.vc.qO$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (qO.this.tN != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new Sg(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.vc.qO.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        qO.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.vc.qO.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                qO.this.tN.startAnimation(rotateAnimation);
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
                qO.this.tN.startAnimation(rotateAnimation);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Sg implements Interpolator {
        private Sg() {
        }

        public /* synthetic */ Sg(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return f10 <= 0.25f ? (f10 * (-2.0f)) + 0.5f : f10 <= 0.5f ? (f10 * 4.0f) - 1.0f : f10 <= 0.75f ? (f10 * (-4.0f)) + 3.0f : (f10 * 2.0f) - 1.5f;
        }
    }

    /* loaded from: classes.dex */
    public interface YFl {
    }

    public qO(Context context, View view, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        this.NjR = i10;
        this.f10424nc = i11;
        this.eT = i12;
        this.YoT = jSONObject;
        YFl(context, view);
    }

    public LinearLayout getShakeLayout() {
        return this.qsH;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.AlY == null) {
                this.AlY = new com.bytedance.sdk.component.utils.aIu(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.vc.qO.2
            };
            this.AlY.onResume();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        com.bytedance.sdk.component.utils.aIu aiu = this.AlY;
        if (aiu != null && z10) {
            aiu.onResume();
        }
    }

    public void setOnShakeViewListener(YFl yFl) {
        this.DSW = yFl;
    }

    public void setShakeText(String str) {
        if (TextUtils.isEmpty(str)) {
            this.wN.setVisibility(8);
            this.f10425vc.setVisibility(8);
        } else {
            this.wN.setText(str);
        }
    }

    public void YFl(Context context, View view) {
        addView(view);
        this.qsH = (LinearLayout) findViewById(2097610727);
        this.tN = (ImageView) findViewById(2097610725);
        this.YFl = (TextView) findViewById(2097610724);
        this.Sg = (TextView) findViewById(2097610726);
        this.wN = (TextView) findViewById(2097610723);
        this.f10425vc = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.qsH.setBackground(gradientDrawable);
    }

    public void YFl() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }
}
