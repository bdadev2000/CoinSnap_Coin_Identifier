package A7;

import G7.j;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f84a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        j.b(methods);
        int length = methods.length;
        int i9 = 0;
        while (true) {
            method = null;
            Class<?> cls = null;
            if (i9 >= length) {
                break;
            }
            Method method2 = methods[i9];
            if (j.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                j.d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 1) {
                    cls = parameterTypes[0];
                }
                if (j.a(cls, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i9++;
        }
        f84a = method;
        int length2 = methods.length;
        for (int i10 = 0; i10 < length2 && !j.a(methods[i10].getName(), "getSuppressed"); i10++) {
        }
    }
}
