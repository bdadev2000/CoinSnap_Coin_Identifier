package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.component.video.api.jU.KS;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;

/* loaded from: classes.dex */
public class NativeExpressVideoView extends NativeExpressView implements KS.InterfaceC0050KS, KS.jU, vDp {
    boolean COT;
    boolean HWF;
    boolean KS;
    int QR;
    private ExpressVideoView QUv;
    private com.bytedance.sdk.openadsdk.apiImpl.feed.KS UPs;
    private long WNy;
    private long YhE;
    private com.bytedance.sdk.openadsdk.multipro.lMd.zp cW;
    int jU;
    boolean lMd;
    int zp;

    public NativeExpressVideoView(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.woN won, AdSlot adSlot, String str) {
        super(context, won, adSlot, str, false);
        this.zp = 1;
        this.lMd = false;
        this.KS = true;
        this.COT = true;
        this.HWF = true;
        this.QR = -1;
        QR();
    }

    private void KVG() {
        boolean z8;
        try {
            this.cW = new com.bytedance.sdk.openadsdk.multipro.lMd.zp();
            ExpressVideoView expressVideoView = new ExpressVideoView(this.ku, this.Bj, this.YW, this.RCv);
            this.QUv = expressVideoView;
            expressVideoView.setShouldCheckNetChange(false);
            this.QUv.setControllerStatusCallBack(new NativeVideoTsView.lMd() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView.1
                @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.lMd
                public void zp(boolean z9, long j7, long j9, long j10, boolean z10) {
                    NativeExpressVideoView.this.cW.zp = z9;
                    NativeExpressVideoView.this.cW.COT = j7;
                    NativeExpressVideoView.this.cW.HWF = j9;
                    NativeExpressVideoView.this.cW.QR = j10;
                    NativeExpressVideoView.this.cW.jU = z10;
                }
            });
            this.QUv.setVideoAdLoadListener(this);
            this.QUv.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.YW)) {
                ExpressVideoView expressVideoView2 = this.QUv;
                if (this.lMd) {
                    z8 = this.dT.isAutoPlay();
                } else {
                    z8 = this.KS;
                }
                expressVideoView2.setIsAutoPlay(z8);
            } else if ("open_ad".equals(this.YW)) {
                this.QUv.setIsAutoPlay(true);
            } else {
                this.QUv.setIsAutoPlay(this.KS);
            }
            if ("open_ad".equals(this.YW)) {
                this.QUv.setIsQuiet(true);
            } else {
                boolean KS = com.bytedance.sdk.openadsdk.core.KVG.jU().KS(String.valueOf(this.jU));
                this.ot = KS;
                this.QUv.setIsQuiet(KS);
            }
            this.QUv.jU();
        } catch (Exception unused) {
            this.QUv = null;
        }
    }

    private void setShowAdInteractionView(boolean z8) {
        ExpressVideoView expressVideoView = this.QUv;
        if (expressVideoView != null) {
            expressVideoView.setShowAdInteractionView(z8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public void COT() {
    }

    public void KS(int i9) {
        int lMd = com.bytedance.sdk.openadsdk.core.KVG.jU().lMd(i9);
        if (3 == lMd) {
            this.lMd = false;
            this.KS = false;
        } else if (4 == lMd) {
            this.lMd = true;
        } else {
            int KS = com.bytedance.sdk.component.utils.KVG.KS(com.bytedance.sdk.openadsdk.core.KVG.zp());
            if (1 == lMd) {
                this.lMd = false;
                this.KS = YhE.jU(KS);
            } else if (2 == lMd) {
                if (YhE.COT(KS) || YhE.jU(KS) || YhE.HWF(KS)) {
                    this.lMd = false;
                    this.KS = true;
                }
            } else if (5 == lMd && (YhE.jU(KS) || YhE.HWF(KS))) {
                this.lMd = false;
                this.KS = true;
            }
        }
        if (this.KS) {
            return;
        }
        this.zp = 3;
    }

    public void QR() {
        int i9;
        this.vDp = new FrameLayout(this.ku);
        com.bytedance.sdk.openadsdk.core.model.woN won = this.Bj;
        if (won != null) {
            i9 = won.FGx();
        } else {
            i9 = 0;
        }
        this.jU = i9;
        KS(i9);
        KVG();
        addView(this.vDp, new FrameLayout.LayoutParams(-1, -1));
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.InterfaceC0050KS
    public void b_() {
        this.COT = false;
        this.zp = 2;
        com.bytedance.sdk.openadsdk.apiImpl.feed.KS ks = this.UPs;
        if (ks != null) {
            ks.zp(null);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.InterfaceC0050KS
    public void e_() {
        this.COT = false;
        this.tG = true;
        this.zp = 3;
        com.bytedance.sdk.openadsdk.apiImpl.feed.KS ks = this.UPs;
        if (ks != null) {
            ks.lMd(null);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.InterfaceC0050KS
    public void f_() {
        this.COT = false;
        this.tG = false;
        this.zp = 2;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.InterfaceC0050KS
    public void g_() {
        this.COT = false;
        this.zp = 5;
        com.bytedance.sdk.component.adexpress.lMd.lMd lmd = this.Gzh;
        if (lmd != null && lmd.lMd() != null) {
            this.Gzh.lMd().a_();
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.KS ks = this.UPs;
        if (ks != null) {
            ks.KS(null);
        }
        com.bytedance.sdk.component.adexpress.lMd.jU<? extends View> jUVar = this.irS;
        if (jUVar instanceof com.bytedance.sdk.openadsdk.core.ugen.KS.KS) {
            ((com.bytedance.sdk.openadsdk.core.ugen.KS.KS) jUVar).a_();
        }
    }

    public ExpressVideoView getExpressVideoView() {
        return this.QUv;
    }

    public com.bytedance.sdk.openadsdk.apiImpl.feed.KS getVideoAdListener() {
        return this.UPs;
    }

    @Nullable
    public com.bykv.vk.openvk.component.video.api.jU.KS getVideoController() {
        ExpressVideoView expressVideoView = this.QUv;
        if (expressVideoView != null) {
            return expressVideoView.getNativeVideoController();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.multipro.lMd.zp getVideoModel() {
        return this.cW;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public int jU() {
        ExpressVideoView expressVideoView;
        if (this.zp == 3 && (expressVideoView = this.QUv) != null) {
            expressVideoView.jU();
        }
        ExpressVideoView expressVideoView2 = this.QUv;
        if (expressVideoView2 != null && expressVideoView2.getNativeVideoController().KVG()) {
            return 1;
        }
        return this.zp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public void lMd() {
    }

    public void setVideoAdListener(com.bytedance.sdk.openadsdk.apiImpl.feed.KS ks) {
        this.UPs = ks;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public void zp() {
    }

    private void lMd(final com.bytedance.sdk.component.adexpress.lMd.rV rVVar) {
        if (rVVar == null) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView.2
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressVideoView.this.KS(rVVar);
            }
        });
    }

    private void lMd(long j7, long j9) {
        int abs = (int) Math.abs(this.vwr - j7);
        int i9 = this.vwr;
        if (i9 < 0 || abs > 500 || i9 > j9 || abs >= 500 || this.cz.contains(this.pvr)) {
            return;
        }
        if (this.vwr > j7) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView.3
                @Override // java.lang.Runnable
                public void run() {
                    NativeExpressVideoView.this.QUv.setCanInterruptVideoPlay(true);
                    NativeExpressVideoView.this.QUv.performClick();
                    NativeExpressVideoView nativeExpressVideoView = NativeExpressVideoView.this;
                    nativeExpressVideoView.lMd(nativeExpressVideoView.vwr, nativeExpressVideoView.pvr);
                }
            }, abs);
        } else {
            this.QUv.setCanInterruptVideoPlay(true);
            this.QUv.performClick();
            lMd(this.vwr, this.pvr);
        }
        this.cz.add(this.pvr);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.lMd.dQp
    public void zp(com.bytedance.sdk.component.adexpress.lMd.jU<? extends View> jUVar, com.bytedance.sdk.component.adexpress.lMd.rV rVVar) {
        this.irS = jUVar;
        this.QR = jUVar.KS();
        com.bytedance.sdk.component.adexpress.lMd.jU<? extends View> jUVar2 = this.irS;
        if ((jUVar2 instanceof woN) && ((woN) jUVar2).KVG() != null) {
            ((woN) this.irS).KVG().zp((vDp) this);
        }
        if (rVVar != null && rVVar.KS()) {
            lMd(rVVar);
        }
        super.zp(jUVar, rVVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public void zp(boolean z8) {
        ExpressVideoView expressVideoView = this.QUv;
        if (expressVideoView != null) {
            expressVideoView.setIsQuiet(z8);
            setSoundMute(z8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public void zp(int i9) {
        ExpressVideoView expressVideoView = this.QUv;
        if (expressVideoView == null) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.NativeExpressVideoView", "onChangeVideoState,ExpressVideoView is null !!!!!!!!!!!!");
            return;
        }
        if (i9 == 1) {
            expressVideoView.zp(0L, true, false);
            return;
        }
        if (i9 == 2 || i9 == 3) {
            expressVideoView.setCanInterruptVideoPlay(true);
            this.QUv.performClick();
        } else if (i9 == 4) {
            expressVideoView.getNativeVideoController().jU();
        } else {
            if (i9 != 5) {
                return;
            }
            expressVideoView.zp(0L, true, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KS(@NonNull com.bytedance.sdk.component.adexpress.lMd.rV rVVar) {
        double HWF = rVVar.HWF();
        double QR = rVVar.QR();
        double ku = rVVar.ku();
        double YW = rVVar.YW();
        if ((ku == 0.0d || YW == 0.0d) && this.QR != 7) {
            return;
        }
        int lMd = WNy.lMd(this.ku, (float) HWF);
        int lMd2 = WNy.lMd(this.ku, (float) QR);
        int lMd3 = WNy.lMd(this.ku, (float) ku);
        int lMd4 = WNy.lMd(this.ku, (float) YW);
        float min = Math.min(Math.min(WNy.lMd(this.ku, rVVar.vDp()), WNy.lMd(this.ku, rVVar.tG())), Math.min(WNy.lMd(this.ku, rVVar.rV()), WNy.lMd(this.ku, rVVar.dQp())));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.vDp.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(lMd3, lMd4);
        }
        layoutParams.width = lMd3;
        layoutParams.height = lMd4;
        layoutParams.topMargin = lMd2;
        layoutParams.leftMargin = lMd;
        layoutParams.setMarginStart(lMd);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        this.vDp.setLayoutParams(layoutParams);
        this.vDp.removeAllViews();
        if (this.QUv != null) {
            if (this.QR == 7 && (rVVar instanceof com.bytedance.sdk.openadsdk.core.ugen.KS.lMd)) {
                FrameLayout KVG = ((com.bytedance.sdk.openadsdk.core.ugen.KS.lMd) rVVar).KVG();
                if (KVG != null) {
                    KVG.removeAllViews();
                    KVG.addView(this.QUv, new FrameLayout.LayoutParams(-1, -1));
                }
            } else if (rVVar.zp() != null) {
                if (this.HWF) {
                    rVVar.zp().setTag(com.bytedance.sdk.component.adexpress.dynamic.zp.HWF, 1);
                    ((FrameLayout) rVVar.zp()).removeAllViews();
                    ((FrameLayout) rVVar.zp()).addView(this.QUv, new FrameLayout.LayoutParams(-1, -1));
                    this.HWF = false;
                }
            } else {
                this.vDp.addView(this.QUv);
            }
            WNy.lMd(this.vDp, min);
            this.QUv.zp(0L, true, false);
            KS(this.jU);
            if (!com.bytedance.sdk.component.utils.KVG.jU(this.ku) && !this.KS && this.COT) {
                this.QUv.COT();
            }
            if (TextUtils.equals("embeded_ad", this.YW)) {
                return;
            }
            setShowAdInteractionView(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.lMd.ku
    public void zp(View view, int i9, com.bytedance.sdk.component.adexpress.KS ks) {
        if (i9 == -1 || ks == null) {
            return;
        }
        if (i9 == 11) {
            try {
                ExpressVideoView expressVideoView = this.QUv;
                if (expressVideoView != null) {
                    expressVideoView.setCanInterruptVideoPlay(true);
                    this.QUv.performClick();
                    if (this.tG) {
                        this.QUv.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.jyq).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.zp(view, i9, ks);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.InterfaceC0050KS
    public void zp(long j7, long j9) {
        this.COT = false;
        int i9 = this.zp;
        if (i9 != 5 && i9 != 3 && j7 > this.YhE) {
            this.zp = 2;
        }
        this.YhE = j7;
        this.WNy = j9;
        com.bytedance.sdk.component.adexpress.lMd.lMd lmd = this.Gzh;
        if (lmd != null && lmd.lMd() != null) {
            this.Gzh.lMd().setTimeUpdate(((int) (j9 - j7)) / 1000);
        }
        com.bytedance.sdk.component.adexpress.lMd.jU<? extends View> jUVar = this.irS;
        if (jUVar instanceof com.bytedance.sdk.openadsdk.core.ugen.KS.KS) {
            ((com.bytedance.sdk.openadsdk.core.ugen.KS.KS) jUVar).setTimeUpdate(((int) (j9 - j7)) / 1000);
        }
        lMd(j7, j9);
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.jU
    public void zp(int i9, int i10) {
        this.YhE = this.WNy;
        this.zp = 4;
        com.bytedance.sdk.openadsdk.apiImpl.feed.KS ks = this.UPs;
        if (ks != null) {
            ks.zp(i9, i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public void zp(int i9, String str) {
        this.vwr = i9;
        this.pvr = str;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public long KS() {
        return this.YhE;
    }
}
