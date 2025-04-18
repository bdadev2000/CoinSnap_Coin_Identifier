package e1;

/* loaded from: classes2.dex */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f30314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.q f30315b;

    public p(d dVar, q0.q qVar) {
        this.f30314a = dVar;
        this.f30315b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // e1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(e1.i r9, h0.g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof e1.o
            if (r0 == 0) goto L13
            r0 = r10
            e1.o r0 = (e1.o) r0
            int r1 = r0.f30310b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30310b = r1
            goto L18
        L13:
            e1.o r0 = new e1.o
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f30309a
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f30310b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.d
            f1.w r9 = (f1.w) r9
            kotlin.jvm.internal.q.m(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r10 = move-exception
            goto L86
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.d
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            kotlin.jvm.internal.q.m(r10)
            goto La0
        L44:
            e1.i r9 = r0.f30312f
            java.lang.Object r2 = r0.d
            e1.p r2 = (e1.p) r2
            kotlin.jvm.internal.q.m(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8c
        L50:
            kotlin.jvm.internal.q.m(r10)
            e1.h r10 = r8.f30314a     // Catch: java.lang.Throwable -> L8a
            r0.d = r8     // Catch: java.lang.Throwable -> L8a
            r0.f30312f = r9     // Catch: java.lang.Throwable -> L8a
            r0.f30310b = r5     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L8a
            if (r10 != r1) goto L62
            return r1
        L62:
            r2 = r8
        L63:
            f1.w r10 = new f1.w
            h0.l r4 = r0.getContext()
            r10.<init>(r9, r4)
            q0.q r9 = r2.f30315b     // Catch: java.lang.Throwable -> L82
            r0.d = r10     // Catch: java.lang.Throwable -> L82
            r0.f30312f = r6     // Catch: java.lang.Throwable -> L82
            r0.f30310b = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L82
            if (r9 != r1) goto L7b
            return r1
        L7b:
            r9 = r10
        L7c:
            r9.releaseIntercepted()
            d0.b0 r9 = d0.b0.f30125a
            return r9
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            r9.releaseIntercepted()
            throw r10
        L8a:
            r9 = move-exception
            r2 = r8
        L8c:
            e1.k1 r10 = new e1.k1
            r10.<init>(r9)
            q0.q r2 = r2.f30315b
            r0.d = r9
            r0.f30312f = r6
            r0.f30310b = r4
            java.lang.Object r10 = kotlin.jvm.internal.e.b(r10, r2, r9, r0)
            if (r10 != r1) goto La0
            return r1
        La0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.p.collect(e1.i, h0.g):java.lang.Object");
    }
}
