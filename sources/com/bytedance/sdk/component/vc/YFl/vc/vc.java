package com.bytedance.sdk.component.vc.YFl.vc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class vc implements wN {
    private Context YFl;

    public vc(Context context) {
        this.YFl = context;
    }

    public static String Sg() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.vc.YFl.vc.wN
    public List<AlY> YFl() {
        LinkedList linkedList = new LinkedList();
        Cursor YFl = com.bytedance.sdk.component.vc.YFl.YFl.YFl.tN.YFl(this.YFl, "trackurl", null, null, null, null, null, null);
        if (YFl != null) {
            while (YFl.moveToNext()) {
                try {
                    try {
                        String string = YFl.getString(YFl.getColumnIndex("id"));
                        String string2 = YFl.getString(YFl.getColumnIndex("url"));
                        boolean z10 = YFl.getInt(YFl.getColumnIndex("replaceholder")) > 0;
                        int i10 = YFl.getInt(YFl.getColumnIndex("retry"));
                        int i11 = YFl.getInt(YFl.getColumnIndex("url_type"));
                        String string3 = YFl.getString(YFl.getColumnIndex("ad_id"));
                        String string4 = YFl.getString(YFl.getColumnIndex("error_code"));
                        String string5 = YFl.getString(YFl.getColumnIndex("error_msg"));
                        AlY alY = new AlY(string, string2, z10, i11, string3);
                        alY.YFl(i10);
                        if (!TextUtils.isEmpty(string4)) {
                            alY.YFl(string4);
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            alY.Sg(string5);
                        }
                        linkedList.add(alY);
                    } finally {
                        YFl.close();
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.vc.wN
    public void tN(AlY alY) {
        com.bytedance.sdk.component.vc.YFl.YFl.YFl.tN.YFl(this.YFl, "trackurl", "id=?", new String[]{alY.YFl()});
    }

    @Override // com.bytedance.sdk.component.vc.YFl.vc.wN
    public void Sg(AlY alY) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", alY.YFl());
        contentValues.put("url", alY.Sg());
        contentValues.put("replaceholder", Integer.valueOf(alY.tN() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(alY.AlY()));
        contentValues.put("error_code", alY.DSW());
        contentValues.put("error_msg", alY.NjR());
        contentValues.put("url_type", Integer.valueOf(alY.wN()));
        contentValues.put("ad_id", alY.vc());
        com.bytedance.sdk.component.vc.YFl.YFl.YFl.tN.YFl(this.YFl, "trackurl", contentValues, "id=?", new String[]{alY.YFl()});
    }

    @Override // com.bytedance.sdk.component.vc.YFl.vc.wN
    public AlY YFl(String str) {
        Cursor YFl = com.bytedance.sdk.component.vc.YFl.YFl.YFl.tN.YFl(this.YFl, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (YFl != null && YFl.moveToFirst()) {
            try {
                String string = YFl.getString(YFl.getColumnIndex("id"));
                String string2 = YFl.getString(YFl.getColumnIndex("url"));
                boolean z10 = YFl.getInt(YFl.getColumnIndex("replaceholder")) > 0;
                int i10 = YFl.getInt(YFl.getColumnIndex("retry"));
                int i11 = YFl.getInt(YFl.getColumnIndex("url_type"));
                String string3 = YFl.getString(YFl.getColumnIndex("ad_id"));
                String string4 = YFl.getString(YFl.getColumnIndex("error_code"));
                String string5 = YFl.getString(YFl.getColumnIndex("error_msg"));
                AlY alY = new AlY(string, string2, z10, i11, string3);
                alY.YFl(i10);
                if (!TextUtils.isEmpty(string4)) {
                    alY.YFl(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    alY.Sg(string5);
                }
                return alY;
            } catch (Throwable th2) {
                try {
                    th2.getMessage();
                    YFl.close();
                    YFl = null;
                } finally {
                    YFl.close();
                }
            }
        }
        if (YFl != null) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.vc.wN
    public void YFl(AlY alY) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", alY.YFl());
        contentValues.put("url", alY.Sg());
        contentValues.put("replaceholder", Integer.valueOf(alY.tN() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(alY.AlY()));
        contentValues.put("url_type", Integer.valueOf(alY.wN()));
        contentValues.put("ad_id", alY.vc());
        contentValues.put("error_code", alY.DSW());
        contentValues.put("error_msg", alY.NjR());
        com.bytedance.sdk.component.vc.YFl.YFl.YFl.tN.YFl(this.YFl, "trackurl", contentValues);
    }
}
