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

/* loaded from: classes4.dex */
public class BaseSplashPopView extends RelativeLayout {
    public static final int TYPE_POP_DEFAULT = 1;
    public static final int TYPE_POP_LARGE = 4;
    public static final int TYPE_POP_MEDIUM = 3;
    public static final int TYPE_POP_SMALL = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicInteger f15292h = new AtomicInteger(1);
    protected String a;

    /* renamed from: b, reason: collision with root package name */
    protected String f15293b;

    /* renamed from: c, reason: collision with root package name */
    protected d f15294c;

    /* renamed from: d, reason: collision with root package name */
    protected Handler f15295d;

    /* renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f15296e;

    /* renamed from: f, reason: collision with root package name */
    View.OnClickListener f15297f;

    /* renamed from: g, reason: collision with root package name */
    View.OnClickListener f15298g;

    /* renamed from: i, reason: collision with root package name */
    private int f15299i;

    /* renamed from: j, reason: collision with root package name */
    private CampaignEx f15300j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f15301k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f15302l;

    /* renamed from: m, reason: collision with root package name */
    private ImageView f15303m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView f15304n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f15305o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f15306p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f15307q;

    /* renamed from: r, reason: collision with root package name */
    private int f15308r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f15309s;

    /* renamed from: t, reason: collision with root package name */
    private i f15310t;
    private Runnable u;

    /* renamed from: v, reason: collision with root package name */
    private Runnable f15311v;

    /* loaded from: classes4.dex */
    public static class a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private String f15313b;

        /* renamed from: c, reason: collision with root package name */
        private int f15314c;

        /* renamed from: d, reason: collision with root package name */
        private CampaignEx f15315d;

        public a(String str, String str2, int i10, CampaignEx campaignEx) {
            this.a = str;
            this.f15313b = str2;
            this.f15314c = i10;
            this.f15315d = campaignEx;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.f15313b;
        }

        public final int c() {
            return this.f15314c;
        }

