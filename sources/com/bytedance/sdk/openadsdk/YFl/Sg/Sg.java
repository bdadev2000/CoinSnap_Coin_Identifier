package com.bytedance.sdk.openadsdk.YFl.Sg;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.GA.Sg.vc;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.rkt;
import com.bytedance.sdk.openadsdk.multipro.Sg.YFl;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.List;
import l5.c;
import l5.f;

/* loaded from: classes.dex */
public class Sg extends qsH implements c, f, YFl.InterfaceC0135YFl {
    private long GA;
    private final com.bytedance.sdk.openadsdk.multipro.Sg.YFl NjR;
    private AdSlot YoT;
    private boolean eT;

    /* renamed from: nc, reason: collision with root package name */
    private boolean f10522nc;
    private tN qsH;

    public Sg(@NonNull Context context, @NonNull Wwa wwa, int i10, AdSlot adSlot) {
        super(context, wwa, i10, true);
        this.f10522nc = false;
        this.eT = true;
        this.wN = i10;
        this.YoT = adSlot;
        this.NjR = new com.bytedance.sdk.openadsdk.multipro.Sg.YFl();
        YFl(this.f10526vc);
        YFl("embeded_ad");
        this.AlY.YFl(this);
    }

    @Override // l5.f
    public void d_() {
        tN tNVar = this.qsH;
        if (tNVar != null) {
            tNVar.YFl(this);
        }
    }

    @Override // l5.f
    public void g_() {
        tN tNVar = this.qsH;
        if (tNVar != null) {
            tNVar.Sg(this);
        }
    }

    @Override // l5.f
    public void h_() {
    }

