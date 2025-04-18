package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;

/* renamed from: com.facebook.ads.redexgen.X.Ca, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0458Ca {
    public static String[] A0A = {"tKMEQyvluzQ1Nn3ykuVdzNZ8vb4kdT8m", "GeKfs2sJ6nbbQhem6v82VjejoG5jBsB7", "AfmYZYeI1Y00emk9wBvDzFPL2v9SQ7vS", "qVzzKcDVUoFZFts2UpxZp90t7lN0aiYH", "rWkFrnOBw96ebPrEG0IMfbHNXRTUH8t0", "U5tUtJMHZjXCJdFBhHSSQmrZPEv5F3Ni", "CMETZJr0lHowFtN3K41q19SzNF1CjRpv", "lrsJQP2RFV9f4UsQyKTnoj893IObLugA"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public CU A04;
    public C0467Cj A05;
    public final C9 A06;
    public final C0469Cl A07 = new C0469Cl();
    public final I4 A09 = new I4(1);
    public final I4 A08 = new I4();

    public C0458Ca(C9 c9) {
        this.A06 = c9;
    }

    private C0468Ck A00() {
        int i2 = this.A07.A07.A02;
        if (this.A07.A08 != null) {
            return this.A07.A08;
        }
        return this.A05.A00(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (!this.A07.A0A) {
            return;
        }
        I4 i4 = this.A07.A09;
        C0468Ck encryptionBox = A00();
        if (encryptionBox.A00 != 0) {
            i4.A0Z(encryptionBox.A00);
        }
        if (this.A07.A0H[this.A01]) {
            int A0I = i4.A0I() * 6;
            if (A0A[6].charAt(17) == 'S') {
                throw new RuntimeException();
            }
            A0A[0] = "Dkat9NH7bKSE7Rzb8B6OLbAVLJtjjf4Q";
            i4.A0Z(A0I);
        }
    }

    public final int A03() {
        I4 i4;
        int vectorSize;
        if (!this.A07.A0A) {
            return 0;
        }
        C0468Ck A00 = A00();
        if (A00.A00 != 0) {
            i4 = this.A07.A09;
            vectorSize = A00.A00;
        } else {
            byte[] initVectorData = A00.A04;
            this.A08.A0b(initVectorData, initVectorData.length);
            i4 = this.A08;
            vectorSize = initVectorData.length;
        }
        boolean z2 = this.A07.A0H[this.A01];
        this.A09.A00[0] = (byte) ((z2 ? 128 : 0) | vectorSize);
        this.A09.A0Y(0);
        C9 c9 = this.A06;
        I4 initializationVectorData = this.A09;
        c9.AFv(initializationVectorData, 1);
        this.A06.AFv(i4, vectorSize);
        if (!z2) {
            return vectorSize + 1;
        }
        I4 i42 = this.A07.A09;
        int A0I = i42.A0I();
        i42.A0Z(-2);
        int i2 = (A0I * 6) + 2;
        this.A06.AFv(i42, i2);
        return vectorSize + 1 + i2;
    }

    public final void A04() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A05(long j2) {
        long A01 = AbstractC03849b.A01(j2);
        for (int i2 = this.A01; i2 < this.A07.A00 && this.A07.A00(i2) < A01; i2++) {
            if (this.A07.A0I[i2]) {
                this.A03 = i2;
            }
        }
    }

    public final void A06(DrmInitData drmInitData) {
        C0468Ck encryptionBox = this.A05.A00(this.A07.A07.A02);
        String str = encryptionBox != null ? encryptionBox.A02 : null;
        C9 c9 = this.A06;
        Format format = this.A05.A07;
        String[] strArr = A0A;
        String schemeType = strArr[5];
        if (schemeType.charAt(25) == strArr[2].charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[1] = "9VKvmNGI1pKEwb6BSF19djXm8kYtnzgK";
        strArr2[7] = "KanRAdK5lExnEnkfSh4wHj8L33fZCYqk";
        c9.A69(format.A0I(drmInitData.A02(str)));
    }

    public final void A07(C0467Cj c0467Cj, CU cu) {
        this.A05 = (C0467Cj) AbstractC0576Hf.A01(c0467Cj);
        this.A04 = (CU) AbstractC0576Hf.A01(cu);
        this.A06.A69(c0467Cj.A07);
        A04();
    }

    public final boolean A08() {
        this.A01++;
        this.A00++;
        if (this.A00 != this.A07.A0E[this.A02]) {
            return true;
        }
        this.A02++;
        this.A00 = 0;
        return false;
    }
}
