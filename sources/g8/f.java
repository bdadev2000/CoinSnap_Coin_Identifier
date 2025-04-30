package g8;

/* loaded from: classes3.dex */
public final class f extends B3.e {

    /* renamed from: c, reason: collision with root package name */
    public final f8.b f20501c;

    /* renamed from: d, reason: collision with root package name */
    public int f20502d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(B3.g gVar, f8.b bVar) {
        super(gVar);
        G7.j.e(bVar, "json");
        this.f20501c = bVar;
    }

    @Override // B3.e
    public final void e() {
        this.f283a = true;
        this.f20502d++;
    }

    @Override // B3.e
    public final void g() {
        this.f283a = false;
        l("\n");
        int i9 = this.f20502d;
        for (int i10 = 0; i10 < i9; i10++) {
            l(this.f20501c.f20370a.f20390g);
        }
    }

    @Override // B3.e
    public final void p() {
        i(' ');
    }

    @Override // B3.e
    public final void q() {
        this.f20502d--;
    }
}
