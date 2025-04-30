package com.mbridge.msdk.splash.view;

import O5.b;
import android.content.Context;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

/* loaded from: classes3.dex */
public class MBSplashWebview extends WindVaneWebView {

    /* renamed from: e, reason: collision with root package name */
    private static final String f18072e = "MBSplashWebview";

    /* renamed from: f, reason: collision with root package name */
    private String f18073f;

    /* renamed from: g, reason: collision with root package name */
    private b f18074g;

    public MBSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
        try {
            b bVar = this.f18074g;
            if (bVar != null) {
                bVar.c();
                this.f18074g = null;
                ad.a("OMSDK", "finish adSession");
            }
        } catch (Exception e4) {
            ad.a("OMSDK", e4.getMessage());
        }
    }

    public b getAdSession() {
        return this.f18074g;
    }

    public String getRequestId() {
        return this.f18073f;
    }

    public void setAdSession(b bVar) {
        this.f18074g = bVar;
    }

    public void setRequestId(String str) {
        this.f18073f = str;
    }
}
