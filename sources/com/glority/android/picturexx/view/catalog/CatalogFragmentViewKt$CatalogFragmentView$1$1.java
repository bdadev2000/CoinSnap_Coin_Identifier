package com.glority.android.picturexx.view.catalog;

import androidx.compose.foundation.pager.PagerState;
import androidx.lifecycle.FlowLiveDataConversions;
import com.glority.android.picturexx.GlobalLiveBus;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CatalogFragmentView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.catalog.CatalogFragmentViewKt$CatalogFragmentView$1$1", f = "CatalogFragmentView.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CatalogFragmentViewKt$CatalogFragmentView$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PagerState $pageState;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogFragmentViewKt$CatalogFragmentView$1$1(PagerState pagerState, Continuation<? super CatalogFragmentViewKt$CatalogFragmentView$1$1> continuation) {
        super(2, continuation);
        this.$pageState = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CatalogFragmentViewKt$CatalogFragmentView$1$1(this.$pageState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CatalogFragmentViewKt$CatalogFragmentView$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow asFlow = FlowLiveDataConversions.asFlow(GlobalLiveBus.INSTANCE.getChangeCatalogTab());
            final PagerState pagerState = this.$pageState;
            this.label = 1;
            if (asFlow.collect(new FlowCollector() { // from class: com.glority.android.picturexx.view.catalog.CatalogFragmentViewKt$CatalogFragmentView$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Integer) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Integer num, Continuation<? super Unit> continuation) {
                    PagerState pagerState2 = PagerState.this;
                    Intrinsics.checkNotNull(num);
                    Object scrollToPage$default = PagerState.scrollToPage$default(pagerState2, num.intValue(), 0.0f, continuation, 2, null);
                    return scrollToPage$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scrollToPage$default : Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
