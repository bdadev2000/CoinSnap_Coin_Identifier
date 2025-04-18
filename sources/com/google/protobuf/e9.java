package com.google.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes4.dex */
public final class e9 {
    private e9() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleFourBytes(byte b3, byte b10, byte b11, byte b12, char[] cArr, int i10) throws h4 {
        if (!isNotTrailingByte(b10)) {
            if ((((b10 + 112) + (b3 << Ascii.FS)) >> 30) == 0 && !isNotTrailingByte(b11) && !isNotTrailingByte(b12)) {
                int trailingByteValue = ((b3 & 7) << 18) | (trailingByteValue(b10) << 12) | (trailingByteValue(b11) << 6) | trailingByteValue(b12);
                cArr[i10] = highSurrogate(trailingByteValue);
                cArr[i10 + 1] = lowSurrogate(trailingByteValue);
                return;
            }
        }
        throw h4.invalidUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleOneByte(byte b3, char[] cArr, int i10) {
        cArr[i10] = (char) b3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleThreeBytes(byte b3, byte b10, byte b11, char[] cArr, int i10) throws h4 {
        if (!isNotTrailingByte(b10) && ((b3 != -32 || b10 >= -96) && ((b3 != -19 || b10 < -96) && !isNotTrailingByte(b11)))) {
            cArr[i10] = (char) (((b3 & Ascii.SI) << 12) | (trailingByteValue(b10) << 6) | trailingByteValue(b11));
            return;
        }
        throw h4.invalidUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleTwoBytes(byte b3, byte b10, char[] cArr, int i10) throws h4 {
        if (b3 >= -62 && !isNotTrailingByte(b10)) {
            cArr[i10] = (char) (((b3 & Ascii.US) << 6) | trailingByteValue(b10));
            return;
        }
        throw h4.invalidUtf8();
    }

    private static char highSurrogate(int i10) {
        return (char) ((i10 >>> 10) + 55232);
    }

    private static boolean isNotTrailingByte(byte b3) {
        return b3 > -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isOneByte(byte b3) {
        return b3 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isThreeBytes(byte b3) {
        return b3 < -16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isTwoBytes(byte b3) {
        return b3 < -32;
    }

    private static char lowSurrogate(int i10) {
        return (char) ((i10 & 1023) + 56320);
    }

    private static int trailingByteValue(byte b3) {
        return b3 & 63;
    }
}
