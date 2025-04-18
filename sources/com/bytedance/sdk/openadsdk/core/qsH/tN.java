package com.bytedance.sdk.openadsdk.core.qsH;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.UZM;
import com.bytedance.sdk.openadsdk.core.qsH.wN;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class tN {
    private com.bytedance.sdk.component.adexpress.Sg.EH AlY;
    private int DSW;
    private int NjR;
    private final Context Sg;
    com.bytedance.sdk.openadsdk.core.model.Wwa YFl;
    private ScheduledFuture<?> qsH;
    private YFl tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10733vc;
    private qO wN;

    /* loaded from: classes.dex */
    public static class Sg implements Runnable {
        InterfaceC0130tN YFl;

        public Sg(InterfaceC0130tN interfaceC0130tN) {
            this.YFl = interfaceC0130tN;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0130tN interfaceC0130tN = this.YFl;
            if (interfaceC0130tN != null) {
                interfaceC0130tN.YFl(107, 107);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class YFl implements com.bytedance.sdk.component.adexpress.Sg.AlY<View>, wN.Sg {
        private String AlY;
        private final int DSW;
        private PAGExpressAdWrapperListener EH;
        private int GA;
        private com.bytedance.sdk.openadsdk.core.model.Wwa NjR;
        private com.bytedance.sdk.openadsdk.tN.tN Sg;
        AtomicBoolean YFl = new AtomicBoolean(false);
        private wN YoT;
        private String eT;

        /* renamed from: nc, reason: collision with root package name */
        private final int f10734nc;
        private com.bytedance.sdk.component.adexpress.Sg.DSW pDU;
        private FrameLayout qsH;
        private TTDislikeDialogAbstract tN;

        /* renamed from: vc, reason: collision with root package name */
        private final int f10735vc;
        private final Context wN;

        public YFl(Context context, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, int i10, int i11, String str, int i12) {
            this.eT = str;
            if (wwa != null && wwa.Pj()) {
                this.eT = "fullscreen_interstitial_ad";
            }
            this.wN = context;
            this.f10735vc = i10;
            this.DSW = i11;
            this.NjR = wwa;
            this.f10734nc = GS.tN(context, 3.0f);
            this.GA = i12;
            vc();
        }

        private View DSW() {
            PAGLogoView pAGLogoView = new PAGLogoView(this.wN);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.NjR;
            if (wwa != null && wwa.Pj()) {
                layoutParams.leftMargin = GS.tN(this.wN, 20.0f);
                layoutParams.bottomMargin = GS.tN(this.wN, 20.0f);
                layoutParams.gravity = 8388691;
            } else {
                int i10 = this.f10734nc;
                layoutParams.topMargin = i10;
                layoutParams.leftMargin = i10;
            }
            pAGLogoView.setLayoutParams(layoutParams);
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.qsH.tN.YFl.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTWebsiteActivity.YFl(YFl.this.wN, YFl.this.NjR, YFl.this.eT);
                }
            });
            return pAGLogoView;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        private wN qsH() {
            wN Sg = AlY.YFl().Sg();
            this.YoT = Sg;
            if (Sg == null) {
                this.YoT = new wN(this.wN);
            }
            AlY.YFl().tN(this.YoT);
            this.YoT.YFl(this.NjR, this, this.eT);
            this.YoT.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.YoT;
        }

        private void vc() {
            FrameLayout frameLayout = new FrameLayout(this.wN);
            this.qsH = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.f10735vc, this.DSW);
            }
            layoutParams.width = this.f10735vc;
            layoutParams.height = this.DSW;
            layoutParams.gravity = 17;
            this.qsH.setLayoutParams(layoutParams);
            wN qsH = qsH();
            this.qsH.addView(qsH);
            View DSW = DSW();
            this.qsH.addView(DSW);
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.NjR;
            if (wwa != null && wwa.Pj()) {
                qsH.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                qsH.YFl(((Activity) this.wN).findViewById(com.bytedance.sdk.openadsdk.utils.GA.VRF), FriendlyObstructionPurpose.OTHER);
            }
            qsH.YFl(DSW, FriendlyObstructionPurpose.OTHER);
        }

        @Override // com.bytedance.sdk.openadsdk.core.qsH.wN.Sg
        public View YFl() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.core.qsH.wN.Sg
        @SuppressLint({"ClickableViewAccessibility"})
        public void e_() {
            if (this.pDU != null) {
                com.bytedance.sdk.component.adexpress.Sg.pDU pdu = new com.bytedance.sdk.component.adexpress.Sg.pDU();
                pdu.YFl(true);
                pdu.YFl(GS.AlY(this.wN, this.f10735vc));
                pdu.Sg(GS.AlY(this.wN, this.DSW));
                this.pDU.YFl(this.qsH, pdu);
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.Sg.AlY
        public int tN() {
            return 5;
        }

        @Override // com.bytedance.sdk.component.adexpress.Sg.AlY
        public View wN() {
            return this.qsH;
        }

        public void AlY() {
            this.qsH = null;
            this.Sg = null;
            this.tN = null;
            this.pDU = null;
            this.NjR = null;
            wN wNVar = this.YoT;
            if (wNVar != null) {
                wNVar.YoT();
                AlY.YFl().YFl(this.YoT);
            }
            this.YFl.set(true);
        }

        @Override // com.bytedance.sdk.openadsdk.core.qsH.wN.Sg
        public View Sg() {
            FrameLayout frameLayout = this.qsH;
            if (frameLayout == null) {
                return null;
            }
            return (View) frameLayout.getParent();
        }

        @Override // com.bytedance.sdk.component.adexpress.Sg.AlY
        public void YFl(com.bytedance.sdk.component.adexpress.Sg.DSW dsw) {
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa;
            if (this.YFl.get()) {
                return;
            }
            if (this.wN != null && (wwa = this.NjR) != null) {
                this.pDU = dsw;
                if (TextUtils.isEmpty(wwa.PT())) {
                    dsw.YFl(106, "dsp data is null");
                    return;
                } else {
                    this.YoT.rkt();
                    return;
                }
            }
            dsw.YFl(106, "material null");
        }

        public void YFl(UZM uzm) {
            if (uzm instanceof com.bytedance.sdk.openadsdk.tN.tN) {
                this.Sg = (com.bytedance.sdk.openadsdk.tN.tN) uzm;
            }
        }

        public void YFl(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa;
            if (tTDislikeDialogAbstract != null && (wwa = this.NjR) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(wwa.uGS(), this.NjR.UT());
            }
            this.tN = tTDislikeDialogAbstract;
        }

        public void YFl(String str) {
            this.AlY = str;
        }

        @Override // com.bytedance.sdk.openadsdk.core.qsH.wN.Sg
        public void YFl(View view, int i10) {
            PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.EH;
            if (pAGExpressAdWrapperListener != null) {
                pAGExpressAdWrapperListener.onAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.qsH.wN.Sg
        public void YFl(int i10, int i11) {
            com.bytedance.sdk.component.adexpress.Sg.DSW dsw = this.pDU;
            if (dsw != null) {
                dsw.YFl(i10, "render fail");
            }
        }

        public void YFl(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
            this.EH = pAGExpressAdWrapperListener;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.qsH.tN$tN, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0130tN {
        void Sg(String str);

        void YFl();

        void YFl(int i10, int i11);

        void YFl(String str);
    }

    public tN(Context context, qO qOVar, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, String str) {
        this.YFl = wwa;
        this.Sg = context;
        this.wN = qOVar;
        YFl(qOVar);
        this.tN = new YFl(context, wwa, this.f10733vc, this.DSW, str, this.NjR);
    }

    private void YFl(qO qOVar) {
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.YFl;
        if (wwa != null && wwa.Pj()) {
            this.f10733vc = -1;
            this.DSW = -1;
            return;
        }
        lG YFl2 = com.bytedance.sdk.openadsdk.core.tN.YFl.YFl(qOVar.getExpectExpressWidth(), qOVar.getExpectExpressHeight());
        this.NjR = YFl2.YFl;
        if (qOVar.getExpectExpressWidth() > 0 && qOVar.getExpectExpressHeight() > 0) {
            this.f10733vc = GS.tN(this.Sg, qOVar.getExpectExpressWidth());
            this.DSW = GS.tN(this.Sg, qOVar.getExpectExpressHeight());
        } else {
            int tN = GS.tN(this.Sg);
            this.f10733vc = tN;
            this.DSW = Float.valueOf(tN / YFl2.Sg).intValue();
        }
        int i10 = this.f10733vc;
        if (i10 <= 0 || i10 <= GS.tN(this.Sg)) {
            return;
        }
        this.f10733vc = GS.tN(this.Sg);
        this.DSW = Float.valueOf(this.DSW * (GS.tN(this.Sg) / this.f10733vc)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tN() {
        try {
            ScheduledFuture<?> scheduledFuture = this.qsH;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.qsH.cancel(false);
            this.qsH = null;
        } catch (Throwable unused) {
        }
    }

    public void Sg() {
        YFl yFl = this.tN;
        if (yFl != null) {
            yFl.AlY();
            this.tN = null;
        }
        tN();
        this.AlY = null;
        this.wN = null;
    }

    public void YFl(com.bytedance.sdk.component.adexpress.Sg.EH eh2) {
        this.AlY = eh2;
    }

    public void YFl() {
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.YFl;
        if (wwa != null && wwa.Pj()) {
            this.qsH = mn.YFl().schedule(new Sg(this.tN.YoT), com.bytedance.sdk.openadsdk.core.lG.AlY().Ga(), TimeUnit.MILLISECONDS);
        }
        YFl yFl = this.tN;
        if (yFl != null) {
            yFl.YFl(new com.bytedance.sdk.component.adexpress.Sg.DSW() { // from class: com.bytedance.sdk.openadsdk.core.qsH.tN.1
                @Override // com.bytedance.sdk.component.adexpress.Sg.DSW
                public void YFl(View view, com.bytedance.sdk.component.adexpress.Sg.pDU pdu) {
                    if (tN.this.wN == null || view == null) {
                        if (tN.this.AlY != null) {
                            tN.this.AlY.a_(106);
                        }
                    } else if (tN.this.AlY != null) {
                        tN.this.AlY.YFl(tN.this.tN, pdu);
                    }
                    tN.this.tN();
                }

                @Override // com.bytedance.sdk.component.adexpress.Sg.DSW
                public void YFl(int i10, String str) {
                    if (tN.this.AlY != null) {
                        tN.this.AlY.a_(106);
                    }
                    tN.this.tN();
                }
            });
            View wN = this.tN.wN();
            this.wN.removeView(wN);
            if (wN.getParent() != null) {
                ((ViewGroup) wN.getParent()).removeView(wN);
            }
            this.wN.addView(wN, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        com.bytedance.sdk.component.adexpress.Sg.EH eh2 = this.AlY;
        if (eh2 != null) {
            eh2.a_(106);
        }
    }

    public void YFl(UZM uzm) {
        YFl yFl = this.tN;
        if (yFl != null) {
            yFl.YFl(uzm);
        }
    }

    public void YFl(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        YFl yFl = this.tN;
        if (yFl != null) {
            yFl.YFl(tTDislikeDialogAbstract);
        }
    }

    public void YFl(String str) {
        YFl yFl = this.tN;
        if (yFl != null) {
            yFl.YFl(str);
        }
    }

    public void YFl(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        YFl yFl = this.tN;
        if (yFl != null) {
            yFl.YFl(pAGExpressAdWrapperListener);
        }
    }
}
