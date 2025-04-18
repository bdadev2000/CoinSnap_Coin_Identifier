package com.applovin.impl.sdk;

import androidx.annotation.Nullable;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import lombok.NonNull;

/* loaded from: classes.dex */
public class SdkConfigurationImpl implements AppLovinSdkConfiguration {
    private final List a;

    /* renamed from: b, reason: collision with root package name */
    private final k f7570b;

    public SdkConfigurationImpl(@Nullable List<String> list, k kVar) {
        this.a = list;
        this.f7570b = kVar;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public AppLovinSdkConfiguration.ConsentDialogState getConsentDialogState() {
        String str = (String) a4.j.b(this.f7570b, "consent_dialog_state");
        if (!StringUtils.isValidString(str)) {
            str = (String) this.f7570b.a(oj.f6756s6);
        }
        if ("applies".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentDialogState.APPLIES;
        }
        if ("does_not_apply".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY;
        }
        return AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public AppLovinSdkConfiguration.ConsentFlowUserGeography getConsentFlowUserGeography() {
        String str = (String) this.f7570b.a(oj.f6756s6);
        if ("applies".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
        }
        if ("does_not_apply".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER;
        }
        return AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public String getCountryCode() {
        return (String) this.f7570b.a(oj.f6763t6);
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    @Nullable
    public List<String> getEnabledAmazonAdUnitIds() {
        return this.a;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public boolean isTestModeEnabled() {
        return this.f7570b.n0().c();
    }

    @NonNull
    public String toString() {
        return "AppLovinSdkConfiguration{, countryCode=" + getCountryCode() + ", enabledAmazonAdUnitIds=" + getEnabledAmazonAdUnitIds() + ", testModeEnabled=" + isTestModeEnabled() + AbstractJsonLexerKt.END_OBJ;
    }
}
