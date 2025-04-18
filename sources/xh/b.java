package xh;

import a4.s;
import ei.c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import ki.i;
import ki.k;
import ki.k0;
import ki.l;
import kotlin.ExceptionsKt;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import qc.s0;
import wh.a0;
import wh.c0;
import wh.d0;
import wh.l0;
import wh.r0;
import wh.u0;
import wh.w0;
import wh.x0;
import wh.y0;
import wh.z;

/* loaded from: classes5.dex */
public abstract class b {
    public static final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final z f27677b = s0.n(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final w0 f27678c;

    /* renamed from: d, reason: collision with root package name */
    public static final ki.z f27679d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f27680e;

    /* renamed from: f, reason: collision with root package name */
    public static final Regex f27681f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f27682g;

    static {
        String removeSuffix;
        byte[] bArr = new byte[0];
        a = bArr;
        y0.Companion.getClass();
        f27678c = x0.c(bArr, null);
        r0.d(wh.s0.Companion, bArr, null, 0, 7);
        int i10 = ki.z.f21034d;
        l lVar = l.f20996f;
        f27679d = a0.B(a0.n("efbbbf"), a0.n("feff"), a0.n("fffe"), a0.n("0000ffff"), a0.n("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        f27680e = timeZone;
        f27681f = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = l0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        removeSuffix = StringsKt__StringsKt.removeSuffix(StringsKt.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
        f27682g = removeSuffix;
    }

    public static final void A(IOException iOException, List suppressed) {
        Intrinsics.checkNotNullParameter(iOException, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(iOException, (Exception) it.next());
        }
    }

    public static final boolean a(d0 d0Var, d0 other) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (Intrinsics.areEqual(d0Var.f27035d, other.f27035d) && d0Var.f27036e == other.f27036e && Intrinsics.areEqual(d0Var.a, other.a)) {
            return true;
        }
        return false;
    }

    public static final int b(TimeUnit timeUnit) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter("timeout", "name");
        boolean z12 = true;
        if (timeUnit != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long millis = timeUnit.toMillis(30L);
            if (millis <= 2147483647L) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (millis == 0) {
                    z12 = false;
                }
                if (z12) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(Intrinsics.stringPlus("timeout", " too small.").toString());
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("timeout", " too large.").toString());
        }
        throw new IllegalStateException("unit == null".toString());
    }

    public static final void c(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e10) {
            if (Intrinsics.areEqual(e10.getMessage(), "bio == null")) {
            } else {
                throw e10;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i10, int i11, String str, String delimiters) {
        boolean contains$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i10 < i11) {
            int i12 = i10 + 1;
            contains$default = StringsKt__StringsKt.contains$default(delimiters, str.charAt(i10), false, 2, (Object) null);
            if (contains$default) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static final int f(String str, int i10, int i11, char c10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static final boolean g(k0 k0Var, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return u(k0Var, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format2, "format(locale, format, *args)");
        return format2;
    }

    public static final boolean i(Comparator comparator, String[] strArr, String[] strArr2) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && strArr2 != null) {
            if (strArr2.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                int length = strArr.length;
                int i10 = 0;
                while (i10 < length) {
                    String str = strArr[i10];
                    i10++;
                    Iterator it = ArrayIteratorKt.iterator(strArr2);
                    while (it.hasNext()) {
                        if (comparator.compare(str, (String) it.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long j(u0 u0Var) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        String a10 = u0Var.f27218h.a("Content-Length");
        if (a10 != null) {
            Intrinsics.checkNotNullParameter(a10, "<this>");
            try {
                return Long.parseLong(a10);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public static final List k(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List unmodifiableList = Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int l(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char charAt = str.charAt(i10);
            if (Intrinsics.compare((int) charAt, 31) > 0 && Intrinsics.compare((int) charAt, 127) < 0) {
                i10 = i11;
            } else {
                return i10;
            }
        }
        return -1;
    }

    public static final int m(int i10, int i11, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            char charAt = str.charAt(i10);
            boolean z13 = false;
            if (charAt == '\t' || charAt == '\n') {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || charAt == '\f') {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 || charAt == '\r') {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 || charAt == ' ') {
                z13 = true;
            }
            if (z13) {
                i10 = i12;
            } else {
                return i10;
            }
        }
        return i11;
    }

    public static final int n(int i10, int i11, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                int i13 = i12 - 1;
                char charAt = str.charAt(i12);
                boolean z13 = false;
                if (charAt == '\t' || charAt == '\n') {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 || charAt == '\f') {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 || charAt == '\r') {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12 || charAt == ' ') {
                    z13 = true;
                }
                if (z13) {
                    if (i12 == i10) {
                        break;
                    }
                    i12 = i13;
                } else {
                    return i12 + 1;
                }
            }
        }
        return i10;
    }

    public static final String[] o(Comparator comparator, String[] strArr, String[] other) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str = strArr[i10];
            i10++;
            int length2 = other.length;
            int i11 = 0;
            while (true) {
                if (i11 < length2) {
                    String str2 = other[i11];
                    i11++;
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

    public static final boolean p(String name) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        boolean equals4;
        Intrinsics.checkNotNullParameter(name, "name");
        equals = StringsKt__StringsJVMKt.equals(name, "Authorization", true);
        if (!equals) {
            equals2 = StringsKt__StringsJVMKt.equals(name, "Cookie", true);
            if (!equals2) {
                equals3 = StringsKt__StringsJVMKt.equals(name, "Proxy-Authorization", true);
                if (!equals3) {
                    equals4 = StringsKt__StringsJVMKt.equals(name, "Set-Cookie", true);
                    if (!equals4) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final int q(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (!('a' <= c10 && c10 < 'g')) {
            c11 = 'A';
            if (!('A' <= c10 && c10 < 'G')) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static final Charset r(k kVar, Charset charset) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int e2 = kVar.e(f27679d);
        if (e2 != -1) {
            if (e2 != 0) {
                if (e2 != 1) {
                    if (e2 != 2) {
                        if (e2 != 3) {
                            if (e2 == 4) {
                                return Charsets.INSTANCE.UTF32_LE();
                            }
                            throw new AssertionError();
                        }
                        return Charsets.INSTANCE.UTF32_BE();
                    }
                    Charset UTF_16LE = StandardCharsets.UTF_16LE;
                    Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
                    return UTF_16LE;
                }
                Charset UTF_16BE = StandardCharsets.UTF_16BE;
                Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
                return UTF_16BE;
            }
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        return charset;
    }

    public static final int s(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return (kVar.readByte() & UByte.MAX_VALUE) | ((kVar.readByte() & UByte.MAX_VALUE) << 16) | ((kVar.readByte() & UByte.MAX_VALUE) << 8);
    }

    public static final int t(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        int i10 = 0;
        while (!iVar.exhausted() && iVar.k(0L) == 61) {
            i10++;
            iVar.readByte();
        }
        return i10;
    }

    public static final boolean u(k0 k0Var, int i10, TimeUnit timeUnit) {
        long j3;
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        if (k0Var.timeout().e()) {
            j3 = k0Var.timeout().c() - nanoTime;
        } else {
            j3 = Long.MAX_VALUE;
        }
        k0Var.timeout().d(Math.min(j3, timeUnit.toNanos(i10)) + nanoTime);
        try {
            i iVar = new i();
            while (k0Var.read(iVar, 8192L) != -1) {
                iVar.d();
            }
            if (j3 == Long.MAX_VALUE) {
                k0Var.timeout().a();
            } else {
                k0Var.timeout().d(nanoTime + j3);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (j3 == Long.MAX_VALUE) {
                k0Var.timeout().a();
            } else {
                k0Var.timeout().d(nanoTime + j3);
            }
            return false;
        } catch (Throwable th2) {
            if (j3 == Long.MAX_VALUE) {
                k0Var.timeout().a();
            } else {
                k0Var.timeout().d(nanoTime + j3);
            }
            throw th2;
        }
    }

    public static final z v(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        s sVar = new s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            sVar.c(cVar.a.q(), cVar.f17396b.q());
        }
        return sVar.d();
    }

    public static final String w(d0 d0Var, boolean z10) {
        boolean contains$default;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        contains$default = StringsKt__StringsKt.contains$default(d0Var.f27035d, ":", false, 2, (Object) null);
        String str = d0Var.f27035d;
        if (contains$default) {
            str = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.l("[", str, AbstractJsonLexerKt.END_LIST);
        }
        int i10 = d0Var.f27036e;
        if (!z10) {
            char[] cArr = d0.f27032k;
            if (i10 == c0.f(d0Var.a)) {
                return str;
            }
        }
        return str + AbstractJsonLexerKt.COLON + i10;
    }

    public static final List x(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(CollectionsKt.toMutableList((Collection) list));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int y(int i10, String str) {
        Long valueOf;
        if (str == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i10;
            }
        }
        if (valueOf == null) {
            return i10;
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

    public static final String z(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int m10 = m(i10, i11, str);
        String substring = str.substring(m10, n(m10, i11, str));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
