package com.instagram.common.viewpoint.core;

import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: assets/audience_network.dex */
public final class Z2 implements InterfaceC0414Ag {
    public static String[] A06 = {"sNaJDElCp9cCYWYxYRwKU5WVGnQK3THd", "6iN20dDIHc3laoZszST3X2V8JHbMwesE", "WJ2r6eqwNngLa5n94Jh8ZvF", "QMIaZXPM6pynUAzwsdBa2h7UbkKjwIrX", "0KCAAUDfv21yomJIoulyUBykFyq3BOhp", "wPQqgsrO3MAOXcdZXrdV1WawN6tKhXR", "hbMvKz96yGU44IBt9IAKrTB8rFgNUtiF", "o3fpCyt11"};
    public static final int A07 = Float.floatToIntBits(Float.NaN);
    public boolean A05;
    public int A01 = -1;
    public int A00 = -1;
    public int A02 = 0;
    public ByteBuffer A03 = InterfaceC0414Ag.A00;
    public ByteBuffer A04 = InterfaceC0414Ag.A00;

    public static void A00(int i2, ByteBuffer byteBuffer) {
        float pcm32BitFloat = (float) (i2 * 4.656612875245797E-10d);
        int floatBits = Float.floatToIntBits(pcm32BitFloat);
        if (floatBits == A07) {
            floatBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatBits);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final boolean A4m(int i2, int i3, int i4) throws C0413Af {
        if (IK.A0b(i4)) {
            if (this.A01 == i2) {
                int i5 = this.A00;
                if (A06[6].charAt(12) != '4') {
                    throw new RuntimeException();
                }
                A06[0] = "qGQ22GZNFdEfH23m47dfyhgZCsriR0f5";
                if (i5 == i3 && this.A02 == i4) {
                    return false;
                }
            }
            this.A01 = i2;
            this.A00 = i3;
            this.A02 = i4;
            return true;
        }
        throw new C0413Af(i2, i3, i4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final ByteBuffer A7u() {
        ByteBuffer byteBuffer = this.A04;
        ByteBuffer outputBuffer = InterfaceC0414Ag.A00;
        this.A04 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final int A7v() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final int A7w() {
        return 4;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final int A7x() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final boolean A9L() {
        return IK.A0b(this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final boolean A9Q() {
        return this.A05 && this.A04 == InterfaceC0414Ag.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final void AEh() {
        this.A05 = true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final void AEi(ByteBuffer byteBuffer) {
        boolean z2 = this.A02 == 1073741824;
        int resampledSize = byteBuffer.position();
        int size = byteBuffer.limit();
        int position = size - resampledSize;
        if (!z2) {
            int i2 = position / 3;
            String[] strArr = A06;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A06[6] = "SEhS82f1utJV4VSuTRIDotCQPw8rIShK";
            position = i2 * 4;
        }
        if (this.A03.capacity() < position) {
            this.A03 = ByteBuffer.allocateDirect(position).order(ByteOrder.nativeOrder());
        } else {
            this.A03.clear();
        }
        if (z2) {
            while (resampledSize < size) {
                A00((byteBuffer.get(resampledSize) & UnsignedBytes.MAX_VALUE) | ((byteBuffer.get(resampledSize + 1) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(resampledSize + 2) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(resampledSize + 3) & UnsignedBytes.MAX_VALUE) << 24), this.A03);
                resampledSize += 4;
            }
        } else {
            while (resampledSize < size) {
                A00(((byteBuffer.get(resampledSize) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(resampledSize + 1) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(resampledSize + 2) & UnsignedBytes.MAX_VALUE) << 24), this.A03);
                resampledSize += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.A03.flip();
        this.A04 = this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final void flush() {
        this.A04 = InterfaceC0414Ag.A00;
        this.A05 = false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final void reset() {
        flush();
        this.A01 = -1;
        this.A00 = -1;
        this.A02 = 0;
        this.A03 = InterfaceC0414Ag.A00;
    }
}
