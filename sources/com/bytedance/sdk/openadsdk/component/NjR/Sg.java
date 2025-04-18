package com.bytedance.sdk.openadsdk.component.NjR;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.Sg.GA;
import com.bytedance.sdk.component.adexpress.Sg.pDU;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.qsH.qO;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.mn;
import l5.e;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg extends qO {
    private e AlY;
    private FrameLayout Sg;
    boolean YFl;
    private com.bytedance.sdk.openadsdk.component.vc.YFl tN;

    public Sg(@NonNull Context context, Wwa wwa, AdSlot adSlot, String str) {
        super(context, wwa, adSlot, str, true, true);
        this.YFl = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tN(pDU pdu) {
        if (pdu == null) {
            return;
        }
        if (pdu.YFl() != null) {
            if (this.YFl) {
                pdu.YFl().setTag(com.bytedance.sdk.component.adexpress.dynamic.YFl.f10382vc, 1);
                ((FrameLayout) pdu.YFl()).removeAllViews();
                FrameLayout frameLayout = (FrameLayout) pdu.YFl();
                this.Sg = frameLayout;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
                this.YFl = false;
                return;
            }
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
                rkt.addView(this.Sg, layoutParams);
                return;
            }
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.Sg.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(tN3, tN4);
        }
        layoutParams2.width = tN3;
        layoutParams2.height = tN4;
        layoutParams2.topMargin = tN2;
        layoutParams2.leftMargin = tN;
        layoutParams2.setMarginStart(tN);
        layoutParams2.setMarginEnd(layoutParams2.rightMargin);
        this.Sg.setLayoutParams(layoutParams2);
    }

    public void Sg(final pDU pdu) {
        if (pdu == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.NjR.Sg.1
            @Override // java.lang.Runnable
            public void run() {
                Sg.this.tN(pdu);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public void YFl(int i10, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO
    public int getDynamicShowType() {
        if (this.dXO == null) {
            return 1;
        }
        return super.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO
    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.component.DSW.YFl.YFl(this.eT, lG.AlY().DSW(String.valueOf(this.eT.kU())));
    }

    public FrameLayout getVideoFrameLayout() {
        return this.Sg;
    }

    public void setExpressVideoListenerProxy(e eVar) {
        this.AlY = eVar;
    }

    public void setTopListener(com.bytedance.sdk.openadsdk.component.vc.YFl yFl) {
        this.tN = yFl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO
    public void vc() {
        this.pDU = true;
        this.Sg = new FrameLayout(this.qsH);
        if (!com.bytedance.sdk.openadsdk.core.eT.tN.YFl(this.eT)) {
            addView(this.Sg, new FrameLayout.LayoutParams(-1, -1));
        }
        super.vc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public void wN() {
        com.bytedance.sdk.openadsdk.component.vc.YFl yFl = this.tN;
        if (yFl != null) {
            yFl.Sg(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public void Sg() {
        super.Sg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.component.adexpress.Sg.EH
    public void YFl(com.bytedance.sdk.component.adexpress.Sg.AlY<? extends View> alY, pDU pdu) {
        this.dXO = alY;
        if (pdu != null && pdu.tN()) {
            Sg(pdu);
        }
        super.YFl(alY, pdu);
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public void YFl() {
        com.bytedance.sdk.openadsdk.component.vc.YFl yFl = this.tN;
        if (yFl != null) {
            yFl.YFl(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public void YFl(int i10) {
        super.YFl(i10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.component.adexpress.Sg.qsH
    public void YFl(View view, int i10, com.bytedance.sdk.component.adexpress.tN tNVar) {
        if (i10 != -1 && tNVar != null && i10 == 3) {
            wN();
        } else {
            super.YFl(view, i10, tNVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO
    public void YFl(GA.YFl yFl) {
        yFl.wN(com.bytedance.sdk.openadsdk.component.DSW.YFl.Sg());
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO
    public void YFl(JSONObject jSONObject) {
        Wwa wwa = this.eT;
        com.bytedance.sdk.openadsdk.component.DSW.YFl.YFl(jSONObject, wwa == null ? 0 : wwa.kU());
    }
}
