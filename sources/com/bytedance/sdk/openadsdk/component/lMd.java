package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.component.view.OpenScreenAdBackupView;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenAdExpressView;
import com.bytedance.sdk.openadsdk.core.lMd.lMd;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd extends KS {
    private boolean Bj;
    private PAGAppOpenAdExpressView dT;

    public lMd(Activity activity, woN won, FrameLayout frameLayout, zp zpVar, int i9, boolean z8, com.bytedance.sdk.openadsdk.component.ku.zp zpVar2) {
        super(activity, won, frameLayout, zpVar, i9, z8, zpVar2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.KS
    public int jU() {
        return this.dT.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.component.KS
    public void KS() {
        super.KS();
        PAGAppOpenAdExpressView pAGAppOpenAdExpressView = this.dT;
        if (pAGAppOpenAdExpressView != null) {
            pAGAppOpenAdExpressView.Bj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.KS
    public void lMd() {
        this.dT.YW();
    }

    @Override // com.bytedance.sdk.openadsdk.component.KS
    public void zp(ViewGroup viewGroup) {
        woN.zp fRl;
        Pair<Float, Float> zp = com.bytedance.sdk.openadsdk.core.nativeexpress.zp.zp.zp(this.zp.getWindow(), this.QR);
        AdSlot build = new AdSlot.Builder().setCodeId(String.valueOf(this.lMd.FGx())).setExpressViewAcceptedSize(((Float) zp.first).floatValue(), ((Float) zp.second).floatValue()).build();
        if (tG.jU() && (fRl = this.lMd.fRl()) != null) {
            new StringBuilder("tryDynamicNative: id is ").append(fRl.COT());
        }
        PAGAppOpenAdExpressView pAGAppOpenAdExpressView = new PAGAppOpenAdExpressView(this.zp, this.lMd, build, "open_ad");
        this.dT = pAGAppOpenAdExpressView;
        pAGAppOpenAdExpressView.setTopListener(this.COT);
        this.dT.setExpressVideoListenerProxy(this.COT);
        this.dT.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.lMd.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i9) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i9) {
                lMd.this.COT.jU();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f9, float f10) {
                if (lMd.this.dT.tG()) {
                    lMd.this.Bj = true;
                    lMd lmd = lMd.this;
                    lMd.super.zp((ViewGroup) lmd.jU);
                    lMd.super.zp();
                    lMd.super.lMd();
                    return;
                }
                if (lMd.this.lMd.hG()) {
                    lMd.this.COT.KS();
                    return;
                }
                lMd lmd2 = lMd.this;
                if (lmd2.KS) {
                    if (lmd2.zp(lmd2.dT.getVideoFrameLayout())) {
                        lMd.this.COT.KS();
                        return;
                    } else {
                        lMd.this.COT.jU();
                        return;
                    }
                }
                lmd2.COT.KS();
            }
        });
        this.lMd.ku(1);
        this.jU.addView(this.dT, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.sdk.openadsdk.component.KS
    public void zp() {
        this.dT.setClickListener(com.bytedance.sdk.openadsdk.component.zp.lMd.zp(this.lMd, this.zp, this.YW, this.dT));
        com.bytedance.sdk.openadsdk.core.nativeexpress.HWF lMd = com.bytedance.sdk.openadsdk.component.zp.lMd.lMd(this.lMd, this.zp, this.YW, this.dT);
        this.dT.setClickCreativeListener(lMd);
        lMd.zp(new lMd.zp() { // from class: com.bytedance.sdk.openadsdk.component.lMd.2
            @Override // com.bytedance.sdk.openadsdk.core.lMd.lMd.zp
            public void zp(View view, int i9) {
                lMd.this.COT.COT();
            }
        });
        this.dT.setBackupListener(new com.bytedance.sdk.component.adexpress.lMd.KS() { // from class: com.bytedance.sdk.openadsdk.component.lMd.3
            @Override // com.bytedance.sdk.component.adexpress.lMd.KS
            public boolean zp(ViewGroup viewGroup, int i9) {
                StringBuilder sb = new StringBuilder("isUseBackup() called with: view = [");
                sb.append(viewGroup);
                sb.append("], errCode = [");
                sb.append(i9);
                sb.append("]");
                try {
                    ((NativeExpressView) viewGroup).vDp();
                    new OpenScreenAdBackupView(lMd.this.zp).zp((NativeExpressView) lMd.this.dT);
                    return true;
                } catch (Exception e4) {
                    Log.e("AppOpenAdExpressManager", "", e4);
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.KS
    public void zp(int i9, int i10, boolean z8) {
        if (this.Bj) {
            super.zp(i9, i10, z8);
        } else {
            this.dT.zp(String.valueOf(i9), i10, 0, z8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.KS
    public JSONObject zp(JSONObject jSONObject) {
        return this.dT.zp(jSONObject, this.lMd);
    }
}
