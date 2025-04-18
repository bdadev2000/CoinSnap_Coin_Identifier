package ni;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public class o0 {

    /* renamed from: c, reason: collision with root package name */
    public static final o0 f22825c;
    public final boolean a = true;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f22826b;

    static {
        o0 o0Var;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            o0Var = new n0();
        } else {
            o0Var = new o0();
        }
        f22825c = o0Var;
    }

    public o0() {
        Constructor constructor;
        try {
            constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            try {
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        } catch (NoClassDefFoundError | NoSuchMethodException unused2) {
            constructor = null;
        }
        this.f22826b = constructor;
    }

    public Executor a() {
        return null;
    }

    public Object b(Class cls, Object obj, Method method, Object... objArr) {
        MethodHandles.Lookup lookup;
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor constructor = this.f22826b;
        if (constructor != null) {
            lookup = n0.u0.l(constructor.newInstance(cls, -1));
        } else {
            lookup = MethodHandles.lookup();
        }
        unreflectSpecial = lookup.unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }
}
