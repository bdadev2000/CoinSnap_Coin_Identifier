package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1563Vp implements InterfaceC1187Gu {
    public final int A00;
    public final InterfaceC1187Gu A01;
    public final I3 A02;

    public C1563Vp(InterfaceC1187Gu interfaceC1187Gu, I3 i32, int i9) {
        this.A01 = (InterfaceC1187Gu) AbstractC1192Ha.A01(interfaceC1187Gu);
        this.A02 = (I3) AbstractC1192Ha.A01(i32);
        this.A00 = i9;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final Uri A8E() {
        return this.A01.A8E();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final long ADl(C1191Gy c1191Gy) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ADl(c1191Gy);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final int read(byte[] bArr, int i9, int i10) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i9, i10);
    }
}
