package com.meta.analytics.dsp.uinode;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ww, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1593Ww implements DD {
    public static byte[] A0C;
    public static String[] A0D = {"wYbCHe4PqE0rUTWdo8mFq0UBpfkRDoC", "CuNoFwrXbx7Fup1Bnz4crpheboHEAq61", "i4a35YUA6bJnEiUQjLdSeulU0LA5VC2", "DQj4nZO33GsRRuNygGqDxWwIbU", "NTzjfKAdqL5R4ni", "Zn", "9Rh66LtnIoGSEkHARJ7O", "nCQ56kMXgmV4b9DPw80w9mtudgrGO1uA"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public IB A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC1100Cy A0A;
    public final C1216Hy A0B = new C1216Hy(new byte[10]);
    public int A03 = 0;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0D;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[6] = "tGST5WGrXasfnynKry2Y";
            strArr2[4] = "X7BCEDGkhqj2a0M";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 105);
            i12++;
        }
    }

    public static void A02() {
        A0C = new byte[]{-37, 40, 42, 45, 32, -37, Ascii.GS, 52, 47, 32, 46, -44, -23, -9, -42, -23, -27, -24, -23, -10, -14, Ascii.VT, 2, Ascii.NAK, Ascii.CR, 2, 0, 17, 2, 1, -67, Ascii.DLE, 17, -2, Ascii.SI, 17, -67, 0, Ascii.FF, 1, 2, -67, Ascii.CR, Ascii.SI, 2, 3, 6, Ascii.NAK, -41, -67, 40, 65, 56, 75, 67, 56, 54, 71, 56, 55, -13, 70, 71, 52, 69, 71, -13, 60, 65, 55, 60, 54, 52, 71, 66, 69, -13, 69, 56, 52, 55, 60, 65, 58, -13, 56, 75, 71, 56, 65, 55, 56, 55, -13, 59, 56, 52, 55, 56, 69, -2, Ascii.ETB, Ascii.SO, 33, Ascii.EM, Ascii.SO, Ascii.FF, Ascii.GS, Ascii.SO, Ascii.CR, -55, Ascii.FS, Ascii.GS, 10, Ascii.ESC, Ascii.GS, -55, Ascii.DC2, Ascii.ETB, Ascii.CR, Ascii.DC2, Ascii.FF, 10, Ascii.GS, Ascii.CAN, Ascii.ESC, -29, -55, Ascii.SO, 33, Ascii.EM, Ascii.SO, Ascii.FF, Ascii.GS, Ascii.SO, Ascii.CR, -55};
    }

    static {
        A02();
    }

    public C1593Ww(InterfaceC1100Cy interfaceC1100Cy) {
        this.A0A = interfaceC1100Cy;
    }

    private void A01() {
        this.A0B.A07(0);
        this.A04 = C.TIME_UNSET;
        if (this.A08) {
            this.A0B.A08(4);
            this.A0B.A08(1);
            long pts = this.A0B.A04(15) << 15;
            long A04 = (this.A0B.A04(3) << 30) | pts;
            this.A0B.A08(1);
            long pts2 = this.A0B.A04(15);
            long j7 = A04 | pts2;
            this.A0B.A08(1);
            if (!this.A09 && this.A07) {
                this.A0B.A08(4);
                long pts3 = this.A0B.A04(3);
                this.A0B.A08(1);
                this.A0B.A08(1);
                this.A0B.A08(1);
                this.A05.A07((pts3 << 30) | (this.A0B.A04(15) << 15) | this.A0B.A04(15));
                this.A09 = true;
            }
            this.A04 = this.A05.A07(j7);
        }
    }

    private void A03(int i9) {
        this.A03 = i9;
        this.A00 = 0;
    }

    private boolean A04() {
        this.A0B.A07(0);
        int A04 = this.A0B.A04(24);
        if (A04 != 1) {
            Log.w(A00(11, 9, 27), A00(20, 30, 52) + A04);
            this.A02 = -1;
            return false;
        }
        this.A0B.A08(8);
        int A042 = this.A0B.A04(16);
        this.A0B.A08(5);
        this.A06 = this.A0B.A0F();
        this.A0B.A08(2);
        this.A08 = this.A0B.A0F();
        this.A07 = this.A0B.A0F();
        this.A0B.A08(6);
        int packetLength = this.A0B.A04(8);
        this.A01 = packetLength;
        if (A042 == 0) {
            this.A02 = -1;
        } else {
            int startCodePrefix = A042 + 6;
            this.A02 = (startCodePrefix - 9) - packetLength;
        }
        return true;
    }

    private boolean A05(C1217Hz c1217Hz, byte[] bArr, int i9) {
        int min = Math.min(c1217Hz.A04(), i9 - this.A00);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c1217Hz.A0Z(min);
        } else {
            int bytesToRead = this.A00;
            c1217Hz.A0c(bArr, bytesToRead, min);
        }
        int bytesToRead2 = this.A00;
        int bytesToRead3 = bytesToRead2 + min;
        this.A00 = bytesToRead3;
        return bytesToRead3 == i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00db, code lost:
    
        android.util.Log.w(r5, A00(100, 37, 64) + r7.A02 + A00(0, 11, 82));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0108, code lost:
    
        r7.A0A.ADs();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x011b, code lost:
    
        if (r6 != (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00d9, code lost:
    
        if (r6 != (-1)) goto L42;
     */
    @Override // com.meta.analytics.dsp.uinode.DD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4S(com.meta.analytics.dsp.uinode.C1217Hz r8, boolean r9) throws com.meta.analytics.dsp.uinode.C10259v {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1593Ww.A4S(com.facebook.ads.redexgen.X.Hz, boolean):void");
    }

    @Override // com.meta.analytics.dsp.uinode.DD
    public final void A8q(IB ib, InterfaceC1076Bu interfaceC1076Bu, DC dc) {
        this.A05 = ib;
        this.A0A.A4p(interfaceC1076Bu, dc);
    }

    @Override // com.meta.analytics.dsp.uinode.DD
    public final void AFg() {
        this.A03 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A0A.AFg();
    }
}
