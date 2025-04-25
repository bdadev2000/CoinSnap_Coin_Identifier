package com.glority.billing.agent;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.glority.billing.play.BillingSync;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyBillingAgent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.billing.agent.MyBillingAgent$Companion$hasSubscribed$1", f = "MyBillingAgent.kt", i = {0, 1, 2}, l = {389, 393, 394}, m = "invokeSuspend", n = {"$this$launch", "deferred2", "purchaseResult"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes6.dex */
public final class MyBillingAgent$Companion$hasSubscribed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BillingSync $billingSync;
    final /* synthetic */ Function2<Exception, Boolean, Unit> $callback;
    final /* synthetic */ String $productType;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MyBillingAgent$Companion$hasSubscribed$1(BillingSync billingSync, String str, Function2<? super Exception, ? super Boolean, Unit> function2, Continuation<? super MyBillingAgent$Companion$hasSubscribed$1> continuation) {
        super(2, continuation);
        this.$billingSync = billingSync;
        this.$productType = str;
        this.$callback = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MyBillingAgent$Companion$hasSubscribed$1 myBillingAgent$Companion$hasSubscribed$1 = new MyBillingAgent$Companion$hasSubscribed$1(this.$billingSync, this.$productType, this.$callback, continuation);
        myBillingAgent$Companion$hasSubscribed$1.L$0 = obj;
        return myBillingAgent$Companion$hasSubscribed$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MyBillingAgent$Companion$hasSubscribed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.billing.agent.MyBillingAgent$Companion$hasSubscribed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyBillingAgent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.billing.agent.MyBillingAgent$Companion$hasSubscribed$1$1", f = "MyBillingAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.billing.agent.MyBillingAgent$Companion$hasSubscribed$1$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Exception, Boolean, Unit> $callback;
        final /* synthetic */ Pair<Boolean, List<PurchaseHistoryRecord>> $purchaseHistoryResult;
        final /* synthetic */ Pair<Boolean, List<Purchase>> $purchaseResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Pair<Boolean, ? extends List<Purchase>> pair, Pair<Boolean, ? extends List<PurchaseHistoryRecord>> pair2, Function2<? super Exception, ? super Boolean, Unit> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$purchaseResult = pair;
            this.$purchaseHistoryResult = pair2;
            this.$callback = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$purchaseResult, this.$purchaseHistoryResult, this.$callback, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<PurchaseHistoryRecord> second;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<Purchase> second2 = this.$purchaseResult.getSecond();
            if ((second2 != null && !second2.isEmpty()) || ((second = this.$purchaseHistoryResult.getSecond()) != null && !second.isEmpty())) {
                this.$callback.invoke(null, Boxing.boxBoolean(true));
            } else if (!this.$purchaseResult.getFirst().booleanValue() || !this.$purchaseHistoryResult.getFirst().booleanValue()) {
                this.$callback.invoke(new Exception("query purchase error"), null);
            } else {
                this.$callback.invoke(null, Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyBillingAgent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.billing.agent.MyBillingAgent$Companion$hasSubscribed$1$2", f = "MyBillingAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.billing.agent.MyBillingAgent$Companion$hasSubscribed$1$2, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Exception, Boolean, Unit> $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super Exception, ? super Boolean, Unit> function2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$callback = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$callback, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$callback.invoke(new Exception("connect error"), null);
            return Unit.INSTANCE;
        }
    }
}
