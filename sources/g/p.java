package g;

import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class p implements s.a, r.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f30555a;

    @Override // s.a
    public void a() {
    }

    @Override // s.a
    public void b(Drawable drawable) {
        t tVar = this.f30555a;
        tVar.b(new j(drawable != null ? tVar.a(drawable) : null));
    }

    @Override // r.h
    public Object c(f.l lVar) {
        return p0.a.e0(new s(this.f30555a.f30565b, 0), lVar);
    }

    @Override // s.a
    public void onError() {
    }
}
