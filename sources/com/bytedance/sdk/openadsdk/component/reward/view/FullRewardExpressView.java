package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.lMd.rV;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.vwr;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.nativeexpress.FullRewardExpressBackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.vDp;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class FullRewardExpressView extends NativeExpressView {
    public static float zp = 100.0f;
    FullRewardExpressBackupView KS;
    vDp lMd;

    public FullRewardExpressView(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar, AdSlot adSlot, String str) {
        super(zpVar.oB, zpVar.zp, adSlot, str, zpVar.jU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KS(rV rVVar) {
        if (rVVar == null) {
            return;
        }
        double HWF = rVVar.HWF();
        double QR = rVVar.QR();
        double ku = rVVar.ku();
        double YW = rVVar.YW();
        int lMd = WNy.lMd(this.ku, (float) HWF);
        int lMd2 = WNy.lMd(this.ku, (float) QR);
        int lMd3 = WNy.lMd(this.ku, (float) ku);
        int lMd4 = WNy.lMd(this.ku, (float) YW);
        if ((YW == 0.0d || ku == 0.0d) && this.irS.KS() != 7) {
            return;
        }
        if (this.irS.KS() == 7 && (rVVar instanceof com.bytedance.sdk.openadsdk.core.ugen.KS.lMd)) {
            FrameLayout KVG = ((com.bytedance.sdk.openadsdk.core.ugen.KS.lMd) rVVar).KVG();
            if (KVG != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                KVG.addView(this.vDp, layoutParams);
                return;
            }
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.vDp.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(lMd3, lMd4);
        }
        layoutParams2.width = lMd3;
        layoutParams2.height = lMd4;
        layoutParams2.topMargin = lMd2;
        layoutParams2.leftMargin = lMd;
        layoutParams2.setMarginStart(lMd);
        layoutParams2.setMarginEnd(layoutParams2.rightMargin);
        this.vDp.setLayoutParams(layoutParams2);
    }

    private void QR() {
        setBackupListener(new com.bytedance.sdk.component.adexpress.lMd.KS() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView.1
            @Override // com.bytedance.sdk.component.adexpress.lMd.KS
            public boolean zp(ViewGroup viewGroup, int i9) {
                try {
                    ((NativeExpressView) viewGroup).vDp();
                    FullRewardExpressView.this.KS = new FullRewardExpressBackupView(viewGroup.getContext());
                    FullRewardExpressView fullRewardExpressView = FullRewardExpressView.this;
                    fullRewardExpressView.KS.zp(((NativeExpressView) fullRewardExpressView).Bj, (NativeExpressView) viewGroup);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public void COT() {
        vDp vdp = this.lMd;
        if (vdp != null) {
            vdp.COT();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    public void HWF() {
        this.rV = true;
        this.vDp = new FrameLayout(this.ku);
        if (!com.bytedance.sdk.openadsdk.core.ugen.KS.zp(this.Bj)) {
            addView(this.vDp, new FrameLayout.LayoutParams(-1, -1));
        }
        super.HWF();
        SSWebView webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        QR();
    }

    public View getBackupContainerBackgroundView() {
        if (tG()) {
            return this.KS.getBackupContainerBackgroundView();
        }
        return null;
    }

    public FrameLayout getVideoFrameLayout() {
        if (tG()) {
            return this.KS.getVideoContainer();
        }
        return this.vDp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public int jU() {
        vDp vdp = this.lMd;
        if (vdp != null) {
            return vdp.jU();
        }
        return 0;
    }

    public void lMd(final rV rVVar) {
        if (rVVar == null) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView.2
            @Override // java.lang.Runnable
            public void run() {
                FullRewardExpressView.this.KS(rVVar);
            }
        });
    }

    public void setExpressVideoListenerProxy(vDp vdp) {
        this.lMd = vdp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public void lMd() {
        vDp vdp = this.lMd;
        if (vdp != null) {
            vdp.lMd();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.lMd.dQp
    public void zp(com.bytedance.sdk.component.adexpress.lMd.jU<? extends View> jUVar, rV rVVar) {
        this.irS = jUVar;
        woN won = this.Bj;
        if (won != null && won.slc()) {
            super.zp(jUVar, rVVar);
            return;
        }
        if (jUVar instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.woN) {
            com.bytedance.sdk.openadsdk.core.nativeexpress.woN won2 = (com.bytedance.sdk.openadsdk.core.nativeexpress.woN) jUVar;
            if (won2.KVG() != null) {
                won2.KVG().zp((vDp) this);
            }
        }
        if (rVVar != null && rVVar.KS()) {
            lMd(rVVar);
        }
        super.zp(jUVar, rVVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public void lMd(int i9) {
        vDp vdp = this.lMd;
        if (vdp != null) {
            vdp.lMd(i9);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    public boolean zp(rV rVVar) {
        woN won = this.Bj;
        if ((won instanceof vwr) && ((vwr) won).THm() && rVVar.KS() && rVVar.lMd() == 1) {
            return false;
        }
        return super.zp(rVVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public void zp(boolean z8) {
        vDp vdp = this.lMd;
        if (vdp != null) {
            vdp.zp(z8);
        }
        setSoundMute(z8);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public void zp() {
        vDp vdp = this.lMd;
        if (vdp != null) {
            vdp.zp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public void zp(int i9) {
        vDp vdp = this.lMd;
        if (vdp != null) {
            vdp.zp(i9);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.lMd.ku
    public void zp(View view, int i9, com.bytedance.sdk.component.adexpress.KS ks) {
        if (i9 != -1 && ks != null && i9 == 3) {
            COT();
        } else {
            super.zp(view, i9, ks);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public void zp(int i9, String str) {
        vDp vdp = this.lMd;
        if (vdp != null) {
            vdp.zp(i9, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public long KS() {
        vDp vdp = this.lMd;
        if (vdp != null) {
            return vdp.KS();
        }
        return 0L;
    }
}
