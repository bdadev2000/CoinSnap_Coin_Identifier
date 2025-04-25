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
import com.glority.android.database.entities.UserSeriesDetailItem;
import com.glority.android.xx.constants.Args;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class UserSeriesDetailDao_Impl implements UserSeriesDetailDao {
    private final DataBaseConverter __dataBaseConverter = new DataBaseConverter();
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<UserSeriesDetailItem> __insertionAdapterOfUserSeriesDetailItem;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

    public UserSeriesDetailDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfUserSeriesDetailItem = new EntityInsertionAdapter<UserSeriesDetailItem>(__db) { // from class: com.glority.android.database.dao.UserSeriesDetailDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `UserSeriesDetailItem` (`seriesId`,`title`,`composition`,`seriesDescription`,`pageHeaderUrl`,`seriesDetailList`,`childType`) VALUES (?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement stmt, UserSeriesDetailItem value) {
                stmt.bindLong(1, value.getSeriesId());
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
                if (value.getPageHeaderUrl() == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.getPageHeaderUrl());
                }
                String listUserSeriesDetailToString = UserSeriesDetailDao_Impl.this.__dataBaseConverter.listUserSeriesDetailToString(value.getSeriesDetailList());
                if (listUserSeriesDetailToString == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, listUserSeriesDetailToString);
                }
                if (value.getChildType() == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindString(7, value.getChildType());
                }
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.UserSeriesDetailDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM UserSeriesDetailItem";
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.UserSeriesDetailDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM UserSeriesDetailItem where seriesId=?";
            }
        };
    }

    @Override // com.glority.android.database.dao.UserSeriesDetailDao
    public void insert(final UserSeriesDetailItem... seriesChildItem) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfUserSeriesDetailItem.insert(seriesChildItem);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.glority.android.database.dao.UserSeriesDetailDao
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

    @Override // com.glority.android.database.dao.UserSeriesDetailDao
    public void delete(final int seriesId) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDelete.acquire();
        acquire.bindLong(1, seriesId);
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(acquire);
        }
    }

    @Override // com.glority.android.database.dao.UserSeriesDetailDao
    public LiveData<List<UserSeriesDetailItem>> getAll() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from UserSeriesDetailItem", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"UserSeriesDetailItem"}, false, new Callable<List<UserSeriesDetailItem>>() { // from class: com.glority.android.database.dao.UserSeriesDetailDao_Impl.4
            @Override // java.util.concurrent.Callable
            public List<UserSeriesDetailItem> call() throws Exception {
                Cursor query = DBUtil.query(UserSeriesDetailDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.seriesId);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "composition");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "seriesDescription");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "pageHeaderUrl");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "seriesDetailList");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "childType");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new UserSeriesDetailItem(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), UserSeriesDetailDao_Impl.this.__dataBaseConverter.stringToListUserSeriesDetail(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6)), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7)));
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

    @Override // com.glority.android.database.dao.UserSeriesDetailDao
    public List<UserSeriesDetailItem> getAllSync() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from UserSeriesDetailItem", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.seriesId);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "composition");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "seriesDescription");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "pageHeaderUrl");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "seriesDetailList");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "childType");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new UserSeriesDetailItem(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), this.__dataBaseConverter.stringToListUserSeriesDetail(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6)), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.glority.android.database.dao.UserSeriesDetailDao
    public LiveData<UserSeriesDetailItem> getItem(final long seriesId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from UserSeriesDetailItem where seriesId=?", 1);
        acquire.bindLong(1, seriesId);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"UserSeriesDetailItem"}, false, new Callable<UserSeriesDetailItem>() { // from class: com.glority.android.database.dao.UserSeriesDetailDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UserSeriesDetailItem call() throws Exception {
                UserSeriesDetailItem userSeriesDetailItem = null;
                Cursor query = DBUtil.query(UserSeriesDetailDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.seriesId);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "composition");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "seriesDescription");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "pageHeaderUrl");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "seriesDetailList");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "childType");
                    if (query.moveToFirst()) {
                        userSeriesDetailItem = new UserSeriesDetailItem(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), UserSeriesDetailDao_Impl.this.__dataBaseConverter.stringToListUserSeriesDetail(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6)), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7));
                    }
                    return userSeriesDetailItem;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.glority.android.database.dao.UserSeriesDetailDao
    public UserSeriesDetailItem getItemSync(long j) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from UserSeriesDetailItem where seriesId=?", 1);
        acquire.bindLong(1, j);
        this.__db.assertNotSuspendingTransaction();
        UserSeriesDetailItem userSeriesDetailItem = null;
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.seriesId);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "composition");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "seriesDescription");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "pageHeaderUrl");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "seriesDetailList");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "childType");
            if (query.moveToFirst()) {
                userSeriesDetailItem = new UserSeriesDetailItem(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), this.__dataBaseConverter.stringToListUserSeriesDetail(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6)), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7));
            }
            return userSeriesDetailItem;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.glority.android.database.dao.UserSeriesDetailDao
    public LiveData<Integer> getCount() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select COUNT(seriesId) from UserSeriesDetailItem", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"UserSeriesDetailItem"}, false, new Callable<Integer>() { // from class: com.glority.android.database.dao.UserSeriesDetailDao_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                int i;
                Cursor query = DBUtil.query(UserSeriesDetailDao_Impl.this.__db, acquire, false, null);
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
