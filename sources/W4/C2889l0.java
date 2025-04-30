package w4;

import x0.AbstractC2914a;

/* renamed from: w4.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2889l0 extends N0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23912a;

    public C2889l0(String str) {
        this.f23912a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof N0) {
            return this.f23912a.equals(((C2889l0) ((N0) obj)).f23912a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23912a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC2914a.h(new StringBuilder("User{identifier="), this.f23912a, "}");
    }
}
