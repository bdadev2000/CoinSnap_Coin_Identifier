package com.bytedance.sdk.component.ku.KS;

import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.utils.tG;
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
public class HWF extends ThreadPoolExecutor {
    private int COT;
    private int HWF;
    private int KS;
    private boolean QR;
    private int jU;
    private LinkedHashMap<String, com.bytedance.sdk.component.ku.KS.zp.zp> ku;
    private int lMd;
    private final String zp;

    /* loaded from: classes.dex */
    public static class zp {
        private String zp = "cache";
        private int lMd = 4;
        private int KS = 100;
        private int jU = 0;
        private long COT = 30000;
        private boolean HWF = false;
        private TimeUnit QR = TimeUnit.MILLISECONDS;
        private int ku = -1;
        private int YW = 20;
        private boolean dT = false;
        private BlockingQueue<Runnable> Bj = new PriorityBlockingQueue();
        private ThreadFactory vDp = null;

        public zp COT(int i9) {
            this.ku = i9;
            return this;
        }

        public zp KS(int i9) {
            this.jU = i9;
            return this;
        }

        public zp jU(int i9) {
            this.YW = i9;
            return this;
        }

        public zp lMd(int i9) {
            this.KS = i9;
            return this;
        }

        public zp zp(String str) {
            this.zp = str;
            return this;
        }

        public zp lMd(boolean z8) {
            this.dT = z8;
            return this;
        }

        public zp zp(int i9) {
            this.lMd = i9;
            return this;
        }

        public zp zp(long j7) {
            this.COT = j7;
            return this;
        }

        public zp zp(boolean z8) {
            this.HWF = z8;
            return this;
        }

        public HWF zp() {
            if (this.vDp == null) {
                this.vDp = new jU(this.zp);
            }
            if (this.lMd < 0) {
                this.lMd = 8;
            }
            if (this.lMd == 0) {
                this.Bj = new SynchronousQueue();
            }
            if (this.Bj == null) {
                this.Bj = new LinkedBlockingQueue();
            }
            if (this.KS > 100) {
                this.KS = 100;
            }
            int i9 = this.KS;
            int i10 = this.lMd;
            if (i9 < i10) {
                this.KS = i10;
            }
            if (this.YW < 0) {
                this.YW = 20;
            }
            if (this.YW > 100) {
                this.YW = 100;
            }
            return new HWF(this);
        }
    }

    private void COT() {
        try {
            if (this.jU != 0 && getCorePoolSize() > this.jU && getQueue().size() == 0) {
                setCorePoolSize(this.jU);
            }
        } catch (Exception e4) {
            e4.getMessage();
        }
    }

    private void HWF() {
        if (getCompletedTaskCount() > this.lMd) {
            COT zp2 = KS.zp();
            if (zp2 != null) {
                zp2.zp(this);
            }
            this.lMd = -1;
        }
    }

    private boolean QR() {
        if (this.lMd > 0) {
            return true;
        }
        return false;
    }

    private void jU() {
        try {
            if (this.jU != 0 && getCorePoolSize() < this.COT) {
                int size = getQueue().size();
                if (getActiveCount() >= this.jU && size >= this.HWF) {
                    setCorePoolSize(this.COT);
                }
            }
        } catch (Exception e4) {
            e4.getMessage();
        }
    }

