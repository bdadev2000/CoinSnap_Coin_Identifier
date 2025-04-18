package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import b1.f0;
import e0.q;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

@RestrictTo
/* loaded from: classes4.dex */
public final class SavedStateViewModelFactoryKt {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20109a = f0.v(Application.class, SavedStateHandle.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f20110b = f0.u(SavedStateHandle.class);

    public static final Constructor a(List list, Class cls) {
        p0.a.s(cls, "modelClass");
        p0.a.s(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        p0.a.r(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            p0.a.r(parameterTypes, "constructor.parameterTypes");
            List n02 = q.n0(parameterTypes);
            if (p0.a.g(list, n02)) {
                return constructor;
            }
            if (list.size() == n02.size() && n02.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final ViewModel b(Class cls, Constructor constructor, Object... objArr) {
        p0.a.s(cls, "modelClass");
        try {
            return (ViewModel) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
