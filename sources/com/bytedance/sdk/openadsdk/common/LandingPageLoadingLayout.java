package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.model.KVG;
import com.bytedance.sdk.openadsdk.core.model.rV;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class LandingPageLoadingLayout extends PAGFrameLayout {
    private Runnable COT;
    private Runnable HWF;
    private int KS;
    private long jU;
    private HWF lMd;
    View zp;

    public LandingPageLoadingLayout(@NonNull Context context) {
        super(context);
        this.jU = 10L;
        KS();
    }

    private void KS() {
        setBackgroundColor(-1);
        this.zp = new PAGLogoView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, WNy.lMd(getContext(), 14.0f));
        this.zp.setVisibility(8);
        this.zp.setId(520093739);
        layoutParams.gravity = 8388691;
        layoutParams.leftMargin = WNy.lMd(getContext(), 16.0f);
        layoutParams.bottomMargin = WNy.lMd(getContext(), 16.0f);
        addView(this.zp, layoutParams);
        setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.COT;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.COT = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(int i9) {
        HWF hwf = this.lMd;
        if (hwf != null) {
            hwf.zp(i9);
        }
        if (i9 == 100) {
            lMd();
        }
    }

    public void zp(woN won, String str) {
        zp(won, str, false);
    }

    public void zp(final woN won, final String str, boolean z8) {
        String str2;
        String[] strArr;
        rV rVVar;
        KVG kvg;
        int i9;
        rV rVVar2 = null;
        if (won != null) {
            KVG ku = won.ku();
            if (ku != null) {
                this.jU = ku.zp();
            }
            String rOJ = won.rOJ();
            String[] Iok = won.Iok();
            i9 = won.sm();
            if (won.BO() != null && !TextUtils.isEmpty(won.BO().zp())) {
                rVVar2 = won.BO();
            }
            rVVar = rVVar2;
            kvg = ku;
            str2 = rOJ;
            strArr = Iok;
        } else {
            str2 = null;
            strArr = null;
            rVVar = null;
            kvg = null;
            i9 = 0;
        }
        if (i9 == 1) {
            this.lMd = new COT(getContext(), str2, strArr, rVVar, kvg);
        } else {
            this.lMd = new jU(getContext(), str2, strArr, rVVar, kvg);
        }
        View COT = this.lMd.COT();
        if (COT.getParent() instanceof ViewGroup) {
            ((ViewGroup) COT.getParent()).removeView(COT);
        }
        addView(COT);
        View view = this.zp;
        if (view != null) {
            if (z8) {
                view.setVisibility(0);
            }
            this.zp.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.zp(LandingPageLoadingLayout.this.getContext(), won, str);
                }
            });
        }
    }

    public void lMd() {
        this.KS = 0;
        HWF hwf = this.lMd;
        if (hwf != null) {
            removeView(hwf.COT);
            this.lMd.jU();
        }
        setVisibility(8);
        this.lMd = null;
        Runnable runnable = this.COT;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.HWF;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.HWF = null;
        this.COT = null;
    }

    public void zp() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout.2
            @Override // java.lang.Runnable
            public void run() {
                if (LandingPageLoadingLayout.this.lMd != null) {
                    LandingPageLoadingLayout.this.setVisibility(0);
                    LandingPageLoadingLayout.this.lMd.lMd();
                }
            }
        });
        if (this.COT == null) {
            this.COT = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    LandingPageLoadingLayout.this.lMd();
                }
            };
        }
        postDelayed(this.COT, this.jU * 1000);
    }

    public void zp(int i9) {
        if (i9 == 100 || i9 - this.KS >= 7) {
            this.KS = i9;
            if (com.bykv.vk.openvk.component.video.zp.KS.zp.lMd()) {
                lMd(this.KS);
                return;
            }
            if (this.HWF == null) {
                this.HWF = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout.4
                    @Override // java.lang.Runnable
                    public void run() {
                        LandingPageLoadingLayout landingPageLoadingLayout = LandingPageLoadingLayout.this;
                        landingPageLoadingLayout.lMd(landingPageLoadingLayout.KS);
                    }
                };
            }
            post(this.HWF);
        }
    }
}
