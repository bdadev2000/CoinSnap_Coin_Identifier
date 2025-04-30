package N;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import p.ActionProviderVisibilityListenerC2536o;

/* loaded from: classes.dex */
public interface a extends MenuItem {
    a a(ActionProviderVisibilityListenerC2536o actionProviderVisibilityListenerC2536o);

    ActionProviderVisibilityListenerC2536o b();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c9, int i9);

    @Override // android.view.MenuItem
    a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c9, int i9);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c9, char c10, int i9, int i10);

    @Override // android.view.MenuItem
    a setTooltipText(CharSequence charSequence);
}
