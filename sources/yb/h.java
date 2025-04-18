package yb;

/* loaded from: classes3.dex */
public final class h implements vb.g {
    public boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f28158b = false;

    /* renamed from: c, reason: collision with root package name */
    public vb.c f28159c;

    /* renamed from: d, reason: collision with root package name */
    public final f f28160d;

    public h(f fVar) {
        this.f28160d = fVar;
    }

    @Override // vb.g
    public final vb.g f(String str) {
        if (!this.a) {
            this.a = true;
            this.f28160d.f(this.f28159c, str, this.f28158b);
            return this;
        }
        throw new vb.b("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // vb.g
    public final vb.g g(boolean z10) {
        if (!this.a) {
            this.a = true;
            this.f28160d.h(this.f28159c, z10 ? 1 : 0, this.f28158b);
            return this;
        }
        throw new vb.b("Cannot encode a second value in the ValueEncoderContext");
    }
}
