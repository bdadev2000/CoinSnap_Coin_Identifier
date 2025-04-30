package J4;

/* loaded from: classes2.dex */
public final class h implements G4.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1586a = false;
    public boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    public G4.c f1587c;

    /* renamed from: d, reason: collision with root package name */
    public final f f1588d;

    public h(f fVar) {
        this.f1588d = fVar;
    }

    @Override // G4.g
    public final G4.g f(String str) {
        if (!this.f1586a) {
            this.f1586a = true;
            this.f1588d.h(this.f1587c, str, this.b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // G4.g
    public final G4.g g(boolean z8) {
        if (!this.f1586a) {
            this.f1586a = true;
            this.f1588d.g(this.f1587c, z8 ? 1 : 0, this.b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}
