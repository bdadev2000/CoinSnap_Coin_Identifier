package com.google.zxing;

import com.google.common.primitives.UnsignedBytes;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes3.dex */
public abstract class LuminanceSource {
    private final int height;
    private final int width;

    public LuminanceSource(int i2, int i3) {
        this.width = i2;
        this.height = i3;
    }

    public LuminanceSource crop(int i2, int i3, int i4, int i5) {
        throw new UnsupportedOperationException("This luminance source does not support cropping.");
    }

    public final int getHeight() {
        return this.height;
    }

    public abstract byte[] getMatrix();

    public abstract byte[] getRow(int i2, byte[] bArr);

    public final int getWidth() {
        return this.width;
    }

    public LuminanceSource invert() {
        return new InvertedLuminanceSource(this);
    }

    public boolean isCropSupported() {
        return false;
    }

    public boolean isRotateSupported() {
        return false;
    }

    public LuminanceSource rotateCounterClockwise() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public LuminanceSource rotateCounterClockwise45() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 45 degrees.");
    }

    public final String toString() {
        int i2 = this.width;
        byte[] bArr = new byte[i2];
        StringBuilder sb = new StringBuilder((i2 + 1) * this.height);
        for (int i3 = 0; i3 < this.height; i3++) {
            bArr = getRow(i3, bArr);
            for (int i4 = 0; i4 < this.width; i4++) {
                int i5 = bArr[i4] & UnsignedBytes.MAX_VALUE;
                sb.append(i5 < 64 ? '#' : i5 < 128 ? SignatureVisitor.EXTENDS : i5 < 192 ? '.' : ' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
