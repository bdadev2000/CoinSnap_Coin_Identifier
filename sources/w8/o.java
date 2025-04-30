package w8;

import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public final class o implements y {
    public final h b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f24027c;

    /* renamed from: d, reason: collision with root package name */
    public int f24028d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24029f;

    public o(t tVar, Inflater inflater) {
        this.b = tVar;
        this.f24027c = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f24029f) {
            return;
        }
        this.f24027c.end();
        this.f24029f = true;
        this.b.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[SYNTHETIC] */
    @Override // w8.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long read(w8.f r11, long r12) {
        /*
            r10 = this;
            java.lang.String r0 = "sink"
            G7.j.e(r11, r0)
        L5:
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto Lbd
            boolean r3 = r10.f24029f
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto Lb1
            w8.h r3 = r10.b
            java.util.zip.Inflater r5 = r10.f24027c
            if (r2 != 0) goto L1a
        L17:
            r8 = r0
            goto L86
        L1a:
            w8.u r2 = r11.k(r4)     // Catch: java.util.zip.DataFormatException -> L74
            int r4 = r2.f24042c     // Catch: java.util.zip.DataFormatException -> L74
            int r4 = 8192 - r4
            long r6 = (long) r4     // Catch: java.util.zip.DataFormatException -> L74
            long r6 = java.lang.Math.min(r12, r6)     // Catch: java.util.zip.DataFormatException -> L74
            int r4 = (int) r6     // Catch: java.util.zip.DataFormatException -> L74
            boolean r6 = r5.needsInput()     // Catch: java.util.zip.DataFormatException -> L74
            if (r6 != 0) goto L2f
            goto L4b
        L2f:
            boolean r6 = r3.exhausted()     // Catch: java.util.zip.DataFormatException -> L74
            if (r6 == 0) goto L36
            goto L4b
        L36:
            w8.f r6 = r3.y()     // Catch: java.util.zip.DataFormatException -> L74
            w8.u r6 = r6.b     // Catch: java.util.zip.DataFormatException -> L74
            G7.j.b(r6)     // Catch: java.util.zip.DataFormatException -> L74
            int r7 = r6.f24042c     // Catch: java.util.zip.DataFormatException -> L74
            int r8 = r6.b     // Catch: java.util.zip.DataFormatException -> L74
            int r7 = r7 - r8
            r10.f24028d = r7     // Catch: java.util.zip.DataFormatException -> L74
            byte[] r6 = r6.f24041a     // Catch: java.util.zip.DataFormatException -> L74
            r5.setInput(r6, r8, r7)     // Catch: java.util.zip.DataFormatException -> L74
        L4b:
            byte[] r6 = r2.f24041a     // Catch: java.util.zip.DataFormatException -> L74
            int r7 = r2.f24042c     // Catch: java.util.zip.DataFormatException -> L74
            int r4 = r5.inflate(r6, r7, r4)     // Catch: java.util.zip.DataFormatException -> L74
            int r6 = r10.f24028d     // Catch: java.util.zip.DataFormatException -> L74
            if (r6 != 0) goto L58
            goto L66
        L58:
            int r7 = r5.getRemaining()     // Catch: java.util.zip.DataFormatException -> L74
            int r6 = r6 - r7
            int r7 = r10.f24028d     // Catch: java.util.zip.DataFormatException -> L74
            int r7 = r7 - r6
            r10.f24028d = r7     // Catch: java.util.zip.DataFormatException -> L74
            long r6 = (long) r6     // Catch: java.util.zip.DataFormatException -> L74
            r3.skip(r6)     // Catch: java.util.zip.DataFormatException -> L74
        L66:
            if (r4 <= 0) goto L76
            int r6 = r2.f24042c     // Catch: java.util.zip.DataFormatException -> L74
            int r6 = r6 + r4
            r2.f24042c = r6     // Catch: java.util.zip.DataFormatException -> L74
            long r6 = r11.f24014c     // Catch: java.util.zip.DataFormatException -> L74
            long r8 = (long) r4     // Catch: java.util.zip.DataFormatException -> L74
            long r6 = r6 + r8
            r11.f24014c = r6     // Catch: java.util.zip.DataFormatException -> L74
            goto L86
        L74:
            r11 = move-exception
            goto Lab
        L76:
            int r4 = r2.b     // Catch: java.util.zip.DataFormatException -> L74
            int r6 = r2.f24042c     // Catch: java.util.zip.DataFormatException -> L74
            if (r4 != r6) goto L17
            w8.u r4 = r2.a()     // Catch: java.util.zip.DataFormatException -> L74
            r11.b = r4     // Catch: java.util.zip.DataFormatException -> L74
            w8.v.a(r2)     // Catch: java.util.zip.DataFormatException -> L74
            goto L17
        L86:
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8b
            return r8
        L8b:
            boolean r0 = r5.finished()
            if (r0 != 0) goto La8
            boolean r0 = r5.needsDictionary()
            if (r0 == 0) goto L98
            goto La8
        L98:
            boolean r0 = r3.exhausted()
            if (r0 != 0) goto La0
            goto L5
        La0:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r12 = "source exhausted prematurely"
            r11.<init>(r12)
            throw r11
        La8:
            r11 = -1
            return r11
        Lab:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r11)
            throw r12
        Lb1:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "closed"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        Lbd:
            java.lang.Long r11 = java.lang.Long.valueOf(r12)
            java.lang.String r12 = "byteCount < 0: "
            java.lang.String r11 = G7.j.j(r11, r12)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.o.read(w8.f, long):long");
    }

    @Override // w8.y
    public final A timeout() {
        return this.b.timeout();
    }
}
