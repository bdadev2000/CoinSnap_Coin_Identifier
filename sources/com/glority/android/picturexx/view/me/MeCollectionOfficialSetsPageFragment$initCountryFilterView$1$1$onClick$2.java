package com.glority.android.picturexx.view.me;

import com.glority.android.database.entities.SeriesItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: MeCollectionOfficialSetsPageFragment.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007H\n"}, d2 = {"<anonymous>", "", "it", "", "Lcom/glority/android/database/entities/SeriesItem;", "Lkotlin/ParameterName;", "name", "data"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$initCountryFilterView$1$1$onClick$2", f = "MeCollectionOfficialSetsPageFragment.kt", i = {}, l = {205}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class MeCollectionOfficialSetsPageFragment$initCountryFilterView$1$1$onClick$2 extends SuspendLambda implements Function2<List<? extends SeriesItem>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MeCollectionOfficialSetsPageFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeCollectionOfficialSetsPageFragment$initCountryFilterView$1$1$onClick$2(MeCollectionOfficialSetsPageFragment meCollectionOfficialSetsPageFragment, Continuation<? super MeCollectionOfficialSetsPageFragment$initCountryFilterView$1$1$onClick$2> continuation) {
        super(2, continuation);
        this.this$0 = meCollectionOfficialSetsPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MeCollectionOfficialSetsPageFragment$initCountryFilterView$1$1$onClick$2 meCollectionOfficialSetsPageFragment$initCountryFilterView$1$1$onClick$2 = new MeCollectionOfficialSetsPageFragment$initCountryFilterView$1$1$onClick$2(this.this$0, continuation);
        meCollectionOfficialSetsPageFragment$initCountryFilterView$1$1$onClick$2.L$0 = obj;
        return meCollectionOfficialSetsPageFragment$initCountryFilterView$1$1$onClick$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends SeriesItem> list, Continuation<? super Unit> continuation) {
        return invoke2((List<SeriesItem>) list, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<SeriesItem> list, Continuation<? super Unit> continuation) {
        return ((MeCollectionOfficialSetsPageFragment$initCountryFilterView$1$1$onClick$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object updateAdapter;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            this.label = 1;
            updateAdapter = this.this$0.updateAdapter(list, this);
            if (updateAdapter == coroutine_suspended) {
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
