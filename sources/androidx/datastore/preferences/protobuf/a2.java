package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class a2 {
    public final Unsafe a;

    public a2(Unsafe unsafe) {
        this.a = unsafe;
    }

    public final int a(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj, long j3);

    public abstract byte d(Object obj, long j3);

    public abstract double e(Object obj, long j3);

    public abstract float f(Object obj, long j3);

    public final int g(Object obj, long j3) {
        return this.a.getInt(obj, j3);
    }

    public final long h(Object obj, long j3) {
        return this.a.getLong(obj, j3);
    }

    public final Object i(Object obj, long j3) {
        return this.a.getObject(obj, j3);
    }

    public final long j(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j3, boolean z10);

    public abstract void l(Object obj, long j3, byte b3);

    public abstract void m(Object obj, long j3, double d10);

    public abstract void n(Object obj, long j3, float f10);

    public final void o(Object obj, long j3, int i10) {
        this.a.putInt(obj, j3, i10);
    }

    public final void p(Object obj, long j3, long j10) {
        this.a.putLong(obj, j3, j10);
    }

    public final void q(Object obj, long j3, Object obj2) {
        this.a.putObject(obj, j3, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            b2.a(th2);
            return false;
        }
    }

    public abstract boolean s();
}
