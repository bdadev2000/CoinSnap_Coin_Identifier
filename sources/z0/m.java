package z0;

import b1.f0;
import e0.b0;
import e0.o;
import e0.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class m extends j {
    public static String L0(char[] cArr, int i2, int i3) {
        e0.b bVar = e0.f.Companion;
        int length = cArr.length;
        bVar.getClass();
        if (i2 < 0 || i3 > length) {
            StringBuilder u2 = android.support.v4.media.d.u("startIndex: ", i2, ", endIndex: ", i3, ", size: ");
            u2.append(length);
            throw new IndexOutOfBoundsException(u2.toString());
        }
        if (i2 <= i3) {
            return new String(cArr, i2, i3 - i2);
        }
        throw new IllegalArgumentException(android.support.v4.media.d.k("startIndex: ", i2, " > endIndex: ", i3));
    }

    public static boolean M0(CharSequence charSequence, CharSequence charSequence2, boolean z2) {
        p0.a.s(charSequence, "<this>");
        p0.a.s(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (X0(charSequence, (String) charSequence2, 0, z2, 2) < 0) {
                return false;
            }
        } else if (V0(charSequence, charSequence2, 0, charSequence.length(), z2, false) < 0) {
            return false;
        }
        return true;
    }

    public static boolean N0(CharSequence charSequence, char c2) {
        p0.a.s(charSequence, "<this>");
        return W0(charSequence, c2, 0, false, 2) >= 0;
    }

    public static boolean O0(CharSequence charSequence, CharSequence charSequence2) {
        boolean z2 = charSequence instanceof String;
        if (z2 && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z2 && (charSequence2 instanceof String)) {
            return p0.a.g(charSequence, charSequence2);
        }
        if (charSequence != charSequence2) {
            if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
                int length = charSequence.length();
                for (int i2 = 0; i2 < length; i2++) {
                    if (charSequence.charAt(i2) == charSequence2.charAt(i2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean P0(String str, String str2, boolean z2) {
        p0.a.s(str, "<this>");
        p0.a.s(str2, "suffix");
        return !z2 ? str.endsWith(str2) : e1(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static boolean Q0(CharSequence charSequence, String str) {
        return charSequence instanceof String ? P0((String) charSequence, str, false) : f1(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean R0(String str, char c2) {
        return str.length() > 0 && p0.a.d0(str.charAt(T0(str)), c2, false);
    }

    public static boolean S0(String str, String str2, boolean z2) {
        return str == null ? str2 == null : !z2 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static int T0(CharSequence charSequence) {
        p0.a.s(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int U0(int i2, CharSequence charSequence, String str, boolean z2) {
        p0.a.s(charSequence, "<this>");
        p0.a.s(str, "string");
        return (z2 || !(charSequence instanceof String)) ? V0(charSequence, str, i2, charSequence.length(), z2, false) : ((String) charSequence).indexOf(str, i2);
    }

    public static final int V0(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z2, boolean z3) {
        w0.e eVar;
        if (z3) {
            int T0 = T0(charSequence);
            if (i2 > T0) {
                i2 = T0;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            eVar = new w0.e(i2, i3, -1);
        } else {
            if (i2 < 0) {
                i2 = 0;
            }
            int length = charSequence.length();
            if (i3 > length) {
                i3 = length;
            }
            eVar = new w0.e(i2, i3, 1);
        }
        boolean z4 = charSequence instanceof String;
        int i4 = eVar.f31408c;
        int i5 = eVar.f31407b;
        int i6 = eVar.f31406a;
        if (z4 && (charSequence2 instanceof String)) {
            if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
                while (!e1(0, i6, charSequence2.length(), (String) charSequence2, (String) charSequence, z2)) {
                    if (i6 != i5) {
                        i6 += i4;
                    }
                }
                return i6;
            }
        } else if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
            while (!f1(charSequence2, 0, charSequence, i6, charSequence2.length(), z2)) {
                if (i6 != i5) {
                    i6 += i4;
                }
            }
            return i6;
        }
        return -1;
    }

    public static int W0(CharSequence charSequence, char c2, int i2, boolean z2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        p0.a.s(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? Y0(i2, charSequence, z2, new char[]{c2}) : ((String) charSequence).indexOf(c2, i2);
    }

    public static /* synthetic */ int X0(CharSequence charSequence, String str, int i2, boolean z2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return U0(i2, charSequence, str, z2);
    }

    public static final int Y0(int i2, CharSequence charSequence, boolean z2, char[] cArr) {
        p0.a.s(charSequence, "<this>");
        p0.a.s(cArr, "chars");
        if (!z2 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(q.h0(cArr), i2);
        }
        if (i2 < 0) {
            i2 = 0;
        }
        w0.f it = new w0.e(i2, T0(charSequence), 1).iterator();
        while (it.f31411c) {
            int b2 = it.b();
            char charAt = charSequence.charAt(b2);
            for (char c2 : cArr) {
                if (p0.a.d0(c2, charAt, z2)) {
                    return b2;
                }
            }
        }
        return -1;
    }

    public static boolean Z0(CharSequence charSequence) {
        p0.a.s(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        Iterable eVar = new w0.e(0, charSequence.length() - 1, 1);
        if ((eVar instanceof Collection) && ((Collection) eVar).isEmpty()) {
            return true;
        }
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            if (!p0.a.o0(charSequence.charAt(((b0) it).b()))) {
                return false;
            }
        }
        return true;
    }

    public static int a1(CharSequence charSequence, char c2, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = T0(charSequence);
        }
        p0.a.s(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c2, i2);
        }
        char[] cArr = {c2};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(q.h0(cArr), i2);
        }
        int T0 = T0(charSequence);
        if (i2 > T0) {
            i2 = T0;
        }
        while (-1 < i2) {
            if (p0.a.d0(cArr[0], charSequence.charAt(i2), false)) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    public static int b1(CharSequence charSequence, String str, int i2) {
        int T0 = (i2 & 2) != 0 ? T0(charSequence) : 0;
        p0.a.s(charSequence, "<this>");
        p0.a.s(str, "string");
        return !(charSequence instanceof String) ? V0(charSequence, str, T0, 0, false, true) : ((String) charSequence).lastIndexOf(str, T0);
    }

    public static final List c1(CharSequence charSequence) {
        p0.a.s(charSequence, "<this>");
        return y0.m.S(y0.m.P(d1(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new i.i(charSequence, 5)));
    }

    public static c d1(CharSequence charSequence, String[] strArr, boolean z2, int i2) {
        l1(i2);
        return new c(charSequence, 0, i2, new l(1, q.J(strArr), z2));
    }

    public static final boolean e1(int i2, int i3, int i4, String str, String str2, boolean z2) {
        p0.a.s(str, "<this>");
        p0.a.s(str2, "other");
        return !z2 ? str.regionMatches(i2, str2, i3, i4) : str.regionMatches(z2, i2, str2, i3, i4);
    }

    public static final boolean f1(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z2) {
        p0.a.s(charSequence, "<this>");
        p0.a.s(charSequence2, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!p0.a.d0(charSequence.charAt(i2 + i5), charSequence2.charAt(i3 + i5), z2)) {
                return false;
            }
        }
        return true;
    }

    public static String g1(String str, String str2) {
        p0.a.s(str2, "<this>");
        p0.a.s(str, "prefix");
        if (!r1(str2, str)) {
            return str2;
        }
        String substring = str2.substring(str.length());
        p0.a.r(substring, "substring(...)");
        return substring;
    }

    public static String h1(String str, String str2) {
        if (!Q0(str2, str)) {
            return str2;
        }
        String substring = str2.substring(0, str2.length() - str.length());
        p0.a.r(substring, "substring(...)");
        return substring;
    }

    public static String i1(int i2, String str) {
        p0.a.s(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i2 + '.').toString());
        }
        if (i2 == 0) {
            return "";
        }
        if (i2 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = str.charAt(0);
            char[] cArr = new char[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                cArr[i3] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i2);
        w0.f it = new w0.e(1, i2, 1).iterator();
        while (it.f31411c) {
            it.b();
            sb.append((CharSequence) str);
        }
        String sb2 = sb.toString();
        p0.a.p(sb2);
        return sb2;
    }

    public static String j1(String str, char c2, char c3) {
        p0.a.s(str, "<this>");
        String replace = str.replace(c2, c3);
        p0.a.r(replace, "replace(...)");
        return replace;
    }

    public static String k1(String str, String str2, String str3) {
        p0.a.s(str, "<this>");
        p0.a.s(str2, "oldValue");
        p0.a.s(str3, "newValue");
        int U0 = U0(0, str, str2, false);
        if (U0 < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i3 = 0;
        do {
            sb.append((CharSequence) str, i3, U0);
            sb.append(str3);
            i3 = U0 + length;
            if (U0 >= str.length()) {
                break;
            }
            U0 = U0(U0 + i2, str, str2, false);
        } while (U0 > 0);
        sb.append((CharSequence) str, i3, str.length());
        String sb2 = sb.toString();
        p0.a.r(sb2, "toString(...)");
        return sb2;
    }

    public static final void l1(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.i("Limit must be non-negative, but was ", i2).toString());
        }
    }

    public static final List m1(int i2, CharSequence charSequence, String str, boolean z2) {
        l1(i2);
        int i3 = 0;
        int U0 = U0(0, charSequence, str, z2);
        if (U0 == -1 || i2 == 1) {
            return f0.u(charSequence.toString());
        }
        boolean z3 = i2 > 0;
        int i4 = 10;
        if (z3 && i2 <= 10) {
            i4 = i2;
        }
        ArrayList arrayList = new ArrayList(i4);
        do {
            arrayList.add(charSequence.subSequence(i3, U0).toString());
            i3 = str.length() + U0;
            if (z3 && arrayList.size() == i2 - 1) {
                break;
            }
            U0 = U0(i3, charSequence, str, z2);
        } while (U0 != -1);
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public static List n1(CharSequence charSequence, char[] cArr) {
        p0.a.s(charSequence, "<this>");
        int i2 = 0;
        byte b2 = 0;
        if (cArr.length == 1) {
            return m1(0, charSequence, String.valueOf(cArr[0]), false);
        }
        l1(0);
        o oVar = new o(new c(charSequence, 0, 0, new l(i2, cArr, b2 == true ? 1 : 0)), 6);
        ArrayList arrayList = new ArrayList(q.M(oVar, 10));
        Iterator it = oVar.iterator();
        while (it.hasNext()) {
            arrayList.add(s1(charSequence, (w0.g) it.next()));
        }
        return arrayList;
    }

    public static List o1(CharSequence charSequence, String[] strArr, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        p0.a.s(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m1(i2, charSequence, str, false);
            }
        }
        o oVar = new o(d1(charSequence, strArr, false, i2), 6);
        ArrayList arrayList = new ArrayList(q.M(oVar, 10));
        Iterator it = oVar.iterator();
        while (it.hasNext()) {
            arrayList.add(s1(charSequence, (w0.g) it.next()));
        }
        return arrayList;
    }

    public static boolean p1(String str, String str2, int i2, boolean z2) {
        p0.a.s(str, "<this>");
        return !z2 ? str.startsWith(str2, i2) : e1(i2, 0, str2.length(), str, str2, z2);
    }

    public static boolean q1(String str, String str2, boolean z2) {
        p0.a.s(str, "<this>");
        p0.a.s(str2, "prefix");
        return !z2 ? str.startsWith(str2) : e1(0, 0, str2.length(), str, str2, z2);
    }

    public static boolean r1(CharSequence charSequence, String str) {
        p0.a.s(charSequence, "<this>");
        p0.a.s(str, "prefix");
        return charSequence instanceof String ? q1((String) charSequence, str, false) : f1(charSequence, 0, str, 0, str.length(), false);
    }

    public static final String s1(CharSequence charSequence, w0.g gVar) {
        p0.a.s(charSequence, "<this>");
        p0.a.s(gVar, "range");
        return charSequence.subSequence(Integer.valueOf(gVar.f31406a).intValue(), Integer.valueOf(gVar.f31407b).intValue() + 1).toString();
    }

    public static String t1(String str, String str2) {
        p0.a.s(str2, "delimiter");
        int X0 = X0(str, str2, 0, false, 6);
        if (X0 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + X0, str.length());
        p0.a.r(substring, "substring(...)");
        return substring;
    }

    public static String u1(String str, char c2, String str2) {
        p0.a.s(str, "<this>");
        p0.a.s(str2, "missingDelimiterValue");
        int a12 = a1(str, c2, 0, 6);
        if (a12 == -1) {
            return str2;
        }
        String substring = str.substring(a12 + 1, str.length());
        p0.a.r(substring, "substring(...)");
        return substring;
    }

    public static String v1(String str, char c2) {
        int W0 = W0(str, c2, 0, false, 6);
        if (W0 == -1) {
            return str;
        }
        String substring = str.substring(0, W0);
        p0.a.r(substring, "substring(...)");
        return substring;
    }

    public static String w1(String str) {
        p0.a.s(str, "<this>");
        p0.a.s(str, "missingDelimiterValue");
        int b12 = b1(str, ".", 6);
        if (b12 == -1) {
            return str;
        }
        String substring = str.substring(0, b12);
        p0.a.r(substring, "substring(...)");
        return substring;
    }

    public static String x1(String str, char c2) {
        p0.a.s(str, "<this>");
        p0.a.s(str, "missingDelimiterValue");
        int a12 = a1(str, c2, 0, 6);
        if (a12 == -1) {
            return str;
        }
        String substring = str.substring(0, a12);
        p0.a.r(substring, "substring(...)");
        return substring;
    }

    public static CharSequence y1(CharSequence charSequence) {
        p0.a.s(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean o02 = p0.a.o0(charSequence.charAt(!z2 ? i2 : length));
            if (z2) {
                if (!o02) {
                    break;
                }
                length--;
            } else if (o02) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }
}
