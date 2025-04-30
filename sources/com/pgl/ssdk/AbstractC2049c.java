package com.pgl.ssdk;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.ZipFile;
import y.AbstractC2933a;

/* renamed from: com.pgl.ssdk.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2049c {

    /* renamed from: com.pgl.ssdk.c$a */
    /* loaded from: classes3.dex */
    public static class a extends C2061o {
        public a(long j7, long j9, int i9, long j10, ByteBuffer byteBuffer) {
            super(j7, j9, i9, j10, byteBuffer);
        }
    }

    public static void a(Runnable runnable) {
        P c9 = L.a().c();
        if (c9 != null) {
            c9.post(runnable);
        }
    }

    public static a a(InterfaceC2059m interfaceC2059m) throws IOException, C2060n {
        C2057k<ByteBuffer, Long> a6 = AbstractC2058l.a(interfaceC2059m);
        if (a6 != null) {
            ByteBuffer a9 = a6.a();
            long longValue = a6.b().longValue();
            a9.order(ByteOrder.LITTLE_ENDIAN);
            long b = AbstractC2058l.b(a9);
            if (b <= longValue) {
                long c9 = AbstractC2058l.c(a9);
                long j7 = b + c9;
                if (j7 <= longValue) {
                    C2061o c2061o = new C2061o(b, c9, AbstractC2058l.d(a9), longValue, a9);
                    return new a(c2061o.a(), c2061o.c(), c2061o.b(), c2061o.e(), c2061o.d());
                }
                StringBuilder a10 = AbstractC2933a.a("ZIP Central Directory overlaps with End of Central Directory. CD end: ", j7, ", EoCD start: ");
                a10.append(longValue);
                throw new C2060n(a10.toString());
            }
            StringBuilder a11 = AbstractC2933a.a("ZIP Central Directory start offset out of range: ", b, ". ZIP End of Central Directory offset: ");
            a11.append(longValue);
            throw new C2060n(a11.toString());
        }
        throw new C2060n("ZIP End of Central Directory record not found");
    }

    public static C2050d a(InterfaceC2059m interfaceC2059m, C2061o c2061o) throws IOException, C2048b {
        long a6 = c2061o.a();
        long c9 = c2061o.c() + a6;
        long e4 = c2061o.e();
        if (c9 != e4) {
            StringBuilder a9 = AbstractC2933a.a("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: ", c9, ", EoCD start: ");
            a9.append(e4);
            throw new C2048b(a9.toString());
        }
        if (a6 >= 32) {
            C2056j c2056j = (C2056j) interfaceC2059m;
            ByteBuffer a10 = c2056j.a(a6 - 24, 24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            a10.order(byteOrder);
            if (a10.getLong(8) == 2334950737559900225L && a10.getLong(16) == 3617552046287187010L) {
                long j7 = a10.getLong(0);
                if (j7 < a10.capacity() || j7 > 2147483639) {
                    throw new C2048b("APK Signing Block size out of range: ".concat(String.valueOf(j7)));
                }
                long j9 = (int) (8 + j7);
                long j10 = a6 - j9;
                if (j10 >= 0) {
                    ByteBuffer a11 = c2056j.a(j10, 8);
                    a11.order(byteOrder);
                    long j11 = a11.getLong(0);
                    if (j11 == j7) {
                        return new C2050d(j10, c2056j.a(j10, j9));
                    }
                    StringBuilder a12 = AbstractC2933a.a("APK Signing Block sizes in header and footer do not match: ", j11, " vs ");
                    a12.append(j7);
                    throw new C2048b(a12.toString());
                }
                throw new C2048b("APK Signing Block offset out of range: ".concat(String.valueOf(j10)));
            }
            throw new C2048b("No APK Signing Block before ZIP Central Directory");
        }
        throw new C2048b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(a6)));
    }

    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            return 0;
        }
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
