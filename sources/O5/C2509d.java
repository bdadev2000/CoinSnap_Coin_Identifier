package o5;

import java.util.HashSet;
import java.util.Set;

/* renamed from: o5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2509d {

    /* renamed from: a, reason: collision with root package name */
    public final Set f21985a;

    public C2509d(HashSet hashSet) {
        this.f21985a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2509d) {
            return this.f21985a.equals(((C2509d) obj).f21985a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21985a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f21985a + "}";
    }
}
