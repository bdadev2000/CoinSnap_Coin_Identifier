package com.bytedance.sdk.component.HWF.zp.zp.zp.zp;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.HWF.zp.ku;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class QR extends KS {
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp KS;
    protected List<String> zp;

    public QR(Context context, com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar) {
        super(context);
        this.zp = new ArrayList();
        this.KS = zpVar;
        if (zpVar == null) {
            this.KS = com.bytedance.sdk.component.HWF.zp.jU.lMd.zp.KS();
        }
    }

    public byte KS() {
        return (byte) 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r1 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r1 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int jU() {
        /*
            r9 = this;
            r0 = 0
            android.content.Context r1 = r9.COT()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = r9.lMd()     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "count(1)"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L27
            r7 = 0
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r1 = com.bytedance.sdk.component.HWF.zp.zp.zp.KS.zp(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L21
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L28
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L28
        L21:
            if (r1 == 0) goto L2b
        L23:
            r1.close()     // Catch: java.lang.Exception -> L2b
            goto L2b
        L27:
            r1 = 0
        L28:
            if (r1 == 0) goto L2b
            goto L23
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.HWF.zp.zp.zp.zp.QR.jU():int");
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.zp.zp.KS
    public String lMd() {
        return ku.QR().jU().jU();
    }

    public byte zp() {
        return (byte) 1;
    }

    public static String KS(String str) {
        return AbstractC2914a.e("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public List<com.bytedance.sdk.component.HWF.zp.jU.zp> lMd(String str) {
        com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar = this.KS;
        if (zpVar == null) {
            return new ArrayList();
        }
        return zp(zpVar.lMd(), str);
    }

    public List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp(int i9, String str) {
        long zp = com.bytedance.sdk.component.HWF.zp.lMd.zp.zp(i9, COT());
        if (zp <= 0) {
            zp = 1;
        } else if (zp > 100) {
            zp = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.zp.clear();
        Cursor zp2 = com.bytedance.sdk.component.HWF.zp.zp.zp.KS.zp(COT(), lMd(), new String[]{"id", AppMeasurementSdk.ConditionalUserProperty.VALUE, "encrypt"}, null, null, null, null, str + " DESC limit " + zp);
        if (zp2 != null) {
            while (zp2.moveToNext()) {
                try {
                    try {
                        String string = zp2.getString(zp2.getColumnIndex("id"));
                        String string2 = zp2.getString(zp2.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        if (zp2.getInt(zp2.getColumnIndex("encrypt")) == 1) {
                            string2 = ku.QR().KVG().zp(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.zp.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.HWF.zp.jU.zp.zp zpVar = new com.bytedance.sdk.component.HWF.zp.jU.zp.zp(string, new JSONObject(string2));
                            zpVar.lMd(KS());
                            zpVar.zp(zp());
                            arrayList.add(zpVar);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                    try {
                        zp2.close();
                        if (!this.zp.isEmpty()) {
                            zp(this.zp);
                            this.zp.clear();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return arrayList;
    }

    public void lMd(List<com.bytedance.sdk.component.HWF.zp.jU.zp> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.HWF.zp.jU.zp zpVar : list) {
            linkedList.add(zpVar.KS());
            com.bytedance.sdk.component.HWF.zp.KS.zp.dT(zpVar);
        }
        lMd();
        linkedList.size();
        com.bytedance.sdk.component.HWF.zp.zp.zp.KS.zp(COT(), "DELETE FROM " + lMd() + " WHERE " + zp("id", linkedList, 1000, true));
        KS(linkedList);
    }

    private void lMd(int i9, long j7) {
        com.bytedance.sdk.component.HWF.zp.zp.zp.KS.zp(COT(), lMd(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j7), String.valueOf(i9)});
    }

    public void zp(List<String> list) {
        lMd();
        list.size();
        com.bytedance.sdk.component.HWF.zp.zp.zp.KS.zp(COT(), "DELETE FROM " + lMd() + " WHERE " + zp("id", list, 1000, true));
        com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.qtv(), list.size());
        KS(list);
    }

    public void zp(int i9, long j7) {
        lMd(i9, j7);
    }

    public boolean zp(int i9) {
        return this.KS != null && jU() >= this.KS.zp();
    }

    private static String zp(String str, List<?> list, int i9, boolean z8) {
        int i10;
        String str2 = z8 ? " IN " : " NOT IN ";
        String str3 = z8 ? " OR " : " AND ";
        int min = Math.min(i9, 1000);
        int size = list.size();
        if (size % min == 0) {
            i10 = size / min;
        } else {
            i10 = (size / min) + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 * min;
            String zp = zp(TextUtils.join("','", list.subList(i12, Math.min(i12 + min, size))), "");
            if (i11 != 0) {
                sb.append(str3);
            }
            AbstractC2914a.j(sb, str, str2, "('", zp);
            sb.append("')");
        }
        return zp(sb.toString(), o.k(str, str2, "('')"));
    }

    private static String zp(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
