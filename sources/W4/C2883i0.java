package w4;

import java.util.List;

/* renamed from: w4.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2883i0 extends K0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f23883a;

    public C2883i0(List list) {
        this.f23883a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof K0) {
            return this.f23883a.equals(((C2883i0) ((K0) obj)).f23883a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23883a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f23883a + "}";
    }
}
