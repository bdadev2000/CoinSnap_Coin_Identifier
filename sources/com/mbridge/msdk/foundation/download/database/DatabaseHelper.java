package com.mbridge.msdk.foundation.download.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.GlobalComponent;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class DatabaseHelper implements IDatabaseHelper {
    private volatile SQLiteDatabase database;
    private final IDatabaseOpenHelper databaseOpenHelper;
    private final Handler handler;
    private final String tableName = GlobalComponent.getInstance().getDatabaseTableName();

    public DatabaseHelper(Context context, Handler handler, IDatabaseOpenHelper iDatabaseOpenHelper) {
        this.handler = handler;
        this.databaseOpenHelper = iDatabaseOpenHelper;
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void clear() {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.9
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database) && DatabaseHelper.this.database.isOpen()) {
                    try {
                        try {
                            try {
                                DatabaseHelper.this.database.beginTransaction();
                                DatabaseHelper.this.database.delete(DatabaseHelper.this.tableName, null, null);
                                DatabaseHelper.this.database.setTransactionSuccessful();
                                if (DatabaseHelper.this.database.inTransaction()) {
                                    DatabaseHelper.this.database.endTransaction();
                                }
                            } catch (Throwable th2) {
                                try {
                                    if (DatabaseHelper.this.database.inTransaction()) {
                                        DatabaseHelper.this.database.endTransaction();
                                    }
                                } catch (Throwable th3) {
                                    ad.b(IDatabaseHelper.TAG, th3.getMessage());
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            ad.b(IDatabaseHelper.TAG, th4.getMessage());
                        }
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            e2.printStackTrace();
                        }
                        if (DatabaseHelper.this.database.inTransaction()) {
                            DatabaseHelper.this.database.endTransaction();
                        }
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void find(final String str, final String str2, final IDatabaseHelper.IDatabaseListener iDatabaseListener) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
            /* JADX WARN: Type inference failed for: r0v6 */
            @Override // java.lang.Runnable
            public void run() {
                Cursor cursor;
                IDatabaseHelper.IDatabaseListener iDatabaseListener2;
                ?? r02 = " WHERE download_id = ? AND director_path = ?";
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                DownloadModel downloadModel = null;
                if (!Objects.isNull(DatabaseHelper.this.database)) {
                    try {
                        if (DatabaseHelper.this.database.isOpen()) {
                            try {
                                cursor = DatabaseHelper.this.database.rawQuery("SELECT * FROM " + DatabaseHelper.this.tableName + " WHERE download_id = ? AND director_path = ?", new String[]{str, str2});
                                if (cursor != null) {
                                    try {
                                        if (cursor.moveToFirst()) {
                                            downloadModel = DownloadModel.create(cursor);
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        if (MBridgeConstans.DEBUG) {
                                            e.printStackTrace();
                                        }
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        iDatabaseListener2 = iDatabaseListener;
                                        if (iDatabaseListener2 == null) {
                                            return;
                                        }
                                        iDatabaseListener2.onDatabase(downloadModel);
                                        return;
                                    }
                                }
                                if (cursor != null) {
                                    cursor.close();
                                }
                                iDatabaseListener2 = iDatabaseListener;
                                if (iDatabaseListener2 == null) {
                                    return;
                                }
                            } catch (Exception e10) {
                                e = e10;
                                cursor = null;
                            } catch (Throwable th2) {
                                th = th2;
                                r02 = 0;
                                if (r02 != 0) {
                                    r02.close();
                                }
                                IDatabaseHelper.IDatabaseListener iDatabaseListener3 = iDatabaseListener;
                                if (iDatabaseListener3 != null) {
                                    iDatabaseListener3.onDatabase(null);
                                }
                                throw th;
                            }
                            iDatabaseListener2.onDatabase(downloadModel);
                            return;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                if (Objects.isNotNull(iDatabaseListener)) {
                    iDatabaseListener.onDatabase(null);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public List<DownloadModel> findAll() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                if (Objects.isNull(this.database)) {
                    this.database = this.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(this.database) && this.database.isOpen()) {
                    cursor = rawQuery("SELECT * FROM " + this.tableName, null);
                    if (cursor != null) {
                        while (cursor.moveToNext()) {
                            arrayList.add(DownloadModel.create(cursor));
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                }
                return arrayList;
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
                return arrayList;
            }
        } catch (Throwable unused) {
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void findByDownloadUrl(final String str, final IDatabaseHelper.IDatabaseListener iDatabaseListener) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
            /* JADX WARN: Type inference failed for: r0v6 */
            @Override // java.lang.Runnable
            public void run() {
                Cursor cursor;
                IDatabaseHelper.IDatabaseListener iDatabaseListener2;
                ?? r02 = " WHERE download_url = ?";
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                DownloadModel downloadModel = null;
                if (!Objects.isNull(DatabaseHelper.this.database)) {
                    try {
                        if (DatabaseHelper.this.database.isOpen()) {
                            try {
                                cursor = DatabaseHelper.this.database.rawQuery("SELECT * FROM " + DatabaseHelper.this.tableName + " WHERE download_url = ?", new String[]{str});
                                if (cursor != null) {
                                    try {
                                        if (cursor.moveToFirst()) {
                                            downloadModel = DownloadModel.create(cursor);
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        if (MBridgeConstans.DEBUG) {
                                            e.printStackTrace();
                                        }
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        iDatabaseListener2 = iDatabaseListener;
                                        if (iDatabaseListener2 == null) {
                                            return;
                                        }
                                        iDatabaseListener2.onDatabase(downloadModel);
                                        return;
                                    }
                                }
                                if (cursor != null) {
                                    cursor.close();
                                }
                                iDatabaseListener2 = iDatabaseListener;
                                if (iDatabaseListener2 == null) {
                                    return;
                                }
                            } catch (Exception e10) {
                                e = e10;
                                cursor = null;
                            } catch (Throwable th2) {
                                th = th2;
                                r02 = 0;
                                if (r02 != 0) {
                                    r02.close();
                                }
                                IDatabaseHelper.IDatabaseListener iDatabaseListener3 = iDatabaseListener;
                                if (iDatabaseListener3 != null) {
                                    iDatabaseListener3.onDatabase(null);
                                }
                                throw th;
                            }
                            iDatabaseListener2.onDatabase(downloadModel);
                            return;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                if (Objects.isNotNull(iDatabaseListener)) {
                    iDatabaseListener.onDatabase(null);
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r3.moveToFirst() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r2.add(com.mbridge.msdk.foundation.download.database.DownloadModel.create(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (r3.moveToNext() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r3 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (r3 != null) goto L27;
     */
    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.mbridge.msdk.foundation.download.database.DownloadModel> getUnwantedModels(long r7) {
        /*
            r6 = this;
            java.lang.String r0 = " WHERE last_modified_time <= ?"
            java.lang.String r1 = "SELECT * FROM "
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r6.database     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            boolean r4 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r4)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            if (r4 == 0) goto L1a
            com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper r4 = r6.databaseOpenHelper     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            android.database.sqlite.SQLiteDatabase r4 = r4.getWritableDatabase()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            r6.database = r4     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
        L1a:
            android.database.sqlite.SQLiteDatabase r4 = r6.database     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            boolean r4 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r4)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            if (r4 != 0) goto L69
            android.database.sqlite.SQLiteDatabase r4 = r6.database     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            boolean r4 = r4.isOpen()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            if (r4 != 0) goto L2b
            goto L69
        L2b:
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            long r4 = r4 - r7
            android.database.sqlite.SQLiteDatabase r7 = r6.database     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            java.lang.String r1 = r6.tableName     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            r8.append(r1)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            r8.append(r0)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            r4 = 0
            r0[r4] = r1     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            android.database.Cursor r3 = r7.rawQuery(r8, r0)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            if (r3 == 0) goto L66
            boolean r7 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            if (r7 == 0) goto L66
        L59:
            com.mbridge.msdk.foundation.download.database.DownloadModel r7 = com.mbridge.msdk.foundation.download.database.DownloadModel.create(r3)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            r2.add(r7)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            boolean r7 = r3.moveToNext()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            if (r7 != 0) goto L59
        L66:
            if (r3 == 0) goto L79
            goto L76
        L69:
            return r2
        L6a:
            r7 = move-exception
            goto L7a
        L6c:
            r7 = move-exception
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L6a
            if (r8 == 0) goto L74
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L6a
        L74:
            if (r3 == 0) goto L79
        L76:
            r3.close()
        L79:
            return r2
        L7a:
            if (r3 == 0) goto L7f
            r3.close()
        L7f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.database.DatabaseHelper.getUnwantedModels(long):java.util.List");
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void insert(final DownloadModel downloadModel) {
        this.handler.postAtFrontOfQueue(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.3
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database)) {
                    try {
                        try {
                            if (DatabaseHelper.this.database.isOpen()) {
                                try {
                                    DatabaseHelper.this.database.beginTransaction();
                                    DatabaseHelper.this.database.insert(DatabaseHelper.this.tableName, null, DownloadModel.create(downloadModel));
                                    DatabaseHelper.this.database.setTransactionSuccessful();
                                    if (DatabaseHelper.this.database.inTransaction()) {
                                        DatabaseHelper.this.database.endTransaction();
                                    }
                                } catch (Exception e2) {
                                    if (MBridgeConstans.DEBUG) {
                                        e2.printStackTrace();
                                    }
                                    if (DatabaseHelper.this.database.inTransaction()) {
                                        DatabaseHelper.this.database.endTransaction();
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                if (DatabaseHelper.this.database.inTransaction()) {
                                    DatabaseHelper.this.database.endTransaction();
                                }
                            } catch (Throwable th3) {
                                ad.b(IDatabaseHelper.TAG, th3.getMessage());
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        ad.b(IDatabaseHelper.TAG, th4.getMessage());
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public Cursor rawQuery(String str, String[] strArr) {
        try {
            try {
                if (Objects.isNull(this.database)) {
                    this.database = this.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(this.database) && this.database.isOpen()) {
                    this.database.beginTransaction();
                    Cursor rawQuery = this.database.rawQuery(str, strArr);
                    this.database.setTransactionSuccessful();
                    try {
                        if (this.database.inTransaction()) {
                            this.database.endTransaction();
                        }
                    } catch (Throwable th2) {
                        if (MBridgeConstans.DEBUG) {
                            th2.printStackTrace();
                        }
                    }
                    return rawQuery;
                }
                try {
                    if (this.database.inTransaction()) {
                        this.database.endTransaction();
                    }
                } catch (Throwable th3) {
                    if (MBridgeConstans.DEBUG) {
                        th3.printStackTrace();
                    }
                }
                return null;
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
                try {
                    if (this.database.inTransaction()) {
                        this.database.endTransaction();
                    }
                } catch (Throwable th4) {
                    if (MBridgeConstans.DEBUG) {
                        th4.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Throwable th5) {
            try {
                if (this.database.inTransaction()) {
                    this.database.endTransaction();
                }
            } catch (Throwable th6) {
                if (MBridgeConstans.DEBUG) {
                    th6.printStackTrace();
                }
            }
            throw th5;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void remove(final String str, final String str2) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.6
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database) && DatabaseHelper.this.database.isOpen()) {
                    try {
                        DatabaseHelper.this.database.execSQL("DELETE FROM " + DatabaseHelper.this.tableName + " WHERE download_id = ? AND director_path = ?", new Object[]{str, str2});
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void update(final DownloadModel downloadModel, final String str) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.4
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database) && DatabaseHelper.this.database.isOpen()) {
                    try {
                        DatabaseHelper.this.database.update(DatabaseHelper.this.tableName, DownloadModel.create(downloadModel), "download_id = ? AND director_path = ?", new String[]{downloadModel.getDownloadId(), str});
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void updateProgress(final String str, final String str2, final DownloadModel downloadModel) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.5
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database) && DatabaseHelper.this.database.isOpen()) {
                    try {
                        DatabaseHelper.this.database.update(DatabaseHelper.this.tableName, DownloadModel.create(downloadModel), "download_id = ? AND director_path = ?", new String[]{str, str2});
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void updateUnzipResource(final String str, String str2, long j3) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.8
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database) && DatabaseHelper.this.database.isOpen()) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(DownloadModel.DOWNLOAD_ID, str);
                        DatabaseHelper.this.database.update(DatabaseHelper.this.tableName, contentValues, "download_id = ?", new String[]{str});
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void remove(final String str) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.7
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database) && DatabaseHelper.this.database.isOpen()) {
                    try {
                        DatabaseHelper.this.database.execSQL("DELETE FROM " + DatabaseHelper.this.tableName + " WHERE download_id = ?", new Object[]{str});
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        });
    }
}
