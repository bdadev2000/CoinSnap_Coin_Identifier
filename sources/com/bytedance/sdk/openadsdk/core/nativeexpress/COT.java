package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.core.model.pvr;
import com.bytedance.sdk.openadsdk.core.woN;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.cW;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class COT {
    private static final Set<COT> dT = Collections.synchronizedSet(new HashSet());
    private List<com.bytedance.sdk.openadsdk.core.model.woN> HWF;
    private final Context KS;
    private List<com.bytedance.sdk.openadsdk.core.model.woN> QR;
    private PAGBannerAdLoadListener jU;
    private zp ku;
    private AdSlot zp;
    private final AtomicBoolean COT = new AtomicBoolean(false);
    private int YW = 5;
    private final ScheduledFuture<?> Bj = null;
    private ScheduledFuture<?> vDp = null;
    private ScheduledFuture<?> tG = null;
    private final cW rV = cW.lMd();
    private final com.bytedance.sdk.openadsdk.core.woN lMd = com.bytedance.sdk.openadsdk.core.KVG.KS();

    /* loaded from: classes.dex */
    public interface zp {
        void zp();

        void zp(List<com.bytedance.sdk.openadsdk.core.model.woN> list);
    }

    private COT(Context context) {
        if (context != null) {
            this.KS = context.getApplicationContext();
        } else {
            this.KS = com.bytedance.sdk.openadsdk.core.KVG.zp();
        }
        dT.add(this);
    }

    private void KS(boolean z8) {
        try {
            ScheduledFuture<?> scheduledFuture = this.Bj;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            com.bytedance.sdk.component.utils.tG.zp("ExpressAdLoadManager", "TimeOutFutureTask-->cancel......success=".concat(String.valueOf(this.Bj.cancel(z8))));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(cW cWVar) {
        if (this.jU != null) {
            Iterator<com.bytedance.sdk.openadsdk.core.model.woN> it = this.QR.iterator();
            PAGBannerAd pAGBannerAd = null;
            while (it.hasNext() && (pAGBannerAd = zp(it.next())) == null) {
            }
            if (pAGBannerAd != null) {
                if (!TextUtils.isEmpty(this.zp.getBidAdm())) {
                    com.bytedance.sdk.openadsdk.dT.KS.zp(this.QR.get(0), this.rV.KS());
                }
                this.jU.onAdLoaded(pAGBannerAd);
            } else {
                this.jU.onError(103, com.bytedance.sdk.openadsdk.core.QR.zp(103));
                zp(103);
            }
        }
    }

    public static COT zp(Context context) {
        return new COT(context);
    }

    public void zp(AdSlot adSlot, int i9, @NonNull com.bytedance.sdk.openadsdk.common.KS ks, int i10) {
        zp(adSlot, i9, ks, null, i10);
    }

    public void zp(AdSlot adSlot, int i9, @Nullable com.bytedance.sdk.openadsdk.common.KS ks, @Nullable zp zpVar, int i10) {
        this.rV.jU();
        if (this.COT.get()) {
            com.bytedance.sdk.component.utils.tG.zp("ExpressAdLoadManager", "express ad is loading...");
            return;
        }
        this.YW = i9;
        this.COT.set(true);
        this.zp = adSlot;
        if (ks instanceof PAGBannerAdLoadListener) {
            this.jU = (PAGBannerAdLoadListener) ks;
        }
        this.ku = zpVar;
        zp(adSlot, ks);
    }

    private void lMd(boolean z8) {
        try {
            ScheduledFuture<?> scheduledFuture = this.tG;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.tG.cancel(z8);
        } catch (Throwable unused) {
        }
    }

    private void lMd() {
        dT.remove(this);
    }

    private void zp(final AdSlot adSlot, com.bytedance.sdk.openadsdk.common.KS ks) {
        if (adSlot == null) {
            return;
        }
        pvr pvrVar = new pvr();
        pvrVar.ku = 2;
        this.lMd.zp(adSlot, pvrVar, this.YW, new woN.zp() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.COT.1
            @Override // com.bytedance.sdk.openadsdk.core.woN.zp
            public void zp(int i9, String str) {
                COT.this.zp(i9, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.woN.zp
            public void zp(com.bytedance.sdk.openadsdk.core.model.zp zpVar, com.bytedance.sdk.openadsdk.core.model.lMd lmd) {
                if (zpVar.KS() == null || zpVar.KS().isEmpty()) {
                    COT.this.zp(-3, com.bytedance.sdk.openadsdk.core.QR.zp(-3));
                    lmd.zp(-3);
                    com.bytedance.sdk.openadsdk.core.model.lMd.zp(lmd);
                    return;
                }
                COT.this.HWF = zpVar.KS();
                COT.this.QR = zpVar.KS();
                COT.this.zp(adSlot);
                COT cot = COT.this;
                cot.zp(cot.rV);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(AdSlot adSlot) {
        List<com.bytedance.sdk.openadsdk.core.model.woN> list = this.HWF;
        if (list == null) {
            return;
        }
        for (com.bytedance.sdk.openadsdk.core.model.woN won : list) {
            if (com.bytedance.sdk.openadsdk.core.model.woN.COT(won) && won.eWG() != null && won.eWG().Bj() != null) {
                if (com.bytedance.sdk.openadsdk.core.KVG.jU().COT(String.valueOf(won.FGx())) && com.bytedance.sdk.openadsdk.core.KVG.jU().fgJ()) {
                    com.bytedance.sdk.openadsdk.core.video.zp.lMd zp2 = com.bytedance.sdk.openadsdk.core.model.woN.zp(CacheDirFactory.getICacheDir(won.jyq()).KS(), won);
                    zp2.zp("material_meta", won);
                    zp2.zp("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.video.jU.zp.zp(zp2, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(final cW cWVar) {
        if (this.COT.getAndSet(false)) {
            QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.COT.2
                @Override // java.lang.Runnable
                public void run() {
                    if (COT.this.QR != null && COT.this.QR.size() > 0) {
                        COT.this.lMd(cWVar);
                        if (COT.this.ku != null) {
                            COT.this.ku.zp(COT.this.QR);
                        }
                    } else if (COT.this.ku != null) {
                        COT.this.ku.zp();
                    }
                    COT.this.zp();
                }
            });
        }
    }

    private void zp(int i9) {
        String str;
        List<com.bytedance.sdk.openadsdk.core.model.woN> list = this.HWF;
        if (list != null && list.size() > 0) {
            str = this.HWF.get(0).Gor();
        } else {
            str = "";
        }
        com.bytedance.sdk.openadsdk.dT.KS.zp().zp(com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp(this.YW).KS(this.zp.getCodeId()).COT(str).lMd(i9).HWF(com.bytedance.sdk.openadsdk.core.QR.zp(i9)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(int i9, String str) {
        if (this.COT.getAndSet(false)) {
            PAGBannerAdLoadListener pAGBannerAdLoadListener = this.jU;
            if (pAGBannerAdLoadListener != null) {
                pAGBannerAdLoadListener.onError(i9, str);
            }
            zp zpVar = this.ku;
            if (zpVar != null) {
                zpVar.zp();
            }
            zp();
        }
    }

    private PAGBannerAd zp(com.bytedance.sdk.openadsdk.core.model.woN won) {
        if (this.YW != 1) {
            return null;
        }
        if (won.eWG() != null) {
            return new com.bytedance.sdk.openadsdk.core.bannerexpress.KS(this.KS, won, this.zp);
        }
        return new com.bytedance.sdk.openadsdk.core.bannerexpress.zp(this.KS, won, this.zp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp() {
        List<com.bytedance.sdk.openadsdk.core.model.woN> list = this.HWF;
        if (list != null) {
            list.clear();
        }
        List<com.bytedance.sdk.openadsdk.core.model.woN> list2 = this.QR;
        if (list2 != null) {
            list2.clear();
        }
        zp(true);
        lMd(true);
        KS(true);
        lMd();
    }

    private void zp(boolean z8) {
        try {
            ScheduledFuture<?> scheduledFuture = this.vDp;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            com.bytedance.sdk.component.utils.tG.zp("ExpressAdLoadManager", "CheckValidFutureTask-->cancel......success=".concat(String.valueOf(this.vDp.cancel(z8))));
        } catch (Throwable unused) {
        }
    }
}
