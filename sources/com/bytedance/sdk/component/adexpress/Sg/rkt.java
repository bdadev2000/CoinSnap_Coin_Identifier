package com.bytedance.sdk.component.adexpress.Sg;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.Sg.nc;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class rkt implements nc {
    private GA AlY;
    private com.bytedance.sdk.component.adexpress.wN.YFl Sg;
    private Context YFl;
    private qsH tN;

    /* renamed from: vc, reason: collision with root package name */
    private AtomicBoolean f10356vc = new AtomicBoolean(false);
    private ScheduledFuture<?> wN;

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
                rkt.this.Sg.YFl(true);
                rkt.this.YFl(this.YFl, 107, null);
            }
        }
    }

    public rkt(Context context, GA ga2, com.bytedance.sdk.component.adexpress.wN.YFl yFl, qsH qsh) {
        this.YFl = context;
        this.AlY = ga2;
        this.tN = qsh;
        this.Sg = yFl;
        yFl.YFl(this.tN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tN() {
        try {
            ScheduledFuture<?> scheduledFuture = this.wN;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.wN.cancel(false);
                this.wN = null;
            }
        } catch (Throwable unused) {
        }
    }

    public com.bytedance.sdk.component.adexpress.wN.YFl Sg() {
        return this.Sg;
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.nc
    public boolean YFl(final nc.YFl yFl) {
        int vc2 = this.AlY.vc();
        if (vc2 < 0) {
            YFl(yFl, 107, "time is ".concat(String.valueOf(vc2)));
        } else {
            this.wN = com.bytedance.sdk.component.adexpress.AlY.AlY.YFl(new YFl(1, yFl), vc2, TimeUnit.MILLISECONDS);
            this.Sg.YFl(new DSW() { // from class: com.bytedance.sdk.component.adexpress.Sg.rkt.1
                @Override // com.bytedance.sdk.component.adexpress.Sg.DSW
                public void YFl(View view, pDU pdu) {
                    EH Sg;
                    rkt.this.tN();
                    if (yFl.tN() || (Sg = yFl.Sg()) == null) {
                        return;
                    }
                    Sg.YFl(rkt.this.Sg, pdu);
                    yFl.YFl(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.Sg.DSW
                public void YFl(int i10, String str) {
                    rkt.this.YFl(yFl, i10, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.nc
    public void YFl() {
        this.Sg.AlY();
        tN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(nc.YFl yFl, int i10, String str) {
        EH Sg;
        if (yFl.tN() || this.f10356vc.get()) {
            return;
        }
        tN();
        this.AlY.wN().YFl(i10, str);
        if (yFl.Sg(this)) {
            yFl.YFl(this);
        } else {
            if (yFl.tN() || (Sg = yFl.Sg()) == null) {
                return;
            }
            yFl.YFl(true);
            Sg.a_(i10);
        }
        this.f10356vc.getAndSet(true);
    }
}
