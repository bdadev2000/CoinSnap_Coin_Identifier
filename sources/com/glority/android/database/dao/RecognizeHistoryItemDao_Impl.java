package com.glority.android.database.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.glority.android.database.DataBaseConverter;
import com.glority.android.database.entities.RecognizeHistoryItem;
import com.glority.android.xx.constants.Args;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class RecognizeHistoryItemDao_Impl implements RecognizeHistoryItemDao {
    private final DataBaseConverter __dataBaseConverter = new DataBaseConverter();
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<RecognizeHistoryItem> __insertionAdapterOfRecognizeHistoryItem;

    public RecognizeHistoryItemDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfRecognizeHistoryItem = new EntityInsertionAdapter<RecognizeHistoryItem>(__db) { // from class: com.glority.android.database.dao.RecognizeHistoryItemDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `RecognizeHistoryItem` (`itemId`,`uid`,`date`,`year`) VALUES (?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement stmt, RecognizeHistoryItem value) {
                stmt.bindLong(1, value.getItemId());
                if (value.getUid() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getUid());
                }
                Long dateToLong = RecognizeHistoryItemDao_Impl.this.__dataBaseConverter.dateToLong(value.getDate());
                if (dateToLong == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindLong(3, dateToLong.longValue());
                }
                if (value.getYear() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getYear());
                }
            }
        };
    }

    @Override // com.glority.android.database.dao.RecognizeHistoryItemDao
    public void insert(final RecognizeHistoryItem... historyItem) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRecognizeHistoryItem.insert(historyItem);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.glority.android.database.dao.RecognizeHistoryItemDao
    public LiveData<List<RecognizeHistoryItem>> getAllByUid(final String uid) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from RecognizeHistoryItem where uid=? order by date desc ", 1);
        if (uid == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, uid);
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"RecognizeHistoryItem"}, false, new Callable<List<RecognizeHistoryItem>>() { // from class: com.glority.android.database.dao.RecognizeHistoryItemDao_Impl.2
            @Override // java.util.concurrent.Callable
            public List<RecognizeHistoryItem> call() throws Exception {
                Cursor query = DBUtil.query(RecognizeHistoryItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "itemId");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, Args.year);
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        long j = query.getLong(columnIndexOrThrow);
                        String string = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                        Date longToDate = RecognizeHistoryItemDao_Impl.this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3)));
                        if (longToDate == null) {
                            throw new IllegalStateException("Expected non-null java.util.Date, but it was null.");
                        }
                        arrayList.add(new RecognizeHistoryItem(j, string, longToDate, query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4)));
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

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
