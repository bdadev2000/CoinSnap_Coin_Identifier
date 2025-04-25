package com.glority.android.picturexx.view.catalog;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.FlowLiveDataConversions;
import com.glority.android.picturexx.GlobalLiveBus;
import com.glority.android.picturexx.vm.SeriesViewModel;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
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
/* compiled from: OfficialSeriesPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesPage$2", f = "OfficialSeriesPage.kt", i = {}, l = {AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class OfficialSeriesPageKt$OfficialSeriesPage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<SeriesViewModel.SeriesType> $currentFilterType$delegate;
    final /* synthetic */ SeriesViewModel $seriesViewModel;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfficialSeriesPageKt$OfficialSeriesPage$2(SeriesViewModel seriesViewModel, MutableState<SeriesViewModel.SeriesType> mutableState, Continuation<? super OfficialSeriesPageKt$OfficialSeriesPage$2> continuation) {
        super(2, continuation);
        this.$seriesViewModel = seriesViewModel;
        this.$currentFilterType$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OfficialSeriesPageKt$OfficialSeriesPage$2(this.$seriesViewModel, this.$currentFilterType$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OfficialSeriesPageKt$OfficialSeriesPage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OfficialSeriesPage.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesPage$2$1", f = "OfficialSeriesPage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesPage$2$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<SeriesViewModel.SeriesType> $currentFilterType$delegate;
        final /* synthetic */ SeriesViewModel $seriesViewModel;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SeriesViewModel seriesViewModel, MutableState<SeriesViewModel.SeriesType> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$seriesViewModel = seriesViewModel;
            this.$currentFilterType$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$seriesViewModel, this.$currentFilterType$delegate, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SeriesViewModel.SeriesType OfficialSeriesPage$lambda$4;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            this.$seriesViewModel.getFilterCountry().setValue(str);
            SeriesViewModel seriesViewModel = this.$seriesViewModel;
            OfficialSeriesPage$lambda$4 = OfficialSeriesPageKt.OfficialSeriesPage$lambda$4(this.$currentFilterType$delegate);
            seriesViewModel.searchOfficialSeriesByCountry(str, OfficialSeriesPage$lambda$4);
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
            if (FlowKt.collectLatest(FlowLiveDataConversions.asFlow(GlobalLiveBus.INSTANCE.getChangeCatalogFilterCountry()), new AnonymousClass1(this.$seriesViewModel, this.$currentFilterType$delegate, null), this) == coroutine_suspended) {
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