    @Override // l5.f
    public void i_() {
        tN tNVar = this.qsH;
        if (tNVar != null) {
            tNVar.tN(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.YFl.Sg.qsH, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
        YFl yFl = this.AlY;
        if (yFl != null) {
            yFl.YoT();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.Sg.YFl.InterfaceC0135YFl
    public com.bytedance.sdk.openadsdk.multipro.Sg.YFl vc() {
        return this.NjR;
    }

    public View wN() {
        com.bytedance.sdk.openadsdk.core.GA.Sg.vc vcVar;
        boolean z10;
        Wwa wwa = this.Sg;
        if (wwa != null && this.tN != null) {
            if (Wwa.wN(wwa)) {
                try {
                    vcVar = new com.bytedance.sdk.openadsdk.core.GA.Sg.vc(this.tN, this.Sg, this.YFl.YFl());
                    Wwa wwa2 = this.Sg;
                    if (wwa2 != null && wwa2.yn()) {
                        com.bytedance.sdk.openadsdk.core.YoT.vc YFl = vcVar.YFl((List<Pair<View, FriendlyObstructionPurpose>>) null);
                        YFl yFl = this.AlY;
                        if (yFl != null) {
                            yFl.YFl(YFl);
                        }
                    }
                    this.YFl.YFl(vcVar.getNativeVideoController());
                    YFl yFl2 = this.AlY;
                    if (yFl2 != null) {
                        yFl2.YFl(vcVar);
                    }
                    vcVar.setVideoAdClickListenerTTNativeAd(this);
                    vcVar.setAdCreativeClickListener(new vc.YFl() { // from class: com.bytedance.sdk.openadsdk.YFl.Sg.Sg.1
                        @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.vc.YFl
                        public void YFl(View view, int i10) {
                            rkt rktVar = Sg.this.YFl;
                            if (rktVar != null) {
                                rktVar.YFl(view, i10);
                            }
                        }
                    });
                    vcVar.setControllerStatusCallBack(new vc.Sg() { // from class: com.bytedance.sdk.openadsdk.YFl.Sg.Sg.2
                        @Override // com.bytedance.sdk.openadsdk.core.GA.Sg.vc.Sg
                        public void YFl(boolean z11, long j3, long j10, long j11, boolean z12) {
                            Sg.this.NjR.YFl = z11;
                            Sg.this.NjR.wN = j3;
                            Sg.this.NjR.f10775vc = j10;
                            Sg.this.NjR.DSW = j11;
                            Sg.this.NjR.AlY = z12;
                        }
                    });
                    vcVar.setVideoAdLoadListener(this);
                    vcVar.setVideoAdInteractionListener(this);
                    if (5 == this.wN) {
                        if (this.f10522nc) {
                            z10 = this.YoT.isAutoPlay();
                        } else {
                            z10 = this.eT;
                        }
                        vcVar.setIsAutoPlay(z10);
                    } else {
                        vcVar.setIsAutoPlay(this.eT);
                    }
                    vcVar.setIsQuiet(lG.AlY().tN(String.valueOf(this.f10526vc)));
                } catch (Exception e2) {
                    ApmHelper.reportCustomError("", "getAdView null", e2);
                }
                if (!Wwa.wN(this.Sg) && vcVar != null && vcVar.YFl(0L, true, false)) {
                    return vcVar;
                }
                ApmHelper.reportCustomError(this.Sg.ZLB() + "," + vcVar, "getAdView null", new RuntimeException());
            }
            vcVar = null;
            if (!Wwa.wN(this.Sg)) {
            }
            ApmHelper.reportCustomError(this.Sg.ZLB() + "," + vcVar, "getAdView null", new RuntimeException());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (com.bytedance.sdk.openadsdk.utils.Sco.vc(r0) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void YFl(int r5) {
        /*
            r4 = this;
            com.bytedance.sdk.openadsdk.core.settings.vc r0 = com.bytedance.sdk.openadsdk.core.lG.AlY()
            int r5 = r0.Sg(r5)
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.lG.YFl()
            int r0 = com.bytedance.sdk.component.utils.EH.tN(r0)
            r1 = 3
            r2 = 0
            if (r1 != r5) goto L19
            r4.f10522nc = r2
            r4.eT = r2
            goto L54
        L19:
            r1 = 1
            if (r1 != r5) goto L25
            boolean r3 = com.bytedance.sdk.openadsdk.utils.Sco.AlY(r0)
            if (r3 == 0) goto L25
            r4.f10522nc = r2
            goto L52
        L25:
            r3 = 2
            if (r3 != r5) goto L3d
            boolean r5 = com.bytedance.sdk.openadsdk.utils.Sco.wN(r0)
            if (r5 != 0) goto L3a
            boolean r5 = com.bytedance.sdk.openadsdk.utils.Sco.AlY(r0)
            if (r5 != 0) goto L3a
            boolean r5 = com.bytedance.sdk.openadsdk.utils.Sco.vc(r0)
            if (r5 == 0) goto L54
        L3a:
            r4.f10522nc = r2
            goto L52
        L3d:
            r2 = 4
            if (r2 != r5) goto L43
            r4.f10522nc = r1
            goto L54
        L43:
            r2 = 5
            if (r2 != r5) goto L54
            boolean r5 = com.bytedance.sdk.openadsdk.utils.Sco.AlY(r0)
            if (r5 != 0) goto L52
            boolean r5 = com.bytedance.sdk.openadsdk.utils.Sco.vc(r0)
            if (r5 == 0) goto L54
        L52:
            r4.eT = r1
        L54:
            com.bytedance.sdk.openadsdk.YFl.Sg.YFl r5 = r4.AlY
            if (r5 == 0) goto L5d
            boolean r0 = r4.f10522nc
            r5.YFl(r0)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.YFl.Sg.Sg.YFl(int):void");
    }

    public Sg(@NonNull Context context, @NonNull Wwa wwa, int i10, AdSlot adSlot, YFl yFl, rkt rktVar) {
        super(context, wwa, i10, false);
        this.f10522nc = false;
        this.eT = true;
        this.AlY = yFl;
        this.YFl = rktVar;
        this.wN = i10;
        this.YoT = adSlot;
        this.NjR = new com.bytedance.sdk.openadsdk.multipro.Sg.YFl();
        YFl(this.f10526vc);
        YFl("embeded_ad");
        yFl.YFl(this);
    }

    public void YFl(tN tNVar) {
        this.qsH = tNVar;
    }

    @Override // l5.c
    public void YFl(int i10, int i11) {
        tN tNVar = this.qsH;
        if (tNVar != null) {
            tNVar.YFl(i10, i11);
        }
    }

    @Override // l5.f
    public void YFl(long j3, long j10) {
        this.GA = j3;
    }

    @Override // com.bytedance.sdk.openadsdk.YFl.Sg.qsH
    public void YFl(String str) {
        super.YFl(str);
    }
}
