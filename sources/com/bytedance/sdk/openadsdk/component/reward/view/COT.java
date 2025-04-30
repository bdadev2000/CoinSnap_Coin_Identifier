package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.zp.vDp;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.model.dQp;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.ku;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class COT {
    RelativeLayout Bj;
    RelativeLayout COT;
    private int FP;
    FrameLayout HWF;
    final woN KS;
    PAGProgressBar KVG;
    View QR;
    PAGLogoView YW;
    private final String cz;
    public dQp dQp;
    ImageView dT;
    ImageView jU;
    View ku;
    final Activity lMd;
    private boolean ot;
    private final boolean pvr;
    vDp vDp;
    private final com.bytedance.sdk.openadsdk.component.reward.zp.zp vwr;
    private RFDownloadBarLayout yRU;
    int zp = 3;
    protected int tG = 0;
    protected final AtomicBoolean rV = new AtomicBoolean(false);
    Runnable woN = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.COT.2
        @Override // java.lang.Runnable
        public void run() {
            RelativeLayout relativeLayout;
            try {
                woN won = COT.this.KS;
                if ((won == null || !won.slc()) && (relativeLayout = COT.this.COT) != null) {
                    int[] iArr = new int[2];
                    relativeLayout.getLocationOnScreen(iArr);
                    COT.this.vwr.Rh.lMd(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    public COT(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar) {
        this.vwr = zpVar;
        this.lMd = zpVar.oB;
        this.KS = zpVar.zp;
        this.cz = zpVar.QR;
        this.pvr = zpVar.HWF;
    }

    private void vwr() {
        RelativeLayout relativeLayout;
        RFDownloadBarLayout rFDownloadBarLayout = (RFDownloadBarLayout) this.lMd.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.vDp);
        this.yRU = rFDownloadBarLayout;
        rFDownloadBarLayout.zp(this.vwr);
        this.YW = (PAGLogoView) this.lMd.findViewById(520093757);
        this.dT = (ImageView) this.lMd.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.zf);
        this.jU = (ImageView) this.lMd.findViewById(520093706);
        this.COT = (RelativeLayout) this.lMd.findViewById(520093708);
        this.HWF = (FrameLayout) this.lMd.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.Bj);
        this.QR = this.lMd.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.woN);
        this.ku = this.lMd.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.eyb);
        this.Bj = (RelativeLayout) this.lMd.findViewById(com.bytedance.sdk.openadsdk.utils.vDp.eS);
        vDp vdp = this.vDp;
        if (vdp != null && vdp.jU() != null && (relativeLayout = this.Bj) != null) {
            relativeLayout.addView(this.vDp.jU(), new LinearLayout.LayoutParams(-1, -1));
            this.vDp.lMd();
        }
    }

    public View Bj() {
        return this.yRU;
    }

    public void COT() {
        int cW = this.KS.cW();
        this.zp = cW;
        if (cW == -200) {
            this.zp = KVG.jU().rV(String.valueOf(this.KS.FGx()));
        }
        if (this.zp != -1 || zp() || (this.vwr.Vjb instanceof com.bytedance.sdk.openadsdk.component.reward.lMd.KS)) {
            return;
        }
        KS(0);
    }

    public FrameLayout HWF() {
        return this.HWF;
    }

    public void KS() {
        this.HWF.removeAllViews();
    }

    public void KVG() {
        dQp dqp = this.dQp;
        if (dqp != null) {
            dqp.QR();
        }
    }

    public void QR() {
        if (this.dT.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.dT.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(11);
            this.dT.setLayoutParams(marginLayoutParams);
        }
    }

    public boolean YW() {
        ImageView imageView = this.jU;
        if (imageView == null || this.COT == null || imageView.getVisibility() != 0 || this.COT.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void dQp() {
        dQp dqp = this.dQp;
        if (dqp != null) {
            dqp.HWF();
        }
    }

    public View dT() {
        return this.COT;
    }

    public void jU() {
        WNy.zp((View) this.HWF, 8);
        WNy.zp(this.QR, 8);
        WNy.zp(this.ku, 8);
        KS(8);
        WNy.zp((View) this.jU, 8);
        WNy.zp((View) this.COT, 8);
        WNy.zp((View) this.YW, 8);
        WNy.zp((View) this.Bj, 8);
        WNy.zp((View) this.dT, 8);
    }

    public void ku() {
        RFDownloadBarLayout rFDownloadBarLayout = this.yRU;
        if (rFDownloadBarLayout == null) {
            return;
        }
        rFDownloadBarLayout.zp();
    }

    public void rV() {
        dQp dqp = this.dQp;
        if (dqp != null) {
            dqp.COT();
        }
        RelativeLayout relativeLayout = this.COT;
        if (relativeLayout != null) {
            relativeLayout.removeCallbacks(this.woN);
        }
    }

    public void tG() {
        try {
            TTBaseVideoActivity tTBaseVideoActivity = this.vwr.oB;
            Animation loadAnimation = AnimationUtils.loadAnimation(tTBaseVideoActivity, cz.dT(tTBaseVideoActivity, "tt_fade_out"));
            if (loadAnimation != null) {
                loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.COT.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        COT.this.vwr.rCC.vDp();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                this.vwr.rCC.zp(loadAnimation);
            } else {
                this.vwr.rCC.vDp();
            }
        } catch (Throwable unused) {
            this.vwr.rCC.vDp();
        }
    }

    public void vDp() {
        try {
            vDp vdp = this.vDp;
            if (vdp != null) {
                vdp.KS();
            }
            RelativeLayout relativeLayout = this.Bj;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.Bj;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(0.0f);
            }
        }
    }

    public void woN() {
        this.vwr.oKZ.COT().onClick(this.yRU);
    }

    public boolean zp() {
        return true;
    }

    public void HWF(int i9) {
        RelativeLayout relativeLayout;
        WNy.zp((View) this.jU, i9);
        WNy.zp((View) this.COT, i9);
        if (!com.bytedance.sdk.component.adexpress.jU.lMd.zp(this.vwr.fgJ) && (relativeLayout = this.COT) != null) {
            relativeLayout.post(this.woN);
        }
        if (i9 == 0 && !this.vwr.FP.get() && com.bytedance.sdk.openadsdk.core.model.cz.lMd(this.vwr.zp)) {
            com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.vwr;
            com.bytedance.sdk.openadsdk.lMd.KS.zp(zpVar.zp, zpVar.QR, "show_close_button", (JSONObject) null, System.currentTimeMillis() - this.vwr.vwr);
        }
    }

    public void KS(int i9) {
        woN won = this.KS;
        if (won != null && won.Fm() && com.bytedance.sdk.openadsdk.core.model.vDp.zp(this.KS)) {
            WNy.zp((View) this.yRU, 8);
        } else {
            WNy.zp((View) this.yRU, i9);
        }
    }

    public void lMd() {
        if (this.ot) {
            return;
        }
        this.ot = true;
        this.FP = this.vwr.dT;
        if (zp()) {
            vDp vdp = new vDp(this.vwr);
            this.vDp = vdp;
            vdp.zp();
        }
        vwr();
        dQp dqp = new dQp(this.lMd, this.KS, this.cz, this.HWF);
        this.dQp = dqp;
        dqp.zp();
    }

    public void zp(int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.YW.getLayoutParams();
        marginLayoutParams.setMargins(16, 0, 0, i9);
        this.YW.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.dT.getLayoutParams();
        marginLayoutParams2.setMargins(0, 0, 7, i9);
        marginLayoutParams2.setMarginStart(0);
        marginLayoutParams2.setMarginEnd(7);
        this.dT.setLayoutParams(marginLayoutParams2);
    }

    public void COT(int i9) {
        int i10 = this.zp;
        if (i10 == -1 || i9 != i10 || this.rV.get()) {
            return;
        }
        KS(0);
        this.rV.set(true);
        ku();
    }

    public void jU(int i9) {
        WNy.zp((View) this.YW, i9);
    }

    public void lMd(int i9) {
        if (this.KVG == null) {
            this.KVG = new PAGProgressBar(this.vwr.oB);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.KVG.setLayoutParams(layoutParams);
            this.KVG.setIndeterminateDrawable(ku.zp(this.vwr.oB, "tt_video_loading_progress_bar"));
            this.vwr.rCC.HWF().addView(this.KVG);
        }
        this.KVG.setVisibility(i9);
    }

    public void zp(boolean z8) {
        WNy.zp((View) this.YW, com.bytedance.sdk.openadsdk.core.model.cz.Bj(this.KS) ? 8 : 0);
        WNy.zp((View) this.dT, (this.KS.Fm() && this.KS.QR()) ? 0 : 8);
        lMd(z8);
        if (this.pvr) {
            COT();
        }
    }

    public void zp(int i9, int i10) {
        FrameLayout frameLayout;
        if (this.KS.Gzh() == 1 && (frameLayout = this.HWF) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int KS = WNy.KS((Context) this.lMd);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.HWF.getLayoutParams();
            layoutParams.width = KS;
            int i11 = (KS * 9) / 16;
            layoutParams.height = i11;
            this.HWF.setLayoutParams(layoutParams);
            this.tG = (WNy.jU((Context) this.lMd) - i11) / 2;
            tG.zp("TTAD.RFullVideoLayout", "NonContentAreaHeight:" + this.tG);
        }
    }

    public void lMd(boolean z8) {
        RelativeLayout relativeLayout;
        if (this.FP != 1 && (relativeLayout = this.COT) != null && z8) {
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                int zp = zp("status_bar_height");
                int zp2 = zp("navigation_bar_height");
                if (zp > 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (zp > marginLayoutParams.topMargin) {
                        marginLayoutParams.topMargin = zp;
                        this.vwr.Rh.zp(zp);
                    }
                }
                if (zp2 > 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (zp2 > marginLayoutParams2.rightMargin) {
                        marginLayoutParams2.rightMargin = zp2;
                    }
                }
            }
        }
        if (this.vwr.Vjb instanceof com.bytedance.sdk.openadsdk.component.reward.lMd.KS) {
            return;
        }
        KS(0);
    }

    public void zp(com.bytedance.sdk.openadsdk.core.lMd.KS ks, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        View view;
        View view2;
        woN won;
        if (this.HWF != null && (won = this.KS) != null && won.irS() != null) {
            if (this.KS.irS().HWF && !dQp.lMd(this.KS)) {
                zp((View.OnClickListener) ks);
                zp(ks);
            } else {
                zp(onClickListener);
            }
        }
        woN won2 = this.KS;
        if (won2 != null && won2.Gzh() == 1) {
            if (this.KS.irS() != null && (view2 = this.QR) != null) {
                WNy.zp(view2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.QR.getLayoutParams();
                layoutParams.height = this.tG;
                this.QR.setLayoutParams(layoutParams);
                if (this.KS.irS().lMd) {
                    this.QR.setOnClickListener(ks);
                    this.QR.setOnTouchListener(onTouchListener);
                } else {
                    this.QR.setOnClickListener(onClickListener);
                }
            }
            if (this.KS.irS() != null && (view = this.ku) != null) {
                WNy.zp(view, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.ku.getLayoutParams();
                layoutParams2.height = this.tG;
                this.ku.setLayoutParams(layoutParams2);
                if (this.KS.irS().jU) {
                    this.ku.setOnClickListener(ks);
                    this.ku.setOnTouchListener(onTouchListener);
                } else {
                    this.ku.setOnClickListener(onClickListener);
                }
            }
        }
        PAGLogoView pAGLogoView = this.YW;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.COT.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    try {
                        COT cot = COT.this;
                        TTWebsiteActivity.zp(cot.lMd, cot.KS, cot.cz);
                    } catch (Throwable th) {
                        tG.zp("TTAD.RFullVideoLayout", th.getMessage());
                    }
                }
            });
        }
        ImageView imageView = this.dT;
        if (imageView != null) {
            imageView.setClickable(true);
            com.bytedance.sdk.openadsdk.Bj.KS.zp().zp((int) WNy.zp(KVG.zp(), 14.0f, true), this.dT, this.vwr.zp);
        }
    }

    private int zp(String str) {
        Resources resources = this.lMd.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    public void zp(View.OnClickListener onClickListener) {
        WNy.zp(this.HWF, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    private void zp(com.bytedance.sdk.openadsdk.core.lMd.KS ks) {
        WNy.zp((View) this.HWF, (View.OnTouchListener) ks, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public void zp(float f9) {
        WNy.zp(this.jU, f9);
        WNy.zp(this.COT, f9);
    }

    public void zp(Animation animation) {
        RelativeLayout relativeLayout = this.Bj;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }
}
