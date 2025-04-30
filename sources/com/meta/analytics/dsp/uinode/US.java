package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class US extends AbstractC09074t {
    public static String[] A01 = {"8Yn2PgyedH1iX", "R67HljoZMbsPm0e6EtybvG", "", "R8Pp2uuVTku92bGxcvFWCvwfHASfPd1y", "2y5E80sPhAjkTDK", "Itturke", "abRBLy2wdT4xlnoMDCf2vtSzdY3x1mV2", "QG421Xj1ReSIzqeVHucrcoJTP843GzsJ"};
    public final /* synthetic */ C08803r A00;

    public US(C08803r c08803r) {
        this.A00 = c08803r;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC09074t
    public final void A0L(C1119Eb c1119Eb, int i9) {
        int scrollPosition;
        super.A0L(c1119Eb, i9);
        C1662Zo linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager == null || (scrollPosition = linearLayoutManager.A23()) < 0 || this.A00.getAdapter() == null || scrollPosition >= this.A00.getAdapter().A0E()) {
            return;
        }
        MJ mj = (MJ) c1119Eb.A1F(scrollPosition);
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
