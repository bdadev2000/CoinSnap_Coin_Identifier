package androidx.core.widget;

import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public final class PopupWindowCompat {

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api23Impl {
        @DoNotInline
        public static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @DoNotInline
        public static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @DoNotInline
        public static void c(PopupWindow popupWindow, boolean z2) {
            popupWindow.setOverlapAnchor(z2);
        }

        @DoNotInline
        public static void d(PopupWindow popupWindow, int i2) {
            popupWindow.setWindowLayoutType(i2);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z2) {
        Api23Impl.c(popupWindow, z2);
    }

    public static void b(PopupWindow popupWindow, int i2) {
        Api23Impl.d(popupWindow, i2);
    }
}
