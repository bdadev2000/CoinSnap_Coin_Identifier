package s7;

/* loaded from: classes3.dex */
public final class p2 {

    /* renamed from: c, reason: collision with root package name */
    public static final p2 f24652c;
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24653b;

    static {
        p2 p2Var = new p2(0L, 0L);
        new p2(Long.MAX_VALUE, Long.MAX_VALUE);
        new p2(Long.MAX_VALUE, 0L);
        new p2(0L, Long.MAX_VALUE);
        f24652c = p2Var;
    }

    public p2(long j3, long j10) {
        boolean z10;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        v8.u0.d(z10);
        v8.u0.d(j10 >= 0);
        this.a = j3;
        this.f24653b = j10;
    }

    public final long a(long j3, long j10, long j11) {
        boolean z10;
        long j12 = this.a;
        long j13 = this.f24653b;
        if (j12 == 0 && j13 == 0) {
            return j3;
        }
        int i10 = n9.h0.a;
        long j14 = j3 - j12;
        if (((j12 ^ j3) & (j3 ^ j14)) < 0) {
            j14 = Long.MIN_VALUE;
        }
        long j15 = j3 + j13;
        if (((j13 ^ j15) & (j3 ^ j15)) < 0) {
            j15 = Long.MAX_VALUE;
        }
        boolean z11 = true;
        if (j14 <= j10 && j10 <= j15) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (j14 > j11 || j11 > j15) {
            z11 = false;
        }
        if (z10 && z11) {
            if (Math.abs(j10 - j3) <= Math.abs(j11 - j3)) {
                return j10;
            }
            return j11;
        }
        if (z10) {
            return j10;
        }
        if (z11) {
            return j11;
        }
        return j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p2.class != obj.getClass()) {
            return false;
        }
        p2 p2Var = (p2) obj;
        if (this.a == p2Var.a && this.f24653b == p2Var.f24653b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.f24653b);
    }
}
