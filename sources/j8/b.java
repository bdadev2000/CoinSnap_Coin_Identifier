package j8;

import G7.j;
import M0.C0219j;
import O7.e;
import O7.g;
import com.adjust.sdk.Constants;
import i8.F;
import i8.G;
import i8.I;
import i8.K;
import i8.L;
import i8.M;
import i8.s;
import i8.u;
import i8.z;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p8.C2575c;
import t7.AbstractC2712a;
import u7.AbstractC2816g;
import u7.AbstractC2817h;
import w4.v0;
import w8.h;
import w8.i;
import w8.q;
import w8.y;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f21214a;
    public static final s b = C0219j.v(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final K f21215c;

    /* renamed from: d, reason: collision with root package name */
    public static final q f21216d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f21217e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f21218f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f21219g;

    static {
        byte[] bArr = new byte[0];
        f21214a = bArr;
        M.Companion.getClass();
        f21215c = L.c(bArr, null);
        F.d(G.Companion, bArr, null, 0, 7);
        i iVar = i.f24015f;
        f21216d = v0.y(r6.b.b("efbbbf"), r6.b.b("feff"), r6.b.b("fffe"), r6.b.b("0000ffff"), r6.b.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        j.b(timeZone);
        f21217e = timeZone;
        f21218f = new e("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String R4 = g.R(z.class.getName(), "okhttp3.");
        if (R4.endsWith("Client")) {
            R4 = R4.substring(0, R4.length() - "Client".length());
            j.d(R4, "substring(...)");
        }
        f21219g = R4;
    }

    public static final boolean a(u uVar, u uVar2) {
        j.e(uVar, "<this>");
        j.e(uVar2, "other");
        if (j.a(uVar.f20886d, uVar2.f20886d) && uVar.f20887e == uVar2.f20887e && j.a(uVar.f20884a, uVar2.f20884a)) {
            return true;
        }
        return false;
    }

    public static final int b(TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(30L);
        if (millis <= 2147483647L) {
            if (millis != 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException(j.j(" too small.", "timeout").toString());
        }
        throw new IllegalArgumentException(j.j(" too large.", "timeout").toString());
    }

    public static final void c(Closeable closeable) {
        j.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        j.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e9) {
            if (j.a(e9.getMessage(), "bio == null")) {
            } else {
                throw e9;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i9, int i10, String str, String str2) {
        j.e(str, "<this>");
        while (i9 < i10) {
            int i11 = i9 + 1;
            if (g.D(str2, str.charAt(i9))) {
                return i9;
            }
            i9 = i11;
        }
        return i10;
    }

    public static final int f(String str, int i9, int i10, char c9) {
        j.e(str, "<this>");
        while (i9 < i10) {
            int i11 = i9 + 1;
            if (str.charAt(i9) == c9) {
                return i9;
            }
            i9 = i11;
        }
        return i10;
    }

    public static final boolean g(y yVar, TimeUnit timeUnit) {
        j.e(yVar, "<this>");
        j.e(timeUnit, "timeUnit");
        try {
            return t(yVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String str, Object... objArr) {
        j.e(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean i(Comparator comparator, String[] strArr, String[] strArr2) {
        j.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i9 = 0;
            while (i9 < length) {
                String str = strArr[i9];
                i9++;
                G7.a h6 = j.h(strArr2);
                while (h6.hasNext()) {
                    if (comparator.compare(str, (String) h6.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(I i9) {
        String b8 = i9.f20778h.b("Content-Length");
        if (b8 != null) {
            try {
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }
        return Long.parseLong(b8);
    }

    public static final List k(Object... objArr) {
        j.e(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(AbstractC2817h.B(Arrays.copyOf(objArr2, objArr2.length)));
        j.d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            int i10 = i9 + 1;
            char charAt = str.charAt(i9);
            if (j.f(charAt, 31) > 0 && j.f(charAt, 127) < 0) {
                i9 = i10;
            } else {
                return i9;
            }
        }
        return -1;
    }

    public static final int m(int i9, int i10, String str) {
        j.e(str, "<this>");
        while (i9 < i10) {
            int i11 = i9 + 1;
            char charAt = str.charAt(i9);
            if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                i9 = i11;
            } else {
                return i9;
            }
        }
        return i10;
    }

    public static final int n(int i9, int i10, String str) {
        j.e(str, "<this>");
        int i11 = i10 - 1;
        if (i9 <= i11) {
            while (true) {
                int i12 = i11 - 1;
                char charAt = str.charAt(i11);
                if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                    if (i11 == i9) {
                        break;
                    }
                    i11 = i12;
                } else {
                    return i11 + 1;
                }
            }
        }
        return i9;
    }

    public static final String[] o(Comparator comparator, String[] strArr, String[] strArr2) {
        j.e(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i9 = 0;
        while (i9 < length) {
            String str = strArr[i9];
            i9++;
            int length2 = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 < length2) {
                    String str2 = strArr2[i10];
                    i10++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean p(String str) {
        j.e(str, "name");
        if (!str.equalsIgnoreCase("Authorization") && !str.equalsIgnoreCase("Cookie") && !str.equalsIgnoreCase("Proxy-Authorization") && !str.equalsIgnoreCase("Set-Cookie")) {
            return false;
        }
        return true;
    }

    public static final int q(char c9) {
        if ('0' <= c9 && c9 < ':') {
            return c9 - '0';
        }
        if ('a' <= c9 && c9 < 'g') {
            return c9 - 'W';
        }
        if ('A' <= c9 && c9 < 'G') {
            return c9 - '7';
        }
        return -1;
    }

    public static final Charset r(h hVar, Charset charset) {
        Charset charset2;
        j.e(hVar, "<this>");
        j.e(charset, "default");
        int g9 = hVar.g(f21216d);
        if (g9 != -1) {
            if (g9 != 0) {
                if (g9 != 1) {
                    if (g9 != 2) {
                        if (g9 != 3) {
                            if (g9 == 4) {
                                Charset charset3 = O7.a.f2244a;
                                charset2 = O7.a.b;
                                if (charset2 == null) {
                                    charset2 = Charset.forName("UTF-32LE");
                                    j.d(charset2, "forName(...)");
                                    O7.a.b = charset2;
                                }
                            } else {
                                throw new AssertionError();
                            }
                        } else {
                            Charset charset4 = O7.a.f2244a;
                            charset2 = O7.a.f2245c;
                            if (charset2 == null) {
                                charset2 = Charset.forName("UTF-32BE");
                                j.d(charset2, "forName(...)");
                                O7.a.f2245c = charset2;
                            }
                        }
                        return charset2;
                    }
                    Charset charset5 = StandardCharsets.UTF_16LE;
                    j.d(charset5, "UTF_16LE");
                    return charset5;
                }
                Charset charset6 = StandardCharsets.UTF_16BE;
                j.d(charset6, "UTF_16BE");
                return charset6;
            }
            Charset charset7 = StandardCharsets.UTF_8;
            j.d(charset7, "UTF_8");
            return charset7;
        }
        return charset;
    }

    public static final int s(h hVar) {
        j.e(hVar, "<this>");
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, w8.f] */
    public static final boolean t(y yVar, int i9, TimeUnit timeUnit) {
        long j7;
        j.e(yVar, "<this>");
        j.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        if (yVar.timeout().e()) {
            j7 = yVar.timeout().c() - nanoTime;
        } else {
            j7 = Long.MAX_VALUE;
        }
        yVar.timeout().d(Math.min(j7, timeUnit.toNanos(i9)) + nanoTime);
        try {
            ?? obj = new Object();
            while (yVar.read(obj, 8192L) != -1) {
                obj.skip(obj.f24014c);
            }
            if (j7 == Long.MAX_VALUE) {
                yVar.timeout().a();
            } else {
                yVar.timeout().d(nanoTime + j7);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (j7 == Long.MAX_VALUE) {
                yVar.timeout().a();
            } else {
                yVar.timeout().d(nanoTime + j7);
            }
            return false;
        } catch (Throwable th) {
            if (j7 == Long.MAX_VALUE) {
                yVar.timeout().a();
            } else {
                yVar.timeout().d(nanoTime + j7);
            }
            throw th;
        }
    }

    public static final s u(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2575c c2575c = (C2575c) it.next();
            String j7 = c2575c.f22396a.j();
            String j9 = c2575c.b.j();
            arrayList.add(j7);
            arrayList.add(g.a0(j9).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new s((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final String v(u uVar, boolean z8) {
        int i9;
        j.e(uVar, "<this>");
        String str = uVar.f20886d;
        if (g.E(":", str)) {
            str = "[" + str + ']';
        }
        int i10 = uVar.f20887e;
        if (!z8) {
            String str2 = uVar.f20884a;
            j.e(str2, "scheme");
            if (str2.equals("http")) {
                i9 = 80;
            } else if (str2.equals(Constants.SCHEME)) {
                i9 = 443;
            } else {
                i9 = -1;
            }
            if (i10 == i9) {
                return str;
            }
        }
        return str + ':' + i10;
    }

    public static final List w(List list) {
        j.e(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(AbstractC2816g.U(list));
        j.d(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int x(int i9, String str) {
        Long valueOf;
        if (str == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i9;
            }
        }
        if (valueOf == null) {
            return i9;
        }
        long longValue = valueOf.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final String y(String str, int i9, int i10) {
        int m = m(i9, i10, str);
        String substring = str.substring(m, n(m, i10, str));
        j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void z(Exception exc, List list) {
        j.e(exc, "<this>");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2712a.a(exc, (Exception) it.next());
        }
    }
}
