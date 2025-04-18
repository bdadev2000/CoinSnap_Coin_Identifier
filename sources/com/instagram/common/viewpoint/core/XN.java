package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class XN implements InterfaceC0540Ft {
    public static String[] A01 = {"PNezsP2uIXfEkTtxMVhkFMGOj0OMdsbx", "Yqk1id1iIWcVp6vlakHKZfjEHLsXJfOv", "uG5gRn5RrF1WjMfxOQskWyTfrDpKsrJO", "omBvcOuEhBO9kSKWG0JFXmEcKF3e7ahW", "1ZqGxjyaar7sxLwSly2RpiZrr4KDiQxv", "gok5zJYCjc2dvIikSbYtPgim2ONCGlnE", "1YGAJJrzxjLCzaCnFt4GS06pgnkMjMIl", "2bfB3PlZj1r0tJp81OVdNUvEXeDR9P2R"};
    public final List<C0539Fs> A00;

    public XN(List<C0539Fs> list) {
        this.A00 = list;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0540Ft
    public final List<C0539Fs> A6x(long j2) {
        return j2 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0540Ft
    public final long A7O(int i2) {
        AbstractC0576Hf.A03(i2 == 0);
        if (A01[2].charAt(13) != 'M') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "DrtEvBPOEdCgkho9QaC1rsvic68sYnn0";
        strArr[0] = "DoaGgd9KcWJSkB91JveXYFzycmhzEPJ7";
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
