package com.bytedance.sdk.openadsdk.apiImpl.feed;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.component.video.api.jU.KS;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.dQp;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.multipro.lMd.zp;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.List;

/* loaded from: classes.dex */
public class lMd extends ku implements KS.InterfaceC0050KS, KS.jU, zp.InterfaceC0125zp {
    private boolean Bj;
    private final com.bytedance.sdk.openadsdk.multipro.lMd.zp YW;
    private boolean dT;
    private KS ku;
    private long tG;
    private AdSlot vDp;

    public lMd(@NonNull Context context, @NonNull woN won, int i9, AdSlot adSlot) {
        super(context, won, i9, true);
        this.dT = false;
        this.Bj = true;
        this.COT = i9;
        this.vDp = adSlot;
        this.YW = new com.bytedance.sdk.openadsdk.multipro.lMd.zp();
        zp(this.HWF);
        zp("embeded_ad");
        this.jU.zp(this);
    }

    public View COT() {
        NativeVideoTsView nativeVideoTsView;
        boolean z8;
        woN won = this.lMd;
        if (won != null && this.KS != null) {
            if (woN.COT(won)) {
                try {
                    nativeVideoTsView = new NativeVideoTsView(this.KS, this.lMd, this.zp.zp());
                    woN won2 = this.lMd;
                    if (won2 != null && won2.Fm()) {
                        com.bytedance.sdk.openadsdk.core.QR.HWF zp = nativeVideoTsView.zp((List<Pair<View, FriendlyObstructionPurpose>>) null);
                        zp zpVar = this.jU;
                        if (zpVar != null) {
                            zpVar.zp(zp);
                        }
                    }
                    this.zp.zp(nativeVideoTsView.getNativeVideoController());
                    zp zpVar2 = this.jU;
                    if (zpVar2 != null) {
                        zpVar2.zp(nativeVideoTsView);
                    }
                    nativeVideoTsView.setVideoAdClickListenerTTNativeAd(this);
                    nativeVideoTsView.setAdCreativeClickListener(new NativeVideoTsView.zp() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.lMd.1
                        @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.zp
                        public void zp(View view, int i9) {
                            dQp dqp = lMd.this.zp;
                            if (dqp != null) {
                                dqp.zp(view, i9);
                            }
                        }
                    });
                    nativeVideoTsView.setControllerStatusCallBack(new NativeVideoTsView.lMd() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.lMd.2
                        @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.lMd
                        public void zp(boolean z9, long j7, long j9, long j10, boolean z10) {
                            lMd.this.YW.zp = z9;
                            lMd.this.YW.COT = j7;
                            lMd.this.YW.HWF = j9;
                            lMd.this.YW.QR = j10;
                            lMd.this.YW.jU = z10;
                        }
                    });
                    nativeVideoTsView.setVideoAdLoadListener(this);
                    nativeVideoTsView.setVideoAdInteractionListener(this);
                    if (5 == this.COT) {
                        if (this.dT) {
                            z8 = this.vDp.isAutoPlay();
                        } else {
                            z8 = this.Bj;
                        }
                        nativeVideoTsView.setIsAutoPlay(z8);
                    } else {
                        nativeVideoTsView.setIsAutoPlay(this.Bj);
                    }
                    nativeVideoTsView.setIsQuiet(KVG.jU().KS(String.valueOf(this.HWF)));
                } catch (Exception e4) {
                    ApmHelper.reportCustomError("", "getAdView null", e4);
                }
                if (!woN.COT(this.lMd) && nativeVideoTsView != null && nativeVideoTsView.zp(0L, true, false)) {
                    return nativeVideoTsView;
                }
                ApmHelper.reportCustomError(this.lMd.mW() + "," + nativeVideoTsView, "getAdView null", new RuntimeException());
            }
            nativeVideoTsView = null;
            if (!woN.COT(this.lMd)) {
            }
            ApmHelper.reportCustomError(this.lMd.mW() + "," + nativeVideoTsView, "getAdView null", new RuntimeException());
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.lMd.zp.InterfaceC0125zp
    public com.bytedance.sdk.openadsdk.multipro.lMd.zp HWF() {
        return this.YW;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.InterfaceC0050KS
    public void b_() {
        KS ks = this.ku;
        if (ks != null) {
            ks.zp(this);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.InterfaceC0050KS
    public void e_() {
        KS ks = this.ku;
        if (ks != null) {
            ks.lMd(this);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.InterfaceC0050KS
    public void f_() {
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.InterfaceC0050KS
    public void g_() {
        KS ks = this.ku;
        if (ks != null) {
            ks.KS(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.ku, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
        zp zpVar = this.jU;
        if (zpVar != null) {
            zpVar.vDp();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (com.bytedance.sdk.openadsdk.utils.YhE.HWF(r0) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void zp(int r5) {
        /*
            r4 = this;
            com.bytedance.sdk.openadsdk.core.settings.COT r0 = com.bytedance.sdk.openadsdk.core.KVG.jU()
            int r5 = r0.lMd(r5)
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.KVG.zp()
            int r0 = com.bytedance.sdk.component.utils.KVG.KS(r0)
            r1 = 3
            r2 = 0
            if (r1 != r5) goto L19
            r4.dT = r2
            r4.Bj = r2
            goto L54
        L19:
            r1 = 1
            if (r1 != r5) goto L25
            boolean r3 = com.bytedance.sdk.openadsdk.utils.YhE.jU(r0)
            if (r3 == 0) goto L25
            r4.dT = r2
            goto L52
        L25:
            r3 = 2
            if (r3 != r5) goto L3d
            boolean r5 = com.bytedance.sdk.openadsdk.utils.YhE.COT(r0)
            if (r5 != 0) goto L3a
            boolean r5 = com.bytedance.sdk.openadsdk.utils.YhE.jU(r0)
            if (r5 != 0) goto L3a
            boolean r5 = com.bytedance.sdk.openadsdk.utils.YhE.HWF(r0)
            if (r5 == 0) goto L54
        L3a:
            r4.dT = r2
            goto L52
        L3d:
            r2 = 4
            if (r2 != r5) goto L43
            r4.dT = r1
            goto L54
        L43:
            r2 = 5
            if (r2 != r5) goto L54
            boolean r5 = com.bytedance.sdk.openadsdk.utils.YhE.jU(r0)
            if (r5 != 0) goto L52
            boolean r5 = com.bytedance.sdk.openadsdk.utils.YhE.HWF(r0)
            if (r5 == 0) goto L54
        L52:
            r4.Bj = r1
        L54:
            com.bytedance.sdk.openadsdk.apiImpl.feed.zp r5 = r4.jU
            if (r5 == 0) goto L5d
            boolean r0 = r4.dT
            r5.zp(r0)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.apiImpl.feed.lMd.zp(int):void");
    }

    public lMd(@NonNull Context context, @NonNull woN won, int i9, AdSlot adSlot, zp zpVar, dQp dqp) {
        super(context, won, i9, false);
        this.dT = false;
        this.Bj = true;
        this.jU = zpVar;
        this.zp = dqp;
        this.COT = i9;
        this.vDp = adSlot;
        this.YW = new com.bytedance.sdk.openadsdk.multipro.lMd.zp();
        zp(this.HWF);
        zp("embeded_ad");
        zpVar.zp(this);
    }

    public void zp(KS ks) {
        this.ku = ks;
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.jU
    public void zp(int i9, int i10) {
        KS ks = this.ku;
        if (ks != null) {
            ks.zp(i9, i10);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.jU.KS.InterfaceC0050KS
    public void zp(long j7, long j9) {
        this.tG = j7;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.ku
    public void zp(String str) {
        super.zp(str);
    }
}
