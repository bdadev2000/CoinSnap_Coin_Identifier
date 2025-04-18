package com.vungle.ads.internal.signals;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes4.dex */
public final class e extends Lambda implements Function1 {
    public static final e INSTANCE = new e();

    public e() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((JsonBuilder) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        Json.setEncodeDefaults(true);
        Json.setExplicitNulls(false);
    }
}
