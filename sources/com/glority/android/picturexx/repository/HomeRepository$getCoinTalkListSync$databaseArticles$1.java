package com.glority.android.picturexx.repository;

import com.glority.android.database.DBManager;
import com.glority.android.database.entities.ArticleNewEntity;
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
/* compiled from: HomeRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/glority/android/database/entities/ArticleNewEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.repository.HomeRepository$getCoinTalkListSync$databaseArticles$1", f = "HomeRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class HomeRepository$getCoinTalkListSync$databaseArticles$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ArticleNewEntity>>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HomeRepository$getCoinTalkListSync$databaseArticles$1(Continuation<? super HomeRepository$getCoinTalkListSync$databaseArticles$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeRepository$getCoinTalkListSync$databaseArticles$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ArticleNewEntity>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<ArticleNewEntity>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ArticleNewEntity>> continuation) {
        return ((HomeRepository$getCoinTalkListSync$databaseArticles$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return DBManager.INSTANCE.getArticleNewDao().getAll();
    }
}
