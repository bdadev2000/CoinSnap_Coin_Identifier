package com.glority.billing.utils;

import com.android.billingclient.api.Purchase;
import com.glority.android.core.route.analysis.SendErrorEventRequest;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.enums.PaymentType;
import com.glority.billing.purchase.generatedAPI.kotlinAPI.enums.RestorePolicy;
import com.glority.billing.repository.BillingRepository;
import com.glority.component.generatedAPI.kotlinAPI.enums.DeviceType;
import com.glority.network.model.Resource;
import com.purchase.generatedAPI.kotlinAPI.purchase.RestoreMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PaymentUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.billing.utils.PaymentUtils$synRestore$1", f = "PaymentUtils.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class PaymentUtils$synRestore$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Purchase $purchase;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentUtils$synRestore$1(Purchase purchase, Continuation<? super PaymentUtils$synRestore$1> continuation) {
        super(2, continuation);
        this.$purchase = purchase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentUtils$synRestore$1(this.$purchase, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaymentUtils$synRestore$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    BillingRepository billingRepository = BillingRepository.INSTANCE;
                    PaymentType paymentType = PaymentType.GOOGLE_PLAY;
                    DeviceType deviceType = DeviceType.ANDROID;
                    String originalJson = this.$purchase.getOriginalJson();
                    Intrinsics.checkNotNullExpressionValue(originalJson, "getOriginalJson(...)");
                    Resource<RestoreMessage> restore = billingRepository.restore(paymentType, deviceType, originalJson, RestorePolicy.Default);
                    Purchase purchase = this.$purchase;
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    PaymentUtils$synRestore$1$1$1 paymentUtils$synRestore$1$1$1 = new PaymentUtils$synRestore$1$1$1(restore, purchase, null);
                    this.L$0 = restore;
                    this.label = 1;
                    if (BuildersKt.withContext(main, paymentUtils$synRestore$1$1$1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                new SendErrorEventRequest("restore:synRestoreErrorDeal", e.toString()).post();
            }
        } catch (Throwable unused) {
            PaymentUtils.INSTANCE.synRestoreErrorDeal(new Exception(), this.$purchase);
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
