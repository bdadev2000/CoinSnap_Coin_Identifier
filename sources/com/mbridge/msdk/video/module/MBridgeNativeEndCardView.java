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
import vd.e;

/* loaded from: classes4.dex */
public class MBridgeNativeEndCardView extends MBridgeNativeEndCardViewDiff {
    private LinearLayout A;
    private Runnable B;
    private Runnable C;
    private RelativeLayout D;
    private b E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private AlphaAnimation K;
    private int L;
    private int M;
    private int N;
    private int O;
    private Bitmap P;
    private View Q;
    private FeedBackButton R;
    private String S;
    private CampaignUnit T;
    private MBShakeView U;
    private com.mbridge.msdk.shake.b V;
    private MBridgeBaitClickView W;

    /* renamed from: aa, reason: collision with root package name */
    private boolean f15951aa;

    /* renamed from: ab, reason: collision with root package name */
    private int f15952ab;

    /* renamed from: ac, reason: collision with root package name */
    private String f15953ac;

    /* renamed from: m, reason: collision with root package name */
    private ViewGroup f15954m;

    /* renamed from: n, reason: collision with root package name */
    private ViewGroup f15955n;

    /* renamed from: o, reason: collision with root package name */
    private RelativeLayout f15956o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f15957p;

    /* renamed from: q, reason: collision with root package name */
    private ImageView f15958q;

    /* renamed from: r, reason: collision with root package name */
    private ImageView f15959r;

    /* renamed from: s, reason: collision with root package name */
    private ImageView f15960s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f15961t;
    private ImageView u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f15962v;

    /* renamed from: w, reason: collision with root package name */
    private TextView f15963w;

    /* renamed from: x, reason: collision with root package name */
    private TextView f15964x;

    /* renamed from: y, reason: collision with root package name */
    private TextView f15965y;

    /* renamed from: z, reason: collision with root package name */
    private LinearLayout f15966z;

    public MBridgeNativeEndCardView(Context context) {
        super(context);
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.f15951aa = false;
        this.f15952ab = 1;
    }

