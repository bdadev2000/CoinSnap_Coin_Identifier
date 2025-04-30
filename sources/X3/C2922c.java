package x3;

import android.animation.TimeInterpolator;
import x0.AbstractC2914a;

/* renamed from: x3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2922c {

    /* renamed from: a, reason: collision with root package name */
    public long f24230a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f24231c;

    /* renamed from: d, reason: collision with root package name */
    public int f24232d;

    /* renamed from: e, reason: collision with root package name */
    public int f24233e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f24231c;
        if (timeInterpolator == null) {
            return AbstractC2920a.b;
        }
        return timeInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2922c)) {
            return false;
        }
        C2922c c2922c = (C2922c) obj;
        if (this.f24230a != c2922c.f24230a || this.b != c2922c.b || this.f24232d != c2922c.f24232d || this.f24233e != c2922c.f24233e) {
            return false;
        }
        return a().getClass().equals(c2922c.a().getClass());
    }

    public final int hashCode() {
        long j7 = this.f24230a;
        long j9 = this.b;
        return ((((a().getClass().hashCode() + (((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) ((j9 >>> 32) ^ j9))) * 31)) * 31) + this.f24232d) * 31) + this.f24233e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C2922c.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f24230a);
        sb.append(" duration: ");
        sb.append(this.b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f24232d);
        sb.append(" repeatMode: ");
        return AbstractC2914a.g(sb, this.f24233e, "}\n");
    }
}
