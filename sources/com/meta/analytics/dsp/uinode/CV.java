package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.mbridge.msdk.foundation.controller.a;

/* loaded from: assets/audience_network.dex */
public final class CV {
    public static String[] A0A = {"VV6EzFzDFGyxh7278LhkWh1nAnO", "a", "RIeoUtwh2k0Lp", "KiUc8yTTjWF6Y9v", "6tIA8m5WM2YSgVpCAFtgKZOFEkm", "A00z45", "ej2X1eDppCFfwh6aI5B812e88v7VHLnd", "obdd9bh"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public CP A04;
    public C1083Ce A05;
    public final C4 A06;
    public final C1085Cg A07 = new C1085Cg();
    public final C1217Hz A09 = new C1217Hz(1);
    public final C1217Hz A08 = new C1217Hz();

    public CV(C4 c42) {
        this.A06 = c42;
    }

    private C1084Cf A00() {
        int i9 = this.A07.A07.A02;
        if (this.A07.A08 != null) {
            C1085Cg c1085Cg = this.A07;
            if (A0A[2].length() == 16) {
                throw new RuntimeException();
            }
            A0A[2] = "yH";
            return c1085Cg.A08;
        }
        return this.A05.A00(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (!this.A07.A0A) {
            return;
        }
        C1217Hz c1217Hz = this.A07.A09;
        C1084Cf encryptionBox = A00();
        if (encryptionBox.A00 != 0) {
            c1217Hz.A0Z(encryptionBox.A00);
        }
        if (this.A07.A0H[this.A01]) {
            c1217Hz.A0Z(c1217Hz.A0I() * 6);
        }
    }

    public final int A03() {
        C1217Hz c1217Hz;
        int vectorSize;
        if (!this.A07.A0A) {
            return 0;
        }
        C1084Cf A00 = A00();
        if (A0A[5].length() != 6) {
            throw new RuntimeException();
        }
        A0A[1] = a.f15376a;
        if (A00.A00 != 0) {
            c1217Hz = this.A07.A09;
            vectorSize = A00.A00;
        } else {
            byte[] initVectorData = A00.A04;
            this.A08.A0b(initVectorData, initVectorData.length);
            c1217Hz = this.A08;
            vectorSize = initVectorData.length;
        }
        boolean z8 = this.A07.A0H[this.A01];
        this.A09.A00[0] = (byte) ((z8 ? 128 : 0) | vectorSize);
        this.A09.A0Y(0);
        C4 c42 = this.A06;
        C1217Hz initializationVectorData = this.A09;
        c42.AFR(initializationVectorData, 1);
        this.A06.AFR(c1217Hz, vectorSize);
        if (!z8) {
            return vectorSize + 1;
        }
        C1217Hz c1217Hz2 = this.A07.A09;
        int A0I = c1217Hz2.A0I();
        c1217Hz2.A0Z(-2);
        int i9 = (A0I * 6) + 2;
        this.A06.AFR(c1217Hz2, i9);
        return vectorSize + 1 + i9;
    }

    public final void A04() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A05(long j7) {
        long A01 = C9W.A01(j7);
        for (int i9 = this.A01; i9 < this.A07.A00 && this.A07.A00(i9) < A01; i9++) {
            if (this.A07.A0I[i9]) {
                this.A03 = i9;
            }
        }
    }

    public final void A06(DrmInitData drmInitData) {
        C1084Cf encryptionBox = this.A05.A00(this.A07.A07.A02);
        this.A06.A5n(this.A05.A07.A0I(drmInitData.A02(encryptionBox != null ? encryptionBox.A02 : null)));
    }

    public final void A07(C1083Ce c1083Ce, CP cp) {
        this.A05 = (C1083Ce) AbstractC1192Ha.A01(c1083Ce);
        this.A04 = (CP) AbstractC1192Ha.A01(cp);
        this.A06.A5n(c1083Ce.A07);
        A04();
    }

    public final boolean A08() {
        this.A01++;
        int i9 = this.A00 + 1;
        this.A00 = i9;
        int[] iArr = this.A07.A0E;
        int i10 = this.A02;
        if (i9 != iArr[i10]) {
            return true;
        }
        this.A02 = i10 + 1;
        this.A00 = 0;
        return false;
    }
}
