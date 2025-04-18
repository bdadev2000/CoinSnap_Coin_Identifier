package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.vc;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.aIu;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.core.qO;
import com.bytedance.sdk.openadsdk.core.qsH;
import com.bytedance.sdk.openadsdk.core.settings.rkt;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.bytedance.sdk.openadsdk.utils.zB;
import com.vungle.ads.internal.protos.g;
import com.vungle.ads.n3;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class DSW implements bZ.YFl {
    private PAGAppOpenAdLoadListener DSW;
    private final qO<com.bytedance.sdk.openadsdk.AlY.YFl> Sg;
    private final Context YFl;
    private boolean eT;
    private int qsH;
    private final vc tN;

    /* renamed from: vc, reason: collision with root package name */
    private AdSlot f10571vc;
    private final AtomicBoolean AlY = new AtomicBoolean(false);
    private int wN = 0;
    private volatile int NjR = 0;

    /* renamed from: nc, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.model.bZ f10570nc = new com.bytedance.sdk.openadsdk.core.model.bZ();

    public DSW(Context context) {
        if (context != null) {
            this.YFl = context.getApplicationContext();
        } else {
            this.YFl = lG.YFl();
        }
        this.Sg = lG.tN();
        this.tN = vc.YFl(this.YFl);
    }

    private void Sg(@NonNull final AdSlot adSlot) {
        final zB YFl = zB.YFl();
        this.NjR = 1;
        aIu aiu = new aIu();
        aiu.f10701nc = this.f10570nc;
        aiu.AlY = 1;
        aiu.qsH = 2;
        this.Sg.YFl(adSlot, aiu, 3, new qO.YFl() { // from class: com.bytedance.sdk.openadsdk.component.DSW.1
            @Override // com.bytedance.sdk.openadsdk.core.qO.YFl
            public void YFl(int i10, String str) {
                DSW.this.NjR = 3;
                DSW.this.YFl(new com.bytedance.sdk.openadsdk.component.wN.Sg(2, 100, i10, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.qO.YFl
            public void YFl(com.bytedance.sdk.openadsdk.core.model.YFl yFl, com.bytedance.sdk.openadsdk.core.model.Sg sg2) {
                DSW.this.NjR = 2;
                if (yFl == null || yFl.tN() == null || yFl.tN().size() == 0) {
                    DSW.this.NjR = 3;
                    DSW.this.YFl(new com.bytedance.sdk.openadsdk.component.wN.Sg(2, 100, g.AD_SERVER_ERROR_VALUE, qsH.YFl(g.AD_SERVER_ERROR_VALUE)));
                    sg2.YFl(-3);
                    com.bytedance.sdk.openadsdk.core.model.Sg.YFl(sg2);
                    return;
                }
                final Wwa wwa = yFl.tN().get(0);
                long pDU = wwa.pDU();
                DSW.this.f10570nc.Sg = pDU;
                boolean vc2 = Wwa.vc(wwa);
                if (wwa.Zu()) {
                    DSW.this.YFl(new com.bytedance.sdk.openadsdk.component.wN.Sg(1, 100, wwa));
                    return;
                }
                if (vc2) {
                    DSW.this.YFl(new com.bytedance.sdk.openadsdk.component.wN.Sg(1, 100, wwa));
                    if (Wwa.wN(wwa)) {
                        DSW.this.YFl(wwa, adSlot, false);
                        return;
                    } else {
                        DSW.this.YFl(wwa, false);
                        return;
                    }
                }
                if (Wwa.wN(wwa)) {
                    int YoT = lG.AlY().YoT();
                    if (YoT == 1 || YoT == 3) {
                        DSW.this.f10570nc.Sg = -1L;
                        DSW.this.f10570nc.YFl(3);
                        DSW.this.YFl(new com.bytedance.sdk.openadsdk.component.wN.Sg(1, 100, wwa));
                        DSW.this.YFl(wwa, adSlot, false);
                        return;
                    }
                    DSW.this.YFl(wwa, adSlot, !r12.f10570nc.YFl);
                } else {
                    if (lG.AlY().eT() == 1) {
                        DSW.this.f10570nc.Sg = -1L;
                        DSW.this.f10570nc.YFl(3);
                        DSW.this.YFl(new com.bytedance.sdk.openadsdk.component.wN.Sg(1, 100, wwa));
                        DSW.this.YFl(wwa, false);
                        return;
                    }
                    DSW.this.YFl(wwa, !r12.f10570nc.YFl);
                }
                if (DSW.this.f10570nc.YFl) {
                    com.bytedance.sdk.openadsdk.pDU.tN.YFl(wwa, YFl.tN());
                    if (pDU == 0) {
                        DSW.this.f10570nc.YFl(2);
                        DSW.this.YFl(new com.bytedance.sdk.openadsdk.component.wN.Sg(1, 100, wwa));
                    } else {
                        pDU.Sg().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.DSW.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                DSW.this.f10570nc.YFl(2);
                                DSW.this.YFl(new com.bytedance.sdk.openadsdk.component.wN.Sg(1, 100, wwa));
                            }
                        }, pDU);
                    }
                }
            }
        });
    }

    public static DSW YFl(Context context) {
        return new DSW(context);
    }

    public void YFl(@NonNull AdSlot adSlot, com.bytedance.sdk.openadsdk.common.wN wNVar, int i10) {
        if (wNVar == null) {
            return;
        }
        if (i10 <= 0) {
            i10 = 3500;
        }
        this.f10571vc = adSlot;
        this.f10570nc.YFl = !TextUtils.isEmpty(adSlot.getBidAdm());
        if (wNVar instanceof PAGAppOpenAdLoadListener) {
            this.DSW = (PAGAppOpenAdLoadListener) wNVar;
        }
        this.wN = YFl(this.f10571vc);
        this.qsH = i10;
        this.f10570nc.YFl(zB.YFl());
        if (this.f10570nc.YFl || rkt.JwO().UZM(this.f10571vc.getCodeId()) == 0) {
            Sg(this.f10571vc);
        }
        if (this.f10570nc.YFl) {
            return;
        }
        new bZ(pDU.Sg().getLooper(), this).sendEmptyMessageDelayed(1, i10);
        YFl();
    }

    private void YFl() {
        mn.Sg(new com.bytedance.sdk.component.qsH.qsH("tryGetAppOpenAdFromCache") { // from class: com.bytedance.sdk.openadsdk.component.DSW.2
            @Override // java.lang.Runnable
            public void run() {
                int YoT;
                Wwa wN = DSW.this.tN.wN(DSW.this.wN);
                if (wN == null) {
                    DSW.this.YFl(false);
                    return;
                }
                boolean wN2 = Wwa.wN(wN);
                if (wN.Zu()) {
                    DSW.this.YFl(new com.bytedance.sdk.openadsdk.component.wN.Sg(1, 101, wN));
                    return;
                }
                if (!wN2 && lG.AlY().eT() == 1) {
                    DSW.this.YFl(new com.bytedance.sdk.openadsdk.component.wN.Sg(1, 101, wN));
                    return;
                }
                if (wN2 && ((YoT = lG.AlY().YoT()) == 2 || YoT == 3)) {
                    DSW.this.YFl(new com.bytedance.sdk.openadsdk.component.wN.Sg(1, 101, wN));
                    return;
                }
                if (!DSW.this.tN.Sg(DSW.this.wN) && !DSW.this.tN.AlY(DSW.this.wN)) {
                    DSW.this.YFl(true);
                    return;
                }
                if (rkt.JwO().UZM(DSW.this.f10571vc.getCodeId()) == 0) {
                    DSW.this.tN.DSW(DSW.this.wN);
                }
                if (wN2) {
                    if (!TextUtils.isEmpty(DSW.this.tN.YFl(wN))) {
                        DSW.this.YFl(new com.bytedance.sdk.openadsdk.component.wN.Sg(1, 101, wN));
                        return;
                    } else {
                        DSW.this.YFl(false);
                        com.bytedance.sdk.openadsdk.component.AlY.YFl.Sg(wN);
                        return;
                    }
                }
                if (DSW.this.tN.Sg(wN)) {
                    DSW.this.YFl(new com.bytedance.sdk.openadsdk.component.wN.Sg(1, 101, wN));
                } else {
                    DSW.this.YFl(false);
                    com.bytedance.sdk.openadsdk.component.AlY.YFl.Sg(wN);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(boolean z10) {
        if (z10) {
            this.tN.DSW(this.wN);
        }
        if (rkt.JwO().UZM(this.f10571vc.getCodeId()) == 1) {
            Sg(this.f10571vc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(@NonNull final Wwa wwa, AdSlot adSlot, final boolean z10) {
        this.tN.YFl(wwa, adSlot, this.f10570nc, new vc.tN() { // from class: com.bytedance.sdk.openadsdk.component.DSW.3
            @Override // com.bytedance.sdk.openadsdk.component.vc.tN
            public void YFl() {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: video load success");
                if (z10) {
                    DSW.this.NjR = 4;
                    com.bytedance.sdk.openadsdk.component.wN.Sg sg2 = new com.bytedance.sdk.openadsdk.component.wN.Sg(1, 100, wwa);
                    sg2.YFl(true);
                    DSW.this.YFl(sg2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.vc.tN
            public void YFl(int i10, String str) {
                if (z10) {
                    DSW.this.NjR = 5;
                    DSW.this.YFl(new com.bytedance.sdk.openadsdk.component.wN.Sg(2, 100, n3.CONFIGURATION_ERROR, qsH.YFl(n3.CONFIGURATION_ERROR)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(@NonNull final Wwa wwa, final boolean z10) {
        this.tN.YFl(wwa, this.f10570nc, new vc.Sg() { // from class: com.bytedance.sdk.openadsdk.component.DSW.4
            @Override // com.bytedance.sdk.openadsdk.component.vc.Sg
            public void YFl(com.bytedance.sdk.openadsdk.lG.YFl.Sg sg2) {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: image load success");
                if (z10) {
                    DSW.this.NjR = 4;
                    com.bytedance.sdk.openadsdk.component.wN.Sg sg3 = new com.bytedance.sdk.openadsdk.component.wN.Sg(1, 100, wwa);
                    sg3.YFl(true);
                    DSW.this.YFl(sg3);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.vc.Sg
            public void YFl() {
                Log.d("TTAppOpenAdLoadManager", "preLoadFail: image load fail");
                if (z10) {
                    DSW.this.NjR = 5;
                    DSW.this.YFl(new com.bytedance.sdk.openadsdk.component.wN.Sg(2, 100, n3.CONFIGURATION_ERROR, qsH.YFl(n3.CONFIGURATION_ERROR)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(com.bytedance.sdk.openadsdk.component.wN.Sg sg2) {
        int Sg = sg2.Sg();
        int tN = sg2.tN();
        if (this.AlY.get()) {
            if (Sg == 1 && tN == 100 && sg2.YFl()) {
                vc.YFl(lG.YFl()).YFl(new com.bytedance.sdk.openadsdk.component.wN.YFl(this.wN, sg2.AlY()));
                if (this.eT) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.AlY.YFl.YFl(sg2.AlY(), 1, this.f10570nc);
                return;
            }
            return;
        }
        if (Sg != 1) {
            if (Sg == 2 || Sg == 3) {
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.DSW;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(sg2.wN(), sg2.vc());
                }
                this.AlY.set(true);
                if (Sg == 3) {
                    com.bytedance.sdk.openadsdk.component.AlY.YFl.YFl(this.NjR, this.qsH);
                    return;
                }
                return;
            }
            return;
        }
        if (this.DSW != null) {
            this.DSW.onAdLoaded(new AlY(this.YFl, sg2.AlY(), tN == 101, this.f10571vc));
        }
        this.AlY.set(true);
        if (tN == 101) {
            com.bytedance.sdk.openadsdk.component.AlY.YFl.YFl(sg2.AlY(), this.f10570nc.YFl().tN());
            return;
        }
        if (tN == 100) {
            com.bytedance.sdk.openadsdk.component.AlY.YFl.YFl(sg2.AlY(), 0, this.f10570nc);
            this.eT = true;
            if (this.f10570nc.YFl || Wwa.vc(sg2.AlY())) {
                return;
            }
            if (rkt.JwO().UZM(this.f10571vc.getCodeId()) == 0) {
                this.tN.YFl(this.f10571vc);
            } else {
                this.tN.YFl(new com.bytedance.sdk.openadsdk.component.wN.YFl(this.wN, sg2.AlY()));
            }
        }
    }

    public int YFl(@NonNull AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.bZ.YFl
    public void YFl(Message message) {
        if (message.what != 1 || this.AlY.get()) {
            return;
        }
        YFl(new com.bytedance.sdk.openadsdk.component.wN.Sg(3, 102, g.AD_LOAD_TOO_FREQUENTLY_VALUE, qsH.YFl(g.AD_LOAD_TOO_FREQUENTLY_VALUE)));
    }
}
