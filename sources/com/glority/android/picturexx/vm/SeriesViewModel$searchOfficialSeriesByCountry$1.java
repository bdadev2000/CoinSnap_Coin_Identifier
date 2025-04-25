package com.glority.android.picturexx.vm;

import androidx.compose.runtime.MutableState;
import com.glority.android.database.entities.SeriesItem;
import com.glority.android.picturexx.vm.SeriesViewModel;
import com.picturecoin.generatedAPI.kotlinAPI.model.CountryInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SeriesViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.vm.SeriesViewModel$searchOfficialSeriesByCountry$1", f = "SeriesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class SeriesViewModel$searchOfficialSeriesByCountry$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SeriesViewModel.SeriesType $seriesType;
    int label;
    final /* synthetic */ SeriesViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeriesViewModel$searchOfficialSeriesByCountry$1(SeriesViewModel seriesViewModel, SeriesViewModel.SeriesType seriesType, Continuation<? super SeriesViewModel$searchOfficialSeriesByCountry$1> continuation) {
        super(2, continuation);
        this.this$0 = seriesViewModel;
        this.$seriesType = seriesType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SeriesViewModel$searchOfficialSeriesByCountry$1(this.this$0, this.$seriesType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SeriesViewModel$searchOfficialSeriesByCountry$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String countryCode;
        Integer currentCount;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<SeriesItem> value = this.this$0.getRecommendSeriesListResponse().getValue();
        ArrayList arrayList = null;
        if (value != null) {
            SeriesViewModel.SeriesType seriesType = this.$seriesType;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : value) {
                SeriesItem seriesItem = (SeriesItem) obj2;
                if (seriesType != SeriesViewModel.SeriesType.USER || ((currentCount = seriesItem.getCurrentCount()) != null && currentCount.intValue() > 0)) {
                    arrayList2.add(obj2);
                }
            }
            SeriesViewModel seriesViewModel = this.this$0;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayList2) {
                SeriesItem seriesItem2 = (SeriesItem) obj3;
                String str3 = seriesViewModel.searchCountryText;
                if (str3 != null && str3.length() != 0) {
                    CountryInfo country = seriesItem2.getCountry();
                    if (country == null || (countryCode = country.getCountryCode()) == null) {
                        str = null;
                    } else {
                        str = countryCode.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                    }
                    String str4 = seriesViewModel.searchCountryText;
                    if (str4 != null) {
                        str2 = str4.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.areEqual(str, str2)) {
                    }
                }
                arrayList3.add(obj3);
            }
            arrayList = arrayList3;
        }
        MutableState<List<SeriesItem>> displaySeriesList = this.this$0.getDisplaySeriesList();
        if (arrayList == null) {
            arrayList = CollectionsKt.emptyList();
        }
        displaySeriesList.setValue(arrayList);
        return Unit.INSTANCE;
    }
}
