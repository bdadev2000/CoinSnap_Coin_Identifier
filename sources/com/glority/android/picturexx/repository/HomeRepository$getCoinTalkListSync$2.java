package com.glority.android.picturexx.repository;

import com.glority.android.database.DBManager;
import com.glority.android.database.dao.ArticleNewDao;
import com.glority.android.database.entities.ArticleNewEntityKt;
import com.picturecoin.generatedAPI.kotlinAPI.article.ArticleNew;
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
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.repository.HomeRepository$getCoinTalkListSync$2", f = "HomeRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class HomeRepository$getCoinTalkListSync$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<ArticleNew> $networkArticles;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepository$getCoinTalkListSync$2(List<ArticleNew> list, Continuation<? super HomeRepository$getCoinTalkListSync$2> continuation) {
        super(2, continuation);
        this.$networkArticles = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeRepository$getCoinTalkListSync$2(this.$networkArticles, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeRepository$getCoinTalkListSync$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DBManager.INSTANCE.getArticleNewDao().deleteAll();
        ArticleNewDao articleNewDao = DBManager.INSTANCE.getArticleNewDao();
        List<ArticleNew> list = this.$networkArticles;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ArticleNewEntityKt.asArticleNewEntity((ArticleNew) it.next()));
        }
        articleNewDao.insert(arrayList);
        return Unit.INSTANCE;
    }
}
