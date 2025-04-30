package com.bytedance.sdk.component.HWF.zp.zp.zp;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.HWF.zp.ku;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class lMd {
    private Context lMd;
    private C0075lMd zp;

    /* loaded from: classes.dex */
    public class zp extends AbstractCursor {
        private zp() {
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

    public lMd(Context context) {
        try {
            this.lMd = context.getApplicationContext();
            if (this.zp == null) {
                this.zp = new C0075lMd();
            }
        } catch (Throwable unused) {
        }
    }

    public C0075lMd zp() {
        return this.zp;
    }

    /* renamed from: com.bytedance.sdk.component.HWF.zp.zp.zp.lMd$lMd, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0075lMd {
        private volatile SQLiteDatabase lMd = null;

        public C0075lMd() {
        }

        private boolean lMd() {
            SQLiteDatabase sQLiteDatabase = this.lMd;
            if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                return true;
            }
            return false;
        }

        private void zp() {
            try {
                if (this.lMd != null && this.lMd.isOpen()) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.lMd != null) {
                            if (!this.lMd.isOpen()) {
                            }
                        }
                        this.lMd = ku.QR().jU().zp(ku.QR().HWF());
                        this.lMd.setLockingEnabled(false);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                if (lMd()) {
                    throw th;
                }
            }
        }

        public void zp(String str) throws SQLException {
            try {
                zp();
                this.lMd.execSQL(str);
            } catch (Throwable th) {
                if (lMd()) {
                    throw th;
                }
            }
        }

        public Cursor zp(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                zp();
                return this.lMd.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                zp zpVar = new zp();
                if (lMd()) {
                    throw th;
                }
                return zpVar;
            }
        }

        public int zp(String str, ContentValues contentValues, String str2, String[] strArr) {
            try {
                zp();
                return this.lMd.update(str, contentValues, str2, strArr);
            } catch (Exception e4) {
                if (lMd()) {
                    throw e4;
                }
                return 0;
            }
        }

        public long zp(String str, String str2, ContentValues contentValues) {
            try {
                zp();
                return this.lMd.insert(str, str2, contentValues);
            } catch (Exception e4) {
                if (lMd()) {
                    throw e4;
                }
                return -1L;
            }
        }

        public synchronized void zp(String str, String str2, List<com.bytedance.sdk.component.HWF.zp.jU.zp> list) {
            JSONObject QR;
            try {
                try {
                    zp();
                    this.lMd.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i9 = 0; i9 < list.size(); i9++) {
                        com.bytedance.sdk.component.HWF.zp.jU.zp zpVar = list.get(i9);
                        if (zpVar != null && (QR = zpVar.QR()) != null) {
                            contentValues.put("id", zpVar.KS());
                            String lMd = ku.QR().KVG().lMd(QR.toString());
                            if (!TextUtils.isEmpty(lMd)) {
                                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, lMd);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.HWF.zp.KS.zp.jU()) {
                                    if (zpVar.dT() > 0) {
                                        if (zpVar.jU() != 0) {
                                            if (zpVar.jU() == 3) {
                                            }
                                        }
                                        contentValues.put("channel", Integer.valueOf(zpVar.dT()));
                                    }
                                }
                                this.lMd.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.lMd.setTransactionSuccessful();
                    list.size();
                    if (this.lMd != null) {
                        this.lMd.endTransaction();
                    }
                } catch (Exception e4) {
                    list.size();
                    if (!lMd()) {
                        if (this.lMd != null) {
                            this.lMd.endTransaction();
                        }
                    } else {
                        throw e4;
                    }
                }
            } catch (Throwable th) {
                if (this.lMd != null) {
                    this.lMd.endTransaction();
                }
                throw th;
            }
        }

        public int zp(String str, String str2, String[] strArr) {
            try {
                zp();
                return this.lMd.delete(str, str2, strArr);
            } catch (Exception e4) {
                if (lMd()) {
                    throw e4;
                }
                return 0;
            }
        }
    }
}
