package xc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class b extends s.a {

    /* renamed from: b, reason: collision with root package name */
    public final Method f27628b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f27629c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f27630d;

    /* renamed from: f, reason: collision with root package name */
    public final Method f27631f;

    public b() {
        super((Object) null);
        this.f27628b = Class.class.getMethod("isRecord", new Class[0]);
        this.f27629c = Class.class.getMethod("getRecordComponents", new Class[0]);
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f27630d = cls.getMethod("getName", new Class[0]);
        this.f27631f = cls.getMethod("getType", new Class[0]);
    }

    @Override // s.a
    public final Method i(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), new Class[0]);
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    @Override // s.a
    public final Constructor j(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f27629c.invoke(cls, new Object[0]);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                clsArr[i10] = (Class) this.f27631f.invoke(objArr[i10], new Object[0]);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    @Override // s.a
    public final String[] l(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f27629c.invoke(cls, new Object[0]);
            String[] strArr = new String[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                strArr[i10] = (String) this.f27630d.invoke(objArr[i10], new Object[0]);
            }
            return strArr;
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    @Override // s.a
    public final boolean m(Class cls) {
        try {
            return ((Boolean) this.f27628b.invoke(cls, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }
}