        public final CampaignEx d() {
            return this.f15315d;
        }
    }

    public BaseSplashPopView(Context context, a aVar, d dVar) {
        super(context);
        this.f15299i = 1;
        this.f15308r = -1;
        this.f15295d = new Handler();
        this.f15309s = false;
        this.f15310t = new i() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.1
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
                int i10;
                int i11;
                if (BaseSplashPopView.this.f15299i == 1) {
                    int min = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                    int a10 = (ai.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(min / 4, 70), min)) / 2;
                    i10 = ai.a(BaseSplashPopView.this.getContext(), 23.0f) + a10;
                    i11 = ai.a(BaseSplashPopView.this.getContext(), 10.0f) + a10;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                ah.a(campaign, BaseSplashPopView.this, i10, i11);
            }
        };
        this.u = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.f15307q != null) {
                    if (BaseSplashPopView.this.f15308r == 0) {
                        BaseSplashPopView.this.f15308r = -1;
                        BaseSplashPopView.this.g();
                        BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                        baseSplashPopView.f15295d.removeCallbacks(baseSplashPopView.u);
                        BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                        d dVar2 = baseSplashPopView2.f15294c;
                        if (dVar2 != null) {
                            dVar2.a(new MBridgeIds(baseSplashPopView2.a, baseSplashPopView2.f15293b), 5);
                            return;
                        }
                        return;
                    }
                    BaseSplashPopView.i(BaseSplashPopView.this);
                    BaseSplashPopView.this.f15307q.setText(String.valueOf(BaseSplashPopView.this.f15308r));
                    BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                    baseSplashPopView3.f15295d.postDelayed(baseSplashPopView3.u, 1000L);
                }
            }
        };
        this.f15311v = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.6
            @Override // java.lang.Runnable
            public final void run() {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                d dVar2 = baseSplashPopView.f15294c;
                if (dVar2 != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.a, baseSplashPopView.f15293b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f15299i);
                }
            }
        };
        this.f15297f = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                if (baseSplashPopView.f15294c != null) {
                    baseSplashPopView.a(baseSplashPopView.f15300j);
                }
            }
        };
        this.f15298g = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView;
                d dVar2;
                if (BaseSplashPopView.this.f15308r <= 0 && (dVar2 = (baseSplashPopView = BaseSplashPopView.this).f15294c) != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.a, baseSplashPopView.f15293b), 4);
                }
            }
        };
        if (aVar != null) {
            this.f15293b = aVar.b();
            this.a = aVar.a();
            this.f15299i = aVar.c();
            this.f15300j = aVar.d();
            this.f15294c = dVar;
            a();
            return;
        }
        throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = f15292h;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    public static /* synthetic */ int i(BaseSplashPopView baseSplashPopView) {
        int i10 = baseSplashPopView.f15308r;
        baseSplashPopView.f15308r = i10 - 1;
        return i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15294c != null) {
            postDelayed(this.f15311v, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public void pauseCountDown() {
        this.f15309s = true;
        if (this.f15307q != null) {
            this.f15295d.removeCallbacks(this.u);
        }
    }

    public void reStartCountDown() {
        if (this.f15309s) {
            this.f15309s = false;
            int i10 = this.f15308r;
            if (i10 != -1 && i10 != 0) {
                TextView textView = this.f15307q;
                if (textView != null) {
                    textView.setText(String.valueOf(i10));
                    this.f15295d.postDelayed(this.u, 1000L);
                    return;
                }
                return;
            }
            g();
        }
    }

    public void release() {
        try {
            this.f15295d.removeCallbacks(this.f15311v);
            this.f15295d.removeCallbacks(this.u);
            this.u = null;
            detachAllViewsFromParent();
            this.f15300j = null;
            this.f15294c = null;
        } catch (Exception e2) {
            ad.b("MBSplashPopView", e2.getMessage());
        }
    }

    public void setPopViewType(a aVar, d dVar) {
        if (aVar != null) {
            this.f15293b = aVar.b();
            this.a = aVar.a();
            this.f15299i = aVar.c();
            this.f15300j = aVar.d();
            this.f15294c = dVar;
            a();
            return;
        }
        throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
    }

    public void startCountDown() {
        this.f15295d.removeCallbacks(this.u);
        CampaignEx campaignEx = this.f15300j;
        if (campaignEx != null && this.f15299i == 1) {
            int flbSkipTime = campaignEx.getFlbSkipTime();
            if (flbSkipTime > 0) {
                this.f15308r = flbSkipTime;
                TextView textView = this.f15307q;
                if (textView != null) {
                    textView.setText(String.valueOf(flbSkipTime));
                    this.f15295d.postDelayed(this.u, 1000L);
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
        this.f15301k = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ai.a(getContext(), 60.0f), ai.a(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = ai.a(getContext(), 7.0f);
        layoutParams2.leftMargin = ai.a(getContext(), 10.0f);
        this.f15301k.setId(generateViewId());
        this.f15301k.setLayoutParams(layoutParams2);
        this.f15301k.setScaleType(ImageView.ScaleType.FIT_CENTER);
        CampaignEx campaignEx = this.f15300j;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getIconUrl())) {
            a(this.f15300j.getIconUrl(), true);
        }
        this.f15307q = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = ai.a(getContext(), 62.0f);
        layoutParams3.bottomMargin = ai.a(getContext(), 70.0f);
        this.f15307q.setId(generateViewId());
        this.f15307q.setTextSize(10.0f);
        this.f15307q.setTextColor(-1);
        this.f15307q.setGravity(17);
        this.f15307q.setMinWidth(ai.a(getContext(), 16.0f));
        this.f15307q.setMaxHeight(ai.a(getContext(), 16.0f));
        this.f15307q.setLayoutParams(layoutParams3);
        this.f15307q.setBackgroundResource(getResources().getIdentifier("mbridge_cm_circle_50black", "drawable", c.m().g()));
        addView(imageView);
        addView(this.f15307q);
        addView(this.f15301k);
        CampaignEx campaignEx2 = this.f15300j;
        if (campaignEx2 != null && campaignEx2.getFlbSkipTime() <= 0) {
            g();
        }
        setOnClickListener(this.f15297f);
        this.f15307q.setOnClickListener(this.f15298g);
    }

    private void c() {
        int a10 = ai.a(getContext(), 4.0f);
        this.f15301k = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 28.0f), ai.a(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.f15301k.setId(generateViewId());
        this.f15301k.setLayoutParams(layoutParams);
        this.f15301k.setPadding(a10, a10, a10, a10);
        this.f15301k.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        a(this.f15300j.getIconUrl(), false);
        TextView textView = new TextView(getContext());
        this.f15305o = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f15301k.getId());
        layoutParams2.addRule(6, this.f15301k.getId());
        layoutParams2.addRule(8, this.f15301k.getId());
        layoutParams2.leftMargin = ai.a(getContext(), 4.0f);
        layoutParams2.rightMargin = ai.a(getContext(), 40.0f);
        this.f15305o.setLayoutParams(layoutParams2);
        this.f15305o.setGravity(16);
        this.f15305o.setTextSize(10.0f);
        this.f15305o.setSelected(true);
        this.f15305o.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f15305o.setMarqueeRepeatLimit(-1);
        this.f15305o.setSingleLine(true);
        this.f15305o.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f15305o.setText(this.f15300j.getAppName());
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", c.m().g()));
        addView(this.f15301k);
        addView(this.f15305o);
        f();
        setOnClickListener(this.f15297f);
    }

    private void d() {
        int a10 = ai.a(getContext(), 4.0f);
        this.f15301k = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 50.0f), ai.a(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.f15301k.setId(generateViewId());
        this.f15301k.setLayoutParams(layoutParams);
        this.f15301k.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f15301k.setPadding(a10, a10, a10, a10);
        a(this.f15300j.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.f15301k.getId());
        layoutParams2.addRule(6, this.f15301k.getId());
        layoutParams2.addRule(8, this.f15301k.getId());
        layoutParams2.leftMargin = ai.a(getContext(), 8.0f);
        layoutParams2.rightMargin = ai.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f15305o = textView;
        textView.setId(generateViewId());
        this.f15305o.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f15305o.setGravity(16);
        this.f15305o.setTextSize(12.0f);
        this.f15305o.setSelected(true);
        this.f15305o.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f15305o.setMarqueeRepeatLimit(-1);
        this.f15305o.setSingleLine(true);
        this.f15305o.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f15305o.setText(this.f15300j.getAppName());
        TextView textView2 = new TextView(getContext());
        this.f15306p = textView2;
        textView2.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.f15305o.getId());
        layoutParams3.addRule(3, this.f15305o.getId());
        layoutParams3.topMargin = ai.a(getContext(), 4.0f);
        layoutParams3.rightMargin = ai.a(getContext(), 36.0f);
        this.f15306p.setGravity(16);
        this.f15306p.setLayoutParams(layoutParams3);
        this.f15306p.setTextSize(8.0f);
        this.f15306p.setTextColor(-10066330);
        this.f15306p.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f15306p.setMarqueeRepeatLimit(-1);
        this.f15306p.setSelected(true);
        this.f15306p.setSingleLine(true);
        this.f15306p.setText(this.f15300j.getAppDesc());
        relativeLayout.addView(this.f15305o);
        relativeLayout.addView(this.f15306p);
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", c.m().g()));
        addView(this.f15301k);
        addView(relativeLayout);
        f();
        setOnClickListener(this.f15297f);
    }

    private void e() {
        this.f15303m = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ai.a(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.f15303m.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f15303m.setId(generateViewId());
        this.f15303m.setLayoutParams(layoutParams);
        a(this.f15300j.getImageUrl());
        this.f15302l = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, ai.a(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.f15302l.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f15302l.setId(generateViewId());
        this.f15302l.setLayoutParams(layoutParams2);
        b(this.f15300j.getImageUrl());
        this.f15301k = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(ai.a(getContext(), 50.0f), ai.a(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.f15303m.getId());
        layoutParams3.topMargin = 20;
        this.f15301k.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f15301k.setId(generateViewId());
        this.f15301k.setLayoutParams(layoutParams3);
        a(this.f15300j.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.f15301k.getId());
        layoutParams4.addRule(6, this.f15301k.getId());
        layoutParams4.addRule(8, this.f15301k.getId());
        layoutParams4.leftMargin = ai.a(getContext(), 8.0f);
        layoutParams4.rightMargin = ai.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f15305o = textView;
        textView.setId(generateViewId());
        this.f15305o.setGravity(16);
        this.f15305o.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f15305o.setTextSize(12.0f);
        this.f15305o.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f15305o.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f15305o.setMarqueeRepeatLimit(-1);
        this.f15305o.setSelected(true);
        this.f15305o.setSingleLine(true);
        this.f15305o.setText(this.f15300j.getAppName());
        TextView textView2 = new TextView(getContext());
        this.f15306p = textView2;
        textView2.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.f15305o.getId());
        layoutParams5.addRule(3, this.f15305o.getId());
        layoutParams5.topMargin = ai.a(getContext(), 4.0f);
        layoutParams5.rightMargin = ai.a(getContext(), 36.0f);
        this.f15306p.setGravity(16);
        this.f15306p.setLayoutParams(layoutParams5);
        this.f15306p.setTextSize(8.0f);
        this.f15306p.setTextColor(-10066330);
        this.f15306p.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f15306p.setMarqueeRepeatLimit(-1);
        this.f15306p.setSelected(true);
        this.f15306p.setSingleLine(true);
        this.f15306p.setText(this.f15300j.getAppDesc());
        relativeLayout.addView(this.f15305o);
        relativeLayout.addView(this.f15306p);
        addView(this.f15303m);
        addView(this.f15302l);
        addView(this.f15301k);
        addView(relativeLayout);
        f();
        setOnClickListener(this.f15297f);
    }

    private void f() {
        String str;
        int identifier;
        this.f15304n = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 32.0f), ai.a(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.f15301k.getId());
        this.f15304n.setLayoutParams(layoutParams);
        try {
            str = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th2) {
            ad.b("MBSplashPopView", th2.getMessage());
            str = "ZH";
        }
        if (!str.toUpperCase().equals("CN") && !str.toUpperCase().equals("ZH")) {
            identifier = getResources().getIdentifier("mbridge_splash_pop_ad_en", "drawable", c.m().g());
        } else {
            identifier = getResources().getIdentifier("mbridge_splash_pop_ad", "drawable", c.m().g());
        }
        this.f15304n.setBackgroundResource(identifier);
        addView(this.f15304n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TextView textView = this.f15307q;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = ai.a(getContext(), 16.0f);
            layoutParams.height = ai.a(getContext(), 16.0f);
            this.f15307q.setLayoutParams(layoutParams);
            this.f15307q.setText("");
            this.f15307q.setSelected(true);
            this.f15307q.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_close", "drawable", c.m().g()));
        }
    }

    private void a() {
        if (this.f15300j == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i10 = this.f15299i;
        if (i10 == 1) {
            b();
            return;
        }
        if (i10 == 2) {
            c();
        } else if (i10 == 3) {
            d();
        } else {
            if (i10 != 4) {
                return;
            }
            e();
        }
    }

    private void a(String str, final boolean z10) {
        b.a(c.m().c()).a(str, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.2
            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onFailedLoad(String str2, String str3) {
                ad.b("MBSplashPopView", str2);
            }

            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onSuccessLoad(Bitmap bitmap, String str2) {
                Bitmap a10;
                try {
                    if (!bitmap.isRecycled()) {
                        if (z10) {
                            if (!bitmap.isRecycled()) {
                                int width = bitmap.getWidth();
                                a10 = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_4444);
                                Canvas canvas = new Canvas(a10);
                                Paint paint = new Paint();
                                paint.setAntiAlias(true);
                                canvas.drawCircle(width / 2, width / 2, width / 2, paint);
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                            } else {
                                a10 = null;
                            }
                        } else {
                            a10 = ac.a(bitmap, 1, 16);
                        }
                        ImageView imageView = BaseSplashPopView.this.f15301k;
                        if (a10 != null) {
                            bitmap = a10;
                        }
                        imageView.setImageBitmap(bitmap);
                    }
                } catch (Throwable th2) {
                    ad.b("MBSplashPopView", th2.getMessage());
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
                        BaseSplashPopView.this.f15303m.setImageBitmap(o.a(bitmap, 10));
                    }
                } catch (Throwable th2) {
                    ad.b("MBSplashPopView", th2.getMessage());
                }
            }
        });
    }

    public void a(CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.foundation.same.report.d.c.a().d("key=" + URLEncoder.encode("2000092", "utf-8") + "&rid=" + URLEncoder.encode(campaignEx.getRequestId(), "utf-8") + "&rid_n=" + URLEncoder.encode(campaignEx.getRequestIdNotice(), "utf-8") + "&cid=" + URLEncoder.encode(campaignEx.getId(), "utf-8") + "&unit_id=" + URLEncoder.encode(this.f15293b, "utf-8") + "&network_type=" + URLEncoder.encode(String.valueOf(z.l(c.m().c())), "utf-8"));
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public BaseSplashPopView(Context context) {
        super(context);
        this.f15299i = 1;
        this.f15308r = -1;
        this.f15295d = new Handler();
        this.f15309s = false;
        this.f15310t = new i() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.1
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
                int i10;
                int i11;
                if (BaseSplashPopView.this.f15299i == 1) {
                    int min = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                    int a10 = (ai.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(min / 4, 70), min)) / 2;
                    i10 = ai.a(BaseSplashPopView.this.getContext(), 23.0f) + a10;
                    i11 = ai.a(BaseSplashPopView.this.getContext(), 10.0f) + a10;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                ah.a(campaign, BaseSplashPopView.this, i10, i11);
            }
        };
        this.u = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.f15307q != null) {
                    if (BaseSplashPopView.this.f15308r == 0) {
                        BaseSplashPopView.this.f15308r = -1;
                        BaseSplashPopView.this.g();
                        BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                        baseSplashPopView.f15295d.removeCallbacks(baseSplashPopView.u);
                        BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                        d dVar2 = baseSplashPopView2.f15294c;
                        if (dVar2 != null) {
                            dVar2.a(new MBridgeIds(baseSplashPopView2.a, baseSplashPopView2.f15293b), 5);
                            return;
                        }
                        return;
                    }
                    BaseSplashPopView.i(BaseSplashPopView.this);
                    BaseSplashPopView.this.f15307q.setText(String.valueOf(BaseSplashPopView.this.f15308r));
                    BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                    baseSplashPopView3.f15295d.postDelayed(baseSplashPopView3.u, 1000L);
                }
            }
        };
        this.f15311v = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.6
            @Override // java.lang.Runnable
            public final void run() {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                d dVar2 = baseSplashPopView.f15294c;
                if (dVar2 != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.a, baseSplashPopView.f15293b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f15299i);
                }
            }
        };
        this.f15297f = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                if (baseSplashPopView.f15294c != null) {
                    baseSplashPopView.a(baseSplashPopView.f15300j);
                }
            }
        };
        this.f15298g = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView;
                d dVar2;
                if (BaseSplashPopView.this.f15308r <= 0 && (dVar2 = (baseSplashPopView = BaseSplashPopView.this).f15294c) != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.a, baseSplashPopView.f15293b), 4);
                }
            }
        };
        this.f15299i = 1;
        ad.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15299i = 1;
        this.f15308r = -1;
        this.f15295d = new Handler();
        this.f15309s = false;
        this.f15310t = new i() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.1
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
                int i10;
                int i11;
                if (BaseSplashPopView.this.f15299i == 1) {
                    int min = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                    int a10 = (ai.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(min / 4, 70), min)) / 2;
                    i10 = ai.a(BaseSplashPopView.this.getContext(), 23.0f) + a10;
                    i11 = ai.a(BaseSplashPopView.this.getContext(), 10.0f) + a10;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                ah.a(campaign, BaseSplashPopView.this, i10, i11);
            }
        };
        this.u = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.f15307q != null) {
                    if (BaseSplashPopView.this.f15308r == 0) {
                        BaseSplashPopView.this.f15308r = -1;
                        BaseSplashPopView.this.g();
                        BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                        baseSplashPopView.f15295d.removeCallbacks(baseSplashPopView.u);
                        BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                        d dVar2 = baseSplashPopView2.f15294c;
                        if (dVar2 != null) {
                            dVar2.a(new MBridgeIds(baseSplashPopView2.a, baseSplashPopView2.f15293b), 5);
                            return;
                        }
                        return;
                    }
                    BaseSplashPopView.i(BaseSplashPopView.this);
                    BaseSplashPopView.this.f15307q.setText(String.valueOf(BaseSplashPopView.this.f15308r));
                    BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                    baseSplashPopView3.f15295d.postDelayed(baseSplashPopView3.u, 1000L);
                }
            }
        };
        this.f15311v = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.6
            @Override // java.lang.Runnable
            public final void run() {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                d dVar2 = baseSplashPopView.f15294c;
                if (dVar2 != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.a, baseSplashPopView.f15293b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f15299i);
                }
            }
        };
        this.f15297f = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                if (baseSplashPopView.f15294c != null) {
                    baseSplashPopView.a(baseSplashPopView.f15300j);
                }
            }
        };
        this.f15298g = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView;
                d dVar2;
                if (BaseSplashPopView.this.f15308r <= 0 && (dVar2 = (baseSplashPopView = BaseSplashPopView.this).f15294c) != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.a, baseSplashPopView.f15293b), 4);
                }
            }
        };
        this.f15299i = 1;
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
                        BaseSplashPopView.this.f15302l.setImageBitmap(ac.a(bitmap, 1, 16));
                    }
                } catch (Throwable th2) {
                    ad.b("MBSplashPopView", th2.getMessage());
                }
            }
        });
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15299i = 1;
        this.f15308r = -1;
        this.f15295d = new Handler();
        this.f15309s = false;
        this.f15310t = new i() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.1
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
                int i102;
                int i11;
                if (BaseSplashPopView.this.f15299i == 1) {
                    int min = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                    int a10 = (ai.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(min / 4, 70), min)) / 2;
                    i102 = ai.a(BaseSplashPopView.this.getContext(), 23.0f) + a10;
                    i11 = ai.a(BaseSplashPopView.this.getContext(), 10.0f) + a10;
                } else {
                    i102 = 0;
                    i11 = 0;
                }
                ah.a(campaign, BaseSplashPopView.this, i102, i11);
            }
        };
        this.u = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.f15307q != null) {
                    if (BaseSplashPopView.this.f15308r == 0) {
                        BaseSplashPopView.this.f15308r = -1;
                        BaseSplashPopView.this.g();
                        BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                        baseSplashPopView.f15295d.removeCallbacks(baseSplashPopView.u);
                        BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                        d dVar2 = baseSplashPopView2.f15294c;
                        if (dVar2 != null) {
                            dVar2.a(new MBridgeIds(baseSplashPopView2.a, baseSplashPopView2.f15293b), 5);
                            return;
                        }
                        return;
                    }
                    BaseSplashPopView.i(BaseSplashPopView.this);
                    BaseSplashPopView.this.f15307q.setText(String.valueOf(BaseSplashPopView.this.f15308r));
                    BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                    baseSplashPopView3.f15295d.postDelayed(baseSplashPopView3.u, 1000L);
                }
            }
        };
        this.f15311v = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.6
            @Override // java.lang.Runnable
            public final void run() {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                d dVar2 = baseSplashPopView.f15294c;
                if (dVar2 != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.a, baseSplashPopView.f15293b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f15299i);
                }
            }
        };
        this.f15297f = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                if (baseSplashPopView.f15294c != null) {
                    baseSplashPopView.a(baseSplashPopView.f15300j);
                }
            }
        };
        this.f15298g = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView;
                d dVar2;
                if (BaseSplashPopView.this.f15308r <= 0 && (dVar2 = (baseSplashPopView = BaseSplashPopView.this).f15294c) != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.a, baseSplashPopView.f15293b), 4);
                }
            }
        };
        this.f15299i = 1;
        ad.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public final void b(CampaignEx campaignEx) {
        if (this.f15296e == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(c.m().c(), this.f15293b);
            this.f15296e = aVar;
            aVar.a(this.f15310t);
        }
        campaignEx.setCampaignUnitId(this.f15293b);
        this.f15296e.a(campaignEx);
        if (!campaignEx.isReportClick()) {
            campaignEx.setReportClick(true);
            com.mbridge.msdk.splash.e.a.a(c.m().c(), campaignEx);
        }
        d dVar = this.f15294c;
        if (dVar != null) {
            dVar.b(new MBridgeIds(this.a, this.f15293b));
            this.f15294c.a(new MBridgeIds(this.a, this.f15293b), 6);
        }
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f15299i = 1;
        this.f15308r = -1;
        this.f15295d = new Handler();
        this.f15309s = false;
        this.f15310t = new i() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.1
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
                int i102;
                int i112;
                if (BaseSplashPopView.this.f15299i == 1) {
                    int min = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                    int a10 = (ai.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(min / 4, 70), min)) / 2;
                    i102 = ai.a(BaseSplashPopView.this.getContext(), 23.0f) + a10;
                    i112 = ai.a(BaseSplashPopView.this.getContext(), 10.0f) + a10;
                } else {
                    i102 = 0;
                    i112 = 0;
                }
                ah.a(campaign, BaseSplashPopView.this, i102, i112);
            }
        };
        this.u = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.5
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseSplashPopView.this.f15307q != null) {
                    if (BaseSplashPopView.this.f15308r == 0) {
                        BaseSplashPopView.this.f15308r = -1;
                        BaseSplashPopView.this.g();
                        BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                        baseSplashPopView.f15295d.removeCallbacks(baseSplashPopView.u);
                        BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                        d dVar2 = baseSplashPopView2.f15294c;
                        if (dVar2 != null) {
                            dVar2.a(new MBridgeIds(baseSplashPopView2.a, baseSplashPopView2.f15293b), 5);
                            return;
                        }
                        return;
                    }
                    BaseSplashPopView.i(BaseSplashPopView.this);
                    BaseSplashPopView.this.f15307q.setText(String.valueOf(BaseSplashPopView.this.f15308r));
                    BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                    baseSplashPopView3.f15295d.postDelayed(baseSplashPopView3.u, 1000L);
                }
            }
        };
        this.f15311v = new Runnable() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.6
            @Override // java.lang.Runnable
            public final void run() {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                d dVar2 = baseSplashPopView.f15294c;
                if (dVar2 != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.a, baseSplashPopView.f15293b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f15299i);
                }
            }
        };
        this.f15297f = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                if (baseSplashPopView.f15294c != null) {
                    baseSplashPopView.a(baseSplashPopView.f15300j);
                }
            }
        };
        this.f15298g = new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.BaseSplashPopView.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashPopView baseSplashPopView;
                d dVar2;
                if (BaseSplashPopView.this.f15308r <= 0 && (dVar2 = (baseSplashPopView = BaseSplashPopView.this).f15294c) != null) {
                    dVar2.a(new MBridgeIds(baseSplashPopView.a, baseSplashPopView.f15293b), 4);
                }
            }
        };
        this.f15299i = 1;
        ad.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }
}
