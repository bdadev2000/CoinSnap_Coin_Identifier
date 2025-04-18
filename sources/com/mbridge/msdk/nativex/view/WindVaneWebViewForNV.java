package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.nativex.listener.b;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class WindVaneWebViewForNV extends WindVaneWebView {

    /* renamed from: e, reason: collision with root package name */
    private static String f14247e = "WindVaneWebViewForNV";

    /* renamed from: f, reason: collision with root package name */
    private b f14248f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14249g;

    public WindVaneWebViewForNV(Context context) {
        super(context);
        this.f14249g = false;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        b bVar;
        if (i10 == 4 && (bVar = this.f14248f) != null) {
            bVar.a();
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f14249g) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void orientation(boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z10) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            g.a().a((WebView) this, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setBackListener(b bVar) {
        this.f14248f = bVar;
    }

    public void setInterceptTouch(boolean z10) {
        this.f14249g = z10;
    }

    public void webViewShow(CampaignEx campaignEx, String str) {
        int i10;
        try {
            g.a().a((WebView) this, "webviewshow", "");
            n nVar = new n();
            nVar.f(campaignEx.getRequestId());
            nVar.g(campaignEx.getRequestIdNotice());
            if (getContext() != null && getContext().getApplicationContext() != null) {
                nVar.e(campaignEx.getId());
                if (campaignEx.isMraid()) {
                    i10 = n.a;
                } else {
                    i10 = n.f13247b;
                }
                nVar.d(i10);
                com.mbridge.msdk.foundation.same.report.g.d(nVar, getContext().getApplicationContext(), str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public WindVaneWebViewForNV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14249g = false;
    }

    public WindVaneWebViewForNV(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14249g = false;
    }
}
