package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes4.dex */
public class MBSplashClickView extends MBRelativeLayout {
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12701b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12702c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12703d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12704e;

    /* renamed from: f, reason: collision with root package name */
    private final String f12705f;

    /* renamed from: g, reason: collision with root package name */
    private final String f12706g;

    /* renamed from: h, reason: collision with root package name */
    private final String f12707h;

    /* renamed from: i, reason: collision with root package name */
    private final String f12708i;

    /* renamed from: j, reason: collision with root package name */
    private final String f12709j;

    /* renamed from: k, reason: collision with root package name */
    private final String f12710k;

    /* renamed from: l, reason: collision with root package name */
    private final String f12711l;

    /* renamed from: m, reason: collision with root package name */
    private String f12712m;

    /* renamed from: n, reason: collision with root package name */
    private int f12713n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f12714o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f12715p;

    /* renamed from: q, reason: collision with root package name */
    private final RectF f12716q;

    /* renamed from: r, reason: collision with root package name */
    private final Paint f12717r;

    /* renamed from: s, reason: collision with root package name */
    private final Paint f12718s;

    public MBSplashClickView(Context context) {
        super(context);
        this.a = "浏览第三方应用";
        this.f12701b = "View";
        this.f12702c = "打开第三方应用";
        this.f12703d = "Open";
        this.f12704e = "下载第三方应用";
        this.f12705f = "Install";
        this.f12706g = "mbridge_splash_btn_arrow_right";
        this.f12707h = "mbridge_splash_btn_circle";
        this.f12708i = "mbridge_splash_btn_finger";
        this.f12709j = "mbridge_splash_btn_go";
        this.f12710k = "mbridge_splash_btn_light";
        this.f12711l = "mbridge_expand_data";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f12716q = new RectF();
        this.f12717r = new Paint();
        this.f12718s = new Paint();
        a();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f12716q, this.f12718s, 31);
        canvas.drawRoundRect(this.f12716q, 200.0f, 200.0f, this.f12718s);
        canvas.saveLayer(this.f12716q, this.f12717r, 31);
        super.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void initView(String str) {
        char c10;
        boolean z10;
        String str2;
        RelativeLayout.LayoutParams layoutParams;
        View a;
        this.f12712m = str;
        str.getClass();
        String str3 = "浏览第三方应用";
        final int i10 = 0;
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
                this.f12713n = 3;
                z10 = true;
                break;
            case 1:
            case 4:
                this.f12713n = 1;
                z10 = true;
                break;
            case 2:
            case 5:
                this.f12713n = 2;
                z10 = true;
                break;
            default:
                z10 = false;
                break;
        }
        if (!z10) {
            boolean contains = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
            if (TextUtils.isEmpty(this.f12712m)) {
                if (!contains) {
                    str3 = "View";
                }
                this.f12712m = str3;
            }
            this.f12713n = 2;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null && (a = a(viewGroup, "mbridge_expand_data")) != null && (a instanceof TextView)) {
            str2 = ((TextView) a).getText().toString();
        } else {
            str2 = "";
        }
        int i11 = this.f12713n;
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
        textView.setText(this.f12712m);
        this.f12714o = new ImageView(getContext());
        int i12 = this.f12713n;
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
            this.f12715p = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(ai.a(getContext(), 30.0f), ai.a(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = ai.a(getContext(), 50.0f);
            layoutParams4.topMargin = ai.a(getContext(), 5.0f);
            this.f12715p.setLayoutParams(layoutParams4);
            this.f12715p.setImageResource(getResources().getIdentifier("mbridge_splash_btn_circle", "drawable", c.m().g()));
            addView(this.f12715p);
        } else {
            layoutParams = null;
        }
        this.f12714o.setLayoutParams(layoutParams);
        if (TextUtils.isEmpty(str2)) {
            this.f12714o.setImageResource(i10);
        } else {
            final ImageView imageView2 = this.f12714o;
            if (imageView2 != null) {
                try {
                    if (TextUtils.isEmpty(str2)) {
                        imageView2.setBackgroundResource(i10);
                    }
                    b.a(c.m().c()).a(str2, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.4
                        @Override // com.mbridge.msdk.foundation.same.c.c
                        public void onFailedLoad(String str4, String str5) {
                            ImageView imageView3 = imageView2;
                            if (imageView3 != null) {
                                imageView3.setBackgroundResource(i10);
                            }
                        }

                        @Override // com.mbridge.msdk.foundation.same.c.c
                        public void onSuccessLoad(Bitmap bitmap, String str4) {
                            if (imageView2 != null) {
                                if (bitmap != null && !bitmap.isRecycled()) {
                                    if (MBSplashClickView.this.f12715p != null) {
                                        MBSplashClickView mBSplashClickView = MBSplashClickView.this;
                                        mBSplashClickView.removeView(mBSplashClickView.f12715p);
                                    }
                                    imageView2.setImageBitmap(bitmap);
                                    return;
                                }
                                imageView2.setBackgroundResource(i10);
                            }
                        }
                    });
                } catch (Exception e2) {
                    ad.a("MBSplashClickView", e2.getMessage());
                    imageView2.setBackgroundResource(i10);
                }
            }
        }
        addView(textView);
        addView(this.f12714o);
        invalidate();
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBRelativeLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f12713n;
        if (i10 == 2) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setRepeatCount(-1);
            scaleAnimation.setRepeatMode(2);
            this.f12714o.startAnimation(scaleAnimation);
            return;
        }
        if (i10 == 1) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
            translateAnimation.setDuration(1000L);
            translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.3
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(final Animation animation) {
                    MBSplashClickView.this.f12714o.setVisibility(4);
                    MBSplashClickView.this.f12714o.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MBSplashClickView.this.f12714o.startAnimation(animation);
                        }
                    }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    MBSplashClickView.this.f12714o.setVisibility(0);
                }
            });
            this.f12714o.startAnimation(translateAnimation);
            return;
        }
        if (i10 == 3) {
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            scaleAnimation2.setDuration(1000L);
            scaleAnimation2.setRepeatCount(-1);
            scaleAnimation2.setRepeatMode(2);
            final ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
            scaleAnimation3.setDuration(400L);
            scaleAnimation3.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    MBSplashClickView.this.f12715p.setVisibility(4);
                    MBSplashClickView.this.f12715p.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MBSplashClickView.this.f12715p.startAnimation(scaleAnimation3);
                        }
                    }, 1600L);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    MBSplashClickView.this.f12715p.setVisibility(0);
                }
            });
            this.f12715p.setVisibility(4);
            this.f12714o.startAnimation(scaleAnimation2);
            this.f12715p.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.2
                @Override // java.lang.Runnable
                public void run() {
                    MBSplashClickView.this.f12715p.startAnimation(scaleAnimation3);
                }
            }, 800L);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f12716q.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    private void a() {
        this.f12717r.setAntiAlias(true);
        this.f12717r.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f12718s.setAntiAlias(true);
        this.f12718s.setColor(-1);
    }

    private View a(ViewGroup viewGroup, String str) {
        if (viewGroup != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (viewGroup.getId() == str.hashCode()) {
                        return viewGroup;
                    }
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt.getId() == str.hashCode()) {
                            return childAt;
                        }
                        if (childAt instanceof ViewGroup) {
                            a((ViewGroup) childAt, str);
                        }
                    }
                    return null;
                }
            } catch (Exception e2) {
                ad.b("MBSplashClickView", e2.getMessage());
            }
        }
        return null;
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = "浏览第三方应用";
        this.f12701b = "View";
        this.f12702c = "打开第三方应用";
        this.f12703d = "Open";
        this.f12704e = "下载第三方应用";
        this.f12705f = "Install";
        this.f12706g = "mbridge_splash_btn_arrow_right";
        this.f12707h = "mbridge_splash_btn_circle";
        this.f12708i = "mbridge_splash_btn_finger";
        this.f12709j = "mbridge_splash_btn_go";
        this.f12710k = "mbridge_splash_btn_light";
        this.f12711l = "mbridge_expand_data";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f12716q = new RectF();
        this.f12717r = new Paint();
        this.f12718s = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.a = "浏览第三方应用";
        this.f12701b = "View";
        this.f12702c = "打开第三方应用";
        this.f12703d = "Open";
        this.f12704e = "下载第三方应用";
        this.f12705f = "Install";
        this.f12706g = "mbridge_splash_btn_arrow_right";
        this.f12707h = "mbridge_splash_btn_circle";
        this.f12708i = "mbridge_splash_btn_finger";
        this.f12709j = "mbridge_splash_btn_go";
        this.f12710k = "mbridge_splash_btn_light";
        this.f12711l = "mbridge_expand_data";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f12716q = new RectF();
        this.f12717r = new Paint();
        this.f12718s = new Paint();
        a();
    }
}
