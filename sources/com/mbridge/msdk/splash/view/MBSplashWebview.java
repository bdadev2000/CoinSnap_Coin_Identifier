package com.mbridge.msdk.splash.view;

import android.content.Context;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import kd.b;

/* loaded from: classes4.dex */
public class MBSplashWebview extends WindVaneWebView {

    /* renamed from: e, reason: collision with root package name */
    private static final String f15335e = "MBSplashWebview";

    /* renamed from: f, reason: collision with root package name */
    private String f15336f;

    /* renamed from: g, reason: collision with root package name */
    private b f15337g;

    public MBSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
        try {
            b bVar = this.f15337g;
            if (bVar != null) {
                bVar.c();
                this.f15337g = null;
                ad.a("OMSDK", "finish adSession");
            }
        } catch (Exception e2) {
            ad.a("OMSDK", e2.getMessage());
        }
    }

    public b getAdSession() {
        return this.f15337g;
    }

    public String getRequestId() {
        return this.f15336f;
    }

    public void setAdSession(b bVar) {
        this.f15337g = bVar;
    }

    public void setRequestId(String str) {
        this.f15336f = str;
    }
}
