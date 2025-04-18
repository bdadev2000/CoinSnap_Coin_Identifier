package androidx.compose.ui.focus;

import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes3.dex */
public final class FocusInteropUtils_androidKt {
    public static final Rect a(View view) {
        int[] iArr = FocusInteropUtils.f14835a;
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        return new Rect(i2, iArr[1], i2 + view.getWidth(), iArr[1] + view.getHeight());
    }

    public static final boolean b(View view, Integer num, android.graphics.Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if ((!viewGroup.isFocusable() || view.hasFocus()) && !(view instanceof AndroidComposeView)) {
            if (rect != null) {
                View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
                return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
            return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
        }
        return view.requestFocus(num.intValue(), rect);
    }

    public static final Integer c(int i2) {
        if (FocusDirection.a(i2, 5)) {
            return 33;
        }
        if (FocusDirection.a(i2, 6)) {
            return 130;
        }
        if (FocusDirection.a(i2, 3)) {
            return 17;
        }
        if (FocusDirection.a(i2, 4)) {
            return 66;
        }
        if (FocusDirection.a(i2, 1)) {
            return 2;
        }
        return FocusDirection.a(i2, 2) ? 1 : null;
    }

    public static final FocusDirection d(int i2) {
        if (i2 == 1) {
            return new FocusDirection(2);
        }
        if (i2 == 2) {
            return new FocusDirection(1);
        }
        if (i2 == 17) {
            return new FocusDirection(3);
        }
        if (i2 == 33) {
            return new FocusDirection(5);
        }
        if (i2 == 66) {
            return new FocusDirection(4);
        }
        if (i2 != 130) {
            return null;
        }
        return new FocusDirection(6);
    }
}
