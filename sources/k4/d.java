package k4;

/* loaded from: classes.dex */
public final class d implements com.bumptech.glide.load.data.e {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f20224b;

    /* renamed from: c, reason: collision with root package name */
    public final c f20225c;

    public d(byte[] bArr, c cVar) {
        this.f20224b = bArr;
        this.f20225c = cVar;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f20225c.a();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final e4.a d() {
        return e4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        dVar.f(this.f20225c.l(this.f20224b));
    }
}
