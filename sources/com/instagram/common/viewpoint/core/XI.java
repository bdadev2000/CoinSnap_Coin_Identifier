package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class XI implements InterfaceC0540Ft {
    public final GG A00;
    public final Map<String, GM> A01;
    public final Map<String, GH> A02;
    public final long[] A03;

    public XI(GG gg, Map<String, GM> map, Map<String, GH> map2) {
        Map<String, GM> emptyMap;
        this.A00 = gg;
        this.A02 = map2;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.A01 = emptyMap;
        this.A03 = gg.A0F();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0540Ft
    public final List<C0539Fs> A6x(long j2) {
        return this.A00.A0D(j2, this.A01, this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0540Ft
    public final long A7O(int i2) {
        return this.A03[i2];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0540Ft
    public final int A7P() {
        return this.A03.length;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0540Ft
    public final int A7r(long j2) {
        int A0A = IK.A0A(this.A03, j2, false, false);
        int index = this.A03.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
