package w8;

/* loaded from: classes3.dex */
public final class r implements y {
    public final h b;

    /* renamed from: c, reason: collision with root package name */
    public final f f24032c;

    /* renamed from: d, reason: collision with root package name */
    public u f24033d;

    /* renamed from: f, reason: collision with root package name */
    public int f24034f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24035g;

    /* renamed from: h, reason: collision with root package name */
    public long f24036h;

    public r(h hVar) {
        int i9;
        G7.j.e(hVar, "upstream");
        this.b = hVar;
        f y4 = hVar.y();
        this.f24032c = y4;
        u uVar = y4.b;
        this.f24033d = uVar;
        if (uVar == null) {
            i9 = -1;
        } else {
            i9 = uVar.b;
        }
        this.f24034f = i9;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24035g = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // w8.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long read(w8.f r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            G7.j.e(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L76
            boolean r3 = r8.f24035g
            r3 = r3 ^ 1
            if (r3 == 0) goto L6a
            w8.u r3 = r8.f24033d
            w8.f r4 = r8.f24032c
            if (r3 == 0) goto L31
            w8.u r5 = r4.b
            if (r3 != r5) goto L25
            int r3 = r8.f24034f
            G7.j.b(r5)
            int r5 = r5.b
            if (r3 != r5) goto L25
            goto L31
        L25:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L31:
            if (r2 != 0) goto L34
            return r0
        L34:
            long r0 = r8.f24036h
            r2 = 1
            long r0 = r0 + r2
            w8.h r2 = r8.b
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L44
            r9 = -1
            return r9
        L44:
            w8.u r0 = r8.f24033d
            if (r0 != 0) goto L52
            w8.u r0 = r4.b
            if (r0 == 0) goto L52
            r8.f24033d = r0
            int r0 = r0.b
            r8.f24034f = r0
        L52:
            long r0 = r4.f24014c
            long r2 = r8.f24036h
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            w8.f r2 = r8.f24032c
            long r4 = r8.f24036h
            r3 = r9
            r6 = r10
            r2.b(r3, r4, r6)
            long r0 = r8.f24036h
            long r0 = r0 + r10
            r8.f24036h = r0
            return r10
        L6a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L76:
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            java.lang.String r10 = "byteCount < 0: "
            java.lang.String r9 = G7.j.j(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.r.read(w8.f, long):long");
    }

    @Override // w8.y
    public final A timeout() {
        return this.b.timeout();
    }
}
