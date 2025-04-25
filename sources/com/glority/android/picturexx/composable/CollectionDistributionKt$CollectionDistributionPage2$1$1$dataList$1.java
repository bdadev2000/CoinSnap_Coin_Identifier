package com.glority.android.picturexx.composable;

import com.glority.android.database.DBManager;
import com.glority.android.database.entities.CollectionItem;
import com.glority.utils.stability.LogUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CollectionDistribution.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/glority/android/database/entities/CollectionItem;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.composable.CollectionDistributionKt$CollectionDistributionPage2$1$1$dataList$1", f = "CollectionDistribution.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class CollectionDistributionKt$CollectionDistributionPage2$1$1$dataList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends CollectionItem>>, Object> {
    final /* synthetic */ String $countryCode;
    final /* synthetic */ long $userId;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionDistributionKt$CollectionDistributionPage2$1$1$dataList$1(long j, String str, Continuation<? super CollectionDistributionKt$CollectionDistributionPage2$1$1$dataList$1> continuation) {
        super(2, continuation);
        this.$userId = j;
        this.$countryCode = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CollectionDistributionKt$CollectionDistributionPage2$1$1$dataList$1(this.$userId, this.$countryCode, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends CollectionItem>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<CollectionItem>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<CollectionItem>> continuation) {
        return ((CollectionDistributionKt$CollectionDistributionPage2$1$1$dataList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<CollectionItem> queryByCountryCode = DBManager.INSTANCE.getCollectionItemDao().queryByCountryCode(this.$userId, this.$countryCode);
        LogUtils.e("countryCode: " + this.$countryCode, "data: " + queryByCountryCode);
        return queryByCountryCode;
    }
}
