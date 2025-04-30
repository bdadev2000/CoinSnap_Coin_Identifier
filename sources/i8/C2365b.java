package i8;

import com.applovin.exoplayer2.common.base.Ascii;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import u7.AbstractC2815f;

/* renamed from: i8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2365b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2365b f20808a = new Object();
    public static final C2365b b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final C2365b f20809c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final C2365b f20810d = new Object();

    public static final C2377n a(C2365b c2365b, String str) {
        C2377n c2377n = new C2377n(str);
        C2377n.f20840d.put(str, c2377n);
        return c2377n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [w8.f] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, w8.f] */
    public static String b(String str, int i9, int i10, String str2, boolean z8, boolean z9, boolean z10, boolean z11, int i11) {
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        boolean z14;
        String str3;
        boolean z15 = false;
        if ((i11 & 1) != 0) {
            i12 = 0;
        } else {
            i12 = i9;
        }
        if ((i11 & 2) != 0) {
            i13 = str.length();
        } else {
            i13 = i10;
        }
        if ((i11 & 8) != 0) {
            z12 = false;
        } else {
            z12 = z8;
        }
        if ((i11 & 16) != 0) {
            z13 = false;
        } else {
            z13 = z9;
        }
        if ((i11 & 32) != 0) {
            z14 = false;
        } else {
            z14 = z10;
        }
        if ((i11 & 64) == 0) {
            z15 = z11;
        }
        G7.j.e(str, "<this>");
        int i14 = i12;
        while (i14 < i13) {
            int codePointAt = str.codePointAt(i14);
            int i15 = 32;
            int i16 = 128;
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z15) && !O7.g.D(str2, (char) codePointAt) && ((codePointAt != 37 || (z12 && (!z13 || d(i14, i13, str)))) && (codePointAt != 43 || !z14)))) {
                i14 += Character.charCount(codePointAt);
            } else {
                ?? obj = new Object();
                obj.t(i12, i14, str);
                ?? r22 = 0;
                while (i14 < i13) {
                    int codePointAt2 = str.codePointAt(i14);
                    if (!z12 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z14) {
                            if (z12) {
                                str3 = "+";
                            } else {
                                str3 = "%2B";
                            }
                            obj.u(str3);
                        } else if (codePointAt2 >= i15 && codePointAt2 != 127 && ((codePointAt2 < i16 || z15) && !O7.g.D(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z12 && (!z13 || d(i14, i13, str)))))) {
                            obj.v(codePointAt2);
                        } else {
                            if (r22 == 0) {
                                r22 = new Object();
                            }
                            r22.v(codePointAt2);
                            while (!r22.exhausted()) {
                                byte readByte = r22.readByte();
                                obj.n(37);
                                char[] cArr = u.f20883k;
                                obj.n(cArr[((readByte & 255) >> 4) & 15]);
                                obj.n(cArr[readByte & Ascii.SI]);
                            }
                        }
                    }
                    i14 += Character.charCount(codePointAt2);
                    i15 = 32;
                    i16 = 128;
                    r22 = r22;
                }
                return obj.readUtf8();
            }
        }
        String substring = str.substring(i12, i13);
        G7.j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean d(int i9, int i10, String str) {
        int i11 = i9 + 2;
        if (i11 < i10 && str.charAt(i9) == '%' && j8.b.q(str.charAt(i9 + 1)) != -1 && j8.b.q(str.charAt(i11)) != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, w8.f] */
    public static String f(int i9, int i10, String str, int i11, boolean z8) {
        int i12;
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        if ((i11 & 4) != 0) {
            z8 = false;
        }
        G7.j.e(str, "<this>");
        int i13 = i9;
        while (i13 < i10) {
            int i14 = i13 + 1;
            char charAt = str.charAt(i13);
            if (charAt != '%' && (charAt != '+' || !z8)) {
                i13 = i14;
            } else {
                ?? obj = new Object();
                obj.t(i9, i13, str);
                while (i13 < i10) {
                    int codePointAt = str.codePointAt(i13);
                    if (codePointAt == 37 && (i12 = i13 + 2) < i10) {
                        int q9 = j8.b.q(str.charAt(i13 + 1));
                        int q10 = j8.b.q(str.charAt(i12));
                        if (q9 != -1 && q10 != -1) {
                            obj.n((q9 << 4) + q10);
                            i13 = Character.charCount(codePointAt) + i12;
                        }
                        obj.v(codePointAt);
                        i13 += Character.charCount(codePointAt);
                    } else {
                        if (codePointAt == 43 && z8) {
                            obj.n(32);
                            i13++;
                        }
                        obj.v(codePointAt);
                        i13 += Character.charCount(codePointAt);
                    }
                }
                return obj.readUtf8();
            }
        }
        String substring = str.substring(i9, i10);
        G7.j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList g(String str) {
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 <= str.length()) {
            int I5 = O7.g.I(str, '&', i9, false, 4);
            if (I5 == -1) {
                I5 = str.length();
            }
            int I7 = O7.g.I(str, '=', i9, false, 4);
            if (I7 != -1 && I7 <= I5) {
                String substring = str.substring(i9, I7);
                G7.j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                String substring2 = str.substring(I7 + 1, I5);
                G7.j.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
            } else {
                String substring3 = str.substring(i9, I5);
                G7.j.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
                arrayList.add(null);
            }
            i9 = I5 + 1;
        }
        return arrayList;
    }

    public static void h(ArrayList arrayList, StringBuilder sb) {
        G7.j.e(arrayList, "<this>");
        L7.a s5 = e1.f.s(e1.f.t(0, arrayList.size()), 2);
        int i9 = s5.b;
        int i10 = s5.f1830c;
        int i11 = s5.f1831d;
        if ((i11 <= 0 || i9 > i10) && (i11 >= 0 || i10 > i9)) {
            return;
        }
        while (true) {
            int i12 = i9 + i11;
            String str = (String) arrayList.get(i9);
            String str2 = (String) arrayList.get(i9 + 1);
            if (i9 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i9 != i10) {
                i9 = i12;
            } else {
                return;
            }
        }
    }

    public synchronized C2377n c(String str) {
        C2377n c2377n;
        String str2;
        try {
            G7.j.e(str, "javaName");
            LinkedHashMap linkedHashMap = C2377n.f20840d;
            c2377n = (C2377n) linkedHashMap.get(str);
            if (c2377n == null) {
                if (O7.o.C(str, "TLS_", false)) {
                    String substring = str.substring(4);
                    G7.j.d(substring, "this as java.lang.String).substring(startIndex)");
                    str2 = G7.j.j(substring, "SSL_");
                } else if (O7.o.C(str, "SSL_", false)) {
                    String substring2 = str.substring(4);
                    G7.j.d(substring2, "this as java.lang.String).substring(startIndex)");
                    str2 = G7.j.j(substring2, "TLS_");
                } else {
                    str2 = str;
                }
                c2377n = (C2377n) linkedHashMap.get(str2);
                if (c2377n == null) {
                    c2377n = new C2377n(str);
                }
                linkedHashMap.put(str, c2377n);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c2377n;
    }

    public List e(String str) {
        G7.j.e(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            G7.j.d(allByName, "getAllByName(hostname)");
            return AbstractC2815f.D(allByName);
        } catch (NullPointerException e4) {
            UnknownHostException unknownHostException = new UnknownHostException(G7.j.j(str, "Broken system behaviour for dns lookup of "));
            unknownHostException.initCause(e4);
            throw unknownHostException;
        }
    }
}
