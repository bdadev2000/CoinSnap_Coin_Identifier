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

/* loaded from: classes3.dex */
public class MBSplashClickView extends RelativeLayout {
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;

    /* renamed from: a, reason: collision with root package name */
    private final String f18077a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18078c;

    /* renamed from: d, reason: collision with root package name */
    private final String f18079d;

    /* renamed from: e, reason: collision with root package name */
    private final String f18080e;

    /* renamed from: f, reason: collision with root package name */
    private final String f18081f;

    /* renamed from: g, reason: collision with root package name */
    private final String f18082g;

    /* renamed from: h, reason: collision with root package name */
    private final String f18083h;

    /* renamed from: i, reason: collision with root package name */
    private final String f18084i;

    /* renamed from: j, reason: collision with root package name */
    private final String f18085j;

    /* renamed from: k, reason: collision with root package name */
    private final String f18086k;
    private String l;
    private int m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView f18087n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f18088o;

    /* renamed from: p, reason: collision with root package name */
    private final RectF f18089p;

    /* renamed from: q, reason: collision with root package name */
    private final Paint f18090q;

    /* renamed from: r, reason: collision with root package name */
    private final Paint f18091r;

    public MBSplashClickView(Context context) {
        super(context);
        this.f18077a = "浏览第三方应用";
        this.b = "View";
        this.f18078c = "打开第三方应用";
        this.f18079d = "Open";
        this.f18080e = "下载第三方应用";
        this.f18081f = "Install";
        this.f18082g = "mbridge_splash_btn_arrow_right";
        this.f18083h = "mbridge_splash_btn_circle";
        this.f18084i = "mbridge_splash_btn_finger";
        this.f18085j = "mbridge_splash_btn_go";
        this.f18086k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f18089p = new RectF();
        this.f18090q = new Paint();
        this.f18091r = new Paint();
        a();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f18089p, this.f18091r, 31);
        canvas.drawRoundRect(this.f18089p, 200.0f, 200.0f, this.f18091r);
        canvas.saveLayer(this.f18089p, this.f18090q, 31);
        super.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void initView(String str) {
        char c9;
        RelativeLayout.LayoutParams layoutParams;
        String str2 = "浏览第三方应用";
        int i9 = 0;
        this.l = str;
        str.getClass();
        switch (str.hashCode()) {
            case -672744069:
                if (str.equals("Install")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 2464362:
                if (str.equals("Open")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 2666181:
                if (str.equals("View")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 855294846:
                if (str.equals("下载第三方应用")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1383132195:
                if (str.equals("打开第三方应用")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 1681333335:
                if (str.equals("浏览第三方应用")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
            case 3:
                this.m = 3;
                break;
            case 1:
            case 4:
                this.m = 1;
                break;
            case 2:
            case 5:
                this.m = 2;
                break;
            default:
                boolean contains = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
                if (TextUtils.isEmpty(this.l)) {
                    if (!contains) {
                        str2 = "View";
                    }
                    this.l = str2;
                }
                this.m = 2;
                break;
        }
        int i10 = this.m;
        int parseColor = Color.parseColor("#666666");
        int parseColor2 = Color.parseColor("#8FC31F");
        int parseColor3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i10 == 2) {
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
        textView.setText(this.l);
        this.f18087n = new ImageView(getContext());
        int i11 = this.m;
        if (i11 == 2) {
            i9 = getResources().getIdentifier("mbridge_splash_btn_go", "drawable", c.m().g());
            layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 35.0f), ai.a(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = ai.a(getContext(), 10.0f);
        } else if (i11 == 1) {
            i9 = getResources().getIdentifier("mbridge_splash_btn_light", "drawable", c.m().g());
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
        } else if (i11 == 3) {
            i9 = getResources().getIdentifier("mbridge_splash_btn_finger", "drawable", c.m().g());
            layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 25.0f), ai.a(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = ai.a(getContext(), 50.0f);
            layoutParams.topMargin = ai.a(getContext(), 18.0f);
            this.f18088o = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(ai.a(getContext(), 30.0f), ai.a(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = ai.a(getContext(), 50.0f);
            layoutParams4.topMargin = ai.a(getContext(), 5.0f);
            this.f18088o.setLayoutParams(layoutParams4);
            this.f18088o.setImageResource(getResources().getIdentifier("mbridge_splash_btn_circle", "drawable", c.m().g()));
            addView(this.f18088o);
        } else {
            layoutParams = null;
        }
        this.f18087n.setLayoutParams(layoutParams);
        this.f18087n.setImageResource(i9);
        addView(textView);
        addView(this.f18087n);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i9 = this.m;
        if (i9 == 2) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setRepeatCount(-1);
            scaleAnimation.setRepeatMode(2);
            this.f18087n.startAnimation(scaleAnimation);
            return;
        }
        if (i9 == 1) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
            translateAnimation.setDuration(1000L);
            translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView.3
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(final Animation animation) {
                    MBSplashClickView.this.f18087n.setVisibility(4);
                    MBSplashClickView.this.f18087n.postDelayed(new Runnable() { // from class: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            MBSplashClickView.this.f18087n.startAnimation(animation);
                        }
                    }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    MBSplashClickView.this.f18087n.setVisibility(0);
                }
            });
            this.f18087n.startAnimation(translateAnimation);
            return;
        }
        if (i9 == 3) {
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            scaleAnimation2.setDuration(400L);
            scaleAnimation2.setRepeatCount(-1);
            scaleAnimation2.setRepeatMode(2);
            final ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
            scaleAnimation3.setDuration(200L);
            scaleAnimation3.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView.1
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    MBSplashClickView.this.f18088o.setVisibility(4);
                    MBSplashClickView.this.f18088o.postDelayed(new Runnable() { // from class: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            MBSplashClickView.this.f18088o.startAnimation(scaleAnimation3);
                        }
                    }, 700L);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    MBSplashClickView.this.f18088o.setVisibility(0);
                }
            });
            this.f18088o.setVisibility(4);
            this.f18087n.startAnimation(scaleAnimation2);
            this.f18088o.postDelayed(new Runnable() { // from class: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView.2
                @Override // java.lang.Runnable
                public final void run() {
                    MBSplashClickView.this.f18088o.startAnimation(scaleAnimation3);
                }
            }, 500L);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        super.onLayout(z8, i9, i10, i11, i12);
        this.f18089p.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    private void a() {
        this.f18090q.setAntiAlias(true);
        this.f18090q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f18091r.setAntiAlias(true);
        this.f18091r.setColor(-1);
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18077a = "浏览第三方应用";
        this.b = "View";
        this.f18078c = "打开第三方应用";
        this.f18079d = "Open";
        this.f18080e = "下载第三方应用";
        this.f18081f = "Install";
        this.f18082g = "mbridge_splash_btn_arrow_right";
        this.f18083h = "mbridge_splash_btn_circle";
        this.f18084i = "mbridge_splash_btn_finger";
        this.f18085j = "mbridge_splash_btn_go";
        this.f18086k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f18089p = new RectF();
        this.f18090q = new Paint();
        this.f18091r = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f18077a = "浏览第三方应用";
        this.b = "View";
        this.f18078c = "打开第三方应用";
        this.f18079d = "Open";
        this.f18080e = "下载第三方应用";
        this.f18081f = "Install";
        this.f18082g = "mbridge_splash_btn_arrow_right";
        this.f18083h = "mbridge_splash_btn_circle";
        this.f18084i = "mbridge_splash_btn_finger";
        this.f18085j = "mbridge_splash_btn_go";
        this.f18086k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f18089p = new RectF();
        this.f18090q = new Paint();
        this.f18091r = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        this.f18077a = "浏览第三方应用";
        this.b = "View";
        this.f18078c = "打开第三方应用";
        this.f18079d = "Open";
        this.f18080e = "下载第三方应用";
        this.f18081f = "Install";
        this.f18082g = "mbridge_splash_btn_arrow_right";
        this.f18083h = "mbridge_splash_btn_circle";
        this.f18084i = "mbridge_splash_btn_finger";
        this.f18085j = "mbridge_splash_btn_go";
        this.f18086k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f18089p = new RectF();
        this.f18090q = new Paint();
        this.f18091r = new Paint();
    }
}
