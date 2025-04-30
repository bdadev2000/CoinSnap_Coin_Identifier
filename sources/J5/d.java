package J5;

import com.applovin.exoplayer2.common.base.Ascii;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f1595c;

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f1594a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, Ascii.CR, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};
    public static final byte[] b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, Ascii.CR, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f1596d = new byte[128];

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f1597e = StandardCharsets.ISO_8859_1;

    static {
        int i9 = 0;
        byte[] bArr = new byte[128];
        f1595c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f1594a;
            if (i10 >= bArr2.length) {
                break;
            }
            byte b8 = bArr2[i10];
            if (b8 > 0) {
                f1595c[b8] = (byte) i10;
            }
            i10++;
        }
        Arrays.fill(f1596d, (byte) -1);
        while (true) {
            byte[] bArr3 = b;
            if (i9 < bArr3.length) {
                byte b9 = bArr3[i9];
                if (b9 > 0) {
                    f1596d[b9] = (byte) i9;
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public static void a(byte[] bArr, int i9, int i10, StringBuilder sb) {
        if (i9 == 1 && i10 == 0) {
            sb.append((char) 913);
        } else if (i9 % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        int i11 = 0;
        if (i9 >= 6) {
            char[] cArr = new char[5];
            int i12 = 0;
            while (i9 - i12 >= 6) {
                long j7 = 0;
                for (int i13 = 0; i13 < 6; i13++) {
                    j7 = (j7 << 8) + (bArr[i12 + i13] & 255);
                }
                for (int i14 = 0; i14 < 5; i14++) {
                    cArr[i14] = (char) (j7 % 900);
                    j7 /= 900;
                }
                for (int i15 = 4; i15 >= 0; i15--) {
                    sb.append(cArr[i15]);
                }
                i12 += 6;
            }
            i11 = i12;
        }
        while (i11 < i9) {
            sb.append((char) (bArr[i11] & 255));
            i11++;
        }
    }

    public static void b(int i9, int i10, String str, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i10 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i11 = 0;
        while (i11 < i10) {
            sb2.setLength(0);
            int min = Math.min(44, i10 - i11);
            StringBuilder sb3 = new StringBuilder("1");
            int i12 = i9 + i11;
            sb3.append(str.substring(i12, i12 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i11 += min;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e4 A[EDGE_INSN: B:21:0x00e4->B:22:0x00e4 BREAK  A[LOOP:0: B:2:0x000e->B:16:0x000e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(java.lang.CharSequence r17, int r18, int r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.d.c(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    public static boolean d(char c9) {
        if (c9 != ' ') {
            if (c9 < 'a' || c9 > 'z') {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean e(char c9) {
        if (c9 != ' ') {
            if (c9 < 'A' || c9 > 'Z') {
                return false;
            }
            return true;
        }
        return true;
    }
}
