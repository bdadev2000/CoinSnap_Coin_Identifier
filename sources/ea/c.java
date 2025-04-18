package ea;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes3.dex */
public abstract class c {
    public static final ThreadLocal a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f17234b = new ThreadLocal();

    public static void a(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            a(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
