package com.mbridge.msdk.video.module;

import a4.j;
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

/* loaded from: classes4.dex */
public class MBridgeH5EndCardView extends MBridgeH5EndCardViewDiff {
    private boolean A;
    private boolean B;
    private int C;
    private long D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private String M;
    private boolean N;
    private boolean O;

    /* renamed from: m, reason: collision with root package name */
    protected View f15931m;

    /* renamed from: n, reason: collision with root package name */
    protected RelativeLayout f15932n;

    /* renamed from: o, reason: collision with root package name */
    protected ImageView f15933o;

    /* renamed from: p, reason: collision with root package name */
    protected WindVaneWebView f15934p;

    /* renamed from: q, reason: collision with root package name */
    protected Handler f15935q;

    /* renamed from: r, reason: collision with root package name */
    protected String f15936r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f15937s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f15938t;
    Handler u;

    /* renamed from: v, reason: collision with root package name */
    boolean f15939v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f15940w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f15941x;

    /* renamed from: y, reason: collision with root package name */
    private int f15942y;

    /* renamed from: z, reason: collision with root package name */
    private int f15943z;

    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private MBridgeH5EndCardView f15945b;

        public a(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f15945b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e2) {
                ad.b("CloseRunnable", e2.getMessage());
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f15945b;
            if (mBridgeH5EndCardView != null && (handler = mBridgeH5EndCardView.u) != null) {
                handler.sendEmptyMessage(100);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private MBridgeH5EndCardView f15946b;

        public b(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f15946b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f15946b;
            if (mBridgeH5EndCardView != null && !mBridgeH5EndCardView.B) {
                this.f15946b.B = true;
                this.f15946b.f15937s = false;
                MBridgeH5EndCardView.this.reportRenderResult("timeout", 5);
                this.f15946b.notifyListener.a(127, "");
                ad.a(MBridgeBaseView.TAG, "notify TYPE_NOTIFY_SHOW_NATIVE_ENDCARD");
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class c implements Runnable {
        private MBridgeH5EndCardView a;

        /* renamed from: b, reason: collision with root package name */
        private int f15947b;

        public c(MBridgeH5EndCardView mBridgeH5EndCardView, int i10) {
            this.a = mBridgeH5EndCardView;
            this.f15947b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            MBridgeH5EndCardView mBridgeH5EndCardView = this.a;
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f15895b != null) {
                try {
                    if (!mBridgeH5EndCardView.A) {
                        this.a.A = true;
                        if (an.b(this.a.f15895b.getendcard_url()) && this.a.f15895b.getendcard_url().contains(".zip")) {
                            str = "1";
                        } else {
                            str = MBridgeConstans.API_REUQEST_CATEGORY_APP;
                        }
                        n nVar = new n("m_download_end", 12, (this.f15947b * 1000) + "", this.a.f15895b.getendcard_url(), this.a.f15895b.getId(), this.a.unitId, "ready timeout", str);
                        try {
                            if (this.a.f15895b.getAdType() == 287) {
                                nVar.d("3");
                            } else if (this.a.f15895b.getAdType() == 94) {
                                nVar.d("1");
                            } else if (this.a.f15895b.getAdType() == 42) {
                                nVar.d(MBridgeConstans.API_REUQEST_CATEGORY_APP);
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        nVar.f(this.a.f15895b.getRequestId());
                        nVar.s(this.a.f15895b.getCurrentLocalRid());
                        nVar.g(this.a.f15895b.getRequestIdNotice());
                        nVar.c(this.a.f15895b.getAdSpaceT());
                        this.a.isLoadSuccess();
                        return;
                    }
                    ad.c(MBridgeBaseView.TAG, "insertEndCardReadyState hasInsertLoadEndCardReport true return");
                } catch (Throwable th2) {
                    ad.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private MBridgeH5EndCardView f15948b;

        public d(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f15948b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f15948b;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.I = true;
            }
        }
    }

    /* loaded from: classes4.dex */
    public class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private MBridgeH5EndCardView f15949b;

        public e(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f15949b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f15949b;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.J = true;
            }
        }
    }

    /* loaded from: classes4.dex */
    public class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private MBridgeH5EndCardView f15950b;

        public f(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f15950b = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f15950b;
            if (mBridgeH5EndCardView != null) {
                if (!mBridgeH5EndCardView.K) {
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
                this.f15950b.F = true;
            }
        }
    }

    public MBridgeH5EndCardView(Context context) {
        super(context);
        this.f15940w = false;
        this.f15935q = new Handler();
        this.f15937s = false;
        this.f15938t = false;
        this.f15941x = false;
        this.f15942y = 1;
        this.f15943z = 1;
        this.A = false;
        this.B = false;
        this.C = 1;
        this.D = 0L;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = "";
        this.u = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what == 100) {
                    if (MBridgeH5EndCardView.this.E) {
                        MBridgeH5EndCardView.this.notifyListener.a(122, "");
                    }
                    MBridgeH5EndCardView.this.notifyListener.a(103, "");
                }
            }
        };
        this.N = false;
        this.O = false;
        this.f15939v = false;
    }

    public static /* synthetic */ void f(MBridgeH5EndCardView mBridgeH5EndCardView) {
        RelativeLayout.LayoutParams layoutParams;
        try {
            CampaignEx campaignEx = mBridgeH5EndCardView.f15895b;
            if (campaignEx != null) {
                campaignEx.setCampaignUnitId(mBridgeH5EndCardView.unitId);
                com.mbridge.msdk.foundation.d.b.a().c(mBridgeH5EndCardView.unitId + "_1");
                com.mbridge.msdk.foundation.d.b.a().a(mBridgeH5EndCardView.unitId + "_2", mBridgeH5EndCardView.f15895b);
            }
            CampaignEx campaignEx2 = mBridgeH5EndCardView.f15895b;
            if (campaignEx2 != null && campaignEx2.isMraid()) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                imageView.setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_reward_notice", "drawable"));
                ImageView imageView2 = mBridgeH5EndCardView.f15933o;
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
                ai.a(4, imageView, mBridgeH5EndCardView.f15895b, com.mbridge.msdk.foundation.controller.c.m().c(), false, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.5
                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a() {
                        String str;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                                jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th2) {
                            ad.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                            str = "";
                        }
                        g.a().a((WebView) MBridgeH5EndCardView.this.f15934p, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
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
                        } catch (Throwable th2) {
                            ad.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                            str = "";
                        }
                        g.a().a((WebView) MBridgeH5EndCardView.this.f15934p, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
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
                        } catch (Throwable th2) {
                            ad.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                            str2 = "";
                        }
                        g.a().a((WebView) MBridgeH5EndCardView.this.f15934p, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                    }
                });
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public boolean canBackPress() {
        ImageView imageView = this.f15933o;
        return imageView != null && imageView.getVisibility() == 0;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e2) {
            ad.b(MBridgeBaseView.TAG, e2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    public void excuteEndCardShowTask(int i10) {
        this.f15935q.postDelayed(new c(this, i10), i10 * 1000);
    }

    public void excuteTask() {
        if (!this.f15941x && this.f15942y > -1) {
            this.f15935q.postDelayed(new f(this), this.f15942y * 1000);
        }
    }

    public void executeEndCardShow(int i10) {
        this.f15935q.postDelayed(new b(this), i10 * 1000);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.f15895b;
    }

    public void handlerPlayableException(String str) {
        if (!this.f15938t) {
            this.f15938t = true;
            this.f15937s = false;
            if (this.f15895b != null) {
                n nVar = new n();
                nVar.f(this.f15895b.getRequestId());
                nVar.g(this.f15895b.getRequestIdNotice());
                nVar.e(this.f15895b.getId());
                nVar.h(str);
                com.mbridge.msdk.foundation.same.report.g.a(nVar, this.a.getApplicationContext(), this.unitId);
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_endcard_h5");
        if (findLayout >= 0) {
            View inflate = this.f15896c.inflate(findLayout, (ViewGroup) null);
            this.f15931m = inflate;
            try {
                this.f15933o = (ImageView) inflate.findViewById(findID("mbridge_windwv_close"));
                this.f15932n = (RelativeLayout) inflate.findViewById(findID("mbridge_windwv_content_rl"));
                WindVaneWebView windVaneWebView = new WindVaneWebView(getContext());
                this.f15934p = windVaneWebView;
                CampaignEx campaignEx = this.f15895b;
                if (campaignEx != null) {
                    windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
                }
                this.f15934p.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f15932n.addView(this.f15934p);
                this.f15898e = isNotNULL(this.f15933o, this.f15934p);
            } catch (Exception unused) {
                this.f15898e = false;
            }
            addView(this.f15931m, b());
            c();
            e();
        }
    }

    public void install(CampaignEx campaignEx) {
    }

    public boolean isLoadSuccess() {
        return this.f15937s;
    }

    public boolean isPlayable() {
        return this.f15941x;
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                this.H = true;
                return;
            }
            return;
        }
        this.G = true;
    }

    public void onBackPress() {
        boolean z10;
        if (this.F || (((z10 = this.G) && this.H) || ((!z10 && this.I && !this.f15939v) || (!z10 && this.J && this.f15939v)))) {
            onCloseViewClick();
        }
    }

    public void onCloseViewClick() {
        try {
            if (this.f15934p != null) {
                g.a().a((WebView) this.f15934p, "onSystemDestory", "");
                new Thread(new a(this)).start();
            } else {
                this.notifyListener.a(103, "");
                this.notifyListener.a(119, "webview is null when closing webview");
            }
        } catch (Exception e2) {
            this.notifyListener.a(103, "");
            this.notifyListener.a(119, "close webview exception" + e2.getMessage());
            ad.a(MBridgeBaseView.TAG, e2.getMessage());
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000134", this.f15895b);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
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
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0 && !this.L) {
            this.L = true;
            setFocusableInTouchMode(true);
            requestFocus();
            requestFocusFromTouch();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx != null && campaignEx.isMraid()) {
            if (z10) {
                com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f15934p, "true");
            } else {
                com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f15934p, "false");
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
            g.a().a((WebView) this.f15934p, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        final boolean z10;
        int o10;
        Boolean b3 = com.mbridge.msdk.foundation.same.b.a().b();
        if (b3 != null && b3.booleanValue() && this.f15895b.getAdSpaceT() == 2) {
            reportRenderResult("PL URL IS NULL", 3);
            this.notifyListener.a(127, "");
            this.notifyListener.a(129, "");
            return;
        }
        String a10 = a();
        if (this.f15898e && this.f15895b != null && !TextUtils.isEmpty(a10)) {
            this.D = System.currentTimeMillis();
            try {
                reportRenderResult("start", 0);
            } catch (Exception unused) {
            }
            com.mbridge.msdk.foundation.same.g.a aVar = new com.mbridge.msdk.foundation.same.g.a(this.f15895b);
            aVar.a(this.f15895b.getAppName());
            this.f15934p.setDownloadListener(aVar);
            this.f15934p.setCampaignId(this.f15895b.getId());
            this.f15934p.setTempTypeForMetrics(3);
            CampaignEx campaignEx = this.f15895b;
            if (campaignEx != null) {
                this.f15934p.setCampaignEx(campaignEx);
            }
            setCloseVisible(8);
            this.f15934p.setApiManagerJSFactory(bVar);
            if (this.f15895b.isMraid()) {
                this.f15934p.setMraidObject(this);
            }
            if (!a10.contains("wfr=1") && !a10.contains("wfl=1")) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.f15934p.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.3
                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, String str) {
                    super.a(webView, str);
                    MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                    if (mBridgeH5EndCardView.f15938t) {
                        return;
                    }
                    mBridgeH5EndCardView.f15937s = true;
                    mBridgeH5EndCardView.notifyListener.a(100, "");
                    if (MBridgeH5EndCardView.this.f15895b != null) {
                        n nVar = new n();
                        nVar.f(MBridgeH5EndCardView.this.f15895b.getRequestId());
                        nVar.g(MBridgeH5EndCardView.this.f15895b.getRequestIdNotice());
                        nVar.e(MBridgeH5EndCardView.this.f15895b.getId());
                        nVar.b(1);
                        nVar.l(String.valueOf(System.currentTimeMillis() - MBridgeH5EndCardView.this.D));
                        nVar.h("onPageFinished");
                        int adType = MBridgeH5EndCardView.this.f15895b.getAdType();
                        String str2 = MBridgeConstans.API_REUQEST_CATEGORY_APP;
                        if (adType == 287) {
                            nVar.d("3");
                        } else if (MBridgeH5EndCardView.this.f15895b.getAdType() == 94) {
                            nVar.d("1");
                        } else if (MBridgeH5EndCardView.this.f15895b.getAdType() == 42) {
                            nVar.d(MBridgeConstans.API_REUQEST_CATEGORY_APP);
                        }
                        if (MBridgeH5EndCardView.this.f15895b.isMraid()) {
                            nVar.d(n.a);
                        } else {
                            nVar.n(MBridgeH5EndCardView.this.f15895b.getendcard_url());
                            if (an.b(MBridgeH5EndCardView.this.f15895b.getendcard_url()) && MBridgeH5EndCardView.this.f15895b.getendcard_url().contains(".zip")) {
                                str2 = "1";
                            }
                            nVar.o(str2);
                            nVar.d(n.f13247b);
                        }
                        MBridgeH5EndCardView mBridgeH5EndCardView2 = MBridgeH5EndCardView.this;
                        com.mbridge.msdk.foundation.same.report.g.b(nVar, mBridgeH5EndCardView2.unitId, mBridgeH5EndCardView2.f15895b);
                    }
                    MBridgeH5EndCardView.this.notifyListener.a(120, "");
                    if (z10) {
                        return;
                    }
                    try {
                        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                        dVar.a("type", 3);
                        dVar.a("result", 1);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", MBridgeH5EndCardView.this.f15895b, dVar);
                    } catch (Throwable th2) {
                        ad.b("WindVaneWebView", th2.getMessage());
                    }
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void c(WebView webView, int i10) {
                    super.c(webView, i10);
                    MBridgeH5EndCardView.this.C = i10;
                    if (!MBridgeH5EndCardView.this.B) {
                        MBridgeH5EndCardView.this.B = true;
                        if (i10 == 1) {
                            MBridgeH5EndCardView.this.reportRenderResult("success", 4);
                        } else {
                            MBridgeH5EndCardView.this.notifyListener.a(127, "");
                            MBridgeH5EndCardView.this.reportRenderResult("failed", 6);
                        }
                    }
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, int i10, String str, String str2) {
                    super.a(webView, i10, str, str2);
                    MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                    if (mBridgeH5EndCardView.f15938t) {
                        return;
                    }
                    mBridgeH5EndCardView.notifyListener.a(118, "onReceivedError " + i10 + str);
                    MBridgeH5EndCardView.this.reportRenderResult(str, 3);
                    MBridgeH5EndCardView.this.notifyListener.a(127, "");
                    MBridgeH5EndCardView.this.notifyListener.a(129, "");
                    MBridgeH5EndCardView.this.f15938t = true;
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, int i10) {
                    super.a(webView, i10);
                    StringBuilder m10 = j.m("h5EncardView readyStatus:", i10, "- isError");
                    m10.append(MBridgeH5EndCardView.this.f15938t);
                    ad.c("WindVaneWebView", m10.toString());
                    MBridgeH5EndCardView.this.C = i10;
                    if (!MBridgeH5EndCardView.this.f15938t) {
                        MBridgeH5EndCardView.a(MBridgeH5EndCardView.this, System.currentTimeMillis() - MBridgeH5EndCardView.this.D, false);
                    }
                    if (z10) {
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("type", 3);
                            dVar.a("result", Integer.valueOf(i10));
                            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", MBridgeH5EndCardView.this.f15895b, dVar);
                        } catch (Throwable th2) {
                            ad.b("WindVaneWebView", th2.getMessage());
                        }
                    }
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView) {
                    super.a(webView);
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
            });
            if (TextUtils.isEmpty(this.f15895b.getMraid())) {
                try {
                    this.D = System.currentTimeMillis();
                    String str = this.f15895b.getendcard_url();
                    com.mbridge.msdk.videocommon.d.c a11 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.unitId);
                    if (this.f15941x && an.b(str) && (str.contains("wfr=1") || (a11 != null && a11.o() > 0))) {
                        if (str.contains("wfr=1")) {
                            String[] split = str.split("&");
                            if (split != null && split.length > 0) {
                                for (String str2 : split) {
                                    if (an.b(str2) && str2.contains("to") && str2.split("=") != null && str2.split("=").length > 0) {
                                        o10 = ai.a((Object) str2.split("=")[1]);
                                        break;
                                    }
                                }
                            }
                            o10 = 20;
                        } else {
                            if (a11 != null && a11.o() > 0) {
                                o10 = a11.o();
                            }
                            o10 = 20;
                        }
                        if (o10 >= 0) {
                            excuteEndCardShowTask(o10);
                        } else {
                            excuteEndCardShowTask(20);
                        }
                    }
                } catch (Throwable th2) {
                    ad.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                }
            }
            setHtmlSource(HTMLResourceManager.getInstance().getHtmlContentFromUrl(a10));
            if (TextUtils.isEmpty(this.f15936r)) {
                this.f15934p.loadUrl(a10);
            } else {
                this.f15934p.loadDataWithBaseURL(a10, this.f15936r, "text/html", "UTF-8", null);
            }
        } else {
            reportRenderResult("PL URL IS NULL", 3);
            this.notifyListener.a(127, "");
            this.notifyListener.a(129, "");
        }
        this.f15939v = false;
    }

    public void readyStatus(int i10) {
    }

    public void release() {
        Handler handler = this.f15935q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f15935q = null;
        }
        Handler handler2 = this.u;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.u = null;
        }
        this.f15932n.removeAllViews();
        this.f15934p.release();
        this.f15934p = null;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void reportOpen(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.unitId, str, this.f15895b.isBidCampaign());
        }
    }

