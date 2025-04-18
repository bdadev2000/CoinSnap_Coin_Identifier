package com.google.firebase.sessions;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class AndroidApplicationInfo {

    @NotNull
    private final String appBuildVersion;

    @NotNull
    private final List<ProcessDetails> appProcessDetails;

    @NotNull
    private final ProcessDetails currentProcessDetails;

    @NotNull
    private final String deviceManufacturer;

    @NotNull
    private final String packageName;

    @NotNull
    private final String versionName;

    public AndroidApplicationInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull ProcessDetails processDetails, @NotNull List<ProcessDetails> list) {
        p0.a.s(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        p0.a.s(str2, "versionName");
        p0.a.s(str3, "appBuildVersion");
        p0.a.s(str4, "deviceManufacturer");
        p0.a.s(processDetails, "currentProcessDetails");
        p0.a.s(list, "appProcessDetails");
        this.packageName = str;
        this.versionName = str2;
        this.appBuildVersion = str3;
        this.deviceManufacturer = str4;
        this.currentProcessDetails = processDetails;
        this.appProcessDetails = list;
    }

    public static /* synthetic */ AndroidApplicationInfo copy$default(AndroidApplicationInfo androidApplicationInfo, String str, String str2, String str3, String str4, ProcessDetails processDetails, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = androidApplicationInfo.packageName;
        }
        if ((i2 & 2) != 0) {
            str2 = androidApplicationInfo.versionName;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = androidApplicationInfo.appBuildVersion;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = androidApplicationInfo.deviceManufacturer;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            processDetails = androidApplicationInfo.currentProcessDetails;
        }
        ProcessDetails processDetails2 = processDetails;
        if ((i2 & 32) != 0) {
            list = androidApplicationInfo.appProcessDetails;
        }
        return androidApplicationInfo.copy(str, str5, str6, str7, processDetails2, list);
    }

    @NotNull
    public final String component1() {
        return this.packageName;
    }

    @NotNull
    public final String component2() {
        return this.versionName;
    }

    @NotNull
    public final String component3() {
        return this.appBuildVersion;
    }

    @NotNull
    public final String component4() {
        return this.deviceManufacturer;
    }

    @NotNull
    public final ProcessDetails component5() {
        return this.currentProcessDetails;
    }

    @NotNull
    public final List<ProcessDetails> component6() {
        return this.appProcessDetails;
    }

    @NotNull
    public final AndroidApplicationInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull ProcessDetails processDetails, @NotNull List<ProcessDetails> list) {
        p0.a.s(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        p0.a.s(str2, "versionName");
        p0.a.s(str3, "appBuildVersion");
        p0.a.s(str4, "deviceManufacturer");
        p0.a.s(processDetails, "currentProcessDetails");
        p0.a.s(list, "appProcessDetails");
        return new AndroidApplicationInfo(str, str2, str3, str4, processDetails, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidApplicationInfo)) {
            return false;
        }
        AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) obj;
        return p0.a.g(this.packageName, androidApplicationInfo.packageName) && p0.a.g(this.versionName, androidApplicationInfo.versionName) && p0.a.g(this.appBuildVersion, androidApplicationInfo.appBuildVersion) && p0.a.g(this.deviceManufacturer, androidApplicationInfo.deviceManufacturer) && p0.a.g(this.currentProcessDetails, androidApplicationInfo.currentProcessDetails) && p0.a.g(this.appProcessDetails, androidApplicationInfo.appProcessDetails);
    }

    @NotNull
    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    @NotNull
    public final List<ProcessDetails> getAppProcessDetails() {
        return this.appProcessDetails;
    }

    @NotNull
    public final ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    @NotNull
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return this.appProcessDetails.hashCode() + ((this.currentProcessDetails.hashCode() + androidx.compose.foundation.text.input.a.b(this.deviceManufacturer, androidx.compose.foundation.text.input.a.b(this.appBuildVersion, androidx.compose.foundation.text.input.a.b(this.versionName, this.packageName.hashCode() * 31, 31), 31), 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.packageName + ", versionName=" + this.versionName + ", appBuildVersion=" + this.appBuildVersion + ", deviceManufacturer=" + this.deviceManufacturer + ", currentProcessDetails=" + this.currentProcessDetails + ", appProcessDetails=" + this.appProcessDetails + ')';
    }
}
