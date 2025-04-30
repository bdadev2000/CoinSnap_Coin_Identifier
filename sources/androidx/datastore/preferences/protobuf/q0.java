package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f4597a;

    public q0(Unsafe unsafe) {
        this.f4597a = unsafe;
    }

    public final int a(Class cls) {
        return this.f4597a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f4597a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj, long j7);

    public abstract byte d(Object obj, long j7);

    public abstract double e(Object obj, long j7);

    public abstract float f(Object obj, long j7);

    public final int g(Object obj, long j7) {
        return this.f4597a.getInt(obj, j7);
    }

    public final long h(Object obj, long j7) {
        return this.f4597a.getLong(obj, j7);
    }

    public final Object i(Object obj, long j7) {
        return this.f4597a.getObject(obj, j7);
    }

    public final long j(Field field) {
        return this.f4597a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j7, boolean z8);

    public abstract void l(Object obj, long j7, byte b);

    public abstract void m(Object obj, long j7, double d2);

    public abstract void n(Object obj, long j7, float f9);

    public final void o(Object obj, long j7, int i9) {
        this.f4597a.putInt(obj, j7, i9);
    }

    public final void p(Object obj, long j7, long j9) {
        this.f4597a.putLong(obj, j7, j9);
    }

    public final void q(Object obj, long j7, Object obj2) {
        this.f4597a.putObject(obj, j7, obj2);
    }
}
