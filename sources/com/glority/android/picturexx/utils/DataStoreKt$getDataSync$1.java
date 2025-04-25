package com.glority.android.picturexx.utils;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: DataStore.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.utils.DataStoreKt$getDataSync$1", f = "DataStore.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class DataStoreKt$getDataSync$1<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    final /* synthetic */ T $defaultValue;
    final /* synthetic */ String $key;
    final /* synthetic */ DataStore<Preferences> $this_getDataSync;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreKt$getDataSync$1(T t, DataStore<Preferences> dataStore, String str, Continuation<? super DataStoreKt$getDataSync$1> continuation) {
        super(2, continuation);
        this.$defaultValue = t;
        this.$this_getDataSync = dataStore;
        this.$key = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DataStoreKt$getDataSync$1(this.$defaultValue, this.$this_getDataSync, this.$key, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        return ((DataStoreKt$getDataSync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            obj = this.$defaultValue;
            if (obj instanceof String) {
                flow = DataStoreKt.getString(this.$this_getDataSync, this.$key, (String) obj);
            } else if (obj instanceof Integer) {
                flow = DataStoreKt.getInt(this.$this_getDataSync, this.$key, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                flow = DataStoreKt.getLong(this.$this_getDataSync, this.$key, ((Number) obj).longValue());
            } else if (obj instanceof Float) {
                flow = DataStoreKt.getFloat(this.$this_getDataSync, this.$key, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                flow = DataStoreKt.getDouble(this.$this_getDataSync, this.$key, ((Number) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                flow = DataStoreKt.getBoolean(this.$this_getDataSync, this.$key, ((Boolean) obj).booleanValue());
            }
            this.label = 1;
            obj = FlowKt.first(flow, this);
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
