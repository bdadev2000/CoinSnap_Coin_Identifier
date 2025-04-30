package com.bytedance.sdk.component.HWF.zp.HWF;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class HWF implements COT {
    private Context zp;

    public HWF(Context context) {
        this.zp = context;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.HWF.COT
    public void KS(jU jUVar) {
        com.bytedance.sdk.component.HWF.zp.zp.zp.KS.zp(this.zp, "trackurl", "id=?", new String[]{jUVar.zp()});
    }

    @Override // com.bytedance.sdk.component.HWF.zp.HWF.COT
    public void lMd(jU jUVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", jUVar.zp());
        contentValues.put("url", jUVar.lMd());
        contentValues.put("replaceholder", Integer.valueOf(jUVar.KS() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(jUVar.jU()));
        contentValues.put("error_code", jUVar.QR());
        contentValues.put("error_msg", jUVar.YW());
        contentValues.put("url_type", Integer.valueOf(jUVar.COT()));
        contentValues.put("ad_id", jUVar.HWF());
        com.bytedance.sdk.component.HWF.zp.zp.zp.KS.zp(this.zp, "trackurl", contentValues, "id=?", new String[]{jUVar.zp()});
    }

    @Override // com.bytedance.sdk.component.HWF.zp.HWF.COT
    public List<jU> zp() {
        LinkedList linkedList = new LinkedList();
        Cursor zp = com.bytedance.sdk.component.HWF.zp.zp.zp.KS.zp(this.zp, "trackurl", null, null, null, null, null, null);
        if (zp != null) {
            while (zp.moveToNext()) {
                try {
                    try {
                        String string = zp.getString(zp.getColumnIndex("id"));
                        String string2 = zp.getString(zp.getColumnIndex("url"));
                        boolean z8 = zp.getInt(zp.getColumnIndex("replaceholder")) > 0;
                        int i9 = zp.getInt(zp.getColumnIndex("retry"));
                        int i10 = zp.getInt(zp.getColumnIndex("url_type"));
                        String string3 = zp.getString(zp.getColumnIndex("ad_id"));
                        String string4 = zp.getString(zp.getColumnIndex("error_code"));
                        String string5 = zp.getString(zp.getColumnIndex("error_msg"));
                        jU jUVar = new jU(string, string2, z8, i10, string3);
                        jUVar.zp(i9);
                        if (!TextUtils.isEmpty(string4)) {
                            jUVar.zp(string4);
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            jUVar.lMd(string5);
                        }
                        linkedList.add(jUVar);
                    } finally {
                        zp.close();
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return linkedList;
    }

    public static String lMd() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.HWF.zp.HWF.COT
    public jU zp(String str) {
        Cursor zp = com.bytedance.sdk.component.HWF.zp.zp.zp.KS.zp(this.zp, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (zp != null && zp.moveToFirst()) {
            try {
                String string = zp.getString(zp.getColumnIndex("id"));
                String string2 = zp.getString(zp.getColumnIndex("url"));
                boolean z8 = zp.getInt(zp.getColumnIndex("replaceholder")) > 0;
                int i9 = zp.getInt(zp.getColumnIndex("retry"));
                int i10 = zp.getInt(zp.getColumnIndex("url_type"));
                String string3 = zp.getString(zp.getColumnIndex("ad_id"));
                String string4 = zp.getString(zp.getColumnIndex("error_code"));
                String string5 = zp.getString(zp.getColumnIndex("error_msg"));
                jU jUVar = new jU(string, string2, z8, i10, string3);
                jUVar.zp(i9);
                if (!TextUtils.isEmpty(string4)) {
                    jUVar.zp(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    jUVar.lMd(string5);
                }
                return jUVar;
            } catch (Throwable th) {
                try {
                    th.getMessage();
                    zp.close();
                    zp = null;
                } finally {
                    zp.close();
                }
            }
        }
        if (zp != null) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.HWF.COT
    public void zp(jU jUVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", jUVar.zp());
        contentValues.put("url", jUVar.lMd());
        contentValues.put("replaceholder", Integer.valueOf(jUVar.KS() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(jUVar.jU()));
        contentValues.put("url_type", Integer.valueOf(jUVar.COT()));
        contentValues.put("ad_id", jUVar.HWF());
        contentValues.put("error_code", jUVar.QR());
        contentValues.put("error_msg", jUVar.YW());
        com.bytedance.sdk.component.HWF.zp.zp.zp.KS.zp(this.zp, "trackurl", contentValues);
    }
}
