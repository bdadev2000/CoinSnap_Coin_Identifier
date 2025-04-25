package com.glority.android.picturexx.extensions;

import com.glority.android.database.DBManager;
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
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SeriesItemListExt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/glority/android/database/entities/CollectionItem;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.extensions.SeriesItemListExtKt$sortByUpdatedDateDescending$allCollections$1", f = "SeriesItemListExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class SeriesItemListExtKt$sortByUpdatedDateDescending$allCollections$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends CollectionItem>>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SeriesItemListExtKt$sortByUpdatedDateDescending$allCollections$1(Continuation<? super SeriesItemListExtKt$sortByUpdatedDateDescending$allCollections$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SeriesItemListExtKt$sortByUpdatedDateDescending$allCollections$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends CollectionItem>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<CollectionItem>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<CollectionItem>> continuation) {
        return ((SeriesItemListExtKt$sortByUpdatedDateDescending$allCollections$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return DBManager.INSTANCE.getCollectionItemDao().getAllSync(AppViewModel.INSTANCE.getUserId());
    }
}
