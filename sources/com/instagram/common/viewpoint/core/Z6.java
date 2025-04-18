package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Z6 implements InterfaceC0414Ag {
    public static String[] A08 = {"DqzHGffDcmflJqigjgSPz5Ih3LuvN1vm", "GNv6Ae", "LelNVzb768HYU8MfXJtnH9MoMCR0fTwa", "KnBzaomJ4wFvZeITctRDF8tBR6fO5AM8", "2u9otpZXCk16Szcxzo3RgVsB8eWIqp2Q", "EbIk1BCgQ5uw3o5TzCMO1ZXZATNxIl6G", "RIc4tTFixsMvKq90zInLLBFrOnvIp26L", "v8gNFDmzDFQ65UlksIc5Du22tyA8sdnr"};
    public boolean A04;
    public boolean A05;
    public int[] A06;
    public int[] A07;
    public ByteBuffer A02 = InterfaceC0414Ag.A00;
    public ByteBuffer A03 = InterfaceC0414Ag.A00;
    public int A00 = -1;
    public int A01 = -1;

    public final void A00(int[] iArr) {
        this.A07 = iArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final boolean A4m(int i2, int i3, int i4) throws C0413Af {
        boolean z2 = !Arrays.equals(this.A07, this.A06);
        this.A06 = this.A07;
        if (this.A06 == null) {
            this.A04 = false;
            return z2;
        }
        if (i4 == 2) {
            if (!z2 && this.A01 == i2 && this.A00 == i3) {
                return false;
            }
            this.A01 = i2;
            this.A00 = i3;
            boolean outputChannelsChanged = i3 != this.A06.length;
            this.A04 = outputChannelsChanged;
            int i5 = 0;
            while (true) {
                int length = this.A06.length;
                String[] strArr = A08;
                if (strArr[0].charAt(13) != strArr[6].charAt(13)) {
                    throw new RuntimeException();
                }
                A08[1] = "576vmg";
                if (i5 >= length) {
                    return true;
                }
                int i6 = this.A06[i5];
                if (i6 < i3) {
                    boolean z3 = this.A04;
                    boolean outputChannelsChanged2 = i6 != i5;
                    this.A04 = z3 | outputChannelsChanged2;
                    i5++;
                } else {
                    throw new C0413Af(i2, i3, i4);
                }
            }
        } else {
            throw new C0413Af(i2, i3, i4);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final ByteBuffer A7u() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = InterfaceC0414Ag.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final int A7v() {
        if (this.A06 == null) {
            return this.A00;
        }
        int[] iArr = this.A06;
        if (A08[4].charAt(2) != '9') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[7] = "4sakcIsy6w2uz0nPxriWxgex69qzPMi1";
        strArr[3] = "A1JfXRpmh7pGoJx4KgQXcs2DSpbOe785";
        return iArr.length;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final int A7w() {
        return 2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final int A7x() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final boolean A9L() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final boolean A9Q() {
        return this.A05 && this.A03 == InterfaceC0414Ag.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final void AEh() {
        this.A05 = true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final void AEi(ByteBuffer byteBuffer) {
        AbstractC0576Hf.A04(this.A06 != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int position2 = this.A00;
        int i2 = (limit - position) / (position2 * 2);
        int position3 = this.A06.length;
        int i3 = position3 * i2 * 2;
        int position4 = this.A02.capacity();
        if (position4 < i3) {
            this.A02 = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        while (position < limit) {
            for (int position5 : this.A06) {
                this.A02.putShort(byteBuffer.getShort((position5 * 2) + position));
            }
            int position6 = this.A00;
            position += position6 * 2;
        }
        byteBuffer.position(limit);
        this.A02.flip();
        this.A03 = this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final void flush() {
        this.A03 = InterfaceC0414Ag.A00;
        this.A05 = false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0414Ag
    public final void reset() {
        flush();
        this.A02 = InterfaceC0414Ag.A00;
        this.A00 = -1;
        this.A01 = -1;
        this.A06 = null;
        this.A07 = null;
        this.A04 = false;
    }
}
