package com.bytedance.sdk.component.qsH.tN;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.utils.YoT;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class vc extends ThreadPoolExecutor {
    private int AlY;
    private boolean DSW;
    private int Sg;
    private final String YFl;
    private LinkedHashMap<String, com.bytedance.sdk.component.qsH.tN.YFl.YFl> qsH;
    private int tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10436vc;
    private int wN;

    /* loaded from: classes.dex */
    public static class YFl {
        private String YFl = "cache";
        private int Sg = 4;
        private int tN = 100;
        private int AlY = 0;
        private long wN = 30000;

        /* renamed from: vc, reason: collision with root package name */
        private boolean f10438vc = false;
        private TimeUnit DSW = TimeUnit.MILLISECONDS;
        private int qsH = -1;
        private int NjR = 20;

        /* renamed from: nc, reason: collision with root package name */
        private boolean f10437nc = false;
        private BlockingQueue<Runnable> eT = new PriorityBlockingQueue();
        private ThreadFactory YoT = null;

        public YFl AlY(int i10) {
            this.NjR = i10;
            return this;
        }

        public YFl Sg(int i10) {
            this.tN = i10;
            return this;
        }

        public YFl YFl(String str) {
            this.YFl = str;
            return this;
        }

        public YFl tN(int i10) {
            this.AlY = i10;
            return this;
        }

        public YFl wN(int i10) {
            this.qsH = i10;
            return this;
        }

        public YFl Sg(boolean z10) {
            this.f10437nc = z10;
            return this;
        }

        public YFl YFl(int i10) {
            this.Sg = i10;
            return this;
        }

        public YFl YFl(long j3) {
            this.wN = j3;
            return this;
        }

        public YFl YFl(boolean z10) {
            this.f10438vc = z10;
            return this;
        }

        public vc YFl() {
            if (this.YoT == null) {
                this.YoT = new AlY(this.YFl);
            }
            if (this.Sg < 0) {
                this.Sg = 8;
            }
            if (this.Sg == 0) {
                this.eT = new SynchronousQueue();
            }
            if (this.eT == null) {
                this.eT = new LinkedBlockingQueue();
            }
            if (this.tN > 100) {
                this.tN = 100;
            }
            int i10 = this.tN;
            int i11 = this.Sg;
            if (i10 < i11) {
                this.tN = i11;
            }
            if (this.NjR < 0) {
                this.NjR = 20;
            }
            if (this.NjR > 100) {
                this.NjR = 100;
            }
            return new vc(this);
        }
    }

    private void AlY() {
        try {
            if (this.AlY != 0 && getCorePoolSize() < this.wN) {
                int size = getQueue().size();
                if (getActiveCount() >= this.AlY && size >= this.f10436vc) {
                    setCorePoolSize(this.wN);
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private boolean DSW() {
        return this.Sg > 0;
    }

    private void vc() {
        if (getCompletedTaskCount() > this.Sg) {
            wN YFl2 = tN.YFl();
            if (YFl2 != null) {
                YFl2.YFl(this);
            }
            this.Sg = -1;
        }
    }

    private void wN() {
        try {
            if (this.AlY != 0 && getCorePoolSize() > this.AlY && getQueue().size() == 0) {
                setCorePoolSize(this.AlY);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public String Sg() {
        return this.YFl;
    }

    public void YFl(YFl yFl) {
        try {
            if (yFl.Sg >= 0 && this.AlY != yFl.Sg) {
                int i10 = yFl.Sg;
                this.AlY = i10;
                setCorePoolSize(i10);
            }
            this.wN = yFl.tN;
            this.f10436vc = yFl.AlY;
            allowCoreThreadTimeOut(yFl.f10438vc);
            this.Sg = yFl.qsH;
            this.tN = yFl.NjR;
            this.DSW = yFl.f10437nc;
        } catch (Throwable th2) {
            YoT.YFl("PAGThreadPoolExecutor", th2.getMessage());
        }
        String unused = yFl.YFl;
        int unused2 = yFl.Sg;
        int unused3 = yFl.tN;
        long unused4 = yFl.wN;
        int unused5 = yFl.AlY;
        int unused6 = yFl.NjR;
        boolean unused7 = yFl.f10437nc;
        BlockingQueue unused8 = yFl.eT;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th2) {
        boolean z10 = runnable instanceof Sg;
        if (z10) {
            ((Sg) runnable).tN(SystemClock.elapsedRealtime());
            try {
                if (DSW() && this.qsH != null) {
                    YFl((Sg) runnable);
                    vc();
                }
            } catch (Exception e2) {
                YoT.YFl("PAGThreadPoolExecutor", e2.getMessage());
            }
        }
        super.afterExecute(runnable, th2);
        if (z10) {
            Sg sg2 = (Sg) runnable;
            sg2.Sg();
            sg2.YFl();
            sg2.tN();
            sg2.AlY();
            sg2.wN();
        }
        wN();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof Sg) {
            ((Sg) runnable).Sg(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.qsH.tN.YFl Sg;
        if (!(runnable instanceof Sg)) {
            runnable = new Sg(AppLovinMediationProvider.UNKNOWN, runnable) { // from class: com.bytedance.sdk.component.qsH.tN.vc.3
                @Override // java.lang.Runnable
                public void run() {
                    Runnable qsH = qsH();
                    if (qsH != null) {
                        qsH.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.YFl)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(AlY.YFl(this.YFl)) && (Sg = tN.Sg()) != null) {
                Sg.YFl(this, (Sg) runnable);
            }
        }
        ((Sg) runnable).YFl(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            AlY();
        } catch (Throwable th2) {
            YFl(runnable, th2);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.YFl)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if ("aidl".equals(this.YFl)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int i10;
        String str;
        runnable.getClass();
        final RunnableFuture newTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof Sg) {
            Sg sg2 = (Sg) runnable;
            i10 = sg2.YFl();
            str = sg2.Sg();
        } else {
            i10 = 6;
            str = "";
        }
        if (i10 == 0 || TextUtils.isEmpty(str)) {
            new RuntimeException();
        }
        execute(new Sg(i10, str) { // from class: com.bytedance.sdk.component.qsH.tN.vc.2
            @Override // java.lang.Runnable
            public void run() {
                newTaskFor.run();
            }
        });
        return newTaskFor;
    }

    public boolean tN() {
        return this.DSW;
    }

    private vc(YFl yFl) {
        super(yFl.Sg, Integer.MAX_VALUE, yFl.wN, yFl.DSW, (BlockingQueue<Runnable>) yFl.eT, yFl.YoT);
        this.DSW = false;
        String unused = yFl.YFl;
        int unused2 = yFl.Sg;
        int unused3 = yFl.tN;
        long unused4 = yFl.wN;
        int unused5 = yFl.AlY;
        int unused6 = yFl.NjR;
        boolean unused7 = yFl.f10437nc;
        BlockingQueue unused8 = yFl.eT;
        this.YFl = yFl.YFl;
        this.AlY = yFl.Sg;
        this.wN = yFl.tN;
        this.f10436vc = yFl.AlY;
        allowCoreThreadTimeOut(yFl.f10438vc);
        this.Sg = yFl.qsH;
        this.tN = yFl.NjR;
        this.DSW = yFl.f10437nc;
        if (DSW()) {
            final int i10 = this.tN + 4;
            this.qsH = new LinkedHashMap<String, com.bytedance.sdk.component.qsH.tN.YFl.YFl>(i10, 0.75f, true) { // from class: com.bytedance.sdk.component.qsH.tN.vc.1
                @Override // java.util.LinkedHashMap
                public boolean removeEldestEntry(Map.Entry<String, com.bytedance.sdk.component.qsH.tN.YFl.YFl> entry) {
                    return size() > i10;
                }
            };
        }
    }

    private void YFl(Runnable runnable, Throwable th2) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Handler tN = tN.tN();
                if (tN != null) {
                    tN.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable th3) {
            YoT.YFl("PAGThreadPoolExecutor", "try exc failed", th3);
        }
    }

    private void YFl(Sg sg2) {
        LinkedHashMap<String, com.bytedance.sdk.component.qsH.tN.YFl.YFl> linkedHashMap = this.qsH;
        if (linkedHashMap != null) {
            com.bytedance.sdk.component.qsH.tN.YFl.YFl yFl = linkedHashMap.get(sg2.Sg());
            if (yFl == null) {
                synchronized (linkedHashMap) {
                    yFl = linkedHashMap.get(sg2.Sg());
                    if (yFl == null) {
                        yFl = new com.bytedance.sdk.component.qsH.tN.YFl.YFl();
                        linkedHashMap.put(sg2.Sg(), yFl);
                    }
                }
            }
            yFl.YFl(sg2);
        }
    }

    public LinkedHashMap<String, com.bytedance.sdk.component.qsH.tN.YFl.YFl> YFl() {
        return this.qsH;
    }
}
