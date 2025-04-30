package H5;

import java.util.EnumMap;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class f extends y8.a {
    public final /* synthetic */ int b;

    public /* synthetic */ f(int i9) {
        this.b = i9;
    }

    @Override // y8.a
    public final boolean[] g(String str) {
        switch (this.b) {
            case 0:
                int length = str.length();
                if (length != 12) {
                    if (length == 13) {
                        try {
                            if (!h.z(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (A5.b unused) {
                            throw new IllegalArgumentException("Illegal contents");
                        }
                    } else {
                        throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
                    }
                } else {
                    try {
                        str = str + h.A(str);
                    } catch (A5.b e4) {
                        throw new IllegalArgumentException(e4);
                    }
                }
                int i9 = e.f1383g[Character.digit(str.charAt(0), 10)];
                boolean[] zArr = new boolean[95];
                int a6 = y8.a.a(zArr, 0, h.b, true);
                for (int i10 = 1; i10 <= 6; i10++) {
                    int digit = Character.digit(str.charAt(i10), 10);
                    if (((i9 >> (6 - i10)) & 1) == 1) {
                        digit += 10;
                    }
                    a6 += y8.a.a(zArr, a6, h.f1391f[digit], false);
                }
                int a9 = y8.a.a(zArr, a6, h.f1388c, false) + a6;
                for (int i11 = 7; i11 <= 12; i11++) {
                    a9 += y8.a.a(zArr, a9, h.f1390e[Character.digit(str.charAt(i11), 10)], true);
                }
                y8.a.a(zArr, a9, h.b, true);
                return zArr;
            case 1:
                int length2 = str.length();
                if (length2 != 7) {
                    if (length2 == 8) {
                        try {
                            if (!h.z(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (A5.b unused2) {
                            throw new IllegalArgumentException("Illegal contents");
                        }
                    } else {
                        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length2)));
                    }
                } else {
                    try {
                        str = str + h.A(str);
                    } catch (A5.b e9) {
                        throw new IllegalArgumentException(e9);
                    }
                }
                boolean[] zArr2 = new boolean[67];
                int a10 = y8.a.a(zArr2, 0, h.b, true);
                for (int i12 = 0; i12 <= 3; i12++) {
                    a10 += y8.a.a(zArr2, a10, h.f1390e[Character.digit(str.charAt(i12), 10)], false);
                }
                int a11 = y8.a.a(zArr2, a10, h.f1388c, false) + a10;
                for (int i13 = 4; i13 <= 7; i13++) {
                    a11 += y8.a.a(zArr2, a11, h.f1390e[Character.digit(str.charAt(i13), 10)], true);
                }
                y8.a.a(zArr2, a11, h.b, true);
                return zArr2;
            default:
                int length3 = str.length();
                if (length3 != 7) {
                    if (length3 == 8) {
                        try {
                            if (!h.z(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (A5.b unused3) {
                            throw new IllegalArgumentException("Illegal contents");
                        }
                    } else {
                        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length3)));
                    }
                } else {
                    try {
                        str = str + h.A(e.B(str));
                    } catch (A5.b e10) {
                        throw new IllegalArgumentException(e10);
                    }
                }
                int digit2 = Character.digit(str.charAt(0), 10);
                if (digit2 != 0 && digit2 != 1) {
                    throw new IllegalArgumentException("Number system must be 0 or 1");
                }
                int i14 = e.f1384h[digit2][Character.digit(str.charAt(7), 10)];
                boolean[] zArr3 = new boolean[51];
                int a12 = y8.a.a(zArr3, 0, h.b, true);
                for (int i15 = 1; i15 <= 6; i15++) {
                    int digit3 = Character.digit(str.charAt(i15), 10);
                    if (((i14 >> (6 - i15)) & 1) == 1) {
                        digit3 += 10;
                    }
                    a12 += y8.a.a(zArr3, a12, h.f1391f[digit3], false);
                }
                y8.a.a(zArr3, a12, h.f1389d, false);
                return zArr3;
        }
    }

    @Override // y8.a
    public final int j() {
        return 9;
    }

    @Override // y8.a, A5.d
    public final D5.b n(String str, int i9, EnumMap enumMap) {
        switch (this.b) {
            case 0:
                if (i9 == 8) {
                    return super.n(str, i9, enumMap);
                }
                throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(AbstractC2914a.m(i9)));
            case 1:
                if (i9 == 7) {
                    return super.n(str, i9, enumMap);
                }
                throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(AbstractC2914a.m(i9)));
            default:
                if (i9 == 16) {
                    return super.n(str, i9, enumMap);
                }
                throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(AbstractC2914a.m(i9)));
        }
    }
}
