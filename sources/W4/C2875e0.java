package w4;

import x0.AbstractC2914a;

/* renamed from: w4.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2875e0 extends H0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23855a;

    public C2875e0(String str) {
        this.f23855a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H0) {
            return this.f23855a.equals(((C2875e0) ((H0) obj)).f23855a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23855a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC2914a.h(new StringBuilder("Log{content="), this.f23855a, "}");
    }
}