    public void reportRenderResult(String str, int i10) {
        if (this.f15895b != null && !this.f15938t) {
            n nVar = new n();
            nVar.f(this.f15895b.getRequestId());
            nVar.g(this.f15895b.getRequestIdNotice());
            nVar.e(this.f15895b.getId());
            nVar.b(i10);
            nVar.l(String.valueOf(System.currentTimeMillis() - this.D));
            nVar.h(str);
            int adType = this.f15895b.getAdType();
            String str2 = MBridgeConstans.API_REUQEST_CATEGORY_APP;
            if (adType == 287) {
                nVar.d("3");
            } else if (this.f15895b.getAdType() == 94) {
                nVar.d("1");
            } else if (this.f15895b.getAdType() == 42) {
                nVar.d(MBridgeConstans.API_REUQEST_CATEGORY_APP);
            }
            if (this.f15895b.isMraid()) {
                nVar.d(n.a);
            } else {
                nVar.n(this.f15895b.getendcard_url());
                if (an.b(this.f15895b.getendcard_url()) && this.f15895b.getendcard_url().contains(".zip")) {
                    str2 = "1";
                }
                nVar.o(str2);
                nVar.d(n.f13247b);
            }
            com.mbridge.msdk.foundation.same.report.g.b(nVar, this.unitId, this.f15895b);
        }
    }

