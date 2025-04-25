package com.glority.base.routers.business;

import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.RouteRequest;
import com.glority.base.routers.UrlRouter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PurchaseSuccessRequest.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/glority/base/routers/business/PurchaseSuccessRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", LogEventArguments.ARG_SKU, "", "pageFrom", "restore", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getSku", "()Ljava/lang/String;", "getPageFrom", "getRestore", "()Z", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class PurchaseSuccessRequest extends RouteRequest<Object> {
    public static final int $stable = 0;
    private final String pageFrom;
    private final boolean restore;
    private final String sku;

    public final String getSku() {
        return this.sku;
    }

    public final String getPageFrom() {
        return this.pageFrom;
    }

    public final boolean getRestore() {
        return this.restore;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseSuccessRequest(String sku, String pageFrom, boolean z) {
        super(UrlRouter.INSTANCE.getURL_PURCHASE_SUCCESS(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(pageFrom, "pageFrom");
        this.sku = sku;
        this.pageFrom = pageFrom;
        this.restore = z;
    }
}
