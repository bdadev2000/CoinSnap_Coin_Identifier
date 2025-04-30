package com.bytedance.sdk.component.adexpress.zp.lMd;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.zp.KS.zp;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.component.utils.vwr;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class COT extends KS {
    private static volatile COT lMd;
    private static File zp;
    private AtomicBoolean KS = new AtomicBoolean(true);
    private AtomicBoolean jU = new AtomicBoolean(false);
    private boolean COT = false;
    private AtomicBoolean HWF = new AtomicBoolean(false);
    private AtomicInteger QR = new AtomicInteger(0);
    private AtomicLong ku = new AtomicLong();

    private COT() {
        dT();
    }

    private void Bj() {
        if (this.QR.getAndSet(0) > 0 && System.currentTimeMillis() - this.ku.get() > TTAdConstant.AD_MAX_EVENT_TIME) {
            QR();
        }
    }

    private void dT() {
        com.bytedance.sdk.component.adexpress.jU.KS.lMd(new com.bytedance.sdk.component.ku.ku("init") { // from class: com.bytedance.sdk.component.adexpress.zp.lMd.COT.1
            @Override // java.lang.Runnable
            public void run() {
                ku.zp();
                COT.this.KS.set(false);
                COT.this.jU();
                COT.this.QR();
                if (com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS() != null && vwr.zp(com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS().lMd())) {
                    com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS().KS().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.zp.lMd.COT.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS() != null) {
                                com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS().jU();
                            }
                        }
                    });
                }
            }
        }, 10);
    }

    public static File ku() {
        if (zp == null) {
            try {
                File file = new File(new File(jU.zp(), "tt_tmpl_pkg"), "template");
                file.mkdirs();
                zp = file;
            } catch (Throwable th) {
                tG.zp("TemplateManager", "getTemplateDir error", th);
            }
        }
        return zp;
    }

    public static COT lMd() {
        if (lMd == null) {
            synchronized (COT.class) {
                try {
                    if (lMd == null) {
                        lMd = new COT();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lMd;
    }

    public boolean COT() {
        return this.COT;
    }

    public com.bytedance.sdk.component.adexpress.zp.KS.zp HWF() {
        return ku.lMd();
    }

    public void KS() {
        dT();
    }

    public void QR() {
        zp(false);
    }

    public void YW() {
        this.HWF.set(true);
        this.COT = false;
        this.jU.set(false);
    }

    public void jU() {
        com.bytedance.sdk.component.adexpress.zp.KS.zp lMd2 = ku.lMd();
        if (lMd2 != null && lMd2.QR()) {
            boolean zp2 = zp(lMd2);
            if (!zp2) {
                ku.jU();
            }
            this.COT = zp2;
        }
    }

    public boolean zp(com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar) {
        if (zpVar == null) {
            return false;
        }
        return zp(zpVar.zp()) || zp(zpVar.COT()) || zp(zpVar.HWF());
    }

    @Override // com.bytedance.sdk.component.adexpress.zp.lMd.KS
    public File zp() {
        return ku();
    }

    public void zp(boolean z8) {
        List<zp.C0085zp> list;
        boolean z9;
        if (this.KS.get()) {
            return;
        }
        try {
            if (this.jU.get()) {
                if (z8) {
                    this.QR.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z10 = true;
            this.jU.set(true);
            com.bytedance.sdk.component.adexpress.zp.KS.zp COT = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS().COT();
            com.bytedance.sdk.component.adexpress.zp.KS.zp lMd2 = ku.lMd();
            if (COT != null && COT.QR()) {
                if (!ku.lMd(COT)) {
                    this.jU.set(false);
                    this.ku.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS() != null) {
                    com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().KS().KS().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.zp.lMd.COT.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.COT.COT.zp().lMd();
                        }
                    });
                }
                ku.zp(COT);
                boolean zp2 = (COT.COT() == null || TextUtils.isEmpty(COT.COT().zp())) ? false : zp(COT.COT().zp());
                if (COT.zp().size() != 0) {
                    list = zp(COT, lMd2);
                    z9 = list != null;
                } else {
                    list = null;
                    z9 = zp2;
                }
                if (!zp2) {
                    List<zp.C0085zp> lMd3 = lMd(COT, lMd2);
                    if (list == null || lMd3 == null) {
                        list = lMd3;
                    } else {
                        list.addAll(lMd3);
                    }
                    if (lMd3 == null) {
                        z10 = false;
                    }
                    if (lMd3 == null) {
                        this.jU.set(false);
                    }
                    z9 = z10;
                }
                if (z9 && zp(COT)) {
                    ku.zp(COT);
                    ku.KS();
                    lMd(list);
                }
                jU();
                this.jU.set(false);
                this.ku.set(System.currentTimeMillis());
                Bj();
                return;
            }
            this.jU.set(false);
            zp(109);
        } catch (Throwable unused) {
        }
    }

    public void lMd(boolean z8) {
        this.HWF.set(z8);
    }
}
