package ni;

/* loaded from: classes5.dex */
public final class a0 extends wh.y0 {

    /* renamed from: b, reason: collision with root package name */
    public final wh.g0 f22777b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22778c;

    public a0(wh.g0 g0Var, long j3) {
        this.f22777b = g0Var;
        this.f22778c = j3;
    }

    @Override // wh.y0
    public final long contentLength() {
        return this.f22778c;
    }

    @Override // wh.y0
    public final wh.g0 contentType() {
        return this.f22777b;
    }

    @Override // wh.y0
    public final ki.k source() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
