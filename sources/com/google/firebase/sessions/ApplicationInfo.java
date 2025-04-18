package com.google.firebase.sessions;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class ApplicationInfo {

    @NotNull
    private final AndroidApplicationInfo androidAppInfo;

    @NotNull
    private final String appId;

    @NotNull
    private final String deviceModel;

    @NotNull
    private final LogEnvironment logEnvironment;

    @NotNull
    private final String osVersion;

    @NotNull
    private final String sessionSdkVersion;

    public ApplicationInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull LogEnvironment logEnvironment, @NotNull AndroidApplicationInfo androidApplicationInfo) {
        p0.a.s(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        p0.a.s(str2, "deviceModel");
        p0.a.s(str3, "sessionSdkVersion");
        p0.a.s(str4, "osVersion");
        p0.a.s(logEnvironment, "logEnvironment");
        p0.a.s(androidApplicationInfo, "androidAppInfo");
        this.appId = str;
        this.deviceModel = str2;
        this.sessionSdkVersion = str3;
        this.osVersion = str4;
        this.logEnvironment = logEnvironment;
        this.androidAppInfo = androidApplicationInfo;
    }

    public static /* synthetic */ ApplicationInfo copy$default(ApplicationInfo applicationInfo, String str, String str2, String str3, String str4, LogEnvironment logEnvironment, AndroidApplicationInfo androidApplicationInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = applicationInfo.appId;
        }
        if ((i2 & 2) != 0) {
            str2 = applicationInfo.deviceModel;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = applicationInfo.sessionSdkVersion;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = applicationInfo.osVersion;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            logEnvironment = applicationInfo.logEnvironment;
        }
        LogEnvironment logEnvironment2 = logEnvironment;
        if ((i2 & 32) != 0) {
            androidApplicationInfo = applicationInfo.androidAppInfo;
        }
        return applicationInfo.copy(str, str5, str6, str7, logEnvironment2, androidApplicationInfo);
    }

    @NotNull
    public final String component1() {
        return this.appId;
    }

    @NotNull
    public final String component2() {
        return this.deviceModel;
    }

    @NotNull
    public final String component3() {
        return this.sessionSdkVersion;
    }

    @NotNull
    public final String component4() {
        return this.osVersion;
    }

    @NotNull
    public final LogEnvironment component5() {
        return this.logEnvironment;
    }

    @NotNull
    public final AndroidApplicationInfo component6() {
        return this.androidAppInfo;
    }

    @NotNull
    public final ApplicationInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull LogEnvironment logEnvironment, @NotNull AndroidApplicationInfo androidApplicationInfo) {
        p0.a.s(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        p0.a.s(str2, "deviceModel");
        p0.a.s(str3, "sessionSdkVersion");
        p0.a.s(str4, "osVersion");
        p0.a.s(logEnvironment, "logEnvironment");
        p0.a.s(androidApplicationInfo, "androidAppInfo");
        return new ApplicationInfo(str, str2, str3, str4, logEnvironment, androidApplicationInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationInfo)) {
            return false;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) obj;
        return p0.a.g(this.appId, applicationInfo.appId) && p0.a.g(this.deviceModel, applicationInfo.deviceModel) && p0.a.g(this.sessionSdkVersion, applicationInfo.sessionSdkVersion) && p0.a.g(this.osVersion, applicationInfo.osVersion) && this.logEnvironment == applicationInfo.logEnvironment && p0.a.g(this.androidAppInfo, applicationInfo.androidAppInfo);
    }

    @NotNull
    public final AndroidApplicationInfo getAndroidAppInfo() {
        return this.androidAppInfo;
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final LogEnvironment getLogEnvironment() {
        return this.logEnvironment;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getSessionSdkVersion() {
        return this.sessionSdkVersion;
    }

    public int hashCode() {
        return this.androidAppInfo.hashCode() + ((this.logEnvironment.hashCode() + androidx.compose.foundation.text.input.a.b(this.osVersion, androidx.compose.foundation.text.input.a.b(this.sessionSdkVersion, androidx.compose.foundation.text.input.a.b(this.deviceModel, this.appId.hashCode() * 31, 31), 31), 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ApplicationInfo(appId=" + this.appId + ", deviceModel=" + this.deviceModel + ", sessionSdkVersion=" + this.sessionSdkVersion + ", osVersion=" + this.osVersion + ", logEnvironment=" + this.logEnvironment + ", androidAppInfo=" + this.androidAppInfo + ')';
    }
}
