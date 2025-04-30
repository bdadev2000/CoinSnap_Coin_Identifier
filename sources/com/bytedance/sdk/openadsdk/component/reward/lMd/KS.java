package com.bytedance.sdk.openadsdk.component.reward.lMd;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.model.dQp;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.utils.Bj;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class KS extends lMd {
    public KS(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar) {
        super(zpVar);
    }

    public static void KS(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setOrientation(1);
        frameLayout.addView(pAGLinearLayout, new FrameLayout.LayoutParams(-1, -1));
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setId(vDp.UPs);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        pAGLinearLayout.addView(pAGFrameLayout, layoutParams);
        PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(context);
        pAGFrameLayout2.setId(vDp.dT);
        pAGFrameLayout.addView(pAGFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout2.addView(lMd.zp(context));
        PAGFrameLayout pAGFrameLayout3 = new PAGFrameLayout(context);
        pAGFrameLayout3.setId(vDp.vwr);
        pAGFrameLayout3.setVisibility(8);
        pAGFrameLayout3.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        pAGFrameLayout2.addView(pAGFrameLayout3, layoutParams2);
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(vDp.pvr);
        pAGImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        pAGFrameLayout3.addView(pAGImageView, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.zp.lMd(pAGFrameLayout);
        PAGFrameLayout pAGFrameLayout4 = new PAGFrameLayout(context);
        pAGFrameLayout4.setId(vDp.cz);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 0.0f;
        pAGLinearLayout.addView(pAGFrameLayout4, layoutParams3);
        pAGFrameLayout4.addView(lMd(context));
        LinearLayout KS = KS(context);
        KS.setBackgroundColor(Color.parseColor("#70161823"));
        pAGFrameLayout4.addView(KS);
        KS.addView(jU(context));
        com.bytedance.sdk.openadsdk.component.reward.view.zp.zp(pAGFrameLayout4);
    }

    private static ImageView jU(Context context) {
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        pAGImageView.setImageResource(cz.jU(context, "tt_up_slide"));
        pAGImageView.setId(vDp.yRU);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(WNy.lMd(context, 18.0f), WNy.lMd(context, 16.0f));
        layoutParams.gravity = 17;
        layoutParams.topMargin = WNy.lMd(context, 45.0f);
        pAGImageView.setLayoutParams(layoutParams);
        return pAGImageView;
    }

    private static SSWebView lMd(Context context) {
        SSWebView sSWebView = new SSWebView(context);
        sSWebView.setId(vDp.FP);
        sSWebView.setLayerType(2, null);
        sSWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return sSWebView;
    }

    public static boolean zp(woN won) {
        return dQp.lMd(won) || dQp.KS(won) || dQp.jU(won);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public int Bj() {
        return 16;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public boolean COT() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public boolean HWF() {
        if (dQp.lMd(this.zp.zp)) {
            return true;
        }
        if (!dQp.KS(this.zp.zp) && !dQp.jU(this.zp.zp)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public void QR() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public RFEndCardBackUpLayout ku() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public void rV() {
        com.bytedance.sdk.openadsdk.component.reward.view.COT cot;
        dQp dqp;
        if (dQp.lMd(this.zp.zp) && (cot = this.zp.rCC) != null && (dqp = cot.dQp) != null) {
            if (dqp.KS()) {
                this.zp.rCC.KS(0);
                this.zp.Gzh.set(true);
            } else {
                this.zp.irS.set(true);
                zp(true, false, true, 80);
            }
        }
        if (dQp.KS(this.zp.zp) || dQp.jU(this.zp.zp)) {
            zp(true, false, true, 70);
        }
    }

    public static void zp(woN won, FrameLayout frameLayout) {
        if (dQp.lMd(won)) {
            KS(frameLayout);
        } else if (!dQp.KS(won) && !dQp.jU(won)) {
            lMd.lMd(frameLayout);
        } else {
            jU(frameLayout);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public void zp(RewardFullBaseLayout rewardFullBaseLayout) {
        zp(this.lMd, rewardFullBaseLayout);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public void zp(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar;
        Bj bj;
        if (!dQp.KS(this.zp.zp) || (bj = (zpVar = this.zp).fs) == null) {
            return;
        }
        bj.zp(zpVar.zp.ku().lMd() * 1000);
    }

    public static void jU(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setId(vDp.cz);
        frameLayout.addView(pAGFrameLayout, new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout.addView(lMd(context));
        LinearLayout KS = KS(context);
        KS.setBackgroundColor(Color.parseColor("#99161823"));
        pAGFrameLayout.addView(KS);
        KS.addView(jU(context));
        com.bytedance.sdk.openadsdk.component.reward.view.zp.zp(pAGFrameLayout);
        PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(context);
        pAGFrameLayout2.setId(vDp.UPs);
        frameLayout.addView(pAGFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
        PAGFrameLayout pAGFrameLayout3 = new PAGFrameLayout(context);
        pAGFrameLayout3.setId(vDp.dT);
        pAGFrameLayout2.addView(pAGFrameLayout3, new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout3.addView(lMd.zp(context));
        PAGFrameLayout pAGFrameLayout4 = new PAGFrameLayout(context);
        pAGFrameLayout4.setId(vDp.vwr);
        pAGFrameLayout4.setVisibility(8);
        pAGFrameLayout4.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        pAGFrameLayout3.addView(pAGFrameLayout4, layoutParams);
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(vDp.pvr);
        pAGImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        pAGFrameLayout4.addView(pAGImageView, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.zp.lMd(pAGFrameLayout2);
        View playableLoadingView = new PlayableLoadingView(context);
        playableLoadingView.setId(vDp.fRl);
        playableLoadingView.setClickable(true);
        playableLoadingView.setFocusable(true);
        frameLayout.addView(playableLoadingView, new FrameLayout.LayoutParams(-1, -1));
    }

    private static LinearLayout KS(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setId(vDp.ot);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setVisibility(8);
        pAGLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return pAGLinearLayout;
    }
}
