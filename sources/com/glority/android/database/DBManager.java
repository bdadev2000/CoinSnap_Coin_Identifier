package com.glority.android.database;

import android.content.Context;
import androidx.room.Room;
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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DBManager.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u000f\u001a\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020*8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u000f\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020/8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u000f\u001a\u0004\b0\u00101R\u001b\u00103\u001a\u0002048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u000f\u001a\u0004\b5\u00106R\u001b\u00108\u001a\u0002098FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u000f\u001a\u0004\b:\u0010;R\u001b\u0010=\u001a\u00020>8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\u000f\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/glority/android/database/DBManager;", "", "<init>", "()V", "database", "Lcom/glority/android/database/AppDatabase;", "setUpDatabase", "", "context", "Landroid/content/Context;", "historyItemDao", "Lcom/glority/android/database/dao/HistoryItemDao;", "getHistoryItemDao", "()Lcom/glority/android/database/dao/HistoryItemDao;", "historyItemDao$delegate", "Lkotlin/Lazy;", "collectionItemDao", "Lcom/glority/android/database/dao/CollectionItemDao;", "getCollectionItemDao", "()Lcom/glority/android/database/dao/CollectionItemDao;", "collectionItemDao$delegate", "homeCoinItemDao", "Lcom/glority/android/database/dao/HomeCoinItemDao;", "getHomeCoinItemDao", "()Lcom/glority/android/database/dao/HomeCoinItemDao;", "homeCoinItemDao$delegate", "wishItemDao", "Lcom/glority/android/database/dao/WishItemDao;", "getWishItemDao", "()Lcom/glority/android/database/dao/WishItemDao;", "wishItemDao$delegate", "seriesItemDao", "Lcom/glority/android/database/dao/SeriesItemDao;", "getSeriesItemDao", "()Lcom/glority/android/database/dao/SeriesItemDao;", "seriesItemDao$delegate", "userSeriesDetailDao", "Lcom/glority/android/database/dao/UserSeriesDetailDao;", "getUserSeriesDetailDao", "()Lcom/glority/android/database/dao/UserSeriesDetailDao;", "userSeriesDetailDao$delegate", "userSeriesListItemDao", "Lcom/glority/android/database/dao/UserSeriesListItemDao;", "getUserSeriesListItemDao", "()Lcom/glority/android/database/dao/UserSeriesListItemDao;", "userSeriesListItemDao$delegate", "recommendSeriesDetailItemDao", "Lcom/glority/android/database/dao/RecommendSeriesDetailItemDao;", "getRecommendSeriesDetailItemDao", "()Lcom/glority/android/database/dao/RecommendSeriesDetailItemDao;", "recommendSeriesDetailItemDao$delegate", "userCustomSeriesItemDao", "Lcom/glority/android/database/dao/UserCustomSeriesItemDao;", "getUserCustomSeriesItemDao", "()Lcom/glority/android/database/dao/UserCustomSeriesItemDao;", "userCustomSeriesItemDao$delegate", "recognizeHistoryItemDao", "Lcom/glority/android/database/dao/RecognizeHistoryItemDao;", "getRecognizeHistoryItemDao", "()Lcom/glority/android/database/dao/RecognizeHistoryItemDao;", "recognizeHistoryItemDao$delegate", "articleNewDao", "Lcom/glority/android/database/dao/ArticleNewDao;", "getArticleNewDao", "()Lcom/glority/android/database/dao/ArticleNewDao;", "articleNewDao$delegate", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public final class DBManager {
    private static AppDatabase database;
    public static final DBManager INSTANCE = new DBManager();

    /* renamed from: historyItemDao$delegate, reason: from kotlin metadata */
    private static final Lazy historyItemDao = LazyKt.lazy(new Function0<HistoryItemDao>() { // from class: com.glority.android.database.DBManager$historyItemDao$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final HistoryItemDao invoke() {
            AppDatabase appDatabase;
            appDatabase = DBManager.database;
            if (appDatabase == null) {
                Intrinsics.throwUninitializedPropertyAccessException("database");
                appDatabase = null;
            }
            return appDatabase.getSimpleItemDao();
        }
    });

    /* renamed from: collectionItemDao$delegate, reason: from kotlin metadata */
    private static final Lazy collectionItemDao = LazyKt.lazy(new Function0<CollectionItemDao>() { // from class: com.glority.android.database.DBManager$collectionItemDao$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CollectionItemDao invoke() {
            AppDatabase appDatabase;
            appDatabase = DBManager.database;
            if (appDatabase == null) {
                Intrinsics.throwUninitializedPropertyAccessException("database");
                appDatabase = null;
            }
            return appDatabase.getCollectionItemDao();
        }
    });

    /* renamed from: homeCoinItemDao$delegate, reason: from kotlin metadata */
    private static final Lazy homeCoinItemDao = LazyKt.lazy(new Function0<HomeCoinItemDao>() { // from class: com.glority.android.database.DBManager$homeCoinItemDao$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final HomeCoinItemDao invoke() {
            AppDatabase appDatabase;
            appDatabase = DBManager.database;
            if (appDatabase == null) {
                Intrinsics.throwUninitializedPropertyAccessException("database");
                appDatabase = null;
            }
            return appDatabase.getHomeCoinItemDao();
        }
    });

    /* renamed from: wishItemDao$delegate, reason: from kotlin metadata */
    private static final Lazy wishItemDao = LazyKt.lazy(new Function0<WishItemDao>() { // from class: com.glority.android.database.DBManager$wishItemDao$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final WishItemDao invoke() {
            AppDatabase appDatabase;
            appDatabase = DBManager.database;
            if (appDatabase == null) {
                Intrinsics.throwUninitializedPropertyAccessException("database");
                appDatabase = null;
            }
            return appDatabase.getWishItemDao();
        }
    });

    /* renamed from: seriesItemDao$delegate, reason: from kotlin metadata */
    private static final Lazy seriesItemDao = LazyKt.lazy(new Function0<SeriesItemDao>() { // from class: com.glority.android.database.DBManager$seriesItemDao$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final SeriesItemDao invoke() {
            AppDatabase appDatabase;
            appDatabase = DBManager.database;
            if (appDatabase == null) {
                Intrinsics.throwUninitializedPropertyAccessException("database");
                appDatabase = null;
            }
            return appDatabase.getSeriesItemDao();
        }
    });

    /* renamed from: userSeriesDetailDao$delegate, reason: from kotlin metadata */
    private static final Lazy userSeriesDetailDao = LazyKt.lazy(new Function0<UserSeriesDetailDao>() { // from class: com.glority.android.database.DBManager$userSeriesDetailDao$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final UserSeriesDetailDao invoke() {
            AppDatabase appDatabase;
            appDatabase = DBManager.database;
            if (appDatabase == null) {
                Intrinsics.throwUninitializedPropertyAccessException("database");
                appDatabase = null;
            }
            return appDatabase.getUserSeriesDetailDao();
        }
    });

    /* renamed from: userSeriesListItemDao$delegate, reason: from kotlin metadata */
    private static final Lazy userSeriesListItemDao = LazyKt.lazy(new Function0<UserSeriesListItemDao>() { // from class: com.glority.android.database.DBManager$userSeriesListItemDao$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final UserSeriesListItemDao invoke() {
            AppDatabase appDatabase;
            appDatabase = DBManager.database;
            if (appDatabase == null) {
                Intrinsics.throwUninitializedPropertyAccessException("database");
                appDatabase = null;
            }
            return appDatabase.getUserSeriesListItemDao();
        }
    });

    /* renamed from: recommendSeriesDetailItemDao$delegate, reason: from kotlin metadata */
    private static final Lazy recommendSeriesDetailItemDao = LazyKt.lazy(new Function0<RecommendSeriesDetailItemDao>() { // from class: com.glority.android.database.DBManager$recommendSeriesDetailItemDao$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final RecommendSeriesDetailItemDao invoke() {
            AppDatabase appDatabase;
            appDatabase = DBManager.database;
            if (appDatabase == null) {
                Intrinsics.throwUninitializedPropertyAccessException("database");
                appDatabase = null;
            }
            return appDatabase.getRecommendSeriesItemDao();
        }
    });

    /* renamed from: userCustomSeriesItemDao$delegate, reason: from kotlin metadata */
    private static final Lazy userCustomSeriesItemDao = LazyKt.lazy(new Function0<UserCustomSeriesItemDao>() { // from class: com.glority.android.database.DBManager$userCustomSeriesItemDao$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final UserCustomSeriesItemDao invoke() {
            AppDatabase appDatabase;
            appDatabase = DBManager.database;
            if (appDatabase == null) {
                Intrinsics.throwUninitializedPropertyAccessException("database");
                appDatabase = null;
            }
            return appDatabase.getUserCustomSeriesItemDao();
        }
    });

    /* renamed from: recognizeHistoryItemDao$delegate, reason: from kotlin metadata */
    private static final Lazy recognizeHistoryItemDao = LazyKt.lazy(new Function0<RecognizeHistoryItemDao>() { // from class: com.glority.android.database.DBManager$recognizeHistoryItemDao$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final RecognizeHistoryItemDao invoke() {
            AppDatabase appDatabase;
            appDatabase = DBManager.database;
            if (appDatabase == null) {
                Intrinsics.throwUninitializedPropertyAccessException("database");
                appDatabase = null;
            }
            return appDatabase.getRecognizeHistoryItemDao();
        }
    });

    /* renamed from: articleNewDao$delegate, reason: from kotlin metadata */
    private static final Lazy articleNewDao = LazyKt.lazy(new Function0<ArticleNewDao>() { // from class: com.glority.android.database.DBManager$articleNewDao$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ArticleNewDao invoke() {
            AppDatabase appDatabase;
            appDatabase = DBManager.database;
            if (appDatabase == null) {
                Intrinsics.throwUninitializedPropertyAccessException("database");
                appDatabase = null;
            }
            return appDatabase.getArticleNewDao();
        }
    });

    private DBManager() {
    }

    public final void setUpDatabase(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        database = (AppDatabase) Room.databaseBuilder(applicationContext, AppDatabase.class, "coin.db").fallbackToDestructiveMigration().addMigrations(Migrations.INSTANCE.getMigration_1_to_2()).addMigrations(Migrations.INSTANCE.getMigration_3_to_4()).addMigrations(Migrations.INSTANCE.getMigration_4_to_5()).addMigrations(Migrations.INSTANCE.getMigration_6_to_7()).addMigrations(Migrations.INSTANCE.getMigration_8_to_9()).addMigrations(Migrations.INSTANCE.getMigration_9_to_10()).addMigrations(Migrations.INSTANCE.getMigration_10_to_11()).addMigrations(Migrations.INSTANCE.getMigration_11_to_12()).addMigrations(Migrations.INSTANCE.getMigration_12_to_13()).addMigrations(Migrations.INSTANCE.getMigration_13_to_14()).addMigrations(Migrations.INSTANCE.getMigration_14_to_15()).addMigrations(Migrations.INSTANCE.getMigration_15_to_16()).build();
    }

    public final HistoryItemDao getHistoryItemDao() {
        return (HistoryItemDao) historyItemDao.getValue();
    }

    public final CollectionItemDao getCollectionItemDao() {
        return (CollectionItemDao) collectionItemDao.getValue();
    }

    public final HomeCoinItemDao getHomeCoinItemDao() {
        return (HomeCoinItemDao) homeCoinItemDao.getValue();
    }

    public final WishItemDao getWishItemDao() {
        return (WishItemDao) wishItemDao.getValue();
    }

    public final SeriesItemDao getSeriesItemDao() {
        return (SeriesItemDao) seriesItemDao.getValue();
    }

    public final UserSeriesDetailDao getUserSeriesDetailDao() {
        return (UserSeriesDetailDao) userSeriesDetailDao.getValue();
    }

    public final UserSeriesListItemDao getUserSeriesListItemDao() {
        return (UserSeriesListItemDao) userSeriesListItemDao.getValue();
    }

    public final RecommendSeriesDetailItemDao getRecommendSeriesDetailItemDao() {
        return (RecommendSeriesDetailItemDao) recommendSeriesDetailItemDao.getValue();
    }

    public final UserCustomSeriesItemDao getUserCustomSeriesItemDao() {
        return (UserCustomSeriesItemDao) userCustomSeriesItemDao.getValue();
    }

    public final RecognizeHistoryItemDao getRecognizeHistoryItemDao() {
        return (RecognizeHistoryItemDao) recognizeHistoryItemDao.getValue();
    }

    public final ArticleNewDao getArticleNewDao() {
        return (ArticleNewDao) articleNewDao.getValue();
    }
}
