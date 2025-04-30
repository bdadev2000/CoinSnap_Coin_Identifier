package com.bykv.vk.openvk.component.video.zp.zp.lMd;

import android.content.Context;
import com.applovin.impl.L;
import com.bykv.vk.openvk.component.video.api.COT.zp;
import com.bytedance.sdk.component.lMd.zp.Bj;
import com.bytedance.sdk.component.lMd.zp.tG;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class lMd {
    private File COT;
    private File jU;
    private com.bykv.vk.openvk.component.video.api.KS.KS lMd;
    private Context zp;
    private volatile boolean KS = false;
    private final List<zp.InterfaceC0049zp> HWF = new ArrayList();
    private volatile boolean QR = false;

    public lMd(Context context, com.bykv.vk.openvk.component.video.api.KS.KS ks) {
        this.jU = null;
        this.COT = null;
        this.zp = context;
        this.lMd = ks;
        this.jU = com.bykv.vk.openvk.component.video.zp.COT.lMd.lMd(ks.lMd(), ks.rV());
        this.COT = com.bykv.vk.openvk.component.video.zp.COT.lMd.KS(ks.lMd(), ks.rV());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void COT() {
        try {
            if (this.jU.renameTo(this.COT)) {
                return;
            }
            throw new IOException("Error renaming file " + this.jU + " to " + this.COT + " for completion!");
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void KS() {
        Bj.zp zpVar;
        if (com.bykv.vk.openvk.component.video.api.KS.jU() != null) {
            zpVar = com.bykv.vk.openvk.component.video.api.KS.jU().lMd();
        } else {
            zpVar = new Bj.zp("v_preload");
        }
        long KVG = this.lMd.KVG();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zpVar.zp(KVG, timeUnit).lMd(this.lMd.woN(), timeUnit).KS(this.lMd.vwr(), timeUnit);
        Bj zp = zpVar.zp();
        tG.zp zpVar2 = new tG.zp();
        final long length = this.jU.length();
        int KS = this.lMd.KS();
        boolean dT = this.lMd.dT();
        int zp2 = this.lMd.zp();
        if (zp2 > 0) {
            if (zp2 >= this.lMd.YW()) {
                dT = true;
            } else {
                KS = zp2;
            }
        }
        zpVar2.zp("videoPreload").zp(6);
        if (dT) {
            zpVar2.zp("RANGE", L.j("bytes=", length, "-")).lMd(this.lMd.tG()).zp().lMd();
        } else {
            zpVar2.zp("RANGE", "bytes=" + length + "-" + KS).lMd(this.lMd.tG()).zp().lMd();
        }
        zp.zp(zpVar2.lMd()).zp(new com.bytedance.sdk.component.lMd.zp.KS() { // from class: com.bykv.vk.openvk.component.video.zp.zp.lMd.lMd.1
            @Override // com.bytedance.sdk.component.lMd.zp.KS
            public void zp(com.bytedance.sdk.component.lMd.zp.lMd lmd, IOException iOException) {
                lMd lmd2 = lMd.this;
                lmd2.zp(lmd2.lMd, 601, iOException.getMessage());
                KS.zp(lMd.this.lMd);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0159 A[Catch: all -> 0x015e, TryCatch #6 {all -> 0x015e, blocks: (B:59:0x014c, B:61:0x0159, B:62:0x0160), top: B:58:0x014c }] */
            /* JADX WARN: Type inference failed for: r13v5 */
            @Override // com.bytedance.sdk.component.lMd.zp.KS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void zp(com.bytedance.sdk.component.lMd.zp.lMd r18, com.bytedance.sdk.component.lMd.zp.dQp r19) throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 419
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.zp.zp.lMd.lMd.AnonymousClass1.zp(com.bytedance.sdk.component.lMd.zp.lMd, com.bytedance.sdk.component.lMd.zp.dQp):void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jU() {
        try {
            this.COT.delete();
            this.jU.delete();
        } catch (Throwable unused) {
        }
    }

    private boolean lMd() {
        if (this.COT.exists()) {
            return true;
        }
        if (!this.lMd.dT()) {
            if (this.jU.length() >= this.lMd.KS()) {
                return true;
            }
            if (this.lMd.zp() > 0 && this.jU.length() >= this.lMd.zp()) {
                return true;
            }
        }
        return false;
    }

    public void zp(zp.InterfaceC0049zp interfaceC0049zp) {
        if (this.QR) {
            synchronized (zp.InterfaceC0049zp.class) {
                this.HWF.add(interfaceC0049zp);
            }
            return;
        }
        this.HWF.add(interfaceC0049zp);
        if (lMd()) {
            this.lMd.QR(1);
            zp(this.lMd, 200);
            KS.zp(this.lMd);
        } else {
            this.QR = true;
            this.lMd.QR(0);
            KS();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(com.bykv.vk.openvk.component.video.api.KS.KS ks, int i9) {
        synchronized (zp.InterfaceC0049zp.class) {
            try {
                for (zp.InterfaceC0049zp interfaceC0049zp : this.HWF) {
                    if (interfaceC0049zp != null) {
                        interfaceC0049zp.lMd(ks, i9);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public com.bykv.vk.openvk.component.video.api.KS.KS zp() {
        return this.lMd;
    }

    public void zp(boolean z8) {
        this.KS = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(com.bykv.vk.openvk.component.video.api.KS.KS ks, int i9) {
        synchronized (zp.InterfaceC0049zp.class) {
            try {
                for (zp.InterfaceC0049zp interfaceC0049zp : this.HWF) {
                    if (interfaceC0049zp != null) {
                        interfaceC0049zp.zp(ks, i9);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(com.bykv.vk.openvk.component.video.api.KS.KS ks, int i9, String str) {
        synchronized (zp.InterfaceC0049zp.class) {
            try {
                for (zp.InterfaceC0049zp interfaceC0049zp : this.HWF) {
                    if (interfaceC0049zp != null) {
                        interfaceC0049zp.zp(ks, i9, str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
