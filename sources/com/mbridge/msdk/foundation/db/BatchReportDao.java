package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.foundation.same.report.BatchReportMessage;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes3.dex */
public class BatchReportDao extends a<BatchReportMessage> implements NoProGuard, Serializable {
    private static volatile BatchReportDao instance;
    private final Object lock;

    public BatchReportDao(f fVar) {
        super(fVar);
        this.lock = new Object();
    }

    public static BatchReportDao getInstance(f fVar) {
        if (instance == null) {
            synchronized (BatchReportDao.class) {
                try {
                    if (instance == null) {
                        instance = new BatchReportDao(fVar);
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public void addReportMessage(String str, int i9) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!com.mbridge.msdk.e.d.a(writableDatabase)) {
            return;
        }
        try {
            synchronized (this.lock) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("report_message", str);
                contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("uuid", UUID.randomUUID().toString().replace("-", ""));
                contentValues.put("report_state", (Integer) 0);
                contentValues.put("type", Integer.valueOf(i9));
                writableDatabase.insert("batch_report", null, contentValues);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public void deleteBatchReportMessagesByTimestamp(long j7) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!com.mbridge.msdk.e.d.a(writableDatabase)) {
            return;
        }
        try {
            synchronized (this.lock) {
                writableDatabase.execSQL("delete from batch_report where time <= ?", new Object[]{Long.valueOf(j7)});
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public ArrayList<BatchReportMessage> getBatchReportMessages(long j7, int i9) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        Cursor cursor = null;
        if (!com.mbridge.msdk.e.d.a(writableDatabase)) {
            return null;
        }
        ArrayList<BatchReportMessage> arrayList = new ArrayList<>();
        synchronized (this.lock) {
            try {
                try {
                    Cursor rawQuery = writableDatabase.rawQuery("SELECT * FROM batch_report WHERE time <= ? AND report_state = 0 AND type = ? ORDER BY time ASC ", new String[]{String.valueOf(j7), String.valueOf(i9)});
                    if (rawQuery != null) {
                        while (rawQuery.moveToNext()) {
                            try {
                                arrayList.add(new BatchReportMessage(rawQuery.getString(rawQuery.getColumnIndex("uuid")), rawQuery.getString(rawQuery.getColumnIndex("report_message")), rawQuery.getLong(rawQuery.getColumnIndex("time"))));
                            } catch (Throwable th) {
                                th = th;
                                cursor = rawQuery;
                                if (cursor != null) {
                                    try {
                                        cursor.close();
                                    } catch (Exception unused) {
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                    if (rawQuery != null) {
                        try {
                            rawQuery.close();
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("report_state", (Integer) 1);
                    writableDatabase.update("batch_report", contentValues, "time <= ?", new String[]{String.valueOf(j7)});
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return arrayList;
    }

    public void updateMessagesReportState(ArrayList<BatchReportMessage> arrayList) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (arrayList != null && arrayList.size() != 0 && com.mbridge.msdk.e.d.a(writableDatabase)) {
            Iterator<BatchReportMessage> it = arrayList.iterator();
            while (it.hasNext()) {
                BatchReportMessage next = it.next();
                try {
                    synchronized (this.lock) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("report_state", (Integer) 0);
                        writableDatabase.update("batch_report", contentValues, "uuid = ?", new String[]{next.getUuid()});
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    public static BatchReportDao getInstance(Context context) {
        if (instance == null) {
            synchronized (BatchReportDao.class) {
                try {
                    if (instance == null) {
                        instance = new BatchReportDao(g.a(context));
                    }
                } finally {
                }
            }
        }
        return instance;
    }
}
