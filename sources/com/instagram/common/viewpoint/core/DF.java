package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class DF {
    public final int A00;
    public final String A01;
    public final List<DE> A02;
    public final byte[] A03;

    public DF(int i2, String str, List<DE> list, byte[] bArr) {
        List<DE> unmodifiableList;
        this.A00 = i2;
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
