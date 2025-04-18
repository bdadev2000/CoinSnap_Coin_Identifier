package e1;

/* loaded from: classes2.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30258a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30259b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30260c;
    public final Object d;

    public f(g gVar, kotlin.jvm.internal.f0 f0Var, i iVar) {
        this.f30259b = gVar;
        this.f30260c = f0Var;
        this.d = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // e1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r10, h0.g r11) {
        /*
            r9 = this;
            d0.b0 r0 = d0.b0.f30125a
            int r1 = r9.f30258a
            java.lang.Object r2 = r9.f30260c
            java.lang.Object r3 = r9.d
            java.lang.Object r4 = r9.f30259b
            switch(r1) {
                case 0: goto L1b;
                default: goto Ld;
            }
        Ld:
            h0.l r4 = (h0.l) r4
            q0.p r3 = (q0.p) r3
            java.lang.Object r10 = e1.t0.E(r4, r10, r2, r3, r11)
            i0.a r11 = i0.a.f30806a
            if (r10 != r11) goto L1a
            r0 = r10
        L1a:
            return r0
        L1b:
            boolean r1 = r11 instanceof e1.e
            if (r1 == 0) goto L2e
            r1 = r11
            e1.e r1 = (e1.e) r1
            int r5 = r1.f30254c
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L2e
            int r5 = r5 - r6
            r1.f30254c = r5
            goto L33
        L2e:
            e1.e r1 = new e1.e
            r1.<init>(r9, r11)
        L33:
            java.lang.Object r11 = r1.f30252a
            i0.a r5 = i0.a.f30806a
            int r6 = r1.f30254c
            r7 = 1
            if (r6 == 0) goto L4a
            if (r6 != r7) goto L42
            kotlin.jvm.internal.q.m(r11)
            goto L78
        L42:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L4a:
            kotlin.jvm.internal.q.m(r11)
            e1.g r4 = (e1.g) r4
            q0.l r11 = r4.f30267b
            java.lang.Object r11 = r11.invoke(r10)
            kotlin.jvm.internal.f0 r2 = (kotlin.jvm.internal.f0) r2
            java.lang.Object r6 = r2.f30930a
            android.support.v4.media.session.i r8 = f1.c.f30458b
            if (r6 == r8) goto L6b
            q0.p r4 = r4.f30268c
            java.lang.Object r4 = r4.invoke(r6, r11)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L78
        L6b:
            r2.f30930a = r11
            e1.i r3 = (e1.i) r3
            r1.f30254c = r7
            java.lang.Object r10 = r3.emit(r10, r1)
            if (r10 != r5) goto L78
            r0 = r5
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.f.emit(java.lang.Object, h0.g):java.lang.Object");
    }

    public f(i iVar, h0.l lVar) {
        this.f30259b = lVar;
        this.f30260c = g1.a.d(lVar);
        this.d = new f1.d0(iVar, null);
    }
}
