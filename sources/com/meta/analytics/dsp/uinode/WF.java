package com.meta.analytics.dsp.uinode;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WF implements InterfaceC1156Fo {
    public static String[] A02 = {"rC2J7AwmmaBlZB1ox11LDA9ZAB6fxVsC", "FZKyzMmy9TivpD2nKj9z4jyUnxaUeLwM", "SgCjuagBwk99AmsF9yO8OoMMvubs4clZ", "SMyqq5yIGtEsHah", "ZWugu9oJugVg9n7ZMlc8zaFASnxpD2Hj", "S8p9iTCEp8NZOaZR39SQR", "XhPs2dbFqyZTAL6Xfbqo6", "a7gb9qnnbjI1KAE"};
    public final long[] A00;
    public final C1155Fn[] A01;

    public WF(C1155Fn[] c1155FnArr, long[] jArr) {
        this.A01 = c1155FnArr;
        this.A00 = jArr;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1156Fo
    public final List<C1155Fn> A6Z(long j7) {
        int A0B = IF.A0B(this.A00, j7, true, false);
        if (A0B != -1) {
            C1155Fn[] c1155FnArr = this.A01;
            if (A02[0].charAt(18) != '1') {
                throw new RuntimeException();
            }
            A02[1] = "utRrKVvY3UrlqyIa0tu41Z4MJfpwxdGA";
            C1155Fn c1155Fn = c1155FnArr[A0B];
            if (c1155Fn != null) {
                return Collections.singletonList(c1155Fn);
            }
        }
        return Collections.emptyList();
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
