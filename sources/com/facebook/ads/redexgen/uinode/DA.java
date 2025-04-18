package com.facebook.ads.redexgen.uinode;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class DA {
    public final int A00;
    public final String A01;
    public final List<D9> A02;
    public final byte[] A03;

    public DA(int i10, String str, List<D9> list, byte[] bArr) {
        List<D9> unmodifiableList;
        this.A00 = i10;
        this.A01 = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = unmodifiableList;
        this.A03 = bArr;
    }
}
