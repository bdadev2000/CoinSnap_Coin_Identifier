package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.ku;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class BannerExpressView extends PAGFrameLayout {
    protected AdSlot COT;
    protected PAGBannerAdWrapperListener HWF;
    protected NativeExpressView KS;
    protected int QR;
    protected String YW;
    protected woN jU;
    protected boolean ku;
    protected NativeExpressView lMd;
    protected final Context zp;

    public BannerExpressView(@NonNull Context context, woN won, AdSlot adSlot) {
        super(context);
        this.YW = "banner_ad";
        this.zp = context;
        this.jU = won;
        this.COT = adSlot;
        zp();
        AdSlot adSlot2 = this.COT;
        if (adSlot2 != null) {
            zp(adSlot2.getExpressViewAcceptedWidth(), this.COT.getExpressViewAcceptedHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void QR() {
        NativeExpressView nativeExpressView = this.lMd;
        this.lMd = this.KS;
        this.KS = nativeExpressView;
        if (nativeExpressView != null) {
            removeView(nativeExpressView);
            this.KS.Bj();
            this.KS = null;
        }
    }

    public void COT() {
        try {
            if (!this.ku && this.KS != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(zp(this.lMd)).with(lMd(this.KS));
                animatorSet.setDuration(this.QR).start();
                WNy.zp((View) this.KS, 0);
                this.ku = true;
            }
        } catch (Throwable th) {
            tG.zp("BannerExpressView", th.getMessage());
        }
    }

    public boolean HWF() {
        if (this.KS != null) {
            return true;
        }
        return false;
    }

    public void KS() {
        if (this.lMd != null) {
            ku.lMd().jU(this.lMd.getClosedListenerKey());
            removeView(this.lMd);
            this.lMd.Bj();
            this.lMd = null;
        }
        if (this.KS != null) {
            ku.lMd().jU(this.KS.getClosedListenerKey());
            removeView(this.KS);
            this.KS.Bj();
            this.KS = null;
        }
        ku.lMd().FP();
    }

    public NativeExpressView getCurView() {
        return this.lMd;
    }

    public NativeExpressView getNextView() {
        return this.KS;
    }

    public void jU() {
        NativeExpressView nativeExpressView = this.KS;
        if (nativeExpressView != null) {
            nativeExpressView.YW();
        }
    }

    public void lMd() {
        NativeExpressView nativeExpressView = this.lMd;
        if (nativeExpressView != null) {
            nativeExpressView.YW();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.lMd == null) {
            zp();
        }
        com.bytedance.sdk.openadsdk.utils.KS.zp(this, this.jU);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setDuration(int i9) {
        this.QR = i9;
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.HWF = pAGBannerAdWrapperListener;
        NativeExpressView nativeExpressView = this.lMd;
        if (nativeExpressView != null) {
            nativeExpressView.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.lMd() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.lMd
                public void zp() {
                    BannerExpressView.this.HWF.onAdClicked();
                }
            });
            this.lMd.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.3
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = BannerExpressView.this.HWF;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i9) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i9) {
                    BannerExpressView bannerExpressView = BannerExpressView.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = bannerExpressView.HWF;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderFail(bannerExpressView, str, i9);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f9, float f10) {
                    NativeExpressView nativeExpressView2 = BannerExpressView.this.lMd;
                    if (nativeExpressView2 != null) {
                        nativeExpressView2.setSoundMute(true);
                    }
                    BannerExpressView.this.zp(f9, f10);
                    BannerExpressView bannerExpressView = BannerExpressView.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = bannerExpressView.HWF;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderSuccess(bannerExpressView, f9, f10);
                    }
                }
            });
        }
    }

    public void zp() {
        NativeExpressView nativeExpressView = new NativeExpressView(this.zp, this.jU, this.COT, this.YW);
        this.lMd = nativeExpressView;
        addView(nativeExpressView, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.HWF;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    private ObjectAnimator lMd(NativeExpressView nativeExpressView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nativeExpressView, "translationX", getWidth(), 0.0f);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.4
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                BannerExpressView bannerExpressView = BannerExpressView.this;
                bannerExpressView.ku = false;
                bannerExpressView.QR();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        return ofFloat;
    }

    public void zp(woN won, AdSlot adSlot) {
        NativeExpressView nativeExpressView = new NativeExpressView(this.zp, won, adSlot, this.YW);
        this.KS = nativeExpressView;
        nativeExpressView.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                PAGBannerAdWrapperListener pAGBannerAdWrapperListener = BannerExpressView.this.HWF;
                if (pAGBannerAdWrapperListener != null) {
                    pAGBannerAdWrapperListener.onAdClicked();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i9) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i9) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f9, float f10) {
                BannerExpressView.this.zp(f9, f10);
                NativeExpressView nativeExpressView2 = BannerExpressView.this.KS;
                if (nativeExpressView2 != null) {
                    nativeExpressView2.setSoundMute(true);
                }
                BannerExpressView.this.COT();
            }
        });
        WNy.zp((View) this.KS, 8);
        addView(this.KS, new ViewGroup.LayoutParams(-1, -1));
    }

    public void zp(float f9, float f10) {
        int lMd = WNy.lMd(this.zp, f9);
        int lMd2 = WNy.lMd(this.zp, f10);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(lMd, lMd2);
        }
        layoutParams.width = lMd;
        layoutParams.height = lMd2;
        setLayoutParams(layoutParams);
    }

    private ObjectAnimator zp(NativeExpressView nativeExpressView) {
        return ObjectAnimator.ofFloat(nativeExpressView, "translationX", 0.0f, -getWidth());
    }
}
