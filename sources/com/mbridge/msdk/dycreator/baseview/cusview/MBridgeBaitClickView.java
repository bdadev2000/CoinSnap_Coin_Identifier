package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;

/* loaded from: classes3.dex */
public class MBridgeBaitClickView extends RelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* renamed from: a, reason: collision with root package name */
    private MBridgeDyImageView f15094a;
    private MBridgeDyImageView b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f15095c;

    /* renamed from: d, reason: collision with root package name */
    private String f15096d;

    /* renamed from: e, reason: collision with root package name */
    private String f15097e;

    /* renamed from: f, reason: collision with root package name */
    private String f15098f;

    /* renamed from: g, reason: collision with root package name */
    private int f15099g;

    /* renamed from: h, reason: collision with root package name */
    private int f15100h;

    /* renamed from: i, reason: collision with root package name */
    private Animation f15101i;

    /* renamed from: j, reason: collision with root package name */
    private Animation f15102j;

    /* renamed from: k, reason: collision with root package name */
    private Animation f15103k;
    private Animation l;

    public MBridgeBaitClickView(Context context) {
        super(context);
        this.f15096d = "";
        this.f15097e = "";
        this.f15098f = "Click now for details";
        this.f15099g = 1;
        this.f15100h = 1342177280;
    }

    public void init(int i9) {
        this.f15099g = i9;
        init();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f15101i;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f15102j;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f15103k;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.l;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    public void startAnimation() {
        int i9 = this.f15099g;
        if (i9 != 2) {
            if (i9 != 3) {
                if (i9 != 4) {
                    if (i9 != 5) {
                        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
                        this.f15101i = scaleAnimation;
                        scaleAnimation.setDuration(200L);
                        this.f15101i.setRepeatCount(-1);
                        this.f15101i.setRepeatMode(2);
                        MBridgeDyImageView mBridgeDyImageView = this.f15094a;
                        if (mBridgeDyImageView != null) {
                            mBridgeDyImageView.startAnimation(this.f15101i);
                        }
                        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
                        this.f15102j = scaleAnimation2;
                        scaleAnimation2.setDuration(400L);
                        this.f15102j.setRepeatCount(-1);
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
                        this.f15103k = alphaAnimation;
                        alphaAnimation.setDuration(400L);
                        this.f15103k.setRepeatCount(-1);
                        AnimationSet animationSet = new AnimationSet(true);
                        animationSet.addAnimation(this.f15102j);
                        animationSet.addAnimation(this.f15103k);
                        MBridgeDyImageView mBridgeDyImageView2 = this.b;
                        if (mBridgeDyImageView2 != null) {
                            mBridgeDyImageView2.startAnimation(animationSet);
                            return;
                        }
                        return;
                    }
                    RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
                    this.l = rotateAnimation;
                    rotateAnimation.setDuration(300L);
                    this.l.setRepeatMode(2);
                    this.l.setRepeatCount(-1);
                    ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
                    this.f15102j = scaleAnimation3;
                    scaleAnimation3.setDuration(600L);
                    this.f15102j.setRepeatCount(-1);
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                    this.f15103k = alphaAnimation2;
                    alphaAnimation2.setDuration(600L);
                    this.f15103k.setRepeatCount(-1);
                    AnimationSet animationSet2 = new AnimationSet(true);
                    animationSet2.addAnimation(this.f15102j);
                    animationSet2.addAnimation(this.f15103k);
                    MBridgeDyImageView mBridgeDyImageView3 = this.f15094a;
                    if (mBridgeDyImageView3 != null) {
                        mBridgeDyImageView3.startAnimation(this.l);
                    }
                    MBridgeDyImageView mBridgeDyImageView4 = this.b;
                    if (mBridgeDyImageView4 != null) {
                        mBridgeDyImageView4.startAnimation(animationSet2);
                        return;
                    }
                    return;
                }
                this.b.setVisibility(4);
                ScaleAnimation scaleAnimation4 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
                this.f15101i = scaleAnimation4;
                scaleAnimation4.setDuration(200L);
                this.f15101i.setRepeatCount(1);
                this.f15101i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (MBridgeBaitClickView.this.f15094a != null) {
                                    MBridgeBaitClickView.this.f15094a.startAnimation(MBridgeBaitClickView.this.f15101i);
                                }
                            }
                        }, 1000L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBridgeDyImageView mBridgeDyImageView5 = this.f15094a;
                if (mBridgeDyImageView5 != null) {
                    mBridgeDyImageView5.startAnimation(this.f15101i);
                    return;
                }
                return;
            }
            MBridgeDyImageView mBridgeDyImageView6 = this.b;
            if (mBridgeDyImageView6 != null) {
                mBridgeDyImageView6.setVisibility(4);
            }
            ScaleAnimation scaleAnimation5 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            this.f15101i = scaleAnimation5;
            scaleAnimation5.setDuration(500L);
            this.f15101i.setRepeatCount(1);
            this.f15101i.setRepeatMode(2);
            ScaleAnimation scaleAnimation6 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
            this.f15102j = scaleAnimation6;
            scaleAnimation6.setDuration(1000L);
            this.f15102j.setRepeatCount(0);
            AlphaAnimation alphaAnimation3 = new AlphaAnimation(1.0f, 0.0f);
            this.f15103k = alphaAnimation3;
            alphaAnimation3.setDuration(1000L);
            this.f15103k.setRepeatCount(0);
            final AnimationSet animationSet3 = new AnimationSet(true);
            animationSet3.addAnimation(this.f15102j);
            animationSet3.addAnimation(this.f15103k);
            this.f15102j.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.3
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    if (MBridgeBaitClickView.this.b != null) {
                        MBridgeBaitClickView.this.b.setVisibility(4);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    if (MBridgeBaitClickView.this.b != null) {
                        MBridgeBaitClickView.this.b.setVisibility(0);
                    }
                }
            });
            this.f15101i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (MBridgeBaitClickView.this.f15094a != null) {
                                MBridgeBaitClickView.this.f15094a.startAnimation(MBridgeBaitClickView.this.f15101i);
                            }
                        }
                    }, 1000L);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (MBridgeBaitClickView.this.b != null) {
                                MBridgeBaitClickView.this.b.startAnimation(animationSet3);
                            }
                        }
                    }, 550L);
                }
            });
            MBridgeDyImageView mBridgeDyImageView7 = this.f15094a;
            if (mBridgeDyImageView7 != null) {
                mBridgeDyImageView7.startAnimation(this.f15101i);
                return;
            }
            return;
        }
        this.b.setVisibility(4);
        ScaleAnimation scaleAnimation7 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f15101i = scaleAnimation7;
        scaleAnimation7.setDuration(500L);
        this.f15101i.setRepeatCount(-1);
        this.f15101i.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView8 = this.f15094a;
        if (mBridgeDyImageView8 != null) {
            mBridgeDyImageView8.startAnimation(this.f15101i);
        }
    }

    public void init(int i9, int i10) {
        this.f15100h = i9;
        this.f15099g = i10;
        init();
    }

    public void init(int i9, int i10, String str, String str2, String str3) {
        this.f15100h = i9;
        this.f15099g = i10;
        this.f15096d = str;
        this.f15097e = str2;
        this.f15098f = str3;
        init();
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15096d = "";
        this.f15097e = "";
        this.f15098f = "Click now for details";
        this.f15099g = 1;
        this.f15100h = 1342177280;
    }

    public void init() {
        try {
            setBackgroundColor(this.f15100h);
            try {
                this.f15098f = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
            } catch (Throwable th) {
                ad.b("MBridgeAnimationClickView", th.getMessage());
            }
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int a6 = ai.a(getContext(), 55.0f);
            int a9 = ai.a(getContext(), 33.0f);
            this.b = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a6, a6);
            layoutParams.setMargins(a9, a9, 0, 0);
            this.b.setLayoutParams(layoutParams);
            final int a10 = v.a(getContext(), "mbridge_icon_click_circle", "drawable");
            if (TextUtils.isEmpty(this.f15097e)) {
                this.b.setImageResource(a10);
            } else {
                b.a(c.m().c()).a(this.f15096d, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.1
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.b.setImageResource(a10);
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (!bitmap.isRecycled()) {
                            MBridgeBaitClickView.this.b.setImageBitmap(bitmap);
                        }
                    }
                });
            }
            int a11 = ai.a(getContext(), 108.0f);
            int a12 = ai.a(getContext(), 35.0f);
            int a13 = ai.a(getContext(), 43.0f);
            this.f15094a = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a11, a11);
            layoutParams2.setMargins(a12, a13, 0, 0);
            this.f15094a.setLayoutParams(layoutParams2);
            final int a14 = v.a(getContext(), "mbridge_icon_click_hand", "drawable");
            if (TextUtils.isEmpty(this.f15096d)) {
                this.f15094a.setImageResource(a14);
            } else {
                b.a(c.m().c()).a(this.f15096d, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.2
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.f15094a.setImageResource(a14);
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (!bitmap.isRecycled()) {
                            MBridgeBaitClickView.this.f15094a.setImageBitmap(bitmap);
                        }
                    }
                });
            }
            relativeLayout.addView(this.b);
            relativeLayout.addView(this.f15094a);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f15095c = new TextView(getContext());
            this.f15095c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f15095c.setText(this.f15098f);
            this.f15095c.setTextColor(-1);
            this.f15095c.setGravity(14);
            linearLayout.addView(this.f15095c);
            addView(linearLayout);
        } catch (Throwable th2) {
            ad.b("MBridgeAnimationClickView", th2.getMessage());
        }
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15096d = "";
        this.f15097e = "";
        this.f15098f = "Click now for details";
        this.f15099g = 1;
        this.f15100h = 1342177280;
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        this.f15096d = "";
        this.f15097e = "";
        this.f15098f = "Click now for details";
        this.f15099g = 1;
        this.f15100h = 1342177280;
    }
}
