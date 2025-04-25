package com.glority.android.picturexx.composable;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.extensions.CollectionCountrySummaryWrapper;
import com.glority.base.viewmodel.AppViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CollectionDistributionList.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionPage2$1", f = "CollectionDistributionList.kt", i = {}, l = {363}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class CollectionDistributionListKt$CollectionDistributionPage2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotStateList<CollectionItem> $collections;
    final /* synthetic */ CollectionCountrySummaryWrapper $summaryWrapper;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionDistributionListKt$CollectionDistributionPage2$1(SnapshotStateList<CollectionItem> snapshotStateList, CollectionCountrySummaryWrapper collectionCountrySummaryWrapper, Continuation<? super CollectionDistributionListKt$CollectionDistributionPage2$1> continuation) {
        super(2, continuation);
        this.$collections = snapshotStateList;
        this.$summaryWrapper = collectionCountrySummaryWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CollectionDistributionListKt$CollectionDistributionPage2$1(this.$collections, this.$summaryWrapper, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CollectionDistributionListKt$CollectionDistributionPage2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long userId = AppViewModel.INSTANCE.getUserId();
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new CollectionDistributionListKt$CollectionDistributionPage2$1$dataList$1(userId, this.$summaryWrapper, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$collections.clear();
        this.$collections.addAll((List) obj);
        return Unit.INSTANCE;
    }
}
