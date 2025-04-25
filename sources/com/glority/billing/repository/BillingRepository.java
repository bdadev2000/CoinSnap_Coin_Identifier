package com.glority.billing.repository;

import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.enums.PaymentType;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.enums.RestorePolicy;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.model.ClientInfo;
import com.glority.component.generatedAPI.kotlinAPI.enums.DeviceType;
import com.glority.network.ApiServer;
import com.glority.network.model.Resource;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.purchase.generatedAPI.kotlinAPI.model.Price;
import com.purchase.generatedAPI.kotlinAPI.purchase.RestoreMessage;
import com.purchase.generatedAPI.kotlinAPI.purchase.VerifyMessage;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingRepository.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007JR\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/glority/billing/repository/BillingRepository;", "", "<init>", "()V", "appServer", "Lcom/glority/network/ApiServer;", "getAppServer", "()Lcom/glority/network/ApiServer;", "appServer$delegate", "Lkotlin/Lazy;", "restore", "Lcom/glority/network/model/Resource;", "Lcom/purchase/generatedAPI/kotlinAPI/purchase/RestoreMessage;", "paymentType", "Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/enums/PaymentType;", "deviceType", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/DeviceType;", "receiptData", "", "restorePolicy", "Lcom/glority/billing/purchase/generatedAPI/kotlinAPI/enums/RestorePolicy;", "verifyOrder", "Lcom/purchase/generatedAPI/kotlinAPI/purchase/VerifyMessage;", LogEventArguments.ARG_SKU, "price", "Lcom/purchase/generatedAPI/kotlinAPI/model/Price;", "firebaseAppInstanceId", "firebaseSessionId", FirebaseAnalytics.Param.QUANTITY, "", "base-billing_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class BillingRepository {
    public static final BillingRepository INSTANCE = new BillingRepository();

    /* renamed from: appServer$delegate, reason: from kotlin metadata */
    private static final Lazy appServer = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<ApiServer>() { // from class: com.glority.billing.repository.BillingRepository$appServer$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ApiServer invoke() {
            return new ApiServer.Builder().host(AppContext.INSTANCE.getConfig("HOST")).build();
        }
    });

    private BillingRepository() {
    }

    public final ApiServer getAppServer() {
        return (ApiServer) appServer.getValue();
    }

    public final Resource<RestoreMessage> restore(PaymentType paymentType, DeviceType deviceType, String receiptData, RestorePolicy restorePolicy) {
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(receiptData, "receiptData");
        Intrinsics.checkNotNullParameter(restorePolicy, "restorePolicy");
        return getAppServer().sendMessageBlocking(new RestoreMessage(paymentType, deviceType, receiptData, restorePolicy));
    }

    public final Resource<VerifyMessage> verifyOrder(PaymentType paymentType, DeviceType deviceType, String sku, Price price, String firebaseAppInstanceId, String firebaseSessionId, int quantity, String receiptData) {
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(receiptData, "receiptData");
        ApiServer appServer2 = getAppServer();
        ClientInfo clientInfo = new ClientInfo(0, 1, null);
        clientInfo.setFirebaseAppInstanceId(firebaseAppInstanceId);
        clientInfo.setFirebaseSessionId(firebaseSessionId);
        Unit unit = Unit.INSTANCE;
        return appServer2.sendMessageBlocking(new VerifyMessage(paymentType, deviceType, sku, price, quantity, receiptData, clientInfo));
    }
}
