package com.applovin.sdk;

import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.AppLovinSdkInitializationConfigurationImpl;
import java.util.List;

/* loaded from: classes.dex */
public interface AppLovinSdkInitializationConfiguration {

    /* loaded from: classes.dex */
    public interface Builder {
        AppLovinSdkInitializationConfiguration build();

        List<String> getAdUnitIds();

        @Nullable
        String getMediationProvider();

        @Nullable
        String getPluginVersion();

        String getSdkKey();

        @Nullable
        AppLovinTargetingData getTargetingData();

        List<String> getTestDeviceAdvertisingIds();

        @Nullable
        AppLovinUserSegment getUserSegment();

        boolean isExceptionHandlerEnabled();

        Builder setAdUnitIds(List<String> list);

        Builder setExceptionHandlerEnabled(boolean z10);

        Builder setMediationProvider(@Nullable String str);

        Builder setPluginVersion(@Nullable String str);

        Builder setTargetingData(@Nullable AppLovinTargetingData appLovinTargetingData);

        Builder setTestDeviceAdvertisingIds(List<String> list);

        Builder setUserSegment(@Nullable AppLovinUserSegment appLovinUserSegment);
    }

    static Builder builder(String str, Context context) {
        return new AppLovinSdkInitializationConfigurationImpl.BuilderImpl(str, context);
    }

    List<String> getAdUnitIds();

    @Nullable
    String getMediationProvider();

    @Nullable
    String getPluginVersion();

    @Nullable
    String getSdkKey();

    @Nullable
    AppLovinTargetingData getTargetingData();

    List<String> getTestDeviceAdvertisingIds();

    @Nullable
    AppLovinUserSegment getUserSegment();

    boolean isExceptionHandlerEnabled();
}
