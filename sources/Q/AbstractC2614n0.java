package q;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: q.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2614n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f22692a;
    public static final Method b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f22693c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f22694d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f22692a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f22693c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f22694d = true;
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
        }
    }
}
