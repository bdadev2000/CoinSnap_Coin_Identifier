package com.bykv.vk.openvk.component.video.zp.lMd;

import com.bykv.vk.openvk.component.video.zp.lMd.YW;
import com.bykv.vk.openvk.component.video.zp.lMd.vDp;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zp implements Bj {
    private static final AtomicLong tG = new AtomicLong();
    protected com.bykv.vk.openvk.component.video.zp.lMd.jU.zp COT;
    protected volatile List<YW.lMd> HWF;
    protected volatile String QR;
    protected volatile YW YW;
    protected volatile vDp dT;
    protected volatile String ku;
    protected final com.bykv.vk.openvk.component.video.zp.lMd.lMd.KS lMd;
    protected volatile com.bykv.vk.openvk.component.video.zp.lMd.zp.zp zp;
    protected final AtomicInteger KS = new AtomicInteger();
    protected final AtomicLong jU = new AtomicLong();
    protected volatile boolean Bj = false;
    public final long vDp = tG.incrementAndGet();
    private final AtomicInteger rV = new AtomicInteger(0);
    private int dQp = -1;

    public zp(com.bykv.vk.openvk.component.video.zp.lMd.zp.zp zpVar, com.bykv.vk.openvk.component.video.zp.lMd.lMd.KS ks) {
        this.zp = zpVar;
        this.lMd = ks;
    }

    public void COT() throws com.bykv.vk.openvk.component.video.zp.lMd.KS.zp {
        if (!lMd()) {
        } else {
            throw new com.bykv.vk.openvk.component.video.zp.lMd.KS.zp();
        }
    }

    public int HWF() {
        if (this.YW != null) {
            return this.YW.KS.zp;
        }
        if (this.zp instanceof com.bykv.vk.openvk.component.video.zp.lMd.zp.lMd) {
            return 1;
        }
        return 0;
    }

    public void KS() {
        this.rV.compareAndSet(0, 2);
    }

    public boolean QR() {
        if (HWF() == 1) {
            return true;
        }
        return false;
    }

    public boolean jU() {
        if (this.rV.get() == 2) {
            return true;
        }
        return false;
    }

    public boolean lMd() {
        if (this.rV.get() == 1) {
            return true;
        }
        return false;
    }

    public void zp() {
        this.rV.compareAndSet(0, 1);
    }

    public com.bykv.vk.openvk.component.video.zp.lMd.COT.zp zp(vDp.zp zpVar, int i9, int i10, String str) throws IOException {
        com.bykv.vk.openvk.component.video.zp.lMd.COT.lMd lMd = com.bykv.vk.openvk.component.video.zp.lMd.COT.KS.zp().lMd();
        com.bykv.vk.openvk.component.video.zp.lMd.COT.COT cot = new com.bykv.vk.openvk.component.video.zp.lMd.COT.COT();
        HashMap hashMap = new HashMap();
        cot.lMd = zpVar.zp;
        cot.zp = 0;
        if ("HEAD".equalsIgnoreCase(str)) {
            cot.zp = 4;
        }
        List<YW.lMd> list = this.HWF;
        if (list != null && !list.isEmpty()) {
            for (YW.lMd lmd : list) {
                if (!Command.HTTP_HEADER_RANGE.equalsIgnoreCase(lmd.zp) && !"Connection".equalsIgnoreCase(lmd.zp) && !"Proxy-Connection".equalsIgnoreCase(lmd.zp) && !"Host".equalsIgnoreCase(lmd.zp)) {
                    hashMap.put(lmd.zp, lmd.lMd);
                }
            }
        }
        String zp = com.bykv.vk.openvk.component.video.zp.KS.zp.zp(i9, i10);
        if (zp != null) {
            hashMap.put(Command.HTTP_HEADER_RANGE, zp);
        }
        if (COT.HWF) {
            hashMap.put("Cache-Control", "no-cache");
        }
        jU KS = jU.KS();
        HWF zp2 = HWF.zp();
        boolean z8 = this.YW == null;
        KS zp3 = z8 ? KS.zp() : zp2.lMd();
        KS lMd2 = z8 ? KS.lMd() : zp2.KS();
        if (zp3 != null || lMd2 != null) {
            if (zp3 != null) {
                throw null;
            }
            if (lMd2 != null) {
                throw null;
            }
        }
        cot.COT = hashMap;
        if (this.Bj) {
            this.Bj = false;
            return null;
        }
        return lMd.zp(cot);
    }

    public void zp(int i9, int i10) {
        if (i9 <= 0 || i10 < 0) {
            return;
        }
        int i11 = COT.QR;
        int HWF = HWF();
        if (i11 == 1 || (i11 == 2 && HWF == 1)) {
            int i12 = (int) ((i10 / i9) * 100.0f);
            if (i12 > 100) {
                i12 = 100;
            }
            synchronized (this) {
                try {
                    if (i12 <= this.dQp) {
                        return;
                    }
                    this.dQp = i12;
                    com.bykv.vk.openvk.component.video.zp.KS.zp.zp(new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.lMd.zp.1
                        @Override // java.lang.Runnable
                        public void run() {
                            zp zpVar = zp.this;
                            if (zpVar.COT != null) {
                                vDp vdp = zpVar.dT;
                                int unused = zp.this.dQp;
                            }
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
