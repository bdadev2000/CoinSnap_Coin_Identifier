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
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f8295c.a(this.f8296d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.ig
    public AdSessionContext a(WebView webView) {
        AdSessionContext createHtmlAdSessionContext;
        try {
            if (this.f8294a.getOpenMeasurementVerificationScriptResources().size() > 0) {
                createHtmlAdSessionContext = AdSessionContext.createNativeAdSessionContext(this.b.Y().b(), this.b.Y().a(), this.f8294a.getOpenMeasurementVerificationScriptResources(), this.f8294a.getOpenMeasurementContentUrl(), this.f8294a.getOpenMeasurementCustomReferenceData());
            } else {
                createHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(this.b.Y().b(), webView, this.f8294a.getOpenMeasurementContentUrl(), this.f8294a.getOpenMeasurementCustomReferenceData());
            }
            return createHtmlAdSessionContext;
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f8295c.a(this.f8296d, "Failed to create ad session context", th);
            }
            return null;
        }
    }
}
