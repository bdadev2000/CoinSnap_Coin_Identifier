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
import com.glority.android.database.entities.UserCustomSeriesItem;
import com.glority.android.xx.constants.Args;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class UserCustomSeriesItemDao_Impl implements UserCustomSeriesItemDao {
    private final DataBaseConverter __dataBaseConverter = new DataBaseConverter();
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<UserCustomSeriesItem> __insertionAdapterOfUserCustomSeriesItem;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

    public UserCustomSeriesItemDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfUserCustomSeriesItem = new EntityInsertionAdapter<UserCustomSeriesItem>(__db) { // from class: com.glority.android.database.dao.UserCustomSeriesItemDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `UserCustomSeriesItem` (`customSeriesId`,`title`,`createdAt`,`updatedAt`,`collectionCount`,`latestCollectionUrlList`,`totalPrice`) VALUES (?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement stmt, UserCustomSeriesItem value) {
                stmt.bindLong(1, value.getCustomSeriesId());
                if (value.getTitle() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getTitle());
                }
                Long dateToLong = UserCustomSeriesItemDao_Impl.this.__dataBaseConverter.dateToLong(value.getCreatedAt());
                if (dateToLong == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindLong(3, dateToLong.longValue());
                }
                Long dateToLong2 = UserCustomSeriesItemDao_Impl.this.__dataBaseConverter.dateToLong(value.getUpdatedAt());
                if (dateToLong2 == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindLong(4, dateToLong2.longValue());
                }
                stmt.bindLong(5, value.getCollectionCount());
                String listStringToString = UserCustomSeriesItemDao_Impl.this.__dataBaseConverter.listStringToString(value.getLatestCollectionUrlList());
                if (listStringToString == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, listStringToString);
                }
                String priceToString = UserCustomSeriesItemDao_Impl.this.__dataBaseConverter.priceToString(value.getTotalPrice());
                if (priceToString == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindString(7, priceToString);
                }
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.UserCustomSeriesItemDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM UserCustomSeriesItem";
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.UserCustomSeriesItemDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM UserCustomSeriesItem where customSeriesId=?";
            }
        };
    }

    @Override // com.glority.android.database.dao.UserCustomSeriesItemDao
    public void insert(final UserCustomSeriesItem... userCustomSeriesItem) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfUserCustomSeriesItem.insert(userCustomSeriesItem);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.glority.android.database.dao.UserCustomSeriesItemDao
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

    @Override // com.glority.android.database.dao.UserCustomSeriesItemDao
    public void delete(final int id) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDelete.acquire();
        acquire.bindLong(1, id);
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(acquire);
        }
    }

    @Override // com.glority.android.database.dao.UserCustomSeriesItemDao
    public LiveData<List<UserCustomSeriesItem>> getAll() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from UserCustomSeriesItem order by updatedAt desc", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"UserCustomSeriesItem"}, false, new Callable<List<UserCustomSeriesItem>>() { // from class: com.glority.android.database.dao.UserCustomSeriesItemDao_Impl.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public List<UserCustomSeriesItem> call() throws Exception {
                String str = null;
                Cursor query = DBUtil.query(UserCustomSeriesItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.customSeriesId);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "createdAt");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "updatedAt");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "collectionCount");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "latestCollectionUrlList");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "totalPrice");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        int i = query.getInt(columnIndexOrThrow);
                        String string = query.isNull(columnIndexOrThrow2) ? str : query.getString(columnIndexOrThrow2);
                        Date longToDate = UserCustomSeriesItemDao_Impl.this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow3) ? str : Long.valueOf(query.getLong(columnIndexOrThrow3)));
                        if (longToDate != null) {
                            Date longToDate2 = UserCustomSeriesItemDao_Impl.this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow4) ? str : Long.valueOf(query.getLong(columnIndexOrThrow4)));
                            if (longToDate2 == null) {
                                throw new IllegalStateException("Expected non-null java.util.Date, but it was null.");
                            }
                            int i2 = query.getInt(columnIndexOrThrow5);
                            List<String> stringToStringMutableList = UserCustomSeriesItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6));
                            if (stringToStringMutableList == null) {
                                throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                            }
                            arrayList.add(new UserCustomSeriesItem(i, string, longToDate, longToDate2, i2, stringToStringMutableList, UserCustomSeriesItemDao_Impl.this.__dataBaseConverter.stringToPrice(query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7))));
                            str = null;
                        } else {
                            throw new IllegalStateException("Expected non-null java.util.Date, but it was null.");
                        }
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.database.dao.UserCustomSeriesItemDao
    public List<UserCustomSeriesItem> getAllSync() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from UserCustomSeriesItem", 0);
        this.__db.assertNotSuspendingTransaction();
        String str = null;
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.customSeriesId);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "createdAt");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "updatedAt");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "collectionCount");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "latestCollectionUrlList");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "totalPrice");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                int i = query.getInt(columnIndexOrThrow);
                String string = query.isNull(columnIndexOrThrow2) ? str : query.getString(columnIndexOrThrow2);
                Date longToDate = this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow3) ? str : Long.valueOf(query.getLong(columnIndexOrThrow3)));
                if (longToDate == null) {
                    throw new IllegalStateException("Expected non-null java.util.Date, but it was null.");
                }
                Date longToDate2 = this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow4) ? str : Long.valueOf(query.getLong(columnIndexOrThrow4)));
                if (longToDate2 == null) {
                    throw new IllegalStateException("Expected non-null java.util.Date, but it was null.");
                }
                int i2 = query.getInt(columnIndexOrThrow5);
                List<String> stringToStringMutableList = this.__dataBaseConverter.stringToStringMutableList(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6));
                if (stringToStringMutableList == null) {
                    throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                }
                arrayList.add(new UserCustomSeriesItem(i, string, longToDate, longToDate2, i2, stringToStringMutableList, this.__dataBaseConverter.stringToPrice(query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7))));
                str = null;
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.glority.android.database.dao.UserCustomSeriesItemDao
    public LiveData<UserCustomSeriesItem> getCustomSeriesById(final int id) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from UserCustomSeriesItem where customSeriesId=?", 1);
        acquire.bindLong(1, id);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"UserCustomSeriesItem"}, false, new Callable<UserCustomSeriesItem>() { // from class: com.glority.android.database.dao.UserCustomSeriesItemDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UserCustomSeriesItem call() throws Exception {
                UserCustomSeriesItem userCustomSeriesItem = null;
                String string = null;
                Cursor query = DBUtil.query(UserCustomSeriesItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.customSeriesId);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "createdAt");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "updatedAt");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "collectionCount");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "latestCollectionUrlList");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "totalPrice");
                    if (query.moveToFirst()) {
                        int i = query.getInt(columnIndexOrThrow);
                        String string2 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                        Date longToDate = UserCustomSeriesItemDao_Impl.this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3)));
                        if (longToDate != null) {
                            Date longToDate2 = UserCustomSeriesItemDao_Impl.this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow4) ? null : Long.valueOf(query.getLong(columnIndexOrThrow4)));
                            if (longToDate2 == null) {
                                throw new IllegalStateException("Expected non-null java.util.Date, but it was null.");
                            }
                            int i2 = query.getInt(columnIndexOrThrow5);
                            List<String> stringToStringMutableList = UserCustomSeriesItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6));
                            if (stringToStringMutableList == null) {
                                throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                            }
                            if (!query.isNull(columnIndexOrThrow7)) {
                                string = query.getString(columnIndexOrThrow7);
                            }
                            userCustomSeriesItem = new UserCustomSeriesItem(i, string2, longToDate, longToDate2, i2, stringToStringMutableList, UserCustomSeriesItemDao_Impl.this.__dataBaseConverter.stringToPrice(string));
                        } else {
                            throw new IllegalStateException("Expected non-null java.util.Date, but it was null.");
                        }
                    }
                    return userCustomSeriesItem;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.glority.android.database.dao.UserCustomSeriesItemDao
    public UserCustomSeriesItem getItemSync(int i) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from UserCustomSeriesItem where customSeriesId=?", 1);
        acquire.bindLong(1, i);
        this.__db.assertNotSuspendingTransaction();
        UserCustomSeriesItem userCustomSeriesItem = null;
        String string = null;
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.customSeriesId);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "createdAt");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "updatedAt");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "collectionCount");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "latestCollectionUrlList");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "totalPrice");
            if (query.moveToFirst()) {
                int i2 = query.getInt(columnIndexOrThrow);
                String string2 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                Date longToDate = this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3)));
                if (longToDate == null) {
                    throw new IllegalStateException("Expected non-null java.util.Date, but it was null.");
                }
                Date longToDate2 = this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow4) ? null : Long.valueOf(query.getLong(columnIndexOrThrow4)));
                if (longToDate2 == null) {
                    throw new IllegalStateException("Expected non-null java.util.Date, but it was null.");
                }
                int i3 = query.getInt(columnIndexOrThrow5);
                List<String> stringToStringMutableList = this.__dataBaseConverter.stringToStringMutableList(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6));
                if (stringToStringMutableList == null) {
                    throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                }
                if (!query.isNull(columnIndexOrThrow7)) {
                    string = query.getString(columnIndexOrThrow7);
                }
                userCustomSeriesItem = new UserCustomSeriesItem(i2, string2, longToDate, longToDate2, i3, stringToStringMutableList, this.__dataBaseConverter.stringToPrice(string));
            }
            return userCustomSeriesItem;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.glority.android.database.dao.UserCustomSeriesItemDao
    public LiveData<Integer> getCount() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select COUNT(customSeriesId) from UserCustomSeriesItem", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"UserCustomSeriesItem"}, false, new Callable<Integer>() { // from class: com.glority.android.database.dao.UserCustomSeriesItemDao_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                int i;
                Cursor query = DBUtil.query(UserCustomSeriesItemDao_Impl.this.__db, acquire, false, null);
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

    @Override // com.glority.android.database.dao.UserCustomSeriesItemDao
    public int getCountSync() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select COUNT(customSeriesId) from UserCustomSeriesItem", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            return query.moveToFirst() ? query.getInt(0) : 0;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.glority.android.database.dao.UserCustomSeriesItemDao
    public String getCustomSeriesTitleByIdSync(final int id) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select title from UserCustomSeriesItem where customSeriesId=?", 1);
        acquire.bindLong(1, id);
        this.__db.assertNotSuspendingTransaction();
        String str = null;
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            if (query.moveToFirst() && !query.isNull(0)) {
                str = query.getString(0);
            }
            return str;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
