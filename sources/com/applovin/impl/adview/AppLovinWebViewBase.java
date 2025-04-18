package com.applovin.impl.adview;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.z3;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;

/* loaded from: classes2.dex */
public class AppLovinWebViewBase extends WebView {
    public AppLovinWebViewBase(Context context) {
        super(context);
    }

    public void applySettings(com.applovin.impl.sdk.ad.b bVar) {
        Boolean m2;
        AppLovinNetworkBridge.webviewLoadUrl(this, "about:blank");
        int u02 = bVar.u0();
        if (u02 >= 0) {
            setLayerType(u02, null);
        }
        if (z3.d()) {
            getSettings().setMediaPlaybackRequiresUserGesture(bVar.G());
        }
        if (z3.e() && bVar.J0()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        m v02 = bVar.v0();
        if (v02 != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState b2 = v02.b();
            if (b2 != null) {
                settings.setPluginState(b2);
            }
            Boolean e = v02.e();
            if (e != null) {
                settings.setAllowFileAccess(e.booleanValue());
            }
            Boolean i2 = v02.i();
            if (i2 != null) {
                settings.setLoadWithOverviewMode(i2.booleanValue());
            }
            Boolean q2 = v02.q();
            if (q2 != null) {
                settings.setUseWideViewPort(q2.booleanValue());
            }
            Boolean d = v02.d();
            if (d != null) {
                settings.setAllowContentAccess(d.booleanValue());
            }
            Boolean p2 = v02.p();
            if (p2 != null) {
                settings.setBuiltInZoomControls(p2.booleanValue());
            }
            Boolean h2 = v02.h();
            if (h2 != null) {
                settings.setDisplayZoomControls(h2.booleanValue());
            }
            Boolean l2 = v02.l();
            if (l2 != null) {
                settings.setSaveFormData(l2.booleanValue());
            }
            Boolean c2 = v02.c();
            if (c2 != null) {
                settings.setGeolocationEnabled(c2.booleanValue());
            }
            Boolean j2 = v02.j();
            if (j2 != null) {
                settings.setNeedInitialFocus(j2.booleanValue());
            }
            Boolean f2 = v02.f();
            if (f2 != null) {
                settings.setAllowFileAccessFromFileURLs(f2.booleanValue());
            }
            Boolean g2 = v02.g();
            if (g2 != null) {
                settings.setAllowUniversalAccessFromFileURLs(g2.booleanValue());
            }
            Boolean o2 = v02.o();
            if (o2 != null) {
                settings.setLoadsImagesAutomatically(o2.booleanValue());
            }
            Boolean n2 = v02.n();
            if (n2 != null) {
                settings.setBlockNetworkImage(n2.booleanValue());
            }
            if (z3.f()) {
                Integer a2 = v02.a();
                if (a2 != null) {
                    settings.setMixedContentMode(a2.intValue());
                }
                if (z3.g()) {
                    Boolean k2 = v02.k();
                    if (k2 != null) {
                        settings.setOffscreenPreRaster(k2.booleanValue());
                    }
                    if (!z3.l() || (m2 = v02.m()) == null) {
                        return;
                    }
                    settings.setAlgorithmicDarkeningAllowed(m2.booleanValue());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
