package com.vungle.ads.internal.presenter;

import c7.p1;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.o1;

/* loaded from: classes3.dex */
public class b {
    public static final C2103a Companion = new C2103a(null);
    private static final String TAG = "AdEventListener";
    private boolean adRewarded;
    private p1 placement;
    private final c playAdCallback;

    public b(c cVar, p1 p1Var) {
        this.playAdCallback = cVar;
        this.placement = p1Var;
    }

    public final c getPlayAdCallback$vungle_ads_release() {
        return this.playAdCallback;
    }

    public final void onError(o1 o1Var, String str) {
        G7.j.e(o1Var, "error");
        c cVar = this.playAdCallback;
        if (cVar != null) {
            cVar.onFailure(o1Var);
            com.vungle.ads.internal.util.v.Companion.e(TAG, "AdEventListener#PlayAdCallback " + str, o1Var);
        }
    }

    public final void onNext(String str, String str2, String str3) {
        p1 p1Var;
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        G7.j.e(str, "s");
        com.vungle.ads.internal.util.u uVar = com.vungle.ads.internal.util.v.Companion;
        StringBuilder o3 = com.mbridge.msdk.foundation.entity.o.o("s=", str, ", value=", str2, ", id=");
        o3.append(str3);
        uVar.d(TAG, o3.toString());
        switch (str.hashCode()) {
            case -1912374177:
                if (str.equals(q.SUCCESSFUL_VIEW) && (p1Var = this.placement) != null && p1Var.isIncentivized() && !this.adRewarded) {
                    this.adRewarded = true;
                    c cVar5 = this.playAdCallback;
                    if (cVar5 != null) {
                        cVar5.onAdRewarded(str3);
                        return;
                    }
                    return;
                }
                return;
            case -1627831289:
                if (str.equals("adViewed") && (cVar = this.playAdCallback) != null) {
                    cVar.onAdImpression(str3);
                    return;
                }
                return;
            case 100571:
                if (str.equals(TtmlNode.END) && (cVar2 = this.playAdCallback) != null) {
                    cVar2.onAdEnd(str3);
                    return;
                }
                return;
            case 3417674:
                if (str.equals(q.OPEN)) {
                    if (G7.j.a(str2, "adClick")) {
                        c cVar6 = this.playAdCallback;
                        if (cVar6 != null) {
                            cVar6.onAdClick(str3);
                            return;
                        }
                        return;
                    }
                    if (G7.j.a(str2, "adLeftApplication") && (cVar3 = this.playAdCallback) != null) {
                        cVar3.onAdLeftApplication(str3);
                        return;
                    }
                    return;
                }
                return;
            case 109757538:
                if (str.equals("start") && (cVar4 = this.playAdCallback) != null) {
                    cVar4.onAdStart(str3);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
