package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.f1;

/* loaded from: classes3.dex */
public final class V extends G7.k implements F7.a {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.downloader.p, java.lang.Object] */
    @Override // F7.a
    public final com.vungle.ads.internal.downloader.p invoke() {
        return f1.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.downloader.p.class);
    }
}
