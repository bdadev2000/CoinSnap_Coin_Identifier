package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.component.video.api.jU.KS;
import com.bytedance.sdk.component.adexpress.lMd.jU;
import com.bytedance.sdk.component.adexpress.lMd.rV;
import com.bytedance.sdk.component.adexpress.lMd.tG;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.ugen.KS.lMd;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.WNy;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PAGAppOpenAdExpressView extends NativeExpressView {
    private com.bytedance.sdk.openadsdk.component.HWF.zp KS;
    private KS.zp jU;
    private FrameLayout lMd;
    boolean zp;

    public PAGAppOpenAdExpressView(@NonNull Context context, woN won, AdSlot adSlot, String str) {
        super(context, won, adSlot, str, true);
        this.zp = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KS(rV rVVar) {
        if (rVVar == null) {
            return;
        }
        if (rVVar.zp() != null) {
            if (this.zp) {
                rVVar.zp().setTag(com.bytedance.sdk.component.adexpress.dynamic.zp.HWF, 1);
                ((FrameLayout) rVVar.zp()).removeAllViews();
                FrameLayout frameLayout = (FrameLayout) rVVar.zp();
                this.lMd = frameLayout;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
                this.zp = false;
                return;
            }
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
        if (this.irS.KS() == 7 && (rVVar instanceof lMd)) {
            FrameLayout KVG = ((lMd) rVVar).KVG();
            if (KVG != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                KVG.addView(this.lMd, layoutParams);
                return;
            }
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.lMd.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(lMd3, lMd4);
        }
        layoutParams2.width = lMd3;
        layoutParams2.height = lMd4;
        layoutParams2.topMargin = lMd2;
        layoutParams2.leftMargin = lMd;
        layoutParams2.setMarginStart(lMd);
        layoutParams2.setMarginEnd(layoutParams2.rightMargin);
        this.lMd.setLayoutParams(layoutParams2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public void COT() {
        com.bytedance.sdk.openadsdk.component.HWF.zp zpVar = this.KS;
        if (zpVar != null) {
            zpVar.lMd(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    public void HWF() {
        this.rV = true;
        this.lMd = new FrameLayout(this.ku);
        if (!com.bytedance.sdk.openadsdk.core.ugen.KS.zp(this.Bj)) {
            addView(this.lMd, new FrameLayout.LayoutParams(-1, -1));
        }
        super.HWF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    public int getDynamicShowType() {
        if (this.irS == null) {
            return 1;
        }
        return super.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.component.QR.zp.zp(this.Bj, KVG.jU().QR(String.valueOf(this.Bj.FGx())));
    }

    public FrameLayout getVideoFrameLayout() {
        return this.lMd;
    }

    public void lMd(final rV rVVar) {
        if (rVVar == null) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.view.PAGAppOpenAdExpressView.1
            @Override // java.lang.Runnable
            public void run() {
                PAGAppOpenAdExpressView.this.KS(rVVar);
            }
        });
    }

    public void setExpressVideoListenerProxy(KS.zp zpVar) {
        this.jU = zpVar;
    }

    public void setTopListener(com.bytedance.sdk.openadsdk.component.HWF.zp zpVar) {
        this.KS = zpVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public void zp(int i9, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public void lMd() {
        super.lMd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.lMd.dQp
    public void zp(jU<? extends View> jUVar, rV rVVar) {
        this.irS = jUVar;
        if (rVVar != null && rVVar.KS()) {
            lMd(rVVar);
        }
        super.zp(jUVar, rVVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public void zp() {
        com.bytedance.sdk.openadsdk.component.HWF.zp zpVar = this.KS;
        if (zpVar != null) {
            zpVar.zp(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.vDp
    public void zp(int i9) {
        super.zp(i9);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.lMd.ku
    public void zp(View view, int i9, com.bytedance.sdk.component.adexpress.KS ks) {
        if (i9 != -1 && ks != null && i9 == 3) {
            COT();
        } else {
            super.zp(view, i9, ks);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    public void zp(tG.zp zpVar) {
        zpVar.COT(com.bytedance.sdk.openadsdk.component.QR.zp.lMd());
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    public void zp(JSONObject jSONObject) {
        woN won = this.Bj;
        com.bytedance.sdk.openadsdk.component.QR.zp.zp(jSONObject, won == null ? 0 : won.FGx());
    }
}
