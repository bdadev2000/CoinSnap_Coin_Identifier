package O7;

import G7.w;
import Q7.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u7.AbstractC2815f;
import u7.AbstractC2818i;

/* loaded from: classes3.dex */
public abstract class g extends o {
    public static boolean D(CharSequence charSequence, char c9) {
        G7.j.e(charSequence, "<this>");
        if (I(charSequence, c9, 0, false, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean E(String str, CharSequence charSequence) {
        G7.j.e(charSequence, "<this>");
        G7.j.e(str, "other");
        if (J(charSequence, str, 0, false, 2) < 0) {
            return false;
        }
        return true;
    }

    public static String F(int i9, String str) {
        G7.j.e(str, "<this>");
        if (i9 >= 0) {
            int length = str.length();
            if (i9 > length) {
                i9 = length;
            }
            String substring = str.substring(i9);
            G7.j.d(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(n0.f(i9, "Requested character count ", " is less than zero.").toString());
    }

    public static int G(CharSequence charSequence) {
        G7.j.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int H(int i9, CharSequence charSequence, String str, boolean z8) {
        G7.j.e(charSequence, "<this>");
        G7.j.e(str, "string");
        if (!z8 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i9);
        }
        int length = charSequence.length();
        if (i9 < 0) {
            i9 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        L7.a aVar = new L7.a(i9, length, 1);
        boolean z9 = charSequence instanceof String;
        int i10 = aVar.f1831d;
        int i11 = aVar.f1830c;
        int i12 = aVar.b;
        if (z9 && (str instanceof String)) {
            if ((i10 > 0 && i12 <= i11) || (i10 < 0 && i11 <= i12)) {
                while (!o.z(str, 0, (String) charSequence, i12, str.length(), z8)) {
                    if (i12 != i11) {
                        i12 += i10;
                    }
                }
                return i12;
            }
            return -1;
        }
        if ((i10 > 0 && i12 <= i11) || (i10 < 0 && i11 <= i12)) {
            while (!Q(str, 0, charSequence, i12, str.length(), z8)) {
                if (i12 != i11) {
                    i12 += i10;
                }
            }
            return i12;
        }
        return -1;
    }

    public static int I(CharSequence charSequence, char c9, int i9, boolean z8, int i10) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        G7.j.e(charSequence, "<this>");
        if (!z8 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c9, i9);
        }
        return K(charSequence, new char[]{c9}, i9, z8);
    }

    public static /* synthetic */ int J(CharSequence charSequence, String str, int i9, boolean z8, int i10) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        return H(i9, charSequence, str, z8);
    }

    public static final int K(CharSequence charSequence, char[] cArr, int i9, boolean z8) {
        G7.j.e(charSequence, "<this>");
        if (!z8 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC2815f.B(cArr), i9);
        }
        if (i9 < 0) {
            i9 = 0;
        }
        int G3 = G(charSequence);
        if (i9 > G3) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i9);
            for (char c9 : cArr) {
                if (com.facebook.appevents.g.g(c9, charAt, z8)) {
                    return i9;
                }
            }
            if (i9 != G3) {
                i9++;
            } else {
                return -1;
            }
        }
    }

    public static boolean L(CharSequence charSequence) {
        G7.j.e(charSequence, "<this>");
        for (int i9 = 0; i9 < charSequence.length(); i9++) {
            if (!com.facebook.appevents.g.s(charSequence.charAt(i9))) {
                return false;
            }
        }
        return true;
    }

    public static int M(int i9, String str, String str2) {
        int i10;
        if ((i9 & 2) != 0) {
            i10 = G(str);
        } else {
            i10 = 0;
        }
        G7.j.e(str, "<this>");
        G7.j.e(str2, "string");
        return str.lastIndexOf(str2, i10);
    }

    public static int N(CharSequence charSequence, char c9, int i9, int i10) {
        if ((i10 & 2) != 0) {
            i9 = G(charSequence);
        }
        G7.j.e(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            char[] cArr = {c9};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(AbstractC2815f.B(cArr), i9);
            }
            int G3 = G(charSequence);
            if (i9 > G3) {
                i9 = G3;
            }
            while (-1 < i9) {
                if (com.facebook.appevents.g.g(cArr[0], charSequence.charAt(i9), false)) {
                    return i9;
                }
                i9--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c9, i9);
    }

