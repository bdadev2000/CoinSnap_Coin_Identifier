package com.glority.network.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import com.glority.android.xx.constants.LogEvents;
import com.glority.network.model.NetworkBoundResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: NetworkBoundResource.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\tJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\tH%J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0003J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\tH%J\b\u0010\u000f\u001a\u00020\fH\u0014J\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0001H%¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0003J\u0017\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00018\u0000H%¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/glority/network/model/NetworkBoundResource;", "ResultType", "RequestType", "", "()V", LogEvents.result, "Landroidx/lifecycle/MediatorLiveData;", "Lcom/glority/network/model/Resource;", "asLiveData", "Landroidx/lifecycle/LiveData;", "createCall", "fetchFromNetwork", "", "dbSource", "loadFromDb", "onFetchFailed", "saveCallResult", "item", "(Ljava/lang/Object;)V", "setValue", "newValue", "shouldFetch", "", "data", "(Ljava/lang/Object;)Z", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public abstract class NetworkBoundResource<ResultType, RequestType> {
    private final MediatorLiveData<Resource<ResultType>> result;

    protected abstract LiveData<Resource<RequestType>> createCall();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract LiveData<ResultType> loadFromDb();

    /* JADX INFO: Access modifiers changed from: protected */
    public void onFetchFailed() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void saveCallResult(RequestType item);

    protected abstract boolean shouldFetch(ResultType data);

    public NetworkBoundResource() {
        MediatorLiveData<Resource<ResultType>> mediatorLiveData = new MediatorLiveData<>();
        this.result = mediatorLiveData;
        mediatorLiveData.setValue(Resource.INSTANCE.loading(null));
        LiveData<ResultType> loadFromDb = loadFromDb();
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, loadFromDb);
        mediatorLiveData.addSource(loadFromDb, new Observer() { // from class: com.glority.network.model.NetworkBoundResource$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NetworkBoundResource._init_$lambda$0(Function1.this, obj);
            }
        });
    }

    /* compiled from: NetworkBoundResource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "ResultType", "RequestType", "data", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.glority.network.model.NetworkBoundResource$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    static final class AnonymousClass1 extends Lambda implements Function1<ResultType, Unit> {
        final /* synthetic */ LiveData<ResultType> $dbSource;
        final /* synthetic */ NetworkBoundResource<ResultType, RequestType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NetworkBoundResource<ResultType, RequestType> networkBoundResource, LiveData<ResultType> liveData) {
            super(1);
            this.this$0 = networkBoundResource;
            this.$dbSource = liveData;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((AnonymousClass1) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ResultType resulttype) {
            ((NetworkBoundResource) this.this$0).result.removeSource(this.$dbSource);
            if (this.this$0.shouldFetch(resulttype)) {
                this.this$0.fetchFromNetwork(this.$dbSource);
                return;
            }
            MediatorLiveData mediatorLiveData = ((NetworkBoundResource) this.this$0).result;
            LiveData<ResultType> liveData = this.$dbSource;
            final NetworkBoundResource<ResultType, RequestType> networkBoundResource = this.this$0;
            final Function1<ResultType, Unit> function1 = new Function1<ResultType, Unit>() { // from class: com.glority.network.model.NetworkBoundResource.1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2((C01351) obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ResultType resulttype2) {
                    networkBoundResource.setValue(Resource.INSTANCE.success(resulttype2));
                }
            };
            mediatorLiveData.addSource(liveData, new Observer() { // from class: com.glority.network.model.NetworkBoundResource$1$$ExternalSyntheticLambda0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    NetworkBoundResource.AnonymousClass1.invoke$lambda$0(Function1.this, obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setValue(Resource<? extends ResultType> newValue) {
        if (Intrinsics.areEqual(this.result.getValue(), newValue)) {
            return;
        }
        this.result.setValue(newValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchFromNetwork(LiveData<ResultType> dbSource) {
        LiveData<Resource<RequestType>> createCall = createCall();
        MediatorLiveData<Resource<ResultType>> mediatorLiveData = this.result;
        final Function1<ResultType, Unit> function1 = new Function1<ResultType, Unit>(this) { // from class: com.glority.network.model.NetworkBoundResource$fetchFromNetwork$1
            final /* synthetic */ NetworkBoundResource<ResultType, RequestType> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((NetworkBoundResource$fetchFromNetwork$1<ResultType>) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ResultType resulttype) {
                this.this$0.setValue(Resource.INSTANCE.loading(resulttype));
            }
        };
        mediatorLiveData.addSource(dbSource, new Observer() { // from class: com.glority.network.model.NetworkBoundResource$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NetworkBoundResource.fetchFromNetwork$lambda$1(Function1.this, obj);
            }
        });
        MediatorLiveData<Resource<ResultType>> mediatorLiveData2 = this.result;
        final NetworkBoundResource$fetchFromNetwork$2 networkBoundResource$fetchFromNetwork$2 = new NetworkBoundResource$fetchFromNetwork$2(this, dbSource, createCall);
        mediatorLiveData2.addSource(createCall, new Observer() { // from class: com.glority.network.model.NetworkBoundResource$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NetworkBoundResource.fetchFromNetwork$lambda$2(Function1.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchFromNetwork$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchFromNetwork$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final LiveData<Resource<ResultType>> asLiveData() {
        MediatorLiveData<Resource<ResultType>> mediatorLiveData = this.result;
        Intrinsics.checkNotNull(mediatorLiveData, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.glority.network.model.Resource<ResultType of com.glority.network.model.NetworkBoundResource>>");
        return mediatorLiveData;
    }
}
