package com.vungle.ads.internal.load;

import android.content.Context;
import bh.i0;
import bh.z;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.e3;
import com.vungle.ads.internal.f0;
import com.vungle.ads.internal.network.y;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.internal.util.x;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, y vungleApiClient, com.vungle.ads.internal.executor.a sdkExecutors, dh.d omInjector, com.vungle.ads.internal.downloader.p downloader, x pathProvider, b adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        Intrinsics.checkNotNullParameter(sdkExecutors, "sdkExecutors");
        Intrinsics.checkNotNullParameter(omInjector, "omInjector");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
    }

    /* renamed from: requestAd$lambda-0, reason: not valid java name */
    private static final y m39requestAd$lambda0(Lazy<y> lazy) {
        return lazy.getValue();
    }

    private final void sendWinNotification(List<String> list) {
        String str;
        String str2;
        boolean z10 = false;
        if (list != null && list.isEmpty()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new s(getContext()));
        y vungleApiClient = getVungleApiClient();
        String referenceId = getAdRequest().getPlacement().getReferenceId();
        z advertisement$vungle_ads_release = getAdvertisement$vungle_ads_release();
        if (advertisement$vungle_ads_release != null) {
            str = advertisement$vungle_ads_release.getCreativeId();
        } else {
            str = null;
        }
        z advertisement$vungle_ads_release2 = getAdvertisement$vungle_ads_release();
        if (advertisement$vungle_ads_release2 != null) {
            str2 = advertisement$vungle_ads_release2.eventId();
        } else {
            str2 = null;
        }
        com.vungle.ads.internal.network.l lVar = new com.vungle.ads.internal.network.l(vungleApiClient, referenceId, str, str2, ((com.vungle.ads.internal.executor.f) getSdkExecutors()).getIoExecutor(), getPathProvider(), m40sendWinNotification$lambda2(lazy));
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                lVar.sendWinNotification((String) it.next(), ((com.vungle.ads.internal.executor.f) getSdkExecutors()).getJobExecutor());
            }
        }
    }

    /* renamed from: sendWinNotification$lambda-2, reason: not valid java name */
    private static final com.vungle.ads.internal.signals.j m40sendWinNotification$lambda2(Lazy<com.vungle.ads.internal.signals.j> lazy) {
        return lazy.getValue();
    }

    @Override // com.vungle.ads.internal.load.j
    public void onAdLoadReady() {
        z advertisement$vungle_ads_release = getAdvertisement$vungle_ads_release();
        sendWinNotification(advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getWinNotifications() : null);
    }

    @Override // com.vungle.ads.internal.load.j
    public void requestAd() {
        i0 adMarkup = getAdRequest().getAdMarkup();
        if (adMarkup == null) {
            com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(208, "Unable to create data object from payload string.", (r13 & 4) != 0 ? null : getAdRequest().getPlacement().getReferenceId(), (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            onAdLoadFailed(new com.vungle.ads.h());
            return;
        }
        if (f0.INSTANCE.rtaDebuggingEnabled()) {
            try {
                String decodedAdsResponse = adMarkup.getDecodedAdsResponse();
                v.Companion.d("RTA_DEBUGGER", String.valueOf(decodedAdsResponse));
                ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
                Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new r(getContext()));
                if (decodedAdsResponse != null) {
                    new q(m39requestAd$lambda0(lazy)).reportAdMarkup(decodedAdsResponse);
                }
            } catch (Throwable unused) {
            }
        }
        z adPayload = adMarkup.getAdPayload();
        Integer version = adMarkup.getVersion();
        if (version == null || version.intValue() != 2 || adPayload == null) {
            com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(213, "The ad response did not contain valid ad markup.", (r13 & 4) != 0 ? null : getAdRequest().getPlacement().getReferenceId(), (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : adMarkup.getEventId());
            onAdLoadFailed(new com.vungle.ads.h());
        } else {
            handleAdMetaData(adPayload);
        }
    }
}
