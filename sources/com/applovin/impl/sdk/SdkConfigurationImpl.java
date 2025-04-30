package com.applovin.impl.sdk;

import Q7.n0;
import androidx.annotation.Nullable;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.List;
import lombok.NonNull;

/* loaded from: classes.dex */
public class SdkConfigurationImpl implements AppLovinSdkConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final List f10721a;
    private final k b;

    public SdkConfigurationImpl(@Nullable List<String> list, k kVar) {
        this.f10721a = list;
        this.b = kVar;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public AppLovinSdkConfiguration.ConsentDialogState getConsentDialogState() {
        String str = (String) n0.d(this.b, "consent_dialog_state");
        if (!StringUtils.isValidString(str)) {
            str = (String) this.b.a(oj.f9850s6);
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
        String str = (String) this.b.a(oj.f9850s6);
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
        return (String) this.b.a(oj.f9857t6);
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    @Nullable
    public List<String> getEnabledAmazonAdUnitIds() {
        return this.f10721a;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public boolean isTestModeEnabled() {
        return this.b.n0().c();
    }

    @NonNull
    public String toString() {
        return "AppLovinSdkConfiguration{, countryCode=" + getCountryCode() + ", enabledAmazonAdUnitIds=" + getEnabledAmazonAdUnitIds() + ", testModeEnabled=" + isTestModeEnabled() + '}';
    }
}
