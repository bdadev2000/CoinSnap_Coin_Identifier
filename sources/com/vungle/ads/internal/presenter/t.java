package com.vungle.ads.internal.presenter;

import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class t implements com.vungle.ads.internal.ui.k {
    final /* synthetic */ com.vungle.ads.internal.network.l $tpatSender;
    final /* synthetic */ y this$0;

    public t(y yVar, com.vungle.ads.internal.network.l lVar) {
        this.this$0 = yVar;
        this.$tpatSender = lVar;
    }

    @Override // com.vungle.ads.internal.ui.k
    public void onDeeplinkClick(boolean z10) {
        bh.z zVar;
        List<String> list;
        Executor executor;
        zVar = this.this$0.advertisement;
        if (zVar != null) {
            list = bh.z.getTpatUrls$default(zVar, "deeplink.click", String.valueOf(z10), null, 4, null);
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
