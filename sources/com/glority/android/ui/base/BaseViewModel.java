package com.glority.android.ui.base;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: BaseViewModel.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\f0\u000b\"\u0004\b\u0000\u0010\r2\u0006\u0010\t\u001a\u00020\u0005JL\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\f0\u000f\"\u0004\b\u0000\u0010\r2\u0006\u0010\t\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\f0\u000f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\b0\u0012H\u0007Jz\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\f0\u000f\"\u0004\b\u0000\u0010\r2\u0006\u0010\t\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\f0\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\b0\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\b0\u00122\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\r\u0012\u0004\u0012\u00020\b0\u0012H\u0007JR\u0010\u0016\u001a\u00020\b\"\u0004\b\u0000\u0010\r2\u0014\b\u0001\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\f0\u00182\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\b0\u00122\u0016\b\u0003\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\b0\u0012H\u0007JX\u0010\u0016\u001a\u00020\b\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0014\b\u0001\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\f0\u00182\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\b0\u00122\u0016\b\u0003\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\b0\u0012R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/glority/android/ui/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "map", "", "", "", "clearObservable", "", "key", "getObservable", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/glority/network/model/Resource;", ExifInterface.GPS_DIRECTION_TRUE, "request", "Landroidx/lifecycle/LiveData;", "req", "onSuccess", "Lkotlin/Function1;", "onError", "", "onLoading", "requestSingle", "requestBlocking", "Lkotlin/Function0;", "lifecycleCoroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public abstract class BaseViewModel extends ViewModel {
    private final Map<String, Object> map = new HashMap();

    public final <T> MediatorLiveData<Resource<T>> getObservable(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        MediatorLiveData<Resource<T>> mediatorLiveData = (MediatorLiveData) this.map.get(key);
        if (mediatorLiveData != null) {
            return mediatorLiveData;
        }
        MediatorLiveData<Resource<T>> mediatorLiveData2 = new MediatorLiveData<>();
        this.map.put(key, mediatorLiveData2);
        return mediatorLiveData2;
    }

    public final void clearObservable(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.map.remove(key);
    }

    public static /* synthetic */ LiveData request$default(BaseViewModel baseViewModel, String str, LiveData liveData, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
        }
        if ((i & 4) != 0) {
            function1 = new Function1<T, Unit>() { // from class: com.glority.android.ui.base.BaseViewModel$request$1
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
        return baseViewModel.request(str, liveData, function1);
    }

    public final <T> LiveData<Resource<T>> request(String key, LiveData<Resource<T>> req, Function1<? super T, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        return request(key, req, onSuccess, new Function1<Throwable, Unit>() { // from class: com.glority.android.ui.base.BaseViewModel$request$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }
        }, new Function1<T, Unit>() { // from class: com.glority.android.ui.base.BaseViewModel$request$3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((BaseViewModel$request$3<T>) obj);
                return Unit.INSTANCE;
            }
        });
    }

    public static /* synthetic */ LiveData request$default(BaseViewModel baseViewModel, String str, LiveData liveData, Function1 function1, Function1 function12, Function1 function13, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
        }
        if ((i & 8) != 0) {
            function12 = new Function1<Throwable, Unit>() { // from class: com.glority.android.ui.base.BaseViewModel$request$4
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
        Function1 function14 = function12;
        if ((i & 16) != 0) {
            function13 = new Function1<T, Unit>() { // from class: com.glority.android.ui.base.BaseViewModel$request$5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(T t) {
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                    invoke2((BaseViewModel$request$5<T>) obj2);
                    return Unit.INSTANCE;
                }
            };
        }
        return baseViewModel.request(str, liveData, function1, function14, function13);
    }

    public final <T> LiveData<Resource<T>> request(String key, final LiveData<Resource<T>> req, final Function1<? super T, Unit> onSuccess, final Function1<? super Throwable, Unit> onError, final Function1<? super T, Unit> onLoading) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onLoading, "onLoading");
        final MediatorLiveData<Resource<T>> observable = getObservable(key);
        req.observeForever(new Observer<Resource<? extends T>>() { // from class: com.glority.android.ui.base.BaseViewModel$request$6

            /* compiled from: BaseViewModel.kt */
            @Metadata(k = 3, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            /* loaded from: classes4.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Status.values().length];
                    iArr[Status.SUCCESS.ordinal()] = 1;
                    iArr[Status.ERROR.ordinal()] = 2;
                    iArr[Status.LOADING.ordinal()] = 3;
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
                        return;
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
            function12 = new Function1<Throwable, Unit>() { // from class: com.glority.android.ui.base.BaseViewModel$requestSingle$1
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void requestSingle$default(BaseViewModel baseViewModel, LifecycleCoroutineScope lifecycleCoroutineScope, Function0 function0, Function1 function1, Function1 function12, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestSingle");
        }
        if ((i & 8) != 0) {
            function12 = new Function1<Throwable, Unit>() { // from class: com.glority.android.ui.base.BaseViewModel$requestSingle$3
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
        baseViewModel.requestSingle(lifecycleCoroutineScope, function0, function1, function12);
    }

    public final <T> void requestSingle(LifecycleCoroutineScope lifecycleCoroutineScope, Function0<? extends Resource<? extends T>> requestBlocking, Function1<? super T, Unit> onSuccess, Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "lifecycleCoroutineScope");
        Intrinsics.checkNotNullParameter(requestBlocking, "requestBlocking");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, Dispatchers.getIO(), null, new BaseViewModel$requestSingle$4(requestBlocking, onSuccess, onError, null), 2, null);
    }
}
