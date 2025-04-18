package qc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23761b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23762c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23763d;

    /* renamed from: e, reason: collision with root package name */
    public final t f23764e;

    /* renamed from: f, reason: collision with root package name */
    public final a f23765f;

    public b(String appId, String deviceModel, String osVersion, a androidAppInfo) {
        t logEnvironment = t.LOG_ENVIRONMENT_PROD;
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter("2.0.6", "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        this.a = appId;
        this.f23761b = deviceModel;
        this.f23762c = "2.0.6";
        this.f23763d = osVersion;
        this.f23764e = logEnvironment;
        this.f23765f = androidAppInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.a, bVar.a) && Intrinsics.areEqual(this.f23761b, bVar.f23761b) && Intrinsics.areEqual(this.f23762c, bVar.f23762c) && Intrinsics.areEqual(this.f23763d, bVar.f23763d) && this.f23764e == bVar.f23764e && Intrinsics.areEqual(this.f23765f, bVar.f23765f);
    }

    public final int hashCode() {
        return this.f23765f.hashCode() + ((this.f23764e.hashCode() + vd.e.c(this.f23763d, vd.e.c(this.f23762c, vd.e.c(this.f23761b, this.a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + this.f23761b + ", sessionSdkVersion=" + this.f23762c + ", osVersion=" + this.f23763d + ", logEnvironment=" + this.f23764e + ", androidAppInfo=" + this.f23765f + ')';
    }
}
