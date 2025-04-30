package com.meta.analytics.dsp.uinode;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.facebook.ads.redexgen.X.Xt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1616Xt implements InterfaceC1031Ab {
    public static String[] A0D = {"pWxjFsNDaGkCJOJIXf3nBpXapJRDFAns", "UkLwcPvzhTn0p2HYHg4j6N15VQJC2l4J", "YJRY7F74jhCJ9GxMtbKfeDIDzZlQRHvd", "", "", "sMHZoQnzt9jO1PxekMXjLs1IjEAfMk8v", "KagcOA94TBJJAh6RgnCdHwb09FdTTp2T", "s5OQD0o5JvIPNjQnPDHHdNmWUeQWTVLd"};
    public int A04;
    public long A06;
    public long A07;
    public B6 A08;
    public ByteBuffer A09;
    public ByteBuffer A0A;
    public ShortBuffer A0B;
    public boolean A0C;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public int A02 = -1;
    public int A05 = -1;
    public int A03 = -1;

    public C1616Xt() {
        ByteBuffer byteBuffer = InterfaceC1031Ab.A00;
        this.A09 = byteBuffer;
        this.A0B = byteBuffer.asShortBuffer();
        this.A0A = InterfaceC1031Ab.A00;
        this.A04 = -1;
    }

    public final float A00(float f9) {
        float A00 = IF.A00(f9, 0.1f, 8.0f);
        if (this.A00 != A00) {
            this.A00 = A00;
            this.A08 = null;
        }
        flush();
        return A00;
    }

    public final float A01(float f9) {
        float A00 = IF.A00(f9, 0.1f, 8.0f);
        if (this.A01 != A00) {
            this.A01 = A00;
            this.A08 = null;
        }
        flush();
        return A00;
    }

    public final long A02(long j7) {
        long j9 = this.A07;
        if (j9 >= 1024) {
            int i9 = this.A03;
            int i10 = this.A05;
            if (A0D[5].charAt(5) != 'Q') {
                throw new RuntimeException();
            }
            A0D[1] = "wo8T89BmhgCv6RPfRPDSoWflpmmFSmBw";
            if (i9 == i10) {
                return IF.A0F(j7, this.A06, j9);
            }
            return IF.A0F(j7, this.A06 * i9, j9 * i10);
        }
        return (long) (this.A01 * j7);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final boolean A4Q(int i9, int i10, int i11) throws C1030Aa {
        if (i11 == 2) {
            int i12 = this.A04;
            if (i12 == -1) {
                i12 = i9;
            }
            int outputSampleRateHz = this.A05;
            if (outputSampleRateHz == i9) {
                int outputSampleRateHz2 = this.A02;
                if (outputSampleRateHz2 == i10) {
                    int outputSampleRateHz3 = this.A03;
                    if (outputSampleRateHz3 == i12) {
                        return false;
                    }
                }
            }
            this.A05 = i9;
            this.A02 = i10;
            this.A03 = i12;
            this.A08 = null;
            return true;
        }
        throw new C1030Aa(i9, i10, i11);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final ByteBuffer A7W() {
        ByteBuffer byteBuffer = this.A0A;
        ByteBuffer outputBuffer = InterfaceC1031Ab.A00;
        this.A0A = outputBuffer;
        return byteBuffer;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final int A7X() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final int A7Y() {
        return 2;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final int A7Z() {
        return this.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final boolean A8w() {
        return this.A05 != -1 && (Math.abs(this.A01 - 1.0f) >= 0.01f || Math.abs(this.A00 - 1.0f) >= 0.01f || this.A03 != this.A05);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final boolean A91() {
        B6 b62;
        return this.A0C && ((b62 = this.A08) == null || b62.A0H() == 0);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final void AEE() {
        AbstractC1192Ha.A04(this.A08 != null);
        this.A08.A0J();
        this.A0C = true;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final void AEF(ByteBuffer byteBuffer) {
        AbstractC1192Ha.A04(this.A08 != null);
        boolean hasRemaining = byteBuffer.hasRemaining();
        if (A0D[1].charAt(8) != 'h') {
            throw new RuntimeException();
        }
        A0D[0] = "CgSP7s2gOF1CWMy2qVo8ASfS0wZJy2y3";
        if (hasRemaining) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.A06 += remaining;
            this.A08.A0L(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int A0H = this.A08.A0H() * this.A02 * 2;
        if (A0H > 0) {
            int outputSize = this.A09.capacity();
            if (outputSize < A0H) {
                ByteBuffer order = ByteBuffer.allocateDirect(A0H).order(ByteOrder.nativeOrder());
                this.A09 = order;
                this.A0B = order.asShortBuffer();
            } else {
                this.A09.clear();
                this.A0B.clear();
            }
            this.A08.A0K(this.A0B);
            this.A07 += A0H;
            this.A09.limit(A0H);
            this.A0A = this.A09;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final void flush() {
        if (A8w()) {
            B6 b62 = this.A08;
            if (b62 == null) {
                this.A08 = new B6(this.A05, this.A02, this.A01, this.A00, this.A03);
            } else {
                b62.A0I();
            }
        }
        this.A0A = InterfaceC1031Ab.A00;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1031Ab
    public final void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        this.A02 = -1;
        this.A05 = -1;
        this.A03 = -1;
        ByteBuffer byteBuffer = InterfaceC1031Ab.A00;
        this.A09 = byteBuffer;
        this.A0B = byteBuffer.asShortBuffer();
        this.A0A = InterfaceC1031Ab.A00;
        this.A04 = -1;
        this.A08 = null;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }
}
