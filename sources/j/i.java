package j;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class i implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f19669c = {MenuItem.class};
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f19670b;

    public i(Object obj, String str) {
        this.a = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f19670b = cls.getMethod(str, f19669c);
        } catch (Exception e2) {
            StringBuilder o10 = a4.j.o("Couldn't resolve menu item onClick handler ", str, " in class ");
            o10.append(cls.getName());
            InflateException inflateException = new InflateException(o10.toString());
            inflateException.initCause(e2);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f19670b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
