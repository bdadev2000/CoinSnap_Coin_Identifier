package x8;

import G7.j;
import w8.f;
import w8.q;
import w8.u;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f24249a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(O7.a.f2244a);
        j.d(bytes, "(this as java.lang.String).getBytes(charset)");
        f24249a = bytes;
    }

    public static final String a(f fVar, long j7) {
        j.e(fVar, "<this>");
        if (j7 > 0) {
            long j9 = j7 - 1;
            if (fVar.c(j9) == ((byte) 13)) {
                String readString = fVar.readString(j9, O7.a.f2244a);
                fVar.skip(2L);
                return readString;
            }
        }
        String readString2 = fVar.readString(j7, O7.a.f2244a);
        fVar.skip(1L);
        return readString2;
    }

    public static final int b(f fVar, q qVar, boolean z8) {
        int i9;
        int i10;
        boolean z9;
        u uVar;
        byte[] bArr;
        int i11;
        j.e(fVar, "<this>");
        j.e(qVar, "options");
        u uVar2 = fVar.b;
        int i12 = -2;
        if (uVar2 == null) {
            if (z8) {
                return -2;
            }
            return -1;
        }
        int i13 = uVar2.b;
        int i14 = uVar2.f24042c;
        byte[] bArr2 = uVar2.f24041a;
        u uVar3 = uVar2;
        int i15 = -1;
        int i16 = 0;
        loop0: while (true) {
            int i17 = i16 + 1;
            int[] iArr = qVar.f24031c;
            int i18 = iArr[i16];
            int i19 = i16 + 2;
            int i20 = iArr[i17];
            if (i20 != -1) {
                i15 = i20;
            }
            if (uVar3 == null) {
                break;
            }
            if (i18 < 0) {
                int i21 = (i18 * (-1)) + i19;
                while (true) {
                    int i22 = i13 + 1;
                    int i23 = i19 + 1;
                    if ((bArr2[i13] & 255) != iArr[i19]) {
                        return i15;
                    }
                    if (i23 == i21) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (i22 == i14) {
                        j.b(uVar3);
                        u uVar4 = uVar3.f24045f;
                        j.b(uVar4);
                        i11 = uVar4.b;
                        int i24 = uVar4.f24042c;
                        bArr = uVar4.f24041a;
                        if (uVar4 == uVar2) {
                            if (!z9) {
                                break loop0;
                            }
                            i14 = i24;
                            uVar = null;
                        } else {
                            uVar = uVar4;
                            i14 = i24;
                        }
                    } else {
                        uVar = uVar3;
                        bArr = bArr2;
                        i11 = i22;
                    }
                    if (z9) {
                        i9 = iArr[i23];
                        i10 = i11;
                        bArr2 = bArr;
                        uVar3 = uVar;
                        break;
                    }
                    i13 = i11;
                    bArr2 = bArr;
                    uVar3 = uVar;
                    i19 = i23;
                }
            } else {
                int i25 = i13 + 1;
                int i26 = bArr2[i13] & 255;
                int i27 = i19 + i18;
                while (i19 != i27) {
                    if (i26 == iArr[i19]) {
                        i9 = iArr[i19 + i18];
                        if (i25 == i14) {
                            uVar3 = uVar3.f24045f;
                            j.b(uVar3);
                            i10 = uVar3.b;
                            i14 = uVar3.f24042c;
                            bArr2 = uVar3.f24041a;
                            if (uVar3 == uVar2) {
                                uVar3 = null;
                            }
                        } else {
                            i10 = i25;
                        }
                    } else {
                        i19++;
                    }
                }
                return i15;
            }
            if (i9 >= 0) {
                return i9;
            }
            i16 = -i9;
            i13 = i10;
            i12 = -2;
        }
        if (z8) {
            return i12;
        }
        return i15;
    }
}
