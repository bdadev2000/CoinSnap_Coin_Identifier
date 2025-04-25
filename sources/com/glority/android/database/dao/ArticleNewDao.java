package com.glority.android.database.dao;

import com.glority.android.database.entities.ArticleNewEntity;
import com.glority.android.xx.constants.Args;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ArticleNewDao.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\bH'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H'J\b\u0010\n\u001a\u00020\u0003H'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH'J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH'¨\u0006\u0011"}, d2 = {"Lcom/glority/android/database/dao/ArticleNewDao;", "", "insert", "", "articleNewEntity", "", "Lcom/glority/android/database/entities/ArticleNewEntity;", "([Lcom/glority/android/database/entities/ArticleNewEntity;)V", "", "delete", "deleteAll", "deleteByUid", Args.uid, "", "getAll", "", "getArticleNewEntityById", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public interface ArticleNewDao {
    void delete(ArticleNewEntity articleNewEntity);

    void deleteAll();

    void deleteByUid(String uid);

    List<ArticleNewEntity> getAll();

    ArticleNewEntity getArticleNewEntityById(String uid);

    void insert(Collection<ArticleNewEntity> articleNewEntity);

    void insert(ArticleNewEntity... articleNewEntity);
}
