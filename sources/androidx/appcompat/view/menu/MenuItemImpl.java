package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;

@RestrictTo
/* loaded from: classes2.dex */
public final class MenuItemImpl implements SupportMenuItem {
    public ActionProvider A;
    public MenuItem.OnActionExpandListener B;
    public ContextMenu.ContextMenuInfo D;

    /* renamed from: a, reason: collision with root package name */
    public final int f751a;

    /* renamed from: b, reason: collision with root package name */
    public final int f752b;

    /* renamed from: c, reason: collision with root package name */
    public final int f753c;
    public final int d;
    public CharSequence e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f754f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f755g;

    /* renamed from: h, reason: collision with root package name */
    public char f756h;

    /* renamed from: j, reason: collision with root package name */
    public char f758j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f760l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuBuilder f762n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuBuilder f763o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f764p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f765q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f766r;

    /* renamed from: y, reason: collision with root package name */
    public int f771y;

    /* renamed from: z, reason: collision with root package name */
    public View f772z;

    /* renamed from: i, reason: collision with root package name */
    public int f757i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f759k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f761m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f767s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f768t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f769u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f770v = false;
    public boolean w = false;
    public int x = 16;
    public boolean C = false;

    public MenuItemImpl(MenuBuilder menuBuilder, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f762n = menuBuilder;
        this.f751a = i3;
        this.f752b = i2;
        this.f753c = i4;
        this.d = i5;
        this.e = charSequence;
        this.f771y = i6;
    }

    public static void c(String str, int i2, int i3, StringBuilder sb) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final ActionProvider a() {
        return this.A;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public final SupportMenuItem b(ActionProvider actionProvider) {
        ActionProvider actionProvider2 = this.A;
        if (actionProvider2 != null) {
            actionProvider2.f18690b = null;
            actionProvider2.f18689a = null;
        }
        this.f772z = null;
        this.A = actionProvider;
        this.f762n.onItemsChanged(true);
        ActionProvider actionProvider3 = this.A;
        if (actionProvider3 != null) {
            actionProvider3.h(new ActionProvider.VisibilityListener() { // from class: androidx.appcompat.view.menu.MenuItemImpl.1
                @Override // androidx.core.view.ActionProvider.VisibilityListener
                public final void a() {
                    MenuItemImpl menuItemImpl = MenuItemImpl.this;
                    menuItemImpl.f762n.onItemVisibleChanged(menuItemImpl);
                }
            });
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f771y & 8) == 0) {
            return false;
        }
        if (this.f772z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f762n.collapseItemActionView(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.w && (this.f769u || this.f770v)) {
            drawable = drawable.mutate();
            if (this.f769u) {
                DrawableCompat.j(drawable, this.f767s);
            }
            if (this.f770v) {
                DrawableCompat.k(drawable, this.f768t);
            }
            this.w = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProvider actionProvider;
        if ((this.f771y & 8) == 0) {
            return false;
        }
        if (this.f772z == null && (actionProvider = this.A) != null) {
            this.f772z = actionProvider.d(this);
        }
        return this.f772z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f762n.expandItemActionView(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.x & 32) == 32;
    }

    public final void g(boolean z2) {
        this.x = (z2 ? 4 : 0) | (this.x & (-5));
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f772z;
        if (view != null) {
            return view;
        }
        ActionProvider actionProvider = this.A;
        if (actionProvider == null) {
            return null;
        }
        View d = actionProvider.d(this);
        this.f772z = d;
        return d;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f759k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f758j;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f765q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f752b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f760l;
        if (drawable != null) {
            return d(drawable);
        }
        if (this.f761m == 0) {
            return null;
        }
        Drawable a2 = AppCompatResources.a(this.f762n.getContext(), this.f761m);
        this.f761m = 0;
        this.f760l = a2;
        return d(a2);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f767s;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f768t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f755g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f751a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f757i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f756h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f753c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f763o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f754f;
        return charSequence != null ? charSequence : this.e;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f766r;
    }

    public final void h(boolean z2) {
        if (z2) {
            this.x |= 32;
        } else {
            this.x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f763o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProvider actionProvider = this.A;
        return (actionProvider == null || !actionProvider.g()) ? (this.x & 8) == 0 : (this.x & 8) == 0 && this.A.b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.f772z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f751a) > 0) {
            view.setId(i2);
        }
        this.f762n.onItemActionRequestChanged(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f758j == c2) {
            return this;
        }
        this.f758j = Character.toLowerCase(c2);
        this.f762n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.x;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.x = i3;
        if (i2 != i3) {
            this.f762n.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i2 = this.x;
        if ((i2 & 4) != 0) {
            this.f762n.setExclusiveItemChecked(this);
        } else {
            int i3 = (z2 ? 2 : 0) | (i2 & (-3));
            this.x = i3;
            if (i2 != i3) {
                this.f762n.onItemsChanged(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.x |= 16;
        } else {
            this.x &= -17;
        }
        this.f762n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f761m = 0;
        this.f760l = drawable;
        this.w = true;
        this.f762n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f767s = colorStateList;
        this.f769u = true;
        this.w = true;
        this.f762n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f768t = mode;
        this.f770v = true;
        this.w = true;
        this.f762n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f755g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f756h == c2) {
            return this;
        }
        this.f756h = c2;
        this.f762n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f764p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f756h = c2;
        this.f758j = Character.toLowerCase(c3);
        this.f762n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f771y = i2;
        this.f762n.onItemActionRequestChanged(this);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.f762n.onItemsChanged(false);
        SubMenuBuilder subMenuBuilder = this.f763o;
        if (subMenuBuilder != null) {
            subMenuBuilder.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f754f = charSequence;
        this.f762n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i2 = this.x;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.x = i3;
        if (i2 != i3) {
            this.f762n.onItemVisibleChanged(this);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f765q = charSequence;
        this.f762n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f760l = null;
        this.f761m = i2;
        this.w = true;
        this.f762n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f756h == c2 && this.f757i == i2) {
            return this;
        }
        this.f756h = c2;
        this.f757i = KeyEvent.normalizeMetaState(i2);
        this.f762n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f766r = charSequence;
        this.f762n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f758j == c2 && this.f759k == i2) {
            return this;
        }
        this.f758j = Character.toLowerCase(c2);
        this.f759k = KeyEvent.normalizeMetaState(i2);
        this.f762n.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f756h = c2;
        this.f757i = KeyEvent.normalizeMetaState(i2);
        this.f758j = Character.toLowerCase(c3);
        this.f759k = KeyEvent.normalizeMetaState(i3);
        this.f762n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f762n.getContext().getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i3;
        Context context = this.f762n.getContext();
        View inflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.f772z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i3 = this.f751a) > 0) {
            inflate.setId(i3);
        }
        this.f762n.onItemActionRequestChanged(this);
        return this;
    }
}
