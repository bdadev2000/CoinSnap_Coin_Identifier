package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuView;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes.dex */
public class MenuAdapter extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuBuilder f743a;

    /* renamed from: b, reason: collision with root package name */
    public int f744b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f745c;
    public final boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflater f746f;

    /* renamed from: g, reason: collision with root package name */
    public final int f747g;

    public MenuAdapter(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.d = z2;
        this.f746f = layoutInflater;
        this.f743a = menuBuilder;
        this.f747g = i2;
        a();
    }

    public final void a() {
        MenuBuilder menuBuilder = this.f743a;
        MenuItemImpl expandedItem = menuBuilder.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<MenuItemImpl> nonActionItems = menuBuilder.getNonActionItems();
            int size = nonActionItems.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (nonActionItems.get(i2) == expandedItem) {
                    this.f744b = i2;
                    return;
                }
            }
        }
        this.f744b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MenuItemImpl getItem(int i2) {
        boolean z2 = this.d;
        MenuBuilder menuBuilder = this.f743a;
        ArrayList<MenuItemImpl> nonActionItems = z2 ? menuBuilder.getNonActionItems() : menuBuilder.getVisibleItems();
        int i3 = this.f744b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return nonActionItems.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        boolean z2 = this.d;
        MenuBuilder menuBuilder = this.f743a;
        return this.f744b < 0 ? (z2 ? menuBuilder.getNonActionItems() : menuBuilder.getVisibleItems()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f746f.inflate(this.f747g, viewGroup, false);
        }
        int i3 = getItem(i2).f752b;
        int i4 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f743a.isGroupDividerEnabled() && i3 != (i4 >= 0 ? getItem(i4).f752b : i3));
        MenuView.ItemView itemView = (MenuView.ItemView) view;
        if (this.f745c) {
            listMenuItemView.setForceShowIcon(true);
        }
        itemView.initialize(getItem(i2), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
