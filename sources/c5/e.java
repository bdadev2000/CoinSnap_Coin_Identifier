package C5;

/* loaded from: classes3.dex */
public final class e extends g {

    /* renamed from: c, reason: collision with root package name */
    public final short f565c;

    /* renamed from: d, reason: collision with root package name */
    public final short f566d;

    public e(g gVar, int i9, int i10) {
        super(gVar);
        this.f565c = (short) i9;
        this.f566d = (short) i10;
    }

    @Override // C5.g
    public final void a(D5.a aVar, byte[] bArr) {
        aVar.b(this.f565c, this.f566d);
    }

    public final String toString() {
        short s5 = this.f566d;
        return "<" + Integer.toBinaryString((1 << s5) | (((1 << s5) - 1) & this.f565c) | (1 << s5)).substring(1) + '>';
    }
}
