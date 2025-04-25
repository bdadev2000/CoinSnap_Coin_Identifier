package com.glority.android.picturexx.view.catalog;

import androidx.compose.runtime.MutableState;
import com.glority.base.entity.LoadingState;
import com.picturecoin.generatedAPI.kotlinAPI.config.CountryInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SelectedCountryView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.catalog.SelectedCountryViewKt$SelectedCountryView$3$1", f = "SelectedCountryView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class SelectedCountryViewKt$SelectedCountryView$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<LoadingState<SortedMap<String, List<CountryInfo>>>> $countryData;
    final /* synthetic */ MutableState<List<CountryInfo>> $originalCountryList;
    final /* synthetic */ String $searchKey;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectedCountryViewKt$SelectedCountryView$3$1(String str, MutableState<List<CountryInfo>> mutableState, MutableState<LoadingState<SortedMap<String, List<CountryInfo>>>> mutableState2, Continuation<? super SelectedCountryViewKt$SelectedCountryView$3$1> continuation) {
        super(2, continuation);
        this.$searchKey = str;
        this.$originalCountryList = mutableState;
        this.$countryData = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectedCountryViewKt$SelectedCountryView$3$1(this.$searchKey, this.$originalCountryList, this.$countryData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectedCountryViewKt$SelectedCountryView$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$searchKey != null) {
            List<CountryInfo> value = this.$originalCountryList.getValue();
            ArrayList arrayList = null;
            if (value != null) {
                String str2 = this.$searchKey;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : value) {
                    CountryInfo countryInfo = (CountryInfo) obj2;
                    String lowerCase = countryInfo.getCountryCode().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) lowerCase2, false, 2, (Object) null)) {
                        String lowerCase3 = countryInfo.getName().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                        String lowerCase4 = str2.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                        if (StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) lowerCase4, false, 2, (Object) null)) {
                        }
                    }
                    arrayList2.add(obj2);
                }
                arrayList = arrayList2;
            }
            if (arrayList != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayList) {
                    Character firstOrNull = StringsKt.firstOrNull(((CountryInfo) obj3).getName());
                    if (firstOrNull == null || (str = Boxing.boxChar(Character.toUpperCase(firstOrNull.charValue())).toString()) == null) {
                        str = "#";
                    }
                    Object obj4 = linkedHashMap.get(str);
                    if (obj4 == null) {
                        obj4 = (List) new ArrayList();
                        linkedHashMap.put(str, obj4);
                    }
                    ((List) obj4).add(obj3);
                }
                this.$countryData.setValue(LoadingState.INSTANCE.success(MapsKt.toSortedMap(linkedHashMap, new Comparator() { // from class: com.glority.android.picturexx.view.catalog.SelectedCountryViewKt$SelectedCountryView$3$1$invokeSuspend$$inlined$compareBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues((String) t, (String) t2);
                    }
                })));
            }
        }
        return Unit.INSTANCE;
    }
}
