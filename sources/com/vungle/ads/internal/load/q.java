package com.vungle.ads.internal.load;

import com.vungle.ads.internal.network.y;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q {
    public static final p Companion = new p(null);
    public static final String RTA_DEBUG_ENDPOINT = "https://events.ads.vungle.com/rtadebugging";
    private final y apiClient;

    public q(y apiClient) {
        Intrinsics.checkNotNullParameter(apiClient, "apiClient");
        this.apiClient = apiClient;
    }

    public final void reportAdMarkup(String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        this.apiClient.sendAdMarkup(adm, RTA_DEBUG_ENDPOINT);
    }
}
