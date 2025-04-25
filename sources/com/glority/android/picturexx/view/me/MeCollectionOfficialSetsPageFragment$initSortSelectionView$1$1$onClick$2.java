package com.glority.android.picturexx.view.me;

import com.glority.android.picturexx.adapter.OfficialSetPageAdapter;
import com.glority.android.picturexx.definition.SeriesItemWrapper;
import com.glority.android.picturexx.extensions.SeriesSortType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MeCollectionOfficialSetsPageFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$initSortSelectionView$1$1$onClick$2", f = "MeCollectionOfficialSetsPageFragment.kt", i = {}, l = {241, 242}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class MeCollectionOfficialSetsPageFragment$initSortSelectionView$1$1$onClick$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $position;
    final /* synthetic */ Function1<Integer, Unit> $selectedPosition;
    int label;
    final /* synthetic */ MeCollectionOfficialSetsPageFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MeCollectionOfficialSetsPageFragment$initSortSelectionView$1$1$onClick$2(Function1<? super Integer, Unit> function1, int i, MeCollectionOfficialSetsPageFragment meCollectionOfficialSetsPageFragment, Continuation<? super MeCollectionOfficialSetsPageFragment$initSortSelectionView$1$1$onClick$2> continuation) {
        super(2, continuation);
        this.$selectedPosition = function1;
        this.$position = i;
        this.this$0 = meCollectionOfficialSetsPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MeCollectionOfficialSetsPageFragment$initSortSelectionView$1$1$onClick$2(this.$selectedPosition, this.$position, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MeCollectionOfficialSetsPageFragment$initSortSelectionView$1$1$onClick$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OfficialSetPageAdapter adapter;
        SeriesSortType seriesSortType;
        Object updateAdapter;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Function1<Integer, Unit> function1 = this.$selectedPosition;
            if (function1 != null) {
                function1.invoke(Boxing.boxInt(this.$position));
            }
            MeCollectionOfficialSetsPageFragment meCollectionOfficialSetsPageFragment = this.this$0;
            adapter = meCollectionOfficialSetsPageFragment.getAdapter();
            List<SeriesItemWrapper> data = adapter.getData();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                arrayList.add(((SeriesItemWrapper) it.next()).getSeriesItem());
            }
            seriesSortType = this.this$0.currentSortType;
            this.label = 1;
            obj = meCollectionOfficialSetsPageFragment.sort(arrayList, seriesSortType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MeCollectionOfficialSetsPageFragment.access$getBinding(this.this$0).rvSeries.scrollToPosition(0);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        MeCollectionOfficialSetsPageFragment meCollectionOfficialSetsPageFragment2 = this.this$0;
        this.label = 2;
        updateAdapter = meCollectionOfficialSetsPageFragment2.updateAdapter((List) obj, this);
        if (updateAdapter == coroutine_suspended) {
            return coroutine_suspended;
        }
        MeCollectionOfficialSetsPageFragment.access$getBinding(this.this$0).rvSeries.scrollToPosition(0);
        return Unit.INSTANCE;
    }
}
