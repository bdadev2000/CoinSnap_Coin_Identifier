package com.bytedance.sdk.component.vc.YFl.YFl.YFl;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.vc.YFl.qsH;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class Sg {
    private Context Sg;
    private C0094Sg YFl;

    /* loaded from: classes.dex */
    public class YFl extends AbstractCursor {
        private YFl() {
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

    public Sg(Context context) {
        try {
            this.Sg = context.getApplicationContext();
            if (this.YFl == null) {
                this.YFl = new C0094Sg();
            }
        } catch (Throwable unused) {
        }
    }

    public C0094Sg YFl() {
        return this.YFl;
    }

    /* renamed from: com.bytedance.sdk.component.vc.YFl.YFl.YFl.Sg$Sg, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0094Sg {
        private volatile SQLiteDatabase Sg = null;

        public C0094Sg() {
        }

        private boolean Sg() {
            SQLiteDatabase sQLiteDatabase = this.Sg;
            if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                return true;
            }
            return false;
        }

        private void YFl() {
            try {
                if (this.Sg != null && this.Sg.isOpen()) {
                    return;
                }
                synchronized (this) {
                    if (this.Sg == null || !this.Sg.isOpen()) {
                        this.Sg = qsH.DSW().AlY().YFl(qsH.DSW().vc());
                        this.Sg.setLockingEnabled(false);
                    }
                }
            } catch (Throwable th2) {
                if (Sg()) {
                    throw th2;
                }
            }
        }

        public void YFl(String str) throws SQLException {
            try {
                YFl();
                this.Sg.execSQL(str);
            } catch (Throwable th2) {
                if (Sg()) {
                    throw th2;
                }
            }
        }

        public Cursor YFl(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                YFl();
                return this.Sg.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th2) {
                YFl yFl = new YFl();
                if (Sg()) {
                    throw th2;
                }
                return yFl;
            }
        }

        public int YFl(String str, ContentValues contentValues, String str2, String[] strArr) {
            try {
                YFl();
                return this.Sg.update(str, contentValues, str2, strArr);
            } catch (Exception e2) {
                if (Sg()) {
                    throw e2;
                }
                return 0;
            }
        }

        public long YFl(String str, String str2, ContentValues contentValues) {
            try {
                YFl();
                return this.Sg.insert(str, str2, contentValues);
            } catch (Exception e2) {
                if (Sg()) {
                    throw e2;
                }
                return -1L;
            }
        }

        public synchronized void YFl(String str, String str2, List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list) {
            JSONObject DSW;
            try {
                try {
                    YFl();
                    this.Sg.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl = list.get(i10);
                        if (yFl != null && (DSW = yFl.DSW()) != null) {
                            contentValues.put("id", yFl.tN());
                            String Sg = qsH.DSW().rkt().Sg(DSW.toString());
                            if (!TextUtils.isEmpty(Sg)) {
                                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Sg);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.vc.YFl.tN.YFl.AlY() && yFl.nc() > 0 && (yFl.AlY() == 0 || yFl.AlY() == 3)) {
                                    contentValues.put("channel", Integer.valueOf(yFl.nc()));
                                }
                                this.Sg.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.Sg.setTransactionSuccessful();
                    list.size();
                } finally {
                    if (this.Sg != null) {
                        this.Sg.endTransaction();
                    }
                }
            } catch (Exception e2) {
                list.size();
                if (!Sg()) {
                    if (this.Sg != null) {
                        this.Sg.endTransaction();
                    }
                } else {
                    throw e2;
                }
            }
        }

        public int YFl(String str, String str2, String[] strArr) {
            try {
                YFl();
                return this.Sg.delete(str, str2, strArr);
            } catch (Exception e2) {
                if (Sg()) {
                    throw e2;
                }
                return 0;
            }
        }
    }
}
