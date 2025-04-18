package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0997Vp implements InterfaceC0621Gu {
    public final int A00;
    public final InterfaceC0621Gu A01;
    public final I3 A02;

    public C0997Vp(InterfaceC0621Gu interfaceC0621Gu, I3 i32, int i10) {
        this.A01 = (InterfaceC0621Gu) AbstractC0626Ha.A01(interfaceC0621Gu);
        this.A02 = (I3) AbstractC0626Ha.A01(i32);
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final Uri A8E() {
        return this.A01.A8E();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final long ADl(C0625Gy c0625Gy) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ADl(c0625Gy);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i10, i11);
    }
}
