package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1598Xb extends C6 {
    public static byte[] A05;
    public static String[] A06 = {"S6oix22WW3XrOL6PgcbxfAkEtHdPkPhf", "4OWz7hl1Zq8qyI8tM", "clV1g7mDIxTidmwZ1CuuG8s1lTi1VXAM", "4pPGx9", "ltKNubnfMHDxlo41G", "61sVTIAUswj0oFXzD6", "V6Pb0wOPN8cWCdQmqK9dHxyDUr6EkDd0", "qXRSabgl4tCI0bSRqPqCbhaUnodlSpfB"};
    public int A00;
    public int A01;
    public boolean A02;
    public final C1217Hz A03;
    public final C1217Hz A04;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{71, 120, 117, 116, 126, 49, 119, 126, 99, 124, 112, 101, 49, Ascii.DEL, 126, 101, 49, 98, 100, 97, 97, 126, 99, 101, 116, 117, 43, 49, 39, 56, 53, 52, 62, 126, 48, 39, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.C6
    public final void A0B(C1217Hz c1217Hz, long j7) throws C10259v {
        int A0E = c1217Hz.A0E();
        long A09 = j7 + (c1217Hz.A09() * 1000);
        if (A0E == 0 && !this.A02) {
            C1217Hz c1217Hz2 = new C1217Hz(new byte[c1217Hz.A04()]);
            c1217Hz.A0c(c1217Hz2.A00, 0, c1217Hz.A04());
            IH A00 = IH.A00(c1217Hz2);
            this.A01 = A00.A02;
            super.A00.A5n(Format.A03(null, A00(28, 9, 110), null, -1, -1, A00.A03, A00.A01, -1.0f, A00.A04, -1, A00.A00, null));
            this.A02 = true;
            return;
        }
        if (A0E == 1 && this.A02) {
            byte[] bArr = this.A03.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i9 = 4 - this.A01;
            int i10 = 0;
            while (c1217Hz.A04() > 0) {
                c1217Hz.A0c(this.A03.A00, i9, this.A01);
                this.A03.A0Y(0);
                int A0H = this.A03.A0H();
                this.A04.A0Y(0);
                super.A00.AFR(this.A04, 4);
                super.A00.AFR(c1217Hz, A0H);
                i10 = i10 + 4 + A0H;
            }
            super.A00.AFS(A09, this.A00 != 1 ? 0 : 1, i10, 0, null);
        }
    }

    static {
        A01();
    }

    public C1598Xb(C4 c42) {
        super(c42);
        this.A04 = new C1217Hz(AbstractC1213Hv.A03);
        this.A03 = new C1217Hz(4);
    }

    @Override // com.meta.analytics.dsp.uinode.C6
    public final boolean A0C(C1217Hz c1217Hz) throws C1599Xc {
        int frameType = c1217Hz.A0E();
        int header = frameType >> 4;
        int i9 = header & 15;
        int i10 = frameType & 15;
        if (i10 == 7) {
            this.A00 = i9;
            if (A06[2].charAt(25) == 118) {
                throw new RuntimeException();
            }
            A06[5] = "9goNtADcrLhK1amHV7";
            return i9 != 5;
        }
        throw new C1599Xc(A00(0, 28, 46) + i10);
    }
}
