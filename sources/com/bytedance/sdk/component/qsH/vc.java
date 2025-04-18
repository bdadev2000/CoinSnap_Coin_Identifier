package com.bytedance.sdk.component.qsH;

import com.bytedance.sdk.component.qsH.YFl;
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
public class vc extends wN {
    private static volatile ThreadPoolExecutor DSW;
    private static volatile ThreadPoolExecutor NjR;
    public static tN Sg;
    private static volatile ScheduledExecutorService eT;

    /* renamed from: nc, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f10439nc;
    private static volatile ThreadPoolExecutor qsH;

    /* renamed from: vc, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f10440vc;
    private static volatile ThreadPoolExecutor wN;
    public static final int YFl = Runtime.getRuntime().availableProcessors();
    public static int tN = 120;
    public static boolean AlY = true;

    public static ExecutorService AlY() {
        if (qsH == null) {
            synchronized (vc.class) {
                if (qsH == null) {
                    YFl YFl2 = new YFl.C0090YFl().YFl("log").Sg(10).YFl(4).YFl(20L).YFl(TimeUnit.SECONDS).YFl(new PriorityBlockingQueue()).YFl(qsH()).YFl(wN.YFl().createThreadFactory(10, "log")).YFl();
                    qsH = YFl2;
                    YFl2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return qsH;
    }

    public static boolean DSW() {
        return AlY;
    }

    public static tN NjR() {
        return Sg;
    }

    public static ExecutorService Sg() {
        if (wN == null) {
            synchronized (vc.class) {
                if (wN == null) {
                    wN = new YFl.C0090YFl().YFl("init").YFl(0).Sg(10).YFl(5L).YFl(TimeUnit.SECONDS).YFl(new SynchronousQueue()).YFl(qsH()).YFl(wN.YFl().createThreadFactory(10, "init")).YFl();
                }
            }
        }
        return wN;
    }

    public static void YFl(qsH qsh) {
        if (wN == null) {
            Sg();
        }
        if (qsh == null || wN == null) {
            return;
        }
        wN.execute(qsh);
    }

    public static ExecutorService nc() {
        if (NjR == null) {
            synchronized (vc.class) {
                if (NjR == null) {
                    YFl YFl2 = new YFl.C0090YFl().YFl("computation").YFl(3).Sg(10).YFl(20L).YFl(TimeUnit.SECONDS).YFl(new PriorityBlockingQueue()).YFl(qsH()).YFl(wN.YFl().createThreadFactory(10, "computation")).YFl();
                    NjR = YFl2;
                    YFl2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return NjR;
    }

    public static RejectedExecutionHandler qsH() {
        return new RejectedExecutionHandler() { // from class: com.bytedance.sdk.component.qsH.vc.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    public static ExecutorService tN() {
        return YFl(10);
    }

    public static ScheduledExecutorService vc() {
        if (eT == null) {
            synchronized (vc.class) {
                if (eT == null) {
                    eT = Executors.newSingleThreadScheduledExecutor(wN.YFl().createThreadFactory(5, "scheduled"));
                }
            }
        }
        return eT;
    }

    public static ExecutorService wN() {
        if (f10439nc == null) {
            synchronized (vc.class) {
                if (f10439nc == null) {
                    YFl YFl2 = new YFl.C0090YFl().YFl("aidl").Sg(10).YFl(2).YFl(30L).YFl(TimeUnit.SECONDS).YFl(new PriorityBlockingQueue()).YFl(qsH()).YFl(wN.YFl().createThreadFactory(10, "aidl")).YFl();
                    f10439nc = YFl2;
                    YFl2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f10439nc;
    }

    public static void tN(qsH qsh) {
        if (qsH == null) {
            AlY();
        }
        if (qsh == null || qsH == null) {
            return;
        }
        qsH.execute(qsh);
    }

    public static ExecutorService YFl(int i10) {
        if (f10440vc == null) {
            synchronized (vc.class) {
                if (f10440vc == null) {
                    YFl YFl2 = new YFl.C0090YFl().YFl("io").YFl(2).Sg(i10).YFl(20L).YFl(TimeUnit.SECONDS).YFl(new LinkedBlockingQueue()).YFl(qsH()).YFl(wN.YFl().createThreadFactory(i10, "io")).YFl();
                    f10440vc = YFl2;
                    YFl2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f10440vc;
    }

    public static void tN(qsH qsh, int i10) {
        if (qsh != null) {
            qsh.setPriority(i10);
        }
        AlY(qsh);
    }

    public static void tN(int i10) {
        tN = i10;
    }

    public static void Sg(qsH qsh) {
        if (f10440vc == null) {
            tN();
        }
        if (f10440vc != null) {
            f10440vc.execute(qsh);
        }
    }

    public static void AlY(qsH qsh) {
        if (f10439nc == null) {
            wN();
        }
        if (qsh == null || f10439nc == null) {
            return;
        }
        f10439nc.execute(qsh);
    }

    public static void wN(qsH qsh) {
        if (DSW == null) {
            Sg(5);
        }
        if (qsh == null || DSW == null) {
            return;
        }
        DSW.execute(qsh);
    }

    public static void Sg(qsH qsh, int i10) {
        if (qsh != null) {
            qsh.setPriority(i10);
        }
        tN(qsh);
    }

    public static void YFl(qsH qsh, int i10) {
        Sg(qsh);
    }

    public static ExecutorService Sg(int i10) {
        if (DSW == null) {
            synchronized (vc.class) {
                if (DSW == null) {
                    YFl YFl2 = new YFl.C0090YFl().YFl("ad").YFl(2).Sg(i10).YFl(20L).YFl(TimeUnit.SECONDS).YFl(new LinkedBlockingQueue()).YFl(qsH()).YFl(wN.YFl().createThreadFactory(i10, "ad")).YFl();
                    DSW = YFl2;
                    YFl2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return DSW;
    }

    public static void YFl(qsH qsh, int i10, int i11) {
        if (f10440vc == null) {
            YFl(i11);
        }
        if (qsh == null || f10440vc == null) {
            return;
        }
        qsh.setPriority(i10);
        f10440vc.execute(qsh);
    }

    public static void YFl(boolean z10) {
        AlY = z10;
    }

    public static void YFl(tN tNVar) {
        Sg = tNVar;
    }
}
