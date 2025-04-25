package com.glority.base.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;

/* compiled from: BaseViewModel.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\t\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0006J\u0012\u0010\r\u001a\u00020\u000e2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0006J,\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u00100\n0\t\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0006J\u0082\u0001\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00062\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\u00122\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u000e0\u00162\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u000e0\u00162\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u000b\u0012\u0004\u0012\u00020\u000e0\u0016H\u0007JR\u0010\u001a\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u000b2\u0014\b\u0001\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\u001c2\u0014\b\u0001\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u000e0\u00162\u0016\b\u0003\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u000e0\u0016H\u0007R\u001e\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/glority/base/viewmodel/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "map", "", "Ljava/lang/Class;", "", "getObservable", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/glority/network/model/Resource;", ExifInterface.GPS_DIRECTION_TRUE, "data", "clearObservable", "", "getListObservable", "", "request", "Landroidx/lifecycle/LiveData;", "keyData", "req", "onSuccess", "Lkotlin/Function1;", "onError", "", "onLoading", "requestSingle", "requestBlocking", "Lkotlin/Function0;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public abstract class BaseViewModel extends ViewModel {
    public static final int $stable = 8;
    private final Map<Class<?>, Object> map = new HashMap();

    public final <T> MediatorLiveData<Resource<T>> getObservable(Class<T> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object obj = this.map.get(data);
        MediatorLiveData<Resource<T>> mediatorLiveData = obj instanceof MediatorLiveData ? (MediatorLiveData) obj : null;
        if (mediatorLiveData != null) {
            return mediatorLiveData;
        }
        MediatorLiveData<Resource<T>> mediatorLiveData2 = new MediatorLiveData<>();
        this.map.put(data, mediatorLiveData2);
        return mediatorLiveData2;
    }

    public final void clearObservable(Class<?> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.map.remove(data);
    }

    public final <T> MediatorLiveData<Resource<List<T>>> getListObservable(Class<T> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object obj = this.map.get(data);
        MediatorLiveData<Resource<List<T>>> mediatorLiveData = obj instanceof MediatorLiveData ? (MediatorLiveData) obj : null;
        if (mediatorLiveData != null) {
            return mediatorLiveData;
        }
        MediatorLiveData<Resource<List<T>>> mediatorLiveData2 = new MediatorLiveData<>();
        this.map.put(data, mediatorLiveData2);
        return mediatorLiveData2;
    }

    public static /* synthetic */ LiveData request$default(BaseViewModel baseViewModel, Class cls, LiveData liveData, Function1 function1, Function1 function12, Function1 function13, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
        }
        if ((i & 4) != 0) {
            function1 = new Function1<T, Unit>() { // from class: com.glority.base.viewmodel.BaseViewModel$request$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(T t) {
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                    invoke2((BaseViewModel$request$1<T>) obj2);
                    return Unit.INSTANCE;
                }
            };
        }
        Function1 function14 = function1;
        if ((i & 8) != 0) {
            function12 = new Function1<Throwable, Unit>() { // from class: com.glority.base.viewmodel.BaseViewModel$request$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            };
        }
        Function1 function15 = function12;
        if ((i & 16) != 0) {
            function13 = new Function1<T, Unit>() { // from class: com.glority.base.viewmodel.BaseViewModel$request$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(T t) {
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                    invoke2((BaseViewModel$request$3<T>) obj2);
                    return Unit.INSTANCE;
                }
            };
        }
        return baseViewModel.request(cls, liveData, function14, function15, function13);
    }

    public final <T> LiveData<Resource<T>> request(Class<T> keyData, final LiveData<Resource<T>> req, final Function1<? super T, Unit> onSuccess, final Function1<? super Throwable, Unit> onError, final Function1<? super T, Unit> onLoading) {
        Intrinsics.checkNotNullParameter(keyData, "keyData");
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onLoading, "onLoading");
        final MediatorLiveData<Resource<T>> observable = getObservable(keyData);
        req.observeForever(new Observer<Resource<? extends T>>() { // from class: com.glority.base.viewmodel.BaseViewModel$request$4

            /* compiled from: BaseViewModel.kt */
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
                    try {
                        iArr[Status.LOADING.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(Resource<? extends T> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                int i = WhenMappings.$EnumSwitchMapping$0[it.getStatus().ordinal()];
                if (i == 1) {
                    T data = it.getData();
                    if (data != null) {
                        onSuccess.invoke(data);
                    }
                    observable.setValue(it);
                    observable.removeSource(req);
                    req.removeObserver(this);
                    return;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    onLoading.invoke(it.getData());
                    observable.setValue(it);
                    return;
                }
                onError.invoke(it.getException());
                observable.setValue(it);
                observable.removeSource(req);
                req.removeObserver(this);
            }
        });
        return req;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void requestSingle$default(BaseViewModel baseViewModel, Function0 function0, Function1 function1, Function1 function12, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestSingle");
        }
        if ((i & 4) != 0) {
            function12 = new Function1<Throwable, Unit>() { // from class: com.glority.base.viewmodel.BaseViewModel$requestSingle$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            };
        }
        baseViewModel.requestSingle(function0, function1, function12);
    }

    public final <T> void requestSingle(Function0<? extends Resource<? extends T>> requestBlocking, Function1<? super T, Unit> onSuccess, Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(requestBlocking, "requestBlocking");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new BaseViewModel$requestSingle$2(requestBlocking, onSuccess, onError, null), 3, null);
    }
}
