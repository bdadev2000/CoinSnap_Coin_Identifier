package com.glority.android.picturexx.view.me;

import androidx.core.os.BundleKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.vm.CollectionViewModel;
import com.glority.base.utils.NavigationAnimaUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
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
/* compiled from: MeCollectionSummaryFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.me.MeCollectionSummaryFragment$initListener$6$1", f = "MeCollectionSummaryFragment.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class MeCollectionSummaryFragment$initListener$6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $collectionId;
    int label;
    final /* synthetic */ MeCollectionSummaryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeCollectionSummaryFragment$initListener$6$1(MeCollectionSummaryFragment meCollectionSummaryFragment, int i, Continuation<? super MeCollectionSummaryFragment$initListener$6$1> continuation) {
        super(2, continuation);
        this.this$0 = meCollectionSummaryFragment;
        this.$collectionId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MeCollectionSummaryFragment$initListener$6$1(this.this$0, this.$collectionId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MeCollectionSummaryFragment$initListener$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CollectionViewModel collectionVm;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new MeCollectionSummaryFragment$initListener$6$1$item$1(this.$collectionId, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CollectionItem collectionItem = (CollectionItem) obj;
        if (collectionItem != null) {
            collectionVm = this.this$0.getCollectionVm();
            collectionVm.setCurrentItem(collectionItem);
            ViewExtensionsKt.navigate$default(this.this$0, R.id.action_mainFragment_to_collectDetailFragment, BundleKt.bundleOf(TuplesKt.to("from", this.this$0.getPageName())), NavigationAnimaUtils.INSTANCE.getSlideAnima(this.this$0.getActivity()), null, 8, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
