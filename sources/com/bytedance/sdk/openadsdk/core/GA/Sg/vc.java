package com.bytedance.sdk.openadsdk.core.GA.Sg;

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
import com.bytedance.sdk.component.utils.EH;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.AlY.DSW;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.GA.Sg.tN;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.core.pq;
import com.bytedance.sdk.openadsdk.core.qsH.VOe;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l5.a;
import l5.c;
import l5.e;
import l5.f;
import l5.g;
import m2.l;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class vc extends com.bytedance.sdk.openadsdk.core.wN.tN implements e, bZ.YFl, tN.YFl {
    protected boolean AlY;
    private boolean BPI;
    private final boolean Cfr;
    protected RelativeLayout DSW;
    public Sg EH;
    protected int GA;
    private View GS;
    private boolean Ga;
    protected ImageView NjR;
    private final String Sco;
    protected g Sg;
    private final AtomicBoolean UI;
    private boolean UZM;
    private String VOe;
    private boolean Wwa;
    protected final Wwa YFl;
    private boolean YI;
    protected String YoT;
    private final Runnable ZU;
    private String aIu;
    private boolean bZ;
    private long dXO;
    protected boolean eT;
    private final Handler hQ;
    private final ViewTreeObserver.OnScrollChangedListener ko;
    private ViewGroup lG;
    private f lu;
    private ViewTreeObserver.OnGlobalLayoutListener mB;
    private long mn;

    /* renamed from: nc, reason: collision with root package name */
    protected ImageView f10630nc;
    boolean pDU;
    private boolean pq;
    private boolean qO;
    protected ImageView qsH;
    private final Context rkt;
    protected FrameLayout tN;

    /* renamed from: vc, reason: collision with root package name */
    public DSW f10631vc;
    public boolean wN;
    private boolean zB;
    private final AtomicBoolean zG;
    private static final Integer wXo = 0;
    private static final Integer Ne = 1;

    /* loaded from: classes.dex */
    public interface Sg {
        void YFl(boolean z10, long j3, long j10, long j11, boolean z11);
    }

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl(View view, int i10);
    }

    public vc(@NonNull Context context, @NonNull Wwa wwa, boolean z10, DSW dsw) {
        this(context, wwa, z10, "embeded_ad", false, false, dsw);
    }

    private void AlY() {
        YFl(0L, 0);
        this.lu = null;
    }

    private boolean Cfr() {
        if (2 == lG.AlY().Sg(this.YFl.kU())) {
            return true;
        }
        return false;
    }

    private void Ga() {
        this.hQ.removeMessages(1);
        pDU.tN().removeCallbacks(this.ZU);
    }

    private void Ne() {
        if (!this.UI.get()) {
            this.UI.set(true);
            g gVar = this.Sg;
            if (gVar != null) {
                gVar.YFl(true, 3);
            }
        }
        this.zG.set(false);
    }

    private boolean UZM() {
        if (pq() || !bZ()) {
            return false;
        }
        boolean YFl2 = com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
        if (!com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_native_video_data", "key_video_is_from_detail_page", false) && !YFl2) {
            return false;
        }
        return true;
    }

    private void VOe() {
        this.pq = eT();
        mn.YFl(this.ZU);
    }

    private void Wwa() {
        this.Sg = new tN(this.rkt, this.tN, this.YFl, this.YoT, !pq(), this.UZM, this.YI, this.f10631vc);
        qO();
        if (this.mB == null) {
            this.mB = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.vc.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    vc vcVar;
                    g gVar;
                    if (vc.this.lG != null && vc.this.lG.getViewTreeObserver() != null && (gVar = (vcVar = vc.this).Sg) != null) {
                        ((tN) gVar).YFl(vcVar.lG.getWidth(), vc.this.lG.getHeight());
                        vc.this.lG.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        vc.this.mB = null;
                    }
                }
            };
            this.lG.getViewTreeObserver().addOnGlobalLayoutListener(this.mB);
        }
    }

    private void YI() {
        if (!pq() && bZ()) {
            Boolean bool = Boolean.FALSE;
            com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
            com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_native_video_data", "key_video_is_from_detail_page", bool);
        }
    }

    private void aIu() {
        g gVar = this.Sg;
        if (gVar == null) {
            Wwa();
        } else if ((gVar instanceof tN) && !pq()) {
            ((tN) this.Sg).Wwa();
        }
        if (this.Sg != null && this.UI.get()) {
            this.UI.set(false);
            Sg();
            if (qsH()) {
                GS.YFl((View) this.DSW, 8);
                ImageView imageView = this.NjR;
                if (imageView != null) {
                    GS.YFl((View) imageView, 8);
                }
                Wwa wwa = this.YFl;
                if (wwa != null && wwa.BPI() != null) {
                    com.bytedance.sdk.openadsdk.core.GA.YFl.Sg YFl2 = Wwa.YFl(((l) CacheDirFactory.getICacheDir(this.YFl.dBO())).g(), this.YFl);
                    YFl2.Sg(this.YFl.zz());
                    YFl2.YFl(this.lG.getWidth());
                    YFl2.Sg(this.lG.getHeight());
                    YFl2.tN(this.YFl.uGS());
                    YFl2.YFl(0L);
                    YFl2.YFl(NjR());
                    YFl(YFl2);
                    this.Sg.YFl(YFl2);
                    this.Sg.tN(false);
                    return;
                }
                YoT.YFl("NativeVideoTsView", "attachTask materialMeta.getVideo() is null !!");
                return;
            }
            if (this.Sg.EH()) {
                this.Sg.EH();
                Sg(true);
            } else {
                DSW();
                GS.YFl((View) this.DSW, 0);
            }
        }
    }

    private boolean bZ() {
        Wwa wwa = this.YFl;
        if (wwa == null) {
            return false;
        }
        return wwa.oc();
    }

    private void dXO() {
        boolean z10;
        boolean z11 = false;
        if (this.Sg != null && !pq() && (!bZ() || com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_native_video_data", "key_video_is_update_flag", false))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return;
        }
        long vc2 = this.Sg.vc() + this.Sg.qsH();
        long qsH = this.Sg.qsH();
        long j3 = 0;
        if (bZ()) {
            z11 = com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_native_video_data", "key_native_video_complete", false);
            j3 = com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_native_video_data", "key_video_current_play_position", 0L);
            vc2 = com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_native_video_data", "key_video_total_play_duration", this.Sg.vc() + this.Sg.qsH());
            qsH = com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_native_video_data", "key_video_duration", this.Sg.qsH());
            com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
            this.Sg.tN(z11);
            this.Sg.YFl(j3);
            this.Sg.Sg(vc2);
            this.Sg.tN(qsH);
        }
        YoT.YFl("MultiProcess", "onResumeFeedNativeVideoControllerData-isComplete=" + z11 + ",position=" + j3 + ",totalPlayDuration=" + vc2 + ",duration=" + qsH);
    }

    private boolean hQ() {
        if (5 == lG.AlY().Sg(this.YFl.kU())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lG() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = this.hQ;
        if (handler != null && elapsedRealtime - this.mn > 500) {
            this.mn = elapsedRealtime;
            handler.sendEmptyMessageDelayed(1, 500L);
        }
    }

    private void mn() {
        GS.wN(this.NjR);
        GS.wN(this.DSW);
    }

    private boolean pq() {
        return this.qO;
    }

    private void qO() {
        g gVar = this.Sg;
        if (gVar == null) {
            return;
        }
        gVar.AlY(this.Wwa);
        ((tN) this.Sg).YFl((tN.YFl) this);
        this.Sg.YFl(this);
    }

    private void wN() {
        addView(YFl(this.rkt));
        Wwa();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.vc.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                vc.this.lG();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                vc.this.lG();
            }
        });
    }

    private void wXo() {
        this.EH = null;
        if ((this.Sg instanceof tN) && !pq()) {
            ((tN) this.Sg).mn();
        }
        nc();
        YFl(false);
        Ne();
    }

    public void DSW() {
        View view;
        if (this.rkt != null && (view = this.GS) != null && view.getParent() != null && this.YFl != null && this.DSW == null) {
            ViewParent parent = this.GS.getParent();
            RelativeLayout Sg2 = Sg(this.rkt);
            if (parent != null && (parent instanceof ViewGroup)) {
                YFl(Sg2, (ViewGroup) parent, this.GS);
            }
            this.DSW = Sg2;
            if (this.eT) {
                GS.YFl((View) this.f10630nc, 0);
            }
            if (this.YFl.BPI() != null && this.YFl.BPI().f23461f != null) {
                com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.YFl.BPI().f23461f, this.YFl.BPI().f23457b, this.YFl.BPI().a, this.qsH, this.YFl);
            }
            ImageView imageView = this.f10630nc;
            if (imageView != null) {
                imageView.setClickable(true);
                this.f10630nc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.vc.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        vc.this.tN();
                    }
                });
            }
        }
    }

    public void EH() {
        Wwa wwa = this.YFl;
        if (wwa != null && wwa.Af() != null) {
            this.YFl.Af().EH();
            this.YFl.Af().YFl().wN(this.dXO);
        }
    }

    public void GA() {
        if (getNativeVideoController() != null && (getNativeVideoController() instanceof tN)) {
            tN tNVar = (tN) getNativeVideoController();
            tNVar.YFl(tNVar.GA(), this);
        }
    }

    public boolean NjR() {
        return this.AlY;
    }

    @Override // l5.e
    public void Sg(long j3, int i10) {
    }

    @Override // l5.e
    public void YFl() {
    }

    public boolean YoT() {
        boolean z10 = false;
        if (EH.tN(lG.YFl()) == 0) {
            return false;
        }
        if (this.Sg.YoT() != null && this.Sg.YoT().vc()) {
            YFl(false, wXo.intValue());
            Handler handler = this.hQ;
            z10 = true;
            if (handler != null) {
                handler.removeMessages(1);
            }
        }
        return z10;
    }

    boolean eT() {
        int i10;
        if (VOe.Sg(this.YoT)) {
            i10 = 1;
        } else {
            i10 = 5;
        }
        return pq.YFl(this, 50, i10);
    }

    public double getCurrentPlayTime() {
        if (this.Sg != null) {
            return (r0.wN() * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }

    public g getNativeVideoController() {
        return this.Sg;
    }

    public void nc() {
        a GA;
        g gVar = this.Sg;
        if (gVar != null && (GA = gVar.GA()) != null) {
            GA.YFl();
            View tN = GA.tN();
            if (tN != null) {
                tN.setVisibility(8);
                if (tN.getParent() != null) {
                    ((ViewGroup) tN.getParent()).removeView(tN);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        aIu();
        getViewTreeObserver().addOnScrollChangedListener(this.ko);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wXo();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.ko);
        }
        ViewGroup viewGroup = this.lG;
        if (viewGroup != null && this.mB != null) {
            ViewTreeObserver viewTreeObserver2 = viewGroup.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this.mB);
                this.mB = null;
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        aIu();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Sg sg2;
        g gVar;
        if (!this.qO && (sg2 = this.EH) != null && (gVar = this.Sg) != null) {
            sg2.YFl(gVar.EH(), this.Sg.qsH(), this.Sg.NjR(), this.Sg.wN(), this.Wwa);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        wXo();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        g gVar;
        g gVar2;
        g gVar3;
        g gVar4;
        if (!"open_ad".equals(this.YoT)) {
            this.bZ = z10;
            super.onWindowFocusChanged(z10);
            dXO();
            if (UZM() && (gVar4 = this.Sg) != null && gVar4.EH()) {
                YI();
                GS.YFl((View) this.DSW, 8);
                Sg(true);
                AlY();
                return;
            }
            Sg();
            if (!pq() && qsH() && (gVar2 = this.Sg) != null && !gVar2.eT()) {
                if (this.hQ != null) {
                    if (z10 && (gVar3 = this.Sg) != null && !gVar3.EH()) {
                        this.hQ.obtainMessage(1).sendToTarget();
                        return;
                    } else {
                        Ga();
                        YFl(false, wXo.intValue());
                        return;
                    }
                }
                return;
            }
            if (!qsH()) {
                if (!z10 && (gVar = this.Sg) != null && gVar.YoT() != null && this.Sg.YoT().vc()) {
                    Ga();
                    YFl(false, wXo.intValue());
                    return;
                } else {
                    if (z10) {
                        this.hQ.obtainMessage(1).sendToTarget();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        Ga();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        g gVar;
        Wwa wwa;
        g gVar2;
        g gVar3;
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        dXO();
        if (this.BPI) {
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.BPI = z10;
        }
        if (UZM() && (gVar3 = this.Sg) != null && gVar3.EH()) {
            YI();
            GS.YFl((View) this.DSW, 8);
            Sg(true);
            AlY();
            return;
        }
        Sg();
        if (!pq() && qsH() && (gVar = this.Sg) != null && !gVar.eT() && (wwa = this.YFl) != null) {
            if (this.Ga && wwa.BPI() != null) {
                this.YFl.BPI();
                com.bytedance.sdk.openadsdk.core.GA.YFl.Sg YFl2 = Wwa.YFl(((l) CacheDirFactory.getICacheDir(this.YFl.dBO())).g(), this.YFl);
                YFl2.Sg(this.YFl.zz());
                YFl2.YFl(this.lG.getWidth());
                YFl2.Sg(this.lG.getHeight());
                YFl2.tN(this.YFl.uGS());
                YFl2.YFl(this.dXO);
                YFl2.YFl(NjR());
                YFl(YFl2);
                this.Sg.YFl(YFl2);
                this.Ga = false;
                GS.YFl((View) this.DSW, 8);
            } else {
                YoT.YFl("NativeVideoTsView", "attachTask materialMeta.getVideo() is null !!");
            }
            if (i10 == 0 && this.hQ != null && (gVar2 = this.Sg) != null && !gVar2.EH()) {
                this.hQ.obtainMessage(1).sendToTarget();
            }
        }
    }

    public void pDU() {
        if (EH.tN(lG.YFl()) == 0 || !eT()) {
            return;
        }
        if (this.Sg.YoT() != null && this.Sg.YoT().DSW()) {
            YFl(true, Ne.intValue());
            Sg();
            Handler handler = this.hQ;
            if (handler != null) {
                handler.sendEmptyMessageDelayed(1, 500L);
                return;
            }
            return;
        }
        if (!qsH() && !this.zG.get()) {
            this.zG.set(true);
            mn();
            Wwa wwa = this.YFl;
            if (wwa != null && wwa.BPI() != null) {
                mn();
                this.YFl.BPI();
                com.bytedance.sdk.openadsdk.core.GA.YFl.Sg YFl2 = Wwa.YFl(((l) CacheDirFactory.getICacheDir(this.YFl.dBO())).g(), this.YFl);
                YFl2.Sg(this.YFl.zz());
                YFl2.YFl(this.lG.getWidth());
                YFl2.Sg(this.lG.getHeight());
                YFl2.tN(this.YFl.uGS());
                YFl2.YFl(this.dXO);
                YFl2.YFl(NjR());
                YFl2.YFl(((l) CacheDirFactory.getICacheDir(this.YFl.dBO())).g());
                YFl(YFl2);
                this.Sg.YFl(YFl2);
            }
            Handler handler2 = this.hQ;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 500L);
            }
            YFl(false);
        }
    }

    public boolean qsH() {
        return this.Wwa;
    }

    public void setAdCreativeClickListener(YFl yFl) {
        g gVar = this.Sg;
        if (gVar != null) {
            ((tN) gVar).YFl(yFl);
        }
    }

    public void setControllerStatusCallBack(Sg sg2) {
        this.EH = sg2;
    }

    public void setIsAutoPlay(boolean z10) {
        if (this.zB) {
            return;
        }
        int Sg2 = lG.AlY().Sg(this.YFl.kU());
        if (z10 && Sg2 != 4 && (!EH.wN(this.rkt) ? !(!EH.vc(this.rkt) ? EH.AlY(this.rkt) : Cfr() || hQ()) : !Cfr())) {
            z10 = false;
        }
        this.Wwa = z10;
        g gVar = this.Sg;
        if (gVar != null) {
            gVar.AlY(z10);
        }
        if (!this.Wwa) {
            DSW();
            RelativeLayout relativeLayout = this.DSW;
            if (relativeLayout != null) {
                GS.YFl((View) relativeLayout, 0);
                Wwa wwa = this.YFl;
                if (wwa != null && wwa.BPI() != null) {
                    com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.YFl.BPI().f23461f, this.YFl.BPI().f23457b, this.YFl.BPI().a, this.qsH, this.YFl);
                }
            }
        } else {
            GS.YFl((View) this.DSW, 8);
        }
        this.zB = true;
    }

    public void setIsQuiet(boolean z10) {
        this.AlY = z10;
        g gVar = this.Sg;
        if (gVar != null) {
            gVar.Sg(z10);
        }
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z10) {
        this.eT = z10;
    }

    public void setVideoAdClickListenerTTNativeAd(PAGNativeAd pAGNativeAd) {
        g gVar = this.Sg;
        if (gVar != null) {
            ((tN) gVar).YFl(pAGNativeAd);
        }
    }

    public void setVideoAdInteractionListener(f fVar) {
        this.lu = fVar;
    }

    public void setVideoAdLoadListener(c cVar) {
        g gVar = this.Sg;
        if (gVar != null) {
            gVar.YFl(cVar);
        }
    }

    public void setVideoCacheUrl(String str) {
        this.aIu = str;
    }

    public void setVideoPlayCallback(com.bytedance.sdk.openadsdk.core.GA.Sg.Sg sg2) {
        g gVar = this.Sg;
        if (gVar != null) {
            ((tN) gVar).YFl(sg2);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 4 || i10 == 8) {
            Ne();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.tN.YFl
    public void vc() {
        f fVar = this.lu;
        if (fVar != null) {
            fVar.d_();
        }
    }

    public vc(@NonNull Context context, @NonNull Wwa wwa, String str, boolean z10, boolean z11, DSW dsw) {
        this(context, wwa, false, str, z10, z11, dsw);
    }

    public void tN() {
        if (YoT()) {
            return;
        }
        pDU();
    }

    public vc(@NonNull Context context, @NonNull Wwa wwa, DSW dsw) {
        this(context, wwa, false, dsw);
    }

    public void Sg() {
        Wwa wwa = this.YFl;
        if (wwa == null) {
            return;
        }
        int kU = wwa.kU();
        int Sg2 = lG.AlY().Sg(kU);
        int tN = EH.tN(lG.YFl());
        if (Sg2 == 1) {
            this.Wwa = Sco.AlY(tN);
        } else if (Sg2 == 2) {
            this.Wwa = Sco.wN(tN) || Sco.AlY(tN) || Sco.vc(tN);
        } else if (Sg2 == 3) {
            this.Wwa = false;
        } else if (Sg2 == 4) {
            this.pDU = true;
        } else if (Sg2 == 5) {
            this.Wwa = Sco.AlY(tN) || Sco.vc(tN);
        }
        if (!this.qO) {
            if (!this.wN || !VOe.Sg(this.YoT)) {
                this.AlY = lG.AlY().tN(String.valueOf(kU));
            }
        } else {
            this.AlY = false;
        }
        if ("open_ad".equals(this.YoT)) {
            this.Wwa = true;
            this.AlY = true;
        }
        g gVar = this.Sg;
        if (gVar != null) {
            gVar.AlY(this.Wwa);
        }
        this.wN = true;
    }

    public vc(@NonNull Context context, @NonNull Wwa wwa, boolean z10, String str, boolean z11, boolean z12, DSW dsw) {
        super(context);
        this.Wwa = true;
        this.AlY = true;
        this.qO = false;
        this.wN = false;
        this.bZ = true;
        this.UZM = false;
        this.YI = true;
        this.eT = true;
        this.YoT = "embeded_ad";
        this.GA = 50;
        this.Ga = true;
        this.Cfr = false;
        this.hQ = new bZ(pDU.Sg().getLooper(), this);
        this.zB = false;
        this.Sco = Build.MODEL;
        this.pDU = false;
        this.UI = new AtomicBoolean(false);
        this.ZU = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.vc.4
            @Override // java.lang.Runnable
            public void run() {
                vc vcVar = vc.this;
                vcVar.YFl(vcVar.pq, vc.wXo.intValue());
            }
        };
        this.BPI = true;
        this.zG = new AtomicBoolean(false);
        this.ko = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.vc.6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                vc.this.lG();
            }
        };
        try {
            if (wwa.id()) {
                this.VOe = ((l) CacheDirFactory.getICacheDir(0)).c();
            }
        } catch (Throwable unused) {
        }
        if (dsw != null) {
            this.f10631vc = dsw;
        }
        this.YoT = str;
        this.rkt = context;
        this.YFl = wwa;
        this.qO = z10;
        setContentDescription("NativeVideoTsView");
        this.UZM = z11;
        this.YI = z12;
        Sg();
        wN();
    }

    @Override // l5.e
    public void YFl(long j3, int i10) {
        f fVar = this.lu;
        if (fVar != null) {
            fVar.i_();
        }
    }

    @Override // l5.e
    public void YFl(long j3, long j10) {
        f fVar = this.lu;
        if (fVar != null) {
            fVar.YFl(j3, j10);
        }
    }

    private View YFl(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        new FrameLayout.LayoutParams(-1, -1).gravity = 17;
        frameLayout.setVisibility(8);
        this.lG = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.tN = frameLayout2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        this.GS = view;
        return frameLayout;
    }

    private RelativeLayout Sg(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.DSW dsw = new com.bytedance.sdk.openadsdk.core.wN.DSW(context);
        dsw.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        dsw.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        alY.setLayoutParams(layoutParams);
        alY.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.qsH = alY;
        com.bytedance.sdk.openadsdk.core.wN.AlY alY2 = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        alY2.setLayoutParams(layoutParams2);
        alY2.setVisibility(8);
        alY2.setBackground(qO.tN(context, "tt_new_play_video"));
        this.f10630nc = alY2;
        dsw.addView(alY);
        dsw.addView(alY2);
        return dsw;
    }

    private void YFl(View view, ViewGroup viewGroup, View view2) {
        int indexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeViewInLayout(view2);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    public boolean YFl(long j3, boolean z10, boolean z11) {
        boolean z12 = false;
        this.lG.setVisibility(0);
        this.dXO = j3;
        if (!pq()) {
            return true;
        }
        this.Sg.YFl(false);
        Wwa wwa = this.YFl;
        if (wwa != null && wwa.BPI() != null) {
            com.bytedance.sdk.openadsdk.core.GA.YFl.Sg YFl2 = Wwa.YFl(((l) CacheDirFactory.getICacheDir(this.YFl.dBO())).g(), this.YFl);
            YFl2.Sg(this.YFl.zz());
            YFl2.YFl(this.lG.getWidth());
            YFl2.Sg(this.lG.getHeight());
            YFl2.tN(this.YFl.uGS());
            YFl2.YFl(j3);
            YFl2.YFl(NjR());
            YFl(YFl2);
            if (z11) {
                this.Sg.Sg(YFl2);
                return true;
            }
            z12 = this.Sg.YFl(YFl2);
        }
        if (((j3 > 0 && !z10 && !z11) || (j3 > 0 && z10)) && this.Sg != null) {
            EH.YFl yFl = new EH.YFl();
            yFl.YFl(this.Sg.wN());
            yFl.tN(this.Sg.qsH());
            yFl.Sg(this.Sg.vc());
            com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.Sg(this.Sg.GA(), yFl);
        }
        return z12;
    }

    public void Sg(boolean z10) {
        g gVar = this.Sg;
        if (gVar != null) {
            gVar.tN(z10);
            a GA = this.Sg.GA();
            if (GA != null) {
                GA.Sg();
                View tN = GA.tN();
                if (tN != null) {
                    if (tN.getParent() != null) {
                        ((ViewGroup) tN.getParent()).removeView(tN);
                    }
                    tN.setVisibility(0);
                    addView(tN);
                    GA.YFl(this.YFl, new WeakReference(this.rkt), false);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.bZ.YFl
    public void YFl(Message message) {
        if (message.what == 1) {
            VOe();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(boolean z10, int i10) {
        if (this.YFl == null || this.Sg == null) {
            return;
        }
        boolean UZM = UZM();
        YI();
        if (UZM && this.Sg.EH()) {
            this.Sg.EH();
            Sg(true);
            AlY();
            return;
        }
        if (z10 && this.bZ && !this.Sg.EH() && !this.Sg.eT()) {
            if (this.Sg.YoT() != null && this.Sg.YoT().DSW()) {
                if (this.Wwa || i10 == 1) {
                    g gVar = this.Sg;
                    if (gVar != null) {
                        setIsQuiet(gVar.pDU());
                    }
                    if ("ALP-AL00".equals(this.Sco)) {
                        this.Sg.Sg();
                    } else {
                        if (!NjR.Sg().EH()) {
                            UZM = true;
                        }
                        ((tN) this.Sg).qsH(UZM);
                    }
                    YFl(false);
                    f fVar = this.lu;
                    if (fVar != null) {
                        fVar.h_();
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.Wwa && this.Sg.YoT() == null) {
                if (!this.UI.get()) {
                    this.UI.set(true);
                }
                this.zG.set(false);
                aIu();
                return;
            }
            return;
        }
        if (this.Sg.YoT() == null || !this.Sg.YoT().vc()) {
            return;
        }
        this.Sg.YFl();
        YFl(true);
        f fVar2 = this.lu;
        if (fVar2 != null) {
            fVar2.g_();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.tN.YFl
    public void YFl(int i10) {
        Sg();
    }

    public void YFl(boolean z10) {
        if (this.NjR == null) {
            this.NjR = new ImageView(getContext());
            if (NjR.Sg().rkt() != null) {
                this.NjR.setImageBitmap(NjR.Sg().rkt());
            } else {
                this.NjR.setImageResource(qO.AlY(lG.YFl(), "tt_new_play_video"));
            }
            this.NjR.setScaleType(ImageView.ScaleType.FIT_XY);
            int tN = GS.tN(getContext(), this.GA);
            int tN2 = GS.tN(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tN, tN);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = tN2;
            layoutParams.bottomMargin = tN2;
            this.lG.addView(this.NjR, layoutParams);
            this.NjR.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.GA.Sg.vc.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    vc.this.pDU();
                }
            });
        }
        if (z10) {
            this.NjR.setVisibility(0);
        } else {
            this.NjR.setVisibility(8);
        }
    }

    public com.bytedance.sdk.openadsdk.core.YoT.vc YFl(List<Pair<View, FriendlyObstructionPurpose>> list) {
        g gVar = this.Sg;
        if (gVar instanceof tN) {
            return ((tN) gVar).YFl(this, list);
        }
        return null;
    }

    private void YFl(p5.c cVar) {
        try {
            if (this.YFl.id()) {
                cVar.YFl(this.VOe);
            }
        } catch (Throwable unused) {
        }
    }
}
