package s7;

/* loaded from: classes3.dex */
public final class z2 implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final z2 f24896c;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.common.collect.r0 f24897b;

    static {
        com.google.common.collect.n0 n0Var = com.google.common.collect.r0.f12026c;
        f24896c = new z2(com.google.common.collect.z1.f12062g);
        n9.h0.E(0);
    }

    public z2(com.google.common.collect.r0 r0Var) {
        this.f24897b = com.google.common.collect.r0.i(r0Var);
    }

    public final boolean a(int i10) {
        boolean z10;
        int i11 = 0;
        while (true) {
            com.google.common.collect.r0 r0Var = this.f24897b;
            if (i11 >= r0Var.size()) {
                return false;
            }
            y2 y2Var = (y2) r0Var.get(i11);
            boolean[] zArr = y2Var.f24889g;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    if (zArr[i12]) {
                        z10 = true;
                        break;
                    }
                    i12++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10 && y2Var.f24886c.f26165d == i10) {
                return true;
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z2.class == obj.getClass()) {
            return this.f24897b.equals(((z2) obj).f24897b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24897b.hashCode();
    }
}
