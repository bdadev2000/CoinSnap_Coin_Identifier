package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import u7.AbstractC2815f;
import u7.AbstractC2817h;

/* loaded from: classes.dex */
public abstract class Z {

    /* renamed from: a, reason: collision with root package name */
    public static final List f4878a = AbstractC2817h.B(Application.class, S.class);
    public static final List b = android.support.v4.media.session.a.w(S.class);

    public static final Constructor a(Class cls, List list) {
        G7.j.e(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        G7.j.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            G7.j.d(parameterTypes, "constructor.parameterTypes");
            List D8 = AbstractC2815f.D(parameterTypes);
            if (list.equals(D8)) {
                return constructor;
            }
            if (list.size() == D8.size() && D8.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final b0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (b0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Failed to access " + cls, e4);
        } catch (InstantiationException e9) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e10.getCause());
        }
    }
}
