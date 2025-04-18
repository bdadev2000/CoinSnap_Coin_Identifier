package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Wu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0972Wu implements InterfaceC0570Gz {
    public final int A00;
    public final InterfaceC0570Gz A01;
    public final I8 A02;

    public C0972Wu(InterfaceC0570Gz interfaceC0570Gz, I8 i8, int i2) {
        this.A01 = (InterfaceC0570Gz) AbstractC0576Hf.A01(interfaceC0570Gz);
        this.A02 = (I8) AbstractC0576Hf.A01(i8);
        this.A00 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final Uri A8c() {
        return this.A01.A8c();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final long AEE(H3 h3) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.AEE(h3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i2, i3);
    }
}
