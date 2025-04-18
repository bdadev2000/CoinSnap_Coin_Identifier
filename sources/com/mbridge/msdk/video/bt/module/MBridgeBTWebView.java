package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mbridge.msdk.e.b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.mbsignalcommon.b.a;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.bt.a.d;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.videocommon.d.c;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeBTWebView extends MBridgeBTWebViewDiff {

    /* renamed from: p, reason: collision with root package name */
    private String f15679p;

    /* renamed from: q, reason: collision with root package name */
    private String f15680q;

    /* renamed from: r, reason: collision with root package name */
    private String f15681r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f15682s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView f15683t;
    private boolean u;

    /* renamed from: v, reason: collision with root package name */
    private c f15684v;

    /* renamed from: w, reason: collision with root package name */
    private List<CampaignEx> f15685w;

    /* renamed from: x, reason: collision with root package name */
    private WebView f15686x;

    public MBridgeBTWebView(Context context) {
        super(context);
        this.f15682s = false;
        this.u = false;
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.webView != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.f15598n);
                jSONObject2.put("id", this.f15602d);
                jSONObject2.put("eventName", str);
                jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject);
                g.a().a((WebView) this.webView, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                d.c().a((WebView) this.webView, "broadcast", this.f15602d);
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        WebView webView = this.f15686x;
        if (webView != null) {
            BTBaseView.a(webView, "onPlayerCloseBtnClicked", this.f15602d);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
    }

    public List<CampaignEx> getCampaigns() {
        return this.f15685w;
    }

    public String getFilePath() {
        return this.f15680q;
    }

    public String getFileURL() {
        return this.f15679p;
    }

    public String getHtml() {
        return this.f15681r;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.f15600b;
    }

    public c getRewardUnitSetting() {
        return this.f15684v;
    }

    public WindVaneWebView getWebView() {
        return this.webView;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        int i10;
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        this.webView = windVaneWebView;
        windVaneWebView.setBackgroundColor(0);
        this.webView.setVisibility(0);
        k kVar = new k(null, this.f15600b, this.f15685w);
        this.jsCommon = kVar;
        kVar.a(this.f15601c);
        if (b.a()) {
            setChinaAlertInstallState(this.jsCommon);
        }
        this.webView.setObject(this.jsCommon);
        this.webView.setMraidObject(this);
        this.webView.setWebViewListener(new a() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTWebView.1
            @Override // com.mbridge.msdk.mbsignalcommon.b.a
            public final void a(Object obj) {
                super.a(obj);
                try {
                    k kVar2 = MBridgeBTWebView.this.jsCommon;
                    String str = "";
                    String c10 = kVar2 != null ? kVar2.c() : "";
                    if (!TextUtils.isEmpty(c10)) {
                        str = Base64.encodeToString(c10.getBytes(), 2);
                        ad.a("RVWindVaneWebView", "getEndScreenInfo success");
                    } else {
                        ad.a("RVWindVaneWebView", "getEndScreenInfo failed");
                    }
                    g.a().a(obj, str);
                } catch (Throwable th2) {
                    ad.a("RVWindVaneWebView", th2.getMessage());
                }
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, String str) {
                super.a(webView, str);
                if (MBridgeBTWebView.this.f15686x != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.f15602d);
                        jSONObject.put("code", BTBaseView.f15598n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.f15602d);
                        jSONObject2.put("result", 1);
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        g.a().a(MBridgeBTWebView.this.f15686x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e2) {
                        d.c().a(MBridgeBTWebView.this.f15686x, e2.getMessage());
                        ad.a("RVWindVaneWebView", e2.getMessage());
                    }
                }
                g.a().a(MBridgeBTWebView.this.webView);
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, int i11, String str, String str2) {
                super.a(webView, i11, str, str2);
                if (MBridgeBTWebView.this.f15686x != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.f15602d);
                        jSONObject.put("code", BTBaseView.f15598n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.f15602d);
                        jSONObject2.put("result", 2);
                        jSONObject2.put("error", str);
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        g.a().a(MBridgeBTWebView.this.f15686x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e2) {
                        d.c().a(MBridgeBTWebView.this.f15686x, e2.getMessage());
                        ad.a("RVWindVaneWebView", e2.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.a(webView, sslErrorHandler, sslError);
                if (MBridgeBTWebView.this.f15686x != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.f15602d);
                        jSONObject.put("code", BTBaseView.f15598n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.f15602d);
                        jSONObject2.put("result", 2);
                        jSONObject2.put("error", sslError.toString());
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        g.a().a(MBridgeBTWebView.this.f15686x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e2) {
                        d.c().a(MBridgeBTWebView.this.f15686x, e2.getMessage());
                        ad.a("RVWindVaneWebView", e2.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, int i11) {
                super.a(webView, i11);
            }
        });
        addView(this.webView, new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTWebView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (MBridgeBTWebView.this.f15686x != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f15598n);
                        jSONObject.put("id", MBridgeBTWebView.this.f15602d);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", String.valueOf(view.getX()));
                        jSONObject2.put("y", String.valueOf(view.getY()));
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        g.a().a(MBridgeBTWebView.this.f15686x, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception unused) {
                        d.c().a(MBridgeBTWebView.this.f15686x, "onClicked", MBridgeBTWebView.this.f15602d);
                    }
                }
            }
        });
        try {
            ImageView imageView = new ImageView(getContext());
            this.f15683t = imageView;
            imageView.setImageResource(findDrawable("mbridge_reward_close"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
            layoutParams.gravity = 8388661;
            layoutParams.setMargins(30, 30, 30, 30);
            this.f15683t.setLayoutParams(layoutParams);
            ImageView imageView2 = this.f15683t;
            if (this.f15682s) {
                i10 = 4;
            } else {
                i10 = 8;
            }
            imageView2.setVisibility(i10);
            CampaignEx campaignEx = this.f15600b;
            if (campaignEx != null && campaignEx.isMraid()) {
                this.f15683t.setVisibility(4);
            }
            this.f15683t.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTWebView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBridgeBTWebView.this.close();
                }
            });
            addView(this.f15683t);
        } catch (Throwable th2) {
            ad.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void onBackPressed() {
        if (this.webView != null) {
            d.c().a((WebView) this.webView, "onSystemBackPressed", this.f15602d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (this.webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (configuration.orientation == 2) {
                    jSONObject.put("orientation", "landscape");
                } else {
                    jSONObject.put("orientation", "portrait");
                }
                jSONObject.put("instanceId", this.f15602d);
                g.a().a((WebView) this.webView, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
        if (this.u) {
            return;
        }
        this.u = true;
        try {
            if (this.webView != null) {
                d.c().a((WebView) this.webView, "onSystemDestory", this.f15602d);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTWebView.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        WindVaneWebView windVaneWebView = MBridgeBTWebView.this.webView;
                        if (windVaneWebView != null) {
                            windVaneWebView.clearWebView();
                            MBridgeBTWebView.this.webView.release();
                        }
                        MBridgeBTWebView.this.f15679p = null;
                        MBridgeBTWebView.this.f15680q = null;
                        MBridgeBTWebView.this.f15681r = null;
                        if (MBridgeBTWebView.this.f15686x != null) {
                            MBridgeBTWebView.this.f15686x = null;
                        }
                    } catch (Throwable th2) {
                        ad.a(BTBaseView.TAG, th2.getMessage());
                    }
                }
            }, 500L);
            setOnClickListener(null);
            removeAllViews();
        } catch (Throwable th2) {
            ad.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onFinishRedirection(Campaign campaign, String str) {
        ah.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onRedirectionFailed(Campaign campaign, String str) {
        ah.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onStartRedirection(Campaign campaign, String str) {
        ah.b(campaign, this);
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        try {
            String clickURL = this.f15600b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f15600b.setClickURL(str);
                reportOpen(str);
            }
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(getContext(), this.f15601c);
            aVar.a(this);
            aVar.a(this.f15600b);
            this.f15600b.setClickURL(clickURL);
        } catch (Throwable th2) {
            ad.b(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void preload() {
        if (!TextUtils.isEmpty(this.f15679p)) {
            this.webView.loadUrl(this.f15679p);
        } else if (!TextUtils.isEmpty(this.f15680q)) {
            this.webView.loadUrl(this.f15680q);
        } else if (!TextUtils.isEmpty(this.f15681r)) {
            this.webView.loadDataWithBaseURL("", this.f15681r, "text/html", "UTF-8", null);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff
    public void reportOpen(String str) {
        try {
            CampaignEx mraidCampaign = getMraidCampaign();
            if (mraidCampaign != null) {
                new h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.f15601c, str, this.f15600b.isBidCampaign());
            }
        } catch (Throwable th2) {
            ad.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void setCampaigns(List<CampaignEx> list) {
        this.f15685w = list;
    }

    public void setCreateWebView(WebView webView) {
        this.f15686x = webView;
    }

    public void setFilePath(String str) {
        this.f15680q = str;
    }

    public void setFileURL(String str) {
        this.f15679p = str;
        if (!TextUtils.isEmpty(str)) {
            boolean contains = str.contains("play.google.com");
            setWebviewClickable(!contains);
            if (contains) {
                com.mbridge.msdk.mbsignalcommon.base.c cVar = new com.mbridge.msdk.mbsignalcommon.base.c();
                WindVaneWebView windVaneWebView = this.webView;
                if (windVaneWebView != null) {
                    windVaneWebView.setFilter(cVar);
                }
            }
        }
    }

    public void setHtml(String str) {
        this.f15681r = str;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setRewardUnitSetting(c cVar) {
        this.f15684v = cVar;
    }

    public void setTempTypeForMetrics(int i10) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setTempTypeForMetrics(i10);
        }
    }

    public void setWebViewLocalRequestId(String str) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setLocalRequestId(str);
        }
    }

    public void setWebViewRid(String str) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setRid(str);
        }
    }

    public void setWebviewClickable(boolean z10) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setClickable(z10);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        int i10;
        try {
            ImageView imageView = this.f15683t;
            if (z10) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            imageView.setVisibility(i10);
        } catch (Throwable th2) {
            ad.b(BTBaseView.TAG, th2.getMessage());
        }
    }

    public boolean webviewGoBack() {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null && windVaneWebView.canGoBack()) {
            this.webView.goBack();
            return true;
        }
        return false;
    }

    public boolean webviewGoForward() {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null && windVaneWebView.canGoForward()) {
            this.webView.goForward();
            return true;
        }
        return false;
    }

    public void webviewLoad(int i10) {
        if (this.jsCommon == null) {
            this.jsCommon = new k(null, this.f15600b, this.f15685w);
        }
        CampaignEx campaignEx = this.f15600b;
        if (campaignEx != null) {
            this.jsCommon.a(campaignEx);
        } else {
            List<CampaignEx> list = this.f15685w;
            if (list != null && list.size() > 0) {
                this.jsCommon.a(this.f15685w);
                if (this.f15685w.size() == 1) {
                    this.jsCommon.a(this.f15685w.get(0));
                }
            }
        }
        c cVar = this.f15684v;
        if (cVar != null) {
            this.jsCommon.a(cVar);
        }
        this.jsCommon.a(this.f15601c);
        this.jsCommon.c(this.f15602d);
        if (b.a()) {
            setChinaAlertInstallState(this.jsCommon);
        }
        if (i10 == 1) {
            this.jsCommon.q();
        }
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setObject(this.jsCommon);
        }
        CampaignEx campaignEx2 = this.f15600b;
        if (campaignEx2 != null && campaignEx2.isMraid()) {
            this.f15683t.setVisibility(4);
        }
        preload();
    }

    public boolean webviewReload() {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.reload();
            return true;
        }
        return false;
    }

    public MBridgeBTWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15682s = false;
        this.u = false;
    }
}
