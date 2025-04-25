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
import com.glority.android.database.entities.HistoryItem;
import com.glority.android.xx.constants.Args;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class HistoryItemDao_Impl implements HistoryItemDao {
    private final DataBaseConverter __dataBaseConverter = new DataBaseConverter();
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<HistoryItem> __insertionAdapterOfHistoryItem;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

    public HistoryItemDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfHistoryItem = new EntityInsertionAdapter<HistoryItem>(__db) { // from class: com.glority.android.database.dao.HistoryItemDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `HistoryItem` (`itemId`,`uid`,`name`,`userId`,`imageUrl`,`date`) VALUES (?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement stmt, HistoryItem value) {
                stmt.bindLong(1, value.getItemId());
                if (value.getUid() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getUid());
                }
                if (value.getName() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getName());
                }
                stmt.bindLong(4, value.getUserId());
                if (value.getImageUrl() == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.getImageUrl());
                }
                Long dateToLong = HistoryItemDao_Impl.this.__dataBaseConverter.dateToLong(value.getDate());
                if (dateToLong == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindLong(6, dateToLong.longValue());
                }
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.HistoryItemDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM HistoryItem";
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.HistoryItemDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM HistoryItem where itemId=?";
            }
        };
    }

    @Override // com.glority.android.database.dao.HistoryItemDao
    public void insert(final HistoryItem... historyItem) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfHistoryItem.insert(historyItem);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.glority.android.database.dao.HistoryItemDao
    public void insertSync(final HistoryItem historyItem) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfHistoryItem.insert((EntityInsertionAdapter<HistoryItem>) historyItem);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.glority.android.database.dao.HistoryItemDao
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

    @Override // com.glority.android.database.dao.HistoryItemDao
    public void delete(final long itemId) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDelete.acquire();
        acquire.bindLong(1, itemId);
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(acquire);
        }
    }

    @Override // com.glority.android.database.dao.HistoryItemDao
    public LiveData<List<HistoryItem>> getAll(final long userId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from HistoryItem where userId=? order by date desc ", 1);
        acquire.bindLong(1, userId);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"HistoryItem"}, false, new Callable<List<HistoryItem>>() { // from class: com.glority.android.database.dao.HistoryItemDao_Impl.4
            @Override // java.util.concurrent.Callable
            public List<HistoryItem> call() throws Exception {
                Cursor query = DBUtil.query(HistoryItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "itemId");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "name");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "userId");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        long j = query.getLong(columnIndexOrThrow);
                        String string = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                        String string2 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                        long j2 = query.getLong(columnIndexOrThrow4);
                        String string3 = query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5);
                        Date longToDate = HistoryItemDao_Impl.this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow6) ? null : Long.valueOf(query.getLong(columnIndexOrThrow6)));
                        if (longToDate == null) {
                            throw new IllegalStateException("Expected non-null java.util.Date, but it was null.");
                        }
                        arrayList.add(new HistoryItem(j, string, string2, j2, string3, longToDate));
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

    @Override // com.glority.android.database.dao.HistoryItemDao
    public LiveData<HistoryItem> getItem(final long itemId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from HistoryItem where itemId=?", 1);
        acquire.bindLong(1, itemId);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"HistoryItem"}, false, new Callable<HistoryItem>() { // from class: com.glority.android.database.dao.HistoryItemDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public HistoryItem call() throws Exception {
                HistoryItem historyItem = null;
                Long valueOf = null;
                Cursor query = DBUtil.query(HistoryItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "itemId");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "name");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "userId");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    if (query.moveToFirst()) {
                        long j = query.getLong(columnIndexOrThrow);
                        String string = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                        String string2 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                        long j2 = query.getLong(columnIndexOrThrow4);
                        String string3 = query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5);
                        if (!query.isNull(columnIndexOrThrow6)) {
                            valueOf = Long.valueOf(query.getLong(columnIndexOrThrow6));
                        }
                        Date longToDate = HistoryItemDao_Impl.this.__dataBaseConverter.longToDate(valueOf);
                        if (longToDate == null) {
                            throw new IllegalStateException("Expected non-null java.util.Date, but it was null.");
                        }
                        historyItem = new HistoryItem(j, string, string2, j2, string3, longToDate);
                    }
                    return historyItem;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.glority.android.database.dao.HistoryItemDao
    public HistoryItem getItemSync(long j) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from HistoryItem where itemId=?", 1);
        acquire.bindLong(1, j);
        this.__db.assertNotSuspendingTransaction();
        HistoryItem historyItem = null;
        Long valueOf = null;
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "itemId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "userId");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "date");
            if (query.moveToFirst()) {
                long j2 = query.getLong(columnIndexOrThrow);
                String string = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                String string2 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                long j3 = query.getLong(columnIndexOrThrow4);
                String string3 = query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5);
                if (!query.isNull(columnIndexOrThrow6)) {
                    valueOf = Long.valueOf(query.getLong(columnIndexOrThrow6));
                }
                Date longToDate = this.__dataBaseConverter.longToDate(valueOf);
                if (longToDate == null) {
                    throw new IllegalStateException("Expected non-null java.util.Date, but it was null.");
                }
                historyItem = new HistoryItem(j2, string, string2, j3, string3, longToDate);
            }
            return historyItem;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
