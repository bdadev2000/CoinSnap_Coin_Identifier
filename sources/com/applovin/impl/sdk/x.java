package com.applovin.impl.sdk;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.x3;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.HashMap;

/* loaded from: classes.dex */
public class x extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        String str;
        int rendererPriorityAtExit;
        HashMap<String, String> hashMap = CollectionUtils.hashMap("top_main_method", "onRenderProcessGone");
        if (x3.i()) {
            didCrash = renderProcessGoneDetail.didCrash();
            if (didCrash) {
                str = AppMeasurement.CRASH_ORIGIN;
            } else {
                str = "non_crash";
            }
            hashMap.put("source", str);
            StringBuilder sb2 = new StringBuilder("renderer_priority_at_exit=");
            rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
            sb2.append(rendererPriorityAtExit);
            hashMap.put("details", sb2.toString());
        }
        k.A0.B().a(o.b.WEB_VIEW_ERROR, hashMap, ((Long) k.A0.a(oj.f6805z3)).longValue());
        t.g("RenderProcessGoneHandlingWebViewClient", "onRenderProcessGone() handled");
        return true;
    }
}
