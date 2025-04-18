package com.bytedance.sdk.component.vc.YFl.YFl.Sg;

import com.bytedance.sdk.component.vc.YFl.AlY.YFl;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public abstract class AlY<T extends com.bytedance.sdk.component.vc.YFl.AlY.YFl> {
    private String AlY;
    private Queue<T> Sg = new ConcurrentLinkedQueue();
    private com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl YFl;
    private Queue<String> tN;

    public AlY(com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl yFl, Queue<String> queue, String str) {
        this.YFl = yFl;
        this.tN = queue;
        this.AlY = str;
    }

    public synchronized boolean Sg(int i10, int i11) {
        int size = this.Sg.size();
        int YFl = this.YFl.YFl();
        if (i10 != 2 && i10 != 1) {
            if (size < YFl) {
                return false;
            }
            return true;
        }
        if (com.bytedance.sdk.component.vc.YFl.tN.YFl.tN()) {
            if (size <= 0) {
                return false;
            }
            return true;
        }
        if (size < YFl) {
            return false;
        }
        return true;
    }

    public void YFl(T t5) {
        Queue<T> queue = this.Sg;
        if (queue == null || t5 == null) {
            return;
        }
        queue.offer(t5);
    }

    public synchronized List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl(int i10, int i11) {
        if (!Sg(i10, i11)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.YFl.YFl());
        do {
            T poll = this.Sg.poll();
            if (poll == null) {
                break;
            }
            arrayList.add(poll);
        } while (arrayList.size() != this.YFl.Sg());
        return arrayList;
    }

    public synchronized void YFl(int i10, List<T> list) {
        if (i10 != -1 && i10 != 200 && i10 != 509) {
            this.Sg.addAll(list);
        } else {
            this.Sg.size();
        }
    }
}
