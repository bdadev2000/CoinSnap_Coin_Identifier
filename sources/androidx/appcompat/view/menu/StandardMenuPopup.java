package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.MenuPopupWindow;
import com.cooldev.gba.emulator.gameboy.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class StandardMenuPopup extends MenuPopup implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, MenuPresenter, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f792b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuBuilder f793c;
    public final MenuAdapter d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f794f;

    /* renamed from: g, reason: collision with root package name */
    public final int f795g;

    /* renamed from: h, reason: collision with root package name */
    public final int f796h;

    /* renamed from: i, reason: collision with root package name */
    public final int f797i;

    /* renamed from: j, reason: collision with root package name */
    public final MenuPopupWindow f798j;

    /* renamed from: m, reason: collision with root package name */
    public PopupWindow.OnDismissListener f801m;

    /* renamed from: n, reason: collision with root package name */
    public View f802n;

    /* renamed from: o, reason: collision with root package name */
    public View f803o;

    /* renamed from: p, reason: collision with root package name */
    public MenuPresenter.Callback f804p;

    /* renamed from: q, reason: collision with root package name */
    public ViewTreeObserver f805q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f806r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f807s;

    /* renamed from: t, reason: collision with root package name */
    public int f808t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f810v;

    /* renamed from: k, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f799k = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.StandardMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            StandardMenuPopup standardMenuPopup = StandardMenuPopup.this;
            if (!standardMenuPopup.a() || standardMenuPopup.f798j.f1158z) {
                return;
            }
            View view = standardMenuPopup.f803o;
            if (view == null || !view.isShown()) {
                standardMenuPopup.dismiss();
            } else {
                standardMenuPopup.f798j.show();
            }
        }
    };

    /* renamed from: l, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f800l = new View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.StandardMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            StandardMenuPopup standardMenuPopup = StandardMenuPopup.this;
            ViewTreeObserver viewTreeObserver = standardMenuPopup.f805q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    standardMenuPopup.f805q = view.getViewTreeObserver();
                }
                standardMenuPopup.f805q.removeGlobalOnLayoutListener(standardMenuPopup.f799k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: u, reason: collision with root package name */
    public int f809u = 0;

    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.MenuPopupWindow] */
    public StandardMenuPopup(int i2, int i3, Context context, View view, MenuBuilder menuBuilder, boolean z2) {
        this.f792b = context;
        this.f793c = menuBuilder;
        this.f794f = z2;
        this.d = new MenuAdapter(menuBuilder, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f796h = i2;
        this.f797i = i3;
        Resources resources = context.getResources();
        this.f795g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f802n = view;
        this.f798j = new ListPopupWindow(context, null, i2, i3);
        menuBuilder.addMenuPresenter(this, context);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean a() {
        return !this.f806r && this.f798j.A.isShowing();
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void b(MenuBuilder menuBuilder) {
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void d(View view) {
        this.f802n = view;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        if (a()) {
            this.f798j.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void e(boolean z2) {
        this.d.f745c = z2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void f(int i2) {
        this.f809u = i2;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void g(int i2) {
        this.f798j.f1141g = i2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void h(PopupWindow.OnDismissListener onDismissListener) {
        this.f801m = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void i(boolean z2) {
        this.f810v = z2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void j(int i2) {
        this.f798j.h(i2);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView n() {
        return this.f798j.f1139c;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z2) {
        if (menuBuilder != this.f793c) {
            return;
        }
        dismiss();
        MenuPresenter.Callback callback = this.f804p;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z2);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f806r = true;
        this.f793c.close();
        ViewTreeObserver viewTreeObserver = this.f805q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f805q = this.f803o.getViewTreeObserver();
            }
            this.f805q.removeGlobalOnLayoutListener(this.f799k);
            this.f805q = null;
        }
        this.f803o.removeOnAttachStateChangeListener(this.f800l);
        PopupWindow.OnDismissListener onDismissListener = this.f801m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        boolean z2;
        if (subMenuBuilder.hasVisibleItems()) {
            MenuPopupHelper menuPopupHelper = new MenuPopupHelper(this.f796h, this.f797i, this.f792b, this.f803o, subMenuBuilder, this.f794f);
            MenuPresenter.Callback callback = this.f804p;
            menuPopupHelper.f787i = callback;
            MenuPopup menuPopup = menuPopupHelper.f788j;
            if (menuPopup != null) {
                menuPopup.setCallback(callback);
            }
            int size = subMenuBuilder.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z2 = false;
                    break;
                }
                MenuItem item = subMenuBuilder.getItem(i2);
                if (item.isVisible() && item.getIcon() != null) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            menuPopupHelper.d(z2);
            menuPopupHelper.f789k = this.f801m;
            this.f801m = null;
            this.f793c.close(false);
            MenuPopupWindow menuPopupWindow = this.f798j;
            int i3 = menuPopupWindow.f1141g;
            int k2 = menuPopupWindow.k();
            if ((Gravity.getAbsoluteGravity(this.f809u, this.f802n.getLayoutDirection()) & 7) == 5) {
                i3 += this.f802n.getWidth();
            }
            if (!menuPopupHelper.b()) {
                if (menuPopupHelper.f784f != null) {
                    menuPopupHelper.e(i3, k2, true, true);
                }
            }
            MenuPresenter.Callback callback2 = this.f804p;
            if (callback2 != null) {
                callback2.a(subMenuBuilder);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(MenuPresenter.Callback callback) {
        this.f804p = callback;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        View view;
        if (a()) {
            return;
        }
        if (this.f806r || (view = this.f802n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f803o = view;
        MenuPopupWindow menuPopupWindow = this.f798j;
        menuPopupWindow.A.setOnDismissListener(this);
        menuPopupWindow.f1151q = this;
        menuPopupWindow.f1158z = true;
        menuPopupWindow.A.setFocusable(true);
        View view2 = this.f803o;
        boolean z2 = this.f805q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f805q = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f799k);
        }
        view2.addOnAttachStateChangeListener(this.f800l);
        menuPopupWindow.f1150p = view2;
        menuPopupWindow.f1147m = this.f809u;
        boolean z3 = this.f807s;
        Context context = this.f792b;
        MenuAdapter menuAdapter = this.d;
        if (!z3) {
            this.f808t = MenuPopup.c(menuAdapter, context, this.f795g);
            this.f807s = true;
        }
        menuPopupWindow.p(this.f808t);
        menuPopupWindow.A.setInputMethodMode(2);
        Rect rect = this.f780a;
        menuPopupWindow.f1157y = rect != null ? new Rect(rect) : null;
        menuPopupWindow.show();
        DropDownListView dropDownListView = menuPopupWindow.f1139c;
        dropDownListView.setOnKeyListener(this);
        if (this.f810v) {
            MenuBuilder menuBuilder = this.f793c;
            if (menuBuilder.getHeaderTitle() != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) dropDownListView, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuBuilder.getHeaderTitle());
                }
                frameLayout.setEnabled(false);
                dropDownListView.addHeaderView(frameLayout, null, false);
            }
        }
        menuPopupWindow.l(menuAdapter);
        menuPopupWindow.show();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z2) {
        this.f807s = false;
        MenuAdapter menuAdapter = this.d;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }
}
