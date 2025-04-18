package com.applovin.impl.sdk;

import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinTargetingData;
import com.applovin.sdk.AppLovinUserSegment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class AppLovinSdkInitializationConfigurationImpl implements AppLovinSdkInitializationConfiguration {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7537b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7538c;

    /* renamed from: d, reason: collision with root package name */
    private final AppLovinUserSegment f7539d;

    /* renamed from: e, reason: collision with root package name */
    private final AppLovinTargetingData f7540e;

    /* renamed from: f, reason: collision with root package name */
    private final List f7541f;

    /* renamed from: g, reason: collision with root package name */
    private final List f7542g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f7543h;

    /* loaded from: classes.dex */
    public static class BuilderImpl implements AppLovinSdkInitializationConfiguration.Builder {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private String f7544b;

        /* renamed from: c, reason: collision with root package name */
        private String f7545c;

        /* renamed from: d, reason: collision with root package name */
        private AppLovinUserSegment f7546d;

        /* renamed from: e, reason: collision with root package name */
        private AppLovinTargetingData f7547e;

        /* renamed from: f, reason: collision with root package name */
        private List f7548f = Collections.emptyList();

        /* renamed from: g, reason: collision with root package name */
        private List f7549g = Collections.emptyList();

        /* renamed from: h, reason: collision with root package name */
        private boolean f7550h = true;

        public BuilderImpl(String str, Context context) {
            this.a = str;
            t.e("AppLovinSdkInitializationConfiguration", "Initializing with key: " + str);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration build() {
            return new AppLovinSdkInitializationConfigurationImpl(this);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getAdUnitIds() {
            return this.f7549g;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public String getMediationProvider() {
            return this.f7544b;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public String getPluginVersion() {
            return this.f7545c;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public String getSdkKey() {
            return this.a;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public AppLovinTargetingData getTargetingData() {
            return this.f7547e;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getTestDeviceAdvertisingIds() {
            return this.f7548f;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public AppLovinUserSegment getUserSegment() {
            return this.f7546d;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public boolean isExceptionHandlerEnabled() {
            return this.f7550h;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setAdUnitIds(List<String> list) {
            t.e("AppLovinSdkInitializationConfiguration", "setAdUnitIds(adUnitIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (StringUtils.isValidString(str) && str.length() > 0) {
                    if (str.length() == 16) {
                        arrayList.add(str);
                    } else {
                        t.h("AppLovinSdkInitializationConfiguration", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.f7549g = arrayList;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setExceptionHandlerEnabled(boolean z10) {
            t.e("AppLovinSdkInitializationConfiguration", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z10 + ")");
            this.f7550h = z10;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setMediationProvider(@Nullable String str) {
            t.e("AppLovinSdkInitializationConfiguration", "setMediationProvider(mediationProvider=" + str + ")");
            if (str != null && (str.isEmpty() || str.length() > 64 || !StringUtils.isAlphaNumeric(str))) {
                t.h("AppLovinSdkInitializationConfiguration", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
                return this;
            }
            this.f7544b = str;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setPluginVersion(@Nullable String str) {
            t.e("AppLovinSdkInitializationConfiguration", "setPluginVersion(pluginVersion=" + str + ")");
            this.f7545c = str;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setSdkKey(String str) {
            this.a = str;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setTargetingData(@Nullable AppLovinTargetingData appLovinTargetingData) {
            t.e("AppLovinSdkInitializationConfiguration", "setTargetingData(targetingData=" + appLovinTargetingData + ")");
            this.f7547e = appLovinTargetingData;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setTestDeviceAdvertisingIds(List<String> list) {
            t.e("AppLovinSdkInitializationConfiguration", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (str != null && str.length() == 36) {
                    arrayList.add(str);
                } else {
                    t.h("AppLovinSdkInitializationConfiguration", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                }
            }
            this.f7548f = arrayList;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setUserSegment(@Nullable AppLovinUserSegment appLovinUserSegment) {
            t.e("AppLovinSdkInitializationConfiguration", "setUserSegment(userSegment=" + appLovinUserSegment + ")");
            this.f7546d = appLovinUserSegment;
            return this;
        }

        public String toString() {
            return "AppLovinSdkInitializationConfiguration.Builder{ sdkKey=" + this.a + "mediationProvider=" + this.f7544b + "pluginVersion=" + this.f7545c + "testDeviceAdvertisingIdentifiers=" + this.f7548f + "adUnitIdentifiers=" + this.f7549g + "isExceptionHandlerEnabled=" + this.f7550h + "userSegment=" + this.f7546d + "targetingData=" + this.f7547e + "}";
        }
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getAdUnitIds() {
        return this.f7542g;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getMediationProvider() {
        return this.f7537b;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getPluginVersion() {
        return this.f7538c;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getSdkKey() {
        return this.a;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public AppLovinTargetingData getTargetingData() {
        return this.f7540e;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getTestDeviceAdvertisingIds() {
        return this.f7541f;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public AppLovinUserSegment getUserSegment() {
        return this.f7539d;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public boolean isExceptionHandlerEnabled() {
        return this.f7543h;
    }

    public String toString() {
        return "AppLovinSdkInitializationConfiguration{ sdkKey=" + this.a + ", mediationProvider=" + this.f7537b + ", pluginVersion=" + this.f7538c + ", testDeviceAdvertisingIdentifiers=" + this.f7541f + ", adUnitIdentifiers=" + this.f7542g + ", isExceptionHandlerEnabled=" + this.f7543h + ", userSegment=" + this.f7539d + ", targetingData=" + this.f7540e + "}";
    }

    private AppLovinSdkInitializationConfigurationImpl(BuilderImpl builderImpl) {
        this.a = builderImpl.a;
        this.f7537b = builderImpl.f7544b;
        this.f7538c = builderImpl.f7545c;
        this.f7539d = builderImpl.f7546d;
        this.f7540e = builderImpl.f7547e;
        this.f7541f = builderImpl.f7548f;
        this.f7542g = builderImpl.f7549g;
        this.f7543h = builderImpl.f7550h;
    }
}
