package com.bytedance.sdk.openadsdk.component.lMd;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.KS;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.QR;
import com.bytedance.sdk.openadsdk.core.model.lMd;
import com.bytedance.sdk.openadsdk.core.model.pvr;
import com.bytedance.sdk.openadsdk.core.woN;
import com.bytedance.sdk.openadsdk.utils.cW;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class zp {
    private static volatile zp zp;
    private final woN lMd = KVG.KS();

    private zp() {
    }

    public static zp zp() {
        if (zp == null) {
            synchronized (zp.class) {
                try {
                    if (zp == null) {
                        zp = new zp();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    public void zp(final Context context, final AdSlot adSlot, final KS ks) {
        final cW zp2 = cW.zp();
        this.lMd.zp(adSlot, new pvr(), 5, new woN.zp() { // from class: com.bytedance.sdk.openadsdk.component.lMd.zp.1
            @Override // com.bytedance.sdk.openadsdk.core.woN.zp
            public void zp(int i9, String str) {
                ks.onError(i9, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.woN.zp
            public void zp(com.bytedance.sdk.openadsdk.core.model.zp zpVar, lMd lmd) {
                if (zpVar.KS() != null && !zpVar.KS().isEmpty()) {
                    List<com.bytedance.sdk.openadsdk.core.model.woN> KS = zpVar.KS();
                    ArrayList arrayList = new ArrayList(KS.size());
                    for (com.bytedance.sdk.openadsdk.core.model.woN won : KS) {
                        if (com.bytedance.sdk.openadsdk.core.model.woN.COT(won) || (won != null && won.vLi())) {
                            PAGNativeAd zp3 = zp(context, won, adSlot);
                            if (ks instanceof PAGNativeAdLoadListener) {
                                arrayList.add(zp3);
                            }
                        }
                        if (com.bytedance.sdk.openadsdk.core.model.woN.COT(won) && won.eWG() != null && won.eWG().Bj() != null) {
                            if (KVG.jU().COT(String.valueOf(won.FGx())) && KVG.jU().fgJ()) {
                                if (won.eWG() != null) {
                                    won.eWG().HWF(1);
                                }
                                if (won.KVS() != null) {
                                    won.KVS().HWF(1);
                                }
                                com.bytedance.sdk.openadsdk.core.video.zp.lMd zp4 = com.bytedance.sdk.openadsdk.core.model.woN.zp(CacheDirFactory.getICacheDir(won.jyq()).KS(), won);
                                zp4.zp("material_meta", won);
                                zp4.zp("ad_slot", adSlot);
                                com.bytedance.sdk.openadsdk.core.video.jU.zp.zp(zp4, null);
                            }
                        }
                    }
                    if ((ks instanceof PAGNativeAdLoadListener) && !arrayList.isEmpty()) {
                        AdSlot adSlot2 = adSlot;
                        if (adSlot2 != null && !TextUtils.isEmpty(adSlot2.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.dT.KS.zp(KS.get(0), zp2.KS());
                        }
                        KS ks2 = ks;
                        if (ks2 instanceof PAGNativeAdLoadListener) {
                            ((PAGNativeAdLoadListener) ks2).onAdLoaded(arrayList.get(0));
                        }
                        if (lmd.COT() == null || lmd.COT().isEmpty()) {
                            return;
                        }
                        lMd.zp(lmd);
                        return;
                    }
                    ks.onError(-4, QR.zp(-4));
                    lmd.zp(-4);
                    lMd.zp(lmd);
                    return;
                }
                ks.onError(-3, QR.zp(-3));
                lmd.zp(-3);
                lMd.zp(lmd);
            }

            private PAGNativeAd zp(Context context2, com.bytedance.sdk.openadsdk.core.model.woN won, AdSlot adSlot2) {
                if (won.cz() != 2) {
                    return new com.bytedance.sdk.openadsdk.apiImpl.feed.lMd(context2, won, 5, adSlot2);
                }
                if (won.eWG() != null) {
                    return new com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.zp(context2, won, adSlot2);
                }
                return new com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.lMd(context2, won, adSlot2);
            }
        });
    }
}
