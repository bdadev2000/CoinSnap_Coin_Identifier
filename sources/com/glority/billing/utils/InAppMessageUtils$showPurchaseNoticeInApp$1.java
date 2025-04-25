package com.glority.billing.utils;

import android.app.Activity;
import androidx.core.os.BundleKt;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.InAppMessageParams;
import com.android.billingclient.api.InAppMessageResponseListener;
import com.android.billingclient.api.InAppMessageResult;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.billing.PurchaseLogEvent;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InAppMessageUtils.kt */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/glority/billing/utils/InAppMessageUtils$showPurchaseNoticeInApp$1", "Lcom/android/billingclient/api/BillingClientStateListener;", "onBillingServiceDisconnected", "", "onBillingSetupFinished", "p0", "Lcom/android/billingclient/api/BillingResult;", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class InAppMessageUtils$showPurchaseNoticeInApp$1 implements BillingClientStateListener {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ BillingClient $billingClient;
    final /* synthetic */ Function0<Unit> $onMessageShow;
    final /* synthetic */ Function0<Unit> $onRepurchaseSuccess;

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InAppMessageUtils$showPurchaseNoticeInApp$1(BillingClient billingClient, Activity activity, Function0<Unit> function0, Function0<Unit> function02) {
        this.$billingClient = billingClient;
        this.$activity = activity;
        this.$onMessageShow = function0;
        this.$onRepurchaseSuccess = function02;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(BillingResult p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        new LogEventRequest(PurchaseLogEvent.VIP_PAID_TROUBLE_REPIAD_CONNECT_RESULT, BundleKt.bundleOf(TuplesKt.to("code", String.valueOf(p0.getResponseCode())), TuplesKt.to(LogEventArguments.ARG_MESSAGE, p0.getDebugMessage()))).post();
        if (p0.getResponseCode() == 0) {
            InAppMessageParams build = InAppMessageParams.newBuilder().addInAppMessageCategoryToShow(2).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            BillingClient billingClient = this.$billingClient;
            Activity activity = this.$activity;
            final Function0<Unit> function0 = this.$onMessageShow;
            final Function0<Unit> function02 = this.$onRepurchaseSuccess;
            BillingResult showInAppMessages = billingClient.showInAppMessages(activity, build, new InAppMessageResponseListener() { // from class: com.glority.billing.utils.InAppMessageUtils$showPurchaseNoticeInApp$1$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.InAppMessageResponseListener
                public final void onInAppMessageResponse(InAppMessageResult inAppMessageResult) {
                    InAppMessageUtils$showPurchaseNoticeInApp$1.onBillingSetupFinished$lambda$0(Function0.this, function02, inAppMessageResult);
                }
            });
            Intrinsics.checkNotNullExpressionValue(showInAppMessages, "showInAppMessages(...)");
            new LogEventRequest(PurchaseLogEvent.VIP_PAID_TROUBLE_REPIAD_INAPPMESSAGE_RESULT, BundleKt.bundleOf(TuplesKt.to("code", String.valueOf(showInAppMessages.getResponseCode())), TuplesKt.to(LogEventArguments.ARG_MESSAGE, showInAppMessages.getDebugMessage()))).post();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingSetupFinished$lambda$0(Function0 onMessageShow, Function0 onRepurchaseSuccess, InAppMessageResult inAppMessageResult) {
        Intrinsics.checkNotNullParameter(onMessageShow, "$onMessageShow");
        Intrinsics.checkNotNullParameter(onRepurchaseSuccess, "$onRepurchaseSuccess");
        Intrinsics.checkNotNullParameter(inAppMessageResult, "inAppMessageResult");
        new LogEventRequest(PurchaseLogEvent.VIP_PAID_TROUBLE_NOTICE_SHOW, null, 2, null).post();
        onMessageShow.invoke();
        if (inAppMessageResult.getResponseCode() == 1) {
            new LogEventRequest(PurchaseLogEvent.VIP_PAID_TROUBLE_REPIAD_SUCCESS, null, 2, null).post();
            onRepurchaseSuccess.invoke();
        }
    }
}
