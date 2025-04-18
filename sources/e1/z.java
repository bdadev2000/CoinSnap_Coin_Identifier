package e1;

/* loaded from: classes2.dex */
public final class z implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b0 f30371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f30372b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.p f30373c;

    public z(kotlin.jvm.internal.b0 b0Var, i iVar, q0.p pVar) {
        this.f30371a = b0Var;
        this.f30372b = iVar;
        this.f30373c = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // e1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r8, h0.g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof e1.y
            if (r0 == 0) goto L13
            r0 = r9
            e1.y r0 = (e1.y) r0
            int r1 = r0.f30370f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30370f = r1
            goto L18
        L13:
            e1.y r0 = new e1.y
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f30369c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f30370f
            d0.b0 r3 = d0.b0.f30125a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L43
            if (r2 == r6) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            kotlin.jvm.internal.q.m(r9)
            goto L84
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.f30368b
            e1.z r2 = r0.f30367a
            kotlin.jvm.internal.q.m(r9)
            goto L68
        L3f:
            kotlin.jvm.internal.q.m(r9)
            goto L57
        L43:
            kotlin.jvm.internal.q.m(r9)
            kotlin.jvm.internal.b0 r9 = r7.f30371a
            boolean r9 = r9.f30919a
            if (r9 == 0) goto L58
            r0.f30370f = r6
            e1.i r9 = r7.f30372b
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            return r3
        L58:
            r0.f30367a = r7
            r0.f30368b = r8
            r0.f30370f = r5
            q0.p r9 = r7.f30373c
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r1) goto L67
            return r1
        L67:
            r2 = r7
        L68:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L84
            kotlin.jvm.internal.b0 r9 = r2.f30371a
            r9.f30919a = r6
            r9 = 0
            r0.f30367a = r9
            r0.f30368b = r9
            r0.f30370f = r4
            e1.i r9 = r2.f30372b
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L84
            return r1
        L84:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.z.emit(java.lang.Object, h0.g):java.lang.Object");
    }
}
