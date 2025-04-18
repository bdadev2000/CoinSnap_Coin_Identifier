package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Function;
import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class wg implements Comparator {
    public static wg a(Comparator comparator) {
        if (comparator instanceof wg) {
            return (wg) comparator;
        }
        return new x3(comparator);
    }

    public wg b() {
        return a(vc.a());
    }

    public wg c() {
        return new yi(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public eb a(Iterable iterable) {
        return eb.a((Comparator) this, iterable);
    }

    public static wg a() {
        return ag.f22848a;
    }

    public wg a(Function function) {
        return new r2(function, this);
    }
}
