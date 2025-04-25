package com.glority.billing.utils;

import android.app.Activity;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.billing.PurchaseLogEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InAppMessageUtils.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\u000b"}, d2 = {"Lcom/glority/billing/utils/InAppMessageUtils;", "", "<init>", "()V", "showPurchaseNoticeInApp", "", "activity", "Landroid/app/Activity;", "onMessageShow", "Lkotlin/Function0;", "onRepurchaseSuccess", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class InAppMessageUtils {
    public static final InAppMessageUtils INSTANCE = new InAppMessageUtils();

    private InAppMessageUtils() {
    }

    public final void showPurchaseNoticeInApp(Activity activity, Function0<Unit> onMessageShow, Function0<Unit> onRepurchaseSuccess) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onMessageShow, "onMessageShow");
        Intrinsics.checkNotNullParameter(onRepurchaseSuccess, "onRepurchaseSuccess");
        new LogEventRequest(PurchaseLogEvent.VIP_PAID_TROUBLE_NOTICE_METHODCALL, null, 2, null).post();
        BillingClient build = BillingClient.newBuilder(activity).enablePendingPurchases().setListener(new PurchasesUpdatedListener() { // from class: com.glority.billing.utils.InAppMessageUtils$$ExternalSyntheticLambda0
            @Override // com.android.billingclient.api.PurchasesUpdatedListener
            public final void onPurchasesUpdated(BillingResult billingResult, List list) {
                Intrinsics.checkNotNullParameter(billingResult, "p0");
            }
        }).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        build.startConnection(new InAppMessageUtils$showPurchaseNoticeInApp$1(build, activity, onMessageShow, onRepurchaseSuccess));
    }
}
