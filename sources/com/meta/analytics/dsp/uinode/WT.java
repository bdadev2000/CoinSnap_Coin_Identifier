package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class WT implements H8 {
    public static String[] A0C = {"G7jWD6ulf4YNSZyKFTHtDKYEexnehBFD", "eAcypqsPfTTSG9tYkNPVa4Ur1OSgM6nM", "x", "tNQG44GENbPBCr6MlCIr3t4n4NF0MmxZ", "OwErIGDXAeY1H11Nt9UmuNZTMubue4sT", "f", "eBkibdjxFKT4WmP6H51EPZ9055c0bCkp", "0Ce9TygyYiJS1KV85oyrWWiGz76nCu"};
    public long A00;
    public long A02;
    public C1191Gy A03;
    public final Uri A05;
    public final C1128Ek A07;
    public final InterfaceC1187Gu A08;
    public final C1198Hg A09;
    public volatile boolean A0A;
    public final /* synthetic */ CD A0B;
    public final C1079Bz A06 = new C1079Bz();
    public boolean A04 = true;
    public long A01 = -1;

    public WT(CD cd, Uri uri, InterfaceC1187Gu interfaceC1187Gu, C1128Ek c1128Ek, C1198Hg c1198Hg) {
        this.A0B = cd;
        this.A05 = (Uri) AbstractC1192Ha.A01(uri);
        this.A08 = (InterfaceC1187Gu) AbstractC1192Ha.A01(interfaceC1187Gu);
        this.A07 = (C1128Ek) AbstractC1192Ha.A01(c1128Ek);
        this.A09 = c1198Hg;
    }

    public final void A04(long j7, long j9) {
        this.A06.A00 = j7;
        this.A02 = j9;
        this.A04 = true;
    }

    @Override // com.meta.analytics.dsp.uinode.H8
    public final void A4A() {
        this.A0A = true;
    }

    @Override // com.meta.analytics.dsp.uinode.H8
    public final void A9P() throws IOException, InterruptedException {
        char charAt;
        char charAt2;
        C1610Xn c1610Xn;
        int result = 0;
        while (result == 0 && !this.A0A) {
            try {
                long j7 = this.A06.A00;
                C1191Gy c1191Gy = new C1191Gy(this.A05, j7, -1L, CD.A08(this.A0B));
                this.A03 = c1191Gy;
                long ADl = this.A08.ADl(c1191Gy);
                this.A01 = ADl;
                if (ADl != -1) {
                    this.A01 = ADl + j7;
                }
                c1610Xn = new C1610Xn(this.A08, j7, this.A01);
                InterfaceC1074Bs extractor = this.A07.A02(c1610Xn, this.A08.A8E());
                if (this.A04) {
                    extractor.AFh(j7, this.A02);
                    this.A04 = false;
                }
                while (result == 0 && !this.A0A) {
                    this.A09.A00();
                    result = extractor.AEH(c1610Xn, this.A06);
                    if (c1610Xn.A7i() > CD.A03(this.A0B) + j7) {
                        j7 = c1610Xn.A7i();
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
                C1079Bz c1079Bz = this.A06;
                if (A0C[7].length() == 32) {
                    throw new RuntimeException();
                }
                A0C[7] = "RP5F3MQdpmYGlMxTR22UmyqYUd";
                c1079Bz.A00 = c1610Xn.A7i();
                this.A00 = this.A06.A00 - this.A03.A01;
            }
            IF.A0W(this.A08);
        }
    }
}
