package com.meta.analytics.dsp.uinode;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class X2 implements InterfaceC1100Cy {
    public static byte[] A0D;
    public static final double[] A0E;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public C4 A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final boolean[] A0C = new boolean[4];
    public final Cz A0B = new Cz(128);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Pair<Format, Long> A00(Cz cz, String str) {
        byte[] copyOf = Arrays.copyOf(cz.A02, cz.A00);
        int i9 = copyOf[4] & 255;
        int i10 = copyOf[5] & 255;
        int i11 = (i9 << 4) | (i10 >> 4);
        int i12 = ((i10 & 15) << 8) | (copyOf[6] & 255);
        float f9 = 1.0f;
        switch ((copyOf[7] & 240) >> 4) {
            case 2:
                f9 = (i12 * 4) / (i11 * 3);
                break;
            case 3:
                f9 = (i12 * 16) / (i11 * 9);
                break;
            case 4:
                f9 = (i12 * 121) / (i11 * 100);
                break;
        }
        Format A03 = Format.A03(str, A01(0, 11, 121), null, -1, -1, i11, i12, -1.0f, Collections.singletonList(copyOf), -1, f9, null);
        long j7 = 0;
        int i13 = (copyOf[7] & Ascii.SI) - 1;
        if (i13 >= 0) {
            double[] dArr = A0E;
            if (i13 < dArr.length) {
                double d2 = dArr[i13];
                int i14 = cz.A01;
                int i15 = (copyOf[i14 + 9] & 96) >> 5;
                if (i15 != (copyOf[i14 + 9] & Ascii.US)) {
                    d2 *= (i15 + 1.0d) / (r4 + 1);
                }
                j7 = (long) (1000000.0d / d2);
            }
        }
        return Pair.create(A03, Long.valueOf(j7));
    }

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0D = new byte[]{7, Ascii.CAN, Ascii.NAK, Ascii.DC4, Ascii.RS, 94, Ascii.FS, 1, Ascii.DC4, Ascii.SYN, 67};
    }

    static {
        A02();
        A0E = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void A4R(C1217Hz c1217Hz) {
        int A06 = c1217Hz.A06();
        int A07 = c1217Hz.A07();
        byte[] bArr = c1217Hz.A00;
        this.A04 += c1217Hz.A04();
        this.A05.AFR(c1217Hz, c1217Hz.A04());
        while (true) {
            int A04 = AbstractC1213Hv.A04(bArr, A06, A07, this.A0C);
            if (A04 == A07) {
                break;
            }
            int i9 = c1217Hz.A00[A04 + 3] & 255;
            if (!this.A07) {
                int i10 = A04 - A06;
                if (i10 > 0) {
                    this.A0B.A01(bArr, A06, A04);
                }
                if (this.A0B.A02(i9, i10 < 0 ? -i10 : 0)) {
                    Pair<Format, Long> A00 = A00(this.A0B, this.A06);
                    this.A05.A5n((Format) A00.first);
                    this.A00 = ((Long) A00.second).longValue();
                    this.A07 = true;
                }
            }
            if (i9 == 0 || i9 == 179) {
                int i11 = A07 - A04;
                if (this.A0A && this.A08 && this.A07) {
                    this.A05.AFS(this.A03, this.A09 ? 1 : 0, ((int) (this.A04 - this.A02)) - i11, i11, null);
                }
                boolean z8 = this.A0A;
                if (!z8 || this.A08) {
                    this.A02 = this.A04 - i11;
                    long j7 = this.A01;
                    if (j7 == C.TIME_UNSET) {
                        j7 = z8 ? this.A03 + this.A00 : 0L;
                    }
                    this.A03 = j7;
                    this.A09 = false;
                    this.A01 = C.TIME_UNSET;
                    this.A0A = true;
                }
                this.A08 = i9 == 0;
            } else if (i9 == 184) {
                this.A09 = true;
            }
            A06 = A04 + 3;
        }
        if (!this.A07) {
            this.A0B.A01(bArr, A06, A07);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void A4p(InterfaceC1076Bu interfaceC1076Bu, DC dc) {
        dc.A05();
        this.A06 = dc.A04();
        this.A05 = interfaceC1076Bu.AGi(dc.A03(), 2);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void ADs() {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void ADt(long j7, boolean z8) {
        this.A01 = j7;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void AFg() {
        AbstractC1213Hv.A0B(this.A0C);
        this.A0B.A00();
        this.A04 = 0L;
        this.A0A = false;
    }
}
