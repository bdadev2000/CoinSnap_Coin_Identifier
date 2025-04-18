package com.bytedance.sdk.component.vc.YFl.Sg;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.vc.YFl.qsH;
import com.bytedance.sdk.component.vc.YFl.wN;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class AlY {
    private volatile com.bytedance.sdk.component.vc.YFl.Sg.tN.tN NjR;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YoT;
    private final Comparator<com.bytedance.sdk.component.vc.YFl.AlY.YFl> eT;

    /* renamed from: nc, reason: collision with root package name */
    private volatile Handler f10449nc;
    public static final AlY YFl = new AlY();
    public static final com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl AlY = new com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl();
    public static final AtomicLong wN = new AtomicLong(0);

    /* renamed from: vc, reason: collision with root package name */
    public static final AtomicLong f10448vc = new AtomicLong(0);
    public static final long DSW = System.currentTimeMillis();
    public static long qsH = 0;
    public volatile boolean Sg = false;
    public volatile boolean tN = false;

    private AlY() {
        Comparator<com.bytedance.sdk.component.vc.YFl.AlY.YFl> comparator = new Comparator<com.bytedance.sdk.component.vc.YFl.AlY.YFl>() { // from class: com.bytedance.sdk.component.vc.YFl.Sg.AlY.1
            @Override // java.util.Comparator
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl, com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl2) {
                return AlY.this.YFl(yFl, yFl2);
            }
        };
        this.eT = comparator;
        this.YoT = new PriorityBlockingQueue<>(8, comparator);
    }

    public boolean AlY() {
        try {
            if (this.NjR == null && !com.bytedance.sdk.component.vc.YFl.Sg.Sg()) {
                synchronized (this) {
                    if (this.NjR == null) {
                        this.NjR = new com.bytedance.sdk.component.vc.YFl.Sg.tN.tN(this.YoT);
                        this.NjR.start();
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th2) {
            th2.getMessage();
            return false;
        }
    }

    public void Sg() {
        AlY();
        wN();
    }

    public void tN() {
        if (this.NjR != null && this.NjR.isAlive()) {
            synchronized (this) {
                if (this.NjR != null && this.NjR.isAlive()) {
                    if (this.f10449nc != null) {
                        this.f10449nc.removeCallbacksAndMessages(null);
                    }
                    this.NjR.YFl(false);
                    this.NjR.quitSafely();
                    this.NjR = null;
                }
            }
        }
    }

    public void wN() {
        com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(AlY.Sco(), 1);
        final com.bytedance.sdk.component.vc.YFl.Sg.tN.tN tNVar = this.NjR;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            wN rkt = qsH.DSW().rkt();
            if (rkt != null) {
                Executor AlY2 = rkt.AlY();
                if (AlY2 == null) {
                    AlY2 = rkt.wN();
                }
                if (AlY2 != null) {
                    AlY2.execute(new com.bytedance.sdk.component.vc.YFl.wN.wN("flush") { // from class: com.bytedance.sdk.component.vc.YFl.Sg.AlY.3
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.vc.YFl.Sg.tN.tN tNVar2 = tNVar;
                            if (tNVar2 != null) {
                                tNVar2.tN(2);
                            }
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        if (tNVar != null) {
            tNVar.tN(2);
        }
    }

    public PriorityBlockingQueue<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl() {
        return this.YoT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int YFl(com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl, com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl2) {
        long j3;
        long j10;
        long j11;
        long j12;
        if (yFl == null) {
            return yFl2 == null ? 0 : -1;
        }
        if (yFl2 == null) {
            return 1;
        }
        if (yFl.wN() == yFl2.wN()) {
            if (yFl.YFl() != null) {
                j3 = yFl.YFl().YFl();
                j10 = yFl.YFl().Sg();
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (yFl2.YFl() != null) {
                j12 = yFl2.YFl().YFl();
                j11 = yFl2.YFl().Sg();
            } else {
                j11 = 0;
                j12 = 0;
            }
            if (j3 == 0 || j12 == 0) {
                return 0;
            }
            long j13 = j3 - j12;
            if (Math.abs(j13) > 2147483647L) {
                return 0;
            }
            if (j13 != 0) {
                return (int) j13;
            }
            if (j10 == 0 || j11 == 0) {
                return 0;
            }
            return (int) (j10 - j11);
        }
        return yFl.wN() - yFl2.wN();
    }

    public void YFl(Handler handler) {
        this.f10449nc = handler;
    }

    public void YFl(com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl, int i10) {
        AlY();
        wN rkt = qsH.DSW().rkt();
        com.bytedance.sdk.component.vc.YFl.Sg.tN.tN tNVar = this.NjR;
        if (tNVar != null) {
            YFl(rkt, yFl);
            tNVar.YFl(yFl, yFl.wN() == 4);
        }
    }

    private void YFl(final wN wNVar, com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl) {
        if (wNVar != null) {
            try {
                if (wNVar.DSW()) {
                    final long Sg = (yFl == null || yFl.YFl() == null) ? 0L : yFl.YFl().Sg();
                    if (Sg == 1) {
                        qsH = System.currentTimeMillis();
                    }
                    AtomicLong ib2 = AlY.ib();
                    com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(ib2, 1);
                    if (ib2.get() == 200) {
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            Executor AlY2 = wNVar.AlY();
                            if (AlY2 == null) {
                                AlY2 = wNVar.wN();
                            }
                            if (AlY2 != null) {
                                AlY2.execute(new com.bytedance.sdk.component.vc.YFl.wN.wN("report") { // from class: com.bytedance.sdk.component.vc.YFl.Sg.AlY.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        AlY.this.YFl(wNVar, Sg);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        YFl(wNVar, Sg);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(wN wNVar, long j3) {
        com.bytedance.sdk.component.vc.YFl.Sg.tN.tN tNVar = this.NjR;
        if (wNVar == null || tNVar == null) {
            return;
        }
        com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl yFl = AlY;
        tNVar.YFl(wNVar.YFl(yFl.Sg(j3)), true);
        yFl.ko();
    }
}
