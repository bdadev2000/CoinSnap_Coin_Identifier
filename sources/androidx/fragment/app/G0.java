package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class G0 {
    public static void f(View view, List list) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (list.get(i9) == view) {
                return;
            }
        }
        if (ViewCompat.getTransitionName(view) != null) {
            list.add(view);
        }
        for (int i10 = size; i10 < list.size(); i10++) {
            View view2 = (View) list.get(i10);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    int i12 = 0;
                    while (true) {
                        if (i12 < size) {
                            if (list.get(i12) == childAt) {
                                break;
                            } else {
                                i12++;
                            }
                        } else if (ViewCompat.getTransitionName(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static void j(View view, Rect rect) {
        if (!view.isAttachedToWindow()) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        view.getRootView().getLocationOnScreen(new int[2]);
        rectF.offset(r1[0], r1[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public static boolean k(List list) {
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    public abstract void a(View view, Object obj);

    public abstract void b(Object obj, ArrayList arrayList);

    public void c(Object obj) {
    }

    public abstract void e(ViewGroup viewGroup, Object obj);

    public abstract boolean g(Object obj);

    public abstract Object h(Object obj);

    public Object i(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public abstract boolean l();

    public abstract boolean m(Object obj);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    public abstract Object o(Object obj, Object obj2);

    public abstract void p(Object obj, View view, ArrayList arrayList);

    public abstract void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public void r(Object obj, float f9) {
    }

    public abstract void s(View view, Object obj);

    public abstract void t(Object obj, Rect rect);

    public abstract void u(Fragment fragment, Object obj, P.e eVar, RunnableC0473l runnableC0473l);

    public void v(Object obj, P.e eVar, D3.b bVar, Runnable runnable) {
        ((RunnableC0473l) runnable).run();
    }

    public abstract void w(Object obj, View view, ArrayList arrayList);

    public abstract void x(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object y(Object obj);

    public void d(Object obj, RunnableC0473l runnableC0473l) {
    }
}
