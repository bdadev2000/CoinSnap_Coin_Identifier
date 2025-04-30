package com.bytedance.sdk.component.ku;

import com.bytedance.sdk.component.ku.zp;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class HWF extends COT {
    private static volatile ScheduledExecutorService Bj;
    private static volatile ThreadPoolExecutor COT;
    private static volatile ThreadPoolExecutor HWF;
    private static volatile ThreadPoolExecutor QR;
    private static volatile ThreadPoolExecutor YW;
    private static volatile ThreadPoolExecutor dT;
    private static volatile ThreadPoolExecutor ku;
    public static KS lMd;
    public static final int zp = Runtime.getRuntime().availableProcessors();
    public static int KS = 120;
    public static boolean jU = true;

    public static ExecutorService COT() {
        if (dT == null) {
            synchronized (HWF.class) {
                try {
                    if (dT == null) {
                        zp zp2 = new zp.C0087zp().zp("aidl").lMd(10).zp(2).zp(30L).zp(TimeUnit.SECONDS).zp(new PriorityBlockingQueue()).zp(ku()).zp(COT.zp().createThreadFactory(10, "aidl")).zp();
                        dT = zp2;
                        zp2.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return dT;
    }

    public static ScheduledExecutorService HWF() {
        if (Bj == null) {
            synchronized (HWF.class) {
                try {
                    if (Bj == null) {
                        Bj = Executors.newSingleThreadScheduledExecutor(COT.zp().createThreadFactory(5, "scheduled"));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Bj;
    }

    public static ExecutorService KS() {
        return zp(10);
    }

    public static boolean QR() {
        return jU;
    }

    public static KS YW() {
        return lMd;
    }

    public static ExecutorService dT() {
        if (YW == null) {
            synchronized (HWF.class) {
                try {
                    if (YW == null) {
                        zp zp2 = new zp.C0087zp().zp("computation").zp(3).lMd(10).zp(20L).zp(TimeUnit.SECONDS).zp(new PriorityBlockingQueue()).zp(ku()).zp(COT.zp().createThreadFactory(10, "computation")).zp();
                        YW = zp2;
                        zp2.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return YW;
    }

    public static ExecutorService jU() {
        if (ku == null) {
            synchronized (HWF.class) {
                try {
                    if (ku == null) {
                        zp zp2 = new zp.C0087zp().zp("log").lMd(10).zp(4).zp(20L).zp(TimeUnit.SECONDS).zp(new PriorityBlockingQueue()).zp(ku()).zp(COT.zp().createThreadFactory(10, "log")).zp();
                        ku = zp2;
                        zp2.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ku;
    }

    public static RejectedExecutionHandler ku() {
        return new RejectedExecutionHandler() { // from class: com.bytedance.sdk.component.ku.HWF.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    public static ExecutorService lMd() {
        if (COT == null) {
            synchronized (HWF.class) {
                try {
                    if (COT == null) {
                        COT = new zp.C0087zp().zp("init").zp(0).lMd(10).zp(5L).zp(TimeUnit.SECONDS).zp(new SynchronousQueue()).zp(ku()).zp(COT.zp().createThreadFactory(10, "init")).zp();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return COT;
    }

    public static void zp(ku kuVar) {
        if (COT == null) {
            lMd();
        }
        if (kuVar == null || COT == null) {
            return;
        }
        COT.execute(kuVar);
    }

    public static void KS(ku kuVar) {
        if (ku == null) {
            jU();
        }
        if (kuVar == null || ku == null) {
            return;
        }
        ku.execute(kuVar);
    }

    public static ExecutorService zp(int i9) {
        if (HWF == null) {
            synchronized (HWF.class) {
                try {
                    if (HWF == null) {
                        zp zp2 = new zp.C0087zp().zp("io").zp(2).lMd(i9).zp(20L).zp(TimeUnit.SECONDS).zp(new LinkedBlockingQueue()).zp(ku()).zp(COT.zp().createThreadFactory(i9, "io")).zp();
                        HWF = zp2;
                        zp2.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return HWF;
    }

    public static void KS(ku kuVar, int i9) {
        if (kuVar != null) {
            kuVar.setPriority(i9);
        }
        jU(kuVar);
    }

    public static void KS(int i9) {
        KS = i9;
    }

    public static void lMd(ku kuVar) {
        if (HWF == null) {
            KS();
        }
        if (HWF != null) {
            HWF.execute(kuVar);
        }
    }

    public static void COT(ku kuVar) {
        if (QR == null) {
            lMd(5);
        }
        if (kuVar == null || QR == null) {
            return;
        }
        QR.execute(kuVar);
    }

    public static void jU(ku kuVar) {
        if (dT == null) {
            COT();
        }
        if (kuVar == null || dT == null) {
            return;
        }
        dT.execute(kuVar);
    }

    public static void lMd(ku kuVar, int i9) {
        if (kuVar != null) {
            kuVar.setPriority(i9);
        }
        KS(kuVar);
    }

    public static void zp(ku kuVar, int i9) {
        lMd(kuVar);
    }

    public static ExecutorService lMd(int i9) {
        if (QR == null) {
            synchronized (HWF.class) {
                try {
                    if (QR == null) {
                        zp zp2 = new zp.C0087zp().zp("ad").zp(2).lMd(i9).zp(20L).zp(TimeUnit.SECONDS).zp(new LinkedBlockingQueue()).zp(ku()).zp(COT.zp().createThreadFactory(i9, "ad")).zp();
                        QR = zp2;
                        zp2.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return QR;
    }

    public static void zp(ku kuVar, int i9, int i10) {
        if (HWF == null) {
            zp(i10);
        }
        if (kuVar == null || HWF == null) {
            return;
        }
        kuVar.setPriority(i9);
        HWF.execute(kuVar);
    }

    public static void zp(boolean z8) {
        jU = z8;
    }

    public static void zp(KS ks) {
        lMd = ks;
    }
}
