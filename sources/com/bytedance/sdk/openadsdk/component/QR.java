package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.ku.ku;
import com.bytedance.sdk.component.utils.RCv;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.HWF;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.ot;
import com.bytedance.sdk.openadsdk.core.model.pvr;
import com.bytedance.sdk.openadsdk.core.settings.dQp;
import com.bytedance.sdk.openadsdk.core.tG;
import com.bytedance.sdk.openadsdk.core.woN;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.cW;
import com.vungle.ads.internal.protos.g;
import com.vungle.ads.o1;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class QR implements RCv.zp {
    private boolean Bj;
    private AdSlot HWF;
    private final HWF KS;
    private PAGAppOpenAdLoadListener QR;
    private int ku;
    private final woN<com.bytedance.sdk.openadsdk.lMd.zp> lMd;
    private final Context zp;
    private final AtomicBoolean jU = new AtomicBoolean(false);
    private int COT = 0;
    private volatile int YW = 0;
    private final ot dT = new ot();

    public QR(Context context) {
        if (context != null) {
            this.zp = context.getApplicationContext();
        } else {
            this.zp = KVG.zp();
        }
        this.lMd = KVG.KS();
        this.KS = HWF.zp(this.zp);
    }

    private void lMd(@NonNull final AdSlot adSlot) {
        final cW zp = cW.zp();
        this.YW = 1;
        pvr pvrVar = new pvr();
        pvrVar.dT = this.dT;
        pvrVar.jU = 1;
        pvrVar.ku = 2;
        this.lMd.zp(adSlot, pvrVar, 3, new woN.zp() { // from class: com.bytedance.sdk.openadsdk.component.QR.1
            @Override // com.bytedance.sdk.openadsdk.core.woN.zp
            public void zp(int i9, String str) {
                QR.this.YW = 3;
                QR.this.zp(new com.bytedance.sdk.openadsdk.component.COT.lMd(2, 100, i9, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.woN.zp
            public void zp(com.bytedance.sdk.openadsdk.core.model.zp zpVar, com.bytedance.sdk.openadsdk.core.model.lMd lmd) {
                QR.this.YW = 2;
                if (zpVar == null || zpVar.KS() == null || zpVar.KS().size() == 0) {
                    QR.this.YW = 3;
                    QR.this.zp(new com.bytedance.sdk.openadsdk.component.COT.lMd(2, 100, g.AD_SERVER_ERROR_VALUE, com.bytedance.sdk.openadsdk.core.QR.zp(g.AD_SERVER_ERROR_VALUE)));
                    lmd.zp(-3);
                    com.bytedance.sdk.openadsdk.core.model.lMd.zp(lmd);
                    return;
                }
                final com.bytedance.sdk.openadsdk.core.model.woN won = zpVar.KS().get(0);
                long vDp = won.vDp();
                QR.this.dT.lMd = vDp;
                if (won.hG()) {
                    QR.this.zp(new com.bytedance.sdk.openadsdk.component.COT.lMd(1, 100, won));
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.woN.COT(won)) {
                    int vDp2 = KVG.jU().vDp();
                    if (vDp2 == 1 || vDp2 == 3) {
                        QR.this.dT.lMd = -1L;
                        QR.this.dT.zp(3);
                        QR.this.zp(new com.bytedance.sdk.openadsdk.component.COT.lMd(1, 100, won));
                        QR.this.zp(won, adSlot, false);
                        return;
                    }
                    QR.this.zp(won, adSlot, !r11.dT.zp);
                } else {
                    if (KVG.jU().Bj() == 1) {
                        QR.this.dT.lMd = -1L;
                        QR.this.dT.zp(3);
                        QR.this.zp(new com.bytedance.sdk.openadsdk.component.COT.lMd(1, 100, won));
                        QR.this.zp(won, false);
                        return;
                    }
                    QR.this.zp(won, !r11.dT.zp);
                }
                if (QR.this.dT.zp) {
                    com.bytedance.sdk.openadsdk.dT.KS.zp(won, zp.KS());
                    if (vDp == 0) {
                        QR.this.dT.zp(2);
                        QR.this.zp(new com.bytedance.sdk.openadsdk.component.COT.lMd(1, 100, won));
                    } else {
                        tG.lMd().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.QR.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                QR.this.dT.zp(2);
                                QR.this.zp(new com.bytedance.sdk.openadsdk.component.COT.lMd(1, 100, won));
                            }
                        }, vDp);
                    }
                }
            }
        });
    }

    public static QR zp(Context context) {
        return new QR(context);
    }

    public void zp(@NonNull AdSlot adSlot, com.bytedance.sdk.openadsdk.common.KS ks, int i9) {
        if (ks == null) {
            return;
        }
        if (i9 <= 0) {
            i9 = 3500;
        }
        this.HWF = adSlot;
        this.dT.zp = !TextUtils.isEmpty(adSlot.getBidAdm());
        if (ks instanceof PAGAppOpenAdLoadListener) {
            this.QR = (PAGAppOpenAdLoadListener) ks;
        }
        this.COT = zp(this.HWF);
        this.ku = i9;
        this.dT.zp(cW.zp());
        if (this.dT.zp || dQp.etV().RCv(this.HWF.getCodeId()) == 0) {
            lMd(this.HWF);
        }
        if (this.dT.zp) {
            return;
        }
        new RCv(tG.lMd().getLooper(), this).sendEmptyMessageDelayed(1, i9);
        zp();
    }

    private void zp() {
        QUv.lMd(new ku("tryGetAppOpenAdFromCache") { // from class: com.bytedance.sdk.openadsdk.component.QR.2
            @Override // java.lang.Runnable
            public void run() {
                int vDp;
                com.bytedance.sdk.openadsdk.core.model.woN COT = QR.this.KS.COT(QR.this.COT);
                if (COT == null) {
                    QR.this.zp(false);
                    return;
                }
                boolean COT2 = com.bytedance.sdk.openadsdk.core.model.woN.COT(COT);
                if (COT.hG()) {
                    QR.this.zp(new com.bytedance.sdk.openadsdk.component.COT.lMd(1, 101, COT));
                    return;
                }
                if (!COT2 && KVG.jU().Bj() == 1) {
                    QR.this.zp(new com.bytedance.sdk.openadsdk.component.COT.lMd(1, 101, COT));
                    return;
                }
                if (COT2 && ((vDp = KVG.jU().vDp()) == 2 || vDp == 3)) {
                    QR.this.zp(new com.bytedance.sdk.openadsdk.component.COT.lMd(1, 101, COT));
                    return;
                }
                if (!QR.this.KS.lMd(QR.this.COT) && !QR.this.KS.jU(QR.this.COT)) {
                    QR.this.zp(true);
                    return;
                }
                if (dQp.etV().RCv(QR.this.HWF.getCodeId()) == 0) {
                    QR.this.KS.QR(QR.this.COT);
                }
                if (COT2) {
                    if (!TextUtils.isEmpty(QR.this.KS.zp(COT))) {
                        QR.this.zp(new com.bytedance.sdk.openadsdk.component.COT.lMd(1, 101, COT));
                        return;
                    } else {
                        QR.this.zp(false);
                        com.bytedance.sdk.openadsdk.component.jU.zp.lMd(COT);
                        return;
                    }
                }
                if (QR.this.KS.lMd(COT)) {
                    QR.this.zp(new com.bytedance.sdk.openadsdk.component.COT.lMd(1, 101, COT));
                } else {
                    QR.this.zp(false);
                    com.bytedance.sdk.openadsdk.component.jU.zp.lMd(COT);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(boolean z8) {
        if (z8) {
            this.KS.QR(this.COT);
        }
        if (dQp.etV().RCv(this.HWF.getCodeId()) == 1) {
            lMd(this.HWF);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(@NonNull final com.bytedance.sdk.openadsdk.core.model.woN won, AdSlot adSlot, final boolean z8) {
        this.KS.zp(won, adSlot, this.dT, new HWF.KS() { // from class: com.bytedance.sdk.openadsdk.component.QR.3
            @Override // com.bytedance.sdk.openadsdk.component.HWF.KS
            public void zp() {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: video load success");
                if (z8) {
                    QR.this.YW = 4;
                    com.bytedance.sdk.openadsdk.component.COT.lMd lmd = new com.bytedance.sdk.openadsdk.component.COT.lMd(1, 100, won);
                    lmd.zp(true);
                    QR.this.zp(lmd);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.HWF.KS
            public void zp(int i9, String str) {
                if (z8) {
                    QR.this.YW = 5;
                    QR.this.zp(new com.bytedance.sdk.openadsdk.component.COT.lMd(2, 100, o1.CONFIGURATION_ERROR, com.bytedance.sdk.openadsdk.core.QR.zp(o1.CONFIGURATION_ERROR)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(@NonNull final com.bytedance.sdk.openadsdk.core.model.woN won, final boolean z8) {
        this.KS.zp(won, this.dT, new HWF.lMd() { // from class: com.bytedance.sdk.openadsdk.component.QR.4
            @Override // com.bytedance.sdk.openadsdk.component.HWF.lMd
            public void zp(com.bytedance.sdk.openadsdk.Bj.zp.lMd lmd) {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: image load success");
                if (z8) {
                    QR.this.YW = 4;
                    com.bytedance.sdk.openadsdk.component.COT.lMd lmd2 = new com.bytedance.sdk.openadsdk.component.COT.lMd(1, 100, won);
                    lmd2.zp(true);
                    QR.this.zp(lmd2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.HWF.lMd
            public void zp() {
                Log.d("TTAppOpenAdLoadManager", "preLoadFail: image load fail");
                if (z8) {
                    QR.this.YW = 5;
                    QR.this.zp(new com.bytedance.sdk.openadsdk.component.COT.lMd(2, 100, o1.CONFIGURATION_ERROR, com.bytedance.sdk.openadsdk.core.QR.zp(o1.CONFIGURATION_ERROR)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(com.bytedance.sdk.openadsdk.component.COT.lMd lmd) {
        int lMd = lmd.lMd();
        int KS = lmd.KS();
        if (this.jU.get()) {
            if (lMd == 1 && KS == 100 && lmd.zp()) {
                HWF.zp(KVG.zp()).zp(new com.bytedance.sdk.openadsdk.component.COT.zp(this.COT, lmd.jU()));
                if (this.Bj) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.jU.zp.zp(lmd.jU(), 1, this.dT);
                return;
            }
            return;
        }
        if (lMd != 1) {
            if (lMd == 2 || lMd == 3) {
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.QR;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(lmd.COT(), lmd.HWF());
                }
                this.jU.set(true);
                if (lMd == 3) {
                    com.bytedance.sdk.openadsdk.component.jU.zp.zp(this.YW, this.ku);
                    return;
                }
                return;
            }
            return;
        }
        if (this.QR != null) {
            this.QR.onAdLoaded(new jU(this.zp, lmd.jU(), KS == 101, this.HWF));
        }
        this.jU.set(true);
        if (KS == 101) {
            com.bytedance.sdk.openadsdk.component.jU.zp.zp(lmd.jU(), this.dT.zp().KS());
            return;
        }
        if (KS == 100) {
            com.bytedance.sdk.openadsdk.component.jU.zp.zp(lmd.jU(), 0, this.dT);
            this.Bj = true;
            if (this.dT.zp) {
                return;
            }
            if (dQp.etV().RCv(this.HWF.getCodeId()) == 0) {
                this.KS.zp(this.HWF);
            } else {
                this.KS.zp(new com.bytedance.sdk.openadsdk.component.COT.zp(this.COT, lmd.jU()));
            }
        }
    }

    public int zp(@NonNull AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.RCv.zp
    public void zp(Message message) {
        if (message.what != 1 || this.jU.get()) {
            return;
        }
        zp(new com.bytedance.sdk.openadsdk.component.COT.lMd(3, 102, g.AD_LOAD_TOO_FREQUENTLY_VALUE, com.bytedance.sdk.openadsdk.core.QR.zp(g.AD_LOAD_TOO_FREQUENTLY_VALUE)));
    }
}
