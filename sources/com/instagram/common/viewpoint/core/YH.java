package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class YH extends AbstractC0477Ct {
    public static byte[] A05;
    public static String[] A06 = {"CfiERA", "aqzXLhx7II0vO15jWMUzXt7FO8HYio", "dQDUGs", "rXJ7u9pv7eoczgkakx2iUXR9KJyxjBER", "IxZhnB", "GbKHkLTg9xu9ykL3hBwLplXSwxhS4HIM", "Fj9fDEC3pUeWSTLe", "BpYov1BGFgNJjphL"};
    public int A00;
    public C0479Cv A01;
    public C0481Cx A02;
    public C0483Cz A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final C0479Cv A02(I4 i4) throws IOException {
        if (this.A03 == null) {
            this.A03 = D0.A04(i4);
            return null;
        }
        if (this.A02 == null) {
            this.A02 = D0.A03(i4);
            return null;
        }
        byte[] bArr = new byte[i4.A07()];
        System.arraycopy(i4.A00, 0, bArr, 0, i4.A07());
        return new C0479Cv(this.A03, this.A02, bArr, D0.A0C(i4, this.A03.A05), D0.A00(r4.length - 1));
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 86);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{117, 97, 112, 125, 123, 59, 98, 123, 102, 118, 125, 103};
    }

    static {
        A04();
    }

    public static int A00(byte b2, int i2, int i3) {
        return (b2 >> i3) & (255 >>> (8 - i2));
    }

    public static int A01(byte b2, C0479Cv c0479Cv) {
        if (!c0479Cv.A04[A00(b2, c0479Cv.A00, 1)].A03) {
            C0483Cz c0483Cz = c0479Cv.A02;
            String[] strArr = A06;
            String str = strArr[4];
            String str2 = strArr[2];
            int length = str.length();
            int modeNumber = str2.length();
            if (length != modeNumber) {
                throw new RuntimeException();
            }
            A06[6] = "By5V";
            int modeNumber2 = c0483Cz.A03;
            return modeNumber2;
        }
        int modeNumber3 = c0479Cv.A02.A04;
        return modeNumber3;
    }

    public static void A05(I4 i4, long j2) {
        i4.A0X(i4.A07() + 4);
        i4.A00[i4.A07() - 4] = (byte) (j2 & 255);
        i4.A00[i4.A07() - 3] = (byte) ((j2 >>> 8) & 255);
        i4.A00[i4.A07() - 2] = (byte) ((j2 >>> 16) & 255);
        i4.A00[i4.A07() - 1] = (byte) (255 & (j2 >>> 24));
    }

    public static boolean A06(I4 i4) {
        try {
            return D0.A0A(1, i4, true);
        } catch (A0 unused) {
            return false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0477Ct
    public final long A07(I4 i4) {
        int i2 = 0;
        if ((i4.A00[0] & 1) == 1) {
            return -1L;
        }
        byte[] bArr = i4.A00;
        if (A06[6].length() == 5) {
            throw new RuntimeException();
        }
        A06[7] = "dvcdmR";
        int samplesInPacket = A01(bArr[0], this.A01);
        if (this.A04) {
            int packetBlockSize = this.A00;
            i2 = (packetBlockSize + samplesInPacket) / 4;
        }
        A05(i4, i2);
        this.A04 = true;
        this.A00 = samplesInPacket;
        return i2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0477Ct
    public final void A08(long j2) {
        super.A08(j2);
        this.A04 = j2 != 0;
        this.A00 = this.A03 != null ? this.A03.A03 : 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0477Ct
    public final void A09(boolean z2) {
        super.A09(z2);
        if (z2) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0477Ct
    public final boolean A0A(I4 i4, long j2, C0476Cs c0476Cs) throws IOException, InterruptedException {
        if (this.A01 == null) {
            this.A01 = A02(i4);
            if (this.A01 == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.A01.A02.A09);
            arrayList.add(this.A01.A03);
            c0476Cs.A00 = Format.A07(null, A03(0, 12, 66), null, this.A01.A02.A02, -1, this.A01.A02.A05, (int) this.A01.A02.A06, arrayList, null, 0, null);
            return true;
        }
        return false;
    }
}
