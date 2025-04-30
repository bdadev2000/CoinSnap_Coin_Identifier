package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XC extends AbstractC1093Co {
    public static byte[] A05;
    public static String[] A06 = {"yJHQcBl4f4L", "G0ieIp3rn9VMbRQq", "FaSr", "diNTGhkPk6T4rZ0cbtlCtFUtzgnoDDOW", "ZsfK02RsUHO", "uQbwEIiYvgO", "fIpYaZEOmsgiiOCz2AK4PDqwDhI8GLBw", "t90Xt1PXy7A3GvR50K3KPdbeyD"};
    public int A00;
    public C1095Cq A01;
    public C1097Cs A02;
    public C1098Cu A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final C1095Cq A02(C1217Hz c1217Hz) throws IOException {
        if (this.A03 == null) {
            this.A03 = AbstractC1099Cv.A04(c1217Hz);
            return null;
        }
        if (this.A02 == null) {
            this.A02 = AbstractC1099Cv.A03(c1217Hz);
            return null;
        }
        byte[] bArr = new byte[c1217Hz.A07()];
        System.arraycopy(c1217Hz.A00, 0, bArr, 0, c1217Hz.A07());
        return new C1095Cq(this.A03, this.A02, bArr, AbstractC1099Cv.A0C(c1217Hz, this.A03.A05), AbstractC1099Cv.A00(r4.length - 1));
    }

    public static String A03(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{88, 76, 93, 80, 86, Ascii.SYN, 79, 86, 75, 91, 80, 74};
    }

    static {
        A04();
    }

    public static int A00(byte b, int i9, int i10) {
        return (b >> i10) & (255 >>> (8 - i9));
    }

    public static int A01(byte b, C1095Cq c1095Cq) {
        if (!c1095Cq.A04[A00(b, c1095Cq.A00, 1)].A03) {
            int modeNumber = c1095Cq.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c1095Cq.A02.A04;
        return modeNumber2;
    }

    public static void A05(C1217Hz c1217Hz, long j7) {
        c1217Hz.A0X(c1217Hz.A07() + 4);
        c1217Hz.A00[c1217Hz.A07() - 4] = (byte) (j7 & 255);
        c1217Hz.A00[c1217Hz.A07() - 3] = (byte) ((j7 >>> 8) & 255);
        c1217Hz.A00[c1217Hz.A07() - 2] = (byte) ((j7 >>> 16) & 255);
        c1217Hz.A00[c1217Hz.A07() - 1] = (byte) (255 & (j7 >>> 24));
    }

    public static boolean A06(C1217Hz c1217Hz) {
        try {
            return AbstractC1099Cv.A0A(1, c1217Hz, true);
        } catch (C10259v unused) {
            return false;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1093Co
    public final long A07(C1217Hz c1217Hz) {
        int i9 = 0;
        if ((c1217Hz.A00[0] & 1) == 1) {
            return -1L;
        }
        int A01 = A01(c1217Hz.A00[0], this.A01);
        if (this.A04) {
            int packetBlockSize = this.A00;
            i9 = (packetBlockSize + A01) / 4;
        }
        A05(c1217Hz, i9);
        this.A04 = true;
        int samplesInPacket = A06[2].length();
        if (samplesInPacket == 7) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "lV1SPFBYbG5lxAnFlWta4jj5erMHhp00";
        strArr[3] = "grWENQhpkSsLY54DCH6OLJaVWIdWM4Dq";
        this.A00 = A01;
        return i9;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1093Co
    public final void A08(long j7) {
        super.A08(j7);
        this.A04 = j7 != 0;
        C1098Cu c1098Cu = this.A03;
        this.A00 = c1098Cu != null ? c1098Cu.A03 : 0;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1093Co
    public final void A09(boolean z8) {
        super.A09(z8);
        if (z8) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1093Co
    public final boolean A0A(C1217Hz c1217Hz, long j7, C1092Cn c1092Cn) throws IOException, InterruptedException {
        if (this.A01 == null) {
            C1095Cq A02 = A02(c1217Hz);
            this.A01 = A02;
            if (A02 == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.A01.A02.A09);
            arrayList.add(this.A01.A03);
            c1092Cn.A00 = Format.A07(null, A03(0, 12, 20), null, this.A01.A02.A02, -1, this.A01.A02.A05, (int) this.A01.A02.A06, arrayList, null, 0, null);
            return true;
        }
        return false;
    }
}
