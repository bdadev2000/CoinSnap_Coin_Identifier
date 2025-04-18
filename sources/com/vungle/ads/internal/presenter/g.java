package com.vungle.ads.internal.presenter;

import android.content.Context;
import com.vungle.ads.internal.e0;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class g extends Lambda implements Function0 {
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q qVar) {
        super(0);
        this.this$0 = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final e0 invoke() {
        hh.f fVar;
        bh.z zVar;
        Executor executor;
        fVar = this.this$0.adWidget;
        Context context = fVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "adWidget.context");
        zVar = this.this$0.advertisement;
        executor = this.this$0.executor;
        return new e0(context, zVar, executor);
    }
}
