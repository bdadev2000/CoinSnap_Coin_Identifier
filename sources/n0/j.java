package n0;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j {
    public static DisplayCutout a(Rect rect, List<Rect> list) {
        l0.d.A();
        return l0.d.f(rect, list);
    }

    public static List<Rect> b(DisplayCutout displayCutout) {
        List<Rect> boundingRects;
        boundingRects = displayCutout.getBoundingRects();
        return boundingRects;
    }

    public static int c(DisplayCutout displayCutout) {
        int safeInsetBottom;
        safeInsetBottom = displayCutout.getSafeInsetBottom();
        return safeInsetBottom;
    }

    public static int d(DisplayCutout displayCutout) {
        int safeInsetLeft;
        safeInsetLeft = displayCutout.getSafeInsetLeft();
        return safeInsetLeft;
    }

    public static int e(DisplayCutout displayCutout) {
        int safeInsetRight;
        safeInsetRight = displayCutout.getSafeInsetRight();
        return safeInsetRight;
    }

    public static int f(DisplayCutout displayCutout) {
        int safeInsetTop;
        safeInsetTop = displayCutout.getSafeInsetTop();
        return safeInsetTop;
    }
}
