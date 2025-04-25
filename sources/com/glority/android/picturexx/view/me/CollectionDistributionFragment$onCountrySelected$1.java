package com.glority.android.picturexx.view.me;

import android.content.Context;
import com.glority.android.picturexx.extensions.CollectionCountrySummaryWrapper;
import com.glority.android.picturexx.extensions.MapViewExtKt;
import com.glority.android.picturexx.extensions.MarkerTag;
import com.google.android.gms.maps.model.Marker;
import java.util.Iterator;
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
@DebugMetadata(c = "com.glority.android.picturexx.view.me.CollectionDistributionFragment$onCountrySelected$1", f = "CollectionDistributionFragment.kt", i = {}, l = {216, 221}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class CollectionDistributionFragment$onCountrySelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CollectionCountrySummaryWrapper $collectionCountrySummaryWrapper;
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ CollectionDistributionFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionDistributionFragment$onCountrySelected$1(CollectionDistributionFragment collectionDistributionFragment, Context context, CollectionCountrySummaryWrapper collectionCountrySummaryWrapper, Continuation<? super CollectionDistributionFragment$onCountrySelected$1> continuation) {
        super(2, continuation);
        this.this$0 = collectionDistributionFragment;
        this.$context = context;
        this.$collectionCountrySummaryWrapper = collectionCountrySummaryWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CollectionDistributionFragment$onCountrySelected$1(this.this$0, this.$context, this.$collectionCountrySummaryWrapper, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CollectionDistributionFragment$onCountrySelected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Marker marker;
        List list;
        Object obj2;
        Marker marker2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            marker = this.this$0.selectedMarker;
            if (marker != null) {
                this.label = 1;
                if (MapViewExtKt.setSelected(marker, this.$context, false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        if (this.$collectionCountrySummaryWrapper != null) {
            CollectionDistributionFragment collectionDistributionFragment = this.this$0;
            list = collectionDistributionFragment.allMarkers;
            CollectionCountrySummaryWrapper collectionCountrySummaryWrapper = this.$collectionCountrySummaryWrapper;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Marker marker3 = (Marker) next;
                if (marker3.getTag() != null) {
                    Object tag = marker3.getTag();
                    MarkerTag markerTag = tag instanceof MarkerTag ? (MarkerTag) tag : null;
                    if (Intrinsics.areEqual(markerTag != null ? markerTag.getCountryCode() : null, collectionCountrySummaryWrapper.getCountryCode())) {
                        obj2 = next;
                        break;
                    }
                }
            }
            collectionDistributionFragment.selectedMarker = (Marker) obj2;
            marker2 = this.this$0.selectedMarker;
            if (marker2 != null) {
                this.label = 2;
                if (MapViewExtKt.setSelected(marker2, this.$context, true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
