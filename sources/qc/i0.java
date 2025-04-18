package qc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i0 {
    public final m a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f23821b;

    /* renamed from: c, reason: collision with root package name */
    public final b f23822c;

    public i0(q0 sessionData, b applicationInfo) {
        m eventType = m.SESSION_START;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        this.a = eventType;
        this.f23821b = sessionData;
        this.f23822c = applicationInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.a == i0Var.a && Intrinsics.areEqual(this.f23821b, i0Var.f23821b) && Intrinsics.areEqual(this.f23822c, i0Var.f23822c);
    }

    public final int hashCode() {
        return this.f23822c.hashCode() + ((this.f23821b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + this.a + ", sessionData=" + this.f23821b + ", applicationInfo=" + this.f23822c + ')';
    }
}
