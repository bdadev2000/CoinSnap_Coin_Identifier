package bh;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes4.dex */
public final class h0 extends Lambda implements Function1 {
    public static final h0 INSTANCE = new h0();

    public h0() {
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
