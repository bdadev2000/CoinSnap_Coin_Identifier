package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.d.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.video.dynview.e.h;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.video.module.a.a.j;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.videocommon.view.StarLevelView;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public class MBridgeNativeEndCardView extends MBridgeNativeEndCardViewDiff {

    /* renamed from: A, reason: collision with root package name */
    private LinearLayout f18867A;

    /* renamed from: B, reason: collision with root package name */
    private Runnable f18868B;

    /* renamed from: C, reason: collision with root package name */
    private Runnable f18869C;

    /* renamed from: D, reason: collision with root package name */
    private RelativeLayout f18870D;

    /* renamed from: E, reason: collision with root package name */
    private b f18871E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f18872F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f18873G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f18874H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f18875I;

    /* renamed from: J, reason: collision with root package name */
    private int f18876J;

    /* renamed from: K, reason: collision with root package name */
    private AlphaAnimation f18877K;

    /* renamed from: L, reason: collision with root package name */
    private int f18878L;

    /* renamed from: M, reason: collision with root package name */
    private int f18879M;

    /* renamed from: N, reason: collision with root package name */
    private int f18880N;
    private int O;

    /* renamed from: P, reason: collision with root package name */
    private Bitmap f18881P;

    /* renamed from: Q, reason: collision with root package name */
    private View f18882Q;

    /* renamed from: R, reason: collision with root package name */
    private FeedBackButton f18883R;

    /* renamed from: S, reason: collision with root package name */
    private String f18884S;

    /* renamed from: T, reason: collision with root package name */
    private CampaignUnit f18885T;

    /* renamed from: U, reason: collision with root package name */
    private MBShakeView f18886U;

    /* renamed from: V, reason: collision with root package name */
    private com.mbridge.msdk.shake.b f18887V;

    /* renamed from: W, reason: collision with root package name */
    private MBridgeBaitClickView f18888W;
    private boolean aa;
    private int ab;
    private String ac;
    private ViewGroup m;

    /* renamed from: n, reason: collision with root package name */
    private ViewGroup f18889n;

    /* renamed from: o, reason: collision with root package name */
    private RelativeLayout f18890o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f18891p;

    /* renamed from: q, reason: collision with root package name */
    private ImageView f18892q;

    /* renamed from: r, reason: collision with root package name */
    private ImageView f18893r;

    /* renamed from: s, reason: collision with root package name */
    private ImageView f18894s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f18895t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f18896u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f18897v;

    /* renamed from: w, reason: collision with root package name */
    private TextView f18898w;

    /* renamed from: x, reason: collision with root package name */
    private TextView f18899x;

    /* renamed from: y, reason: collision with root package name */
    private TextView f18900y;

    /* renamed from: z, reason: collision with root package name */
    private LinearLayout f18901z;

    public MBridgeNativeEndCardView(Context context) {
        super(context);
        this.f18872F = false;
        this.f18873G = false;
        this.f18874H = false;
        this.f18875I = false;
        this.f18876J = 0;
        this.aa = false;
        this.ab = 1;
    }

    public static /* synthetic */ void p(MBridgeNativeEndCardView mBridgeNativeEndCardView) {
        CampaignEx campaignEx = mBridgeNativeEndCardView.b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(mBridgeNativeEndCardView.f18884S);
            com.mbridge.msdk.foundation.d.b.a().a(AbstractC2914a.h(new StringBuilder(), mBridgeNativeEndCardView.f18884S, "_2"), mBridgeNativeEndCardView.b);
        }
        if (com.mbridge.msdk.foundation.d.b.a().b()) {
            com.mbridge.msdk.foundation.d.b.a().a(AbstractC2914a.h(new StringBuilder(), mBridgeNativeEndCardView.f18884S, "_2"), new a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.4
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                    MBridgeNativeEndCardView.this.f18875I = true;
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    MBridgeNativeEndCardView.this.f18875I = false;
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    MBridgeNativeEndCardView.this.f18875I = false;
                }
            });
            com.mbridge.msdk.foundation.d.b.a().c(mBridgeNativeEndCardView.f18884S + "_1");
            if (mBridgeNativeEndCardView.f18883R != null) {
                com.mbridge.msdk.foundation.d.b.a().a(AbstractC2914a.h(new StringBuilder(), mBridgeNativeEndCardView.f18884S, "_2"), mBridgeNativeEndCardView.f18883R);
                return;
            }
            return;
        }
        FeedBackButton feedBackButton = mBridgeNativeEndCardView.f18883R;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript create = RenderScript.create(this.f18768a.getApplicationContext());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(25.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean canBackPress() {
        View view = this.f18882Q;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void clearMoreOfferBitmap() {
        CampaignUnit campaignUnit;
        CampaignEx campaignEx = this.b;
        if (campaignEx != null && campaignEx.isDynamicView() && (campaignUnit = this.f18885T) != null && campaignUnit.getAds() != null && this.f18885T.getAds().size() > 0) {
            Iterator<CampaignEx> it = this.f18885T.getAds().iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (!TextUtils.isEmpty(next.getIconUrl())) {
                    com.mbridge.msdk.foundation.same.c.b.a(c.m().c());
                    next.getIconUrl();
                }
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    public boolean isDyXmlSuccess() {
        return this.aa;
    }

    public void notifyShowListener() {
        this.notifyListener.a(110, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int parseInt;
        int parseInt2;
        int i9;
        MBridgeBaitClickView mBridgeBaitClickView;
        super.onAttachedToWindow();
        if (this.f18868B == null) {
            this.f18868B = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBridgeNativeEndCardView.this.f18873G = true;
                    if (MBridgeNativeEndCardView.this.f18882Q != null) {
                        MBridgeNativeEndCardView.this.f18882Q.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.f18868B;
        if (runnable != null) {
            postDelayed(runnable, this.f18876J * 1000);
            if (!this.f18874H) {
                this.f18874H = true;
            }
            try {
                CampaignEx campaignEx = this.b;
                if (campaignEx != null && campaignEx.isDynamicView()) {
                    String str = this.b.getendcard_url();
                    if (TextUtils.isEmpty(str)) {
                        str = this.b.getEndScreenUrl();
                    }
                    String a6 = ao.a(str, "alac");
                    if (!TextUtils.isEmpty(a6) && a6.equals("1") && this.b.getAutoShowStoreMiniCard() != 1) {
                        postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.8
                            @Override // java.lang.Runnable
                            public final void run() {
                                MBridgeNativeEndCardView.this.b.setTriggerClickSource(2);
                                MBridgeNativeEndCardView.this.b.setClickType(1);
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 2);
                            }
                        }, 1000L);
                    }
                }
            } catch (Throwable th) {
                ad.b(MBridgeBaseView.TAG, th.getMessage());
            }
        }
        try {
            CampaignEx campaignEx2 = this.b;
            if (campaignEx2 != null && campaignEx2.isDynamicView()) {
                String str2 = this.b.getendcard_url();
                if (TextUtils.isEmpty(str2)) {
                    str2 = this.b.getEndScreenUrl();
                }
                String a9 = ao.a(str2, "bait_click");
                try {
                    i9 = Integer.parseInt(a9);
                } catch (Throwable th2) {
                    ad.b(MBridgeBaseView.TAG, th2.getMessage());
                    i9 = 1;
                }
                if (!TextUtils.isEmpty(a9) && i9 != 0 && (mBridgeBaitClickView = this.f18888W) != null) {
                    mBridgeBaitClickView.setVisibility(0);
                    this.f18888W.init(1342177280, i9);
                    if (this.b.getEcTemplateId() == 1302) {
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(0);
                        gradientDrawable.setColor(1342177280);
                        gradientDrawable.setStroke(0, -65536);
                        gradientDrawable.setCornerRadius(25.0f);
                        this.f18888W.setBackground(gradientDrawable);
                    }
                    this.f18888W.startAnimation();
                    this.f18888W.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MBridgeNativeEndCardView.this.b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                        }
                    });
                }
            }
        } catch (Throwable th3) {
            ad.b(MBridgeBaseView.TAG, th3.getMessage());
        }
        try {
            CampaignEx campaignEx3 = this.b;
            if (campaignEx3 != null && campaignEx3.isDynamicView()) {
                String str3 = this.b.getendcard_url();
                if (TextUtils.isEmpty(str3)) {
                    str3 = this.b.getEndScreenUrl();
                }
                String a10 = ao.a(str3, "shake_show");
                String a11 = ao.a(str3, "shake_strength");
                String a12 = ao.a(str3, "shake_time");
                if (!TextUtils.isEmpty(a10) && a10.equals("1") && this.f18886U == null) {
                    MBridgeBaitClickView mBridgeBaitClickView2 = this.f18888W;
                    if (mBridgeBaitClickView2 != null) {
                        mBridgeBaitClickView2.setVisibility(8);
                    }
                    MBShakeView mBShakeView = new MBShakeView(getContext());
                    this.f18886U = mBShakeView;
                    mBShakeView.initView(this.b.getAdCall(), true);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (!isLandscape()) {
                        layoutParams.addRule(2, filterFindViewId(this.aa, "mbridge_iv_logo"));
                        layoutParams.addRule(14);
                        this.f18886U.setPadding(0, 0, 0, ai.a(getContext(), 20.0f));
                    } else {
                        layoutParams.addRule(13);
                    }
                    this.f18886U.setLayoutParams(layoutParams);
                    RelativeLayout relativeLayout = this.f18890o;
                    if (relativeLayout != null && relativeLayout.isShown()) {
                        this.f18890o.addView(this.f18886U);
                        TextView textView = this.ctaView;
                        if (textView != null) {
                            textView.setVisibility(4);
                        }
                        this.ctaView.setVisibility(4);
                        this.f18886U.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                MBridgeNativeEndCardView.this.b.setTriggerClickSource(5);
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                            }
                        });
                        int i10 = 10;
                        if (!TextUtils.isEmpty(a11) && (parseInt2 = Integer.parseInt(a11)) > 0) {
                            i10 = parseInt2;
                        }
                        int i11 = 5000;
                        if (!TextUtils.isEmpty(a12) && (parseInt = Integer.parseInt(a12)) > 0) {
                            i11 = parseInt * 1000;
                        }
                        this.f18887V = new com.mbridge.msdk.shake.b(i10, i11) { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.6
                            @Override // com.mbridge.msdk.shake.b
                            public final void a() {
                                if ((com.mbridge.msdk.e.b.a() && MBridgeNativeEndCardView.this.checkChinaShakeState()) || MBridgeNativeEndCardView.this.f18875I || !MBridgeNativeEndCardView.this.f18874H) {
                                    return;
                                }
                                MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                                mBridgeNativeEndCardView.f18772f = 0.0f;
                                mBridgeNativeEndCardView.f18773g = 0.0f;
                                mBridgeNativeEndCardView.b.setTriggerClickSource(5);
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 4);
                            }
                        };
                        com.mbridge.msdk.shake.a.a().a(this.f18887V);
                    }
                }
            }
        } catch (Throwable th4) {
            ad.b(MBridgeBaseView.TAG, th4.getMessage());
        }
        try {
            CampaignEx campaignEx4 = this.b;
            if (campaignEx4 != null && campaignEx4.getAutoShowStoreMiniCard() != 0 && !TextUtils.isEmpty(this.b.getDeepLinkURL())) {
                long showStoreMiniCardDelayTime = this.b.getShowStoreMiniCardDelayTime();
                if (showStoreMiniCardDelayTime == 0) {
                    showStoreMiniCardDelayTime = 1;
                }
                if (this.f18869C == null) {
                    this.f18869C = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.9
                        @Override // java.lang.Runnable
                        public final void run() {
                            MBridgeNativeEndCardView.this.b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.this.b.setClickType(1);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 2);
                        }
                    };
                }
                postDelayed(this.f18869C, showStoreMiniCardDelayTime * 1000);
            }
        } catch (Throwable th5) {
            ad.b(MBridgeBaseView.TAG, th5.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f18868B;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f18869C;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        if (this.f18887V != null) {
            com.mbridge.msdk.shake.a.a().b(this.f18887V);
            this.f18887V = null;
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        CampaignEx campaignEx = this.b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            return;
        }
        RelativeLayout relativeLayout = this.f18870D;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(4);
        }
        int i9 = configuration.orientation;
        this.f18770d = i9;
        if (i9 == 2) {
            removeView(this.m);
            a(this.f18889n);
        } else {
            removeView(this.f18889n);
            a(this.m);
        }
    }

    public void preLoadData(b bVar) {
        this.f18871E = bVar;
        try {
            if (this.b != null && this.f18771e) {
                com.mbridge.msdk.foundation.same.c.b.a(this.f18768a.getApplicationContext()).a(this.b.getImageUrl(), new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.11
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onFailedLoad(String str, String str2) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        if (bitmap != null && !bitmap.isRecycled()) {
                            try {
                                if (MBridgeNativeEndCardView.this.f18892q != null) {
                                    MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                                    if (mBridgeNativeEndCardView.f18774h) {
                                        mBridgeNativeEndCardView.f18892q.setBackground(null);
                                    }
                                    MBridgeNativeEndCardView.this.f18892q.setImageBitmap(bitmap);
                                }
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, bitmap);
                            } catch (Throwable unused) {
                                if (MBridgeNativeEndCardView.this.f18891p != null) {
                                    MBridgeNativeEndCardView.this.f18891p.setVisibility(4);
                                }
                            }
                        }
                    }
                });
                com.mbridge.msdk.foundation.same.c.b.a(this.f18768a.getApplicationContext()).a(this.b.getIconUrl(), new j(this.f18893r, ai.a(c.m().c(), 8.0f)));
                this.f18898w.setText(this.b.getAppName());
                TextView textView = this.ctaView;
                if (textView != null) {
                    textView.setText(this.b.getAdCall());
                }
                TextView textView2 = this.f18899x;
                if (textView2 != null) {
                    textView2.setText(this.b.getAppDesc());
                }
                TextView textView3 = this.f18900y;
                if (textView3 != null) {
                    textView3.setText(this.b.getNumberRating() + ")");
                }
                this.f18901z.removeAllViews();
                double rating = this.b.getRating();
                if (rating <= 0.0d) {
                    rating = 5.0d;
                }
                LinearLayout linearLayout = this.f18901z;
                if (linearLayout instanceof StarLevelView) {
                    ((StarLevelView) linearLayout).initScore(rating);
                }
                LinearLayout linearLayout2 = this.f18901z;
                if (linearLayout2 instanceof MBridgeLevelLayoutView) {
                    ((MBridgeLevelLayoutView) linearLayout2).setRatingAndUser(rating, this.b.getNumberRating());
                }
                LinearLayout linearLayout3 = this.f18901z;
                if (linearLayout3 instanceof MBStarLevelLayoutView) {
                    ((MBStarLevelLayoutView) linearLayout3).setRating((int) rating);
                }
                LinearLayout linearLayout4 = this.f18867A;
                if (linearLayout4 != null && (linearLayout4 instanceof MBHeatLevelLayoutView)) {
                    ((MBHeatLevelLayoutView) linearLayout4).setHeatCount(this.b.getNumberRating());
                }
                if (!TextUtils.isEmpty(this.b.getendcard_url()) && this.b.getendcard_url().contains("alecfc=1")) {
                    this.f18872F = true;
                }
                String language = Locale.getDefault().getLanguage();
                if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                    this.f18894s.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", c.m().g())));
                    this.ac = "广告";
                } else {
                    this.f18894s.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_en", "drawable", c.m().g())));
                    this.ac = "AD";
                }
                if (this.ab == 0) {
                    ImageView imageView = this.f18894s;
                    if (imageView != null) {
                        imageView.setVisibility(4);
                    }
                    ImageView imageView2 = this.f18896u;
                    if (imageView2 != null) {
                        imageView2.setVisibility(4);
                    }
                    TextView textView4 = this.f18895t;
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                        this.f18895t.setText(this.ac);
                    }
                }
                ai.a(2, this.f18897v, this.b, this.f18768a, true, new a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.12
                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a() {
                        MBridgeNativeEndCardView.this.f18875I = true;
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void b() {
                        MBridgeNativeEndCardView.this.f18875I = false;
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a(String str) {
                        MBridgeNativeEndCardView.this.f18875I = false;
                    }
                });
                if (!this.f18873G) {
                    this.f18882Q.setVisibility(8);
                }
            }
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void release() {
        try {
            removeAllViews();
            AlphaAnimation alphaAnimation = this.f18877K;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            this.f18868B = null;
        } catch (Exception e4) {
            ad.b(MBridgeBaseView.TAG, e4.getMessage());
        }
    }

    public void setCloseBtnDelay(int i9) {
        this.f18876J = i9;
    }

    public void setLayout() {
        String str;
        if (this.f18774h) {
            if (com.mbridge.msdk.e.b.a()) {
                str = "cn_";
            } else {
                str = "en_";
            }
            com.mbridge.msdk.video.dynview.c a6 = new com.mbridge.msdk.video.dynview.j.c().a(getContext(), this.b, this.f18775i, str);
            this.ab = a6.n();
            com.mbridge.msdk.video.dynview.b.a().a(a6, new h() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.10
                @Override // com.mbridge.msdk.video.dynview.e.h
                public final void a(com.mbridge.msdk.video.dynview.a aVar) {
                    if (aVar != null) {
                        MBridgeNativeEndCardView.this.addView(aVar.a());
                        MBridgeNativeEndCardView.this.aa = aVar.c();
                        if (!MBridgeNativeEndCardView.this.ctaViewCanGet(aVar.a(), MBridgeNativeEndCardView.this.aa)) {
                            MBridgeNativeEndCardView.this.aa = false;
                            MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                            mBridgeNativeEndCardView.f18774h = false;
                            mBridgeNativeEndCardView.a();
                        } else {
                            MBridgeNativeEndCardView mBridgeNativeEndCardView2 = MBridgeNativeEndCardView.this;
                            mBridgeNativeEndCardView2.f18771e = mBridgeNativeEndCardView2.b(aVar.a());
                            MBridgeNativeEndCardView.this.b();
                        }
                        MBridgeNativeEndCardView mBridgeNativeEndCardView3 = MBridgeNativeEndCardView.this;
                        CampaignEx campaignEx = mBridgeNativeEndCardView3.b;
                        if (campaignEx != null) {
                            campaignEx.setECTemplateRenderSucc(mBridgeNativeEndCardView3.aa);
                        }
                    }
                }

                @Override // com.mbridge.msdk.video.dynview.e.h
                public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                    ad.b(MBridgeBaseView.TAG, "errorMsg:" + aVar.b());
                }
            });
            return;
        }
        a();
    }

    public void setMoreOfferCampaignUnit(CampaignUnit campaignUnit) {
        MBShakeView mBShakeView;
        CampaignEx campaignEx = this.b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            this.f18885T = campaignUnit;
            if (campaignUnit != null && campaignUnit.getAds() != null && this.f18885T.getAds().size() > 5 && (mBShakeView = this.f18886U) != null) {
                mBShakeView.setPadding(0, 0, 0, ai.a(getContext(), 5.0f));
            }
        }
    }

    public void setNotchPadding(int i9, int i10, int i11, int i12) {
        ad.b(MBridgeBaseView.TAG, "NOTCH NativeEndCard ".concat(String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12))));
        this.f18878L = i9;
        this.f18879M = i10;
        this.f18880N = i11;
        this.O = i12;
        f();
    }

    public void setOnPause() {
        this.f18874H = false;
    }

    public void setOnResume() {
        this.f18874H = true;
    }

    public void setUnitId(String str) {
        this.f18884S = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r1 = "mbridge_reward_endcard_native_half_landscape";
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        if (r6.f18776j != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r6.f18776j != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int e() {
        /*
            r6 = this;
            int r0 = r6.f18777k
            java.lang.String r1 = "mbridge_reward_endcard_native_land"
            java.lang.String r2 = "mbridge_reward_endcard_native_half_landscape"
            java.lang.String r3 = "mbridge_reward_endcard_native_hor"
            java.lang.String r4 = "mbridge_reward_endcard_native_half_portrait"
            if (r0 != 0) goto L1e
            boolean r0 = r6.f18776j
            if (r0 == 0) goto L11
            r3 = r4
        L11:
            boolean r0 = r6.isLandscape()
            if (r0 == 0) goto L31
            boolean r0 = r6.f18776j
            if (r0 == 0) goto L1c
        L1b:
            r1 = r2
        L1c:
            r3 = r1
            goto L31
        L1e:
            r5 = 1
            if (r0 != r5) goto L27
            boolean r5 = r6.f18776j
            if (r5 == 0) goto L29
            r3 = r4
            goto L29
        L27:
            java.lang.String r3 = ""
        L29:
            r4 = 2
            if (r0 != r4) goto L31
            boolean r0 = r6.f18776j
            if (r0 == 0) goto L1c
            goto L1b
        L31:
            int r0 = r6.findLayout(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.e():int");
    }

    private void f() {
        RelativeLayout relativeLayout;
        if (!this.f18771e || (relativeLayout = this.f18870D) == null) {
            return;
        }
        relativeLayout.postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.3
            @Override // java.lang.Runnable
            public final void run() {
                if (MBridgeNativeEndCardView.this.f18870D != null) {
                    CampaignEx campaignEx = MBridgeNativeEndCardView.this.b;
                    if (campaignEx != null && !campaignEx.isDynamicView() && MBridgeNativeEndCardView.this.b.getAdSpaceT() != 2) {
                        MBridgeNativeEndCardView.this.f18870D.setPadding(MBridgeNativeEndCardView.this.f18878L, MBridgeNativeEndCardView.this.f18880N, MBridgeNativeEndCardView.this.f18879M, MBridgeNativeEndCardView.this.O);
                        MBridgeNativeEndCardView.this.f18870D.startAnimation(MBridgeNativeEndCardView.this.f18877K);
                    }
                    MBridgeNativeEndCardView.this.f18870D.setVisibility(0);
                }
                if (MBridgeNativeEndCardView.this.f18882Q != null && MBridgeNativeEndCardView.this.f18882Q.getVisibility() != 0 && MBridgeNativeEndCardView.this.f18873G) {
                    MBridgeNativeEndCardView.this.f18882Q.setVisibility(0);
                }
                MBridgeNativeEndCardView.p(MBridgeNativeEndCardView.this);
            }
        }, 200L);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        if (this.f18771e) {
            this.f18890o.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.14
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeNativeEndCardView.this.f18872F) {
                        MBridgeNativeEndCardView.this.b.setTriggerClickSource(2);
                        MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 1);
                    }
                }
            });
            this.f18882Q.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeNativeEndCardView.this.f18774h) {
                        try {
                            com.mbridge.msdk.video.dynview.moffer.a.a().b();
                        } catch (Exception e4) {
                            ad.b(MBridgeBaseView.TAG, e4.getMessage());
                        }
                        try {
                            CampaignEx campaignEx = MBridgeNativeEndCardView.this.b;
                            if (campaignEx != null) {
                                String a6 = ao.a(campaignEx.getendcard_url(), "ecid");
                                String a9 = ao.a(MBridgeNativeEndCardView.this.b.getendcard_url(), "mof");
                                d dVar = new d();
                                dVar.a("type", "choseFromTwoClose");
                                dVar.a("endcard_id", a6);
                                dVar.a("mof", a9);
                                com.mbridge.msdk.video.module.b.a.a("2000103", MBridgeNativeEndCardView.this.b, dVar);
                            }
                        } catch (Exception e9) {
                            if (MBridgeConstans.DEBUG) {
                                e9.printStackTrace();
                            }
                        }
                    }
                    try {
                        d dVar2 = new d();
                        dVar2.a("type", 2);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar2);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000134", MBridgeNativeEndCardView.this.b);
                    } catch (Throwable th) {
                        if (MBridgeConstans.DEBUG) {
                            th.printStackTrace();
                        }
                    }
                    MBridgeNativeEndCardView.this.notifyListener.a(104, "");
                }
            });
            TextView textView = this.ctaView;
            if (textView != null) {
                textView.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.16
                    @Override // com.mbridge.msdk.widget.a
                    public final void a(View view) {
                        MBridgeNativeEndCardView.this.b.setTriggerClickSource(1);
                        MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                    }
                });
            }
            this.f18893r.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.17
                @Override // com.mbridge.msdk.widget.a
                public final void a(View view) {
                    if (MBridgeNativeEndCardView.this.ctaView != null) {
                        if (!com.mbridge.msdk.e.b.a() || MBridgeNativeEndCardView.this.checkProgressBarIntercepted()) {
                            MBridgeNativeEndCardView.this.b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                        }
                    }
                }
            });
            this.f18892q.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.2
                @Override // com.mbridge.msdk.widget.a
                public final void a(View view) {
                    if (MBridgeNativeEndCardView.this.ctaView != null) {
                        if (!com.mbridge.msdk.e.b.a() || MBridgeNativeEndCardView.this.checkProgressBarIntercepted()) {
                            MBridgeNativeEndCardView.this.b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int e4 = e();
        if (e4 > 0) {
            this.f18771e = b(e4);
            b();
            CampaignEx campaignEx = this.b;
            if (campaignEx != null) {
                campaignEx.setECTemplateRenderSucc(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        c();
        if (!this.f18771e) {
            this.notifyListener.a(104, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f18877K = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18872F = false;
        this.f18873G = false;
        this.f18874H = false;
        this.f18875I = false;
        this.f18876J = 0;
        this.aa = false;
        this.ab = 1;
    }

    private void a(View view) {
        if (view == null) {
            setLayout();
            preLoadData(this.f18871E);
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            b(view);
            c();
        }
        f();
    }

    private boolean b(int i9) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f18769c.inflate(i9, (ViewGroup) null);
            this.f18889n = viewGroup;
            addView(viewGroup);
            return b(this.f18889n);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f18769c.inflate(i9, (ViewGroup) null);
        this.m = viewGroup2;
        addView(viewGroup2);
        return b(this.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view) {
        try {
            this.f18890o = (RelativeLayout) view.findViewById(filterFindViewId(this.aa, "mbridge_native_ec_layout"));
            this.f18892q = (ImageView) view.findViewById(filterFindViewId(this.aa, "mbridge_iv_adbanner"));
            this.f18893r = (ImageView) view.findViewById(filterFindViewId(this.aa, "mbridge_iv_icon"));
            this.f18894s = (ImageView) view.findViewById(filterFindViewId(this.aa, "mbridge_iv_flag"));
            this.f18895t = (TextView) view.findViewById(filterFindViewId(this.aa, "mbridge_tv_flag"));
            this.f18896u = (ImageView) view.findViewById(filterFindViewId(this.aa, "mbridge_iv_logo"));
            this.f18897v = (ImageView) view.findViewById(filterFindViewId(this.aa, "mbridge_iv_link"));
            this.f18898w = (TextView) view.findViewById(filterFindViewId(this.aa, "mbridge_tv_apptitle"));
            this.f18901z = (LinearLayout) view.findViewById(filterFindViewId(this.aa, "mbridge_sv_starlevel"));
            this.f18867A = (LinearLayout) view.findViewById(filterFindViewId(this.aa, "mbridge_sv_heat_count_level"));
            this.f18882Q = view.findViewById(filterFindViewId(this.aa, "mbridge_iv_close"));
            this.ctaView = (TextView) view.findViewById(filterFindViewId(this.aa, "mbridge_tv_cta"));
            this.f18883R = (FeedBackButton) view.findViewById(filterFindViewId(this.aa, "mbridge_native_endcard_feed_btn"));
            this.f18870D = (RelativeLayout) view.findViewById(filterFindViewId(this.aa, "mbridge_native_ec_controller"));
            this.f18891p = (ImageView) view.findViewById(filterFindViewId(this.aa, "mbridge_iv_adbanner_bg"));
            this.f18888W = (MBridgeBaitClickView) findViewById(filterFindViewId(this.aa, "mbridge_animation_click_view"));
            this.f18899x = (TextView) view.findViewById(filterFindViewId(this.aa, "mbridge_tv_appdesc"));
            if (this.f18774h) {
                ImageView imageView = this.f18892q;
                if (imageView != null && (imageView instanceof RoundImageView)) {
                    ((RoundImageView) imageView).setBorderRadius(10);
                }
                ImageView imageView2 = this.f18893r;
                if (imageView2 != null && (imageView2 instanceof RoundImageView)) {
                    ((RoundImageView) imageView2).setBorderRadius(10);
                }
                return isNotNULL(this.f18892q, this.f18893r, this.f18898w, this.f18901z, this.f18882Q, this.ctaView);
            }
            TextView textView = (TextView) view.findViewById(filterFindViewId(this.aa, "mbridge_tv_number"));
            this.f18900y = textView;
            return isNotNULL(this.f18892q, this.f18893r, this.f18898w, this.f18899x, textView, this.f18901z, this.f18882Q, this.ctaView);
        } catch (Throwable th) {
            ad.b(MBridgeBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet, boolean z8, int i9, boolean z9, int i10, int i11) {
        super(context, attributeSet, z8, i9, z9, i10, i11);
        this.f18872F = false;
        this.f18873G = false;
        this.f18874H = false;
        this.f18875I = false;
        this.f18876J = 0;
        this.aa = false;
        this.ab = 1;
    }

    public static /* synthetic */ void a(MBridgeNativeEndCardView mBridgeNativeEndCardView, final Bitmap bitmap) {
        try {
            com.mbridge.msdk.foundation.same.f.b.d().execute(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.13
                @Override // java.lang.Runnable
                public final void run() {
                    MBridgeNativeEndCardView mBridgeNativeEndCardView2 = MBridgeNativeEndCardView.this;
                    mBridgeNativeEndCardView2.f18881P = mBridgeNativeEndCardView2.blurBitmap(bitmap);
                    if (MBridgeNativeEndCardView.this.f18881P != null && !MBridgeNativeEndCardView.this.f18881P.isRecycled() && MBridgeNativeEndCardView.this.f18891p != null) {
                        MBridgeNativeEndCardView.this.f18891p.post(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.13.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                MBridgeNativeEndCardView mBridgeNativeEndCardView3 = MBridgeNativeEndCardView.this;
                                if (mBridgeNativeEndCardView3.f18774h) {
                                    mBridgeNativeEndCardView3.f18891p.setBackground(null);
                                }
                                ad.b("async", "执行异步加载图");
                                MBridgeNativeEndCardView.this.f18891p.setImageBitmap(MBridgeNativeEndCardView.this.f18881P);
                            }
                        });
                    }
                }
            });
        } catch (Exception e4) {
            ad.a(MBridgeBaseView.TAG, e4.getMessage());
        }
    }

    public static /* synthetic */ void a(MBridgeNativeEndCardView mBridgeNativeEndCardView, int i9) {
        JSONObject jSONObject;
        CampaignEx campaignEx = mBridgeNativeEndCardView.b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = mBridgeNativeEndCardView.b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.f() + "";
                }
                i.a(c.m().c(), "end_card_click", mBridgeNativeEndCardView.b.getCampaignUnitId(), mBridgeNativeEndCardView.b.isBidCampaign(), mBridgeNativeEndCardView.b.getRequestId(), mBridgeNativeEndCardView.b.getRequestIdNotice(), mBridgeNativeEndCardView.b.getId(), str);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e9) {
            e = e9;
        }
        try {
            jSONObject.put(com.mbridge.msdk.foundation.same.a.f15684j, mBridgeNativeEndCardView.a(i9));
            if (mBridgeNativeEndCardView.b.getDynamicTempCode() == 5) {
                jSONObject.put("camp_position", 0);
            }
        } catch (JSONException e10) {
            e = e10;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            jSONObject = jSONObject2;
            mBridgeNativeEndCardView.b.setClickTempSource(2);
            mBridgeNativeEndCardView.notifyListener.a(105, jSONObject);
        }
        mBridgeNativeEndCardView.b.setClickTempSource(2);
        mBridgeNativeEndCardView.notifyListener.a(105, jSONObject);
    }
}
