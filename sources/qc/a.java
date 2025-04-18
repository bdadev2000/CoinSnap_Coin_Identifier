package qc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23753b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23754c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23755d;

    /* renamed from: e, reason: collision with root package name */
    public final u f23756e;

    /* renamed from: f, reason: collision with root package name */
    public final List f23757f;

    public a(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, u currentProcessDetails, ArrayList appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        this.a = packageName;
        this.f23753b = versionName;
        this.f23754c = appBuildVersion;
        this.f23755d = deviceManufacturer;
        this.f23756e = currentProcessDetails;
        this.f23757f = appProcessDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.f23753b, aVar.f23753b) && Intrinsics.areEqual(this.f23754c, aVar.f23754c) && Intrinsics.areEqual(this.f23755d, aVar.f23755d) && Intrinsics.areEqual(this.f23756e, aVar.f23756e) && Intrinsics.areEqual(this.f23757f, aVar.f23757f);
    }

    public final int hashCode() {
        return this.f23757f.hashCode() + ((this.f23756e.hashCode() + vd.e.c(this.f23755d, vd.e.c(this.f23754c, vd.e.c(this.f23753b, this.a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.f23753b + ", appBuildVersion=" + this.f23754c + ", deviceManufacturer=" + this.f23755d + ", currentProcessDetails=" + this.f23756e + ", appProcessDetails=" + this.f23757f + ')';
    }
}
