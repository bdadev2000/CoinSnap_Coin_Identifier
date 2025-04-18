package w0;

/* loaded from: classes2.dex */
public final class c extends a {
    static {
        new a((char) 1, (char) 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (p0.a.E(r2.f31398a, r2.f31399b) > 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof w0.c
            if (r0 == 0) goto L28
            char r0 = r4.f31398a
            char r1 = r4.f31399b
            int r2 = p0.a.E(r0, r1)
            if (r2 <= 0) goto L1c
            r2 = r5
            w0.c r2 = (w0.c) r2
            char r3 = r2.f31398a
            char r2 = r2.f31399b
            int r2 = p0.a.E(r3, r2)
            if (r2 <= 0) goto L1c
            goto L26
        L1c:
            w0.c r5 = (w0.c) r5
            char r2 = r5.f31398a
            if (r0 != r2) goto L28
            char r5 = r5.f31399b
            if (r1 != r5) goto L28
        L26:
            r5 = 1
            goto L29
        L28:
            r5 = 0
        L29:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        char c2 = this.f31398a;
        char c3 = this.f31399b;
        if (p0.a.E(c2, c3) > 0) {
            return -1;
        }
        return (c2 * 31) + c3;
    }

    public final String toString() {
        return this.f31398a + ".." + this.f31399b;
    }
}
