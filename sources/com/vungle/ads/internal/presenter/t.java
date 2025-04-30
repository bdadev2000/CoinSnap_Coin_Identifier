package com.vungle.ads.internal.presenter;

import c7.C0665z;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class t implements com.vungle.ads.internal.ui.k {
    final /* synthetic */ com.vungle.ads.internal.network.l $tpatSender;
    final /* synthetic */ y this$0;

    public t(y yVar, com.vungle.ads.internal.network.l lVar) {
        this.this$0 = yVar;
        this.$tpatSender = lVar;
    }

    @Override // com.vungle.ads.internal.ui.k
    public void onDeeplinkClick(boolean z8) {
        C0665z c0665z;
        List<String> list;
        Executor executor;
        c0665z = this.this$0.advertisement;
        if (c0665z != null) {
            list = C0665z.getTpatUrls$default(c0665z, "deeplink.click", String.valueOf(z8), null, 4, null);
        } else {
            list = null;
        }
        if (list != null) {
            com.vungle.ads.internal.network.l lVar = this.$tpatSender;
            y yVar = this.this$0;
            for (String str : list) {
                executor = yVar.executor;
                lVar.sendTpat(str, executor);
            }
        }
    }
}
