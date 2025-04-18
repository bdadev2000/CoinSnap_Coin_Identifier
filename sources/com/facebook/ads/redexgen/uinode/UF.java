package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UF implements L8 {
    public static byte[] A01;
    public static String[] A02 = {"XQ6pDaA1rZEM", "XoeGOYiSv0w2M1U1qXC2kK0WxpTFbq6C", "goNPtYs5sZFfNSJyOgs171oDuCl7t69H", "IBRmsKraW8ihcuaNuynFKjmRlH", "udOMyB", "k9bLdXox5SSCuqwZoRmzAy5kJm", "rLCACxpviKCtWgunDsmekf59Ef0kXw8R", "IiDilnQTvcIperbA6lCpmy3utrrmGEhT"};
    public final /* synthetic */ UD A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-32, -8, -22, -24, -8, -30};
    }

    static {
        A01();
    }

    public UF(UD ud2) {
        this.A00 = ud2;
    }

    public /* synthetic */ UF(UD ud2, UK uk) {
        this(ud2);
    }

    @Override // com.facebook.ads.redexgen.uinode.L8
    public final void ABA() {
        boolean z10;
        boolean A0V;
        this.A00.A0W.setToolbarActionMessage(A00(0, 0, 7));
        this.A00.A0I();
        z10 = this.A00.A0U;
        if (z10) {
            A0V = this.A00.A0V();
            if (A0V) {
                this.A00.A0W.setToolbarActionMode(1);
                return;
            }
        }
        this.A00.A0W.setToolbarActionMode(0);
    }

    @Override // com.facebook.ads.redexgen.uinode.L8
    public final void ACm(float f10) {
        boolean z10;
        C02471c c02471c;
        boolean z11;
        AbstractC1173b5 abstractC1173b5;
        float A03;
        AbstractC1173b5 abstractC1173b52;
        AbstractC1173b5 abstractC1173b53;
        boolean z12;
        AbstractC1173b5 abstractC1173b54;
        boolean z13;
        AbstractC1173b5 abstractC1173b55;
        this.A00.A0O((int) f10);
        z10 = this.A00.A0V;
        if (!z10) {
            c02471c = this.A00.A0G;
            this.A00.A0W.setProgress(100.0f * (1.0f - (f10 / c02471c.A07())));
            return;
        }
        z11 = this.A00.A0B;
        if (z11) {
            abstractC1173b54 = this.A00.A0F;
            A03 = 1.0f - (f10 / abstractC1173b54.A0x().A0D().A02());
            z13 = this.A00.A0E;
            if (z13 || A03 < 1.0f) {
                this.A00.A0E = false;
                abstractC1173b55 = this.A00.A0F;
                String A022 = abstractC1173b55.A11().A02();
                String[] strArr = A02;
                if (strArr[1].charAt(20) != strArr[6].charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "16sMGD3KF8iI";
                strArr2[5] = "yItCOMUcMHVXea4ql8lykvs7qx";
                this.A00.A0W.setToolbarActionMessage(A022.replace(A00(0, 6, 65), String.valueOf((int) f10)));
            } else {
                this.A00.A0E = true;
                this.A00.A0W.setToolbarActionMessage(A00(0, 0, 7));
            }
        } else {
            abstractC1173b5 = this.A00.A0F;
            A03 = 1.0f - (f10 / abstractC1173b5.A0x().A0D().A03());
        }
        this.A00.A0W.setProgress(100.0f * A03);
        abstractC1173b52 = this.A00.A0F;
        float A023 = abstractC1173b52.A0x().A0D().A02() - f10;
        abstractC1173b53 = this.A00.A0F;
        float percentageOfReward = abstractC1173b53.A0x().A0D().A03();
        boolean z14 = A023 >= percentageOfReward;
        z12 = this.A00.A0E;
        if (!z12 && z14) {
            this.A00.A0W.setToolbarActionMode(1);
        }
    }
}
