package ha;

import android.graphics.Typeface;

/* loaded from: classes3.dex */
public final class b extends s.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p6.a f18985b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f18986c;

    public b(d dVar, p6.a aVar) {
        this.f18986c = dVar;
        this.f18985b = aVar;
    }

    @Override // s.a
    public final void n(int i10) {
        this.f18986c.f19003n = true;
        this.f18985b.n(i10);
    }

    @Override // s.a
    public final void o(Typeface typeface) {
        d dVar = this.f18986c;
        dVar.f19005p = Typeface.create(typeface, dVar.f18993d);
        dVar.f19003n = true;
        this.f18985b.o(dVar.f19005p, false);
    }
}
