package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class C2 {
    public final I4 A00 = new I4(10);

    public final Metadata A00(InterfaceC0456By interfaceC0456By, InterfaceC0496Dn interfaceC0496Dn) throws IOException, InterruptedException {
        int tagLength = 0;
        Metadata metadata = null;
        while (true) {
            try {
                interfaceC0456By.AEO(this.A00.A00, 0, 10);
                this.A00.A0Y(0);
                int A0G = this.A00.A0G();
                int peekedId3Bytes = C0984Xi.A03;
                if (A0G != peekedId3Bytes) {
                    break;
                }
                this.A00.A0Z(3);
                int A0D = this.A00.A0D();
                int framesLength = A0D + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[framesLength];
                    System.arraycopy(this.A00.A00, 0, bArr, 0, 10);
                    interfaceC0456By.AEO(bArr, 10, A0D);
                    metadata = new C0984Xi(interfaceC0496Dn).A0O(bArr, framesLength);
                } else {
                    interfaceC0456By.A3s(A0D);
                }
                tagLength += framesLength;
            } catch (EOFException unused) {
            }
        }
        interfaceC0456By.AFq();
        interfaceC0456By.A3s(tagLength);
        return metadata;
    }
}