    public static final List O(CharSequence charSequence) {
        G7.j.e(charSequence, "<this>");
        return N7.h.A(new N7.e(P(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new w(charSequence, 2)));
    }

    public static c P(CharSequence charSequence, String[] strArr, boolean z8, int i9) {
        S(i9);
        return new c(charSequence, 0, i9, new p(1, AbstractC2815f.t(strArr), z8));
    }

    public static final boolean Q(CharSequence charSequence, int i9, CharSequence charSequence2, int i10, int i11, boolean z8) {
        G7.j.e(charSequence, "<this>");
        G7.j.e(charSequence2, "other");
        if (i10 < 0 || i9 < 0 || i9 > charSequence.length() - i11 || i10 > charSequence2.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!com.facebook.appevents.g.g(charSequence.charAt(i9 + i12), charSequence2.charAt(i10 + i12), z8)) {
                return false;
            }
        }
        return true;
    }

    public static String R(String str, String str2) {
        if (o.C(str, str2, false)) {
            String substring = str.substring(str2.length());
            G7.j.d(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static final void S(int i9) {
        if (i9 >= 0) {
        } else {
            throw new IllegalArgumentException(com.mbridge.msdk.foundation.entity.o.h(i9, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List T(int i9, CharSequence charSequence, String str, boolean z8) {
        boolean z9;
        S(i9);
        int i10 = 0;
        int H8 = H(0, charSequence, str, z8);
        if (H8 != -1 && i9 != 1) {
            if (i9 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i11 = 10;
            if (z9 && i9 <= 10) {
                i11 = i9;
            }
            ArrayList arrayList = new ArrayList(i11);
            do {
                arrayList.add(charSequence.subSequence(i10, H8).toString());
                i10 = str.length() + H8;
                if (z9 && arrayList.size() == i9 - 1) {
                    break;
                }
                H8 = H(i10, charSequence, str, z8);
            } while (H8 != -1);
            arrayList.add(charSequence.subSequence(i10, charSequence.length()).toString());
            return arrayList;
        }
        return android.support.v4.media.session.a.w(charSequence.toString());
    }

    public static List U(CharSequence charSequence, char[] cArr) {
        G7.j.e(charSequence, "<this>");
        if (cArr.length == 1) {
            return T(0, charSequence, String.valueOf(cArr[0]), false);
        }
        S(0);
        c cVar = new c(charSequence, 0, 0, new p(0, cArr, false));
        ArrayList arrayList = new ArrayList(AbstractC2818i.E(new N7.k(cVar, 0), 10));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(W(charSequence, (L7.c) it.next()));
        }
        return arrayList;
    }

    public static List V(CharSequence charSequence, String[] strArr, int i9, int i10) {
        if ((i10 & 4) != 0) {
            i9 = 0;
        }
        G7.j.e(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return T(i9, charSequence, str, false);
            }
        }
        c P8 = P(charSequence, strArr, false, i9);
        ArrayList arrayList = new ArrayList(AbstractC2818i.E(new N7.k(P8, 0), 10));
        Iterator it = P8.iterator();
        while (it.hasNext()) {
            arrayList.add(W(charSequence, (L7.c) it.next()));
        }
        return arrayList;
    }

    public static final String W(CharSequence charSequence, L7.c cVar) {
        G7.j.e(charSequence, "<this>");
        G7.j.e(cVar, "range");
        return charSequence.subSequence(cVar.b, cVar.f1830c + 1).toString();
    }

    public static String X(String str, String str2) {
        G7.j.e(str, "<this>");
        G7.j.e(str2, "delimiter");
        G7.j.e(str, "missingDelimiterValue");
        int J8 = J(str, str2, 0, false, 6);
        if (J8 != -1) {
            String substring = str.substring(str2.length() + J8, str.length());
            G7.j.d(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static String Y(String str, String str2) {
        G7.j.e(str, "<this>");
        G7.j.e(str2, "missingDelimiterValue");
        int N8 = N(str, '.', 0, 6);
        if (N8 != -1) {
            String substring = str.substring(N8 + 1, str.length());
            G7.j.d(substring, "substring(...)");
            return substring;
        }
        return str2;
    }

    public static String Z(int i9, String str) {
        G7.j.e(str, "<this>");
        if (i9 >= 0) {
            int length = str.length();
            if (i9 > length) {
                i9 = length;
            }
            String substring = str.substring(0, i9);
            G7.j.d(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(n0.f(i9, "Requested character count ", " is less than zero.").toString());
    }

    public static CharSequence a0(CharSequence charSequence) {
        int i9;
        G7.j.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z8 = false;
        while (i10 <= length) {
            if (!z8) {
                i9 = i10;
            } else {
                i9 = length;
            }
            boolean s5 = com.facebook.appevents.g.s(charSequence.charAt(i9));
            if (!z8) {
                if (!s5) {
                    z8 = true;
                } else {
                    i10++;
                }
            } else {
                if (!s5) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }
}
