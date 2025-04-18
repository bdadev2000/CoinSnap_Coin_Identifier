package qc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q0 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23858b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23859c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23860d;

    /* renamed from: e, reason: collision with root package name */
    public final j f23861e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23862f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23863g;

    public q0(String sessionId, String firstSessionId, int i10, long j3, j dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.a = sessionId;
        this.f23858b = firstSessionId;
        this.f23859c = i10;
        this.f23860d = j3;
        this.f23861e = dataCollectionStatus;
        this.f23862f = firebaseInstallationId;
        this.f23863g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.areEqual(this.a, q0Var.a) && Intrinsics.areEqual(this.f23858b, q0Var.f23858b) && this.f23859c == q0Var.f23859c && this.f23860d == q0Var.f23860d && Intrinsics.areEqual(this.f23861e, q0Var.f23861e) && Intrinsics.areEqual(this.f23862f, q0Var.f23862f) && Intrinsics.areEqual(this.f23863g, q0Var.f23863g);
    }

    public final int hashCode() {
        return this.f23863g.hashCode() + vd.e.c(this.f23862f, (this.f23861e.hashCode() + ((Long.hashCode(this.f23860d) + kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.e(this.f23859c, vd.e.c(this.f23858b, this.a.hashCode() * 31, 31), 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInfo(sessionId=");
        sb2.append(this.a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f23858b);
        sb2.append(", sessionIndex=");
        sb2.append(this.f23859c);
        sb2.append(", eventTimestampUs=");
        sb2.append(this.f23860d);
        sb2.append(", dataCollectionStatus=");
        sb2.append(this.f23861e);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f23862f);
        sb2.append(", firebaseAuthenticationToken=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.f23863g, ')');
    }
}
