package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: p.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC2521D extends MenuC2533l implements SubMenu {

    /* renamed from: B, reason: collision with root package name */
    public final MenuC2533l f22048B;

    /* renamed from: C, reason: collision with root package name */
    public final C2535n f22049C;

    public SubMenuC2521D(Context context, MenuC2533l menuC2533l, C2535n c2535n) {
        super(context);
        this.f22048B = menuC2533l;
        this.f22049C = c2535n;
    }

    @Override // p.MenuC2533l
    public final boolean d(C2535n c2535n) {
        return this.f22048B.d(c2535n);
    }

    @Override // p.MenuC2533l
    public final boolean e(MenuC2533l menuC2533l, MenuItem menuItem) {
        if (!super.e(menuC2533l, menuItem) && !this.f22048B.e(menuC2533l, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // p.MenuC2533l
    public final boolean f(C2535n c2535n) {
        return this.f22048B.f(c2535n);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f22049C;
    }

    @Override // p.MenuC2533l
    public final String j() {
        int i9;
        C2535n c2535n = this.f22049C;
        if (c2535n != null) {
            i9 = c2535n.b;
        } else {
            i9 = 0;
        }
        if (i9 == 0) {
            return null;
        }
        return com.mbridge.msdk.foundation.entity.o.h(i9, "android:menu:actionviewstates:");
    }

    @Override // p.MenuC2533l
    public final MenuC2533l k() {
        return this.f22048B.k();
    }

    @Override // p.MenuC2533l
    public final boolean m() {
        return this.f22048B.m();
    }

    @Override // p.MenuC2533l
    public final boolean n() {
        return this.f22048B.n();
    }

    @Override // p.MenuC2533l
    public final boolean o() {
        return this.f22048B.o();
    }

    @Override // p.MenuC2533l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z8) {
        this.f22048B.setGroupDividerEnabled(z8);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f22049C.setIcon(drawable);
        return this;
    }

    @Override // p.MenuC2533l, android.view.Menu
    public final void setQwertyMode(boolean z8) {
        this.f22048B.setQwertyMode(z8);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i9) {
        u(0, null, i9, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i9) {
        u(i9, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i9) {
        this.f22049C.setIcon(i9);
        return this;
    }
}
