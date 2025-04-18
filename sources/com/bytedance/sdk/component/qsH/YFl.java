package com.bytedance.sdk.component.qsH;

import android.os.Looper;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.utils.YoT;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class YFl extends ThreadPoolExecutor {
    private String YFl;

    /* renamed from: com.bytedance.sdk.component.qsH.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0090YFl {
        private RejectedExecutionHandler qsH;
        private String YFl = "io";
        private int Sg = 1;
        private long tN = 30;
        private TimeUnit AlY = TimeUnit.SECONDS;
        private int wN = Integer.MAX_VALUE;

        /* renamed from: vc, reason: collision with root package name */
        private BlockingQueue<Runnable> f10433vc = null;
        private ThreadFactory DSW = null;
        private int NjR = 5;

        public C0090YFl Sg(int i10) {
            this.NjR = i10;
            return this;
        }

        public C0090YFl YFl(String str) {
            this.YFl = str;
            return this;
        }

        public C0090YFl YFl(int i10) {
            this.Sg = i10;
            return this;
        }

        public C0090YFl YFl(long j3) {
            this.tN = j3;
            return this;
        }

        public C0090YFl YFl(TimeUnit timeUnit) {
            this.AlY = timeUnit;
            return this;
        }

        public C0090YFl YFl(BlockingQueue<Runnable> blockingQueue) {
            this.f10433vc = blockingQueue;
            return this;
        }

        public C0090YFl YFl(ThreadFactory threadFactory) {
            this.DSW = threadFactory;
            return this;
        }

        public C0090YFl YFl(RejectedExecutionHandler rejectedExecutionHandler) {
            this.qsH = rejectedExecutionHandler;
            return this;
        }

        public YFl YFl() {
            if (this.DSW == null) {
                this.DSW = wN.YFl().createThreadFactory(this.NjR, this.YFl);
            }
            if (this.qsH == null) {
                this.qsH = vc.qsH();
            }
            if (this.f10433vc == null) {
                this.f10433vc = new LinkedBlockingQueue();
            }
            return new YFl(this.YFl, this.Sg, this.wN, this.tN, this.AlY, this.f10433vc, this.DSW, this.qsH);
        }
    }

    public YFl(String str, int i10, int i11, long j3, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i10, i11, j3, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.YFl = str;
    }

    private void YFl(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e2) {
            YFl(runnable, e2);
        } catch (Throwable th2) {
            YFl(runnable, th2);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th2) {
        BlockingQueue<Runnable> queue;
        super.afterExecute(runnable, th2);
        if (vc.DSW() && !TextUtils.isEmpty(this.YFl) && (queue = getQueue()) != null) {
            String str = this.YFl;
            str.getClass();
            char c10 = 65535;
            switch (str.hashCode()) {
                case 3366:
                    if (str.equals("io")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 107332:
                    if (str.equals("log")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 2993840:
                    if (str.equals("aidl")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    YFl(queue, 2);
                    return;
                case 1:
                    YFl(queue, 4);
                    return;
                case 2:
                    YFl(queue, 2);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        BlockingQueue<Runnable> queue;
        if (runnable instanceof qsH) {
            YFl(new Sg((qsH) runnable, this));
        } else {
            YFl(new Sg(new qsH(AppLovinMediationProvider.UNKNOWN) { // from class: com.bytedance.sdk.component.qsH.YFl.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (vc.DSW() && !TextUtils.isEmpty(this.YFl) && (queue = getQueue()) != null) {
            String str = this.YFl;
            str.getClass();
            char c10 = 65535;
            switch (str.hashCode()) {
                case 3366:
                    if (str.equals("io")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 107332:
                    if (str.equals("log")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 2993840:
                    if (str.equals("aidl")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    YFl(queue, vc.YFl + 2, getCorePoolSize() * 2);
                    return;
                case 1:
                    YFl(queue, 8, 8);
                    return;
                case 2:
                    YFl(queue, 5, 5);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if (!"io".equals(this.YFl) && !"aidl".equals(this.YFl)) {
            super.shutdown();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if (!"io".equals(this.YFl) && !"aidl".equals(this.YFl)) {
            return super.shutdownNow();
        }
        return Collections.emptyList();
    }

    private void YFl(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        YFl(runnable, (Throwable) outOfMemoryError);
    }

    private void YFl(Runnable runnable, Throwable th2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable th3) {
                YoT.YFl("", "try exc failed", th3);
            }
        }
    }

    private void YFl(BlockingQueue<Runnable> blockingQueue, int i10) {
        if (getCorePoolSize() == i10 || blockingQueue == null || blockingQueue.size() > 0) {
            return;
        }
        try {
            setCorePoolSize(i10);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void YFl(BlockingQueue<Runnable> blockingQueue, int i10, int i11) {
        if (getCorePoolSize() == i10 || blockingQueue == null || blockingQueue.size() < i11) {
            return;
        }
        try {
            setCorePoolSize(i10);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public String YFl() {
        return this.YFl;
    }
}
