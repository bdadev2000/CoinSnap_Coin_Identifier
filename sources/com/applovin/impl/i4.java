package com.applovin.impl;

import android.net.Uri;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;

/* loaded from: classes.dex */
public class i4 implements AppLovinTermsAndPrivacyPolicyFlowSettings {

    /* renamed from: a, reason: collision with root package name */
    private boolean f24417a;

    /* renamed from: b, reason: collision with root package name */
    private AppLovinSdkConfiguration.ConsentFlowUserGeography f24418b;

    /* renamed from: c, reason: collision with root package name */
    private a f24419c;
    private Uri d;
    private Uri e;

    /* loaded from: classes.dex */
    public enum a {
        TERMS("default"),
        UNIFIED("unified");


        /* renamed from: a, reason: collision with root package name */
        private final String f24422a;

        a(String str) {
            this.f24422a = str;
        }

        public String b() {
            return this.f24422a;
        }
    }

    public i4(boolean z2, AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, a aVar, Uri uri, Uri uri2) {
        this.f24417a = z2;
        this.f24418b = consentFlowUserGeography;
        this.f24419c = aVar;
        this.d = uri;
        this.e = uri2;
    }

    public a a() {
        return this.f24419c;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography() {
        return this.f24418b;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public Uri getPrivacyPolicyUri() {
        return this.d;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public Uri getTermsOfServiceUri() {
        return this.e;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public boolean isEnabled() {
        return this.f24417a;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        com.applovin.impl.sdk.n.g("ConsentFlowSettingsImpl", "Setting user debug geography: " + consentFlowUserGeography);
        this.f24418b = consentFlowUserGeography;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public void setEnabled(boolean z2) {
        com.applovin.impl.sdk.n.g("ConsentFlowSettingsImpl", "Setting consent flow enabled: " + z2);
        this.f24417a = z2;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public void setPrivacyPolicyUri(Uri uri) {
        com.applovin.impl.sdk.n.g("ConsentFlowSettingsImpl", "Setting privacy policy: " + uri);
        this.d = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public void setTermsOfServiceUri(Uri uri) {
        com.applovin.impl.sdk.n.g("ConsentFlowSettingsImpl", "Setting terms of service: " + uri);
        this.e = uri;
    }

    public String toString() {
        return "ConsentFlowSettings{isEnabled=" + this.f24417a + ", privacyPolicyUri=" + this.d + ", termsOfServiceUri=" + this.e + '}';
    }

    public void a(a aVar) {
        this.f24419c = aVar;
    }
}
