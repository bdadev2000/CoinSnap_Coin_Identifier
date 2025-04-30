package com.bytedance.sdk.component.HWF.zp.zp.lMd;

import com.bytedance.sdk.component.HWF.zp.jU.zp;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public abstract class jU<T extends com.bytedance.sdk.component.HWF.zp.jU.zp> {
    private Queue<String> KS;
    private String jU;
    private Queue<T> lMd = new ConcurrentLinkedQueue();
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zp;

    public jU(com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar, Queue<String> queue, String str) {
        this.zp = zpVar;
        this.KS = queue;
        this.jU = str;
    }

    public synchronized boolean lMd(int i9, int i10) {
        int size = this.lMd.size();
        int zp = this.zp.zp();
        if (i9 != 2 && i9 != 1) {
            if (size < zp) {
                return false;
            }
            return true;
        }
        if (com.bytedance.sdk.component.HWF.zp.KS.zp.KS()) {
            if (size <= 0) {
                return false;
            }
            return true;
        }
        if (size < zp) {
            return false;
        }
        return true;
    }

    public void zp(T t9) {
        Queue<T> queue = this.lMd;
        if (queue == null || t9 == null) {
            return;
        }
        queue.offer(t9);
    }

    public synchronized List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp(int i9, int i10) {
        if (!lMd(i9, i10)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.zp.zp());
        do {
            T poll = this.lMd.poll();
            if (poll == null) {
                break;
            }
            arrayList.add(poll);
        } while (arrayList.size() != this.zp.lMd());
        return arrayList;
    }

    public synchronized void zp(int i9, List<T> list) {
        if (i9 != -1 && i9 != 200 && i9 != 509) {
            this.lMd.addAll(list);
        } else {
            this.lMd.size();
        }
    }
}
