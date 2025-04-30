package H5;

/* loaded from: classes3.dex */
public final class b extends y8.a {
    public static final char[] b;

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f1379c = {'T', 'N', '*', 'E'};

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f1380d = {'/', ':', '+', '.'};

    /* renamed from: f, reason: collision with root package name */
    public static final char f1381f;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        b = cArr;
        f1381f = cArr[0];
    }

    @Override // y8.a
    public final boolean[] g(String str) {
        int i9;
        int length = str.length();
        char c9 = f1381f;
        if (length < 2) {
            str = c9 + str + c9;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = b;
            boolean z8 = a.z(cArr, upperCase);
            boolean z9 = a.z(cArr, upperCase2);
            char[] cArr2 = f1379c;
            boolean z10 = a.z(cArr2, upperCase);
            boolean z11 = a.z(cArr2, upperCase2);
            if (z8) {
                if (!z9) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (z10) {
                if (!z11) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!z9 && !z11) {
                str = c9 + str + c9;
            } else {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i10 = 20;
        for (int i11 = 1; i11 < str.length() - 1; i11++) {
            if (!Character.isDigit(str.charAt(i11)) && str.charAt(i11) != '-' && str.charAt(i11) != '$') {
                if (a.z(f1380d, str.charAt(i11))) {
                    i10 += 10;
                } else {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i11) + '\'');
                }
            } else {
                i10 += 9;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i10];
        int i12 = 0;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i13));
            if (i13 == 0 || i13 == str.length() - 1) {
                if (upperCase3 != '*') {
                    if (upperCase3 != 'E') {
                        if (upperCase3 != 'N') {
                            if (upperCase3 == 'T') {
                                upperCase3 = 'A';
                            }
                        } else {
                            upperCase3 = 'B';
                        }
                    } else {
                        upperCase3 = 'D';
                    }
                } else {
                    upperCase3 = 'C';
                }
            }
            int i14 = 0;
            while (true) {
                char[] cArr3 = a.b;
                if (i14 < cArr3.length) {
                    if (upperCase3 == cArr3[i14]) {
                        i9 = a.f1378c[i14];
                        break;
                    }
                    i14++;
                } else {
                    i9 = 0;
                    break;
                }
            }
            int i15 = 0;
            int i16 = 0;
            boolean z12 = true;
            while (i15 < 7) {
                zArr[i12] = z12;
                i12++;
                if (((i9 >> (6 - i15)) & 1) != 0 && i16 != 1) {
                    i16++;
                } else {
                    z12 = !z12;
                    i15++;
                    i16 = 0;
                }
            }
            if (i13 < str.length() - 1) {
                zArr[i12] = false;
                i12++;
            }
        }
        return zArr;
    }
}
