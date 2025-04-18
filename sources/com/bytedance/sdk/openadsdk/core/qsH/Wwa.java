package com.bytedance.sdk.openadsdk.core.qsH;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.GA.Sg.vc;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.mn;
import l5.c;
import l5.f;
import l5.g;

/* loaded from: classes.dex */
public class Wwa extends qO implements c, f {
    int AlY;
    private EH Cfr;
    int DSW;
    boolean Sg;
    int YFl;
    private com.bytedance.sdk.openadsdk.multipro.Sg.YFl hQ;
    private long mn;
    private long pq;
    boolean tN;

    /* renamed from: vc, reason: collision with root package name */
    boolean f10724vc;
    boolean wN;
    private com.bytedance.sdk.openadsdk.YFl.Sg.tN zB;

    public Wwa(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, AdSlot adSlot, String str) {
        super(context, wwa, adSlot, str, false, true);
        this.YFl = 1;
        this.Sg = false;
        this.tN = true;
        this.wN = true;
        this.f10724vc = true;
        this.DSW = -1;
        DSW();
    }

    private void rkt() {
        boolean z10;
        try {
            this.hQ = new com.bytedance.sdk.openadsdk.multipro.Sg.YFl();
            EH eh2 = new EH(this.qsH, this.eT, this.NjR, this.UZM);
            this.Cfr = eh2;
            eh2.setShouldCheckNetChange(false);
            this.Cfr.setControllerStatusCallBack(new vc.Sg() { // from class: com.bytedance.sdk.openadsdk.core.qsH.Wwa.1
                @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.vc.Sg
                public void YFl(boolean z11, long j3, long j10, long j11, boolean z12) {
                    Wwa.this.hQ.YFl = z11;
                    Wwa.this.hQ.wN = j3;
                    Wwa.this.hQ.f10775vc = j10;
                    Wwa.this.hQ.DSW = j11;
                    Wwa.this.hQ.AlY = z12;
                }
            });
            this.Cfr.setVideoAdLoadListener(this);
            this.Cfr.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.NjR)) {
                EH eh3 = this.Cfr;
                if (this.Sg) {
                    z10 = this.f10731nc.isAutoPlay();
                } else {
                    z10 = this.tN;
                }
                eh3.setIsAutoPlay(z10);
            } else if ("open_ad".equals(this.NjR)) {
                this.Cfr.setIsAutoPlay(true);
            } else {
                this.Cfr.setIsAutoPlay(this.tN);
            }
            if ("open_ad".equals(this.NjR)) {
                this.Cfr.setIsQuiet(true);
            } else {
                boolean tN = com.bytedance.sdk.openadsdk.core.lG.AlY().tN(String.valueOf(this.AlY));
                this.Ne = tN;
                this.Cfr.setIsQuiet(tN);
            }
            this.Cfr.AlY();
        } catch (Exception unused) {
            this.Cfr = null;
        }
    }

    private void setShowAdInteractionView(boolean z10) {
        EH eh2 = this.Cfr;
        if (eh2 != null) {
            eh2.setShowAdInteractionView(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tN(@NonNull com.bytedance.sdk.component.adexpress.Sg.pDU pdu) {
        double vc2 = pdu.vc();
        double DSW = pdu.DSW();
        double qsH = pdu.qsH();
        double NjR = pdu.NjR();
        if ((qsH == 0.0d || NjR == 0.0d) && this.DSW != 7) {
            return;
        }
        int tN = GS.tN(this.qsH, (float) vc2);
        int tN2 = GS.tN(this.qsH, (float) DSW);
        int tN3 = GS.tN(this.qsH, (float) qsH);
        int tN4 = GS.tN(this.qsH, (float) NjR);
        float min = Math.min(Math.min(GS.tN(this.qsH, pdu.YoT()), GS.tN(this.qsH, pdu.GA())), Math.min(GS.tN(this.qsH, pdu.pDU()), GS.tN(this.qsH, pdu.EH())));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.YoT.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(tN3, tN4);
        }
        layoutParams.width = tN3;
        layoutParams.height = tN4;
        layoutParams.topMargin = tN2;
        layoutParams.leftMargin = tN;
        layoutParams.setMarginStart(tN);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        this.YoT.setLayoutParams(layoutParams);
        this.YoT.removeAllViews();
        if (this.Cfr != null) {
            if (this.DSW == 7 && (pdu instanceof com.bytedance.sdk.openadsdk.core.eT.AlY.Sg)) {
                FrameLayout rkt = ((com.bytedance.sdk.openadsdk.core.eT.AlY.Sg) pdu).rkt();
                if (rkt != null) {
                    rkt.removeAllViews();
                    rkt.addView(this.Cfr, new FrameLayout.LayoutParams(-1, -1));
                }
            } else if (pdu.YFl() != null) {
                if (this.f10724vc) {
                    pdu.YFl().setTag(com.bytedance.sdk.component.adexpress.dynamic.YFl.f10382vc, 1);
                    ((FrameLayout) pdu.YFl()).removeAllViews();
                    ((FrameLayout) pdu.YFl()).addView(this.Cfr, new FrameLayout.LayoutParams(-1, -1));
                    this.f10724vc = false;
                }
            } else {
                this.YoT.addView(this.Cfr);
            }
            GS.Sg(this.YoT, min);
            this.Cfr.YFl(0L, true, false);
            AlY(this.AlY);
            if (!com.bytedance.sdk.component.utils.EH.AlY(this.qsH) && !this.tN && this.wN) {
                this.Cfr.wN();
            }
            if (TextUtils.equals("embeded_ad", this.NjR)) {
                return;
            }
            setShowAdInteractionView(false);
        }
    }

    public void AlY(int i10) {
        int Sg = com.bytedance.sdk.openadsdk.core.lG.AlY().Sg(i10);
        if (3 == Sg) {
            this.Sg = false;
            this.tN = false;
        } else if (4 == Sg) {
            this.Sg = true;
        } else {
            int tN = com.bytedance.sdk.component.utils.EH.tN(com.bytedance.sdk.openadsdk.core.lG.YFl());
            if (1 == Sg) {
                this.Sg = false;
                this.tN = Sco.AlY(tN);
            } else if (2 == Sg) {
                if (Sco.wN(tN) || Sco.AlY(tN) || Sco.vc(tN)) {
                    this.Sg = false;
                    this.tN = true;
                }
            } else if (5 == Sg && (Sco.AlY(tN) || Sco.vc(tN))) {
                this.Sg = false;
                this.tN = true;
            }
        }
        if (this.tN) {
            return;
        }
        this.YFl = 3;
    }

    public void DSW() {
        int i10;
        this.YoT = new FrameLayout(this.qsH);
        com.bytedance.sdk.openadsdk.core.model.Wwa wwa = this.eT;
        if (wwa != null) {
            i10 = wwa.kU();
        } else {
            i10 = 0;
        }
        this.AlY = i10;
        AlY(i10);
        rkt();
        addView(this.YoT, new FrameLayout.LayoutParams(-1, -1));
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public void Sg() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public void YFl() {
    }

    @Override // l5.f
    public void d_() {
        this.wN = false;
        this.YFl = 2;
        com.bytedance.sdk.openadsdk.YFl.Sg.tN tNVar = this.zB;
        if (tNVar != null) {
            tNVar.YFl(null);
        }
    }

    @Override // l5.f
    public void g_() {
        this.wN = false;
        this.GA = true;
        this.YFl = 3;
        com.bytedance.sdk.openadsdk.YFl.Sg.tN tNVar = this.zB;
        if (tNVar != null) {
            tNVar.Sg(null);
        }
    }

    public EH getExpressVideoView() {
        return this.Cfr;
    }

    public com.bytedance.sdk.openadsdk.YFl.Sg.tN getVideoAdListener() {
        return this.zB;
    }

    @Nullable
    public g getVideoController() {
        EH eh2 = this.Cfr;
        if (eh2 != null) {
            return eh2.getNativeVideoController();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.multipro.Sg.YFl getVideoModel() {
        return this.hQ;
    }

    @Override // l5.f
    public void h_() {
        this.wN = false;
        this.GA = false;
        this.YFl = 2;
    }

    @Override // l5.f
    public void i_() {
        this.wN = false;
        this.YFl = 5;
        com.bytedance.sdk.component.adexpress.Sg.Sg sg2 = this.Ga;
        if (sg2 != null && sg2.Sg() != null) {
            this.Ga.Sg().onvideoComplate();
        }
        com.bytedance.sdk.openadsdk.YFl.Sg.tN tNVar = this.zB;
        if (tNVar != null) {
            tNVar.tN(null);
        }
        com.bytedance.sdk.component.adexpress.Sg.AlY<? extends View> alY = this.dXO;
        if (alY instanceof com.bytedance.sdk.openadsdk.core.eT.AlY.tN) {
            ((com.bytedance.sdk.openadsdk.core.eT.AlY.tN) alY).onvideoComplate();
        }
    }

    public void setVideoAdListener(com.bytedance.sdk.openadsdk.YFl.Sg.tN tNVar) {
        this.zB = tNVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public void wN() {
    }

    private void Sg(final com.bytedance.sdk.component.adexpress.Sg.pDU pdu) {
        if (pdu == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qsH.Wwa.2
            @Override // java.lang.Runnable
            public void run() {
                Wwa.this.tN(pdu);
            }
        });
    }

    private void Sg(long j3, long j10) {
        int abs = (int) Math.abs(this.Wwa - j3);
        int i10 = this.Wwa;
        if (i10 < 0 || abs > 500 || i10 > j10 || abs >= 500 || this.aIu.contains(this.qO)) {
            return;
        }
        if (this.Wwa > j3) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qsH.Wwa.3
                @Override // java.lang.Runnable
                public void run() {
                    Wwa.this.Cfr.setCanInterruptVideoPlay(true);
                    Wwa.this.Cfr.performClick();
                    Wwa wwa = Wwa.this;
                    wwa.Sg(wwa.Wwa, wwa.qO);
                }
            }, abs);
        } else {
            this.Cfr.setCanInterruptVideoPlay(true);
            this.Cfr.performClick();
            Sg(this.Wwa, this.qO);
        }
        this.aIu.add(this.qO);
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.component.adexpress.Sg.EH
    public void YFl(com.bytedance.sdk.component.adexpress.Sg.AlY<? extends View> alY, com.bytedance.sdk.component.adexpress.Sg.pDU pdu) {
        this.dXO = alY;
        this.DSW = alY.tN();
        com.bytedance.sdk.component.adexpress.Sg.AlY<? extends View> alY2 = this.dXO;
        if ((alY2 instanceof VOe) && ((VOe) alY2).rkt() != null) {
            ((VOe) this.dXO).rkt().YFl((pDU) this);
        }
        if (pdu != null && pdu.tN()) {
            Sg(pdu);
        }
        super.YFl(alY, pdu);
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public void YFl(boolean z10) {
        EH eh2 = this.Cfr;
        if (eh2 != null) {
            eh2.setIsQuiet(z10);
            setSoundMute(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public void YFl(int i10) {
        EH eh2 = this.Cfr;
        if (eh2 == null) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.NativeExpressVideoView", "onChangeVideoState,ExpressVideoView is null !!!!!!!!!!!!");
            return;
        }
        if (i10 == 1) {
            eh2.YFl(0L, true, false);
            return;
        }
        if (i10 == 2 || i10 == 3) {
            eh2.setCanInterruptVideoPlay(true);
            this.Cfr.performClick();
        } else if (i10 == 4) {
            eh2.getNativeVideoController().AlY();
        } else {
            if (i10 != 5) {
                return;
            }
            eh2.YFl(0L, true, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public int AlY() {
        EH eh2;
        if (this.YFl == 3 && (eh2 = this.Cfr) != null) {
            eh2.AlY();
        }
        EH eh3 = this.Cfr;
        if (eh3 == null || !eh3.getNativeVideoController().rkt()) {
            return this.YFl;
        }
        return 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.component.adexpress.Sg.qsH
    public void YFl(View view, int i10, com.bytedance.sdk.component.adexpress.tN tNVar) {
        if (i10 == -1 || tNVar == null) {
            return;
        }
        if (i10 == 11) {
            try {
                EH eh2 = this.Cfr;
                if (eh2 != null) {
                    eh2.setCanInterruptVideoPlay(true);
                    this.Cfr.performClick();
                    if (this.GA) {
                        this.Cfr.findViewById(com.bytedance.sdk.openadsdk.utils.GA.Lx).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.YFl(view, i10, tNVar);
    }

    @Override // l5.f
    public void YFl(long j3, long j10) {
        this.wN = false;
        int i10 = this.YFl;
        if (i10 != 5 && i10 != 3 && j3 > this.pq) {
            this.YFl = 2;
        }
        this.pq = j3;
        this.mn = j10;
        com.bytedance.sdk.component.adexpress.Sg.Sg sg2 = this.Ga;
        if (sg2 != null && sg2.Sg() != null) {
            this.Ga.Sg().setTimeUpdate(((int) (j10 - j3)) / 1000);
        }
        com.bytedance.sdk.component.adexpress.Sg.AlY<? extends View> alY = this.dXO;
        if (alY instanceof com.bytedance.sdk.openadsdk.core.eT.AlY.tN) {
            ((com.bytedance.sdk.openadsdk.core.eT.AlY.tN) alY).setTimeUpdate(((int) (j10 - j3)) / 1000);
        }
        Sg(j3, j10);
    }

    @Override // l5.c
    public void YFl(int i10, int i11) {
        this.pq = this.mn;
        this.YFl = 4;
        com.bytedance.sdk.openadsdk.YFl.Sg.tN tNVar = this.zB;
        if (tNVar != null) {
            tNVar.YFl(i10, i11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public void YFl(int i10, String str) {
        this.Wwa = i10;
        this.qO = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.qO, com.bytedance.sdk.openadsdk.core.qsH.pDU
    public long tN() {
        return this.pq;
    }
}
