package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import androidx.core.view.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes2.dex */
public class WindowDecorActionBar extends ActionBar implements ActionBarOverlayLayout.ActionBarVisibilityCallback {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f496y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f497z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f498a;

    /* renamed from: b, reason: collision with root package name */
    public Context f499b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f500c;
    public ActionBarContainer d;
    public DecorToolbar e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f501f;

    /* renamed from: g, reason: collision with root package name */
    public final View f502g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f503h;

    /* renamed from: i, reason: collision with root package name */
    public ActionModeImpl f504i;

    /* renamed from: j, reason: collision with root package name */
    public ActionModeImpl f505j;

    /* renamed from: k, reason: collision with root package name */
    public ActionMode.Callback f506k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f507l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f508m;

    /* renamed from: n, reason: collision with root package name */
    public int f509n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f510o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f511p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f512q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f513r;

    /* renamed from: s, reason: collision with root package name */
    public ViewPropertyAnimatorCompatSet f514s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f515t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f516u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewPropertyAnimatorListener f517v;
    public final ViewPropertyAnimatorListener w;
    public final ViewPropertyAnimatorUpdateListener x;

    /* renamed from: androidx.appcompat.app.WindowDecorActionBar$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends ViewPropertyAnimatorListenerAdapter {
        public AnonymousClass1() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd() {
            View view;
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.f510o && (view = windowDecorActionBar.f502g) != null) {
                view.setTranslationY(0.0f);
                windowDecorActionBar.d.setTranslationY(0.0f);
            }
            windowDecorActionBar.d.setVisibility(8);
            windowDecorActionBar.d.setTransitioning(false);
            windowDecorActionBar.f514s = null;
            ActionMode.Callback callback = windowDecorActionBar.f506k;
            if (callback != null) {
                callback.a(windowDecorActionBar.f505j);
                windowDecorActionBar.f505j = null;
                windowDecorActionBar.f506k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = windowDecorActionBar.f500c;
            if (actionBarOverlayLayout != null) {
                ViewCompat.y(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.WindowDecorActionBar$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends ViewPropertyAnimatorListenerAdapter {
        public AnonymousClass2() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd() {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            windowDecorActionBar.f514s = null;
            windowDecorActionBar.d.requestLayout();
        }
    }

    @RestrictTo
    /* loaded from: classes2.dex */
    public class ActionModeImpl extends ActionMode implements MenuBuilder.Callback {

        /* renamed from: c, reason: collision with root package name */
        public final Context f521c;
        public final MenuBuilder d;

        /* renamed from: f, reason: collision with root package name */
        public ActionMode.Callback f522f;

        /* renamed from: g, reason: collision with root package name */
        public WeakReference f523g;

        public ActionModeImpl(Context context, ActionMode.Callback callback) {
            this.f521c = context;
            this.f522f = callback;
            MenuBuilder defaultShowAsAction = new MenuBuilder(context).setDefaultShowAsAction(1);
            this.d = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void a() {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.f504i != this) {
                return;
            }
            if (windowDecorActionBar.f511p) {
                windowDecorActionBar.f505j = this;
                windowDecorActionBar.f506k = this.f522f;
            } else {
                this.f522f.a(this);
            }
            this.f522f = null;
            windowDecorActionBar.u(false);
            ActionBarContextView actionBarContextView = windowDecorActionBar.f501f;
            if (actionBarContextView.f835l == null) {
                actionBarContextView.g();
            }
            windowDecorActionBar.f500c.setHideOnContentScrollEnabled(windowDecorActionBar.f516u);
            windowDecorActionBar.f504i = null;
        }

