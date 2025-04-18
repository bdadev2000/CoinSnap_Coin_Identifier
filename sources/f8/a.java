package f8;

/* loaded from: classes3.dex */
public final class a extends y7.g implements f {
    public a(long j3, long j10, u7.b bVar, boolean z10) {
        super(j3, j10, bVar.f25540f, bVar.f25537c, z10);
    }

    @Override // f8.f
    public final long c() {
        return -1L;
    }

    @Override // f8.f
    public final long getTimeUs(long j3) {
        return ((Math.max(0L, j3 - this.f27974b) * 8) * 1000000) / this.f27977e;
    }
}
