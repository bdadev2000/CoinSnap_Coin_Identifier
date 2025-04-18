package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Xl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1042Xl implements C4 {
    @Override // com.facebook.ads.redexgen.uinode.C4
    public final void A5n(Format format) {
    }

    @Override // com.facebook.ads.redexgen.uinode.C4
    public final int AFQ(InterfaceC0509Bt interfaceC0509Bt, int i10, boolean z10) throws IOException, InterruptedException {
        int AGM = interfaceC0509Bt.AGM(i10);
        if (AGM == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return AGM;
    }

    @Override // com.facebook.ads.redexgen.uinode.C4
    public final void AFR(C0651Hz c0651Hz, int i10) {
        c0651Hz.A0Z(i10);
    }

    @Override // com.facebook.ads.redexgen.uinode.C4
    public final void AFS(long j3, int i10, int i11, int i12, C3 c32) {
    }
}
