package p;

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
public final class s extends U1.b implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    public final N.a f22156d;

    /* renamed from: f, reason: collision with root package name */
    public Method f22157f;

    public s(Context context, N.a aVar) {
        super(context);
        if (aVar != null) {
            this.f22156d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f22156d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f22156d.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        ActionProviderVisibilityListenerC2536o b = this.f22156d.b();
        if (b instanceof ActionProviderVisibilityListenerC2536o) {
            return b.f22152c;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f22156d.getActionView();
        if (actionView instanceof p) {
            return (View) ((p) actionView).b;
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f22156d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f22156d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f22156d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f22156d.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f22156d.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f22156d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f22156d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f22156d.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f22156d.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f22156d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f22156d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f22156d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f22156d.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f22156d.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f22156d.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f22156d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f22156d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f22156d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f22156d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f22156d.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f22156d.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f22156d.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f22156d.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProviderVisibilityListenerC2536o actionProviderVisibilityListenerC2536o = new ActionProviderVisibilityListenerC2536o(this, (Context) this.b, actionProvider);
        if (actionProvider == null) {
            actionProviderVisibilityListenerC2536o = null;
        }
        this.f22156d.a(actionProviderVisibilityListenerC2536o);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new p(view);
        }
        this.f22156d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9) {
        this.f22156d.setAlphabeticShortcut(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z8) {
        this.f22156d.setCheckable(z8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z8) {
        this.f22156d.setChecked(z8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f22156d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z8) {
        this.f22156d.setEnabled(z8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f22156d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f22156d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f22156d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f22156d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9) {
        this.f22156d.setNumericShortcut(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        q qVar;
        if (onActionExpandListener != null) {
            qVar = new q(this, onActionExpandListener);
        } else {
            qVar = null;
        }
        this.f22156d.setOnActionExpandListener(qVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        r rVar;
        if (onMenuItemClickListener != null) {
            rVar = new r(this, onMenuItemClickListener);
        } else {
            rVar = null;
        }
        this.f22156d.setOnMenuItemClickListener(rVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10) {
        this.f22156d.setShortcut(c9, c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i9) {
        this.f22156d.setShowAsAction(i9);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i9) {
        this.f22156d.setShowAsActionFlags(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f22156d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f22156d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f22156d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z8) {
        return this.f22156d.setVisible(z8);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9, int i9) {
        this.f22156d.setAlphabeticShortcut(c9, i9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i9) {
        this.f22156d.setIcon(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9, int i9) {
        this.f22156d.setNumericShortcut(c9, i9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10, int i9, int i10) {
        this.f22156d.setShortcut(c9, c10, i9, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i9) {
        this.f22156d.setTitle(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i9) {
        N.a aVar = this.f22156d;
        aVar.setActionView(i9);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new p(actionView));
        }
        return this;
    }
}
