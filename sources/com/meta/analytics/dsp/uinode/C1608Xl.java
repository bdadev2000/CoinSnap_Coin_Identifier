package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Xl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1608Xl implements C4 {
    @Override // com.meta.analytics.dsp.uinode.C4
    public final void A5n(Format format) {
    }

    @Override // com.meta.analytics.dsp.uinode.C4
    public final int AFQ(InterfaceC1075Bt interfaceC1075Bt, int i9, boolean z8) throws IOException, InterruptedException {
        int AGM = interfaceC1075Bt.AGM(i9);
        if (AGM == -1) {
            if (z8) {
                return -1;
            }
            throw new EOFException();
        }
        return AGM;
    }

    @Override // com.meta.analytics.dsp.uinode.C4
    public final void AFR(C1217Hz c1217Hz, int i9) {
        c1217Hz.A0Z(i9);
    }

    @Override // com.meta.analytics.dsp.uinode.C4
    public final void AFS(long j7, int i9, int i10, int i11, C3 c32) {
    }
}
