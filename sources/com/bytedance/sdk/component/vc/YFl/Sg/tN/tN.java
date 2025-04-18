package com.bytedance.sdk.component.vc.YFl.Sg.tN;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.sdk.component.vc.YFl.YFl.AlY;
import com.bytedance.sdk.component.vc.YFl.qsH;
import com.bytedance.sdk.component.vc.YFl.wN;
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
public class tN extends HandlerThread implements Handler.Callback {
    private static int lG = 10;
    private static int qO = 200;
    private com.bytedance.sdk.component.vc.YFl.Sg.tN AlY;
    private volatile long DSW;
    private final AtomicInteger EH;
    private volatile Handler GA;
    private final int Ne;
    private final AtomicInteger NjR;
    private volatile boolean Sg;
    private long Wwa;
    protected AlY YFl;
    private final AtomicInteger YoT;
    private final int aIu;
    private final long eT;

    /* renamed from: nc, reason: collision with root package name */
    private final long f10454nc;
    private final List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> pDU;
    private volatile long qsH;
    private final AtomicInteger rkt;
    private final Object tN;

    /* renamed from: vc, reason: collision with root package name */
    private volatile int f10455vc;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.vc.YFl.AlY.YFl> wN;
    private final int wXo;

    public tN(PriorityBlockingQueue<com.bytedance.sdk.component.vc.YFl.AlY.YFl> priorityBlockingQueue) {
        super("csj_log");
        this.Sg = true;
        this.tN = new Object();
        this.DSW = 0L;
        this.qsH = 0L;
        this.NjR = new AtomicInteger(0);
        this.f10454nc = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
        this.eT = 5000000000L;
        this.YoT = new AtomicInteger(0);
        this.pDU = new ArrayList();
        this.EH = new AtomicInteger(0);
        this.rkt = new AtomicInteger(0);
        this.Wwa = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        this.aIu = 1;
        this.wXo = 2;
        this.Ne = 3;
        this.wN = priorityBlockingQueue;
        this.YFl = new com.bytedance.sdk.component.vc.YFl.YFl.Sg();
        if (!com.bytedance.sdk.component.vc.YFl.Sg.Sg()) {
            long EH = qsH.DSW().rkt().EH();
            if (EH > 0) {
                this.Wwa = EH;
            }
        }
    }

    private void AlY() {
        if (!isAlive()) {
            com.bytedance.sdk.component.vc.YFl.Sg.AlY.YFl.AlY();
        } else {
            if (YFl()) {
                return;
            }
            tN(6);
        }
    }

    private void DSW() {
        if (this.wN.size() >= 100) {
            for (int i10 = 0; i10 < 100; i10++) {
                com.bytedance.sdk.component.vc.YFl.AlY.YFl poll = this.wN.poll();
                if (!(poll instanceof com.bytedance.sdk.component.vc.YFl.AlY.Sg) && poll != null) {
                    YFl(poll);
                }
            }
        }
    }

