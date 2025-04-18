package com.bytedance.sdk.openadsdk.core.qsH;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.core.qO;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.bytedance.sdk.openadsdk.utils.zB;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import m2.l;

/* loaded from: classes.dex */
public class DSW {

    /* renamed from: nc, reason: collision with root package name */
    private static final Set<DSW> f10720nc = Collections.synchronizedSet(new HashSet());
    private PAGBannerAdLoadListener AlY;
    private List<com.bytedance.sdk.openadsdk.core.model.Wwa> DSW;
    private AdSlot YFl;
    private YFl qsH;
    private final Context tN;

    /* renamed from: vc, reason: collision with root package name */
    private List<com.bytedance.sdk.openadsdk.core.model.Wwa> f10721vc;
    private final AtomicBoolean wN = new AtomicBoolean(false);
    private int NjR = 5;
    private final ScheduledFuture<?> eT = null;
    private ScheduledFuture<?> YoT = null;
    private ScheduledFuture<?> GA = null;
    private final zB pDU = zB.Sg();
    private final com.bytedance.sdk.openadsdk.core.qO Sg = com.bytedance.sdk.openadsdk.core.lG.tN();

    /* loaded from: classes.dex */
    public interface YFl {
    }

    private DSW(Context context) {
        if (context != null) {
            this.tN = context.getApplicationContext();
        } else {
            this.tN = com.bytedance.sdk.openadsdk.core.lG.YFl();
        }
        f10720nc.add(this);
    }

