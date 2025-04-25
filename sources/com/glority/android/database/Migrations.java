package com.glority.android.database;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Migrations.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/glority/android/database/Migrations;", "", "<init>", "()V", "migration_1_to_2", "Landroidx/room/migration/Migration;", "getMigration_1_to_2", "()Landroidx/room/migration/Migration;", "migration_3_to_4", "getMigration_3_to_4", "migration_4_to_5", "getMigration_4_to_5", "migration_6_to_7", "getMigration_6_to_7", "migration_8_to_9", "getMigration_8_to_9", "migration_9_to_10", "getMigration_9_to_10", "migration_10_to_11", "getMigration_10_to_11", "migration_11_to_12", "getMigration_11_to_12", "migration_12_to_13", "getMigration_12_to_13", "migration_13_to_14", "getMigration_13_to_14", "migration_14_to_15", "getMigration_14_to_15", "migration_15_to_16", "getMigration_15_to_16", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public final class Migrations {
    public static final Migrations INSTANCE = new Migrations();
    private static final Migration migration_1_to_2 = new Migration() { // from class: com.glority.android.database.Migrations$migration_1_to_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE CollectionItem  ADD COLUMN grade TEXT");
        }
    };
    private static final Migration migration_3_to_4 = new Migration() { // from class: com.glority.android.database.Migrations$migration_3_to_4$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE CollectionItem  ADD COLUMN priceUnit TEXT");
        }
    };
    private static final Migration migration_4_to_5 = new Migration() { // from class: com.glority.android.database.Migrations$migration_4_to_5$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE CollectionItem ADD COLUMN year TEXT");
            database.execSQL("ALTER TABLE CollectionItem ADD COLUMN mintMark TEXT");
            database.execSQL("ALTER TABLE CollectionItem ADD COLUMN denominationSideUrl TEXT");
            database.execSQL("ALTER TABLE CollectionItem ADD COLUMN subjectSideUrl TEXT");
            database.execSQL("ALTER TABLE CollectionItem ADD COLUMN seriesIndexListUid TEXT");
            database.execSQL("ALTER TABLE CollectionItem ADD COLUMN speciesUid TEXT");
            database.execSQL("ALTER TABLE CollectionItem ADD COLUMN varietyUid TEXT");
            database.execSQL("CREATE TABLE IF NOT EXISTS `SeriesItem` (`indexListUid` TEXT NOT NULL, `title` TEXT NOT NULL, `imageUrl` TEXT, `totalNum` INTEGER NOT NULL, `created` INTEGER NOT NULL, `seriesId` INTEGER, PRIMARY KEY(`indexListUid`))");
            database.execSQL("CREATE TABLE IF NOT EXISTS `RecommendSeriesItem` (`indexListUid` TEXT NOT NULL, `title` TEXT NOT NULL, `composition` TEXT NOT NULL, `seriesDescription` TEXT NOT NULL, `pageHearUrl` TEXT NOT NULL, `details` TEXT NOT NULL, PRIMARY KEY(`indexListUid`))");
            database.execSQL("CREATE TABLE IF NOT EXISTS `UserSeriesDetailItem` (`seriesId` INTEGER NOT NULL, `title` TEXT NOT NULL, `childType` TEXT,`composition` TEXT NOT NULL, `seriesDescription` TEXT NOT NULL, `pageHeaderUrl` TEXT NOT NULL, `seriesDetailList` TEXT NOT NULL, PRIMARY KEY(`seriesId`))");
            database.execSQL("CREATE TABLE IF NOT EXISTS `UserSeriesListItem` (`seriesId` INTEGER NOT NULL, `title` TEXT NOT NULL, `indexListUid` TEXT NOT NULL, `imageUrl` TEXT, `currentCount` INTEGER NOT NULL, `totalNum` INTEGER NOT NULL, PRIMARY KEY(`seriesId`))");
        }
    };
    private static final Migration migration_6_to_7 = new Migration() { // from class: com.glority.android.database.Migrations$migration_6_to_7$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE SeriesItem  ADD COLUMN 'currentCount' INTEGER");
        }
    };
    private static final Migration migration_8_to_9 = new Migration() { // from class: com.glority.android.database.Migrations$migration_8_to_9$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE CollectionItem  ADD COLUMN 'issuerCountryCode' TEXT");
            database.execSQL("ALTER TABLE CollectionItem  ADD COLUMN 'issuer' TEXT");
            database.execSQL("ALTER TABLE CollectionItem  ADD COLUMN 'customSeriesId' INTEGER");
            database.execSQL("CREATE INDEX IF NOT EXISTS `index_CollectionItem_userId` ON `CollectionItem` (`userId`)");
        }
    };
    private static final Migration migration_9_to_10 = new Migration() { // from class: com.glority.android.database.Migrations$migration_9_to_10$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE RecommendSeriesItem  ADD COLUMN 'childType' TEXT");
        }
    };
    private static final Migration migration_10_to_11 = new Migration() { // from class: com.glority.android.database.Migrations$migration_10_to_11$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS `RecognizeHistoryItem` (`itemId` INTEGER NOT NULL, `uid` TEXT NOT NULL, `date` INTEGER NOT NULL,`year` TEXT , PRIMARY KEY(`itemId`))");
        }
    };
    private static final Migration migration_11_to_12 = new Migration() { // from class: com.glority.android.database.Migrations$migration_11_to_12$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE CollectionItem  ADD COLUMN 'marketValue' TEXT");
        }
    };
    private static final Migration migration_12_to_13 = new Migration() { // from class: com.glority.android.database.Migrations$migration_12_to_13$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE UserCustomSeriesItem  ADD COLUMN 'totalPrice' TEXT");
        }
    };
    private static final Migration migration_13_to_14 = new Migration() { // from class: com.glority.android.database.Migrations$migration_13_to_14$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE SeriesItem  ADD COLUMN 'country' TEXT");
        }
    };
    private static final Migration migration_14_to_15 = new Migration() { // from class: com.glority.android.database.Migrations$migration_14_to_15$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE CollectionItem ADD COLUMN 'mintage' TEXT;");
            database.execSQL("ALTER TABLE CollectionItem ADD COLUMN 'denomination' TEXT;");
            database.execSQL("ALTER TABLE CollectionItem ADD COLUMN 'compositionTypes' TEXT;");
            database.execSQL("ALTER TABLE CollectionItem ADD COLUMN 'compositionOptions' TEXT;");
            database.execSQL("ALTER TABLE CollectionItem ADD COLUMN 'mintMarkV2' TEXT;");
            database.execSQL("ALTER TABLE CollectionItem ADD COLUMN 'subThemes' TEXT;");
            database.execSQL("ALTER TABLE CollectionItem ADD COLUMN 'seriesList' TEXT;");
        }
    };
    private static final Migration migration_15_to_16 = new Migration() { // from class: com.glority.android.database.Migrations$migration_15_to_16$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE UserSeriesListItem \nADD COLUMN 'country' TEXT");
            database.execSQL("ALTER TABLE UserSeriesListItem\nADD COLUMN 'topSubjectSideUrls' TEXT                     ");
            database.execSQL("CREATE TABLE IF NOT EXISTS `ArticleNewEntity` \n(\n    `uid` TEXT NOT NULL, \n    `title` TEXT NOT NULL, \n    `mainImageUrl` TEXT NOT NULL, \n    `url` TEXT NOT NULL, \n    `darkUrl` TEXT NOT NULL, \n    `tags` TEXT, \n    PRIMARY KEY(`uid`)\n)");
        }
    };

    private Migrations() {
    }

    public final Migration getMigration_1_to_2() {
        return migration_1_to_2;
    }

    public final Migration getMigration_3_to_4() {
        return migration_3_to_4;
    }

    public final Migration getMigration_4_to_5() {
        return migration_4_to_5;
    }

    public final Migration getMigration_6_to_7() {
        return migration_6_to_7;
    }

    public final Migration getMigration_8_to_9() {
        return migration_8_to_9;
    }

    public final Migration getMigration_9_to_10() {
        return migration_9_to_10;
    }

    public final Migration getMigration_10_to_11() {
        return migration_10_to_11;
    }

    public final Migration getMigration_11_to_12() {
        return migration_11_to_12;
    }

    public final Migration getMigration_12_to_13() {
        return migration_12_to_13;
    }

    public final Migration getMigration_13_to_14() {
        return migration_13_to_14;
    }

    public final Migration getMigration_14_to_15() {
        return migration_14_to_15;
    }

    public final Migration getMigration_15_to_16() {
        return migration_15_to_16;
    }
}
