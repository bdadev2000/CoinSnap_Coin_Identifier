package k8;

/* loaded from: classes3.dex */
public final class h extends w7.i {

    /* renamed from: l, reason: collision with root package name */
    public long f20319l;

    /* renamed from: m, reason: collision with root package name */
    public int f20320m;

    /* renamed from: n, reason: collision with root package name */
    public int f20321n;

    public h() {
        super(2);
        this.f20321n = 32;
    }

    @Override // w7.i
    public final void e() {
        super.e();
        this.f20320m = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if ((r0.remaining() + r3.position()) > 3072000) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(w7.i r5) {
        /*
            r4 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r5.c(r0)
            r1 = 1
            r0 = r0 ^ r1
            v8.u0.d(r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            boolean r0 = r5.c(r0)
            r0 = r0 ^ r1
            v8.u0.d(r0)
            r0 = 4
            boolean r0 = r5.c(r0)
            r0 = r0 ^ r1
            v8.u0.d(r0)
            int r0 = r4.f20320m
            r2 = 0
            if (r0 <= 0) goto L25
            r3 = r1
            goto L26
        L25:
            r3 = r2
        L26:
            if (r3 != 0) goto L29
            goto L51
        L29:
            int r3 = r4.f20321n
            if (r0 < r3) goto L2e
            goto L4f
        L2e:
            boolean r0 = r5.d()
            boolean r3 = r4.d()
            if (r0 == r3) goto L39
            goto L4f
        L39:
            java.nio.ByteBuffer r0 = r5.f26890f
            if (r0 == 0) goto L51
            java.nio.ByteBuffer r3 = r4.f26890f
            if (r3 == 0) goto L51
            int r3 = r3.position()
            int r0 = r0.remaining()
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r3) goto L51
        L4f:
            r0 = r2
            goto L52
        L51:
            r0 = r1
        L52:
            if (r0 != 0) goto L55
            return r2
        L55:
            int r0 = r4.f20320m
            int r2 = r0 + 1
            r4.f20320m = r2
            if (r0 != 0) goto L69
            long r2 = r5.f26892h
            r4.f26892h = r2
            boolean r0 = r5.c(r1)
            if (r0 == 0) goto L69
            r4.f26867c = r1
        L69:
            boolean r0 = r5.d()
            if (r0 == 0) goto L73
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.f26867c = r0
        L73:
            java.nio.ByteBuffer r0 = r5.f26890f
            if (r0 == 0) goto L83
            int r2 = r0.remaining()
            r4.g(r2)
            java.nio.ByteBuffer r2 = r4.f26890f
            r2.put(r0)
        L83:
            long r2 = r5.f26892h
            r4.f20319l = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.h.i(w7.i):boolean");
    }
}
