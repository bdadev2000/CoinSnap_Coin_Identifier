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
import androidx.appcompat.widget.r3;
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
import eb.j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kd.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeBTContainer extends AbstractJSContainer implements c {
    private static final String a = "MBridgeBTContainer";
    private boolean A;
    private String B;
    private boolean C;
    private List<CampaignEx> D;
    private List<com.mbridge.msdk.videocommon.download.a> E;
    private com.mbridge.msdk.video.bt.module.a.a F;
    private h G;
    private h H;
    private com.mbridge.msdk.video.bt.module.a.b I;
    private String J;
    private String K;
    private String L;
    private boolean M;
    private int N;
    private String O;
    private d P;
    private com.mbridge.msdk.foundation.same.report.d.b Q;
    private kd.b R;
    private ld.b S;
    private kd.a T;

    /* renamed from: b, reason: collision with root package name */
    private int f15631b;

    /* renamed from: c, reason: collision with root package name */
    private int f15632c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f15633d;

    /* renamed from: e, reason: collision with root package name */
    private MBridgeBTLayout f15634e;

    /* renamed from: f, reason: collision with root package name */
    private WindVaneWebView f15635f;

    /* renamed from: g, reason: collision with root package name */
    private LayoutInflater f15636g;

    /* renamed from: h, reason: collision with root package name */
    private Context f15637h;

    /* renamed from: x, reason: collision with root package name */
    private TextView f15638x;

    /* renamed from: y, reason: collision with root package name */
    private ImageView f15639y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f15640z;

    /* loaded from: classes4.dex */
    public static final class a implements Runnable {
        private List<CampaignEx> a;

        /* renamed from: b, reason: collision with root package name */
        private Context f15641b;

        /* renamed from: c, reason: collision with root package name */
        private String f15642c;

        /* renamed from: d, reason: collision with root package name */
        private String f15643d;

        public a(List<CampaignEx> list, Context context, String str, String str2) {
            this.a = list;
            this.f15641b = context;
            this.f15642c = str;
            this.f15643d = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            List<CampaignEx> list = this.a;
            if (list != null && list.size() > 0) {
                try {
                    e.a(g.a(this.f15641b)).a(this.f15642c, this.a);
                    com.mbridge.msdk.videocommon.a.a.a().c(this.f15643d, this.a.get(0).getAdType());
                } catch (Exception unused) {
                    ad.a(MBridgeBTContainer.a, "remove campaign failed");
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public class b extends a.C0213a {
        private b() {
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0213a, com.mbridge.msdk.video.signal.a.InterfaceC0212a
        public final void a() {
            super.a();
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0213a, com.mbridge.msdk.video.signal.a.InterfaceC0212a
        public final void b() {
            super.b();
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0213a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            ah.a(campaign, MBridgeBTContainer.this.f15633d);
            if (campaign != null && (campaign instanceof CampaignEx)) {
                try {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    String optString = new JSONObject(MBridgeBTContainer.this.getJSVideoModule().getCurrentProgress()).optString(NotificationCompat.CATEGORY_PROGRESS, "");
                    if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && optString.equals("1.0") && ((AbstractJSContainer) MBridgeBTContainer.this).f16295i != null) {
                        if (MBridgeBTContainer.this.A) {
                            MBridgeBTContainer.this.onAdClose();
                        } else {
                            ((AbstractJSContainer) MBridgeBTContainer.this).f16295i.finish();
                        }
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0213a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
            ah.a(campaign, MBridgeBTContainer.this.f15633d);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0213a, com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
            ah.b(campaign, MBridgeBTContainer.this.f15633d);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0213a, com.mbridge.msdk.video.signal.a.InterfaceC0212a
        public final void a(boolean z10) {
            super.a(z10);
            if (MBridgeBTContainer.this.S != null) {
                try {
                    MBridgeBTContainer.this.S.a();
                    ad.a("omsdk", "btc adUserInteraction click");
                } catch (Exception e2) {
                    ad.a("omsdk", e2.getMessage());
                }
            }
            MBridgeBTContainer.this.H.a(z10, ((AbstractJSContainer) MBridgeBTContainer.this).f16297k, ((AbstractJSContainer) MBridgeBTContainer.this).f16296j);
        }

        @Override // com.mbridge.msdk.video.signal.a.a.C0213a, com.mbridge.msdk.video.signal.a.InterfaceC0212a
        public final void a(int i10, String str) {
            super.a(i10, str);
        }
    }

    public MBridgeBTContainer(Context context) {
        super(context);
        this.f15631b = 0;
        this.f15632c = 1;
        this.f15640z = false;
        this.A = true;
        this.C = false;
        this.R = null;
        this.S = null;
        this.T = null;
        init(context);
    }

    public void addNativeCloseButtonWhenWebViewCrash() {
        try {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
            int a10 = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 48.0f);
            int a11 = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 20.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a10, a10);
            layoutParams.setMargins(a11, a11, a11, a11);
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
        } catch (Throwable th2) {
            ad.b(a, th2.getMessage());
        }
    }

    public void appendSubView(MBridgeBTContainer mBridgeBTContainer, MBTempContainer mBTempContainer, JSONObject jSONObject) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (jSONObject != null) {
                Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
                int optInt = jSONObject.optInt(TtmlNode.LEFT, -999);
                int optInt2 = jSONObject.optInt("top", -999);
                int optInt3 = jSONObject.optInt(TtmlNode.RIGHT, -999);
                int optInt4 = jSONObject.optInt("bottom", -999);
                if (optInt != -999 && c10 != null) {
                    layoutParams.leftMargin = ai.a(c10, optInt);
                }
                if (optInt2 != -999 && c10 != null) {
                    layoutParams.topMargin = ai.a(c10, optInt2);
                }
                if (optInt3 != -999 && c10 != null) {
                    layoutParams.rightMargin = ai.a(c10, optInt3);
                }
                if (optInt4 != -999 && c10 != null) {
                    layoutParams.bottomMargin = ai.a(c10, optInt4);
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
            mBTempContainer.setActivity(this.f16295i);
            mBTempContainer.setMute(this.f16302p);
            mBTempContainer.setBidCampaign(this.f15640z);
            mBTempContainer.setIV(this.f16303q);
            mBTempContainer.setBigOffer(this.A);
            mBTempContainer.setIVRewardEnable(this.f16305s, this.f16306t, this.u);
            mBTempContainer.setShowRewardListener(this.H);
            mBTempContainer.setCampaignDownLoadTask(d(mBTempContainer.getCampaign()));
            mBTempContainer.setMBridgeTempCallback(c());
            mBTempContainer.setWebViewFront(getJSCommon().a());
            mBTempContainer.init(this.f15637h);
            mBTempContainer.onCreate();
        } catch (Throwable th2) {
            ad.a(a, th2.getMessage());
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f15635f != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", this.f15631b);
                jSONObject2.put("id", this.B);
                jSONObject2.put("eventName", str);
                jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject);
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f15635f, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.mbridge.msdk.video.bt.a.d.c().a((WebView) this.f15635f, "broadcast", this.B);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i10, String str) {
    }

    public int findID(String str) {
        return v.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return v.a(getContext(), str, TtmlNode.TAG_LAYOUT);
    }

    public kd.a getAdEvents() {
        return this.T;
    }

    public kd.b getAdSession() {
        return this.R;
    }

    public List<CampaignEx> getCampaigns() {
        return this.D;
    }

    public ld.b getVideoEvents() {
        return this.S;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i10, String str) {
    }

    public void init(Context context) {
        this.f15637h = context;
        this.f15636g = LayoutInflater.from(context);
    }

    public void onAdClose() {
        Activity activity = this.f16295i;
        if (activity != null) {
            activity.finish();
        }
    }

    public void onBackPressed() {
        try {
            LinkedHashMap<String, View> b3 = com.mbridge.msdk.video.bt.a.d.c().b(this.f16296j, this.K);
            if (b3 != null && b3.size() > 0) {
                for (View view : b3.values()) {
                    if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).onBackPressed();
                    } else if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).onBackPressed();
                    } else if (view instanceof MBridgeBTLayout) {
                        ((MBridgeBTLayout) view).onBackPressed();
                    }
                }
            }
        } catch (Throwable th2) {
            ad.a(a, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        try {
            LinkedHashMap<String, View> b3 = com.mbridge.msdk.video.bt.a.d.c().b(this.f16296j, this.K);
            if (b3 != null && b3.size() > 0) {
                for (View view : b3.values()) {
                    if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).onConfigurationChanged(configuration);
                    } else if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).onConfigurationChanged(configuration);
                    } else if (view instanceof MBridgeBTLayout) {
                        ((MBridgeBTLayout) view).onConfigurationChanged(configuration);
                    }
                }
            }
        } catch (Throwable th2) {
            ad.a(a, th2.getMessage());
        }
    }

    public void onCreate(boolean z10) {
        String str;
        WindVaneWebView windVaneWebView;
        CampaignEx campaignEx;
        try {
            int findLayout = findLayout("mbridge_bt_container");
            if (findLayout < 0) {
                a("mbridge_bt_container layout null");
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.f15636g.inflate(findLayout, this);
            this.f15633d = frameLayout;
            if (frameLayout == null) {
                a("ViewIds null");
                return;
            }
            this.K = "";
            List<CampaignEx> list = this.D;
            if (list == null || list.size() <= 0) {
                str = "";
            } else {
                CampaignEx campaignEx2 = this.D.get(0);
                str = campaignEx2.getCMPTEntryUrl();
                this.K = campaignEx2.getRequestId();
                this.L = campaignEx2.getCurrentLocalRid();
            }
            a.C0214a a10 = com.mbridge.msdk.videocommon.a.a(this.f16296j + "_" + this.K + "_" + str);
            RelativeLayout.LayoutParams layoutParams = null;
            if (a10 != null) {
                this.B = a10.b();
                ad.a(a, "get BT wraper.getTag = " + this.B);
                a10.a("");
                windVaneWebView = a10.a();
            } else {
                windVaneWebView = null;
            }
            this.f15635f = windVaneWebView;
            com.mbridge.msdk.videocommon.a.b(this.f16296j + "_" + this.K + "_" + str);
            kd.b bVar = this.R;
            if (bVar != null) {
                try {
                    bVar.d(this);
                    this.R.f();
                    ad.a("omsdk", "btc:  adSession.start();");
                    if (this.T != null) {
                        ad.a("omsdk", "btc:   adEvents.loaded");
                        this.T.d(new r3(0));
                        ad.a("omsdk", "btc:   adEvents.impressionOccurred");
                        this.T.b();
                    }
                } catch (Exception e2) {
                    ad.a("omsdk", e2.getMessage());
                }
            }
            WindVaneWebView windVaneWebView2 = this.f15635f;
            if (windVaneWebView2 != null) {
                com.mbridge.msdk.video.signal.factory.b bVar2 = new com.mbridge.msdk.video.signal.factory.b(this.f16295i, this, windVaneWebView2);
                registerJsFactory(bVar2);
                this.f15635f.setApiManagerJSFactory(bVar2);
                if (this.f15635f.getParent() != null) {
                    a("preload template webview is null or load error");
                    return;
                }
                if (this.f15635f.getObject() instanceof k) {
                    bVar2.a((k) this.f15635f.getObject());
                    if (this.f15635f != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(com.mbridge.msdk.foundation.same.a.f13281l, ai.d(getContext()));
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", this.f16300n.a());
                            jSONObject2.put("amount", this.f16300n.b());
                            jSONObject2.put("id", this.f16301o);
                            jSONObject.put("userId", this.f16299m);
                            jSONObject.put("reward", jSONObject2);
                            jSONObject.put("playVideoMute", this.f16302p);
                            jSONObject.put("extra", this.O);
                        } catch (JSONException e10) {
                            ad.a(a, e10.getMessage());
                        } catch (Exception e11) {
                            ad.a(a, e11.getMessage());
                        }
                        this.H = new com.mbridge.msdk.video.bt.module.b.c(c(), "");
                        String jSONObject3 = jSONObject.toString();
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("type", 1);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000133", this.D, dVar);
                        } catch (Exception unused) {
                        }
                        getJSNotifyProxy().a(jSONObject3);
                        getJSCommon().b(true);
                        getJSCommon().a(new b());
                    }
                    ((com.mbridge.msdk.video.signal.a.d) getJSCommon()).f16085m.a();
                }
                this.f15635f.setBackgroundColor(0);
                LinkedHashMap<String, View> b3 = com.mbridge.msdk.video.bt.a.d.c().b(this.f16296j, this.K);
                if (b3 != null && b3.containsKey(this.B)) {
                    View view = b3.get(this.B);
                    if (view instanceof MBridgeBTLayout) {
                        MBridgeBTLayout mBridgeBTLayout = (MBridgeBTLayout) view;
                        this.f15634e = mBridgeBTLayout;
                        try {
                            WindVaneWebView windVaneWebView3 = (WindVaneWebView) mBridgeBTLayout.getBtWebView();
                            k kVar = (k) windVaneWebView3.getObject();
                            kVar.a(this.T);
                            kVar.a(this.S);
                            kVar.a(this.R);
                            windVaneWebView3.setObject(kVar);
                        } catch (Exception e12) {
                            ad.b(a, e12.getMessage());
                        }
                        com.mbridge.msdk.foundation.d.b.a().a(this.f16296j + "_1", new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTContainer.1
                            @Override // com.mbridge.msdk.foundation.d.a
                            public final void a() {
                                String str2;
                                try {
                                    JSONObject jSONObject4 = new JSONObject();
                                    if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                        jSONObject4.put(NotificationCompat.CATEGORY_STATUS, 1);
                                    }
                                    str2 = jSONObject4.toString();
                                } catch (Throwable th2) {
                                    ad.b(MBridgeBTContainer.a, th2.getMessage(), th2);
                                    str2 = "";
                                }
                                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f15635f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
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
                                } catch (Throwable th2) {
                                    ad.b(MBridgeBTContainer.a, th2.getMessage(), th2);
                                    str2 = "";
                                }
                                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f15635f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
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
                                } catch (Throwable th2) {
                                    ad.b(MBridgeBTContainer.a, th2.getMessage(), th2);
                                    str3 = "";
                                }
                                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f15635f, "onFeedbackAlertStatusNotify", Base64.encodeToString(str3.getBytes(), 2));
                            }
                        });
                        this.f15634e.addView(this.f15635f, 0, new FrameLayout.LayoutParams(-1, -1));
                        com.mbridge.msdk.foundation.d.b.a().c(this.f16296j + "_2");
                        FeedBackButton b10 = com.mbridge.msdk.foundation.d.b.a().b(this.f16296j + "_1");
                        if (com.mbridge.msdk.foundation.d.b.a().b() && b10 != null) {
                            try {
                                layoutParams = (RelativeLayout.LayoutParams) b10.getLayoutParams();
                            } catch (Exception e13) {
                                e13.printStackTrace();
                            }
                            if (layoutParams == null) {
                                layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.d.b.f13102b, com.mbridge.msdk.foundation.d.b.a);
                            }
                            layoutParams.topMargin = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 10.0f);
                            layoutParams.leftMargin = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 10.0f);
                            b10.setLayoutParams(layoutParams);
                            ViewGroup viewGroup = (ViewGroup) b10.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(b10);
                            }
                            this.f15634e.addView(b10);
                        }
                        this.f15634e.setTag(this.B);
                        b3.put(this.B, this.f15634e);
                        Iterator<View> it = b3.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof MBridgeBTRootLayout) {
                                MBridgeBTRootLayout mBridgeBTRootLayout = (MBridgeBTRootLayout) next;
                                this.J = mBridgeBTRootLayout.getInstanceId();
                                this.f15633d.addView(mBridgeBTRootLayout, new FrameLayout.LayoutParams(-1, -1));
                                break;
                            }
                        }
                        b3.remove(this.J);
                        b3.put(this.J, this);
                    }
                    com.mbridge.msdk.video.bt.a.d.c().a(this.f16296j, this.f16302p);
                    com.mbridge.msdk.video.bt.a.d.c().a(this.B, this.K);
                    com.mbridge.msdk.video.bt.a.d.c().a(this.J, this.K);
                    com.mbridge.msdk.video.bt.a.d.c().a(this.f16296j + "_" + this.K, this.f16295i);
                    try {
                        com.mbridge.msdk.foundation.same.f.b.b().execute(new a(this.D, getContext().getApplicationContext(), this.f16296j, this.f16297k));
                    } catch (Throwable unused2) {
                        ad.a(a, "remove campaign failed");
                    }
                    List<CampaignEx> list2 = this.D;
                    if (list2 != null && list2.size() > 0) {
                        a(this.f16298l, this.D.get(0));
                        return;
                    }
                    return;
                }
                a("big template webviewLayout is null");
                return;
            }
            List<CampaignEx> list3 = this.D;
            if (list3 != null && list3.size() > 0 && (campaignEx = this.D.get(0)) != null && (z10 || campaignEx.isDynamicView())) {
                Context context = this.f15637h;
                if (this.P == null) {
                    a("ChoiceOneCallback is null");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("choice_one_callback", this.P);
                com.mbridge.msdk.video.dynview.b.a();
                new com.mbridge.msdk.video.dynview.h.a(context, this.D, new com.mbridge.msdk.video.dynview.e.h() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTContainer.2
                    @Override // com.mbridge.msdk.video.dynview.e.h
                    public final void a(com.mbridge.msdk.video.dynview.a aVar) {
                        CampaignEx campaignEx3;
                        String sb2;
                        if (aVar != null) {
                            if (MBridgeBTContainer.this.f15633d != null && aVar.a() != null) {
                                MBridgeBTContainer.this.f15633d.removeAllViews();
                                MBridgeBTContainer.this.f15633d.addView(aVar.a());
                                MBridgeBTContainer mBridgeBTContainer = MBridgeBTContainer.this;
                                mBridgeBTContainer.f15638x = (TextView) mBridgeBTContainer.findViewById(mBridgeBTContainer.findID("mbridge_choice_one_countdown_tv"));
                                MBridgeBTContainer mBridgeBTContainer2 = MBridgeBTContainer.this;
                                mBridgeBTContainer2.f15639y = (ImageView) mBridgeBTContainer2.findViewById(mBridgeBTContainer2.findID("mbridge_iv_link"));
                                if (MBridgeBTContainer.this.F != null) {
                                    MBridgeBTContainer.this.F.a();
                                    MBridgeBTContainer.this.F.a(2, ((AbstractJSContainer) MBridgeBTContainer.this).f16297k, ((AbstractJSContainer) MBridgeBTContainer.this).f16296j);
                                }
                                if (MBridgeBTContainer.this.D == null || MBridgeBTContainer.this.D.size() <= 0 || (campaignEx3 = (CampaignEx) MBridgeBTContainer.this.D.get(0)) == null) {
                                    return;
                                }
                                if (campaignEx3.isBidCampaign()) {
                                    MBridgeBTContainer.a(MBridgeBTContainer.this, campaignEx3);
                                }
                                String onlyImpressionURL = campaignEx3.getOnlyImpressionURL();
                                com.mbridge.msdk.videocommon.d.c a11 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), ((AbstractJSContainer) MBridgeBTContainer.this).f16296j);
                                int y4 = a11 != null ? a11.y() : 1;
                                if (campaignEx3.getSpareOfferFlag() == 1) {
                                    StringBuilder n10 = j.n(onlyImpressionURL, "&to=1&cbt=");
                                    n10.append(campaignEx3.getCbt());
                                    n10.append("&tmorl=");
                                    n10.append(y4);
                                    sb2 = n10.toString();
                                } else {
                                    StringBuilder n11 = j.n(onlyImpressionURL, "&to=0&cbt=");
                                    n11.append(campaignEx3.getCbt());
                                    n11.append("&tmorl=");
                                    n11.append(y4);
                                    sb2 = n11.toString();
                                }
                                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx3, ((AbstractJSContainer) MBridgeBTContainer.this).f16296j, sb2, false, true, com.mbridge.msdk.click.a.a.f12481h);
                                com.mbridge.msdk.foundation.same.a.b.f13306k.put(campaignEx3.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
                                MBridgeBTContainer.this.a(campaignEx3);
                                try {
                                    com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                                    dVar2.a("type", "choseFromTwoShow");
                                    com.mbridge.msdk.video.module.b.a.a("2000103", campaignEx3, dVar2);
                                    return;
                                } catch (Exception e14) {
                                    if (MBridgeConstans.DEBUG) {
                                        e14.printStackTrace();
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
        } catch (Throwable th2) {
            a("onCreate exception " + th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        if (this.C) {
            return;
        }
        this.C = true;
        if (this.R != null) {
            ad.b("omsdk", "btc onDestroy");
            this.R.c();
        }
        super.onDestroy();
        com.mbridge.msdk.video.bt.a.d.c().d(this.f16296j + "_" + this.K);
        try {
            WindVaneWebView windVaneWebView = this.f15635f;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f15635f.clearWebView();
                this.f15635f.release();
            }
            if (this.I != null) {
                this.I = null;
            }
            if (this.F != null) {
                this.F = null;
            }
            if (this.f15637h != null) {
                this.f15637h = null;
            }
            List<CampaignEx> list = this.D;
            if (list != null && list.size() > 0) {
                for (CampaignEx campaignEx : this.D) {
                    if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
                        com.mbridge.msdk.videocommon.a.b(this.f16296j + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e());
                    }
                }
                com.mbridge.msdk.video.dynview.b.a.a().b();
            }
            com.mbridge.msdk.video.bt.a.d.c().f(this.B);
            com.mbridge.msdk.video.bt.a.d.c().g(this.f16296j);
            com.mbridge.msdk.video.bt.a.d.c().b(this.f16296j, this.K).remove(this.B);
            com.mbridge.msdk.video.bt.a.d.c().b(this.f16296j, this.K).remove(this.J);
            com.mbridge.msdk.video.bt.a.d.c().b(this.f16296j, this.K).clear();
        } catch (Throwable th2) {
            ad.a(a, th2.getMessage());
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
        List<CampaignEx> list = this.D;
        if (list != null && list.size() > 0 && (campaignEx = this.D.get(0)) != null && campaignEx.isDynamicView() && (aVar = com.mbridge.msdk.video.dynview.b.a.a().a) != null) {
            aVar.b();
        }
        try {
            LinkedHashMap<String, View> b3 = com.mbridge.msdk.video.bt.a.d.c().b(this.f16296j, this.K);
            if (b3 != null && b3.size() > 0) {
                for (View view : b3.values()) {
                    if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).onPause();
                    }
                }
            }
        } catch (Throwable th2) {
            ad.a(a, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onResume() {
        CampaignEx campaignEx;
        com.mbridge.msdk.video.dynview.d.a aVar;
        super.onResume();
        List<CampaignEx> list = this.D;
        if (list != null && list.size() > 0 && (campaignEx = this.D.get(0)) != null && campaignEx.isDynamicView() && (aVar = com.mbridge.msdk.video.dynview.b.a.a().a) != null) {
            aVar.a();
        }
        if (com.mbridge.msdk.foundation.d.b.f13103c) {
            return;
        }
        try {
            LinkedHashMap<String, View> b3 = com.mbridge.msdk.video.bt.a.d.c().b(this.f16296j, this.K);
            if (b3 != null && b3.size() > 0) {
                for (View view : b3.values()) {
                    if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).onResume();
                    }
                }
            }
        } catch (Throwable th2) {
            ad.a(a, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onStop() {
        CampaignEx campaignEx;
        super.onStop();
        List<CampaignEx> list = this.D;
        if (list != null && list.size() > 0 && (campaignEx = this.D.get(0)) != null && campaignEx.isDynamicView()) {
            com.mbridge.msdk.video.dynview.b.a.a().b();
        }
        try {
            LinkedHashMap<String, View> b3 = com.mbridge.msdk.video.bt.a.d.c().b(this.f16296j, this.K);
            if (b3 != null && b3.size() > 0) {
                for (View view : b3.values()) {
                    if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).onStop();
                    }
                }
            }
        } catch (Throwable th2) {
            ad.a(a, th2.getMessage());
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0057. Please report as an issue. */
    @Override // com.mbridge.msdk.video.signal.c
    public void reactDeveloper(Object obj, String str) {
        JSONObject jSONObject;
        int i10;
        if (this.F != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                int optInt = jSONObject2.optInt("type");
                String optString = jSONObject2.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, getUnitId());
                String optString2 = jSONObject2.optString(MBridgeConstans.PLACEMENT_ID, getPlacementId());
                JSONObject optJSONObject = jSONObject2.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
                CampaignEx campaignEx = this.D.get(0);
                boolean z10 = true;
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
                        this.F.a();
                        this.F.a(2, optString2, optString);
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
                        this.F.a(str2);
                        this.F.a(4, optString2, optString);
                        a(obj);
                        return;
                    case 3:
                        this.F.a(optString2, optString);
                        this.F.a(5, optString2, optString);
                        a(obj);
                        return;
                    case 4:
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("type", 2);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000147", this.D, dVar);
                        } catch (Throwable th2) {
                            ad.b(a, th2.getMessage());
                        }
                        this.F.b(optString2, optString);
                        this.F.a(6, optString2, optString);
                        a(obj);
                        return;
                    case 5:
                        this.F.a(jSONObject2.optBoolean("isAutoClick"), optString2, optString);
                        a(obj);
                        return;
                    case 6:
                        if (optJSONObject != null) {
                            if (optJSONObject.optInt("convert") != 1) {
                                z10 = false;
                            }
                            jSONObject = optJSONObject.optJSONObject("reward");
                            String optString3 = optJSONObject.optString("extra");
                            if (!TextUtils.isEmpty(optString3)) {
                                this.O = optString3;
                            }
                        } else {
                            z10 = false;
                            jSONObject = null;
                        }
                        CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject.optJSONObject("campaign"));
                        com.mbridge.msdk.videocommon.b.c a10 = com.mbridge.msdk.videocommon.b.c.a(jSONObject);
                        if (a10 == null) {
                            a10 = this.f16300n;
                        }
                        this.F.a(7, optString2, optString);
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar2.a("type", 2);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", parseCampaignWithBackData, dVar2);
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                e2.printStackTrace();
                            }
                        }
                        if (this.f16303q && ((i10 = this.f16305s) == com.mbridge.msdk.foundation.same.a.G || i10 == com.mbridge.msdk.foundation.same.a.H)) {
                            this.F.a(this.M, this.N);
                        }
                        if (!z10) {
                            a10.a(0);
                            ad.a("omsdk", "bt videoEvents :" + this.S);
                            ld.b bVar = this.S;
                            if (bVar != null) {
                                try {
                                    i iVar = bVar.a;
                                    com.facebook.internal.i.d(iVar);
                                    iVar.f20672e.a("skipped", null);
                                } catch (Exception e10) {
                                    ad.a("omsdk", e10.getMessage());
                                }
                            }
                        }
                        this.F.a(z10, a10);
                        ad.a(a, "sendToServerRewardInfo");
                        if (!this.f16303q && z10) {
                            if (parseCampaignWithBackData != null) {
                                com.mbridge.msdk.video.module.b.b.a(parseCampaignWithBackData, a10, optString, this.f16299m, this.O);
                            } else {
                                com.mbridge.msdk.video.module.b.b.a(campaignEx, a10, optString, this.f16299m, this.O);
                            }
                        }
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000134", parseCampaignWithBackData);
                        a(obj);
                        return;
                    default:
                        a(obj);
                        return;
                }
            } catch (JSONException e11) {
                a(obj, e11.getMessage());
                ad.a(a, e11.getMessage());
                return;
            }
        }
        a(obj, "listener is null");
    }

    @Override // com.mbridge.msdk.video.signal.c
    public void reportUrls(Object obj, String str) {
        boolean z10;
        boolean z11;
        ad.a(a, "reportUrls:" + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    int optInt = jSONObject.optInt("type");
                    String a10 = ai.a(jSONObject.optString("url"), "&tun=", z.q() + "");
                    int optInt2 = jSONObject.optInt("report");
                    CampaignEx campaignEx = null;
                    if (optInt2 == 0) {
                        Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
                        List<CampaignEx> list = this.D;
                        if (list != null) {
                            campaignEx = list.get(0);
                        }
                        CampaignEx campaignEx2 = campaignEx;
                        if (optInt != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        com.mbridge.msdk.click.a.a(c10, campaignEx2, "", a10, false, z11);
                    } else {
                        Context c11 = com.mbridge.msdk.foundation.controller.c.m().c();
                        List<CampaignEx> list2 = this.D;
                        if (list2 != null) {
                            campaignEx = list2.get(0);
                        }
                        CampaignEx campaignEx3 = campaignEx;
                        if (optInt != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        com.mbridge.msdk.click.a.a(c11, campaignEx3, "", a10, false, z10, optInt2);
                    }
                }
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString("".getBytes(), 2));
            } catch (Throwable th2) {
                ad.b(a, "reportUrls", th2);
            }
        }
    }

    public void setAdEvents(kd.a aVar) {
        this.T = aVar;
    }

    public void setAdSession(kd.b bVar) {
        this.R = bVar;
    }

    public void setBTContainerCallback(com.mbridge.msdk.video.bt.module.a.a aVar) {
        this.F = aVar;
    }

    public void setCBT(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (campaignEx.getSpareOfferFlag() == 1) {
                com.mbridge.msdk.videocommon.d.c cVar = this.f16298l;
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
        this.E = list;
    }

    public void setCampaigns(List<CampaignEx> list) {
        CampaignEx campaignEx;
        this.D = list;
        String str = "";
        if (list != null) {
            try {
                if (list.size() > 0 && (campaignEx = list.get(0)) != null) {
                    str = campaignEx.getCurrentLocalRid();
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            this.Q = com.mbridge.msdk.foundation.same.report.d.c.a().b(str);
        }
        if (this.Q == null) {
            this.Q = new com.mbridge.msdk.foundation.same.report.d.b();
        }
        this.Q.c(str);
        this.Q.b(list);
    }

    public void setChoiceOneCallback(d dVar) {
        this.P = dVar;
    }

    public void setDeveloperExtraData(String str) {
        this.O = str;
    }

    public void setJSFactory(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f16308w = bVar;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13, int i14) {
        TextView textView;
        FrameLayout.LayoutParams layoutParams;
        try {
            String a10 = r.a(i10, i11, i12, i13, i14);
            ad.b(a, a10);
            WindVaneWebView windVaneWebView = this.f15635f;
            if (windVaneWebView != null && (windVaneWebView.getObject() instanceof k) && !TextUtils.isEmpty(a10)) {
                ((k) this.f15635f.getObject()).b(a10);
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f15635f, "oncutoutfetched", Base64.encodeToString(a10.getBytes(), 0));
            }
            List<CampaignEx> list = this.D;
            if (list != null && list.size() > 0) {
                try {
                    if (this.D.get(0).isDynamicView() && (textView = this.f15638x) != null && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                        if (i11 > 0) {
                            layoutParams.leftMargin = i11;
                        }
                        if (i12 > 0) {
                            layoutParams.rightMargin = i12;
                        }
                        if (i13 > 0) {
                            layoutParams.topMargin = i13;
                        }
                        if (i14 > 0) {
                            layoutParams.bottomMargin = i14;
                        }
                        this.f15638x.setLayoutParams(layoutParams);
                        if (this.f15639y != null) {
                            try {
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f15639y.getLayoutParams());
                                layoutParams2.leftMargin = layoutParams.rightMargin;
                                layoutParams2.topMargin = layoutParams.topMargin;
                                this.f15639y.setLayoutParams(layoutParams2);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                } catch (Exception e10) {
                    ad.b(a, e10.getMessage());
                }
            }
            com.mbridge.msdk.video.bt.a.d.c().a(i10, i11, i12, i13, i14);
            LinkedHashMap<String, View> b3 = com.mbridge.msdk.video.bt.a.d.c().b(this.f16296j, this.K);
            if (b3 != null && b3.size() > 0) {
                for (View view : b3.values()) {
                    if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).setNotchPadding(i11, i12, i13, i14);
                    }
                    if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).setNotchPadding(i10, i11, i12, i13, i14);
                    }
                    if ((view instanceof WindVaneWebView) && !TextUtils.isEmpty(a10)) {
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(view, "oncutoutfetched", Base64.encodeToString(a10.getBytes(), 0));
                    }
                }
            }
        } catch (Throwable th2) {
            ad.a(a, th2.getMessage());
        }
    }

    public void setShowRewardVideoListener(h hVar) {
        this.G = hVar;
    }

    public void setVideoEvents(ld.b bVar) {
        this.S = bVar;
    }

    private com.mbridge.msdk.video.bt.module.a.b c() {
        if (this.I == null) {
            this.I = new com.mbridge.msdk.video.bt.module.a.b() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTContainer.3
                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str) {
                    if (MBridgeBTContainer.this.f15635f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, ((AbstractJSContainer) MBridgeBTContainer.this).f16297k);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, ((AbstractJSContainer) MBridgeBTContainer.this).f16296j);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(MBridgeBTContainer.a, " BT Call H5 onAdShow " + jSONObject.toString());
                        } catch (JSONException e2) {
                            ad.a(MBridgeBTContainer.a, e2.getMessage());
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f15635f, "onSubPlayTemplateViewPlayStart", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void b(String str, String str2, String str3) {
                    if (MBridgeBTContainer.this.f15635f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("convert", true);
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, str3);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(MBridgeBTContainer.a, " BT Call H5 onVideoComplete " + jSONObject.toString());
                        } catch (JSONException e2) {
                            ad.a(MBridgeBTContainer.a, e2.getMessage());
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f15635f, "onSubPlayTemplateViewPlayCompleted", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void c(String str, String str2, String str3) {
                    if (MBridgeBTContainer.this.f15635f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, str3);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(MBridgeBTContainer.a, " BT Call H5 onEndcardShow " + jSONObject.toString());
                        } catch (JSONException e2) {
                            ad.a(MBridgeBTContainer.a, e2.getMessage());
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f15635f, "onSubPlayTemplateViewEndcardShowSuccess", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str, boolean z10, com.mbridge.msdk.videocommon.b.c cVar) {
                    if (MBridgeBTContainer.this.f15635f != null) {
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
                            jSONObject2.put("isComplete", z10);
                            jSONObject2.put("convert", z10 ? 1 : 2);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(MBridgeBTContainer.a, " BT Call H5 onAdClose " + jSONObject.toString());
                        } catch (JSONException e2) {
                            ad.a(MBridgeBTContainer.a, e2.getMessage());
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f15635f, "onSubPlayTemplateViewCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f15635f, "onSubPlayTemplateViewDismissed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(boolean z10, int i10) {
                    MBridgeBTContainer.this.M = z10;
                    MBridgeBTContainer.this.N = i10;
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str, String str2) {
                    if (MBridgeBTContainer.this.f15635f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, ((AbstractJSContainer) MBridgeBTContainer.this).f16297k);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, ((AbstractJSContainer) MBridgeBTContainer.this).f16296j);
                            jSONObject2.put("error", str2);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(MBridgeBTContainer.a, " BT Call H5 onShowFail " + jSONObject.toString());
                        } catch (JSONException e2) {
                            ad.a(MBridgeBTContainer.a, e2.getMessage());
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f15635f, "onSubPlayTemplateViewPlayFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str, String str2, String str3) {
                    if (MBridgeBTContainer.this.f15635f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, str3);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(MBridgeBTContainer.a, " BT Call H5 onVideoAdClicked " + jSONObject.toString());
                        } catch (JSONException e2) {
                            ad.a(MBridgeBTContainer.a, e2.getMessage());
                        }
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) MBridgeBTContainer.this.f15635f, "onSubPlayTemplateViewClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.b
                public final void a(String str, int i10, String str2, String str3) {
                    if (MBridgeBTContainer.this.G != null) {
                        MBridgeBTContainer.this.G.a(i10, str2, str3);
                    }
                }
            };
        }
        return this.I;
    }

    private com.mbridge.msdk.videocommon.download.a d(CampaignEx campaignEx) {
        List<com.mbridge.msdk.videocommon.download.a> list = this.E;
        if (list == null || campaignEx == null) {
            return null;
        }
        for (com.mbridge.msdk.videocommon.download.a aVar : list) {
            if (aVar.l().getId().equals(campaignEx.getId())) {
                ad.a(a, "tempContainer task initSuccess");
                return aVar;
            }
        }
        return null;
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public final void a(String str) {
        h hVar = this.G;
        if (hVar != null) {
            hVar.a(this.Q, str);
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
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx, this.f16296j, it.next(), false, true);
                }
            } catch (Throwable th2) {
                ad.b(a, th2.getMessage());
            }
        }
    }

    public MBridgeBTContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15631b = 0;
        this.f15632c = 1;
        this.f15640z = false;
        this.A = true;
        this.C = false;
        this.R = null;
        this.S = null;
        this.T = null;
        init(context);
    }

    public static /* synthetic */ void a(MBridgeBTContainer mBridgeBTContainer, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                HashMap hashMap = new HashMap();
                List<com.mbridge.msdk.foundation.entity.d> a10 = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getCampaignUnitId(), campaignEx.getRequestId());
                if (a10 == null || a10.size() <= 0 || a10.get(0) == null) {
                    return;
                }
                int c10 = a10.get(0).c();
                String b3 = a10.get(0).b();
                if (c10 == 1) {
                    hashMap.put("encrypt_p=", "encrypt_p=" + b3);
                    hashMap.put("irlfa=", "irlfa=1");
                    for (Map.Entry entry : hashMap.entrySet()) {
                        campaignEx.setOnlyImpressionURL(campaignEx.getOnlyImpressionURL().replaceAll((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
