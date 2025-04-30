package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class KS implements Cursor {
    int KS = 0;
    String[] lMd;
    Map<String, List<String>> zp;

    public KS(Map<String, List<String>> map) {
        if (map != null && map.keySet() != null) {
            this.zp = map;
            try {
                this.lMd = (String[]) map.keySet().toArray(new String[map.keySet().size()]);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        this.zp = new HashMap();
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i9, CharArrayBuffer charArrayBuffer) {
    }

    @Override // android.database.Cursor
    public void deactivate() {
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i9) {
        return new byte[0];
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        String[] strArr = this.lMd;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String str) {
        String[] strArr = this.lMd;
        if (strArr != null && strArr.length != 0) {
            int i9 = 0;
            while (true) {
                String[] strArr2 = this.lMd;
                if (i9 >= strArr2.length) {
                    return 0;
                }
                if (str.equals(strArr2[i9])) {
                    return i9;
                }
                i9++;
            }
        } else {
            return -1;
        }
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
        return 0;
    }

    @Override // android.database.Cursor
    public String getColumnName(int i9) {
        if (i9 >= 0) {
            String[] strArr = this.lMd;
            if (i9 < strArr.length) {
                return strArr[i9];
            }
            return "";
        }
        return "";
    }

    @Override // android.database.Cursor
    public String[] getColumnNames() {
        return this.lMd;
    }

    @Override // android.database.Cursor
    public int getCount() {
        try {
            String[] strArr = this.lMd;
            if (strArr != null && strArr.length != 0) {
                return this.zp.get(strArr[0]).size();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public double getDouble(int i9) {
        try {
            return Double.parseDouble(getString(i9));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    @Override // android.database.Cursor
    public Bundle getExtras() {
        return null;
    }

    @Override // android.database.Cursor
    public float getFloat(int i9) {
        try {
            return Float.parseFloat(getString(i9));
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // android.database.Cursor
    public int getInt(int i9) {
        try {
            return Integer.parseInt(getString(i9));
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public long getLong(int i9) {
        try {
            return Long.parseLong(getString(i9));
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.KS;
    }

    @Override // android.database.Cursor
    public short getShort(int i9) {
        try {
            return Short.parseShort(getString(i9));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    @Override // android.database.Cursor
    public String getString(int i9) {
        if (i9 >= 0 && i9 < getColumnCount()) {
            return this.zp.get(this.lMd[i9]).get(getPosition());
        }
        return "";
    }

    @Override // android.database.Cursor
    public int getType(int i9) {
        return 0;
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        if (this.KS == 0) {
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        if (this.KS == getCount() - 1) {
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public boolean isNull(int i9) {
        if (getString(i9) == null) {
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public boolean move(int i9) {
        if (this.KS + i9 >= getCount()) {
            return false;
        }
        this.KS += i9;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        if (getCount() <= 0) {
            return false;
        }
        this.KS = 0;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        if (getCount() <= 0) {
            return false;
        }
        this.KS = this.zp.get(this.lMd[0]).size() - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        if (this.KS + 1 >= getCount()) {
            return false;
        }
        this.KS++;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i9) {
        if (i9 >= getCount()) {
            return false;
        }
        this.KS = i9;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        int i9 = this.KS;
        if (i9 - 1 < 0) {
            return false;
        }
        this.KS = i9 - 1;
        return true;
    }

    @Override // android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public boolean requery() {
        return false;
    }

    @Override // android.database.Cursor
    public Bundle respond(Bundle bundle) {
        return null;
    }

    @Override // android.database.Cursor
    public void setExtras(Bundle bundle) {
    }

    @Override // android.database.Cursor
    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }
}
