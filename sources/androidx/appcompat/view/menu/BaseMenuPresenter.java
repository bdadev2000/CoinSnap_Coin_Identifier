package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes4.dex */
public abstract class BaseMenuPresenter implements MenuPresenter {

    /* renamed from: a, reason: collision with root package name */
    public Context f675a;

    /* renamed from: b, reason: collision with root package name */
    public Context f676b;

    /* renamed from: c, reason: collision with root package name */
    public MenuBuilder f677c;
    public LayoutInflater d;

    /* renamed from: f, reason: collision with root package name */
    public MenuPresenter.Callback f678f;

    /* renamed from: g, reason: collision with root package name */
    public int f679g;

    /* renamed from: h, reason: collision with root package name */
    public int f680h;

    /* renamed from: i, reason: collision with root package name */
    public MenuView f681i;

    /* renamed from: j, reason: collision with root package name */
    public int f682j;

    public abstract void b(MenuItemImpl menuItemImpl, MenuView.ItemView itemView);

    public boolean c(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View d(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        MenuView.ItemView itemView = view instanceof MenuView.ItemView ? (MenuView.ItemView) view : (MenuView.ItemView) this.d.inflate(this.f680h, viewGroup, false);
        b(menuItemImpl, itemView);
        return (View) itemView;
    }

    public boolean e(MenuItemImpl menuItemImpl) {
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final int getId() {
        return this.f682j;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.f676b = context;
        LayoutInflater.from(context);
        this.f677c = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z2) {
        MenuPresenter.Callback callback = this.f678f;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.MenuBuilder] */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        MenuPresenter.Callback callback = this.f678f;
        SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
        if (callback == null) {
            return false;
        }
        if (subMenuBuilder == null) {
            subMenuBuilder2 = this.f677c;
        }
        return callback.a(subMenuBuilder2);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(MenuPresenter.Callback callback) {
        this.f678f = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z2) {
        ViewGroup viewGroup = (ViewGroup) this.f681i;
        if (viewGroup == null) {
            return;
        }
        MenuBuilder menuBuilder = this.f677c;
        int i2 = 0;
        if (menuBuilder != null) {
            menuBuilder.flagActionItems();
            ArrayList<MenuItemImpl> visibleItems = this.f677c.getVisibleItems();
            int size = visibleItems.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                MenuItemImpl menuItemImpl = visibleItems.get(i4);
                if (e(menuItemImpl)) {
                    View childAt = viewGroup.getChildAt(i3);
                    MenuItemImpl itemData = childAt instanceof MenuView.ItemView ? ((MenuView.ItemView) childAt).getItemData() : null;
                    View d = d(menuItemImpl, childAt, viewGroup);
                    if (menuItemImpl != itemData) {
                        d.setPressed(false);
                        d.jumpDrawablesToCurrentState();
                    }
                    if (d != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) d.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(d);
                        }
                        ((ViewGroup) this.f681i).addView(d, i3);
                    }
                    i3++;
                }
            }
            i2 = i3;
        }
        while (i2 < viewGroup.getChildCount()) {
            if (!c(viewGroup, i2)) {
                i2++;
            }
        }
    }
}
