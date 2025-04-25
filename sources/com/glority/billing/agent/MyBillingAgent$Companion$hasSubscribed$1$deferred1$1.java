package com.glority.billing.agent;

import com.android.billingclient.api.Purchase;
import com.glority.billing.play.BillingSync;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MyBillingAgent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "Lcom/android/billingclient/api/Purchase;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.billing.agent.MyBillingAgent$Companion$hasSubscribed$1$deferred1$1", f = "MyBillingAgent.kt", i = {}, l = {391}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class MyBillingAgent$Companion$hasSubscribed$1$deferred1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Boolean, ? extends List<Purchase>>>, Object> {
    final /* synthetic */ BillingSync $billingSync;
    final /* synthetic */ String $productType;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyBillingAgent$Companion$hasSubscribed$1$deferred1$1(BillingSync billingSync, String str, Continuation<? super MyBillingAgent$Companion$hasSubscribed$1$deferred1$1> continuation) {
        super(2, continuation);
        this.$billingSync = billingSync;
        this.$productType = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MyBillingAgent$Companion$hasSubscribed$1$deferred1$1(this.$billingSync, this.$productType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends Boolean, ? extends List<Purchase>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<Boolean, ? extends List<Purchase>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<Boolean, ? extends List<Purchase>>> continuation) {
        return ((MyBillingAgent$Companion$hasSubscribed$1$deferred1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.$billingSync.queryPurchases(this.$productType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
