package com.facebook.ads.redexgen.uinode;

import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.ads.redexgen.X.bl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1215bl implements C0K {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C1215bl(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.uinode.C0K
    public final void ADm(int i10) throws C1214bk {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.A01);
        this.A00 = byteArrayInputStream;
        byteArrayInputStream.skip(i10);
    }

    @Override // com.facebook.ads.redexgen.uinode.C0K
    public final void close() throws C1214bk {
    }

    @Override // com.facebook.ads.redexgen.uinode.C0K
    public final int length() throws C1214bk {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.uinode.C0K
    public final int read(byte[] bArr) throws C1214bk {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
