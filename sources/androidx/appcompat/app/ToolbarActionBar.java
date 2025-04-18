package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class ToolbarActionBar extends ActionBar {

    /* renamed from: a, reason: collision with root package name */
    public final ToolbarWidgetWrapper f475a;

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f476b;

    /* renamed from: c, reason: collision with root package name */
    public final ToolbarMenuCallback f477c;
    public boolean d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f478f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f479g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f480h = new Runnable() { // from class: androidx.appcompat.app.ToolbarActionBar.1
        /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r6 = this;
                androidx.appcompat.app.ToolbarActionBar r0 = androidx.appcompat.app.ToolbarActionBar.this
                android.view.Window$Callback r1 = r0.f476b
                android.view.Menu r0 = r0.u()
                boolean r2 = r0 instanceof androidx.appcompat.view.menu.MenuBuilder
                r3 = 0
                if (r2 == 0) goto L11
                r2 = r0
                androidx.appcompat.view.menu.MenuBuilder r2 = (androidx.appcompat.view.menu.MenuBuilder) r2
                goto L12
            L11:
                r2 = r3
            L12:
                if (r2 == 0) goto L17
                r2.stopDispatchingItemsChanged()
            L17:
                r0.clear()     // Catch: java.lang.Throwable -> L28
                r4 = 0
                boolean r5 = r1.onCreatePanelMenu(r4, r0)     // Catch: java.lang.Throwable -> L28
                if (r5 == 0) goto L2a
                boolean r1 = r1.onPreparePanel(r4, r3, r0)     // Catch: java.lang.Throwable -> L28
                if (r1 != 0) goto L2d
                goto L2a
            L28:
                r0 = move-exception
                goto L33
            L2a:
                r0.clear()     // Catch: java.lang.Throwable -> L28
            L2d:
                if (r2 == 0) goto L32
                r2.startDispatchingItemsChanged()
            L32:
                return
            L33:
                if (r2 == 0) goto L38
                r2.startDispatchingItemsChanged()
            L38:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.ToolbarActionBar.AnonymousClass1.run():void");
        }
    };

    /* renamed from: i, reason: collision with root package name */
    public final Toolbar.OnMenuItemClickListener f481i;

    /* loaded from: classes.dex */
    public final class ActionMenuPresenterCallback implements MenuPresenter.Callback {

        /* renamed from: a, reason: collision with root package name */
        public boolean f484a;

        public ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean a(MenuBuilder menuBuilder) {
            ToolbarActionBar.this.f476b.onMenuOpened(108, menuBuilder);
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void onCloseMenu(MenuBuilder menuBuilder, boolean z2) {
            if (this.f484a) {
                return;
            }
            this.f484a = true;
            ToolbarActionBar toolbarActionBar = ToolbarActionBar.this;
            toolbarActionBar.f475a.n();
            toolbarActionBar.f476b.onPanelClosed(108, menuBuilder);
            this.f484a = false;
        }
    }

    /* loaded from: classes.dex */
    public final class MenuBuilderCallback implements MenuBuilder.Callback {
        public MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void onMenuModeChange(MenuBuilder menuBuilder) {
            ToolbarActionBar toolbarActionBar = ToolbarActionBar.this;
            boolean isOverflowMenuShowing = toolbarActionBar.f475a.f1268a.isOverflowMenuShowing();
            Window.Callback callback = toolbarActionBar.f476b;
            if (isOverflowMenuShowing) {
                callback.onPanelClosed(108, menuBuilder);
            } else if (callback.onPreparePanel(0, null, menuBuilder)) {
                callback.onMenuOpened(108, menuBuilder);
            }
        }
    }

    /* loaded from: classes.dex */
    public class ToolbarMenuCallback implements AppCompatDelegateImpl.ActionBarMenuCallback {
        public ToolbarMenuCallback() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback
        public final void a(int i2) {
            if (i2 == 0) {
                ToolbarActionBar toolbarActionBar = ToolbarActionBar.this;
                if (toolbarActionBar.d) {
                    return;
                }
                toolbarActionBar.f475a.f1278m = true;
                toolbarActionBar.d = true;
            }
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback
        public final View onCreatePanelView(int i2) {
            if (i2 == 0) {
                return new View(ToolbarActionBar.this.f475a.f1268a.getContext());
            }
            return null;
        }
    }

    public ToolbarActionBar(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        Toolbar.OnMenuItemClickListener onMenuItemClickListener = new Toolbar.OnMenuItemClickListener() { // from class: androidx.appcompat.app.ToolbarActionBar.2
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return ToolbarActionBar.this.f476b.onMenuItemSelected(0, menuItem);
            }
        };
        toolbar.getClass();
        ToolbarWidgetWrapper toolbarWidgetWrapper = new ToolbarWidgetWrapper(toolbar, false);
        this.f475a = toolbarWidgetWrapper;
        callback.getClass();
        this.f476b = callback;
        toolbarWidgetWrapper.f1277l = callback;
        toolbar.setOnMenuItemClickListener(onMenuItemClickListener);
        toolbarWidgetWrapper.setWindowTitle(charSequence);
        this.f477c = new ToolbarMenuCallback();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean f() {
        return this.f475a.f1268a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean g() {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.f475a;
        if (!toolbarWidgetWrapper.f1268a.hasExpandedActionView()) {
            return false;
        }
        toolbarWidgetWrapper.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void h(boolean z2) {
        if (z2 == this.f478f) {
            return;
        }
        this.f478f = z2;
        ArrayList arrayList = this.f479g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ActionBar.OnMenuVisibilityListener) arrayList.get(i2)).a();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int i() {
        return this.f475a.f1269b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context j() {
        return this.f475a.f1268a.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean k() {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.f475a;
        Toolbar toolbar = toolbarWidgetWrapper.f1268a;
        Runnable runnable = this.f480h;
        toolbar.removeCallbacks(runnable);
        Toolbar toolbar2 = toolbarWidgetWrapper.f1268a;
        WeakHashMap weakHashMap = ViewCompat.f18740a;
        toolbar2.postOnAnimation(runnable);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void l() {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void m() {
        this.f475a.f1268a.removeCallbacks(this.f480h);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean n(int i2, KeyEvent keyEvent) {
        Menu u2 = u();
        if (u2 == null) {
            return false;
        }
        u2.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return u2.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            p();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean p() {
        return this.f475a.f1268a.showOverflowMenu();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void q(boolean z2) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void r(boolean z2) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void s(CharSequence charSequence) {
        this.f475a.setWindowTitle(charSequence);
    }

    public final Menu u() {
        boolean z2 = this.e;
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.f475a;
        if (!z2) {
            toolbarWidgetWrapper.f1268a.setMenuCallbacks(new ActionMenuPresenterCallback(), new MenuBuilderCallback());
            this.e = true;
        }
        return toolbarWidgetWrapper.f1268a.getMenu();
    }
}
