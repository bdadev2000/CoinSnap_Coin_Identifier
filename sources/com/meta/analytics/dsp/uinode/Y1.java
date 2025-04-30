package com.meta.analytics.dsp.uinode;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Y1 implements InterfaceC1031Ab {
    public boolean A04;
    public boolean A05;
    public int[] A06;
    public int[] A07;
    public ByteBuffer A02 = InterfaceC1031Ab.A00;
    public ByteBuffer A03 = InterfaceC1031Ab.A00;
    public int A00 = -1;
    public int A01 = -1;

    public final void A00(int[] iArr) {
        this.A07 = iArr;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final boolean A4Q(int i9, int i10, int i11) throws C1030Aa {
        boolean z8 = !Arrays.equals(this.A07, this.A06);
        int[] iArr = this.A07;
        this.A06 = iArr;
        if (iArr == null) {
            this.A04 = false;
            return z8;
        }
        if (i11 == 2) {
            if (!z8 && this.A01 == i9 && this.A00 == i10) {
                return false;
            }
            this.A01 = i9;
            this.A00 = i10;
            boolean outputChannelsChanged = i10 != iArr.length;
            this.A04 = outputChannelsChanged;
            int i12 = 0;
            while (true) {
                int[] iArr2 = this.A06;
                if (i12 >= iArr2.length) {
                    return true;
                }
                int i13 = iArr2[i12];
                if (i13 < i10) {
                    boolean z9 = this.A04;
                    boolean outputChannelsChanged2 = i13 != i12;
                    this.A04 = z9 | outputChannelsChanged2;
                    i12++;
                } else {
                    throw new C1030Aa(i9, i10, i11);
                }
            }
        } else {
            throw new C1030Aa(i9, i10, i11);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final ByteBuffer A7W() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = InterfaceC1031Ab.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final int A7X() {
        int[] iArr = this.A06;
        return iArr == null ? this.A00 : iArr.length;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final int A7Y() {
        return 2;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final int A7Z() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final boolean A8w() {
        return this.A04;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final boolean A91() {
        return this.A05 && this.A03 == InterfaceC1031Ab.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final void AEE() {
        this.A05 = true;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final void AEF(ByteBuffer byteBuffer) {
        AbstractC1192Ha.A04(this.A06 != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int position2 = this.A00;
        int i9 = (limit - position) / (position2 * 2);
        int position3 = this.A06.length;
        int i10 = position3 * i9 * 2;
        int position4 = this.A02.capacity();
        if (position4 < i10) {
            this.A02 = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
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

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final void flush() {
        this.A03 = InterfaceC1031Ab.A00;
        this.A05 = false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final void reset() {
        flush();
        this.A02 = InterfaceC1031Ab.A00;
        this.A00 = -1;
        this.A01 = -1;
        this.A06 = null;
        this.A07 = null;
        this.A04 = false;
    }
}
