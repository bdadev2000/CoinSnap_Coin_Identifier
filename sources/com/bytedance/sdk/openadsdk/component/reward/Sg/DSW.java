package com.bytedance.sdk.openadsdk.component.reward.Sg;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.EH;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.rkt;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.Sco;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class DSW extends Sg {
    private final int EH;
    private String Wwa;
    private com.bytedance.sdk.openadsdk.component.reward.view.wN lG;
    private ViewGroup rkt;

    public DSW(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        super(yFl);
        this.Wwa = "fullscreen_interstitial_ad";
        this.EH = this.Sg.ZLB();
    }

    private void Cfr() {
        FrameLayout.LayoutParams layoutParams;
        FrameLayout frameLayout = new FrameLayout(this.YFl.UI);
        this.rkt = frameLayout;
        frameLayout.setId(GA.HaH);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        this.rkt.setLayoutParams(layoutParams2);
        View eT = this.YFl.lu.eT();
        if (eT != null) {
            layoutParams2.bottomMargin = eT.getHeight();
        }
        com.bytedance.sdk.openadsdk.component.reward.view.wN wNVar = new com.bytedance.sdk.openadsdk.component.reward.view.wN(this.YFl.UI);
        this.lG = wNVar;
        wNVar.setId(GA.dU);
        if (this.YFl.Sg.SVa() == 1) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -1);
        }
        layoutParams.gravity = 17;
        this.lG.setLayoutParams(layoutParams);
        this.rkt.addView(this.lG);
        hQ();
    }

    private void Sg(Wwa wwa) {
        com.bytedance.sdk.openadsdk.component.reward.view.wN wNVar;
        if (wwa != null && (wNVar = this.lG) != null) {
            int i10 = this.EH;
            if (i10 == 33) {
                wNVar.setRatio(1.0f);
            } else if (i10 == 3) {
                wNVar.setRatio(1.91f);
            } else if (i10 == 1004) {
                pq();
            } else {
                wNVar.setRatio(0.56f);
            }
            YFl((ImageView) this.lG);
        }
    }

    private void YFl(ImageView imageView) {
        List<EH> VB;
        EH eh2;
        Wwa wwa = this.Sg;
        if (wwa == null || (VB = wwa.VB()) == null || VB.size() <= 0 || (eh2 = VB.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.NjR.AlY.YFl(VB.get(0)).tN(2).YFl(com.bytedance.sdk.openadsdk.NjR.tN.YFl(this.Sg, eh2.YFl(), imageView));
    }

    private void hQ() {
        if (this.rkt == null) {
            return;
        }
        YFl((View) this.lG);
    }

    private boolean mn() {
        Wwa wwa = this.Sg;
        if (wwa == null || wwa.Ne() != 2) {
            return false;
        }
        return true;
    }

    private void pq() {
        EH eh2;
        List<EH> VB = this.Sg.VB();
        if (VB != null && VB.size() > 0 && (eh2 = VB.get(0)) != null) {
            try {
                this.lG.setRatio(eh2.Sg() / eh2.tN());
            } catch (Exception e2) {
                YoT.YFl("TTAD.RFTI", e2.getMessage());
            }
        }
    }

    private com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc tN(Wwa wwa) {
        if (wwa.ko() == 4) {
            return new com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.AlY(lG.YFl(), wwa, this.Wwa);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void DSW() {
        boolean z10;
        if (rkt.Sg(this.Sg)) {
            this.f10578vc.Sg(8);
        }
        this.qsH.tN(false);
        this.qsH.AlY(false);
        if (this.Sg.Ne() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.qsH.YFl(false);
            this.f10578vc.wN(8);
            return;
        }
        this.qsH.YFl(this.Sg.Gnp());
        if (this.YFl.in) {
            Message obtain = Message.obtain();
            obtain.what = 900;
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
            int dXO = (int) (yFl.VOe.dXO() * 1000.0d);
            yFl.NjR = dXO;
            obtain.arg1 = dXO;
            this.YFl.zG.sendMessage(obtain);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public boolean vc() {
        return mn();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public boolean wN() {
        return mn() || Ne.DSW(this.Sg);
    }

    public void YFl(View view) {
        if (view == null || this.YFl.UI == null || this.Sg == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.Sg.Sg sg2 = this.YoT;
        if (sg2 == null) {
            Activity activity = this.YFl.UI;
            Wwa wwa = this.Sg;
            String str = this.Wwa;
            sg2 = new com.bytedance.sdk.openadsdk.core.Sg.YFl(activity, wwa, str, Sco.YFl(str));
            sg2.YFl(tN(this.Sg));
            HashMap hashMap = new HashMap();
            if (Ne.Wwa(this.Sg)) {
                hashMap.put("click_scence", 3);
            } else {
                hashMap.put("click_scence", 1);
            }
            sg2.YFl(hashMap);
        }
        Activity activity2 = this.YFl.UI;
        if (activity2 != null) {
            sg2.YFl(activity2);
        }
        view.setOnTouchListener(sg2);
        view.setOnClickListener(sg2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void YFl(FrameLayout frameLayout) {
        try {
            Cfr();
            Sg(this.Sg);
            frameLayout.addView(this.rkt);
        } catch (Exception e2) {
            Log.e("TTAD.RFTI", "bindAd: ", e2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.Sg
    public void YFl(com.bytedance.sdk.openadsdk.component.reward.view.DSW dsw) {
        if (rkt.Sg(this.Sg)) {
            tN.Sg(dsw);
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
            yFl.Bn.YFl((long) (yFl.VOe.dXO() * 1000.0d));
        } else {
            if (!rkt.tN(this.Sg) && !rkt.AlY(this.Sg)) {
                super.YFl(dsw);
                return;
            }
            tN.tN(dsw);
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.YFl;
            yFl2.Bn.YFl((long) (yFl2.VOe.dXO() * 1000.0d));
        }
    }

    public static boolean YFl(Wwa wwa) {
        return !Wwa.wN(wwa) && wwa.qjy() == 100.0f;
    }
}
