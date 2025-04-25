package com.glority.android.picturexx.view.catalog;

import com.glority.android.picturexx.vm.CatalogViewModel;
import com.glority.android.picturexx.widget.CountrySearchBarState;
import com.glority.base.viewmodel.AppViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CatalogPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.catalog.CatalogPageKt$CatalogPage$2", f = "CatalogPage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CatalogPageKt$CatalogPage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CatalogViewModel $catalogViewModel;
    final /* synthetic */ CountrySearchBarState $countrySearchBarState;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogPageKt$CatalogPage$2(CatalogViewModel catalogViewModel, CountrySearchBarState countrySearchBarState, Continuation<? super CatalogPageKt$CatalogPage$2> continuation) {
        super(2, continuation);
        this.$catalogViewModel = catalogViewModel;
        this.$countrySearchBarState = countrySearchBarState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CatalogPageKt$CatalogPage$2(this.$catalogViewModel, this.$countrySearchBarState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CatalogPageKt$CatalogPage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CatalogViewModel catalogViewModel = this.$catalogViewModel;
        String selectedCountry = this.$countrySearchBarState.getSelectedCountry();
        if (selectedCountry == null) {
            selectedCountry = AppViewModel.INSTANCE.getInstance().getCountryCode();
        }
        catalogViewModel.fetchCatalogList(selectedCountry);
        return Unit.INSTANCE;
    }
}
