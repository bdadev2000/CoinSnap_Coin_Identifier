package com.mbridge.msdk.foundation.tools;

import androidx.core.app.NotificationCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f15984a;
    private static final byte[] b = new byte[128];

    /* renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f15985c;

    /* renamed from: d, reason: collision with root package name */
    private static char[] f15986d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        f15984a = cArr;
        HashMap hashMap = new HashMap();
        f15985c = hashMap;
        hashMap.put('A', 'v');
        f15985c.put('B', 'S');
        f15985c.put('C', 'o');
        f15985c.put('D', 'a');
        f15985c.put('E', 'j');
        f15985c.put('F', 'c');
        f15985c.put('G', '7');
        f15985c.put('H', 'd');
        f15985c.put('I', 'R');
        f15985c.put('J', 'z');
        f15985c.put('K', 'p');
        f15985c.put('L', 'W');
        f15985c.put('M', 'i');
        f15985c.put('N', 'f');
        f15985c.put('O', 'G');
        f15985c.put('P', 'y');
        f15985c.put('Q', 'N');
        f15985c.put('R', 'x');
        f15985c.put('S', 'Z');
        f15985c.put('T', 'n');
        f15985c.put('U', 'V');
        f15985c.put('V', '5');
        f15985c.put('W', 'k');
        f15985c.put('X', '+');
        f15985c.put('Y', 'D');
        f15985c.put('Z', 'H');
        f15985c.put('a', 'L');
        f15985c.put('b', 'Y');
        f15985c.put('c', 'h');
        f15985c.put('d', 'J');
        f15985c.put('e', '4');
        f15985c.put('f', '6');
        f15985c.put('g', 'l');
        f15985c.put('h', 't');
        f15985c.put('i', '0');
        f15985c.put('j', 'U');
        f15985c.put('k', '3');
        f15985c.put('l', 'Q');
        f15985c.put('m', 'r');
        f15985c.put('n', 'g');
        f15985c.put('o', 'E');
        f15985c.put('p', 'u');
        f15985c.put('q', 'q');
        f15985c.put('r', '8');
        f15985c.put('s', 's');
        f15985c.put('t', 'w');
        f15985c.put('u', '/');
        f15985c.put('v', 'X');
        f15985c.put('w', 'M');
        f15985c.put('x', 'e');
        f15985c.put('y', 'B');
        f15985c.put('z', 'A');
        f15985c.put('0', 'T');
        f15985c.put('1', '2');
        f15985c.put('2', 'F');
        f15985c.put('3', 'b');
        f15985c.put('4', '9');
        f15985c.put('5', 'P');
        f15985c.put('6', '1');
        f15985c.put('7', 'O');
        f15985c.put('8', 'I');
        f15985c.put('9', 'K');
        f15985c.put('+', 'm');
        f15985c.put('/', 'C');
        f15986d = new char[cArr.length];
        int i9 = 0;
        int i10 = 0;
        while (true) {
            char[] cArr2 = f15984a;
            if (i10 >= cArr2.length) {
                break;
            }
            f15986d[i10] = f15985c.get(Character.valueOf(cArr2[i10])).charValue();
            i10++;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr = b;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = Ascii.DEL;
            i11++;
        }
        while (true) {
            char[] cArr3 = f15986d;
            if (i9 < cArr3.length) {
                b[cArr3[i9]] = (byte) i9;
                i9++;
            } else {
                return;
            }
        }
    }

    private static int a(char[] cArr, byte[] bArr, int i9) {
        try {
            char c9 = cArr[3];
            char c10 = c9 == '=' ? (char) 2 : (char) 3;
            char c11 = cArr[2];
            if (c11 == '=') {
                c10 = 1;
            }
            byte[] bArr2 = b;
            byte b8 = bArr2[cArr[0]];
            byte b9 = bArr2[cArr[1]];
            byte b10 = bArr2[c11];
            byte b11 = bArr2[c9];
            if (c10 == 1) {
                bArr[i9] = (byte) (((b9 >> 4) & 3) | ((b8 << 2) & 252));
                return 1;
            }
            if (c10 == 2) {
                bArr[i9] = (byte) ((3 & (b9 >> 4)) | ((b8 << 2) & 252));
                bArr[i9 + 1] = (byte) (((b9 << 4) & PsExtractor.VIDEO_STREAM_MASK) | ((b10 >> 2) & 15));
                return 2;
            }
            if (c10 == 3) {
                bArr[i9] = (byte) (((b8 << 2) & 252) | ((b9 >> 4) & 3));
                bArr[i9 + 1] = (byte) (((b9 << 4) & PsExtractor.VIDEO_STREAM_MASK) | ((b10 >> 2) & 15));
                bArr[i9 + 2] = (byte) (((b10 << 6) & PsExtractor.AUDIO_STREAM) | (b11 & 63));
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
        int i9;
        try {
            int length = str.length();
            int i10 = 259;
            if (length < 259) {
                i10 = length;
            }
            char[] cArr = new char[i10];
            int i11 = ((length >> 2) * 3) + 3;
            byte[] bArr = new byte[i11];
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < length) {
                int i15 = i12 + NotificationCompat.FLAG_LOCAL_ONLY;
                if (i15 <= length) {
                    str.getChars(i12, i15, cArr, i14);
                    i9 = i14 + NotificationCompat.FLAG_LOCAL_ONLY;
                } else {
                    str.getChars(i12, length, cArr, i14);
                    i9 = (length - i12) + i14;
                }
                int i16 = i14;
                while (i14 < i9) {
                    char c9 = cArr[i14];
                    if (c9 != '=') {
                        byte[] bArr2 = b;
                        if (c9 < bArr2.length) {
                            if (bArr2[c9] == Byte.MAX_VALUE) {
                            }
                        }
                        i14++;
                    }
                    int i17 = i16 + 1;
                    cArr[i16] = c9;
                    if (i17 == 4) {
                        i13 += a(cArr, bArr, i13);
                        i16 = 0;
                    } else {
                        i16 = i17;
                    }
                    i14++;
                }
                i12 = i15;
                i14 = i16;
            }
            if (i13 == i11) {
                return bArr;
            }
            byte[] bArr3 = new byte[i13];
            System.arraycopy(bArr, 0, bArr3, 0, i13);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(String str) {
        byte[] c9 = c(str);
        if (c9 == null || c9.length <= 0) {
            return null;
        }
        return new String(c9);
    }

    private static String a(byte[] bArr, int i9, int i10) {
        if (i10 <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((i10 / 3) << 2) + 4];
            int i11 = 0;
            while (i10 >= 3) {
                int i12 = ((bArr[i9] & 255) << 16) + ((bArr[i9 + 1] & 255) << 8) + (bArr[i9 + 2] & 255);
                char[] cArr2 = f15986d;
                cArr[i11] = cArr2[i12 >> 18];
                cArr[i11 + 1] = cArr2[(i12 >> 12) & 63];
                int i13 = i11 + 3;
                cArr[i11 + 2] = cArr2[(i12 >> 6) & 63];
                i11 += 4;
                cArr[i13] = cArr2[i12 & 63];
                i9 += 3;
                i10 -= 3;
            }
            if (i10 == 1) {
                int i14 = bArr[i9] & 255;
                char[] cArr3 = f15986d;
                cArr[i11] = cArr3[i14 >> 2];
                cArr[i11 + 1] = cArr3[(i14 << 4) & 63];
                int i15 = i11 + 3;
                cArr[i11 + 2] = '=';
                i11 += 4;
                cArr[i15] = '=';
            } else if (i10 == 2) {
                int i16 = ((bArr[i9] & 255) << 8) + (bArr[i9 + 1] & 255);
                char[] cArr4 = f15986d;
                cArr[i11] = cArr4[i16 >> 10];
                cArr[i11 + 1] = cArr4[(i16 >> 4) & 63];
                int i17 = i11 + 3;
                cArr[i11 + 2] = cArr4[(i16 << 2) & 63];
                i11 += 4;
                cArr[i17] = '=';
            }
            return new String(cArr, 0, i11);
        } catch (Exception unused) {
            return null;
        }
    }
}
