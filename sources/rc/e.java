package rc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e {
    public final String a;

    public e(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return com.applovin.impl.mediation.ads.e.g(new StringBuilder("SessionDetails(sessionId="), this.a, ')');
    }
}
