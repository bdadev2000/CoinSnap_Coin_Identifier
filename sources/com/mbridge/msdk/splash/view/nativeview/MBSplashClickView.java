package com.mbridge.msdk.splash.view.nativeview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes4.dex */
public class MBSplashClickView extends RelativeLayout {
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15339b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15340c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15341d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15342e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15343f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15344g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15345h;

    /* renamed from: i, reason: collision with root package name */
    private final String f15346i;

    /* renamed from: j, reason: collision with root package name */
    private final String f15347j;

    /* renamed from: k, reason: collision with root package name */
    private final String f15348k;

    /* renamed from: l, reason: collision with root package name */
    private String f15349l;

    /* renamed from: m, reason: collision with root package name */
    private int f15350m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView f15351n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f15352o;

    /* renamed from: p, reason: collision with root package name */
    private final RectF f15353p;

    /* renamed from: q, reason: collision with root package name */
    private final Paint f15354q;

    /* renamed from: r, reason: collision with root package name */
    private final Paint f15355r;

    public MBSplashClickView(Context context) {
        super(context);
        this.a = "浏览第三方应用";
        this.f15339b = "View";
        this.f15340c = "打开第三方应用";
        this.f15341d = "Open";
        this.f15342e = "下载第三方应用";
        this.f15343f = "Install";
        this.f15344g = "mbridge_splash_btn_arrow_right";
        this.f15345h = "mbridge_splash_btn_circle";
        this.f15346i = "mbridge_splash_btn_finger";
        this.f15347j = "mbridge_splash_btn_go";
        this.f15348k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f15353p = new RectF();
        this.f15354q = new Paint();
        this.f15355r = new Paint();
        a();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f15353p, this.f15355r, 31);
        canvas.drawRoundRect(this.f15353p, 200.0f, 200.0f, this.f15355r);
        canvas.saveLayer(this.f15353p, this.f15354q, 31);
        super.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void initView(String str) {
        char c10;
        boolean z10;
        RelativeLayout.LayoutParams layoutParams;
        this.f15349l = str;
        str.getClass();
        String str2 = "浏览第三方应用";
        int i10 = 0;
        switch (str.hashCode()) {
            case -672744069:
                if (str.equals("Install")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 2464362:
                if (str.equals("Open")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 2666181:
                if (str.equals("View")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 855294846:
                if (str.equals("下载第三方应用")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1383132195:
                if (str.equals("打开第三方应用")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1681333335:
                if (str.equals("浏览第三方应用")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 3:
                this.f15350m = 3;
                z10 = true;
                break;
            case 1:
            case 4:
                this.f15350m = 1;
                z10 = true;
                break;
            case 2:
            case 5:
                this.f15350m = 2;
                z10 = true;
                break;
            default:
                z10 = false;
                break;
        }
        if (!z10) {
            boolean contains = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
            if (TextUtils.isEmpty(this.f15349l)) {
                if (!contains) {
                    str2 = "View";
                }
                this.f15349l = str2;
            }
            this.f15350m = 2;
        }
        int i11 = this.f15350m;
        int parseColor = Color.parseColor("#666666");
        int parseColor2 = Color.parseColor("#8FC31F");
        int parseColor3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i11 == 2) {
            gradientDrawable.setColor(parseColor2);
        } else {
            gradientDrawable.setColor(parseColor3);
            gradientDrawable.setStroke(2, parseColor);
        }
        gradientDrawable.setCornerRadius(200);
        setBackground(gradientDrawable);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.f15349l);
        this.f15351n = new ImageView(getContext());
        int i12 = this.f15350m;
        if (i12 == 2) {
            i10 = getResources().getIdentifier("mbridge_splash_btn_go", "drawable", c.m().g());
            layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 35.0f), ai.a(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = ai.a(getContext(), 10.0f);
        } else if (i12 == 1) {
            i10 = getResources().getIdentifier("mbridge_splash_btn_light", "drawable", c.m().g());
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = ai.a(getContext(), 50.0f);
            imageView.setImageResource(getResources().getIdentifier("mbridge_splash_btn_arrow_right", "drawable", c.m().g()));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i12 == 3) {
            i10 = getResources().getIdentifier("mbridge_splash_btn_finger", "drawable", c.m().g());
            layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 25.0f), ai.a(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = ai.a(getContext(), 50.0f);
            layoutParams.topMargin = ai.a(getContext(), 18.0f);
            this.f15352o = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(ai.a(getContext(), 30.0f), ai.a(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = ai.a(getContext(), 50.0f);
            layoutParams4.topMargin = ai.a(getContext(), 5.0f);
            this.f15352o.setLayoutParams(layoutParams4);
            this.f15352o.setImageResource(getResources().getIdentifier("mbridge_splash_btn_circle", "drawable", c.m().g()));
            addView(this.f15352o);
        } else {
            layoutParams = null;
        }
        this.f15351n.setLayoutParams(layoutParams);
        this.f15351n.setImageResource(i10);
        addView(textView);
        addView(this.f15351n);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f15350m;
        if (i10 == 2) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setRepeatCount(-1);
            scaleAnimation.setRepeatMode(2);
            this.f15351n.startAnimation(scaleAnimation);
            return;
        }
        if (i10 == 1) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
            translateAnimation.setDuration(1000L);
            translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView.3
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(final Animation animation) {
                    MBSplashClickView.this.f15351n.setVisibility(4);
                    MBSplashClickView.this.f15351n.postDelayed(new Runnable() { // from class: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            MBSplashClickView.this.f15351n.startAnimation(animation);
                        }
                    }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    MBSplashClickView.this.f15351n.setVisibility(0);
                }
            });
            this.f15351n.startAnimation(translateAnimation);
            return;
        }
        if (i10 == 3) {
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            scaleAnimation2.setDuration(400L);
            scaleAnimation2.setRepeatCount(-1);
            scaleAnimation2.setRepeatMode(2);
            final ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
            scaleAnimation3.setDuration(200L);
            scaleAnimation3.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView.1
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    MBSplashClickView.this.f15352o.setVisibility(4);
                    MBSplashClickView.this.f15352o.postDelayed(new Runnable() { // from class: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            MBSplashClickView.this.f15352o.startAnimation(scaleAnimation3);
                        }
                    }, 700L);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    MBSplashClickView.this.f15352o.setVisibility(0);
                }
            });
            this.f15352o.setVisibility(4);
            this.f15351n.startAnimation(scaleAnimation2);
            this.f15352o.postDelayed(new Runnable() { // from class: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView.2
                @Override // java.lang.Runnable
                public final void run() {
                    MBSplashClickView.this.f15352o.startAnimation(scaleAnimation3);
                }
            }, 500L);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f15353p.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    private void a() {
        this.f15354q.setAntiAlias(true);
        this.f15354q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f15355r.setAntiAlias(true);
        this.f15355r.setColor(-1);
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = "浏览第三方应用";
        this.f15339b = "View";
        this.f15340c = "打开第三方应用";
        this.f15341d = "Open";
        this.f15342e = "下载第三方应用";
        this.f15343f = "Install";
        this.f15344g = "mbridge_splash_btn_arrow_right";
        this.f15345h = "mbridge_splash_btn_circle";
        this.f15346i = "mbridge_splash_btn_finger";
        this.f15347j = "mbridge_splash_btn_go";
        this.f15348k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f15353p = new RectF();
        this.f15354q = new Paint();
        this.f15355r = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.a = "浏览第三方应用";
        this.f15339b = "View";
        this.f15340c = "打开第三方应用";
        this.f15341d = "Open";
        this.f15342e = "下载第三方应用";
        this.f15343f = "Install";
        this.f15344g = "mbridge_splash_btn_arrow_right";
        this.f15345h = "mbridge_splash_btn_circle";
        this.f15346i = "mbridge_splash_btn_finger";
        this.f15347j = "mbridge_splash_btn_go";
        this.f15348k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f15353p = new RectF();
        this.f15354q = new Paint();
        this.f15355r = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.a = "浏览第三方应用";
        this.f15339b = "View";
        this.f15340c = "打开第三方应用";
        this.f15341d = "Open";
        this.f15342e = "下载第三方应用";
        this.f15343f = "Install";
        this.f15344g = "mbridge_splash_btn_arrow_right";
        this.f15345h = "mbridge_splash_btn_circle";
        this.f15346i = "mbridge_splash_btn_finger";
        this.f15347j = "mbridge_splash_btn_go";
        this.f15348k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f15353p = new RectF();
        this.f15354q = new Paint();
        this.f15355r = new Paint();
    }
}
