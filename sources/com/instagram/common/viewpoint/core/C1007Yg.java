package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Yg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1007Yg extends CB {
    public static byte[] A05;
    public static String[] A06 = {"lGyDkwtSGWnyBDNx8VCH6YS5wU7hPdWQ", "PgowCxsSC8EJKJT6apDR", "LPWWnTonb9RlyYc30tl", "RtHeIiqAKzH58z", "0jwO409h5d63SGevyEOv", "LIh4yarHvfESg0ILrv8Z9A7hNJPgMM", "W4YWO", "dzZdewsfodUdBsfR1Ihh4NImnUsz5jl1"};
    public int A00;
    public int A01;
    public boolean A02;
    public final I4 A03;
    public final I4 A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        String[] strArr = A06;
        if (strArr[0].charAt(5) != strArr[7].charAt(5)) {
            throw new RuntimeException();
        }
        A06[5] = "sxdlVolwhrQkkfqceIwrm1GozpbCc1";
        A05 = new byte[]{-34, -15, -20, -19, -9, -88, -18, -9, -6, -11, -23, -4, -88, -10, -9, -4, -88, -5, -3, -8, -8, -9, -6, -4, -19, -20, -62, -88, 71, 58, 53, 54, 64, 0, 50, 71, 52};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.instagram.common.viewpoint.core.CB
    public final void A0B(I4 i4, long j2) throws A0 {
        int A0E = i4.A0E();
        long A09 = j2 + (i4.A09() * 1000);
        if (A0E == 0 && !this.A02) {
            I4 i42 = new I4(new byte[i4.A04()]);
            i4.A0c(i42.A00, 0, i4.A04());
            IM A00 = IM.A00(i42);
            this.A01 = A00.A02;
            super.A00.A69(Format.A03(null, A00(28, 9, Opcodes.LUSHR), null, -1, -1, A00.A03, A00.A01, -1.0f, A00.A04, -1, A00.A00, null));
            this.A02 = true;
            return;
        }
        if (A0E == 1 && this.A02) {
            byte[] bArr = this.A03.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i2 = 4 - this.A01;
            int i3 = 0;
            while (i4.A04() > 0) {
                i4.A0c(this.A03.A00, i2, this.A01);
                this.A03.A0Y(0);
                int A0H = this.A03.A0H();
                this.A04.A0Y(0);
                super.A00.AFv(this.A04, 4);
                super.A00.AFv(i4, A0H);
                i3 = i3 + 4 + A0H;
            }
            super.A00.AFw(A09, this.A00 == 1 ? 1 : 0, i3, 0, null);
        }
    }

    static {
        A01();
    }

    public C1007Yg(C9 c9) {
        super(c9);
        this.A04 = new I4(I0.A03);
        this.A03 = new I4(4);
    }

    @Override // com.instagram.common.viewpoint.core.CB
    public final boolean A0C(I4 i4) throws C1008Yh {
        int A0E = i4.A0E();
        int header = A0E >> 4;
        int frameType = header & 15;
        int i2 = A0E & 15;
        if (i2 == 7) {
            this.A00 = frameType;
            return frameType != 5;
        }
        throw new C1008Yh(A00(0, 28, 52) + i2);
    }
}
