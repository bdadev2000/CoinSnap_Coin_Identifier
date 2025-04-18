package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.VOe.YFl.wN;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.qsH.VOe;
import com.bytedance.sdk.openadsdk.core.qsH.pDU;
import com.bytedance.sdk.openadsdk.core.qsH.qO;
import com.bytedance.sdk.openadsdk.core.qsH.rkt;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.mn;

/* loaded from: classes.dex */
public class Sg extends qO {
    public static float YFl = 100.0f;
    private final com.bytedance.sdk.openadsdk.component.reward.YFl.YFl AlY;
    pDU Sg;
    rkt tN;

    public Sg(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl, AdSlot adSlot, String str) {
        super(yFl.UI, yFl.Sg, adSlot, str, yFl.iY, !yFl.uGS);
        this.AlY = yFl;
    }

    private void DSW() {
        setBackupListener(new com.bytedance.sdk.component.adexpress.Sg.tN() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.Sg.1
            @Override // com.bytedance.sdk.component.adexpress.Sg.tN
            public boolean YFl(ViewGroup viewGroup, int i10) {
                try {
                    ((qO) viewGroup).YoT();
                    Sg.this.tN = new rkt(viewGroup.getContext());
                    Sg sg2 = Sg.this;
                    sg2.tN.YFl(((qO) sg2).eT, (qO) viewGroup, Sg.this.AlY.mB);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tN(com.bytedance.sdk.component.adexpress.Sg.pDU pdu) {
        if (pdu == null) {
            return;
        }
        double vc2 = pdu.vc();
        double DSW = pdu.DSW();
        double qsH = pdu.qsH();
        double NjR = pdu.NjR();
        int tN = GS.tN(this.qsH, (float) vc2);
        int tN2 = GS.tN(this.qsH, (float) DSW);
        int tN3 = GS.tN(this.qsH, (float) qsH);
        int tN4 = GS.tN(this.qsH, (float) NjR);
        if ((NjR == 0.0d || qsH == 0.0d) && this.dXO.tN() != 7) {
            return;
        }
        if (this.dXO.tN() == 7 && (pdu instanceof com.bytedance.sdk.openadsdk.core.eT.AlY.Sg)) {
            FrameLayout rkt = ((com.bytedance.sdk.openadsdk.core.eT.AlY.Sg) pdu).rkt();
            if (rkt != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                rkt.addView(this.YoT, layoutParams);
                return;
            }
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.YoT.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(tN3, tN4);
        }
        layoutParams2.width = tN3;
        layoutParams2.height = tN4;
        layoutParams2.topMargin = tN2;
        layoutParams2.leftMargin = tN;
        layoutParams2.setMarginStart(tN);
        layoutParams2.setMarginEnd(layoutParams2.rightMargin);
        this.YoT.setLayoutParams(layoutParams2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public int AlY() {
        pDU pdu = this.Sg;
        if (pdu != null) {
            return pdu.AlY();
        }
        return 0;
    }

    public View getBackupContainerBackgroundView() {
        if (GA()) {
            return this.tN.getBackupContainerBackgroundView();
        }
        return null;
    }

    public FrameLayout getVideoFrameLayout() {
        if (GA()) {
            return this.tN.getVideoContainer();
        }
        return this.YoT;
    }

    public void setExpressVideoListenerProxy(pDU pdu) {
        this.Sg = pdu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO
    public void vc() {
        this.pDU = true;
        this.YoT = new FrameLayout(this.qsH);
        if (!com.bytedance.sdk.openadsdk.core.eT.tN.YFl(this.eT)) {
            addView(this.YoT, new FrameLayout.LayoutParams(-1, -1));
        }
        super.vc();
        com.bytedance.sdk.component.NjR.AlY webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        DSW();
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public void wN() {
        pDU pdu = this.Sg;
        if (pdu != null) {
            pdu.wN();
        }
    }

    public void Sg(final com.bytedance.sdk.component.adexpress.Sg.pDU pdu) {
        if (pdu == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.Sg.2
            @Override // java.lang.Runnable
            public void run() {
                Sg.this.tN(pdu);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public void Sg() {
        pDU pdu = this.Sg;
        if (pdu != null) {
            pdu.Sg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.component.adexpress.Sg.EH
    public void YFl(com.bytedance.sdk.component.adexpress.Sg.AlY<? extends View> alY, com.bytedance.sdk.component.adexpress.Sg.pDU pdu) {
        this.dXO = alY;
        Wwa wwa = this.eT;
        if (wwa != null && wwa.Pj()) {
            super.YFl(alY, pdu);
            return;
        }
        if (alY instanceof VOe) {
            VOe vOe = (VOe) alY;
            if (vOe.rkt() != null) {
                vOe.rkt().YFl((pDU) this);
            }
        }
        if (pdu != null && pdu.tN()) {
            Sg(pdu);
        }
        super.YFl(alY, pdu);
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public void Sg(int i10) {
        pDU pdu = this.Sg;
        if (pdu != null) {
            pdu.Sg(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO
    public boolean YFl(com.bytedance.sdk.component.adexpress.Sg.pDU pdu) {
        Wwa wwa = this.eT;
        if ((wwa instanceof com.bytedance.sdk.openadsdk.core.model.qO) && ((com.bytedance.sdk.openadsdk.core.model.qO) wwa).Wm() && pdu.tN() && pdu.Sg() == 1) {
            return false;
        }
        return super.YFl(pdu);
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public void YFl(boolean z10) {
        pDU pdu = this.Sg;
        if (pdu != null) {
            pdu.YFl(z10);
        }
        setSoundMute(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public void YFl() {
        pDU pdu = this.Sg;
        if (pdu != null) {
            pdu.YFl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public void YFl(int i10) {
        pDU pdu = this.Sg;
        if (pdu != null) {
            pdu.YFl(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.component.adexpress.Sg.qsH
    public void YFl(View view, int i10, com.bytedance.sdk.component.adexpress.tN tNVar) {
        if (i10 != -1 && tNVar != null && i10 == 3) {
            wN();
        } else {
            super.YFl(view, i10, tNVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public void YFl(int i10, String str) {
        pDU pdu = this.Sg;
        if (pdu != null) {
            pdu.YFl(i10, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public long tN() {
        pDU pdu = this.Sg;
        if (pdu != null) {
            return pdu.tN();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO
    public wN.YFl tN(int i10) {
        com.bytedance.sdk.openadsdk.activity.vc vcVar;
        wN.YFl tN = super.tN(i10);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.AlY;
        if (yFl.uGS && (vcVar = yFl.UT) != null) {
            tN.Sg = vcVar.NjR;
        }
        return tN;
    }
}
