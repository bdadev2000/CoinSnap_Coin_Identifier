package k;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class v implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f20179b;

    public v(w wVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f20179b = wVar;
        this.a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.a.onMenuItemClick(this.f20179b.o(menuItem));
    }
}
