package okio;

import android.support.v4.media.d;
import com.google.common.primitives.UnsignedBytes;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Opcodes;
import q0.l;

/* loaded from: classes3.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i2) {
        return (i2 >= 0 && i2 < 32) || (127 <= i2 && i2 < 160);
    }

    public static final boolean isUtf8Continuation(byte b2) {
        return (b2 & 192) == 128;
    }

    public static final int process2Utf8Bytes(@NotNull byte[] bArr, int i2, int i3, @NotNull l lVar) {
        p0.a.s(bArr, "<this>");
        p0.a.s(lVar, "yield");
        int i4 = i2 + 1;
        Integer valueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i3 <= i4) {
            lVar.invoke(valueOf);
            return 1;
        }
        byte b2 = bArr[i2];
        byte b3 = bArr[i4];
        if ((b3 & 192) != 128) {
            lVar.invoke(valueOf);
            return 1;
        }
        int i5 = (b3 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b2 << 6);
        if (i5 < 128) {
            lVar.invoke(valueOf);
            return 2;
        }
        lVar.invoke(Integer.valueOf(i5));
        return 2;
    }

    public static final int process3Utf8Bytes(@NotNull byte[] bArr, int i2, int i3, @NotNull l lVar) {
        p0.a.s(bArr, "<this>");
        p0.a.s(lVar, "yield");
        int i4 = i2 + 2;
        Integer valueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i3 <= i4) {
            lVar.invoke(valueOf);
            int i5 = i2 + 1;
            return (i3 <= i5 || (bArr[i5] & 192) != 128) ? 1 : 2;
        }
        byte b2 = bArr[i2];
        byte b3 = bArr[i2 + 1];
        if ((b3 & 192) != 128) {
            lVar.invoke(valueOf);
            return 1;
        }
        byte b4 = bArr[i4];
        if ((b4 & 192) != 128) {
            lVar.invoke(valueOf);
            return 2;
        }
        int i6 = ((b4 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b3 << 6)) ^ (b2 << 12);
        if (i6 < 2048) {
            lVar.invoke(valueOf);
            return 3;
        }
        if (55296 > i6 || i6 >= 57344) {
            lVar.invoke(Integer.valueOf(i6));
            return 3;
        }
        lVar.invoke(valueOf);
        return 3;
    }

    public static final int process4Utf8Bytes(@NotNull byte[] bArr, int i2, int i3, @NotNull l lVar) {
        p0.a.s(bArr, "<this>");
        p0.a.s(lVar, "yield");
        int i4 = i2 + 3;
        Integer valueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i3 <= i4) {
            lVar.invoke(valueOf);
            int i5 = i2 + 1;
            if (i3 <= i5 || (bArr[i5] & 192) != 128) {
                return 1;
            }
            int i6 = i2 + 2;
            return (i3 <= i6 || (bArr[i6] & 192) != 128) ? 2 : 3;
        }
        byte b2 = bArr[i2];
        byte b3 = bArr[i2 + 1];
        if ((b3 & 192) != 128) {
            lVar.invoke(valueOf);
            return 1;
        }
        byte b4 = bArr[i2 + 2];
        if ((b4 & 192) != 128) {
            lVar.invoke(valueOf);
            return 2;
        }
        byte b5 = bArr[i4];
        if ((b5 & 192) != 128) {
            lVar.invoke(valueOf);
            return 3;
        }
        int i7 = (((b5 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
        if (i7 > 1114111) {
            lVar.invoke(valueOf);
            return 4;
        }
        if (55296 <= i7 && i7 < 57344) {
            lVar.invoke(valueOf);
            return 4;
        }
        if (i7 < 65536) {
            lVar.invoke(valueOf);
            return 4;
        }
        lVar.invoke(Integer.valueOf(i7));
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e2, code lost:
    
        if ((r11[r0] & 192) == 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x007e, code lost:
    
        if ((r11[r0] & 192) == 128) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void processUtf16Chars(@org.jetbrains.annotations.NotNull byte[] r11, int r12, int r13, @org.jetbrains.annotations.NotNull q0.l r14) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Utf8.processUtf16Chars(byte[], int, int, q0.l):void");
    }

    public static final void processUtf8Bytes(@NotNull String str, int i2, int i3, @NotNull l lVar) {
        int i4;
        char charAt;
        p0.a.s(str, "<this>");
        p0.a.s(lVar, "yield");
        while (i2 < i3) {
            char charAt2 = str.charAt(i2);
            if (p0.a.E(charAt2, 128) < 0) {
                lVar.invoke(Byte.valueOf((byte) charAt2));
                i2++;
                while (i2 < i3 && p0.a.E(str.charAt(i2), 128) < 0) {
                    lVar.invoke(Byte.valueOf((byte) str.charAt(i2)));
                    i2++;
                }
            } else {
                if (p0.a.E(charAt2, Opcodes.ACC_STRICT) < 0) {
                    lVar.invoke(Byte.valueOf((byte) ((charAt2 >> 6) | Opcodes.CHECKCAST)));
                    lVar.invoke(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (55296 > charAt2 || charAt2 >= 57344) {
                    lVar.invoke(Byte.valueOf((byte) ((charAt2 >> '\f') | 224)));
                    lVar.invoke(Byte.valueOf((byte) (((charAt2 >> 6) & 63) | 128)));
                    lVar.invoke(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (p0.a.E(charAt2, 56319) > 0 || i3 <= (i4 = i2 + 1) || 56320 > (charAt = str.charAt(i4)) || charAt >= 57344) {
                    lVar.invoke(Byte.valueOf(REPLACEMENT_BYTE));
                } else {
                    int charAt3 = (str.charAt(i4) + (charAt2 << '\n')) - 56613888;
                    lVar.invoke(Byte.valueOf((byte) ((charAt3 >> 18) | 240)));
                    lVar.invoke(Byte.valueOf((byte) (((charAt3 >> 12) & 63) | 128)));
                    lVar.invoke(Byte.valueOf((byte) (((charAt3 >> 6) & 63) | 128)));
                    lVar.invoke(Byte.valueOf((byte) ((charAt3 & 63) | 128)));
                    i2 += 2;
                }
                i2++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e0, code lost:
    
        if ((r11[r0] & 192) == 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x007c, code lost:
    
        if ((r11[r0] & 192) == 128) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void processUtf8CodePoints(@org.jetbrains.annotations.NotNull byte[] r11, int r12, int r13, @org.jetbrains.annotations.NotNull q0.l r14) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Utf8.processUtf8CodePoints(byte[], int, int, q0.l):void");
    }

    public static final long size(@NotNull String str) {
        p0.a.s(str, "<this>");
        return size$default(str, 0, 0, 3, null);
    }

    public static /* synthetic */ long size$default(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return size(str, i2, i3);
    }

    public static final long size(@NotNull String str, int i2) {
        p0.a.s(str, "<this>");
        return size$default(str, i2, 0, 2, null);
    }

    public static final long size(@NotNull String str, int i2, int i3) {
        int i4;
        p0.a.s(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(d.i("beginIndex < 0: ", i2).toString());
        }
        if (i3 >= i2) {
            if (i3 > str.length()) {
                StringBuilder t2 = d.t("endIndex > string.length: ", i3, " > ");
                t2.append(str.length());
                throw new IllegalArgumentException(t2.toString().toString());
            }
            long j2 = 0;
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt < 128) {
                    j2++;
                } else {
                    if (charAt < 2048) {
                        i4 = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        i4 = 3;
                    } else {
                        int i5 = i2 + 1;
                        char charAt2 = i5 < i3 ? str.charAt(i5) : (char) 0;
                        if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                            j2++;
                            i2 = i5;
                        } else {
                            j2 += 4;
                            i2 += 2;
                        }
                    }
                    j2 += i4;
                }
                i2++;
            }
            return j2;
        }
        throw new IllegalArgumentException(d.k("endIndex < beginIndex: ", i3, " < ", i2).toString());
    }
}
