package com.glority.network.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import com.glority.network.model.Resource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [RequestType] */
/* compiled from: NetworkBoundResource.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u0002H\u0003 \u0006*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "ResultType", "RequestType", "response", "Lcom/glority/network/model/Resource;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class NetworkBoundResource$fetchFromNetwork$2<RequestType> extends Lambda implements Function1<Resource<? extends RequestType>, Unit> {
    final /* synthetic */ LiveData<Resource<RequestType>> $apiResponse;
    final /* synthetic */ LiveData<ResultType> $dbSource;
    final /* synthetic */ NetworkBoundResource<ResultType, RequestType> this$0;

    /* compiled from: NetworkBoundResource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes9.dex */
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
    public NetworkBoundResource$fetchFromNetwork$2(NetworkBoundResource<ResultType, RequestType> networkBoundResource, LiveData<ResultType> liveData, LiveData<Resource<RequestType>> liveData2) {
        super(1);
        this.this$0 = networkBoundResource;
        this.$dbSource = liveData;
        this.$apiResponse = liveData2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((Resource) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(final Resource<? extends RequestType> resource) {
        ((NetworkBoundResource) this.this$0).result.removeSource(this.$dbSource);
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            ((NetworkBoundResource) this.this$0).result.removeSource(this.$apiResponse);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass1(this.this$0, resource, null), 3, null);
        } else {
            if (i != 2) {
                return;
            }
            ((NetworkBoundResource) this.this$0).result.removeSource(this.$apiResponse);
            this.this$0.onFetchFailed();
            MediatorLiveData mediatorLiveData = ((NetworkBoundResource) this.this$0).result;
            Object obj = this.$dbSource;
            final NetworkBoundResource<ResultType, RequestType> networkBoundResource = this.this$0;
            final Function1 function1 = new Function1<ResultType, Unit>() { // from class: com.glority.network.model.NetworkBoundResource$fetchFromNetwork$2.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                    invoke2((AnonymousClass2<ResultType>) obj2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ResultType resulttype) {
                    NetworkBoundResource<ResultType, RequestType> networkBoundResource2 = networkBoundResource;
                    Resource.Companion companion = Resource.INSTANCE;
                    String message = resource.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    networkBoundResource2.setValue(Resource.Companion.error$default(companion, message, resulttype, null, 4, null));
                }
            };
            mediatorLiveData.addSource(obj, new Observer() { // from class: com.glority.network.model.NetworkBoundResource$fetchFromNetwork$2$$ExternalSyntheticLambda0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj2) {
                    NetworkBoundResource$fetchFromNetwork$2.invoke$lambda$0(Function1.this, obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NetworkBoundResource.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "ResultType", "RequestType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.glority.network.model.NetworkBoundResource$fetchFromNetwork$2$1", f = "NetworkBoundResource.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.network.model.NetworkBoundResource$fetchFromNetwork$2$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Resource<RequestType> $response;
        int label;
        final /* synthetic */ NetworkBoundResource<ResultType, RequestType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(NetworkBoundResource<ResultType, RequestType> networkBoundResource, Resource<? extends RequestType> resource, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = networkBoundResource;
            this.$response = resource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$response, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NetworkBoundResource<ResultType, RequestType> networkBoundResource = this.this$0;
                RequestType data = this.$response.getData();
                Intrinsics.checkNotNull(data);
                networkBoundResource.saveCallResult(data);
                this.label = 1;
                if (BuildersKt.withContext(Dispatchers.getMain(), new C01361(this.this$0, null), this) == coroutine_suspended) {
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
        /* compiled from: NetworkBoundResource.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "ResultType", "RequestType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(c = "com.glority.network.model.NetworkBoundResource$fetchFromNetwork$2$1$1", f = "NetworkBoundResource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.glority.network.model.NetworkBoundResource$fetchFromNetwork$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes9.dex */
        public static final class C01361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ NetworkBoundResource<ResultType, RequestType> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01361(NetworkBoundResource<ResultType, RequestType> networkBoundResource, Continuation<? super C01361> continuation) {
                super(2, continuation);
                this.this$0 = networkBoundResource;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01361(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    MediatorLiveData mediatorLiveData = ((NetworkBoundResource) this.this$0).result;
                    LiveData loadFromDb = this.this$0.loadFromDb();
                    final NetworkBoundResource<ResultType, RequestType> networkBoundResource = this.this$0;
                    final Function1 function1 = new Function1<ResultType, Unit>() { // from class: com.glority.network.model.NetworkBoundResource.fetchFromNetwork.2.1.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                            invoke2((C01371<ResultType>) obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(ResultType resulttype) {
                            networkBoundResource.setValue(Resource.INSTANCE.success(resulttype));
                        }
                    };
                    mediatorLiveData.addSource(loadFromDb, new Observer() { // from class: com.glority.network.model.NetworkBoundResource$fetchFromNetwork$2$1$1$$ExternalSyntheticLambda0
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj2) {
                            Function1.this.invoke(obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }
}
