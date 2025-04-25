package com.glority.android.picturexx.repository;

import com.glority.component.generatedAPI.kotlinAPI.item.ChangeItemCmsNameMessage;
import com.glority.network.model.Resource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CmsRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/glority/network/model/Resource;", "Lcom/glority/component/generatedAPI/kotlinAPI/item/ChangeItemCmsNameMessage;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.repository.CmsRepository$changeItemCmsNameMessage$2$jobs$1$1", f = "CmsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class CmsRepository$changeItemCmsNameMessage$2$jobs$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Resource<? extends ChangeItemCmsNameMessage>>, Object> {
    final /* synthetic */ String $cmsNameName;
    final /* synthetic */ String $cmsNameUid;
    final /* synthetic */ long $it;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CmsRepository$changeItemCmsNameMessage$2$jobs$1$1(long j, String str, String str2, Continuation<? super CmsRepository$changeItemCmsNameMessage$2$jobs$1$1> continuation) {
        super(2, continuation);
        this.$it = j;
        this.$cmsNameUid = str;
        this.$cmsNameName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CmsRepository$changeItemCmsNameMessage$2$jobs$1$1(this.$it, this.$cmsNameUid, this.$cmsNameName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Resource<? extends ChangeItemCmsNameMessage>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Resource<ChangeItemCmsNameMessage>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Resource<ChangeItemCmsNameMessage>> continuation) {
        return ((CmsRepository$changeItemCmsNameMessage$2$jobs$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Resource changeItemCmsNameMessage;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        changeItemCmsNameMessage = CmsRepository.INSTANCE.changeItemCmsNameMessage(this.$it, this.$cmsNameUid, this.$cmsNameName);
        return changeItemCmsNameMessage;
    }
}
