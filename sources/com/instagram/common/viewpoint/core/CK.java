package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class CK {
    public static String[] A06 = {"ASrRCYsKepDTUmzFsC2sW3QzilFSgfPw", "pk2aHy5Gwagx08DT23n03plQM468sRYy", "xOM6LRz9nNuHtWN", "TvyhqxunvhStLR7Kd", "aVtXkPwucpWHbVIgTuViY5Suu", "ZnIfrZLnsjfgp1sFLfOTBH8y8Mk5lEFn", "0lbnIxGi57zCIaJmDAHnbRN3bazOyET0", "5wZWnu4zbKghJljNFYmlUiyghG2Nmbcr"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public boolean A04;
    public final byte[] A05 = new byte[10];

    public final void A00() {
        this.A04 = false;
    }

    public final void A01(InterfaceC0456By interfaceC0456By, int i2, int i3) throws IOException, InterruptedException {
        if (!this.A04) {
            interfaceC0456By.AEO(this.A05, 0, 10);
            interfaceC0456By.AFq();
            if (AV.A06(this.A05) == -1) {
                return;
            }
            this.A04 = true;
            if (A06[4].length() != 25) {
                throw new RuntimeException();
            }
            A06[3] = "JjREElMDljsf0pPk3";
            this.A02 = 0;
        }
        if (this.A02 == 0) {
            this.A00 = i2;
            this.A01 = 0;
        }
        this.A01 += i3;
    }

    public final void A02(CJ cj) {
        if (this.A04) {
            int i2 = this.A02;
            if (A06[3].length() != 17) {
                throw new RuntimeException();
            }
            A06[3] = "G4r0EfytzI47OGcaJ";
            if (i2 > 0) {
                cj.A0W.AFw(this.A03, this.A00, this.A01, 0, cj.A0V);
                this.A02 = 0;
            }
        }
    }

    public final void A03(CJ cj, long j2) {
        if (!this.A04) {
            return;
        }
        int i2 = this.A02;
        this.A02 = i2 + 1;
        if (i2 == 0) {
            this.A03 = j2;
        }
        if (this.A02 < 16) {
            return;
        }
        cj.A0W.AFw(this.A03, this.A00, this.A01, 0, cj.A0V);
        this.A02 = 0;
    }
}
