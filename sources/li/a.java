package li;

import ki.f0;
import ki.z;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public abstract class a {
    public static final byte[] a;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "<this>");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        a = bytes;
    }

    public static final boolean a(f0 segment, int i10, byte[] bytes, int i11) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i12 = segment.f20980c;
        byte[] bArr = segment.a;
        for (int i13 = 1; i13 < i11; i13++) {
            if (i10 == i12) {
                segment = segment.f20983f;
                Intrinsics.checkNotNull(segment);
                bArr = segment.a;
                i10 = segment.f20979b;
                i12 = segment.f20980c;
            }
            if (bArr[i10] != bytes[i13]) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static final String b(ki.i iVar, long j3) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (j3 > 0) {
            long j10 = j3 - 1;
            if (iVar.k(j10) == 13) {
                String readUtf8 = iVar.readUtf8(j10);
                iVar.skip(2L);
                return readUtf8;
            }
        }
        String readUtf82 = iVar.readUtf8(j3);
        iVar.skip(1L);
        return readUtf82;
    }

    public static final int c(ki.i iVar, z options, boolean z10) {
        int i10;
        byte[] bArr;
        int i11;
        int i12;
        boolean z11;
        byte[] bArr2;
        int i13;
        f0 f0Var;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        f0 f0Var2 = iVar.f20993b;
        if (f0Var2 == null) {
            if (z10) {
                return -2;
            }
            return -1;
        }
        int i14 = f0Var2.f20979b;
        int i15 = f0Var2.f20980c;
        int[] iArr = options.f21036c;
        byte[] bArr3 = f0Var2.a;
        f0 f0Var3 = f0Var2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = iArr[i17];
            int i20 = i18 + 1;
            int i21 = iArr[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (f0Var3 == null) {
                break;
            }
            if (i19 < 0) {
                int i22 = (i19 * (-1)) + i20;
                while (true) {
                    int i23 = i14 + 1;
                    int i24 = i20 + 1;
                    if ((bArr3[i14] & UByte.MAX_VALUE) != iArr[i20]) {
                        return i16;
                    }
                    if (i24 == i22) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i23 == i15) {
                        Intrinsics.checkNotNull(f0Var3);
                        f0 f0Var4 = f0Var3.f20983f;
                        Intrinsics.checkNotNull(f0Var4);
                        i13 = f0Var4.f20979b;
                        int i25 = f0Var4.f20980c;
                        bArr2 = f0Var4.a;
                        if (f0Var4 == f0Var2) {
                            if (!z11) {
                                break loop0;
                            }
                            i15 = i25;
                            f0Var = null;
                        } else {
                            f0Var = f0Var4;
                            i15 = i25;
                        }
                    } else {
                        f0 f0Var5 = f0Var3;
                        bArr2 = bArr3;
                        i13 = i23;
                        f0Var = f0Var5;
                    }
                    if (z11) {
                        i10 = iArr[i24];
                        int i26 = i13;
                        i11 = i15;
                        i12 = i26;
                        byte[] bArr4 = bArr2;
                        f0Var3 = f0Var;
                        bArr = bArr4;
                        break;
                    }
                    i14 = i13;
                    bArr3 = bArr2;
                    i20 = i24;
                    f0Var3 = f0Var;
                }
            } else {
                int i27 = i14 + 1;
                int i28 = bArr3[i14] & UByte.MAX_VALUE;
                int i29 = i20 + i19;
                while (i20 != i29) {
                    if (i28 == iArr[i20]) {
                        i10 = iArr[i20 + i19];
                        if (i27 == i15) {
                            f0Var3 = f0Var3.f20983f;
                            Intrinsics.checkNotNull(f0Var3);
                            i12 = f0Var3.f20979b;
                            i11 = f0Var3.f20980c;
                            bArr = f0Var3.a;
                            if (f0Var3 == f0Var2) {
                                f0Var3 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i11 = i15;
                            i12 = i27;
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            if (i10 >= 0) {
                return i10;
            }
            byte[] bArr5 = bArr;
            i17 = -i10;
            i14 = i12;
            i15 = i11;
            bArr3 = bArr5;
        }
        if (z10) {
            return -2;
        }
        return i16;
    }
}
