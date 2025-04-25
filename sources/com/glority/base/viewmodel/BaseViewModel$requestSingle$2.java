package com.glority.base.viewmodel;

import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.base.viewmodel.BaseViewModel$requestSingle$2", f = "BaseViewModel.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BaseViewModel$requestSingle$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Throwable, Unit> $onError;
    final /* synthetic */ Function1<T, Unit> $onSuccess;
    final /* synthetic */ Function0<Resource<T>> $requestBlocking;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModel$requestSingle$2(Function0<? extends Resource<? extends T>> function0, Function1<? super T, Unit> function1, Function1<? super Throwable, Unit> function12, Continuation<? super BaseViewModel$requestSingle$2> continuation) {
        super(2, continuation);
        this.$requestBlocking = function0;
        this.$onSuccess = function1;
        this.$onError = function12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseViewModel$requestSingle$2(this.$requestBlocking, this.$onSuccess, this.$onError, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseViewModel$requestSingle$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Resource resource = (Resource) this.$requestBlocking.invoke();
            this.label = 1;
            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(resource, this.$onSuccess, this.$onError, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.base.viewmodel.BaseViewModel$requestSingle$2$1", f = "BaseViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.base.viewmodel.BaseViewModel$requestSingle$2$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Throwable, Unit> $onError;
        final /* synthetic */ Function1<T, Unit> $onSuccess;
        final /* synthetic */ Resource<T> $result;
        int label;

        /* compiled from: BaseViewModel.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
        /* renamed from: com.glority.base.viewmodel.BaseViewModel$requestSingle$2$1$WhenMappings */
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Resource<? extends T> resource, Function1<? super T, Unit> function1, Function1<? super Throwable, Unit> function12, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$result = resource;
            this.$onSuccess = function1;
            this.$onError = function12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$result, this.$onSuccess, this.$onError, continuation);
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
            int i = WhenMappings.$EnumSwitchMapping$0[this.$result.getStatus().ordinal()];
            if (i == 1) {
                Object data = this.$result.getData();
                if (data != null) {
                    this.$onSuccess.invoke(data);
                }
            } else if (i == 2) {
                this.$onError.invoke(this.$result.getException());
            }
            return Unit.INSTANCE;
        }
    }
}
