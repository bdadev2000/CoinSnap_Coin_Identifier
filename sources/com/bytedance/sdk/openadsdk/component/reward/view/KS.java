package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.nativeexpress.HWF;
import com.bytedance.sdk.openadsdk.core.nativeexpress.QR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.vDp;
import com.bytedance.sdk.openadsdk.utils.WNy;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KS {
    private boolean Bj;
    private final Activity HWF;
    private final woN QR;
    private FullRewardExpressView YW;
    private final com.bytedance.sdk.openadsdk.component.reward.zp.zp dT;
    private final String ku;
    Handler lMd;
    com.com.bytedance.overseas.sdk.zp.KS zp;
    boolean KS = false;
    boolean jU = false;
    boolean COT = false;

    public KS(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar) {
        this.dT = zpVar;
        this.HWF = zpVar.oB;
        this.QR = zpVar.zp;
        this.ku = zpVar.QR;
    }

    public void Bj() {
        FullRewardExpressView fullRewardExpressView = this.YW;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.YW();
        this.YW.dT();
    }

    public Handler COT() {
        if (this.lMd == null) {
            this.lMd = new Handler(Looper.getMainLooper());
        }
        return this.lMd;
    }

    public void HWF() {
        if (this.Bj) {
            return;
        }
        this.Bj = true;
        FullRewardExpressView fullRewardExpressView = this.YW;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.Bj();
        }
        Handler handler = this.lMd;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public boolean KS() {
        return this.KS;
    }

    public void QR() {
        FullRewardExpressView fullRewardExpressView = this.YW;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.dT();
        }
    }

    public int YW() {
        FullRewardExpressView fullRewardExpressView = this.YW;
        if (fullRewardExpressView != null) {
            return fullRewardExpressView.getDynamicShowType();
        }
        return 0;
    }

    public void dT() {
        FullRewardExpressView fullRewardExpressView = this.YW;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.ku();
    }

    public boolean jU() {
        return this.jU;
    }

    public boolean ku() {
        FullRewardExpressView fullRewardExpressView = this.YW;
        if (fullRewardExpressView == null) {
            return false;
        }
        return fullRewardExpressView.tG();
    }

    public FrameLayout lMd() {
        FullRewardExpressView fullRewardExpressView = this.YW;
        if (fullRewardExpressView == null) {
            return null;
        }
        FrameLayout videoFrameLayout = fullRewardExpressView.getVideoFrameLayout();
        if (this.YW.tG()) {
            vDp();
        }
        return videoFrameLayout;
    }

    public void vDp() {
        if (woN.COT(this.QR) && this.QR.Lij() == 3 && this.QR.Gzh() == 0) {
            try {
                if (this.QR.bX() == 1) {
                    int lMd = WNy.lMd(KVG.zp(), 90.0f);
                    FrameLayout frameLayout = (FrameLayout) this.YW.getBackupContainerBackgroundView();
                    if (frameLayout != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = lMd;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void zp(AdSlot adSlot) {
        if (this.COT) {
            return;
        }
        this.COT = true;
        this.YW = new FullRewardExpressView(this.dT, adSlot, this.ku);
    }

    public FullRewardExpressView zp() {
        return this.YW;
    }

    public void lMd(boolean z8) {
        this.jU = z8;
    }

    public void zp(boolean z8) {
        this.KS = z8;
    }

    public void zp(QR qr, HWF hwf) {
        woN won;
        if (this.YW == null || (won = this.QR) == null) {
            return;
        }
        this.zp = zp(won);
        qr.zp(this.YW);
        qr.zp(this.zp);
        this.YW.setClickListener(qr);
        hwf.zp((View) this.YW);
        hwf.zp(this.zp);
        this.YW.setClickCreativeListener(hwf);
    }

    private com.com.bytedance.overseas.sdk.zp.KS zp(woN won) {
        if (won.oKZ() == 4) {
            return com.com.bytedance.overseas.sdk.zp.jU.zp(this.HWF, won, this.ku);
        }
        return null;
    }

    public void zp(vDp vdp) {
        FullRewardExpressView fullRewardExpressView = this.YW;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.setExpressVideoListenerProxy(vdp);
    }

    public void zp(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        FullRewardExpressView fullRewardExpressView = this.YW;
        if (fullRewardExpressView == null) {
            return;
        }
        fullRewardExpressView.setExpressInteractionListener(pAGExpressAdWrapperListener);
    }

    public JSONObject zp(JSONObject jSONObject) {
        FullRewardExpressView fullRewardExpressView = this.YW;
        if (fullRewardExpressView != null) {
            return fullRewardExpressView.zp(jSONObject, this.dT.zp);
        }
        return null;
    }

    public void zp(int i9, boolean z8) {
        FullRewardExpressView fullRewardExpressView = this.YW;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.zp(i9, z8);
        }
    }

    public void zp(int i9, String str) {
        FullRewardExpressView fullRewardExpressView = this.YW;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.lMd(i9, str);
        }
    }
}
