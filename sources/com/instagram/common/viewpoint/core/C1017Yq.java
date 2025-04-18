package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Yq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1017Yq implements C9 {
    @Override // com.instagram.common.viewpoint.core.C9
    public final void A69(Format format) {
    }

    @Override // com.instagram.common.viewpoint.core.C9
    public final int AFu(InterfaceC0456By interfaceC0456By, int i2, boolean z2) throws IOException, InterruptedException {
        int AGn = interfaceC0456By.AGn(i2);
        if (AGn == -1) {
            if (z2) {
                return -1;
            }
            throw new EOFException();
        }
        return AGn;
    }

    @Override // com.instagram.common.viewpoint.core.C9
    public final void AFv(I4 i4, int i2) {
        i4.A0Z(i2);
    }

    @Override // com.instagram.common.viewpoint.core.C9
    public final void AFw(long j2, int i2, int i3, int i4, C8 c8) {
    }
}
