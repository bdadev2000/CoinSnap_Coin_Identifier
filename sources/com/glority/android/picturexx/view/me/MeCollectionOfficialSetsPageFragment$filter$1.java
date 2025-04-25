package com.glority.android.picturexx.view.me;

import com.glority.android.database.entities.SeriesItem;
import com.glority.android.picturexx.extensions.SeriesItemListExtKt;
import com.glority.android.picturexx.extensions.SeriesSortType;
import com.picturecoin.generatedAPI.kotlinAPI.model.CountryInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MeCollectionOfficialSetsPageFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$filter$1", f = "MeCollectionOfficialSetsPageFragment.kt", i = {0, 0}, l = {291}, m = "invokeSuspend", n = {"$this$launch", "filterData"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
public final class MeCollectionOfficialSetsPageFragment$filter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<SeriesItem> $data;
    final /* synthetic */ String $issuer;
    final /* synthetic */ Function2<List<SeriesItem>, Continuation<? super Unit>, Object> $onResult;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MeCollectionOfficialSetsPageFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MeCollectionOfficialSetsPageFragment$filter$1(List<SeriesItem> list, String str, MeCollectionOfficialSetsPageFragment meCollectionOfficialSetsPageFragment, Function2<? super List<SeriesItem>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super MeCollectionOfficialSetsPageFragment$filter$1> continuation) {
        super(2, continuation);
        this.$data = list;
        this.$issuer = str;
        this.this$0 = meCollectionOfficialSetsPageFragment;
        this.$onResult = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MeCollectionOfficialSetsPageFragment$filter$1 meCollectionOfficialSetsPageFragment$filter$1 = new MeCollectionOfficialSetsPageFragment$filter$1(this.$data, this.$issuer, this.this$0, this.$onResult, continuation);
        meCollectionOfficialSetsPageFragment$filter$1.L$0 = obj;
        return meCollectionOfficialSetsPageFragment$filter$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MeCollectionOfficialSetsPageFragment$filter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List<com.glority.android.database.entities.SeriesItem>, T] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List, T] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        String str;
        CoroutineScope coroutineScope;
        SeriesSortType seriesSortType;
        Ref.ObjectRef objectRef2;
        CoroutineScope coroutineScope2;
        T t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            objectRef = new Ref.ObjectRef();
            objectRef.element = this.$data;
            String str2 = this.$issuer;
            str = this.this$0.countryFilterAll;
            if (Intrinsics.areEqual(str2, str)) {
                coroutineScope = coroutineScope3;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass2(this.$onResult, objectRef, null), 2, null);
                return Unit.INSTANCE;
            }
            Iterable iterable = (Iterable) objectRef.element;
            String str3 = this.$issuer;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                CountryInfo country = ((SeriesItem) obj2).getCountry();
                if (Intrinsics.areEqual(country != null ? country.getCountryCode3() : null, str3)) {
                    arrayList.add(obj2);
                }
            }
            objectRef.element = arrayList;
            Iterable iterable2 = (Iterable) objectRef.element;
            seriesSortType = this.this$0.currentSortType;
            this.L$0 = coroutineScope3;
            this.L$1 = objectRef;
            this.L$2 = objectRef;
            this.label = 1;
            Object sortSeriesItemsBy = SeriesItemListExtKt.sortSeriesItemsBy(iterable2, seriesSortType, this);
            if (sortSeriesItemsBy == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef2 = objectRef;
            coroutineScope2 = coroutineScope3;
            t = sortSeriesItemsBy;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef2 = (Ref.ObjectRef) this.L$2;
            objectRef = (Ref.ObjectRef) this.L$1;
            coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            t = obj;
        }
        objectRef2.element = t;
        coroutineScope = coroutineScope2;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass2(this.$onResult, objectRef, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MeCollectionOfficialSetsPageFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$filter$1$2", f = "MeCollectionOfficialSetsPageFragment.kt", i = {}, l = {294}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$filter$1$2, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<List<SeriesItem>> $filterData;
        final /* synthetic */ Function2<List<SeriesItem>, Continuation<? super Unit>, Object> $onResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super List<SeriesItem>, ? super Continuation<? super Unit>, ? extends Object> function2, Ref.ObjectRef<List<SeriesItem>> objectRef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$onResult = function2;
            this.$filterData = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$onResult, this.$filterData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function2<List<SeriesItem>, Continuation<? super Unit>, Object> function2 = this.$onResult;
                List<SeriesItem> list = this.$filterData.element;
                this.label = 1;
                if (function2.invoke(list, this) == coroutine_suspended) {
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
    }
}
