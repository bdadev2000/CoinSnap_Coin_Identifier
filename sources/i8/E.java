package i8;

/* loaded from: classes3.dex */
public final class E extends G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f20761a;
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f20762c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20763d;

    public E(x xVar, byte[] bArr, int i9, int i10) {
        this.f20761a = xVar;
        this.b = i9;
        this.f20762c = bArr;
        this.f20763d = i10;
    }

    @Override // i8.G
    public final long contentLength() {
        return this.b;
    }

    @Override // i8.G
    public final x contentType() {
        return this.f20761a;
    }

    @Override // i8.G
    public final void writeTo(w8.g gVar) {
        gVar.B(this.f20763d, this.b, this.f20762c);
    }
}
