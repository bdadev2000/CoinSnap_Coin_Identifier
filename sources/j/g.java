package j;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g extends c implements k.m {

    /* renamed from: d, reason: collision with root package name */
    public final Context f19662d;

    /* renamed from: f, reason: collision with root package name */
    public final ActionBarContextView f19663f;

    /* renamed from: g, reason: collision with root package name */
    public final b f19664g;

    /* renamed from: h, reason: collision with root package name */
    public WeakReference f19665h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19666i;

    /* renamed from: j, reason: collision with root package name */
    public final k.o f19667j;

    public g(Context context, ActionBarContextView actionBarContextView, b bVar) {
        this.f19662d = context;
        this.f19663f = actionBarContextView;
        this.f19664g = bVar;
        k.o oVar = new k.o(actionBarContextView.getContext());
        oVar.f20135l = 1;
        this.f19667j = oVar;
        oVar.f20128e = this;
    }

    @Override // j.c
    public final void a() {
        if (this.f19666i) {
            return;
        }
        this.f19666i = true;
        this.f19664g.a(this);
    }

    @Override // j.c
    public final View b() {
        WeakReference weakReference = this.f19665h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.c
    public final k.o c() {
        return this.f19667j;
    }

    @Override // j.c
    public final MenuInflater d() {
        return new k(this.f19663f.getContext());
    }

    @Override // k.m
    public final boolean e(k.o oVar, MenuItem menuItem) {
        return this.f19664g.b(this, menuItem);
    }

    @Override // j.c
    public final CharSequence f() {
        return this.f19663f.getSubtitle();
    }

    @Override // j.c
    public final CharSequence g() {
        return this.f19663f.getTitle();
    }

    @Override // j.c
    public final void h() {
        this.f19664g.g(this, this.f19667j);
    }

    @Override // j.c
    public final boolean i() {
        return this.f19663f.u;
    }

    @Override // k.m
    public final void j(k.o oVar) {
        h();
        androidx.appcompat.widget.m mVar = this.f19663f.f675f;
        if (mVar != null) {
            mVar.l();
        }
    }

    @Override // j.c
    public final void k(View view) {
        WeakReference weakReference;
        this.f19663f.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f19665h = weakReference;
    }

    @Override // j.c
    public final void l(int i10) {
        m(this.f19662d.getString(i10));
    }

    @Override // j.c
    public final void m(CharSequence charSequence) {
        this.f19663f.setSubtitle(charSequence);
    }

    @Override // j.c
    public final void n(int i10) {
        o(this.f19662d.getString(i10));
    }

    @Override // j.c
    public final void o(CharSequence charSequence) {
        this.f19663f.setTitle(charSequence);
    }

    @Override // j.c
    public final void p(boolean z10) {
        this.f19656c = z10;
        this.f19663f.setTitleOptional(z10);
    }
}
