package com.vungle.ads.internal.presenter;

import android.content.Context;
import c7.C0665z;
import com.vungle.ads.internal.E;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class g extends G7.k implements F7.a {
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q qVar) {
        super(0);
        this.this$0 = qVar;
    }

    @Override // F7.a
    public final E invoke() {
        i7.f fVar;
        C0665z c0665z;
        Executor executor;
        fVar = this.this$0.adWidget;
        Context context = fVar.getContext();
        G7.j.d(context, "adWidget.context");
        c0665z = this.this$0.advertisement;
        executor = this.this$0.executor;
        return new E(context, c0665z, executor);
    }
}
