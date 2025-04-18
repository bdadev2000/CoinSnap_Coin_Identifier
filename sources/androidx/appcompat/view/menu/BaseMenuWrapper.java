package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

/* loaded from: classes3.dex */
abstract class BaseMenuWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final Context f683a;

    /* renamed from: b, reason: collision with root package name */
    public SimpleArrayMap f684b;

    /* renamed from: c, reason: collision with root package name */
    public SimpleArrayMap f685c;

    public BaseMenuWrapper(Context context) {
        this.f683a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        if (this.f684b == null) {
            this.f684b = new SimpleArrayMap();
        }
        MenuItem menuItem2 = (MenuItem) this.f684b.get(supportMenuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.f683a, supportMenuItem);
        this.f684b.put(supportMenuItem, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (this.f685c == null) {
            this.f685c = new SimpleArrayMap();
        }
        SubMenu subMenu2 = (SubMenu) this.f685c.get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuWrapperICS subMenuWrapperICS = new SubMenuWrapperICS(this.f683a, supportSubMenu);
        this.f685c.put(supportSubMenu, subMenuWrapperICS);
        return subMenuWrapperICS;
    }
}
