package k;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p.InterfaceC2531j;
import p.MenuC2533l;
import q.C2605j;

/* renamed from: k.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2410G extends o.b implements InterfaceC2531j {

    /* renamed from: d, reason: collision with root package name */
    public final Context f21232d;

    /* renamed from: f, reason: collision with root package name */
    public final MenuC2533l f21233f;

    /* renamed from: g, reason: collision with root package name */
    public o.a f21234g;

    /* renamed from: h, reason: collision with root package name */
    public WeakReference f21235h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C2411H f21236i;

    public C2410G(C2411H c2411h, Context context, a7.b bVar) {
        this.f21236i = c2411h;
        this.f21232d = context;
        this.f21234g = bVar;
        MenuC2533l menuC2533l = new MenuC2533l(context);
        menuC2533l.f22110n = 1;
        this.f21233f = menuC2533l;
        menuC2533l.f22105g = this;
    }

    @Override // o.b
    public final void a() {
        C2411H c2411h = this.f21236i;
        if (c2411h.f21247k != this) {
            return;
        }
        if (c2411h.f21252r) {
            c2411h.l = this;
            c2411h.m = this.f21234g;
        } else {
            this.f21234g.g(this);
        }
        this.f21234g = null;
        c2411h.y(false);
        ActionBarContextView actionBarContextView = c2411h.f21244h;
        if (actionBarContextView.m == null) {
            actionBarContextView.e();
        }
        c2411h.f21241e.setHideOnContentScrollEnabled(c2411h.f21257w);
        c2411h.f21247k = null;
    }

    @Override // p.InterfaceC2531j
    public final boolean b(MenuC2533l menuC2533l, MenuItem menuItem) {
        o.a aVar = this.f21234g;
        if (aVar != null) {
            return aVar.a(this, menuItem);
        }
        return false;
    }

    @Override // o.b
    public final View c() {
        WeakReference weakReference = this.f21235h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // o.b
    public final MenuC2533l d() {
        return this.f21233f;
    }

    @Override // o.b
    public final MenuInflater e() {
        return new o.i(this.f21232d);
    }

    @Override // o.b
    public final CharSequence f() {
        return this.f21236i.f21244h.getSubtitle();
    }

    @Override // p.InterfaceC2531j
    public final void g(MenuC2533l menuC2533l) {
        if (this.f21234g == null) {
            return;
        }
        i();
        C2605j c2605j = this.f21236i.f21244h.f4152f;
        if (c2605j != null) {
            c2605j.l();
        }
    }

    @Override // o.b
    public final CharSequence h() {
        return this.f21236i.f21244h.getTitle();
    }

    @Override // o.b
    public final void i() {
        if (this.f21236i.f21247k != this) {
            return;
        }
        MenuC2533l menuC2533l = this.f21233f;
        menuC2533l.w();
        try {
            this.f21234g.d(this, menuC2533l);
        } finally {
            menuC2533l.v();
        }
    }

    @Override // o.b
    public final boolean j() {
        return this.f21236i.f21244h.f4165u;
    }

    @Override // o.b
    public final void k(View view) {
        this.f21236i.f21244h.setCustomView(view);
        this.f21235h = new WeakReference(view);
    }

    @Override // o.b
    public final void l(int i9) {
        m(this.f21236i.b.getResources().getString(i9));
    }

    @Override // o.b
    public final void m(CharSequence charSequence) {
        this.f21236i.f21244h.setSubtitle(charSequence);
    }

    @Override // o.b
    public final void n(int i9) {
        o(this.f21236i.b.getResources().getString(i9));
    }

    @Override // o.b
    public final void o(CharSequence charSequence) {
        this.f21236i.f21244h.setTitle(charSequence);
    }

    @Override // o.b
    public final void p(boolean z8) {
        this.f21871c = z8;
        this.f21236i.f21244h.setTitleOptional(z8);
    }
}
