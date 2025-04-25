package com.glority.android.picturexx.composable;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.glority.android.database.entities.CollectionItem;
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

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectionDistribution.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.composable.CollectionDistributionKt$CollectionDistributionPage2$1$1", f = "CollectionDistribution.kt", i = {}, l = {379}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class CollectionDistributionKt$CollectionDistributionPage2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotStateList<CollectionItem> $collections;
    final /* synthetic */ String $countryCode;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionDistributionKt$CollectionDistributionPage2$1$1(SnapshotStateList<CollectionItem> snapshotStateList, MutableState<Boolean> mutableState, String str, Continuation<? super CollectionDistributionKt$CollectionDistributionPage2$1$1> continuation) {
        super(2, continuation);
        this.$collections = snapshotStateList;
        this.$isLoading$delegate = mutableState;
        this.$countryCode = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CollectionDistributionKt$CollectionDistributionPage2$1$1(this.$collections, this.$isLoading$delegate, this.$countryCode, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CollectionDistributionKt$CollectionDistributionPage2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CollectionDistributionKt.CollectionDistributionPage2$lambda$7(this.$isLoading$delegate, true);
            long userId = AppViewModel.INSTANCE.getUserId();
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new CollectionDistributionKt$CollectionDistributionPage2$1$1$dataList$1(userId, this.$countryCode, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CollectionDistributionKt.CollectionDistributionPage2$lambda$7(this.$isLoading$delegate, false);
        this.$collections.clear();
        this.$collections.addAll((List) obj);
        return Unit.INSTANCE;
    }
}
