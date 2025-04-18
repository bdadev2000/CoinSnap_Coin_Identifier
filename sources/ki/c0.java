package ki;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements k0 {

    /* renamed from: b, reason: collision with root package name */
    public final k f20956b;

    /* renamed from: c, reason: collision with root package name */
    public final i f20957c;

    /* renamed from: d, reason: collision with root package name */
    public f0 f20958d;

    /* renamed from: f, reason: collision with root package name */
    public int f20959f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20960g;

    /* renamed from: h, reason: collision with root package name */
    public long f20961h;

    public c0(k upstream) {
        int i10;
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f20956b = upstream;
        i y4 = upstream.y();
        this.f20957c = y4;
        f0 f0Var = y4.f20993b;
        this.f20958d = f0Var;
        if (f0Var != null) {
            i10 = f0Var.f20979b;
        } else {
            i10 = -1;
        }
        this.f20959f = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20960g = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r5 == r7.f20979b) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    @Override // ki.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long read(ki.i r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto Lf
            r5 = r4
            goto L10
        Lf:
            r5 = r3
        L10:
            if (r5 == 0) goto L81
            boolean r5 = r8.f20960g
            r5 = r5 ^ r4
            if (r5 == 0) goto L75
            ki.f0 r5 = r8.f20958d
            ki.i r6 = r8.f20957c
            if (r5 == 0) goto L2a
            ki.f0 r7 = r6.f20993b
            if (r5 != r7) goto L2b
            int r5 = r8.f20959f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            int r7 = r7.f20979b
            if (r5 != r7) goto L2b
        L2a:
            r3 = r4
        L2b:
            if (r3 == 0) goto L69
            if (r2 != 0) goto L30
            return r0
        L30:
            long r0 = r8.f20961h
            r2 = 1
            long r0 = r0 + r2
            ki.k r2 = r8.f20956b
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            ki.f0 r0 = r8.f20958d
            if (r0 != 0) goto L51
            ki.f0 r0 = r6.f20993b
            if (r0 == 0) goto L51
            r8.f20958d = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.f20979b
            r8.f20959f = r0
        L51:
            long r0 = r6.f20994c
            long r2 = r8.f20961h
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            ki.i r2 = r8.f20957c
            long r3 = r8.f20961h
            r5 = r10
            r7 = r9
            r2.j(r3, r5, r7)
            long r0 = r8.f20961h
            long r0 = r0 + r10
            r8.f20961h = r0
            return r10
        L69:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L75:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L81:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.c0.read(ki.i, long):long");
    }

    @Override // ki.k0
    public final m0 timeout() {
        return this.f20956b.timeout();
    }
}
