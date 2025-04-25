package com.glority.billing.agent;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.billingclient.api.Purchase;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyBillingAgent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.billing.agent.MyBillingAgent$Companion$hasActiveSubscribed$1", f = "MyBillingAgent.kt", i = {0}, l = {TypedValues.CycleType.TYPE_PATH_ROTATE, 419}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class MyBillingAgent$Companion$hasActiveSubscribed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BillingSync $billingSync;
    final /* synthetic */ Function2<Exception, Boolean, Unit> $callback;
    final /* synthetic */ String $productType;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MyBillingAgent$Companion$hasActiveSubscribed$1(BillingSync billingSync, String str, Function2<? super Exception, ? super Boolean, Unit> function2, Continuation<? super MyBillingAgent$Companion$hasActiveSubscribed$1> continuation) {
        super(2, continuation);
        this.$billingSync = billingSync;
        this.$productType = str;
        this.$callback = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MyBillingAgent$Companion$hasActiveSubscribed$1 myBillingAgent$Companion$hasActiveSubscribed$1 = new MyBillingAgent$Companion$hasActiveSubscribed$1(this.$billingSync, this.$productType, this.$callback, continuation);
        myBillingAgent$Companion$hasActiveSubscribed$1.L$0 = obj;
        return myBillingAgent$Companion$hasActiveSubscribed$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MyBillingAgent$Companion$hasActiveSubscribed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object connect;
        Deferred async$default;
        Object await;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            this.L$0 = coroutineScope;
            this.label = 1;
            connect = this.$billingSync.connect(this);
            if (connect == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                await = obj;
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AnonymousClass1((Pair) await, this.$callback, null), 3, null);
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            connect = obj;
        }
        CoroutineScope coroutineScope2 = coroutineScope;
        if (((Boolean) connect).booleanValue()) {
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new MyBillingAgent$Companion$hasActiveSubscribed$1$deferred1$1(this.$billingSync, this.$productType, null), 3, null);
            this.L$0 = null;
            this.label = 2;
            await = async$default.await(this);
            if (await == coroutine_suspended) {
                return coroutine_suspended;
            }
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AnonymousClass1((Pair) await, this.$callback, null), 3, null);
            return Unit.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AnonymousClass2(this.$callback, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyBillingAgent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.billing.agent.MyBillingAgent$Companion$hasActiveSubscribed$1$1", f = "MyBillingAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.billing.agent.MyBillingAgent$Companion$hasActiveSubscribed$1$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Exception, Boolean, Unit> $callback;
        final /* synthetic */ Pair<Boolean, List<Purchase>> $purchaseResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Pair<Boolean, ? extends List<Purchase>> pair, Function2<? super Exception, ? super Boolean, Unit> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$purchaseResult = pair;
            this.$callback = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$purchaseResult, this.$callback, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<Purchase> second = this.$purchaseResult.getSecond();
            if (second != null && !second.isEmpty()) {
                this.$callback.invoke(null, Boxing.boxBoolean(true));
            } else if (!this.$purchaseResult.getFirst().booleanValue()) {
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
    @DebugMetadata(c = "com.glority.billing.agent.MyBillingAgent$Companion$hasActiveSubscribed$1$2", f = "MyBillingAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.billing.agent.MyBillingAgent$Companion$hasActiveSubscribed$1$2, reason: invalid class name */
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
