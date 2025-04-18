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
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), this.a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ long a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f2901b;

        public b(long j3, Runnable runnable) {
            this.a = j3;
            this.f2901b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Thread.sleep(this.a);
            } catch (InterruptedException e2) {
                AdjustFactory.getLogger().warn("Sleep delay exception: %s", e2.getMessage());
            }
            SingleThreadCachedScheduler.this.submit(this.f2901b);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ Runnable a;

        public c(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SingleThreadCachedScheduler singleThreadCachedScheduler = SingleThreadCachedScheduler.this;
            Runnable runnable = this.a;
            while (true) {
                singleThreadCachedScheduler.tryExecuteRunnable(runnable);
                synchronized (SingleThreadCachedScheduler.this.queue) {
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
        } catch (Throwable th2) {
            AdjustFactory.getLogger().warn("Execution failed: %s", th2.getMessage());
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadScheduler
    public void schedule(Runnable runnable, long j3) {
        synchronized (this.queue) {
            if (this.isTeardown) {
                return;
            }
            this.threadPoolExecutor.submit(new b(j3, runnable));
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadExecutor
    public void submit(Runnable runnable) {
        synchronized (this.queue) {
            if (this.isTeardown) {
                return;
            }
            if (this.isThreadProcessing) {
                this.queue.add(runnable);
            } else {
                this.isThreadProcessing = true;
                processQueue(runnable);
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
