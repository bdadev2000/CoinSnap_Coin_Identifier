package com.adjust.sdk.scheduler;

import com.adjust.sdk.AdjustFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class SingleThreadCachedScheduler implements ThreadScheduler {
    private ThreadPoolExecutor threadPoolExecutor;
    private final List<Runnable> queue = new ArrayList();
    private boolean isThreadProcessing = false;
    private boolean isTeardown = false;

    /* loaded from: classes.dex */
    public class a implements RejectedExecutionHandler {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f5589a;

        public a(String str) {
            this.f5589a = str;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), this.f5589a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f5590a;
        public final /* synthetic */ Runnable b;

        public b(long j7, Runnable runnable) {
            this.f5590a = j7;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Thread.sleep(this.f5590a);
            } catch (InterruptedException e4) {
                AdjustFactory.getLogger().warn("Sleep delay exception: %s", e4.getMessage());
            }
            SingleThreadCachedScheduler.this.submit(this.b);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f5592a;

        public c(Runnable runnable) {
            this.f5592a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SingleThreadCachedScheduler singleThreadCachedScheduler = SingleThreadCachedScheduler.this;
            Runnable runnable = this.f5592a;
            while (true) {
                singleThreadCachedScheduler.tryExecuteRunnable(runnable);
                synchronized (SingleThreadCachedScheduler.this.queue) {
                    try {
                        if (SingleThreadCachedScheduler.this.isTeardown) {
                            return;
                        }
                        if (SingleThreadCachedScheduler.this.queue.isEmpty()) {
                            SingleThreadCachedScheduler.this.isThreadProcessing = false;
                            return;
                        } else {
                            runnable = (Runnable) SingleThreadCachedScheduler.this.queue.get(0);
                            SingleThreadCachedScheduler.this.queue.remove(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                singleThreadCachedScheduler = SingleThreadCachedScheduler.this;
            }
        }
    }

    public SingleThreadCachedScheduler(String str) {
        this.threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryWrapper(str), new a(str));
    }

    private void processQueue(Runnable runnable) {
        this.threadPoolExecutor.submit(new c(runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryExecuteRunnable(Runnable runnable) {
        try {
            if (this.isTeardown) {
                return;
            }
            runnable.run();
        } catch (Throwable th) {
            AdjustFactory.getLogger().warn("Execution failed: %s", th.getMessage());
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadScheduler
    public void schedule(Runnable runnable, long j7) {
        synchronized (this.queue) {
            try {
                if (this.isTeardown) {
                    return;
                }
                this.threadPoolExecutor.submit(new b(j7, runnable));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadExecutor
    public void submit(Runnable runnable) {
        synchronized (this.queue) {
            try {
                if (this.isTeardown) {
                    return;
                }
                if (this.isThreadProcessing) {
                    this.queue.add(runnable);
                } else {
                    this.isThreadProcessing = true;
                    processQueue(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadExecutor
    public void teardown() {
        synchronized (this.queue) {
            this.isTeardown = true;
            this.queue.clear();
            this.threadPoolExecutor.shutdown();
        }
    }
}
