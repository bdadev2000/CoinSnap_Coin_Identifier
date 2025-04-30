package com.applovin.impl;

import android.net.Uri;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;

/* loaded from: classes.dex */
public class g4 implements AppLovinTermsAndPrivacyPolicyFlowSettings {

    /* renamed from: a, reason: collision with root package name */
    private boolean f7778a;
    private AppLovinSdkConfiguration.ConsentFlowUserGeography b;

    /* renamed from: c, reason: collision with root package name */
    private a f7779c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f7780d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f7781e;

    /* loaded from: classes.dex */
    public enum a {
        TERMS("default"),
        UNIFIED("unified");


        /* renamed from: a, reason: collision with root package name */
        private final String f7784a;

        a(String str) {
            this.f7784a = str;
        }

        public String b() {
            return this.f7784a;
        }
    }

    public g4(boolean z8, AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, a aVar, Uri uri, Uri uri2) {
        this.f7778a = z8;
        this.b = consentFlowUserGeography;
        this.f7779c = aVar;
        this.f7780d = uri;
        this.f7781e = uri2;
    }

    public a a() {
        return this.f7779c;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography() {
        return this.b;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public Uri getPrivacyPolicyUri() {
        return this.f7780d;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public Uri getTermsOfServiceUri() {
        return this.f7781e;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public boolean isEnabled() {
        return this.f7778a;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        com.applovin.impl.sdk.t.g("ConsentFlowSettingsImpl", "Setting user debug geography: " + consentFlowUserGeography);
        this.b = consentFlowUserGeography;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public void setEnabled(boolean z8) {
        com.applovin.impl.sdk.t.g("ConsentFlowSettingsImpl", "Setting consent flow enabled: " + z8);
        this.f7778a = z8;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public void setPrivacyPolicyUri(Uri uri) {
        com.applovin.impl.sdk.t.g("ConsentFlowSettingsImpl", "Setting privacy policy: " + uri);
        this.f7780d = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsFlowSettings
    public void setTermsOfServiceUri(Uri uri) {
        com.applovin.impl.sdk.t.g("ConsentFlowSettingsImpl", "Setting terms of service: " + uri);
        this.f7781e = uri;
    }

    public String toString() {
        return "ConsentFlowSettings{isEnabled=" + this.f7778a + ", privacyPolicyUri=" + this.f7780d + ", termsOfServiceUri=" + this.f7781e + '}';
    }

    public void a(a aVar) {
        this.f7779c = aVar;
    }
}
