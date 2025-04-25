package com.glority.android.database.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.glority.android.database.DataBaseConverter;
import com.glority.android.database.entities.UserSeriesListItem;
import com.glority.android.xx.constants.Args;
import com.picturecoin.generatedAPI.kotlinAPI.model.CountryInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class UserSeriesListItemDao_Impl implements UserSeriesListItemDao {
    private final DataBaseConverter __dataBaseConverter = new DataBaseConverter();
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<UserSeriesListItem> __insertionAdapterOfUserSeriesListItem;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

    public UserSeriesListItemDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfUserSeriesListItem = new EntityInsertionAdapter<UserSeriesListItem>(__db) { // from class: com.glority.android.database.dao.UserSeriesListItemDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `UserSeriesListItem` (`seriesId`,`indexListUid`,`title`,`imageUrl`,`currentCount`,`totalNum`,`country`,`topSubjectSideUrls`) VALUES (?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement stmt, UserSeriesListItem value) {
                stmt.bindLong(1, value.getSeriesId());
                if (value.getIndexListUid() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getIndexListUid());
                }
                if (value.getTitle() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getTitle());
                }
                if (value.getImageUrl() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getImageUrl());
                }
                stmt.bindLong(5, value.getCurrentCount());
                stmt.bindLong(6, value.getTotalNum());
                String countryToString = UserSeriesListItemDao_Impl.this.__dataBaseConverter.countryToString(value.getCountry());
                if (countryToString == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindString(7, countryToString);
                }
                String stringMutableListToString = UserSeriesListItemDao_Impl.this.__dataBaseConverter.stringMutableListToString(value.getTopSubjectSideUrls());
                if (stringMutableListToString == null) {
                    stmt.bindNull(8);
                } else {
                    stmt.bindString(8, stringMutableListToString);
                }
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.UserSeriesListItemDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM UserSeriesListItem";
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.UserSeriesListItemDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM UserSeriesListItem where indexListUid=?";
            }
        };
    }

    @Override // com.glority.android.database.dao.UserSeriesListItemDao
    public void insert(final UserSeriesListItem... userSeriesListItem) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfUserSeriesListItem.insert(userSeriesListItem);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.glority.android.database.dao.UserSeriesListItemDao
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

    @Override // com.glority.android.database.dao.UserSeriesListItemDao
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

    @Override // com.glority.android.database.dao.UserSeriesListItemDao
    public LiveData<List<UserSeriesListItem>> getAll() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from UserSeriesListItem", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"UserSeriesListItem"}, false, new Callable<List<UserSeriesListItem>>() { // from class: com.glority.android.database.dao.UserSeriesListItemDao_Impl.4
            @Override // java.util.concurrent.Callable
            public List<UserSeriesListItem> call() throws Exception {
                Cursor query = DBUtil.query(UserSeriesListItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.seriesId);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.indexListUid);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "currentCount");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "totalNum");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "country");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "topSubjectSideUrls");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new UserSeriesListItem(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6), UserSeriesListItemDao_Impl.this.__dataBaseConverter.stringToCountry(query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7)), UserSeriesListItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8))));
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

    @Override // com.glority.android.database.dao.UserSeriesListItemDao
    public List<UserSeriesListItem> getAllSync() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from UserSeriesListItem", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.seriesId);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.indexListUid);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "currentCount");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "totalNum");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "country");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "topSubjectSideUrls");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new UserSeriesListItem(query.getLong(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6), this.__dataBaseConverter.stringToCountry(query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7)), this.__dataBaseConverter.stringToStringMutableList(query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8))));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.glority.android.database.dao.UserSeriesListItemDao
    public LiveData<UserSeriesListItem> getItem(final long seriesId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from UserSeriesListItem where indexListUid=?", 1);
        acquire.bindLong(1, seriesId);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"UserSeriesListItem"}, false, new Callable<UserSeriesListItem>() { // from class: com.glority.android.database.dao.UserSeriesListItemDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UserSeriesListItem call() throws Exception {
                UserSeriesListItem userSeriesListItem = null;
                String string = null;
                Cursor query = DBUtil.query(UserSeriesListItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.seriesId);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.indexListUid);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "currentCount");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "totalNum");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "country");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "topSubjectSideUrls");
                    if (query.moveToFirst()) {
                        long j = query.getLong(columnIndexOrThrow);
                        String string2 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                        String string3 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                        String string4 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                        int i = query.getInt(columnIndexOrThrow5);
                        int i2 = query.getInt(columnIndexOrThrow6);
                        CountryInfo stringToCountry = UserSeriesListItemDao_Impl.this.__dataBaseConverter.stringToCountry(query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7));
                        if (!query.isNull(columnIndexOrThrow8)) {
                            string = query.getString(columnIndexOrThrow8);
                        }
                        userSeriesListItem = new UserSeriesListItem(j, string2, string3, string4, i, i2, stringToCountry, UserSeriesListItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(string));
                    }
                    return userSeriesListItem;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.glority.android.database.dao.UserSeriesListItemDao
    public LiveData<UserSeriesListItem> getItemByIndexListUid(final String indexListUid) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from UserSeriesListItem where indexListUid=?", 1);
        if (indexListUid == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, indexListUid);
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"UserSeriesListItem"}, false, new Callable<UserSeriesListItem>() { // from class: com.glority.android.database.dao.UserSeriesListItemDao_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UserSeriesListItem call() throws Exception {
                UserSeriesListItem userSeriesListItem = null;
                String string = null;
                Cursor query = DBUtil.query(UserSeriesListItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.seriesId);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.indexListUid);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "currentCount");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "totalNum");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "country");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "topSubjectSideUrls");
                    if (query.moveToFirst()) {
                        long j = query.getLong(columnIndexOrThrow);
                        String string2 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                        String string3 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                        String string4 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                        int i = query.getInt(columnIndexOrThrow5);
                        int i2 = query.getInt(columnIndexOrThrow6);
                        CountryInfo stringToCountry = UserSeriesListItemDao_Impl.this.__dataBaseConverter.stringToCountry(query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7));
                        if (!query.isNull(columnIndexOrThrow8)) {
                            string = query.getString(columnIndexOrThrow8);
                        }
                        userSeriesListItem = new UserSeriesListItem(j, string2, string3, string4, i, i2, stringToCountry, UserSeriesListItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(string));
                    }
                    return userSeriesListItem;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.glority.android.database.dao.UserSeriesListItemDao
    public UserSeriesListItem getItemByIndexListUidSync(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from UserSeriesListItem where indexListUid=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        UserSeriesListItem userSeriesListItem = null;
        String string = null;
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.seriesId);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.indexListUid);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "currentCount");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "totalNum");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "country");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "topSubjectSideUrls");
            if (query.moveToFirst()) {
                long j = query.getLong(columnIndexOrThrow);
                String string2 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                String string3 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                String string4 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                int i = query.getInt(columnIndexOrThrow5);
                int i2 = query.getInt(columnIndexOrThrow6);
                CountryInfo stringToCountry = this.__dataBaseConverter.stringToCountry(query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7));
                if (!query.isNull(columnIndexOrThrow8)) {
                    string = query.getString(columnIndexOrThrow8);
                }
                userSeriesListItem = new UserSeriesListItem(j, string2, string3, string4, i, i2, stringToCountry, this.__dataBaseConverter.stringToStringMutableList(string));
            }
            return userSeriesListItem;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.glority.android.database.dao.UserSeriesListItemDao
    public LiveData<Integer> getCount() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select COUNT(indexListUid) from UserSeriesListItem", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"UserSeriesListItem"}, false, new Callable<Integer>() { // from class: com.glority.android.database.dao.UserSeriesListItemDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                int i;
                Cursor query = DBUtil.query(UserSeriesListItemDao_Impl.this.__db, acquire, false, null);
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

    @Override // com.glority.android.database.dao.UserSeriesListItemDao
    public void deleteAll(final List<Long> seriesIds) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("DELETE FROM UserSeriesListItem where seriesId not in(");
        StringUtil.appendPlaceholders(newStringBuilder, seriesIds.size());
        newStringBuilder.append(")");
        SupportSQLiteStatement compileStatement = this.__db.compileStatement(newStringBuilder.toString());
        Iterator<Long> it = seriesIds.iterator();
        int i = 1;
        while (it.hasNext()) {
            compileStatement.bindLong(i, it.next().longValue());
            i++;
        }
        this.__db.beginTransaction();
        try {
            compileStatement.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
