package com.google.common.collect;

import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class y1 implements Comparator {
    public static y1 a(Comparator comparator) {
        if (comparator instanceof y1) {
            return (y1) comparator;
        }
        return new d0(comparator);
    }

    public y1 b() {
        return new i2(this);
    }
}
