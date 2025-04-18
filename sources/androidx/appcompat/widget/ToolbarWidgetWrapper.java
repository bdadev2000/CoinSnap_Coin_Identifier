package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.ActionMenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

@RestrictTo
/* loaded from: classes4.dex */
public class ToolbarWidgetWrapper implements DecorToolbar {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f1268a;

    /* renamed from: b, reason: collision with root package name */
    public int f1269b;

    /* renamed from: c, reason: collision with root package name */
    public ScrollingTabContainerView f1270c;
    public final View d;
    public Drawable e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1271f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f1272g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1273h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f1274i;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f1275j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1276k;

    /* renamed from: l, reason: collision with root package name */
    public Window.Callback f1277l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1278m;

    /* renamed from: n, reason: collision with root package name */
    public ActionMenuPresenter f1279n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1280o;

    /* renamed from: p, reason: collision with root package name */
    public final Drawable f1281p;

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z2) {
        Drawable drawable;
        this.f1280o = 0;
        this.f1268a = toolbar;
        this.f1274i = toolbar.getTitle();
        this.f1275j = toolbar.getSubtitle();
        this.f1273h = this.f1274i != null;
        this.f1272g = toolbar.getNavigationIcon();
        TintTypedArray e = TintTypedArray.e(toolbar.getContext(), null, R.styleable.f311a, com.cooldev.gba.emulator.gameboy.R.attr.actionBarStyle);
        int i2 = 15;
        this.f1281p = e.b(15);
        if (z2) {
            TypedArray typedArray = e.f1237b;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f1273h = true;
                this.f1274i = text;
                if ((this.f1269b & 8) != 0) {
                    Toolbar toolbar2 = this.f1268a;
                    toolbar2.setTitle(text);
                    if (this.f1273h) {
                        ViewCompat.C(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f1275j = text2;
                if ((this.f1269b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable b2 = e.b(20);
            if (b2 != null) {
                this.f1271f = b2;
                w();
            }
            Drawable b3 = e.b(17);
            if (b3 != null) {
                setIcon(b3);
            }
            if (this.f1272g == null && (drawable = this.f1281p) != null) {
                this.f1272g = drawable;
                int i3 = this.f1269b & 4;
                Toolbar toolbar3 = this.f1268a;
                if (i3 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            i(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.d;
                if (view != null && (this.f1269b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.d = inflate;
                if (inflate != null && (this.f1269b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                i(this.f1269b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                toolbar.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                toolbar.setTitleTextAppearance(toolbar.getContext(), resourceId2);
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                toolbar.setSubtitleTextAppearance(toolbar.getContext(), resourceId3);
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f1281p = toolbar.getNavigationIcon();
            } else {
                i2 = 11;
            }
            this.f1269b = i2;
        }
        e.f();
        if (com.cooldev.gba.emulator.gameboy.R.string.abc_action_bar_up_description != this.f1280o) {
            this.f1280o = com.cooldev.gba.emulator.gameboy.R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                u(this.f1280o);
            }
        }
        this.f1276k = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.widget.ToolbarWidgetWrapper.1

            /* renamed from: a, reason: collision with root package name */
            public final ActionMenuItem f1282a;

            {
                this.f1282a = new ActionMenuItem(ToolbarWidgetWrapper.this.f1268a.getContext(), ToolbarWidgetWrapper.this.f1274i);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ToolbarWidgetWrapper toolbarWidgetWrapper = ToolbarWidgetWrapper.this;
                Window.Callback callback = toolbarWidgetWrapper.f1277l;
                if (callback == null || !toolbarWidgetWrapper.f1278m) {
                    return;
                }
                callback.onMenuItemSelected(0, this.f1282a);
            }
        });
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean a() {
        return this.f1268a.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void b(MenuBuilder menuBuilder, MenuPresenter.Callback callback) {
        ActionMenuPresenter actionMenuPresenter = this.f1279n;
        Toolbar toolbar = this.f1268a;
        if (actionMenuPresenter == null) {
            ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(toolbar.getContext());
            this.f1279n = actionMenuPresenter2;
            actionMenuPresenter2.f682j = com.cooldev.gba.emulator.gameboy.R.id.action_menu_presenter;
        }
        ActionMenuPresenter actionMenuPresenter3 = this.f1279n;
        actionMenuPresenter3.f678f = callback;
        toolbar.setMenu(menuBuilder, actionMenuPresenter3);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean c() {
        return this.f1268a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void collapseActionView() {
        this.f1268a.collapseActionView();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean d() {
        return this.f1268a.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean e() {
        return this.f1268a.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void f() {
        this.f1278m = true;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean g() {
        return this.f1268a.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final Context getContext() {
        return this.f1268a.getContext();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final CharSequence getTitle() {
        return this.f1268a.getTitle();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean h() {
        return this.f1268a.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void i(int i2) {
        View view;
        int i3 = this.f1269b ^ i2;
        this.f1269b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    v();
                }
                int i4 = this.f1269b & 4;
                Toolbar toolbar = this.f1268a;
                if (i4 != 0) {
                    Drawable drawable = this.f1272g;
                    if (drawable == null) {
                        drawable = this.f1281p;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                w();
            }
            int i5 = i3 & 8;
            Toolbar toolbar2 = this.f1268a;
            if (i5 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.f1274i);
                    toolbar2.setSubtitle(this.f1275j);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.d) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void j() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final ViewPropertyAnimatorCompat k(final int i2, long j2) {
        ViewPropertyAnimatorCompat a2 = ViewCompat.a(this.f1268a);
        a2.a(i2 == 0 ? 1.0f : 0.0f);
        a2.c(j2);
        a2.d(new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.widget.ToolbarWidgetWrapper.2

            /* renamed from: a, reason: collision with root package name */
            public boolean f1284a = false;

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public final void a() {
                ToolbarWidgetWrapper.this.f1268a.setVisibility(0);
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public final void onAnimationCancel() {
                this.f1284a = true;
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public final void onAnimationEnd() {
                if (this.f1284a) {
                    return;
                }
                ToolbarWidgetWrapper.this.f1268a.setVisibility(i2);
            }
        });
        return a2;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void l() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void m(boolean z2) {
        this.f1268a.setCollapsible(z2);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void n() {
        this.f1268a.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void o() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void p() {
        ScrollingTabContainerView scrollingTabContainerView = this.f1270c;
        if (scrollingTabContainerView != null) {
            ViewParent parent = scrollingTabContainerView.getParent();
            Toolbar toolbar = this.f1268a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1270c);
            }
        }
        this.f1270c = null;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void q(int i2) {
        this.f1271f = i2 != 0 ? AppCompatResources.a(this.f1268a.getContext(), i2) : null;
        w();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void r(int i2) {
        this.f1268a.setVisibility(i2);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final int s() {
        return this.f1269b;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setIcon(int i2) {
        setIcon(i2 != 0 ? AppCompatResources.a(this.f1268a.getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setWindowCallback(Window.Callback callback) {
        this.f1277l = callback;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.f1273h) {
            return;
        }
        this.f1274i = charSequence;
        if ((this.f1269b & 8) != 0) {
            Toolbar toolbar = this.f1268a;
            toolbar.setTitle(charSequence);
            if (this.f1273h) {
                ViewCompat.C(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void u(int i2) {
        this.f1276k = i2 == 0 ? null : this.f1268a.getContext().getString(i2);
        v();
    }

    public final void v() {
        if ((this.f1269b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f1276k);
            Toolbar toolbar = this.f1268a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f1280o);
            } else {
                toolbar.setNavigationContentDescription(this.f1276k);
            }
        }
    }

    public final void w() {
        Drawable drawable;
        int i2 = this.f1269b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f1271f;
            if (drawable == null) {
                drawable = this.e;
            }
        } else {
            drawable = this.e;
        }
        this.f1268a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setIcon(Drawable drawable) {
        this.e = drawable;
        w();
    }
}
