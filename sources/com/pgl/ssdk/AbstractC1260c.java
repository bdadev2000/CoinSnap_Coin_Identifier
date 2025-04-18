package com.pgl.ssdk;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.ZipFile;

/* renamed from: com.pgl.ssdk.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1260c {

    /* renamed from: com.pgl.ssdk.c$a */
    /* loaded from: classes4.dex */
    public static class a extends C1273p {
        public a(long j3, long j10, int i10, long j11, ByteBuffer byteBuffer) {
            super(j3, j10, i10, j11, byteBuffer);
        }
    }

    public static void a(Runnable runnable) {
        Q c10 = M.a().c();
        if (c10 != null) {
            c10.post(runnable);
        }
    }

    public static a a(InterfaceC1271n interfaceC1271n) throws IOException, C1272o {
        C1269l<ByteBuffer, Long> a10 = AbstractC1270m.a(interfaceC1271n);
        if (a10 != null) {
            ByteBuffer a11 = a10.a();
            long longValue = a10.b().longValue();
            a11.order(ByteOrder.LITTLE_ENDIAN);
            long b3 = AbstractC1270m.b(a11);
            if (b3 <= longValue) {
                long c10 = AbstractC1270m.c(a11);
                long j3 = b3 + c10;
                if (j3 <= longValue) {
                    C1273p c1273p = new C1273p(b3, c10, AbstractC1270m.d(a11), longValue, a11);
                    return new a(c1273p.a(), c1273p.c(), c1273p.b(), c1273p.e(), c1273p.d());
                }
                StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("ZIP Central Directory overlaps with End of Central Directory. CD end: ", j3, ", EoCD start: ");
                o10.append(longValue);
                throw new C1272o(o10.toString());
            }
            StringBuilder o11 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("ZIP Central Directory start offset out of range: ", b3, ". ZIP End of Central Directory offset: ");
            o11.append(longValue);
            throw new C1272o(o11.toString());
        }
        throw new C1272o("ZIP End of Central Directory record not found");
    }

    public static C1261d a(InterfaceC1271n interfaceC1271n, C1273p c1273p) throws IOException, C1259b {
        long a10 = c1273p.a();
        long c10 = c1273p.c() + a10;
        long e2 = c1273p.e();
        if (c10 != e2) {
            StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: ", c10, ", EoCD start: ");
            o10.append(e2);
            throw new C1259b(o10.toString());
        }
        if (a10 >= 32) {
            C1268k c1268k = (C1268k) interfaceC1271n;
            ByteBuffer a11 = c1268k.a(a10 - 24, 24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            a11.order(byteOrder);
            if (a11.getLong(8) == 2334950737559900225L && a11.getLong(16) == 3617552046287187010L) {
                long j3 = a11.getLong(0);
                if (j3 < a11.capacity() || j3 > 2147483639) {
                    throw new C1259b("APK Signing Block size out of range: ".concat(String.valueOf(j3)));
                }
                long j10 = (int) (8 + j3);
                long j11 = a10 - j10;
                if (j11 >= 0) {
                    ByteBuffer a12 = c1268k.a(j11, 8);
                    a12.order(byteOrder);
                    long j12 = a12.getLong(0);
                    if (j12 == j3) {
                        return new C1261d(j11, c1268k.a(j11, j10));
                    }
                    StringBuilder o11 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("APK Signing Block sizes in header and footer do not match: ", j12, " vs ");
                    o11.append(j3);
                    throw new C1259b(o11.toString());
                }
                throw new C1259b("APK Signing Block offset out of range: ".concat(String.valueOf(j11)));
            }
            throw new C1259b("No APK Signing Block before ZIP Central Directory");
        }
        throw new C1259b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(a10)));
    }

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static void a(ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (IOException unused) {
        }
    }
}
