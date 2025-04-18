package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class w extends d implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    public final i0.b f20180d;

    /* renamed from: e, reason: collision with root package name */
    public Method f20181e;

    public w(Context context, i0.b bVar) {
        super(context);
        if (bVar != null) {
            this.f20180d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f20180d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f20180d.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        r b3 = this.f20180d.b();
        if (b3 instanceof r) {
            return b3.f20174b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f20180d.getActionView();
        if (actionView instanceof t) {
            return (View) ((t) actionView).f20177b;
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f20180d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f20180d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f20180d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f20180d.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f20180d.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f20180d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f20180d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f20180d.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f20180d.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f20180d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f20180d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f20180d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f20180d.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f20180d.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f20180d.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f20180d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f20180d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f20180d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f20180d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f20180d.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f20180d.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f20180d.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f20180d.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        s sVar = new s(this, (Context) this.a, actionProvider);
        if (actionProvider == null) {
            sVar = null;
        }
        this.f20180d.a(sVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new t(view);
        }
        this.f20180d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f20180d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f20180d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f20180d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f20180d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f20180d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f20180d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f20180d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f20180d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f20180d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f20180d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        u uVar;
        if (onActionExpandListener != null) {
            uVar = new u(this, onActionExpandListener);
        } else {
            uVar = null;
        }
        this.f20180d.setOnActionExpandListener(uVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        v vVar;
        if (onMenuItemClickListener != null) {
            vVar = new v(this, onMenuItemClickListener);
        } else {
            vVar = null;
        }
        this.f20180d.setOnMenuItemClickListener(vVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f20180d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        this.f20180d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        this.f20180d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f20180d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f20180d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f20180d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        return this.f20180d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f20180d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f20180d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f20180d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f20180d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f20180d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        i0.b bVar = this.f20180d;
        bVar.setActionView(i10);
        View actionView = bVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            bVar.setActionView(new t(actionView));
        }
        return this;
    }
}
