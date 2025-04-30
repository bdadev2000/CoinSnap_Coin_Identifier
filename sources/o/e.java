package o;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p.InterfaceC2531j;
import p.MenuC2533l;
import q.C2605j;

/* loaded from: classes.dex */
public final class e extends b implements InterfaceC2531j {

    /* renamed from: d, reason: collision with root package name */
    public Context f21877d;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f21878f;

    /* renamed from: g, reason: collision with root package name */
    public a f21879g;

    /* renamed from: h, reason: collision with root package name */
    public WeakReference f21880h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21881i;

    /* renamed from: j, reason: collision with root package name */
    public MenuC2533l f21882j;

    @Override // o.b
    public final void a() {
        if (this.f21881i) {
            return;
        }
        this.f21881i = true;
        this.f21879g.g(this);
    }

    @Override // p.InterfaceC2531j
    public final boolean b(MenuC2533l menuC2533l, MenuItem menuItem) {
        return this.f21879g.a(this, menuItem);
    }

    @Override // o.b
    public final View c() {
        WeakReference weakReference = this.f21880h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // o.b
    public final MenuC2533l d() {
        return this.f21882j;
    }

    @Override // o.b
    public final MenuInflater e() {
        return new i(this.f21878f.getContext());
    }

    @Override // o.b
    public final CharSequence f() {
        return this.f21878f.getSubtitle();
    }

    @Override // p.InterfaceC2531j
    public final void g(MenuC2533l menuC2533l) {
        i();
        C2605j c2605j = this.f21878f.f4152f;
        if (c2605j != null) {
            c2605j.l();
        }
    }

    @Override // o.b
    public final CharSequence h() {
        return this.f21878f.getTitle();
    }

    @Override // o.b
    public final void i() {
        this.f21879g.d(this, this.f21882j);
    }

    @Override // o.b
    public final boolean j() {
        return this.f21878f.f4165u;
    }

    @Override // o.b
    public final void k(View view) {
        WeakReference weakReference;
        this.f21878f.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f21880h = weakReference;
    }

    @Override // o.b
    public final void l(int i9) {
        m(this.f21877d.getString(i9));
    }

    @Override // o.b
    public final void m(CharSequence charSequence) {
        this.f21878f.setSubtitle(charSequence);
    }

    @Override // o.b
    public final void n(int i9) {
        o(this.f21877d.getString(i9));
    }

    @Override // o.b
    public final void o(CharSequence charSequence) {
        this.f21878f.setTitle(charSequence);
    }

    @Override // o.b
    public final void p(boolean z8) {
        this.f21871c = z8;
        this.f21878f.setTitleOptional(z8);
    }
}
