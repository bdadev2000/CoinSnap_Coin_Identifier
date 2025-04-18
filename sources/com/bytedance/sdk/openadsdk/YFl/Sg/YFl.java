package com.bytedance.sdk.openadsdk.YFl.Sg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.EH;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.qsH.NjR;
import com.bytedance.sdk.openadsdk.core.qsH.qO;
import com.bytedance.sdk.openadsdk.core.settings.rkt;
import com.bytedance.sdk.openadsdk.utils.GS;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public class YFl {
    private boolean AlY;
    private com.bytedance.sdk.openadsdk.YFl.Sg.YFl.tN DSW;
    private boolean GA = false;
    private qO NjR;
    private final Context Sg;
    protected final Wwa YFl;
    private com.bytedance.sdk.openadsdk.core.Sg.Sg YoT;
    private com.bytedance.sdk.openadsdk.core.Sg.YFl eT;

    /* renamed from: nc, reason: collision with root package name */
    private PAGMediaView f10523nc;
    private WeakReference<com.bytedance.sdk.openadsdk.core.YoT.vc> pDU;
    private PAGMediaView qsH;
    private final String tN;

    /* renamed from: vc, reason: collision with root package name */
    private Sg f10524vc;
    private WeakReference<com.bytedance.sdk.openadsdk.core.GA.Sg.vc> wN;

    public YFl(Context context, Wwa wwa, String str) {
        this.Sg = context;
        this.YFl = wwa;
        this.tN = str;
    }

    private PAGMediaView pDU() {
        if (Wwa.wN(this.YFl)) {
            com.bytedance.sdk.openadsdk.YFl.Sg.YFl.tN tNVar = this.DSW;
            if (tNVar != null && (tNVar instanceof com.bytedance.sdk.openadsdk.YFl.Sg.YFl.Sg)) {
                com.bytedance.sdk.openadsdk.core.qsH.Wwa wwa = (com.bytedance.sdk.openadsdk.core.qsH.Wwa) tNVar.AlY();
                wwa.setTag(520093762, Boolean.TRUE);
                if (!this.GA) {
                    this.DSW.wN();
                }
                this.GA = true;
                return YFl(wwa);
            }
            return null;
        }
        com.bytedance.sdk.openadsdk.YFl.Sg.YFl.tN tNVar2 = this.DSW;
        if (tNVar2 != null) {
            qO AlY = tNVar2.AlY();
            AlY.setTag(520093762, Boolean.TRUE);
            if (!this.GA) {
                this.DSW.wN();
            }
            this.GA = true;
            return YFl(AlY);
        }
        return null;
    }

    public String AlY() {
        Wwa wwa = this.YFl;
        if (wwa != null) {
            return YFl(wwa);
        }
        return null;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public PAGMediaView DSW() {
        PAGMediaView NjR;
        com.bytedance.sdk.openadsdk.utils.Sg.YFl(this.YFl);
        if (this.YFl.Ne() == 2) {
            NjR = pDU();
            YFl(NjR);
        } else {
            NjR = NjR();
        }
        if (NjR != null) {
            NjR.setMrcTrackerKey(com.bytedance.sdk.openadsdk.VOe.YFl.wN.Sg(this.YFl));
        } else {
            NjR = new PAGMediaView(this.Sg) { // from class: com.bytedance.sdk.openadsdk.YFl.Sg.YFl.1
                @Override // android.view.ViewGroup, android.view.View
                public void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    com.bytedance.sdk.openadsdk.utils.tN.YFl(this, YFl.this.YFl);
                }
            };
        }
        if (NjR instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView) NjR).setMaterialMeta(this.YFl);
        }
        this.f10523nc = NjR;
        return NjR;
    }

    public void GA() {
        com.bytedance.sdk.openadsdk.core.YoT.vc vcVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.YoT.vc> weakReference = this.pDU;
        if (weakReference != null && (vcVar = weakReference.get()) != null) {
            vcVar.YFl(13);
        }
    }

    public PAGMediaView NjR() {
        if (Wwa.wN(this.YFl)) {
            Sg sg2 = this.f10524vc;
            if (sg2 != null) {
                View wN = sg2.wN();
                if (wN != null) {
                    if (wN.getParent() instanceof ViewGroup) {
                        ((ViewGroup) wN.getParent()).removeView(wN);
                    }
                    PAGMediaView pAGMediaView = this.qsH;
                    if (pAGMediaView != null) {
                        pAGMediaView.setOnClickListener(null);
                        this.qsH.setOnTouchListener(null);
                    }
                    PAGVideoMediaView pAGVideoMediaView = new PAGVideoMediaView(this.Sg, wN, this);
                    pAGVideoMediaView.setTag(520093762, Boolean.TRUE);
                    if (this.eT != null && rkt.JwO().AlY(String.valueOf(this.YFl.kU()))) {
                        pAGVideoMediaView.setOnClickListener(this.eT);
                        pAGVideoMediaView.setOnTouchListener(this.eT);
                    } else {
                        com.bytedance.sdk.openadsdk.core.Sg.tN tNVar = new com.bytedance.sdk.openadsdk.core.Sg.tN() { // from class: com.bytedance.sdk.openadsdk.YFl.Sg.YFl.2
                            @Override // com.bytedance.sdk.openadsdk.core.Sg.tN
                            public void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, boolean z10) {
                                try {
                                    ((PAGVideoMediaView) view).handleInterruptVideo();
                                } catch (Exception unused) {
                                }
                            }
                        };
                        pAGVideoMediaView.setOnClickListener(tNVar);
                        pAGVideoMediaView.setOnTouchListener(tNVar);
                    }
                    this.qsH = pAGVideoMediaView;
                    pAGVideoMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    return pAGVideoMediaView;
                }
                ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
                return null;
            }
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        List<EH> VB = this.YFl.VB();
        if (VB != null && !VB.isEmpty()) {
            ImageView imageView = new ImageView(this.Sg);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            EH eh2 = VB.get(0);
            if (eh2 != null) {
                com.bytedance.sdk.openadsdk.NjR.AlY.YFl(eh2).tN(2).YFl(com.bytedance.sdk.openadsdk.NjR.tN.YFl(this.YFl, eh2.YFl(), imageView));
            }
            PAGMediaView YFl = YFl(imageView);
            if (this.eT != null && rkt.JwO().AlY(String.valueOf(this.YFl.kU()))) {
                YFl.setOnClickListener(this.eT);
                YFl.setOnTouchListener(this.eT);
            } else {
                YFl.setOnClickListener(null);
                YFl.setOnTouchListener(null);
            }
            YFl.setTag(520093762, Boolean.TRUE);
            PAGMediaView pAGMediaView2 = this.qsH;
            if (pAGMediaView2 != null) {
                pAGMediaView2.setOnClickListener(null);
                this.qsH.setOnTouchListener(null);
            }
            this.qsH = YFl;
            return YFl;
        }
        ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
        return null;
    }

    public qO Sg() {
        return this.NjR;
    }

    public void YFl(Sg sg2) {
        this.f10524vc = sg2;
    }

    public void YoT() {
        Context context = this.Sg;
        if (context != null) {
            TTWebsiteActivity.YFl(context, this.YFl, this.tN);
        }
    }

    public View eT() {
        Wwa wwa;
        if (lG.YFl() != null && (wwa = this.YFl) != null) {
            if (!wwa.yn() || !this.YFl.qsH()) {
                return null;
            }
            ImageView imageView = new ImageView(lG.YFl());
            com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl((int) GS.YFl(lG.YFl(), 14.0f, true), imageView, this.YFl);
            return imageView;
        }
        YoT.YFl("TTNativeAdImpl", "getAdChoicesView mContext == null");
        return null;
    }

    public View nc() {
        if (lG.YFl() == null) {
            YoT.YFl("TTNativeAdImpl", "getAdLogoView mContext == null");
            return null;
        }
        ImageView imageView = new ImageView(lG.YFl());
        imageView.setImageResource(com.bytedance.sdk.component.utils.qO.AlY(lG.YFl(), "tt_ad_logo_new"));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.YFl.Sg.YFl.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                YFl.this.YoT();
            }
        });
        return imageView;
    }

    public PAGMediaView qsH() {
        return this.f10523nc;
    }

    public PAGImageItem tN() {
        Wwa wwa = this.YFl;
        if (wwa != null && wwa.dGX() != null) {
            return new PAGImageItem(this.YFl.dGX().tN(), this.YFl.dGX().Sg(), this.YFl.dGX().YFl(), (float) this.YFl.dGX().AlY());
        }
        return null;
    }

    public String vc() {
        Wwa wwa = this.YFl;
        if (wwa != null) {
            return wwa.lL();
        }
        return null;
    }

    public String wN() {
        Wwa wwa = this.YFl;
        if (wwa != null) {
            return Sg(wwa);
        }
        return null;
    }

    private String Sg(Wwa wwa) {
        if (TextUtils.isEmpty(wwa.Hjb())) {
            return !TextUtils.isEmpty(wwa.dd()) ? wwa.dd() : "";
        }
        return wwa.Hjb();
    }

    public void YFl(com.bytedance.sdk.openadsdk.YFl.Sg.YFl.tN tNVar) {
        this.DSW = tNVar;
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.GA.Sg.vc vcVar) {
        this.wN = new WeakReference<>(vcVar);
    }

    public void YFl(boolean z10) {
        this.AlY = z10;
    }

    public PAGMediaView YFl() {
        return this.qsH;
    }

    private tN Sg(final PAGVideoAdListener pAGVideoAdListener) {
        return new tN() { // from class: com.bytedance.sdk.openadsdk.YFl.Sg.YFl.5
            @Override // com.bytedance.sdk.openadsdk.YFl.Sg.tN
            public void Sg(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.YFl.Sg.tN
            public void YFl(int i10, int i11) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.YFl.Sg.tN
            public void tN(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.YFl.Sg.tN
            public void YFl(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }
        };
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.Sg.YFl yFl) {
        this.eT = yFl;
    }

    private String YFl(Wwa wwa) {
        if (wwa.in() != null && !TextUtils.isEmpty(wwa.in().Sg())) {
            return wwa.in().Sg();
        }
        if (TextUtils.isEmpty(wwa.zG())) {
            return !TextUtils.isEmpty(wwa.Hjb()) ? wwa.Hjb() : "";
        }
        return wwa.zG();
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.Sg.Sg sg2) {
        this.YoT = sg2;
    }

    private void YFl(PAGMediaView pAGMediaView) {
        if (pAGMediaView == null) {
            return;
        }
        try {
            pAGMediaView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        } catch (Exception unused) {
        }
    }

    private PAGMediaView YFl(final View view) {
        int i10;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        qO qOVar = this.NjR;
        if (qOVar != null) {
            qOVar.setClickListener(null);
            this.NjR.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.Sg.Sg sg2 = this.YoT;
        if (sg2 != null && (sg2 instanceof NjR) && (view instanceof qO)) {
            ((qO) view).setClickListener((NjR) sg2);
        }
        com.bytedance.sdk.openadsdk.core.Sg.YFl yFl = this.eT;
        if (yFl != null && (yFl instanceof com.bytedance.sdk.openadsdk.core.qsH.qsH) && (view instanceof qO)) {
            ((qO) view).setClickCreativeListener((com.bytedance.sdk.openadsdk.core.qsH.qsH) yFl);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.Sg) { // from class: com.bytedance.sdk.openadsdk.YFl.Sg.YFl.3
            private void YFl(boolean z10) {
                int i11;
                Integer num = this.YFl;
                if (num != null) {
                    com.bytedance.sdk.openadsdk.VOe.YFl.Sg YFl = com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(num);
                    if (z10) {
                        i11 = 4;
                    } else {
                        i11 = 8;
                    }
                    com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(YFl, i11);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.tN.YFl(this, YFl.this.YFl);
            }

            @Override // android.view.View
            public void onWindowFocusChanged(boolean z10) {
                super.onWindowFocusChanged(z10);
                if (!(view instanceof qO)) {
                    YFl(z10);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                YFl.this.YFl(pAGVideoAdListener);
            }
        };
        int i11 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i11 = layoutParams.width;
            i10 = layoutParams.height;
        } else {
            i10 = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i11, i10);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof qO) {
            this.NjR = (qO) view;
        }
        return pAGMediaView;
    }

    public void YFl(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.YFl.Sg.YFl.tN tNVar;
        if (this.YFl.Ne() == 2 && Wwa.wN(this.YFl) && (tNVar = this.DSW) != null && (tNVar instanceof com.bytedance.sdk.openadsdk.YFl.Sg.YFl.Sg)) {
            com.bytedance.sdk.openadsdk.core.qsH.Wwa wwa = (com.bytedance.sdk.openadsdk.core.qsH.Wwa) tNVar.AlY();
            if (wwa != null) {
                wwa.setVideoAdListener(Sg(pAGVideoAdListener));
                return;
            }
            return;
        }
        Sg sg2 = this.f10524vc;
        if (sg2 != null) {
            sg2.YFl(Sg(pAGVideoAdListener));
        }
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.YoT.vc vcVar) {
        this.pDU = new WeakReference<>(vcVar);
    }
}
