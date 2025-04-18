package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class WT implements H8 {
    public static String[] A0C = {"G7jWD6ulf4YNSZyKFTHtDKYEexnehBFD", "eAcypqsPfTTSG9tYkNPVa4Ur1OSgM6nM", "x", "tNQG44GENbPBCr6MlCIr3t4n4NF0MmxZ", "OwErIGDXAeY1H11Nt9UmuNZTMubue4sT", "f", "eBkibdjxFKT4WmP6H51EPZ9055c0bCkp", "0Ce9TygyYiJS1KV85oyrWWiGz76nCu"};
    public long A00;
    public long A02;
    public C0625Gy A03;
    public final Uri A05;
    public final C0562Ek A07;
    public final InterfaceC0621Gu A08;
    public final C0632Hg A09;
    public volatile boolean A0A;
    public final /* synthetic */ CD A0B;
    public final C0513Bz A06 = new C0513Bz();
    public boolean A04 = true;
    public long A01 = -1;

    public WT(CD cd2, Uri uri, InterfaceC0621Gu interfaceC0621Gu, C0562Ek c0562Ek, C0632Hg c0632Hg) {
        this.A0B = cd2;
        this.A05 = (Uri) AbstractC0626Ha.A01(uri);
        this.A08 = (InterfaceC0621Gu) AbstractC0626Ha.A01(interfaceC0621Gu);
        this.A07 = (C0562Ek) AbstractC0626Ha.A01(c0562Ek);
        this.A09 = c0632Hg;
    }

    public final void A04(long j3, long j10) {
        this.A06.A00 = j3;
        this.A02 = j10;
        this.A04 = true;
    }

    @Override // com.facebook.ads.redexgen.uinode.H8
    public final void A4A() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.uinode.H8
    public final void A9P() throws IOException, InterruptedException {
        char charAt;
        char charAt2;
        C1044Xn c1044Xn;
        int result = 0;
        while (result == 0 && !this.A0A) {
            try {
                long j3 = this.A06.A00;
                C0625Gy c0625Gy = new C0625Gy(this.A05, j3, -1L, CD.A08(this.A0B));
                this.A03 = c0625Gy;
                long ADl = this.A08.ADl(c0625Gy);
                this.A01 = ADl;
                if (ADl != -1) {
                    this.A01 = ADl + j3;
                }
                c1044Xn = new C1044Xn(this.A08, j3, this.A01);
                InterfaceC0508Bs extractor = this.A07.A02(c1044Xn, this.A08.A8E());
                if (this.A04) {
                    extractor.AFh(j3, this.A02);
                    this.A04 = false;
                }
                while (result == 0 && !this.A0A) {
                    this.A09.A00();
                    result = extractor.AEH(c1044Xn, this.A06);
                    if (c1044Xn.A7i() > CD.A03(this.A0B) + j3) {
                        j3 = c1044Xn.A7i();
                        this.A09.A01();
                        CD.A04(this.A0B).post(CD.A06(this.A0B));
                    }
                }
            } finally {
                if (charAt != charAt2) {
                }
                throw new RuntimeException();
            }
            if (result == 1) {
                result = 0;
            } else {
                C0513Bz c0513Bz = this.A06;
                if (A0C[7].length() == 32) {
                    throw new RuntimeException();
                }
                A0C[7] = "RP5F3MQdpmYGlMxTR22UmyqYUd";
                c0513Bz.A00 = c1044Xn.A7i();
                this.A00 = this.A06.A00 - this.A03.A01;
            }
            IF.A0W(this.A08);
        }
    }
}