    public static /* synthetic */ void p(MBridgeNativeEndCardView mBridgeNativeEndCardView) {
        CampaignEx campaignEx = mBridgeNativeEndCardView.f15895b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(mBridgeNativeEndCardView.S);
            com.mbridge.msdk.foundation.d.b.a().a(e.h(new StringBuilder(), mBridgeNativeEndCardView.S, "_2"), mBridgeNativeEndCardView.f15895b);
        }
        if (com.mbridge.msdk.foundation.d.b.a().b()) {
            com.mbridge.msdk.foundation.d.b.a().a(e.h(new StringBuilder(), mBridgeNativeEndCardView.S, "_2"), new a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.4
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                    MBridgeNativeEndCardView.this.I = true;
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    MBridgeNativeEndCardView.this.I = false;
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    MBridgeNativeEndCardView.this.I = false;
                }
            });
            com.mbridge.msdk.foundation.d.b.a().c(mBridgeNativeEndCardView.S + "_1");
            if (mBridgeNativeEndCardView.R != null) {
                com.mbridge.msdk.foundation.d.b.a().a(e.h(new StringBuilder(), mBridgeNativeEndCardView.S, "_2"), mBridgeNativeEndCardView.R);
                return;
            }
            return;
        }
        FeedBackButton feedBackButton = mBridgeNativeEndCardView.R;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript create = RenderScript.create(this.a.getApplicationContext());
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
        View view = this.Q;
        return view != null && view.getVisibility() == 0;
    }

    public void clearMoreOfferBitmap() {
        CampaignUnit campaignUnit;
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx != null && campaignEx.isDynamicView() && (campaignUnit = this.T) != null && campaignUnit.getAds() != null && this.T.getAds().size() > 0) {
            Iterator<CampaignEx> it = this.T.getAds().iterator();
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
        return this.f15951aa;
    }

    public void notifyShowListener() {
        this.notifyListener.a(110, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int parseInt;
        int parseInt2;
        int i10;
        MBridgeBaitClickView mBridgeBaitClickView;
        super.onAttachedToWindow();
        if (this.B == null) {
            this.B = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBridgeNativeEndCardView.this.G = true;
                    if (MBridgeNativeEndCardView.this.Q != null) {
                        MBridgeNativeEndCardView.this.Q.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.B;
        if (runnable != null) {
            postDelayed(runnable, this.J * 1000);
            if (!this.H) {
                this.H = true;
            }
            try {
                CampaignEx campaignEx = this.f15895b;
                if (campaignEx != null && campaignEx.isDynamicView()) {
                    String str = this.f15895b.getendcard_url();
                    if (TextUtils.isEmpty(str)) {
                        str = this.f15895b.getEndScreenUrl();
                    }
                    String a = ao.a(str, "alac");
                    if (!TextUtils.isEmpty(a) && a.equals("1") && this.f15895b.getAutoShowStoreMiniCard() != 1) {
                        postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.8
                            @Override // java.lang.Runnable
                            public final void run() {
                                MBridgeNativeEndCardView.this.f15895b.setTriggerClickSource(2);
                                MBridgeNativeEndCardView.this.f15895b.setClickType(1);
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 2);
                            }
                        }, 1000L);
                    }
                }
            } catch (Throwable th2) {
                ad.b(MBridgeBaseView.TAG, th2.getMessage());
            }
        }
        try {
            CampaignEx campaignEx2 = this.f15895b;
            if (campaignEx2 != null && campaignEx2.isDynamicView()) {
                String str2 = this.f15895b.getendcard_url();
                if (TextUtils.isEmpty(str2)) {
                    str2 = this.f15895b.getEndScreenUrl();
                }
                String a10 = ao.a(str2, "bait_click");
                try {
                    i10 = Integer.parseInt(a10);
                } catch (Throwable th3) {
                    ad.b(MBridgeBaseView.TAG, th3.getMessage());
                    i10 = 1;
                }
                if (!TextUtils.isEmpty(a10) && i10 != 0 && (mBridgeBaitClickView = this.W) != null) {
                    mBridgeBaitClickView.setVisibility(0);
                    this.W.init(1342177280, i10);
                    if (this.f15895b.getEcTemplateId() == 1302) {
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(0);
                        gradientDrawable.setColor(1342177280);
                        gradientDrawable.setStroke(0, -65536);
                        gradientDrawable.setCornerRadius(25.0f);
                        this.W.setBackground(gradientDrawable);
                    }
                    this.W.startAnimation();
                    this.W.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MBridgeNativeEndCardView.this.f15895b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                        }
                    });
                }
            }
        } catch (Throwable th4) {
            ad.b(MBridgeBaseView.TAG, th4.getMessage());
        }
        try {
            CampaignEx campaignEx3 = this.f15895b;
            if (campaignEx3 != null && campaignEx3.isDynamicView()) {
                String str3 = this.f15895b.getendcard_url();
                if (TextUtils.isEmpty(str3)) {
                    str3 = this.f15895b.getEndScreenUrl();
                }
                String a11 = ao.a(str3, "shake_show");
                String a12 = ao.a(str3, "shake_strength");
                String a13 = ao.a(str3, "shake_time");
                if (!TextUtils.isEmpty(a11) && a11.equals("1") && this.U == null) {
                    MBridgeBaitClickView mBridgeBaitClickView2 = this.W;
                    if (mBridgeBaitClickView2 != null) {
                        mBridgeBaitClickView2.setVisibility(8);
                    }
                    MBShakeView mBShakeView = new MBShakeView(getContext());
                    this.U = mBShakeView;
                    mBShakeView.initView(this.f15895b.getAdCall(), true);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (!isLandscape()) {
                        layoutParams.addRule(2, filterFindViewId(this.f15951aa, "mbridge_iv_logo"));
                        layoutParams.addRule(14);
                        this.U.setPadding(0, 0, 0, ai.a(getContext(), 20.0f));
                    } else {
                        layoutParams.addRule(13);
                    }
                    this.U.setLayoutParams(layoutParams);
                    RelativeLayout relativeLayout = this.f15956o;
                    if (relativeLayout != null && relativeLayout.isShown()) {
                        this.f15956o.addView(this.U);
                        TextView textView = this.ctaView;
                        if (textView != null) {
                            textView.setVisibility(4);
                        }
                        this.ctaView.setVisibility(4);
                        this.U.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                MBridgeNativeEndCardView.this.f15895b.setTriggerClickSource(5);
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                            }
                        });
                        int i11 = 10;
                        if (!TextUtils.isEmpty(a12) && (parseInt2 = Integer.parseInt(a12)) > 0) {
                            i11 = parseInt2;
                        }
                        int i12 = 5000;
                        if (!TextUtils.isEmpty(a13) && (parseInt = Integer.parseInt(a13)) > 0) {
                            i12 = parseInt * 1000;
                        }
                        this.V = new com.mbridge.msdk.shake.b(i11, i12) { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.6
                            @Override // com.mbridge.msdk.shake.b
                            public final void a() {
                                if ((com.mbridge.msdk.e.b.a() && MBridgeNativeEndCardView.this.checkChinaShakeState()) || MBridgeNativeEndCardView.this.I || !MBridgeNativeEndCardView.this.H) {
                                    return;
                                }
                                MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                                mBridgeNativeEndCardView.f15899f = 0.0f;
                                mBridgeNativeEndCardView.f15900g = 0.0f;
                                mBridgeNativeEndCardView.f15895b.setTriggerClickSource(5);
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 4);
                            }
                        };
                        com.mbridge.msdk.shake.a.a().a(this.V);
                    }
                }
            }
        } catch (Throwable th5) {
            ad.b(MBridgeBaseView.TAG, th5.getMessage());
        }
        try {
            CampaignEx campaignEx4 = this.f15895b;
            if (campaignEx4 != null && campaignEx4.getAutoShowStoreMiniCard() != 0 && !TextUtils.isEmpty(this.f15895b.getDeepLinkURL())) {
                long showStoreMiniCardDelayTime = this.f15895b.getShowStoreMiniCardDelayTime();
                if (showStoreMiniCardDelayTime == 0) {
                    showStoreMiniCardDelayTime = 1;
                }
                if (this.C == null) {
                    this.C = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.9
                        @Override // java.lang.Runnable
                        public final void run() {
                            MBridgeNativeEndCardView.this.f15895b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.this.f15895b.setClickType(1);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 2);
                        }
                    };
                }
                postDelayed(this.C, showStoreMiniCardDelayTime * 1000);
            }
        } catch (Throwable th6) {
            ad.b(MBridgeBaseView.TAG, th6.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.B;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.C;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        if (this.V != null) {
            com.mbridge.msdk.shake.a.a().b(this.V);
            this.V = null;
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            return;
        }
        RelativeLayout relativeLayout = this.D;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(4);
        }
        int i10 = configuration.orientation;
        this.f15897d = i10;
        if (i10 == 2) {
            removeView(this.f15954m);
            a(this.f15955n);
        } else {
            removeView(this.f15955n);
            a(this.f15954m);
        }
    }

    public void preLoadData(b bVar) {
        this.E = bVar;
        try {
            if (this.f15895b != null && this.f15898e) {
                com.mbridge.msdk.foundation.same.c.b.a(this.a.getApplicationContext()).a(this.f15895b.getImageUrl(), new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.11
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onFailedLoad(String str, String str2) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        if (bitmap != null && !bitmap.isRecycled()) {
                            try {
                                if (MBridgeNativeEndCardView.this.f15958q != null) {
                                    MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                                    if (mBridgeNativeEndCardView.f15901h) {
                                        mBridgeNativeEndCardView.f15958q.setBackground(null);
                                    }
                                    MBridgeNativeEndCardView.this.f15958q.setImageBitmap(bitmap);
                                }
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, bitmap);
                            } catch (Throwable unused) {
                                if (MBridgeNativeEndCardView.this.f15957p != null) {
                                    MBridgeNativeEndCardView.this.f15957p.setVisibility(4);
                                }
                            }
                        }
                    }
                });
                com.mbridge.msdk.foundation.same.c.b.a(this.a.getApplicationContext()).a(this.f15895b.getIconUrl(), new j(this.f15959r, ai.a(c.m().c(), 8.0f)));
                this.f15963w.setText(this.f15895b.getAppName());
                TextView textView = this.ctaView;
                if (textView != null) {
                    textView.setText(this.f15895b.getAdCall());
                }
                TextView textView2 = this.f15964x;
                if (textView2 != null) {
                    textView2.setText(this.f15895b.getAppDesc());
                }
                TextView textView3 = this.f15965y;
                if (textView3 != null) {
                    textView3.setText(this.f15895b.getNumberRating() + ")");
                }
                this.f15966z.removeAllViews();
                double rating = this.f15895b.getRating();
                if (rating <= 0.0d) {
                    rating = 5.0d;
                }
                LinearLayout linearLayout = this.f15966z;
                if (linearLayout instanceof StarLevelView) {
                    ((StarLevelView) linearLayout).initScore(rating);
                }
                LinearLayout linearLayout2 = this.f15966z;
                if (linearLayout2 instanceof MBridgeLevelLayoutView) {
                    ((MBridgeLevelLayoutView) linearLayout2).setRatingAndUser(rating, this.f15895b.getNumberRating());
                }
                LinearLayout linearLayout3 = this.f15966z;
                if (linearLayout3 instanceof MBStarLevelLayoutView) {
                    ((MBStarLevelLayoutView) linearLayout3).setRating((int) rating);
                }
                LinearLayout linearLayout4 = this.A;
                if (linearLayout4 != null && (linearLayout4 instanceof MBHeatLevelLayoutView)) {
                    ((MBHeatLevelLayoutView) linearLayout4).setHeatCount(this.f15895b.getNumberRating());
                }
                if (!TextUtils.isEmpty(this.f15895b.getendcard_url()) && this.f15895b.getendcard_url().contains("alecfc=1")) {
                    this.F = true;
                }
                String language = Locale.getDefault().getLanguage();
                if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                    this.f15960s.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", c.m().g())));
                    this.f15953ac = "广告";
                } else {
                    this.f15960s.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_en", "drawable", c.m().g())));
                    this.f15953ac = "AD";
                }
                if (this.f15952ab == 0) {
                    ImageView imageView = this.f15960s;
                    if (imageView != null) {
                        imageView.setVisibility(4);
                    }
                    ImageView imageView2 = this.u;
                    if (imageView2 != null) {
                        imageView2.setVisibility(4);
                    }
                    TextView textView4 = this.f15961t;
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                        this.f15961t.setText(this.f15953ac);
                    }
                }
                ai.a(2, this.f15962v, this.f15895b, this.a, true, new a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.12
                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a() {
                        MBridgeNativeEndCardView.this.I = true;
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void b() {
                        MBridgeNativeEndCardView.this.I = false;
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a(String str) {
                        MBridgeNativeEndCardView.this.I = false;
                    }
                });
                if (!this.G) {
                    this.Q.setVisibility(8);
                }
            }
        } catch (Throwable th2) {
            ad.a(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    public void release() {
        try {
            removeAllViews();
            AlphaAnimation alphaAnimation = this.K;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            this.B = null;
        } catch (Exception e2) {
            ad.b(MBridgeBaseView.TAG, e2.getMessage());
        }
    }

    public void setCloseBtnDelay(int i10) {
        this.J = i10;
    }

    public void setLayout() {
        String str;
        if (this.f15901h) {
            if (com.mbridge.msdk.e.b.a()) {
                str = "cn_";
            } else {
                str = "en_";
            }
            com.mbridge.msdk.video.dynview.c a = new com.mbridge.msdk.video.dynview.j.c().a(getContext(), this.f15895b, this.f15902i, str);
            this.f15952ab = a.n();
            com.mbridge.msdk.video.dynview.b.a().a(a, new h() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.10
                @Override // com.mbridge.msdk.video.dynview.e.h
                public final void a(com.mbridge.msdk.video.dynview.a aVar) {
                    if (aVar != null) {
                        MBridgeNativeEndCardView.this.addView(aVar.a());
                        MBridgeNativeEndCardView.this.f15951aa = aVar.c();
                        if (!MBridgeNativeEndCardView.this.ctaViewCanGet(aVar.a(), MBridgeNativeEndCardView.this.f15951aa)) {
                            MBridgeNativeEndCardView.this.f15951aa = false;
                            MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                            mBridgeNativeEndCardView.f15901h = false;
                            mBridgeNativeEndCardView.a();
                        } else {
                            MBridgeNativeEndCardView mBridgeNativeEndCardView2 = MBridgeNativeEndCardView.this;
                            mBridgeNativeEndCardView2.f15898e = mBridgeNativeEndCardView2.b(aVar.a());
                            MBridgeNativeEndCardView.this.b();
                        }
                        MBridgeNativeEndCardView mBridgeNativeEndCardView3 = MBridgeNativeEndCardView.this;
                        CampaignEx campaignEx = mBridgeNativeEndCardView3.f15895b;
                        if (campaignEx != null) {
                            campaignEx.setECTemplateRenderSucc(mBridgeNativeEndCardView3.f15951aa);
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
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            this.T = campaignUnit;
            if (campaignUnit != null && campaignUnit.getAds() != null && this.T.getAds().size() > 5 && (mBShakeView = this.U) != null) {
                mBShakeView.setPadding(0, 0, 0, ai.a(getContext(), 5.0f));
            }
        }
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        ad.b(MBridgeBaseView.TAG, "NOTCH NativeEndCard " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
        this.L = i10;
        this.M = i11;
        this.N = i12;
        this.O = i13;
        f();
    }

    public void setOnPause() {
        this.H = false;
    }

    public void setOnResume() {
        this.H = true;
    }

    public void setUnitId(String str) {
        this.S = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r1 = "mbridge_reward_endcard_native_land";
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        if (r6.f15903j != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r6.f15903j != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int e() {
        /*
            r6 = this;
            int r0 = r6.f15904k
            java.lang.String r1 = "mbridge_reward_endcard_native_half_landscape"
            java.lang.String r2 = "mbridge_reward_endcard_native_land"
            java.lang.String r3 = "mbridge_reward_endcard_native_half_portrait"
            java.lang.String r4 = "mbridge_reward_endcard_native_hor"
            if (r0 != 0) goto L1d
            boolean r0 = r6.f15903j
            if (r0 == 0) goto L11
            goto L12
        L11:
            r3 = r4
        L12:
            boolean r0 = r6.isLandscape()
            if (r0 == 0) goto L33
            boolean r0 = r6.f15903j
            if (r0 == 0) goto L31
            goto L32
        L1d:
            r5 = 1
            if (r0 != r5) goto L27
            boolean r5 = r6.f15903j
            if (r5 == 0) goto L25
            goto L29
        L25:
            r3 = r4
            goto L29
        L27:
            java.lang.String r3 = ""
        L29:
            r4 = 2
            if (r0 != r4) goto L33
            boolean r0 = r6.f15903j
            if (r0 == 0) goto L31
            goto L32
        L31:
            r1 = r2
        L32:
            r3 = r1
        L33:
            int r0 = r6.findLayout(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.e():int");
    }

    private void f() {
        RelativeLayout relativeLayout;
        if (!this.f15898e || (relativeLayout = this.D) == null) {
            return;
        }
        relativeLayout.postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.3
            @Override // java.lang.Runnable
            public final void run() {
                if (MBridgeNativeEndCardView.this.D != null) {
                    CampaignEx campaignEx = MBridgeNativeEndCardView.this.f15895b;
                    if (campaignEx != null && !campaignEx.isDynamicView() && MBridgeNativeEndCardView.this.f15895b.getAdSpaceT() != 2) {
                        MBridgeNativeEndCardView.this.D.setPadding(MBridgeNativeEndCardView.this.L, MBridgeNativeEndCardView.this.N, MBridgeNativeEndCardView.this.M, MBridgeNativeEndCardView.this.O);
                        MBridgeNativeEndCardView.this.D.startAnimation(MBridgeNativeEndCardView.this.K);
                    }
                    MBridgeNativeEndCardView.this.D.setVisibility(0);
                }
                if (MBridgeNativeEndCardView.this.Q != null && MBridgeNativeEndCardView.this.Q.getVisibility() != 0 && MBridgeNativeEndCardView.this.G) {
                    MBridgeNativeEndCardView.this.Q.setVisibility(0);
                }
                MBridgeNativeEndCardView.p(MBridgeNativeEndCardView.this);
            }
        }, 200L);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        if (this.f15898e) {
            this.f15956o.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.14
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeNativeEndCardView.this.F) {
                        MBridgeNativeEndCardView.this.f15895b.setTriggerClickSource(2);
                        MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 1);
                    }
                }
            });
            this.Q.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeNativeEndCardView.this.f15901h) {
                        try {
                            com.mbridge.msdk.video.dynview.moffer.a.a().b();
                        } catch (Exception e2) {
                            ad.b(MBridgeBaseView.TAG, e2.getMessage());
                        }
                        try {
                            CampaignEx campaignEx = MBridgeNativeEndCardView.this.f15895b;
                            if (campaignEx != null) {
                                String a = ao.a(campaignEx.getendcard_url(), "ecid");
                                String a10 = ao.a(MBridgeNativeEndCardView.this.f15895b.getendcard_url(), "mof");
                                d dVar = new d();
                                dVar.a("type", "choseFromTwoClose");
                                dVar.a("endcard_id", a);
                                dVar.a("mof", a10);
                                com.mbridge.msdk.video.module.b.a.a("2000103", MBridgeNativeEndCardView.this.f15895b, dVar);
                            }
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                e10.printStackTrace();
                            }
                        }
                    }
                    try {
                        d dVar2 = new d();
                        dVar2.a("type", 2);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar2);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000134", MBridgeNativeEndCardView.this.f15895b);
                    } catch (Throwable th2) {
                        if (MBridgeConstans.DEBUG) {
                            th2.printStackTrace();
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
                        MBridgeNativeEndCardView.this.f15895b.setTriggerClickSource(1);
                        MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                    }
                });
            }
            this.f15959r.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.17
                @Override // com.mbridge.msdk.widget.a
                public final void a(View view) {
                    if (MBridgeNativeEndCardView.this.ctaView != null) {
                        if (!com.mbridge.msdk.e.b.a() || MBridgeNativeEndCardView.this.checkProgressBarIntercepted()) {
                            MBridgeNativeEndCardView.this.f15895b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                        }
                    }
                }
            });
            this.f15958q.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.2
                @Override // com.mbridge.msdk.widget.a
                public final void a(View view) {
                    if (MBridgeNativeEndCardView.this.ctaView != null) {
                        if (!com.mbridge.msdk.e.b.a() || MBridgeNativeEndCardView.this.checkProgressBarIntercepted()) {
                            MBridgeNativeEndCardView.this.f15895b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int e2 = e();
        if (e2 > 0) {
            this.f15898e = b(e2);
            b();
            CampaignEx campaignEx = this.f15895b;
            if (campaignEx != null) {
                campaignEx.setECTemplateRenderSucc(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        c();
        if (!this.f15898e) {
            this.notifyListener.a(104, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.K = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.f15951aa = false;
        this.f15952ab = 1;
    }

    private void a(View view) {
        if (view == null) {
            setLayout();
            preLoadData(this.E);
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

    private boolean b(int i10) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f15896c.inflate(i10, (ViewGroup) null);
            this.f15955n = viewGroup;
            addView(viewGroup);
            return b(this.f15955n);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f15896c.inflate(i10, (ViewGroup) null);
        this.f15954m = viewGroup2;
        addView(viewGroup2);
        return b(this.f15954m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view) {
        try {
            this.f15956o = (RelativeLayout) view.findViewById(filterFindViewId(this.f15951aa, "mbridge_native_ec_layout"));
            this.f15958q = (ImageView) view.findViewById(filterFindViewId(this.f15951aa, "mbridge_iv_adbanner"));
            this.f15959r = (ImageView) view.findViewById(filterFindViewId(this.f15951aa, "mbridge_iv_icon"));
            this.f15960s = (ImageView) view.findViewById(filterFindViewId(this.f15951aa, "mbridge_iv_flag"));
            this.f15961t = (TextView) view.findViewById(filterFindViewId(this.f15951aa, "mbridge_tv_flag"));
            this.u = (ImageView) view.findViewById(filterFindViewId(this.f15951aa, "mbridge_iv_logo"));
            this.f15962v = (ImageView) view.findViewById(filterFindViewId(this.f15951aa, "mbridge_iv_link"));
            this.f15963w = (TextView) view.findViewById(filterFindViewId(this.f15951aa, "mbridge_tv_apptitle"));
            this.f15966z = (LinearLayout) view.findViewById(filterFindViewId(this.f15951aa, "mbridge_sv_starlevel"));
            this.A = (LinearLayout) view.findViewById(filterFindViewId(this.f15951aa, "mbridge_sv_heat_count_level"));
            this.Q = view.findViewById(filterFindViewId(this.f15951aa, "mbridge_iv_close"));
            this.ctaView = (TextView) view.findViewById(filterFindViewId(this.f15951aa, "mbridge_tv_cta"));
            this.R = (FeedBackButton) view.findViewById(filterFindViewId(this.f15951aa, "mbridge_native_endcard_feed_btn"));
            this.D = (RelativeLayout) view.findViewById(filterFindViewId(this.f15951aa, "mbridge_native_ec_controller"));
            this.f15957p = (ImageView) view.findViewById(filterFindViewId(this.f15951aa, "mbridge_iv_adbanner_bg"));
            this.W = (MBridgeBaitClickView) findViewById(filterFindViewId(this.f15951aa, "mbridge_animation_click_view"));
            this.f15964x = (TextView) view.findViewById(filterFindViewId(this.f15951aa, "mbridge_tv_appdesc"));
            if (this.f15901h) {
                ImageView imageView = this.f15958q;
                if (imageView != null && (imageView instanceof RoundImageView)) {
                    ((RoundImageView) imageView).setBorderRadius(10);
                }
                ImageView imageView2 = this.f15959r;
                if (imageView2 != null && (imageView2 instanceof RoundImageView)) {
                    ((RoundImageView) imageView2).setBorderRadius(10);
                }
                return isNotNULL(this.f15958q, this.f15959r, this.f15963w, this.f15966z, this.Q, this.ctaView);
            }
            TextView textView = (TextView) view.findViewById(filterFindViewId(this.f15951aa, "mbridge_tv_number"));
            this.f15965y = textView;
            return isNotNULL(this.f15958q, this.f15959r, this.f15963w, this.f15964x, textView, this.f15966z, this.Q, this.ctaView);
        } catch (Throwable th2) {
            ad.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
            return false;
        }
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet, boolean z10, int i10, boolean z11, int i11, int i12) {
        super(context, attributeSet, z10, i10, z11, i11, i12);
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.f15951aa = false;
        this.f15952ab = 1;
    }

    public static /* synthetic */ void a(MBridgeNativeEndCardView mBridgeNativeEndCardView, final Bitmap bitmap) {
        try {
            com.mbridge.msdk.foundation.same.f.b.d().execute(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.13
                @Override // java.lang.Runnable
                public final void run() {
                    MBridgeNativeEndCardView mBridgeNativeEndCardView2 = MBridgeNativeEndCardView.this;
                    mBridgeNativeEndCardView2.P = mBridgeNativeEndCardView2.blurBitmap(bitmap);
                    if (MBridgeNativeEndCardView.this.P != null && !MBridgeNativeEndCardView.this.P.isRecycled() && MBridgeNativeEndCardView.this.f15957p != null) {
                        MBridgeNativeEndCardView.this.f15957p.post(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.13.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                MBridgeNativeEndCardView mBridgeNativeEndCardView3 = MBridgeNativeEndCardView.this;
                                if (mBridgeNativeEndCardView3.f15901h) {
                                    mBridgeNativeEndCardView3.f15957p.setBackground(null);
                                }
                                ad.b("async", "执行异步加载图");
                                MBridgeNativeEndCardView.this.f15957p.setImageBitmap(MBridgeNativeEndCardView.this.P);
                            }
                        });
                    }
                }
            });
        } catch (Exception e2) {
            ad.a(MBridgeBaseView.TAG, e2.getMessage());
        }
    }

    public static /* synthetic */ void a(MBridgeNativeEndCardView mBridgeNativeEndCardView, int i10) {
        JSONObject jSONObject;
        CampaignEx campaignEx = mBridgeNativeEndCardView.f15895b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = mBridgeNativeEndCardView.f15895b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.f() + "";
                }
                i.a(c.m().c(), "end_card_click", mBridgeNativeEndCardView.f15895b.getCampaignUnitId(), mBridgeNativeEndCardView.f15895b.isBidCampaign(), mBridgeNativeEndCardView.f15895b.getRequestId(), mBridgeNativeEndCardView.f15895b.getRequestIdNotice(), mBridgeNativeEndCardView.f15895b.getId(), str);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e10) {
            e = e10;
        }
        try {
            jSONObject.put(com.mbridge.msdk.foundation.same.a.f13279j, mBridgeNativeEndCardView.a(i10));
            if (mBridgeNativeEndCardView.f15895b.getDynamicTempCode() == 5) {
                jSONObject.put("camp_position", 0);
            }
        } catch (JSONException e11) {
            e = e11;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            jSONObject = jSONObject2;
            mBridgeNativeEndCardView.f15895b.setClickTempSource(2);
            mBridgeNativeEndCardView.notifyListener.a(105, jSONObject);
        }
        mBridgeNativeEndCardView.f15895b.setClickTempSource(2);
        mBridgeNativeEndCardView.notifyListener.a(105, jSONObject);
    }
}
