package com.bytedance.sdk.component.adexpress.lMd;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.lMd.dT;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class KVG implements dT {
    private ScheduledFuture<?> COT;
    private AtomicBoolean HWF = new AtomicBoolean(false);
    private ku KS;
    private tG jU;
    private com.bytedance.sdk.component.adexpress.COT.zp lMd;
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
                KVG.this.lMd.zp(true);
                KVG.this.zp(this.zp, 107, null);
            }
        }
    }

    public KVG(Context context, tG tGVar, com.bytedance.sdk.component.adexpress.COT.zp zpVar, ku kuVar) {
        this.zp = context;
        this.jU = tGVar;
        this.KS = kuVar;
        this.lMd = zpVar;
        zpVar.zp(this.KS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KS() {
        try {
            ScheduledFuture<?> scheduledFuture = this.COT;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.COT.cancel(false);
                this.COT = null;
            }
        } catch (Throwable unused) {
        }
    }

    public com.bytedance.sdk.component.adexpress.COT.zp lMd() {
        return this.lMd;
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.dT
    public boolean zp(final dT.zp zpVar) {
        int HWF = this.jU.HWF();
        if (HWF < 0) {
            zp(zpVar, 107, "time is ".concat(String.valueOf(HWF)));
        } else {
            this.COT = com.bytedance.sdk.component.adexpress.jU.KS.zp(new zp(1, zpVar), HWF, TimeUnit.MILLISECONDS);
            this.lMd.zp(new QR() { // from class: com.bytedance.sdk.component.adexpress.lMd.KVG.1
                @Override // com.bytedance.sdk.component.adexpress.lMd.QR
                public void zp(View view, rV rVVar) {
                    dQp lMd;
                    KVG.this.KS();
                    if (zpVar.KS() || (lMd = zpVar.lMd()) == null) {
                        return;
                    }
                    lMd.zp(KVG.this.lMd, rVVar);
                    zpVar.zp(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.lMd.QR
                public void zp(int i9, String str) {
                    KVG.this.zp(zpVar, i9, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.dT
    public void zp() {
        this.lMd.jU();
        KS();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(dT.zp zpVar, int i9, String str) {
        dQp lMd;
        if (zpVar.KS() || this.HWF.get()) {
            return;
        }
        KS();
        this.jU.COT().zp(i9, str);
        if (zpVar.lMd(this)) {
            zpVar.zp(this);
        } else {
            if (zpVar.KS() || (lMd = zpVar.lMd()) == null) {
                return;
            }
            zpVar.zp(true);
            lMd.a_(i9);
        }
        this.HWF.getAndSet(true);
    }
}
