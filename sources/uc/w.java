package uc;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class w {
    public static final w a;

    static {
        w vVar;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            vVar = new s(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    vVar = new t(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    vVar = new v();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                vVar = new u(declaredMethod3);
            }
        }
        a = vVar;
    }

    public static void a(Class cls) {
        String b3 = com.bumptech.glide.manager.r.b(cls);
        if (b3 == null) {
        } else {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(b3));
        }
    }

    public abstract Object b(Class cls);
}
