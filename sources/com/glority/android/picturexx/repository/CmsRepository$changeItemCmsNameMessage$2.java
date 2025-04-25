package com.glority.android.picturexx.repository;

import androidx.lifecycle.MutableLiveData;
import com.glority.network.model.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: CmsRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.repository.CmsRepository$changeItemCmsNameMessage$2", f = "CmsRepository.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CmsRepository$changeItemCmsNameMessage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cmsNameName;
    final /* synthetic */ String $cmsNameUid;
    final /* synthetic */ List<Long> $itemIds;
    final /* synthetic */ MutableLiveData<Status> $liveData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CmsRepository$changeItemCmsNameMessage$2(List<Long> list, MutableLiveData<Status> mutableLiveData, String str, String str2, Continuation<? super CmsRepository$changeItemCmsNameMessage$2> continuation) {
        super(2, continuation);
        this.$itemIds = list;
        this.$liveData = mutableLiveData;
        this.$cmsNameUid = str;
        this.$cmsNameName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CmsRepository$changeItemCmsNameMessage$2 cmsRepository$changeItemCmsNameMessage$2 = new CmsRepository$changeItemCmsNameMessage$2(this.$itemIds, this.$liveData, this.$cmsNameUid, this.$cmsNameName, continuation);
        cmsRepository$changeItemCmsNameMessage$2.L$0 = obj;
        return cmsRepository$changeItemCmsNameMessage$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CmsRepository$changeItemCmsNameMessage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List<Long> list = this.$itemIds;
            String str = this.$cmsNameUid;
            String str2 = this.$cmsNameName;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CmsRepository$changeItemCmsNameMessage$2$jobs$1$1(((Number) it.next()).longValue(), str, str2, null), 3, null);
                arrayList.add(async$default);
            }
            this.label = 1;
            if (AwaitKt.awaitAll(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$liveData.postValue(Status.SUCCESS);
        return Unit.INSTANCE;
    }
}
