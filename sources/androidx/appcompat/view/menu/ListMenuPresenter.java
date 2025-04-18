package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import com.cooldev.gba.emulator.gameboy.R;
import java.util.ArrayList;
import org.objectweb.asm.Opcodes;

@RestrictTo
/* loaded from: classes2.dex */
public class ListMenuPresenter implements MenuPresenter, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f734a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f735b;

    /* renamed from: c, reason: collision with root package name */
    public MenuBuilder f736c;
    public ExpandedMenuView d;

    /* renamed from: h, reason: collision with root package name */
    public MenuPresenter.Callback f739h;

    /* renamed from: i, reason: collision with root package name */
    public MenuAdapter f740i;

    /* renamed from: g, reason: collision with root package name */
    public final int f738g = R.layout.abc_list_menu_item_layout;

    /* renamed from: f, reason: collision with root package name */
    public final int f737f = 0;

    /* loaded from: classes2.dex */
    public class MenuAdapter extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        public int f741a = -1;

        public MenuAdapter() {
            a();
        }

        public final void a() {
            ListMenuPresenter listMenuPresenter = ListMenuPresenter.this;
            MenuItemImpl expandedItem = listMenuPresenter.f736c.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<MenuItemImpl> nonActionItems = listMenuPresenter.f736c.getNonActionItems();
                int size = nonActionItems.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (nonActionItems.get(i2) == expandedItem) {
                        this.f741a = i2;
                        return;
                    }
                }
            }
            this.f741a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MenuItemImpl getItem(int i2) {
            ListMenuPresenter listMenuPresenter = ListMenuPresenter.this;
            ArrayList<MenuItemImpl> nonActionItems = listMenuPresenter.f736c.getNonActionItems();
            listMenuPresenter.getClass();
            int i3 = this.f741a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return nonActionItems.get(i2);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            ListMenuPresenter listMenuPresenter = ListMenuPresenter.this;
            int size = listMenuPresenter.f736c.getNonActionItems().size();
            listMenuPresenter.getClass();
            return this.f741a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public final View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                ListMenuPresenter listMenuPresenter = ListMenuPresenter.this;
                view = listMenuPresenter.f735b.inflate(listMenuPresenter.f738g, viewGroup, false);
            }
            ((MenuView.ItemView) view).initialize(getItem(i2), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public ListMenuPresenter(Context context) {
        this.f734a = context;
        this.f735b = LayoutInflater.from(context);
    }

    public final ListAdapter a() {
        if (this.f740i == null) {
            this.f740i = new MenuAdapter();
        }
        return this.f740i;
    }

    public final MenuView b(ViewGroup viewGroup) {
        if (this.d == null) {
            this.d = (ExpandedMenuView) this.f735b.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f740i == null) {
                this.f740i = new MenuAdapter();
            }
            this.d.setAdapter((ListAdapter) this.f740i);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void initForMenu(Context context, MenuBuilder menuBuilder) {
        int i2 = this.f737f;
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            this.f734a = contextThemeWrapper;
            this.f735b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f734a != null) {
            this.f734a = context;
            if (this.f735b == null) {
                this.f735b = LayoutInflater.from(context);
            }
        }
        this.f736c = menuBuilder;
        MenuAdapter menuAdapter = this.f740i;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z2) {
        MenuPresenter.Callback callback = this.f739h;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z2);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.f736c.performItemAction(this.f740i.getItem(i2), this, 0);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable onSaveInstanceState() {
        if (this.d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.view.menu.MenuPresenter$Callback, android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnKeyListener, androidx.appcompat.view.menu.MenuDialogHelper, java.lang.Object, android.content.DialogInterface$OnDismissListener] */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        ?? obj = new Object();
        obj.f748a = subMenuBuilder;
        AlertDialog.Builder builder = new AlertDialog.Builder(subMenuBuilder.getContext());
        ListMenuPresenter listMenuPresenter = new ListMenuPresenter(builder.getContext());
        obj.f750c = listMenuPresenter;
        listMenuPresenter.f739h = obj;
        subMenuBuilder.addMenuPresenter(listMenuPresenter);
        builder.setAdapter(obj.f750c.a(), obj);
        View headerView = subMenuBuilder.getHeaderView();
        if (headerView != null) {
            builder.setCustomTitle(headerView);
        } else {
            builder.setIcon(subMenuBuilder.getHeaderIcon());
            builder.setTitle(subMenuBuilder.getHeaderTitle());
        }
        builder.setOnKeyListener(obj);
        AlertDialog create = builder.create();
        obj.f749b = create;
        create.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f749b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= Opcodes.ACC_DEPRECATED;
        obj.f749b.show();
        MenuPresenter.Callback callback = this.f739h;
        if (callback == null) {
            return true;
        }
        callback.a(subMenuBuilder);
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(MenuPresenter.Callback callback) {
        this.f739h = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z2) {
        MenuAdapter menuAdapter = this.f740i;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }
}
