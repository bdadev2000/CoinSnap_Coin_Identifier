package com.glority.android.picturexx.payment.routers;

import androidx.fragment.app.DialogFragment;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.picturexx.payment.skumanager.BillingSkuData;
import kotlin.Metadata;

/* compiled from: PurchaseDialogRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/glority/android/picturexx/payment/routers/PurchaseDialogRequest;", "Lcom/glority/android/core/route/RouteRequest;", "Landroidx/fragment/app/DialogFragment;", "billingSkuData", "Lcom/glority/android/picturexx/payment/skumanager/BillingSkuData;", "<init>", "(Lcom/glority/android/picturexx/payment/skumanager/BillingSkuData;)V", "getBillingSkuData", "()Lcom/glority/android/picturexx/payment/skumanager/BillingSkuData;", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class PurchaseDialogRequest extends RouteRequest<DialogFragment> {
    private final BillingSkuData billingSkuData;

    public PurchaseDialogRequest(BillingSkuData billingSkuData) {
        super(PurchaseUrlRouter.INSTANCE.getURL_PURCHASE_DIALOG(), null, null, 6, null);
        this.billingSkuData = billingSkuData;
    }

    public final BillingSkuData getBillingSkuData() {
        return this.billingSkuData;
    }
}
