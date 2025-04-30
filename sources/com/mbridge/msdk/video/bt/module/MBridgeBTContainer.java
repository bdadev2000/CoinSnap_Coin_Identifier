package com.mbridge.msdk.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.bt.module.b.h;
import com.mbridge.msdk.video.dynview.e.d;
import com.mbridge.msdk.video.signal.a.a;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.container.AbstractJSContainer;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public class MBridgeBTContainer extends AbstractJSContainer implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18425a = "MBridgeBTContainer";

    /* renamed from: A, reason: collision with root package name */
    private boolean f18426A;

    /* renamed from: B, reason: collision with root package name */
    private String f18427B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f18428C;

    /* renamed from: D, reason: collision with root package name */
    private List<CampaignEx> f18429D;

    /* renamed from: E, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.download.a> f18430E;

    /* renamed from: F, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.a.a f18431F;

    /* renamed from: G, reason: collision with root package name */
    private h f18432G;

    /* renamed from: H, reason: collision with root package name */
    private h f18433H;

    /* renamed from: I, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.a.b f18434I;

    /* renamed from: J, reason: collision with root package name */
    private String f18435J;

    /* renamed from: K, reason: collision with root package name */
    private String f18436K;

    /* renamed from: L, reason: collision with root package name */
    private String f18437L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f18438M;

    /* renamed from: N, reason: collision with root package name */
    private int f18439N;
    private String O;

    /* renamed from: P, reason: collision with root package name */
    private d f18440P;

    /* renamed from: Q, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.d.b f18441Q;

    /* renamed from: R, reason: collision with root package name */
    private O5.b f18442R;

    /* renamed from: S, reason: collision with root package name */
    private P5.b f18443S;

    /* renamed from: T, reason: collision with root package name */
    private O5.a f18444T;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f18445c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f18446d;

    /* renamed from: e, reason: collision with root package name */
    private MBridgeBTLayout f18447e;

    /* renamed from: f, reason: collision with root package name */
    private WindVaneWebView f18448f;

    /* renamed from: g, reason: collision with root package name */
    private LayoutInflater f18449g;

    /* renamed from: h, reason: collision with root package name */
    private Context f18450h;

    /* renamed from: x, reason: collision with root package name */
    private TextView f18451x;

    /* renamed from: y, reason: collision with root package name */
    private ImageView f18452y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f18453z;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private List<CampaignEx> f18458a;
        private Context b;

        /* renamed from: c, reason: collision with root package name */
        private String f18459c;

        /* renamed from: d, reason: collision with root package name */
        private String f18460d;

        public a(List<CampaignEx> list, Context context, String str, String str2) {
            this.f18458a = list;
            this.b = context;
            this.f18459c = str;
            this.f18460d = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            List<CampaignEx> list = this.f18458a;
            if (list != null && list.size() > 0) {
                try {
                    e.a(g.a(this.b)).a(this.f18459c, this.f18458a);
                    com.mbridge.msdk.videocommon.a.a.a().c(this.f18460d, this.f18458a.get(0).getAdType());
                } catch (Exception unused) {
                    ad.a(MBridgeBTContainer.f18425a, "remove campaign failed");
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b extends a.C0201a {
        private b() {
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0201a, com.mbridge.msdk.video.signal.a.InterfaceC0200a
        public final void a() {
            super.a();
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0201a, com.mbridge.msdk.video.signal.a.InterfaceC0200a
        public final void b() {
            super.b();
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0201a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            ah.a(campaign, MBridgeBTContainer.this.f18446d);
            if (campaign != null && (campaign instanceof CampaignEx)) {
                try {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    String optString = new JSONObject(MBridgeBTContainer.this.getJSVideoModule().getCurrentProgress()).optString(NotificationCompat.CATEGORY_PROGRESS, "");
                    if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && optString.equals("1.0") && ((AbstractJSContainer) MBridgeBTContainer.this).f19286i != null) {
                        if (MBridgeBTContainer.this.f18426A) {
                            MBridgeBTContainer.this.onAdClose();
                        } else {
                            ((AbstractJSContainer) MBridgeBTContainer.this).f19286i.finish();
                        }
                    }
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0201a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
            ah.a(campaign, MBridgeBTContainer.this.f18446d);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0201a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
            ah.b(campaign, MBridgeBTContainer.this.f18446d);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0201a, com.mbridge.msdk.video.signal.a.InterfaceC0200a
        public final void a(boolean z8) {
            super.a(z8);
            if (MBridgeBTContainer.this.f18443S != null) {
                try {
                    MBridgeBTContainer.this.f18443S.a();
                    ad.a("omsdk", "btc adUserInteraction click");
                } catch (Exception e4) {
                    ad.a("omsdk", e4.getMessage());
                }
            }
            MBridgeBTContainer.this.f18433H.a(z8, ((AbstractJSContainer) MBridgeBTContainer.this).f19288k, ((AbstractJSContainer) MBridgeBTContainer.this).f19287j);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0201a, com.mbridge.msdk.video.signal.a.InterfaceC0200a
        public final void a(int i9, String str) {
            super.a(i9, str);
        }
    }

    public MBridgeBTContainer(Context context) {
        super(context);
        this.b = 0;
        this.f18445c = 1;
        this.f18453z = false;
        this.f18426A = true;
        this.f18428C = false;
        this.f18442R = null;
        this.f18443S = null;
        this.f18444T = null;
        init(context);
    }

    public void addNativeCloseButtonWhenWebViewCrash() {
        try {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
            int a6 = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 48.0f);
            int a9 = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 20.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a6, a6);
            layoutParams.setMargins(a9, a9, a9, a9);
            layoutParams.gravity = 5;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_close", "drawable"));
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTContainer.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBridgeBTContainer.this.onAdClose();
                }
            });
            addView(imageView);
        } catch (Throwable th) {
            ad.b(f18425a, th.getMessage());
        }
    }

    public void appendSubView(MBridgeBTContainer mBridgeBTContainer, MBTempContainer mBTempContainer, JSONObject jSONObject) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (jSONObject != null) {
                Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
                int optInt = jSONObject.optInt(TtmlNode.LEFT, -999);
                int optInt2 = jSONObject.optInt("top", -999);
                int optInt3 = jSONObject.optInt(TtmlNode.RIGHT, -999);
                int optInt4 = jSONObject.optInt("bottom", -999);
                if (optInt != -999 && c9 != null) {
                    layoutParams.leftMargin = ai.a(c9, optInt);
                }
                if (optInt2 != -999 && c9 != null) {
                    layoutParams.topMargin = ai.a(c9, optInt2);
                }
                if (optInt3 != -999 && c9 != null) {
                    layoutParams.rightMargin = ai.a(c9, optInt3);
                }
                if (optInt4 != -999 && c9 != null) {
                    layoutParams.bottomMargin = ai.a(c9, optInt4);
                }
                int optInt5 = jSONObject.optInt("width");
                int optInt6 = jSONObject.optInt("height");
                if (optInt5 > 0) {
                    layoutParams.width = optInt5;
                }
                if (optInt6 > 0) {
                    layoutParams.height = optInt6;
                }
            }
            mBridgeBTContainer.addView(mBTempContainer, layoutParams);
            mBTempContainer.setActivity(this.f19286i);
            mBTempContainer.setMute(this.f19291p);
            mBTempContainer.setBidCampaign(this.f18453z);
            mBTempContainer.setIV(this.f19292q);
            mBTempContainer.setBigOffer(this.f18426A);
            mBTempContainer.setIVRewardEnable(this.f19294s, this.f19295t, this.f19296u);
            mBTempContainer.setShowRewardListener(this.f18433H);
            mBTempContainer.setCampaignDownLoadTask(d(mBTempContainer.getCampaign()));
            mBTempContainer.setMBridgeTempCallback(c());
            mBTempContainer.setWebViewFront(getJSCommon().a());
            mBTempContainer.init(this.f18450h);
            mBTempContainer.onCreate();
        } catch (Throwable th) {
            ad.a(f18425a, th.getMessage());
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f18448f != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", this.b);
                jSONObject2.put("id", this.f18427B);
                jSONObject2.put("eventName", str);
                jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject);
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f18448f, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.mbridge.msdk.video.bt.a.d.c().a((WebView) this.f18448f, "broadcast", this.f18427B);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i9, String str) {
    }

    public int findID(String str) {
        return v.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return v.a(getContext(), str, TtmlNode.TAG_LAYOUT);
    }

    public O5.a getAdEvents() {
        return this.f18444T;
    }

    public O5.b getAdSession() {
        return this.f18442R;
    }

    public List<CampaignEx> getCampaigns() {
        return this.f18429D;
    }

    public P5.b getVideoEvents() {
        return this.f18443S;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i9, String str) {
    }

    public void init(Context context) {
        this.f18450h = context;
        this.f18449g = LayoutInflater.from(context);
    }

    public void onAdClose() {
        Activity activity = this.f19286i;
        if (activity != null) {
            activity.finish();
        }
    }

    public void onBackPressed() {
        try {
            LinkedHashMap<String, View> b8 = com.mbridge.msdk.video.bt.a.d.c().b(this.f19287j, this.f18436K);
            if (b8 != null && b8.size() > 0) {
                for (View view : b8.values()) {
                    if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).onBackPressed();
                    } else if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).onBackPressed();
                    } else if (view instanceof MBridgeBTLayout) {
                        ((MBridgeBTLayout) view).onBackPressed();
                    }
                }
            }
        } catch (Throwable th) {
            ad.a(f18425a, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        try {
            LinkedHashMap<String, View> b8 = com.mbridge.msdk.video.bt.a.d.c().b(this.f19287j, this.f18436K);
            if (b8 != null && b8.size() > 0) {
                for (View view : b8.values()) {
                    if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).onConfigurationChanged(configuration);
                    } else if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).onConfigurationChanged(configuration);
                    } else if (view instanceof MBridgeBTLayout) {
                        ((MBridgeBTLayout) view).onConfigurationChanged(configuration);
                    }
                }
            }
        } catch (Throwable th) {
            ad.a(f18425a, th.getMessage());
        }
    }

    public void onCreate(boolean z8) {
        String str;
        WindVaneWebView windVaneWebView;
        CampaignEx campaignEx;
        try {
            int findLayout = findLayout("mbridge_bt_container");
            if (findLayout < 0) {
                a("mbridge_bt_container layout null");
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.f18449g.inflate(findLayout, this);
            this.f18446d = frameLayout;
            if (frameLayout == null) {
                a("ViewIds null");
                return;
            }
            this.f18436K = "";
            List<CampaignEx> list = this.f18429D;
            if (list == null || list.size() <= 0) {
                str = "";
            } else {
                CampaignEx campaignEx2 = this.f18429D.get(0);
                str = campaignEx2.getCMPTEntryUrl();
                this.f18436K = campaignEx2.getRequestId();
                this.f18437L = campaignEx2.getCurrentLocalRid();
            }
            a.C0202a a6 = com.mbridge.msdk.videocommon.a.a(this.f19287j + "_" + this.f18436K + "_" + str);
            RelativeLayout.LayoutParams layoutParams = null;
            if (a6 != null) {
                this.f18427B = a6.b();
                ad.a(f18425a, "get BT wraper.getTag = " + this.f18427B);
                a6.a("");
                windVaneWebView = a6.a();
            } else {
                windVaneWebView = null;
            }
            this.f18448f = windVaneWebView;
            com.mbridge.msdk.videocommon.a.b(this.f19287j + "_" + this.f18436K + "_" + str);
            O5.b bVar = this.f18442R;
            if (bVar != null) {
                try {
                    bVar.d(this);
                    this.f18442R.f();
                    ad.a("omsdk", "btc:  adSession.start();");
                    if (this.f18444T != null) {
                        ad.a("omsdk", "btc:   adEvents.loaded");
                        this.f18444T.d(new B3.e(3));
                        ad.a("omsdk", "btc:   adEvents.impressionOccurred");
                        this.f18444T.b();
                    }
                } catch (Exception e4) {
                    ad.a("omsdk", e4.getMessage());
                }
            }
            WindVaneWebView windVaneWebView2 = this.f18448f;
            if (windVaneWebView2 != null) {
                com.mbridge.msdk.video.signal.factory.b bVar2 = new com.mbridge.msdk.video.signal.factory.b(this.f19286i, this, windVaneWebView2);
                registerJsFactory(bVar2);
                this.f18448f.setApiManagerJSFactory(bVar2);
                if (this.f18448f.getParent() != null) {
                    a("preload template webview is null or load error");
                    return;
                }
                if (this.f18448f.getObject() instanceof k) {
                    bVar2.a((k) this.f18448f.getObject());
                    if (this.f18448f != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(com.mbridge.msdk.foundation.same.a.l, ai.d(getContext()));
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", this.f19289n.a());
                            jSONObject2.put("amount", this.f19289n.b());
                            jSONObject2.put("id", this.f19290o);
                            jSONObject.put("userId", this.m);
                            jSONObject.put("reward", jSONObject2);
                            jSONObject.put("playVideoMute", this.f19291p);
                            jSONObject.put("extra", this.O);
                        } catch (JSONException e9) {
                            ad.a(f18425a, e9.getMessage());
                        } catch (Exception e10) {
                            ad.a(f18425a, e10.getMessage());
                        }
                        this.f18433H = new com.mbridge.msdk.video.bt.module.b.c(c(), "");
                        String jSONObject3 = jSONObject.toString();
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("type", 1);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000133", this.f18429D, dVar);
                        } catch (Exception unused) {
                        }
                        getJSNotifyProxy().a(jSONObject3);
                        getJSCommon().b(true);
                        getJSCommon().a(new b());
                    }
                    ((com.mbridge.msdk.video.signal.a.d) getJSCommon()).m.a();
                }
                this.f18448f.setBackgroundColor(0);
                LinkedHashMap<String, View> b8 = com.mbridge.msdk.video.bt.a.d.c().b(this.f19287j, this.f18436K);
                if (b8 != null && b8.containsKey(this.f18427B)) {
                    View view = b8.get(this.f18427B);
                    if (view instanceof MBridgeBTLayout) {
                        MBridgeBTLayout mBridgeBTLayout = (MBridgeBTLayout) view;
                        this.f18447e = mBridgeBTLayout;
                        try {
                            WindVaneWebView windVaneWebView3 = (WindVaneWebView) mBridgeBTLayout.getBtWebView();
                            k kVar = (k) windVaneWebView3.getObject();
                            kVar.a(this.f18444T);
                            kVar.a(this.f18443S);
                            kVar.a(this.f18442R);
                            windVaneWebView3.setObject(kVar);
                        } catch (Exception e11) {
                            ad.b(f18425a, e11.getMessage());
                        }
                        com.mbridge.msdk.foundation.d.b.a().a(this.f19287j + "_1", new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTContainer.1
                            @Override // com.mbridge.msdk.foundation.d.a
                            public final void a() {
                                String str2;
                                try {
                                    JSONObject jSONObject4 = new JSONObject();
                                    if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                        jSONObject4.put(NotificationCompat.CATEGORY_STATUS, 1);
                                    }
                                    str2 = jSONObject4.toString();
                                } catch (Throwable th) {
                                    ad.b(MBridgeBTContainer.f18425a, th.getMessage(), th);
                                    str2 = "";
                                }
                                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f18448f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                            }

                            @Override // com.mbridge.msdk.foundation.d.a
                            public final void b() {
                                String str2;
                                try {
                                    JSONObject jSONObject4 = new JSONObject();
                                    if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                        jSONObject4.put(NotificationCompat.CATEGORY_STATUS, 2);
                                    }
                                    str2 = jSONObject4.toString();
                                } catch (Throwable th) {
                                    ad.b(MBridgeBTContainer.f18425a, th.getMessage(), th);
                                    str2 = "";
                                }
                                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f18448f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                            }

                            @Override // com.mbridge.msdk.foundation.d.a
                            public final void a(String str2) {
                                String str3;
                                try {
                                    JSONObject jSONObject4 = new JSONObject();
                                    if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                        jSONObject4.put(NotificationCompat.CATEGORY_STATUS, 2);
                                    }
                                    str3 = jSONObject4.toString();
                                } catch (Throwable th) {
                                    ad.b(MBridgeBTContainer.f18425a, th.getMessage(), th);
                                    str3 = "";
                                }
                                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f18448f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str3.getBytes(), 2));
                            }
                        });
                        this.f18447e.addView(this.f18448f, 0, new FrameLayout.LayoutParams(-1, -1));
                        com.mbridge.msdk.foundation.d.b.a().c(this.f19287j + "_2");
                        FeedBackButton b9 = com.mbridge.msdk.foundation.d.b.a().b(this.f19287j + "_1");
                        if (com.mbridge.msdk.foundation.d.b.a().b() && b9 != null) {
                            try {
                                layoutParams = (RelativeLayout.LayoutParams) b9.getLayoutParams();
                            } catch (Exception e12) {
                                e12.printStackTrace();
                            }
                            if (layoutParams == null) {
                                layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.d.b.b, com.mbridge.msdk.foundation.d.b.f15466a);
                            }
                            layoutParams.topMargin = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 10.0f);
                            layoutParams.leftMargin = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 10.0f);
                            b9.setLayoutParams(layoutParams);
                            ViewGroup viewGroup = (ViewGroup) b9.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(b9);
                            }
                            this.f18447e.addView(b9);
                        }
                        this.f18447e.setTag(this.f18427B);
                        b8.put(this.f18427B, this.f18447e);
                        Iterator<View> it = b8.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof MBridgeBTRootLayout) {
                                MBridgeBTRootLayout mBridgeBTRootLayout = (MBridgeBTRootLayout) next;
                                this.f18435J = mBridgeBTRootLayout.getInstanceId();
                                this.f18446d.addView(mBridgeBTRootLayout, new FrameLayout.LayoutParams(-1, -1));
                                break;
                            }
                        }
                        b8.remove(this.f18435J);
                        b8.put(this.f18435J, this);
                    }
                    com.mbridge.msdk.video.bt.a.d.c().a(this.f19287j, this.f19291p);
                    com.mbridge.msdk.video.bt.a.d.c().a(this.f18427B, this.f18436K);
                    com.mbridge.msdk.video.bt.a.d.c().a(this.f18435J, this.f18436K);
                    com.mbridge.msdk.video.bt.a.d.c().a(this.f19287j + "_" + this.f18436K, this.f19286i);
                    try {
                        com.mbridge.msdk.foundation.same.f.b.b().execute(new a(this.f18429D, getContext().getApplicationContext(), this.f19287j, this.f19288k));
                    } catch (Throwable unused2) {
                        ad.a(f18425a, "remove campaign failed");
                    }
                    List<CampaignEx> list2 = this.f18429D;
                    if (list2 != null && list2.size() > 0) {
                        a(this.l, this.f18429D.get(0));
                        return;
                    }
                    return;
                }
                a("big template webviewLayout is null");
                return;
            }
            List<CampaignEx> list3 = this.f18429D;
            if (list3 != null && list3.size() > 0 && (campaignEx = this.f18429D.get(0)) != null && (z8 || campaignEx.isDynamicView())) {
                Context context = this.f18450h;
                if (this.f18440P == null) {
                    a("ChoiceOneCallback is null");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("choice_one_callback", this.f18440P);
                com.mbridge.msdk.video.dynview.b.a();
                new com.mbridge.msdk.video.dynview.h.a(context, this.f18429D, new com.mbridge.msdk.video.dynview.e.h() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTContainer.2
                    @Override // com.mbridge.msdk.video.dynview.e.h
                    public final void a(com.mbridge.msdk.video.dynview.a aVar) {
                        CampaignEx campaignEx3;
                        String sb;
                        if (aVar != null) {
                            if (MBridgeBTContainer.this.f18446d != null && aVar.a() != null) {
                                MBridgeBTContainer.this.f18446d.removeAllViews();
                                MBridgeBTContainer.this.f18446d.addView(aVar.a());
                                MBridgeBTContainer mBridgeBTContainer = MBridgeBTContainer.this;
                                mBridgeBTContainer.f18451x = (TextView) mBridgeBTContainer.findViewById(mBridgeBTContainer.findID("mbridge_choice_one_countdown_tv"));
                                MBridgeBTContainer mBridgeBTContainer2 = MBridgeBTContainer.this;
                                mBridgeBTContainer2.f18452y = (ImageView) mBridgeBTContainer2.findViewById(mBridgeBTContainer2.findID("mbridge_iv_link"));
                                if (MBridgeBTContainer.this.f18431F != null) {
                                    MBridgeBTContainer.this.f18431F.a();
                                    MBridgeBTContainer.this.f18431F.a(2, ((AbstractJSContainer) MBridgeBTContainer.this).f19288k, ((AbstractJSContainer) MBridgeBTContainer.this).f19287j);
                                }
                                if (MBridgeBTContainer.this.f18429D == null || MBridgeBTContainer.this.f18429D.size() <= 0 || (campaignEx3 = (CampaignEx) MBridgeBTContainer.this.f18429D.get(0)) == null) {
                                    return;
                                }
                                if (campaignEx3.isBidCampaign()) {
                                    MBridgeBTContainer.a(MBridgeBTContainer.this, campaignEx3);
                                }
                                String onlyImpressionURL = campaignEx3.getOnlyImpressionURL();
                                com.mbridge.msdk.videocommon.d.c a9 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), ((AbstractJSContainer) MBridgeBTContainer.this).f19287j);
                                int y4 = a9 != null ? a9.y() : 1;
                                if (campaignEx3.getSpareOfferFlag() == 1) {
                                    StringBuilder c9 = AbstractC2965e.c(onlyImpressionURL, "&to=1&cbt=");
                                    c9.append(campaignEx3.getCbt());
                                    c9.append("&tmorl=");
                                    c9.append(y4);
                                    sb = c9.toString();
                                } else {
                                    StringBuilder c10 = AbstractC2965e.c(onlyImpressionURL, "&to=0&cbt=");
                                    c10.append(campaignEx3.getCbt());
                                    c10.append("&tmorl=");
                                    c10.append(y4);
                                    sb = c10.toString();
                                }
                                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx3, ((AbstractJSContainer) MBridgeBTContainer.this).f19287j, sb, false, true, com.mbridge.msdk.click.a.a.f14772h);
                                com.mbridge.msdk.foundation.same.a.b.f15710k.put(campaignEx3.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
                                MBridgeBTContainer.this.a(campaignEx3);
                                try {
                                    com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                                    dVar2.a("type", "choseFromTwoShow");
                                    com.mbridge.msdk.video.module.b.a.a("2000103", campaignEx3, dVar2);
                                    return;
                                } catch (Exception e13) {
                                    if (MBridgeConstans.DEBUG) {
                                        e13.printStackTrace();
                                        return;
                                    }
                                    return;
                                }
                            }
                            MBridgeBTContainer.this.a("nativeview is null");
                        }
                    }

                    @Override // com.mbridge.msdk.video.dynview.e.h
                    public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                        String str2;
                        if (aVar != null) {
                            str2 = "errorCode:" + aVar.a() + "Msg:" + aVar.b();
                        } else {
                            str2 = "";
                        }
                        MBridgeBTContainer.this.a("nativeview is null" + str2);
                    }
                }, hashMap);
                return;
            }
            a("big template webview is null");
        } catch (Throwable th) {
            a("onCreate exception " + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        if (this.f18428C) {
            return;
        }
        this.f18428C = true;
        if (this.f18442R != null) {
            ad.b("omsdk", "btc onDestroy");
            this.f18442R.c();
        }
        super.onDestroy();
        com.mbridge.msdk.video.bt.a.d.c().d(this.f19287j + "_" + this.f18436K);
        try {
            WindVaneWebView windVaneWebView = this.f18448f;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f18448f.clearWebView();
                this.f18448f.release();
            }
            if (this.f18434I != null) {
                this.f18434I = null;
            }
            if (this.f18431F != null) {
                this.f18431F = null;
            }
            if (this.f18450h != null) {
                this.f18450h = null;
            }
            List<CampaignEx> list = this.f18429D;
            if (list != null && list.size() > 0) {
                for (CampaignEx campaignEx : this.f18429D) {
                    if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
                        com.mbridge.msdk.videocommon.a.b(this.f19287j + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e());
                    }
                }
                com.mbridge.msdk.video.dynview.b.a.a().b();
            }
            com.mbridge.msdk.video.bt.a.d.c().f(this.f18427B);
            com.mbridge.msdk.video.bt.a.d.c().g(this.f19287j);
            com.mbridge.msdk.video.bt.a.d.c().b(this.f19287j, this.f18436K).remove(this.f18427B);
            com.mbridge.msdk.video.bt.a.d.c().b(this.f19287j, this.f18436K).remove(this.f18435J);
            com.mbridge.msdk.video.bt.a.d.c().b(this.f19287j, this.f18436K).clear();
        } catch (Throwable th) {
            ad.a(f18425a, th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onPause() {
        CampaignEx campaignEx;
        com.mbridge.msdk.video.dynview.d.a aVar;
        super.onPause();
        List<CampaignEx> list = this.f18429D;
        if (list != null && list.size() > 0 && (campaignEx = this.f18429D.get(0)) != null && campaignEx.isDynamicView() && (aVar = com.mbridge.msdk.video.dynview.b.a.a().f18569a) != null) {
            aVar.b();
        }
        try {
            LinkedHashMap<String, View> b8 = com.mbridge.msdk.video.bt.a.d.c().b(this.f19287j, this.f18436K);
            if (b8 != null && b8.size() > 0) {
                for (View view : b8.values()) {
                    if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).onPause();
                    }
                }
            }
        } catch (Throwable th) {
            ad.a(f18425a, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onResume() {
        CampaignEx campaignEx;
        com.mbridge.msdk.video.dynview.d.a aVar;
        super.onResume();
        List<CampaignEx> list = this.f18429D;
        if (list != null && list.size() > 0 && (campaignEx = this.f18429D.get(0)) != null && campaignEx.isDynamicView() && (aVar = com.mbridge.msdk.video.dynview.b.a.a().f18569a) != null) {
            aVar.a();
        }
        if (com.mbridge.msdk.foundation.d.b.f15467c) {
            return;
        }
        try {
            LinkedHashMap<String, View> b8 = com.mbridge.msdk.video.bt.a.d.c().b(this.f19287j, this.f18436K);
            if (b8 != null && b8.size() > 0) {
                for (View view : b8.values()) {
                    if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).onResume();
                    }
                }
            }
        } catch (Throwable th) {
            ad.a(f18425a, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onStop() {
        CampaignEx campaignEx;
        super.onStop();
        List<CampaignEx> list = this.f18429D;
        if (list != null && list.size() > 0 && (campaignEx = this.f18429D.get(0)) != null && campaignEx.isDynamicView()) {
            com.mbridge.msdk.video.dynview.b.a.a().b();
        }
        try {
            LinkedHashMap<String, View> b8 = com.mbridge.msdk.video.bt.a.d.c().b(this.f19287j, this.f18436K);
            if (b8 != null && b8.size() > 0) {
                for (View view : b8.values()) {
                    if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).onStop();
                    }
                }
            }
        } catch (Throwable th) {
            ad.a(f18425a, th.getMessage());
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x005a. Please report as an issue. */
    @Override // com.mbridge.msdk.video.signal.c
    public void reactDeveloper(Object obj, String str) {
        JSONObject jSONObject;
        int i9;
        if (this.f18431F != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                int optInt = jSONObject2.optInt("type");
                String optString = jSONObject2.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, getUnitId());
                String optString2 = jSONObject2.optString(MBridgeConstans.PLACEMENT_ID, getPlacementId());
                JSONObject optJSONObject = jSONObject2.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
                CampaignEx campaignEx = this.f18429D.get(0);
                boolean z8 = true;
                if (optInt == 1 && optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("expired");
                    if (campaignEx != null) {
                        if (optBoolean) {
                            campaignEx.setSpareOfferFlag(1);
                        } else {
                            campaignEx.setSpareOfferFlag(0);
                        }
                    }
                }
                setCBT(campaignEx);
                JSONObject jSONObject3 = null;
                switch (optInt) {
                    case 1:
                        this.f18431F.a();
                        this.f18431F.a(2, optString2, optString);
                        a(obj);
                        return;
                    case 2:
                        if (optJSONObject != null) {
                            jSONObject3 = optJSONObject.optJSONObject("error");
                        }
                        String str2 = "";
                        if (jSONObject3 != null) {
                            str2 = jSONObject3.optString(NotificationCompat.CATEGORY_MESSAGE);
                        }
                        this.f18431F.a(str2);
                        this.f18431F.a(4, optString2, optString);
                        a(obj);
                        return;
                    case 3:
                        this.f18431F.a(optString2, optString);
                        this.f18431F.a(5, optString2, optString);
                        a(obj);
                        return;
                    case 4:
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("type", 2);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000147", this.f18429D, dVar);
                        } catch (Throwable th) {
                            ad.b(f18425a, th.getMessage());
                        }
                        this.f18431F.b(optString2, optString);
                        this.f18431F.a(6, optString2, optString);
                        a(obj);
                        return;
                    case 5:
                        this.f18431F.a(jSONObject2.optBoolean("isAutoClick"), optString2, optString);
                        a(obj);
                        return;
                    case 6:
                        if (optJSONObject != null) {
                            if (optJSONObject.optInt("convert") != 1) {
                                z8 = false;
                            }
                            jSONObject = optJSONObject.optJSONObject("reward");
                            String optString3 = optJSONObject.optString("extra");
                            if (!TextUtils.isEmpty(optString3)) {
                                this.O = optString3;
                            }
                        } else {
                            z8 = false;
                            jSONObject = null;
                        }
                        CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject.optJSONObject("campaign"));
                        com.mbridge.msdk.videocommon.b.c a6 = com.mbridge.msdk.videocommon.b.c.a(jSONObject);
                        if (a6 == null) {
                            a6 = this.f19289n;
                        }
                        this.f18431F.a(7, optString2, optString);
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar2.a("type", 2);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", parseCampaignWithBackData, dVar2);
                        } catch (Exception e4) {
                            if (MBridgeConstans.DEBUG) {
                                e4.printStackTrace();
                            }
                        }
                        if (this.f19292q && ((i9 = this.f19294s) == com.mbridge.msdk.foundation.same.a.f15660G || i9 == com.mbridge.msdk.foundation.same.a.f15661H)) {
                            this.f18431F.a(this.f18438M, this.f18439N);
                        }
                        if (!z8) {
                            a6.a(0);
                            ad.a("omsdk", "bt videoEvents :" + this.f18443S);
                            P5.b bVar = this.f18443S;
                            if (bVar != null) {
                                try {
                                    O5.k kVar = bVar.f2431a;
                                    R2.b.b(kVar);
                                    kVar.f2232e.c("skipped", null);
                                } catch (Exception e9) {
                                    ad.a("omsdk", e9.getMessage());
                                }
                            }
                        }
                        this.f18431F.a(z8, a6);
                        ad.a(f18425a, "sendToServerRewardInfo");
                        if (!this.f19292q && z8) {
                            if (parseCampaignWithBackData != null) {
                                com.mbridge.msdk.video.module.b.b.a(parseCampaignWithBackData, a6, optString, this.m, this.O);
                            } else {
                                com.mbridge.msdk.video.module.b.b.a(campaignEx, a6, optString, this.m, this.O);
                            }
                        }
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000134", parseCampaignWithBackData);
                        a(obj);
                        return;
                    default:
                        a(obj);
                        return;
                }
            } catch (JSONException e10) {
                a(obj, e10.getMessage());
                ad.a(f18425a, e10.getMessage());
                return;
            }
        }
        a(obj, "listener is null");
    }

    @Override // com.mbridge.msdk.video.signal.c
    public void reportUrls(Object obj, String str) {
        boolean z8;
        boolean z9;
        ad.a(f18425a, "reportUrls:" + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i9);
                    int optInt = jSONObject.optInt("type");
                    String a6 = ai.a(jSONObject.optString("url"), "&tun=", z.q() + "");
                    int optInt2 = jSONObject.optInt("report");
                    CampaignEx campaignEx = null;
                    if (optInt2 == 0) {
                        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
                        List<CampaignEx> list = this.f18429D;
                        if (list != null) {
                            campaignEx = list.get(0);
                        }
                        CampaignEx campaignEx2 = campaignEx;
                        if (optInt != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        com.mbridge.msdk.click.a.a(c9, campaignEx2, "", a6, false, z9);
                    } else {
                        Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
                        List<CampaignEx> list2 = this.f18429D;
                        if (list2 != null) {
                            campaignEx = list2.get(0);
                        }
                        CampaignEx campaignEx3 = campaignEx;
                        if (optInt != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        com.mbridge.msdk.click.a.a(c10, campaignEx3, "", a6, false, z8, optInt2);
                    }
                }
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString("".getBytes(), 2));
            } catch (Throwable th) {
                ad.b(f18425a, "reportUrls", th);
            }
        }
    }

    public void setAdEvents(O5.a aVar) {
        this.f18444T = aVar;
    }

    public void setAdSession(O5.b bVar) {
        this.f18442R = bVar;
    }

    public void setBTContainerCallback(com.mbridge.msdk.video.bt.module.a.a aVar) {
        this.f18431F = aVar;
    }

    public void setCBT(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (campaignEx.getSpareOfferFlag() == 1) {
                com.mbridge.msdk.videocommon.d.c cVar = this.l;
                if (cVar != null) {
                    if (cVar.y() == 1) {
                        campaignEx.setCbt(1);
                        return;
                    } else {
                        campaignEx.setCbt(0);
                        return;
                    }
                }
                return;
            }
            campaignEx.setCbt(0);
        }
    }

    public void setCampaignDownLoadTasks(List<com.mbridge.msdk.videocommon.download.a> list) {
        this.f18430E = list;
    }

    public void setCampaigns(List<CampaignEx> list) {
        CampaignEx campaignEx;
        this.f18429D = list;
        String str = "";
        if (list != null) {
            try {
                if (list.size() > 0 && (campaignEx = list.get(0)) != null) {
                    str = campaignEx.getCurrentLocalRid();
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    e4.printStackTrace();
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            this.f18441Q = com.mbridge.msdk.foundation.same.report.d.c.a().b(str);
        }
        if (this.f18441Q == null) {
            this.f18441Q = new com.mbridge.msdk.foundation.same.report.d.b();
        }
        this.f18441Q.c(str);
        this.f18441Q.b(list);
    }

    public void setChoiceOneCallback(d dVar) {
        this.f18440P = dVar;
    }

    public void setDeveloperExtraData(String str) {
        this.O = str;
    }

    public void setJSFactory(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f19298w = bVar;
    }

    public void setNotchPadding(int i9, int i10, int i11, int i12, int i13) {
        TextView textView;
        FrameLayout.LayoutParams layoutParams;
        try {
            String a6 = r.a(i9, i10, i11, i12, i13);
            ad.b(f18425a, a6);
            WindVaneWebView windVaneWebView = this.f18448f;
            if (windVaneWebView != null && (windVaneWebView.getObject() instanceof k) && !TextUtils.isEmpty(a6)) {
                ((k) this.f18448f.getObject()).b(a6);
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f18448f, "oncutoutfetched", Base64.encodeToString(a6.getBytes(), 0));
            }
            List<CampaignEx> list = this.f18429D;
            if (list != null && list.size() > 0) {
                try {
                    if (this.f18429D.get(0).isDynamicView() && (textView = this.f18451x) != null && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                        if (i10 > 0) {
                            layoutParams.leftMargin = i10;
                        }
                        if (i11 > 0) {
                            layoutParams.rightMargin = i11;
                        }
                        if (i12 > 0) {
                            layoutParams.topMargin = i12;
                        }
                        if (i13 > 0) {
                            layoutParams.bottomMargin = i13;
                        }
                        this.f18451x.setLayoutParams(layoutParams);
                        if (this.f18452y != null) {
                            try {
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f18452y.getLayoutParams());
                                layoutParams2.leftMargin = layoutParams.rightMargin;
                                layoutParams2.topMargin = layoutParams.topMargin;
                                this.f18452y.setLayoutParams(layoutParams2);
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        }
                    }
                } catch (Exception e9) {
                    ad.b(f18425a, e9.getMessage());
                }
            }
            com.mbridge.msdk.video.bt.a.d.c().a(i9, i10, i11, i12, i13);
            LinkedHashMap<String, View> b8 = com.mbridge.msdk.video.bt.a.d.c().b(this.f19287j, this.f18436K);
            if (b8 != null && b8.size() > 0) {
                for (View view : b8.values()) {
                    if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).setNotchPadding(i10, i11, i12, i13);
                    }
                    if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).setNotchPadding(i9, i10, i11, i12, i13);
                    }
                    if ((view instanceof WindVaneWebView) && !TextUtils.isEmpty(a6)) {
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(view, "oncutoutfetched", Base64.encodeToString(a6.getBytes(), 0));
                    }
                }
            }
        } catch (Throwable th) {
            ad.a(f18425a, th.getMessage());
        }
    }

    public void setShowRewardVideoListener(h hVar) {
        this.f18432G = hVar;
    }

    public void setVideoEvents(P5.b bVar) {
        this.f18443S = bVar;
    }

    private com.mbridge.msdk.video.bt.module.a.b c() {
        if (this.f18434I == null) {
            this.f18434I = new com.mbridge.msdk.video.bt.module.a.b() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTContainer.3
                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str) {
                    if (MBridgeBTContainer.this.f18448f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, ((AbstractJSContainer) MBridgeBTContainer.this).f19288k);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, ((AbstractJSContainer) MBridgeBTContainer.this).f19287j);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(MBridgeBTContainer.f18425a, " BT Call H5 onAdShow " + jSONObject.toString());
                        } catch (JSONException e4) {
                            ad.a(MBridgeBTContainer.f18425a, e4.getMessage());
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f18448f, "onSubPlayTemplateViewPlayStart", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void b(String str, String str2, String str3) {
                    if (MBridgeBTContainer.this.f18448f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("convert", true);
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, str3);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(MBridgeBTContainer.f18425a, " BT Call H5 onVideoComplete " + jSONObject.toString());
                        } catch (JSONException e4) {
                            ad.a(MBridgeBTContainer.f18425a, e4.getMessage());
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f18448f, "onSubPlayTemplateViewPlayCompleted", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void c(String str, String str2, String str3) {
                    if (MBridgeBTContainer.this.f18448f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, str3);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(MBridgeBTContainer.f18425a, " BT Call H5 onEndcardShow " + jSONObject.toString());
                        } catch (JSONException e4) {
                            ad.a(MBridgeBTContainer.f18425a, e4.getMessage());
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f18448f, "onSubPlayTemplateViewEndcardShowSuccess", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str, boolean z8, com.mbridge.msdk.videocommon.b.c cVar) {
                    if (MBridgeBTContainer.this.f18448f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            if (cVar != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("name", cVar.a());
                                jSONObject3.put("amount", cVar.b());
                                jSONObject2.put("reward", jSONObject3);
                            }
                            jSONObject2.put("isComplete", z8);
                            jSONObject2.put("convert", z8 ? 1 : 2);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(MBridgeBTContainer.f18425a, " BT Call H5 onAdClose " + jSONObject.toString());
                        } catch (JSONException e4) {
                            ad.a(MBridgeBTContainer.f18425a, e4.getMessage());
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f18448f, "onSubPlayTemplateViewCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f18448f, "onSubPlayTemplateViewDismissed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(boolean z8, int i9) {
                    MBridgeBTContainer.this.f18438M = z8;
                    MBridgeBTContainer.this.f18439N = i9;
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str, String str2) {
                    if (MBridgeBTContainer.this.f18448f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, ((AbstractJSContainer) MBridgeBTContainer.this).f19288k);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, ((AbstractJSContainer) MBridgeBTContainer.this).f19287j);
                            jSONObject2.put("error", str2);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(MBridgeBTContainer.f18425a, " BT Call H5 onShowFail " + jSONObject.toString());
                        } catch (JSONException e4) {
                            ad.a(MBridgeBTContainer.f18425a, e4.getMessage());
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f18448f, "onSubPlayTemplateViewPlayFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str, String str2, String str3) {
                    if (MBridgeBTContainer.this.f18448f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, str3);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(MBridgeBTContainer.f18425a, " BT Call H5 onVideoAdClicked " + jSONObject.toString());
                        } catch (JSONException e4) {
                            ad.a(MBridgeBTContainer.f18425a, e4.getMessage());
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f18448f, "onSubPlayTemplateViewClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str, int i9, String str2, String str3) {
                    if (MBridgeBTContainer.this.f18432G != null) {
                        MBridgeBTContainer.this.f18432G.a(i9, str2, str3);
                    }
                }
            };
        }
        return this.f18434I;
    }

    private com.mbridge.msdk.videocommon.download.a d(CampaignEx campaignEx) {
        List<com.mbridge.msdk.videocommon.download.a> list = this.f18430E;
        if (list == null || campaignEx == null) {
            return null;
        }
        for (com.mbridge.msdk.videocommon.download.a aVar : list) {
            if (aVar.l().getId().equals(campaignEx.getId())) {
                ad.a(f18425a, "tempContainer task initSuccess");
                return aVar;
            }
        }
        return null;
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public final void a(String str) {
        h hVar = this.f18432G;
        if (hVar != null) {
            hVar.a(this.f18441Q, str);
        }
        super.a(str);
    }

    public final void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx, this.f19287j, it.next(), false, true);
                }
            } catch (Throwable th) {
                ad.b(f18425a, th.getMessage());
            }
        }
    }

    public MBridgeBTContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.f18445c = 1;
        this.f18453z = false;
        this.f18426A = true;
        this.f18428C = false;
        this.f18442R = null;
        this.f18443S = null;
        this.f18444T = null;
        init(context);
    }

    public static /* synthetic */ void a(MBridgeBTContainer mBridgeBTContainer, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                HashMap hashMap = new HashMap();
                List<com.mbridge.msdk.foundation.entity.d> a6 = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getCampaignUnitId(), campaignEx.getRequestId());
                if (a6 == null || a6.size() <= 0 || a6.get(0) == null) {
                    return;
                }
                int c9 = a6.get(0).c();
                String b8 = a6.get(0).b();
                if (c9 == 1) {
                    hashMap.put("encrypt_p=", "encrypt_p=" + b8);
                    hashMap.put("irlfa=", "irlfa=1");
                    for (Map.Entry entry : hashMap.entrySet()) {
                        campaignEx.setOnlyImpressionURL(campaignEx.getOnlyImpressionURL().replaceAll((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }
}
