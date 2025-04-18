package androidx.compose.runtime.internal;

import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class IntRef {

    /* renamed from: a, reason: collision with root package name */
    public int f14483a;

    public IntRef(int i2) {
        this.f14483a = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f14483a);
        sb.append(")@");
        int hashCode = hashCode();
        a.u(16);
        String num = Integer.toString(hashCode, 16);
        a.r(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }
}
