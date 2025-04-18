package qc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h0 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23813b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23814c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23815d;

    public h0(String sessionId, String firstSessionId, int i10, long j3) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        this.a = sessionId;
        this.f23813b = firstSessionId;
        this.f23814c = i10;
        this.f23815d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.areEqual(this.a, h0Var.a) && Intrinsics.areEqual(this.f23813b, h0Var.f23813b) && this.f23814c == h0Var.f23814c && this.f23815d == h0Var.f23815d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23815d) + kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.e(this.f23814c, vd.e.c(this.f23813b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.f23813b + ", sessionIndex=" + this.f23814c + ", sessionStartTimestampUs=" + this.f23815d + ')';
    }
}
