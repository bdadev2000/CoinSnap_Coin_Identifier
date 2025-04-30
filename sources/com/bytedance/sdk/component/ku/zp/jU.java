package com.bytedance.sdk.component.ku.zp;

import com.bytedance.sdk.component.ku.zp.KS;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class jU<T extends KS> {
    private BlockingQueue<T> lMd = new LinkedBlockingQueue();
    private int zp;

    private jU(int i9) {
        this.zp = i9;
    }

    public static jU zp(int i9) {
        return new jU(i9);
    }

    public T zp() {
        return this.lMd.poll();
    }

    public boolean zp(T t9) {
        if (t9 == null) {
            return false;
        }
        t9.zp();
        if (this.lMd.size() >= this.zp) {
            return false;
        }
        return this.lMd.offer(t9);
    }
}
