package e1;

/* loaded from: classes.dex */
public final class j0 extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f30290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f30291c;
    public final /* synthetic */ l0 d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f30292f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(y0 y0Var, h hVar, l0 l0Var, Object obj, h0.g gVar) {
        super(2, gVar);
        this.f30290b = y0Var;
        this.f30291c = hVar;
        this.d = l0Var;
        this.f30292f = obj;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new j0(this.f30290b, this.f30291c, this.d, this.f30292f, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((b1.d0) obj, (h0.g) obj2)).invokeSuspend(d0.b0.f30125a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (r6.f30268c == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v5, types: [j0.i, q0.p] */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r9.f30289a
            r2 = 4
            r3 = 3
            r4 = 1
            e1.h r5 = r9.f30291c
            r6 = 2
            e1.l0 r7 = r9.d
            if (r1 == 0) goto L28
            if (r1 == r4) goto L23
            if (r1 == r6) goto L1f
            if (r1 == r3) goto L23
            if (r1 != r2) goto L17
            goto L23
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            kotlin.jvm.internal.q.m(r10)
            goto L54
        L23:
            kotlin.jvm.internal.q.m(r10)
            goto L97
        L28:
            kotlin.jvm.internal.q.m(r10)
            e1.z0 r10 = e1.x0.f30365a
            e1.y0 r1 = r9.f30290b
            if (r1 != r10) goto L3a
            r9.f30289a = r4
            java.lang.Object r10 = r5.collect(r7, r9)
            if (r10 != r0) goto L97
            return r0
        L3a:
            e1.z0 r10 = e1.x0.f30366b
            r4 = 0
            if (r1 != r10) goto L5d
            r10 = r7
            f1.b r10 = (f1.b) r10
            f1.c0 r10 = r10.f()
            e1.h0 r1 = new e1.h0
            r1.<init>(r6, r4)
            r9.f30289a = r6
            java.lang.Object r10 = p0.a.f0(r10, r1, r9)
            if (r10 != r0) goto L54
            return r0
        L54:
            r9.f30289a = r3
            java.lang.Object r10 = r5.collect(r7, r9)
            if (r10 != r0) goto L97
            return r0
        L5d:
            r10 = r7
            f1.b r10 = (f1.b) r10
            f1.c0 r10 = r10.f()
            e1.h r10 = r1.a(r10)
            boolean r1 = r10 instanceof e1.g1
            if (r1 == 0) goto L6d
            goto L87
        L6d:
            e1.l r1 = e1.l.f30303a
            e1.m r3 = e1.m.f30304a
            boolean r6 = r10 instanceof e1.g
            if (r6 == 0) goto L81
            r6 = r10
            e1.g r6 = (e1.g) r6
            q0.l r8 = r6.f30267b
            if (r8 != r3) goto L81
            q0.p r3 = r6.f30268c
            if (r3 != r1) goto L81
            goto L87
        L81:
            e1.g r3 = new e1.g
            r3.<init>(r10, r1)
            r10 = r3
        L87:
            e1.i0 r1 = new e1.i0
            java.lang.Object r3 = r9.f30292f
            r1.<init>(r5, r7, r3, r4)
            r9.f30289a = r2
            java.lang.Object r10 = p0.a.D(r10, r1, r9)
            if (r10 != r0) goto L97
            return r0
        L97:
            d0.b0 r10 = d0.b0.f30125a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
