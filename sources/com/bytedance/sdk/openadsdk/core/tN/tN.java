package com.bytedance.sdk.openadsdk.core.tN;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.qsH.qO;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class tN extends com.bytedance.sdk.openadsdk.core.wN.tN {
    protected AdSlot AlY;
    protected qO Sg;
    protected final Context YFl;
    protected Wwa tN;

    /* renamed from: vc, reason: collision with root package name */
    protected String f10754vc;
    protected PAGBannerAdWrapperListener wN;

    public tN(@NonNull Context context, Wwa wwa, AdSlot adSlot) {
        super(context);
        this.f10754vc = "banner_ad";
        this.YFl = context;
        this.tN = wwa;
        this.AlY = adSlot;
        YFl();
        AdSlot adSlot2 = this.AlY;
        if (adSlot2 != null) {
            YFl(adSlot2.getExpressViewAcceptedWidth(), this.AlY.getExpressViewAcceptedHeight());
        }
    }

    public void Sg() {
        qO qOVar = this.Sg;
        if (qOVar != null) {
            qOVar.NjR();
        }
    }

    public void YFl() {
        qO qOVar = new qO(this.YFl, this.tN, this.AlY, this.f10754vc);
        this.Sg = qOVar;
        addView(qOVar, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.wN;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    public qO getCurView() {
        return this.Sg;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.Sg == null) {
            YFl();
        }
        com.bytedance.sdk.openadsdk.utils.tN.YFl(this, this.tN);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.wN = pAGBannerAdWrapperListener;
        qO qOVar = this.Sg;
        if (qOVar != null) {
            qOVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.vc() { // from class: com.bytedance.sdk.openadsdk.core.tN.tN.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.vc
                public void YFl() {
                    tN.this.wN.onAdClicked();
                }
            });
            this.Sg.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.tN.tN.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2;
                    Wwa wwa = tN.this.tN;
                    if (wwa != null && wwa.ZS() && (pAGBannerAdWrapperListener2 = tN.this.wN) != null) {
                        pAGBannerAdWrapperListener2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i10) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i10) {
                    tN tNVar = tN.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = tNVar.wN;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderFail(tNVar, str, i10);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f10, float f11) {
                    qO qOVar2 = tN.this.Sg;
                    if (qOVar2 != null) {
                        qOVar2.setSoundMute(true);
                    }
                    qO qOVar3 = tN.this.Sg;
                    if (qOVar3 != null && !com.bytedance.sdk.openadsdk.core.eT.tN.YFl(qOVar3.getDynamicShowType())) {
                        tN.this.YFl(f10, f11);
                    }
                    tN tNVar = tN.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = tNVar.wN;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderSuccess(tNVar, f10, f11);
                    }
                }
            });
        }
    }

    public void tN() {
        if (this.Sg != null) {
            NjR.Sg().vc(this.Sg.getClosedListenerKey());
            removeView(this.Sg);
            this.Sg.eT();
            this.Sg = null;
        }
        NjR.Sg().wXo();
    }

    public void YFl(float f10, float f11) {
        int tN = GS.tN(this.YFl, f10);
        int tN2 = GS.tN(this.YFl, f11);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(tN, tN2);
        }
        layoutParams.width = tN;
        layoutParams.height = tN2;
        setLayoutParams(layoutParams);
    }
}
