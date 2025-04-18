package b1;

/* loaded from: classes3.dex */
public final class k2 extends g1.y {

    /* renamed from: f, reason: collision with root package name */
    public final ThreadLocal f22336f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k2(h0.g r3, h0.l r4) {
        /*
            r2 = this;
            b1.l2 r0 = b1.l2.f22343a
            h0.j r1 = r4.i(r0)
            if (r1 != 0) goto Ld
            h0.l r0 = r4.u(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f22336f = r0
            h0.l r3 = r3.getContext()
            h0.h r0 = h0.h.f30725a
            h0.j r3 = r3.i(r0)
            boolean r3 = r3 instanceof b1.z
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = g1.a.e(r4, r3)
            g1.a.b(r4, r3)
            r2.q0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.k2.<init>(h0.g, h0.l):void");
    }

    public final boolean p0() {
        boolean z2 = this.threadLocalIsSet && this.f22336f.get() == null;
        this.f22336f.remove();
        return !z2;
    }

    public final void q0(h0.l lVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f22336f.set(new d0.k(lVar, obj));
    }

    @Override // g1.y, b1.r1
    public final void r(Object obj) {
        if (this.threadLocalIsSet) {
            d0.k kVar = (d0.k) this.f22336f.get();
            if (kVar != null) {
                g1.a.b((h0.l) kVar.f30134a, kVar.f30135b);
            }
            this.f22336f.remove();
        }
        Object x = kotlin.jvm.internal.e.x(obj);
        h0.g gVar = this.d;
        h0.l context = gVar.getContext();
        Object e = g1.a.e(context, null);
        k2 G0 = e != g1.a.f30591f ? p0.a.G0(gVar, context, e) : null;
        try {
            this.d.resumeWith(x);
        } finally {
            if (G0 == null || G0.p0()) {
                g1.a.b(context, e);
            }
        }
    }
}
