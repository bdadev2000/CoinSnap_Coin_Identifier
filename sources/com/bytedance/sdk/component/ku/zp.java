package com.bytedance.sdk.component.ku;

import android.os.Looper;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.utils.tG;
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
public class zp extends ThreadPoolExecutor {
    private String zp;

    /* renamed from: com.bytedance.sdk.component.ku.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0087zp {
        private RejectedExecutionHandler ku;
        private String zp = "io";
        private int lMd = 1;
        private long KS = 30;
        private TimeUnit jU = TimeUnit.SECONDS;
        private int COT = Integer.MAX_VALUE;
        private BlockingQueue<Runnable> HWF = null;
        private ThreadFactory QR = null;
        private int YW = 5;

        public C0087zp lMd(int i9) {
            this.YW = i9;
            return this;
        }

        public C0087zp zp(String str) {
            this.zp = str;
            return this;
        }

        public C0087zp zp(int i9) {
            this.lMd = i9;
            return this;
        }

        public C0087zp zp(long j7) {
            this.KS = j7;
            return this;
        }

        public C0087zp zp(TimeUnit timeUnit) {
            this.jU = timeUnit;
            return this;
        }

        public C0087zp zp(BlockingQueue<Runnable> blockingQueue) {
            this.HWF = blockingQueue;
            return this;
        }

        public C0087zp zp(ThreadFactory threadFactory) {
            this.QR = threadFactory;
            return this;
        }

        public C0087zp zp(RejectedExecutionHandler rejectedExecutionHandler) {
            this.ku = rejectedExecutionHandler;
            return this;
        }

        public zp zp() {
            if (this.QR == null) {
                this.QR = COT.zp().createThreadFactory(this.YW, this.zp);
            }
            if (this.ku == null) {
                this.ku = HWF.ku();
            }
            if (this.HWF == null) {
                this.HWF = new LinkedBlockingQueue();
            }
            return new zp(this.zp, this.lMd, this.COT, this.KS, this.jU, this.HWF, this.QR, this.ku);
        }
    }

    public zp(String str, int i9, int i10, long j7, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i9, i10, j7, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.zp = str;
    }

    private void zp(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e4) {
            zp(runnable, e4);
        } catch (Throwable th) {
            zp(runnable, th);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        BlockingQueue<Runnable> queue;
        super.afterExecute(runnable, th);
        if (HWF.QR() && !TextUtils.isEmpty(this.zp) && (queue = getQueue()) != null) {
            String str = this.zp;
            str.getClass();
            char c9 = 65535;
            switch (str.hashCode()) {
                case 3366:
                    if (str.equals("io")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 107332:
                    if (str.equals("log")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 2993840:
                    if (str.equals("aidl")) {
                        c9 = 2;
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    zp(queue, 2);
                    return;
                case 1:
                    zp(queue, 4);
                    return;
                case 2:
                    zp(queue, 2);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        BlockingQueue<Runnable> queue;
        if (runnable instanceof ku) {
            zp(new lMd((ku) runnable, this));
        } else {
            zp(new lMd(new ku(AppLovinMediationProvider.UNKNOWN) { // from class: com.bytedance.sdk.component.ku.zp.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (HWF.QR() && !TextUtils.isEmpty(this.zp) && (queue = getQueue()) != null) {
            String str = this.zp;
            str.getClass();
            char c9 = 65535;
            switch (str.hashCode()) {
                case 3366:
                    if (str.equals("io")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 107332:
                    if (str.equals("log")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 2993840:
                    if (str.equals("aidl")) {
                        c9 = 2;
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    zp(queue, HWF.zp + 2, getCorePoolSize() * 2);
                    return;
                case 1:
                    zp(queue, 8, 8);
                    return;
                case 2:
                    zp(queue, 5, 5);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if (!"io".equals(this.zp) && !"aidl".equals(this.zp)) {
            super.shutdown();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if (!"io".equals(this.zp) && !"aidl".equals(this.zp)) {
            return super.shutdownNow();
        }
        return Collections.emptyList();
    }

    private void zp(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        zp(runnable, (Throwable) outOfMemoryError);
    }

    private void zp(Runnable runnable, Throwable th) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                tG.zp("", "try exc failed", th2);
            }
        }
    }

    private void zp(BlockingQueue<Runnable> blockingQueue, int i9) {
        if (getCorePoolSize() == i9 || blockingQueue == null || blockingQueue.size() > 0) {
            return;
        }
        try {
            setCorePoolSize(i9);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e4) {
            e4.getMessage();
        }
    }

    private void zp(BlockingQueue<Runnable> blockingQueue, int i9, int i10) {
        if (getCorePoolSize() == i9 || blockingQueue == null || blockingQueue.size() < i10) {
            return;
        }
        try {
            setCorePoolSize(i9);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e4) {
            e4.getMessage();
        }
    }

    public String zp() {
        return this.zp;
    }
}
