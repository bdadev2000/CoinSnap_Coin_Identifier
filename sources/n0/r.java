package n0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* loaded from: classes.dex */
public abstract class r {
    public static int a(MenuItem menuItem) {
        int alphabeticModifiers;
        alphabeticModifiers = menuItem.getAlphabeticModifiers();
        return alphabeticModifiers;
    }

    public static CharSequence b(MenuItem menuItem) {
        CharSequence contentDescription;
        contentDescription = menuItem.getContentDescription();
        return contentDescription;
    }

    public static ColorStateList c(MenuItem menuItem) {
        ColorStateList iconTintList;
        iconTintList = menuItem.getIconTintList();
        return iconTintList;
    }

    public static PorterDuff.Mode d(MenuItem menuItem) {
        PorterDuff.Mode iconTintMode;
        iconTintMode = menuItem.getIconTintMode();
        return iconTintMode;
    }

    public static int e(MenuItem menuItem) {
        int numericModifiers;
        numericModifiers = menuItem.getNumericModifiers();
        return numericModifiers;
    }

    public static CharSequence f(MenuItem menuItem) {
        CharSequence tooltipText;
        tooltipText = menuItem.getTooltipText();
        return tooltipText;
    }

    public static MenuItem g(MenuItem menuItem, char c10, int i10) {
        MenuItem alphabeticShortcut;
        alphabeticShortcut = menuItem.setAlphabeticShortcut(c10, i10);
        return alphabeticShortcut;
    }

    public static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
        MenuItem contentDescription;
        contentDescription = menuItem.setContentDescription(charSequence);
        return contentDescription;
    }

    public static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
        MenuItem iconTintList;
        iconTintList = menuItem.setIconTintList(colorStateList);
        return iconTintList;
    }

    public static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
        MenuItem iconTintMode;
        iconTintMode = menuItem.setIconTintMode(mode);
        return iconTintMode;
    }

    public static MenuItem k(MenuItem menuItem, char c10, int i10) {
        MenuItem numericShortcut;
        numericShortcut = menuItem.setNumericShortcut(c10, i10);
        return numericShortcut;
    }

    public static MenuItem l(MenuItem menuItem, char c10, char c11, int i10, int i11) {
        MenuItem shortcut;
        shortcut = menuItem.setShortcut(c10, c11, i10, i11);
        return shortcut;
    }

    public static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
        MenuItem tooltipText;
        tooltipText = menuItem.setTooltipText(charSequence);
        return tooltipText;
    }
}
