package com.bytedance.sdk.component.HWF.zp.lMd;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.HWF.zp.COT;
import com.bytedance.sdk.component.HWF.zp.ku;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class jU {
    private final Comparator<com.bytedance.sdk.component.HWF.zp.jU.zp> Bj;
    private volatile com.bytedance.sdk.component.HWF.zp.lMd.KS.KS YW;
    private volatile Handler dT;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.HWF.zp.jU.zp> vDp;
    public static final jU zp = new jU();
    public static final com.bytedance.sdk.component.HWF.zp.lMd.zp.zp jU = new com.bytedance.sdk.component.HWF.zp.lMd.zp.zp();
    public static final AtomicLong COT = new AtomicLong(0);
    public static final AtomicLong HWF = new AtomicLong(0);
    public static final long QR = System.currentTimeMillis();
    public static long ku = 0;
    public volatile boolean lMd = false;
    public volatile boolean KS = false;

    private jU() {
        Comparator<com.bytedance.sdk.component.HWF.zp.jU.zp> comparator = new Comparator<com.bytedance.sdk.component.HWF.zp.jU.zp>() { // from class: com.bytedance.sdk.component.HWF.zp.lMd.jU.1
            @Override // java.util.Comparator
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.HWF.zp.jU.zp zpVar, com.bytedance.sdk.component.HWF.zp.jU.zp zpVar2) {
                return jU.this.zp(zpVar, zpVar2);
            }
        };
        this.Bj = comparator;
        this.vDp = new PriorityBlockingQueue<>(8, comparator);
    }

    public void COT() {
        com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(jU.fRl(), 1);
        final com.bytedance.sdk.component.HWF.zp.lMd.KS.KS ks = this.YW;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            COT KVG = ku.QR().KVG();
            if (KVG != null) {
                Executor jU2 = KVG.jU();
                if (jU2 == null) {
                    jU2 = KVG.COT();
                }
                if (jU2 != null) {
                    jU2.execute(new com.bytedance.sdk.component.HWF.zp.COT.COT("flush") { // from class: com.bytedance.sdk.component.HWF.zp.lMd.jU.3
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.HWF.zp.lMd.KS.KS ks2 = ks;
                            if (ks2 != null) {
                                ks2.KS(2);
                            }
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        if (ks != null) {
            ks.KS(2);
        }
    }

    public void KS() {
        if (this.YW != null && this.YW.isAlive()) {
            synchronized (this) {
                try {
                    if (this.YW != null && this.YW.isAlive()) {
                        if (this.dT != null) {
                            this.dT.removeCallbacksAndMessages(null);
                        }
                        this.YW.zp(false);
                        this.YW.quitSafely();
                        this.YW = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean jU() {
        try {
            if (this.YW == null && !com.bytedance.sdk.component.HWF.zp.lMd.lMd()) {
                synchronized (this) {
                    if (this.YW == null) {
                        this.YW = new com.bytedance.sdk.component.HWF.zp.lMd.KS.KS(this.vDp);
                        this.YW.start();
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public void lMd() {
        jU();
        COT();
    }

    public PriorityBlockingQueue<com.bytedance.sdk.component.HWF.zp.jU.zp> zp() {
        return this.vDp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int zp(com.bytedance.sdk.component.HWF.zp.jU.zp zpVar, com.bytedance.sdk.component.HWF.zp.jU.zp zpVar2) {
        long j7;
        long j9;
        long j10;
        long j11;
        if (zpVar == null) {
            return zpVar2 == null ? 0 : -1;
        }
        if (zpVar2 == null) {
            return 1;
        }
        if (zpVar.COT() == zpVar2.COT()) {
            if (zpVar.zp() != null) {
                j7 = zpVar.zp().zp();
                j9 = zpVar.zp().lMd();
            } else {
                j7 = 0;
                j9 = 0;
            }
            if (zpVar2.zp() != null) {
                j11 = zpVar2.zp().zp();
                j10 = zpVar2.zp().lMd();
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j7 == 0 || j11 == 0) {
                return 0;
            }
            long j12 = j7 - j11;
            if (Math.abs(j12) > 2147483647L) {
                return 0;
            }
            if (j12 != 0) {
                return (int) j12;
            }
            if (j9 == 0 || j10 == 0) {
                return 0;
            }
            return (int) (j9 - j10);
        }
        return zpVar.COT() - zpVar2.COT();
    }

    public void zp(Handler handler) {
        this.dT = handler;
    }

    public void zp(com.bytedance.sdk.component.HWF.zp.jU.zp zpVar, int i9) {
        jU();
        COT KVG = ku.QR().KVG();
        com.bytedance.sdk.component.HWF.zp.lMd.KS.KS ks = this.YW;
        if (ks != null) {
            zp(KVG, zpVar);
            ks.zp(zpVar, zpVar.COT() == 4);
        }
    }

    private void zp(final COT cot, com.bytedance.sdk.component.HWF.zp.jU.zp zpVar) {
        if (cot != null) {
            try {
                if (cot.QR()) {
                    final long lMd = (zpVar == null || zpVar.zp() == null) ? 0L : zpVar.zp().lMd();
                    if (lMd == 1) {
                        ku = System.currentTimeMillis();
                    }
                    AtomicLong fs = jU.fs();
                    com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(fs, 1);
                    if (fs.get() == 200) {
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            Executor jU2 = cot.jU();
                            if (jU2 == null) {
                                jU2 = cot.COT();
                            }
                            if (jU2 != null) {
                                jU2.execute(new com.bytedance.sdk.component.HWF.zp.COT.COT("report") { // from class: com.bytedance.sdk.component.HWF.zp.lMd.jU.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        jU.this.zp(cot, lMd);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        zp(cot, lMd);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(COT cot, long j7) {
        com.bytedance.sdk.component.HWF.zp.lMd.KS.KS ks = this.YW;
        if (cot == null || ks == null) {
            return;
        }
        com.bytedance.sdk.component.HWF.zp.lMd.zp.zp zpVar = jU;
        ks.zp(cot.zp(zpVar.lMd(j7)), true);
        zpVar.Rg();
    }
}
