package com.bytedance.sdk.openadsdk.component.Sg;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.wN;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Sg;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.aIu;
import com.bytedance.sdk.openadsdk.core.qO;
import com.bytedance.sdk.openadsdk.core.qsH;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.pDU.tN;
import com.bytedance.sdk.openadsdk.utils.zB;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m2.l;

/* loaded from: classes.dex */
public class YFl {
    private static volatile YFl YFl;
    private final qO Sg = lG.tN();

    private YFl() {
    }

    public static YFl YFl() {
        if (YFl == null) {
            synchronized (YFl.class) {
                if (YFl == null) {
                    YFl = new YFl();
                }
            }
        }
        return YFl;
    }

    public void YFl(final Context context, final AdSlot adSlot, final wN wNVar) {
        final zB YFl2 = zB.YFl();
        this.Sg.YFl(adSlot, new aIu(), 5, new qO.YFl() { // from class: com.bytedance.sdk.openadsdk.component.Sg.YFl.1
            @Override // com.bytedance.sdk.openadsdk.core.qO.YFl
            public void YFl(int i10, String str) {
                wNVar.onError(i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.qO.YFl
            public void YFl(com.bytedance.sdk.openadsdk.core.model.YFl yFl, Sg sg2) {
                if (yFl.tN() != null && !yFl.tN().isEmpty()) {
                    List<Wwa> tN = yFl.tN();
                    ArrayList arrayList = new ArrayList(tN.size());
                    Iterator<Wwa> it = tN.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Wwa next = it.next();
                        if (Wwa.wN(next) || (next != null && next.jz())) {
                            PAGNativeAd YFl3 = YFl(context, next, adSlot);
                            if (wNVar instanceof PAGNativeAdLoadListener) {
                                arrayList.add(YFl3);
                            }
                        }
                        if (Wwa.wN(next) && next.BPI() != null && next.BPI().f23462g != null) {
                            if (lG.AlY().wN(String.valueOf(next.kU())) && lG.AlY().Cqy()) {
                                if (next.BPI() != null) {
                                    next.BPI().f23470o = 1;
                                }
                                if (next.dc() != null) {
                                    next.dc().f23470o = 1;
                                }
                                com.bytedance.sdk.openadsdk.core.GA.YFl.Sg YFl4 = Wwa.YFl(((l) CacheDirFactory.getICacheDir(next.dBO())).g(), next);
                                YFl4.YFl("material_meta", next);
                                YFl4.YFl("ad_slot", adSlot);
                                com.bytedance.sdk.openadsdk.core.GA.wN.YFl.YFl(YFl4, null);
                            }
                            IPMiBroadcastReceiver.YFl(context, next);
                        }
                    }
                    if ((wNVar instanceof PAGNativeAdLoadListener) && !arrayList.isEmpty()) {
                        AdSlot adSlot2 = adSlot;
                        if (adSlot2 != null && !TextUtils.isEmpty(adSlot2.getBidAdm())) {
                            tN.YFl(tN.get(0), YFl2.tN());
                        }
                        wN wNVar2 = wNVar;
                        if (wNVar2 instanceof PAGNativeAdLoadListener) {
                            ((PAGNativeAdLoadListener) wNVar2).onAdLoaded(arrayList.get(0));
                        }
                        if (sg2.wN() == null || sg2.wN().isEmpty()) {
                            return;
                        }
                        Sg.YFl(sg2);
                        return;
                    }
                    wNVar.onError(-4, qsH.YFl(-4));
                    sg2.YFl(-4);
                    Sg.YFl(sg2);
                    return;
                }
                wNVar.onError(-3, qsH.YFl(-3));
                sg2.YFl(-3);
                Sg.YFl(sg2);
            }

            private PAGNativeAd YFl(Context context2, Wwa wwa, AdSlot adSlot2) {
                if (wwa.Ne() != 2) {
                    return new com.bytedance.sdk.openadsdk.YFl.Sg.Sg(context2, wwa, 5, adSlot2);
                }
                if (wwa.BPI() != null) {
                    return new com.bytedance.sdk.openadsdk.YFl.Sg.YFl.Sg(context2, wwa, adSlot2);
                }
                return new com.bytedance.sdk.openadsdk.YFl.Sg.YFl.tN(context2, wwa, adSlot2);
            }
        });
    }
}
