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

/* loaded from: classes4.dex */
public class MBridgeBaitClickView extends RelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;
    private MBridgeDyImageView a;

    /* renamed from: b, reason: collision with root package name */
    private MBridgeDyImageView f12770b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f12771c;

    /* renamed from: d, reason: collision with root package name */
    private String f12772d;

    /* renamed from: e, reason: collision with root package name */
    private String f12773e;

    /* renamed from: f, reason: collision with root package name */
    private String f12774f;

    /* renamed from: g, reason: collision with root package name */
    private int f12775g;

    /* renamed from: h, reason: collision with root package name */
    private int f12776h;

    /* renamed from: i, reason: collision with root package name */
    private Animation f12777i;

    /* renamed from: j, reason: collision with root package name */
    private Animation f12778j;

    /* renamed from: k, reason: collision with root package name */
    private Animation f12779k;

    /* renamed from: l, reason: collision with root package name */
    private Animation f12780l;

    public MBridgeBaitClickView(Context context) {
        super(context);
        this.f12772d = "";
        this.f12773e = "";
        this.f12774f = "Click now for details";
        this.f12775g = 1;
        this.f12776h = 1342177280;
    }

    public void init(int i10) {
        this.f12775g = i10;
        init();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f12777i;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f12778j;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f12779k;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f12780l;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    public void startAnimation() {
        int i10 = this.f12775g;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
                        this.f12777i = scaleAnimation;
                        scaleAnimation.setDuration(200L);
                        this.f12777i.setRepeatCount(-1);
                        this.f12777i.setRepeatMode(2);
                        MBridgeDyImageView mBridgeDyImageView = this.a;
                        if (mBridgeDyImageView != null) {
                            mBridgeDyImageView.startAnimation(this.f12777i);
                        }
                        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
                        this.f12778j = scaleAnimation2;
                        scaleAnimation2.setDuration(400L);
                        this.f12778j.setRepeatCount(-1);
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
                        this.f12779k = alphaAnimation;
                        alphaAnimation.setDuration(400L);
                        this.f12779k.setRepeatCount(-1);
                        AnimationSet animationSet = new AnimationSet(true);
                        animationSet.addAnimation(this.f12778j);
                        animationSet.addAnimation(this.f12779k);
                        MBridgeDyImageView mBridgeDyImageView2 = this.f12770b;
                        if (mBridgeDyImageView2 != null) {
                            mBridgeDyImageView2.startAnimation(animationSet);
                            return;
                        }
                        return;
                    }
                    RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
                    this.f12780l = rotateAnimation;
                    rotateAnimation.setDuration(300L);
                    this.f12780l.setRepeatMode(2);
                    this.f12780l.setRepeatCount(-1);
                    ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
                    this.f12778j = scaleAnimation3;
                    scaleAnimation3.setDuration(600L);
                    this.f12778j.setRepeatCount(-1);
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                    this.f12779k = alphaAnimation2;
                    alphaAnimation2.setDuration(600L);
                    this.f12779k.setRepeatCount(-1);
                    AnimationSet animationSet2 = new AnimationSet(true);
                    animationSet2.addAnimation(this.f12778j);
                    animationSet2.addAnimation(this.f12779k);
                    MBridgeDyImageView mBridgeDyImageView3 = this.a;
                    if (mBridgeDyImageView3 != null) {
                        mBridgeDyImageView3.startAnimation(this.f12780l);
                    }
                    MBridgeDyImageView mBridgeDyImageView4 = this.f12770b;
                    if (mBridgeDyImageView4 != null) {
                        mBridgeDyImageView4.startAnimation(animationSet2);
                        return;
                    }
                    return;
                }
                this.f12770b.setVisibility(4);
                ScaleAnimation scaleAnimation4 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
                this.f12777i = scaleAnimation4;
                scaleAnimation4.setDuration(200L);
                this.f12777i.setRepeatCount(1);
                this.f12777i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (MBridgeBaitClickView.this.a != null) {
                                    MBridgeBaitClickView.this.a.startAnimation(MBridgeBaitClickView.this.f12777i);
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
                MBridgeDyImageView mBridgeDyImageView5 = this.a;
                if (mBridgeDyImageView5 != null) {
                    mBridgeDyImageView5.startAnimation(this.f12777i);
                    return;
                }
                return;
            }
            MBridgeDyImageView mBridgeDyImageView6 = this.f12770b;
            if (mBridgeDyImageView6 != null) {
                mBridgeDyImageView6.setVisibility(4);
            }
            ScaleAnimation scaleAnimation5 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            this.f12777i = scaleAnimation5;
            scaleAnimation5.setDuration(500L);
            this.f12777i.setRepeatCount(1);
            this.f12777i.setRepeatMode(2);
            ScaleAnimation scaleAnimation6 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
            this.f12778j = scaleAnimation6;
            scaleAnimation6.setDuration(1000L);
            this.f12778j.setRepeatCount(0);
            AlphaAnimation alphaAnimation3 = new AlphaAnimation(1.0f, 0.0f);
            this.f12779k = alphaAnimation3;
            alphaAnimation3.setDuration(1000L);
            this.f12779k.setRepeatCount(0);
            final AnimationSet animationSet3 = new AnimationSet(true);
            animationSet3.addAnimation(this.f12778j);
            animationSet3.addAnimation(this.f12779k);
            this.f12778j.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.3
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    if (MBridgeBaitClickView.this.f12770b != null) {
                        MBridgeBaitClickView.this.f12770b.setVisibility(4);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    if (MBridgeBaitClickView.this.f12770b != null) {
                        MBridgeBaitClickView.this.f12770b.setVisibility(0);
                    }
                }
            });
            this.f12777i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (MBridgeBaitClickView.this.a != null) {
                                MBridgeBaitClickView.this.a.startAnimation(MBridgeBaitClickView.this.f12777i);
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
                            if (MBridgeBaitClickView.this.f12770b != null) {
                                MBridgeBaitClickView.this.f12770b.startAnimation(animationSet3);
                            }
                        }
                    }, 550L);
                }
            });
            MBridgeDyImageView mBridgeDyImageView7 = this.a;
            if (mBridgeDyImageView7 != null) {
                mBridgeDyImageView7.startAnimation(this.f12777i);
                return;
            }
            return;
        }
        this.f12770b.setVisibility(4);
        ScaleAnimation scaleAnimation7 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f12777i = scaleAnimation7;
        scaleAnimation7.setDuration(500L);
        this.f12777i.setRepeatCount(-1);
        this.f12777i.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView8 = this.a;
        if (mBridgeDyImageView8 != null) {
            mBridgeDyImageView8.startAnimation(this.f12777i);
        }
    }

    public void init(int i10, int i11) {
        this.f12776h = i10;
        this.f12775g = i11;
        init();
    }

    public void init(int i10, int i11, String str, String str2, String str3) {
        this.f12776h = i10;
        this.f12775g = i11;
        this.f12772d = str;
        this.f12773e = str2;
        this.f12774f = str3;
        init();
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12772d = "";
        this.f12773e = "";
        this.f12774f = "Click now for details";
        this.f12775g = 1;
        this.f12776h = 1342177280;
    }

    public void init() {
        try {
            setBackgroundColor(this.f12776h);
            try {
                this.f12774f = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
            } catch (Throwable th2) {
                ad.b("MBridgeAnimationClickView", th2.getMessage());
            }
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int a = ai.a(getContext(), 55.0f);
            int a10 = ai.a(getContext(), 33.0f);
            this.f12770b = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a, a);
            layoutParams.setMargins(a10, a10, 0, 0);
            this.f12770b.setLayoutParams(layoutParams);
            final int a11 = v.a(getContext(), "mbridge_icon_click_circle", "drawable");
            if (TextUtils.isEmpty(this.f12773e)) {
                this.f12770b.setImageResource(a11);
            } else {
                b.a(c.m().c()).a(this.f12772d, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.1
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.f12770b.setImageResource(a11);
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (!bitmap.isRecycled()) {
                            MBridgeBaitClickView.this.f12770b.setImageBitmap(bitmap);
                        }
                    }
                });
            }
            int a12 = ai.a(getContext(), 108.0f);
            int a13 = ai.a(getContext(), 35.0f);
            int a14 = ai.a(getContext(), 43.0f);
            this.a = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a12, a12);
            layoutParams2.setMargins(a13, a14, 0, 0);
            this.a.setLayoutParams(layoutParams2);
            final int a15 = v.a(getContext(), "mbridge_icon_click_hand", "drawable");
            if (TextUtils.isEmpty(this.f12772d)) {
                this.a.setImageResource(a15);
            } else {
                b.a(c.m().c()).a(this.f12772d, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.2
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.a.setImageResource(a15);
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (!bitmap.isRecycled()) {
                            MBridgeBaitClickView.this.a.setImageBitmap(bitmap);
                        }
                    }
                });
            }
            relativeLayout.addView(this.f12770b);
            relativeLayout.addView(this.a);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f12771c = new TextView(getContext());
            this.f12771c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f12771c.setText(this.f12774f);
            this.f12771c.setTextColor(-1);
            this.f12771c.setGravity(14);
            linearLayout.addView(this.f12771c);
            addView(linearLayout);
        } catch (Throwable th3) {
            ad.b("MBridgeAnimationClickView", th3.getMessage());
        }
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12772d = "";
        this.f12773e = "";
        this.f12774f = "Click now for details";
        this.f12775g = 1;
        this.f12776h = 1342177280;
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f12772d = "";
        this.f12773e = "";
        this.f12774f = "Click now for details";
        this.f12775g = 1;
        this.f12776h = 1342177280;
    }
}
