package com.applovin.impl.adview;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.j3;
import com.applovin.impl.rr;
import com.applovin.impl.z3;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;

/* loaded from: classes2.dex */
public class l extends j3 {

    /* renamed from: c, reason: collision with root package name */
    private final String f22819c;

    public l(String str, com.applovin.impl.sdk.ad.b bVar, rr rrVar, Context context) {
        super(context);
        this.f22819c = str;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        if (bVar.N0()) {
            applySettings(bVar);
        } else {
            settings.setAllowFileAccess(true);
            if (z3.e() && bVar.J0()) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        }
        setWebViewClient(rrVar);
        setWebChromeClient(new WebChromeClient());
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
    }

    public void a(String str) {
        AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, this.f22819c, str, "text/html", null, "");
    }

    @Override // com.applovin.impl.j3, com.applovin.impl.adview.AppLovinWebViewBase, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.j3, com.applovin.impl.adview.AppLovinWebViewBase, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
