package com.bytedance.sdk.component.qsH.YFl;

import com.bytedance.sdk.component.qsH.YFl.tN;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class AlY<T extends tN> {
    private BlockingQueue<T> Sg = new LinkedBlockingQueue();
    private int YFl;

    private AlY(int i10) {
        this.YFl = i10;
    }

    public static AlY YFl(int i10) {
        return new AlY(i10);
    }

    public T YFl() {
        return this.Sg.poll();
    }

    public boolean YFl(T t5) {
        if (t5 == null) {
            return false;
        }
        t5.YFl();
        if (this.Sg.size() >= this.YFl) {
            return false;
        }
        return this.Sg.offer(t5);
    }
}
