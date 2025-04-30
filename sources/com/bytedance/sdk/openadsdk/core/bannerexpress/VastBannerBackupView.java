package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.bykv.vk.openvk.component.video.api.jU.KS;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.tG;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.RatioFrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.ShadowImageView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.ku;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class VastBannerBackupView extends BackupView implements KS.InterfaceC0050KS, KS.jU {
    private ShadowImageView KVG;
    private NativeVideoTsView dQp;
    private PAGBannerAdWrapperListener pvr;
    private com.com.bytedance.overseas.sdk.zp.KS rV;
    private NativeExpressView tG;
    private long vwr;
    private String woN;
    public boolean zp;

    /* loaded from: classes.dex */
    public static class zp {
        public PAGLogoView COT;
        public PAGImageView HWF;
        public ShadowImageView KS;
        public ShadowImageView jU;
        public RatioFrameLayout lMd;
        public FrameLayout zp;

        private zp() {
        }
    }

    public VastBannerBackupView(@NonNull Context context) {
        super(context);
        this.zp = true;
        this.lMd = context;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.InterfaceC0050KS
    public void b_() {
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.InterfaceC0050KS
    public void e_() {
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.InterfaceC0050KS
    public void f_() {
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.InterfaceC0050KS
    public void g_() {
        ShadowImageView shadowImageView = this.KVG;
        if (shadowImageView != null) {
            shadowImageView.setVisibility(8);
        }
    }

    public long getVideoProgress() {
        return this.vwr;
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.pvr = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.woN = str;
    }

    private void COT() {
        tG zp2 = BannerExpressBackupView.zp(this.tG.getExpectExpressWidth(), this.tG.getExpectExpressHeight());
        if (this.tG.getExpectExpressWidth() > 0 && this.tG.getExpectExpressHeight() > 0) {
            this.QR = WNy.lMd(this.lMd, this.tG.getExpectExpressWidth());
            this.ku = WNy.lMd(this.lMd, this.tG.getExpectExpressHeight());
        } else {
            int KS = WNy.KS(this.lMd);
            this.QR = KS;
            this.ku = Float.valueOf(KS / zp2.lMd).intValue();
        }
        int i9 = this.QR;
        if (i9 > 0 && i9 > WNy.KS(this.lMd)) {
            this.QR = WNy.KS(this.lMd);
            this.ku = Float.valueOf(this.ku * (WNy.KS(this.lMd) / this.QR)).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.QR, this.ku);
        }
        layoutParams.width = this.QR;
        layoutParams.height = this.ku;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        HWF();
    }

    private void HWF() {
        View view;
        woN won = this.KS;
        if (won != null) {
            int mW = won.mW();
            zp QR = QR();
            if (QR == null || (view = QR.zp) == null) {
                return;
            }
            addView(view);
            ShadowImageView shadowImageView = QR.jU;
            PAGLogoView pAGLogoView = QR.COT;
            PAGImageView pAGImageView = QR.HWF;
            if (pAGImageView != null && this.KS.QR()) {
                WNy.zp((View) pAGImageView, 0);
                com.bytedance.sdk.openadsdk.Bj.KS.zp().zp((int) WNy.zp(KVG.zp(), 11.0f, true), pAGImageView, this.KS);
            }
            this.KVG = QR.KS;
            NativeVideoTsView videoView = getVideoView();
            if (videoView instanceof NativeVideoTsView) {
                this.dQp = videoView;
                videoView.setVideoAdLoadListener(this);
                this.dQp.setVideoAdInteractionListener(this);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair(shadowImageView, FriendlyObstructionPurpose.CLOSE_AD));
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                arrayList.add(new Pair(pAGLogoView, friendlyObstructionPurpose));
                arrayList.add(new Pair(pAGImageView, friendlyObstructionPurpose));
                arrayList.add(new Pair(this.KVG, FriendlyObstructionPurpose.VIDEO_CONTROLS));
                this.dQp.zp(arrayList);
                this.dQp.setAdCreativeClickListener(new NativeVideoTsView.zp() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.VastBannerBackupView.1
                    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.zp
                    public void zp(View view2, int i9) {
                        if (VastBannerBackupView.this.pvr != null) {
                            VastBannerBackupView.this.pvr.onAdClicked();
                        }
                    }
                });
            }
            if (pAGLogoView != null) {
                pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.VastBannerBackupView.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.zp(((BackupView) VastBannerBackupView.this).lMd, ((BackupView) VastBannerBackupView.this).KS, ((BackupView) VastBannerBackupView.this).HWF);
                    }
                });
            }
            if (shadowImageView != null) {
                shadowImageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.VastBannerBackupView.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        VastBannerBackupView.this.zp();
                    }
                });
                NativeExpressView nativeExpressView = this.tG;
                if (nativeExpressView != null) {
                    if (nativeExpressView.getClickListener() != null) {
                        this.tG.getClickListener().lMd(shadowImageView);
                    }
                    if (this.tG.getClickCreativeListener() != null) {
                        this.tG.getClickCreativeListener().lMd(shadowImageView);
                    }
                }
            }
            ShadowImageView shadowImageView2 = this.KVG;
            if (shadowImageView2 != null) {
                shadowImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.VastBannerBackupView.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Drawable zp2;
                        if (VastBannerBackupView.this.dQp != null) {
                            boolean z8 = !VastBannerBackupView.this.dQp.YW();
                            VastBannerBackupView vastBannerBackupView = VastBannerBackupView.this;
                            if (z8) {
                                zp2 = ku.zp(vastBannerBackupView.getContext(), "tt_mute_wrapper");
                            } else {
                                zp2 = ku.zp(vastBannerBackupView.getContext(), "tt_unmute_wrapper");
                            }
                            VastBannerBackupView.this.dQp.setIsQuiet(z8);
                            VastBannerBackupView.this.KVG.setImageDrawable(zp2);
                            if (((BackupView) VastBannerBackupView.this).KS != null && ((BackupView) VastBannerBackupView.this).KS.xg() != null && ((BackupView) VastBannerBackupView.this).KS.xg().zp() != null) {
                                if (z8) {
                                    ((BackupView) VastBannerBackupView.this).KS.xg().zp().ku(VastBannerBackupView.this.vwr);
                                } else {
                                    ((BackupView) VastBannerBackupView.this).KS.xg().zp().YW(VastBannerBackupView.this.vwr);
                                }
                            }
                        }
                    }
                });
            }
            RatioFrameLayout ratioFrameLayout = QR.lMd;
            woN won2 = this.KS;
            if (won2 != null && won2.xg() != null && ratioFrameLayout != null) {
                int vDp = this.KS.xg().vDp();
                float tG = this.KS.xg().tG();
                if (vDp > 0 && tG > 0.0f) {
                    ratioFrameLayout.setRatio(vDp / tG);
                } else if (mW == 15) {
                    ratioFrameLayout.setRatio(0.5625f);
                } else if (mW == 5) {
                    ratioFrameLayout.setRatio(1.7777778f);
                } else {
                    ratioFrameLayout.setRatio(1.0f);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (videoView != null && ratioFrameLayout != null) {
                ratioFrameLayout.addView(videoView, layoutParams);
                videoView.setTag(520093762, Boolean.TRUE);
            }
            zp((View) videoView, true);
            zp((View) this, true);
            zp(ratioFrameLayout);
        }
    }

    private zp QR() {
        zp zpVar = new zp();
        zpVar.zp = new FrameLayout(this.lMd);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        layoutParams.width = -1;
        layoutParams.height = -1;
        zpVar.zp.setLayoutParams(layoutParams);
        zpVar.lMd = new RatioFrameLayout(this.lMd);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        zpVar.lMd.setLayoutParams(layoutParams2);
        zpVar.zp.addView(zpVar.lMd);
        int lMd = WNy.lMd(this.lMd, 20.0f);
        int lMd2 = WNy.lMd(this.lMd, 5.0f);
        zpVar.KS = new ShadowImageView(this.lMd);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(lMd, lMd);
        layoutParams3.setMargins(lMd2, lMd2, lMd2, lMd2);
        zpVar.KS.setScaleType(ImageView.ScaleType.CENTER);
        zpVar.KS.setImageDrawable(ku.zp(this.lMd, "tt_mute_wrapper"));
        zpVar.KS.setBackground(ku.zp(this.lMd, "tt_mute_btn_bg"));
        zpVar.KS.setLayoutParams(layoutParams3);
        zpVar.zp.addView(zpVar.KS);
        ShadowImageView shadowImageView = new ShadowImageView(this.lMd);
        zpVar.jU = shadowImageView;
        shadowImageView.setId(520093697);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(lMd, lMd);
        layoutParams4.gravity = 8388613;
        int lMd3 = WNy.lMd(this.lMd, 7.0f);
        int lMd4 = WNy.lMd(this.lMd, 3.0f);
        layoutParams4.setMargins(lMd3, lMd3, lMd3, lMd3);
        ShadowImageView shadowImageView2 = zpVar.jU;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        shadowImageView2.setScaleType(scaleType);
        zpVar.jU.setPadding(lMd4, lMd4, lMd4, lMd4);
        zpVar.jU.setImageDrawable(cz.KS(this.lMd, "tt_pangle_ad_close_drawable"));
        zpVar.jU.setBackground(ku.zp(this.lMd, "tt_mute_btn_bg"));
        zpVar.jU.setLayoutParams(layoutParams4);
        zpVar.zp.addView(zpVar.jU);
        zpVar.COT = new PAGLogoView(this.lMd);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 8388691;
        layoutParams5.setMargins(lMd2, lMd2, lMd2, lMd2);
        zpVar.COT.setLayoutParams(layoutParams5);
        zpVar.zp.addView(zpVar.COT);
        zpVar.HWF = new PAGImageView(this.lMd);
        int lMd5 = WNy.lMd(this.lMd, 11.0f);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(lMd5, lMd5);
        layoutParams6.gravity = 8388693;
        layoutParams6.rightMargin = lMd2;
        layoutParams6.bottomMargin = lMd2;
        zpVar.HWF.setVisibility(8);
        zpVar.HWF.setScaleType(scaleType);
        zpVar.HWF.setLayoutParams(layoutParams6);
        zpVar.zp.addView(zpVar.HWF);
        return zpVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    public void zp(View view, int i9, com.bytedance.sdk.openadsdk.core.model.tG tGVar) {
        NativeExpressView nativeExpressView = this.tG;
        if (nativeExpressView != null) {
            nativeExpressView.zp(view, i9, tGVar);
            NativeVideoTsView nativeVideoTsView = this.dQp;
            if (nativeVideoTsView == null || !(nativeVideoTsView.getNativeVideoController() instanceof com.bytedance.sdk.openadsdk.core.video.nativevideo.KS)) {
                return;
            }
            ((com.bytedance.sdk.openadsdk.core.video.nativevideo.KS) this.dQp.getNativeVideoController()).UPs();
        }
    }

    public void zp(woN won, NativeExpressView nativeExpressView, com.com.bytedance.overseas.sdk.zp.KS ks) {
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.KS = won;
        this.tG = nativeExpressView;
        this.rV = ks;
        this.HWF = "banner_ad";
        nativeExpressView.addView(this, new ViewGroup.LayoutParams(-2, -2));
        COT();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    public void zp() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.COT;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.dislike.lMd lmd = this.jU;
        if (lmd != null) {
            lmd.zp();
        } else {
            TTDelegateActivity.zp(this.KS, this.woN);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.jU
    public void zp(int i9, int i10) {
        ShadowImageView shadowImageView = this.KVG;
        if (shadowImageView != null) {
            shadowImageView.setVisibility(8);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.InterfaceC0050KS
    public void zp(long j7, long j9) {
        this.vwr = j7;
    }
}
