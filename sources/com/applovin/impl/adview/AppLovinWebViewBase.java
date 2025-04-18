package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.x3;

/* loaded from: classes.dex */
public class AppLovinWebViewBase extends WebView {
    public AppLovinWebViewBase(Context context) {
        super(context);
    }

    public void applySettings(com.applovin.impl.sdk.ad.b bVar) {
        Boolean m10;
        loadUrl("about:blank");
        int t02 = bVar.t0();
        if (t02 >= 0) {
            setLayerType(t02, null);
        }
        if (x3.d()) {
            getSettings().setMediaPlaybackRequiresUserGesture(bVar.G());
        }
        if (x3.e() && bVar.H0()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        m u02 = bVar.u0();
        if (u02 != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState b3 = u02.b();
            if (b3 != null) {
                settings.setPluginState(b3);
            }
            Boolean e2 = u02.e();
            if (e2 != null) {
                settings.setAllowFileAccess(e2.booleanValue());
            }
            Boolean i10 = u02.i();
            if (i10 != null) {
                settings.setLoadWithOverviewMode(i10.booleanValue());
            }
            Boolean q10 = u02.q();
            if (q10 != null) {
                settings.setUseWideViewPort(q10.booleanValue());
            }
            Boolean d10 = u02.d();
            if (d10 != null) {
                settings.setAllowContentAccess(d10.booleanValue());
            }
            Boolean p10 = u02.p();
            if (p10 != null) {
                settings.setBuiltInZoomControls(p10.booleanValue());
            }
            Boolean h10 = u02.h();
            if (h10 != null) {
                settings.setDisplayZoomControls(h10.booleanValue());
            }
            Boolean l10 = u02.l();
            if (l10 != null) {
                settings.setSaveFormData(l10.booleanValue());
            }
            Boolean c10 = u02.c();
            if (c10 != null) {
                settings.setGeolocationEnabled(c10.booleanValue());
            }
            Boolean j3 = u02.j();
            if (j3 != null) {
                settings.setNeedInitialFocus(j3.booleanValue());
            }
            Boolean f10 = u02.f();
            if (f10 != null) {
                settings.setAllowFileAccessFromFileURLs(f10.booleanValue());
            }
            Boolean g10 = u02.g();
            if (g10 != null) {
                settings.setAllowUniversalAccessFromFileURLs(g10.booleanValue());
            }
            Boolean o10 = u02.o();
            if (o10 != null) {
                settings.setLoadsImagesAutomatically(o10.booleanValue());
            }
            Boolean n10 = u02.n();
            if (n10 != null) {
                settings.setBlockNetworkImage(n10.booleanValue());
            }
            if (x3.f()) {
                Integer a = u02.a();
                if (a != null) {
                    settings.setMixedContentMode(a.intValue());
                }
                if (x3.g()) {
                    Boolean k10 = u02.k();
                    if (k10 != null) {
                        settings.setOffscreenPreRaster(k10.booleanValue());
                    }
                    if (x3.l() && (m10 = u02.m()) != null) {
                        settings.setAlgorithmicDarkeningAllowed(m10.booleanValue());
                    }
                }
            }
        }
    }
}
