package com.bytedance.sdk.component.adexpress.YFl.Sg;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.YFl.tN.YFl;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.lG;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class wN extends tN {
    private static volatile wN Sg;
    private static File YFl;
    private AtomicBoolean tN = new AtomicBoolean(true);
    private AtomicBoolean AlY = new AtomicBoolean(false);
    private boolean wN = false;

    /* renamed from: vc, reason: collision with root package name */
    private AtomicBoolean f10359vc = new AtomicBoolean(false);
    private AtomicInteger DSW = new AtomicInteger(0);
    private AtomicLong qsH = new AtomicLong();

    private wN() {
        nc();
    }

    public static wN Sg() {
        if (Sg == null) {
            synchronized (wN.class) {
                if (Sg == null) {
                    Sg = new wN();
                }
            }
        }
        return Sg;
    }

    private void eT() {
        if (this.DSW.getAndSet(0) > 0 && System.currentTimeMillis() - this.qsH.get() > TTAdConstant.AD_MAX_EVENT_TIME) {
            DSW();
        }
    }

    private void nc() {
        com.bytedance.sdk.component.adexpress.AlY.AlY.Sg(new com.bytedance.sdk.component.qsH.qsH("init") { // from class: com.bytedance.sdk.component.adexpress.YFl.Sg.wN.1
            @Override // java.lang.Runnable
            public void run() {
                qsH.YFl();
                wN.this.tN.set(false);
                wN.this.AlY();
                wN.this.DSW();
                if (com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN() != null && lG.YFl(com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN().Sg())) {
                    com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN().tN().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.YFl.Sg.wN.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN() != null) {
                                com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN().AlY();
                            }
                        }
                    });
                }
            }
        }, 10);
    }

    public static File qsH() {
        if (YFl == null) {
            try {
                File file = new File(new File(AlY.YFl(), "tt_tmpl_pkg"), "template");
                file.mkdirs();
                YFl = file;
            } catch (Throwable th2) {
                YoT.YFl("TemplateManager", "getTemplateDir error", th2);
            }
        }
        return YFl;
    }

    public void AlY() {
        com.bytedance.sdk.component.adexpress.YFl.tN.YFl Sg2 = qsH.Sg();
        if (Sg2 != null && Sg2.DSW()) {
            boolean YFl2 = YFl(Sg2);
            if (!YFl2) {
                qsH.AlY();
            }
            this.wN = YFl2;
        }
    }

    public void DSW() {
        YFl(false);
    }

    public void NjR() {
        this.f10359vc.set(true);
        this.wN = false;
        this.AlY.set(false);
    }

    public void tN() {
        nc();
    }

    public com.bytedance.sdk.component.adexpress.YFl.tN.YFl vc() {
        return qsH.Sg();
    }

    public boolean wN() {
        return this.wN;
    }

    public boolean YFl(com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl) {
        if (yFl == null) {
            return false;
        }
        return YFl(yFl.YFl()) || YFl(yFl.wN()) || YFl(yFl.vc());
    }

    @Override // com.bytedance.sdk.component.adexpress.YFl.Sg.tN
    public File YFl() {
        return qsH();
    }

    public void YFl(boolean z10) {
        List<YFl.C0082YFl> list;
        boolean z11;
        if (this.tN.get()) {
            return;
        }
        try {
            if (this.AlY.get()) {
                if (z10) {
                    this.DSW.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z12 = true;
            this.AlY.set(true);
            com.bytedance.sdk.component.adexpress.YFl.tN.YFl wN = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN().wN();
            com.bytedance.sdk.component.adexpress.YFl.tN.YFl Sg2 = qsH.Sg();
            if (wN != null && wN.DSW()) {
                if (!qsH.Sg(wN)) {
                    this.AlY.set(false);
                    this.qsH.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN() != null) {
                    com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().tN().tN().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.YFl.Sg.wN.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.wN.wN.YFl().Sg();
                        }
                    });
                }
                qsH.YFl(wN);
                boolean YFl2 = (wN.wN() == null || TextUtils.isEmpty(wN.wN().YFl())) ? false : YFl(wN.wN().YFl());
                if (wN.YFl().size() != 0) {
                    list = YFl(wN, Sg2);
                    z11 = list != null;
                } else {
                    list = null;
                    z11 = YFl2;
                }
                if (!YFl2) {
                    List<YFl.C0082YFl> Sg3 = Sg(wN, Sg2);
                    if (list == null || Sg3 == null) {
                        list = Sg3;
                    } else {
                        list.addAll(Sg3);
                    }
                    if (Sg3 == null) {
                        z12 = false;
                    }
                    if (Sg3 == null) {
                        this.AlY.set(false);
                    }
                    z11 = z12;
                }
                if (z11 && YFl(wN)) {
                    qsH.YFl(wN);
                    qsH.tN();
                    Sg(list);
                }
                AlY();
                this.AlY.set(false);
                this.qsH.set(System.currentTimeMillis());
                eT();
                return;
            }
            this.AlY.set(false);
            YFl(109);
        } catch (Throwable unused) {
        }
    }

    public void Sg(boolean z10) {
        this.f10359vc.set(z10);
    }
}
