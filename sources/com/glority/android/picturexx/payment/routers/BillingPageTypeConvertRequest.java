package com.glority.android.picturexx.payment.routers;

import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;

/* compiled from: BillingPageTypeConvertRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/picturexx/payment/routers/BillingPageTypeConvertRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "pageType", "<init>", "(I)V", "getPageType", "()I", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class BillingPageTypeConvertRequest extends RouteRequest<Integer> {
    private final int pageType;

    public BillingPageTypeConvertRequest(int i) {
        super(PurchaseUrlRouter.INSTANCE.getURL_PAGETYPE_CONVERT(), null, null, 6, null);
        this.pageType = i;
    }

    public final int getPageType() {
        return this.pageType;
    }
}
