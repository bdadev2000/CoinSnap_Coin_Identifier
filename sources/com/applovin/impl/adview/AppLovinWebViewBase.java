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
        Boolean m;
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
            WebSettings.PluginState b = u02.b();
            if (b != null) {
                settings.setPluginState(b);
            }
            Boolean e4 = u02.e();
            if (e4 != null) {
                settings.setAllowFileAccess(e4.booleanValue());
            }
            Boolean i9 = u02.i();
            if (i9 != null) {
                settings.setLoadWithOverviewMode(i9.booleanValue());
            }
            Boolean q9 = u02.q();
            if (q9 != null) {
                settings.setUseWideViewPort(q9.booleanValue());
            }
            Boolean d2 = u02.d();
            if (d2 != null) {
                settings.setAllowContentAccess(d2.booleanValue());
            }
            Boolean p2 = u02.p();
            if (p2 != null) {
                settings.setBuiltInZoomControls(p2.booleanValue());
            }
            Boolean h6 = u02.h();
            if (h6 != null) {
                settings.setDisplayZoomControls(h6.booleanValue());
            }
            Boolean l = u02.l();
            if (l != null) {
                settings.setSaveFormData(l.booleanValue());
            }
            Boolean c9 = u02.c();
            if (c9 != null) {
                settings.setGeolocationEnabled(c9.booleanValue());
            }
            Boolean j7 = u02.j();
            if (j7 != null) {
                settings.setNeedInitialFocus(j7.booleanValue());
            }
            Boolean f9 = u02.f();
            if (f9 != null) {
                settings.setAllowFileAccessFromFileURLs(f9.booleanValue());
            }
            Boolean g9 = u02.g();
            if (g9 != null) {
                settings.setAllowUniversalAccessFromFileURLs(g9.booleanValue());
            }
            Boolean o3 = u02.o();
            if (o3 != null) {
                settings.setLoadsImagesAutomatically(o3.booleanValue());
            }
            Boolean n2 = u02.n();
            if (n2 != null) {
                settings.setBlockNetworkImage(n2.booleanValue());
            }
            if (x3.f()) {
                Integer a6 = u02.a();
                if (a6 != null) {
                    settings.setMixedContentMode(a6.intValue());
                }
                if (x3.g()) {
                    Boolean k6 = u02.k();
                    if (k6 != null) {
                        settings.setOffscreenPreRaster(k6.booleanValue());
                    }
                    if (x3.l() && (m = u02.m()) != null) {
                        settings.setAlgorithmicDarkeningAllowed(m.booleanValue());
                    }
                }
            }
        }
    }
}
