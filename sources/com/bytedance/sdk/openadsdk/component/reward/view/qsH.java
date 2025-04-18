package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.qsH.pDU;
import com.bytedance.sdk.openadsdk.utils.GS;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qsH {
    private final Wwa DSW;
    private Sg NjR;
    Handler Sg;
    com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc YFl;
    private boolean eT;

    /* renamed from: nc, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.reward.YFl.YFl f10610nc;
    private final String qsH;

    /* renamed from: vc, reason: collision with root package name */
    private final Activity f10611vc;
    boolean tN = false;
    boolean AlY = false;
    boolean wN = false;

    public qsH(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        this.f10610nc = yFl;
        this.f10611vc = yFl.UI;
        this.DSW = yFl.Sg;
        this.qsH = yFl.wN;
    }

    public boolean AlY() {
        return this.AlY;
    }

    public void DSW() {
        Sg sg2 = this.NjR;
        if (sg2 != null) {
            sg2.nc();
        }
    }

    public int NjR() {
        Sg sg2 = this.NjR;
        if (sg2 != null) {
            return sg2.getDynamicShowType();
        }
        return 0;
    }

    public FrameLayout Sg() {
        Sg sg2 = this.NjR;
        if (sg2 == null) {
            return null;
        }
        FrameLayout videoFrameLayout = sg2.getVideoFrameLayout();
        if (this.NjR.GA()) {
            YoT();
        }
        return videoFrameLayout;
    }

    public void YFl(AdSlot adSlot) {
        if (this.wN) {
            return;
        }
        this.wN = true;
        this.NjR = new Sg(this.f10610nc, adSlot, this.qsH);
    }

    public void YoT() {
        if (Wwa.wN(this.DSW) && this.DSW.dXO() == 3 && this.DSW.Cfr() == 0) {
            try {
                if (this.DSW.SVa() == 1) {
                    int tN = GS.tN(lG.YFl(), 90.0f);
                    FrameLayout frameLayout = (FrameLayout) this.NjR.getBackupContainerBackgroundView();
                    if (frameLayout != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = tN;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void eT() {
        Sg sg2 = this.NjR;
        if (sg2 == null) {
            return;
        }
        sg2.NjR();
        this.NjR.nc();
    }

    public void nc() {
        Sg sg2 = this.NjR;
        if (sg2 == null) {
            return;
        }
        sg2.qsH();
    }

    public boolean qsH() {
        Sg sg2 = this.NjR;
        if (sg2 == null) {
            return false;
        }
        return sg2.GA();
    }

    public boolean tN() {
        return this.tN;
    }

    public void vc() {
        if (this.eT) {
            return;
        }
        this.eT = true;
        Sg sg2 = this.NjR;
        if (sg2 != null) {
            sg2.eT();
        }
        Handler handler = this.Sg;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public Handler wN() {
        if (this.Sg == null) {
            this.Sg = new Handler(Looper.getMainLooper());
        }
        return this.Sg;
    }

    public Sg YFl() {
        return this.NjR;
    }

    public void Sg(boolean z10) {
        this.AlY = z10;
    }

    public void YFl(boolean z10) {
        this.tN = z10;
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.qsH.NjR njR, com.bytedance.sdk.openadsdk.core.qsH.qsH qsh) {
        Wwa wwa;
        if (this.NjR == null || (wwa = this.DSW) == null) {
            return;
        }
        this.YFl = YFl(wwa);
        njR.YFl(this.NjR);
        njR.YFl(this.YFl);
        this.NjR.setClickListener(njR);
        qsh.YFl((View) this.NjR);
        qsh.YFl(this.YFl);
        this.NjR.setClickCreativeListener(qsh);
    }

    private com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc YFl(Wwa wwa) {
        if (wwa.ko() == 4) {
            return com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.DSW.YFl(this.f10611vc, wwa, this.qsH);
        }
        return null;
    }

    public void YFl(pDU pdu) {
        Sg sg2 = this.NjR;
        if (sg2 == null) {
            return;
        }
        sg2.setExpressVideoListenerProxy(pdu);
    }

    public void YFl(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        Sg sg2 = this.NjR;
        if (sg2 == null) {
            return;
        }
        sg2.setExpressInteractionListener(pAGExpressAdWrapperListener);
    }

    public JSONObject YFl(JSONObject jSONObject) {
        Sg sg2 = this.NjR;
        if (sg2 != null) {
            return sg2.YFl(jSONObject, this.f10610nc.Sg);
        }
        return null;
    }

    public void YFl(int i10, boolean z10) {
        Sg sg2 = this.NjR;
        if (sg2 != null) {
            sg2.YFl(i10, z10, false);
        }
    }

    public void YFl(int i10, String str) {
        Sg sg2 = this.NjR;
        if (sg2 != null) {
            sg2.Sg(i10, str);
        }
    }
}
