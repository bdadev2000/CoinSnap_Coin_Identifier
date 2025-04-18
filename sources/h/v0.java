package h;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class v0 extends j.c implements k.m {

    /* renamed from: d, reason: collision with root package name */
    public final Context f18670d;

    /* renamed from: f, reason: collision with root package name */
    public final k.o f18671f;

    /* renamed from: g, reason: collision with root package name */
    public j.b f18672g;

    /* renamed from: h, reason: collision with root package name */
    public WeakReference f18673h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w0 f18674i;

    public v0(w0 w0Var, Context context, w wVar) {
        this.f18674i = w0Var;
        this.f18670d = context;
        this.f18672g = wVar;
        k.o oVar = new k.o(context);
        oVar.f20135l = 1;
        this.f18671f = oVar;
        oVar.f20128e = this;
    }

    @Override // j.c
    public final void a() {
        w0 w0Var = this.f18674i;
        if (w0Var.f18686o != this) {
            return;
        }
        if (!(!w0Var.f18692v)) {
            w0Var.f18687p = this;
            w0Var.f18688q = this.f18672g;
        } else {
            this.f18672g.a(this);
        }
        this.f18672g = null;
        w0Var.E(false);
        ActionBarContextView actionBarContextView = w0Var.f18683l;
        if (actionBarContextView.f682m == null) {
            actionBarContextView.e();
        }
        w0Var.f18680i.setHideOnContentScrollEnabled(w0Var.A);
        w0Var.f18686o = null;
    }

    @Override // j.c
    public final View b() {
        WeakReference weakReference = this.f18673h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.c
    public final k.o c() {
        return this.f18671f;
    }

    @Override // j.c
    public final MenuInflater d() {
        return new j.k(this.f18670d);
    }

    @Override // k.m
    public final boolean e(k.o oVar, MenuItem menuItem) {
        j.b bVar = this.f18672g;
        if (bVar != null) {
            return bVar.b(this, menuItem);
        }
        return false;
    }

    @Override // j.c
    public final CharSequence f() {
        return this.f18674i.f18683l.getSubtitle();
    }

    @Override // j.c
    public final CharSequence g() {
        return this.f18674i.f18683l.getTitle();
    }

    @Override // j.c
    public final void h() {
        if (this.f18674i.f18686o != this) {
            return;
        }
        k.o oVar = this.f18671f;
        oVar.w();
        try {
            this.f18672g.g(this, oVar);
        } finally {
            oVar.v();
        }
    }

    @Override // j.c
    public final boolean i() {
        return this.f18674i.f18683l.u;
    }

    @Override // k.m
    public final void j(k.o oVar) {
        if (this.f18672g == null) {
            return;
        }
        h();
        androidx.appcompat.widget.m mVar = this.f18674i.f18683l.f675f;
        if (mVar != null) {
            mVar.l();
        }
    }

    @Override // j.c
    public final void k(View view) {
        this.f18674i.f18683l.setCustomView(view);
        this.f18673h = new WeakReference(view);
    }

    @Override // j.c
    public final void l(int i10) {
        m(this.f18674i.f18677f.getResources().getString(i10));
    }

    @Override // j.c
    public final void m(CharSequence charSequence) {
        this.f18674i.f18683l.setSubtitle(charSequence);
    }

    @Override // j.c
    public final void n(int i10) {
        o(this.f18674i.f18677f.getResources().getString(i10));
    }

    @Override // j.c
    public final void o(CharSequence charSequence) {
        this.f18674i.f18683l.setTitle(charSequence);
    }

    @Override // j.c
    public final void p(boolean z10) {
        this.f19656c = z10;
        this.f18674i.f18683l.setTitleOptional(z10);
    }
}
