package com.vungle.ads.internal.load;

import com.vungle.ads.internal.network.y;

/* loaded from: classes3.dex */
public final class q {
    public static final p Companion = new p(null);
    public static final String RTA_DEBUG_ENDPOINT = "https://events.ads.vungle.com/rtadebugging";
    private final y apiClient;

    public q(y yVar) {
        G7.j.e(yVar, "apiClient");
        this.apiClient = yVar;
    }

    public final void reportAdMarkup(String str) {
        G7.j.e(str, "adm");
        this.apiClient.sendAdMarkup(str, RTA_DEBUG_ENDPOINT);
    }
}
