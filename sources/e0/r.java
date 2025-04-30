package e0;

import y7.AbstractC2960i;

/* loaded from: classes.dex */
public final class r extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public int f19986g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f19987h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ G f19988i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(G g9, w7.f fVar) {
        super(2, fVar);
        this.f19988i = g9;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        r rVar = new r(this.f19988i, fVar);
        rVar.f19987h = obj;
        return rVar;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((r) c((o) obj, (w7.f) obj2)).i(t7.y.f23029a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r7 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r7 == r0) goto L31;
     */
    @Override // y7.AbstractC2952a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.Object r7) {
        /*
            r6 = this;
            x7.a r0 = x7.EnumC2928a.b
            int r1 = r6.f19986g
            t7.y r2 = t7.y.f23029a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 != r3) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            t7.AbstractC2712a.f(r7)
            goto L7c
        L1b:
            t7.AbstractC2712a.f(r7)
            java.lang.Object r7 = r6.f19987h
            e0.o r7 = (e0.o) r7
            boolean r1 = r7 instanceof e0.m
            e0.G r5 = r6.f19988i
            if (r1 == 0) goto L6d
            e0.m r7 = (e0.m) r7
            r6.f19986g = r4
            T7.r r1 = r5.f19958g
            java.lang.Object r1 = r1.getValue()
            e0.H r1 = (e0.H) r1
            boolean r3 = r1 instanceof e0.C2202c
            if (r3 == 0) goto L39
            goto L5d
        L39:
            boolean r3 = r1 instanceof e0.k
            if (r3 == 0) goto L4a
            e0.H r7 = r7.f19982a
            if (r1 != r7) goto L48
            java.lang.Object r7 = r5.f(r6)
            if (r7 != r0) goto L48
            goto L5e
        L48:
            r7 = r2
            goto L5e
        L4a:
            e0.I r7 = e0.I.f19961a
            boolean r7 = G7.j.a(r1, r7)
            if (r7 == 0) goto L59
            java.lang.Object r7 = r5.f(r6)
            if (r7 != r0) goto L48
            goto L5e
        L59:
            boolean r7 = r1 instanceof e0.j
            if (r7 != 0) goto L61
        L5d:
            goto L48
        L5e:
            if (r7 != r0) goto L7c
            return r0
        L61:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't read in final state."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L6d:
            boolean r1 = r7 instanceof e0.n
            if (r1 == 0) goto L7c
            e0.n r7 = (e0.n) r7
            r6.f19986g = r3
            java.lang.Object r7 = e0.G.b(r5, r7, r6)
            if (r7 != r0) goto L7c
            return r0
        L7c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.r.i(java.lang.Object):java.lang.Object");
    }
}
