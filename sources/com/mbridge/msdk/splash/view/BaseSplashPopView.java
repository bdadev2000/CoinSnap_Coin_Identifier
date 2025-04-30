package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.i;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.tools.ac;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.o;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.splash.d.d;
import java.net.URLEncoder;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class BaseSplashPopView extends RelativeLayout {
    public static final int TYPE_POP_DEFAULT = 1;
    public static final int TYPE_POP_LARGE = 4;
    public static final int TYPE_POP_MEDIUM = 3;
    public static final int TYPE_POP_SMALL = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicInteger f18022h = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    protected String f18023a;
    protected String b;

    /* renamed from: c, reason: collision with root package name */
    protected d f18024c;

    /* renamed from: d, reason: collision with root package name */
    protected Handler f18025d;

    /* renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f18026e;

    /* renamed from: f, reason: collision with root package name */
    View.OnClickListener f18027f;

    /* renamed from: g, reason: collision with root package name */
    View.OnClickListener f18028g;

    /* renamed from: i, reason: collision with root package name */
    private int f18029i;

    /* renamed from: j, reason: collision with root package name */
    private CampaignEx f18030j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f18031k;
    private ImageView l;
    private ImageView m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView f18032n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f18033o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f18034p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f18035q;

    /* renamed from: r, reason: collision with root package name */
    private int f18036r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f18037s;

    /* renamed from: t, reason: collision with root package name */
    private i f18038t;

    /* renamed from: u, reason: collision with root package name */
    private Runnable f18039u;

    /* renamed from: v, reason: collision with root package name */
    private Runnable f18040v;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f18049a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private int f18050c;

        /* renamed from: d, reason: collision with root package name */
        private CampaignEx f18051d;

        public a(String str, String str2, int i9, CampaignEx campaignEx) {
            this.f18049a = str;
            this.b = str2;
            this.f18050c = i9;
            this.f18051d = campaignEx;
        }

        public final String a() {
            return this.f18049a;
        }

        public final String b() {
            return this.b;
        }

        public final int c() {
            return this.f18050c;
        }

        public final CampaignEx d() {
            return this.f18051d;
        }
    }

    public BaseSplashPopView(Context context, a aVar, d dVar) {
        super(context);
        this.f18029i = 1;
        this.f18036r = -1;
        this.f18025d = new Handler();
        this.f18037s = false;
        this.f18038t = new i() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.1
            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onFinishRedirection(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onRedirectionFailed(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onStartRedirection(Campaign campaign, String str) {
                int i9;
                int i10;
                if (BaseSplashPopView.this.f18029i == 1) {
                    int min = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                    int a6 = (ai.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(min / 4, 70), min)) / 2;
                    i9 = ai.a(BaseSplashPopView.this.getContext(), 23.0f) + a6;
                    i10 = ai.a(BaseSplashPopView.this.getContext(), 10.0f) + a6;
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                ah.a(campaign, BaseSplashPopView.this, i9, i10);
            }
        };
        this.f18039u = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.f18035q != null) {
                    if (BaseSplashPopView.this.f18036r == 0) {
                        BaseSplashPopView.this.f18036r = -1;
                        BaseSplashPopView.this.g();
                        BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                        baseSplashPopView.f18025d.removeCallbacks(baseSplashPopView.f18039u);
                        BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                        d dVar2 = baseSplashPopView2.f18024c;
                        if (dVar2 != null) {
                            dVar2.a(new MBridgeIds(baseSplashPopView2.f18023a, baseSplashPopView2.b), 5);
                            return;
                        }
                        return;
                    }
                    BaseSplashPopView.i(BaseSplashPopView.this);
                    BaseSplashPopView.this.f18035q.setText(String.valueOf(BaseSplashPopView.this.f18036r));
                    BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                    baseSplashPopView3.f18025d.postDelayed(baseSplashPopView3.f18039u, 1000L);
                }
            }
        };
        this.f18040v = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.6
            @Override // java.lang.Runnable
            public final void run() {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                d dVar2 = baseSplashPopView.f18024c;
                if (dVar2 != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.f18023a, baseSplashPopView.b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f18029i);
                }
            }
        };
        this.f18027f = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                if (baseSplashPopView.f18024c != null) {
                    baseSplashPopView.a(baseSplashPopView.f18030j);
                }
            }
        };
        this.f18028g = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView;
                d dVar2;
                if (BaseSplashPopView.this.f18036r <= 0 && (dVar2 = (baseSplashPopView = BaseSplashPopView.this).f18024c) != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.f18023a, baseSplashPopView.b), 4);
                }
            }
        };
        if (aVar != null) {
            this.b = aVar.b();
            this.f18023a = aVar.a();
            this.f18029i = aVar.c();
            this.f18030j = aVar.d();
            this.f18024c = dVar;
            a();
            return;
        }
        throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i9;
        int i10;
        do {
            atomicInteger = f18022h;
            i9 = atomicInteger.get();
            i10 = i9 + 1;
            if (i10 > 16777215) {
                i10 = 1;
            }
        } while (!atomicInteger.compareAndSet(i9, i10));
        return i9;
    }

    public static /* synthetic */ int i(BaseSplashPopView baseSplashPopView) {
        int i9 = baseSplashPopView.f18036r;
        baseSplashPopView.f18036r = i9 - 1;
        return i9;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18024c != null) {
            postDelayed(this.f18040v, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public void pauseCountDown() {
        this.f18037s = true;
        if (this.f18035q != null) {
            this.f18025d.removeCallbacks(this.f18039u);
        }
    }

    public void reStartCountDown() {
        if (this.f18037s) {
            this.f18037s = false;
            int i9 = this.f18036r;
            if (i9 != -1 && i9 != 0) {
                TextView textView = this.f18035q;
                if (textView != null) {
                    textView.setText(String.valueOf(i9));
                    this.f18025d.postDelayed(this.f18039u, 1000L);
                    return;
                }
                return;
            }
            g();
        }
    }

    public void release() {
        try {
            this.f18025d.removeCallbacks(this.f18040v);
            this.f18025d.removeCallbacks(this.f18039u);
            this.f18039u = null;
            detachAllViewsFromParent();
            this.f18030j = null;
            this.f18024c = null;
        } catch (Exception e4) {
            ad.b("MBSplashPopView", e4.getMessage());
        }
    }

    public void setPopViewType(a aVar, d dVar) {
        if (aVar != null) {
            this.b = aVar.b();
            this.f18023a = aVar.a();
            this.f18029i = aVar.c();
            this.f18030j = aVar.d();
            this.f18024c = dVar;
            a();
            return;
        }
        throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
    }

    public void startCountDown() {
        this.f18025d.removeCallbacks(this.f18039u);
        CampaignEx campaignEx = this.f18030j;
        if (campaignEx != null && this.f18029i == 1) {
            int flbSkipTime = campaignEx.getFlbSkipTime();
            if (flbSkipTime > 0) {
                this.f18036r = flbSkipTime;
                TextView textView = this.f18035q;
                if (textView != null) {
                    textView.setText(String.valueOf(flbSkipTime));
                    this.f18025d.postDelayed(this.f18039u, 1000L);
                    return;
                }
                return;
            }
            g();
        }
    }

    private void b() {
        View imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 80.0f), ai.a(getContext(), 80.0f));
        layoutParams.addRule(9);
        layoutParams.topMargin = ai.a(getContext(), 16.0f);
        imageView.setId(generateViewId());
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_default", "drawable", c.m().g()));
        this.f18031k = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ai.a(getContext(), 60.0f), ai.a(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = ai.a(getContext(), 7.0f);
        layoutParams2.leftMargin = ai.a(getContext(), 10.0f);
        this.f18031k.setId(generateViewId());
        this.f18031k.setLayoutParams(layoutParams2);
        this.f18031k.setScaleType(ImageView.ScaleType.FIT_CENTER);
        CampaignEx campaignEx = this.f18030j;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getIconUrl())) {
            a(this.f18030j.getIconUrl(), true);
        }
        this.f18035q = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = ai.a(getContext(), 62.0f);
        layoutParams3.bottomMargin = ai.a(getContext(), 70.0f);
        this.f18035q.setId(generateViewId());
        this.f18035q.setTextSize(10.0f);
        this.f18035q.setTextColor(-1);
        this.f18035q.setGravity(17);
        this.f18035q.setMinWidth(ai.a(getContext(), 16.0f));
        this.f18035q.setMaxHeight(ai.a(getContext(), 16.0f));
        this.f18035q.setLayoutParams(layoutParams3);
        this.f18035q.setBackgroundResource(getResources().getIdentifier("mbridge_cm_circle_50black", "drawable", c.m().g()));
        addView(imageView);
        addView(this.f18035q);
        addView(this.f18031k);
        CampaignEx campaignEx2 = this.f18030j;
        if (campaignEx2 != null && campaignEx2.getFlbSkipTime() <= 0) {
            g();
        }
        setOnClickListener(this.f18027f);
        this.f18035q.setOnClickListener(this.f18028g);
    }

    private void c() {
        int a6 = ai.a(getContext(), 4.0f);
        this.f18031k = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 28.0f), ai.a(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.f18031k.setId(generateViewId());
        this.f18031k.setLayoutParams(layoutParams);
        this.f18031k.setPadding(a6, a6, a6, a6);
        this.f18031k.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        a(this.f18030j.getIconUrl(), false);
        TextView textView = new TextView(getContext());
        this.f18033o = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f18031k.getId());
        layoutParams2.addRule(6, this.f18031k.getId());
        layoutParams2.addRule(8, this.f18031k.getId());
        layoutParams2.leftMargin = ai.a(getContext(), 4.0f);
        layoutParams2.rightMargin = ai.a(getContext(), 40.0f);
        this.f18033o.setLayoutParams(layoutParams2);
        this.f18033o.setGravity(16);
        this.f18033o.setTextSize(10.0f);
        this.f18033o.setSelected(true);
        this.f18033o.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f18033o.setMarqueeRepeatLimit(-1);
        this.f18033o.setSingleLine(true);
        this.f18033o.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f18033o.setText(this.f18030j.getAppName());
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", c.m().g()));
        addView(this.f18031k);
        addView(this.f18033o);
        f();
        setOnClickListener(this.f18027f);
    }

    private void d() {
        int a6 = ai.a(getContext(), 4.0f);
        this.f18031k = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 50.0f), ai.a(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.f18031k.setId(generateViewId());
        this.f18031k.setLayoutParams(layoutParams);
        this.f18031k.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f18031k.setPadding(a6, a6, a6, a6);
        a(this.f18030j.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.f18031k.getId());
        layoutParams2.addRule(6, this.f18031k.getId());
        layoutParams2.addRule(8, this.f18031k.getId());
        layoutParams2.leftMargin = ai.a(getContext(), 8.0f);
        layoutParams2.rightMargin = ai.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f18033o = textView;
        textView.setId(generateViewId());
        this.f18033o.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f18033o.setGravity(16);
        this.f18033o.setTextSize(12.0f);
        this.f18033o.setSelected(true);
        TextView textView2 = this.f18033o;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.f18033o.setMarqueeRepeatLimit(-1);
        this.f18033o.setSingleLine(true);
        this.f18033o.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f18033o.setText(this.f18030j.getAppName());
        TextView textView3 = new TextView(getContext());
        this.f18034p = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.f18033o.getId());
        layoutParams3.addRule(3, this.f18033o.getId());
        layoutParams3.topMargin = ai.a(getContext(), 4.0f);
        layoutParams3.rightMargin = ai.a(getContext(), 36.0f);
        this.f18034p.setGravity(16);
        this.f18034p.setLayoutParams(layoutParams3);
        this.f18034p.setTextSize(8.0f);
        this.f18034p.setTextColor(-10066330);
        this.f18034p.setEllipsize(truncateAt);
        this.f18034p.setMarqueeRepeatLimit(-1);
        this.f18034p.setSelected(true);
        this.f18034p.setSingleLine(true);
        this.f18034p.setText(this.f18030j.getAppDesc());
        relativeLayout.addView(this.f18033o);
        relativeLayout.addView(this.f18034p);
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", c.m().g()));
        addView(this.f18031k);
        addView(relativeLayout);
        f();
        setOnClickListener(this.f18027f);
    }

    private void e() {
        this.m = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ai.a(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.m.setScaleType(ImageView.ScaleType.FIT_XY);
        this.m.setId(generateViewId());
        this.m.setLayoutParams(layoutParams);
        a(this.f18030j.getImageUrl());
        this.l = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, ai.a(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.l.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.l.setId(generateViewId());
        this.l.setLayoutParams(layoutParams2);
        b(this.f18030j.getImageUrl());
        this.f18031k = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(ai.a(getContext(), 50.0f), ai.a(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.m.getId());
        layoutParams3.topMargin = 20;
        this.f18031k.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f18031k.setId(generateViewId());
        this.f18031k.setLayoutParams(layoutParams3);
        a(this.f18030j.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.f18031k.getId());
        layoutParams4.addRule(6, this.f18031k.getId());
        layoutParams4.addRule(8, this.f18031k.getId());
        layoutParams4.leftMargin = ai.a(getContext(), 8.0f);
        layoutParams4.rightMargin = ai.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f18033o = textView;
        textView.setId(generateViewId());
        this.f18033o.setGravity(16);
        this.f18033o.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f18033o.setTextSize(12.0f);
        this.f18033o.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        TextView textView2 = this.f18033o;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.f18033o.setMarqueeRepeatLimit(-1);
        this.f18033o.setSelected(true);
        this.f18033o.setSingleLine(true);
        this.f18033o.setText(this.f18030j.getAppName());
        TextView textView3 = new TextView(getContext());
        this.f18034p = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.f18033o.getId());
        layoutParams5.addRule(3, this.f18033o.getId());
        layoutParams5.topMargin = ai.a(getContext(), 4.0f);
        layoutParams5.rightMargin = ai.a(getContext(), 36.0f);
        this.f18034p.setGravity(16);
        this.f18034p.setLayoutParams(layoutParams5);
        this.f18034p.setTextSize(8.0f);
        this.f18034p.setTextColor(-10066330);
        this.f18034p.setEllipsize(truncateAt);
        this.f18034p.setMarqueeRepeatLimit(-1);
        this.f18034p.setSelected(true);
        this.f18034p.setSingleLine(true);
        this.f18034p.setText(this.f18030j.getAppDesc());
        relativeLayout.addView(this.f18033o);
        relativeLayout.addView(this.f18034p);
        addView(this.m);
        addView(this.l);
        addView(this.f18031k);
        addView(relativeLayout);
        f();
        setOnClickListener(this.f18027f);
    }

    private void f() {
        String str;
        int identifier;
        this.f18032n = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 32.0f), ai.a(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.f18031k.getId());
        this.f18032n.setLayoutParams(layoutParams);
        try {
            str = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th) {
            ad.b("MBSplashPopView", th.getMessage());
            str = "ZH";
        }
        if (!str.toUpperCase().equals("CN") && !str.toUpperCase().equals("ZH")) {
            identifier = getResources().getIdentifier("mbridge_splash_pop_ad_en", "drawable", c.m().g());
        } else {
            identifier = getResources().getIdentifier("mbridge_splash_pop_ad", "drawable", c.m().g());
        }
        this.f18032n.setBackgroundResource(identifier);
        addView(this.f18032n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TextView textView = this.f18035q;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = ai.a(getContext(), 16.0f);
            layoutParams.height = ai.a(getContext(), 16.0f);
            this.f18035q.setLayoutParams(layoutParams);
            this.f18035q.setText("");
            this.f18035q.setSelected(true);
            this.f18035q.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_close", "drawable", c.m().g()));
        }
    }

    private void a() {
        if (this.f18030j == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i9 = this.f18029i;
        if (i9 == 1) {
            b();
            return;
        }
        if (i9 == 2) {
            c();
        } else if (i9 == 3) {
            d();
        } else {
            if (i9 != 4) {
                return;
            }
            e();
        }
    }

    private void a(String str, final boolean z8) {
        b.a(c.m().c()).a(str, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.2
            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onFailedLoad(String str2, String str3) {
                ad.b("MBSplashPopView", str2);
            }

            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onSuccessLoad(Bitmap bitmap, String str2) {
                Bitmap a6;
                try {
                    if (!bitmap.isRecycled()) {
                        if (z8) {
                            if (!bitmap.isRecycled()) {
                                int width = bitmap.getWidth();
                                a6 = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_4444);
                                Canvas canvas = new Canvas(a6);
                                Paint paint = new Paint();
                                paint.setAntiAlias(true);
                                canvas.drawCircle(width / 2, width / 2, width / 2, paint);
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                            } else {
                                a6 = null;
                            }
                        } else {
                            a6 = ac.a(bitmap, 1, 16);
                        }
                        ImageView imageView = BaseSplashPopView.this.f18031k;
                        if (a6 != null) {
                            bitmap = a6;
                        }
                        imageView.setImageBitmap(bitmap);
                    }
                } catch (Throwable th) {
                    ad.b("MBSplashPopView", th.getMessage());
                }
            }
        });
    }

    private void a(String str) {
        b.a(c.m().c()).a(str, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.3
            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onFailedLoad(String str2, String str3) {
                ad.b("MBSplashPopView", str2);
            }

            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onSuccessLoad(Bitmap bitmap, String str2) {
                try {
                    if (!bitmap.isRecycled()) {
                        BaseSplashPopView.this.m.setImageBitmap(o.a(bitmap, 10));
                    }
                } catch (Throwable th) {
                    ad.b("MBSplashPopView", th.getMessage());
                }
            }
        });
    }

    public void a(CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.foundation.same.report.d.c.a().d("key=" + URLEncoder.encode("2000092", "utf-8") + "&rid=" + URLEncoder.encode(campaignEx.getRequestId(), "utf-8") + "&rid_n=" + URLEncoder.encode(campaignEx.getRequestIdNotice(), "utf-8") + "&cid=" + URLEncoder.encode(campaignEx.getId(), "utf-8") + "&unit_id=" + URLEncoder.encode(this.b, "utf-8") + "&network_type=" + URLEncoder.encode(String.valueOf(z.l(c.m().c())), "utf-8"));
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }

    public BaseSplashPopView(Context context) {
        super(context);
        this.f18029i = 1;
        this.f18036r = -1;
        this.f18025d = new Handler();
        this.f18037s = false;
        this.f18038t = new i() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.1
            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onFinishRedirection(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onRedirectionFailed(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onStartRedirection(Campaign campaign, String str) {
                int i9;
                int i10;
                if (BaseSplashPopView.this.f18029i == 1) {
                    int min = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                    int a6 = (ai.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(min / 4, 70), min)) / 2;
                    i9 = ai.a(BaseSplashPopView.this.getContext(), 23.0f) + a6;
                    i10 = ai.a(BaseSplashPopView.this.getContext(), 10.0f) + a6;
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                ah.a(campaign, BaseSplashPopView.this, i9, i10);
            }
        };
        this.f18039u = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.f18035q != null) {
                    if (BaseSplashPopView.this.f18036r == 0) {
                        BaseSplashPopView.this.f18036r = -1;
                        BaseSplashPopView.this.g();
                        BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                        baseSplashPopView.f18025d.removeCallbacks(baseSplashPopView.f18039u);
                        BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                        d dVar2 = baseSplashPopView2.f18024c;
                        if (dVar2 != null) {
                            dVar2.a(new MBridgeIds(baseSplashPopView2.f18023a, baseSplashPopView2.b), 5);
                            return;
                        }
                        return;
                    }
                    BaseSplashPopView.i(BaseSplashPopView.this);
                    BaseSplashPopView.this.f18035q.setText(String.valueOf(BaseSplashPopView.this.f18036r));
                    BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                    baseSplashPopView3.f18025d.postDelayed(baseSplashPopView3.f18039u, 1000L);
                }
            }
        };
        this.f18040v = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.6
            @Override // java.lang.Runnable
            public final void run() {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                d dVar2 = baseSplashPopView.f18024c;
                if (dVar2 != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.f18023a, baseSplashPopView.b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f18029i);
                }
            }
        };
        this.f18027f = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                if (baseSplashPopView.f18024c != null) {
                    baseSplashPopView.a(baseSplashPopView.f18030j);
                }
            }
        };
        this.f18028g = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView;
                d dVar2;
                if (BaseSplashPopView.this.f18036r <= 0 && (dVar2 = (baseSplashPopView = BaseSplashPopView.this).f18024c) != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.f18023a, baseSplashPopView.b), 4);
                }
            }
        };
        this.f18029i = 1;
        ad.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18029i = 1;
        this.f18036r = -1;
        this.f18025d = new Handler();
        this.f18037s = false;
        this.f18038t = new i() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.1
            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onFinishRedirection(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onRedirectionFailed(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onStartRedirection(Campaign campaign, String str) {
                int i9;
                int i10;
                if (BaseSplashPopView.this.f18029i == 1) {
                    int min = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                    int a6 = (ai.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(min / 4, 70), min)) / 2;
                    i9 = ai.a(BaseSplashPopView.this.getContext(), 23.0f) + a6;
                    i10 = ai.a(BaseSplashPopView.this.getContext(), 10.0f) + a6;
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                ah.a(campaign, BaseSplashPopView.this, i9, i10);
            }
        };
        this.f18039u = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.f18035q != null) {
                    if (BaseSplashPopView.this.f18036r == 0) {
                        BaseSplashPopView.this.f18036r = -1;
                        BaseSplashPopView.this.g();
                        BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                        baseSplashPopView.f18025d.removeCallbacks(baseSplashPopView.f18039u);
                        BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                        d dVar2 = baseSplashPopView2.f18024c;
                        if (dVar2 != null) {
                            dVar2.a(new MBridgeIds(baseSplashPopView2.f18023a, baseSplashPopView2.b), 5);
                            return;
                        }
                        return;
                    }
                    BaseSplashPopView.i(BaseSplashPopView.this);
                    BaseSplashPopView.this.f18035q.setText(String.valueOf(BaseSplashPopView.this.f18036r));
                    BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                    baseSplashPopView3.f18025d.postDelayed(baseSplashPopView3.f18039u, 1000L);
                }
            }
        };
        this.f18040v = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.6
            @Override // java.lang.Runnable
            public final void run() {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                d dVar2 = baseSplashPopView.f18024c;
                if (dVar2 != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.f18023a, baseSplashPopView.b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f18029i);
                }
            }
        };
        this.f18027f = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                if (baseSplashPopView.f18024c != null) {
                    baseSplashPopView.a(baseSplashPopView.f18030j);
                }
            }
        };
        this.f18028g = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView;
                d dVar2;
                if (BaseSplashPopView.this.f18036r <= 0 && (dVar2 = (baseSplashPopView = BaseSplashPopView.this).f18024c) != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.f18023a, baseSplashPopView.b), 4);
                }
            }
        };
        this.f18029i = 1;
        ad.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    private void b(String str) {
        b.a(c.m().c()).a(str, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.4
            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onFailedLoad(String str2, String str3) {
                ad.b("MBSplashPopView", str2);
            }

            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onSuccessLoad(Bitmap bitmap, String str2) {
                try {
                    if (!bitmap.isRecycled()) {
                        BaseSplashPopView.this.l.setImageBitmap(ac.a(bitmap, 1, 16));
                    }
                } catch (Throwable th) {
                    ad.b("MBSplashPopView", th.getMessage());
                }
            }
        });
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f18029i = 1;
        this.f18036r = -1;
        this.f18025d = new Handler();
        this.f18037s = false;
        this.f18038t = new i() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.1
            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onFinishRedirection(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onRedirectionFailed(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onStartRedirection(Campaign campaign, String str) {
                int i92;
                int i10;
                if (BaseSplashPopView.this.f18029i == 1) {
                    int min = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                    int a6 = (ai.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(min / 4, 70), min)) / 2;
                    i92 = ai.a(BaseSplashPopView.this.getContext(), 23.0f) + a6;
                    i10 = ai.a(BaseSplashPopView.this.getContext(), 10.0f) + a6;
                } else {
                    i92 = 0;
                    i10 = 0;
                }
                ah.a(campaign, BaseSplashPopView.this, i92, i10);
            }
        };
        this.f18039u = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.f18035q != null) {
                    if (BaseSplashPopView.this.f18036r == 0) {
                        BaseSplashPopView.this.f18036r = -1;
                        BaseSplashPopView.this.g();
                        BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                        baseSplashPopView.f18025d.removeCallbacks(baseSplashPopView.f18039u);
                        BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                        d dVar2 = baseSplashPopView2.f18024c;
                        if (dVar2 != null) {
                            dVar2.a(new MBridgeIds(baseSplashPopView2.f18023a, baseSplashPopView2.b), 5);
                            return;
                        }
                        return;
                    }
                    BaseSplashPopView.i(BaseSplashPopView.this);
                    BaseSplashPopView.this.f18035q.setText(String.valueOf(BaseSplashPopView.this.f18036r));
                    BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                    baseSplashPopView3.f18025d.postDelayed(baseSplashPopView3.f18039u, 1000L);
                }
            }
        };
        this.f18040v = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.6
            @Override // java.lang.Runnable
            public final void run() {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                d dVar2 = baseSplashPopView.f18024c;
                if (dVar2 != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.f18023a, baseSplashPopView.b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f18029i);
                }
            }
        };
        this.f18027f = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                if (baseSplashPopView.f18024c != null) {
                    baseSplashPopView.a(baseSplashPopView.f18030j);
                }
            }
        };
        this.f18028g = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView;
                d dVar2;
                if (BaseSplashPopView.this.f18036r <= 0 && (dVar2 = (baseSplashPopView = BaseSplashPopView.this).f18024c) != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.f18023a, baseSplashPopView.b), 4);
                }
            }
        };
        this.f18029i = 1;
        ad.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public final void b(CampaignEx campaignEx) {
        if (this.f18026e == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(c.m().c(), this.b);
            this.f18026e = aVar;
            aVar.a(this.f18038t);
        }
        campaignEx.setCampaignUnitId(this.b);
        this.f18026e.a(campaignEx);
        if (!campaignEx.isReportClick()) {
            campaignEx.setReportClick(true);
            com.mbridge.msdk.splash.e.a.a(c.m().c(), campaignEx);
        }
        d dVar = this.f18024c;
        if (dVar != null) {
            dVar.b(new MBridgeIds(this.f18023a, this.b));
            this.f18024c.a(new MBridgeIds(this.f18023a, this.b), 6);
        }
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        this.f18029i = 1;
        this.f18036r = -1;
        this.f18025d = new Handler();
        this.f18037s = false;
        this.f18038t = new i() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.1
            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onFinishRedirection(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onRedirectionFailed(Campaign campaign, String str) {
                if (campaign == null) {
                    return;
                }
                ah.a(campaign, BaseSplashPopView.this);
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onStartRedirection(Campaign campaign, String str) {
                int i92;
                int i102;
                if (BaseSplashPopView.this.f18029i == 1) {
                    int min = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                    int a6 = (ai.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(min / 4, 70), min)) / 2;
                    i92 = ai.a(BaseSplashPopView.this.getContext(), 23.0f) + a6;
                    i102 = ai.a(BaseSplashPopView.this.getContext(), 10.0f) + a6;
                } else {
                    i92 = 0;
                    i102 = 0;
                }
                ah.a(campaign, BaseSplashPopView.this, i92, i102);
            }
        };
        this.f18039u = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.f18035q != null) {
                    if (BaseSplashPopView.this.f18036r == 0) {
                        BaseSplashPopView.this.f18036r = -1;
                        BaseSplashPopView.this.g();
                        BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                        baseSplashPopView.f18025d.removeCallbacks(baseSplashPopView.f18039u);
                        BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                        d dVar2 = baseSplashPopView2.f18024c;
                        if (dVar2 != null) {
                            dVar2.a(new MBridgeIds(baseSplashPopView2.f18023a, baseSplashPopView2.b), 5);
                            return;
                        }
                        return;
                    }
                    BaseSplashPopView.i(BaseSplashPopView.this);
                    BaseSplashPopView.this.f18035q.setText(String.valueOf(BaseSplashPopView.this.f18036r));
                    BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                    baseSplashPopView3.f18025d.postDelayed(baseSplashPopView3.f18039u, 1000L);
                }
            }
        };
        this.f18040v = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.6
            @Override // java.lang.Runnable
            public final void run() {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                d dVar2 = baseSplashPopView.f18024c;
                if (dVar2 != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.f18023a, baseSplashPopView.b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f18029i);
                }
            }
        };
        this.f18027f = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                if (baseSplashPopView.f18024c != null) {
                    baseSplashPopView.a(baseSplashPopView.f18030j);
                }
            }
        };
        this.f18028g = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView;
                d dVar2;
                if (BaseSplashPopView.this.f18036r <= 0 && (dVar2 = (baseSplashPopView = BaseSplashPopView.this).f18024c) != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.f18023a, baseSplashPopView.b), 4);
                }
            }
        };
        this.f18029i = 1;
        ad.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }
}
