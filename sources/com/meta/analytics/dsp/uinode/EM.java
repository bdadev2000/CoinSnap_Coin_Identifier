package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class EM implements Y5, AA {
    public static byte[] A09;
    public static String[] A0A = {"9qnQyWyVOy7Yt1e5kI69WFnVp2gMy1V", "BpqCVyh3b", "BBu5XuJM3kgxNsyZ7X9f0tLDZOMhAb0I", "70xG0YQvSL9bnkI9uxU7IiqBWrnzW1xT", "FprTHacbfyfVlL7HNnWkMu7r", "uMfJClZk5qH56MPpWubSpXt", "rGQzHUHjzvUiqILZEsrKwpyReixzpim3", "VNUv5nSJy2Heuf3XsCr3Vyrq4xzGHGIU"};
    public int A00;
    public int A01;
    public long A02;
    public AB A03;
    public FB A04;
    public boolean A05 = true;
    public boolean A06;
    public Format[] A07;
    public final int A08;

    public static String A0w(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            int i13 = copyOfRange[i12] ^ i11;
            String[] strArr = A0A;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "sONUtG9kcKy8d61ZBFdh1qYmD6uC6oh7";
            strArr2[6] = "okSWHoPOYn7Fcc6ZCgaoehlpub0ImFoA";
            copyOfRange[i12] = (byte) (i13 ^ 47);
        }
        return new String(copyOfRange);
    }

    public static void A0x() {
        A09 = new byte[]{52, 54, 57, Ascii.SYN, 52, 38, 34, 62, 37, 50, 4, 50, 36, 36, 62, 56, 57};
    }

    public abstract void A15();

    public abstract void A16(long j7, boolean z8) throws C10079c;

    static {
        A0x();
    }

    public EM(int i9) {
        this.A08 = i9;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<?> */
    public static boolean A0y(InterfaceC1058Bc<?> interfaceC1058Bc, DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (interfaceC1058Bc == null) {
            return false;
        }
        throw new NullPointerException(A0w(0, 17, 120));
    }

    public final int A0z() {
        return this.A00;
    }

    public final int A10(long j7) {
        return this.A04.AGO(j7 - this.A02);
    }

    public final int A11(C10199p c10199p, C1614Xr c1614Xr, boolean z8) {
        int AEK = this.A04.AEK(c10199p, c1614Xr, z8);
        if (AEK == -4) {
            if (c1614Xr.A04()) {
                this.A05 = true;
                return this.A06 ? -4 : -3;
            }
            c1614Xr.A00 += this.A02;
        } else if (AEK == -5) {
            Format format = c10199p.A00;
            if (format.A0G != Long.MAX_VALUE) {
                c10199p.A00 = format.A0H(format.A0G + this.A02);
            }
        }
        return AEK;
    }

    public final AB A12() {
        return this.A03;
    }

    public void A13() throws C10079c {
    }

    public void A14() throws C10079c {
    }

    public void A17(boolean z8) throws C10079c {
    }

    public void A18(Format[] formatArr, long j7) throws C10079c {
    }

    public final boolean A19() {
        return this.A05 ? this.A06 : this.A04.A9C();
    }

    public final Format[] A1A() {
        return this.A07;
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public final void A58() {
        AbstractC1192Ha.A04(this.A01 == 1);
        this.A01 = 0;
        this.A04 = null;
        this.A07 = null;
        this.A06 = false;
        A15();
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public final void A5V(AB ab, Format[] formatArr, FB fb, long j7, boolean z8, long j9) throws C10079c {
        AbstractC1192Ha.A04(this.A01 == 0);
        this.A03 = ab;
        this.A01 = 1;
        A17(z8);
        AFD(formatArr, fb, j9);
        A16(j7, z8);
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public final AA A6I() {
        return this;
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public InterfaceC1208Hq A7N() {
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public final int A81() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public final FB A84() {
        return this.A04;
    }

    @Override // com.meta.analytics.dsp.uinode.Y5, com.meta.analytics.dsp.uinode.AA
    public final int A8C() {
        return this.A08;
    }

    @Override // com.meta.analytics.dsp.uinode.A7
    public void A8V(int i9, Object obj) throws C10079c {
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public final boolean A8a() {
        return this.A05;
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public final boolean A8y() {
        return this.A06;
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public final void AAP() throws IOException {
        this.A04.AAM();
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public final void AFD(Format[] formatArr, FB fb, long j7) throws C10079c {
        AbstractC1192Ha.A04(!this.A06);
        this.A04 = fb;
        this.A05 = false;
        this.A07 = formatArr;
        this.A02 = j7;
        A18(formatArr, j7);
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public final void AFN(long j7) throws C10079c {
        this.A06 = false;
        this.A05 = false;
        A16(j7, false);
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public final void AFy() {
        this.A06 = true;
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public final void AG2(int i9) {
        this.A00 = i9;
    }

    public int AGg() throws C10079c {
        return 0;
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public final void start() throws C10079c {
        AbstractC1192Ha.A04(this.A01 == 1);
        this.A01 = 2;
        A13();
    }

    @Override // com.meta.analytics.dsp.uinode.Y5
    public final void stop() throws C10079c {
        AbstractC1192Ha.A04(this.A01 == 2);
        this.A01 = 1;
        A14();
    }
}
