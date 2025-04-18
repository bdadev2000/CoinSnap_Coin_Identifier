package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class b2 {
    public static final Unsafe a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f1347b;

    /* renamed from: c, reason: collision with root package name */
    public static final a2 f1348c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1349d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f1350e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f1351f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f1352g;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    static {
        /*
            sun.misc.Unsafe r0 = p()
            androidx.datastore.preferences.protobuf.b2.a = r0
            java.lang.Class r1 = androidx.datastore.preferences.protobuf.d.a
            androidx.datastore.preferences.protobuf.b2.f1347b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = f(r1)
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = f(r2)
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L1b
            goto L31
        L1b:
            boolean r5 = androidx.datastore.preferences.protobuf.d.a()
            if (r5 == 0) goto L33
            if (r1 == 0) goto L29
            androidx.datastore.preferences.protobuf.y1 r1 = new androidx.datastore.preferences.protobuf.y1
            r1.<init>(r0, r3)
            goto L38
        L29:
            if (r2 == 0) goto L31
            androidx.datastore.preferences.protobuf.y1 r1 = new androidx.datastore.preferences.protobuf.y1
            r1.<init>(r0, r4)
            goto L38
        L31:
            r1 = 0
            goto L38
        L33:
            androidx.datastore.preferences.protobuf.z1 r1 = new androidx.datastore.preferences.protobuf.z1
            r1.<init>(r0)
        L38:
            androidx.datastore.preferences.protobuf.b2.f1348c = r1
            if (r1 != 0) goto L3e
            r0 = r4
            goto L42
        L3e:
            boolean r0 = r1.s()
        L42:
            androidx.datastore.preferences.protobuf.b2.f1349d = r0
            if (r1 != 0) goto L48
            r0 = r4
            goto L4c
        L48:
            boolean r0 = r1.r()
        L4c:
            androidx.datastore.preferences.protobuf.b2.f1350e = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = c(r0)
            long r5 = (long) r0
            androidx.datastore.preferences.protobuf.b2.f1351f = r5
            java.lang.Class<boolean[]> r0 = boolean[].class
            c(r0)
            d(r0)
            java.lang.Class<int[]> r0 = int[].class
            c(r0)
            d(r0)
            java.lang.Class<long[]> r0 = long[].class
            c(r0)
            d(r0)
            java.lang.Class<float[]> r0 = float[].class
            c(r0)
            d(r0)
            java.lang.Class<double[]> r0 = double[].class
            c(r0)
            d(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            c(r0)
            d(r0)
            java.lang.reflect.Field r0 = e()
            if (r0 == 0) goto L93
            if (r1 != 0) goto L90
            goto L93
        L90:
            r1.j(r0)
        L93:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L9c
            goto L9d
        L9c:
            r3 = r4
        L9d:
            androidx.datastore.preferences.protobuf.b2.f1352g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b2.<clinit>():void");
    }

    public static void a(Throwable th2) {
        Logger.getLogger(b2.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static Object b(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int c(Class cls) {
        if (f1350e) {
            return f1348c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f1350e) {
            f1348c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (d.a()) {
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
    public static boolean f(Class cls) {
        if (!d.a()) {
            return false;
        }
        try {
            Class cls2 = f1347b;
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

    public static boolean g(Object obj, long j3) {
        return f1348c.c(obj, j3);
    }

    public static byte h(byte[] bArr, long j3) {
        return f1348c.d(bArr, f1351f + j3);
    }

    public static byte i(Object obj, long j3) {
        return (byte) ((m(obj, (-4) & j3) >>> ((int) (((~j3) & 3) << 3))) & 255);
    }

    public static byte j(Object obj, long j3) {
        return (byte) ((m(obj, (-4) & j3) >>> ((int) ((j3 & 3) << 3))) & 255);
    }

    public static double k(Object obj, long j3) {
        return f1348c.e(obj, j3);
    }

    public static float l(Object obj, long j3) {
        return f1348c.f(obj, j3);
    }

    public static int m(Object obj, long j3) {
        return f1348c.g(obj, j3);
    }

    public static long n(Object obj, long j3) {
        return f1348c.h(obj, j3);
    }

    public static Object o(Object obj, long j3) {
        return f1348c.i(obj, j3);
    }

    public static Unsafe p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new x1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void q(byte[] bArr, long j3, byte b3) {
        f1348c.l(bArr, f1351f + j3, b3);
    }

    public static void r(Object obj, long j3, byte b3) {
        long j10 = (-4) & j3;
        int m10 = m(obj, j10);
        int i10 = ((~((int) j3)) & 3) << 3;
        t(obj, j10, ((255 & b3) << i10) | (m10 & (~(255 << i10))));
    }

    public static void s(Object obj, long j3, byte b3) {
        long j10 = (-4) & j3;
        int i10 = (((int) j3) & 3) << 3;
        t(obj, j10, ((255 & b3) << i10) | (m(obj, j10) & (~(255 << i10))));
    }

    public static void t(Object obj, long j3, int i10) {
        f1348c.o(obj, j3, i10);
    }

    public static void u(Object obj, long j3, long j10) {
        f1348c.p(obj, j3, j10);
    }

    public static void v(Object obj, long j3, Object obj2) {
        f1348c.q(obj, j3, obj2);
    }
}
