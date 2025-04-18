package com.applovin.impl;

import android.webkit.WebView;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* loaded from: classes.dex */
public class lg extends ig {
    public lg(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        super(appLovinNativeAdImpl);
    }

    @Override // com.applovin.impl.ig
    public AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f5331c.a(this.f5332d, "Failed to create ad session configuration", th2);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.ig
    public AdSessionContext a(WebView webView) {
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f5330b.Y().b(), this.f5330b.Y().a(), this.a.getOpenMeasurementVerificationScriptResources(), this.a.getOpenMeasurementContentUrl(), this.a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f5331c.a(this.f5332d, "Failed to create ad session context", th2);
            }
            return null;
        }
    }
}
