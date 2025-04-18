package com.facebook.ads.redexgen.uinode;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* loaded from: assets/audience_network.dex */
public final class X2 implements InterfaceC0534Cy {
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
        int i10 = copyOf[4] & UByte.MAX_VALUE;
        int i11 = copyOf[5] & UByte.MAX_VALUE;
        int i12 = (i10 << 4) | (i11 >> 4);
        int i13 = ((i11 & 15) << 8) | (copyOf[6] & UByte.MAX_VALUE);
        float f10 = 1.0f;
        switch ((copyOf[7] & 240) >> 4) {
            case 2:
                f10 = (i13 * 4) / (i12 * 3);
                break;
            case 3:
                f10 = (i13 * 16) / (i12 * 9);
                break;
            case 4:
                f10 = (i13 * 121) / (i12 * 100);
                break;
        }
        Format A03 = Format.A03(str, A01(0, 11, 121), null, -1, -1, i12, i13, -1.0f, Collections.singletonList(copyOf), -1, f10, null);
        long j3 = 0;
        int i14 = (copyOf[7] & Ascii.SI) - 1;
        if (i14 >= 0) {
            double[] dArr = A0E;
            if (i14 < dArr.length) {
                double d10 = dArr[i14];
                int i15 = cz.A01;
                int i16 = (copyOf[i15 + 9] & 96) >> 5;
                if (i16 != (copyOf[i15 + 9] & Ascii.US)) {
                    d10 *= (i16 + 1.0d) / (r4 + 1);
                }
                j3 = (long) (1000000.0d / d10);
            }
        }
        return Pair.create(A03, Long.valueOf(j3));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 8);
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

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0534Cy
    public final void A4R(C0651Hz c0651Hz) {
        int A06 = c0651Hz.A06();
        int A07 = c0651Hz.A07();
        byte[] bArr = c0651Hz.A00;
        this.A04 += c0651Hz.A04();
        this.A05.AFR(c0651Hz, c0651Hz.A04());
        while (true) {
            int A04 = AbstractC0647Hv.A04(bArr, A06, A07, this.A0C);
            if (A04 == A07) {
                break;
            }
            int i10 = c0651Hz.A00[A04 + 3] & UByte.MAX_VALUE;
            if (!this.A07) {
                int i11 = A04 - A06;
                if (i11 > 0) {
                    this.A0B.A01(bArr, A06, A04);
                }
                if (this.A0B.A02(i10, i11 < 0 ? -i11 : 0)) {
                    Pair<Format, Long> A00 = A00(this.A0B, this.A06);
                    this.A05.A5n((Format) A00.first);
                    this.A00 = ((Long) A00.second).longValue();
                    this.A07 = true;
                }
            }
            if (i10 == 0 || i10 == 179) {
                int i12 = A07 - A04;
                if (this.A0A && this.A08 && this.A07) {
                    this.A05.AFS(this.A03, this.A09 ? 1 : 0, ((int) (this.A04 - this.A02)) - i12, i12, null);
                }
                boolean z10 = this.A0A;
                if (!z10 || this.A08) {
                    this.A02 = this.A04 - i12;
                    long j3 = this.A01;
                    if (j3 == C.TIME_UNSET) {
                        j3 = z10 ? this.A03 + this.A00 : 0L;
                    }
                    this.A03 = j3;
                    this.A09 = false;
                    this.A01 = C.TIME_UNSET;
                    this.A0A = true;
                }
                this.A08 = i10 == 0;
            } else if (i10 == 184) {
                this.A09 = true;
            }
            A06 = A04 + 3;
        }
        if (!this.A07) {
            this.A0B.A01(bArr, A06, A07);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0534Cy
    public final void A4p(InterfaceC0510Bu interfaceC0510Bu, DC dc2) {
        dc2.A05();
        this.A06 = dc2.A04();
        this.A05 = interfaceC0510Bu.AGi(dc2.A03(), 2);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0534Cy
    public final void ADs() {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0534Cy
    public final void ADt(long j3, boolean z10) {
        this.A01 = j3;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0534Cy
    public final void AFg() {
        AbstractC0647Hv.A0B(this.A0C);
        this.A0B.A00();
        this.A04 = 0L;
        this.A0A = false;
    }
}
