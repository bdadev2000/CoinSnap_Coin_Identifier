package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class MBGradientAndShadowTextView extends TextView {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f12851b;

    /* renamed from: c, reason: collision with root package name */
    private int f12852c;

    /* renamed from: d, reason: collision with root package name */
    private int f12853d;

    /* renamed from: e, reason: collision with root package name */
    private LinearGradient f12854e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    /* loaded from: classes4.dex */
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
        this.a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f12851b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f12852c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f12853d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.f12853d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f12854e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.a, this.f12851b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f12852c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f12854e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, GradientAndShadowParameters gradientAndShadowParameters) {
        super(context);
        this.a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f12851b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f12852c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f12853d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (gradientAndShadowParameters != null) {
            this.a = gradientAndShadowParameters.gradientStartColor;
            this.f12851b = gradientAndShadowParameters.gradientEndColor;
            this.f12852c = gradientAndShadowParameters.shadowColor;
            this.f12853d = gradientAndShadowParameters.textSize;
            this.mShadowRadius = gradientAndShadowParameters.shadowRadius;
            this.mShadowDx = gradientAndShadowParameters.shadowDx;
            this.mShadowDy = gradientAndShadowParameters.shadowDy;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f12851b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f12852c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f12853d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f12851b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f12852c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f12853d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f12851b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f12852c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f12853d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
