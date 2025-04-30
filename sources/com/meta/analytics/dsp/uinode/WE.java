package com.meta.analytics.dsp.uinode;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WE implements InterfaceC1156Fo {
    public final long[] A00;
    public final C1155Fn[] A01;

    public WE(C1155Fn[] c1155FnArr, long[] jArr) {
        this.A01 = c1155FnArr;
        this.A00 = jArr;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1156Fo
    public final List<C1155Fn> A6Z(long j7) {
        C1155Fn c1155Fn;
        int A0B = IF.A0B(this.A00, j7, true, false);
        if (A0B == -1 || (c1155Fn = this.A01[A0B]) == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(c1155Fn);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1156Fo
    public final long A70(int i9) {
        boolean z8 = true;
        AbstractC1192Ha.A03(i9 >= 0);
        if (i9 >= this.A00.length) {
            z8 = false;
        }
        AbstractC1192Ha.A03(z8);
        return this.A00[i9];
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1156Fo
    public final int A71() {
        return this.A00.length;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1156Fo
    public final int A7T(long j7) {
        int A0A = IF.A0A(this.A00, j7, false, false);
        int index = this.A00.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