    private void NjR() {
        try {
            if (this.wN.size() == 0 && this.GA.hasMessages(11) && YFl()) {
                YFl(false);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void nc() {
        long nanoTime;
        com.bytedance.sdk.component.vc.YFl.Sg.AlY alY;
        if (this.GA.hasMessages(11)) {
            NjR();
        } else {
            wN(1);
        }
        com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl yFl = com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY;
        com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(yFl.Sg(), 1);
        if (this.f10455vc == 2) {
            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(yFl.DSW(), 1);
            synchronized (this.tN) {
                try {
                    try {
                        long nanoTime2 = System.nanoTime();
                        this.tN.wait(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
                        nanoTime = System.nanoTime() - nanoTime2;
                        alY = com.bytedance.sdk.component.vc.YFl.Sg.AlY.YFl;
                        if (!alY.Sg) {
                            boolean z10 = alY.tN;
                        }
                    } catch (InterruptedException e2) {
                        e2.getMessage();
                    }
                    if (nanoTime < 5000000000L && 5000000000L - nanoTime >= 50000000) {
                        if (!alY.Sg && !alY.tN) {
                            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(yFl.lu(), 1);
                            tN(2);
                            return;
                        }
                        com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(yFl.eT(), 1);
                        return;
                    }
                    com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(yFl.nc(), 1);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private boolean qsH() {
        if (com.bytedance.sdk.component.vc.YFl.Sg.AlY.YFl.Sg) {
            return this.f10455vc == 4 || this.f10455vc == 7 || this.f10455vc == 6 || this.f10455vc == 5 || this.f10455vc == 2;
        }
        return false;
    }

    private void tN() {
        AlY();
        com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.GS(), 1);
        tN(1);
    }

    private void vc() {
        com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.Ne(), 1);
        YFl(false);
        com.bytedance.sdk.component.vc.YFl.Sg.AlY.YFl.tN();
    }

    private void wN() {
        while (YFl()) {
            try {
                com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl yFl = com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY;
                com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(yFl.qsH(), 1);
                com.bytedance.sdk.component.vc.YFl.AlY.YFl poll = this.wN.poll(this.Wwa, TimeUnit.MILLISECONDS);
                int size = this.wN.size();
                if (poll instanceof com.bytedance.sdk.component.vc.YFl.AlY.Sg) {
                    YFl(poll, size);
                } else if (poll == null) {
                    int incrementAndGet = this.NjR.incrementAndGet();
                    com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(yFl.zG(), 1);
                    if (AlY(incrementAndGet)) {
                        vc();
                        return;
                    } else if (incrementAndGet < 4) {
                        this.f10455vc = 1;
                        Sg((com.bytedance.sdk.component.vc.YFl.AlY.YFl) null);
                    }
                } else {
                    YFl(poll);
                    Sg(poll);
                }
            } catch (Throwable th2) {
                th2.getMessage();
                com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.mB(), 1);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
        } catch (Throwable th2) {
            th2.getMessage();
        }
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                if (i10 == 11) {
                    ArrayList arrayList = new ArrayList(this.pDU);
                    this.pDU.clear();
                    YFl((List<com.bytedance.sdk.component.vc.YFl.AlY.YFl>) arrayList, false, "timeout_dispatch");
                    nc();
                }
                return true;
            }
            tN();
        } else {
            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.NjR(), 1);
            Sg();
            YFl(true);
            wN();
        }
        return true;
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        super.onLooperPrepared();
        this.GA = new Handler(getLooper(), this);
        com.bytedance.sdk.component.vc.YFl.Sg.AlY.YFl.YFl(this.GA);
        this.GA.sendEmptyMessage(1);
    }

    public static void Sg(int i10) {
        qO = i10;
    }

    private void Sg() {
        long lG2 = qsH.DSW().lG();
        if (lG2 <= 0) {
            return;
        }
        this.YFl.YFl(Integer.MAX_VALUE, lG2);
    }

    public static void YFl(int i10) {
        lG = i10;
    }

    public void tN(int i10) {
        try {
            boolean YFl = YFl(i10, com.bytedance.sdk.component.vc.YFl.Sg.AlY.YFl.Sg);
            if (i10 == 6 || YFl) {
                com.bytedance.sdk.component.vc.YFl.AlY.Sg sg2 = new com.bytedance.sdk.component.vc.YFl.AlY.Sg();
                sg2.Sg(i10);
                this.wN.add(sg2);
                wN(3);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    private boolean AlY(int i10) {
        if (i10 < 4 || this.YoT.get() != 0) {
            return false;
        }
        com.bytedance.sdk.component.vc.YFl.Sg.AlY alY = com.bytedance.sdk.component.vc.YFl.Sg.AlY.YFl;
        return (alY.Sg || alY.tN) ? false : true;
    }

    private void Sg(com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl) {
        if (com.bytedance.sdk.component.vc.YFl.tN.YFl.Sg() && qsH.DSW().YFl()) {
            return;
        }
        int i10 = 0;
        if (qsH()) {
            com.bytedance.sdk.component.vc.YFl.tN.YFl.YFl(this.f10455vc);
            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.YoT(), 1);
            if (this.wN.size() != 0) {
                return;
            }
            if (!this.GA.hasMessages(2)) {
                com.bytedance.sdk.component.vc.YFl.Sg.AlY.YFl.Sg = false;
                this.qsH = 0L;
                this.DSW = 0L;
                this.EH.set(0);
                this.rkt.set(0);
            } else {
                YFl(false);
                return;
            }
        }
        do {
            boolean YFl = YFl(this.f10455vc, com.bytedance.sdk.component.vc.YFl.Sg.AlY.YFl.Sg);
            com.bytedance.sdk.component.vc.YFl.tN.YFl.YFl(YFl, this.f10455vc, yFl);
            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.GA(), 1);
            if (YFl) {
                List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl2 = this.YFl.YFl(this.f10455vc, -1, null);
                if (YFl2 != null) {
                    YFl2.size();
                    YFl(YFl2);
                } else {
                    NjR();
                }
            } else {
                NjR();
            }
            i10++;
            if (!YFl) {
                return;
            }
        } while (i10 <= 6);
    }

    public void YFl(boolean z10) {
        this.Sg = z10;
    }

    public boolean YFl() {
        return this.Sg;
    }

    public boolean YFl(int i10, boolean z10) {
        wN rkt = qsH.DSW().rkt();
        if (rkt == null || !rkt.YFl(qsH.DSW().vc())) {
            return false;
        }
        return this.YFl.YFl(i10, z10);
    }

    public void YFl(com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl, boolean z10) {
        if (yFl == null) {
            return;
        }
        yFl.AlY();
        if (z10) {
            if (this.GA != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(yFl);
                YFl((List<com.bytedance.sdk.component.vc.YFl.AlY.YFl>) arrayList, true, "ignore_result_dispatch");
                return;
            }
            return;
        }
        this.wN.add(yFl);
        wN(2);
    }

    private void YFl(com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl, int i10) {
        this.NjR.set(0);
        if (i10 == 0) {
            this.f10455vc = ((com.bytedance.sdk.component.vc.YFl.AlY.Sg) yFl).eT();
            if (this.f10455vc != 6) {
                com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.BPI(), 1);
                Sg(yFl);
                return;
            }
            return;
        }
        com.bytedance.sdk.component.vc.YFl.AlY.Sg sg2 = (com.bytedance.sdk.component.vc.YFl.AlY.Sg) yFl;
        if (sg2.eT() == 1) {
            this.f10455vc = 1;
            Sg(yFl);
        } else if (sg2.eT() == 2) {
            DSW();
            this.f10455vc = 2;
            Sg(yFl);
        }
    }

    private void wN(int i10) {
        if (!YFl()) {
            if (this.GA == null) {
                return;
            }
            com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl yFl = com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY;
            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(yFl.tN(), 1);
            if (this.GA.hasMessages(1)) {
                return;
            }
            if (i10 == 1) {
                com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(yFl.vc(), 1);
            } else if (i10 == 2) {
                com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(yFl.AlY(), 1);
            } else if (i10 == 3) {
                com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(yFl.wN(), 1);
            }
            this.GA.sendEmptyMessage(1);
            return;
        }
        com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.YFl(), 1);
    }

    private void Sg(List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list) {
        this.pDU.addAll(list);
        this.pDU.size();
        wN rkt = qsH.DSW().rkt();
        if (rkt != null && rkt.YoT() != null) {
            lG = rkt.YoT().Sg();
        }
        if (this.pDU.size() >= lG) {
            if (this.GA.hasMessages(11)) {
                this.GA.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.pDU);
            this.pDU.clear();
            YFl((List<com.bytedance.sdk.component.vc.YFl.AlY.YFl>) arrayList, false, "max_size_dispatch");
            nc();
            return;
        }
        if (this.wN.size() == 0) {
            YFl(false);
            if (this.GA.hasMessages(11)) {
                this.GA.removeMessages(11);
            }
            if (this.GA.hasMessages(1)) {
                this.GA.removeMessages(1);
            }
            long j3 = qO;
            if (rkt != null && rkt.YoT() != null) {
                j3 = rkt.YoT().YFl();
            }
            this.GA.sendEmptyMessageDelayed(11, j3);
            return;
        }
        this.pDU.size();
    }

    private void YFl(com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl) {
        this.NjR.set(0);
        com.bytedance.sdk.component.vc.YFl.Sg.AlY alY = com.bytedance.sdk.component.vc.YFl.Sg.AlY.YFl;
        if (alY.Sg) {
            this.f10455vc = 5;
        } else if (alY.tN) {
            this.f10455vc = 7;
        } else {
            this.f10455vc = 4;
        }
        com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.Ld(), 1);
        this.YFl.YFl(yFl, this.f10455vc);
        com.bytedance.sdk.component.vc.YFl.tN.YFl.DSW(yFl);
    }

    private void YFl(List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list, String str) {
        YFl(str);
        YFl(list, false, str);
        nc();
    }

    private void YFl(List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list) {
        if (list.size() != 0) {
            com.bytedance.sdk.component.vc.YFl.tN.YFl.YFl(list, this.wN.size());
            if (list.size() <= 1 && !com.bytedance.sdk.component.vc.YFl.tN.YFl.tN()) {
                com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl = list.get(0);
                if (yFl != null) {
                    if (yFl.wN() == 1) {
                        YFl(list, "highPriority");
                        return;
                    }
                    if (yFl.AlY() == 0 && yFl.wN() == 2) {
                        if (yFl.Sg() == 3) {
                            YFl(list, "version_v3");
                            return;
                        } else {
                            Sg(list);
                            return;
                        }
                    }
                    if (yFl.AlY() == 1) {
                        YFl(list, "stats");
                        return;
                    } else if (yFl.AlY() == 3) {
                        YFl(list, "adType_v3");
                        return;
                    } else {
                        if (yFl.AlY() == 2) {
                            YFl(list, "other");
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            YFl(list, "batchRead");
            return;
        }
        NjR();
    }

    private void Sg(List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list, final boolean z10, final long j3) {
        this.YoT.incrementAndGet();
        com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.lL(), 1);
        try {
            HashMap hashMap = new HashMap();
            Iterator<com.bytedance.sdk.component.vc.YFl.AlY.YFl> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.vc.YFl.AlY.YFl next = it.next();
                int nc2 = next == null ? 0 : next.nc();
                if (hashMap.get(Integer.valueOf(nc2)) == null) {
                    hashMap.put(Integer.valueOf(nc2), new ArrayList());
                }
                ((List) hashMap.get(Integer.valueOf(nc2))).add(next);
            }
            Iterator it2 = hashMap.keySet().iterator();
            while (it2.hasNext()) {
                int intValue = ((Integer) it2.next()).intValue();
                if (intValue != 0 && qsH.DSW().tN() != null && qsH.DSW().tN().get(Integer.valueOf(intValue)) != null) {
                    qsH.DSW().tN().get(Integer.valueOf(intValue)).YFl(list, new com.bytedance.sdk.component.vc.YFl.Sg.Sg() { // from class: com.bytedance.sdk.component.vc.YFl.Sg.tN.tN.3
                        @Override // com.bytedance.sdk.component.vc.YFl.Sg.Sg
                        public void YFl(List<YFl> list2) {
                            try {
                                tN.this.YoT.decrementAndGet();
                                if (list2 != null && list2.size() != 0) {
                                    int size = list2.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        YFl yFl = list2.get(i10);
                                        if (yFl != null) {
                                            tN.this.YFl(z10, yFl.YFl(), yFl.Sg(), j3);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
                this.AlY.YFl(list, new com.bytedance.sdk.component.vc.YFl.Sg.Sg() { // from class: com.bytedance.sdk.component.vc.YFl.Sg.tN.tN.2
                    @Override // com.bytedance.sdk.component.vc.YFl.Sg.Sg
                    public void YFl(List<YFl> list2) {
                        try {
                            tN.this.YoT.decrementAndGet();
                            if (list2 != null && list2.size() != 0) {
                                int size = list2.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    YFl yFl = list2.get(i10);
                                    if (yFl != null) {
                                        tN.this.YFl(z10, yFl.YFl(), yFl.Sg(), j3);
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        } catch (Exception e2) {
            e2.getMessage();
            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.mB(), 1);
            this.YoT.decrementAndGet();
        }
    }

    private void YFl(String str) {
        if (this.GA.hasMessages(11)) {
            this.GA.removeMessages(11);
        }
        if (this.pDU.size() != 0) {
            ArrayList arrayList = new ArrayList(this.pDU);
            this.pDU.clear();
            YFl((List<com.bytedance.sdk.component.vc.YFl.AlY.YFl>) arrayList, false, "before_".concat(String.valueOf(str)));
            nc();
            arrayList.size();
        }
    }

    private void YFl(List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list, boolean z10, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.component.vc.YFl.tN.YFl.YFl(list, this.f10455vc, str);
        com.bytedance.sdk.component.vc.YFl.Sg.tN qsH = qsH.DSW().qsH();
        this.AlY = qsH;
        if (qsH != null) {
            Sg(list, z10, currentTimeMillis);
        } else {
            YFl(list, z10, currentTimeMillis);
        }
    }

    private void YFl(final List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list, final boolean z10, final long j3) {
        wN rkt = qsH.DSW().rkt();
        if (rkt != null) {
            Executor wN = rkt.wN();
            if (list.get(0).wN() == 1) {
                wN = rkt.AlY();
            }
            if (wN == null) {
                return;
            }
            this.YoT.incrementAndGet();
            wN.execute(new com.bytedance.sdk.component.vc.YFl.wN.wN("csj_log_upload") { // from class: com.bytedance.sdk.component.vc.YFl.Sg.tN.tN.1
                @Override // java.lang.Runnable
                public void run() {
                    tN tNVar = tN.this;
                    tNVar.YFl((List<com.bytedance.sdk.component.vc.YFl.AlY.YFl>) list, z10, j3, tNVar.f10455vc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list, boolean z10, long j3, int i10) {
        Sg YFl;
        try {
            com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl = list.get(0);
            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.lL(), 1);
            if (yFl.AlY() == 0) {
                YFl = qsH.wN().YFl(list);
                YFl(YFl, list);
                if (YFl != null) {
                    com.bytedance.sdk.component.vc.YFl.tN.YFl.YFl(list, YFl.AlY);
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<com.bytedance.sdk.component.vc.YFl.AlY.YFl> it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next().DSW());
                    }
                    jSONObject.put("stats_list", jSONArray);
                } catch (Exception e2) {
                    e2.getMessage();
                }
                YFl = qsH.wN().YFl(jSONObject);
            }
            Sg sg2 = YFl;
            this.YoT.decrementAndGet();
            YFl(z10, sg2, list, j3);
        } catch (Throwable th2) {
            th2.getMessage();
            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.mB(), 1);
            this.YoT.decrementAndGet();
        }
    }

    private void YFl(Sg sg2, List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list) {
        if (sg2 == null || !sg2.YFl) {
            return;
        }
        List<Object> YFl = com.bytedance.sdk.component.vc.YFl.Sg.YFl();
        if (list == null || YFl == null || YFl.size() == 0) {
            return;
        }
        for (com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl : list) {
            if (yFl.wN() == 1) {
                com.bytedance.sdk.component.vc.YFl.tN.YFl.YFl(yFl);
                com.bytedance.sdk.component.vc.YFl.tN.YFl.wN(yFl);
                Iterator<Object> it = YFl.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(boolean z10, Sg sg2, List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list, long j3) {
        if (z10 || sg2 == null) {
            return;
        }
        int i10 = sg2.Sg;
        int i11 = -2;
        if (sg2.wN) {
            i10 = -1;
        } else if (i10 < 0) {
            i10 = -2;
        }
        if (i10 == 510 || i10 == 511) {
            i10 = -2;
        }
        if (sg2.YFl || ((i10 < 500 || i10 >= 509) && i10 <= 513)) {
            i11 = i10;
        }
        if (list != null) {
            list.size();
            this.YoT.get();
        }
        YFl(i11, list, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5 A[Catch: all -> 0x00f3, TryCatch #0 {, blocks: (B:8:0x0005, B:11:0x000b, B:21:0x00e1, B:23:0x00e5, B:24:0x00ea, B:27:0x0030, B:29:0x003e, B:31:0x0040, B:33:0x004d, B:35:0x004f, B:37:0x005d, B:38:0x0062, B:39:0x0067, B:41:0x006d, B:43:0x0071, B:45:0x007d, B:46:0x0082, B:48:0x008a, B:49:0x008f, B:50:0x00ac, B:52:0x00ba, B:54:0x00bc, B:56:0x00c9, B:58:0x00cb, B:60:0x00d9, B:61:0x00de, B:4:0x00f1), top: B:7:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void YFl(int r6, java.util.List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> r7, long r8) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.vc.YFl.Sg.tN.tN.YFl(int, java.util.List, long):void");
    }

    public void YFl(int i10, long j3) {
        if (this.GA == null) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = i10;
        if (i10 == 2) {
            this.GA.sendMessageDelayed(obtain, (((this.EH.incrementAndGet() - 1) % 4) + 1) * j3);
        } else if (i10 == 3) {
            this.GA.sendMessageDelayed(obtain, (((this.rkt.incrementAndGet() - 1) % 4) + 1) * j3);
        }
    }
}
