package com.facebook.ads.redexgen.uinode;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WE implements InterfaceC0590Fo {
    public final long[] A00;
    public final C0589Fn[] A01;

    public WE(C0589Fn[] c0589FnArr, long[] jArr) {
        this.A01 = c0589FnArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0590Fo
    public final List<C0589Fn> A6Z(long j3) {
        C0589Fn c0589Fn;
        int A0B = IF.A0B(this.A00, j3, true, false);
        if (A0B == -1 || (c0589Fn = this.A01[A0B]) == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(c0589Fn);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0590Fo
    public final long A70(int i10) {
        boolean z10 = true;
        AbstractC0626Ha.A03(i10 >= 0);
        if (i10 >= this.A00.length) {
            z10 = false;
        }
        AbstractC0626Ha.A03(z10);
        return this.A00[i10];
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0590Fo
    public final int A71() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0590Fo
    public final int A7T(long j3) {
        int A0A = IF.A0A(this.A00, j3, false, false);
        int index = this.A00.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