    public boolean KS() {
        return this.QR;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        boolean z8 = runnable instanceof lMd;
        if (z8) {
            ((lMd) runnable).KS(SystemClock.elapsedRealtime());
            try {
                if (QR() && this.ku != null) {
                    zp((lMd) runnable);
                    HWF();
                }
            } catch (Exception e4) {
                tG.zp("PAGThreadPoolExecutor", e4.getMessage());
            }
        }
        super.afterExecute(runnable, th);
        if (z8) {
            lMd lmd = (lMd) runnable;
            lmd.lMd();
            lmd.zp();
            lmd.KS();
            lmd.jU();
            lmd.COT();
        }
        COT();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof lMd) {
            ((lMd) runnable).lMd(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.ku.KS.zp lMd;
        if (!(runnable instanceof lMd)) {
            runnable = new lMd(AppLovinMediationProvider.UNKNOWN, runnable) { // from class: com.bytedance.sdk.component.ku.KS.HWF.3
                @Override // java.lang.Runnable
                public void run() {
                    Runnable ku = ku();
                    if (ku != null) {
                        ku.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.zp)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(jU.zp(this.zp)) && (lMd = KS.lMd()) != null) {
                lMd.zp(this, (lMd) runnable);
            }
        }
        ((lMd) runnable).zp(SystemClock.elapsedRealtime());
        super.execute(runnable);
        jU();
    }

    public String lMd() {
        return this.zp;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.zp)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if ("aidl".equals(this.zp)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int i9;
        String str;
        runnable.getClass();
        final RunnableFuture newTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof lMd) {
            lMd lmd = (lMd) runnable;
            i9 = lmd.zp();
            str = lmd.lMd();
        } else {
            i9 = 6;
            str = "";
        }
        if (i9 == 0 || TextUtils.isEmpty(str)) {
            new RuntimeException();
        }
        execute(new lMd(i9, str) { // from class: com.bytedance.sdk.component.ku.KS.HWF.2
            @Override // java.lang.Runnable
            public void run() {
                newTaskFor.run();
            }
        });
        return newTaskFor;
    }

    public void zp(zp zpVar) {
        try {
            if (zpVar.lMd >= 0 && this.jU != zpVar.lMd) {
                int i9 = zpVar.lMd;
                this.jU = i9;
                setCorePoolSize(i9);
            }
            this.COT = zpVar.KS;
            this.HWF = zpVar.jU;
            allowCoreThreadTimeOut(zpVar.HWF);
            this.lMd = zpVar.ku;
            this.KS = zpVar.YW;
            this.QR = zpVar.dT;
        } catch (Throwable th) {
            tG.zp("PAGThreadPoolExecutor", th.getMessage());
        }
        String unused = zpVar.zp;
        int unused2 = zpVar.lMd;
        int unused3 = zpVar.KS;
        long unused4 = zpVar.COT;
        int unused5 = zpVar.jU;
        int unused6 = zpVar.YW;
        boolean unused7 = zpVar.dT;
        BlockingQueue unused8 = zpVar.Bj;
    }

    private HWF(zp zpVar) {
        super(zpVar.lMd, Integer.MAX_VALUE, zpVar.COT, zpVar.QR, (BlockingQueue<Runnable>) zpVar.Bj, zpVar.vDp);
        this.QR = false;
        String unused = zpVar.zp;
        int unused2 = zpVar.lMd;
        int unused3 = zpVar.KS;
        long unused4 = zpVar.COT;
        int unused5 = zpVar.jU;
        int unused6 = zpVar.YW;
        boolean unused7 = zpVar.dT;
        BlockingQueue unused8 = zpVar.Bj;
        this.zp = zpVar.zp;
        this.jU = zpVar.lMd;
        this.COT = zpVar.KS;
        this.HWF = zpVar.jU;
        allowCoreThreadTimeOut(zpVar.HWF);
        this.lMd = zpVar.ku;
        this.KS = zpVar.YW;
        this.QR = zpVar.dT;
        if (QR()) {
            final int i9 = this.KS + 4;
            this.ku = new LinkedHashMap<String, com.bytedance.sdk.component.ku.KS.zp.zp>(i9, 0.75f, true) { // from class: com.bytedance.sdk.component.ku.KS.HWF.1
                @Override // java.util.LinkedHashMap
                public boolean removeEldestEntry(Map.Entry<String, com.bytedance.sdk.component.ku.KS.zp.zp> entry) {
                    if (size() > i9) {
                        return true;
                    }
                    return false;
                }
            };
        }
    }

    private void zp(lMd lmd) {
        LinkedHashMap<String, com.bytedance.sdk.component.ku.KS.zp.zp> linkedHashMap = this.ku;
        if (linkedHashMap != null) {
            com.bytedance.sdk.component.ku.KS.zp.zp zpVar = linkedHashMap.get(lmd.lMd());
            if (zpVar == null) {
                synchronized (linkedHashMap) {
                    try {
                        zpVar = linkedHashMap.get(lmd.lMd());
                        if (zpVar == null) {
                            zpVar = new com.bytedance.sdk.component.ku.KS.zp.zp();
                            linkedHashMap.put(lmd.lMd(), zpVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            zpVar.zp(lmd);
        }
    }

    public LinkedHashMap<String, com.bytedance.sdk.component.ku.KS.zp.zp> zp() {
        return this.ku;
    }
}