        @Override // androidx.appcompat.view.ActionMode
        public final View b() {
            WeakReference weakReference = this.f523g;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.ActionMode
        public final MenuBuilder c() {
            return this.d;
        }

        @Override // androidx.appcompat.view.ActionMode
        public final MenuInflater d() {
            return new SupportMenuInflater(this.f521c);
        }

        @Override // androidx.appcompat.view.ActionMode
        public final CharSequence e() {
            return WindowDecorActionBar.this.f501f.getSubtitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public final CharSequence f() {
            return WindowDecorActionBar.this.f501f.getTitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void g() {
            if (WindowDecorActionBar.this.f504i != this) {
                return;
            }
            MenuBuilder menuBuilder = this.d;
            menuBuilder.stopDispatchingItemsChanged();
            try {
                this.f522f.d(this, menuBuilder);
            } finally {
                menuBuilder.startDispatchingItemsChanged();
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        public final boolean h() {
            return WindowDecorActionBar.this.f501f.f843t;
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void i(View view) {
            WindowDecorActionBar.this.f501f.setCustomView(view);
            this.f523g = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void j(int i2) {
            k(WindowDecorActionBar.this.f498a.getResources().getString(i2));
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void k(CharSequence charSequence) {
            WindowDecorActionBar.this.f501f.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void l(int i2) {
            m(WindowDecorActionBar.this.f498a.getResources().getString(i2));
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void m(CharSequence charSequence) {
            WindowDecorActionBar.this.f501f.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public final void n(boolean z2) {
            this.f595b = z2;
            WindowDecorActionBar.this.f501f.setTitleOptional(z2);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            ActionMode.Callback callback = this.f522f;
            if (callback != null) {
                return callback.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void onMenuModeChange(MenuBuilder menuBuilder) {
            if (this.f522f == null) {
                return;
            }
            g();
            WindowDecorActionBar.this.f501f.i();
        }
    }

    @RestrictTo
    /* loaded from: classes2.dex */
    public class TabImpl extends ActionBar.Tab {
        @Override // androidx.appcompat.app.ActionBar.Tab
        public final void a() {
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public final void b() {
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public final void c() {
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public final void d() {
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public final void e() {
            throw null;
        }
    }

    public WindowDecorActionBar(boolean z2, Activity activity) {
        new ArrayList();
        this.f508m = new ArrayList();
        this.f509n = 0;
        this.f510o = true;
        this.f513r = true;
        this.f517v = new AnonymousClass1();
        this.w = new AnonymousClass2();
        this.x = new ViewPropertyAnimatorUpdateListener() { // from class: androidx.appcompat.app.WindowDecorActionBar.3
            @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
            public final void a() {
                ((View) WindowDecorActionBar.this.d.getParent()).invalidate();
            }
        };
        View decorView = activity.getWindow().getDecorView();
        v(decorView);
        if (z2) {
            return;
        }
        this.f502g = decorView.findViewById(R.id.content);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void a() {
        if (this.f511p) {
            this.f511p = false;
            x(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void c(boolean z2) {
        this.f510o = z2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void d() {
        if (this.f511p) {
            return;
        }
        this.f511p = true;
        x(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void e() {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.f514s;
        if (viewPropertyAnimatorCompatSet != null) {
            viewPropertyAnimatorCompatSet.a();
            this.f514s = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean g() {
        DecorToolbar decorToolbar = this.e;
        if (decorToolbar == null || !decorToolbar.h()) {
            return false;
        }
        this.e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void h(boolean z2) {
        if (z2 == this.f507l) {
            return;
        }
        this.f507l = z2;
        ArrayList arrayList = this.f508m;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ActionBar.OnMenuVisibilityListener) arrayList.get(i2)).a();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int i() {
        return this.e.s();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context j() {
        if (this.f499b == null) {
            TypedValue typedValue = new TypedValue();
            this.f498a.getTheme().resolveAttribute(com.cooldev.gba.emulator.gameboy.R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f499b = new ContextThemeWrapper(this.f498a, i2);
            } else {
                this.f499b = this.f498a;
            }
        }
        return this.f499b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, androidx.appcompat.view.ActionBarPolicy] */
    @Override // androidx.appcompat.app.ActionBar
    public final void l() {
        Context context = this.f498a;
        new Object().f593a = context;
        w(context.getResources().getBoolean(com.cooldev.gba.emulator.gameboy.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean n(int i2, KeyEvent keyEvent) {
        MenuBuilder menuBuilder;
        ActionModeImpl actionModeImpl = this.f504i;
        if (actionModeImpl == null || (menuBuilder = actionModeImpl.d) == null) {
            return false;
        }
        menuBuilder.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuBuilder.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public final void onWindowVisibilityChanged(int i2) {
        this.f509n = i2;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void q(boolean z2) {
        if (this.f503h) {
            return;
        }
        int i2 = z2 ? 4 : 0;
        int s2 = this.e.s();
        this.f503h = true;
        this.e.i((i2 & 4) | (s2 & (-5)));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void r(boolean z2) {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet;
        this.f515t = z2;
        if (z2 || (viewPropertyAnimatorCompatSet = this.f514s) == null) {
            return;
        }
        viewPropertyAnimatorCompatSet.a();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void s(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final ActionMode t(ActionMode.Callback callback) {
        ActionModeImpl actionModeImpl = this.f504i;
        if (actionModeImpl != null) {
            actionModeImpl.a();
        }
        this.f500c.setHideOnContentScrollEnabled(false);
        this.f501f.g();
        ActionModeImpl actionModeImpl2 = new ActionModeImpl(this.f501f.getContext(), callback);
        MenuBuilder menuBuilder = actionModeImpl2.d;
        menuBuilder.stopDispatchingItemsChanged();
        try {
            if (!actionModeImpl2.f522f.b(actionModeImpl2, menuBuilder)) {
                return null;
            }
            this.f504i = actionModeImpl2;
            actionModeImpl2.g();
            this.f501f.e(actionModeImpl2);
            u(true);
            return actionModeImpl2;
        } finally {
            menuBuilder.startDispatchingItemsChanged();
        }
    }

    public final void u(boolean z2) {
        ViewPropertyAnimatorCompat k2;
        ViewPropertyAnimatorCompat h2;
        if (z2) {
            if (!this.f512q) {
                this.f512q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f500c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                x(false);
            }
        } else if (this.f512q) {
            this.f512q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f500c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            x(false);
        }
        if (!this.d.isLaidOut()) {
            if (z2) {
                this.e.r(4);
                this.f501f.setVisibility(0);
                return;
            } else {
                this.e.r(0);
                this.f501f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            h2 = this.e.k(4, 100L);
            k2 = this.f501f.h(0, 200L);
        } else {
            k2 = this.e.k(0, 200L);
            h2 = this.f501f.h(8, 100L);
        }
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = new ViewPropertyAnimatorCompatSet();
        ArrayList arrayList = viewPropertyAnimatorCompatSet.f639a;
        arrayList.add(h2);
        View view = (View) h2.f18764a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) k2.f18764a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(k2);
        viewPropertyAnimatorCompatSet.b();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, androidx.appcompat.view.ActionBarPolicy] */
    public final void v(View view) {
        DecorToolbar wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.cooldev.gba.emulator.gameboy.R.id.decor_content_parent);
        this.f500c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.cooldev.gba.emulator.gameboy.R.id.action_bar);
        if (findViewById instanceof DecorToolbar) {
            wrapper = (DecorToolbar) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f501f = (ActionBarContextView) view.findViewById(com.cooldev.gba.emulator.gameboy.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.cooldev.gba.emulator.gameboy.R.id.action_bar_container);
        this.d = actionBarContainer;
        DecorToolbar decorToolbar = this.e;
        if (decorToolbar == null || this.f501f == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f498a = decorToolbar.getContext();
        if ((this.e.s() & 4) != 0) {
            this.f503h = true;
        }
        Context context = this.f498a;
        ?? obj = new Object();
        obj.f593a = context;
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.e.o();
        w(obj.f593a.getResources().getBoolean(com.cooldev.gba.emulator.gameboy.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f498a.obtainStyledAttributes(null, androidx.appcompat.R.styleable.f311a, com.cooldev.gba.emulator.gameboy.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f500c;
            if (!actionBarOverlayLayout2.f851h) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f516u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ViewCompat.F(this.d, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void w(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            this.e.p();
        } else {
            this.e.p();
            this.d.setTabContainer(null);
        }
        this.e.j();
        this.e.m(false);
        this.f500c.setHasNonEmbeddedTabs(false);
    }

    public final void x(boolean z2) {
        int i2 = 0;
        boolean z3 = this.f512q || !this.f511p;
        ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener = this.x;
        View view = this.f502g;
        if (!z3) {
            if (this.f513r) {
                this.f513r = false;
                ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.f514s;
                if (viewPropertyAnimatorCompatSet != null) {
                    viewPropertyAnimatorCompatSet.a();
                }
                int i3 = this.f509n;
                ViewPropertyAnimatorListener viewPropertyAnimatorListener = this.f517v;
                if (i3 != 0 || (!this.f515t && !z2)) {
                    ((AnonymousClass1) viewPropertyAnimatorListener).onAnimationEnd();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new ViewPropertyAnimatorCompatSet();
                float f2 = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                ViewPropertyAnimatorCompat a2 = ViewCompat.a(this.d);
                a2.e(f2);
                View view2 = (View) a2.f18764a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(viewPropertyAnimatorUpdateListener != null ? new i(i2, viewPropertyAnimatorUpdateListener, view2) : null);
                }
                boolean z4 = viewPropertyAnimatorCompatSet2.e;
                ArrayList arrayList = viewPropertyAnimatorCompatSet2.f639a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f510o && view != null) {
                    ViewPropertyAnimatorCompat a3 = ViewCompat.a(view);
                    a3.e(f2);
                    if (!viewPropertyAnimatorCompatSet2.e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f496y;
                boolean z5 = viewPropertyAnimatorCompatSet2.e;
                if (!z5) {
                    viewPropertyAnimatorCompatSet2.f641c = accelerateInterpolator;
                }
                if (!z5) {
                    viewPropertyAnimatorCompatSet2.f640b = 250L;
                }
                ViewPropertyAnimatorListenerAdapter viewPropertyAnimatorListenerAdapter = (ViewPropertyAnimatorListenerAdapter) viewPropertyAnimatorListener;
                if (!z5) {
                    viewPropertyAnimatorCompatSet2.d = viewPropertyAnimatorListenerAdapter;
                }
                this.f514s = viewPropertyAnimatorCompatSet2;
                viewPropertyAnimatorCompatSet2.b();
                return;
            }
            return;
        }
        if (this.f513r) {
            return;
        }
        this.f513r = true;
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet3 = this.f514s;
        if (viewPropertyAnimatorCompatSet3 != null) {
            viewPropertyAnimatorCompatSet3.a();
        }
        this.d.setVisibility(0);
        int i4 = this.f509n;
        ViewPropertyAnimatorListener viewPropertyAnimatorListener2 = this.w;
        if (i4 == 0 && (this.f515t || z2)) {
            this.d.setTranslationY(0.0f);
            float f3 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.d.setTranslationY(f3);
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet4 = new ViewPropertyAnimatorCompatSet();
            ViewPropertyAnimatorCompat a4 = ViewCompat.a(this.d);
            a4.e(0.0f);
            View view3 = (View) a4.f18764a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(viewPropertyAnimatorUpdateListener != null ? new i(i2, viewPropertyAnimatorUpdateListener, view3) : null);
            }
            boolean z6 = viewPropertyAnimatorCompatSet4.e;
            ArrayList arrayList2 = viewPropertyAnimatorCompatSet4.f639a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f510o && view != null) {
                view.setTranslationY(f3);
                ViewPropertyAnimatorCompat a5 = ViewCompat.a(view);
                a5.e(0.0f);
                if (!viewPropertyAnimatorCompatSet4.e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f497z;
            boolean z7 = viewPropertyAnimatorCompatSet4.e;
            if (!z7) {
                viewPropertyAnimatorCompatSet4.f641c = decelerateInterpolator;
            }
            if (!z7) {
                viewPropertyAnimatorCompatSet4.f640b = 250L;
            }
            ViewPropertyAnimatorListenerAdapter viewPropertyAnimatorListenerAdapter2 = (ViewPropertyAnimatorListenerAdapter) viewPropertyAnimatorListener2;
            if (!z7) {
                viewPropertyAnimatorCompatSet4.d = viewPropertyAnimatorListenerAdapter2;
            }
            this.f514s = viewPropertyAnimatorCompatSet4;
            viewPropertyAnimatorCompatSet4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.f510o && view != null) {
                view.setTranslationY(0.0f);
            }
            ((AnonymousClass2) viewPropertyAnimatorListener2).onAnimationEnd();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f500c;
        if (actionBarOverlayLayout != null) {
            ViewCompat.y(actionBarOverlayLayout);
        }
    }

    public WindowDecorActionBar(Dialog dialog) {
        new ArrayList();
        this.f508m = new ArrayList();
        this.f509n = 0;
        this.f510o = true;
        this.f513r = true;
        this.f517v = new AnonymousClass1();
        this.w = new AnonymousClass2();
        this.x = new ViewPropertyAnimatorUpdateListener() { // from class: androidx.appcompat.app.WindowDecorActionBar.3
            @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
            public final void a() {
                ((View) WindowDecorActionBar.this.d.getParent()).invalidate();
            }
        };
        v(dialog.getWindow().getDecorView());
    }
}
