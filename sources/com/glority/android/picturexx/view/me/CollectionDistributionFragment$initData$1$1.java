package com.glority.android.picturexx.view.me;

import android.content.Context;
import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.android.picturexx.extensions.MapViewExtKt;
import com.glority.android.picturexx.vm.SummaryDistributionViewModel;
import com.glority.utils.stability.LogUtils;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
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
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectionDistributionFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.me.CollectionDistributionFragment$initData$1$1", f = "CollectionDistributionFragment.kt", i = {1}, l = {143, 148}, m = "invokeSuspend", n = {"marker"}, s = {"L$1"})
/* loaded from: classes5.dex */
public final class CollectionDistributionFragment$initData$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $count;
    final /* synthetic */ String $countryCode;
    final /* synthetic */ GoogleMap $googleMap;
    final /* synthetic */ double $latitude;
    final /* synthetic */ double $longitude;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CollectionDistributionFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionDistributionFragment$initData$1$1(GoogleMap googleMap, Context context, double d, double d2, int i, String str, CollectionDistributionFragment collectionDistributionFragment, Continuation<? super CollectionDistributionFragment$initData$1$1> continuation) {
        super(2, continuation);
        this.$googleMap = googleMap;
        this.$context = context;
        this.$latitude = d;
        this.$longitude = d2;
        this.$count = i;
        this.$countryCode = str;
        this.this$0 = collectionDistributionFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CollectionDistributionFragment$initData$1$1(this.$googleMap, this.$context, this.$latitude, this.$longitude, this.$count, this.$countryCode, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CollectionDistributionFragment$initData$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        String str;
        CollectionDistributionFragment collectionDistributionFragment;
        Marker marker;
        SummaryDistributionViewModel distributionViewModel;
        Marker marker2;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GoogleMap googleMap = this.$googleMap;
            Context context2 = this.$context;
            double d = this.$latitude;
            double d2 = this.$longitude;
            int i2 = this.$count;
            String str2 = this.$countryCode;
            CollectionDistributionFragment collectionDistributionFragment2 = this.this$0;
            this.L$0 = context2;
            this.L$1 = str2;
            this.L$2 = collectionDistributionFragment2;
            this.label = 1;
            Object addCoinMarker = MapViewExtKt.addCoinMarker(googleMap, context2, d, d2, i2, str2, this);
            if (addCoinMarker == coroutine_suspended) {
                return coroutine_suspended;
            }
            context = context2;
            obj = addCoinMarker;
            str = str2;
            collectionDistributionFragment = collectionDistributionFragment2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                marker2 = (Marker) this.L$1;
                collectionDistributionFragment = (CollectionDistributionFragment) this.L$0;
                ResultKt.throwOnFailure(obj);
                marker = marker2;
                collectionDistributionFragment.selectedMarker = marker;
                Unit unit = Unit.INSTANCE;
                return Unit.INSTANCE;
            }
            collectionDistributionFragment = (CollectionDistributionFragment) this.L$2;
            str = (String) this.L$1;
            context = (Context) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        marker = (Marker) obj;
        if (marker != null) {
            list = collectionDistributionFragment.allMarkers;
            list.add(marker);
        }
        distributionViewModel = collectionDistributionFragment.getDistributionViewModel();
        if (Intrinsics.areEqual(str, distributionViewModel.getSelectedCountryCode().getValue())) {
            if (marker != null) {
                this.L$0 = collectionDistributionFragment;
                this.L$1 = marker;
                this.L$2 = null;
                this.label = 2;
                if (MapViewExtKt.setSelected(marker, context, true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                marker2 = marker;
                marker = marker2;
            }
            collectionDistributionFragment.selectedMarker = marker;
        }
        Unit unit2 = Unit.INSTANCE;
        return Unit.INSTANCE;
    }
}
