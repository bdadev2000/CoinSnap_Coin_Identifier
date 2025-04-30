package com.bykv.vk.openvk.component.video.zp.jU;

import android.graphics.SurfaceTexture;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.vk.openvk.component.video.api.zp;
import com.bykv.vk.openvk.component.video.zp.jU.KS;
import com.bytedance.sdk.component.ku.YW;
import com.bytedance.sdk.component.utils.RCv;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class jU implements com.bykv.vk.openvk.component.video.api.zp, KS.COT, KS.HWF, KS.InterfaceC0052KS, KS.QR, KS.jU, KS.lMd, KS.zp, RCv.zp {
    private static final SparseIntArray ox = new SparseIntArray();
    private ArrayList<Runnable> FP;
    private boolean RCv;
    private boolean YW;
    private boolean cz;
    private boolean dT;
    private volatile boolean ffE;
    private int jU;
    private SurfaceHolder lMd;
    private RCv tG;
    private SurfaceTexture zp;
    private int KS = 0;
    private boolean COT = false;
    private volatile KS HWF = null;
    private final boolean QR = false;
    private boolean ku = false;
    private volatile int Bj = 201;
    private long vDp = -1;
    private boolean rV = false;
    private long dQp = 0;
    private long KVG = Long.MIN_VALUE;
    private long woN = 0;
    private long vwr = 0;
    private long pvr = 0;
    private int ot = 0;
    private String yRU = "0";
    private final List<WeakReference<zp.InterfaceC0051zp>> Lij = new CopyOnWriteArrayList();
    private com.bykv.vk.openvk.component.video.api.KS.KS Gzh = null;
    private boolean irS = false;
    private CountDownLatch QUv = new CountDownLatch(1);
    private volatile int cW = 200;
    private AtomicBoolean YhE = new AtomicBoolean(false);
    private Surface WNy = null;
    private final Runnable UPs = new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.jU.jU.1
        @Override // java.lang.Runnable
        public void run() {
            if (jU.this.HWF == null) {
                return;
            }
            long woN = jU.this.woN();
            if (woN > 0 && jU.this.HWF() && jU.this.KVG != Long.MIN_VALUE) {
                try {
                    if (jU.this.KVG == woN) {
                        if (!jU.this.rV && jU.this.woN >= 400) {
                            jU.this.lMd(701, 800);
                            jU.this.rV = true;
                        }
                        jU.this.woN += jU.this.cW;
                    } else {
                        if (jU.this.rV) {
                            jU.this.dQp += jU.this.woN;
                            jU.this.lMd(702, 800);
                            long unused = jU.this.dQp;
                            int unused2 = jU.this.KS;
                        }
                        jU.this.woN = 0L;
                        jU.this.rV = false;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            if (jU.this.KVG() > 0) {
                if (jU.this.KVG != woN) {
                    if (com.bykv.vk.openvk.component.video.api.KS.COT()) {
                        long unused3 = jU.this.KVG;
                    }
                    jU jUVar = jU.this;
                    jUVar.zp(woN, jUVar.KVG());
                }
                jU.this.KVG = woN;
            }
            if (!jU.this.lMd()) {
                if (jU.this.tG != null) {
                    jU.this.tG.postDelayed(this, jU.this.cW);
                }
            } else {
                jU jUVar2 = jU.this;
                jUVar2.zp(jUVar2.KVG(), jU.this.KVG());
            }
        }
    };
    private final zp fRl = new zp();
    private long eWG = 0;
    private long Pxi = 0;
    private boolean oKZ = false;

    /* loaded from: classes.dex */
    public class zp implements Runnable {
        private boolean KS;
        private long lMd;

        public zp() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (jU.this.HWF != null) {
                try {
                    if (!this.KS) {
                        long YW = jU.this.HWF.YW();
                        jU.this.vDp = Math.max(this.lMd, YW);
                    }
                    long unused = jU.this.vDp;
                } catch (Throwable th) {
                    th.toString();
                }
            }
            if (jU.this.tG != null) {
                jU.this.tG.sendEmptyMessageDelayed(100, 0L);
            }
        }

        public void zp(boolean z8) {
            this.KS = z8;
        }

        public void zp(long j7) {
            this.lMd = j7;
        }
    }

    public jU() {
        zp("SSMediaPlayerWrapper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FP() {
        RCv rCv = this.tG;
        if (rCv != null) {
            rCv.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.jU.jU.10
                @Override // java.lang.Runnable
                public void run() {
                    if (jU.this.HWF == null) {
                        try {
                            jU.this.HWF = new lMd();
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        if (jU.this.HWF != null) {
                            KS unused = jU.this.HWF;
                            jU.this.yRU = "0";
                            jU.this.HWF.zp((KS.COT) jU.this);
                            jU.this.HWF.zp((KS.lMd) jU.this);
                            jU.this.HWF.zp((KS.InterfaceC0052KS) jU.this);
                            jU.this.HWF.zp((KS.zp) jU.this);
                            jU.this.HWF.zp((KS.HWF) jU.this);
                            jU.this.HWF.zp((KS.jU) jU.this);
                            jU.this.HWF.zp((KS.QR) jU.this);
                            try {
                                jU.this.HWF.KS(false);
                            } catch (Throwable unused2) {
                            }
                            jU.this.ku = false;
                        }
                    }
                }
            });
        }
    }

    private void Gzh() {
        RCv rCv = this.tG;
        if (rCv != null) {
            rCv.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.jU.jU.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        jU.this.HWF.QR();
                        jU.this.Bj = 207;
                        jU.this.ffE = false;
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private void Lij() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.pvr;
        for (WeakReference<zp.InterfaceC0051zp> weakReference : this.Lij) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().zp(this, elapsedRealtime);
            }
        }
        this.COT = true;
    }

    private void QUv() {
        ArrayList<Runnable> arrayList = this.FP;
        if (arrayList != null && !arrayList.isEmpty()) {
            irS();
        }
    }

    private void RCv() {
        SparseIntArray sparseIntArray = ox;
        sparseIntArray.put(this.ot, sparseIntArray.get(this.ot) + 1);
    }

    private void cW() {
        ArrayList<Runnable> arrayList = this.FP;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.FP.clear();
        }
    }

    private void cz() {
        this.dQp = 0L;
        this.KS = 0;
        this.woN = 0L;
        this.rV = false;
        this.KVG = Long.MIN_VALUE;
    }

    private void irS() {
        if (this.YW) {
            return;
        }
        this.YW = true;
        Iterator it = new ArrayList(this.FP).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.FP.clear();
        this.YW = false;
    }

    private void ot() {
        lMd(new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.jU.jU.14
            @Override // java.lang.Runnable
            public void run() {
                if (jU.this.tG != null) {
                    jU.this.tG.sendEmptyMessage(104);
                }
            }
        });
    }

    private void ox() {
        RCv rCv = this.tG;
        if (rCv != null && rCv.getLooper() != null) {
            this.tG.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.jU.jU.6
                @Override // java.lang.Runnable
                public void run() {
                    if (jU.this.tG != null && jU.this.tG.getLooper() != null) {
                        try {
                            com.bytedance.sdk.component.ku.zp.zp.zp().zp(jU.this.tG);
                            jU.this.tG = null;
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
        }
    }

    private void yRU() {
        if (this.HWF == null) {
            return;
        }
        try {
            this.HWF.vDp();
        } catch (Throwable unused) {
        }
        this.HWF.zp((KS.lMd) null);
        this.HWF.zp((KS.QR) null);
        this.HWF.zp((KS.zp) null);
        this.HWF.zp((KS.jU) null);
        this.HWF.zp((KS.InterfaceC0052KS) null);
        this.HWF.zp((KS.COT) null);
        this.HWF.zp((KS.HWF) null);
        try {
            this.HWF.Bj();
        } catch (Throwable unused2) {
        }
    }

    private boolean zp(int i9, int i10) {
        boolean z8 = i9 == -1010 || i9 == -1007 || i9 == -1004 || i9 == -110 || i9 == 100 || i9 == 200;
        if (i10 == 1 || i10 == 700 || i10 == 800) {
            return true;
        }
        return z8;
    }

    public long KVG() {
        long j7 = this.vwr;
        if (j7 != 0) {
            return j7;
        }
        if (this.Bj == 206 || this.Bj == 207) {
            try {
                this.vwr = this.HWF.dT();
            } catch (Throwable unused) {
            }
        }
        return this.vwr;
    }

    public int dQp() {
        return this.KS;
    }

    public SurfaceTexture pvr() {
        return this.zp;
    }

    public long rV() {
        if (this.rV) {
            long j7 = this.woN;
            if (j7 > 0) {
                return this.dQp + j7;
            }
        }
        return this.dQp;
    }

    public boolean tG() {
        if (this.Bj == 205) {
            return true;
        }
        return false;
    }

    public void vDp() {
        if (ku()) {
            return;
        }
        this.dT = true;
        cW();
        RCv rCv = this.tG;
        if (rCv != null) {
            try {
                rCv.removeCallbacksAndMessages(null);
                if (this.HWF != null) {
                    this.tG.sendEmptyMessage(103);
                }
                ox();
            } catch (Throwable unused) {
                ox();
            }
        }
    }

    public SurfaceHolder vwr() {
        return this.lMd;
    }

    public long woN() {
        if (ku()) {
            return 0L;
        }
        if (this.Bj == 206 || this.Bj == 207) {
            try {
                return this.HWF.YW();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public void Bj() {
        RCv rCv;
        if (ku() || (rCv = this.tG) == null) {
            return;
        }
        rCv.removeMessages(100);
        this.ffE = true;
        if (!this.oKZ) {
            if (!this.cz && !lMd(this.Gzh)) {
                zp(new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.jU.jU.12
                    @Override // java.lang.Runnable
                    public void run() {
                        if (jU.this.tG != null) {
                            jU.this.tG.sendEmptyMessage(101);
                        }
                    }
                });
                return;
            }
            RCv rCv2 = this.tG;
            if (rCv2 != null) {
                rCv2.sendEmptyMessage(101);
                return;
            }
            return;
        }
        if (!this.COT && !lMd(this.Gzh)) {
            zp(new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.jU.jU.13
                @Override // java.lang.Runnable
                public void run() {
                    if (jU.this.tG != null) {
                        jU.this.tG.sendEmptyMessage(101);
                    }
                }
            });
            return;
        }
        RCv rCv3 = this.tG;
        if (rCv3 != null) {
            rCv3.sendEmptyMessage(101);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.zp
    public int COT() {
        if (this.HWF == null || ku()) {
            return 0;
        }
        return this.HWF.rV();
    }

    @Override // com.bykv.vk.openvk.component.video.api.zp
    public boolean HWF() {
        RCv rCv;
        return (this.Bj == 206 || ((rCv = this.tG) != null && rCv.hasMessages(100))) && !this.ffE;
    }

    @Override // com.bykv.vk.openvk.component.video.api.zp
    public boolean QR() {
        RCv rCv;
        return ((this.Bj != 207 && !this.ffE) || (rCv = this.tG) == null || rCv.hasMessages(100)) ? false : true;
    }

    public void YW() {
        if (ku() || this.HWF == null) {
            return;
        }
        this.YhE.set(true);
        if (this.Bj != 206) {
            cz();
            this.ffE = false;
            this.fRl.zp(true);
            lMd(0L);
            RCv rCv = this.tG;
            if (rCv != null) {
                rCv.removeCallbacks(this.UPs);
                this.tG.postDelayed(this.UPs, this.cW);
            }
        }
        this.QUv.countDown();
    }

    public void dT() {
        if (ku() || this.tG == null) {
            return;
        }
        this.YhE.set(true);
        this.tG.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.jU.jU.11
            @Override // java.lang.Runnable
            public void run() {
                if (jU.this.QR() && jU.this.HWF != null) {
                    try {
                        jU.this.HWF.COT();
                        for (WeakReference weakReference : jU.this.Lij) {
                            if (weakReference != null && weakReference.get() != null) {
                                ((zp.InterfaceC0051zp) weakReference.get()).COT(jU.this);
                            }
                        }
                        jU.this.Bj = 206;
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.api.zp
    public boolean ku() {
        return this.dT;
    }

    private void lMd(long j7) {
        this.fRl.zp(j7);
        if (this.RCv) {
            lMd(this.fRl);
        } else if (lMd(this.Gzh)) {
            lMd(this.fRl);
        } else {
            zp(this.fRl);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.zp
    public boolean KS() {
        return tG() || HWF() || QR();
    }

    @Override // com.bykv.vk.openvk.component.video.api.zp
    public int jU() {
        if (this.HWF == null || ku()) {
            return 0;
        }
        return this.HWF.tG();
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS.HWF
    public void KS(KS ks) {
        for (WeakReference<zp.InterfaceC0051zp> weakReference : this.Lij) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().zp((com.bykv.vk.openvk.component.video.api.zp) this, true);
            }
        }
    }

    private boolean lMd(com.bykv.vk.openvk.component.video.api.KS.KS ks) {
        return ks != null && ks.jU();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(long j7, long j9) {
        for (WeakReference<zp.InterfaceC0051zp> weakReference : this.Lij) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().zp(this, j7, j9);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.zp
    public boolean lMd() {
        return this.Bj == 209;
    }

    private void lMd(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.HWF.zp(fileInputStream.getFD());
        fileInputStream.close();
    }

    private void zp(String str) {
        this.ot = 0;
        this.tG = com.bytedance.sdk.component.ku.zp.zp.zp().zp(this, YW.THREAD_NAME_PRE.concat(String.valueOf(str)));
        this.oKZ = true;
        FP();
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS.jU
    public boolean lMd(KS ks, int i9, int i10) {
        if (this.HWF != ks) {
            return false;
        }
        if (i10 == -1004) {
            com.bykv.vk.openvk.component.video.api.KS.zp zpVar = new com.bykv.vk.openvk.component.video.api.KS.zp(i9, i10);
            for (WeakReference<zp.InterfaceC0051zp> weakReference : this.Lij) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().zp(this, zpVar);
                }
            }
        }
        lMd(i9, i10);
        return false;
    }

    public void zp(final boolean z8) {
        if (ku()) {
            return;
        }
        this.RCv = z8;
        if (this.HWF != null) {
            this.HWF.zp(z8);
            return;
        }
        RCv rCv = this.tG;
        if (rCv != null) {
            rCv.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.jU.jU.9
                @Override // java.lang.Runnable
                public void run() {
                    if (jU.this.HWF != null) {
                        jU.this.HWF.zp(z8);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(int i9, int i10) {
        if (i9 == 701) {
            this.eWG = SystemClock.elapsedRealtime();
            this.KS++;
            for (WeakReference<zp.InterfaceC0051zp> weakReference : this.Lij) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().zp(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            return;
        }
        if (i9 == 702) {
            if (this.eWG > 0) {
                this.Pxi = (SystemClock.elapsedRealtime() - this.eWG) + this.Pxi;
                this.eWG = 0L;
            }
            for (WeakReference<zp.InterfaceC0051zp> weakReference2 : this.Lij) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().zp((com.bykv.vk.openvk.component.video.api.zp) this, Integer.MAX_VALUE);
                }
            }
            return;
        }
        if (this.oKZ && i9 == 3) {
            QUv();
            Lij();
            lMd(this.irS);
        }
    }

    public void zp(boolean z8, long j7, boolean z9) {
        if (ku()) {
            return;
        }
        FP();
        this.irS = z9;
        this.YhE.set(true);
        this.ffE = false;
        lMd(z9);
        if (z8) {
            this.vDp = j7;
            ot();
        } else {
            lMd(j7);
        }
        RCv rCv = this.tG;
        if (rCv != null) {
            rCv.removeCallbacks(this.UPs);
            this.tG.postDelayed(this.UPs, this.cW);
        }
        this.QUv.countDown();
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS.COT
    public void lMd(KS ks) {
        if (ku()) {
            return;
        }
        this.Bj = 205;
        try {
            com.bykv.vk.openvk.component.video.api.KS.KS ks2 = this.Gzh;
            if (ks2 != null) {
                float vDp = ks2.vDp();
                if (vDp > 0.0f) {
                    com.bykv.vk.openvk.component.video.api.lMd lmd = new com.bykv.vk.openvk.component.video.api.lMd();
                    lmd.zp(vDp);
                    this.HWF.zp(lmd);
                }
            }
        } catch (Throwable unused) {
        }
        if (this.tG != null) {
            if (this.ffE) {
                Gzh();
            } else {
                RCv rCv = this.tG;
                rCv.sendMessage(rCv.obtainMessage(100, -1, -1));
            }
        }
        ox.delete(this.ot);
        boolean z8 = this.oKZ;
        boolean z9 = this.cz;
        if (!z8 && !z9) {
            Lij();
            this.cz = true;
        }
        for (WeakReference<zp.InterfaceC0051zp> weakReference : this.Lij) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().lMd(this);
            }
        }
    }

    public void zp(final long j7) {
        if (ku()) {
            return;
        }
        if (this.Bj == 207 || this.Bj == 206 || this.Bj == 209) {
            lMd(new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.jU.jU.2
                @Override // java.lang.Runnable
                public void run() {
                    if (jU.this.tG != null) {
                        jU.this.tG.obtainMessage(106, Long.valueOf(j7)).sendToTarget();
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.zp
    public boolean zp() {
        return this.COT;
    }

    public void zp(final SurfaceTexture surfaceTexture) {
        if (ku()) {
            return;
        }
        this.zp = surfaceTexture;
        zp(true);
        lMd(new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.jU.jU.3
            @Override // java.lang.Runnable
            public void run() {
                jU.this.FP();
                if (jU.this.tG != null) {
                    jU.this.tG.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    public void zp(final SurfaceHolder surfaceHolder) {
        if (ku()) {
            return;
        }
        this.lMd = surfaceHolder;
        zp(true);
        lMd(new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.jU.jU.4
            @Override // java.lang.Runnable
            public void run() {
                jU.this.FP();
                if (jU.this.tG != null) {
                    jU.this.tG.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    public void zp(final com.bykv.vk.openvk.component.video.api.KS.KS ks) {
        if (ku()) {
            return;
        }
        this.Gzh = ks;
        if (ks != null) {
            this.oKZ = this.oKZ && !ks.jU();
        }
        lMd(new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.jU.jU.5
            @Override // java.lang.Runnable
            public void run() {
                jU.this.FP();
                if (jU.this.tG != null) {
                    jU.this.tG.obtainMessage(107, ks).sendToTarget();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.utils.RCv.zp
    public void zp(Message message) {
        int i9 = this.Bj;
        int i10 = message.what;
        if (this.HWF != null) {
            try {
                switch (message.what) {
                    case 100:
                        if (this.Bj == 205 || this.Bj == 207 || this.Bj == 209) {
                            this.HWF.COT();
                            this.pvr = SystemClock.elapsedRealtime();
                            this.Bj = 206;
                            if (this.vDp > 0) {
                                this.HWF.zp(this.vDp, this.jU);
                                this.vDp = -1L;
                            }
                            if (this.Gzh != null) {
                                lMd(this.irS);
                                return;
                            }
                            return;
                        }
                        break;
                    case 101:
                        if (this.rV) {
                            this.dQp += this.woN;
                        }
                        this.rV = false;
                        this.woN = 0L;
                        this.KVG = Long.MIN_VALUE;
                        if (this.Bj == 206 || this.Bj == 207 || this.Bj == 209) {
                            this.HWF.QR();
                            this.Bj = 207;
                            this.ffE = false;
                            for (WeakReference<zp.InterfaceC0051zp> weakReference : this.Lij) {
                                if (weakReference != null && weakReference.get() != null) {
                                    weakReference.get().jU(this);
                                }
                            }
                            return;
                        }
                        break;
                    case 102:
                        this.HWF.vDp();
                        this.Bj = 201;
                        return;
                    case 103:
                        try {
                            yRU();
                        } catch (Throwable unused) {
                        }
                        for (WeakReference<zp.InterfaceC0051zp> weakReference2 : this.Lij) {
                            if (weakReference2 != null && weakReference2.get() != null) {
                                weakReference2.get().KS(this);
                            }
                        }
                        this.Bj = 203;
                        return;
                    case 104:
                        if (this.Bj == 202 || this.Bj == 208) {
                            this.HWF.ku();
                            return;
                        }
                        break;
                    case 105:
                        if (this.Bj == 205 || this.Bj == 206 || this.Bj == 208 || this.Bj == 207 || this.Bj == 209) {
                            this.HWF.HWF();
                            this.Bj = 208;
                            return;
                        }
                        break;
                    case 106:
                        if (this.Bj == 206 || this.Bj == 207 || this.Bj == 209) {
                            this.HWF.zp(((Long) message.obj).longValue(), this.jU);
                            return;
                        }
                        break;
                    case 107:
                        cz();
                        if (this.Bj == 201 || this.Bj == 203) {
                            com.bykv.vk.openvk.component.video.api.KS.KS ks = (com.bykv.vk.openvk.component.video.api.KS.KS) message.obj;
                            if (TextUtils.isEmpty(ks.lMd())) {
                                ks.zp(com.bykv.vk.openvk.component.video.api.KS.lMd());
                            }
                            File file = new File(ks.lMd(), ks.rV());
                            if (file.exists()) {
                                file.getAbsolutePath();
                                if (com.bykv.vk.openvk.component.video.api.KS.KS()) {
                                    lMd(file.getAbsolutePath());
                                } else {
                                    this.HWF.zp(file.getAbsolutePath());
                                }
                            } else {
                                ks.tG();
                                this.HWF.zp(ks);
                                ks.tG();
                            }
                            this.Bj = 202;
                            return;
                        }
                        break;
                    case 108:
                    case 109:
                    default:
                        return;
                    case 110:
                        this.HWF.zp((SurfaceHolder) message.obj);
                        this.HWF.lMd(true);
                        this.QUv.await(1L, TimeUnit.SECONDS);
                        QUv();
                        return;
                    case 111:
                        this.WNy = new Surface((SurfaceTexture) message.obj);
                        this.HWF.zp(this.WNy);
                        this.HWF.lMd(true);
                        this.QUv.await(1L, TimeUnit.SECONDS);
                        QUv();
                        return;
                }
                this.Bj = 200;
                if (this.ku) {
                    return;
                }
                com.bykv.vk.openvk.component.video.api.KS.zp zpVar = new com.bykv.vk.openvk.component.video.api.KS.zp(308, i10);
                zpVar.zp(i9 + "," + i10);
                for (WeakReference<zp.InterfaceC0051zp> weakReference3 : this.Lij) {
                    if (weakReference3 != null && weakReference3.get() != null) {
                        weakReference3.get().zp(this, zpVar);
                    }
                }
                this.ku = true;
            } catch (Throwable unused2) {
            }
        }
    }

    private void lMd(Runnable runnable) {
        if (runnable == null || ku()) {
            return;
        }
        if (!this.dT) {
            runnable.run();
        } else {
            zp(runnable);
        }
    }

    public void lMd(final boolean z8) {
        RCv rCv;
        if (ku() || (rCv = this.tG) == null) {
            return;
        }
        rCv.post(new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.jU.jU.8
            @Override // java.lang.Runnable
            public void run() {
                if (!jU.this.ku() && jU.this.HWF != null) {
                    try {
                        jU.this.irS = z8;
                        jU.this.HWF.jU(z8);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    public void lMd(int i9) {
        this.jU = i9;
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS.zp
    public void zp(KS ks, int i9) {
        if (this.HWF != ks) {
            return;
        }
        for (WeakReference<zp.InterfaceC0051zp> weakReference : this.Lij) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().lMd(this, i9);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS.lMd
    public void zp(KS ks) {
        this.Bj = 209;
        ox.delete(this.ot);
        RCv rCv = this.tG;
        if (rCv != null) {
            rCv.removeCallbacks(this.UPs);
        }
        for (WeakReference<zp.InterfaceC0051zp> weakReference : this.Lij) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().zp(this);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS.InterfaceC0052KS
    public boolean zp(KS ks, int i9, int i10) {
        RCv();
        this.Bj = 200;
        RCv rCv = this.tG;
        if (rCv != null) {
            rCv.removeCallbacks(this.UPs);
        }
        if (zp(i9, i10)) {
            ox();
        }
        if (!this.YhE.get()) {
            return true;
        }
        this.YhE.set(false);
        com.bykv.vk.openvk.component.video.api.KS.zp zpVar = new com.bykv.vk.openvk.component.video.api.KS.zp(i9, i10);
        for (WeakReference<zp.InterfaceC0051zp> weakReference : this.Lij) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().zp(this, zpVar);
            }
        }
        return true;
    }

    private void zp(Runnable runnable) {
        try {
            if (this.FP == null) {
                this.FP = new ArrayList<>();
            }
            this.FP.add(runnable);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.zp.jU.KS.QR
    public void zp(KS ks, int i9, int i10, int i11, int i12) {
        for (WeakReference<zp.InterfaceC0051zp> weakReference : this.Lij) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().zp((com.bykv.vk.openvk.component.video.api.zp) this, i9, i10);
            }
        }
    }

    public void zp(zp.InterfaceC0051zp interfaceC0051zp) {
        if (interfaceC0051zp == null) {
            return;
        }
        for (WeakReference<zp.InterfaceC0051zp> weakReference : this.Lij) {
            if (weakReference != null && weakReference.get() == interfaceC0051zp) {
                return;
            }
        }
        this.Lij.add(new WeakReference<>(interfaceC0051zp));
    }

    public void zp(int i9) {
        if (ku()) {
            return;
        }
        this.cW = i9;
    }
}
