package y7;

/* loaded from: classes3.dex */
public final class a implements x {
    public final c a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27937b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27938c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final long f27939d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27940e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27941f;

    /* renamed from: g, reason: collision with root package name */
    public final long f27942g;

    public a(c cVar, long j3, long j10, long j11, long j12, long j13) {
        this.a = cVar;
        this.f27937b = j3;
        this.f27939d = j10;
        this.f27940e = j11;
        this.f27941f = j12;
        this.f27942g = j13;
    }

    @Override // y7.x
    public final long getDurationUs() {
        return this.f27937b;
    }

    @Override // y7.x
    public final w getSeekPoints(long j3) {
        y yVar = new y(j3, b.a(this.a.a(j3), this.f27938c, this.f27939d, this.f27940e, this.f27941f, this.f27942g));
        return new w(yVar, yVar);
    }

    @Override // y7.x
    public final boolean isSeekable() {
        return true;
    }
}
