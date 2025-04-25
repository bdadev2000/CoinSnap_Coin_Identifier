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
import com.glority.android.database.entities.HomeCoinItem;
import com.glority.android.xx.constants.Args;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class HomeCoinItemDao_Impl implements HomeCoinItemDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<HomeCoinItem> __insertionAdapterOfHomeCoinItem;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

    public HomeCoinItemDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfHomeCoinItem = new EntityInsertionAdapter<HomeCoinItem>(__db) { // from class: com.glority.android.database.dao.HomeCoinItemDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `HomeCoinItem` (`uid`,`commonName`,`mainImageUrl`,`indexListUid`) VALUES (?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement stmt, HomeCoinItem value) {
                if (value.getUid() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getUid());
                }
                if (value.getCommonName() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getCommonName());
                }
                if (value.getMainImageUrl() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getMainImageUrl());
                }
                if (value.getIndexListUid() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getIndexListUid());
                }
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.HomeCoinItemDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM HomeCoinItem";
            }
        };
    }

    @Override // com.glority.android.database.dao.HomeCoinItemDao
    public void insert(final List<HomeCoinItem> homeCoinItem) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfHomeCoinItem.insert(homeCoinItem);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.glority.android.database.dao.HomeCoinItemDao
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

    @Override // com.glority.android.database.dao.HomeCoinItemDao
    public LiveData<List<HomeCoinItem>> getItems() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from HomeCoinItem", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"HomeCoinItem"}, false, new Callable<List<HomeCoinItem>>() { // from class: com.glority.android.database.dao.HomeCoinItemDao_Impl.3
            @Override // java.util.concurrent.Callable
            public List<HomeCoinItem> call() throws Exception {
                Cursor query = DBUtil.query(HomeCoinItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "commonName");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "mainImageUrl");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, Args.indexListUid);
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new HomeCoinItem(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4)));
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

    @Override // com.glority.android.database.dao.HomeCoinItemDao
    public List<HomeCoinItem> getItemsBlocking() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from HomeCoinItem", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "commonName");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "mainImageUrl");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, Args.indexListUid);
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new HomeCoinItem(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.glority.android.database.dao.HomeCoinItemDao
    public LiveData<HomeCoinItem> getItem(final long uid) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from HomeCoinItem where uid=?", 1);
        acquire.bindLong(1, uid);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"HomeCoinItem"}, false, new Callable<HomeCoinItem>() { // from class: com.glority.android.database.dao.HomeCoinItemDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public HomeCoinItem call() throws Exception {
                HomeCoinItem homeCoinItem = null;
                String string = null;
                Cursor query = DBUtil.query(HomeCoinItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "commonName");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "mainImageUrl");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, Args.indexListUid);
                    if (query.moveToFirst()) {
                        String string2 = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                        String string3 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                        String string4 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                        if (!query.isNull(columnIndexOrThrow4)) {
                            string = query.getString(columnIndexOrThrow4);
                        }
                        homeCoinItem = new HomeCoinItem(string2, string3, string4, string);
                    }
                    return homeCoinItem;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.glority.android.database.dao.HomeCoinItemDao
    public void deleteAllByUid(final List<String> uidList) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("DELETE FROM HomeCoinItem WHERE uid in (");
        StringUtil.appendPlaceholders(newStringBuilder, uidList.size());
        newStringBuilder.append(")");
        SupportSQLiteStatement compileStatement = this.__db.compileStatement(newStringBuilder.toString());
        int i = 1;
        for (String str : uidList) {
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
