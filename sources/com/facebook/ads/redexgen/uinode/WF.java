package com.facebook.ads.redexgen.uinode;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WF implements InterfaceC0590Fo {
    public static String[] A02 = {"rC2J7AwmmaBlZB1ox11LDA9ZAB6fxVsC", "FZKyzMmy9TivpD2nKj9z4jyUnxaUeLwM", "SgCjuagBwk99AmsF9yO8OoMMvubs4clZ", "SMyqq5yIGtEsHah", "ZWugu9oJugVg9n7ZMlc8zaFASnxpD2Hj", "S8p9iTCEp8NZOaZR39SQR", "XhPs2dbFqyZTAL6Xfbqo6", "a7gb9qnnbjI1KAE"};
    public final long[] A00;
    public final C0589Fn[] A01;

    public WF(C0589Fn[] c0589FnArr, long[] jArr) {
        this.A01 = c0589FnArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0590Fo
    public final List<C0589Fn> A6Z(long j3) {
        int A0B = IF.A0B(this.A00, j3, true, false);
        if (A0B != -1) {
            C0589Fn[] c0589FnArr = this.A01;
            if (A02[0].charAt(18) != '1') {
                throw new RuntimeException();
            }
            A02[1] = "utRrKVvY3UrlqyIa0tu41Z4MJfpwxdGA";
            C0589Fn c0589Fn = c0589FnArr[A0B];
            if (c0589Fn != null) {
                return Collections.singletonList(c0589Fn);
            }
        }
        return Collections.emptyList();
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
