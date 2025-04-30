package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.f1;
import f7.C2275b;

/* loaded from: classes3.dex */
public final class f extends G7.k implements F7.a {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, f7.b] */
    @Override // F7.a
    public final C2275b invoke() {
        return f1.Companion.getInstance(this.$context).getService(C2275b.class);
    }
}
