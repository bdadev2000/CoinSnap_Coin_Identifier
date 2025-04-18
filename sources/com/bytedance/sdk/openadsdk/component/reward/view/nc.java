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
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.rkt;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.GS;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class nc {
    final Wwa AlY;
    View DSW;
    public rkt EH;
    private tN Ne;
    PAGLogoView NjR;
    final Activity Sg;
    private final boolean Wwa;
    com.bytedance.sdk.openadsdk.component.reward.YFl.rkt YoT;
    private int aIu;
    RelativeLayout eT;

    /* renamed from: nc, reason: collision with root package name */
    ImageView f10608nc;
    private final String qO;
    View qsH;
    com.bytedance.sdk.openadsdk.core.wN.vc rkt;
    protected final com.bytedance.sdk.openadsdk.component.reward.YFl.YFl tN;

    /* renamed from: vc, reason: collision with root package name */
    FrameLayout f10609vc;
    ImageView wN;
    private boolean wXo;
    int YFl = 3;
    protected int GA = 0;
    protected final AtomicBoolean pDU = new AtomicBoolean(false);
    Runnable lG = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.nc.2
        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView;
            try {
                Wwa wwa = nc.this.AlY;
                if ((wwa == null || !wwa.Pj()) && (imageView = nc.this.wN) != null) {
                    int[] iArr = new int[2];
                    imageView.getLocationOnScreen(iArr);
                    nc.this.tN.Sco.YFl(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    public nc(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        this.tN = yFl;
        this.Sg = yFl.UI;
        this.AlY = yFl.Sg;
        this.qO = yFl.wN;
        this.Wwa = yFl.AlY;
    }

    private void Wwa() {
        RelativeLayout relativeLayout;
        tN tNVar = (tN) this.tN.mB.findViewById(GA.YoT);
        this.Ne = tNVar;
        tNVar.YFl(this.tN);
        this.NjR = (PAGLogoView) this.tN.mB.findViewById(520093757);
        this.f10608nc = (ImageView) this.tN.mB.findViewById(GA.Pj);
        this.wN = (ImageView) this.tN.mB.findViewById(520093708);
        this.f10609vc = (FrameLayout) this.tN.mB.findViewById(GA.eT);
        this.DSW = this.tN.mB.findViewById(GA.lG);
        this.qsH = this.tN.mB.findViewById(GA.jz);
        this.eT = (RelativeLayout) this.tN.mB.findViewById(GA.ivp);
        com.bytedance.sdk.openadsdk.component.reward.YFl.rkt rktVar = this.YoT;
        if (rktVar != null && rktVar.AlY() != null && (relativeLayout = this.eT) != null) {
            relativeLayout.addView(this.YoT.AlY(), new LinearLayout.LayoutParams(-1, -1));
            this.YoT.Sg();
        }
    }

    public void AlY() {
        GS.YFl((View) this.f10609vc, 8);
        GS.YFl(this.DSW, 8);
        GS.YFl(this.qsH, 8);
        Sg(8);
        GS.YFl((View) this.wN, 8);
        GS.YFl((View) this.NjR, 8);
        GS.YFl((View) this.eT, 8);
        GS.YFl((View) this.f10608nc, 8);
    }

    public void DSW() {
        if (this.f10608nc.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10608nc.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(11);
            this.f10608nc.setLayoutParams(marginLayoutParams);
        }
    }

    public void EH() {
        rkt rktVar = this.EH;
        if (rktVar != null) {
            rktVar.vc();
        }
    }

    public void GA() {
        try {
            Activity activity = this.tN.UI;
            Animation loadAnimation = AnimationUtils.loadAnimation(activity, qO.NjR(activity, "tt_fade_out"));
            if (loadAnimation != null) {
                loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.nc.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        nc.this.tN.lu.YoT();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                this.tN.lu.YFl(loadAnimation);
            } else {
                this.tN.lu.YoT();
            }
        } catch (Throwable unused) {
            this.tN.lu.YoT();
        }
    }

    public boolean NjR() {
        ImageView imageView = this.wN;
        if (imageView == null || imageView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void Sg() {
        if (this.wXo) {
            return;
        }
        this.wXo = true;
        this.aIu = this.tN.Cqy;
        if (YFl()) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.rkt rktVar = new com.bytedance.sdk.openadsdk.component.reward.YFl.rkt(this.tN);
            this.YoT = rktVar;
            rktVar.YFl();
        }
        Wwa();
        Activity activity = this.Sg;
        Wwa wwa = this.AlY;
        String str = this.qO;
        FrameLayout frameLayout = this.f10609vc;
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.tN;
        rkt rktVar2 = new rkt(activity, wwa, str, frameLayout, yFl.ZU, yFl.mB);
        this.EH = rktVar2;
        rktVar2.YFl();
    }

    public boolean YFl() {
        return true;
    }

    public void YoT() {
        try {
            com.bytedance.sdk.openadsdk.component.reward.YFl.rkt rktVar = this.YoT;
            if (rktVar != null) {
                rktVar.tN();
            }
            RelativeLayout relativeLayout = this.eT;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.eT;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(0.0f);
            }
        }
    }

    public View eT() {
        return this.Ne;
    }

    public void lG() {
        com.bytedance.sdk.openadsdk.core.Sg.wN wN = this.tN.dXO.wN();
        View view = this.Ne;
        if (view == null) {
            view = this.tN.mB;
        }
        wN.onClick(view);
    }

    public View nc() {
        return this.wN;
    }

    public void pDU() {
        rkt rktVar = this.EH;
        if (rktVar != null) {
            rktVar.wN();
        }
        ImageView imageView = this.wN;
        if (imageView != null) {
            imageView.removeCallbacks(this.lG);
        }
    }

    public void qsH() {
        tN tNVar = this.Ne;
        if (tNVar == null) {
            return;
        }
        tNVar.YFl();
    }

    public void rkt() {
        rkt rktVar = this.EH;
        if (rktVar != null) {
            rktVar.DSW();
        }
    }

    public void tN() {
        this.f10609vc.removeAllViews();
    }

    public FrameLayout vc() {
        return this.f10609vc;
    }

    public void wN() {
        int mn = this.AlY.mn();
        this.YFl = mn;
        if (mn == -200) {
            this.YFl = lG.AlY().EH(String.valueOf(this.AlY.kU()));
        }
        if (this.YFl != -1 || YFl() || (this.tN.Vmj instanceof com.bytedance.sdk.openadsdk.component.reward.Sg.tN)) {
            return;
        }
        Sg(0);
    }

    public void tN(int i10) {
        GS.YFl((View) this.NjR, i10);
    }

    public void YFl(boolean z10) {
        int i10 = 8;
        GS.YFl((View) this.NjR, Ne.tN(this.AlY) ? 8 : 0);
        ImageView imageView = this.f10608nc;
        if (this.AlY.yn() && this.AlY.qsH()) {
            i10 = 0;
        }
        GS.YFl((View) imageView, i10);
        Sg(z10);
        if (this.Wwa) {
            wN();
        }
    }

    public void wN(int i10) {
        GS.YFl((View) this.wN, i10);
        if (i10 == 0 && !this.tN.f10590nc.get() && Ne.DSW(this.tN.Sg)) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.tN;
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(yFl.Sg, yFl.wN, "show_close_button", (JSONObject) null, System.currentTimeMillis() - this.tN.f10588dd);
        }
    }

    public void YFl(int i10) {
        if (this.rkt == null) {
            this.rkt = new com.bytedance.sdk.openadsdk.core.wN.vc(this.tN.UI);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.rkt.setLayoutParams(layoutParams);
            this.rkt.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.qsH.YFl(this.tN.UI, "tt_video_loading_progress_bar"));
            this.tN.lu.vc().addView(this.rkt);
        }
        this.rkt.setVisibility(i10);
    }

    public void AlY(int i10) {
        int i11 = this.YFl;
        if (i11 == -1 || i10 != i11 || this.pDU.get()) {
            return;
        }
        Sg(0);
        this.pDU.set(true);
        qsH();
    }

    public void Sg(boolean z10) {
        ImageView imageView;
        int YFl;
        if (this.aIu != 1 && (imageView = this.wN) != null && z10) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (YFl = YFl("navigation_bar_height")) > 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (YFl > marginLayoutParams.rightMargin) {
                    marginLayoutParams.rightMargin = YFl;
                }
            }
        }
        if (this.tN.Vmj instanceof com.bytedance.sdk.openadsdk.component.reward.Sg.tN) {
            return;
        }
        Sg(0);
    }

    public void YFl(int i10, int i11) {
        FrameLayout frameLayout;
        if (this.AlY.Cfr() == 1 && (frameLayout = this.f10609vc) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int tN = GS.tN((Context) this.Sg);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10609vc.getLayoutParams();
            layoutParams.width = tN;
            int i12 = (tN * 9) / 16;
            layoutParams.height = i12;
            this.f10609vc.setLayoutParams(layoutParams);
            this.GA = (GS.AlY((Context) this.Sg) - i12) / 2;
            YoT.YFl("TTAD.RFullVideoLayout", "NonContentAreaHeight:" + this.GA);
        }
    }

    public void Sg(int i10) {
        Wwa wwa = this.AlY;
        if (wwa != null && wwa.yn() && com.bytedance.sdk.openadsdk.core.model.GA.YFl(this.AlY)) {
            GS.YFl((View) this.Ne, 8);
        } else {
            GS.YFl((View) this.Ne, i10);
        }
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.Sg.tN tNVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        View view;
        View view2;
        Wwa wwa;
        if (this.f10609vc != null && (wwa = this.AlY) != null && wwa.hQ() != null) {
            if (this.AlY.hQ().f10684vc && !rkt.Sg(this.AlY)) {
                YFl((View.OnClickListener) tNVar);
                YFl(tNVar);
            } else {
                YFl(onClickListener);
            }
        }
        Wwa wwa2 = this.AlY;
        if (wwa2 != null && wwa2.Cfr() == 1) {
            if (this.AlY.hQ() != null && (view2 = this.DSW) != null) {
                GS.YFl(view2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.DSW.getLayoutParams();
                layoutParams.height = this.GA;
                this.DSW.setLayoutParams(layoutParams);
                if (this.AlY.hQ().Sg) {
                    this.DSW.setOnClickListener(tNVar);
                    this.DSW.setOnTouchListener(onTouchListener);
                } else {
                    this.DSW.setOnClickListener(onClickListener);
                }
            }
            if (this.AlY.hQ() != null && (view = this.qsH) != null) {
                GS.YFl(view, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.qsH.getLayoutParams();
                layoutParams2.height = this.GA;
                this.qsH.setLayoutParams(layoutParams2);
                if (this.AlY.hQ().AlY) {
                    this.qsH.setOnClickListener(tNVar);
                    this.qsH.setOnTouchListener(onTouchListener);
                } else {
                    this.qsH.setOnClickListener(onClickListener);
                }
            }
        }
        PAGLogoView pAGLogoView = this.NjR;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.nc.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    try {
                        nc ncVar = nc.this;
                        TTWebsiteActivity.YFl(ncVar.Sg, ncVar.AlY, ncVar.qO);
                    } catch (Throwable th2) {
                        YoT.YFl("TTAD.RFullVideoLayout", th2.getMessage());
                    }
                }
            });
        }
        ImageView imageView = this.f10608nc;
        if (imageView != null) {
            imageView.setClickable(true);
            com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl((int) GS.YFl(lG.YFl(), 14.0f, true), this.f10608nc, this.tN.Sg);
        }
    }

    private int YFl(String str) {
        Resources resources = this.Sg.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    public void YFl(View.OnClickListener onClickListener) {
        GS.YFl(this.f10609vc, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    private void YFl(com.bytedance.sdk.openadsdk.core.Sg.tN tNVar) {
        GS.YFl((View) this.f10609vc, (View.OnTouchListener) tNVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public void YFl(float f10) {
        GS.YFl(this.wN, f10);
    }

    public void YFl(Animation animation) {
        RelativeLayout relativeLayout = this.eT;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }
}