    public void setCloseDelayShowTime(int i10) {
        this.f15942y = i10;
    }

    public void setCloseVisible(int i10) {
        if (this.f15898e) {
            this.f15933o.setVisibility(i10);
        }
    }

    public void setCloseVisibleForMraid(int i10) {
        if (this.f15898e) {
            this.K = true;
            if (i10 == 4) {
                this.f15933o.setImageDrawable(new ColorDrawable(16711680));
            } else {
                this.f15933o.setImageResource(findDrawable("mbridge_reward_close"));
            }
            this.f15933o.setVisibility(0);
        }
    }

    public void setError(boolean z10) {
        this.f15938t = z10;
    }

    public void setHtmlSource(String str) {
        this.f15936r = str;
    }

    public void setLoadPlayable(boolean z10) {
        this.f15939v = z10;
    }

    public void setNotchValue(String str, int i10, int i11, int i12, int i13) {
        this.M = str;
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx != null && campaignEx.getAdSpaceT() != 2) {
            ad.b(MBridgeBaseView.TAG, "NOTCH H5ENDCARD " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f15933o.getLayoutParams();
            int a10 = ai.a(getContext(), 20.0f);
            layoutParams.setMargins(i10 + a10, i12 + a10, i11 + a10, i13 + a10);
            this.f15933o.setLayoutParams(layoutParams);
        }
    }

