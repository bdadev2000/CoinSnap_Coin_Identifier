package com.amazonaws.util;

import com.google.android.exoplayer2.Renderer;
import com.google.common.base.Ascii;

/* loaded from: classes7.dex */
class Base16Codec implements Codec {
    private static final int BITS_4 = 4;
    private static final int MASK_4BITS = 15;
    private static final int OFFSET_OF_A = 55;
    private static final int OFFSET_OF_a = 87;
    private static final int OFFSET_VALUE = 10;
    private final byte[] alpahbets = CodecUtils.toBytesDirect("0123456789ABCDEF");

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class LazyHolder {
        private static final byte[] DECODED = decodeTable();

        private LazyHolder() {
        }

        private static byte[] decodeTable() {
            byte[] bArr = new byte[Renderer.MSG_SET_WAKEUP_LISTENER];
            for (int i = 0; i <= 102; i++) {
                if (i >= 48 && i <= 57) {
                    bArr[i] = (byte) (i - 48);
                } else if (i >= 65 && i <= 70) {
                    bArr[i] = (byte) (i - 55);
                } else if (i >= 97 && i <= 102) {
                    bArr[i] = (byte) (i - 87);
                } else {
                    bArr[i] = -1;
                }
            }
            return bArr;
        }
    }

    @Override // com.amazonaws.util.Codec
    public byte[] encode(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            byte[] bArr3 = this.alpahbets;
            bArr2[i] = bArr3[(b >>> 4) & 15];
            i += 2;
            bArr2[i2] = bArr3[b & Ascii.SI];
        }
        return bArr2;
    }

    @Override // com.amazonaws.util.Codec
    public byte[] decode(byte[] bArr, int i) {
        if (i % 2 != 0) {
            throw new IllegalArgumentException("Input is expected to be encoded in multiple of 2 bytes but found: " + i);
        }
        int i2 = i / 2;
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + 1;
            int pos = pos(bArr[i3]) << 4;
            i3 += 2;
            bArr2[i4] = (byte) (pos(bArr[i5]) | pos);
        }
        return bArr2;
    }

    protected int pos(byte b) {
        byte b2 = LazyHolder.DECODED[b];
        if (b2 > -1) {
            return b2;
        }
        throw new IllegalArgumentException("Invalid base 16 character: '" + ((char) b) + "'");
    }
}
