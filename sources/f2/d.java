package f2;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class d extends u {
    public boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f17587b;

    public d(ViewGroup viewGroup) {
        this.f17587b = viewGroup;
    }

    @Override // f2.u, f2.r
    public final void a() {
        com.facebook.appevents.i.g(this.f17587b, false);
    }

    @Override // f2.u, f2.r
    public final void c(t tVar) {
        com.facebook.appevents.i.g(this.f17587b, false);
        this.a = true;
    }

    @Override // f2.u, f2.r
    public final void d() {
        com.facebook.appevents.i.g(this.f17587b, true);
    }

    @Override // f2.r
    public final void f(t tVar) {
        if (!this.a) {
            com.facebook.appevents.i.g(this.f17587b, false);
        }
        tVar.z(this);
    }
}
