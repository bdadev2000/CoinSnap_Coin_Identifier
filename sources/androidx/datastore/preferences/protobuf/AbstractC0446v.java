package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0446v extends AbstractC0425a {
    private static Map<Object, AbstractC0446v> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected i0 unknownFields;

    public AbstractC0446v() {
        this.memoizedHashCode = 0;
        this.unknownFields = i0.f4576f;
        this.memoizedSerializedSize = -1;
    }

    public static AbstractC0446v e(Class cls) {
        AbstractC0446v abstractC0446v = defaultInstanceMap.get(cls);
        if (abstractC0446v == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0446v = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (abstractC0446v == null) {
            abstractC0446v = (AbstractC0446v) ((AbstractC0446v) r0.a(cls)).d(6);
            if (abstractC0446v != null) {
                defaultInstanceMap.put(cls, abstractC0446v);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC0446v;
    }

    public static Object f(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static void h(Class cls, AbstractC0446v abstractC0446v) {
        defaultInstanceMap.put(cls, abstractC0446v);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425a
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            X x9 = X.f4537c;
            x9.getClass();
            this.memoizedSerializedSize = x9.a(getClass()).getSerializedSize(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0425a
    public final void c(C0435j c0435j) {
        X x9 = X.f4537c;
        x9.getClass();
        InterfaceC0426a0 a6 = x9.a(getClass());
        J j7 = c0435j.f4583c;
        if (j7 == null) {
            j7 = new J(c0435j);
        }
        a6.a(this, j7);
    }

    public abstract Object d(int i9);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((AbstractC0446v) d(6)).getClass().isInstance(obj)) {
            return false;
        }
        X x9 = X.f4537c;
        x9.getClass();
        return x9.a(getClass()).equals(this, (AbstractC0446v) obj);
    }

    public final boolean g() {
        byte byteValue = ((Byte) d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        X x9 = X.f4537c;
        x9.getClass();
        boolean isInitialized = x9.a(getClass()).isInitialized(this);
        d(2);
        return isInitialized;
    }

    public final int hashCode() {
        int i9 = this.memoizedHashCode;
        if (i9 != 0) {
            return i9;
        }
        X x9 = X.f4537c;
        x9.getClass();
        int hashCode = x9.a(getClass()).hashCode(this);
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        P.l(this, sb, 0);
        return sb.toString();
    }
}
