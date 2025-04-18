package w0;

/* loaded from: classes2.dex */
public final class j extends h {
    static {
        new h(1L, 0L);
    }

    public final boolean b(long j2) {
        return this.f31412a <= j2 && j2 <= this.f31413b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r4.f31412a > r4.f31413b) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof w0.j
            if (r0 == 0) goto L28
            long r0 = r9.f31412a
            long r2 = r9.f31413b
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L18
            r4 = r10
            w0.j r4 = (w0.j) r4
            long r5 = r4.f31412a
            long r7 = r4.f31413b
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L18
            goto L26
        L18:
            w0.j r10 = (w0.j) r10
            long r4 = r10.f31412a
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L28
            long r0 = r10.f31413b
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 != 0) goto L28
        L26:
            r10 = 1
            goto L29
        L28:
            r10 = 0
        L29:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.j.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long j2 = this.f31412a;
        long j3 = this.f31413b;
        if (j2 > j3) {
            return -1;
        }
        return (int) ((31 * (j2 ^ (j2 >>> 32))) + ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        return this.f31412a + ".." + this.f31413b;
    }
}
