package androidx.datastore.preferences.protobuf;

import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class UnsafeUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f19389a = Logger.getLogger(UnsafeUtil.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f19390b;

    /* renamed from: c, reason: collision with root package name */
    public static final Class f19391c;
    public static final MemoryAccessor d;
    public static final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f19392f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f19393g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f19394h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f19395i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.UnsafeUtil$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() {
            for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Android32MemoryAccessor extends MemoryAccessor {
        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void c(long j2, byte[] bArr, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void d(byte[] bArr, long j2, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean e(long j2, Object obj) {
            return UnsafeUtil.f19395i ? UnsafeUtil.g(j2, obj) != 0 : UnsafeUtil.h(j2, obj) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final byte f(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final byte g(long j2, Object obj) {
            return UnsafeUtil.f19395i ? UnsafeUtil.g(j2, obj) : UnsafeUtil.h(j2, obj);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final double h(long j2, Object obj) {
            return Double.longBitsToDouble(l(j2, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final float i(long j2, Object obj) {
            return Float.intBitsToFloat(j(j2, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final long k(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void o(Object obj, long j2, boolean z2) {
            if (UnsafeUtil.f19395i) {
                UnsafeUtil.p(obj, j2, z2 ? (byte) 1 : (byte) 0);
            } else {
                UnsafeUtil.q(obj, j2, z2 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void p(long j2, byte b2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void q(Object obj, long j2, byte b2) {
            if (UnsafeUtil.f19395i) {
                UnsafeUtil.p(obj, j2, b2);
            } else {
                UnsafeUtil.q(obj, j2, b2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void r(Object obj, long j2, double d) {
            u(obj, j2, Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void s(Object obj, long j2, float f2) {
            t(Float.floatToIntBits(f2), j2, obj);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Android64MemoryAccessor extends MemoryAccessor {
        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void c(long j2, byte[] bArr, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void d(byte[] bArr, long j2, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean e(long j2, Object obj) {
            return UnsafeUtil.f19395i ? UnsafeUtil.g(j2, obj) != 0 : UnsafeUtil.h(j2, obj) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final byte f(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final byte g(long j2, Object obj) {
            return UnsafeUtil.f19395i ? UnsafeUtil.g(j2, obj) : UnsafeUtil.h(j2, obj);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final double h(long j2, Object obj) {
            return Double.longBitsToDouble(l(j2, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final float i(long j2, Object obj) {
            return Float.intBitsToFloat(j(j2, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final long k(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void o(Object obj, long j2, boolean z2) {
            if (UnsafeUtil.f19395i) {
                UnsafeUtil.p(obj, j2, z2 ? (byte) 1 : (byte) 0);
            } else {
                UnsafeUtil.q(obj, j2, z2 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void p(long j2, byte b2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void q(Object obj, long j2, byte b2) {
            if (UnsafeUtil.f19395i) {
                UnsafeUtil.p(obj, j2, b2);
            } else {
                UnsafeUtil.q(obj, j2, b2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void r(Object obj, long j2, double d) {
            u(obj, j2, Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void s(Object obj, long j2, float f2) {
            t(Float.floatToIntBits(f2), j2, obj);
        }
    }

    /* loaded from: classes2.dex */
    public static final class JvmMemoryAccessor extends MemoryAccessor {
        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void c(long j2, byte[] bArr, long j3, long j4) {
            this.f19396a.copyMemory((Object) null, j2, bArr, UnsafeUtil.f19393g + j3, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void d(byte[] bArr, long j2, long j3, long j4) {
            this.f19396a.copyMemory(bArr, UnsafeUtil.f19393g + j2, (Object) null, j3, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean e(long j2, Object obj) {
            return this.f19396a.getBoolean(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final byte f(long j2) {
            return this.f19396a.getByte(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final byte g(long j2, Object obj) {
            return this.f19396a.getByte(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final double h(long j2, Object obj) {
            return this.f19396a.getDouble(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final float i(long j2, Object obj) {
            return this.f19396a.getFloat(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final long k(long j2) {
            return this.f19396a.getLong(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void o(Object obj, long j2, boolean z2) {
            this.f19396a.putBoolean(obj, j2, z2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void p(long j2, byte b2) {
            this.f19396a.putByte(j2, b2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void q(Object obj, long j2, byte b2) {
            this.f19396a.putByte(obj, j2, b2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void r(Object obj, long j2, double d) {
            this.f19396a.putDouble(obj, j2, d);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public final void s(Object obj, long j2, float f2) {
            this.f19396a.putFloat(obj, j2, f2);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class MemoryAccessor {

        /* renamed from: a, reason: collision with root package name */
        public final Unsafe f19396a;

        public MemoryAccessor(Unsafe unsafe) {
            this.f19396a = unsafe;
        }

        public final int a(Class cls) {
            return this.f19396a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f19396a.arrayIndexScale(cls);
        }

        public abstract void c(long j2, byte[] bArr, long j3, long j4);

        public abstract void d(byte[] bArr, long j2, long j3, long j4);

        public abstract boolean e(long j2, Object obj);

        public abstract byte f(long j2);

        public abstract byte g(long j2, Object obj);

        public abstract double h(long j2, Object obj);

        public abstract float i(long j2, Object obj);

        public final int j(long j2, Object obj) {
            return this.f19396a.getInt(obj, j2);
        }

        public abstract long k(long j2);

        public final long l(long j2, Object obj) {
            return this.f19396a.getLong(obj, j2);
        }

        public final Object m(long j2, Object obj) {
            return this.f19396a.getObject(obj, j2);
        }

        public final long n(java.lang.reflect.Field field) {
            return this.f19396a.objectFieldOffset(field);
        }

        public abstract void o(Object obj, long j2, boolean z2);

        public abstract void p(long j2, byte b2);

        public abstract void q(Object obj, long j2, byte b2);

        public abstract void r(Object obj, long j2, double d);

        public abstract void s(Object obj, long j2, float f2);

        public final void t(int i2, long j2, Object obj) {
            this.f19396a.putInt(obj, j2, i2);
        }

        public final void u(Object obj, long j2, long j3) {
            this.f19396a.putLong(obj, j2, j3);
        }

        public final void v(Object obj, long j2, Object obj2) {
            this.f19396a.putObject(obj, j2, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.UnsafeUtil.<clinit>():void");
    }

    public static Object a(Class cls) {
        try {
            return f19390b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int b(Class cls) {
        if (f19392f) {
            return d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f19392f) {
            d.b(cls);
        }
    }

    public static java.lang.reflect.Field d() {
        java.lang.reflect.Field field;
        java.lang.reflect.Field field2;
        if (Android.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(Class cls) {
        if (!Android.a()) {
            return false;
        }
        try {
            Class cls2 = f19391c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte f(byte[] bArr, long j2) {
        return d.g(f19393g + j2, bArr);
    }

    public static byte g(long j2, Object obj) {
        return (byte) ((d.j((-4) & j2, obj) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    public static byte h(long j2, Object obj) {
        return (byte) ((d.j((-4) & j2, obj) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    public static int i(long j2, Object obj) {
        return d.j(j2, obj);
    }

    public static long j(long j2, Object obj) {
        return d.l(j2, obj);
    }

    public static Object k(long j2, Object obj) {
        return d.m(j2, obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void m(Object obj, long j2, boolean z2) {
        d.o(obj, j2, z2);
    }

    public static void n(long j2, byte b2) {
        d.p(j2, b2);
    }

    public static void o(byte[] bArr, long j2, byte b2) {
        d.q(bArr, f19393g + j2, b2);
    }

    public static void p(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int j4 = d.j(j3, obj);
        int i2 = ((~((int) j2)) & 3) << 3;
        t(((255 & b2) << i2) | (j4 & (~(255 << i2))), j3, obj);
    }

    public static void q(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        t(((255 & b2) << i2) | (d.j(j3, obj) & (~(255 << i2))), j3, obj);
    }

    public static void r(Object obj, long j2, double d2) {
        d.r(obj, j2, d2);
    }

    public static void s(Object obj, long j2, float f2) {
        d.s(obj, j2, f2);
    }

    public static void t(int i2, long j2, Object obj) {
        d.t(i2, j2, obj);
    }

    public static void u(Object obj, long j2, long j3) {
        d.u(obj, j2, j3);
    }

    public static void v(Object obj, long j2, Object obj2) {
        d.v(obj, j2, obj2);
    }
}
