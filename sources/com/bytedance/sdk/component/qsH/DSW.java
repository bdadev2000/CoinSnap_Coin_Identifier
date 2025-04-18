package com.bytedance.sdk.component.qsH;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class DSW<V> extends FutureTask<V> implements Comparable<DSW<V>> {
    private int Sg;
    private int YFl;

    public DSW(Callable<V> callable, int i10, int i11) {
        super(callable);
        this.YFl = i10 == -1 ? 5 : i10;
        this.Sg = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public int compareTo(DSW dsw) {
        if (YFl() < dsw.YFl()) {
            return 1;
        }
        return YFl() > dsw.YFl() ? -1 : 0;
    }

    public int YFl() {
        return this.YFl;
    }

    public DSW(Runnable runnable, V v10, int i10, int i11) {
        super(runnable, v10);
        this.YFl = i10 == -1 ? 5 : i10;
        this.Sg = i11;
    }
}
