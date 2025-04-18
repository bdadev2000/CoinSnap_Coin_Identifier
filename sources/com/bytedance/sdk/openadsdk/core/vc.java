package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class vc {
    private static final Object tN = new Object();
    private Context Sg;
    private tN YFl;

    /* loaded from: classes.dex */
    public class Sg extends AbstractCursor {
        private Sg() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i10) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i10) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i10) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i10) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i10) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i10) {
            return true;
        }
    }

    public vc(Context context) {
        Context applicationContext;
        try {
            if (context == null) {
                applicationContext = lG.YFl();
            } else {
                applicationContext = context.getApplicationContext();
            }
            this.Sg = applicationContext;
            if (this.YFl == null) {
                this.YFl = new tN();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context tN() {
        Context context = this.Sg;
        return context == null ? lG.YFl() : context;
    }

    /* loaded from: classes.dex */
    public class tN {
        private SQLiteDatabase Sg = null;

        public tN() {
        }

        private synchronized boolean vc() {
            SQLiteDatabase sQLiteDatabase = this.Sg;
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.inTransaction()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized void wN() {
            try {
                synchronized (vc.tN) {
                    SQLiteDatabase sQLiteDatabase = this.Sg;
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        vc vcVar = vc.this;
                        SQLiteDatabase writableDatabase = new YFl(vcVar.tN()).getWritableDatabase();
                        this.Sg = writableDatabase;
                        writableDatabase.setLockingEnabled(false);
                    }
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.YFl("DBHelper", th2.getMessage());
                if (!vc()) {
                } else {
                    throw th2;
                }
            }
        }

        public synchronized void AlY() {
            wN();
            SQLiteDatabase sQLiteDatabase = this.Sg;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }

        public synchronized void Sg() {
            wN();
            SQLiteDatabase sQLiteDatabase = this.Sg;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.beginTransaction();
        }

        public SQLiteDatabase YFl() {
            wN();
            return this.Sg;
        }

        public synchronized void tN() {
            wN();
            SQLiteDatabase sQLiteDatabase = this.Sg;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.setTransactionSuccessful();
        }

        public synchronized void YFl(String str) throws SQLException {
            try {
                wN();
                this.Sg.execSQL(str);
            } catch (Throwable th2) {
                if (vc()) {
                    throw th2;
                }
            }
        }

        public synchronized Cursor YFl(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursor;
            try {
                wN();
                cursor = this.Sg.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.YFl("DBHelper", th2.getMessage());
                Sg sg2 = new Sg();
                if (vc()) {
                    throw th2;
                }
                cursor = sg2;
            }
            return cursor;
        }

        public synchronized int YFl(String str, ContentValues contentValues, String str2, String[] strArr) {
            int i10;
            try {
                wN();
                i10 = this.Sg.update(str, contentValues, str2, strArr);
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("DBHelper", e2.getMessage());
                if (vc()) {
                    throw e2;
                }
                i10 = 0;
            }
            return i10;
        }

        public synchronized long YFl(String str, String str2, ContentValues contentValues) {
            long j3;
            try {
                wN();
                j3 = this.Sg.replace(str, str2, contentValues);
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("DBHelper", e2.getMessage());
                if (vc()) {
                    throw e2;
                }
                j3 = -1;
            }
            return j3;
        }

        public synchronized int YFl(String str, String str2, String[] strArr) {
            int i10;
            try {
                wN();
                i10 = this.Sg.delete(str, str2, strArr);
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("DBHelper", e2.getMessage());
                if (vc()) {
                    throw e2;
                }
                i10 = 0;
            }
            return i10;
        }
    }

    public tN YFl() {
        return this.YFl;
    }

    /* loaded from: classes.dex */
    public class YFl extends SQLiteOpenHelper {
        final Context YFl;

        public YFl(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 11);
            this.YFl = context;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
        
            if (r1 != null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
        
            r1.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
        
            if (r1 != null) goto L20;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.util.ArrayList<java.lang.String> AlY(android.database.sqlite.SQLiteDatabase r4) {
            /*
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = 0
                java.lang.String r2 = "select name from sqlite_master where type='table' order by name"
                android.database.Cursor r1 = r4.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
                if (r1 == 0) goto L2d
            Le:
                boolean r4 = r1.moveToNext()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
                if (r4 == 0) goto L2d
                r4 = 0
                java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
                java.lang.String r2 = "android_metadata"
                boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
                if (r2 != 0) goto Le
                java.lang.String r2 = "sqlite_sequence"
                boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
                if (r2 != 0) goto Le
                r0.add(r4)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
                goto Le
            L2d:
                if (r1 == 0) goto L3c
                goto L39
            L30:
                r4 = move-exception
                if (r1 == 0) goto L36
                r1.close()
            L36:
                throw r4
            L37:
                if (r1 == 0) goto L3c
            L39:
                r1.close()
            L3c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.vc.YFl.AlY(android.database.sqlite.SQLiteDatabase):java.util.ArrayList");
        }

        private void Sg(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.eT.YFl.tN.AlY());
        }

        private void YFl(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.AlY.AlY.YFl());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.AlY.NjR.tN());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.AlY.pDU.YFl());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.AlY.GA.YFl());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.VOe.Sg.YFl());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.AlY.rkt.tN());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.tN());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.eT.YFl.tN.tN());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.AlY.EH.YFl());
        }

        private void tN(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> AlY = AlY(sQLiteDatabase);
            if (AlY != null && AlY.size() > 0) {
                Iterator<String> it = AlY.iterator();
                while (it.hasNext()) {
                    sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                YFl(sQLiteDatabase, this.YFl);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.YFl("DBHelper", th2.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 > i11) {
                try {
                    tN(sQLiteDatabase);
                    YFl(sQLiteDatabase, vc.this.Sg);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.Sg(th2.getMessage());
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 > i11) {
                try {
                    tN(sQLiteDatabase);
                } catch (Throwable unused) {
                }
            }
            YFl(sQLiteDatabase, vc.this.Sg);
            switch (i10) {
                case 1:
                    YFl(sQLiteDatabase);
                    break;
                case 2:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                    YFl(sQLiteDatabase);
                    break;
                case 3:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.AlY.pDU.YFl());
                    YFl(sQLiteDatabase);
                    break;
                case 4:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.tN());
                    YFl(sQLiteDatabase);
                    break;
                case 5:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.AlY.GA.YFl());
                    YFl(sQLiteDatabase);
                    break;
                case 6:
                    YFl(sQLiteDatabase);
                    break;
            }
            if (i10 < 11) {
                try {
                    Sg(sQLiteDatabase);
                    com.bytedance.sdk.openadsdk.VOe.Sg.YFl(sQLiteDatabase);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("DBHelper", th2.getMessage());
                }
            }
        }

        private void YFl(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.AlY.AlY.Sg());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.AlY.NjR.AlY());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.AlY.pDU.Sg());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.AlY.GA.Sg());
        }
    }
}
