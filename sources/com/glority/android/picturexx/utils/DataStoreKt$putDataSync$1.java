package com.glority.android.picturexx.utils;

import android.util.Log;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import com.glority.android.core.app.AppContext;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataStore.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.utils.DataStoreKt$putDataSync$1", f = "DataStore.kt", i = {}, l = {27, 30, 33, 36, 39, 42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class DataStoreKt$putDataSync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ DataStore<Preferences> $this_putDataSync;
    final /* synthetic */ T $value;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreKt$putDataSync$1(T t, DataStore<Preferences> dataStore, String str, Continuation<? super DataStoreKt$putDataSync$1> continuation) {
        super(2, continuation);
        this.$value = t;
        this.$this_putDataSync = dataStore;
        this.$key = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DataStoreKt$putDataSync$1(this.$value, this.$this_putDataSync, this.$key, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DataStoreKt$putDataSync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object putBoolean;
        Object putDouble;
        Object putFloat;
        Object putLong;
        Object putInt;
        Object putString;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    T t = this.$value;
                    DataStore<Preferences> dataStore = this.$this_putDataSync;
                    String str = this.$key;
                    if (t instanceof String) {
                        this.label = 1;
                        putString = DataStoreKt.putString(dataStore, str, (String) t, this);
                        if (putString == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (t instanceof Integer) {
                        int intValue = ((Number) t).intValue();
                        this.label = 2;
                        putInt = DataStoreKt.putInt(dataStore, str, intValue, this);
                        if (putInt == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (t instanceof Long) {
                        long longValue = ((Number) t).longValue();
                        this.label = 3;
                        putLong = DataStoreKt.putLong(dataStore, str, longValue, this);
                        if (putLong == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (t instanceof Float) {
                        float floatValue = ((Number) t).floatValue();
                        this.label = 4;
                        putFloat = DataStoreKt.putFloat(dataStore, str, floatValue, this);
                        if (putFloat == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (t instanceof Double) {
                        double doubleValue = ((Number) t).doubleValue();
                        this.label = 5;
                        putDouble = DataStoreKt.putDouble(dataStore, str, doubleValue, this);
                        if (putDouble == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (t instanceof Boolean) {
                        boolean booleanValue = ((Boolean) t).booleanValue();
                        this.label = 6;
                        putBoolean = DataStoreKt.putBoolean(dataStore, str, booleanValue, this);
                        if (putBoolean == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    ResultKt.throwOnFailure(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            return null;
        }
    }
}
