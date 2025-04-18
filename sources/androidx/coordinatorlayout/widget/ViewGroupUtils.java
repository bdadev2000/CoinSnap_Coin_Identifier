package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes2.dex */
public class ViewGroupUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f18379a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f18380b = new ThreadLocal();

    public static void a(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            a(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
