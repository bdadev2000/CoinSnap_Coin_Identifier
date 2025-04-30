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
public class zp extends KS {
    private final Context KS;
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp jU;
    protected List<String> zp;

    public zp(Context context, com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar) {
        super(context);
        this.zp = new ArrayList();
        this.KS = context;
        this.jU = zpVar;
        if (zpVar == null) {
            this.jU = com.bytedance.sdk.component.HWF.zp.jU.lMd.zp.KS();
        }
    }

    public byte KS() {
        return (byte) 2;
    }

    public byte jU() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.zp.zp.KS
    public String lMd() {
        com.bytedance.sdk.component.HWF.zp.zp.COT jU = ku.QR().jU();
        if (jU != null) {
            return jU.lMd();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r0 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r0 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int zp() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            android.content.Context r2 = r10.COT()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L31
            java.lang.String r3 = r10.lMd()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L31
            java.lang.String r4 = "count(1)"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L31
            r8 = 0
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = com.bytedance.sdk.component.HWF.zp.zp.zp.KS.zp(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L31
            if (r0 == 0) goto L25
            r0.moveToFirst()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L31
            int r1 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L31
            goto L25
        L23:
            r1 = move-exception
            goto L2b
        L25:
            if (r0 == 0) goto L34
        L27:
            r0.close()     // Catch: java.lang.Exception -> L34
            goto L34
        L2b:
            if (r0 == 0) goto L30
            r0.close()     // Catch: java.lang.Exception -> L30
        L30:
            throw r1
        L31:
            if (r0 == 0) goto L34
            goto L27
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.HWF.zp.zp.zp.zp.zp.zp():int");
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

    public List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp(int i9, String str) {
        String str2;
        String[] strArr;
        byte b;
        String str3;
        Cursor zp;
        long zp2 = com.bytedance.sdk.component.HWF.zp.lMd.zp.zp(i9, COT());
        lMd();
        if (zp2 <= 0) {
            zp2 = 1;
        } else if (zp2 > 100) {
            zp2 = 100;
        }
        String str4 = str + " DESC limit " + zp2;
        ArrayList arrayList = new ArrayList();
        this.zp.clear();
        long woN = ku.QR().woN();
        if (woN > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - woN)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.HWF.zp.KS.zp.jU() && jU() == 3) {
            b = 3;
            str3 = "id";
            zp = com.bytedance.sdk.component.HWF.zp.zp.zp.KS.zp(COT(), lMd(), new String[]{"id", AppMeasurementSdk.ConditionalUserProperty.VALUE, "encrypt", "channel"}, str2, strArr, null, null, str4);
        } else {
            b = 3;
            str3 = "id";
            zp = com.bytedance.sdk.component.HWF.zp.zp.zp.KS.zp(COT(), lMd(), new String[]{str3, AppMeasurementSdk.ConditionalUserProperty.VALUE, "encrypt"}, str2, strArr, null, null, str4);
        }
        Cursor cursor = zp;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.HWF.zp.COT KVG = ku.QR().KVG();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str3));
                        String string2 = cursor.getString(cursor.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        int i10 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i11 = (com.bytedance.sdk.component.HWF.zp.KS.zp.jU() && jU() == b) ? cursor.getInt(cursor.getColumnIndex("channel")) : 0;
                        if (i10 == 1) {
                            try {
                                string2 = KVG.zp(string2);
                            } catch (Throwable th) {
                                th = th;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.zp.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            com.bytedance.sdk.component.HWF.zp.jU.zp.zp zpVar = new com.bytedance.sdk.component.HWF.zp.jU.zp.zp(string, jSONObject);
                            zpVar.zp(jU());
                            zpVar.lMd(KS());
                            if (com.bytedance.sdk.component.HWF.zp.KS.zp.jU() && jU() == b) {
                                zpVar.zp(i11);
                            }
                            com.bytedance.sdk.component.HWF.zp.KS.zp.zp(jSONObject, zpVar);
                            arrayList.add(zpVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                try {
                    cursor.close();
                    if (!this.zp.isEmpty()) {
                        zp(this.zp);
                        this.zp.clear();
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th3) {
                try {
                    cursor.close();
                    if (!this.zp.isEmpty()) {
                        zp(this.zp);
                        this.zp.clear();
                    }
                } catch (Exception unused2) {
                }
                throw th3;
            }
        }
        lMd();
        arrayList.size();
        return arrayList;
    }

    private void lMd(int i9, long j7) {
        if (j7 > 0 || i9 > 0) {
            com.bytedance.sdk.component.HWF.zp.zp.zp.KS.zp(COT(), lMd(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j7), String.valueOf(i9)});
            lMd();
        }
    }

    public static String lMd(String str) {
        return AbstractC2914a.e("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp(String str) {
        com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar = this.jU;
        if (zpVar == null) {
            return new ArrayList();
        }
        return zp(zpVar.lMd(), str);
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
        if (this.jU == null) {
            return false;
        }
        int zp = zp();
        int zp2 = this.jU.zp();
        lMd();
        return (com.bytedance.sdk.component.HWF.zp.KS.zp.KS() && (i9 == 1 || i9 == 2)) ? zp > 0 : zp >= zp2;
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
