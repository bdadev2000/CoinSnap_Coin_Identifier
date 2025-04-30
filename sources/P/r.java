package p;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class r implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f22155a;
    public final /* synthetic */ s b;

    public r(s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.b = sVar;
        this.f22155a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f22155a.onMenuItemClick(this.b.f(menuItem));
    }
}
