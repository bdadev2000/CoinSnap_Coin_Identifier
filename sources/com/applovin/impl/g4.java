package com.applovin.impl;

import android.net.Uri;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class g4 implements AppLovinTermsAndPrivacyPolicyFlowSettings {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private AppLovinSdkConfiguration.ConsentFlowUserGeography f4836b;

    /* renamed from: c, reason: collision with root package name */
    private a f4837c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f4838d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f4839e;

    /* loaded from: classes.dex */
    public enum a {
        TERMS("default"),
        UNIFIED("unified");

        private final String a;

        a(String str) {
            this.a = str;
        }

        public String b() {
            return this.a;
        }
    }

    public g4(boolean z10, AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, a aVar, Uri uri, Uri uri2) {
        this.a = z10;
        this.f4836b = consentFlowUserGeography;
        this.f4837c = aVar;
        this.f4838d = uri;
        this.f4839e = uri2;
    }

    public a a() {
        return this.f4837c;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography() {
        return this.f4836b;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public Uri getPrivacyPolicyUri() {
        return this.f4838d;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public Uri getTermsOfServiceUri() {
        return this.f4839e;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public boolean isEnabled() {
        return this.a;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        com.applovin.impl.sdk.t.g("ConsentFlowSettingsImpl", "Setting user debug geography: " + consentFlowUserGeography);
        this.f4836b = consentFlowUserGeography;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public void setEnabled(boolean z10) {
        com.applovin.impl.sdk.t.g("ConsentFlowSettingsImpl", "Setting consent flow enabled: " + z10);
        this.a = z10;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public void setPrivacyPolicyUri(Uri uri) {
        com.applovin.impl.sdk.t.g("ConsentFlowSettingsImpl", "Setting privacy policy: " + uri);
        this.f4838d = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public void setTermsOfServiceUri(Uri uri) {
        com.applovin.impl.sdk.t.g("ConsentFlowSettingsImpl", "Setting terms of service: " + uri);
        this.f4839e = uri;
    }

    public String toString() {
        return "ConsentFlowSettings{isEnabled=" + this.a + ", privacyPolicyUri=" + this.f4838d + ", termsOfServiceUri=" + this.f4839e + AbstractJsonLexerKt.END_OBJ;
    }

    public void a(a aVar) {
        this.f4837c = aVar;
    }
}
