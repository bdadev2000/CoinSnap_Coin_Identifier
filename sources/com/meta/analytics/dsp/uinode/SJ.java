package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class SJ implements InterfaceC1448Rd {
    public static String[] A01 = {"uB1RC", "E7rLPB8klTW5J9FjuULp7NzB4AWE19Zm", "BGfRoGqubHgomR1aknLAm7BQoVqY9Rjo", "2aqRDajB7mkFiu8JUeuEjEkcXKsGj4gd", "YPIu8FWl8tmTV", "O2dNNTCX3dr0fdBVB7HhwqWACslxe6aK", "WKmspm9NaQlidgYEldSczPSkp8W1cJlS", "CDbKVWoo3Luj5aOlcVCk0HC1kDrFWNgV"};
    public final /* synthetic */ Q7 A00;

    public SJ(Q7 q72) {
        this.A00 = q72;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1448Rd
    public final void AEA() {
        MC mc;
        MC mc2;
        InterfaceC1324Mj interfaceC1324Mj;
        mc = this.A00.A02;
        if (mc != null) {
            Q7 q72 = this.A00;
            if (A01[3].charAt(8) == 'm') {
                throw new RuntimeException();
            }
            A01[3] = "G62o5XZ8JRlbj2NUyH9KkdSeUCUXeXTA";
            mc2 = q72.A02;
            interfaceC1324Mj = this.A00.A03;
            mc2.A43(interfaceC1324Mj.A7w());
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1448Rd
    public final void AEC(C1450Rf c1450Rf) {
        MC mc;
        MC mc2;
        InterfaceC1324Mj interfaceC1324Mj;
        MC mc3;
        InterfaceC1324Mj interfaceC1324Mj2;
        mc = this.A00.A02;
        if (mc == null) {
            return;
        }
        if (c1450Rf == null || !c1450Rf.A00()) {
            mc2 = this.A00.A02;
            interfaceC1324Mj = this.A00.A03;
            mc2.A43(interfaceC1324Mj.A7w());
            return;
        }
        mc3 = this.A00.A02;
        Q7 q72 = this.A00;
        if (A01[5].length() == 14) {
            throw new RuntimeException();
        }
        A01[1] = "MYgqySdSEunU6EGhIZ8lv2VKjJmAUpiH";
        interfaceC1324Mj2 = q72.A03;
        mc3.A43(interfaceC1324Mj2.A7x());
    }
}
