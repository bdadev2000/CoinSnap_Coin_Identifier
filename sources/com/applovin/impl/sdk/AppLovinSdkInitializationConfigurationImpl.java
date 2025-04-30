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

    /* renamed from: a, reason: collision with root package name */
    private final String f10675a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10676c;

    /* renamed from: d, reason: collision with root package name */
    private final AppLovinUserSegment f10677d;

    /* renamed from: e, reason: collision with root package name */
    private final AppLovinTargetingData f10678e;

    /* renamed from: f, reason: collision with root package name */
    private final List f10679f;

    /* renamed from: g, reason: collision with root package name */
    private final List f10680g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f10681h;

    /* loaded from: classes.dex */
    public static class BuilderImpl implements AppLovinSdkInitializationConfiguration.Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f10682a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private String f10683c;

        /* renamed from: d, reason: collision with root package name */
        private AppLovinUserSegment f10684d;

        /* renamed from: e, reason: collision with root package name */
        private AppLovinTargetingData f10685e;

        /* renamed from: f, reason: collision with root package name */
        private List f10686f = Collections.emptyList();

        /* renamed from: g, reason: collision with root package name */
        private List f10687g = Collections.emptyList();

        /* renamed from: h, reason: collision with root package name */
        private boolean f10688h = true;

        public BuilderImpl(String str, Context context) {
            this.f10682a = str;
            t.e("AppLovinSdkInitializationConfiguration", "Initializing with key: " + str);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration build() {
            return new AppLovinSdkInitializationConfigurationImpl(this);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getAdUnitIds() {
            return this.f10687g;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public String getMediationProvider() {
            return this.b;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public String getPluginVersion() {
            return this.f10683c;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public String getSdkKey() {
            return this.f10682a;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public AppLovinTargetingData getTargetingData() {
            return this.f10685e;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getTestDeviceAdvertisingIds() {
            return this.f10686f;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public AppLovinUserSegment getUserSegment() {
            return this.f10684d;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public boolean isExceptionHandlerEnabled() {
            return this.f10688h;
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
            this.f10687g = arrayList;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setExceptionHandlerEnabled(boolean z8) {
            t.e("AppLovinSdkInitializationConfiguration", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z8 + ")");
            this.f10688h = z8;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setMediationProvider(@Nullable String str) {
            t.e("AppLovinSdkInitializationConfiguration", "setMediationProvider(mediationProvider=" + str + ")");
            if (str != null && (str.isEmpty() || str.length() > 64 || !StringUtils.isAlphaNumeric(str))) {
                t.h("AppLovinSdkInitializationConfiguration", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
                return this;
            }
            this.b = str;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setPluginVersion(@Nullable String str) {
            t.e("AppLovinSdkInitializationConfiguration", "setPluginVersion(pluginVersion=" + str + ")");
            this.f10683c = str;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setSdkKey(String str) {
            this.f10682a = str;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setTargetingData(@Nullable AppLovinTargetingData appLovinTargetingData) {
            t.e("AppLovinSdkInitializationConfiguration", "setTargetingData(targetingData=" + appLovinTargetingData + ")");
            this.f10685e = appLovinTargetingData;
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
            this.f10686f = arrayList;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setUserSegment(@Nullable AppLovinUserSegment appLovinUserSegment) {
            t.e("AppLovinSdkInitializationConfiguration", "setUserSegment(userSegment=" + appLovinUserSegment + ")");
            this.f10684d = appLovinUserSegment;
            return this;
        }

        public String toString() {
            return "AppLovinSdkInitializationConfiguration.Builder{ sdkKey=" + this.f10682a + "mediationProvider=" + this.b + "pluginVersion=" + this.f10683c + "testDeviceAdvertisingIdentifiers=" + this.f10686f + "adUnitIdentifiers=" + this.f10687g + "isExceptionHandlerEnabled=" + this.f10688h + "userSegment=" + this.f10684d + "targetingData=" + this.f10685e + "}";
        }
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getAdUnitIds() {
        return this.f10680g;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getMediationProvider() {
        return this.b;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getPluginVersion() {
        return this.f10676c;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getSdkKey() {
        return this.f10675a;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public AppLovinTargetingData getTargetingData() {
        return this.f10678e;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getTestDeviceAdvertisingIds() {
        return this.f10679f;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public AppLovinUserSegment getUserSegment() {
        return this.f10677d;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public boolean isExceptionHandlerEnabled() {
        return this.f10681h;
    }

    public String toString() {
        return "AppLovinSdkInitializationConfiguration{ sdkKey=" + this.f10675a + ", mediationProvider=" + this.b + ", pluginVersion=" + this.f10676c + ", testDeviceAdvertisingIdentifiers=" + this.f10679f + ", adUnitIdentifiers=" + this.f10680g + ", isExceptionHandlerEnabled=" + this.f10681h + ", userSegment=" + this.f10677d + ", targetingData=" + this.f10678e + "}";
    }

    private AppLovinSdkInitializationConfigurationImpl(BuilderImpl builderImpl) {
        this.f10675a = builderImpl.f10682a;
        this.b = builderImpl.b;
        this.f10676c = builderImpl.f10683c;
        this.f10677d = builderImpl.f10684d;
        this.f10678e = builderImpl.f10685e;
        this.f10679f = builderImpl.f10686f;
        this.f10680g = builderImpl.f10687g;
        this.f10681h = builderImpl.f10688h;
    }
}
