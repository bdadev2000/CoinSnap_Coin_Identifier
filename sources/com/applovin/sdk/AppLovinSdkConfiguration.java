package com.applovin.sdk;

import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes3.dex */
public interface AppLovinSdkConfiguration {

    @Deprecated
    /* loaded from: classes3.dex */
    public enum ConsentDialogState {
        UNKNOWN,
        APPLIES,
        DOES_NOT_APPLY
    }

    /* loaded from: classes3.dex */
    public enum ConsentFlowUserGeography {
        UNKNOWN,
        GDPR,
        OTHER
    }

    @Deprecated
    ConsentDialogState getConsentDialogState();

    ConsentFlowUserGeography getConsentFlowUserGeography();

    String getCountryCode();

    @Nullable
    List<String> getEnabledAmazonAdUnitIds();

    boolean isTestModeEnabled();
}
