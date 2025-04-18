package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class XX implements FG {
    public final int A00;
    public final /* synthetic */ C0489Dg A01;

    public XX(C0489Dg c0489Dg, int i2) {
        this.A01 = c0489Dg;
        this.A00 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.FG
    public final boolean A9b() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.FG
    public final void AAm() throws IOException {
        this.A01.A0Q();
    }

    @Override // com.instagram.common.viewpoint.core.FG
    public final int AEn(C04029u c04029u, C1023Yw c1023Yw, boolean z2) {
        return this.A01.A0P(this.A00, c04029u, c1023Yw, z2);
    }

    @Override // com.instagram.common.viewpoint.core.FG
    public final int AGp(long j2) {
        return this.A01.A0O(this.A00, j2);
    }
}
