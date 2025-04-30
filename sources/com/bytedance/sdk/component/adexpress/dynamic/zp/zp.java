package com.bytedance.sdk.component.adexpress.dynamic.zp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.KS.HWF;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.COT;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.jU.KS;
import com.bytedance.sdk.component.adexpress.lMd.Bj;
import com.bytedance.sdk.component.adexpress.lMd.QR;
import com.bytedance.sdk.component.adexpress.lMd.jU;
import com.bytedance.sdk.component.adexpress.lMd.ku;
import com.bytedance.sdk.component.adexpress.lMd.rV;
import com.bytedance.sdk.component.adexpress.lMd.tG;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp implements Bj, jU<DynamicRootView> {
    private ku COT;
    private tG HWF;
    private Context KS;
    private ScheduledFuture<?> QR;
    private QR jU;
    private AtomicBoolean ku = new AtomicBoolean(false);
    private com.bytedance.sdk.component.adexpress.dynamic.jU.ku lMd;
    private DynamicRootView zp;

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.zp.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0079zp implements Runnable {
        private int lMd;

        public RunnableC0079zp(int i9) {
            this.lMd = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i9;
            if (this.lMd == 2) {
                if (zp.this.lMd instanceof com.bytedance.sdk.component.adexpress.dynamic.jU.QR) {
                    i9 = 127;
                } else {
                    i9 = 117;
                }
                zp.this.zp.zp(i9, (String) null);
            }
        }
    }

    public zp(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z8, com.bytedance.sdk.component.adexpress.dynamic.jU.ku kuVar, tG tGVar, com.bytedance.sdk.component.adexpress.dynamic.COT.zp zpVar) {
        this.KS = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z8, tGVar, zpVar);
        this.zp = dynamicRootView;
        this.lMd = kuVar;
        this.HWF = tGVar;
        dynamicRootView.setRenderListener(this);
        this.HWF = tGVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HWF() {
        int i9;
        boolean z8;
        this.HWF.COT().lMd(KS());
        JSONObject KS = this.HWF.KS();
        if (!com.bytedance.sdk.component.adexpress.zp.lMd.lMd.zp(KS)) {
            if (this.lMd instanceof com.bytedance.sdk.component.adexpress.dynamic.jU.QR) {
                i9 = 123;
            } else {
                i9 = 113;
            }
            DynamicRootView dynamicRootView = this.zp;
            StringBuilder sb = new StringBuilder("data null is ");
            if (KS == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            sb.append(z8);
            dynamicRootView.zp(i9, sb.toString());
            return;
        }
        this.lMd.zp(new com.bytedance.sdk.component.adexpress.dynamic.COT.lMd() { // from class: com.bytedance.sdk.component.adexpress.dynamic.zp.zp.2
            @Override // com.bytedance.sdk.component.adexpress.dynamic.COT.lMd
            public void zp(final com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar) {
                zp.this.ku();
                zp.this.HWF.COT().KS(zp.this.KS());
                zp.this.zp(kuVar);
                zp.this.lMd(kuVar);
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    zp.this.KS(kuVar);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.zp.zp.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            zp.this.KS(kuVar);
                        }
                    });
                }
                if (zp.this.zp != null && kuVar != null) {
                    zp.this.zp.setBgColor(kuVar.zp());
                    zp.this.zp.setBgMaterialCenterCalcColor(kuVar.lMd());
                }
            }
        });
        this.lMd.zp(this.HWF);
    }

    private boolean QR() {
        DynamicRootView dynamicRootView = this.zp;
        if (dynamicRootView == null || dynamicRootView.getChildCount() == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ku() {
        try {
            ScheduledFuture<?> scheduledFuture = this.QR;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.QR.cancel(false);
                this.QR = null;
            }
        } catch (Throwable unused) {
        }
    }

    public DynamicRootView jU() {
        return this.zp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar) {
        float f9;
        float f10;
        List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> Bj;
        if (kuVar == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> Bj2 = kuVar.Bj();
        if (Bj2 == null || Bj2.size() <= 0) {
            f9 = 0.0f;
        } else {
            f9 = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar2 : Bj2) {
                if (kuVar2.QR() > kuVar.QR() - kuVar2.YW() || (Bj = kuVar2.Bj()) == null || Bj.size() <= 0) {
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar3 : Bj) {
                        if (kuVar3.dT().lMd().equals("logo-union")) {
                            f10 = kuVar3.dT().HWF();
                            f9 = ((kuVar.QR() + (-f10)) - kuVar2.QR()) + kuVar2.dT().COT().ny();
                        }
                    }
                }
                lMd(kuVar2);
                if (f10 <= -15.0f) {
                    kuVar2.HWF(kuVar2.YW() - f10);
                    kuVar2.jU(kuVar2.QR() + f10);
                    for (com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar4 : kuVar2.Bj()) {
                        kuVar4.jU(kuVar4.QR() - f10);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.KS.ku vDp = kuVar.vDp();
        if (vDp == null) {
            return;
        }
        float HWF = kuVar.HWF() - vDp.HWF();
        float QR = kuVar.QR() - vDp.QR();
        kuVar.KS(HWF);
        kuVar.jU(QR);
        if (f9 > 0.0f) {
            kuVar.jU(kuVar.QR() - f9);
            kuVar.HWF(kuVar.YW() + f9);
            for (com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar5 : kuVar.Bj()) {
                kuVar5.jU(kuVar5.QR() + f9);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.jU
    public int KS() {
        return this.lMd instanceof com.bytedance.sdk.component.adexpress.dynamic.jU.QR ? 3 : 2;
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.jU
    public void zp(QR qr) {
        this.jU = qr;
        int HWF = this.HWF.HWF();
        if (HWF < 0) {
            this.zp.zp(this.lMd instanceof com.bytedance.sdk.component.adexpress.dynamic.jU.QR ? 127 : 117, "time is ".concat(String.valueOf(HWF)));
            return;
        }
        this.QR = KS.zp(new RunnableC0079zp(2), HWF, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() == Looper.myLooper() && this.HWF.YW() <= 0) {
            HWF();
        } else {
            com.bytedance.sdk.component.utils.ku.lMd().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.zp.zp.1
                @Override // java.lang.Runnable
                public void run() {
                    zp.this.HWF();
                }
            }, this.HWF.YW());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KS(com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar) {
        if (kuVar == null) {
            this.zp.zp(this.lMd instanceof com.bytedance.sdk.component.adexpress.dynamic.jU.QR ? 123 : 113, "layoutUnit is null");
            return;
        }
        this.HWF.COT().jU(KS());
        try {
            this.zp.zp(kuVar, KS());
        } catch (Exception e4) {
            int i9 = this.lMd instanceof com.bytedance.sdk.component.adexpress.dynamic.jU.QR ? 128 : 118;
            this.zp.zp(i9, "exception is " + e4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar) {
        List<com.bytedance.sdk.component.adexpress.dynamic.KS.ku> Bj;
        if (kuVar == null || (Bj = kuVar.Bj()) == null || Bj.size() <= 0) {
            return;
        }
        Collections.sort(Bj, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.KS.ku>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.zp.zp.3
            @Override // java.util.Comparator
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar2, com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar3) {
                HWF COT = kuVar2.dT().COT();
                HWF COT2 = kuVar3.dT().COT();
                if (COT != null && COT2 != null) {
                    if (COT.iOI() >= COT2.iOI()) {
                        return 1;
                    }
                    return -1;
                }
                return 0;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.KS.ku kuVar2 : Bj) {
            if (kuVar2 != null) {
                zp(kuVar2);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.jU
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public DynamicRootView COT() {
        return jU();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zp(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i9 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i9 >= viewGroup.getChildCount()) {
                    break;
                }
                zp(viewGroup.getChildAt(i9));
                i9++;
            }
        }
        if (view instanceof COT) {
            ((COT) view).lMd();
        }
    }

    public void zp(ku kuVar) {
        this.COT = kuVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.Bj
    public void zp(rV rVVar) {
        if (this.ku.get()) {
            return;
        }
        this.ku.set(true);
        if (rVVar.KS() && QR()) {
            this.zp.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.jU.zp(COT(), rVVar);
            return;
        }
        this.jU.zp(rVVar.Bj(), rVVar.dT());
    }

    public void lMd() {
        zp(COT());
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.Bj
    public void zp(View view, int i9, com.bytedance.sdk.component.adexpress.KS ks) {
        ku kuVar = this.COT;
        if (kuVar != null) {
            kuVar.zp(view, i9, ks);
        }
    }
}
