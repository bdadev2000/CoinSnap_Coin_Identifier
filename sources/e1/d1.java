package e1;

/* loaded from: classes.dex */
public final class d1 extends j0.i implements q0.q {

    /* renamed from: a, reason: collision with root package name */
    public int f30249a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ i f30250b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f30251c;
    public final /* synthetic */ f1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var, h0.g gVar) {
        super(3, gVar);
        this.d = f1Var;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        d1 d1Var = new d1(this.d, (h0.g) obj3);
        d1Var.f30250b = (i) obj;
        d1Var.f30251c = intValue;
        return d1Var.invokeSuspend(d0.b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r10.f30249a
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            e1.f1 r7 = r10.d
            if (r1 == 0) goto L36
            if (r1 == r6) goto L32
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L26
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            goto L32
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            e1.i r1 = r10.f30250b
            kotlin.jvm.internal.q.m(r11)
            goto L79
        L26:
            e1.i r1 = r10.f30250b
            kotlin.jvm.internal.q.m(r11)
            goto L6c
        L2c:
            e1.i r1 = r10.f30250b
            kotlin.jvm.internal.q.m(r11)
            goto L57
        L32:
            kotlin.jvm.internal.q.m(r11)
            goto L87
        L36:
            kotlin.jvm.internal.q.m(r11)
            e1.i r1 = r10.f30250b
            int r11 = r10.f30251c
            if (r11 <= 0) goto L4a
            e1.v0 r11 = e1.v0.f30355a
            r10.f30249a = r6
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L87
            return r0
        L4a:
            long r8 = r7.f30264a
            r10.f30250b = r1
            r10.f30249a = r5
            java.lang.Object r11 = p0.a.L(r8, r10)
            if (r11 != r0) goto L57
            return r0
        L57:
            long r5 = r7.f30265b
            r8 = 0
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 <= 0) goto L79
            e1.v0 r11 = e1.v0.f30356b
            r10.f30250b = r1
            r10.f30249a = r4
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L6c
            return r0
        L6c:
            long r4 = r7.f30265b
            r10.f30250b = r1
            r10.f30249a = r3
            java.lang.Object r11 = p0.a.L(r4, r10)
            if (r11 != r0) goto L79
            return r0
        L79:
            e1.v0 r11 = e1.v0.f30357c
            r3 = 0
            r10.f30250b = r3
            r10.f30249a = r2
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L87
            return r0
        L87:
            d0.b0 r11 = d0.b0.f30125a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
