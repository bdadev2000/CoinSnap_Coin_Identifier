package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class e0 extends b {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, e0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected s1 unknownFields = s1.f1462f;

    public static e0 g(Class cls) {
        e0 e0Var = defaultInstanceMap.get(cls);
        if (e0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                e0Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (e0Var == null) {
            e0Var = (e0) ((e0) b2.b(cls)).e(d0.GET_DEFAULT_INSTANCE);
            if (e0Var != null) {
                defaultInstanceMap.put(cls, e0Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return e0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object h(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final boolean i(e0 e0Var, boolean z10) {
        byte byteValue = ((Byte) e0Var.e(d0.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        h1 h1Var = h1.f1372c;
        h1Var.getClass();
        boolean isInitialized = h1Var.a(e0Var.getClass()).isInitialized(e0Var);
        if (z10) {
            e0Var.e(d0.SET_MEMOIZED_IS_INITIALIZED);
        }
        return isInitialized;
    }

    public static void l(Class cls, e0 e0Var) {
        e0Var.k();
        defaultInstanceMap.put(cls, e0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.b
    public final int a(k1 k1Var) {
        int serializedSize;
        int serializedSize2;
        if (j()) {
            if (k1Var == null) {
                h1 h1Var = h1.f1372c;
                h1Var.getClass();
                serializedSize2 = h1Var.a(getClass()).getSerializedSize(this);
            } else {
                serializedSize2 = k1Var.getSerializedSize(this);
            }
            if (serializedSize2 >= 0) {
                return serializedSize2;
            }
            throw new IllegalStateException(eb.j.i("serialized size must be non-negative, was ", serializedSize2));
        }
        int i10 = this.memoizedSerializedSize;
        if ((i10 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10 & Integer.MAX_VALUE;
        }
        if (k1Var == null) {
            h1 h1Var2 = h1.f1372c;
            h1Var2.getClass();
            serializedSize = h1Var2.a(getClass()).getSerializedSize(this);
        } else {
            serializedSize = k1Var.getSerializedSize(this);
        }
        m(serializedSize);
        return serializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.b
    public final void b(r rVar) {
        h1 h1Var = h1.f1372c;
        h1Var.getClass();
        k1 a = h1Var.a(getClass());
        fb.c cVar = rVar.f1461o;
        if (cVar == null) {
            cVar = new fb.c(rVar);
        }
        a.a(this, cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.memoizedHashCode = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        m(Integer.MAX_VALUE);
    }

    public abstract Object e(d0 d0Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h1 h1Var = h1.f1372c;
        h1Var.getClass();
        return h1Var.a(getClass()).equals(this, (e0) obj);
    }

    public final Object f() {
        return e(d0.NEW_MUTABLE_INSTANCE);
    }

    public final int hashCode() {
        boolean z10;
        if (j()) {
            h1 h1Var = h1.f1372c;
            h1Var.getClass();
            return h1Var.a(getClass()).hashCode(this);
        }
        if (this.memoizedHashCode == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            h1 h1Var2 = h1.f1372c;
            h1Var2.getClass();
            this.memoizedHashCode = h1Var2.a(getClass()).hashCode(this);
        }
        return this.memoizedHashCode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    final void m(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(eb.j.i("serialized size must be non-negative, was ", i10));
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = a1.a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        a1.c(this, sb2, 0);
        return sb2.toString();
    }
}
