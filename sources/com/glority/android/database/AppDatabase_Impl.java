package com.glority.android.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.database.dao.ArticleNewDao;
import com.glority.android.database.dao.ArticleNewDao_Impl;
import com.glority.android.database.dao.CollectionItemDao;
import com.glority.android.database.dao.CollectionItemDao_Impl;
import com.glority.android.database.dao.HistoryItemDao;
import com.glority.android.database.dao.HistoryItemDao_Impl;
import com.glority.android.database.dao.HomeCoinItemDao;
import com.glority.android.database.dao.HomeCoinItemDao_Impl;
import com.glority.android.database.dao.RecognizeHistoryItemDao;
import com.glority.android.database.dao.RecognizeHistoryItemDao_Impl;
import com.glority.android.database.dao.RecommendSeriesDetailItemDao;
import com.glority.android.database.dao.RecommendSeriesDetailItemDao_Impl;
import com.glority.android.database.dao.SeriesItemDao;
import com.glority.android.database.dao.SeriesItemDao_Impl;
import com.glority.android.database.dao.UserCustomSeriesItemDao;
import com.glority.android.database.dao.UserCustomSeriesItemDao_Impl;
import com.glority.android.database.dao.UserSeriesDetailDao;
import com.glority.android.database.dao.UserSeriesDetailDao_Impl;
import com.glority.android.database.dao.UserSeriesListItemDao;
import com.glority.android.database.dao.UserSeriesListItemDao_Impl;
import com.glority.android.database.dao.WishItemDao;
import com.glority.android.database.dao.WishItemDao_Impl;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public final class AppDatabase_Impl extends AppDatabase {
    private volatile ArticleNewDao _articleNewDao;
    private volatile CollectionItemDao _collectionItemDao;
    private volatile HistoryItemDao _historyItemDao;
    private volatile HomeCoinItemDao _homeCoinItemDao;
    private volatile RecognizeHistoryItemDao _recognizeHistoryItemDao;
    private volatile RecommendSeriesDetailItemDao _recommendSeriesDetailItemDao;
    private volatile SeriesItemDao _seriesItemDao;
    private volatile UserCustomSeriesItemDao _userCustomSeriesItemDao;
    private volatile UserSeriesDetailDao _userSeriesDetailDao;
    private volatile UserSeriesListItemDao _userSeriesListItemDao;
    private volatile WishItemDao _wishItemDao;

    @Override // androidx.room.RoomDatabase
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(16) { // from class: com.glority.android.database.AppDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase _db) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase _db) {
                _db.execSQL("CREATE TABLE IF NOT EXISTS `HistoryItem` (`itemId` INTEGER NOT NULL, `uid` TEXT NOT NULL, `name` TEXT NOT NULL, `userId` INTEGER NOT NULL, `imageUrl` TEXT NOT NULL, `date` INTEGER NOT NULL, PRIMARY KEY(`itemId`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `CollectionItem` (`collectionId` INTEGER NOT NULL, `uid` TEXT NOT NULL, `itemId` INTEGER, `name` TEXT NOT NULL, `userId` INTEGER NOT NULL, `imageUrl` TEXT NOT NULL, `date` INTEGER, `number` TEXT, `acquisitionPrice` REAL, `note` TEXT, `grade` TEXT, `priceUnit` TEXT, `year` TEXT, `mintMark` TEXT, `denominationSideUrl` TEXT, `subjectSideUrl` TEXT, `seriesIndexListUid` TEXT, `speciesUid` TEXT, `varietyUid` TEXT, `issuerCountryCode` TEXT, `issuer` TEXT, `customSeriesId` INTEGER, `marketValue` TEXT, `mintage` TEXT, `denomination` TEXT, `compositionTypes` TEXT, `compositionOptions` TEXT, `mintMarkV2` TEXT, `subThemes` TEXT, `seriesList` TEXT, PRIMARY KEY(`collectionId`))");
                _db.execSQL("CREATE INDEX IF NOT EXISTS `index_CollectionItem_userId` ON `CollectionItem` (`userId`)");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `HomeCoinItem` (`uid` TEXT NOT NULL, `commonName` TEXT NOT NULL, `mainImageUrl` TEXT NOT NULL, `indexListUid` TEXT, PRIMARY KEY(`uid`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `WishItem` (`wishId` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `uid` TEXT NOT NULL, `price` TEXT, `name` TEXT, `originalImageUrl` TEXT NOT NULL, `createdAt` INTEGER, PRIMARY KEY(`wishId`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `SeriesItem` (`indexListUid` TEXT NOT NULL, `title` TEXT NOT NULL, `imageUrl` TEXT, `totalNum` INTEGER NOT NULL, `country` TEXT, `created` INTEGER NOT NULL, `seriesId` INTEGER, `currentCount` INTEGER, PRIMARY KEY(`indexListUid`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `UserSeriesDetailItem` (`seriesId` INTEGER NOT NULL, `title` TEXT NOT NULL, `composition` TEXT NOT NULL, `seriesDescription` TEXT NOT NULL, `pageHeaderUrl` TEXT NOT NULL, `seriesDetailList` TEXT NOT NULL, `childType` TEXT, PRIMARY KEY(`seriesId`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `UserSeriesListItem` (`seriesId` INTEGER NOT NULL, `indexListUid` TEXT NOT NULL, `title` TEXT NOT NULL, `imageUrl` TEXT, `currentCount` INTEGER NOT NULL, `totalNum` INTEGER NOT NULL, `country` TEXT, `topSubjectSideUrls` TEXT, PRIMARY KEY(`seriesId`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `RecommendSeriesItem` (`indexListUid` TEXT NOT NULL, `title` TEXT NOT NULL, `composition` TEXT NOT NULL, `seriesDescription` TEXT NOT NULL, `pageHearUrl` TEXT NOT NULL, `details` TEXT NOT NULL, `childType` TEXT, PRIMARY KEY(`indexListUid`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `UserCustomSeriesItem` (`customSeriesId` INTEGER NOT NULL, `title` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, `collectionCount` INTEGER NOT NULL, `latestCollectionUrlList` TEXT NOT NULL, `totalPrice` TEXT, PRIMARY KEY(`customSeriesId`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `RecognizeHistoryItem` (`itemId` INTEGER NOT NULL, `uid` TEXT NOT NULL, `date` INTEGER NOT NULL, `year` TEXT, PRIMARY KEY(`itemId`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `ArticleNewEntity` (`uid` TEXT NOT NULL, `title` TEXT NOT NULL, `mainImageUrl` TEXT NOT NULL, `url` TEXT NOT NULL, `darkUrl` TEXT NOT NULL, `tags` TEXT, PRIMARY KEY(`uid`))");
                _db.execSQL(RoomMasterTable.CREATE_QUERY);
                _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '32271a7780f0731b5fbb925fdd8b8699')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase _db) {
                _db.execSQL("DROP TABLE IF EXISTS `HistoryItem`");
                _db.execSQL("DROP TABLE IF EXISTS `CollectionItem`");
                _db.execSQL("DROP TABLE IF EXISTS `HomeCoinItem`");
                _db.execSQL("DROP TABLE IF EXISTS `WishItem`");
                _db.execSQL("DROP TABLE IF EXISTS `SeriesItem`");
                _db.execSQL("DROP TABLE IF EXISTS `UserSeriesDetailItem`");
                _db.execSQL("DROP TABLE IF EXISTS `UserSeriesListItem`");
                _db.execSQL("DROP TABLE IF EXISTS `RecommendSeriesItem`");
                _db.execSQL("DROP TABLE IF EXISTS `UserCustomSeriesItem`");
                _db.execSQL("DROP TABLE IF EXISTS `RecognizeHistoryItem`");
                _db.execSQL("DROP TABLE IF EXISTS `ArticleNewEntity`");
                if (AppDatabase_Impl.this.mCallbacks != null) {
                    int size = AppDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) AppDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase _db) {
                if (AppDatabase_Impl.this.mCallbacks != null) {
                    int size = AppDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) AppDatabase_Impl.this.mCallbacks.get(i)).onCreate(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase _db) {
                AppDatabase_Impl.this.mDatabase = _db;
                AppDatabase_Impl.this.internalInitInvalidationTracker(_db);
                if (AppDatabase_Impl.this.mCallbacks != null) {
                    int size = AppDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) AppDatabase_Impl.this.mCallbacks.get(i)).onOpen(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(SupportSQLiteDatabase _db) {
                DBUtil.dropFtsSyncTriggers(_db);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
                HashMap hashMap = new HashMap(6);
                hashMap.put("itemId", new TableInfo.Column("itemId", "INTEGER", true, 1, null, 1));
                hashMap.put(Args.uid, new TableInfo.Column(Args.uid, "TEXT", true, 0, null, 1));
                hashMap.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
                hashMap.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, 1));
                hashMap.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", true, 0, null, 1));
                hashMap.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("HistoryItem", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(_db, "HistoryItem");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenHelper.ValidationResult(false, "HistoryItem(com.glority.android.database.entities.HistoryItem).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                HashMap hashMap2 = new HashMap(30);
                hashMap2.put("collectionId", new TableInfo.Column("collectionId", "INTEGER", true, 1, null, 1));
                hashMap2.put(Args.uid, new TableInfo.Column(Args.uid, "TEXT", true, 0, null, 1));
                hashMap2.put("itemId", new TableInfo.Column("itemId", "INTEGER", false, 0, null, 1));
                hashMap2.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
                hashMap2.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, 1));
                hashMap2.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", true, 0, null, 1));
                hashMap2.put("date", new TableInfo.Column("date", "INTEGER", false, 0, null, 1));
                hashMap2.put(LogEventArguments.ARG_NUMBER, new TableInfo.Column(LogEventArguments.ARG_NUMBER, "TEXT", false, 0, null, 1));
                hashMap2.put("acquisitionPrice", new TableInfo.Column("acquisitionPrice", "REAL", false, 0, null, 1));
                hashMap2.put("note", new TableInfo.Column("note", "TEXT", false, 0, null, 1));
                hashMap2.put("grade", new TableInfo.Column("grade", "TEXT", false, 0, null, 1));
                hashMap2.put("priceUnit", new TableInfo.Column("priceUnit", "TEXT", false, 0, null, 1));
                hashMap2.put(Args.year, new TableInfo.Column(Args.year, "TEXT", false, 0, null, 1));
                hashMap2.put("mintMark", new TableInfo.Column("mintMark", "TEXT", false, 0, null, 1));
                hashMap2.put(Args.denominationSideUrl, new TableInfo.Column(Args.denominationSideUrl, "TEXT", false, 0, null, 1));
                hashMap2.put(Args.subjectSideUrl, new TableInfo.Column(Args.subjectSideUrl, "TEXT", false, 0, null, 1));
                hashMap2.put("seriesIndexListUid", new TableInfo.Column("seriesIndexListUid", "TEXT", false, 0, null, 1));
                hashMap2.put(Args.speciesUid, new TableInfo.Column(Args.speciesUid, "TEXT", false, 0, null, 1));
                hashMap2.put(Args.varietyUid, new TableInfo.Column(Args.varietyUid, "TEXT", false, 0, null, 1));
                hashMap2.put("issuerCountryCode", new TableInfo.Column("issuerCountryCode", "TEXT", false, 0, null, 1));
                hashMap2.put("issuer", new TableInfo.Column("issuer", "TEXT", false, 0, null, 1));
                hashMap2.put(Args.customSeriesId, new TableInfo.Column(Args.customSeriesId, "INTEGER", false, 0, null, 1));
                hashMap2.put("marketValue", new TableInfo.Column("marketValue", "TEXT", false, 0, null, 1));
                hashMap2.put("mintage", new TableInfo.Column("mintage", "TEXT", false, 0, null, 1));
                hashMap2.put("denomination", new TableInfo.Column("denomination", "TEXT", false, 0, null, 1));
                hashMap2.put("compositionTypes", new TableInfo.Column("compositionTypes", "TEXT", false, 0, null, 1));
                hashMap2.put("compositionOptions", new TableInfo.Column("compositionOptions", "TEXT", false, 0, null, 1));
                hashMap2.put("mintMarkV2", new TableInfo.Column("mintMarkV2", "TEXT", false, 0, null, 1));
                hashMap2.put("subThemes", new TableInfo.Column("subThemes", "TEXT", false, 0, null, 1));
                hashMap2.put("seriesList", new TableInfo.Column("seriesList", "TEXT", false, 0, null, 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new TableInfo.Index("index_CollectionItem_userId", false, Arrays.asList("userId"), Arrays.asList("ASC")));
                TableInfo tableInfo2 = new TableInfo("CollectionItem", hashMap2, hashSet, hashSet2);
                TableInfo read2 = TableInfo.read(_db, "CollectionItem");
                if (!tableInfo2.equals(read2)) {
                    return new RoomOpenHelper.ValidationResult(false, "CollectionItem(com.glority.android.database.entities.CollectionItem).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
                }
                HashMap hashMap3 = new HashMap(4);
                hashMap3.put(Args.uid, new TableInfo.Column(Args.uid, "TEXT", true, 1, null, 1));
                hashMap3.put("commonName", new TableInfo.Column("commonName", "TEXT", true, 0, null, 1));
                hashMap3.put("mainImageUrl", new TableInfo.Column("mainImageUrl", "TEXT", true, 0, null, 1));
                hashMap3.put(Args.indexListUid, new TableInfo.Column(Args.indexListUid, "TEXT", false, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("HomeCoinItem", hashMap3, new HashSet(0), new HashSet(0));
                TableInfo read3 = TableInfo.read(_db, "HomeCoinItem");
                if (!tableInfo3.equals(read3)) {
                    return new RoomOpenHelper.ValidationResult(false, "HomeCoinItem(com.glority.android.database.entities.HomeCoinItem).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
                }
                HashMap hashMap4 = new HashMap(7);
                hashMap4.put(Args.wishId, new TableInfo.Column(Args.wishId, "INTEGER", true, 1, null, 1));
                hashMap4.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, 1));
                hashMap4.put(Args.uid, new TableInfo.Column(Args.uid, "TEXT", true, 0, null, 1));
                hashMap4.put("price", new TableInfo.Column("price", "TEXT", false, 0, null, 1));
                hashMap4.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, 1));
                hashMap4.put("originalImageUrl", new TableInfo.Column("originalImageUrl", "TEXT", true, 0, null, 1));
                hashMap4.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", false, 0, null, 1));
                TableInfo tableInfo4 = new TableInfo("WishItem", hashMap4, new HashSet(0), new HashSet(0));
                TableInfo read4 = TableInfo.read(_db, "WishItem");
                if (!tableInfo4.equals(read4)) {
                    return new RoomOpenHelper.ValidationResult(false, "WishItem(com.glority.android.database.entities.WishItem).\n Expected:\n" + tableInfo4 + "\n Found:\n" + read4);
                }
                HashMap hashMap5 = new HashMap(8);
                hashMap5.put(Args.indexListUid, new TableInfo.Column(Args.indexListUid, "TEXT", true, 1, null, 1));
                hashMap5.put(Args.title, new TableInfo.Column(Args.title, "TEXT", true, 0, null, 1));
                hashMap5.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", false, 0, null, 1));
                hashMap5.put("totalNum", new TableInfo.Column("totalNum", "INTEGER", true, 0, null, 1));
                hashMap5.put("country", new TableInfo.Column("country", "TEXT", false, 0, null, 1));
                hashMap5.put(LogEvents.customseries_sortbycreate, new TableInfo.Column(LogEvents.customseries_sortbycreate, "INTEGER", true, 0, null, 1));
                hashMap5.put(Args.seriesId, new TableInfo.Column(Args.seriesId, "INTEGER", false, 0, null, 1));
                hashMap5.put("currentCount", new TableInfo.Column("currentCount", "INTEGER", false, 0, null, 1));
                TableInfo tableInfo5 = new TableInfo("SeriesItem", hashMap5, new HashSet(0), new HashSet(0));
                TableInfo read5 = TableInfo.read(_db, "SeriesItem");
                if (!tableInfo5.equals(read5)) {
                    return new RoomOpenHelper.ValidationResult(false, "SeriesItem(com.glority.android.database.entities.SeriesItem).\n Expected:\n" + tableInfo5 + "\n Found:\n" + read5);
                }
                HashMap hashMap6 = new HashMap(7);
                hashMap6.put(Args.seriesId, new TableInfo.Column(Args.seriesId, "INTEGER", true, 1, null, 1));
                hashMap6.put(Args.title, new TableInfo.Column(Args.title, "TEXT", true, 0, null, 1));
                hashMap6.put("composition", new TableInfo.Column("composition", "TEXT", true, 0, null, 1));
                hashMap6.put("seriesDescription", new TableInfo.Column("seriesDescription", "TEXT", true, 0, null, 1));
                hashMap6.put("pageHeaderUrl", new TableInfo.Column("pageHeaderUrl", "TEXT", true, 0, null, 1));
                hashMap6.put("seriesDetailList", new TableInfo.Column("seriesDetailList", "TEXT", true, 0, null, 1));
                hashMap6.put("childType", new TableInfo.Column("childType", "TEXT", false, 0, null, 1));
                TableInfo tableInfo6 = new TableInfo("UserSeriesDetailItem", hashMap6, new HashSet(0), new HashSet(0));
                TableInfo read6 = TableInfo.read(_db, "UserSeriesDetailItem");
                if (!tableInfo6.equals(read6)) {
                    return new RoomOpenHelper.ValidationResult(false, "UserSeriesDetailItem(com.glority.android.database.entities.UserSeriesDetailItem).\n Expected:\n" + tableInfo6 + "\n Found:\n" + read6);
                }
                HashMap hashMap7 = new HashMap(8);
                hashMap7.put(Args.seriesId, new TableInfo.Column(Args.seriesId, "INTEGER", true, 1, null, 1));
                hashMap7.put(Args.indexListUid, new TableInfo.Column(Args.indexListUid, "TEXT", true, 0, null, 1));
                hashMap7.put(Args.title, new TableInfo.Column(Args.title, "TEXT", true, 0, null, 1));
                hashMap7.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", false, 0, null, 1));
                hashMap7.put("currentCount", new TableInfo.Column("currentCount", "INTEGER", true, 0, null, 1));
                hashMap7.put("totalNum", new TableInfo.Column("totalNum", "INTEGER", true, 0, null, 1));
                hashMap7.put("country", new TableInfo.Column("country", "TEXT", false, 0, null, 1));
                hashMap7.put("topSubjectSideUrls", new TableInfo.Column("topSubjectSideUrls", "TEXT", false, 0, null, 1));
                TableInfo tableInfo7 = new TableInfo("UserSeriesListItem", hashMap7, new HashSet(0), new HashSet(0));
                TableInfo read7 = TableInfo.read(_db, "UserSeriesListItem");
                if (!tableInfo7.equals(read7)) {
                    return new RoomOpenHelper.ValidationResult(false, "UserSeriesListItem(com.glority.android.database.entities.UserSeriesListItem).\n Expected:\n" + tableInfo7 + "\n Found:\n" + read7);
                }
                HashMap hashMap8 = new HashMap(7);
                hashMap8.put(Args.indexListUid, new TableInfo.Column(Args.indexListUid, "TEXT", true, 1, null, 1));
                hashMap8.put(Args.title, new TableInfo.Column(Args.title, "TEXT", true, 0, null, 1));
                hashMap8.put("composition", new TableInfo.Column("composition", "TEXT", true, 0, null, 1));
                hashMap8.put("seriesDescription", new TableInfo.Column("seriesDescription", "TEXT", true, 0, null, 1));
                hashMap8.put("pageHearUrl", new TableInfo.Column("pageHearUrl", "TEXT", true, 0, null, 1));
                hashMap8.put("details", new TableInfo.Column("details", "TEXT", true, 0, null, 1));
                hashMap8.put("childType", new TableInfo.Column("childType", "TEXT", false, 0, null, 1));
                TableInfo tableInfo8 = new TableInfo("RecommendSeriesItem", hashMap8, new HashSet(0), new HashSet(0));
                TableInfo read8 = TableInfo.read(_db, "RecommendSeriesItem");
                if (!tableInfo8.equals(read8)) {
                    return new RoomOpenHelper.ValidationResult(false, "RecommendSeriesItem(com.glority.android.database.entities.RecommendSeriesItem).\n Expected:\n" + tableInfo8 + "\n Found:\n" + read8);
                }
                HashMap hashMap9 = new HashMap(7);
                hashMap9.put(Args.customSeriesId, new TableInfo.Column(Args.customSeriesId, "INTEGER", true, 1, null, 1));
                hashMap9.put(Args.title, new TableInfo.Column(Args.title, "TEXT", true, 0, null, 1));
                hashMap9.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, 1));
                hashMap9.put("updatedAt", new TableInfo.Column("updatedAt", "INTEGER", true, 0, null, 1));
                hashMap9.put("collectionCount", new TableInfo.Column("collectionCount", "INTEGER", true, 0, null, 1));
                hashMap9.put("latestCollectionUrlList", new TableInfo.Column("latestCollectionUrlList", "TEXT", true, 0, null, 1));
                hashMap9.put("totalPrice", new TableInfo.Column("totalPrice", "TEXT", false, 0, null, 1));
                TableInfo tableInfo9 = new TableInfo("UserCustomSeriesItem", hashMap9, new HashSet(0), new HashSet(0));
                TableInfo read9 = TableInfo.read(_db, "UserCustomSeriesItem");
                if (!tableInfo9.equals(read9)) {
                    return new RoomOpenHelper.ValidationResult(false, "UserCustomSeriesItem(com.glority.android.database.entities.UserCustomSeriesItem).\n Expected:\n" + tableInfo9 + "\n Found:\n" + read9);
                }
                HashMap hashMap10 = new HashMap(4);
                hashMap10.put("itemId", new TableInfo.Column("itemId", "INTEGER", true, 1, null, 1));
                hashMap10.put(Args.uid, new TableInfo.Column(Args.uid, "TEXT", true, 0, null, 1));
                hashMap10.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, 1));
                hashMap10.put(Args.year, new TableInfo.Column(Args.year, "TEXT", false, 0, null, 1));
                TableInfo tableInfo10 = new TableInfo("RecognizeHistoryItem", hashMap10, new HashSet(0), new HashSet(0));
                TableInfo read10 = TableInfo.read(_db, "RecognizeHistoryItem");
                if (!tableInfo10.equals(read10)) {
                    return new RoomOpenHelper.ValidationResult(false, "RecognizeHistoryItem(com.glority.android.database.entities.RecognizeHistoryItem).\n Expected:\n" + tableInfo10 + "\n Found:\n" + read10);
                }
                HashMap hashMap11 = new HashMap(6);
                hashMap11.put(Args.uid, new TableInfo.Column(Args.uid, "TEXT", true, 1, null, 1));
                hashMap11.put(Args.title, new TableInfo.Column(Args.title, "TEXT", true, 0, null, 1));
                hashMap11.put("mainImageUrl", new TableInfo.Column("mainImageUrl", "TEXT", true, 0, null, 1));
                hashMap11.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, 1));
                hashMap11.put("darkUrl", new TableInfo.Column("darkUrl", "TEXT", true, 0, null, 1));
                hashMap11.put("tags", new TableInfo.Column("tags", "TEXT", false, 0, null, 1));
                TableInfo tableInfo11 = new TableInfo("ArticleNewEntity", hashMap11, new HashSet(0), new HashSet(0));
                TableInfo read11 = TableInfo.read(_db, "ArticleNewEntity");
                if (!tableInfo11.equals(read11)) {
                    return new RoomOpenHelper.ValidationResult(false, "ArticleNewEntity(com.glority.android.database.entities.ArticleNewEntity).\n Expected:\n" + tableInfo11 + "\n Found:\n" + read11);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "32271a7780f0731b5fbb925fdd8b8699", "5076358ad2a31e5a8f7dddcd4ea9de35")).build());
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "HistoryItem", "CollectionItem", "HomeCoinItem", "WishItem", "SeriesItem", "UserSeriesDetailItem", "UserSeriesListItem", "RecommendSeriesItem", "UserCustomSeriesItem", "RecognizeHistoryItem", "ArticleNewEntity");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `HistoryItem`");
            writableDatabase.execSQL("DELETE FROM `CollectionItem`");
            writableDatabase.execSQL("DELETE FROM `HomeCoinItem`");
            writableDatabase.execSQL("DELETE FROM `WishItem`");
            writableDatabase.execSQL("DELETE FROM `SeriesItem`");
            writableDatabase.execSQL("DELETE FROM `UserSeriesDetailItem`");
            writableDatabase.execSQL("DELETE FROM `UserSeriesListItem`");
            writableDatabase.execSQL("DELETE FROM `RecommendSeriesItem`");
            writableDatabase.execSQL("DELETE FROM `UserCustomSeriesItem`");
            writableDatabase.execSQL("DELETE FROM `RecognizeHistoryItem`");
            writableDatabase.execSQL("DELETE FROM `ArticleNewEntity`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(HistoryItemDao.class, HistoryItemDao_Impl.getRequiredConverters());
        hashMap.put(CollectionItemDao.class, CollectionItemDao_Impl.getRequiredConverters());
        hashMap.put(HomeCoinItemDao.class, HomeCoinItemDao_Impl.getRequiredConverters());
        hashMap.put(WishItemDao.class, WishItemDao_Impl.getRequiredConverters());
        hashMap.put(SeriesItemDao.class, SeriesItemDao_Impl.getRequiredConverters());
        hashMap.put(UserSeriesDetailDao.class, UserSeriesDetailDao_Impl.getRequiredConverters());
        hashMap.put(UserSeriesListItemDao.class, UserSeriesListItemDao_Impl.getRequiredConverters());
        hashMap.put(RecommendSeriesDetailItemDao.class, RecommendSeriesDetailItemDao_Impl.getRequiredConverters());
        hashMap.put(UserCustomSeriesItemDao.class, UserCustomSeriesItemDao_Impl.getRequiredConverters());
        hashMap.put(RecognizeHistoryItemDao.class, RecognizeHistoryItemDao_Impl.getRequiredConverters());
        hashMap.put(ArticleNewDao.class, ArticleNewDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
        return Arrays.asList(new Migration[0]);
    }

    @Override // com.glority.android.database.AppDatabase
    public HistoryItemDao getSimpleItemDao() {
        HistoryItemDao historyItemDao;
        if (this._historyItemDao != null) {
            return this._historyItemDao;
        }
        synchronized (this) {
            if (this._historyItemDao == null) {
                this._historyItemDao = new HistoryItemDao_Impl(this);
            }
            historyItemDao = this._historyItemDao;
        }
        return historyItemDao;
    }

    @Override // com.glority.android.database.AppDatabase
    public CollectionItemDao getCollectionItemDao() {
        CollectionItemDao collectionItemDao;
        if (this._collectionItemDao != null) {
            return this._collectionItemDao;
        }
        synchronized (this) {
            if (this._collectionItemDao == null) {
                this._collectionItemDao = new CollectionItemDao_Impl(this);
            }
            collectionItemDao = this._collectionItemDao;
        }
        return collectionItemDao;
    }

    @Override // com.glority.android.database.AppDatabase
    public HomeCoinItemDao getHomeCoinItemDao() {
        HomeCoinItemDao homeCoinItemDao;
        if (this._homeCoinItemDao != null) {
            return this._homeCoinItemDao;
        }
        synchronized (this) {
            if (this._homeCoinItemDao == null) {
                this._homeCoinItemDao = new HomeCoinItemDao_Impl(this);
            }
            homeCoinItemDao = this._homeCoinItemDao;
        }
        return homeCoinItemDao;
    }

    @Override // com.glority.android.database.AppDatabase
    public WishItemDao getWishItemDao() {
        WishItemDao wishItemDao;
        if (this._wishItemDao != null) {
            return this._wishItemDao;
        }
        synchronized (this) {
            if (this._wishItemDao == null) {
                this._wishItemDao = new WishItemDao_Impl(this);
            }
            wishItemDao = this._wishItemDao;
        }
        return wishItemDao;
    }

    @Override // com.glority.android.database.AppDatabase
    public SeriesItemDao getSeriesItemDao() {
        SeriesItemDao seriesItemDao;
        if (this._seriesItemDao != null) {
            return this._seriesItemDao;
        }
        synchronized (this) {
            if (this._seriesItemDao == null) {
                this._seriesItemDao = new SeriesItemDao_Impl(this);
            }
            seriesItemDao = this._seriesItemDao;
        }
        return seriesItemDao;
    }

    @Override // com.glority.android.database.AppDatabase
    public UserSeriesDetailDao getUserSeriesDetailDao() {
        UserSeriesDetailDao userSeriesDetailDao;
        if (this._userSeriesDetailDao != null) {
            return this._userSeriesDetailDao;
        }
        synchronized (this) {
            if (this._userSeriesDetailDao == null) {
                this._userSeriesDetailDao = new UserSeriesDetailDao_Impl(this);
            }
            userSeriesDetailDao = this._userSeriesDetailDao;
        }
        return userSeriesDetailDao;
    }

    @Override // com.glority.android.database.AppDatabase
    public UserSeriesListItemDao getUserSeriesListItemDao() {
        UserSeriesListItemDao userSeriesListItemDao;
        if (this._userSeriesListItemDao != null) {
            return this._userSeriesListItemDao;
        }
        synchronized (this) {
            if (this._userSeriesListItemDao == null) {
                this._userSeriesListItemDao = new UserSeriesListItemDao_Impl(this);
            }
            userSeriesListItemDao = this._userSeriesListItemDao;
        }
        return userSeriesListItemDao;
    }

    @Override // com.glority.android.database.AppDatabase
    public RecommendSeriesDetailItemDao getRecommendSeriesItemDao() {
        RecommendSeriesDetailItemDao recommendSeriesDetailItemDao;
        if (this._recommendSeriesDetailItemDao != null) {
            return this._recommendSeriesDetailItemDao;
        }
        synchronized (this) {
            if (this._recommendSeriesDetailItemDao == null) {
                this._recommendSeriesDetailItemDao = new RecommendSeriesDetailItemDao_Impl(this);
            }
            recommendSeriesDetailItemDao = this._recommendSeriesDetailItemDao;
        }
        return recommendSeriesDetailItemDao;
    }

    @Override // com.glority.android.database.AppDatabase
    public UserCustomSeriesItemDao getUserCustomSeriesItemDao() {
        UserCustomSeriesItemDao userCustomSeriesItemDao;
        if (this._userCustomSeriesItemDao != null) {
            return this._userCustomSeriesItemDao;
        }
        synchronized (this) {
            if (this._userCustomSeriesItemDao == null) {
                this._userCustomSeriesItemDao = new UserCustomSeriesItemDao_Impl(this);
            }
            userCustomSeriesItemDao = this._userCustomSeriesItemDao;
        }
        return userCustomSeriesItemDao;
    }

    @Override // com.glority.android.database.AppDatabase
    public RecognizeHistoryItemDao getRecognizeHistoryItemDao() {
        RecognizeHistoryItemDao recognizeHistoryItemDao;
        if (this._recognizeHistoryItemDao != null) {
            return this._recognizeHistoryItemDao;
        }
        synchronized (this) {
            if (this._recognizeHistoryItemDao == null) {
                this._recognizeHistoryItemDao = new RecognizeHistoryItemDao_Impl(this);
            }
            recognizeHistoryItemDao = this._recognizeHistoryItemDao;
        }
        return recognizeHistoryItemDao;
    }

    @Override // com.glority.android.database.AppDatabase
    public ArticleNewDao getArticleNewDao() {
        ArticleNewDao articleNewDao;
        if (this._articleNewDao != null) {
            return this._articleNewDao;
        }
        synchronized (this) {
            if (this._articleNewDao == null) {
                this._articleNewDao = new ArticleNewDao_Impl(this);
            }
            articleNewDao = this._articleNewDao;
        }
        return articleNewDao;
    }
}
