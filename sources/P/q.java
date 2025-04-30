package p;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class q implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f22154a;
    public final /* synthetic */ s b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = sVar;
        this.f22154a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f22154a.onMenuItemActionCollapse(this.b.f(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f22154a.onMenuItemActionExpand(this.b.f(menuItem));
    }
}
