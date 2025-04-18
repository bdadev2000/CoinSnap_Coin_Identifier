package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPopup;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ActionProvider;
import com.cooldev.gba.emulator.gameboy.R;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ActionMenuPresenter extends BaseMenuPresenter implements ActionProvider.SubUiVisibilityListener {

    /* renamed from: k, reason: collision with root package name */
    public OverflowMenuButton f871k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f872l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f873m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f874n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f875o;

    /* renamed from: p, reason: collision with root package name */
    public int f876p;

    /* renamed from: q, reason: collision with root package name */
    public int f877q;

    /* renamed from: r, reason: collision with root package name */
    public int f878r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f879s;

    /* renamed from: t, reason: collision with root package name */
    public final SparseBooleanArray f880t;

    /* renamed from: u, reason: collision with root package name */
    public OverflowPopup f881u;

    /* renamed from: v, reason: collision with root package name */
    public ActionButtonSubmenu f882v;
    public OpenOverflowRunnable w;
    public ActionMenuPopupCallback x;

    /* renamed from: y, reason: collision with root package name */
    public final PopupPresenterCallback f883y;

    /* renamed from: z, reason: collision with root package name */
    public int f884z;

    /* loaded from: classes2.dex */
    public class ActionButtonSubmenu extends MenuPopupHelper {
        public ActionButtonSubmenu(Context context, SubMenuBuilder subMenuBuilder, View view) {
            super(R.attr.actionOverflowMenuStyle, 0, context, view, subMenuBuilder, false);
            if (!((MenuItemImpl) subMenuBuilder.getItem()).f()) {
                View view2 = ActionMenuPresenter.this.f871k;
                this.f784f = view2 == null ? (View) ActionMenuPresenter.this.f681i : view2;
            }
            PopupPresenterCallback popupPresenterCallback = ActionMenuPresenter.this.f883y;
            this.f787i = popupPresenterCallback;
            MenuPopup menuPopup = this.f788j;
            if (menuPopup != null) {
                menuPopup.setCallback(popupPresenterCallback);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public final void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f882v = null;
            actionMenuPresenter.f884z = 0;
            super.c();
        }
    }

    /* loaded from: classes2.dex */
    public class ActionMenuPopupCallback extends ActionMenuItemView.PopupCallback {
        public ActionMenuPopupCallback() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback
        public final ShowableListMenu a() {
            ActionButtonSubmenu actionButtonSubmenu = ActionMenuPresenter.this.f882v;
            if (actionButtonSubmenu != null) {
                return actionButtonSubmenu.a();
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public class OpenOverflowRunnable implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final OverflowPopup f887a;

        public OpenOverflowRunnable(OverflowPopup overflowPopup) {
            this.f887a = overflowPopup;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            MenuBuilder menuBuilder = actionMenuPresenter.f677c;
            if (menuBuilder != null) {
                menuBuilder.changeMenuMode();
            }
            View view = (View) actionMenuPresenter.f681i;
            if (view != null && view.getWindowToken() != null) {
                OverflowPopup overflowPopup = this.f887a;
                if (!overflowPopup.b()) {
                    if (overflowPopup.f784f != null) {
                        overflowPopup.e(0, 0, false, false);
                    }
                }
                actionMenuPresenter.f881u = overflowPopup;
            }
            actionMenuPresenter.w = null;
        }
    }

    /* loaded from: classes2.dex */
    public class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.ActionMenuChildView {
        public OverflowMenuButton(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat.Api26Impl.a(this, getContentDescription());
            setOnTouchListener(new ForwardingListener(this) { // from class: androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton.1
                @Override // androidx.appcompat.widget.ForwardingListener
                public final ShowableListMenu b() {
                    OverflowPopup overflowPopup = ActionMenuPresenter.this.f881u;
                    if (overflowPopup == null) {
                        return null;
                    }
                    return overflowPopup.a();
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public final boolean c() {
                    ActionMenuPresenter.this.h();
                    return true;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public final boolean d() {
                    ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                    if (actionMenuPresenter.w != null) {
                        return false;
                    }
                    actionMenuPresenter.f();
                    return true;
                }
            });
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.h();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                DrawableCompat.g(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: classes2.dex */
    public class OverflowPopup extends MenuPopupHelper {
        public OverflowPopup(Context context, MenuBuilder menuBuilder, View view) {
            super(R.attr.actionOverflowMenuStyle, 0, context, view, menuBuilder, true);
            this.f785g = 8388613;
            PopupPresenterCallback popupPresenterCallback = ActionMenuPresenter.this.f883y;
            this.f787i = popupPresenterCallback;
            MenuPopup menuPopup = this.f788j;
            if (menuPopup != null) {
                menuPopup.setCallback(popupPresenterCallback);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public final void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            MenuBuilder menuBuilder = actionMenuPresenter.f677c;
            if (menuBuilder != null) {
                menuBuilder.close();
            }
            actionMenuPresenter.f881u = null;
            super.c();
        }
    }

    /* loaded from: classes2.dex */
    public class PopupPresenterCallback implements MenuPresenter.Callback {
        public PopupPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean a(MenuBuilder menuBuilder) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (menuBuilder == actionMenuPresenter.f677c) {
                return false;
            }
            actionMenuPresenter.f884z = ((SubMenuBuilder) menuBuilder).getItem().getItemId();
            MenuPresenter.Callback callback = actionMenuPresenter.f678f;
            if (callback != null) {
                return callback.a(menuBuilder);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void onCloseMenu(MenuBuilder menuBuilder, boolean z2) {
            if (menuBuilder instanceof SubMenuBuilder) {
                menuBuilder.getRootMenu().close(false);
            }
            MenuPresenter.Callback callback = ActionMenuPresenter.this.f678f;
            if (callback != null) {
                callback.onCloseMenu(menuBuilder, z2);
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* renamed from: a, reason: collision with root package name */
        public int f893a;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.appcompat.widget.ActionMenuPresenter$SavedState] */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                ?? obj = new Object();
                obj.f893a = parcel.readInt();
                return obj;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f893a);
        }
    }

    public ActionMenuPresenter(Context context) {
        this.f675a = context;
        this.d = LayoutInflater.from(context);
        this.f679g = R.layout.abc_action_menu_layout;
        this.f680h = R.layout.abc_action_menu_item_layout;
        this.f880t = new SparseBooleanArray();
        this.f883y = new PopupPresenterCallback();
    }

    @Override // androidx.core.view.ActionProvider.SubUiVisibilityListener
    public final void a(boolean z2) {
        if (z2) {
            super.onSubMenuSelected(null);
            return;
        }
        MenuBuilder menuBuilder = this.f677c;
        if (menuBuilder != null) {
            menuBuilder.close(false);
        }
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final void b(MenuItemImpl menuItemImpl, MenuView.ItemView itemView) {
        itemView.initialize(menuItemImpl, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) itemView;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f681i);
        if (this.x == null) {
            this.x = new ActionMenuPopupCallback();
        }
        actionMenuItemView.setPopupCallback(this.x);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final boolean c(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.f871k) {
            return false;
        }
        viewGroup.removeViewAt(i2);
        return true;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final View d(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.e()) {
            actionView = super.d(menuItemImpl, view, viewGroup);
        }
        actionView.setVisibility(menuItemImpl.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.e(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final boolean e(MenuItemImpl menuItemImpl) {
        return menuItemImpl.f();
    }

    public final boolean f() {
        Object obj;
        OpenOverflowRunnable openOverflowRunnable = this.w;
        if (openOverflowRunnable != null && (obj = this.f681i) != null) {
            ((View) obj).removeCallbacks(openOverflowRunnable);
            this.w = null;
            return true;
        }
        OverflowPopup overflowPopup = this.f881u;
        if (overflowPopup == null) {
            return false;
        }
        if (overflowPopup.b()) {
            overflowPopup.f788j.dismiss();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        int i2;
        ArrayList<MenuItemImpl> arrayList;
        int i3;
        boolean z2;
        MenuBuilder menuBuilder = this.f677c;
        if (menuBuilder != null) {
            arrayList = menuBuilder.getVisibleItems();
            i2 = arrayList.size();
        } else {
            i2 = 0;
            arrayList = null;
        }
        int i4 = this.f878r;
        int i5 = this.f877q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f681i;
        int i6 = 0;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z2 = true;
            if (i6 >= i2) {
                break;
            }
            MenuItemImpl menuItemImpl = arrayList.get(i6);
            int i9 = menuItemImpl.f771y;
            if ((i9 & 2) == 2) {
                i7++;
            } else if ((i9 & 1) == 1) {
                i8++;
            } else {
                z3 = true;
            }
            if (this.f879s && menuItemImpl.C) {
                i4 = 0;
            }
            i6++;
        }
        if (this.f874n && (z3 || i8 + i7 > i4)) {
            i4--;
        }
        int i10 = i4 - i7;
        SparseBooleanArray sparseBooleanArray = this.f880t;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            MenuItemImpl menuItemImpl2 = arrayList.get(i11);
            int i13 = menuItemImpl2.f771y;
            boolean z4 = (i13 & 2) == i3 ? z2 : false;
            int i14 = menuItemImpl2.f752b;
            if (z4) {
                View d = d(menuItemImpl2, null, viewGroup);
                d.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = d.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z2);
                }
                menuItemImpl2.h(z2);
            } else if ((i13 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i14);
                boolean z6 = ((i10 > 0 || z5) && i5 > 0) ? z2 : false;
                if (z6) {
                    View d2 = d(menuItemImpl2, null, viewGroup);
                    d2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = d2.getMeasuredWidth();
                    i5 -= measuredWidth2;
                    if (i12 == 0) {
                        i12 = measuredWidth2;
                    }
                    z6 &= i5 + i12 > 0;
                }
                if (z6 && i14 != 0) {
                    sparseBooleanArray.put(i14, true);
                } else if (z5) {
                    sparseBooleanArray.put(i14, false);
                    for (int i15 = 0; i15 < i11; i15++) {
                        MenuItemImpl menuItemImpl3 = arrayList.get(i15);
                        if (menuItemImpl3.f752b == i14) {
                            if (menuItemImpl3.f()) {
                                i10++;
                            }
                            menuItemImpl3.h(false);
                        }
                    }
                }
                if (z6) {
                    i10--;
                }
                menuItemImpl2.h(z6);
            } else {
                menuItemImpl2.h(false);
                i11++;
                i3 = 2;
                z2 = true;
            }
            i11++;
            i3 = 2;
            z2 = true;
        }
        return z2;
    }

    public final boolean g() {
        OverflowPopup overflowPopup = this.f881u;
        return overflowPopup != null && overflowPopup.b();
    }

    public final boolean h() {
        MenuBuilder menuBuilder;
        if (!this.f874n || g() || (menuBuilder = this.f677c) == null || this.f681i == null || this.w != null || menuBuilder.getNonActionItems().isEmpty()) {
            return false;
        }
        OpenOverflowRunnable openOverflowRunnable = new OpenOverflowRunnable(new OverflowPopup(this.f676b, this.f677c, this.f871k));
        this.w = openOverflowRunnable;
        ((View) this.f681i).post(openOverflowRunnable);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.appcompat.view.ActionBarPolicy] */
    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final void initForMenu(Context context, MenuBuilder menuBuilder) {
        super.initForMenu(context, menuBuilder);
        Resources resources = context.getResources();
        ?? obj = new Object();
        obj.f593a = context;
        if (!this.f875o) {
            this.f874n = true;
        }
        this.f876p = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.f878r = obj.a();
        int i2 = this.f876p;
        if (this.f874n) {
            if (this.f871k == null) {
                OverflowMenuButton overflowMenuButton = new OverflowMenuButton(this.f675a);
                this.f871k = overflowMenuButton;
                if (this.f873m) {
                    overflowMenuButton.setImageDrawable(this.f872l);
                    this.f872l = null;
                    this.f873m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f871k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i2 -= this.f871k.getMeasuredWidth();
        } else {
            this.f871k = null;
        }
        this.f877q = i2;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z2) {
        f();
        ActionButtonSubmenu actionButtonSubmenu = this.f882v;
        if (actionButtonSubmenu != null && actionButtonSubmenu.b()) {
            actionButtonSubmenu.f788j.dismiss();
        }
        super.onCloseMenu(menuBuilder, z2);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i2;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i2 = ((SavedState) parcelable).f893a) > 0 && (findItem = this.f677c.findItem(i2)) != null) {
            onSubMenuSelected((SubMenuBuilder) findItem.getSubMenu());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object, androidx.appcompat.widget.ActionMenuPresenter$SavedState] */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable onSaveInstanceState() {
        ?? obj = new Object();
        obj.f893a = this.f884z;
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        boolean z2;
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
        while (subMenuBuilder2.getParentMenu() != this.f677c) {
            subMenuBuilder2 = (SubMenuBuilder) subMenuBuilder2.getParentMenu();
        }
        MenuItem item = subMenuBuilder2.getItem();
        ViewGroup viewGroup = (ViewGroup) this.f681i;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i2);
                if ((childAt instanceof MenuView.ItemView) && ((MenuView.ItemView) childAt).getItemData() == item) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        this.f884z = subMenuBuilder.getItem().getItemId();
        int size = subMenuBuilder.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z2 = false;
                break;
            }
            MenuItem item2 = subMenuBuilder.getItem(i3);
            if (item2.isVisible() && item2.getIcon() != null) {
                z2 = true;
                break;
            }
            i3++;
        }
        ActionButtonSubmenu actionButtonSubmenu = new ActionButtonSubmenu(this.f676b, subMenuBuilder, view);
        this.f882v = actionButtonSubmenu;
        actionButtonSubmenu.d(z2);
        ActionButtonSubmenu actionButtonSubmenu2 = this.f882v;
        if (!actionButtonSubmenu2.b()) {
            if (actionButtonSubmenu2.f784f == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            actionButtonSubmenu2.e(0, 0, false, false);
        }
        super.onSubMenuSelected(subMenuBuilder);
        return true;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z2) {
        int size;
        super.updateMenuView(z2);
        ((View) this.f681i).requestLayout();
        MenuBuilder menuBuilder = this.f677c;
        if (menuBuilder != null) {
            ArrayList<MenuItemImpl> actionItems = menuBuilder.getActionItems();
            int size2 = actionItems.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ActionProvider actionProvider = actionItems.get(i2).A;
                if (actionProvider != null) {
                    actionProvider.f18689a = this;
                }
            }
        }
        MenuBuilder menuBuilder2 = this.f677c;
        ArrayList<MenuItemImpl> nonActionItems = menuBuilder2 != null ? menuBuilder2.getNonActionItems() : null;
        if (!this.f874n || nonActionItems == null || ((size = nonActionItems.size()) != 1 ? size <= 0 : !(!nonActionItems.get(0).C))) {
            OverflowMenuButton overflowMenuButton = this.f871k;
            if (overflowMenuButton != null) {
                Object parent = overflowMenuButton.getParent();
                Object obj = this.f681i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f871k);
                }
            }
        } else {
            if (this.f871k == null) {
                this.f871k = new OverflowMenuButton(this.f675a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f871k.getParent();
            if (viewGroup != this.f681i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f871k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f681i;
                OverflowMenuButton overflowMenuButton2 = this.f871k;
                actionMenuView.getClass();
                ActionMenuView.LayoutParams d = ActionMenuView.d();
                d.f905a = true;
                actionMenuView.addView(overflowMenuButton2, d);
            }
        }
        ((ActionMenuView) this.f681i).setOverflowReserved(this.f874n);
    }
}
