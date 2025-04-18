package fd;

import java.util.Map;

/* loaded from: classes4.dex */
public final class g extends j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17807b;

    public /* synthetic */ g(int i10) {
        this.f17807b = i10;
    }

    @Override // s.a, ad.e
    public final cd.b c(String str, ad.a aVar, int i10, int i11, Map map) {
        switch (this.f17807b) {
            case 0:
                if (aVar == ad.a.EAN_13) {
                    return super.c(str, aVar, i10, i11, map);
                }
                throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
            case 1:
                if (aVar == ad.a.EAN_8) {
                    return super.c(str, aVar, i10, i11, map);
                }
                throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
            default:
                if (aVar == ad.a.UPC_E) {
                    return super.c(str, aVar, i10, i11, map);
                }
                throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(aVar)));
        }
    }

    @Override // s.a
    public final boolean[] h(String str) {
        switch (this.f17807b) {
            case 0:
                int length = str.length();
                if (length != 12) {
                    if (length == 13) {
                        try {
                            if (!i.J(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (ad.c unused) {
                            throw new IllegalArgumentException("Illegal contents");
                        }
                    } else {
                        throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
                    }
                } else {
                    try {
                        str = str + i.K(str);
                    } catch (ad.c e2) {
                        throw new IllegalArgumentException(e2);
                    }
                }
                int i10 = f.f17805j[Character.digit(str.charAt(0), 10)];
                boolean[] zArr = new boolean[95];
                int a = s.a.a(zArr, 0, i.f17811e, true) + 0;
                for (int i11 = 1; i11 <= 6; i11++) {
                    int digit = Character.digit(str.charAt(i11), 10);
                    if (((i10 >> (6 - i11)) & 1) == 1) {
                        digit += 10;
                    }
                    a += s.a.a(zArr, a, i.f17815i[digit], false);
                }
                int a10 = s.a.a(zArr, a, i.f17812f, false) + a;
                for (int i12 = 7; i12 <= 12; i12++) {
                    a10 += s.a.a(zArr, a10, i.f17814h[Character.digit(str.charAt(i12), 10)], true);
                }
                s.a.a(zArr, a10, i.f17811e, true);
                return zArr;
            case 1:
                int length2 = str.length();
                if (length2 != 7) {
                    if (length2 == 8) {
                        try {
                            if (!i.J(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (ad.c unused2) {
                            throw new IllegalArgumentException("Illegal contents");
                        }
                    } else {
                        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length2)));
                    }
                } else {
                    try {
                        str = str + i.K(str);
                    } catch (ad.c e10) {
                        throw new IllegalArgumentException(e10);
                    }
                }
                boolean[] zArr2 = new boolean[67];
                int a11 = s.a.a(zArr2, 0, i.f17811e, true) + 0;
                for (int i13 = 0; i13 <= 3; i13++) {
                    a11 += s.a.a(zArr2, a11, i.f17814h[Character.digit(str.charAt(i13), 10)], false);
                }
                int a12 = s.a.a(zArr2, a11, i.f17812f, false) + a11;
                for (int i14 = 4; i14 <= 7; i14++) {
                    a12 += s.a.a(zArr2, a12, i.f17814h[Character.digit(str.charAt(i14), 10)], true);
                }
                s.a.a(zArr2, a12, i.f17811e, true);
                return zArr2;
            default:
                int length3 = str.length();
                if (length3 != 7) {
                    if (length3 == 8) {
                        try {
                            if (!i.J(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (ad.c unused3) {
                            throw new IllegalArgumentException("Illegal contents");
                        }
                    } else {
                        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length3)));
                    }
                } else {
                    try {
                        str = str + i.K(f.L(str));
                    } catch (ad.c e11) {
                        throw new IllegalArgumentException(e11);
                    }
                }
                int digit2 = Character.digit(str.charAt(0), 10);
                if (digit2 != 0 && digit2 != 1) {
                    throw new IllegalArgumentException("Number system must be 0 or 1");
                }
                int i15 = f.f17806k[digit2][Character.digit(str.charAt(7), 10)];
                boolean[] zArr3 = new boolean[51];
                int a13 = s.a.a(zArr3, 0, i.f17811e, true) + 0;
                for (int i16 = 1; i16 <= 6; i16++) {
                    int digit3 = Character.digit(str.charAt(i16), 10);
                    if (((i15 >> (6 - i16)) & 1) == 1) {
                        digit3 += 10;
                    }
                    a13 += s.a.a(zArr3, a13, i.f17815i[digit3], false);
                }
                s.a.a(zArr3, a13, i.f17813g, false);
                return zArr3;
        }
    }
}
