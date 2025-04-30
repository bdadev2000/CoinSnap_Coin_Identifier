package com.bytedance.sdk.component.HWF.zp.lMd.KS;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.sdk.component.HWF.zp.COT;
import com.bytedance.sdk.component.HWF.zp.ku;
import com.bytedance.sdk.component.HWF.zp.zp.jU;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KS extends HandlerThread implements Handler.Callback {
    private static int vwr = 200;
    private static int woN = 10;
    private final long Bj;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.HWF.zp.jU.zp> COT;
    private final int FP;
    private volatile int HWF;
    private final Object KS;
    private final AtomicInteger KVG;
    private volatile long QR;
    private final AtomicInteger YW;
    private final int cz;
    private final AtomicInteger dQp;
    private final long dT;
    private com.bytedance.sdk.component.HWF.zp.lMd.KS jU;
    private volatile long ku;
    private volatile boolean lMd;
    private final int pvr;
    private final List<com.bytedance.sdk.component.HWF.zp.jU.zp> rV;
    private volatile Handler tG;
    private final AtomicInteger vDp;
    protected jU zp;

    public KS(PriorityBlockingQueue<com.bytedance.sdk.component.HWF.zp.jU.zp> priorityBlockingQueue) {
        super("csj_log");
        this.lMd = true;
        this.KS = new Object();
        this.QR = 0L;
        this.ku = 0L;
        this.YW = new AtomicInteger(0);
        this.dT = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
        this.Bj = 5000000000L;
        this.vDp = new AtomicInteger(0);
        this.rV = new ArrayList();
        this.dQp = new AtomicInteger(0);
        this.KVG = new AtomicInteger(0);
        this.pvr = 1;
        this.cz = 2;
        this.FP = 3;
        this.COT = priorityBlockingQueue;
        this.zp = new com.bytedance.sdk.component.HWF.zp.zp.lMd();
    }

    private void COT() {
        while (zp()) {
            try {
                com.bytedance.sdk.component.HWF.zp.lMd.zp.zp zpVar = com.bytedance.sdk.component.HWF.zp.lMd.jU.jU;
                com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(zpVar.ku(), 1);
                com.bytedance.sdk.component.HWF.zp.jU.zp poll = this.COT.poll(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, TimeUnit.MILLISECONDS);
                int size = this.COT.size();
                if (poll instanceof com.bytedance.sdk.component.HWF.zp.jU.lMd) {
                    zp(poll, size);
                } else if (poll == null) {
                    int incrementAndGet = this.YW.incrementAndGet();
                    com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(zpVar.aax(), 1);
                    if (jU(incrementAndGet)) {
                        HWF();
                        return;
                    } else if (incrementAndGet < 4) {
                        this.HWF = 1;
                        lMd((com.bytedance.sdk.component.HWF.zp.jU.zp) null);
                    }
                } else {
                    zp(poll);
                    lMd(poll);
                }
            } catch (Throwable th) {
                th.getMessage();
                com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.Pxi(), 1);
            }
        }
    }

    private void HWF() {
        com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.ot(), 1);
        zp(false);
        com.bytedance.sdk.component.HWF.zp.lMd.jU.zp.KS();
    }

    private void KS() {
        jU();
        com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.ffE(), 1);
        KS(1);
    }

    private void QR() {
        if (this.COT.size() >= 100) {
            for (int i9 = 0; i9 < 100; i9++) {
                com.bytedance.sdk.component.HWF.zp.jU.zp poll = this.COT.poll();
                if (!(poll instanceof com.bytedance.sdk.component.HWF.zp.jU.lMd) && poll != null) {
                    zp(poll);
                }
            }
        }
    }

    private void YW() {
        try {
            if (this.COT.size() == 0 && this.tG.hasMessages(11) && zp()) {
                zp(false);
            }
        } catch (Exception e4) {
            e4.getMessage();
        }
    }

    private void dT() {
        long nanoTime;
        com.bytedance.sdk.component.HWF.zp.lMd.jU jUVar;
        if (this.tG.hasMessages(11)) {
            YW();
        } else {
            COT(1);
        }
        com.bytedance.sdk.component.HWF.zp.lMd.zp.zp zpVar = com.bytedance.sdk.component.HWF.zp.lMd.jU.jU;
        com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(zpVar.lMd(), 1);
        if (this.HWF == 2) {
            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(zpVar.QR(), 1);
            synchronized (this.KS) {
                try {
                    try {
                        long nanoTime2 = System.nanoTime();
                        this.KS.wait(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
                        nanoTime = System.nanoTime() - nanoTime2;
                        jUVar = com.bytedance.sdk.component.HWF.zp.lMd.jU.zp;
                        if (!jUVar.lMd) {
                            boolean z8 = jUVar.KS;
                        }
                    } catch (InterruptedException e4) {
                        e4.getMessage();
                    }
                    if (nanoTime < 5000000000L && 5000000000L - nanoTime >= 50000000) {
                        if (!jUVar.lMd && !jUVar.KS) {
                            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(zpVar.eWG(), 1);
                            KS(2);
                            return;
                        }
                        com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(zpVar.Bj(), 1);
                        return;
                    }
                    com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(zpVar.dT(), 1);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void jU() {
        if (!isAlive()) {
            com.bytedance.sdk.component.HWF.zp.lMd.jU.zp.jU();
        } else {
            if (zp()) {
                return;
            }
            KS(6);
        }
    }

    private boolean ku() {
        if (com.bytedance.sdk.component.HWF.zp.lMd.jU.zp.lMd) {
            if (this.HWF == 4 || this.HWF == 7 || this.HWF == 6 || this.HWF == 5 || this.HWF == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i9 = message.what;
        try {
        } catch (Throwable th) {
            th.getMessage();
        }
        if (i9 != 1) {
            if (i9 != 2 && i9 != 3) {
                if (i9 == 11) {
                    ArrayList arrayList = new ArrayList(this.rV);
                    this.rV.clear();
                    zp((List<com.bytedance.sdk.component.HWF.zp.jU.zp>) arrayList, false, "timeout_dispatch");
                    dT();
                }
                return true;
            }
            KS();
        } else {
            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.YW(), 1);
            lMd();
            zp(true);
            COT();
        }
        return true;
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        super.onLooperPrepared();
        this.tG = new Handler(getLooper(), this);
        com.bytedance.sdk.component.HWF.zp.lMd.jU.zp.zp(this.tG);
        this.tG.sendEmptyMessage(1);
    }

    public static void lMd(int i9) {
        vwr = i9;
    }

    private void lMd() {
        long woN2 = ku.QR().woN();
        if (woN2 <= 0) {
            return;
        }
        this.zp.zp(Integer.MAX_VALUE, woN2);
    }

    public static void zp(int i9) {
        woN = i9;
    }

    public void KS(int i9) {
        try {
            boolean zp = zp(i9, com.bytedance.sdk.component.HWF.zp.lMd.jU.zp.lMd);
            if (i9 == 6 || zp) {
                com.bytedance.sdk.component.HWF.zp.jU.lMd lmd = new com.bytedance.sdk.component.HWF.zp.jU.lMd();
                lmd.lMd(i9);
                this.COT.add(lmd);
                COT(3);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private boolean jU(int i9) {
        if (i9 < 4 || this.vDp.get() != 0) {
            return false;
        }
        com.bytedance.sdk.component.HWF.zp.lMd.jU jUVar = com.bytedance.sdk.component.HWF.zp.lMd.jU.zp;
        return (jUVar.lMd || jUVar.KS) ? false : true;
    }

    private void lMd(com.bytedance.sdk.component.HWF.zp.jU.zp zpVar) {
        if (com.bytedance.sdk.component.HWF.zp.KS.zp.lMd() && ku.QR().zp()) {
            return;
        }
        int i9 = 0;
        if (ku()) {
            com.bytedance.sdk.component.HWF.zp.KS.zp.zp(this.HWF);
            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.vDp(), 1);
            if (this.COT.size() != 0) {
                return;
            }
            if (!this.tG.hasMessages(2)) {
                com.bytedance.sdk.component.HWF.zp.lMd.jU.zp.lMd = false;
                this.ku = 0L;
                this.QR = 0L;
                this.dQp.set(0);
                this.KVG.set(0);
            } else {
                zp(false);
                return;
            }
        }
        do {
            boolean zp = zp(this.HWF, com.bytedance.sdk.component.HWF.zp.lMd.jU.zp.lMd);
            com.bytedance.sdk.component.HWF.zp.KS.zp.zp(zp, this.HWF, zpVar);
            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.tG(), 1);
            if (zp) {
                List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp2 = this.zp.zp(this.HWF, -1, null);
                if (zp2 != null) {
                    zp2.size();
                    zp(zp2);
                } else {
                    YW();
                }
            } else {
                YW();
            }
            i9++;
            if (!zp) {
                return;
            }
        } while (i9 <= 6);
    }

    public void zp(boolean z8) {
        this.lMd = z8;
    }

    public boolean zp() {
        return this.lMd;
    }

    public boolean zp(int i9, boolean z8) {
        COT KVG = ku.QR().KVG();
        if (KVG == null || !KVG.zp(ku.QR().HWF())) {
            return false;
        }
        return this.zp.zp(i9, z8);
    }

    public void zp(com.bytedance.sdk.component.HWF.zp.jU.zp zpVar, boolean z8) {
        if (zpVar == null) {
            return;
        }
        zpVar.jU();
        if (z8) {
            if (this.tG != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(zpVar);
                zp((List<com.bytedance.sdk.component.HWF.zp.jU.zp>) arrayList, true, "ignore_result_dispatch");
                return;
            }
            return;
        }
        this.COT.add(zpVar);
        COT(2);
    }

    private void COT(int i9) {
        if (!zp()) {
            if (this.tG == null) {
                return;
            }
            com.bytedance.sdk.component.HWF.zp.lMd.zp.zp zpVar = com.bytedance.sdk.component.HWF.zp.lMd.jU.jU;
            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(zpVar.KS(), 1);
            if (this.tG.hasMessages(1)) {
                return;
            }
            if (i9 == 1) {
                com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(zpVar.HWF(), 1);
            } else if (i9 == 2) {
                com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(zpVar.jU(), 1);
            } else if (i9 == 3) {
                com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(zpVar.COT(), 1);
            }
            this.tG.sendEmptyMessage(1);
            return;
        }
        com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.zp(), 1);
    }

    private void zp(com.bytedance.sdk.component.HWF.zp.jU.zp zpVar, int i9) {
        this.YW.set(0);
        if (i9 == 0) {
            this.HWF = ((com.bytedance.sdk.component.HWF.zp.jU.lMd) zpVar).Bj();
            if (this.HWF != 6) {
                com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.Iv(), 1);
                lMd(zpVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.component.HWF.zp.jU.lMd lmd = (com.bytedance.sdk.component.HWF.zp.jU.lMd) zpVar;
        if (lmd.Bj() == 1) {
            this.HWF = 1;
            lMd(zpVar);
        } else if (lmd.Bj() == 2) {
            QR();
            this.HWF = 2;
            lMd(zpVar);
        }
    }

    private void lMd(List<com.bytedance.sdk.component.HWF.zp.jU.zp> list) {
        this.rV.addAll(list);
        this.rV.size();
        COT KVG = ku.QR().KVG();
        if (KVG != null && KVG.vDp() != null) {
            woN = KVG.vDp().lMd();
        }
        if (this.rV.size() >= woN) {
            if (this.tG.hasMessages(11)) {
                this.tG.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.rV);
            this.rV.clear();
            zp((List<com.bytedance.sdk.component.HWF.zp.jU.zp>) arrayList, false, "max_size_dispatch");
            dT();
            return;
        }
        if (this.COT.size() == 0) {
            zp(false);
            if (this.tG.hasMessages(11)) {
                this.tG.removeMessages(11);
            }
            if (this.tG.hasMessages(1)) {
                this.tG.removeMessages(1);
            }
            long j7 = vwr;
            if (KVG != null && KVG.vDp() != null) {
                j7 = KVG.vDp().zp();
            }
            this.tG.sendEmptyMessageDelayed(11, j7);
            return;
        }
        this.rV.size();
    }

    private void zp(com.bytedance.sdk.component.HWF.zp.jU.zp zpVar) {
        this.YW.set(0);
        com.bytedance.sdk.component.HWF.zp.lMd.jU jUVar = com.bytedance.sdk.component.HWF.zp.lMd.jU.zp;
        if (jUVar.lMd) {
            this.HWF = 5;
        } else if (jUVar.KS) {
            this.HWF = 7;
        } else {
            this.HWF = 4;
        }
        com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.rCC(), 1);
        this.zp.zp(zpVar, this.HWF);
        com.bytedance.sdk.component.HWF.zp.KS.zp.QR(zpVar);
    }

    private void zp(List<com.bytedance.sdk.component.HWF.zp.jU.zp> list, String str) {
        zp(str);
        zp(list, false, str);
        dT();
    }

    private void zp(List<com.bytedance.sdk.component.HWF.zp.jU.zp> list) {
        if (list.size() != 0) {
            com.bytedance.sdk.component.HWF.zp.KS.zp.zp(list, this.COT.size());
            if (list.size() <= 1 && !com.bytedance.sdk.component.HWF.zp.KS.zp.KS()) {
                com.bytedance.sdk.component.HWF.zp.jU.zp zpVar = list.get(0);
                if (zpVar != null) {
                    if (zpVar.COT() == 1) {
                        zp(list, "highPriority");
                        return;
                    }
                    if (zpVar.jU() == 0 && zpVar.COT() == 2) {
                        if (zpVar.lMd() == 3) {
                            zp(list, "version_v3");
                            return;
                        } else {
                            lMd(list);
                            return;
                        }
                    }
                    if (zpVar.jU() == 1) {
                        zp(list, "stats");
                        return;
                    } else if (zpVar.jU() == 3) {
                        zp(list, "adType_v3");
                        return;
                    } else {
                        if (zpVar.jU() == 2) {
                            zp(list, "other");
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            zp(list, "batchRead");
            return;
        }
        YW();
    }

    private void lMd(List<com.bytedance.sdk.component.HWF.zp.jU.zp> list, final boolean z8, final long j7) {
        this.vDp.incrementAndGet();
        com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.sqt(), 1);
        try {
            HashMap hashMap = new HashMap();
            Iterator<com.bytedance.sdk.component.HWF.zp.jU.zp> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.HWF.zp.jU.zp next = it.next();
                int dT = next == null ? 0 : next.dT();
                if (hashMap.get(Integer.valueOf(dT)) == null) {
                    hashMap.put(Integer.valueOf(dT), new ArrayList());
                }
                ((List) hashMap.get(Integer.valueOf(dT))).add(next);
            }
            for (Integer num : hashMap.keySet()) {
                if (num.intValue() != 0 && ku.QR().KS() != null && ku.QR().KS().get(num) != null) {
                    ku.QR().KS().get(num).zp(list, new com.bytedance.sdk.component.HWF.zp.lMd.lMd() { // from class: com.bytedance.sdk.component.HWF.zp.lMd.KS.KS.3
                        @Override // com.bytedance.sdk.component.HWF.zp.lMd.lMd
                        public void zp(List<zp> list2) {
                            try {
                                KS.this.vDp.decrementAndGet();
                                if (list2 != null && list2.size() != 0) {
                                    int size = list2.size();
                                    for (int i9 = 0; i9 < size; i9++) {
                                        zp zpVar = list2.get(i9);
                                        if (zpVar != null) {
                                            KS.this.zp(z8, zpVar.zp(), zpVar.lMd(), j7);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
                this.jU.zp(list, new com.bytedance.sdk.component.HWF.zp.lMd.lMd() { // from class: com.bytedance.sdk.component.HWF.zp.lMd.KS.KS.2
                    @Override // com.bytedance.sdk.component.HWF.zp.lMd.lMd
                    public void zp(List<zp> list2) {
                        try {
                            KS.this.vDp.decrementAndGet();
                            if (list2 != null && list2.size() != 0) {
                                int size = list2.size();
                                for (int i9 = 0; i9 < size; i9++) {
                                    zp zpVar = list2.get(i9);
                                    if (zpVar != null) {
                                        KS.this.zp(z8, zpVar.zp(), zpVar.lMd(), j7);
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        } catch (Exception e4) {
            e4.getMessage();
            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.Pxi(), 1);
            this.vDp.decrementAndGet();
        }
    }

    private void zp(String str) {
        if (this.tG.hasMessages(11)) {
            this.tG.removeMessages(11);
        }
        if (this.rV.size() != 0) {
            ArrayList arrayList = new ArrayList(this.rV);
            this.rV.clear();
            zp((List<com.bytedance.sdk.component.HWF.zp.jU.zp>) arrayList, false, "before_".concat(String.valueOf(str)));
            dT();
            arrayList.size();
        }
    }

    private void zp(List<com.bytedance.sdk.component.HWF.zp.jU.zp> list, boolean z8, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.component.HWF.zp.KS.zp.zp(list, this.HWF, str);
        com.bytedance.sdk.component.HWF.zp.lMd.KS ku = ku.QR().ku();
        this.jU = ku;
        if (ku != null) {
            lMd(list, z8, currentTimeMillis);
        } else {
            zp(list, z8, currentTimeMillis);
        }
    }

    private void zp(final List<com.bytedance.sdk.component.HWF.zp.jU.zp> list, final boolean z8, final long j7) {
        COT KVG = ku.QR().KVG();
        if (KVG != null) {
            Executor COT = KVG.COT();
            if (list.get(0).COT() == 1) {
                COT = KVG.jU();
            }
            if (COT == null) {
                return;
            }
            this.vDp.incrementAndGet();
            COT.execute(new com.bytedance.sdk.component.HWF.zp.COT.COT("csj_log_upload") { // from class: com.bytedance.sdk.component.HWF.zp.lMd.KS.KS.1
                @Override // java.lang.Runnable
                public void run() {
                    KS ks = KS.this;
                    ks.zp((List<com.bytedance.sdk.component.HWF.zp.jU.zp>) list, z8, j7, ks.HWF);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(List<com.bytedance.sdk.component.HWF.zp.jU.zp> list, boolean z8, long j7, int i9) {
        lMd zp;
        try {
            com.bytedance.sdk.component.HWF.zp.jU.zp zpVar = list.get(0);
            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.sqt(), 1);
            if (zpVar.jU() == 0) {
                zp = ku.COT().zp(list);
                zp(zp, list);
                if (zp != null) {
                    com.bytedance.sdk.component.HWF.zp.KS.zp.zp(list, zp.jU);
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<com.bytedance.sdk.component.HWF.zp.jU.zp> it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next().QR());
                    }
                    jSONObject.put("stats_list", jSONArray);
                } catch (Exception e4) {
                    e4.getMessage();
                }
                zp = ku.COT().zp(jSONObject);
            }
            lMd lmd = zp;
            this.vDp.decrementAndGet();
            zp(z8, lmd, list, j7);
        } catch (Throwable th) {
            th.getMessage();
            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.Pxi(), 1);
            this.vDp.decrementAndGet();
        }
    }

    private void zp(lMd lmd, List<com.bytedance.sdk.component.HWF.zp.jU.zp> list) {
        if (lmd == null || !lmd.zp) {
            return;
        }
        List<Object> zp = com.bytedance.sdk.component.HWF.zp.lMd.zp();
        if (list == null || zp == null || zp.size() == 0) {
            return;
        }
        for (com.bytedance.sdk.component.HWF.zp.jU.zp zpVar : list) {
            if (zpVar.COT() == 1) {
                com.bytedance.sdk.component.HWF.zp.KS.zp.zp(zpVar);
                com.bytedance.sdk.component.HWF.zp.KS.zp.COT(zpVar);
                Iterator<Object> it = zp.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(boolean z8, lMd lmd, List<com.bytedance.sdk.component.HWF.zp.jU.zp> list, long j7) {
        if (z8 || lmd == null) {
            return;
        }
        int i9 = lmd.lMd;
        int i10 = -2;
        if (lmd.COT) {
            i9 = -1;
        } else if (i9 < 0) {
            i9 = -2;
        }
        if (i9 == 510 || i9 == 511) {
            i9 = -2;
        }
        if (lmd.zp || ((i9 < 500 || i9 >= 509) && i9 <= 513)) {
            i10 = i9;
        }
        if (list != null) {
            list.size();
            this.vDp.get();
        }
        zp(i10, list, j7);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:8:0x0005, B:11:0x000b, B:21:0x00e4, B:23:0x00e8, B:24:0x00ed, B:27:0x0030, B:29:0x003e, B:31:0x0043, B:33:0x0050, B:35:0x0052, B:37:0x0060, B:38:0x0065, B:39:0x006a, B:41:0x0070, B:43:0x0074, B:45:0x0080, B:46:0x0085, B:48:0x008d, B:49:0x0092, B:50:0x00af, B:52:0x00bd, B:54:0x00bf, B:56:0x00cc, B:58:0x00ce, B:60:0x00dc, B:61:0x00e1, B:4:0x00f4), top: B:7:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void zp(int r6, java.util.List<com.bytedance.sdk.component.HWF.zp.jU.zp> r7, long r8) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.HWF.zp.lMd.KS.KS.zp(int, java.util.List, long):void");
    }

    public void zp(int i9, long j7) {
        if (this.tG == null) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = i9;
        if (i9 == 2) {
            this.tG.sendMessageDelayed(obtain, (((this.dQp.incrementAndGet() - 1) % 4) + 1) * j7);
        } else if (i9 == 3) {
            this.tG.sendMessageDelayed(obtain, (((this.KVG.incrementAndGet() - 1) % 4) + 1) * j7);
        }
    }
}
