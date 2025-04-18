package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class VH implements InterfaceC0782Nh {
    public static String[] A01 = {"PnhhxO44eyGR", "6RYeLXmAClA1SiGKn201px", "WqNcg2MFF", "kFMGwY5yNNV", "mQRpAL1oxGJgw", "Eqf6jMIzeI3tCjJb", "9imsVe3tjkVzhTosgYrmf1lKW7QE2MSM", "NRYl8cTHkwcGHXULnCD2cakkWnkUWd4e"};
    public final /* synthetic */ VE A00;

    public VH(VE ve2) {
        this.A00 = ve2;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0782Nh
    public final void ABh(boolean z10) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        JK jk;
        JK jk2;
        atomicBoolean = this.A00.A0D;
        atomicBoolean.set(z10);
        atomicBoolean2 = this.A00.A0E;
        if (atomicBoolean2.get()) {
            jk = this.A00.A02;
            if (jk != null) {
                VE ve2 = this.A00;
                String[] strArr = A01;
                if (strArr[5].length() == strArr[3].length()) {
                    throw new RuntimeException();
                }
                A01[2] = "moHDWw2Q1";
                jk2 = ve2.A02;
                jk2.ACX(z10);
            }
        }
    }
}
