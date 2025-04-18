package com.vungle.ads.internal.bidding;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes4.dex */
public final class d extends Lambda implements Function1 {
    public static final d INSTANCE = new d();

    public d() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((JsonBuilder) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setExplicitNulls(false);
    }
}
