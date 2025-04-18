package n1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import uc.n;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f22376b;

    public a(Constructor constructor) {
        this.f22376b = constructor;
    }

    @Override // uc.n
    public final Object b() {
        Constructor constructor = this.f22376b;
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            s.a aVar = xc.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + xc.c.b(constructor) + "' with no args", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + xc.c.b(constructor) + "' with no args", e11.getCause());
        }
    }
}
