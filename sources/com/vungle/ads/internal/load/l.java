package com.vungle.ads.internal.load;

import android.content.Context;
import c7.p1;
import com.vungle.ads.C2074d0;
import com.vungle.ads.C2079g;
import com.vungle.ads.C2120j;
import com.vungle.ads.internal.network.InterfaceC2099a;
import com.vungle.ads.internal.network.y;
import com.vungle.ads.internal.util.x;
import com.vungle.ads.o1;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* loaded from: classes3.dex */
public final class l extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, y yVar, com.vungle.ads.internal.executor.a aVar, e7.d dVar, com.vungle.ads.internal.downloader.p pVar, x xVar, b bVar) {
        super(context, yVar, aVar, dVar, pVar, xVar, bVar);
        G7.j.e(context, "context");
        G7.j.e(yVar, "vungleApiClient");
        G7.j.e(aVar, "sdkExecutors");
        G7.j.e(dVar, "omInjector");
        G7.j.e(pVar, "downloader");
        G7.j.e(xVar, "pathProvider");
        G7.j.e(bVar, "adRequest");
    }

    private final void fetchAdMetadata(String str, p1 p1Var) {
        if (getVungleApiClient().checkIsRetryAfterActive(p1Var.getReferenceId())) {
            onAdLoadFailed(new C2120j().logError$vungle_ads_release());
            return;
        }
        InterfaceC2099a requestAd = getVungleApiClient().requestAd(p1Var.getReferenceId(), str, p1Var.getHeaderBidding());
        if (requestAd == null) {
            onAdLoadFailed(new C2079g());
        } else {
            ((com.vungle.ads.internal.network.h) requestAd).enqueue(new k(this, p1Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o1 retrofitToVungleError(Throwable th) {
        if (th instanceof UnknownHostException) {
            return new C2079g();
        }
        if (th instanceof SocketTimeoutException) {
            return new C2074d0(o1.NETWORK_TIMEOUT, null, 2, null);
        }
        if (th instanceof IOException) {
            return new C2074d0(o1.NETWORK_ERROR, null, 2, null);
        }
        return new C2079g();
    }

    @Override // com.vungle.ads.internal.load.j
    public void onAdLoadReady() {
    }

    @Override // com.vungle.ads.internal.load.j
    public void requestAd() {
        fetchAdMetadata(getAdRequest().getRequestAdSize(), getAdRequest().getPlacement());
    }
}
