package com.glority.android.picturexx.view.me;

import com.glority.android.database.DBManager;
import com.glority.android.database.entities.CollectionItem;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MeCollectionSummaryFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/glority/android/database/entities/CollectionItem;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$initListener$6$1$item$1", f = "MeCollectionSummaryFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class MeCollectionSummaryFragment$initListener$6$1$item$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CollectionItem>, Object> {
    final /* synthetic */ int $collectionId;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeCollectionSummaryFragment$initListener$6$1$item$1(int i, Continuation<? super MeCollectionSummaryFragment$initListener$6$1$item$1> continuation) {
        super(2, continuation);
        this.$collectionId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MeCollectionSummaryFragment$initListener$6$1$item$1(this.$collectionId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CollectionItem> continuation) {
        return ((MeCollectionSummaryFragment$initListener$6$1$item$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return DBManager.INSTANCE.getCollectionItemDao().getItemSync(this.$collectionId);
    }
}
