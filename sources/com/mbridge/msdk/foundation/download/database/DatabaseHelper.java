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

/* loaded from: classes3.dex */
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
                if (!Objects.isNull(DatabaseHelper.this.database)) {
                    try {
                        try {
                            if (DatabaseHelper.this.database.isOpen()) {
                                try {
                                    DatabaseHelper.this.database.beginTransaction();
                                    DatabaseHelper.this.database.delete(DatabaseHelper.this.tableName, null, null);
                                    DatabaseHelper.this.database.setTransactionSuccessful();
                                    if (DatabaseHelper.this.database.inTransaction()) {
                                        DatabaseHelper.this.database.endTransaction();
                                    }
                                } catch (Exception e4) {
                                    if (MBridgeConstans.DEBUG) {
                                        e4.printStackTrace();
                                    }
                                    if (DatabaseHelper.this.database.inTransaction()) {
                                        DatabaseHelper.this.database.endTransaction();
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            ad.b(IDatabaseHelper.TAG, th.getMessage());
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
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void find(final String str, final String str2, final IDatabaseHelper.IDatabaseListener iDatabaseListener) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.1
            /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r5 = this;
                    java.lang.String r0 = " WHERE download_id = ? AND director_path = ?"
                    java.lang.String r1 = "SELECT * FROM "
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)
                    boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r2)
                    if (r2 == 0) goto L1d
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper r3 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$100(r2)
                    android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$002(r2, r3)
                L1d:
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)
                    boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r2)
                    r3 = 0
                    if (r2 != 0) goto La1
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)
                    boolean r2 = r2.isOpen()
                    if (r2 != 0) goto L38
                    goto La1
                L38:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                    r2.<init>(r1)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                    java.lang.String r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$200(r1)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                    r2.append(r1)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                    r2.append(r0)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                    java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                    java.lang.String r2 = r3     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                    java.lang.String r4 = r4     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                    java.lang.String[] r2 = new java.lang.String[]{r2, r4}     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                    android.database.Cursor r0 = r1.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                    if (r0 == 0) goto L70
                    boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
                    if (r1 == 0) goto L70
                    com.mbridge.msdk.foundation.download.database.DownloadModel r3 = com.mbridge.msdk.foundation.download.database.DownloadModel.create(r0)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
                    goto L70
                L6c:
                    r1 = move-exception
                    goto L94
                L6e:
                    r1 = move-exception
                    goto L82
                L70:
                    if (r0 == 0) goto L75
                    r0.close()
                L75:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto L93
                L79:
                    r0.onDatabase(r3)
                    goto L93
                L7d:
                    r1 = move-exception
                    r0 = r3
                    goto L94
                L80:
                    r1 = move-exception
                    r0 = r3
                L82:
                    boolean r2 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L6c
                    if (r2 == 0) goto L89
                    r1.printStackTrace()     // Catch: java.lang.Throwable -> L6c
                L89:
                    if (r0 == 0) goto L8e
                    r0.close()
                L8e:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto L93
                    goto L79
                L93:
                    return
                L94:
                    if (r0 == 0) goto L99
                    r0.close()
                L99:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto La0
                    r0.onDatabase(r3)
                La0:
                    throw r1
                La1:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
                    if (r0 == 0) goto Lae
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    r0.onDatabase(r3)
                Lae:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.database.DatabaseHelper.AnonymousClass1.run():void");
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
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    e4.printStackTrace();
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
            /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r4 = this;
                    java.lang.String r0 = " WHERE download_url = ?"
                    java.lang.String r1 = "SELECT * FROM "
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)
                    boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r2)
                    if (r2 == 0) goto L1d
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper r3 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$100(r2)
                    android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$002(r2, r3)
                L1d:
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)
                    boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r2)
                    r3 = 0
                    if (r2 != 0) goto L9f
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)
                    boolean r2 = r2.isOpen()
                    if (r2 != 0) goto L38
                    goto L9f
                L38:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    r2.<init>(r1)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    java.lang.String r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$200(r1)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    r2.append(r1)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    r2.append(r0)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    java.lang.String r2 = r3     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    android.database.Cursor r0 = r1.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
                    if (r0 == 0) goto L6e
                    boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
                    if (r1 == 0) goto L6e
                    com.mbridge.msdk.foundation.download.database.DownloadModel r3 = com.mbridge.msdk.foundation.download.database.DownloadModel.create(r0)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
                    goto L6e
                L6a:
                    r1 = move-exception
                    goto L92
                L6c:
                    r1 = move-exception
                    goto L80
                L6e:
                    if (r0 == 0) goto L73
                    r0.close()
                L73:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto L91
                L77:
                    r0.onDatabase(r3)
                    goto L91
                L7b:
                    r1 = move-exception
                    r0 = r3
                    goto L92
                L7e:
                    r1 = move-exception
                    r0 = r3
                L80:
                    boolean r2 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L6a
                    if (r2 == 0) goto L87
                    r1.printStackTrace()     // Catch: java.lang.Throwable -> L6a
                L87:
                    if (r0 == 0) goto L8c
                    r0.close()
                L8c:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto L91
                    goto L77
                L91:
                    return
                L92:
                    if (r0 == 0) goto L97
                    r0.close()
                L97:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto L9e
                    r0.onDatabase(r3)
                L9e:
                    throw r1
                L9f:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
                    if (r0 == 0) goto Lac
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    r0.onDatabase(r3)
                Lac:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.database.DatabaseHelper.AnonymousClass2.run():void");
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r3.moveToFirst() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        r2.add(com.mbridge.msdk.foundation.download.database.DownloadModel.create(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (r3.moveToNext() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r3 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if (r3 != null) goto L22;
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
            android.database.sqlite.SQLiteDatabase r4 = r6.database     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            boolean r4 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r4)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            if (r4 == 0) goto L1f
            com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper r4 = r6.databaseOpenHelper     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            android.database.sqlite.SQLiteDatabase r4 = r4.getWritableDatabase()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r6.database = r4     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            goto L1f
        L1b:
            r7 = move-exception
            goto L7b
        L1d:
            r7 = move-exception
            goto L70
        L1f:
            android.database.sqlite.SQLiteDatabase r4 = r6.database     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            boolean r4 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r4)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            if (r4 != 0) goto L6f
            android.database.sqlite.SQLiteDatabase r4 = r6.database     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            boolean r4 = r4.isOpen()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            if (r4 != 0) goto L30
            goto L6f
        L30:
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            long r4 = r4 - r7
            android.database.sqlite.SQLiteDatabase r7 = r6.database     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            java.lang.String r1 = r6.tableName     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r8.append(r1)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r8.append(r0)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            android.database.Cursor r3 = r7.rawQuery(r8, r0)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            if (r3 == 0) goto L69
            boolean r7 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            if (r7 == 0) goto L69
        L5c:
            com.mbridge.msdk.foundation.download.database.DownloadModel r7 = com.mbridge.msdk.foundation.download.database.DownloadModel.create(r3)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r2.add(r7)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            boolean r7 = r3.moveToNext()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            if (r7 != 0) goto L5c
        L69:
            if (r3 == 0) goto L7a
        L6b:
            r3.close()
            goto L7a
        L6f:
            return r2
        L70:
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L1b
            if (r8 == 0) goto L77
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L1b
        L77:
            if (r3 == 0) goto L7a
            goto L6b
        L7a:
            return r2
        L7b:
            if (r3 == 0) goto L80
            r3.close()
        L80:
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
                if (!Objects.isNull(DatabaseHelper.this.database) && DatabaseHelper.this.database.isOpen()) {
                    try {
                        try {
                            try {
                                DatabaseHelper.this.database.beginTransaction();
                                DatabaseHelper.this.database.insert(DatabaseHelper.this.tableName, null, DownloadModel.create(downloadModel));
                                DatabaseHelper.this.database.setTransactionSuccessful();
                                if (DatabaseHelper.this.database.inTransaction()) {
                                    DatabaseHelper.this.database.endTransaction();
                                }
                            } catch (Throwable th) {
                                try {
                                    if (DatabaseHelper.this.database.inTransaction()) {
                                        DatabaseHelper.this.database.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    ad.b(IDatabaseHelper.TAG, th2.getMessage());
                                }
                                throw th;
                            }
                        } catch (Exception e4) {
                            if (MBridgeConstans.DEBUG) {
                                e4.printStackTrace();
                            }
                            if (DatabaseHelper.this.database.inTransaction()) {
                                DatabaseHelper.this.database.endTransaction();
                            }
                        }
                    } catch (Throwable th3) {
                        ad.b(IDatabaseHelper.TAG, th3.getMessage());
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
                    } catch (Throwable th) {
                        if (MBridgeConstans.DEBUG) {
                            th.printStackTrace();
                        }
                    }
                    return rawQuery;
                }
                return null;
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    e4.printStackTrace();
                }
                try {
                    if (this.database.inTransaction()) {
                        this.database.endTransaction();
                    }
                } catch (Throwable th2) {
                    if (MBridgeConstans.DEBUG) {
                        th2.printStackTrace();
                    }
                }
                return null;
            }
        } finally {
            try {
                if (this.database.inTransaction()) {
                    this.database.endTransaction();
                }
            } catch (Throwable th3) {
                if (MBridgeConstans.DEBUG) {
                    th3.printStackTrace();
                }
            }
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
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            e4.printStackTrace();
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
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            e4.printStackTrace();
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
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            e4.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void updateUnzipResource(final String str, String str2, long j7) {
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
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            e4.printStackTrace();
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
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            e4.printStackTrace();
                        }
                    }
                }
            }
        });
    }
}
