package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f4598a = Logger.getLogger(r0.class.getName());
    public static final Unsafe b;

    /* renamed from: c, reason: collision with root package name */
    public static final Class f4599c;

    /* renamed from: d, reason: collision with root package name */
    public static final q0 f4600d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f4601e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f4602f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f4603g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f4604h;

    /* JADX WARN: Removed duplicated region for block: B:18:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.r0.<clinit>():void");
    }

    public static Object a(Class cls) {
        try {
            return b.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static int b(Class cls) {
        if (f4602f) {
            return f4600d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f4602f) {
            f4600d.b(cls);
        }
    }

    public static Field d() {
        Field field;
        Field field2;
        if (AbstractC0428c.a()) {
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

    public static boolean e(Class cls) {
        if (!AbstractC0428c.a()) {
            return false;
        }
        try {
            Class cls2 = f4599c;
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

    public static byte f(byte[] bArr, long j7) {
        return f4600d.d(bArr, f4603g + j7);
    }

    public static byte g(Object obj, long j7) {
        return (byte) ((f4600d.g(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255);
    }

    public static byte h(Object obj, long j7) {
        return (byte) ((f4600d.g(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255);
    }

    public static int i(Object obj, long j7) {
        return f4600d.g(obj, j7);
    }

    public static long j(Object obj, long j7) {
        return f4600d.h(obj, j7);
    }

    public static Object k(Object obj, long j7) {
        return f4600d.i(obj, j7);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new n0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void m(byte[] bArr, long j7, byte b8) {
        f4600d.l(bArr, f4603g + j7, b8);
    }

    public static void n(Object obj, long j7, byte b8) {
        long j9 = (-4) & j7;
        int g9 = f4600d.g(obj, j9);
        int i9 = ((~((int) j7)) & 3) << 3;
        p(obj, j9, ((255 & b8) << i9) | (g9 & (~(255 << i9))));
    }

    public static void o(Object obj, long j7, byte b8) {
        long j9 = (-4) & j7;
        int i9 = (((int) j7) & 3) << 3;
        p(obj, j9, ((255 & b8) << i9) | (f4600d.g(obj, j9) & (~(255 << i9))));
    }

    public static void p(Object obj, long j7, int i9) {
        f4600d.o(obj, j7, i9);
    }

    public static void q(Object obj, long j7, long j9) {
        f4600d.p(obj, j7, j9);
    }

    public static void r(Object obj, long j7, Object obj2) {
        f4600d.q(obj, j7, obj2);
    }
}
