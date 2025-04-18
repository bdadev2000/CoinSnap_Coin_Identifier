package com.google.common.collect;

import java.util.Map;

/* loaded from: classes3.dex */
public enum o1 extends q1 {
    public o1() {
        super("KEY", 0);
    }

    @Override // ra.g
    public final Object apply(Object obj) {
        return ((Map.Entry) obj).getKey();
    }
}
