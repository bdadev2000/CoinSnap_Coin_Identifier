package e1;

/* loaded from: classes.dex */
public final class c extends f1.g {
    public final q0.p d;

    /* renamed from: f, reason: collision with root package name */
    public final q0.p f30238f;

    public c(q0.p pVar, h0.l lVar, int i2, int i3) {
        super(lVar, i2, i3);
        this.d = pVar;
        this.f30238f = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // f1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(d1.q r6, h0.g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof e1.b
            if (r0 == 0) goto L13
            r0 = r7
            e1.b r0 = (e1.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            e1.b r0 = new e1.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f30233b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            d0.b0 r3 = d0.b0.f30125a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            d1.q r6 = r0.f30232a
            kotlin.jvm.internal.q.m(r7)
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.jvm.internal.q.m(r7)
            r0.f30232a = r6
            r0.d = r4
            q0.p r7 = r5.d
            java.lang.Object r7 = r7.invoke(r6, r0)
            if (r7 != r1) goto L43
            goto L44
        L43:
            r7 = r3
        L44:
            if (r7 != r1) goto L47
            return r1
        L47:
            d1.p r6 = (d1.p) r6
            d1.f r6 = r6.d
            boolean r6 = r6.k()
            if (r6 == 0) goto L52
            return r3
        L52:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.c.c(d1.q, h0.g):java.lang.Object");
    }

    @Override // f1.g
    public final f1.g d(h0.l lVar, int i2, int i3) {
        return new c(this.f30238f, lVar, i2, i3);
    }

    @Override // f1.g
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }
}