    public void setPlayCloseBtnTm(int i10) {
        this.f15943z = i10;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String str = this.f15895b.getendcard_url();
            if (an.b(str) && str.contains("wfl=1")) {
                String[] split = str.split("&");
                int i10 = 15;
                if (split != null && split.length > 0) {
                    for (String str2 : split) {
                        if (an.b(str2) && str2.contains("timeout") && str2.split("=") != null && str2.split("=").length > 0) {
                            i10 = ai.a((Object) str2.split("=")[1]);
                        }
                    }
                }
                executeEndCardShow(i10);
            }
        } catch (Throwable th2) {
            ad.a(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        int visibility = this.f15933o.getVisibility();
        if (i10 != 1) {
            if (i10 == 2) {
                this.F = false;
                if (this.f15939v) {
                    if (!this.O && !this.G) {
                        this.O = true;
                        int i11 = this.f15943z;
                        if (i11 == 0) {
                            this.J = true;
                        } else {
                            this.J = false;
                            if (i11 > -1) {
                                this.f15935q.postDelayed(new e(this), this.f15943z * 1000);
                            }
                        }
                    }
                } else if (!this.N && !this.G) {
                    this.N = true;
                    int i12 = this.f15942y;
                    if (i12 == 0) {
                        this.I = true;
                    } else {
                        this.I = false;
                        if (i12 > -1) {
                            this.f15935q.postDelayed(new d(this), this.f15942y * 1000);
                        }
                    }
                }
                visibility = 8;
            }
        } else {
            this.F = true;
            visibility = 0;
        }
        setCloseVisible(visibility);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        int i10;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        try {
            setCloseVisibleForMraid(i10);
        } catch (Exception e2) {
            ad.b(MBridgeBaseView.TAG, e2.getMessage());
        }
    }

    public void volumeChange(double d10) {
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f15934p, d10);
    }

    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f15934p;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.4
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    try {
                        ad.a(MBridgeBaseView.TAG, "webviewshow");
                        try {
                            int[] iArr = new int[2];
                            MBridgeH5EndCardView.this.f15934p.getLocationOnScreen(iArr);
                            ad.b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
                            if (c10 != null) {
                                jSONObject.put("startX", ai.b(c10, iArr[0]));
                                jSONObject.put("startY", ai.b(c10, iArr[1]));
                                jSONObject.put(com.mbridge.msdk.foundation.same.a.f13281l, ai.d(c10));
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th2) {
                            ad.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
                            str = "";
                        }
                        g.a().a((WebView) MBridgeH5EndCardView.this.f15934p, "webviewshow", Base64.encodeToString(str.toString().getBytes(), 2));
                        MBridgeH5EndCardView.this.notifyListener.a(109, "");
                        MBridgeH5EndCardView.d(MBridgeH5EndCardView.this);
                        MBridgeH5EndCardView.this.startCounterEndCardShowTimer();
                        g a10 = g.a();
                        MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                        a10.a((WebView) mBridgeH5EndCardView.f15934p, "oncutoutfetched", Base64.encodeToString(mBridgeH5EndCardView.M.getBytes(), 0));
                        MBridgeH5EndCardView.f(MBridgeH5EndCardView.this);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
    }

    public static /* synthetic */ void d(MBridgeH5EndCardView mBridgeH5EndCardView) {
        CampaignEx campaignEx = mBridgeH5EndCardView.f15895b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        int i10 = mBridgeH5EndCardView.getResources().getConfiguration().orientation;
        String str = AdError.UNDEFINED_DOMAIN;
        if (i10 != 0) {
            if (i10 == 1) {
                str = "portrait";
            } else if (i10 == 2) {
                str = "landscape";
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("placementType", "Interstitial");
        hashMap.put("state", "default");
        hashMap.put("viewable", "true");
        hashMap.put("currentAppOrientation", jSONObject);
        if (mBridgeH5EndCardView.getContext() instanceof Activity) {
            float i11 = z.i(mBridgeH5EndCardView.getContext());
            float g10 = z.g(mBridgeH5EndCardView.getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) mBridgeH5EndCardView.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f10 = displayMetrics.widthPixels;
            float f11 = displayMetrics.heightPixels;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(mBridgeH5EndCardView.f15934p, i11, g10);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(mBridgeH5EndCardView.f15934p, f10, f11);
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.f15934p, r7.getLeft(), mBridgeH5EndCardView.f15934p.getTop(), mBridgeH5EndCardView.f15934p.getWidth(), mBridgeH5EndCardView.f15934p.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(mBridgeH5EndCardView.f15934p, r13.getLeft(), mBridgeH5EndCardView.f15934p.getTop(), mBridgeH5EndCardView.f15934p.getWidth(), mBridgeH5EndCardView.f15934p.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.f15934p, hashMap);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.f15934p, com.mbridge.msdk.mbsignalcommon.mraid.d.a);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBridgeH5EndCardView.f15934p);
    }

    public RelativeLayout.LayoutParams b() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        super.c();
        if (this.f15898e) {
            this.f15933o.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBridgeH5EndCardView.this.onCloseViewClick();
                }
            });
        }
    }

    public void e() {
        if (this.f15898e) {
            setMatchParent();
        }
    }

    public String a() {
        String endScreenUrl;
        CampaignEx campaignEx = this.f15895b;
        if (campaignEx != null) {
            this.E = true;
            if (campaignEx.isMraid()) {
                this.f15941x = false;
                String mraid = this.f15895b.getMraid();
                if (!TextUtils.isEmpty(mraid)) {
                    File file = new File(mraid);
                    try {
                        if (file.exists() && file.isFile() && file.canRead()) {
                            endScreenUrl = "file:////" + mraid;
                        } else {
                            endScreenUrl = this.f15895b.getEndScreenUrl();
                        }
                        return endScreenUrl;
                    } catch (Throwable th2) {
                        if (!MBridgeConstans.DEBUG) {
                            return mraid;
                        }
                        th2.printStackTrace();
                        return mraid;
                    }
                }
                return this.f15895b.getEndScreenUrl();
            }
            String str = this.f15895b.getendcard_url();
            if (!an.a(str)) {
                this.f15941x = true;
                String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(str);
                if (TextUtils.isEmpty(h5ResAddress)) {
                    try {
                        String path = Uri.parse(str).getPath();
                        if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".zip")) {
                            String endScreenUrl2 = this.f15895b.getEndScreenUrl();
                            if (TextUtils.isEmpty(endScreenUrl2)) {
                                return null;
                            }
                            this.f15941x = false;
                            excuteTask();
                            return endScreenUrl2;
                        }
                    } catch (Throwable th3) {
                        ad.b(MBridgeBaseView.TAG, th3.getMessage());
                    }
                    StringBuilder n10 = eb.j.n(str, "&native_adtype=");
                    n10.append(this.f15895b.getAdType());
                    return n10.toString();
                }
                StringBuilder n11 = eb.j.n(h5ResAddress, "&native_adtype=");
                n11.append(this.f15895b.getAdType());
                return n11.toString();
            }
            this.f15941x = false;
            return this.f15895b.getEndScreenUrl();
        }
        this.E = false;
        return null;
    }

    public MBridgeH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15940w = false;
        this.f15935q = new Handler();
        this.f15937s = false;
        this.f15938t = false;
        this.f15941x = false;
        this.f15942y = 1;
        this.f15943z = 1;
        this.A = false;
        this.B = false;
        this.C = 1;
        this.D = 0L;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = "";
        this.u = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.video.module.MBridgeH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what == 100) {
                    if (MBridgeH5EndCardView.this.E) {
                        MBridgeH5EndCardView.this.notifyListener.a(122, "");
                    }
                    MBridgeH5EndCardView.this.notifyListener.a(103, "");
                }
            }
        };
        this.N = false;
        this.O = false;
        this.f15939v = false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:8|9|(1:61)(1:13)|14|(1:16)(2:57|(1:59)(14:60|18|19|20|(1:22)(2:49|(1:51)(2:52|(1:54)))|23|24|25|26|(1:28)|29|(1:31)|33|(1:44)(4:37|(1:39)(1:43)|40|42)))|17|18|19|20|(0)(0)|23|24|25|26|(0)|29|(0)|33|(2:35|44)(1:45)) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0106, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0107, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b(com.mbridge.msdk.video.module.MBridgeBaseView.TAG, r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ad, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ae, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[Catch: NullPointerException -> 0x00ad, all -> 0x0158, TryCatch #0 {NullPointerException -> 0x00ad, blocks: (B:20:0x0081, B:22:0x008b, B:49:0x0091, B:51:0x009b, B:52:0x009f, B:54:0x00a9), top: B:19:0x0081, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ed A[Catch: Exception -> 0x0106, all -> 0x0158, TryCatch #2 {Exception -> 0x0106, blocks: (B:26:0x00d7, B:28:0x00ed, B:29:0x00f4, B:31:0x00fe), top: B:25:0x00d7, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fe A[Catch: Exception -> 0x0106, all -> 0x0158, TRY_LEAVE, TryCatch #2 {Exception -> 0x0106, blocks: (B:26:0x00d7, B:28:0x00ed, B:29:0x00f4, B:31:0x00fe), top: B:25:0x00d7, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091 A[Catch: NullPointerException -> 0x00ad, all -> 0x0158, TryCatch #0 {NullPointerException -> 0x00ad, blocks: (B:20:0x0081, B:22:0x008b, B:49:0x0091, B:51:0x009b, B:52:0x009f, B:54:0x00a9), top: B:19:0x0081, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(com.mbridge.msdk.video.module.MBridgeH5EndCardView r20, long r21, boolean r23) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.a(com.mbridge.msdk.video.module.MBridgeH5EndCardView, long, boolean):void");
    }
}
