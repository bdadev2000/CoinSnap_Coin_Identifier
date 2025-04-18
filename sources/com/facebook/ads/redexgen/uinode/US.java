package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class US extends AbstractC03414t {
    public static String[] A01 = {"8Yn2PgyedH1iX", "R67HljoZMbsPm0e6EtybvG", "", "R8Pp2uuVTku92bGxcvFWCvwfHASfPd1y", "2y5E80sPhAjkTDK", "Itturke", "abRBLy2wdT4xlnoMDCf2vtSzdY3x1mV2", "QG421Xj1ReSIzqeVHucrcoJTP843GzsJ"};
    public final /* synthetic */ C03143r A00;

    public US(C03143r c03143r) {
        this.A00 = c03143r;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC03414t
    public final void A0L(C0553Eb c0553Eb, int i10) {
        int scrollPosition;
        super.A0L(c0553Eb, i10);
        C1096Zo linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager == null || (scrollPosition = linearLayoutManager.A23()) < 0 || this.A00.getAdapter() == null || scrollPosition >= this.A00.getAdapter().A0E()) {
            return;
        }
        MJ mj = (MJ) c0553Eb.A1F(scrollPosition);
        if (A01[1].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "EBOsosi";
        strArr[2] = "";
        if (mj == null) {
            return;
        }
        mj.AFr();
    }
}