    private void tN(boolean z10) {
        try {
            ScheduledFuture<?> scheduledFuture = this.eT;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            com.bytedance.sdk.component.utils.YoT.YFl("ExpressAdLoadManager", "TimeOutFutureTask-->cancel......success=".concat(String.valueOf(this.eT.cancel(z10))));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(zB zBVar) {
        if (this.AlY != null) {
            Iterator<com.bytedance.sdk.openadsdk.core.model.Wwa> it = this.DSW.iterator();
            PAGBannerAd pAGBannerAd = null;
            while (it.hasNext() && (pAGBannerAd = YFl(it.next())) == null) {
            }
            if (pAGBannerAd != null) {
                if (!TextUtils.isEmpty(this.YFl.getBidAdm())) {
                    com.bytedance.sdk.openadsdk.pDU.tN.YFl(this.DSW.get(0), this.pDU.tN());
                }
                this.AlY.onAdLoaded(pAGBannerAd);
            } else {
                this.AlY.onError(103, com.bytedance.sdk.openadsdk.core.qsH.YFl(103));
                YFl(103);
            }
        }
    }

    public static DSW YFl(Context context) {
        return new DSW(context);
    }

    public void YFl(AdSlot adSlot, int i10, @NonNull com.bytedance.sdk.openadsdk.common.wN wNVar, int i11) {
        YFl(adSlot, i10, wNVar, null, i11);
    }

    public void YFl(AdSlot adSlot, int i10, @Nullable com.bytedance.sdk.openadsdk.common.wN wNVar, @Nullable YFl yFl, int i11) {
        this.pDU.AlY();
        if (this.wN.get()) {
            com.bytedance.sdk.component.utils.YoT.YFl("ExpressAdLoadManager", "express ad is loading...");
            return;
        }
        this.NjR = i10;
        this.wN.set(true);
        this.YFl = adSlot;
        if (wNVar instanceof PAGBannerAdLoadListener) {
            this.AlY = (PAGBannerAdLoadListener) wNVar;
        }
        this.qsH = yFl;
        YFl(adSlot, wNVar);
    }

    private void Sg(boolean z10) {
        try {
            ScheduledFuture<?> scheduledFuture = this.GA;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.GA.cancel(z10);
        } catch (Throwable unused) {
        }
    }

    private void Sg() {
        f10720nc.remove(this);
    }

    private void YFl(final AdSlot adSlot, com.bytedance.sdk.openadsdk.common.wN wNVar) {
        if (adSlot == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.aIu aiu = new com.bytedance.sdk.openadsdk.core.model.aIu();
        aiu.qsH = 2;
        this.Sg.YFl(adSlot, aiu, this.NjR, new qO.YFl() { // from class: com.bytedance.sdk.openadsdk.core.qsH.DSW.1
            @Override // com.bytedance.sdk.openadsdk.core.qO.YFl
            public void YFl(int i10, String str) {
                DSW.this.YFl(i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.qO.YFl
            public void YFl(com.bytedance.sdk.openadsdk.core.model.YFl yFl, com.bytedance.sdk.openadsdk.core.model.Sg sg2) {
                if (yFl.tN() == null || yFl.tN().isEmpty()) {
                    DSW.this.YFl(-3, com.bytedance.sdk.openadsdk.core.qsH.YFl(-3));
                    sg2.YFl(-3);
                    com.bytedance.sdk.openadsdk.core.model.Sg.YFl(sg2);
                    return;
                }
                DSW.this.f10721vc = yFl.tN();
                DSW.this.DSW = yFl.tN();
                DSW.this.YFl(adSlot);
                DSW dsw = DSW.this;
                dsw.YFl(dsw.pDU);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(AdSlot adSlot) {
        List<com.bytedance.sdk.openadsdk.core.model.Wwa> list = this.f10721vc;
        if (list == null) {
            return;
        }
        for (com.bytedance.sdk.openadsdk.core.model.Wwa wwa : list) {
            if (com.bytedance.sdk.openadsdk.core.model.Wwa.wN(wwa) && wwa.BPI() != null && wwa.BPI().f23462g != null) {
                if (com.bytedance.sdk.openadsdk.core.lG.AlY().wN(String.valueOf(wwa.kU())) && com.bytedance.sdk.openadsdk.core.lG.AlY().Cqy()) {
                    com.bytedance.sdk.openadsdk.core.GA.YFl.Sg YFl2 = com.bytedance.sdk.openadsdk.core.model.Wwa.YFl(((l) CacheDirFactory.getICacheDir(wwa.dBO())).g(), wwa);
                    YFl2.YFl("material_meta", wwa);
                    YFl2.YFl("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.GA.wN.YFl.YFl(YFl2, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(final zB zBVar) {
        if (this.wN.getAndSet(false)) {
            mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qsH.DSW.2
                @Override // java.lang.Runnable
                public void run() {
                    if (DSW.this.DSW != null && DSW.this.DSW.size() > 0) {
                        DSW.this.Sg(zBVar);
                        if (DSW.this.qsH != null) {
                            YFl unused = DSW.this.qsH;
                            List unused2 = DSW.this.DSW;
                        }
                    } else if (DSW.this.qsH != null) {
                        YFl unused3 = DSW.this.qsH;
                    }
                    DSW.this.YFl();
                }
            });
        }
    }

    private void YFl(int i10) {
        List<com.bytedance.sdk.openadsdk.core.model.Wwa> list = this.f10721vc;
        com.bytedance.sdk.openadsdk.pDU.tN.YFl().YFl(com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl(this.NjR).tN(this.YFl.getCodeId()).wN((list == null || list.size() <= 0) ? "" : this.f10721vc.get(0).ivp()).Sg(i10).vc(com.bytedance.sdk.openadsdk.core.qsH.YFl(i10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(int i10, String str) {
        if (this.wN.getAndSet(false)) {
            PAGBannerAdLoadListener pAGBannerAdLoadListener = this.AlY;
            if (pAGBannerAdLoadListener != null) {
                pAGBannerAdLoadListener.onError(i10, str);
            }
            YFl();
        }
    }

    private PAGBannerAd YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        if (this.NjR != 1) {
            return null;
        }
        if (wwa.BPI() != null) {
            return new com.bytedance.sdk.openadsdk.core.tN.vc(this.tN, wwa, this.YFl);
        }
        return new com.bytedance.sdk.openadsdk.core.tN.AlY(this.tN, wwa, this.YFl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl() {
        List<com.bytedance.sdk.openadsdk.core.model.Wwa> list = this.f10721vc;
        if (list != null) {
            list.clear();
        }
        List<com.bytedance.sdk.openadsdk.core.model.Wwa> list2 = this.DSW;
        if (list2 != null) {
            list2.clear();
        }
        YFl(true);
        Sg(true);
        tN(true);
        Sg();
    }

    private void YFl(boolean z10) {
        try {
            ScheduledFuture<?> scheduledFuture = this.YoT;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            com.bytedance.sdk.component.utils.YoT.YFl("ExpressAdLoadManager", "CheckValidFutureTask-->cancel......success=".concat(String.valueOf(this.YoT.cancel(z10))));
        } catch (Throwable unused) {
        }
    }
}
