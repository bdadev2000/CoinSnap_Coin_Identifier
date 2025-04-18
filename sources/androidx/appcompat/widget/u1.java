package androidx.appcompat.widget;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class u1 {
    public static final Method a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f1047b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f1048c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1049d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f1047b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f1048c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f1049d = true;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
}
