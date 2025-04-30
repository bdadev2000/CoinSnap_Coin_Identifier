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

/* loaded from: classes3.dex */
public class MBridgeBTWebView extends MBridgeBTWebViewDiff {

    /* renamed from: p, reason: collision with root package name */
    private String f18533p;

    /* renamed from: q, reason: collision with root package name */
    private String f18534q;

    /* renamed from: r, reason: collision with root package name */
    private String f18535r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f18536s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView f18537t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f18538u;

    /* renamed from: v, reason: collision with root package name */
    private c f18539v;

    /* renamed from: w, reason: collision with root package name */
    private List<CampaignEx> f18540w;

    /* renamed from: x, reason: collision with root package name */
    private WebView f18541x;

    public MBridgeBTWebView(Context context) {
        super(context);
        this.f18536s = false;
        this.f18538u = false;
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.webView != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", BTBaseView.f18365n);
                jSONObject2.put("id", this.f18369d);
                jSONObject2.put("eventName", str);
                jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject);
                g.a().a((WebView) this.webView, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                d.c().a((WebView) this.webView, "broadcast", this.f18369d);
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        WebView webView = this.f18541x;
        if (webView != null) {
            BTBaseView.a(webView, "onPlayerCloseBtnClicked", this.f18369d);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z8) {
    }

    public List<CampaignEx> getCampaigns() {
        return this.f18540w;
    }

    public String getFilePath() {
        return this.f18534q;
    }

    public String getFileURL() {
        return this.f18533p;
    }

    public String getHtml() {
        return this.f18535r;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.b;
    }

    public c getRewardUnitSetting() {
        return this.f18539v;
    }

    public WindVaneWebView getWebView() {
        return this.webView;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        int i9;
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        this.webView = windVaneWebView;
        windVaneWebView.setBackgroundColor(0);
        this.webView.setVisibility(0);
        k kVar = new k(null, this.b, this.f18540w);
        this.jsCommon = kVar;
        kVar.a(this.f18368c);
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
                    String c9 = kVar2 != null ? kVar2.c() : "";
                    if (TextUtils.isEmpty(c9)) {
                        ad.a("RVWindVaneWebView", "getEndScreenInfo failed");
                    } else {
                        str = Base64.encodeToString(c9.getBytes(), 2);
                        ad.a("RVWindVaneWebView", "getEndScreenInfo success");
                    }
                    g.a().a(obj, str);
                } catch (Throwable th) {
                    ad.a("RVWindVaneWebView", th.getMessage());
                }
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, String str) {
                super.a(webView, str);
                if (MBridgeBTWebView.this.f18541x != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.f18369d);
                        jSONObject.put("code", BTBaseView.f18365n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.f18369d);
                        jSONObject2.put("result", 1);
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        g.a().a(MBridgeBTWebView.this.f18541x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e4) {
                        d.c().a(MBridgeBTWebView.this.f18541x, e4.getMessage());
                        ad.a("RVWindVaneWebView", e4.getMessage());
                    }
                }
                g.a().a(MBridgeBTWebView.this.webView);
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, int i10, String str, String str2) {
                super.a(webView, i10, str, str2);
                if (MBridgeBTWebView.this.f18541x != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.f18369d);
                        jSONObject.put("code", BTBaseView.f18365n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.f18369d);
                        jSONObject2.put("result", 2);
                        jSONObject2.put("error", str);
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        g.a().a(MBridgeBTWebView.this.f18541x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e4) {
                        d.c().a(MBridgeBTWebView.this.f18541x, e4.getMessage());
                        ad.a("RVWindVaneWebView", e4.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.a(webView, sslErrorHandler, sslError);
                if (MBridgeBTWebView.this.f18541x != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", MBridgeBTWebView.this.f18369d);
                        jSONObject.put("code", BTBaseView.f18365n);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", MBridgeBTWebView.this.f18369d);
                        jSONObject2.put("result", 2);
                        jSONObject2.put("error", sslError.toString());
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        g.a().a(MBridgeBTWebView.this.f18541x, "onWebviewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e4) {
                        d.c().a(MBridgeBTWebView.this.f18541x, e4.getMessage());
                        ad.a("RVWindVaneWebView", e4.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
            public final void a(WebView webView, int i10) {
                super.a(webView, i10);
            }
        });
        addView(this.webView, new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTWebView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (MBridgeBTWebView.this.f18541x != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f18365n);
                        jSONObject.put("id", MBridgeBTWebView.this.f18369d);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", String.valueOf(view.getX()));
                        jSONObject2.put("y", String.valueOf(view.getY()));
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        g.a().a(MBridgeBTWebView.this.f18541x, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception unused) {
                        d.c().a(MBridgeBTWebView.this.f18541x, "onClicked", MBridgeBTWebView.this.f18369d);
                    }
                }
            }
        });
        try {
            ImageView imageView = new ImageView(getContext());
            this.f18537t = imageView;
            imageView.setImageResource(findDrawable("mbridge_reward_close"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
            layoutParams.gravity = 8388661;
            layoutParams.setMargins(30, 30, 30, 30);
            this.f18537t.setLayoutParams(layoutParams);
            ImageView imageView2 = this.f18537t;
            if (this.f18536s) {
                i9 = 4;
            } else {
                i9 = 8;
            }
            imageView2.setVisibility(i9);
            CampaignEx campaignEx = this.b;
            if (campaignEx != null && campaignEx.isMraid()) {
                this.f18537t.setVisibility(4);
            }
            this.f18537t.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTWebView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBridgeBTWebView.this.close();
                }
            });
            addView(this.f18537t);
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void onBackPressed() {
        if (this.webView != null) {
            d.c().a((WebView) this.webView, "onSystemBackPressed", this.f18369d);
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
                jSONObject.put("instanceId", this.f18369d);
                g.a().a((WebView) this.webView, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
        if (this.f18538u) {
            return;
        }
        this.f18538u = true;
        try {
            if (this.webView != null) {
                d.c().a((WebView) this.webView, "onSystemDestory", this.f18369d);
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
                        MBridgeBTWebView.this.f18533p = null;
                        MBridgeBTWebView.this.f18534q = null;
                        MBridgeBTWebView.this.f18535r = null;
                        if (MBridgeBTWebView.this.f18541x != null) {
                            MBridgeBTWebView.this.f18541x = null;
                        }
                    } catch (Throwable th) {
                        ad.a(BTBaseView.TAG, th.getMessage());
                    }
                }
            }, 500L);
            setOnClickListener(null);
            removeAllViews();
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
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
            String clickURL = this.b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.b.setClickURL(str);
                reportOpen(str);
            }
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(getContext(), this.f18368c);
            aVar.a(this);
            aVar.a(this.b);
            this.b.setClickURL(clickURL);
        } catch (Throwable th) {
            ad.b(BTBaseView.TAG, th.getMessage());
        }
    }

    public void preload() {
        if (!TextUtils.isEmpty(this.f18533p)) {
            this.webView.loadUrl(this.f18533p);
        } else if (!TextUtils.isEmpty(this.f18534q)) {
            this.webView.loadUrl(this.f18534q);
        } else if (!TextUtils.isEmpty(this.f18535r)) {
            this.webView.loadDataWithBaseURL("", this.f18535r, "text/html", "UTF-8", null);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTWebViewDiff
    public void reportOpen(String str) {
        try {
            CampaignEx mraidCampaign = getMraidCampaign();
            if (mraidCampaign != null) {
                new h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.f18368c, str, this.b.isBidCampaign());
            }
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void setCampaigns(List<CampaignEx> list) {
        this.f18540w = list;
    }

    public void setCreateWebView(WebView webView) {
        this.f18541x = webView;
    }

    public void setFilePath(String str) {
        this.f18534q = str;
    }

    public void setFileURL(String str) {
        this.f18533p = str;
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
        this.f18535r = str;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setRewardUnitSetting(c cVar) {
        this.f18539v = cVar;
    }

    public void setTempTypeForMetrics(int i9) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setTempTypeForMetrics(i9);
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

    public void setWebviewClickable(boolean z8) {
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setClickable(z8);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z8) {
        int i9;
        try {
            ImageView imageView = this.f18537t;
            if (z8) {
                i9 = 4;
            } else {
                i9 = 0;
            }
            imageView.setVisibility(i9);
        } catch (Throwable th) {
            ad.b(BTBaseView.TAG, th.getMessage());
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

    public void webviewLoad(int i9) {
        if (this.jsCommon == null) {
            this.jsCommon = new k(null, this.b, this.f18540w);
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx != null) {
            this.jsCommon.a(campaignEx);
        } else {
            List<CampaignEx> list = this.f18540w;
            if (list != null && list.size() > 0) {
                this.jsCommon.a(this.f18540w);
                if (this.f18540w.size() == 1) {
                    this.jsCommon.a(this.f18540w.get(0));
                }
            }
        }
        c cVar = this.f18539v;
        if (cVar != null) {
            this.jsCommon.a(cVar);
        }
        this.jsCommon.a(this.f18368c);
        this.jsCommon.c(this.f18369d);
        if (b.a()) {
            setChinaAlertInstallState(this.jsCommon);
        }
        if (i9 == 1) {
            this.jsCommon.q();
        }
        WindVaneWebView windVaneWebView = this.webView;
        if (windVaneWebView != null) {
            windVaneWebView.setObject(this.jsCommon);
        }
        CampaignEx campaignEx2 = this.b;
        if (campaignEx2 != null && campaignEx2.isMraid()) {
            this.f18537t.setVisibility(4);
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
        this.f18536s = false;
        this.f18538u = false;
    }
}
