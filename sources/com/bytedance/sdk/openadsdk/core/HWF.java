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
public class HWF {
    private static final Object KS = new Object();
    private Context lMd;
    private KS zp;

    /* loaded from: classes.dex */
    public class lMd extends AbstractCursor {
        private lMd() {
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
        public double getDouble(int i9) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i9) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i9) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i9) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i9) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i9) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i9) {
            return true;
        }
    }

    public HWF(Context context) {
        Context applicationContext;
        try {
            if (context == null) {
                applicationContext = KVG.zp();
            } else {
                applicationContext = context.getApplicationContext();
            }
            this.lMd = applicationContext;
            if (this.zp == null) {
                this.zp = new KS();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context KS() {
        Context context = this.lMd;
        if (context == null) {
            return KVG.zp();
        }
        return context;
    }

    /* loaded from: classes.dex */
    public class KS {
        private SQLiteDatabase lMd = null;

        public KS() {
        }

        private synchronized void COT() {
            try {
                synchronized (HWF.KS) {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.lMd;
                        if (sQLiteDatabase != null) {
                            if (!sQLiteDatabase.isOpen()) {
                            }
                        }
                        HWF hwf = HWF.this;
                        SQLiteDatabase writableDatabase = new zp(hwf.KS()).getWritableDatabase();
                        this.lMd = writableDatabase;
                        writableDatabase.setLockingEnabled(false);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.zp("DBHelper", th.getMessage());
                if (!HWF()) {
                } else {
                    throw th;
                }
            }
        }

        private synchronized boolean HWF() {
            SQLiteDatabase sQLiteDatabase = this.lMd;
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.inTransaction()) {
                    return true;
                }
            }
            return false;
        }

        public synchronized void KS() {
            COT();
            SQLiteDatabase sQLiteDatabase = this.lMd;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.setTransactionSuccessful();
        }

        public synchronized void jU() {
            COT();
            SQLiteDatabase sQLiteDatabase = this.lMd;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }

        public synchronized void lMd() {
            COT();
            SQLiteDatabase sQLiteDatabase = this.lMd;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.beginTransaction();
        }

        public SQLiteDatabase zp() {
            COT();
            return this.lMd;
        }

        public synchronized void zp(String str) throws SQLException {
            try {
                COT();
                this.lMd.execSQL(str);
            } catch (Throwable th) {
                if (HWF()) {
                    throw th;
                }
            }
        }

        public synchronized Cursor zp(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursor;
            try {
                COT();
                cursor = this.lMd.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.zp("DBHelper", th.getMessage());
                lMd lmd = new lMd();
                if (HWF()) {
                    throw th;
                }
                cursor = lmd;
            }
            return cursor;
        }

        public synchronized int zp(String str, ContentValues contentValues, String str2, String[] strArr) {
            int i9;
            try {
                COT();
                i9 = this.lMd.update(str, contentValues, str2, strArr);
            } catch (Exception e4) {
                com.bytedance.sdk.component.utils.tG.zp("DBHelper", e4.getMessage());
                if (HWF()) {
                    throw e4;
                }
                i9 = 0;
            }
            return i9;
        }

        public synchronized long zp(String str, String str2, ContentValues contentValues) {
            long j7;
            try {
                COT();
                j7 = this.lMd.replace(str, str2, contentValues);
            } catch (Exception e4) {
                com.bytedance.sdk.component.utils.tG.zp("DBHelper", e4.getMessage());
                if (HWF()) {
                    throw e4;
                }
                j7 = -1;
            }
            return j7;
        }

        public synchronized int zp(String str, String str2, String[] strArr) {
            int i9;
            try {
                COT();
                i9 = this.lMd.delete(str, str2, strArr);
            } catch (Exception e4) {
                com.bytedance.sdk.component.utils.tG.zp("DBHelper", e4.getMessage());
                if (HWF()) {
                    throw e4;
                }
                i9 = 0;
            }
            return i9;
        }
    }

    public KS zp() {
        return this.zp;
    }

    /* loaded from: classes.dex */
    public class zp extends SQLiteOpenHelper {
        final Context zp;

        public zp(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 11);
            this.zp = context;
        }

        private void KS(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> jU = jU(sQLiteDatabase);
            if (jU != null && jU.size() > 0) {
                Iterator<String> it = jU.iterator();
                while (it.hasNext()) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + it.next() + " ;");
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
        
            if (r1 != null) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
        
            r1.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
        
            if (r1 != null) goto L16;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.util.ArrayList<java.lang.String> jU(android.database.sqlite.SQLiteDatabase r4) {
            /*
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = 0
                java.lang.String r2 = "select name from sqlite_master where type='table' order by name"
                android.database.Cursor r1 = r4.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L3b
                if (r1 == 0) goto L2f
            Le:
                boolean r4 = r1.moveToNext()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L3b
                if (r4 == 0) goto L2f
                r4 = 0
                java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L3b
                java.lang.String r2 = "android_metadata"
                boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L3b
                if (r2 != 0) goto Le
                java.lang.String r2 = "sqlite_sequence"
                boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L3b
                if (r2 != 0) goto Le
                r0.add(r4)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L3b
                goto Le
            L2d:
                r4 = move-exception
                goto L35
            L2f:
                if (r1 == 0) goto L3e
            L31:
                r1.close()
                goto L3e
            L35:
                if (r1 == 0) goto L3a
                r1.close()
            L3a:
                throw r4
            L3b:
                if (r1 == 0) goto L3e
                goto L31
            L3e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.HWF.zp.jU(android.database.sqlite.SQLiteDatabase):java.util.ArrayList");
        }

        private void lMd(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.ugen.zp.KS.jU());
        }

        private void zp(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.lMd.jU.zp());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.lMd.ku.KS());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.lMd.tG.zp());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.lMd.vDp.zp());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.rV.lMd.zp());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.lMd.dQp.KS());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.zp.lMd.lMd.KS());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.ugen.zp.KS.KS());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.lMd.rV.zp());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                zp(sQLiteDatabase, this.zp);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.zp("DBHelper", th.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
            if (i9 > i10) {
                try {
                    KS(sQLiteDatabase);
                    zp(sQLiteDatabase, HWF.this.lMd);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.tG.lMd(th.getMessage());
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
            if (i9 > i10) {
                try {
                    KS(sQLiteDatabase);
                } catch (Throwable unused) {
                }
            }
            zp(sQLiteDatabase, HWF.this.lMd);
            switch (i9) {
                case 1:
                    zp(sQLiteDatabase);
                    break;
                case 2:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                    zp(sQLiteDatabase);
                    break;
                case 3:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.lMd.tG.zp());
                    zp(sQLiteDatabase);
                    break;
                case 4:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.zp.lMd.lMd.KS());
                    zp(sQLiteDatabase);
                    break;
                case 5:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.lMd.vDp.zp());
                    zp(sQLiteDatabase);
                    break;
                case 6:
                    zp(sQLiteDatabase);
                    break;
            }
            if (i9 < 11) {
                try {
                    lMd(sQLiteDatabase);
                    com.bytedance.sdk.openadsdk.rV.lMd.zp(sQLiteDatabase);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.tG.zp("DBHelper", th.getMessage());
                }
            }
        }

        private void zp(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.lMd.jU.lMd());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.lMd.ku.jU());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.lMd.tG.lMd());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.lMd.vDp.lMd());
        }
    }
}
