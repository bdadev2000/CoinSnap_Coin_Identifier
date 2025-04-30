package com.bytedance.sdk.openadsdk.core.ugen.component;

import android.content.Context;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.dQp;
import com.bytedance.sdk.component.adexpress.lMd.QR;
import com.bytedance.sdk.component.adexpress.lMd.dT;
import com.bytedance.sdk.component.adexpress.lMd.ku;
import com.bytedance.sdk.component.adexpress.lMd.rV;
import com.bytedance.sdk.component.adexpress.lMd.tG;
import com.bytedance.sdk.openadsdk.utils.QUv;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class jU implements dT {
    private AtomicBoolean COT = new AtomicBoolean(false);
    private tG KS;
    private ScheduledFuture<?> jU;
    private com.bytedance.sdk.openadsdk.core.ugen.KS.KS lMd;
    private Context zp;

    /* loaded from: classes.dex */
    public class zp implements Runnable {
        private int KS;
        dT.zp zp;

        public zp(int i9, dT.zp zpVar) {
            this.KS = i9;
            this.zp = zpVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.KS == 1) {
                jU.this.lMd.zp(true);
                jU.this.zp(this.zp, 137, "time out");
            }
        }
    }

    public jU(Context context, com.bytedance.sdk.openadsdk.core.ugen.KS.KS ks, ku kuVar, tG tGVar) {
        this.zp = context;
        this.lMd = ks;
        this.KS = tGVar;
        this.lMd.zp(kuVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.dT
    public void zp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd() {
        try {
            ScheduledFuture<?> scheduledFuture = this.jU;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.jU.cancel(false);
            this.jU = null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("RenderInterceptor", "remove ugen time out task fail", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.dT
    public boolean zp(final dT.zp zpVar) {
        int HWF = this.KS.HWF();
        if (HWF < 0) {
            zp(zpVar, 137, "time is ".concat(String.valueOf(HWF)));
        } else {
            this.jU = QUv.zp().schedule(new zp(1, zpVar), HWF, TimeUnit.MILLISECONDS);
            this.lMd.zp(new QR() { // from class: com.bytedance.sdk.openadsdk.core.ugen.component.jU.1
                @Override // com.bytedance.sdk.component.adexpress.lMd.QR
                public void zp(View view, rV rVVar) {
                    jU.this.lMd();
                    if (zpVar.KS()) {
                        return;
                    }
                    dQp dqp = new dQp();
                    dqp.zp(0);
                    ((com.bytedance.sdk.openadsdk.core.ugen.KS.zp) jU.this.KS).Lij().zp(dqp);
                    jU.this.KS.COT().dT();
                    com.bytedance.sdk.component.adexpress.lMd.dQp lMd = zpVar.lMd();
                    if (lMd == null) {
                        return;
                    }
                    lMd.zp(jU.this.lMd, rVVar);
                    zpVar.zp(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.lMd.QR
                public void zp(int i9, String str) {
                    jU.this.zp(zpVar, i9, str);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(dT.zp zpVar, int i9, String str) {
        com.bytedance.sdk.component.adexpress.lMd.dQp lMd;
        if (zpVar.KS() || this.COT.get()) {
            return;
        }
        lMd();
        dQp dqp = new dQp();
        dqp.zp(i9);
        dqp.zp(str);
        ((com.bytedance.sdk.openadsdk.core.ugen.KS.zp) this.KS).Lij().zp(dqp);
        if (zpVar.lMd(this)) {
            zpVar.zp(this);
        } else {
            if (zpVar.KS() || (lMd = zpVar.lMd()) == null) {
                return;
            }
            zpVar.zp(true);
            lMd.a_(i9);
        }
        this.COT.getAndSet(true);
    }
}
