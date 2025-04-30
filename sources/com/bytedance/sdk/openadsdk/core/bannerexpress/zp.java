package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.ku.ku;
import com.bytedance.sdk.component.utils.RCv;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.FP;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.Lij;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.nativeexpress.COT;
import com.bytedance.sdk.openadsdk.core.nativeexpress.HWF;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.QR;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.UPs;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.com.bytedance.overseas.sdk.zp.jU;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp extends PAGBannerAd implements RCv.zp {
    private com.bytedance.sdk.openadsdk.dislike.lMd Bj;
    TTDislikeDialogAbstract COT;
    private boolean FP;
    protected woN KS;
    private boolean KVG;
    private final boolean QR;
    private int YW;
    protected AdSlot jU;
    private PAGBannerAdWrapperListener ku;
    protected final Context lMd;
    private NativeExpressView pvr;
    private FP.zp rV;
    private RCv tG;
    private com.com.bytedance.overseas.sdk.zp.KS vDp;
    private boolean woN;
    protected BannerExpressView zp;
    private int dT = 0;
    private final Queue<Long> dQp = new LinkedList();
    private String vwr = "banner_ad";
    private final AtomicBoolean cz = new AtomicBoolean(false);
    protected final View.OnAttachStateChangeListener HWF = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.zp.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (!zp.this.FP) {
                zp zpVar = zp.this;
                zpVar.zp(zpVar.zp.getCurView(), zp.this.KS);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            zp.this.zp.KS();
        }
    };

    /* loaded from: classes.dex */
    public static class lMd extends ku {
        WeakReference<zp> KS;
        woN lMd;
        boolean zp;

        public lMd(boolean z8, woN won, zp zpVar) {
            super("ReportWindowFocusChangedAdShow");
            this.zp = z8;
            this.lMd = won;
            this.KS = new WeakReference<>(zpVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<zp> weakReference = this.KS;
            if (weakReference != null && weakReference.get() != null) {
                this.KS.get().lMd(this.zp, this.lMd);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.bannerexpress.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0106zp {
        void zp();
    }

    public zp(Context context, woN won, AdSlot adSlot) {
        this.lMd = context;
        this.KS = won;
        this.jU = adSlot;
        zp(context, won, adSlot);
        this.QR = false;
        this.FP = false;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        BannerExpressView bannerExpressView = this.zp;
        if (bannerExpressView != null) {
            try {
                bannerExpressView.KS();
                this.zp.removeOnAttachStateChangeListener(this.HWF);
            } catch (Throwable unused) {
            }
        }
        COT();
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public View getBannerView() {
        com.bytedance.sdk.openadsdk.utils.lMd.zp(this.KS);
        return this.zp;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        woN won = this.KS;
        if (won != null) {
            return won.zpV();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d2, String str, String str2) {
        if (!this.woN) {
            com.bytedance.sdk.openadsdk.utils.RCv.zp(this.KS, d2, str, str2);
            this.woN = true;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        com.bytedance.sdk.openadsdk.core.bannerexpress.lMd lmd = new com.bytedance.sdk.openadsdk.core.bannerexpress.lMd(pAGBannerAdInteractionCallback);
        this.ku = lmd;
        this.zp.setExpressInteractionListener(lmd);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        com.bytedance.sdk.openadsdk.core.bannerexpress.lMd lmd = new com.bytedance.sdk.openadsdk.core.bannerexpress.lMd(pAGBannerAdInteractionListener);
        this.ku = lmd;
        this.zp.setExpressInteractionListener(lmd);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d2) {
        if (!this.KVG) {
            com.bytedance.sdk.openadsdk.utils.RCv.zp(this.KS, d2);
            this.KVG = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void COT() {
        RCv rCv = this.tG;
        if (rCv != null) {
            rCv.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HWF() {
        RCv rCv = this.tG;
        if (rCv != null) {
            rCv.removeCallbacksAndMessages(null);
            this.tG.sendEmptyMessageDelayed(112202, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KS() {
        lMd();
        HWF();
    }

    private void jU() {
        COT.zp(this.lMd).zp(this.jU, 1, null, new COT.zp() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.zp.6
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.COT.zp
            public void zp(List<woN> list) {
                if (list == null || list.isEmpty()) {
                    zp.this.HWF();
                    return;
                }
                woN won = list.get(0);
                zp zpVar = zp.this;
                zpVar.zp.zp(won, zpVar.jU);
                zp.this.KS(won);
                zp.this.zp.jU();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.COT.zp
            public void zp() {
                zp.this.HWF();
            }
        }, 5000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(boolean z8, woN won) {
        Long poll;
        try {
            if (z8) {
                this.dQp.offer(Long.valueOf(System.currentTimeMillis()));
            } else {
                if (this.dQp.size() <= 0 || this.pvr == null || (poll = this.dQp.poll()) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.lMd.KS.zp(String.valueOf(System.currentTimeMillis() - poll.longValue()), won, this.vwr, this.pvr.getAdShowTime());
            }
        } catch (Exception e4) {
            tG.zp("PAGBannerAdImpl", e4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KS(@NonNull woN won) {
        if (this.zp.getNextView() == null || !this.zp.HWF()) {
            return;
        }
        lMd(this.zp.getNextView(), won);
        zp(this.zp.getNextView(), won);
    }

    public void zp(Context context, woN won, AdSlot adSlot) {
        BannerExpressView bannerExpressView = new BannerExpressView(context, won, adSlot);
        this.zp = bannerExpressView;
        bannerExpressView.addOnAttachStateChangeListener(this.HWF);
    }

    private void lMd(woN won) {
        Queue<Long> queue = this.dQp;
        if (queue == null || queue.size() <= 0 || won == null) {
            return;
        }
        try {
            long longValue = this.dQp.poll().longValue();
            if (longValue <= 0 || this.pvr == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.lMd.KS.zp(String.valueOf(System.currentTimeMillis() - longValue), won, this.vwr, this.pvr.getAdShowTime());
        } catch (Exception e4) {
            tG.zp("PAGBannerAdImpl", e4.getMessage());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void zp(@NonNull final NativeExpressView nativeExpressView, @NonNull final woN won) {
        final EmptyView emptyView;
        if (nativeExpressView == null || won == null) {
            return;
        }
        this.KS = won;
        this.vDp = zp(won);
        this.pvr = nativeExpressView;
        final String zp = com.bytedance.sdk.openadsdk.utils.FP.zp();
        final InterfaceC0106zp zp2 = zp();
        nativeExpressView.setClosedListenerKey(zp);
        nativeExpressView.setBannerClickClosedListener(zp2);
        nativeExpressView.setBackupListener(new com.bytedance.sdk.component.adexpress.lMd.KS() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.zp.2
            @Override // com.bytedance.sdk.component.adexpress.lMd.KS
            public boolean zp(ViewGroup viewGroup, int i9) {
                try {
                    nativeExpressView.vDp();
                    if (zp.this.KS.Fm()) {
                        VastBannerBackupView vastBannerBackupView = new VastBannerBackupView(nativeExpressView.getContext());
                        vastBannerBackupView.setClosedListenerKey(zp);
                        zp zpVar = zp.this;
                        vastBannerBackupView.zp(zpVar.KS, nativeExpressView, zpVar.vDp);
                        vastBannerBackupView.setDislikeInner(zp.this.Bj);
                        vastBannerBackupView.setDislikeOuter(zp.this.COT);
                        vastBannerBackupView.setAdInteractionListener(zp.this.ku);
                        nativeExpressView.setVastVideoHelper(vastBannerBackupView);
                        return true;
                    }
                    BannerExpressBackupView bannerExpressBackupView = new BannerExpressBackupView(nativeExpressView.getContext());
                    bannerExpressBackupView.setClosedListenerKey(zp);
                    zp zpVar2 = zp.this;
                    bannerExpressBackupView.zp(zpVar2.KS, nativeExpressView, zpVar2.vDp);
                    bannerExpressBackupView.setDislikeInner(zp.this.Bj);
                    bannerExpressBackupView.setDislikeOuter(zp.this.COT);
                    bannerExpressBackupView.setAdInteractionListener(zp.this.ku);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        if (!this.QR) {
            EmptyView zp3 = zp(nativeExpressView);
            if (zp3 == null) {
                zp3 = new EmptyView(this.lMd, nativeExpressView);
                nativeExpressView.addView(zp3);
            }
            emptyView = zp3;
            emptyView.setCallback(new EmptyView.zp() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.zp.3
                @Override // com.bytedance.sdk.openadsdk.core.EmptyView.zp
                public void lMd() {
                    zp.this.zp(emptyView, false, won);
                }

                @Override // com.bytedance.sdk.openadsdk.core.EmptyView.zp
                public void zp(boolean z8) {
                    zp.this.zp(z8, won);
                }

                @Override // com.bytedance.sdk.openadsdk.core.EmptyView.zp
                public void zp() {
                    zp.this.KS();
                }

                @Override // com.bytedance.sdk.openadsdk.core.EmptyView.zp
                public void zp(View view) {
                    if (zp.this.cz.compareAndSet(false, true)) {
                        zp.this.zp(view, nativeExpressView, won, zp, zp2);
                    }
                }
            });
        } else {
            UPs.zp(nativeExpressView, true, 1, new UPs.lMd() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.zp.4
                @Override // com.bytedance.sdk.openadsdk.utils.UPs.lMd
                public void lMd() {
                    zp.this.zp((EmptyView) null, true, won);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.UPs.lMd
                public void zp(boolean z8) {
                    zp.this.zp(z8, won);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.UPs.lMd
                public void zp() {
                    zp.this.KS();
                }

                @Override // com.bytedance.sdk.openadsdk.utils.UPs.lMd
                public void zp(View view, boolean z8) {
                    if (z8 && zp.this.cz.compareAndSet(false, true)) {
                        zp.this.zp(view, nativeExpressView, won, zp, zp2);
                    }
                }
            }, null);
            emptyView = null;
        }
        Context zp4 = com.bytedance.sdk.component.utils.lMd.zp(nativeExpressView);
        if (zp4 == null) {
            zp4 = this.lMd;
        }
        QR qr = new QR(zp4, won, this.vwr, 2);
        qr.zp(nativeExpressView);
        qr.zp(this);
        qr.zp(this.vDp);
        nativeExpressView.setClickListener(qr);
        HWF hwf = new HWF(this.lMd, won, this.vwr, 2);
        hwf.zp((View) nativeExpressView);
        hwf.zp(this);
        NativeExpressView nativeExpressView2 = this.pvr;
        if (nativeExpressView2 instanceof NativeExpressVideoView) {
            hwf.zp(((NativeExpressVideoView) nativeExpressView2).getVideoController());
        }
        hwf.zp(this.vDp);
        nativeExpressView.setClickCreativeListener(hwf);
        if (this.QR) {
            return;
        }
        emptyView.setNeedCheckingShow(true);
    }

    private void lMd(@NonNull NativeExpressView nativeExpressView, @NonNull woN won) {
        if (nativeExpressView == null || won == null) {
            return;
        }
        if (this.rV != null) {
            this.Bj.zp(won.GP(), won.sqt());
            nativeExpressView.setDislike(this.Bj);
        }
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.COT;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.setMaterialMeta(won.GP(), won.sqt());
            nativeExpressView.setOuterDislike(this.COT);
        }
    }

    public void lMd() {
        this.KS.zp(SystemClock.elapsedRealtime());
        this.zp.lMd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(boolean z8, woN won) {
        if (z8) {
            if (this.KS.IhO() && !this.KS.Oza()) {
                this.KS.QR(true);
                woN won2 = this.KS;
                com.bytedance.sdk.openadsdk.lMd.KS.zp(won2, this.vwr, won2.ITK());
            }
            HWF();
        } else {
            COT();
        }
        QUv.lMd(new lMd(z8, won, this), 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(EmptyView emptyView, boolean z8, woN won) {
        BannerExpressView bannerExpressView = this.zp;
        if (bannerExpressView != null) {
            if (!z8 && emptyView != null && emptyView == zp(bannerExpressView.getCurView())) {
                COT();
            } else if (z8) {
                COT();
            }
        }
        lMd(won);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(View view, NativeExpressView nativeExpressView, woN won, String str, InterfaceC0106zp interfaceC0106zp) {
        com.bytedance.sdk.openadsdk.core.ku.lMd().zp(str, interfaceC0106zp);
        Queue<Long> queue = this.dQp;
        if (queue != null) {
            queue.offer(Long.valueOf(System.currentTimeMillis()));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (nativeExpressView != null) {
                jSONObject.put("dynamic_show_type", nativeExpressView.getDynamicShowType());
                nativeExpressView.zp(jSONObject, won);
            }
            if (view != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("width", view.getWidth());
                    jSONObject2.put("height", view.getHeight());
                    jSONObject2.put("alpha", view.getAlpha());
                } catch (Throwable unused) {
                }
                jSONObject.put("root_view", jSONObject2.toString());
            }
            com.bytedance.sdk.openadsdk.lMd.KS.zp(won, this.vwr, jSONObject);
        } catch (JSONException unused2) {
            tG.zp("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.ku;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, won.oKZ());
        }
        if (won.YcG()) {
            YhE.zp(won, view);
        }
        HWF();
        BannerExpressView bannerExpressView = this.zp;
        if (bannerExpressView == null || bannerExpressView.getCurView() == null) {
            return;
        }
        this.zp.getCurView().dT();
        this.zp.getCurView().ku();
    }

    private com.com.bytedance.overseas.sdk.zp.KS zp(woN won) {
        if (won.oKZ() == 4) {
            return jU.zp(this.lMd, won, this.vwr);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EmptyView zp(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            try {
                View childAt = viewGroup.getChildAt(i9);
                if (childAt instanceof EmptyView) {
                    return (EmptyView) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public InterfaceC0106zp zp() {
        return new InterfaceC0106zp() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.zp.5
            @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.zp.InterfaceC0106zp
            public void zp() {
                EmptyView emptyView;
                int width = zp.this.pvr.getWidth();
                int height = zp.this.pvr.getHeight();
                View zp = zp(((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d));
                zp.this.pvr.rV();
                if (zp.this.QR) {
                    emptyView = null;
                } else {
                    zp zpVar = zp.this;
                    emptyView = zpVar.zp(zpVar.pvr);
                }
                zp.this.pvr.removeAllViews();
                zp.this.pvr.addView(zp, new ViewGroup.LayoutParams(width, height));
                zp.this.pvr.setClickCreativeListener(null);
                zp.this.pvr.setClickListener(null);
                if (KVG.jU().YhE() == 1) {
                    zp.this.COT();
                } else if (zp.this.YW != 0 && !zp.this.QR && emptyView != null) {
                    zp.this.pvr.addView(emptyView);
                }
                if (zp.this.ku != null) {
                    zp.this.ku.onAdDismissed();
                }
                zp.this.FP = true;
            }

            private View zp(boolean z8) {
                PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(zp.this.lMd);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                pAGFrameLayout.setBackgroundColor(-1);
                pAGFrameLayout.setLayoutParams(layoutParams);
                View view = new View(zp.this.lMd);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                view.setAlpha(0.3f);
                view.setBackgroundColor(Color.parseColor("#F3F7F8"));
                pAGFrameLayout.addView(view, layoutParams2);
                PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(zp.this.lMd);
                ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                if (z8) {
                    pAGFrameLayout2.setBackground(cz.KS(zp.this.lMd, "tt_ad_closed_background_300_250"));
                } else {
                    pAGFrameLayout2.setBackground(cz.KS(zp.this.lMd, "tt_ad_closed_background_320_50"));
                }
                pAGFrameLayout.addView(pAGFrameLayout2, layoutParams3);
                PAGImageView pAGImageView = new PAGImageView(zp.this.lMd);
                pAGImageView.setId(520093739);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                if (z8) {
                    int lMd2 = WNy.lMd(zp.this.lMd, 16.0f);
                    layoutParams4.width = WNy.lMd(zp.this.lMd, 77.0f);
                    layoutParams4.height = WNy.lMd(zp.this.lMd, 14.0f);
                    layoutParams4.leftMargin = lMd2;
                    layoutParams4.topMargin = lMd2;
                } else {
                    int lMd3 = WNy.lMd(zp.this.lMd, 8.0f);
                    layoutParams4.width = WNy.lMd(zp.this.lMd, 45.0f);
                    layoutParams4.height = WNy.lMd(zp.this.lMd, 8.18f);
                    layoutParams4.leftMargin = lMd3;
                    layoutParams4.topMargin = lMd3;
                }
                pAGImageView.setImageResource(cz.jU(zp.this.lMd, "tt_ad_closed_logo_red"));
                pAGFrameLayout2.addView(pAGImageView, layoutParams4);
                PAGTextView pAGTextView = new PAGTextView(zp.this.lMd);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                pAGTextView.setAlpha(0.5f);
                pAGTextView.setLines(1);
                pAGTextView.setText(cz.zp(zp.this.lMd, "tt_ad_is_closed"));
                if (z8) {
                    pAGTextView.setTextSize(18.0f);
                } else {
                    pAGTextView.setTextSize(12.0f);
                }
                pAGFrameLayout2.addView(pAGTextView, layoutParams5);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.zp.5.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        zp zpVar = zp.this;
                        TTWebsiteActivity.zp(zpVar.lMd, zpVar.KS, zpVar.vwr);
                    }
                };
                pAGImageView.setOnClickListener(onClickListener);
                pAGTextView.setOnClickListener(onClickListener);
                return pAGFrameLayout;
            }
        };
    }

    @Override // com.bytedance.sdk.component.utils.RCv.zp
    public void zp(Message message) {
        if (message.what == 112202) {
            if (Lij.zp(this.zp, 50, 1)) {
                this.dT += 1000;
            }
            if (this.dT >= this.YW) {
                jU();
                AdSlot adSlot = this.jU;
                adSlot.setRotateOrder(adSlot.getRotateOrder() + 1);
                this.dT = 0;
                COT();
                return;
            }
            HWF();
        }
    }
}
