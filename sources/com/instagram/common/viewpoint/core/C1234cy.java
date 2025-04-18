package com.instagram.common.viewpoint.core;

import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.ads.redexgen.X.cy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1234cy implements C0K {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C1234cy(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.instagram.common.viewpoint.core.C0K
    public final void AEF(int i2) throws C1233cx {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i2);
    }

    @Override // com.instagram.common.viewpoint.core.C0K
    public final void close() throws C1233cx {
    }

    @Override // com.instagram.common.viewpoint.core.C0K
    public final int length() throws C1233cx {
        return this.A01.length;
    }

    @Override // com.instagram.common.viewpoint.core.C0K
    public final int read(byte[] bArr) throws C1233cx {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
