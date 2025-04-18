package gd;

import com.applovin.exoplayer2.common.base.Ascii;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.io.encoding.Base64;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f18391c;
    public static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, Ascii.CR, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, Base64.padSymbol, 94, 0, 32, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f18390b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, Ascii.CR, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f18392d = new byte[128];

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f18393e = StandardCharsets.ISO_8859_1;

    static {
        byte[] bArr = new byte[128];
        f18391c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = a;
            if (i11 >= bArr2.length) {
                break;
            }
            byte b3 = bArr2[i11];
            if (b3 > 0) {
                f18391c[b3] = (byte) i11;
            }
            i11++;
        }
        Arrays.fill(f18392d, (byte) -1);
        while (true) {
            byte[] bArr3 = f18390b;
            if (i10 < bArr3.length) {
                byte b10 = bArr3[i10];
                if (b10 > 0) {
                    f18392d[b10] = (byte) i10;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public static void a(byte[] bArr, int i10, int i11, StringBuilder sb2) {
        int i12;
        if (i10 == 1 && i11 == 0) {
            sb2.append((char) 913);
        } else if (i10 % 6 == 0) {
            sb2.append((char) 924);
        } else {
            sb2.append((char) 901);
        }
        if (i10 >= 6) {
            char[] cArr = new char[5];
            i12 = 0;
            while ((0 + i10) - i12 >= 6) {
                long j3 = 0;
                for (int i13 = 0; i13 < 6; i13++) {
                    j3 = (j3 << 8) + (bArr[i12 + i13] & UByte.MAX_VALUE);
                }
                for (int i14 = 0; i14 < 5; i14++) {
                    cArr[i14] = (char) (j3 % 900);
                    j3 /= 900;
                }
                for (int i15 = 4; i15 >= 0; i15--) {
                    sb2.append(cArr[i15]);
                }
                i12 += 6;
            }
        } else {
            i12 = 0;
        }
        while (i12 < 0 + i10) {
            sb2.append((char) (bArr[i12] & UByte.MAX_VALUE));
            i12++;
        }
    }

    public static void b(StringBuilder sb2, int i10, int i11, String str) {
        StringBuilder sb3 = new StringBuilder((i11 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i12 = 0;
        while (i12 < i11) {
            sb3.setLength(0);
            int min = Math.min(44, i11 - i12);
            StringBuilder sb4 = new StringBuilder("1");
            int i13 = i10 + i12;
            sb4.append(str.substring(i13, i13 + min));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            int length = sb3.length();
            while (true) {
                length--;
                if (length >= 0) {
                    sb2.append(sb3.charAt(length));
                }
            }
            i12 += min;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0103 A[EDGE_INSN: B:23:0x0103->B:24:0x0103 BREAK  A[LOOP:0: B:2:0x000e->B:18:0x000e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(java.lang.StringBuilder r17, int r18, java.lang.CharSequence r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.b.c(java.lang.StringBuilder, int, java.lang.CharSequence, int, int):int");
    }

    public static boolean d(char c10) {
        if (c10 != ' ') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public static boolean e(char c10) {
        if (c10 != ' ') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }
}
