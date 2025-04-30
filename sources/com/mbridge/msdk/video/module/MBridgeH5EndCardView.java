package com.mbridge.msdk.video.module;

import Q7.n0;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.out.Campaign;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public class MBridgeH5EndCardView extends MBridgeH5EndCardViewDiff {

    /* renamed from: A, reason: collision with root package name */
    private boolean f18829A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f18830B;

    /* renamed from: C, reason: collision with root package name */
    private int f18831C;

    /* renamed from: D, reason: collision with root package name */
    private long f18832D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f18833E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f18834F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f18835G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f18836H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f18837I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f18838J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f18839K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f18840L;

    /* renamed from: M, reason: collision with root package name */
    private String f18841M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f18842N;
    private boolean O;
    protected View m;

    /* renamed from: n, reason: collision with root package name */
    protected RelativeLayout f18843n;

    /* renamed from: o, reason: collision with root package name */
    protected ImageView f18844o;

    /* renamed from: p, reason: collision with root package name */
    protected WindVaneWebView f18845p;

    /* renamed from: q, reason: collision with root package name */
    protected Handler f18846q;

    /* renamed from: r, reason: collision with root package name */
    protected String f18847r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f18848s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f18849t;

    /* renamed from: u, reason: collision with root package name */
    Handler f18850u;

    /* renamed from: v, reason: collision with root package name */
    boolean f18851v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f18852w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f18853x;

    /* renamed from: y, reason: collision with root package name */
    private int f18854y;

    /* renamed from: z, reason: collision with root package name */
    private int f18855z;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private MBridgeH5EndCardView b;

        public a(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e4) {
                ad.b("CloseRunnable", e4.getMessage());
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.b;
            if (mBridgeH5EndCardView != null && (handler = mBridgeH5EndCardView.f18850u) != null) {
                handler.sendEmptyMessage(100);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        private MBridgeH5EndCardView b;

        public b(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.b;
            if (mBridgeH5EndCardView != null && !mBridgeH5EndCardView.f18830B) {
                this.b.f18830B = true;
                this.b.f18848s = false;
                MBridgeH5EndCardView.this.reportRenderResult("timeout", 5);
                this.b.notifyListener.a(127, "");
                ad.a(MBridgeBaseView.TAG, "notify TYPE_NOTIFY_SHOW_NATIVE_ENDCARD");
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f18863a;
        private int b;

        public c(MBridgeH5EndCardView mBridgeH5EndCardView, int i9) {
            this.f18863a = mBridgeH5EndCardView;
            this.b = i9;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f18863a;
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.b != null) {
                try {
                    if (!mBridgeH5EndCardView.f18829A) {
                        this.f18863a.f18829A = true;
                        if (an.b(this.f18863a.b.getendcard_url()) && this.f18863a.b.getendcard_url().contains(".zip")) {
                            str = "1";
                        } else {
                            str = MBridgeConstans.API_REUQEST_CATEGORY_APP;
                        }
                        n nVar = new n("m_download_end", 12, (this.b * 1000) + "", this.f18863a.b.getendcard_url(), this.f18863a.b.getId(), this.f18863a.unitId, "ready timeout", str);
                        try {
                            if (this.f18863a.b.getAdType() == 287) {
                                nVar.d("3");
                            } else if (this.f18863a.b.getAdType() == 94) {
                                nVar.d("1");
                            } else if (this.f18863a.b.getAdType() == 42) {
                                nVar.d(MBridgeConstans.API_REUQEST_CATEGORY_APP);
                            }
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                        nVar.f(this.f18863a.b.getRequestId());
                        nVar.s(this.f18863a.b.getCurrentLocalRid());
                        nVar.g(this.f18863a.b.getRequestIdNotice());
                        nVar.c(this.f18863a.b.getAdSpaceT());
                        this.f18863a.isLoadSuccess();
                        return;
                    }
                    ad.c(MBridgeBaseView.TAG, "insertEndCardReadyState hasInsertLoadEndCardReport true return");
                } catch (Throwable th) {
                    ad.b(MBridgeBaseView.TAG, th.getMessage(), th);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        private MBridgeH5EndCardView b;

        public d(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.b;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.f18837I = true;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {
        private MBridgeH5EndCardView b;

        public e(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.b;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.f18838J = true;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {
        private MBridgeH5EndCardView b;

        public f(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.b;
            if (mBridgeH5EndCardView != null) {
                if (!mBridgeH5EndCardView.f18839K) {
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
                this.b.f18834F = true;
            }
        }
    }

    public MBridgeH5EndCardView(Context context) {
        super(context);
        this.f18852w = false;
        this.f18846q = new Handler();
        this.f18848s = false;
        this.f18849t = false;
        this.f18853x = false;
        this.f18854y = 1;
        this.f18855z = 1;
        this.f18829A = false;
        this.f18830B = false;
        this.f18831C = 1;
        this.f18832D = 0L;
        this.f18833E = false;
        this.f18834F = false;
        this.f18835G = false;
        this.f18836H = false;
        this.f18837I = false;
        this.f18838J = false;
        this.f18839K = false;
        this.f18840L = false;
        this.f18841M = "";
        this.f18850u = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what == 100) {
                    if (MBridgeH5EndCardView.this.f18833E) {
                        MBridgeH5EndCardView.this.notifyListener.a(122, "");
                    }
                    MBridgeH5EndCardView.this.notifyListener.a(103, "");
                }
            }
        };
        this.f18842N = false;
        this.O = false;
        this.f18851v = false;
    }

    public static /* synthetic */ void f(MBridgeH5EndCardView mBridgeH5EndCardView) {
        RelativeLayout.LayoutParams layoutParams;
        try {
            CampaignEx campaignEx = mBridgeH5EndCardView.b;
            if (campaignEx != null) {
                campaignEx.setCampaignUnitId(mBridgeH5EndCardView.unitId);
                com.mbridge.msdk.foundation.d.b.a().c(mBridgeH5EndCardView.unitId + "_1");
                com.mbridge.msdk.foundation.d.b.a().a(mBridgeH5EndCardView.unitId + "_2", mBridgeH5EndCardView.b);
            }
            CampaignEx campaignEx2 = mBridgeH5EndCardView.b;
            if (campaignEx2 != null && campaignEx2.isMraid()) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                imageView.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_notice", "drawable"));
                ImageView imageView2 = mBridgeH5EndCardView.f18844o;
                if (imageView2 != null) {
                    layoutParams = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f), ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f));
                layoutParams2.addRule(9);
                layoutParams2.addRule(10);
                if (layoutParams != null) {
                    layoutParams2.leftMargin = layoutParams.rightMargin;
                    layoutParams2.topMargin = layoutParams.topMargin;
                    layoutParams2.width = layoutParams.width;
                    layoutParams2.height = layoutParams.height;
                } else {
                    layoutParams2.leftMargin = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f);
                    layoutParams2.topMargin = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f);
                }
                mBridgeH5EndCardView.addView(imageView, layoutParams2);
                ai.a(4, imageView, mBridgeH5EndCardView.b, com.mbridge.msdk.foundation.controller.c.m().c(), false, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.5
                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a() {
                        String str;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.b(MBridgeBaseView.TAG, th.getMessage(), th);
                            str = "";
                        }
                        g.a().a((WebView) MBridgeH5EndCardView.this.f18845p, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void b() {
                        String str;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.b(MBridgeBaseView.TAG, th.getMessage(), th);
                            str = "";
                        }
                        g.a().a((WebView) MBridgeH5EndCardView.this.f18845p, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a(String str) {
                        String str2;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                            }
                            str2 = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.b(MBridgeBaseView.TAG, th.getMessage(), th);
                            str2 = "";
                        }
                        g.a().a((WebView) MBridgeH5EndCardView.this.f18845p, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                    }
                });
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public boolean canBackPress() {
        ImageView imageView = this.f18844o;
        if (imageView != null && imageView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e4) {
            ad.b(MBridgeBaseView.TAG, e4.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    public void excuteEndCardShowTask(int i9) {
        this.f18846q.postDelayed(new c(this, i9), i9 * 1000);
    }

    public void excuteTask() {
        if (!this.f18853x && this.f18854y > -1) {
            this.f18846q.postDelayed(new f(this), this.f18854y * 1000);
        }
    }

    public void executeEndCardShow(int i9) {
        this.f18846q.postDelayed(new b(this), i9 * 1000);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z8) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.b;
    }

    public void handlerPlayableException(String str) {
        if (!this.f18849t) {
            this.f18849t = true;
            this.f18848s = false;
            if (this.b != null) {
                n nVar = new n();
                nVar.f(this.b.getRequestId());
                nVar.g(this.b.getRequestIdNotice());
                nVar.e(this.b.getId());
                nVar.h(str);
                com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f18768a.getApplicationContext(), this.unitId);
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_endcard_h5");
        if (findLayout >= 0) {
            View inflate = this.f18769c.inflate(findLayout, (ViewGroup) null);
            this.m = inflate;
            try {
                this.f18844o = (ImageView) inflate.findViewById(findID("mbridge_windwv_close"));
                this.f18843n = (RelativeLayout) inflate.findViewById(findID("mbridge_windwv_content_rl"));
                WindVaneWebView windVaneWebView = new WindVaneWebView(getContext());
                this.f18845p = windVaneWebView;
                CampaignEx campaignEx = this.b;
                if (campaignEx != null) {
                    windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
                }
                this.f18845p.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f18843n.addView(this.f18845p);
                this.f18771e = isNotNULL(this.f18844o, this.f18845p);
            } catch (Exception unused) {
                this.f18771e = false;
            }
            addView(this.m, b());
            c();
            e();
        }
    }

    public void install(CampaignEx campaignEx) {
    }

    public boolean isLoadSuccess() {
        return this.f18848s;
    }

    public boolean isPlayable() {
        return this.f18853x;
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i9) {
        if (i9 != 0) {
            if (i9 == 1) {
                this.f18836H = true;
                return;
            }
            return;
        }
        this.f18835G = true;
    }

    public void onBackPress() {
        boolean z8;
        if (this.f18834F || (((z8 = this.f18835G) && this.f18836H) || ((!z8 && this.f18837I && !this.f18851v) || (!z8 && this.f18838J && this.f18851v)))) {
            onCloseViewClick();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.mbridge.msdk.foundation.same.report.d.c] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.mbridge.msdk.foundation.entity.CampaignEx] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0032 -> B:6:0x0057). Please report as a decompilation issue!!! */
    public void onCloseViewClick() {
        Object obj = "";
        int i9 = 119;
        int i10 = 103;
        try {
            if (this.f18845p != null) {
                g.a().a((WebView) this.f18845p, "onSystemDestory", "");
                new Thread(new a(this)).start();
            } else {
                this.notifyListener.a(103, "");
                this.notifyListener.a(119, "webview is null when closing webview");
            }
        } catch (Exception e4) {
            this.notifyListener.a(i10, obj);
            this.notifyListener.a(i9, "close webview exception" + e4.getMessage());
            ad.a(MBridgeBaseView.TAG, e4.getMessage());
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar);
            obj = com.mbridge.msdk.foundation.same.report.d.c.a();
            i9 = "2000134";
            i10 = this.b;
            obj.a("2000134", i10);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onFinishRedirection(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        ah.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onRedirectionFailed(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        ah.a(campaign, this);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onStartRedirection(Campaign campaign, String str) {
        ah.b(campaign, this);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i9) {
        super.onVisibilityChanged(view, i9);
        if (i9 == 0 && !this.f18840L) {
            this.f18840L = true;
            setFocusableInTouchMode(true);
            requestFocus();
            requestFocusFromTouch();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        CampaignEx campaignEx = this.b;
        if (campaignEx != null && campaignEx.isMraid()) {
            if (z8) {
                com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f18845p, "true");
            } else {
                com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f18845p, "false");
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        super.open(str);
    }

    public void orientation(Configuration configuration) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            g.a().a((WebView) this.f18845p, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        final boolean z8;
        int o3;
        Boolean b8 = com.mbridge.msdk.foundation.same.b.a().b();
        if (b8 != null && b8.booleanValue() && this.b.getAdSpaceT() == 2) {
            reportRenderResult("PL URL IS NULL", 3);
            this.notifyListener.a(127, "");
            this.notifyListener.a(129, "");
            return;
        }
        String a6 = a();
        if (this.f18771e && this.b != null && !TextUtils.isEmpty(a6)) {
            this.f18832D = System.currentTimeMillis();
            try {
                reportRenderResult("start", 0);
            } catch (Exception unused) {
            }
            com.mbridge.msdk.foundation.same.g.a aVar = new com.mbridge.msdk.foundation.same.g.a(this.b);
            aVar.a(this.b.getAppName());
            this.f18845p.setDownloadListener(aVar);
            this.f18845p.setCampaignId(this.b.getId());
            this.f18845p.setTempTypeForMetrics(3);
            CampaignEx campaignEx = this.b;
            if (campaignEx != null) {
                this.f18845p.setCampaignEx(campaignEx);
            }
            setCloseVisible(8);
            this.f18845p.setApiManagerJSFactory(bVar);
            if (this.b.isMraid()) {
                this.f18845p.setMraidObject(this);
            }
            if (!a6.contains("wfr=1") && !a6.contains("wfl=1")) {
                z8 = false;
            } else {
                z8 = true;
            }
            this.f18845p.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.3
                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, String str) {
                    super.a(webView, str);
                    MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                    if (mBridgeH5EndCardView.f18849t) {
                        return;
                    }
                    mBridgeH5EndCardView.f18848s = true;
                    mBridgeH5EndCardView.notifyListener.a(100, "");
                    if (MBridgeH5EndCardView.this.b != null) {
                        n nVar = new n();
                        nVar.f(MBridgeH5EndCardView.this.b.getRequestId());
                        nVar.g(MBridgeH5EndCardView.this.b.getRequestIdNotice());
                        nVar.e(MBridgeH5EndCardView.this.b.getId());
                        nVar.b(1);
                        nVar.l(String.valueOf(System.currentTimeMillis() - MBridgeH5EndCardView.this.f18832D));
                        nVar.h("onPageFinished");
                        int adType = MBridgeH5EndCardView.this.b.getAdType();
                        String str2 = MBridgeConstans.API_REUQEST_CATEGORY_APP;
                        if (adType == 287) {
                            nVar.d("3");
                        } else if (MBridgeH5EndCardView.this.b.getAdType() == 94) {
                            nVar.d("1");
                        } else if (MBridgeH5EndCardView.this.b.getAdType() == 42) {
                            nVar.d(MBridgeConstans.API_REUQEST_CATEGORY_APP);
                        }
                        if (MBridgeH5EndCardView.this.b.isMraid()) {
                            nVar.d(n.f15616a);
                        } else {
                            nVar.n(MBridgeH5EndCardView.this.b.getendcard_url());
                            if (an.b(MBridgeH5EndCardView.this.b.getendcard_url()) && MBridgeH5EndCardView.this.b.getendcard_url().contains(".zip")) {
                                str2 = "1";
                            }
                            nVar.o(str2);
                            nVar.d(n.b);
                        }
                        MBridgeH5EndCardView mBridgeH5EndCardView2 = MBridgeH5EndCardView.this;
                        com.mbridge.msdk.foundation.same.report.g.b(nVar, mBridgeH5EndCardView2.unitId, mBridgeH5EndCardView2.b);
                    }
                    MBridgeH5EndCardView.this.notifyListener.a(120, "");
                    if (z8) {
                        return;
                    }
                    try {
                        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                        dVar.a("type", 3);
                        dVar.a("result", 1);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", MBridgeH5EndCardView.this.b, dVar);
                    } catch (Throwable th) {
                        ad.b("WindVaneWebView", th.getMessage());
                    }
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void c(WebView webView, int i9) {
                    super.c(webView, i9);
                    MBridgeH5EndCardView.this.f18831C = i9;
                    if (!MBridgeH5EndCardView.this.f18830B) {
                        MBridgeH5EndCardView.this.f18830B = true;
                        if (i9 == 1) {
                            MBridgeH5EndCardView.this.reportRenderResult("success", 4);
                        } else {
                            MBridgeH5EndCardView.this.notifyListener.a(127, "");
                            MBridgeH5EndCardView.this.reportRenderResult("failed", 6);
                        }
                    }
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, int i9, String str, String str2) {
                    super.a(webView, i9, str, str2);
                    MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                    if (mBridgeH5EndCardView.f18849t) {
                        return;
                    }
                    mBridgeH5EndCardView.notifyListener.a(118, "onReceivedError " + i9 + str);
                    MBridgeH5EndCardView.this.reportRenderResult(str, 3);
                    MBridgeH5EndCardView.this.notifyListener.a(127, "");
                    MBridgeH5EndCardView.this.notifyListener.a(129, "");
                    MBridgeH5EndCardView.this.f18849t = true;
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, int i9) {
                    super.a(webView, i9);
                    StringBuilder p2 = n0.p(i9, "h5EncardView readyStatus:", "- isError");
                    p2.append(MBridgeH5EndCardView.this.f18849t);
                    ad.c("WindVaneWebView", p2.toString());
                    MBridgeH5EndCardView.this.f18831C = i9;
                    if (!MBridgeH5EndCardView.this.f18849t) {
                        MBridgeH5EndCardView.a(MBridgeH5EndCardView.this, System.currentTimeMillis() - MBridgeH5EndCardView.this.f18832D, false);
                    }
                    if (z8) {
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("type", 3);
                            dVar.a("result", Integer.valueOf(i9));
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", MBridgeH5EndCardView.this.b, dVar);
                        } catch (Throwable th) {
                            ad.b("WindVaneWebView", th.getMessage());
                        }
                    }
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView) {
                    super.a(webView);
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
            });
            if (TextUtils.isEmpty(this.b.getMraid())) {
                try {
                    this.f18832D = System.currentTimeMillis();
                    String str = this.b.getendcard_url();
                    com.mbridge.msdk.videocommon.d.c a9 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.unitId);
                    if (this.f18853x) {
                        if (an.b(str)) {
                            if (!str.contains("wfr=1")) {
                                if (a9 != null && a9.o() > 0) {
                                }
                            }
                            if (str.contains("wfr=1")) {
                                String[] split = str.split("&");
                                if (split != null && split.length > 0) {
                                    for (String str2 : split) {
                                        if (an.b(str2) && str2.contains("to") && str2.split("=") != null && str2.split("=").length > 0) {
                                            o3 = ai.a((Object) str2.split("=")[1]);
                                            break;
                                        }
                                    }
                                }
                                o3 = 20;
                            } else {
                                if (a9 != null && a9.o() > 0) {
                                    o3 = a9.o();
                                }
                                o3 = 20;
                            }
                            if (o3 >= 0) {
                                excuteEndCardShowTask(o3);
                            } else {
                                excuteEndCardShowTask(20);
                            }
                        }
                    }
                } catch (Throwable th) {
                    ad.b(MBridgeBaseView.TAG, th.getMessage(), th);
                }
            }
            setHtmlSource(HTMLResourceManager.getInstance().getHtmlContentFromUrl(a6));
            if (TextUtils.isEmpty(this.f18847r)) {
                this.f18845p.loadUrl(a6);
            } else {
                this.f18845p.loadDataWithBaseURL(a6, this.f18847r, "text/html", "UTF-8", null);
            }
        } else {
            reportRenderResult("PL URL IS NULL", 3);
            this.notifyListener.a(127, "");
            this.notifyListener.a(129, "");
        }
        this.f18851v = false;
    }

    public void readyStatus(int i9) {
    }

    public void release() {
        Handler handler = this.f18846q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f18846q = null;
        }
        Handler handler2 = this.f18850u;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.f18850u = null;
        }
        this.f18843n.removeAllViews();
        this.f18845p.release();
        this.f18845p = null;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void reportOpen(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.unitId, str, this.b.isBidCampaign());
        }
    }

    public void reportRenderResult(String str, int i9) {
        if (this.b != null && !this.f18849t) {
            n nVar = new n();
            nVar.f(this.b.getRequestId());
            nVar.g(this.b.getRequestIdNotice());
            nVar.e(this.b.getId());
            nVar.b(i9);
            nVar.l(String.valueOf(System.currentTimeMillis() - this.f18832D));
            nVar.h(str);
            int adType = this.b.getAdType();
            String str2 = MBridgeConstans.API_REUQEST_CATEGORY_APP;
            if (adType == 287) {
                nVar.d("3");
            } else if (this.b.getAdType() == 94) {
                nVar.d("1");
            } else if (this.b.getAdType() == 42) {
                nVar.d(MBridgeConstans.API_REUQEST_CATEGORY_APP);
            }
            if (this.b.isMraid()) {
                nVar.d(n.f15616a);
            } else {
                nVar.n(this.b.getendcard_url());
                if (an.b(this.b.getendcard_url()) && this.b.getendcard_url().contains(".zip")) {
                    str2 = "1";
                }
                nVar.o(str2);
                nVar.d(n.b);
            }
            com.mbridge.msdk.foundation.same.report.g.b(nVar, this.unitId, this.b);
        }
    }

    public void setCloseDelayShowTime(int i9) {
        this.f18854y = i9;
    }

    public void setCloseVisible(int i9) {
        if (this.f18771e) {
            this.f18844o.setVisibility(i9);
        }
    }

    public void setCloseVisibleForMraid(int i9) {
        if (this.f18771e) {
            this.f18839K = true;
            if (i9 == 4) {
                this.f18844o.setImageDrawable(new ColorDrawable(16711680));
            } else {
                this.f18844o.setImageResource(findDrawable("mbridge_reward_close"));
            }
            this.f18844o.setVisibility(0);
        }
    }

    public void setError(boolean z8) {
        this.f18849t = z8;
    }

    public void setHtmlSource(String str) {
        this.f18847r = str;
    }

    public void setLoadPlayable(boolean z8) {
        this.f18851v = z8;
    }

    public void setNotchValue(String str, int i9, int i10, int i11, int i12) {
        this.f18841M = str;
        CampaignEx campaignEx = this.b;
        if (campaignEx != null && campaignEx.getAdSpaceT() != 2) {
            ad.b(MBridgeBaseView.TAG, "NOTCH H5ENDCARD ".concat(String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12))));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f18844o.getLayoutParams();
            int a6 = ai.a(getContext(), 20.0f);
            layoutParams.setMargins(i9 + a6, i11 + a6, i10 + a6, i12 + a6);
            this.f18844o.setLayoutParams(layoutParams);
        }
    }

    public void setPlayCloseBtnTm(int i9) {
        this.f18855z = i9;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String str = this.b.getendcard_url();
            if (an.b(str) && str.contains("wfl=1")) {
                String[] split = str.split("&");
                int i9 = 15;
                if (split != null && split.length > 0) {
                    for (String str2 : split) {
                        if (an.b(str2) && str2.contains("timeout") && str2.split("=") != null && str2.split("=").length > 0) {
                            i9 = ai.a((Object) str2.split("=")[1]);
                        }
                    }
                }
                executeEndCardShow(i9);
            }
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i9) {
        int visibility = this.f18844o.getVisibility();
        if (i9 != 1) {
            if (i9 == 2) {
                this.f18834F = false;
                if (this.f18851v) {
                    if (!this.O && !this.f18835G) {
                        this.O = true;
                        int i10 = this.f18855z;
                        if (i10 == 0) {
                            this.f18838J = true;
                        } else {
                            this.f18838J = false;
                            if (i10 > -1) {
                                this.f18846q.postDelayed(new e(this), this.f18855z * 1000);
                            }
                        }
                    }
                } else if (!this.f18842N && !this.f18835G) {
                    this.f18842N = true;
                    int i11 = this.f18854y;
                    if (i11 == 0) {
                        this.f18837I = true;
                    } else {
                        this.f18837I = false;
                        if (i11 > -1) {
                            this.f18846q.postDelayed(new d(this), this.f18854y * 1000);
                        }
                    }
                }
                visibility = 8;
            }
        } else {
            this.f18834F = true;
            visibility = 0;
        }
        setCloseVisible(visibility);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z8) {
        int i9;
        if (z8) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        try {
            setCloseVisibleForMraid(i9);
        } catch (Exception e4) {
            ad.b(MBridgeBaseView.TAG, e4.getMessage());
        }
    }

    public void volumeChange(double d2) {
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f18845p, d2);
    }

    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f18845p;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.4
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    try {
                        ad.a(MBridgeBaseView.TAG, "webviewshow");
                        try {
                            int[] iArr = new int[2];
                            MBridgeH5EndCardView.this.f18845p.getLocationOnScreen(iArr);
                            ad.b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
                            if (c9 != null) {
                                jSONObject.put("startX", ai.b(c9, iArr[0]));
                                jSONObject.put("startY", ai.b(c9, iArr[1]));
                                jSONObject.put(com.mbridge.msdk.foundation.same.a.l, ai.d(c9));
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.b(MBridgeBaseView.TAG, th.getMessage(), th);
                            str = "";
                        }
                        g.a().a((WebView) MBridgeH5EndCardView.this.f18845p, "webviewshow", Base64.encodeToString(str.toString().getBytes(), 2));
                        MBridgeH5EndCardView.this.notifyListener.a(109, "");
                        MBridgeH5EndCardView.d(MBridgeH5EndCardView.this);
                        MBridgeH5EndCardView.this.startCounterEndCardShowTimer();
                        g a6 = g.a();
                        MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                        a6.a((WebView) mBridgeH5EndCardView.f18845p, "oncutoutfetched", Base64.encodeToString(mBridgeH5EndCardView.f18841M.getBytes(), 0));
                        MBridgeH5EndCardView.f(MBridgeH5EndCardView.this);
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
            });
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:8|9|(1:63)(1:13)|14|(1:16)(2:59|(1:61)(14:62|18|19|20|(1:22)(2:50|(1:52)(2:53|(1:55)))|23|24|25|26|(1:28)|29|(1:31)|33|(1:44)(4:37|(1:39)(1:43)|40|42)))|17|18|19|20|(0)(0)|23|24|25|26|(0)|29|(0)|33|(2:35|44)(1:45)) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010d, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b(com.mbridge.msdk.video.module.MBridgeBaseView.TAG, r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0094, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b2, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e A[Catch: all -> 0x002d, NullPointerException -> 0x0094, TryCatch #1 {NullPointerException -> 0x0094, blocks: (B:20:0x0084, B:22:0x008e, B:50:0x0096, B:52:0x00a0, B:53:0x00a4, B:55:0x00ae), top: B:19:0x0084, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f1 A[Catch: all -> 0x002d, Exception -> 0x00f9, TryCatch #0 {Exception -> 0x00f9, blocks: (B:26:0x00db, B:28:0x00f1, B:29:0x00fb, B:31:0x0105), top: B:25:0x00db, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0105 A[Catch: all -> 0x002d, Exception -> 0x00f9, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f9, blocks: (B:26:0x00db, B:28:0x00f1, B:29:0x00fb, B:31:0x0105), top: B:25:0x00db, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096 A[Catch: all -> 0x002d, NullPointerException -> 0x0094, TryCatch #1 {NullPointerException -> 0x0094, blocks: (B:20:0x0084, B:22:0x008e, B:50:0x0096, B:52:0x00a0, B:53:0x00a4, B:55:0x00ae), top: B:19:0x0084, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(com.mbridge.msdk.video.module.MBridgeH5EndCardView r20, long r21, boolean r23) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.a(com.mbridge.msdk.video.module.MBridgeH5EndCardView, long, boolean):void");
    }

    public static /* synthetic */ void d(MBridgeH5EndCardView mBridgeH5EndCardView) {
        CampaignEx campaignEx = mBridgeH5EndCardView.b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        int i9 = mBridgeH5EndCardView.getResources().getConfiguration().orientation;
        String str = AdError.UNDEFINED_DOMAIN;
        if (i9 != 0) {
            if (i9 == 1) {
                str = "portrait";
            } else if (i9 == 2) {
                str = "landscape";
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("placementType", "Interstitial");
        hashMap.put("state", "default");
        hashMap.put("viewable", "true");
        hashMap.put("currentAppOrientation", jSONObject);
        if (mBridgeH5EndCardView.getContext() instanceof Activity) {
            float i10 = z.i(mBridgeH5EndCardView.getContext());
            float g9 = z.g(mBridgeH5EndCardView.getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) mBridgeH5EndCardView.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f9 = displayMetrics.widthPixels;
            float f10 = displayMetrics.heightPixels;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(mBridgeH5EndCardView.f18845p, i10, g9);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(mBridgeH5EndCardView.f18845p, f9, f10);
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.f18845p, r7.getLeft(), mBridgeH5EndCardView.f18845p.getTop(), mBridgeH5EndCardView.f18845p.getWidth(), mBridgeH5EndCardView.f18845p.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(mBridgeH5EndCardView.f18845p, r13.getLeft(), mBridgeH5EndCardView.f18845p.getTop(), mBridgeH5EndCardView.f18845p.getWidth(), mBridgeH5EndCardView.f18845p.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.f18845p, hashMap);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.f18845p, com.mbridge.msdk.mbsignalcommon.mraid.d.f16652a);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.f18845p);
    }

    public RelativeLayout.LayoutParams b() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        super.c();
        if (this.f18771e) {
            this.f18844o.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBridgeH5EndCardView.this.onCloseViewClick();
                }
            });
        }
    }

    public void e() {
        if (this.f18771e) {
            setMatchParent();
        }
    }

    public MBridgeH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18852w = false;
        this.f18846q = new Handler();
        this.f18848s = false;
        this.f18849t = false;
        this.f18853x = false;
        this.f18854y = 1;
        this.f18855z = 1;
        this.f18829A = false;
        this.f18830B = false;
        this.f18831C = 1;
        this.f18832D = 0L;
        this.f18833E = false;
        this.f18834F = false;
        this.f18835G = false;
        this.f18836H = false;
        this.f18837I = false;
        this.f18838J = false;
        this.f18839K = false;
        this.f18840L = false;
        this.f18841M = "";
        this.f18850u = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what == 100) {
                    if (MBridgeH5EndCardView.this.f18833E) {
                        MBridgeH5EndCardView.this.notifyListener.a(122, "");
                    }
                    MBridgeH5EndCardView.this.notifyListener.a(103, "");
                }
            }
        };
        this.f18842N = false;
        this.O = false;
        this.f18851v = false;
    }

    public String a() {
        String endScreenUrl;
        CampaignEx campaignEx = this.b;
        if (campaignEx != null) {
            this.f18833E = true;
            if (campaignEx.isMraid()) {
                this.f18853x = false;
                String mraid = this.b.getMraid();
                if (!TextUtils.isEmpty(mraid)) {
                    File file = new File(mraid);
                    try {
                        if (file.exists() && file.isFile() && file.canRead()) {
                            endScreenUrl = "file:////" + mraid;
                        } else {
                            endScreenUrl = this.b.getEndScreenUrl();
                        }
                        return endScreenUrl;
                    } catch (Throwable th) {
                        if (!MBridgeConstans.DEBUG) {
                            return mraid;
                        }
                        th.printStackTrace();
                        return mraid;
                    }
                }
                return this.b.getEndScreenUrl();
            }
            String str = this.b.getendcard_url();
            if (!an.a(str)) {
                this.f18853x = true;
                String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(str);
                if (TextUtils.isEmpty(h5ResAddress)) {
                    try {
                        String path = Uri.parse(str).getPath();
                        if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".zip")) {
                            String endScreenUrl2 = this.b.getEndScreenUrl();
                            if (TextUtils.isEmpty(endScreenUrl2)) {
                                return null;
                            }
                            this.f18853x = false;
                            excuteTask();
                            return endScreenUrl2;
                        }
                    } catch (Throwable th2) {
                        ad.b(MBridgeBaseView.TAG, th2.getMessage());
                    }
                    StringBuilder c9 = AbstractC2965e.c(str, "&native_adtype=");
                    c9.append(this.b.getAdType());
                    return c9.toString();
                }
                StringBuilder c10 = AbstractC2965e.c(h5ResAddress, "&native_adtype=");
                c10.append(this.b.getAdType());
                return c10.toString();
            }
            this.f18853x = false;
            return this.b.getEndScreenUrl();
        }
        this.f18833E = false;
        return null;
    }
}
