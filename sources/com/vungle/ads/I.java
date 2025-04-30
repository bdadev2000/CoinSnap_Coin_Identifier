package com.vungle.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class I extends G7.k implements F7.a {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [e7.f, java.lang.Object] */
    @Override // F7.a
    public final e7.f invoke() {
        return f1.Companion.getInstance(this.$context).getService(e7.f.class);
    }
}
