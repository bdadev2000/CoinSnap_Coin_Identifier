package e1;

/* loaded from: classes.dex */
public final class b1 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b0 f30236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f30237b;

    public b1(kotlin.jvm.internal.b0 b0Var, i iVar) {
        this.f30236a = b0Var;
        this.f30237b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r6, h0.g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof e1.a1
            if (r0 == 0) goto L13
            r0 = r7
            e1.a1 r0 = (e1.a1) r0
            int r1 = r0.f30231c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30231c = r1
            goto L18
        L13:
            e1.a1 r0 = new e1.a1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f30229a
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f30231c
            d0.b0 r3 = d0.b0.f30125a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.jvm.internal.q.m(r7)
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.jvm.internal.q.m(r7)
            if (r6 <= 0) goto L4b
            kotlin.jvm.internal.b0 r6 = r5.f30236a
            boolean r7 = r6.f30919a
            if (r7 != 0) goto L4b
            r6.f30919a = r4
            e1.v0 r6 = e1.v0.f30355a
            r0.f30231c = r4
            e1.i r7 = r5.f30237b
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.b1.a(int, h0.g):java.lang.Object");
    }

    @Override // e1.i
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h0.g gVar) {
        return a(((Number) obj).intValue(), gVar);
    }
}
