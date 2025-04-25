package com.glority.base.routers.business;

import com.glority.android.core.route.RouteRequest;
import com.glority.base.routers.UrlRouter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsumeBuySuccessRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/base/routers/business/ConsumeBuySuccessRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "buySuccessSku", "<init>", "(Ljava/lang/String;)V", "getBuySuccessSku", "()Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ConsumeBuySuccessRequest extends RouteRequest<String> {
    public static final int $stable = 0;
    private final String buySuccessSku;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsumeBuySuccessRequest(String buySuccessSku) {
        super(UrlRouter.INSTANCE.getCONSUME_BUY_SUCCESS(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(buySuccessSku, "buySuccessSku");
        this.buySuccessSku = buySuccessSku;
    }

    public final String getBuySuccessSku() {
        return this.buySuccessSku;
    }
}
