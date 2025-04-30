package O7;

/* loaded from: classes3.dex */
public abstract class o extends n {
    public static String A(String str, String str2, String str3) {
        G7.j.e(str, "<this>");
        G7.j.e(str2, "oldValue");
        G7.j.e(str3, "newValue");
        int H8 = g.H(0, str, str2, false);
        if (H8 >= 0) {
            int length = str2.length();
            int i9 = 1;
            if (length >= 1) {
                i9 = length;
            }
            int length2 = str3.length() + (str.length() - length);
            if (length2 >= 0) {
                StringBuilder sb = new StringBuilder(length2);
                int i10 = 0;
                do {
                    sb.append((CharSequence) str, i10, H8);
                    sb.append(str3);
                    i10 = H8 + length;
                    if (H8 >= str.length()) {
                        break;
                    }
                    H8 = g.H(H8 + i9, str, str2, false);
                } while (H8 > 0);
                sb.append((CharSequence) str, i10, str.length());
                String sb2 = sb.toString();
                G7.j.d(sb2, "toString(...)");
                return sb2;
            }
            throw new OutOfMemoryError();
        }
        return str;
    }

    public static boolean B(int i9, String str, String str2, boolean z8) {
        G7.j.e(str, "<this>");
        if (!z8) {
            return str.startsWith(str2, i9);
        }
        return z(str, i9, str2, 0, str2.length(), z8);
    }

    public static boolean C(String str, String str2, boolean z8) {
        G7.j.e(str, "<this>");
        G7.j.e(str2, "prefix");
        if (!z8) {
            return str.startsWith(str2);
        }
        return z(str, 0, str2, 0, str2.length(), z8);
    }

    public static boolean x(String str, String str2) {
        G7.j.e(str, "<this>");
        return str.endsWith(str2);
    }

    public static boolean y(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static boolean z(String str, int i9, String str2, int i10, int i11, boolean z8) {
        G7.j.e(str, "<this>");
        G7.j.e(str2, "other");
        if (!z8) {
            return str.regionMatches(i9, str2, i10, i11);
        }
        return str.regionMatches(z8, i9, str2, i10, i11);
    }
}
