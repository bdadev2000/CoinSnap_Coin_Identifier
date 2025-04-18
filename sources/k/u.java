package k;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class u implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f20178b;

    public u(w wVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f20178b = wVar;
        this.a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.f20178b.o(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.f20178b.o(menuItem));
    }
}
