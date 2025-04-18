package e1;

/* loaded from: classes2.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30287a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30288b;

    public j() {
        v0 v0Var = v0.f30355a;
        this.f30287a = 0;
        this.f30288b = v0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    @Override // e1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(e1.i r8, h0.g r9) {
        /*
            r7 = this;
            d0.b0 r0 = d0.b0.f30125a
            int r1 = r7.f30287a
            java.lang.Object r2 = r7.f30288b
            switch(r1) {
                case 0: goto L69;
                default: goto L9;
            }
        L9:
            boolean r1 = r9 instanceof e1.a
            if (r1 == 0) goto L1c
            r1 = r9
            e1.a r1 = (e1.a) r1
            int r3 = r1.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1c
            int r3 = r3 - r4
            r1.d = r3
            goto L21
        L1c:
            e1.a r1 = new e1.a
            r1.<init>(r7, r9)
        L21:
            java.lang.Object r9 = r1.f30224b
            i0.a r3 = i0.a.f30806a
            int r4 = r1.d
            r5 = 1
            if (r4 == 0) goto L3c
            if (r4 != r5) goto L34
            f1.w r8 = r1.f30223a
            kotlin.jvm.internal.q.m(r9)     // Catch: java.lang.Throwable -> L32
            goto L5b
        L32:
            r9 = move-exception
            goto L65
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            kotlin.jvm.internal.q.m(r9)
            f1.w r9 = new f1.w
            h0.l r4 = r1.getContext()
            r9.<init>(r8, r4)
            r1.f30223a = r9     // Catch: java.lang.Throwable -> L63
            r1.d = r5     // Catch: java.lang.Throwable -> L63
            q0.p r2 = (q0.p) r2     // Catch: java.lang.Throwable -> L63
            java.lang.Object r8 = r2.invoke(r9, r1)     // Catch: java.lang.Throwable -> L63
            if (r8 != r3) goto L55
            goto L56
        L55:
            r8 = r0
        L56:
            if (r8 != r3) goto L5a
            r0 = r3
            goto L5e
        L5a:
            r8 = r9
        L5b:
            r8.releaseIntercepted()
        L5e:
            return r0
        L5f:
            r6 = r9
            r9 = r8
            r8 = r6
            goto L65
        L63:
            r8 = move-exception
            goto L5f
        L65:
            r8.releaseIntercepted()
            throw r9
        L69:
            java.lang.Object r8 = r8.emit(r2, r9)
            i0.a r9 = i0.a.f30806a
            if (r8 != r9) goto L72
            r0 = r8
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.j.collect(e1.i, h0.g):java.lang.Object");
    }

    public j(q0.p pVar) {
        this.f30287a = 1;
        this.f30288b = pVar;
    }
}
