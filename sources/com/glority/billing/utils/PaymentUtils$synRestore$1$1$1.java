package com.glority.billing.utils;

import com.android.billingclient.api.Purchase;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.analysis.SendErrorEventRequest;
import com.glority.billing.PurchaseLogEvent;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.purchase.generatedAPI.kotlinAPI.purchase.RestoreMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaymentUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.billing.utils.PaymentUtils$synRestore$1$1$1", f = "PaymentUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class PaymentUtils$synRestore$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Purchase $purchase;
    final /* synthetic */ Resource<RestoreMessage> $resource;
    int label;

    /* compiled from: PaymentUtils.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentUtils$synRestore$1$1$1(Resource<RestoreMessage> resource, Purchase purchase, Continuation<? super PaymentUtils$synRestore$1$1$1> continuation) {
        super(2, continuation);
        this.$resource = resource;
        this.$purchase = purchase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentUtils$synRestore$1$1$1(this.$resource, this.$purchase, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaymentUtils$synRestore$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i = WhenMappings.$EnumSwitchMapping$0[this.$resource.getStatus().ordinal()];
        if (i == 1) {
            try {
                List<String> products = this.$purchase.getProducts();
                Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
                new LogEventRequest(PurchaseLogEvent.PURCHASE_PENDING, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_SKU, CollectionsKt.joinToString$default(products, ",", null, null, 0, null, null, 62, null)), TuplesKt.to("name", "succeed"))).post();
            } catch (Exception e) {
                new SendErrorEventRequest("restore", e.toString()).post();
            }
            new LogEventRequest("revert_from_assumed_vip_succeed", null, 2, null).post();
            PaymentUtils.INSTANCE.purchaseRemove(new PaddingData(this.$purchase, false, 2, null));
        } else if (i == 2) {
            try {
                PaymentUtils.INSTANCE.synRestoreErrorDeal(this.$resource.getException(), this.$purchase);
            } catch (Exception e2) {
                new SendErrorEventRequest("restore:ERROR", e2.toString()).post();
            }
        }
        return Unit.INSTANCE;
    }
}
