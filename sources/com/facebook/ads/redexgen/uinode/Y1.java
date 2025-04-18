package com.facebook.ads.redexgen.uinode;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Y1 implements InterfaceC0465Ab {
    public boolean A04;
    public boolean A05;
    public int[] A06;
    public int[] A07;
    public ByteBuffer A02 = InterfaceC0465Ab.A00;
    public ByteBuffer A03 = InterfaceC0465Ab.A00;
    public int A00 = -1;
    public int A01 = -1;

    public final void A00(int[] iArr) {
        this.A07 = iArr;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0465Ab
    public final boolean A4Q(int i10, int i11, int i12) throws C0464Aa {
        boolean z10 = !Arrays.equals(this.A07, this.A06);
        int[] iArr = this.A07;
        this.A06 = iArr;
        if (iArr == null) {
            this.A04 = false;
            return z10;
        }
        if (i12 == 2) {
            if (!z10 && this.A01 == i10 && this.A00 == i11) {
                return false;
            }
            this.A01 = i10;
            this.A00 = i11;
            boolean outputChannelsChanged = i11 != iArr.length;
            this.A04 = outputChannelsChanged;
            int i13 = 0;
            while (true) {
                int[] iArr2 = this.A06;
                if (i13 >= iArr2.length) {
                    return true;
                }
                int i14 = iArr2[i13];
                if (i14 < i11) {
                    boolean z11 = this.A04;
                    boolean outputChannelsChanged2 = i14 != i13;
                    this.A04 = z11 | outputChannelsChanged2;
                    i13++;
                } else {
                    throw new C0464Aa(i10, i11, i12);
                }
            }
        } else {
            throw new C0464Aa(i10, i11, i12);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0465Ab
    public final ByteBuffer A7W() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = InterfaceC0465Ab.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0465Ab
    public final int A7X() {
        int[] iArr = this.A06;
        return iArr == null ? this.A00 : iArr.length;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0465Ab
    public final int A7Y() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0465Ab
    public final int A7Z() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0465Ab
    public final boolean A8w() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0465Ab
    public final boolean A91() {
        return this.A05 && this.A03 == InterfaceC0465Ab.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0465Ab
    public final void AEE() {
        this.A05 = true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0465Ab
    public final void AEF(ByteBuffer byteBuffer) {
        AbstractC0626Ha.A04(this.A06 != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int position2 = this.A00;
        int i10 = (limit - position) / (position2 * 2);
        int position3 = this.A06.length;
        int i11 = position3 * i10 * 2;
        int position4 = this.A02.capacity();
        if (position4 < i11) {
            this.A02 = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
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

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0465Ab
    public final void flush() {
        this.A03 = InterfaceC0465Ab.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0465Ab
    public final void reset() {
        flush();
        this.A02 = InterfaceC0465Ab.A00;
        this.A00 = -1;
        this.A01 = -1;
        this.A06 = null;
        this.A07 = null;
        this.A04 = false;
    }
}
