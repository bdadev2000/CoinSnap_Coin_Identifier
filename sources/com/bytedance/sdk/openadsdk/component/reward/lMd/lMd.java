package com.bytedance.sdk.openadsdk.component.reward.lMd;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.RCv;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.component.reward.top.TopProxyLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.component.reward.zp.dT;
import com.bytedance.sdk.openadsdk.component.reward.zp.tG;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.dQp;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.lMd.lMd;
import com.bytedance.sdk.openadsdk.utils.Bj;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vDp;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class lMd extends com.bytedance.sdk.openadsdk.component.reward.lMd.zp {
    protected String Bj;
    private com.bytedance.sdk.openadsdk.YW.COT dQp;
    public LinearLayout rV;
    public com.bytedance.sdk.openadsdk.core.widget.zp tG;
    protected com.bytedance.sdk.openadsdk.core.lMd.COT vDp;

    /* loaded from: classes.dex */
    public interface zp {
        void zp(boolean z8);
    }

    public lMd(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar) {
        super(zpVar);
    }

    private void COT(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        frameLayout.addView(zp(context));
        View rFDownloadBarLayout = new RFDownloadBarLayout(context);
        rFDownloadBarLayout.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(context, "tt_reward_full_new_bar_bg"));
        rFDownloadBarLayout.setPadding(WNy.lMd(context, 15.0f), 0, 0, 0);
        rFDownloadBarLayout.setId(vDp.vDp);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, WNy.lMd(context, 76.0f));
        layoutParams.gravity = 80;
        layoutParams.leftMargin = WNy.lMd(context, 10.0f);
        layoutParams.rightMargin = WNy.lMd(context, 10.0f);
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        layoutParams.bottomMargin = WNy.lMd(context, 14.0f);
        frameLayout.addView(rFDownloadBarLayout, layoutParams);
        View pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setId(vDp.tG);
        pAGLinearLayout.setVisibility(8);
        frameLayout.addView(pAGLinearLayout, new FrameLayout.LayoutParams(-1, -1));
        View sSWebView = new SSWebView(context, true);
        sSWebView.setLayerType(2, null);
        sSWebView.setVisibility(4);
        sSWebView.setId(vDp.rV);
        frameLayout.addView(sSWebView, new FrameLayout.LayoutParams(-1, -1));
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(vDp.dQp);
        frameLayout2.setVisibility(4);
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        View sSWebView2 = new SSWebView(context, true);
        sSWebView2.setVisibility(8);
        sSWebView2.setId(vDp.KVG);
        frameLayout.addView(sSWebView2, new FrameLayout.LayoutParams(-1, -1));
    }

    private void KS(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        frameLayout.addView(pAGRelativeLayout, new FrameLayout.LayoutParams(-1, -1));
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        int i9 = vDp.Bj;
        pAGFrameLayout.setId(i9);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, WNy.lMd(context, 211.0f));
        layoutParams.addRule(13);
        pAGRelativeLayout.addView(pAGFrameLayout, layoutParams);
        View view = new View(context);
        view.setVisibility(8);
        view.setId(vDp.woN);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(2, i9);
        pAGRelativeLayout.addView(view, layoutParams2);
        RFDownloadBarLayout rFDownloadBarLayout = new RFDownloadBarLayout(context);
        rFDownloadBarLayout.setId(vDp.vDp);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(WNy.lMd(context, 280.0f), WNy.lMd(context, 70.0f));
        layoutParams3.addRule(2, i9);
        layoutParams3.addRule(14);
        layoutParams3.bottomMargin = WNy.lMd(context, 33.0f);
        pAGRelativeLayout.addView(rFDownloadBarLayout, layoutParams3);
        View view2 = new View(context);
        view2.setId(vDp.eyb);
        view2.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(3, i9);
        pAGRelativeLayout.addView(view2, layoutParams4);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setLines(1);
        pAGTextView.setGravity(17);
        pAGTextView.setText(cz.lMd(context, "tt_video_download_apk"));
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 15.0f);
        pAGTextView.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(context, "tt_reward_video_download_btn_bg"));
        pAGTextView.setId(520093705);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(WNy.lMd(context, 260.0f), WNy.lMd(context, 36.0f));
        layoutParams5.addRule(3, i9);
        layoutParams5.addRule(14);
        layoutParams5.topMargin = WNy.lMd(context, 70.0f);
        pAGRelativeLayout.addView(pAGTextView, layoutParams5);
        SSWebView sSWebView = new SSWebView(context, true);
        sSWebView.setLayerType(2, null);
        sSWebView.setVisibility(4);
        sSWebView.setId(vDp.rV);
        pAGRelativeLayout.addView(sSWebView, new RelativeLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(vDp.dQp);
        frameLayout2.setVisibility(4);
        pAGRelativeLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        SSWebView sSWebView2 = new SSWebView(context, true);
        sSWebView2.setVisibility(8);
        sSWebView2.setId(vDp.KVG);
        pAGRelativeLayout.addView(sSWebView2, new RelativeLayout.LayoutParams(-1, -1));
    }

    public static void lMd(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setId(vDp.dT);
        frameLayout.addView(pAGFrameLayout, new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout.addView(zp(context));
        View rFDownloadBarLayout = new RFDownloadBarLayout(context);
        rFDownloadBarLayout.setId(vDp.vDp);
        rFDownloadBarLayout.setPadding(WNy.lMd(context, 15.0f), 0, 0, 0);
        rFDownloadBarLayout.setBackgroundColor(cz.ku(context, "tt_download_bar_background_new"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, WNy.lMd(context, 90.0f));
        layoutParams.gravity = 80;
        frameLayout.addView(rFDownloadBarLayout, layoutParams);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setId(vDp.tG);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setVisibility(8);
        frameLayout.addView(pAGLinearLayout, new FrameLayout.LayoutParams(-1, -1));
        View sSWebView = new SSWebView(context, true);
        sSWebView.setId(vDp.rV);
        sSWebView.setLayerType(2, null);
        sSWebView.setVisibility(4);
        frameLayout.addView(sSWebView, new FrameLayout.LayoutParams(-1, -1));
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(vDp.dQp);
        frameLayout2.setVisibility(4);
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        View sSWebView2 = new SSWebView(context, true);
        sSWebView2.setId(vDp.KVG);
        sSWebView2.setVisibility(8);
        frameLayout.addView(sSWebView2, new FrameLayout.LayoutParams(-1, -1));
    }

    public int Bj() {
        float f9 = 20.0f;
        float f10 = 100.0f;
        if (this.lMd.Gzh() == 1 && !com.bytedance.sdk.openadsdk.core.model.cz.Bj(this.lMd)) {
            f10 = 20.0f;
        }
        if (!com.bytedance.sdk.openadsdk.core.model.vDp.zp(this.lMd)) {
            f9 = f10;
        }
        return WNy.lMd(this.zp.fgJ, f9);
    }

    public abstract boolean COT();

    public void FP() {
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.zp;
        if (zpVar == null) {
            return;
        }
        zpVar.COT = false;
        boolean z8 = zpVar.jU;
        if (!zpVar.ot.get()) {
            this.zp.UPs.dT();
        }
        woN();
        this.zp.si.vwr();
        this.zp.ffE.rV();
        if (this.zp.FP.get()) {
            this.zp.WNy.set(true);
        }
        Bj bj = this.zp.fs;
        if (bj != null) {
            bj.lMd();
        }
    }

    public void Gzh() {
        woN won;
        if (!HWF() && ((this instanceof QR) || (this instanceof ku))) {
            this.zp.oKZ.lMd();
            return;
        }
        if (!this.YW.zp(this.COT.YW(), false)) {
            this.dT.removeMessages(300);
            zp(lMd.C0123lMd.zp);
            tG tGVar = this.COT;
            tGVar.zp(!tGVar.Lij() ? 1 : 0, 4);
        }
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.zp;
        if (zpVar != null && (won = zpVar.zp) != null && zpVar.fs != null && won.slc()) {
            com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar2 = this.zp;
            zpVar2.fs.zp(zpVar2.UPs.cz());
        }
    }

    public abstract boolean HWF();

    public void KVG() {
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.zp;
        if (zpVar.pvr) {
            return;
        }
        zpVar.Rh.HWF();
        this.zp.rCC.HWF(0);
    }

    public void Lij() {
        this.vDp = this.zp.oKZ.KS();
    }

    public abstract void QR();

    public boolean QUv() {
        return true;
    }

    public void RCv() {
        this.zp.Rh.KS();
        this.zp.Rh.COT(true);
    }

    public View YW() {
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(this.zp.oB);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(this.zp.oB);
        pAGRelativeLayout.setId(520093708);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(WNy.lMd(this.zp.oB, 28.0f), WNy.lMd(this.zp.oB, 28.0f));
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = WNy.lMd(this.zp.oB, 20.0f);
        layoutParams.rightMargin = WNy.lMd(this.zp.oB, 24.0f);
        pAGRelativeLayout.setLayoutParams(layoutParams);
        pAGRelativeLayout.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(this.zp.oB, "tt_mute_btn_bg"));
        pAGRelativeLayout.setGravity(17);
        pAGRelativeLayout.setVisibility(8);
        pAGRelativeLayout.setContentDescription(cz.zp(this.zp.oB, "tt_ad_close_text"));
        PAGImageView pAGImageView = new PAGImageView(this.zp.oB);
        pAGImageView.setId(520093706);
        pAGImageView.setLayoutParams(new RelativeLayout.LayoutParams(WNy.lMd(this.zp.oB, 12.0f), WNy.lMd(this.zp.oB, 12.0f)));
        pAGImageView.setImageResource(cz.jU(this.zp.oB, "tt_video_close_drawable"));
        pAGImageView.setContentDescription(cz.zp(this.zp.oB, "tt_ad_close_text"));
        pAGRelativeLayout.addView(pAGImageView);
        View pAGLogoView = new PAGLogoView(this.zp.oB);
        pAGLogoView.setId(520093757);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, WNy.lMd(this.zp.oB, 14.0f));
        layoutParams2.gravity = 8388691;
        layoutParams2.leftMargin = WNy.lMd(this.zp.oB, 16.0f);
        layoutParams2.bottomMargin = WNy.lMd(this.zp.oB, 100.0f);
        pAGLogoView.setLayoutParams(layoutParams2);
        PAGImageView pAGImageView2 = new PAGImageView(this.zp.oB);
        pAGImageView2.setId(vDp.zf);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(WNy.lMd(this.zp.oB, 32.0f), WNy.lMd(this.zp.oB, 14.0f));
        layoutParams3.gravity = 8388693;
        layoutParams3.rightMargin = WNy.lMd(this.zp.oB, 7.0f);
        layoutParams3.bottomMargin = WNy.lMd(this.zp.oB, 100.0f);
        pAGImageView2.setLayoutParams(layoutParams3);
        pAGImageView2.setPadding(WNy.lMd(this.zp.oB, 9.0f), 0, WNy.lMd(this.zp.oB, 9.0f), 0);
        pAGImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        View playableLoadingView = new PlayableLoadingView(this.zp.oB);
        playableLoadingView.setId(vDp.nz);
        playableLoadingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        playableLoadingView.setClickable(true);
        playableLoadingView.setFocusable(true);
        View topProxyLayout = new TopProxyLayout(this.zp.oB);
        topProxyLayout.setId(vDp.IhO);
        topProxyLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        pAGFrameLayout.addView(pAGLogoView);
        pAGFrameLayout.addView(pAGImageView2);
        pAGFrameLayout.addView(playableLoadingView);
        pAGFrameLayout.addView(topProxyLayout);
        pAGFrameLayout.addView(pAGRelativeLayout);
        return pAGFrameLayout;
    }

    public void cz() {
    }

    public void dQp() {
        com.bytedance.sdk.openadsdk.core.widget.zp zpVar = this.tG;
        if (zpVar != null && zpVar.isShowing()) {
            this.tG.dismiss();
        }
    }

    public View dT() {
        PAGRelativeLayout pAGRelativeLayout;
        if (this.lMd.Gzh() != 5) {
            pAGRelativeLayout = new PAGRelativeLayout(this.zp.oB);
            pAGRelativeLayout.setId(vDp.eS);
        } else {
            pAGRelativeLayout = null;
        }
        Objects.toString(pAGRelativeLayout);
        return pAGRelativeLayout;
    }

    public final void irS() {
        String str;
        if (this.zp.oB.isFinishing()) {
            return;
        }
        this.zp.si.tG();
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.zp;
        if (zpVar.HWF) {
            str = "reward_endcard";
        } else {
            str = "fullscreen_endcard";
        }
        zpVar.si.zp(this.dQp, str, zpVar.oB);
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar2 = this.zp;
        zpVar2.ffE.zp(this.dQp, zpVar2.jU);
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar3 = this.zp;
        zpVar3.si.zp(str, zpVar3.oB);
        this.zp.si.COT();
    }

    public zp jU() {
        return null;
    }

    public RFEndCardBackUpLayout ku() {
        return new RFEndCardBackUpLayout(this.zp.oB);
    }

    public void ot() {
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.zp;
        if (zpVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.COT cot = zpVar.rCC;
        if (cot != null) {
            cot.KVG();
        }
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar2 = this.zp;
        boolean z8 = zpVar2.jU;
        zpVar2.aax.zp();
        DeviceUtils.QR();
        this.zp.si.woN();
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar3 = this.zp;
        if (zpVar3.jU) {
            zpVar3.oB.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.lMd.lMd.2
                @Override // java.lang.Runnable
                public void run() {
                    if (lMd.this.zp.aax.zp() > 0) {
                        lMd.this.zp.aax.zp(false);
                    }
                }
            });
        }
    }

    public void ox() {
        int vwr;
        com.bytedance.sdk.openadsdk.component.reward.zp.QR qr;
        dT dTVar;
        if (KVG.jU().cz(String.valueOf(this.zp.dQp)) == 1) {
            com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.zp;
            if (zpVar.HWF) {
                if (com.bytedance.sdk.openadsdk.core.model.cz.Bj(zpVar.zp)) {
                    vwr = KVG.jU().zp(String.valueOf(this.zp.dQp), true);
                } else {
                    vwr = KVG.jU().dT(String.valueOf(this.zp.dQp));
                }
            } else if (com.bytedance.sdk.openadsdk.core.model.cz.Bj(zpVar.zp)) {
                vwr = KVG.jU().zp(String.valueOf(this.zp.dQp), false);
            } else {
                vwr = KVG.jU().vwr(String.valueOf(this.zp.dQp));
            }
            com.bytedance.sdk.openadsdk.component.reward.view.COT cot = this.zp.rCC;
            if (cot != null && cot.YW()) {
                com.bytedance.sdk.openadsdk.component.reward.view.COT cot2 = this.zp.rCC;
                if (cot2 != null) {
                    cot2.dT().performClick();
                    return;
                }
                return;
            }
            if ((!this.zp.FP.get() || com.bytedance.sdk.openadsdk.core.model.cz.Bj(this.zp.zp)) && vwr != -1) {
                tG tGVar = this.zp.UPs;
                if (((tGVar != null && tGVar.ku() >= vwr * 1000) || ((qr = this.zp.ffE) != null && qr.Bj() - this.zp.ffE.vDp() >= vwr)) && (dTVar = this.zp.Rh) != null) {
                    dTVar.jU();
                }
            }
        }
    }

    public void pvr() {
        if (this.zp.FP.get()) {
            com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.zp;
            if (!zpVar.pvr && zpVar.WNy.getAndSet(false)) {
                int i9 = this.zp.cz;
                if (i9 >= 0 || i9 == -1) {
                    Message obtain = Message.obtain();
                    obtain.what = 700;
                    com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar2 = this.zp;
                    obtain.arg1 = zpVar2.cz;
                    zpVar2.qtv.sendMessage(obtain);
                }
            }
        }
    }

    public void rV() {
    }

    public void tG() {
        LinearLayout linearLayout = (LinearLayout) this.zp.oB.findViewById(vDp.tG);
        this.rV = linearLayout;
        WNy.zp((View) linearLayout, 8);
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.zp;
        zpVar.Rg = new com.bytedance.sdk.openadsdk.common.QR(zpVar.oB, zpVar.zp, "landingpage_endcard");
        this.zp.Rg.KS().setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.lMd.lMd.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                lMd.this.zp.rCC.dT().performClick();
            }
        });
        this.rV.addView(this.zp.Rg.COT(), new LinearLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar2 = this.zp;
        zpVar2.si.zp(zpVar2.Rg);
    }

    public void vDp() {
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.zp;
        zpVar.Pxi.zp(zpVar.HWF);
        this.zp.rCC.lMd();
        this.zp.rCC.zp(Bj());
        this.zp.gH.zp();
        if (!this.zp.zp.Fm()) {
            com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar2 = this.zp;
            if (zpVar2.pvr && TextUtils.isEmpty(woN.zp(zpVar2.fgJ, this.lMd))) {
                tG();
            }
            this.zp.si.zp();
            this.zp.DY.zp();
        }
        this.zp.ffE.zp();
        this.zp.Rh.zp();
        if (com.bytedance.sdk.openadsdk.core.model.cz.lMd(this.zp.zp)) {
            this.zp.si.ku().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.zp.si.YW().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.zp.Rh.KS(true);
            if (com.bytedance.sdk.openadsdk.core.model.cz.Bj(this.zp.zp)) {
                this.zp.rCC.jU();
                WNy.zp((View) this.zp.si.ku(), 4);
                WNy.zp((View) this.zp.si.YW(), 0);
            }
        }
        if (!dQp.KS(this.zp.zp) && !dQp.lMd(this.zp.zp) && !dQp.jU(this.zp.zp)) {
            com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar3 = this.zp;
            zpVar3.rCC.zp(WNy.lMd(zpVar3.fgJ, zpVar3.vDp), WNy.lMd(this.zp.fgJ, r4.tG));
            this.zp.fRl.zp();
            if (com.bytedance.sdk.openadsdk.core.model.cz.Bj(this.zp.zp)) {
                this.zp.si.zp(true);
                this.zp.si.COT();
                zp(false, false, false, lMd.C0123lMd.KS);
            } else if (this.zp.oB.woN()) {
                this.zp.rCC.lMd(0);
            }
        }
    }

    public void vwr() {
        pvr();
        Bj bj = this.zp.fs;
        if (bj != null) {
            bj.zp();
        }
    }

    public void woN() {
        this.dT.removeMessages(300);
    }

    public void yRU() {
        com.bytedance.sdk.openadsdk.component.reward.view.KS ks = this.zp.eWG;
        if (ks != null) {
            ks.HWF();
        }
        com.bytedance.sdk.openadsdk.component.reward.view.COT cot = this.zp.rCC;
        if (cot != null) {
            cot.rV();
        }
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.zp;
        zpVar.UPs.jU(zpVar.HWF);
        if (!COT()) {
            this.zp.FP.get();
        }
        this.zp.si.rV();
        this.zp.ffE.COT();
        this.zp.rCC.vDp();
        this.zp.gH.KS();
        this.zp.Pxi.lMd();
        Bj bj = this.zp.fs;
        if (bj != null) {
            bj.KS();
        }
    }

    public abstract void zp(FrameLayout frameLayout);

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.zp
    public void zp(com.bytedance.sdk.openadsdk.core.video.KS.lMd lmd, RCv rCv) {
        super.zp(lmd, rCv);
        if (this.zp.oB.KVG()) {
            this.zp.si.zp(false);
        }
        if (com.bytedance.sdk.openadsdk.core.model.cz.Bj(this.zp.zp)) {
            this.zp.ffE.HWF();
        }
    }

    private void jU(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        frameLayout.addView(zp(context));
        View rFDownloadBarLayout = new RFDownloadBarLayout(context);
        rFDownloadBarLayout.setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(context, "tt_reward_full_new_bar_bg"));
        rFDownloadBarLayout.setPadding(WNy.lMd(context, 15.0f), 0, 0, 0);
        rFDownloadBarLayout.setId(vDp.vDp);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, WNy.lMd(context, 76.0f));
        layoutParams.gravity = 80;
        layoutParams.leftMargin = WNy.lMd(context, 10.0f);
        layoutParams.rightMargin = WNy.lMd(context, 10.0f);
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        layoutParams.bottomMargin = WNy.lMd(context, 14.0f);
        frameLayout.addView(rFDownloadBarLayout, layoutParams);
        View pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setId(vDp.tG);
        pAGLinearLayout.setVisibility(8);
        frameLayout.addView(pAGLinearLayout, new FrameLayout.LayoutParams(-1, -1));
        View sSWebView = new SSWebView(context, true);
        sSWebView.setLayerType(2, null);
        sSWebView.setVisibility(4);
        sSWebView.setId(vDp.rV);
        frameLayout.addView(sSWebView, new FrameLayout.LayoutParams(-1, -1));
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(vDp.dQp);
        frameLayout2.setVisibility(4);
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        View sSWebView2 = new SSWebView(context, true);
        sSWebView2.setVisibility(8);
        sSWebView2.setId(vDp.KVG);
        frameLayout.addView(sSWebView2, new FrameLayout.LayoutParams(-1, -1));
    }

    public void zp(RewardFullBaseLayout rewardFullBaseLayout) {
        int Gzh = this.lMd.Gzh();
        if (Gzh == 1 && !com.bytedance.sdk.openadsdk.core.model.cz.Bj(this.lMd)) {
            KS(rewardFullBaseLayout);
            return;
        }
        if (Gzh == 3) {
            jU(rewardFullBaseLayout);
        } else if (Gzh == 5) {
            COT(rewardFullBaseLayout);
        } else {
            lMd(rewardFullBaseLayout);
        }
    }

    public void zp(boolean z8, boolean z9, boolean z10, int i9) {
        this.zp.gH.zp(z8, z9, z10, this, i9);
    }

    public void zp(int i9) {
        this.COT.tG();
        zp(false, true, false, i9);
        if (this.zp.HWF) {
            this.YW.KS(10000);
        }
    }

    public void zp(com.bytedance.sdk.openadsdk.YW.COT cot) {
        this.dQp = cot;
        KS();
        if (!this.zp.zp.Fm() && QUv()) {
            irS();
        }
        if (QUv()) {
            this.zp.gH.lMd();
        }
        if (dQp.KS(this.zp.zp) || dQp.jU(this.zp.zp)) {
            this.dT.sendEmptyMessageDelayed(500, 100L);
        }
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.zp;
        zpVar.rCC.zp(zpVar.Bj == 100.0f);
        Lij();
        QR();
    }

    public void zp(Message message) {
        int i9 = message.what;
        if (i9 == 1) {
            RCv();
            return;
        }
        if (i9 == 300) {
            zp(lMd.C0123lMd.lMd);
            tG tGVar = this.zp.UPs;
            tGVar.zp(!tGVar.Lij() ? 1 : 0, 1 ^ (this.zp.UPs.Lij() ? 1 : 0));
            if (this.zp.zp.xg() == null || this.zp.zp.xg().zp() == null) {
                return;
            }
            this.zp.zp.xg().zp().zp(com.bytedance.sdk.openadsdk.core.QR.zp.zp.GENERAL_LINEAR_AD_ERROR);
            return;
        }
        if (i9 == 400) {
            this.zp.UPs.tG();
            zp(false, true, false, 3);
            return;
        }
        if (i9 == 500) {
            if (!com.bytedance.sdk.openadsdk.core.model.cz.lMd(this.zp.zp)) {
                this.zp.Rh.KS(false);
            }
            SSWebView ku = this.zp.si.ku();
            if (ku != null && ku.getWebView() != null) {
                ku.YW();
                ku.getWebView().resumeTimers();
            }
            if (this.zp.si.ku() != null) {
                this.zp.si.zp(1.0f);
                this.zp.rCC.zp(1.0f);
            }
            if (!this.zp.oB.dQp() && this.zp.UPs.lMd() && this.zp.QUv.get()) {
                this.zp.UPs.tG();
                return;
            }
            return;
        }
        if (i9 == 600) {
            KVG();
            return;
        }
        if (i9 != 700) {
            if (i9 != 800) {
                return;
            }
            if (!com.bytedance.sdk.openadsdk.core.model.cz.lMd(this.zp.zp)) {
                this.zp.Rh.KS(false);
            }
            this.zp.rCC.zp(1.0f);
            if (!this.zp.oB.dQp() && this.zp.UPs.lMd() && this.zp.QUv.get()) {
                this.zp.UPs.tG();
                return;
            }
            return;
        }
        int i10 = message.arg1;
        if (this.zp.WNy.get()) {
            return;
        }
        if (i10 > 0) {
            this.zp.Rh.lMd();
            this.zp.Rh.zp((i10 / 1000) + "s");
            this.zp.Rh.COT(false);
            Message obtain = Message.obtain();
            obtain.what = 700;
            obtain.arg1 = i10 - 1000;
            com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.zp;
            zpVar.cz -= 1000;
            this.dT.sendMessageDelayed(obtain, 1000L);
            return;
        }
        this.dT.removeMessages(700);
        if (com.bytedance.sdk.openadsdk.core.model.cz.KS(this.lMd)) {
            if (!this.zp.ffE.woN() && this.zp.si.KVG()) {
                RCv();
                return;
            } else {
                KVG();
                return;
            }
        }
        KVG();
    }

    public static FrameLayout zp(Context context) {
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setId(vDp.Bj);
        pAGFrameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        pAGFrameLayout.setLayoutParams(layoutParams);
        return pAGFrameLayout;
    }
}
