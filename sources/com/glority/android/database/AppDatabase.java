package com.glority.android.database;

import androidx.room.RoomDatabase;
import com.glority.android.database.dao.ArticleNewDao;
import com.glority.android.database.dao.CollectionItemDao;
import com.glority.android.database.dao.HistoryItemDao;
import com.glority.android.database.dao.HomeCoinItemDao;
import com.glority.android.database.dao.RecognizeHistoryItemDao;
import com.glority.android.database.dao.RecommendSeriesDetailItemDao;
import com.glority.android.database.dao.SeriesItemDao;
import com.glority.android.database.dao.UserCustomSeriesItemDao;
import com.glority.android.database.dao.UserSeriesDetailDao;
import com.glority.android.database.dao.UserSeriesListItemDao;
import com.glority.android.database.dao.WishItemDao;
import kotlin.Metadata;

/* compiled from: AppDatabase.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0019H&¨\u0006\u001a"}, d2 = {"Lcom/glority/android/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "getSimpleItemDao", "Lcom/glority/android/database/dao/HistoryItemDao;", "getCollectionItemDao", "Lcom/glority/android/database/dao/CollectionItemDao;", "getHomeCoinItemDao", "Lcom/glority/android/database/dao/HomeCoinItemDao;", "getWishItemDao", "Lcom/glority/android/database/dao/WishItemDao;", "getSeriesItemDao", "Lcom/glority/android/database/dao/SeriesItemDao;", "getUserSeriesDetailDao", "Lcom/glority/android/database/dao/UserSeriesDetailDao;", "getUserSeriesListItemDao", "Lcom/glority/android/database/dao/UserSeriesListItemDao;", "getRecommendSeriesItemDao", "Lcom/glority/android/database/dao/RecommendSeriesDetailItemDao;", "getUserCustomSeriesItemDao", "Lcom/glority/android/database/dao/UserCustomSeriesItemDao;", "getRecognizeHistoryItemDao", "Lcom/glority/android/database/dao/RecognizeHistoryItemDao;", "getArticleNewDao", "Lcom/glority/android/database/dao/ArticleNewDao;", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public abstract class AppDatabase extends RoomDatabase {
    public abstract ArticleNewDao getArticleNewDao();

    public abstract CollectionItemDao getCollectionItemDao();

    public abstract HomeCoinItemDao getHomeCoinItemDao();

    public abstract RecognizeHistoryItemDao getRecognizeHistoryItemDao();

    public abstract RecommendSeriesDetailItemDao getRecommendSeriesItemDao();

    public abstract SeriesItemDao getSeriesItemDao();

    public abstract HistoryItemDao getSimpleItemDao();

    public abstract UserCustomSeriesItemDao getUserCustomSeriesItemDao();

    public abstract UserSeriesDetailDao getUserSeriesDetailDao();

    public abstract UserSeriesListItemDao getUserSeriesListItemDao();

    public abstract WishItemDao getWishItemDao();
}
