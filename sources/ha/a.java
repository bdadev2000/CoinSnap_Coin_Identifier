package ha;

import android.graphics.Typeface;
import y7.u;

/* loaded from: classes3.dex */
public final class a extends p6.a {

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f18982f;

    /* renamed from: g, reason: collision with root package name */
    public final u f18983g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18984h;

    public a(u uVar, Typeface typeface) {
        this.f18982f = typeface;
        this.f18983g = uVar;
    }

    @Override // p6.a
    public final void n(int i10) {
        if (!this.f18984h) {
            ea.b bVar = (ea.b) this.f18983g.f28007b;
            if (bVar.k(this.f18982f)) {
                bVar.i(false);
            }
        }
    }

    @Override // p6.a
    public final void o(Typeface typeface, boolean z10) {
        if (!this.f18984h) {
            ea.b bVar = (ea.b) this.f18983g.f28007b;
            if (bVar.k(typeface)) {
                bVar.i(false);
            }
        }
    }
}
