package Z;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class l {
    public static boolean a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(PopupWindow popupWindow, boolean z8) {
        popupWindow.setOverlapAnchor(z8);
    }

    public static void d(PopupWindow popupWindow, int i9) {
        popupWindow.setWindowLayoutType(i9);
    }
}
