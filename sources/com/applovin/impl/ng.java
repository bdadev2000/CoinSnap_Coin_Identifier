package com.applovin.impl;

import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* loaded from: classes.dex */
public class ng extends mg {
    public ng(com.applovin.impl.sdk.ad.a aVar) {
        super(aVar);
    }

    @Override // com.applovin.impl.mg
    public AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.LOADED, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25578c.a(this.d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.mg
    public AdSessionContext a(WebView webView) {
        AdSessionContext createHtmlAdSessionContext;
        try {
            if (this.f25576a.getOpenMeasurementVerificationScriptResources().size() > 0) {
                createHtmlAdSessionContext = AdSessionContext.createNativeAdSessionContext(this.f25577b.W().b(), this.f25577b.W().a(), this.f25576a.getOpenMeasurementVerificationScriptResources(), this.f25576a.getOpenMeasurementContentUrl(), this.f25576a.getOpenMeasurementCustomReferenceData());
            } else {
                createHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(this.f25577b.W().b(), webView, this.f25576a.getOpenMeasurementContentUrl(), this.f25576a.getOpenMeasurementCustomReferenceData());
            }
            return createHtmlAdSessionContext;
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25578c.a(this.d, "Failed to create ad session context", th);
            }
            return null;
        }
    }
}
