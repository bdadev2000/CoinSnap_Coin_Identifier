package p;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2522a implements N.a {
    public CharSequence b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f22050c;

    /* renamed from: d, reason: collision with root package name */
    public Intent f22051d;

    /* renamed from: f, reason: collision with root package name */
    public char f22052f;

    /* renamed from: h, reason: collision with root package name */
    public char f22054h;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f22056j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f22057k;
    public CharSequence l;
    public CharSequence m;

    /* renamed from: g, reason: collision with root package name */
    public int f22053g = 4096;

    /* renamed from: i, reason: collision with root package name */
    public int f22055i = 4096;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f22058n = null;

    /* renamed from: o, reason: collision with root package name */
    public PorterDuff.Mode f22059o = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f22060p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f22061q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f22062r = 16;

    public C2522a(Context context, CharSequence charSequence) {
        this.f22057k = context;
        this.b = charSequence;
    }

    @Override // N.a
    public final N.a a(ActionProviderVisibilityListenerC2536o actionProviderVisibilityListenerC2536o) {
        throw new UnsupportedOperationException();
    }

    @Override // N.a
    public final ActionProviderVisibilityListenerC2536o b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f22056j;
        if (drawable != null) {
            if (this.f22060p || this.f22061q) {
                this.f22056j = drawable;
                Drawable mutate = drawable.mutate();
                this.f22056j = mutate;
                if (this.f22060p) {
                    M.a.h(mutate, this.f22058n);
                }
                if (this.f22061q) {
                    M.a.i(this.f22056j, this.f22059o);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // N.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f22055i;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f22054h;
    }

    @Override // N.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.l;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f22056j;
    }

    @Override // N.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f22058n;
    }

    @Override // N.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f22059o;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f22051d;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // N.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f22053g;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f22052f;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f22050c;
        if (charSequence == null) {
            return this.b;
        }
        return charSequence;
    }

    @Override // N.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f22062r & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f22062r & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f22062r & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.f22062r & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9) {
        this.f22054h = Character.toLowerCase(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z8) {
        this.f22062r = (z8 ? 1 : 0) | (this.f22062r & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z8) {
        int i9;
        int i10 = this.f22062r & (-3);
        if (z8) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        this.f22062r = i9 | i10;
        return this;
    }

    @Override // N.a, android.view.MenuItem
    public final N.a setContentDescription(CharSequence charSequence) {
        this.l = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z8) {
        int i9;
        int i10 = this.f22062r & (-17);
        if (z8) {
            i9 = 16;
        } else {
            i9 = 0;
        }
        this.f22062r = i9 | i10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f22056j = drawable;
        c();
        return this;
    }

    @Override // N.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f22058n = colorStateList;
        this.f22060p = true;
        c();
        return this;
    }

    @Override // N.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f22059o = mode;
        this.f22061q = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f22051d = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9) {
        this.f22052f = c9;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10) {
        this.f22052f = c9;
        this.f22054h = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f22050c = charSequence;
        return this;
    }

    @Override // N.a, android.view.MenuItem
    public final N.a setTooltipText(CharSequence charSequence) {
        this.m = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z8) {
        int i9 = 8;
        int i10 = this.f22062r & 8;
        if (z8) {
            i9 = 0;
        }
        this.f22062r = i10 | i9;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // N.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9, int i9) {
        this.f22054h = Character.toLowerCase(c9);
        this.f22055i = KeyEvent.normalizeMetaState(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.l = charSequence;
        return this;
    }

    @Override // N.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9, int i9) {
        this.f22052f = c9;
        this.f22053g = KeyEvent.normalizeMetaState(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i9) {
        this.b = this.f22057k.getResources().getString(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.m = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i9) {
        this.f22056j = I.h.getDrawable(this.f22057k, i9);
        c();
        return this;
    }

    @Override // N.a, android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10, int i9, int i10) {
        this.f22052f = c9;
        this.f22053g = KeyEvent.normalizeMetaState(i9);
        this.f22054h = Character.toLowerCase(c10);
        this.f22055i = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i9) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i9) {
        return this;
    }
}
