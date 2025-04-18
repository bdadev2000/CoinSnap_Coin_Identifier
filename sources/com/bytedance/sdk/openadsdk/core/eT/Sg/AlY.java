package com.bytedance.sdk.openadsdk.core.eT.Sg;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.Sg.DSW;
import com.bytedance.sdk.component.adexpress.Sg.EH;
import com.bytedance.sdk.component.adexpress.Sg.GA;
import com.bytedance.sdk.component.adexpress.Sg.nc;
import com.bytedance.sdk.component.adexpress.Sg.pDU;
import com.bytedance.sdk.component.adexpress.Sg.qsH;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.utils.mn;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AlY implements nc {
    private ScheduledFuture<?> AlY;
    private com.bytedance.sdk.openadsdk.core.eT.AlY.tN Sg;
    private Context YFl;
    private GA tN;
    private AtomicBoolean wN = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public class YFl implements Runnable {
        nc.YFl YFl;
        private int tN;

        public YFl(int i10, nc.YFl yFl) {
            this.tN = i10;
            this.YFl = yFl;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.tN == 1) {
                AlY.this.Sg.YFl(true);
                AlY.this.YFl(this.YFl, 137, "real time out" + AlY.this.tN.vc());
            }
        }
    }

    public AlY(Context context, com.bytedance.sdk.openadsdk.core.eT.AlY.tN tNVar, qsH qsh, GA ga2) {
        this.YFl = context;
        this.Sg = tNVar;
        this.tN = ga2;
        this.Sg.YFl(qsh);
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.nc
    public void YFl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg() {
        try {
            ScheduledFuture<?> scheduledFuture = this.AlY;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.AlY.cancel(false);
            this.AlY = null;
        } catch (Throwable th2) {
            YoT.YFl("RenderInterceptor", "remove ugen time out task fail", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.nc
    public boolean YFl(final nc.YFl yFl) {
        int vc2 = this.tN.vc();
        if (vc2 < 0) {
            YFl(yFl, 137, "time is ".concat(String.valueOf(vc2)));
        } else {
            this.AlY = mn.YFl().schedule(new YFl(1, yFl), vc2, TimeUnit.MILLISECONDS);
            this.Sg.YFl(new DSW() { // from class: com.bytedance.sdk.openadsdk.core.eT.Sg.AlY.1
                @Override // com.bytedance.sdk.component.adexpress.Sg.DSW
                public void YFl(View view, pDU pdu) {
                    AlY.this.Sg();
                    if (yFl.tN()) {
                        return;
                    }
                    com.bytedance.adsdk.ugeno.core.pDU pdu2 = new com.bytedance.adsdk.ugeno.core.pDU();
                    pdu2.YFl(0);
                    ((com.bytedance.sdk.openadsdk.core.eT.AlY.YFl) AlY.this.tN).Cfr().YFl(pdu2);
                    AlY.this.tN.wN().nc();
                    EH Sg = yFl.Sg();
                    if (Sg == null) {
                        return;
                    }
                    Sg.YFl(AlY.this.Sg, pdu);
                    yFl.YFl(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.Sg.DSW
                public void YFl(int i10, String str) {
                    AlY.this.YFl(yFl, i10, str);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(nc.YFl yFl, int i10, String str) {
        EH Sg;
        if (yFl.tN() || this.wN.get()) {
            return;
        }
        Sg();
        com.bytedance.adsdk.ugeno.core.pDU pdu = new com.bytedance.adsdk.ugeno.core.pDU();
        pdu.YFl(i10);
        pdu.YFl(str);
        ((com.bytedance.sdk.openadsdk.core.eT.AlY.YFl) this.tN).Cfr().YFl(pdu);
        if (yFl.Sg(this)) {
            yFl.YFl(this);
        } else {
            if (yFl.tN() || (Sg = yFl.Sg()) == null) {
                return;
            }
            yFl.YFl(true);
            Sg.a_(i10);
        }
        this.wN.getAndSet(true);
    }
}
