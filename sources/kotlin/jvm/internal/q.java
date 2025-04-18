package kotlin.jvm.internal;

import androidx.compose.ui.unit.Dp;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.api.Api;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public abstract class q {
    public static void a(Throwable th, Throwable th2) {
        p0.a.s(th, "<this>");
        p0.a.s(th2, "exception");
        if (th != th2) {
            Integer num = m0.a.f31048a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = l0.a.f31010a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final void b(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                a(th, th2);
            }
        }
    }

    public static int c(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final d0.m d(Throwable th) {
        p0.a.s(th, "exception");
        return new d0.m(th);
    }

    public static h0.j e(h0.j jVar, h0.k kVar) {
        p0.a.s(kVar, SDKConstants.PARAM_KEY);
        if (p0.a.g(jVar.getKey(), kVar)) {
            return jVar;
        }
        return null;
    }

    public static final int f(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 >= i3) {
                return i3;
            }
            int i5 = i3 % i4;
            if (i5 < 0) {
                i5 += i4;
            }
            int i6 = i2 % i4;
            if (i6 < 0) {
                i6 += i4;
            }
            int i7 = (i5 - i6) % i4;
            if (i7 < 0) {
                i7 += i4;
            }
            return i3 - i7;
        }
        if (i4 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i2 <= i3) {
            return i3;
        }
        int i8 = -i4;
        int i9 = i2 % i8;
        if (i9 < 0) {
            i9 += i8;
        }
        int i10 = i3 % i8;
        if (i10 < 0) {
            i10 += i8;
        }
        int i11 = (i9 - i10) % i8;
        if (i11 < 0) {
            i11 += i8;
        }
        return i3 + i11;
    }

    public static int g(int i2) {
        return i2 < 0 ? i2 : i2 < 3 ? i2 + 1 : i2 < 1073741824 ? (int) ((i2 / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public static Comparable h(Dp dp, Dp dp2) {
        return dp.compareTo(dp2) >= 0 ? dp : dp2;
    }

    public static h0.l i(h0.j jVar, h0.k kVar) {
        p0.a.s(kVar, SDKConstants.PARAM_KEY);
        return p0.a.g(jVar.getKey(), kVar) ? h0.m.f30726a : jVar;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, o0.a] */
    public static byte[] j(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i2 = (int) length;
            byte[] bArr = new byte[i2];
            int i3 = i2;
            int i4 = 0;
            while (i3 > 0) {
                int read = fileInputStream.read(bArr, i4, i3);
                if (read < 0) {
                    break;
                }
                i3 -= read;
                i4 += read;
            }
            if (i3 > 0) {
                bArr = Arrays.copyOf(bArr, i4);
                p0.a.r(bArr, "copyOf(...)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    ?? byteArrayOutputStream = new ByteArrayOutputStream(8193);
                    byteArrayOutputStream.write(read2);
                    b1.f0.i(fileInputStream, byteArrayOutputStream);
                    int size = byteArrayOutputStream.size() + i2;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] a2 = byteArrayOutputStream.a();
                    bArr = Arrays.copyOf(bArr, size);
                    p0.a.r(bArr, "copyOf(...)");
                    e0.q.Q(a2, i2, bArr, 0, byteArrayOutputStream.size());
                }
            }
            b(fileInputStream, null);
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void k(int i2, int i3, Object[] objArr) {
        p0.a.s(objArr, "<this>");
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static String l(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        exc.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        p0.a.r(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static final void m(Object obj) {
        if (obj instanceof d0.m) {
            throw ((d0.m) obj).f30136a;
        }
    }

    public static final Map n(Map map) {
        p0.a.s(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        p0.a.r(singletonMap, "with(...)");
        return singletonMap;
    }

    public static final double o(long j2) {
        return ((j2 >>> 11) * Opcodes.ACC_STRICT) + (j2 & 2047);
    }

    public static void p(File file, byte[] bArr) {
        p0.a.s(file, "<this>");
        p0.a.s(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            b(fileOutputStream, null);
        } finally {
        }
    }
}
