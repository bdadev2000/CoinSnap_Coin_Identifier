package com.vungle.ads.internal.load;

import android.content.Context;
import bh.o3;
import com.vungle.ads.b1;
import com.vungle.ads.internal.network.y;
import com.vungle.ads.internal.util.x;
import com.vungle.ads.n3;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, y vungleApiClient, com.vungle.ads.internal.executor.a sdkExecutors, dh.d omInjector, com.vungle.ads.internal.downloader.p downloader, x pathProvider, b adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        Intrinsics.checkNotNullParameter(sdkExecutors, "sdkExecutors");
        Intrinsics.checkNotNullParameter(omInjector, "omInjector");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
    }

    private final void fetchAdMetadata(String str, o3 o3Var) {
        if (getVungleApiClient().checkIsRetryAfterActive(o3Var.getReferenceId())) {
            onAdLoadFailed(new com.vungle.ads.j().logError$vungle_ads_release());
            return;
        }
        com.vungle.ads.internal.network.a requestAd = getVungleApiClient().requestAd(o3Var.getReferenceId(), str, o3Var.getHeaderBidding());
        if (requestAd == null) {
            onAdLoadFailed(new com.vungle.ads.g());
        } else {
            ((com.vungle.ads.internal.network.h) requestAd).enqueue(new k(this, o3Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n3 retrofitToVungleError(Throwable th2) {
        if (th2 instanceof UnknownHostException) {
            return new com.vungle.ads.g();
        }
        int i10 = 2;
        String str = null;
        byte b3 = 0;
        byte b10 = 0;
        byte b11 = 0;
        if (th2 instanceof SocketTimeoutException) {
            return new b1(n3.NETWORK_TIMEOUT, str, i10, b11 == true ? 1 : 0);
        }
        if (th2 instanceof IOException) {
            return new b1(n3.NETWORK_ERROR, b10 == true ? 1 : 0, i10, b3 == true ? 1 : 0);
        }
        return new com.vungle.ads.g();
    }

    @Override // com.vungle.ads.internal.load.j
    public void onAdLoadReady() {
    }

    @Override // com.vungle.ads.internal.load.j
    public void requestAd() {
        fetchAdMetadata(getAdRequest().getRequestAdSize(), getAdRequest().getPlacement());
    }
}
