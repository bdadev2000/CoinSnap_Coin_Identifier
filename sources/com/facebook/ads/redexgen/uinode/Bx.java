package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class Bx {
    public static String[] A01 = {"jIa5nEsghJXI3YtRygMiM4nRYP", "Ly9ufvl5ownJqyYsGEEXhuulkxQO72eL", "sMPtg", "IfecpjktAKGmFhJKDBvdKsFSs", "x3OFnvvirXrPXrYRolaRsAtReKUP", "t7Io5cjMF1OaMgplIhuUmJuHh", "FmC7xp59Mv4zEWANQ3dHM2IzVgPFt2kt", "Z77KJEO3n3QLGnllHMFWIwXSkpKCnreC"};
    public final C0651Hz A00 = new C0651Hz(10);

    public final Metadata A00(InterfaceC0509Bt interfaceC0509Bt, InterfaceC0541Di interfaceC0541Di) throws IOException, InterruptedException {
        int tagLength = 0;
        Metadata metadata = null;
        while (true) {
            try {
                interfaceC0509Bt.ADv(this.A00.A00, 0, 10);
                this.A00.A0Y(0);
                int A0G = this.A00.A0G();
                int peekedId3Bytes = C1009Wd.A03;
                if (A0G != peekedId3Bytes) {
                    break;
                }
                this.A00.A0Z(3);
                int A0D = this.A00.A0D();
                int framesLength = A0D + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[framesLength];
                    System.arraycopy(this.A00.A00, 0, bArr, 0, 10);
                    interfaceC0509Bt.ADv(bArr, 10, A0D);
                    metadata = new C1009Wd(interfaceC0541Di).A0O(bArr, framesLength);
                } else {
                    interfaceC0509Bt.A3W(A0D);
                }
                tagLength += framesLength;
            } catch (EOFException unused) {
            }
        }
        interfaceC0509Bt.AFM();
        interfaceC0509Bt.A3W(tagLength);
        if (A01[1].charAt(2) != '9') {
            throw new RuntimeException();
        }
        A01[6] = "WrSJC1Ub8dr1CYR3Oq5fRcEdvzu2UCyy";
        return metadata;
    }
}
