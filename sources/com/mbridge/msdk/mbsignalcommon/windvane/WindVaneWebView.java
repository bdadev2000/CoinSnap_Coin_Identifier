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

/* loaded from: classes4.dex */
public class WindVaneWebView extends BaseWebView {

    /* renamed from: b, reason: collision with root package name */
    protected k f14132b;

    /* renamed from: c, reason: collision with root package name */
    protected c f14133c;

    /* renamed from: d, reason: collision with root package name */
    protected f f14134d;

    /* renamed from: e, reason: collision with root package name */
    private Object f14135e;

    /* renamed from: f, reason: collision with root package name */
    private Object f14136f;

    /* renamed from: g, reason: collision with root package name */
    private String f14137g;

    /* renamed from: h, reason: collision with root package name */
    private d f14138h;

    /* renamed from: i, reason: collision with root package name */
    private String f14139i;

    /* renamed from: j, reason: collision with root package name */
    private String f14140j;

    /* renamed from: k, reason: collision with root package name */
    private CampaignEx f14141k;

    /* renamed from: l, reason: collision with root package name */
    private int f14142l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14143m;

    /* renamed from: n, reason: collision with root package name */
    private float f14144n;

    /* renamed from: o, reason: collision with root package name */
    private float f14145o;

    public WindVaneWebView(Context context) {
        super(context);
        this.f14143m = false;
        this.f14144n = 0.0f;
        this.f14145o = 0.0f;
    }

    public void clearWebView() {
        if (!this.f14143m) {
            loadUrl("about:blank");
        }
    }

    public CampaignEx getCampaignEx() {
        return this.f14141k;
    }

    public String getCampaignId() {
        return this.f14137g;
    }

    public Object getJsObject(String str) {
        f fVar = this.f14134d;
        if (fVar == null) {
            return null;
        }
        return fVar.a(str);
    }

    public String getLocalRequestId() {
        return this.f14140j;
    }

    public Object getMraidObject() {
        return this.f14136f;
    }

    public Object getObject() {
        return this.f14135e;
    }

    public String getRid() {
        return this.f14139i;
    }

    public c getSignalCommunication() {
        return this.f14133c;
    }

    public d getWebViewListener() {
        return this.f14138h;
    }

    public boolean isDestoryed() {
        return this.f14143m;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.b() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f14144n = motionEvent.getRawX();
                    this.f14145o = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f14144n;
                    float y4 = motionEvent.getY() - this.f14145o;
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
        f fVar = this.f14134d;
        if (fVar == null) {
            return;
        }
        fVar.a(cls.getSimpleName(), cls);
    }

    public void release() {
        try {
            if (!this.f14143m) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", Integer.valueOf(this.f14142l));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000135", this.f14141k, dVar);
            }
        } catch (Exception unused) {
        }
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            this.f14135e = null;
            if (ai.b(getContext()) == 0) {
                this.f14143m = true;
                destroy();
            } else {
                new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        WindVaneWebView.this.f14143m = true;
                        WindVaneWebView.this.destroy();
                    }
                }, r0 * 1000);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        f fVar = this.f14134d;
        if (fVar != null) {
            fVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        f fVar = this.f14134d;
        if (fVar != null) {
            fVar.a(obj);
        }
    }

    public void setCampaignEx(CampaignEx campaignEx) {
        this.f14141k = campaignEx;
    }

    public void setCampaignId(String str) {
        this.f14137g = str;
    }

    public void setLocalRequestId(String str) {
        this.f14140j = str;
    }

    public void setMraidObject(Object obj) {
        this.f14136f = obj;
    }

    public void setObject(Object obj) {
        this.f14135e = obj;
    }

    public void setRid(String str) {
        this.f14139i = str;
    }

    public void setSignalCommunication(c cVar) {
        this.f14133c = cVar;
        cVar.a(this);
    }

    public void setTempTypeForMetrics(int i10) {
        this.f14142l = i10;
    }

    public void setWebViewChromeClient(k kVar) {
        this.f14132b = kVar;
        setWebChromeClient(kVar);
    }

    public void setWebViewListener(d dVar) {
        this.f14138h = dVar;
        k kVar = this.f14132b;
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
        if (this.f14132b == null) {
            this.f14132b = new k(this);
        }
        setWebViewChromeClient(this.f14132b);
        l lVar = new l();
        this.mWebViewClient = lVar;
        setWebViewClient(lVar);
        if (this.f14133c == null) {
            c iVar = new i(this.a);
            this.f14133c = iVar;
            setSignalCommunication(iVar);
        }
        this.f14134d = new f(this.a, this);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14143m = false;
        this.f14144n = 0.0f;
        this.f14145o = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14143m = false;
        this.f14144n = 0.0f;
        this.f14145o = 0.0f;
    }
}
