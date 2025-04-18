package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class XH implements InterfaceC0540Ft {
    public static final XH A01 = new XH();
    public final List<C0539Fs> A00;

    public XH() {
        this.A00 = Collections.emptyList();
    }

    public XH(C0539Fs c0539Fs) {
        this.A00 = Collections.singletonList(c0539Fs);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0540Ft
    public final List<C0539Fs> A6x(long j2) {
        return j2 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0540Ft
    public final long A7O(int i2) {
        AbstractC0576Hf.A03(i2 == 0);
        return 0L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0540Ft
    public final int A7P() {
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0540Ft
    public final int A7r(long j2) {
        return j2 < 0 ? 0 : -1;
    }
}
