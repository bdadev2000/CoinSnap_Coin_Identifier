package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class TY implements NS {
    public static byte[] A01;
    public static String[] A02 = {"BdhBL09M4Kf5pZVFq3hu", "RvApnOP5TrfSVKNiPYUqrJes", "fe7XFV8kXqba2R6pM5eLN8KkTFIqEiwl", "blbqgiQJp6cs", "NwOGI73VJjSa3U5NpZL78Ksqq7LFe", "B8ngslNEnR5wDlhREJljtiUu", "QAhn6ShnFRB2OsCPxSM", "0DHDykPyyqwhMMlodysb3VmSPsGurPgY"};
    public final /* synthetic */ TT A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{76, 74, 92, 75, 102, 87, 88, 79, 80, 94, 88, 77, 80, 86, 87, 102, 80, 88, 91};
    }

    static {
        A01();
    }

    public TY(TT tt) {
        this.A00 = tt;
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACT(String str) {
        NK nk;
        NK nk2;
        AbstractC1739b5 abstractC1739b5;
        U1 u12;
        AbstractC1739b5 abstractC1739b52;
        U1 u13;
        this.A00.A0U = false;
        nk = this.A00.A0I;
        nk.setProgress(100);
        nk2 = this.A00.A0I;
        AbstractC1303Lo.A0N(nk2, 8);
        abstractC1739b5 = this.A00.A0G;
        if (abstractC1739b5.A0n()) {
            u12 = this.A00.A0J;
            if (u12 != null) {
                abstractC1739b52 = this.A00.A0G;
                String A0R = abstractC1739b52.A0R();
                if (!TextUtils.isEmpty(A0R)) {
                    u13 = this.A00.A0J;
                    u13.loadUrl(A0R);
                }
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACV(String str) {
        NK nk;
        NJ nj;
        boolean z8;
        int i9;
        this.A00.A0U = true;
        nk = this.A00.A0I;
        AbstractC1303Lo.A0N(nk, 0);
        nj = this.A00.A0H;
        nj.setUrl(str);
        z8 = this.A00.A0T;
        if (!z8) {
            i9 = this.A00.A01;
            if (i9 > 1) {
                this.A00.A0T = true;
                this.A00.A0f(A00(0, 19, 51));
            }
        }
        TT.A03(this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACn(int i9) {
        boolean z8;
        NK nk;
        z8 = this.A00.A0U;
        if (z8) {
            nk = this.A00.A0I;
            String[] strArr = A02;
            if (strArr[6].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "QY4HeEjZ5INYif1SeRyocKWTC9N0iQjQ";
            strArr2[7] = "IhWprrJJT2Yl4c8tLv2o4taD3peu2qkx";
            nk.setProgress(i9);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACq(String str) {
        NJ nj;
        nj = this.A00.A0H;
        nj.setTitle(str);
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACs() {
        OP op;
        op = this.A00.A0L;
        op.A09().AB0(14);
    }
}
