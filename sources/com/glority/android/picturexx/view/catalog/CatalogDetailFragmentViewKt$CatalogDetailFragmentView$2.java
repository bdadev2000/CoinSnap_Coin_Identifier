package com.glority.android.picturexx.view.catalog;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.FlowLiveDataConversions;
import com.glority.android.picturexx.vm.CatalogViewModel;
import com.glority.network.model.Resource;
import com.picturecoin.generatedAPI.kotlinAPI.series.CatalogDetailMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CatalogDetailFragmentView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CatalogDetailFragmentView$2", f = "CatalogDetailFragmentView.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class CatalogDetailFragmentViewKt$CatalogDetailFragmentView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Resource<CatalogDetailMessage>> $catalogDetailData$delegate;
    final /* synthetic */ String $catalogUid;
    final /* synthetic */ CatalogViewModel $catalogViewModel;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogDetailFragmentViewKt$CatalogDetailFragmentView$2(CatalogViewModel catalogViewModel, String str, MutableState<Resource<CatalogDetailMessage>> mutableState, Continuation<? super CatalogDetailFragmentViewKt$CatalogDetailFragmentView$2> continuation) {
        super(2, continuation);
        this.$catalogViewModel = catalogViewModel;
        this.$catalogUid = str;
        this.$catalogDetailData$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CatalogDetailFragmentViewKt$CatalogDetailFragmentView$2(this.$catalogViewModel, this.$catalogUid, this.$catalogDetailData$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CatalogDetailFragmentViewKt$CatalogDetailFragmentView$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CatalogDetailFragmentView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/glority/network/model/Resource;", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogDetailMessage;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CatalogDetailFragmentView$2$1", f = "CatalogDetailFragmentView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.catalog.CatalogDetailFragmentViewKt$CatalogDetailFragmentView$2$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Resource<? extends CatalogDetailMessage>, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Resource<CatalogDetailMessage>> $catalogDetailData$delegate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableState<Resource<CatalogDetailMessage>> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$catalogDetailData$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$catalogDetailData$delegate, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Resource<CatalogDetailMessage> resource, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(resource, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Resource<? extends CatalogDetailMessage> resource, Continuation<? super Unit> continuation) {
            return invoke2((Resource<CatalogDetailMessage>) resource, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$catalogDetailData$delegate.setValue((Resource) this.L$0);
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
            if (FlowKt.collectLatest(FlowLiveDataConversions.asFlow(this.$catalogViewModel.requestCatalogDetailMessage(this.$catalogUid)), new AnonymousClass1(this.$catalogDetailData$delegate, null), this) == coroutine_suspended) {
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
