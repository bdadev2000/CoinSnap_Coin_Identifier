package androidx.appcompat.widget;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class f2 {
    public static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
        return popupWindow.getMaxAvailableHeight(view, i10, z10);
    }
}
