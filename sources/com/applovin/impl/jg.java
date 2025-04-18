package com.applovin.impl;

import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* loaded from: classes.dex */
public class jg extends ig {
    public jg(com.applovin.impl.sdk.ad.a aVar) {
        super(aVar);
    }

    @Override // com.applovin.impl.ig
    public AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.LOADED, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f5331c.a(this.f5332d, "Failed to create ad session configuration", th2);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.ig
    public AdSessionContext a(WebView webView) {
        AdSessionContext createHtmlAdSessionContext;
        try {
            if (this.a.getOpenMeasurementVerificationScriptResources().size() > 0) {
                createHtmlAdSessionContext = AdSessionContext.createNativeAdSessionContext(this.f5330b.Y().b(), this.f5330b.Y().a(), this.a.getOpenMeasurementVerificationScriptResources(), this.a.getOpenMeasurementContentUrl(), this.a.getOpenMeasurementCustomReferenceData());
            } else {
                createHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(this.f5330b.Y().b(), webView, this.a.getOpenMeasurementContentUrl(), this.a.getOpenMeasurementCustomReferenceData());
            }
            return createHtmlAdSessionContext;
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f5331c.a(this.f5332d, "Failed to create ad session context", th2);
            }
            return null;
        }
    }
}
