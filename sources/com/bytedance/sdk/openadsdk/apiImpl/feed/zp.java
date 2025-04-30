package com.bytedance.sdk.openadsdk.apiImpl.feed;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.COT.Bj;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import com.bytedance.sdk.openadsdk.core.model.rV;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.settings.dQp;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public class zp {
    private com.bytedance.sdk.openadsdk.core.lMd.zp Bj;
    private WeakReference<NativeVideoTsView> COT;
    private lMd HWF;
    private final String KS;
    private com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.lMd QR;
    private NativeExpressView YW;
    private PAGMediaView dT;
    private boolean jU;
    private PAGMediaView ku;
    private final Context lMd;
    private WeakReference<com.bytedance.sdk.openadsdk.core.QR.HWF> rV;
    private boolean tG = false;
    private com.bytedance.sdk.openadsdk.core.lMd.lMd vDp;
    protected final woN zp;

    public zp(Context context, woN won, String str) {
        this.lMd = context;
        this.zp = won;
        this.KS = str;
    }

    private PAGMediaView dQp() {
        if (woN.COT(this.zp)) {
            com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.lMd lmd = this.QR;
            if (lmd != null && (lmd instanceof com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.zp)) {
                NativeExpressVideoView nativeExpressVideoView = (NativeExpressVideoView) lmd.jU();
                nativeExpressVideoView.setTag(520093762, Boolean.TRUE);
                if (!this.tG) {
                    this.QR.COT();
                }
                this.tG = true;
                return zp(nativeExpressVideoView);
            }
            return null;
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.lMd lmd2 = this.QR;
        if (lmd2 != null) {
            NativeExpressView jU = lmd2.jU();
            jU.setTag(520093762, Boolean.TRUE);
            if (!this.tG) {
                this.QR.COT();
            }
            this.tG = true;
            return zp(jU);
        }
        return null;
    }

    private String rV() {
        rV rVVar;
        List<rV> Rg = this.zp.Rg();
        if (Rg.isEmpty() || (rVVar = Rg.get(0)) == null) {
            return null;
        }
        return rVVar.zp();
    }

    public View Bj() {
        woN won;
        if (KVG.zp() != null && (won = this.zp) != null) {
            if (!won.Fm() || !this.zp.QR()) {
                return null;
            }
            ImageView imageView = new ImageView(KVG.zp());
            com.bytedance.sdk.openadsdk.Bj.KS.zp().zp((int) WNy.zp(KVG.zp(), 14.0f, true), imageView, this.zp);
            return imageView;
        }
        tG.zp("TTNativeAdImpl", "getAdChoicesView mContext == null");
        return null;
    }

    public String COT() {
        woN won = this.zp;
        if (won != null) {
            return won.MBR();
        }
        return null;
    }

    public String HWF() {
        woN won = this.zp;
        if (won != null) {
            return won.oB();
        }
        return null;
    }

    public PAGImageItem KS() {
        woN won = this.zp;
        if (won != null && won.BO() != null) {
            return new PAGImageItem(this.zp.BO().KS(), this.zp.BO().lMd(), this.zp.BO().zp(), (float) this.zp.BO().jU());
        }
        return null;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public PAGMediaView QR() {
        PAGMediaView YW;
        com.bytedance.sdk.openadsdk.utils.lMd.zp(this.zp);
        if (this.zp.cz() == 2) {
            YW = dQp();
            zp(YW);
        } else {
            YW = YW();
        }
        if (YW != null) {
            YW.setMrcTrackerKey(com.bytedance.sdk.openadsdk.rV.zp.COT.lMd(this.zp));
        } else {
            YW = new PAGMediaView(this.lMd) { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.zp.1
                @Override // android.view.ViewGroup, android.view.View
                public void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    com.bytedance.sdk.openadsdk.utils.KS.zp(this, zp.this.zp);
                }
            };
        }
        if (YW instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView) YW).setMaterialMeta(this.zp);
        }
        this.dT = YW;
        return YW;
    }

    public PAGMediaView YW() {
        if (woN.COT(this.zp)) {
            lMd lmd = this.HWF;
            if (lmd != null) {
                View COT = lmd.COT();
                if (COT != null) {
                    if (COT.getParent() instanceof ViewGroup) {
                        ((ViewGroup) COT.getParent()).removeView(COT);
                    }
                    PAGMediaView pAGMediaView = this.ku;
                    if (pAGMediaView != null) {
                        pAGMediaView.setOnClickListener(null);
                        this.ku.setOnTouchListener(null);
                    }
                    PAGVideoMediaView pAGVideoMediaView = new PAGVideoMediaView(this.lMd, COT, this);
                    pAGVideoMediaView.setTag(520093762, Boolean.TRUE);
                    if (this.Bj != null && dQp.etV().jU(String.valueOf(this.zp.FGx()))) {
                        pAGVideoMediaView.setOnClickListener(this.Bj);
                        pAGVideoMediaView.setOnTouchListener(this.Bj);
                    } else {
                        com.bytedance.sdk.openadsdk.core.lMd.KS ks = new com.bytedance.sdk.openadsdk.core.lMd.KS() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.zp.4
                            @Override // com.bytedance.sdk.openadsdk.core.lMd.KS
                            public void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, boolean z8) {
                                try {
                                    ((PAGVideoMediaView) view).handleInterruptVideo();
                                } catch (Exception unused) {
                                }
                            }
                        };
                        pAGVideoMediaView.setOnClickListener(ks);
                        pAGVideoMediaView.setOnTouchListener(ks);
                    }
                    this.ku = pAGVideoMediaView;
                    pAGVideoMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    return pAGVideoMediaView;
                }
                ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
                return null;
            }
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        List<rV> Rg = this.zp.Rg();
        if (Rg != null && !Rg.isEmpty()) {
            ImageView imageView = new ImageView(this.lMd);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            rV rVVar = Rg.get(0);
            if (rVVar != null) {
                com.bytedance.sdk.openadsdk.HWF.jU.zp(rVVar).KS(2).zp(com.bytedance.sdk.openadsdk.HWF.KS.zp(this.zp, rVVar.zp(), imageView));
            }
            PAGMediaView zp = zp(imageView);
            if (this.Bj != null && dQp.etV().jU(String.valueOf(this.zp.FGx()))) {
                zp.setOnClickListener(this.Bj);
                zp.setOnTouchListener(this.Bj);
            } else {
                zp.setOnClickListener(null);
                zp.setOnTouchListener(null);
            }
            zp.setTag(520093762, Boolean.TRUE);
            PAGMediaView pAGMediaView2 = this.ku;
            if (pAGMediaView2 != null) {
                pAGMediaView2.setOnClickListener(null);
                this.ku.setOnTouchListener(null);
            }
            this.ku = zp;
            return zp;
        }
        ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
        return null;
    }

    public View dT() {
        if (KVG.zp() == null) {
            tG.zp("TTNativeAdImpl", "getAdLogoView mContext == null");
            return null;
        }
        ImageView imageView = new ImageView(KVG.zp());
        imageView.setImageResource(cz.jU(KVG.zp(), "tt_ad_logo_new"));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.zp.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                zp.this.vDp();
            }
        });
        return imageView;
    }

    public String jU() {
        woN won = this.zp;
        if (won != null) {
            return won.rCC();
        }
        return null;
    }

    public PAGMediaView ku() {
        return this.dT;
    }

    public NativeExpressView lMd() {
        return this.YW;
    }

    public void tG() {
        com.bytedance.sdk.openadsdk.core.QR.HWF hwf;
        WeakReference<com.bytedance.sdk.openadsdk.core.QR.HWF> weakReference = this.rV;
        if (weakReference != null && (hwf = weakReference.get()) != null) {
            hwf.zp(13);
        }
    }

    public void vDp() {
        Context context = this.lMd;
        if (context != null) {
            TTWebsiteActivity.zp(context, this.zp, this.KS);
        }
    }

    public void zp(lMd lmd) {
        this.HWF = lmd;
    }

    private KS lMd(final PAGVideoAdListener pAGVideoAdListener) {
        return new KS() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.zp.7
            @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.KS
            public void KS(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.KS
            public void lMd(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.KS
            public void zp(int i9, int i10) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.KS
            public void zp(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }
        };
    }

    public void zp(com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.lMd lmd) {
        this.QR = lmd;
    }

    public void zp(NativeVideoTsView nativeVideoTsView) {
        this.COT = new WeakReference<>(nativeVideoTsView);
    }

    public void zp(boolean z8) {
        this.jU = z8;
    }

    public PAGMediaView zp() {
        return this.ku;
    }

    public void zp(com.bytedance.sdk.openadsdk.core.lMd.zp zpVar) {
        this.Bj = zpVar;
    }

    public void zp(com.bytedance.sdk.openadsdk.core.lMd.lMd lmd) {
        this.vDp = lmd;
    }

    private void zp(final PAGMediaView pAGMediaView) {
        if (pAGMediaView == null) {
            return;
        }
        try {
            String rV = rV();
            if (TextUtils.isEmpty(rV)) {
                return;
            }
            com.bytedance.sdk.openadsdk.HWF.jU.zp(rV).zp(200).lMd(200).COT(WNy.jU(KVG.zp())).jU(WNy.KS(KVG.zp())).KS(2).zp(new com.bytedance.sdk.component.COT.ku() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.zp.3
                @Override // com.bytedance.sdk.component.COT.ku
                public Bitmap zp(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.jU.zp.zp(KVG.zp(), bitmap, 25);
                }
            }).zp(new com.bytedance.sdk.openadsdk.HWF.lMd(this.zp, rV, new com.bytedance.sdk.component.COT.KVG<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.zp.2
                @Override // com.bytedance.sdk.component.COT.KVG
                public void zp(int i9, String str, @Nullable Throwable th) {
                }

                @Override // com.bytedance.sdk.component.COT.KVG
                public void zp(Bj<Bitmap> bj) {
                    if (bj == null || bj.lMd() == null || bj.KS() == null) {
                        return;
                    }
                    pAGMediaView.setBackground(new BitmapDrawable(bj.lMd()));
                }
            }));
        } catch (Exception unused) {
        }
    }

    private PAGMediaView zp(final View view) {
        int i9;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        NativeExpressView nativeExpressView = this.YW;
        if (nativeExpressView != null) {
            nativeExpressView.setClickListener(null);
            this.YW.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.lMd.lMd lmd = this.vDp;
        if (lmd != null && (lmd instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.QR) && (view instanceof NativeExpressView)) {
            ((NativeExpressView) view).setClickListener((com.bytedance.sdk.openadsdk.core.nativeexpress.QR) lmd);
        }
        com.bytedance.sdk.openadsdk.core.lMd.zp zpVar = this.Bj;
        if (zpVar != null && (zpVar instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.HWF) && (view instanceof NativeExpressView)) {
            ((NativeExpressView) view).setClickCreativeListener((com.bytedance.sdk.openadsdk.core.nativeexpress.HWF) zpVar);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.lMd) { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.zp.5
            private void zp(boolean z8) {
                int i10;
                Integer num = this.zp;
                if (num != null) {
                    com.bytedance.sdk.openadsdk.rV.zp.lMd zp = com.bytedance.sdk.openadsdk.rV.zp.COT.zp(num);
                    if (z8) {
                        i10 = 4;
                    } else {
                        i10 = 8;
                    }
                    com.bytedance.sdk.openadsdk.rV.zp.COT.zp(zp, i10);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.KS.zp(this, zp.this.zp);
            }

            @Override // android.view.View
            public void onWindowFocusChanged(boolean z8) {
                super.onWindowFocusChanged(z8);
                if (!(view instanceof NativeExpressView)) {
                    zp(z8);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                zp.this.zp(pAGVideoAdListener);
            }
        };
        int i10 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i10 = layoutParams.width;
            i9 = layoutParams.height;
        } else {
            i9 = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, i9);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof NativeExpressView) {
            this.YW = (NativeExpressView) view;
        }
        return pAGMediaView;
    }

    public void zp(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.lMd lmd;
        if (this.zp.cz() == 2 && woN.COT(this.zp) && (lmd = this.QR) != null && (lmd instanceof com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.zp)) {
            NativeExpressVideoView nativeExpressVideoView = (NativeExpressVideoView) lmd.jU();
            if (nativeExpressVideoView != null) {
                nativeExpressVideoView.setVideoAdListener(lMd(pAGVideoAdListener));
                return;
            }
            return;
        }
        lMd lmd2 = this.HWF;
        if (lmd2 != null) {
            lmd2.zp(lMd(pAGVideoAdListener));
        }
    }

    public void zp(com.bytedance.sdk.openadsdk.core.QR.HWF hwf) {
        this.rV = new WeakReference<>(hwf);
    }
}
