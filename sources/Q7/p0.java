package Q7;

import t7.C2720i;

/* loaded from: classes3.dex */
public final class p0 extends V7.t {

    /* renamed from: g, reason: collision with root package name */
    public final ThreadLocal f2578g;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p0(w7.f r3, w7.k r4) {
        /*
            r2 = this;
            Q7.q0 r0 = Q7.q0.b
            w7.i r1 = r4.h(r0)
            if (r1 != 0) goto Ld
            w7.k r0 = r4.n(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f2578g = r0
            w7.k r3 = r3.getContext()
            w7.g r0 = w7.g.b
            w7.i r3 = r3.h(r0)
            boolean r3 = r3 instanceof Q7.AbstractC0251t
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = V7.a.l(r4, r3)
            V7.a.g(r4, r3)
            r2.Z(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q7.p0.<init>(w7.f, w7.k):void");
    }

    public final boolean Y() {
        boolean z8;
        if (this.threadLocalIsSet && this.f2578g.get() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f2578g.remove();
        return !z8;
    }

    public final void Z(w7.k kVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f2578g.set(new C2720i(kVar, obj));
    }

    @Override // V7.t, Q7.d0
    public final void r(Object obj) {
        if (this.threadLocalIsSet) {
            C2720i c2720i = (C2720i) this.f2578g.get();
            if (c2720i != null) {
                V7.a.g((w7.k) c2720i.b, c2720i.f23021c);
            }
            this.f2578g.remove();
        }
        Object n2 = AbstractC0255x.n(obj);
        w7.f fVar = this.f3538f;
        w7.k context = fVar.getContext();
        p0 p0Var = null;
        Object l = V7.a.l(context, null);
        if (l != V7.a.f3508f) {
            p0Var = AbstractC0255x.r(fVar, context, l);
        }
        try {
            this.f3538f.e(n2);
        } finally {
            if (p0Var == null || p0Var.Y()) {
                V7.a.g(context, l);
            }
        }
    }
}
