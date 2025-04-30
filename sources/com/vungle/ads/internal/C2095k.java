package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.f1;

/* renamed from: com.vungle.ads.internal.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2095k extends G7.k implements F7.a {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2095k(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.j, java.lang.Object] */
    @Override // F7.a
    public final com.vungle.ads.internal.task.j invoke() {
        return f1.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.task.j.class);
    }
}
