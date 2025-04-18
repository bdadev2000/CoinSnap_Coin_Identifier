package com.google.common.collect;

import java.util.Map;

/* loaded from: classes3.dex */
public enum p1 extends q1 {
    public p1() {
        super("VALUE", 1);
    }

    @Override // ra.g
    public final Object apply(Object obj) {
        return ((Map.Entry) obj).getValue();
    }
}
