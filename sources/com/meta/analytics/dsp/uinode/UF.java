package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UF implements L8 {
    public static byte[] A01;
    public static String[] A02 = {"XQ6pDaA1rZEM", "XoeGOYiSv0w2M1U1qXC2kK0WxpTFbq6C", "goNPtYs5sZFfNSJyOgs171oDuCl7t69H", "IBRmsKraW8ihcuaNuynFKjmRlH", "udOMyB", "k9bLdXox5SSCuqwZoRmzAy5kJm", "rLCACxpviKCtWgunDsmekf59Ef0kXw8R", "IiDilnQTvcIperbA6lCpmy3utrrmGEhT"};
    public final /* synthetic */ UD A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-32, -8, -22, -24, -8, -30};
    }

    static {
        A01();
    }

    public UF(UD ud) {
        this.A00 = ud;
    }

    public /* synthetic */ UF(UD ud, UK uk) {
        this(ud);
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        boolean z8;
        boolean A0V;
        this.A00.A0W.setToolbarActionMessage(A00(0, 0, 7));
        this.A00.A0I();
        z8 = this.A00.A0U;
        if (z8) {
            A0V = this.A00.A0V();
            if (A0V) {
                this.A00.A0W.setToolbarActionMode(1);
                return;
            }
        }
        this.A00.A0W.setToolbarActionMode(0);
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f9) {
        boolean z8;
        C08131c c08131c;
        boolean z9;
        AbstractC1739b5 abstractC1739b5;
        float A03;
        AbstractC1739b5 abstractC1739b52;
        AbstractC1739b5 abstractC1739b53;
        boolean z10;
        AbstractC1739b5 abstractC1739b54;
        boolean z11;
        AbstractC1739b5 abstractC1739b55;
        this.A00.A0O((int) f9);
        z8 = this.A00.A0V;
        if (!z8) {
            c08131c = this.A00.A0G;
            this.A00.A0W.setProgress(100.0f * (1.0f - (f9 / c08131c.A07())));
            return;
        }
        z9 = this.A00.A0B;
        if (z9) {
            abstractC1739b54 = this.A00.A0F;
            A03 = 1.0f - (f9 / abstractC1739b54.A0x().A0D().A02());
            z11 = this.A00.A0E;
            if (z11 || A03 < 1.0f) {
                this.A00.A0E = false;
                abstractC1739b55 = this.A00.A0F;
                String A022 = abstractC1739b55.A11().A02();
                String[] strArr = A02;
                if (strArr[1].charAt(20) != strArr[6].charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "16sMGD3KF8iI";
                strArr2[5] = "yItCOMUcMHVXea4ql8lykvs7qx";
                this.A00.A0W.setToolbarActionMessage(A022.replace(A00(0, 6, 65), String.valueOf((int) f9)));
            } else {
                this.A00.A0E = true;
                this.A00.A0W.setToolbarActionMessage(A00(0, 0, 7));
            }
        } else {
            abstractC1739b5 = this.A00.A0F;
            A03 = 1.0f - (f9 / abstractC1739b5.A0x().A0D().A03());
        }
        this.A00.A0W.setProgress(100.0f * A03);
        abstractC1739b52 = this.A00.A0F;
        float A023 = abstractC1739b52.A0x().A0D().A02() - f9;
        abstractC1739b53 = this.A00.A0F;
        float percentageOfReward = abstractC1739b53.A0x().A0D().A03();
        boolean z12 = A023 >= percentageOfReward;
        z10 = this.A00.A0E;
        if (!z10 && z12) {
            this.A00.A0W.setToolbarActionMode(1);
        }
    }
}
