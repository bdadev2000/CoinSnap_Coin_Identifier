package O3;

import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class b extends K.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.c f2160h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f2161i;

    public b(d dVar, com.bumptech.glide.c cVar) {
        this.f2161i = dVar;
        this.f2160h = cVar;
    }

    @Override // K.b
    public final void g(int i9) {
        this.f2161i.m = true;
        this.f2160h.P(i9);
    }

    @Override // K.b
    public final void h(Typeface typeface) {
        d dVar = this.f2161i;
        dVar.f2176n = Typeface.create(typeface, dVar.f2167c);
        dVar.m = true;
        this.f2160h.Q(dVar.f2176n, false);
    }
}
