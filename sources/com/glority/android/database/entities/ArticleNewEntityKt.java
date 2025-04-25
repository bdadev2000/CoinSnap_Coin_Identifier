package com.glority.android.database.entities;

import com.picturecoin.generatedAPI.kotlinAPI.article.ArticleNew;
import com.picturecoin.generatedAPI.kotlinAPI.model.CoinTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArticleNewEntity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"asArticleNewEntity", "Lcom/glority/android/database/entities/ArticleNewEntity;", "Lcom/picturecoin/generatedAPI/kotlinAPI/article/ArticleNew;", "asArticleNew", "database_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public final class ArticleNewEntityKt {
    public static final ArticleNewEntity asArticleNewEntity(ArticleNew articleNew) {
        Intrinsics.checkNotNullParameter(articleNew, "<this>");
        ArticleNewEntity articleNewEntity = new ArticleNewEntity(articleNew.getUid());
        articleNewEntity.setTitle(articleNew.getTitle());
        articleNewEntity.setMainImageUrl(articleNew.getMainImageUrl());
        articleNewEntity.setUrl(articleNew.getUrl());
        articleNewEntity.setDarkUrl(articleNew.getDarkUrl());
        if (articleNew.getTags() != null) {
            ArrayList arrayList = new ArrayList();
            List<CoinTag> tags = articleNew.getTags();
            Intrinsics.checkNotNull(tags);
            List<CoinTag> list = tags;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Object clone = ((CoinTag) it.next()).clone();
                Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.model.CoinTag");
                arrayList2.add((CoinTag) clone);
            }
            arrayList.addAll(arrayList2);
            articleNewEntity.setTags(arrayList);
        } else {
            articleNewEntity.setTags(null);
        }
        return articleNewEntity;
    }

    public static final ArticleNew asArticleNew(ArticleNewEntity articleNewEntity) {
        Intrinsics.checkNotNullParameter(articleNewEntity, "<this>");
        ArticleNew articleNew = new ArticleNew(0, 1, null);
        articleNew.setUid(articleNewEntity.getUid());
        articleNew.setTitle(articleNewEntity.getTitle());
        articleNew.setMainImageUrl(articleNewEntity.getMainImageUrl());
        articleNew.setDarkUrl(articleNewEntity.getDarkUrl());
        if (articleNewEntity.getTags() != null) {
            ArrayList arrayList = new ArrayList();
            List<CoinTag> tags = articleNewEntity.getTags();
            Intrinsics.checkNotNull(tags);
            List<CoinTag> list = tags;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Object clone = ((CoinTag) it.next()).clone();
                Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.model.CoinTag");
                arrayList2.add((CoinTag) clone);
            }
            arrayList.addAll(arrayList2);
            articleNew.setTags(arrayList);
        } else {
            articleNew.setTags(null);
        }
        return articleNew;
    }
}
