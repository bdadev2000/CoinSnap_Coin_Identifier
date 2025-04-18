package n0;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class h1 {
    public static int a(ViewConfiguration viewConfiguration) {
        int scaledHoverSlop;
        scaledHoverSlop = viewConfiguration.getScaledHoverSlop();
        return scaledHoverSlop;
    }

    public static boolean b(ViewConfiguration viewConfiguration) {
        boolean shouldShowMenuShortcutsWhenKeyboardPresent;
        shouldShowMenuShortcutsWhenKeyboardPresent = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        return shouldShowMenuShortcutsWhenKeyboardPresent;
    }
}
