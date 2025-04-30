package com.bytedance.sdk.component.lMd.zp.zp.zp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class COT extends com.bytedance.sdk.component.lMd.zp.jU {
    private ExecutorService zp;
    private List<com.bytedance.sdk.component.lMd.zp.lMd> lMd = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.lMd.zp.lMd> KS = new CopyOnWriteArrayList();
    private AtomicInteger jU = new AtomicInteger(64);

    public COT() {
        if (this.zp == null) {
            this.zp = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.lMd.zp.zp.zp.COT.1
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

    @Override // com.bytedance.sdk.component.lMd.zp.jU
    public List<com.bytedance.sdk.component.lMd.zp.lMd> KS() {
        return this.lMd;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.jU
    public List<com.bytedance.sdk.component.lMd.zp.lMd> jU() {
        return this.KS;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.jU
    public ExecutorService lMd() {
        return this.zp;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.jU
    public void zp(int i9) {
        this.jU.set(i9);
    }

    @Override // com.bytedance.sdk.component.lMd.zp.jU
    public int zp() {
        return this.jU.get();
    }
}
