package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Function;
import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class tg implements Comparator {
    public static tg a(Comparator comparator) {
        if (comparator instanceof tg) {
            return (tg) comparator;
        }
        return new v3(comparator);
    }

    public tg b() {
        return a(qc.a());
    }

    public tg c() {
        return new ti(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public ab a(Iterable iterable) {
        return ab.a((Comparator) this, iterable);
    }

    public static tg a() {
        return vf.a;
    }

    public tg a(Function function) {
        return new p2(function, this);
    }
}
