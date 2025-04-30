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

/* loaded from: classes3.dex */
public class WindVaneWebViewForNV extends WindVaneWebView {

    /* renamed from: e, reason: collision with root package name */
    private static String f16834e = "WindVaneWebViewForNV";

    /* renamed from: f, reason: collision with root package name */
    private b f16835f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16836g;

    public WindVaneWebViewForNV(Context context) {
        super(context);
        this.f16836g = false;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        b bVar;
        if (i9 == 4 && (bVar = this.f16835f) != null) {
            bVar.a();
            return true;
        }
        return super.onKeyDown(i9, keyEvent);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f16836g) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void orientation(boolean z8) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z8) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            g.a().a((WebView) this, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public void setBackListener(b bVar) {
        this.f16835f = bVar;
    }

    public void setInterceptTouch(boolean z8) {
        this.f16836g = z8;
    }

    public void webViewShow(CampaignEx campaignEx, String str) {
        int i9;
        try {
            g.a().a((WebView) this, "webviewshow", "");
            n nVar = new n();
            nVar.f(campaignEx.getRequestId());
            nVar.g(campaignEx.getRequestIdNotice());
            if (getContext() != null && getContext().getApplicationContext() != null) {
                nVar.e(campaignEx.getId());
                if (campaignEx.isMraid()) {
                    i9 = n.f15616a;
                } else {
                    i9 = n.b;
                }
                nVar.d(i9);
                com.mbridge.msdk.foundation.same.report.g.d(nVar, getContext().getApplicationContext(), str);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public WindVaneWebViewForNV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16836g = false;
    }

    public WindVaneWebViewForNV(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f16836g = false;
    }
}
