package com.bytedance.sdk.component.ku;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class QR<V> extends FutureTask<V> implements Comparable<QR<V>> {
    private int lMd;
    private int zp;

    public QR(Callable<V> callable, int i9, int i10) {
        super(callable);
        this.zp = i9 == -1 ? 5 : i9;
        this.lMd = i10;
    }

    @Override // java.lang.Comparable
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public int compareTo(QR qr) {
        if (zp() < qr.zp()) {
            return 1;
        }
        return zp() > qr.zp() ? -1 : 0;
    }

    public int zp() {
        return this.zp;
    }

    public QR(Runnable runnable, V v6, int i9, int i10) {
        super(runnable, v6);
        this.zp = i9 == -1 ? 5 : i9;
        this.lMd = i10;
    }
}
