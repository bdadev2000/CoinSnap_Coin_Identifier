package qc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p {
    public final String a;

    public p(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.areEqual(this.a, ((p) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return com.applovin.impl.mediation.ads.e.g(new StringBuilder("FirebaseSessionsData(sessionId="), this.a, ')');
    }
}
