package p8;

/* loaded from: classes3.dex */
public final class y implements w8.y {
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22488c;

    /* renamed from: d, reason: collision with root package name */
    public final w8.f f22489d;

    /* renamed from: f, reason: collision with root package name */
    public final w8.f f22490f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22491g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f22492h;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, w8.f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, w8.f] */
    public y(z zVar, long j7, boolean z8) {
        G7.j.e(zVar, "this$0");
        this.f22492h = zVar;
        this.b = j7;
        this.f22488c = z8;
        this.f22489d = new Object();
        this.f22490f = new Object();
    }

    public final void a(long j7) {
        byte[] bArr = j8.b.f21214a;
        this.f22492h.b.j(j7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j7;
        z zVar = this.f22492h;
        synchronized (zVar) {
            this.f22491g = true;
            w8.f fVar = this.f22490f;
            j7 = fVar.f24014c;
            fVar.skip(j7);
            zVar.notifyAll();
        }
        if (j7 > 0) {
            a(j7);
        }
        this.f22492h.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[LOOP:0: B:3:0x0010->B:39:0x0086, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089 A[SYNTHETIC] */
    @Override // w8.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long read(w8.f r16, long r17) {
        /*
            Method dump skipped, instructions count: 191
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.y.read(w8.f, long):long");
    }

    @Override // w8.y
    public final w8.A timeout() {
        return this.f22492h.f22502k;
    }
}
