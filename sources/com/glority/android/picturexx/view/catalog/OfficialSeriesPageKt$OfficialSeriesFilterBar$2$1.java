package com.glority.android.picturexx.view.catalog;

import androidx.compose.runtime.MutableIntState;
import androidx.lifecycle.FlowLiveDataConversions;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.splash.SplashGlobalLiveData;
import com.glority.android.picturexx.vm.SeriesViewModel;
import com.glority.base.entity.OnActivityResultEntity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OfficialSeriesPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesFilterBar$2$1", f = "OfficialSeriesPage.kt", i = {}, l = {311}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class OfficialSeriesPageKt$OfficialSeriesFilterBar$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<SeriesViewModel.SeriesType, Unit> $onSetsChangeClick;
    final /* synthetic */ MutableIntState $setsName$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OfficialSeriesPageKt$OfficialSeriesFilterBar$2$1(Function1<? super SeriesViewModel.SeriesType, Unit> function1, MutableIntState mutableIntState, Continuation<? super OfficialSeriesPageKt$OfficialSeriesFilterBar$2$1> continuation) {
        super(2, continuation);
        this.$onSetsChangeClick = function1;
        this.$setsName$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OfficialSeriesPageKt$OfficialSeriesFilterBar$2$1(this.$onSetsChangeClick, this.$setsName$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OfficialSeriesPageKt$OfficialSeriesFilterBar$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OfficialSeriesPage.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/glority/base/entity/OnActivityResultEntity;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesFilterBar$2$1$1", f = "OfficialSeriesPage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesFilterBar$2$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<OnActivityResultEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<SeriesViewModel.SeriesType, Unit> $onSetsChangeClick;
        final /* synthetic */ MutableIntState $setsName$delegate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super SeriesViewModel.SeriesType, Unit> function1, MutableIntState mutableIntState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$onSetsChangeClick = function1;
            this.$setsName$delegate = mutableIntState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onSetsChangeClick, this.$setsName$delegate, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OnActivityResultEntity onActivityResultEntity, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(onActivityResultEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OnActivityResultEntity onActivityResultEntity = (OnActivityResultEntity) this.L$0;
            if (onActivityResultEntity.getResultCode() == -1 && onActivityResultEntity.getRequestCode() == 302) {
                this.$setsName$delegate.setIntValue(R.string.catalog_officialseries_option_allseries);
                this.$onSetsChangeClick.invoke(SeriesViewModel.SeriesType.USER);
            }
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
            if (FlowKt.collectLatest(FlowLiveDataConversions.asFlow(SplashGlobalLiveData.INSTANCE.getOnMainActivityResult()), new AnonymousClass1(this.$onSetsChangeClick, this.$setsName$delegate, null), this) == coroutine_suspended) {
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
