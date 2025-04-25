package com.glority.android.database.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.glority.android.database.DataBaseConverter;
import com.glority.android.database.entities.ArticleNewEntity;
import com.glority.android.xx.constants.Args;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class ArticleNewDao_Impl implements ArticleNewDao {
    private final DataBaseConverter __dataBaseConverter = new DataBaseConverter();
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<ArticleNewEntity> __deletionAdapterOfArticleNewEntity;
    private final EntityInsertionAdapter<ArticleNewEntity> __insertionAdapterOfArticleNewEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;
    private final SharedSQLiteStatement __preparedStmtOfDeleteByUid;

    public ArticleNewDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfArticleNewEntity = new EntityInsertionAdapter<ArticleNewEntity>(__db) { // from class: com.glority.android.database.dao.ArticleNewDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `ArticleNewEntity` (`uid`,`title`,`mainImageUrl`,`url`,`darkUrl`,`tags`) VALUES (?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement stmt, ArticleNewEntity value) {
                if (value.getUid() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getUid());
                }
                if (value.getTitle() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getTitle());
                }
                if (value.getMainImageUrl() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getMainImageUrl());
                }
                if (value.getUrl() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getUrl());
                }
                if (value.getDarkUrl() == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.getDarkUrl());
                }
                String coinTagListToString = ArticleNewDao_Impl.this.__dataBaseConverter.coinTagListToString(value.getTags());
                if (coinTagListToString == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, coinTagListToString);
                }
            }
        };
        this.__deletionAdapterOfArticleNewEntity = new EntityDeletionOrUpdateAdapter<ArticleNewEntity>(__db) { // from class: com.glority.android.database.dao.ArticleNewDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `ArticleNewEntity` WHERE `uid` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement stmt, ArticleNewEntity value) {
                if (value.getUid() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getUid());
                }
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.ArticleNewDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM ArticleNewEntity";
            }
        };
        this.__preparedStmtOfDeleteByUid = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.ArticleNewDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM ArticleNewEntity WHERE uid = ?";
            }
        };
    }

    @Override // com.glority.android.database.dao.ArticleNewDao
    public void insert(final ArticleNewEntity... articleNewEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfArticleNewEntity.insert(articleNewEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.glority.android.database.dao.ArticleNewDao
    public void insert(final Collection<ArticleNewEntity> articleNewEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfArticleNewEntity.insert(articleNewEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.glority.android.database.dao.ArticleNewDao
    public void delete(final ArticleNewEntity articleNewEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfArticleNewEntity.handle(articleNewEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.glority.android.database.dao.ArticleNewDao
    public void deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteAll.acquire();
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.release(acquire);
        }
    }

    @Override // com.glority.android.database.dao.ArticleNewDao
    public void deleteByUid(final String uid) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteByUid.acquire();
        if (uid == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, uid);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteByUid.release(acquire);
        }
    }

    @Override // com.glority.android.database.dao.ArticleNewDao
    public List<ArticleNewEntity> getAll() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM ArticleNewEntity", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "mainImageUrl");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "url");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "darkUrl");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "tags");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                ArticleNewEntity articleNewEntity = new ArticleNewEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow));
                articleNewEntity.setTitle(query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2));
                articleNewEntity.setMainImageUrl(query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3));
                articleNewEntity.setUrl(query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4));
                articleNewEntity.setDarkUrl(query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5));
                articleNewEntity.setTags(this.__dataBaseConverter.stringToCoinTagList(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6)));
                arrayList.add(articleNewEntity);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.glority.android.database.dao.ArticleNewDao
    public ArticleNewEntity getArticleNewEntityById(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM ArticleNewEntity WHERE uid = ?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        ArticleNewEntity articleNewEntity = null;
        String string = null;
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "mainImageUrl");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "url");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "darkUrl");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "tags");
            if (query.moveToFirst()) {
                ArticleNewEntity articleNewEntity2 = new ArticleNewEntity(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow));
                articleNewEntity2.setTitle(query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2));
                articleNewEntity2.setMainImageUrl(query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3));
                articleNewEntity2.setUrl(query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4));
                articleNewEntity2.setDarkUrl(query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5));
                if (!query.isNull(columnIndexOrThrow6)) {
                    string = query.getString(columnIndexOrThrow6);
                }
                articleNewEntity2.setTags(this.__dataBaseConverter.stringToCoinTagList(string));
                articleNewEntity = articleNewEntity2;
            }
            return articleNewEntity;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
