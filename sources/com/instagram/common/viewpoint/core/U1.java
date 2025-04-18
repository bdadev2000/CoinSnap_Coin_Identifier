package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class U1 implements LG {
    public static String[] A01 = {"", "vSeS2rx23zUd4am5Wdo", "UtlZDzt7", "dNEruPHPdkyj182N7GwirLXq8Db2eecB", "b1VGcsOgsecYYY6uN1zNid8VodysKnsR", "yg", "RqC1uxvv784HDfNbZXUq5U9jCsQW0kUg", "5jFX4DLWV5nBObgEbVC73yk5ncCVY3Kv"};
    public final /* synthetic */ C0409Ab A00;

    public U1(C0409Ab c0409Ab) {
        this.A00 = c0409Ab;
    }

    @Override // com.instagram.common.viewpoint.core.LG
    public final void ABb() {
        Q4 q4;
        int i2;
        Q4 q42;
        q4 = this.A00.A0F;
        i2 = this.A00.A0A;
        q4.ABi(i2);
        q42 = this.A00.A0F;
        q42.ABK();
    }

    @Override // com.instagram.common.viewpoint.core.LG
    public final void ADF(float f2) {
        int i2;
        boolean z2;
        T7 t7;
        int duration;
        boolean z3;
        int i3;
        Q4 q4;
        i2 = this.A00.A0A;
        float f3 = i2 - f2;
        z2 = this.A00.A0V;
        if (z2) {
            duration = 0;
        } else {
            t7 = this.A00.A0I;
            duration = t7.getDuration();
        }
        float f4 = f3 + duration;
        C0409Ab c0409Ab = this.A00;
        if (A01[4].charAt(2) != 'V') {
            throw new RuntimeException();
        }
        A01[7] = "iUY2DHYRiluzyO05ci2O9gzQrrq6c2GK";
        z3 = c0409Ab.A0V;
        if (!z3) {
            i3 = this.A00.A09;
        } else {
            C0409Ab c0409Ab2 = this.A00;
            String[] strArr = A01;
            if (strArr[5].length() != strArr[1].length()) {
                A01[4] = "jZVNpY3PkhFJgbxs6TiKD4bRtw9FJmgD";
                i3 = c0409Ab2.A0A;
            } else {
                throw new RuntimeException();
            }
        }
        float seenTime = i3;
        float f5 = f4 / seenTime;
        q4 = this.A00.A0F;
        q4.AHJ(f5);
    }
}
