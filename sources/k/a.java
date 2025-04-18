package k;

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

/* loaded from: classes.dex */
public final class a implements i0.b {
    public CharSequence a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f20027b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f20028c;

    /* renamed from: d, reason: collision with root package name */
    public char f20029d;

    /* renamed from: f, reason: collision with root package name */
    public char f20031f;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f20033h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f20034i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f20035j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f20036k;

    /* renamed from: e, reason: collision with root package name */
    public int f20030e = 4096;

    /* renamed from: g, reason: collision with root package name */
    public int f20032g = 4096;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f20037l = null;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f20038m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20039n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f20040o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f20041p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f20034i = context;
        this.a = charSequence;
    }

    @Override // i0.b
    public final i0.b a(r rVar) {
        throw new UnsupportedOperationException();
    }

    @Override // i0.b
    public final r b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f20033h;
        if (drawable != null) {
            if (this.f20039n || this.f20040o) {
                this.f20033h = drawable;
                Drawable mutate = drawable.mutate();
                this.f20033h = mutate;
                if (this.f20039n) {
                    h0.a.h(mutate, this.f20037l);
                }
                if (this.f20040o) {
                    h0.a.i(this.f20033h, this.f20038m);
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

    @Override // i0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f20032g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f20031f;
    }

    @Override // i0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f20035j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f20033h;
    }

    @Override // i0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f20037l;
    }

    @Override // i0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f20038m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f20028c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // i0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f20030e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f20029d;
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
        return this.a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f20027b;
        return charSequence != null ? charSequence : this.a;
    }

    @Override // i0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f20036k;
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
        return (this.f20041p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f20041p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f20041p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f20041p & 8) == 0;
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
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f20031f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f20041p = (z10 ? 1 : 0) | (this.f20041p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f20041p = (z10 ? 2 : 0) | (this.f20041p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f20035j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f20041p = (z10 ? 16 : 0) | (this.f20041p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f20033h = drawable;
        c();
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f20037l = colorStateList;
        this.f20039n = true;
        c();
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f20038m = mode;
        this.f20040o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f20028c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f20029d = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f20029d = c10;
        this.f20031f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f20027b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f20036k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        this.f20041p = (this.f20041p & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f20031f = Character.toLowerCase(c10);
        this.f20032g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final i0.b setContentDescription(CharSequence charSequence) {
        this.f20035j = charSequence;
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f20029d = c10;
        this.f20030e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.a = this.f20034i.getResources().getString(i10);
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final i0.b setTooltipText(CharSequence charSequence) {
        this.f20036k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f20033h = d0.h.getDrawable(this.f20034i, i10);
        c();
        return this;
    }

    @Override // i0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f20029d = c10;
        this.f20030e = KeyEvent.normalizeMetaState(i10);
        this.f20031f = Character.toLowerCase(c11);
        this.f20032g = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
