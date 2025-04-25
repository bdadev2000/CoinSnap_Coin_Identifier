package com.glority.android.database.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.glority.android.database.DataBaseConverter;
import com.glority.android.database.entities.SeriesItem;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class SeriesItemDao_Impl implements SeriesItemDao {
    private final DataBaseConverter __dataBaseConverter = new DataBaseConverter();
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<SeriesItem> __insertionAdapterOfSeriesItem;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

    public SeriesItemDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfSeriesItem = new EntityInsertionAdapter<SeriesItem>(__db) { // from class: com.glority.android.database.dao.SeriesItemDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `SeriesItem` (`indexListUid`,`title`,`imageUrl`,`totalNum`,`country`,`created`,`seriesId`,`currentCount`) VALUES (?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, SeriesItem seriesItem) {
                if (seriesItem.getIndexListUid() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, seriesItem.getIndexListUid());
                }
                if (seriesItem.getTitle() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, seriesItem.getTitle());
                }
                if (seriesItem.getImageUrl() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, seriesItem.getImageUrl());
                }
                supportSQLiteStatement.bindLong(4, seriesItem.getTotalNum());
                String countryToString = SeriesItemDao_Impl.this.__dataBaseConverter.countryToString(seriesItem.getCountry());
                if (countryToString == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, countryToString);
                }
                supportSQLiteStatement.bindLong(6, seriesItem.getCreated() ? 1L : 0L);
                if (seriesItem.getSeriesId() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindLong(7, seriesItem.getSeriesId().longValue());
                }
                if (seriesItem.getCurrentCount() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindLong(8, seriesItem.getCurrentCount().intValue());
                }
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.SeriesItemDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM SeriesItem";
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.SeriesItemDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM SeriesItem where indexListUid=?";
            }
        };
    }

    @Override // com.glority.android.database.dao.SeriesItemDao
    public void insert(final SeriesItem... seriesItem) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSeriesItem.insert(seriesItem);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.glority.android.database.dao.SeriesItemDao
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

    @Override // com.glority.android.database.dao.SeriesItemDao
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

    @Override // com.glority.android.database.dao.SeriesItemDao
    public LiveData<List<SeriesItem>> getAll() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from SeriesItem", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"SeriesItem"}, false, new Callable<List<SeriesItem>>() { // from class: com.glority.android.database.dao.SeriesItemDao_Impl.4
            @Override // java.util.concurrent.Callable
            public List<SeriesItem> call() throws Exception {
                Cursor query = DBUtil.query(SeriesItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.indexListUid);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "totalNum");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "country");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, LogEvents.customseries_sortbycreate);
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, Args.seriesId);
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "currentCount");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        SeriesItem seriesItem = new SeriesItem(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), SeriesItemDao_Impl.this.__dataBaseConverter.stringToCountry(query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5)));
                        seriesItem.setCreated(query.getInt(columnIndexOrThrow6) != 0);
                        seriesItem.setSeriesId(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                        seriesItem.setCurrentCount(query.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow8)));
                        arrayList.add(seriesItem);
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

    @Override // com.glority.android.database.dao.SeriesItemDao
    public Flow<List<SeriesItem>> getAllFlowCountThen0() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from SeriesItem where SeriesItem.currentCount > 0 order by SeriesItem.created asc", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"SeriesItem"}, new Callable<List<SeriesItem>>() { // from class: com.glority.android.database.dao.SeriesItemDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<SeriesItem> call() throws Exception {
                Cursor query = DBUtil.query(SeriesItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.indexListUid);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "totalNum");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "country");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, LogEvents.customseries_sortbycreate);
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, Args.seriesId);
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "currentCount");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        SeriesItem seriesItem = new SeriesItem(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), SeriesItemDao_Impl.this.__dataBaseConverter.stringToCountry(query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5)));
                        seriesItem.setCreated(query.getInt(columnIndexOrThrow6) != 0);
                        seriesItem.setSeriesId(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                        seriesItem.setCurrentCount(query.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow8)));
                        arrayList.add(seriesItem);
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

    @Override // com.glority.android.database.dao.SeriesItemDao
    public List<SeriesItem> getAllSync() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from SeriesItem order by SeriesItem.created asc ", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.indexListUid);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "totalNum");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "country");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, LogEvents.customseries_sortbycreate);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, Args.seriesId);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "currentCount");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                SeriesItem seriesItem = new SeriesItem(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), this.__dataBaseConverter.stringToCountry(query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5)));
                seriesItem.setCreated(query.getInt(columnIndexOrThrow6) != 0);
                seriesItem.setSeriesId(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                seriesItem.setCurrentCount(query.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow8)));
                arrayList.add(seriesItem);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.glority.android.database.dao.SeriesItemDao
    public LiveData<SeriesItem> getItem(final long indexListUid) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from SeriesItem where indexListUid=?", 1);
        acquire.bindLong(1, indexListUid);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"SeriesItem"}, false, new Callable<SeriesItem>() { // from class: com.glority.android.database.dao.SeriesItemDao_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public SeriesItem call() throws Exception {
                SeriesItem seriesItem = null;
                Integer valueOf = null;
                Cursor query = DBUtil.query(SeriesItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.indexListUid);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "totalNum");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "country");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, LogEvents.customseries_sortbycreate);
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, Args.seriesId);
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "currentCount");
                    if (query.moveToFirst()) {
                        SeriesItem seriesItem2 = new SeriesItem(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), SeriesItemDao_Impl.this.__dataBaseConverter.stringToCountry(query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5)));
                        seriesItem2.setCreated(query.getInt(columnIndexOrThrow6) != 0);
                        seriesItem2.setSeriesId(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                        if (!query.isNull(columnIndexOrThrow8)) {
                            valueOf = Integer.valueOf(query.getInt(columnIndexOrThrow8));
                        }
                        seriesItem2.setCurrentCount(valueOf);
                        seriesItem = seriesItem2;
                    }
                    return seriesItem;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.glority.android.database.dao.SeriesItemDao
    public SeriesItem getItemByIndexListUidSync(String str) {
        boolean z = true;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from SeriesItem where indexListUid=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        SeriesItem seriesItem = null;
        Integer valueOf = null;
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.indexListUid);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.title);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "totalNum");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "country");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, LogEvents.customseries_sortbycreate);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, Args.seriesId);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "currentCount");
            if (query.moveToFirst()) {
                SeriesItem seriesItem2 = new SeriesItem(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), this.__dataBaseConverter.stringToCountry(query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5)));
                if (query.getInt(columnIndexOrThrow6) == 0) {
                    z = false;
                }
                seriesItem2.setCreated(z);
                seriesItem2.setSeriesId(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                if (!query.isNull(columnIndexOrThrow8)) {
                    valueOf = Integer.valueOf(query.getInt(columnIndexOrThrow8));
                }
                seriesItem2.setCurrentCount(valueOf);
                seriesItem = seriesItem2;
            }
            return seriesItem;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.glority.android.database.dao.SeriesItemDao
    public LiveData<Integer> getCount() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select COUNT(indexListUid) from SeriesItem", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"SeriesItem"}, false, new Callable<Integer>() { // from class: com.glority.android.database.dao.SeriesItemDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                int i;
                Cursor query = DBUtil.query(SeriesItemDao_Impl.this.__db, acquire, false, null);
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

    @Override // com.glority.android.database.dao.SeriesItemDao
    public void deleteAll(final List<String> indexListUids) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("DELETE FROM SeriesItem where  indexListUid not in (");
        StringUtil.appendPlaceholders(newStringBuilder, indexListUids.size());
        newStringBuilder.append(")");
        SupportSQLiteStatement compileStatement = this.__db.compileStatement(newStringBuilder.toString());
        int i = 1;
        for (String str : indexListUids) {
            if (str == null) {
                compileStatement.bindNull(i);
            } else {
                compileStatement.bindString(i, str);
            }
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
