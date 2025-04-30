package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* loaded from: assets/audience_network.dex */
public final class X9 implements InterfaceC1100Cy {
    public static String[] A0C = {"jvuSXyRxFwWN5M53JxqXTqjBlHPmO5yS", "Nx6fwt5mIYqSRgPxQoB61NXpIqViXreb", "NbRu72XFqCPxMxVeHFzrnyrjREaihhdr", "Z3KBXmMomO9rJfjLZz1JQz2Kw0Fx28Ab", "zLbRIBf4nYWkQfyOEtwQDAQMGMEl8", "zvpubyWaUoinARhzufpjCqD1DbWF7ekR", "kxIGpaDKqbCPDUN5La7nQCmFVSx", "CqFgkkKKOYx1Bj1EdbgCjsaN4ksOOdQn"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Format A05;
    public C4 A06;
    public String A07;
    public boolean A08;
    public final C1216Hy A09;
    public final C1217Hz A0A;
    public final String A0B;

    public X9() {
        this(null);
    }

    public X9(String str) {
        C1216Hy c1216Hy = new C1216Hy(new byte[128]);
        this.A09 = c1216Hy;
        this.A0A = new C1217Hz(c1216Hy.A00);
        this.A02 = 0;
        this.A0B = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r2.A05 == r14.A05.A0O) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A00() {
        /*
            r14 = this;
            com.facebook.ads.redexgen.X.Hy r1 = r14.A09
            r0 = 0
            r1.A07(r0)
            com.facebook.ads.redexgen.X.Hy r0 = r14.A09
            com.facebook.ads.redexgen.X.AP r2 = com.meta.analytics.dsp.uinode.AQ.A09(r0)
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r14.A05
            if (r0 == 0) goto L47
            int r1 = r2.A00
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r14.A05
            int r0 = r0.A05
            if (r1 != r0) goto L47
            int r5 = r2.A03
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r14.A05
            int r4 = r0.A0C
            java.lang.String[] r1 = com.meta.analytics.dsp.uinode.X9.A0C
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 27
            if (r1 == r0) goto L31
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L31:
            java.lang.String[] r3 = com.meta.analytics.dsp.uinode.X9.A0C
            java.lang.String r1 = "rmTuGOWOeoxLIH1QLptnusvxizN1V0jV"
            r0 = 2
            r3[r0] = r1
            java.lang.String r1 = "2RMufqWRuZFq3WutxyrHt00cbPeHqbYj"
            r0 = 5
            r3[r0] = r1
            if (r5 != r4) goto L47
            java.lang.String r1 = r2.A05
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r14.A05
            java.lang.String r0 = r0.A0O
            if (r1 == r0) goto L62
        L47:
            java.lang.String r3 = r14.A07
            java.lang.String r4 = r2.A05
            r5 = 0
            r6 = -1
            r7 = -1
            int r8 = r2.A00
            int r9 = r2.A03
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.String r13 = r14.A0B
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r1 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.A05 = r1
            com.facebook.ads.redexgen.X.C4 r0 = r14.A06
            r0.A5n(r1)
        L62:
            int r0 = r2.A01
            r14.A01 = r0
            int r0 = r2.A02
            long r2 = (long) r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r14.A05
            int r0 = r0.A0C
            long r0 = (long) r0
            long r2 = r2 / r0
            r14.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.X9.A00():void");
    }

    private boolean A01(C1217Hz c1217Hz) {
        while (true) {
            if (c1217Hz.A04() <= 0) {
                return false;
            }
            if (!this.A08) {
                this.A08 = c1217Hz.A0E() == 11;
            } else {
                int A0E = c1217Hz.A0E();
                if (A0E == 119) {
                    this.A08 = false;
                    return true;
                }
                this.A08 = A0E == 11;
            }
        }
    }

    private boolean A02(C1217Hz c1217Hz, byte[] bArr, int i9) {
        int min = Math.min(c1217Hz.A04(), i9 - this.A00);
        int bytesToRead = this.A00;
        c1217Hz.A0c(bArr, bytesToRead, min);
        int bytesToRead2 = this.A00;
        int bytesToRead3 = bytesToRead2 + min;
        this.A00 = bytesToRead3;
        return bytesToRead3 == i9;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void A4R(C1217Hz c1217Hz) {
        while (true) {
            int A04 = c1217Hz.A04();
            if (A0C[3].charAt(28) != '2') {
                throw new RuntimeException();
            }
            A0C[6] = "j4ZJ9Sb1FxDogpbJuhr4W7MrwTg";
            if (A04 > 0) {
                switch (this.A02) {
                    case 0:
                        if (!A01(c1217Hz)) {
                            break;
                        } else {
                            this.A02 = 1;
                            this.A0A.A00[0] = Ascii.VT;
                            byte[] bArr = this.A0A.A00;
                            String[] strArr = A0C;
                            if (strArr[0].charAt(28) != strArr[7].charAt(28)) {
                                bArr[1] = 119;
                                this.A00 = 2;
                                break;
                            } else {
                                A0C[4] = "thGmrgzi8Rkjtt3yqKW2WPJBde0Fj";
                                bArr[1] = 119;
                                this.A00 = 2;
                                break;
                            }
                        }
                    case 1:
                        if (!A02(c1217Hz, this.A0A.A00, 128)) {
                            break;
                        } else {
                            A00();
                            this.A0A.A0Y(0);
                            this.A06.AFR(this.A0A, 128);
                            this.A02 = 2;
                            break;
                        }
                    case 2:
                        int min = Math.min(c1217Hz.A04(), this.A01 - this.A00);
                        this.A06.AFR(c1217Hz, min);
                        int bytesToRead = this.A00 + min;
                        this.A00 = bytesToRead;
                        int i9 = this.A01;
                        if (bytesToRead != i9) {
                            break;
                        } else {
                            this.A06.AFS(this.A04, 1, i9, 0, null);
                            this.A04 += this.A03;
                            this.A02 = 0;
                            break;
                        }
                }
            } else {
                return;
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void A4p(InterfaceC1076Bu interfaceC1076Bu, DC dc) {
        dc.A05();
        this.A07 = dc.A04();
        this.A06 = interfaceC1076Bu.AGi(dc.A03(), 1);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void ADs() {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void ADt(long j7, boolean z8) {
        this.A04 = j7;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1100Cy
    public final void AFg() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
    }
}
