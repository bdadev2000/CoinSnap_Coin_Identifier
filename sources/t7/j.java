package T7;

import U7.x;

/* loaded from: classes3.dex */
public final class j implements c {
    public final /* synthetic */ int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3060c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3061d;

    /* renamed from: f, reason: collision with root package name */
    public final F7.p f3062f;

    public j(G7.p pVar, c cVar, F7.p pVar2) {
        this.f3060c = pVar;
        this.f3061d = cVar;
        this.f3062f = pVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    @Override // T7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r8, w7.f r9) {
        /*
            r7 = this;
            int r0 = r7.b
            switch(r0) {
                case 0: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f3060c
            w7.k r0 = (w7.k) r0
            java.lang.Object r1 = r7.f3061d
            F7.p r2 = r7.f3062f
            U7.x r2 = (U7.x) r2
            java.lang.Object r8 = U7.p.a(r0, r8, r1, r2, r9)
            x7.a r9 = x7.EnumC2928a.b
            if (r8 != r9) goto L18
            goto L1a
        L18:
            t7.y r8 = t7.y.f23029a
        L1a:
            return r8
        L1b:
            boolean r0 = r9 instanceof T7.i
            if (r0 == 0) goto L2e
            r0 = r9
            T7.i r0 = (T7.i) r0
            int r1 = r0.f3059j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L2e
            int r1 = r1 - r2
            r0.f3059j = r1
            goto L33
        L2e:
            T7.i r0 = new T7.i
            r0.<init>(r7, r9)
        L33:
            java.lang.Object r9 = r0.f3057h
            x7.a r1 = x7.EnumC2928a.b
            int r2 = r0.f3059j
            t7.y r3 = t7.y.f23029a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L5b
            if (r2 == r6) goto L57
            if (r2 == r5) goto L4f
            if (r2 != r4) goto L47
            goto L57
        L47:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4f:
            java.lang.Object r8 = r0.f3056g
            T7.j r2 = r0.f3055f
            t7.AbstractC2712a.f(r9)
            goto L85
        L57:
            t7.AbstractC2712a.f(r9)
            goto L73
        L5b:
            t7.AbstractC2712a.f(r9)
            java.lang.Object r9 = r7.f3060c
            G7.p r9 = (G7.p) r9
            boolean r9 = r9.b
            if (r9 == 0) goto L75
            r0.f3059j = r6
            java.lang.Object r9 = r7.f3061d
            T7.c r9 = (T7.c) r9
            java.lang.Object r8 = r9.a(r8, r0)
            if (r8 != r1) goto L73
            goto La4
        L73:
            r1 = r3
            goto La4
        L75:
            r0.f3055f = r7
            r0.f3056g = r8
            r0.f3059j = r5
            F7.p r9 = r7.f3062f
            java.lang.Object r9 = r9.g(r8, r0)
            if (r9 != r1) goto L84
            goto La4
        L84:
            r2 = r7
        L85:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L73
            java.lang.Object r9 = r2.f3060c
            G7.p r9 = (G7.p) r9
            r9.b = r6
            r9 = 0
            r0.f3055f = r9
            r0.f3056g = r9
            r0.f3059j = r4
            java.lang.Object r9 = r2.f3061d
            T7.c r9 = (T7.c) r9
            java.lang.Object r8 = r9.a(r8, r0)
            if (r8 != r1) goto L73
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T7.j.a(java.lang.Object, w7.f):java.lang.Object");
    }

    public j(c cVar, w7.k kVar) {
        this.f3060c = kVar;
        this.f3061d = V7.a.k(kVar);
        this.f3062f = new x(cVar, null);
    }
}
