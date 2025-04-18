package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import com.cooldev.gba.emulator.gameboy.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class CascadingMenuPopup extends MenuPopup implements MenuPresenter, View.OnKeyListener, PopupWindow.OnDismissListener {
    public PopupWindow.OnDismissListener A;
    public boolean B;

    /* renamed from: b, reason: collision with root package name */
    public final Context f686b;

    /* renamed from: c, reason: collision with root package name */
    public final int f687c;
    public final int d;

    /* renamed from: f, reason: collision with root package name */
    public final int f688f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f689g;

    /* renamed from: h, reason: collision with root package name */
    public final Handler f690h;

    /* renamed from: p, reason: collision with root package name */
    public View f698p;

    /* renamed from: q, reason: collision with root package name */
    public View f699q;

    /* renamed from: r, reason: collision with root package name */
    public int f700r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f701s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f702t;

    /* renamed from: u, reason: collision with root package name */
    public int f703u;

    /* renamed from: v, reason: collision with root package name */
    public int f704v;
    public boolean x;

    /* renamed from: y, reason: collision with root package name */
    public MenuPresenter.Callback f705y;

    /* renamed from: z, reason: collision with root package name */
    public ViewTreeObserver f706z;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f691i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f692j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f693k = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            if (cascadingMenuPopup.a()) {
                ArrayList arrayList = cascadingMenuPopup.f692j;
                if (arrayList.size() <= 0 || ((CascadingMenuInfo) arrayList.get(0)).f713a.f1158z) {
                    return;
                }
                View view = cascadingMenuPopup.f699q;
                if (view == null || !view.isShown()) {
                    cascadingMenuPopup.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((CascadingMenuInfo) it.next()).f713a.show();
                }
            }
        }
    };

    /* renamed from: l, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f694l = new View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            ViewTreeObserver viewTreeObserver = cascadingMenuPopup.f706z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    cascadingMenuPopup.f706z = view.getViewTreeObserver();
                }
                cascadingMenuPopup.f706z.removeGlobalOnLayoutListener(cascadingMenuPopup.f693k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: m, reason: collision with root package name */
    public final MenuItemHoverListener f695m = new MenuItemHoverListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.3
        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public final void c(final MenuBuilder menuBuilder, final MenuItemImpl menuItemImpl) {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            cascadingMenuPopup.f690h.removeCallbacksAndMessages(null);
            ArrayList arrayList = cascadingMenuPopup.f692j;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (menuBuilder == ((CascadingMenuInfo) arrayList.get(i2)).f714b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return;
            }
            int i3 = i2 + 1;
            final CascadingMenuInfo cascadingMenuInfo = i3 < arrayList.size() ? (CascadingMenuInfo) arrayList.get(i3) : null;
            cascadingMenuPopup.f690h.postAtTime(new Runnable() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    CascadingMenuInfo cascadingMenuInfo2 = cascadingMenuInfo;
                    if (cascadingMenuInfo2 != null) {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        CascadingMenuPopup.this.B = true;
                        cascadingMenuInfo2.f714b.close(false);
                        CascadingMenuPopup.this.B = false;
                    }
                    MenuItem menuItem = menuItemImpl;
                    if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                        menuBuilder.performItemAction(menuItem, 4);
                    }
                }
            }, menuBuilder, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public final void m(MenuBuilder menuBuilder, MenuItem menuItem) {
            CascadingMenuPopup.this.f690h.removeCallbacksAndMessages(menuBuilder);
        }
    };

    /* renamed from: n, reason: collision with root package name */
    public int f696n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f697o = 0;
    public boolean w = false;

    /* loaded from: classes2.dex */
    public static class CascadingMenuInfo {

        /* renamed from: a, reason: collision with root package name */
        public final MenuPopupWindow f713a;

        /* renamed from: b, reason: collision with root package name */
        public final MenuBuilder f714b;

        /* renamed from: c, reason: collision with root package name */
        public final int f715c;

        public CascadingMenuInfo(MenuPopupWindow menuPopupWindow, MenuBuilder menuBuilder, int i2) {
            this.f713a = menuPopupWindow;
            this.f714b = menuBuilder;
            this.f715c = i2;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface HorizPosition {
    }

    public CascadingMenuPopup(Context context, View view, int i2, int i3, boolean z2) {
        this.f686b = context;
        this.f698p = view;
        this.d = i2;
        this.f688f = i3;
        this.f689g = z2;
        this.f700r = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f687c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f690h = new Handler();
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean a() {
        ArrayList arrayList = this.f692j;
        return arrayList.size() > 0 && ((CascadingMenuInfo) arrayList.get(0)).f713a.A.isShowing();
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void b(MenuBuilder menuBuilder) {
        menuBuilder.addMenuPresenter(this, this.f686b);
        if (a()) {
            k(menuBuilder);
        } else {
            this.f691i.add(menuBuilder);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void d(View view) {
        if (this.f698p != view) {
            this.f698p = view;
            this.f697o = Gravity.getAbsoluteGravity(this.f696n, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        ArrayList arrayList = this.f692j;
        int size = arrayList.size();
        if (size > 0) {
            CascadingMenuInfo[] cascadingMenuInfoArr = (CascadingMenuInfo[]) arrayList.toArray(new CascadingMenuInfo[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                CascadingMenuInfo cascadingMenuInfo = cascadingMenuInfoArr[i2];
                if (cascadingMenuInfo.f713a.A.isShowing()) {
                    cascadingMenuInfo.f713a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void e(boolean z2) {
        this.w = z2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void f(int i2) {
        if (this.f696n != i2) {
            this.f696n = i2;
            this.f697o = Gravity.getAbsoluteGravity(i2, this.f698p.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void g(int i2) {
        this.f701s = true;
        this.f703u = i2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void h(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void i(boolean z2) {
        this.x = z2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void j(int i2) {
        this.f702t = true;
        this.f704v = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0174  */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.MenuPopupWindow] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(androidx.appcompat.view.menu.MenuBuilder r18) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.CascadingMenuPopup.k(androidx.appcompat.view.menu.MenuBuilder):void");
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView n() {
        ArrayList arrayList = this.f692j;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((CascadingMenuInfo) arrayList.get(arrayList.size() - 1)).f713a.f1139c;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z2) {
        ArrayList arrayList = this.f692j;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (menuBuilder == ((CascadingMenuInfo) arrayList.get(i2)).f714b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((CascadingMenuInfo) arrayList.get(i3)).f714b.close(false);
        }
        CascadingMenuInfo cascadingMenuInfo = (CascadingMenuInfo) arrayList.remove(i2);
        cascadingMenuInfo.f714b.removeMenuPresenter(this);
        boolean z3 = this.B;
        MenuPopupWindow menuPopupWindow = cascadingMenuInfo.f713a;
        if (z3) {
            menuPopupWindow.r();
            menuPopupWindow.A.setAnimationStyle(0);
        }
        menuPopupWindow.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f700r = ((CascadingMenuInfo) arrayList.get(size2 - 1)).f715c;
        } else {
            this.f700r = this.f698p.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((CascadingMenuInfo) arrayList.get(0)).f714b.close(false);
                return;
            }
            return;
        }
        dismiss();
        MenuPresenter.Callback callback = this.f705y;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, true);
        }
        ViewTreeObserver viewTreeObserver = this.f706z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f706z.removeGlobalOnLayoutListener(this.f693k);
            }
            this.f706z = null;
        }
        this.f699q.removeOnAttachStateChangeListener(this.f694l);
        this.A.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        CascadingMenuInfo cascadingMenuInfo;
        ArrayList arrayList = this.f692j;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                cascadingMenuInfo = null;
                break;
            }
            cascadingMenuInfo = (CascadingMenuInfo) arrayList.get(i2);
            if (!cascadingMenuInfo.f713a.A.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (cascadingMenuInfo != null) {
            cascadingMenuInfo.f714b.close(false);
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
        Iterator it = this.f692j.iterator();
        while (it.hasNext()) {
            CascadingMenuInfo cascadingMenuInfo = (CascadingMenuInfo) it.next();
            if (subMenuBuilder == cascadingMenuInfo.f714b) {
                cascadingMenuInfo.f713a.f1139c.requestFocus();
                return true;
            }
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        b(subMenuBuilder);
        MenuPresenter.Callback callback = this.f705y;
        if (callback != null) {
            callback.a(subMenuBuilder);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(MenuPresenter.Callback callback) {
        this.f705y = callback;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f691i;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k((MenuBuilder) it.next());
        }
        arrayList.clear();
        View view = this.f698p;
        this.f699q = view;
        if (view != null) {
            boolean z2 = this.f706z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f706z = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f693k);
            }
            this.f699q.addOnAttachStateChangeListener(this.f694l);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z2) {
        Iterator it = this.f692j.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((CascadingMenuInfo) it.next()).f713a.f1139c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((MenuAdapter) adapter).notifyDataSetChanged();
        }
    }
}
