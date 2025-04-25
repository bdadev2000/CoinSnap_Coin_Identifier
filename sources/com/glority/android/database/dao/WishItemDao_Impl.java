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
import com.glority.android.database.entities.WishItem;
import com.glority.android.xx.constants.Args;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class WishItemDao_Impl implements WishItemDao {
    private final DataBaseConverter __dataBaseConverter = new DataBaseConverter();
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<WishItem> __insertionAdapterOfWishItem;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

    public WishItemDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfWishItem = new EntityInsertionAdapter<WishItem>(__db) { // from class: com.glority.android.database.dao.WishItemDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `WishItem` (`wishId`,`userId`,`uid`,`price`,`name`,`originalImageUrl`,`createdAt`) VALUES (?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement stmt, WishItem value) {
                stmt.bindLong(1, value.getWishId());
                stmt.bindLong(2, value.getUserId());
                if (value.getUid() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getUid());
                }
                if (value.getPrice() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getPrice());
                }
                if (value.getName() == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.getName());
                }
                if (value.getOriginalImageUrl() == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.getOriginalImageUrl());
                }
                Long dateToLong = WishItemDao_Impl.this.__dataBaseConverter.dateToLong(value.getCreatedAt());
                if (dateToLong == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindLong(7, dateToLong.longValue());
                }
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.WishItemDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM WishItem";
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.WishItemDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM WishItem where wishId=?";
            }
        };
    }

    @Override // com.glority.android.database.dao.WishItemDao
    public void insert(final WishItem... wishItem) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWishItem.insert(wishItem);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.glority.android.database.dao.WishItemDao
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

    @Override // com.glority.android.database.dao.WishItemDao
    public void delete(final int wishId) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDelete.acquire();
        acquire.bindLong(1, wishId);
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(acquire);
        }
    }

    @Override // com.glority.android.database.dao.WishItemDao
    public LiveData<List<WishItem>> getAll(final long userId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from WishItem where userId=? order by wishId desc", 1);
        acquire.bindLong(1, userId);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WishItem"}, false, new Callable<List<WishItem>>() { // from class: com.glority.android.database.dao.WishItemDao_Impl.4
            @Override // java.util.concurrent.Callable
            public List<WishItem> call() throws Exception {
                Cursor query = DBUtil.query(WishItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.wishId);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "userId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "price");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "name");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "originalImageUrl");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "createdAt");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new WishItem(query.getInt(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), WishItemDao_Impl.this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)))));
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

    @Override // com.glority.android.database.dao.WishItemDao
    public List<WishItem> getAllSync(final long userId) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from WishItem where userId=?", 1);
        acquire.bindLong(1, userId);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.wishId);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "userId");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "price");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "name");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "originalImageUrl");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "createdAt");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new WishItem(query.getInt(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)))));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.glority.android.database.dao.WishItemDao
    public LiveData<WishItem> getItem(final long wishId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from WishItem where wishId=?", 1);
        acquire.bindLong(1, wishId);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WishItem"}, false, new Callable<WishItem>() { // from class: com.glority.android.database.dao.WishItemDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public WishItem call() throws Exception {
                WishItem wishItem = null;
                Long valueOf = null;
                Cursor query = DBUtil.query(WishItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.wishId);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "userId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "price");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "name");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "originalImageUrl");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "createdAt");
                    if (query.moveToFirst()) {
                        int i = query.getInt(columnIndexOrThrow);
                        long j = query.getLong(columnIndexOrThrow2);
                        String string = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                        String string2 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                        String string3 = query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5);
                        String string4 = query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6);
                        if (!query.isNull(columnIndexOrThrow7)) {
                            valueOf = Long.valueOf(query.getLong(columnIndexOrThrow7));
                        }
                        wishItem = new WishItem(i, j, string, string2, string3, string4, WishItemDao_Impl.this.__dataBaseConverter.longToDate(valueOf));
                    }
                    return wishItem;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.glority.android.database.dao.WishItemDao
    public LiveData<Integer> getCount(final long userId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select COUNT(wishId) from WishItem where userId=?", 1);
        acquire.bindLong(1, userId);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WishItem"}, false, new Callable<Integer>() { // from class: com.glority.android.database.dao.WishItemDao_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                int i;
                Cursor query = DBUtil.query(WishItemDao_Impl.this.__db, acquire, false, null);
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
