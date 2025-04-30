package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;

/* loaded from: classes3.dex */
public class WindVaneWebView extends BaseWebView {
    protected k b;

    /* renamed from: c, reason: collision with root package name */
    protected c f16665c;

    /* renamed from: d, reason: collision with root package name */
    protected f f16666d;

    /* renamed from: e, reason: collision with root package name */
    private Object f16667e;

    /* renamed from: f, reason: collision with root package name */
    private Object f16668f;

    /* renamed from: g, reason: collision with root package name */
    private String f16669g;

    /* renamed from: h, reason: collision with root package name */
    private d f16670h;

    /* renamed from: i, reason: collision with root package name */
    private String f16671i;

    /* renamed from: j, reason: collision with root package name */
    private String f16672j;

    /* renamed from: k, reason: collision with root package name */
    private CampaignEx f16673k;
    private int l;
    private boolean m;

    /* renamed from: n, reason: collision with root package name */
    private float f16674n;

    /* renamed from: o, reason: collision with root package name */
    private float f16675o;

    public WindVaneWebView(Context context) {
        super(context);
        this.m = false;
        this.f16674n = 0.0f;
        this.f16675o = 0.0f;
    }

    public void clearWebView() {
        if (!this.m) {
            loadUrl("about:blank");
        }
    }

    public CampaignEx getCampaignEx() {
        return this.f16673k;
    }

    public String getCampaignId() {
        return this.f16669g;
    }

    public Object getJsObject(String str) {
        f fVar = this.f16666d;
        if (fVar == null) {
            return null;
        }
        return fVar.a(str);
    }

    public String getLocalRequestId() {
        return this.f16672j;
    }

    public Object getMraidObject() {
        return this.f16668f;
    }

    public Object getObject() {
        return this.f16667e;
    }

    public String getRid() {
        return this.f16671i;
    }

    public c getSignalCommunication() {
        return this.f16665c;
    }

    public d getWebViewListener() {
        return this.f16670h;
    }

    public boolean isDestoryed() {
        return this.m;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.b() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f16674n = motionEvent.getRawX();
                    this.f16675o = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f16674n;
                    float y4 = motionEvent.getY() - this.f16675o;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48) && ((rawX <= 0.0f || rawX <= 48) && ((y4 >= 0.0f || (-1.0f) * y4 <= 48) && (y4 <= 0.0f || y4 <= 48)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        f fVar = this.f16666d;
        if (fVar == null) {
            return;
        }
        fVar.a(cls.getSimpleName(), cls);
    }

    public void release() {
        try {
            if (!this.m) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", Integer.valueOf(this.l));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000135", this.f16673k, dVar);
            }
        } catch (Exception unused) {
        }
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            this.f16667e = null;
            if (ai.b(getContext()) == 0) {
                this.m = true;
                destroy();
            } else {
                new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        WindVaneWebView.this.m = true;
                        WindVaneWebView.this.destroy();
                    }
                }, r0 * 1000);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        f fVar = this.f16666d;
        if (fVar != null) {
            fVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        f fVar = this.f16666d;
        if (fVar != null) {
            fVar.a(obj);
        }
    }

    public void setCampaignEx(CampaignEx campaignEx) {
        this.f16673k = campaignEx;
    }

    public void setCampaignId(String str) {
        this.f16669g = str;
    }

    public void setLocalRequestId(String str) {
        this.f16672j = str;
    }

    public void setMraidObject(Object obj) {
        this.f16668f = obj;
    }

    public void setObject(Object obj) {
        this.f16667e = obj;
    }

    public void setRid(String str) {
        this.f16671i = str;
    }

    public void setSignalCommunication(c cVar) {
        this.f16665c = cVar;
        cVar.a(this);
    }

    public void setTempTypeForMetrics(int i9) {
        this.l = i9;
    }

    public void setWebViewChromeClient(k kVar) {
        this.b = kVar;
        setWebChromeClient(kVar);
    }

    public void setWebViewListener(d dVar) {
        this.f16670h = dVar;
        k kVar = this.b;
        if (kVar != null) {
            kVar.a(dVar);
        }
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.a(dVar);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView
    public final void a() {
        super.a();
        getSettings().setSavePassword(false);
        getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        if (this.b == null) {
            this.b = new k(this);
        }
        setWebViewChromeClient(this.b);
        l lVar = new l();
        this.mWebViewClient = lVar;
        setWebViewClient(lVar);
        if (this.f16665c == null) {
            c iVar = new i(this.f16581a);
            this.f16665c = iVar;
            setSignalCommunication(iVar);
        }
        this.f16666d = new f(this.f16581a, this);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = false;
        this.f16674n = 0.0f;
        this.f16675o = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.m = false;
        this.f16674n = 0.0f;
        this.f16675o = 0.0f;
    }
}
