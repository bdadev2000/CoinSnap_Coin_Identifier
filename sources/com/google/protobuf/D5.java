package com.google.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes3.dex */
public final class D5 {
    private D5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleFourBytes(byte b, byte b8, byte b9, byte b10, char[] cArr, int i9) throws C1912g3 {
        if (!isNotTrailingByte(b8)) {
            if ((((b8 + 112) + (b << Ascii.FS)) >> 30) == 0 && !isNotTrailingByte(b9) && !isNotTrailingByte(b10)) {
                int trailingByteValue = ((b & 7) << 18) | (trailingByteValue(b8) << 12) | (trailingByteValue(b9) << 6) | trailingByteValue(b10);
                cArr[i9] = highSurrogate(trailingByteValue);
                cArr[i9 + 1] = lowSurrogate(trailingByteValue);
                return;
            }
        }
        throw C1912g3.invalidUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleOneByte(byte b, char[] cArr, int i9) {
        cArr[i9] = (char) b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleThreeBytes(byte b, byte b8, byte b9, char[] cArr, int i9) throws C1912g3 {
        if (!isNotTrailingByte(b8) && ((b != -32 || b8 >= -96) && ((b != -19 || b8 < -96) && !isNotTrailingByte(b9)))) {
            cArr[i9] = (char) (((b & Ascii.SI) << 12) | (trailingByteValue(b8) << 6) | trailingByteValue(b9));
            return;
        }
        throw C1912g3.invalidUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleTwoBytes(byte b, byte b8, char[] cArr, int i9) throws C1912g3 {
        if (b >= -62 && !isNotTrailingByte(b8)) {
            cArr[i9] = (char) (((b & Ascii.US) << 6) | trailingByteValue(b8));
            return;
        }
        throw C1912g3.invalidUtf8();
    }

    private static char highSurrogate(int i9) {
        return (char) ((i9 >>> 10) + 55232);
    }

    private static boolean isNotTrailingByte(byte b) {
        return b > -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isOneByte(byte b) {
        return b >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isThreeBytes(byte b) {
        return b < -16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isTwoBytes(byte b) {
        return b < -32;
    }

    private static char lowSurrogate(int i9) {
        return (char) ((i9 & 1023) + 56320);
    }

    private static int trailingByteValue(byte b) {
        return b & 63;
    }
}
