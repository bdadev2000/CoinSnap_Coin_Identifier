package com.vungle.ads.internal.presenter;

import bh.o3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.n3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class b {
    public static final a Companion = new a(null);
    private static final String TAG = "AdEventListener";
    private boolean adRewarded;
    private o3 placement;
    private final c playAdCallback;

    public b(c cVar, o3 o3Var) {
        this.playAdCallback = cVar;
        this.placement = o3Var;
    }

    public final c getPlayAdCallback$vungle_ads_release() {
        return this.playAdCallback;
    }

    public final void onError(n3 error, String str) {
        Intrinsics.checkNotNullParameter(error, "error");
        c cVar = this.playAdCallback;
        if (cVar != null) {
            cVar.onFailure(error);
            com.vungle.ads.internal.util.v.Companion.e(TAG, "AdEventListener#PlayAdCallback " + str, error);
        }
    }

    public final void onNext(String s5, String str, String str2) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        Intrinsics.checkNotNullParameter(s5, "s");
        com.vungle.ads.internal.util.u uVar = com.vungle.ads.internal.util.v.Companion;
        StringBuilder p10 = a4.j.p("s=", s5, ", value=", str, ", id=");
        p10.append(str2);
        uVar.d(TAG, p10.toString());
        switch (s5.hashCode()) {
            case -1912374177:
                if (s5.equals(q.SUCCESSFUL_VIEW)) {
                    o3 o3Var = this.placement;
                    boolean z10 = false;
                    if (o3Var != null && o3Var.isIncentivized()) {
                        z10 = true;
                    }
                    if (z10 && !this.adRewarded) {
                        this.adRewarded = true;
                        c cVar5 = this.playAdCallback;
                        if (cVar5 != null) {
                            cVar5.onAdRewarded(str2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case -1627831289:
                if (s5.equals("adViewed") && (cVar = this.playAdCallback) != null) {
                    cVar.onAdImpression(str2);
                    return;
                }
                return;
            case 100571:
                if (s5.equals(TtmlNode.END) && (cVar2 = this.playAdCallback) != null) {
                    cVar2.onAdEnd(str2);
                    return;
                }
                return;
            case 3417674:
                if (s5.equals(q.OPEN)) {
                    if (Intrinsics.areEqual(str, "adClick")) {
                        c cVar6 = this.playAdCallback;
                        if (cVar6 != null) {
                            cVar6.onAdClick(str2);
                            return;
                        }
                        return;
                    }
                    if (Intrinsics.areEqual(str, "adLeftApplication") && (cVar3 = this.playAdCallback) != null) {
                        cVar3.onAdLeftApplication(str2);
                        return;
                    }
                    return;
                }
                return;
            case 109757538:
                if (s5.equals("start") && (cVar4 = this.playAdCallback) != null) {
                    cVar4.onAdStart(str2);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
