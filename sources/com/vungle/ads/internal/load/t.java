package com.vungle.ads.internal.load;

import android.content.Context;
import c7.C0665z;
import c7.I;
import com.vungle.ads.C2081h;
import com.vungle.ads.C2137s;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.f1;
import com.vungle.ads.internal.F;
import com.vungle.ads.internal.network.y;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.internal.util.x;
import java.util.Iterator;
import java.util.List;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;

/* loaded from: classes3.dex */
public final class t extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, y yVar, com.vungle.ads.internal.executor.a aVar, e7.d dVar, com.vungle.ads.internal.downloader.p pVar, x xVar, b bVar) {
        super(context, yVar, aVar, dVar, pVar, xVar, bVar);
        G7.j.e(context, "context");
        G7.j.e(yVar, "vungleApiClient");
        G7.j.e(aVar, "sdkExecutors");
        G7.j.e(dVar, "omInjector");
        G7.j.e(pVar, "downloader");
        G7.j.e(xVar, "pathProvider");
        G7.j.e(bVar, "adRequest");
    }

    /* renamed from: requestAd$lambda-0, reason: not valid java name */
    private static final y m59requestAd$lambda0(InterfaceC2717f interfaceC2717f) {
        return (y) interfaceC2717f.getValue();
    }

    private final void sendWinNotification(List<String> list) {
        String str;
        String str2;
        if (list != null && list.isEmpty()) {
            return;
        }
        ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
        InterfaceC2717f c9 = AbstractC2712a.c(EnumC2718g.b, new s(getContext()));
        y vungleApiClient = getVungleApiClient();
        String referenceId = getAdRequest().getPlacement().getReferenceId();
        C0665z advertisement$vungle_ads_release = getAdvertisement$vungle_ads_release();
        if (advertisement$vungle_ads_release != null) {
            str = advertisement$vungle_ads_release.getCreativeId();
        } else {
            str = null;
        }
        C0665z advertisement$vungle_ads_release2 = getAdvertisement$vungle_ads_release();
        if (advertisement$vungle_ads_release2 != null) {
            str2 = advertisement$vungle_ads_release2.eventId();
        } else {
            str2 = null;
        }
        com.vungle.ads.internal.network.l lVar = new com.vungle.ads.internal.network.l(vungleApiClient, referenceId, str, str2, ((com.vungle.ads.internal.executor.f) getSdkExecutors()).getIoExecutor(), getPathProvider(), m60sendWinNotification$lambda2(c9));
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                lVar.sendWinNotification((String) it.next(), ((com.vungle.ads.internal.executor.f) getSdkExecutors()).getJobExecutor());
            }
        }
    }

    /* renamed from: sendWinNotification$lambda-2, reason: not valid java name */
    private static final com.vungle.ads.internal.signals.j m60sendWinNotification$lambda2(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.signals.j) interfaceC2717f.getValue();
    }

    @Override // com.vungle.ads.internal.load.j
    public void onAdLoadReady() {
        List<String> list;
        C0665z advertisement$vungle_ads_release = getAdvertisement$vungle_ads_release();
        if (advertisement$vungle_ads_release != null) {
            list = advertisement$vungle_ads_release.getWinNotifications();
        } else {
            list = null;
        }
        sendWinNotification(list);
    }

    @Override // com.vungle.ads.internal.load.j
    public void requestAd() {
        I adMarkup = getAdRequest().getAdMarkup();
        if (adMarkup == null) {
            C2137s.INSTANCE.logError$vungle_ads_release(208, "Unable to create data object from payload string.", (r13 & 4) != 0 ? null : getAdRequest().getPlacement().getReferenceId(), (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            onAdLoadFailed(new C2081h());
            return;
        }
        if (F.INSTANCE.rtaDebuggingEnabled()) {
            try {
                String decodedAdsResponse = adMarkup.getDecodedAdsResponse();
                v.Companion.d("RTA_DEBUGGER", String.valueOf(decodedAdsResponse));
                ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
                InterfaceC2717f c9 = AbstractC2712a.c(EnumC2718g.b, new r(getContext()));
                if (decodedAdsResponse != null) {
                    new q(m59requestAd$lambda0(c9)).reportAdMarkup(decodedAdsResponse);
                }
            } catch (Throwable unused) {
            }
        }
        C0665z adPayload = adMarkup.getAdPayload();
        Integer version = adMarkup.getVersion();
        if (version == null || version.intValue() != 2 || adPayload == null) {
            C2137s.INSTANCE.logError$vungle_ads_release(213, "The ad response did not contain valid ad markup.", (r13 & 4) != 0 ? null : getAdRequest().getPlacement().getReferenceId(), (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : adMarkup.getEventId());
            onAdLoadFailed(new C2081h());
        } else {
            handleAdMetaData(adPayload);
        }
    }
}
