package com.bytedance.sdk.component.adexpress.dynamic.YFl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Sg.AlY;
import com.bytedance.sdk.component.adexpress.Sg.DSW;
import com.bytedance.sdk.component.adexpress.Sg.GA;
import com.bytedance.sdk.component.adexpress.Sg.eT;
import com.bytedance.sdk.component.adexpress.Sg.pDU;
import com.bytedance.sdk.component.adexpress.dynamic.AlY.vc;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.GS;
import com.bytedance.sdk.component.adexpress.dynamic.wN.qsH;
import com.bytedance.sdk.component.adexpress.tN;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl implements AlY<DynamicRootView>, eT {
    private DSW AlY;
    private ScheduledFuture<?> DSW;
    private qsH Sg;
    private DynamicRootView YFl;
    private AtomicBoolean qsH = new AtomicBoolean(false);
    private Context tN;

    /* renamed from: vc, reason: collision with root package name */
    private GA f10383vc;
    private com.bytedance.sdk.component.adexpress.Sg.qsH wN;

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.YFl.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0083YFl implements Runnable {
        private int Sg;

        public RunnableC0083YFl(int i10) {
            this.Sg = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            if (this.Sg == 2) {
                if (YFl.this.Sg instanceof com.bytedance.sdk.component.adexpress.dynamic.wN.DSW) {
                    i10 = 127;
                } else {
                    i10 = 117;
                }
                YFl.this.YFl.callBackRenderFail(i10, null);
            }
        }
    }

    public YFl(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, qsH qsh, GA ga2, com.bytedance.sdk.component.adexpress.dynamic.vc.YFl yFl) {
        this.tN = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z10, ga2, yFl);
        this.YFl = dynamicRootView;
        this.Sg = qsh;
        this.f10383vc = ga2;
        dynamicRootView.setRenderListener(this);
        this.f10383vc = ga2;
    }

    private boolean DSW() {
        DynamicRootView dynamicRootView = this.YFl;
        if (dynamicRootView == null || dynamicRootView.getChildCount() == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qsH() {
        try {
            ScheduledFuture<?> scheduledFuture = this.DSW;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.DSW.cancel(false);
                this.DSW = null;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vc() {
        int i10;
        boolean z10;
        this.f10383vc.wN().Sg(tN());
        JSONObject tN = this.f10383vc.tN();
        if (!com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.YFl(tN)) {
            if (this.Sg instanceof com.bytedance.sdk.component.adexpress.dynamic.wN.DSW) {
                i10 = 123;
            } else {
                i10 = 113;
            }
            DynamicRootView dynamicRootView = this.YFl;
            StringBuilder sb2 = new StringBuilder("data null is ");
            if (tN == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            dynamicRootView.callBackRenderFail(i10, sb2.toString());
            return;
        }
        this.Sg.YFl(new com.bytedance.sdk.component.adexpress.dynamic.vc.Sg() { // from class: com.bytedance.sdk.component.adexpress.dynamic.YFl.YFl.2
            @Override // com.bytedance.sdk.component.adexpress.dynamic.vc.Sg
            public void YFl(final com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
                YFl.this.qsH();
                YFl.this.f10383vc.wN().tN(YFl.this.tN());
                YFl.this.YFl(qsh);
                YFl.this.Sg(qsh);
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    YFl.this.tN(qsh);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.YFl.YFl.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            YFl.this.tN(qsh);
                        }
                    });
                }
                if (YFl.this.YFl != null && qsh != null) {
                    YFl.this.YFl.setBgColor(qsh.YFl());
                    YFl.this.YFl.setBgMaterialCenterCalcColor(qsh.Sg());
                }
            }
        });
        this.Sg.YFl(this.f10383vc);
    }

    public DynamicRootView AlY() {
        return this.YFl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        float f10;
        float f11;
        List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> eT;
        if (qsh == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> eT2 = qsh.eT();
        if (eT2 == null || eT2.size() <= 0) {
            f10 = 0.0f;
        } else {
            f10 = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh2 : eT2) {
                if (qsh2.DSW() > qsh.DSW() - qsh2.NjR() || (eT = qsh2.eT()) == null || eT.size() <= 0) {
                    f11 = 0.0f;
                } else {
                    f11 = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh3 : eT) {
                        if (qsh3.nc().Sg().equals("logo-union")) {
                            f11 = qsh3.nc().vc();
                            f10 = qsh2.nc().wN().PT() + ((qsh.DSW() + (-f11)) - qsh2.DSW());
                        }
                    }
                }
                Sg(qsh2);
                if (f11 <= -15.0f) {
                    qsh2.vc(qsh2.NjR() - f11);
                    qsh2.AlY(qsh2.DSW() + f11);
                    for (com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh4 : qsh2.eT()) {
                        qsh4.AlY(qsh4.DSW() - f11);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH YoT = qsh.YoT();
        if (YoT == null) {
            return;
        }
        float vc2 = qsh.vc() - YoT.vc();
        float DSW = qsh.DSW() - YoT.DSW();
        qsh.tN(vc2);
        qsh.AlY(DSW);
        if (f10 > 0.0f) {
            qsh.AlY(qsh.DSW() - f10);
            qsh.vc(qsh.NjR() + f10);
            for (com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh5 : qsh.eT()) {
                qsh5.AlY(qsh5.DSW() + f10);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.AlY
    public void YFl(DSW dsw) {
        this.AlY = dsw;
        int vc2 = this.f10383vc.vc();
        if (vc2 < 0) {
            this.YFl.callBackRenderFail(this.Sg instanceof com.bytedance.sdk.component.adexpress.dynamic.wN.DSW ? 127 : 117, "time is ".concat(String.valueOf(vc2)));
            return;
        }
        this.DSW = com.bytedance.sdk.component.adexpress.AlY.AlY.YFl(new RunnableC0083YFl(2), vc2, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() == Looper.myLooper() && this.f10383vc.NjR() <= 0) {
            vc();
        } else {
            com.bytedance.sdk.component.utils.DSW.Sg().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.YFl.YFl.1
                @Override // java.lang.Runnable
                public void run() {
                    YFl.this.vc();
                }
            }, this.f10383vc.NjR());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.AlY
    public int tN() {
        return this.Sg instanceof com.bytedance.sdk.component.adexpress.dynamic.wN.DSW ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tN(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        if (qsh == null) {
            this.YFl.callBackRenderFail(this.Sg instanceof com.bytedance.sdk.component.adexpress.dynamic.wN.DSW ? 123 : 113, "layoutUnit is null");
            return;
        }
        this.f10383vc.wN().AlY(tN());
        try {
            this.YFl.render(qsh, tN());
        } catch (Exception e2) {
            int i10 = this.Sg instanceof com.bytedance.sdk.component.adexpress.dynamic.wN.DSW ? 128 : 118;
            this.YFl.callBackRenderFail(i10, "exception is " + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> eT;
        if (qsh == null || (eT = qsh.eT()) == null || eT.size() <= 0) {
            return;
        }
        Collections.sort(eT, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.YFl.YFl.3
            @Override // java.util.Comparator
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh2, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh3) {
                vc wN = qsh2.nc().wN();
                vc wN2 = qsh3.nc().wN();
                if (wN != null && wN2 != null) {
                    if (wN.qjy() >= wN2.qjy()) {
                        return 1;
                    }
                    return -1;
                }
                return 0;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh2 : eT) {
            if (qsh2 != null) {
                YFl(qsh2);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.AlY
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public DynamicRootView wN() {
        return AlY();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void YFl(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                YFl(viewGroup.getChildAt(i10));
                i10++;
            }
        }
        if (view instanceof GS) {
            ((GS) view).Sg();
        }
    }

    public void YFl(com.bytedance.sdk.component.adexpress.Sg.qsH qsh) {
        this.wN = qsh;
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.eT
    public void YFl(pDU pdu) {
        if (this.qsH.get()) {
            return;
        }
        this.qsH.set(true);
        if (pdu.tN() && DSW()) {
            this.YFl.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.AlY.YFl(wN(), pdu);
            return;
        }
        this.AlY.YFl(pdu.eT(), pdu.nc());
    }

    public void Sg() {
        YFl(wN());
    }

    @Override // com.bytedance.sdk.component.adexpress.Sg.eT
    public void YFl(View view, int i10, tN tNVar) {
        com.bytedance.sdk.component.adexpress.Sg.qsH qsh = this.wN;
        if (qsh != null) {
            qsh.YFl(view, i10, tNVar);
        }
    }
}
