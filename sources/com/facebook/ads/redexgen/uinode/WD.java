package com.facebook.ads.redexgen.uinode;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class WD implements InterfaceC0590Fo {
    public final GB A00;
    public final Map<String, GH> A01;
    public final Map<String, GC> A02;
    public final long[] A03;

    public WD(GB gb2, Map<String, GH> map, Map<String, GC> map2) {
        Map<String, GH> emptyMap;
        this.A00 = gb2;
        this.A02 = map2;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.A01 = emptyMap;
        this.A03 = gb2.A0F();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0590Fo
    public final List<C0589Fn> A6Z(long j3) {
        return this.A00.A0D(j3, this.A01, this.A02);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0590Fo
    public final long A70(int i10) {
        return this.A03[i10];
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0590Fo
    public final int A71() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0590Fo
    public final int A7T(long j3) {
        int A0A = IF.A0A(this.A03, j3, false, false);
        int index = this.A03.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
