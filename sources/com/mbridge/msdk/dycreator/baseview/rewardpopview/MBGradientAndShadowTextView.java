package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes3.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private int f15198a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f15199c;

    /* renamed from: d, reason: collision with root package name */
    private int f15200d;

    /* renamed from: e, reason: collision with root package name */
    private LinearGradient f15201e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    /* loaded from: classes3.dex */
    public static class GradientAndShadowParameters {
        public int gradientEndColor;
        public int gradientStartColor;
        public int shadowColor;
        public int textSize = 40;
        public float shadowRadius = 3.0f;
        public float shadowDx = 1.5f;
        public float shadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f15198a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f15199c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f15200d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.f15200d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f15201e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f15198a, this.b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f15199c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f15201e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, GradientAndShadowParameters gradientAndShadowParameters) {
        super(context);
        this.f15198a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f15199c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f15200d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (gradientAndShadowParameters != null) {
            this.f15198a = gradientAndShadowParameters.gradientStartColor;
            this.b = gradientAndShadowParameters.gradientEndColor;
            this.f15199c = gradientAndShadowParameters.shadowColor;
            this.f15200d = gradientAndShadowParameters.textSize;
            this.mShadowRadius = gradientAndShadowParameters.shadowRadius;
            this.mShadowDx = gradientAndShadowParameters.shadowDx;
            this.mShadowDy = gradientAndShadowParameters.shadowDy;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15198a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f15199c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f15200d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15198a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f15199c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f15200d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        this.f15198a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f15199c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f15200d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
