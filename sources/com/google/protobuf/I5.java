package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class I5 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final E5 processor;

    static {
        E5 f52;
        if (H5.isAvailable() && !C1901f.isOnAndroidDevice()) {
            f52 = new H5();
        } else {
            f52 = new F5();
        }
        processor = f52;
    }

    private I5() {
    }

    public static String decodeUtf8(ByteBuffer byteBuffer, int i9, int i10) throws C1912g3 {
        return processor.decodeUtf8(byteBuffer, i9, i10);
    }

    public static int encode(CharSequence charSequence, byte[] bArr, int i9, int i10) {
        return processor.encodeUtf8(charSequence, bArr, i9, i10);
    }

    public static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    public static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i9 = 0;
        while (i9 < length && charSequence.charAt(i9) < 128) {
            i9++;
        }
        int i10 = length;
        while (true) {
            if (i9 < length) {
                char charAt = charSequence.charAt(i9);
                if (charAt < 2048) {
                    i10 += (127 - charAt) >>> 31;
                    i9++;
                } else {
                    i10 += encodedLengthGeneral(charSequence, i9);
                    break;
                }
            } else {
                break;
            }
        }
        if (i10 >= length) {
            return i10;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i10 + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i9) {
        int length = charSequence.length();
        int i10 = 0;
        while (i9 < length) {
            char charAt = charSequence.charAt(i9);
            if (charAt < 2048) {
                i10 += (127 - charAt) >>> 31;
            } else {
                i10 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i9) >= 65536) {
                        i9++;
                    } else {
                        throw new G5(i9, length);
                    }
                }
            }
            i9++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i9, int i10) {
        int i11 = i10 - 7;
        int i12 = i9;
        while (i12 < i11 && (byteBuffer.getLong(i12) & ASCII_MASK_LONG) == 0) {
            i12 += 8;
        }
        return i12 - i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i9) {
        if (i9 > -12) {
            return -1;
        }
        return i9;
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    public static int partialIsValidUtf8(int i9, byte[] bArr, int i10, int i11) {
        return processor.partialIsValidUtf8(i9, bArr, i10, i11);
    }

    public static String decodeUtf8(byte[] bArr, int i9, int i10) throws C1912g3 {
        return processor.decodeUtf8(bArr, i9, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i9, int i10) {
        if (i9 > -12 || i10 > -65) {
            return -1;
        }
        return i9 ^ (i10 << 8);
    }

    public static boolean isValidUtf8(byte[] bArr, int i9, int i10) {
        return processor.isValidUtf8(bArr, i9, i10);
    }

    public static int partialIsValidUtf8(int i9, ByteBuffer byteBuffer, int i10, int i11) {
        return processor.partialIsValidUtf8(i9, byteBuffer, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i9, int i10, int i11) {
        if (i9 > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i9 ^ (i10 << 8)) ^ (i11 << 16);
    }

    public static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i9, int i10) {
        byte b = bArr[i9 - 1];
        int i11 = i10 - i9;
        if (i11 == 0) {
            return incompleteStateFor(b);
        }
        if (i11 == 1) {
            return incompleteStateFor(b, bArr[i9]);
        }
        if (i11 == 2) {
            return incompleteStateFor(b, bArr[i9], bArr[i9 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(ByteBuffer byteBuffer, int i9, int i10, int i11) {
        if (i11 == 0) {
            return incompleteStateFor(i9);
        }
        if (i11 == 1) {
            return incompleteStateFor(i9, byteBuffer.get(i10));
        }
        if (i11 == 2) {
            return incompleteStateFor(i9, byteBuffer.get(i10), byteBuffer.get(i10 + 1));
        }
        throw new AssertionError();
    }
}
