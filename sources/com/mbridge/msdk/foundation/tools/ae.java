package com.mbridge.msdk.foundation.tools;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.HashMap;
import java.util.Map;
import kotlin.UByte;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class ae {
    private static final char[] a;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f13543b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f13544c;

    /* renamed from: d, reason: collision with root package name */
    private static char[] f13545d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        a = cArr;
        f13543b = new byte[128];
        HashMap hashMap = new HashMap();
        f13544c = hashMap;
        hashMap.put('A', 'v');
        f13544c.put('B', 'S');
        f13544c.put('C', 'o');
        f13544c.put('D', 'a');
        f13544c.put('E', 'j');
        f13544c.put('F', 'c');
        f13544c.put('G', '7');
        f13544c.put('H', 'd');
        f13544c.put('I', 'R');
        f13544c.put('J', 'z');
        f13544c.put('K', 'p');
        f13544c.put('L', 'W');
        f13544c.put('M', 'i');
        f13544c.put('N', 'f');
        f13544c.put('O', 'G');
        f13544c.put('P', 'y');
        f13544c.put('Q', 'N');
        f13544c.put('R', 'x');
        f13544c.put('S', 'Z');
        f13544c.put('T', 'n');
        f13544c.put('U', 'V');
        f13544c.put('V', '5');
        f13544c.put('W', 'k');
        f13544c.put('X', '+');
        f13544c.put('Y', 'D');
        f13544c.put('Z', 'H');
        f13544c.put('a', 'L');
        f13544c.put('b', 'Y');
        f13544c.put('c', 'h');
        f13544c.put('d', 'J');
        f13544c.put('e', '4');
        f13544c.put('f', '6');
        f13544c.put('g', 'l');
        f13544c.put('h', 't');
        f13544c.put('i', '0');
        f13544c.put('j', 'U');
        f13544c.put('k', '3');
        f13544c.put('l', 'Q');
        f13544c.put('m', 'r');
        f13544c.put('n', 'g');
        f13544c.put('o', 'E');
        f13544c.put('p', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        f13544c.put('q', 'q');
        f13544c.put('r', '8');
        f13544c.put('s', 's');
        f13544c.put('t', 'w');
        f13544c.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), '/');
        f13544c.put('v', 'X');
        f13544c.put('w', 'M');
        f13544c.put('x', 'e');
        f13544c.put('y', 'B');
        f13544c.put('z', 'A');
        f13544c.put('0', 'T');
        f13544c.put('1', '2');
        f13544c.put('2', 'F');
        f13544c.put('3', 'b');
        f13544c.put('4', '9');
        f13544c.put('5', 'P');
        f13544c.put('6', '1');
        f13544c.put('7', 'O');
        f13544c.put('8', 'I');
        f13544c.put('9', 'K');
        f13544c.put('+', 'm');
        f13544c.put('/', 'C');
        f13545d = new char[cArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            char[] cArr2 = a;
            if (i11 >= cArr2.length) {
                break;
            }
            f13545d[i11] = f13544c.get(Character.valueOf(cArr2[i11])).charValue();
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr = f13543b;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = Byte.MAX_VALUE;
            i12++;
        }
        while (true) {
            char[] cArr3 = f13545d;
            if (i10 < cArr3.length) {
                f13543b[cArr3[i10]] = (byte) i10;
                i10++;
            } else {
                return;
            }
        }
    }

    private static int a(char[] cArr, byte[] bArr, int i10) {
        try {
            char c10 = cArr[3];
            char c11 = c10 == '=' ? (char) 2 : (char) 3;
            char c12 = cArr[2];
            if (c12 == '=') {
                c11 = 1;
            }
            byte[] bArr2 = f13543b;
            byte b3 = bArr2[cArr[0]];
            byte b10 = bArr2[cArr[1]];
            byte b11 = bArr2[c12];
            byte b12 = bArr2[c10];
            if (c11 == 1) {
                bArr[i10] = (byte) (((b10 >> 4) & 3) | ((b3 << 2) & 252));
                return 1;
            }
            if (c11 == 2) {
                bArr[i10] = (byte) ((3 & (b10 >> 4)) | ((b3 << 2) & 252));
                bArr[i10 + 1] = (byte) (((b10 << 4) & PsExtractor.VIDEO_STREAM_MASK) | ((b11 >> 2) & 15));
                return 2;
            }
            if (c11 == 3) {
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((b3 << 2) & 252) | ((b10 >> 4) & 3));
                bArr[i11] = (byte) (((b10 << 4) & PsExtractor.VIDEO_STREAM_MASK) | ((b11 >> 2) & 15));
                bArr[i11 + 1] = (byte) (((b11 << 6) & PsExtractor.AUDIO_STREAM) | (b12 & 63));
                return 3;
            }
            throw new RuntimeException("Internal Error");
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String b(String str) {
        byte[] bytes = str.getBytes();
        return a(bytes, 0, bytes.length);
    }

    private static byte[] c(String str) {
        int i10;
        try {
            int length = str.length();
            int i11 = 259;
            if (length < 259) {
                i11 = length;
            }
            char[] cArr = new char[i11];
            int i12 = ((length >> 2) * 3) + 3;
            byte[] bArr = new byte[i12];
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < length) {
                int i16 = i13 + NotificationCompat.FLAG_LOCAL_ONLY;
                if (i16 <= length) {
                    str.getChars(i13, i16, cArr, i15);
                    i10 = i15 + NotificationCompat.FLAG_LOCAL_ONLY;
                } else {
                    str.getChars(i13, length, cArr, i15);
                    i10 = (length - i13) + i15;
                }
                int i17 = i15;
                while (i15 < i10) {
                    char c10 = cArr[i15];
                    if (c10 != '=') {
                        byte[] bArr2 = f13543b;
                        if (c10 < bArr2.length) {
                            if (bArr2[c10] == Byte.MAX_VALUE) {
                            }
                        }
                        i15++;
                    }
                    int i18 = i17 + 1;
                    cArr[i17] = c10;
                    if (i18 == 4) {
                        i14 += a(cArr, bArr, i14);
                        i17 = 0;
                    } else {
                        i17 = i18;
                    }
                    i15++;
                }
                i13 = i16;
                i15 = i17;
            }
            if (i14 == i12) {
                return bArr;
            }
            byte[] bArr3 = new byte[i14];
            System.arraycopy(bArr, 0, bArr3, 0, i14);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(String str) {
        byte[] c10 = c(str);
        if (c10 == null || c10.length <= 0) {
            return null;
        }
        return new String(c10);
    }

    private static String a(byte[] bArr, int i10, int i11) {
        if (i11 <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((i11 / 3) << 2) + 4];
            int i12 = 0;
            while (i11 >= 3) {
                int i13 = ((bArr[i10] & UByte.MAX_VALUE) << 16) + ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) + (bArr[i10 + 2] & UByte.MAX_VALUE);
                int i14 = i12 + 1;
                char[] cArr2 = f13545d;
                cArr[i12] = cArr2[i13 >> 18];
                int i15 = i14 + 1;
                cArr[i14] = cArr2[(i13 >> 12) & 63];
                int i16 = i15 + 1;
                cArr[i15] = cArr2[(i13 >> 6) & 63];
                i12 = i16 + 1;
                cArr[i16] = cArr2[i13 & 63];
                i10 += 3;
                i11 -= 3;
            }
            if (i11 == 1) {
                int i17 = bArr[i10] & UByte.MAX_VALUE;
                int i18 = i12 + 1;
                char[] cArr3 = f13545d;
                cArr[i12] = cArr3[i17 >> 2];
                int i19 = i18 + 1;
                cArr[i18] = cArr3[(i17 << 4) & 63];
                int i20 = i19 + 1;
                cArr[i19] = '=';
                i12 = i20 + 1;
                cArr[i20] = '=';
            } else if (i11 == 2) {
                int i21 = ((bArr[i10] & UByte.MAX_VALUE) << 8) + (bArr[i10 + 1] & UByte.MAX_VALUE);
                int i22 = i12 + 1;
                char[] cArr4 = f13545d;
                cArr[i12] = cArr4[i21 >> 10];
                int i23 = i22 + 1;
                cArr[i22] = cArr4[(i21 >> 4) & 63];
                int i24 = i23 + 1;
                cArr[i23] = cArr4[(i21 << 2) & 63];
                i12 = i24 + 1;
                cArr[i24] = '=';
            }
            return new String(cArr, 0, i12);
        } catch (Exception unused) {
            return null;
        }
    }
}
