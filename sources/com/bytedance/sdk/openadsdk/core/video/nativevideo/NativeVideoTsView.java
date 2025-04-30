package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.component.video.api.jU.KS;
import com.bytedance.sdk.component.utils.RCv;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.Lij;
import com.bytedance.sdk.openadsdk.core.QR.HWF;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.ku;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.tG;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.KS;
import com.bytedance.sdk.openadsdk.lMd.QR;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.dQp;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class NativeVideoTsView extends PAGFrameLayout implements KS.zp, RCv.zp, KS.zp {
    private static final Integer FP = 0;
    private static final Integer ot = 1;
    private final Runnable BO;
    protected boolean Bj;
    public boolean COT;
    private boolean Gzh;
    public QR HWF;
    private boolean Iv;
    protected FrameLayout KS;
    private final Context KVG;
    private boolean Lij;
    private ViewTreeObserver.OnGlobalLayoutListener Pxi;
    protected RelativeLayout QR;
    private final boolean QUv;
    private boolean RCv;
    private final ViewTreeObserver.OnScrollChangedListener Rg;
    private boolean UPs;
    private long WNy;
    protected ImageView YW;
    private boolean YhE;
    private final AtomicBoolean aax;
    private final Handler cW;
    private String cz;
    public lMd dQp;
    protected ImageView dT;
    private KS.InterfaceC0050KS eWG;
    private final String fRl;
    private View ffE;
    private long irS;
    protected boolean jU;
    protected ImageView ku;
    protected com.bykv.vk.openvk.component.video.api.jU.KS lMd;
    private final AtomicBoolean oKZ;
    private boolean ox;
    private boolean pvr;
    boolean rV;
    protected int tG;
    protected String vDp;
    private boolean vwr;
    private ViewGroup woN;
    private String yRU;
    protected final woN zp;

    /* loaded from: classes.dex */
    public interface lMd {
        void zp(boolean z8, long j7, long j9, long j10, boolean z9);
    }

    /* loaded from: classes.dex */
    public interface zp {
        void zp(View view, int i9);
    }

    public NativeVideoTsView(@NonNull Context context, @NonNull woN won, boolean z8, QR qr) {
        this(context, won, z8, "embeded_ad", false, false, qr);
    }

    private void COT() {
        addView(zp(this.KVG));
        vwr();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                NativeVideoTsView.this.woN();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                NativeVideoTsView.this.woN();
            }
        });
    }

    private void FP() {
        this.dQp = null;
        if ((this.lMd instanceof KS) && !YhE()) {
            ((KS) this.lMd).WNy();
        }
        dT();
        zp(false);
        ot();
    }

    private void Gzh() {
        this.cW.removeMessages(1);
        tG.KS().removeCallbacks(this.BO);
    }

    private void Lij() {
        if (!YhE() && ox()) {
            Boolean bool = Boolean.FALSE;
            com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
            com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_native_video_data", "key_video_is_from_detail_page", bool);
        }
    }

    private boolean QUv() {
        if (2 == KVG.jU().lMd(this.zp.FGx())) {
            return true;
        }
        return false;
    }

    private boolean RCv() {
        if (YhE() || !ox()) {
            return false;
        }
        boolean zp2 = com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
        if (!com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_native_video_data", "key_video_is_from_detail_page", false) && !zp2) {
            return false;
        }
        return true;
    }

    private void WNy() {
        WNy.COT(this.YW);
        WNy.COT(this.QR);
    }

    private boolean YhE() {
        return this.pvr;
    }

    private boolean cW() {
        if (5 == KVG.jU().lMd(this.zp.FGx())) {
            return true;
        }
        return false;
    }

    private void cz() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.lMd;
        if (ks == null) {
            vwr();
        } else if ((ks instanceof KS) && !YhE()) {
            ((KS) this.lMd).vwr();
        }
        if (this.lMd != null && this.oKZ.get()) {
            this.oKZ.set(false);
            lMd();
            if (ku()) {
                WNy.zp((View) this.QR, 8);
                ImageView imageView = this.YW;
                if (imageView != null) {
                    WNy.zp((View) imageView, 8);
                }
                woN won = this.zp;
                if (won != null && won.eWG() != null) {
                    com.bytedance.sdk.openadsdk.core.video.zp.lMd zp2 = woN.zp(CacheDirFactory.getICacheDir(this.zp.jyq()).KS(), this.zp);
                    zp2.lMd(this.zp.fgJ());
                    zp2.zp(this.woN.getWidth());
                    zp2.lMd(this.woN.getHeight());
                    zp2.KS(this.zp.GP());
                    zp2.zp(0L);
                    zp2.zp(YW());
                    zp(zp2);
                    this.lMd.zp(zp2);
                    this.lMd.KS(false);
                    return;
                }
                com.bytedance.sdk.component.utils.tG.zp("NativeVideoTsView", "attachTask materialMeta.getVideo() is null !!");
                return;
            }
            if (this.lMd.dQp()) {
                this.lMd.dQp();
                lMd(true);
            } else {
                QR();
                WNy.zp((View) this.QR, 0);
            }
        }
    }

    private void irS() {
        if (this.lMd != null && !YhE()) {
            boolean z8 = false;
            if (!ox() || com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_native_video_data", "key_video_is_update_flag", false)) {
                long HWF = this.lMd.HWF() + this.lMd.ku();
                long ku = this.lMd.ku();
                long j7 = 0;
                if (ox()) {
                    z8 = com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_native_video_data", "key_native_video_complete", false);
                    j7 = com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_native_video_data", "key_video_current_play_position", 0L);
                    HWF = com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_native_video_data", "key_video_total_play_duration", this.lMd.HWF() + this.lMd.ku());
                    ku = com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_native_video_data", "key_video_duration", this.lMd.ku());
                    com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
                    this.lMd.KS(z8);
                    this.lMd.zp(j7);
                    this.lMd.lMd(HWF);
                    this.lMd.KS(ku);
                }
                com.bytedance.sdk.component.utils.tG.zp("MultiProcess", "onResumeFeedNativeVideoControllerData-isComplete=" + z8 + ",position=" + j7 + ",totalPlayDuration=" + HWF + ",duration=" + ku);
            }
        }
    }

    private void jU() {
        zp(0L, 0);
        this.eWG = null;
    }

    private void ot() {
        if (!this.oKZ.get()) {
            this.oKZ.set(true);
            com.bykv.vk.openvk.component.video.api.jU.KS ks = this.lMd;
            if (ks != null) {
                ks.zp(true, 3);
            }
        }
        this.aax.set(false);
    }

    private boolean ox() {
        woN won = this.zp;
        if (won == null) {
            return false;
        }
        return won.ea();
    }

    private void pvr() {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.lMd;
        if (ks == null) {
            return;
        }
        ks.jU(this.vwr);
        ((KS) this.lMd).zp((KS.zp) this);
        this.lMd.zp(this);
    }

    private void vwr() {
        this.lMd = new KS(this.KVG, this.KS, this.zp, this.vDp, !YhE(), this.RCv, this.Lij, this.HWF);
        pvr();
        if (this.Pxi == null) {
            this.Pxi = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    NativeVideoTsView nativeVideoTsView;
                    com.bykv.vk.openvk.component.video.api.jU.KS ks;
                    if (NativeVideoTsView.this.woN != null && NativeVideoTsView.this.woN.getViewTreeObserver() != null && (ks = (nativeVideoTsView = NativeVideoTsView.this).lMd) != null) {
                        ((KS) ks).zp(nativeVideoTsView.woN.getWidth(), NativeVideoTsView.this.woN.getHeight());
                        NativeVideoTsView.this.woN.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        NativeVideoTsView.this.Pxi = null;
                    }
                }
            };
            this.woN.getViewTreeObserver().addOnGlobalLayoutListener(this.Pxi);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void woN() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = this.cW;
        if (handler != null && elapsedRealtime - this.WNy > 500) {
            this.WNy = elapsedRealtime;
            handler.sendEmptyMessageDelayed(1, 500L);
        }
    }

    private void yRU() {
        this.YhE = Bj();
        QUv.zp(this.BO);
    }

    public boolean Bj() {
        int i9;
        if (com.bytedance.sdk.openadsdk.core.nativeexpress.woN.lMd(this.vDp)) {
            i9 = 1;
        } else {
            i9 = 5;
        }
        return Lij.zp(this, 50, i9);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.KS.zp
    public void HWF() {
        KS.InterfaceC0050KS interfaceC0050KS = this.eWG;
        if (interfaceC0050KS != null) {
            interfaceC0050KS.b_();
        }
    }

    public void QR() {
        View view;
        if (this.KVG != null && (view = this.ffE) != null && view.getParent() != null && this.zp != null && this.QR == null) {
            ViewParent parent = this.ffE.getParent();
            RelativeLayout lMd2 = lMd(this.KVG);
            if (parent != null && (parent instanceof ViewGroup)) {
                zp(lMd2, (ViewGroup) parent, this.ffE);
            }
            this.QR = lMd2;
            if (this.Bj) {
                WNy.zp((View) this.dT, 0);
            }
            if (this.zp.eWG() != null && this.zp.eWG().dT() != null) {
                com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.zp.eWG().dT(), this.zp.eWG().KS(), this.zp.eWG().lMd(), this.ku, this.zp);
            }
            ImageView imageView = this.dT;
            if (imageView != null) {
                imageView.setClickable(true);
                this.dT.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        NativeVideoTsView.this.KS();
                    }
                });
            }
        }
    }

    public boolean YW() {
        return this.jU;
    }

    public void dQp() {
        woN won = this.zp;
        if (won != null && won.xg() != null) {
            this.zp.xg().dQp();
            this.zp.xg().zp().COT(this.irS);
        }
    }

    public void dT() {
        com.bykv.vk.openvk.component.video.api.jU.lMd tG;
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.lMd;
        if (ks != null && (tG = ks.tG()) != null) {
            tG.zp();
            View KS = tG.KS();
            if (KS != null) {
                KS.setVisibility(8);
                if (KS.getParent() != null) {
                    ((ViewGroup) KS.getParent()).removeView(KS);
                }
            }
        }
    }

    public double getCurrentPlayTime() {
        if (this.lMd != null) {
            return (r0.COT() * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }

    public com.bykv.vk.openvk.component.video.api.jU.KS getNativeVideoController() {
        return this.lMd;
    }

    public boolean ku() {
        return this.vwr;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
    public void lMd(long j7, int i9) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cz();
        getViewTreeObserver().addOnScrollChangedListener(this.Rg);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FP();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.Rg);
        }
        ViewGroup viewGroup = this.woN;
        if (viewGroup != null && this.Pxi != null) {
            ViewTreeObserver viewTreeObserver2 = viewGroup.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this.Pxi);
                this.Pxi = null;
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        cz();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        lMd lmd;
        com.bykv.vk.openvk.component.video.api.jU.KS ks;
        if (!this.pvr && (lmd = this.dQp) != null && (ks = this.lMd) != null) {
            lmd.zp(ks.dQp(), this.lMd.ku(), this.lMd.YW(), this.lMd.COT(), this.vwr);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        FP();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        com.bykv.vk.openvk.component.video.api.jU.KS ks;
        com.bykv.vk.openvk.component.video.api.jU.KS ks2;
        com.bykv.vk.openvk.component.video.api.jU.KS ks3;
        com.bykv.vk.openvk.component.video.api.jU.KS ks4;
        if (!"open_ad".equals(this.vDp)) {
            this.ox = z8;
            super.onWindowFocusChanged(z8);
            irS();
            if (RCv() && (ks4 = this.lMd) != null && ks4.dQp()) {
                Lij();
                WNy.zp((View) this.QR, 8);
                lMd(true);
                jU();
                return;
            }
            lMd();
            if (!YhE() && ku() && (ks2 = this.lMd) != null && !ks2.Bj()) {
                if (this.cW != null) {
                    if (z8 && (ks3 = this.lMd) != null && !ks3.dQp()) {
                        this.cW.obtainMessage(1).sendToTarget();
                        return;
                    } else {
                        Gzh();
                        zp(false, FP.intValue());
                        return;
                    }
                }
                return;
            }
            if (!ku()) {
                if (!z8 && (ks = this.lMd) != null && ks.vDp() != null && this.lMd.vDp().HWF()) {
                    Gzh();
                    zp(false, FP.intValue());
                    return;
                } else {
                    if (z8) {
                        this.cW.obtainMessage(1).sendToTarget();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        Gzh();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i9) {
        com.bykv.vk.openvk.component.video.api.jU.KS ks;
        woN won;
        com.bykv.vk.openvk.component.video.api.jU.KS ks2;
        com.bykv.vk.openvk.component.video.api.jU.KS ks3;
        boolean z8;
        super.onWindowVisibilityChanged(i9);
        irS();
        if (this.Iv) {
            if (i9 == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.Iv = z8;
        }
        if (RCv() && (ks3 = this.lMd) != null && ks3.dQp()) {
            Lij();
            WNy.zp((View) this.QR, 8);
            lMd(true);
            jU();
            return;
        }
        lMd();
        if (!YhE() && ku() && (ks = this.lMd) != null && !ks.Bj() && (won = this.zp) != null) {
            if (this.Gzh && won.eWG() != null) {
                this.zp.eWG();
                com.bytedance.sdk.openadsdk.core.video.zp.lMd zp2 = woN.zp(CacheDirFactory.getICacheDir(this.zp.jyq()).KS(), this.zp);
                zp2.lMd(this.zp.fgJ());
                zp2.zp(this.woN.getWidth());
                zp2.lMd(this.woN.getHeight());
                zp2.KS(this.zp.GP());
                zp2.zp(this.irS);
                zp2.zp(YW());
                zp(zp2);
                this.lMd.zp(zp2);
                this.Gzh = false;
                WNy.zp((View) this.QR, 8);
            } else {
                com.bytedance.sdk.component.utils.tG.zp("NativeVideoTsView", "attachTask materialMeta.getVideo() is null !!");
            }
            if (i9 == 0 && this.cW != null && (ks2 = this.lMd) != null && !ks2.dQp()) {
                this.cW.obtainMessage(1).sendToTarget();
            }
        }
    }

    public void rV() {
        if (com.bytedance.sdk.component.utils.KVG.KS(KVG.zp()) == 0 || !Bj()) {
            return;
        }
        if (this.lMd.vDp() != null && this.lMd.vDp().QR()) {
            zp(true, ot.intValue());
            lMd();
            Handler handler = this.cW;
            if (handler != null) {
                handler.sendEmptyMessageDelayed(1, 500L);
                return;
            }
            return;
        }
        if (!ku() && !this.aax.get()) {
            this.aax.set(true);
            WNy();
            woN won = this.zp;
            if (won != null && won.eWG() != null) {
                WNy();
                this.zp.eWG();
                com.bytedance.sdk.openadsdk.core.video.zp.lMd zp2 = woN.zp(CacheDirFactory.getICacheDir(this.zp.jyq()).KS(), this.zp);
                zp2.lMd(this.zp.fgJ());
                zp2.zp(this.woN.getWidth());
                zp2.lMd(this.woN.getHeight());
                zp2.KS(this.zp.GP());
                zp2.zp(this.irS);
                zp2.zp(YW());
                zp2.zp(CacheDirFactory.getICacheDir(this.zp.jyq()).KS());
                zp(zp2);
                this.lMd.zp(zp2);
            }
            Handler handler2 = this.cW;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 500L);
            }
            zp(false);
        }
    }

    public void setAdCreativeClickListener(zp zpVar) {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.lMd;
        if (ks != null) {
            ((KS) ks).zp(zpVar);
        }
    }

    public void setControllerStatusCallBack(lMd lmd) {
        this.dQp = lmd;
    }

    public void setIsAutoPlay(boolean z8) {
        if (this.UPs) {
            return;
        }
        int lMd2 = KVG.jU().lMd(this.zp.FGx());
        if (z8 && lMd2 != 4 && (!com.bytedance.sdk.component.utils.KVG.COT(this.KVG) ? !(!com.bytedance.sdk.component.utils.KVG.HWF(this.KVG) ? com.bytedance.sdk.component.utils.KVG.jU(this.KVG) : QUv() || cW()) : !QUv())) {
            z8 = false;
        }
        this.vwr = z8;
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.lMd;
        if (ks != null) {
            ks.jU(z8);
        }
        if (!this.vwr) {
            QR();
            RelativeLayout relativeLayout = this.QR;
            if (relativeLayout != null) {
                WNy.zp((View) relativeLayout, 0);
                woN won = this.zp;
                if (won != null && won.eWG() != null) {
                    com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.zp.eWG().dT(), this.zp.eWG().KS(), this.zp.eWG().lMd(), this.ku, this.zp);
                }
            }
        } else {
            WNy.zp((View) this.QR, 8);
        }
        this.UPs = true;
    }

    public void setIsQuiet(boolean z8) {
        this.jU = z8;
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.lMd;
        if (ks != null) {
            ks.lMd(z8);
        }
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z8) {
        this.Bj = z8;
    }

    public void setVideoAdClickListenerTTNativeAd(PAGNativeAd pAGNativeAd) {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.lMd;
        if (ks != null) {
            ((KS) ks).zp(pAGNativeAd);
        }
    }

    public void setVideoAdInteractionListener(KS.InterfaceC0050KS interfaceC0050KS) {
        this.eWG = interfaceC0050KS;
    }

    public void setVideoAdLoadListener(KS.jU jUVar) {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.lMd;
        if (ks != null) {
            ks.zp(jUVar);
        }
    }

    public void setVideoCacheUrl(String str) {
        this.cz = str;
    }

    public void setVideoPlayCallback(com.bytedance.sdk.openadsdk.core.video.nativevideo.lMd lmd) {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.lMd;
        if (ks != null) {
            ((KS) ks).zp(lmd);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        if (i9 == 4 || i9 == 8) {
            ot();
        }
    }

    public void tG() {
        if (getNativeVideoController() != null && (getNativeVideoController() instanceof KS)) {
            KS ks = (KS) getNativeVideoController();
            ks.zp(ks.tG(), this);
        }
    }

    public boolean vDp() {
        boolean z8 = false;
        if (com.bytedance.sdk.component.utils.KVG.KS(KVG.zp()) == 0) {
            return false;
        }
        if (this.lMd.vDp() != null && this.lMd.vDp().HWF()) {
            zp(false, FP.intValue());
            Handler handler = this.cW;
            z8 = true;
            if (handler != null) {
                handler.removeMessages(1);
            }
        }
        return z8;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
    public void zp() {
    }

    public NativeVideoTsView(@NonNull Context context, @NonNull woN won, String str, boolean z8, boolean z9, QR qr) {
        this(context, won, false, str, z8, z9, qr);
    }

    public void KS() {
        if (vDp()) {
            return;
        }
        rV();
    }

    public NativeVideoTsView(@NonNull Context context, @NonNull woN won, QR qr) {
        this(context, won, false, qr);
    }

    public void lMd() {
        woN won = this.zp;
        if (won == null) {
            return;
        }
        int FGx = won.FGx();
        int lMd2 = KVG.jU().lMd(FGx);
        int KS = com.bytedance.sdk.component.utils.KVG.KS(KVG.zp());
        if (lMd2 == 1) {
            this.vwr = YhE.jU(KS);
        } else if (lMd2 == 2) {
            this.vwr = YhE.COT(KS) || YhE.jU(KS) || YhE.HWF(KS);
        } else if (lMd2 == 3) {
            this.vwr = false;
        } else if (lMd2 == 4) {
            this.rV = true;
        } else if (lMd2 == 5) {
            this.vwr = YhE.jU(KS) || YhE.HWF(KS);
        }
        if (!this.pvr) {
            if (!this.COT || !com.bytedance.sdk.openadsdk.core.nativeexpress.woN.lMd(this.vDp)) {
                this.jU = KVG.jU().KS(String.valueOf(FGx));
            }
        } else {
            this.jU = false;
        }
        if ("open_ad".equals(this.vDp)) {
            this.vwr = true;
            this.jU = true;
        }
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.lMd;
        if (ks != null) {
            ks.jU(this.vwr);
        }
        this.COT = true;
    }

    public NativeVideoTsView(@NonNull Context context, @NonNull woN won, boolean z8, String str, boolean z9, boolean z10, QR qr) {
        super(context);
        this.vwr = true;
        this.jU = true;
        this.pvr = false;
        this.COT = false;
        this.ox = true;
        this.RCv = false;
        this.Lij = true;
        this.Bj = true;
        this.vDp = "embeded_ad";
        this.tG = 50;
        this.Gzh = true;
        this.QUv = false;
        this.cW = new RCv(tG.lMd().getLooper(), this);
        this.UPs = false;
        this.fRl = Build.MODEL;
        this.rV = false;
        this.oKZ = new AtomicBoolean(false);
        this.BO = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.4
            @Override // java.lang.Runnable
            public void run() {
                NativeVideoTsView nativeVideoTsView = NativeVideoTsView.this;
                nativeVideoTsView.zp(nativeVideoTsView.YhE, NativeVideoTsView.FP.intValue());
            }
        };
        this.Iv = true;
        this.aax = new AtomicBoolean(false);
        this.Rg = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                NativeVideoTsView.this.woN();
            }
        };
        try {
            if (won.led()) {
                this.yRU = CacheDirFactory.getICacheDir(0).lMd();
            }
        } catch (Throwable unused) {
        }
        if (qr != null) {
            this.HWF = qr;
        }
        this.vDp = str;
        this.KVG = context;
        this.zp = won;
        this.pvr = z8;
        setContentDescription("NativeVideoTsView");
        this.RCv = z9;
        this.Lij = z10;
        lMd();
        COT();
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
    public void zp(long j7, int i9) {
        KS.InterfaceC0050KS interfaceC0050KS = this.eWG;
        if (interfaceC0050KS != null) {
            interfaceC0050KS.g_();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
    public void zp(long j7, long j9) {
        KS.InterfaceC0050KS interfaceC0050KS = this.eWG;
        if (interfaceC0050KS != null) {
            interfaceC0050KS.zp(j7, j9);
        }
    }

    private View zp(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        new FrameLayout.LayoutParams(-1, -1).gravity = 17;
        frameLayout.setVisibility(8);
        this.woN = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.KS = frameLayout2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        this.ffE = view;
        return frameLayout;
    }

    private RelativeLayout lMd(Context context) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        pAGRelativeLayout.setVisibility(8);
        PAGImageView pAGImageView = new PAGImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        pAGImageView.setLayoutParams(layoutParams);
        pAGImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.ku = pAGImageView;
        PAGImageView pAGImageView2 = new PAGImageView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        pAGImageView2.setLayoutParams(layoutParams2);
        pAGImageView2.setVisibility(8);
        pAGImageView2.setBackground(cz.KS(context, "tt_new_play_video"));
        this.dT = pAGImageView2;
        pAGRelativeLayout.addView(pAGImageView);
        pAGRelativeLayout.addView(pAGImageView2);
        return pAGRelativeLayout;
    }

    private void zp(View view, ViewGroup viewGroup, View view2) {
        int indexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeViewInLayout(view2);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    public boolean zp(long j7, boolean z8, boolean z9) {
        boolean z10 = false;
        this.woN.setVisibility(0);
        this.irS = j7;
        if (!YhE()) {
            return true;
        }
        this.lMd.zp(false);
        woN won = this.zp;
        if (won != null && won.eWG() != null) {
            com.bytedance.sdk.openadsdk.core.video.zp.lMd zp2 = woN.zp(CacheDirFactory.getICacheDir(this.zp.jyq()).KS(), this.zp);
            zp2.lMd(this.zp.fgJ());
            zp2.zp(this.woN.getWidth());
            zp2.lMd(this.woN.getHeight());
            zp2.KS(this.zp.GP());
            zp2.zp(j7);
            zp2.zp(YW());
            zp(zp2);
            if (z9) {
                this.lMd.lMd(zp2);
                return true;
            }
            z10 = this.lMd.zp(zp2);
        }
        if (((j7 > 0 && !z8 && !z9) || (j7 > 0 && z8)) && this.lMd != null) {
            dQp.zp zpVar = new dQp.zp();
            zpVar.zp(this.lMd.COT());
            zpVar.KS(this.lMd.ku());
            zpVar.lMd(this.lMd.HWF());
            com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.lMd(this.lMd.tG(), zpVar);
        }
        return z10;
    }

    public void lMd(boolean z8) {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.lMd;
        if (ks != null) {
            ks.KS(z8);
            com.bykv.vk.openvk.component.video.api.jU.lMd tG = this.lMd.tG();
            if (tG != null) {
                tG.lMd();
                View KS = tG.KS();
                if (KS != null) {
                    if (KS.getParent() != null) {
                        ((ViewGroup) KS.getParent()).removeView(KS);
                    }
                    KS.setVisibility(0);
                    addView(KS);
                    tG.zp(this.zp, new WeakReference<>(this.KVG), false);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.RCv.zp
    public void zp(Message message) {
        if (message.what == 1) {
            yRU();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(boolean z8, int i9) {
        if (this.zp == null || this.lMd == null) {
            return;
        }
        boolean RCv = RCv();
        Lij();
        if (RCv && this.lMd.dQp()) {
            this.lMd.dQp();
            lMd(true);
            jU();
            return;
        }
        if (z8 && this.ox && !this.lMd.dQp() && !this.lMd.Bj()) {
            if (this.lMd.vDp() != null && this.lMd.vDp().QR()) {
                if (this.vwr || i9 == 1) {
                    com.bykv.vk.openvk.component.video.api.jU.KS ks = this.lMd;
                    if (ks != null) {
                        setIsQuiet(ks.rV());
                    }
                    if ("ALP-AL00".equals(this.fRl)) {
                        this.lMd.lMd();
                    } else {
                        if (!ku.lMd().dQp()) {
                            RCv = true;
                        }
                        ((KS) this.lMd).ku(RCv);
                    }
                    zp(false);
                    KS.InterfaceC0050KS interfaceC0050KS = this.eWG;
                    if (interfaceC0050KS != null) {
                        interfaceC0050KS.f_();
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.vwr && this.lMd.vDp() == null) {
                if (!this.oKZ.get()) {
                    this.oKZ.set(true);
                }
                this.aax.set(false);
                cz();
                return;
            }
            return;
        }
        if (this.lMd.vDp() == null || !this.lMd.vDp().HWF()) {
            return;
        }
        this.lMd.zp();
        zp(true);
        KS.InterfaceC0050KS interfaceC0050KS2 = this.eWG;
        if (interfaceC0050KS2 != null) {
            interfaceC0050KS2.e_();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.KS.zp
    public void zp(int i9) {
        lMd();
    }

    public void zp(boolean z8) {
        if (this.YW == null) {
            this.YW = new ImageView(getContext());
            if (ku.lMd().KVG() != null) {
                this.YW.setImageBitmap(ku.lMd().KVG());
            } else {
                this.YW.setImageResource(cz.jU(KVG.zp(), "tt_new_play_video"));
            }
            this.YW.setScaleType(ImageView.ScaleType.FIT_XY);
            int lMd2 = WNy.lMd(getContext(), this.tG);
            int lMd3 = WNy.lMd(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(lMd2, lMd2);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = lMd3;
            layoutParams.bottomMargin = lMd3;
            this.woN.addView(this.YW, layoutParams);
            this.YW.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    NativeVideoTsView.this.rV();
                }
            });
        }
        if (z8) {
            this.YW.setVisibility(0);
        } else {
            this.YW.setVisibility(8);
        }
    }

    public HWF zp(List<Pair<View, FriendlyObstructionPurpose>> list) {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.lMd;
        if (ks instanceof KS) {
            return ((KS) ks).zp(this, list);
        }
        return null;
    }

    private void zp(com.bykv.vk.openvk.component.video.api.KS.KS ks) {
        try {
            if (this.zp.led()) {
                ks.zp(this.yRU);
            }
        } catch (Throwable unused) {
        }
    }
}
