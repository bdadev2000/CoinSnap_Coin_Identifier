package androidx.appcompat.view;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

@RestrictTo
/* loaded from: classes3.dex */
public class StandaloneActionMode extends ActionMode implements MenuBuilder.Callback {

    /* renamed from: c, reason: collision with root package name */
    public Context f600c;
    public ActionBarContextView d;

    /* renamed from: f, reason: collision with root package name */
    public ActionMode.Callback f601f;

    /* renamed from: g, reason: collision with root package name */
    public WeakReference f602g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f603h;

    /* renamed from: i, reason: collision with root package name */
    public MenuBuilder f604i;

    @Override // androidx.appcompat.view.ActionMode
    public final void a() {
        if (this.f603h) {
            return;
        }
        this.f603h = true;
        this.f601f.a(this);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final View b() {
        WeakReference weakReference = this.f602g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final MenuBuilder c() {
        return this.f604i;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final MenuInflater d() {
        return new SupportMenuInflater(this.d.getContext());
    }

    @Override // androidx.appcompat.view.ActionMode
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void g() {
        this.f601f.d(this, this.f604i);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final boolean h() {
        return this.d.f843t;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void i(View view) {
        this.d.setCustomView(view);
        this.f602g = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void j(int i2) {
        k(this.f600c.getString(i2));
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void l(int i2) {
        m(this.f600c.getString(i2));
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void n(boolean z2) {
        this.f595b = z2;
        this.d.setTitleOptional(z2);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.f601f.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final void onMenuModeChange(MenuBuilder menuBuilder) {
        g();
        this.d.i();
    }
}
