package com.vungle.ads.internal.bidding;

import G7.k;
import android.content.Context;
import com.vungle.ads.f1;
import com.vungle.ads.internal.network.y;

/* loaded from: classes3.dex */
public final class c extends k implements F7.a {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.y, java.lang.Object] */
    @Override // F7.a
    public final y invoke() {
        return f1.Companion.getInstance(this.$context).getService(y.class);
    }
}
