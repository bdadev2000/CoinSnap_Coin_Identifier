package com.glority.android.picturexx.utils;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: DataStore.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.utils.DataStoreKt$putDouble$2", f = "DataStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class DataStoreKt$putDouble$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ double $value;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreKt$putDouble$2(String str, double d, Continuation<? super DataStoreKt$putDouble$2> continuation) {
        super(2, continuation);
        this.$key = str;
        this.$value = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DataStoreKt$putDouble$2 dataStoreKt$putDouble$2 = new DataStoreKt$putDouble$2(this.$key, this.$value, continuation);
        dataStoreKt$putDouble$2.L$0 = obj;
        return dataStoreKt$putDouble$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
        return ((DataStoreKt$putDouble$2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ((MutablePreferences) this.L$0).set(PreferencesKeys.doubleKey(this.$key), Boxing.boxDouble(this.$value));
        return Unit.INSTANCE;
    }
}
