package com.glority.android.picturexx.utils;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKt;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: DataStore.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u0002H\n¢\u0006\u0002\u0010\u000e\u001a+\u0010\u000f\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u0002H\n¢\u0006\u0002\u0010\u000e\u001a+\u0010\u0010\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u0002H\n¢\u0006\u0002\u0010\u0012\u001aN\u0010\u0013\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u0002H\n2!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u0011H\n¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\u0010\u0019\u001a\u0010\u0010\u001a\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a(\u0010\u001b\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010\u001c\u001a(\u0010\u001d\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010\u001f\u001a(\u0010 \u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020!H\u0082@¢\u0006\u0002\u0010\"\u001a(\u0010#\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020$H\u0082@¢\u0006\u0002\u0010%\u001a(\u0010&\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020'H\u0082@¢\u0006\u0002\u0010(\u001a(\u0010)\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020*H\u0082@¢\u0006\u0002\u0010+\u001a.\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0-*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\fH\u0002\u001a*\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001e0-*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010.\u001a\u00020\u001eH\u0002\u001a*\u00100\u001a\b\u0012\u0004\u0012\u00020!0-*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010.\u001a\u00020!H\u0002\u001a*\u00101\u001a\b\u0012\u0004\u0012\u00020$0-*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010.\u001a\u00020$H\u0002\u001a*\u00102\u001a\b\u0012\u0004\u0012\u00020'0-*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010.\u001a\u00020'H\u0002\u001a*\u00103\u001a\b\u0012\u0004\u0012\u00020*0-*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010.\u001a\u00020*H\u0002\"%\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u00064"}, d2 = {"dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "putDataSync", "", ExifInterface.GPS_DIRECTION_TRUE, "key", "", "value", "(Landroidx/datastore/core/DataStore;Ljava/lang/String;Ljava/lang/Object;)V", "putDataAsync", "getDataSync", "defaultValue", "(Landroidx/datastore/core/DataStore;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getDataAsync", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "t", "(Landroidx/datastore/core/DataStore;Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "clear", "putString", "(Landroidx/datastore/core/DataStore;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putInt", "", "(Landroidx/datastore/core/DataStore;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putLong", "", "(Landroidx/datastore/core/DataStore;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putFloat", "", "(Landroidx/datastore/core/DataStore;Ljava/lang/String;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putDouble", "", "(Landroidx/datastore/core/DataStore;Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putBoolean", "", "(Landroidx/datastore/core/DataStore;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getString", "Lkotlinx/coroutines/flow/Flow;", "default", "getInt", "getLong", "getFloat", "getDouble", "getBoolean", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class DataStoreKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DataStoreKt.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    private static final ReadOnlyProperty dataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default("data_store", null, null, null, 14, null);

    public static final DataStore<Preferences> getDataStore(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (DataStore) dataStore$delegate.getValue(context, $$delegatedProperties[0]);
    }

    public static final <T> void putDataSync(DataStore<Preferences> dataStore, String key, T t) {
        Intrinsics.checkNotNullParameter(dataStore, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        BuildersKt__BuildersKt.runBlocking$default(null, new DataStoreKt$putDataSync$1(t, dataStore, key, null), 1, null);
    }

    public static final <T> void putDataAsync(DataStore<Preferences> dataStore, String key, T t) {
        Intrinsics.checkNotNullParameter(dataStore, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new DataStoreKt$putDataAsync$1(dataStore, key, t, null), 3, null);
    }

    public static final <T> T getDataSync(DataStore<Preferences> dataStore, String key, T t) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(dataStore, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new DataStoreKt$getDataSync$1(t, dataStore, key, null), 1, null);
        return (T) runBlocking$default;
    }

    public static final <T> void getDataAsync(DataStore<Preferences> dataStore, String key, T t, Function1<? super T, Unit> callback) {
        Intrinsics.checkNotNullParameter(dataStore, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new DataStoreKt$getDataAsync$1(dataStore, key, t, callback, null), 3, null);
    }

    public static final Preferences clear(DataStore<Preferences> dataStore) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(dataStore, "<this>");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new DataStoreKt$clear$1(dataStore, null), 1, null);
        return (Preferences) runBlocking$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object putString(DataStore<Preferences> dataStore, String str, String str2, Continuation<? super Unit> continuation) {
        Object edit = PreferencesKt.edit(dataStore, new DataStoreKt$putString$2(str, str2, null), continuation);
        return edit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object putInt(DataStore<Preferences> dataStore, String str, int i, Continuation<? super Unit> continuation) {
        Object edit = PreferencesKt.edit(dataStore, new DataStoreKt$putInt$2(str, i, null), continuation);
        return edit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object putLong(DataStore<Preferences> dataStore, String str, long j, Continuation<? super Unit> continuation) {
        Object edit = PreferencesKt.edit(dataStore, new DataStoreKt$putLong$2(str, j, null), continuation);
        return edit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object putFloat(DataStore<Preferences> dataStore, String str, float f, Continuation<? super Unit> continuation) {
        Object edit = PreferencesKt.edit(dataStore, new DataStoreKt$putFloat$2(str, f, null), continuation);
        return edit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object putDouble(DataStore<Preferences> dataStore, String str, double d, Continuation<? super Unit> continuation) {
        Object edit = PreferencesKt.edit(dataStore, new DataStoreKt$putDouble$2(str, d, null), continuation);
        return edit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object putBoolean(DataStore<Preferences> dataStore, String str, boolean z, Continuation<? super Unit> continuation) {
        Object edit = PreferencesKt.edit(dataStore, new DataStoreKt$putBoolean$2(str, z, null), continuation);
        return edit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : Unit.INSTANCE;
    }

    static /* synthetic */ Flow getString$default(DataStore dataStore, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return getString(dataStore, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow<String> getString(DataStore<Preferences> dataStore, final String str, final String str2) {
        final Flow<Preferences> data = dataStore.getData();
        return new Flow<String>() { // from class: com.glority.android.picturexx.utils.DataStoreKt$getString$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 50)
            /* renamed from: com.glority.android.picturexx.utils.DataStoreKt$getString$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ String $default$inlined;
                final /* synthetic */ String $key$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 50)
                @DebugMetadata(c = "com.glority.android.picturexx.utils.DataStoreKt$getString$$inlined$map$1$2", f = "DataStore.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.glority.android.picturexx.utils.DataStoreKt$getString$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes5.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, String str, String str2) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$key$inlined = str;
                    this.$default$inlined = str2;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.glority.android.picturexx.utils.DataStoreKt$getString$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L14
                        r0 = r6
                        com.glority.android.picturexx.utils.DataStoreKt$getString$$inlined$map$1$2$1 r0 = (com.glority.android.picturexx.utils.DataStoreKt$getString$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r6 = r0.label
                        int r6 = r6 - r2
                        r0.label = r6
                        goto L19
                    L14:
                        com.glority.android.picturexx.utils.DataStoreKt$getString$$inlined$map$1$2$1 r0 = new com.glority.android.picturexx.utils.DataStoreKt$getString$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L19:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L55
                    L2a:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L32:
                        kotlin.ResultKt.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        r2 = r0
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                        java.lang.String r2 = r4.$key$inlined
                        androidx.datastore.preferences.core.Preferences$Key r2 = androidx.datastore.preferences.core.PreferencesKeys.stringKey(r2)
                        java.lang.Object r5 = r5.get(r2)
                        java.lang.String r5 = (java.lang.String) r5
                        if (r5 != 0) goto L4c
                        java.lang.String r5 = r4.$default$inlined
                    L4c:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L55
                        return r1
                    L55:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.utils.DataStoreKt$getString$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, str, str2), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow<Integer> getInt(DataStore<Preferences> dataStore, final String str, final int i) {
        final Flow<Preferences> data = dataStore.getData();
        return new Flow<Integer>() { // from class: com.glority.android.picturexx.utils.DataStoreKt$getInt$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 50)
            /* renamed from: com.glority.android.picturexx.utils.DataStoreKt$getInt$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ int $default$inlined;
                final /* synthetic */ String $key$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 50)
                @DebugMetadata(c = "com.glority.android.picturexx.utils.DataStoreKt$getInt$$inlined$map$1$2", f = "DataStore.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.glority.android.picturexx.utils.DataStoreKt$getInt$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes5.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, String str, int i) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$key$inlined = str;
                    this.$default$inlined = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.glority.android.picturexx.utils.DataStoreKt$getInt$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L14
                        r0 = r6
                        com.glority.android.picturexx.utils.DataStoreKt$getInt$$inlined$map$1$2$1 r0 = (com.glority.android.picturexx.utils.DataStoreKt$getInt$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r6 = r0.label
                        int r6 = r6 - r2
                        r0.label = r6
                        goto L19
                    L14:
                        com.glority.android.picturexx.utils.DataStoreKt$getInt$$inlined$map$1$2$1 r0 = new com.glority.android.picturexx.utils.DataStoreKt$getInt$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L19:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L5e
                    L2a:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L32:
                        kotlin.ResultKt.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        r2 = r0
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                        java.lang.String r2 = r4.$key$inlined
                        androidx.datastore.preferences.core.Preferences$Key r2 = androidx.datastore.preferences.core.PreferencesKeys.intKey(r2)
                        java.lang.Object r5 = r5.get(r2)
                        java.lang.Integer r5 = (java.lang.Integer) r5
                        if (r5 == 0) goto L4f
                        int r5 = r5.intValue()
                        goto L51
                    L4f:
                        int r5 = r4.$default$inlined
                    L51:
                        java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L5e
                        return r1
                    L5e:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.utils.DataStoreKt$getInt$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, str, i), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
    }

    static /* synthetic */ Flow getInt$default(DataStore dataStore, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return getInt(dataStore, str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow<Long> getLong(DataStore<Preferences> dataStore, final String str, final long j) {
        final Flow<Preferences> data = dataStore.getData();
        return new Flow<Long>() { // from class: com.glority.android.picturexx.utils.DataStoreKt$getLong$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 50)
            /* renamed from: com.glority.android.picturexx.utils.DataStoreKt$getLong$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ long $default$inlined;
                final /* synthetic */ String $key$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 50)
                @DebugMetadata(c = "com.glority.android.picturexx.utils.DataStoreKt$getLong$$inlined$map$1$2", f = "DataStore.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.glority.android.picturexx.utils.DataStoreKt$getLong$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes5.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, String str, long j) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$key$inlined = str;
                    this.$default$inlined = j;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.glority.android.picturexx.utils.DataStoreKt$getLong$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L14
                        r0 = r8
                        com.glority.android.picturexx.utils.DataStoreKt$getLong$$inlined$map$1$2$1 r0 = (com.glority.android.picturexx.utils.DataStoreKt$getLong$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r8 = r0.label
                        int r8 = r8 - r2
                        r0.label = r8
                        goto L19
                    L14:
                        com.glority.android.picturexx.utils.DataStoreKt$getLong$$inlined$map$1$2$1 r0 = new com.glority.android.picturexx.utils.DataStoreKt$getLong$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L19:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L5e
                    L2a:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L32:
                        kotlin.ResultKt.throwOnFailure(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                        r2 = r0
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        androidx.datastore.preferences.core.Preferences r7 = (androidx.datastore.preferences.core.Preferences) r7
                        java.lang.String r2 = r6.$key$inlined
                        androidx.datastore.preferences.core.Preferences$Key r2 = androidx.datastore.preferences.core.PreferencesKeys.longKey(r2)
                        java.lang.Object r7 = r7.get(r2)
                        java.lang.Long r7 = (java.lang.Long) r7
                        if (r7 == 0) goto L4f
                        long r4 = r7.longValue()
                        goto L51
                    L4f:
                        long r4 = r6.$default$inlined
                    L51:
                        java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L5e
                        return r1
                    L5e:
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.utils.DataStoreKt$getLong$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Long> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, str, j), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
    }

    static /* synthetic */ Flow getLong$default(DataStore dataStore, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return getLong(dataStore, str, j);
    }

    static /* synthetic */ Flow getFloat$default(DataStore dataStore, String str, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return getFloat(dataStore, str, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow<Float> getFloat(DataStore<Preferences> dataStore, final String str, final float f) {
        final Flow<Preferences> data = dataStore.getData();
        return new Flow<Float>() { // from class: com.glority.android.picturexx.utils.DataStoreKt$getFloat$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 50)
            /* renamed from: com.glority.android.picturexx.utils.DataStoreKt$getFloat$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ float $default$inlined;
                final /* synthetic */ String $key$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 50)
                @DebugMetadata(c = "com.glority.android.picturexx.utils.DataStoreKt$getFloat$$inlined$map$1$2", f = "DataStore.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.glority.android.picturexx.utils.DataStoreKt$getFloat$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes5.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, String str, float f) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$key$inlined = str;
                    this.$default$inlined = f;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.glority.android.picturexx.utils.DataStoreKt$getFloat$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L14
                        r0 = r6
                        com.glority.android.picturexx.utils.DataStoreKt$getFloat$$inlined$map$1$2$1 r0 = (com.glority.android.picturexx.utils.DataStoreKt$getFloat$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r6 = r0.label
                        int r6 = r6 - r2
                        r0.label = r6
                        goto L19
                    L14:
                        com.glority.android.picturexx.utils.DataStoreKt$getFloat$$inlined$map$1$2$1 r0 = new com.glority.android.picturexx.utils.DataStoreKt$getFloat$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L19:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L5e
                    L2a:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L32:
                        kotlin.ResultKt.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        r2 = r0
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                        java.lang.String r2 = r4.$key$inlined
                        androidx.datastore.preferences.core.Preferences$Key r2 = androidx.datastore.preferences.core.PreferencesKeys.floatKey(r2)
                        java.lang.Object r5 = r5.get(r2)
                        java.lang.Float r5 = (java.lang.Float) r5
                        if (r5 == 0) goto L4f
                        float r5 = r5.floatValue()
                        goto L51
                    L4f:
                        float r5 = r4.$default$inlined
                    L51:
                        java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L5e
                        return r1
                    L5e:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.utils.DataStoreKt$getFloat$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Float> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, str, f), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
    }

    static /* synthetic */ Flow getDouble$default(DataStore dataStore, String str, double d, int i, Object obj) {
        if ((i & 2) != 0) {
            d = 0.0d;
        }
        return getDouble(dataStore, str, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow<Double> getDouble(DataStore<Preferences> dataStore, final String str, final double d) {
        final Flow<Preferences> data = dataStore.getData();
        return new Flow<Double>() { // from class: com.glority.android.picturexx.utils.DataStoreKt$getDouble$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 50)
            /* renamed from: com.glority.android.picturexx.utils.DataStoreKt$getDouble$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ double $default$inlined;
                final /* synthetic */ String $key$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 50)
                @DebugMetadata(c = "com.glority.android.picturexx.utils.DataStoreKt$getDouble$$inlined$map$1$2", f = "DataStore.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.glority.android.picturexx.utils.DataStoreKt$getDouble$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes5.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, String str, double d) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$key$inlined = str;
                    this.$default$inlined = d;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.glority.android.picturexx.utils.DataStoreKt$getDouble$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L14
                        r0 = r8
                        com.glority.android.picturexx.utils.DataStoreKt$getDouble$$inlined$map$1$2$1 r0 = (com.glority.android.picturexx.utils.DataStoreKt$getDouble$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r8 = r0.label
                        int r8 = r8 - r2
                        r0.label = r8
                        goto L19
                    L14:
                        com.glority.android.picturexx.utils.DataStoreKt$getDouble$$inlined$map$1$2$1 r0 = new com.glority.android.picturexx.utils.DataStoreKt$getDouble$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L19:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L5e
                    L2a:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L32:
                        kotlin.ResultKt.throwOnFailure(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                        r2 = r0
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        androidx.datastore.preferences.core.Preferences r7 = (androidx.datastore.preferences.core.Preferences) r7
                        java.lang.String r2 = r6.$key$inlined
                        androidx.datastore.preferences.core.Preferences$Key r2 = androidx.datastore.preferences.core.PreferencesKeys.doubleKey(r2)
                        java.lang.Object r7 = r7.get(r2)
                        java.lang.Double r7 = (java.lang.Double) r7
                        if (r7 == 0) goto L4f
                        double r4 = r7.doubleValue()
                        goto L51
                    L4f:
                        double r4 = r6.$default$inlined
                    L51:
                        java.lang.Double r7 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r4)
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L5e
                        return r1
                    L5e:
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.utils.DataStoreKt$getDouble$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Double> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, str, d), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
    }

    static /* synthetic */ Flow getBoolean$default(DataStore dataStore, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getBoolean(dataStore, str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow<Boolean> getBoolean(DataStore<Preferences> dataStore, final String str, final boolean z) {
        final Flow<Preferences> data = dataStore.getData();
        return new Flow<Boolean>() { // from class: com.glority.android.picturexx.utils.DataStoreKt$getBoolean$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 50)
            /* renamed from: com.glority.android.picturexx.utils.DataStoreKt$getBoolean$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ boolean $default$inlined;
                final /* synthetic */ String $key$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 50)
                @DebugMetadata(c = "com.glority.android.picturexx.utils.DataStoreKt$getBoolean$$inlined$map$1$2", f = "DataStore.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.glority.android.picturexx.utils.DataStoreKt$getBoolean$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes5.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, String str, boolean z) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$key$inlined = str;
                    this.$default$inlined = z;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.glority.android.picturexx.utils.DataStoreKt$getBoolean$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L14
                        r0 = r6
                        com.glority.android.picturexx.utils.DataStoreKt$getBoolean$$inlined$map$1$2$1 r0 = (com.glority.android.picturexx.utils.DataStoreKt$getBoolean$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r6 = r0.label
                        int r6 = r6 - r2
                        r0.label = r6
                        goto L19
                    L14:
                        com.glority.android.picturexx.utils.DataStoreKt$getBoolean$$inlined$map$1$2$1 r0 = new com.glority.android.picturexx.utils.DataStoreKt$getBoolean$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L19:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L5e
                    L2a:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L32:
                        kotlin.ResultKt.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        r2 = r0
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                        java.lang.String r2 = r4.$key$inlined
                        androidx.datastore.preferences.core.Preferences$Key r2 = androidx.datastore.preferences.core.PreferencesKeys.booleanKey(r2)
                        java.lang.Object r5 = r5.get(r2)
                        java.lang.Boolean r5 = (java.lang.Boolean) r5
                        if (r5 == 0) goto L4f
                        boolean r5 = r5.booleanValue()
                        goto L51
                    L4f:
                        boolean r5 = r4.$default$inlined
                    L51:
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L5e
                        return r1
                    L5e:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.utils.DataStoreKt$getBoolean$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, str, z), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
    }
}
