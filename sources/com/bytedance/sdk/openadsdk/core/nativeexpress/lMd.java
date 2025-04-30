package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.FP;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class lMd {
    private NativeExpressView COT;
    private int HWF;
    private zp KS;
    private int QR;
    private com.bytedance.sdk.component.adexpress.lMd.dQp jU;
    private ScheduledFuture<?> ku;
    private final Context lMd;
    com.bytedance.sdk.openadsdk.core.model.woN zp;

    /* loaded from: classes.dex */
    public interface KS {
        void lMd(String str);

        void zp();

        void zp(int i9, int i10);

        void zp(String str);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.lMd$lMd, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0112lMd implements Runnable {
        KS zp;

        public RunnableC0112lMd(KS ks) {
            this.zp = ks;
        }

        @Override // java.lang.Runnable
        public void run() {
            KS ks = this.zp;
            if (ks != null) {
                ks.zp(107, 107);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class zp implements com.bytedance.sdk.component.adexpress.lMd.jU<View>, DspHtmlWebView.lMd {
        private final int Bj;
        private String COT;
        private final Context HWF;
        private com.bytedance.sdk.openadsdk.dislike.lMd KS;
        private final int QR;
        private FrameLayout YW;
        private PAGExpressAdWrapperListener dQp;
        private com.bytedance.sdk.openadsdk.core.model.woN dT;
        private TTDislikeDialogAbstract jU;
        private final int ku;
        WeakReference<View> lMd;
        private com.bytedance.sdk.component.adexpress.lMd.QR rV;
        private DspHtmlWebView tG;
        private String vDp;
        AtomicBoolean zp = new AtomicBoolean(false);

        public zp(Context context, com.bytedance.sdk.openadsdk.core.model.woN won, int i9, int i10, String str) {
            this.vDp = str;
            if (won != null && won.slc()) {
                this.vDp = "fullscreen_interstitial_ad";
            }
            this.HWF = context;
            this.QR = i9;
            this.ku = i10;
            this.dT = won;
            this.Bj = WNy.lMd(context, 3.0f);
            QR();
        }

        private void QR() {
            FrameLayout frameLayout = new FrameLayout(this.HWF);
            this.YW = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.QR, this.ku);
            }
            layoutParams.width = this.QR;
            layoutParams.height = this.ku;
            layoutParams.gravity = 17;
            this.YW.setLayoutParams(layoutParams);
            DspHtmlWebView dT = dT();
            this.YW.addView(dT);
            View ku = ku();
            this.YW.addView(ku);
            com.bytedance.sdk.openadsdk.core.model.woN won = this.dT;
            if (won != null && won.slc()) {
                dT.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                this.lMd = new WeakReference<>(((Activity) this.HWF).findViewById(520093713));
                dT.zp(((Activity) this.HWF).findViewById(com.bytedance.sdk.openadsdk.utils.vDp.mfu), FriendlyObstructionPurpose.OTHER);
            } else {
                ImageView YW = YW();
                this.YW.addView(YW);
                this.lMd = new WeakReference<>(YW);
                dT.zp(YW, FriendlyObstructionPurpose.CLOSE_AD);
            }
            dT.zp(ku, FriendlyObstructionPurpose.OTHER);
        }

        private ImageView YW() {
            PAGImageView pAGImageView = new PAGImageView(this.HWF);
            pAGImageView.setImageDrawable(this.HWF.getResources().getDrawable(cz.jU(this.HWF, "tt_dislike_icon2")));
            int lMd = WNy.lMd(this.HWF, 15.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(lMd, lMd);
            layoutParams.gravity = 8388613;
            int i9 = this.Bj;
            layoutParams.rightMargin = i9;
            layoutParams.topMargin = i9;
            pAGImageView.setLayoutParams(layoutParams);
            pAGImageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.lMd.zp.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    zp.this.HWF();
                }
            });
            return pAGImageView;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        private DspHtmlWebView dT() {
            DspHtmlWebView lMd = com.bytedance.sdk.openadsdk.core.nativeexpress.KS.zp().lMd();
            this.tG = lMd;
            if (lMd == null) {
                this.tG = new DspHtmlWebView(this.HWF);
            }
            com.bytedance.sdk.openadsdk.core.nativeexpress.KS.zp().KS(this.tG);
            this.tG.zp(this.dT, this, this.vDp);
            this.tG.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.tG;
        }

        private View ku() {
            PAGLogoView pAGLogoView = new PAGLogoView(this.HWF);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            com.bytedance.sdk.openadsdk.core.model.woN won = this.dT;
            if (won != null && won.slc()) {
                layoutParams.leftMargin = WNy.lMd(this.HWF, 20.0f);
                layoutParams.bottomMargin = WNy.lMd(this.HWF, 20.0f);
                layoutParams.gravity = 8388691;
            } else {
                int i9 = this.Bj;
                layoutParams.topMargin = i9;
                layoutParams.leftMargin = i9;
            }
            pAGLogoView.setLayoutParams(layoutParams);
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.lMd.zp.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTWebsiteActivity.zp(zp.this.HWF, zp.this.dT, zp.this.vDp);
                }
            });
            return pAGLogoView;
        }

        @Override // com.bytedance.sdk.component.adexpress.lMd.jU
        public View COT() {
            return this.YW;
        }

        public void HWF() {
            TTDislikeDialogAbstract tTDislikeDialogAbstract = this.jU;
            if (tTDislikeDialogAbstract != null) {
                tTDislikeDialogAbstract.show();
                return;
            }
            com.bytedance.sdk.openadsdk.dislike.lMd lmd = this.KS;
            if (lmd != null) {
                lmd.zp();
            } else {
                TTDelegateActivity.zp(this.dT, this.COT);
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.lMd.jU
        public int KS() {
            return 5;
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.lMd
        @SuppressLint({"ClickableViewAccessibility"})
        public void c_() {
            if (this.rV != null) {
                com.bytedance.sdk.component.adexpress.lMd.rV rVVar = new com.bytedance.sdk.component.adexpress.lMd.rV();
                rVVar.zp(true);
                rVVar.zp(WNy.KS(this.HWF, this.QR));
                rVVar.lMd(WNy.KS(this.HWF, this.ku));
                this.rV.zp(this.YW, rVVar);
            }
        }

        public void jU() {
            this.YW = null;
            this.KS = null;
            this.jU = null;
            this.rV = null;
            this.dT = null;
            DspHtmlWebView dspHtmlWebView = this.tG;
            if (dspHtmlWebView != null) {
                dspHtmlWebView.vDp();
                com.bytedance.sdk.openadsdk.core.nativeexpress.KS.zp().zp(this.tG);
            }
            this.zp.set(true);
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.lMd
        public View lMd() {
            FrameLayout frameLayout = this.YW;
            if (frameLayout == null) {
                return null;
            }
            return (View) frameLayout.getParent();
        }

        @Override // com.bytedance.sdk.component.adexpress.lMd.jU
        public void zp(com.bytedance.sdk.component.adexpress.lMd.QR qr) {
            com.bytedance.sdk.openadsdk.core.model.woN won;
            if (this.zp.get()) {
                return;
            }
            if (this.HWF != null && (won = this.dT) != null) {
                this.rV = qr;
                if (TextUtils.isEmpty(won.HaA())) {
                    qr.zp(106, "dsp data is null");
                    return;
                } else {
                    this.tG.KVG();
                    return;
                }
            }
            qr.zp(106, "material null");
        }

        public void zp(FP fp) {
            if (fp instanceof com.bytedance.sdk.openadsdk.dislike.lMd) {
                this.KS = (com.bytedance.sdk.openadsdk.dislike.lMd) fp;
            }
        }

        public void zp(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            com.bytedance.sdk.openadsdk.core.model.woN won;
            if (tTDislikeDialogAbstract != null && (won = this.dT) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(won.GP(), this.dT.sqt());
            }
            this.jU = tTDislikeDialogAbstract;
        }

        public void zp(String str) {
            this.COT = str;
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.lMd
        public View zp() {
            WeakReference<View> weakReference = this.lMd;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.lMd
        public void zp(View view, int i9) {
            PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.dQp;
            if (pAGExpressAdWrapperListener != null) {
                pAGExpressAdWrapperListener.onAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.lMd
        public void zp(int i9, int i10) {
            com.bytedance.sdk.component.adexpress.lMd.QR qr = this.rV;
            if (qr != null) {
                qr.zp(i9, "render fail");
            }
        }

        public void zp(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
            this.dQp = pAGExpressAdWrapperListener;
        }
    }

    public lMd(Context context, NativeExpressView nativeExpressView, com.bytedance.sdk.openadsdk.core.model.woN won, String str) {
        this.zp = won;
        this.lMd = context;
        this.COT = nativeExpressView;
        zp(nativeExpressView);
        this.KS = new zp(context, won, this.HWF, this.QR, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KS() {
        try {
            ScheduledFuture<?> scheduledFuture = this.ku;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.ku.cancel(false);
            this.ku = null;
        } catch (Throwable unused) {
        }
    }

    private void zp(NativeExpressView nativeExpressView) {
        com.bytedance.sdk.openadsdk.core.model.woN won = this.zp;
        if (won != null && won.slc()) {
            this.HWF = -1;
            this.QR = -1;
            return;
        }
        tG zp2 = BannerExpressBackupView.zp(nativeExpressView.getExpectExpressWidth(), nativeExpressView.getExpectExpressHeight());
        if (nativeExpressView.getExpectExpressWidth() > 0 && nativeExpressView.getExpectExpressHeight() > 0) {
            this.HWF = WNy.lMd(this.lMd, nativeExpressView.getExpectExpressWidth());
            this.QR = WNy.lMd(this.lMd, nativeExpressView.getExpectExpressHeight());
        } else {
            int KS2 = WNy.KS(this.lMd);
            this.HWF = KS2;
            this.QR = Float.valueOf(KS2 / zp2.lMd).intValue();
        }
        int i9 = this.HWF;
        if (i9 <= 0 || i9 <= WNy.KS(this.lMd)) {
            return;
        }
        this.HWF = WNy.KS(this.lMd);
        this.QR = Float.valueOf(this.QR * (WNy.KS(this.lMd) / this.HWF)).intValue();
    }

    public void lMd() {
        zp zpVar = this.KS;
        if (zpVar != null) {
            zpVar.jU();
            this.KS = null;
        }
        KS();
        this.jU = null;
        this.COT = null;
    }

    public void zp(com.bytedance.sdk.component.adexpress.lMd.dQp dqp) {
        this.jU = dqp;
    }

    public void zp() {
        com.bytedance.sdk.openadsdk.core.model.woN won = this.zp;
        if (won != null && won.slc()) {
            this.ku = QUv.zp().schedule(new RunnableC0112lMd(this.KS.tG), com.bytedance.sdk.openadsdk.core.KVG.jU().irS(), TimeUnit.MILLISECONDS);
        }
        zp zpVar = this.KS;
        if (zpVar != null) {
            zpVar.zp(new com.bytedance.sdk.component.adexpress.lMd.QR() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.lMd.1
                @Override // com.bytedance.sdk.component.adexpress.lMd.QR
                public void zp(View view, com.bytedance.sdk.component.adexpress.lMd.rV rVVar) {
                    if (lMd.this.COT == null || view == null) {
                        if (lMd.this.jU != null) {
                            lMd.this.jU.a_(106);
                        }
                    } else if (lMd.this.jU != null) {
                        lMd.this.jU.zp(lMd.this.KS, rVVar);
                    }
                    lMd.this.KS();
                }

                @Override // com.bytedance.sdk.component.adexpress.lMd.QR
                public void zp(int i9, String str) {
                    if (lMd.this.jU != null) {
                        lMd.this.jU.a_(106);
                    }
                    lMd.this.KS();
                }
            });
            View COT = this.KS.COT();
            this.COT.removeView(COT);
            if (COT.getParent() != null) {
                ((ViewGroup) COT.getParent()).removeView(COT);
            }
            this.COT.addView(COT, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        com.bytedance.sdk.component.adexpress.lMd.dQp dqp = this.jU;
        if (dqp != null) {
            dqp.a_(106);
        }
    }

    public void zp(FP fp) {
        zp zpVar = this.KS;
        if (zpVar != null) {
            zpVar.zp(fp);
        }
    }

    public void zp(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        zp zpVar = this.KS;
        if (zpVar != null) {
            zpVar.zp(tTDislikeDialogAbstract);
        }
    }

    public void zp(String str) {
        zp zpVar = this.KS;
        if (zpVar != null) {
            zpVar.zp(str);
        }
    }

    public void zp(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        zp zpVar = this.KS;
        if (zpVar != null) {
            zpVar.zp(pAGExpressAdWrapperListener);
        }
    }
}
