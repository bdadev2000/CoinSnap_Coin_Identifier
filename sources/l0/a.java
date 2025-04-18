package l0;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f31010a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        p0.a.p(methods);
        int length = methods.length;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                break;
            }
            Method method2 = methods[i2];
            if (p0.a.g(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                p0.a.r(parameterTypes, "getParameterTypes(...)");
                if (p0.a.g(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i2++;
        }
        f31010a = method;
        int length2 = methods.length;
        for (int i3 = 0; i3 < length2 && !p0.a.g(methods[i3].getName(), "getSuppressed"); i3++) {
        }
    }
}
