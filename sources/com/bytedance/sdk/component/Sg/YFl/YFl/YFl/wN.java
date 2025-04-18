package com.bytedance.sdk.component.Sg.YFl.YFl.YFl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class wN extends com.bytedance.sdk.component.Sg.YFl.AlY {
    private ExecutorService YFl;
    private List<com.bytedance.sdk.component.Sg.YFl.Sg> Sg = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.Sg.YFl.Sg> tN = new CopyOnWriteArrayList();
    private AtomicInteger AlY = new AtomicInteger(64);

    public wN() {
        if (this.YFl == null) {
            this.YFl = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.Sg.YFl.YFl.YFl.wN.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.AlY
    public List<com.bytedance.sdk.component.Sg.YFl.Sg> AlY() {
        return this.tN;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.AlY
    public ExecutorService Sg() {
        return this.YFl;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.AlY
    public void YFl(int i10) {
        this.AlY.set(i10);
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.AlY
    public List<com.bytedance.sdk.component.Sg.YFl.Sg> tN() {
        return this.Sg;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.AlY
    public int YFl() {
        return this.AlY.get();
    }
}
