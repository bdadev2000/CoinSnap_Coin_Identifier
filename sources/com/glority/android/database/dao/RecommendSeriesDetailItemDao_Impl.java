package com.glority.android.database.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.glority.android.database.DataBaseConverter;
import com.glority.android.database.entities.RecommendSeriesItem;
import com.glority.android.xx.constants.Args;
import com.picturecoin.generatedAPI.kotlinAPI.series.RecommendSeriesDetail;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class RecommendSeriesDetailItemDao_Impl implements RecommendSeriesDetailItemDao {
    private final DataBaseConverter __dataBaseConverter = new DataBaseConverter();
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<RecommendSeriesItem> __insertionAdapterOfRecommendSeriesItem;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

    public RecommendSeriesDetailItemDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfRecommendSeriesItem = new EntityInsertionAdapter<RecommendSeriesItem>(__db) { // from class: com.glority.android.database.dao.RecommendSeriesDetailItemDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `RecommendSeriesItem` (`indexListUid`,`title`,`composition`,`seriesDescription`,`pageHearUrl`,`details`,`childType`) VALUES (?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement stmt, RecommendSeriesItem value) {
                if (value.getIndexListUid() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getIndexListUid());
                }
                if (value.getTitle() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getTitle());
                }
                if (value.getComposition() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getComposition());
                }
                if (value.getSeriesDescription() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getSeriesDescription());
                }
                if (value.getPageHearUrl() == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.getPageHearUrl());
                }
                String listRecommendSeriesDetailToString = RecommendSeriesDetailItemDao_Impl.this.__dataBaseConverter.listRecommendSeriesDetailToString(value.getDetails());
                if (listRecommendSeriesDetailToString == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, listRecommendSeriesDetailToString);
                }
                if (value.getChildType() == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindString(7, value.getChildType());
                }
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.RecommendSeriesDetailItemDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM RecommendSeriesItem";
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.RecommendSeriesDetailItemDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM RecommendSeriesItem where indexListUid=?";
            }
        };
    }

    @Override // com.glority.android.database.dao.RecommendSeriesDetailItemDao
    public void insert(final RecommendSeriesItem... recommendSeriesItem) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRecommendSeriesItem.insert(recommendSeriesItem);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.glority.android.database.dao.RecommendSeriesDetailItemDao
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

    @Override // com.glority.android.database.dao.RecommendSeriesDetailItemDao
    public void delete(final String indexListUid) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDelete.acquire();
        if (indexListUid == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, indexListUid);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(acquire);
        }
    }

    @Override // com.glority.android.database.dao.RecommendSeriesDetailItemDao
    public LiveData<List<RecommendSeriesItem>> getAll() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from RecommendSeriesItem", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"RecommendSeriesItem"}, false, new Callable<List<RecommendSeriesItem>>() { // from class: com.glority.android.database.dao.RecommendSeriesDetailItemDao_Impl.4
            @Override // java.util.concurrent.Callable
            public List<RecommendSeriesItem> call() throws Exception {
                Cursor query = DBUtil.query(RecommendSeriesDetailItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.indexListUid);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "composition");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "seriesDescription");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "pageHearUrl");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "details");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "childType");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        String string = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                        String string2 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                        String string3 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                        String string4 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                        String string5 = query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5);
                        String string6 = query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6);
                        List<RecommendSeriesDetail> stringToListRecommendSeriesDetail = string6 == null ? null : RecommendSeriesDetailItemDao_Impl.this.__dataBaseConverter.stringToListRecommendSeriesDetail(string6);
                        if (stringToListRecommendSeriesDetail == null) {
                            throw new IllegalStateException("Expected non-null java.util.List<com.picturecoin.generatedAPI.kotlinAPI.series.RecommendSeriesDetail>, but it was null.");
                        }
                        arrayList.add(new RecommendSeriesItem(string, string2, string3, string4, string5, stringToListRecommendSeriesDetail, query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.glority.android.database.dao.RecommendSeriesDetailItemDao
    public List<RecommendSeriesItem> getAllSync() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from RecommendSeriesItem", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.indexListUid);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "composition");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "seriesDescription");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "pageHearUrl");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "details");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "childType");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                String string2 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                String string3 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                String string4 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                String string5 = query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5);
                String string6 = query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6);
                List<RecommendSeriesDetail> stringToListRecommendSeriesDetail = string6 == null ? null : this.__dataBaseConverter.stringToListRecommendSeriesDetail(string6);
                if (stringToListRecommendSeriesDetail == null) {
                    throw new IllegalStateException("Expected non-null java.util.List<com.picturecoin.generatedAPI.kotlinAPI.series.RecommendSeriesDetail>, but it was null.");
                }
                arrayList.add(new RecommendSeriesItem(string, string2, string3, string4, string5, stringToListRecommendSeriesDetail, query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.glority.android.database.dao.RecommendSeriesDetailItemDao
    public LiveData<RecommendSeriesItem> getItemByIndexListUid(final String indexListUid) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from RecommendSeriesItem where indexListUid=?", 1);
        if (indexListUid == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, indexListUid);
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"RecommendSeriesItem"}, false, new Callable<RecommendSeriesItem>() { // from class: com.glority.android.database.dao.RecommendSeriesDetailItemDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RecommendSeriesItem call() throws Exception {
                RecommendSeriesItem recommendSeriesItem = null;
                Cursor query = DBUtil.query(RecommendSeriesDetailItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.indexListUid);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "composition");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "seriesDescription");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "pageHearUrl");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "details");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "childType");
                    if (query.moveToFirst()) {
                        String string = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                        String string2 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                        String string3 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                        String string4 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                        String string5 = query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5);
                        String string6 = query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6);
                        List<RecommendSeriesDetail> stringToListRecommendSeriesDetail = string6 == null ? null : RecommendSeriesDetailItemDao_Impl.this.__dataBaseConverter.stringToListRecommendSeriesDetail(string6);
                        if (stringToListRecommendSeriesDetail == null) {
                            throw new IllegalStateException("Expected non-null java.util.List<com.picturecoin.generatedAPI.kotlinAPI.series.RecommendSeriesDetail>, but it was null.");
                        }
                        recommendSeriesItem = new RecommendSeriesItem(string, string2, string3, string4, string5, stringToListRecommendSeriesDetail, query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7));
                    }
                    return recommendSeriesItem;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.glority.android.database.dao.RecommendSeriesDetailItemDao
    public RecommendSeriesItem getItemByIndexListUidSync(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from RecommendSeriesItem where indexListUid=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        RecommendSeriesItem recommendSeriesItem = null;
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.indexListUid);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "composition");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "seriesDescription");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "pageHearUrl");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "details");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "childType");
            if (query.moveToFirst()) {
                String string = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                String string2 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                String string3 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                String string4 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                String string5 = query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5);
                String string6 = query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6);
                List<RecommendSeriesDetail> stringToListRecommendSeriesDetail = string6 == null ? null : this.__dataBaseConverter.stringToListRecommendSeriesDetail(string6);
                if (stringToListRecommendSeriesDetail == null) {
                    throw new IllegalStateException("Expected non-null java.util.List<com.picturecoin.generatedAPI.kotlinAPI.series.RecommendSeriesDetail>, but it was null.");
                }
                recommendSeriesItem = new RecommendSeriesItem(string, string2, string3, string4, string5, stringToListRecommendSeriesDetail, query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7));
            }
            return recommendSeriesItem;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.glority.android.database.dao.RecommendSeriesDetailItemDao
    public LiveData<Integer> getCount() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select COUNT(indexListUid) from RecommendSeriesItem", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"RecommendSeriesItem"}, false, new Callable<Integer>() { // from class: com.glority.android.database.dao.RecommendSeriesDetailItemDao_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                int i;
                Cursor query = DBUtil.query(RecommendSeriesDetailItemDao_Impl.this.__db, acquire, false, null);
                try {
                    if (query.moveToFirst()) {
                        i = Integer.valueOf(query.getInt(0));
                    } else {
                        i = 0;
                    }
                    return i;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
