package com.glority.android.picturexx.view.catalog;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.FlowLiveDataConversions;
import com.glority.android.picturexx.repository.CatalogRepository;
import com.glority.base.entity.LoadingState;
import com.glority.base.server.CacheThenNetworkRequest;
import com.picturecoin.generatedAPI.kotlinAPI.config.CountryInfo;
import com.picturecoin.generatedAPI.kotlinAPI.series.CatalogCountryListMessage;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SelectedCountryView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.catalog.SelectedCountryViewKt$SelectedCountryView$2$1", f = "SelectedCountryView.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class SelectedCountryViewKt$SelectedCountryView$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<LoadingState<SortedMap<String, List<CountryInfo>>>> $countryData;
    final /* synthetic */ MutableState<List<CountryInfo>> $originalCountryList;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectedCountryViewKt$SelectedCountryView$2$1(MutableState<List<CountryInfo>> mutableState, MutableState<LoadingState<SortedMap<String, List<CountryInfo>>>> mutableState2, Continuation<? super SelectedCountryViewKt$SelectedCountryView$2$1> continuation) {
        super(2, continuation);
        this.$originalCountryList = mutableState;
        this.$countryData = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectedCountryViewKt$SelectedCountryView$2$1(this.$originalCountryList, this.$countryData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectedCountryViewKt$SelectedCountryView$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectedCountryView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/glority/base/server/CacheThenNetworkRequest$ResultData;", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogCountryListMessage;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.catalog.SelectedCountryViewKt$SelectedCountryView$2$1$1", f = "SelectedCountryView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.catalog.SelectedCountryViewKt$SelectedCountryView$2$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CacheThenNetworkRequest.ResultData<CatalogCountryListMessage>, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<LoadingState<SortedMap<String, List<CountryInfo>>>> $countryData;
        final /* synthetic */ MutableState<List<CountryInfo>> $originalCountryList;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableState<List<CountryInfo>> mutableState, MutableState<LoadingState<SortedMap<String, List<CountryInfo>>>> mutableState2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$originalCountryList = mutableState;
            this.$countryData = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$originalCountryList, this.$countryData, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CacheThenNetworkRequest.ResultData<CatalogCountryListMessage> resultData, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(resultData, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CatalogCountryListMessage catalogCountryListMessage = (CatalogCountryListMessage) ((CacheThenNetworkRequest.ResultData) this.L$0).getResult();
            if (catalogCountryListMessage == null || (arrayList = catalogCountryListMessage.getCountries()) == null) {
                arrayList = new ArrayList();
            }
            this.$originalCountryList.setValue(arrayList);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : arrayList) {
                Character firstOrNull = StringsKt.firstOrNull(((CountryInfo) obj2).getName());
                if (firstOrNull == null || (str = Boxing.boxChar(Character.toUpperCase(firstOrNull.charValue())).toString()) == null) {
                    str = "#";
                }
                Object obj3 = linkedHashMap.get(str);
                if (obj3 == null) {
                    obj3 = (List) new ArrayList();
                    linkedHashMap.put(str, obj3);
                }
                ((List) obj3).add(obj2);
            }
            this.$countryData.setValue(LoadingState.INSTANCE.success(MapsKt.toSortedMap(linkedHashMap, new Comparator() { // from class: com.glority.android.picturexx.view.catalog.SelectedCountryViewKt$SelectedCountryView$2$1$1$invokeSuspend$$inlined$compareBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((String) t, (String) t2);
                }
            })));
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (FlowKt.collectLatest(FlowLiveDataConversions.asFlow(CatalogRepository.INSTANCE.requestCatalogCountryListMessage()), new AnonymousClass1(this.$originalCountryList, this.$countryData, null), this) == coroutine_suspended) {
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
