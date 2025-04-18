package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Wj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0961Wj implements InterfaceC0592Hv {
    public static String[] A05 = {"FTSoQUV14LrBCysGNfyNvfqDH1zy4Xlu", "idZtcBMWKPNqKmB4YuvKnZ9J5oClLNYc", "LQ9P31iW1MflfKVPE8yHkhkiIRx8xl24", "rHIFlyKhXEN0aoZxnSfUJTcS8KA", "X5AboSvo1IhWMpgLhiETlyUxrei9zgpK", "UidF5BSHaS3AY9Xa6cN0GZBAou3", "crEFk57nnaqZZzeaZadhB7pPRF0tSKDp", "vzSLCHVnsSnEI3ULYCW3Ix9KGKahHE6s"};
    public long A00;
    public long A01;
    public A2 A02 = A2.A05;
    public boolean A03;
    public final InterfaceC0579Hi A04;

    public C0961Wj(InterfaceC0579Hi interfaceC0579Hi) {
        this.A04 = interfaceC0579Hi;
    }

    public final void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A5p();
            this.A03 = true;
        }
    }

    public final void A01() {
        if (this.A03) {
            A02(A88());
            String[] strArr = A05;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[3] = "HsFOpdsYzvsCYFETv6neExoACX9";
            strArr2[5] = "q9WJPS0TOrPcuvXJ0JdfmweeOfr";
            this.A03 = false;
        }
    }

    public final void A02(long j2) {
        this.A01 = j2;
        if (this.A03) {
            this.A00 = this.A04.A5p();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0592Hv
    public final A2 A85() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0592Hv
    public final long A88() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long A5p = this.A04.A5p();
            String[] strArr = A05;
            if (strArr[4].charAt(22) != strArr[7].charAt(22)) {
                A05[2] = "W4AB9kX6nQAtCIFkSliOwSWqBfwlRuFp";
                long positionUs = this.A00;
                long j2 = A5p - positionUs;
                if (this.A02.A01 == 1.0f) {
                    long A00 = AbstractC03849b.A00(j2);
                    String[] strArr2 = A05;
                    if (strArr2[4].charAt(22) != strArr2[7].charAt(22)) {
                        String[] strArr3 = A05;
                        strArr3[6] = "WGmVHEEDN9tp9RNfsq2N8TcUrFizj2Aj";
                        strArr3[0] = "F6FzT3Uj5KsGZJBmajlciX3TBepBTDoH";
                        return elapsedSinceBaseMs + A00;
                    }
                } else {
                    A2 a2 = this.A02;
                    if (A05[2].charAt(9) == '8') {
                        long positionUs2 = a2.A00(j2);
                        return elapsedSinceBaseMs + positionUs2;
                    }
                    String[] strArr4 = A05;
                    strArr4[4] = "dKMdYOTDZseZlVx05Wn1bVYEVd2S8aN3";
                    strArr4[7] = "yf4c2ua2Tfc1Hpd1iDrbnRZj0K3dC2iJ";
                    long positionUs3 = a2.A00(j2);
                    return elapsedSinceBaseMs + positionUs3;
                }
            }
            throw new RuntimeException();
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0592Hv
    public final A2 AGa(A2 a2) {
        if (this.A03) {
            A02(A88());
        }
        this.A02 = a2;
        return a2;
    }
}
