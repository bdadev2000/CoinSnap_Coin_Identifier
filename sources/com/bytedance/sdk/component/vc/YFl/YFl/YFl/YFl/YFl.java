package com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.applovin.impl.mediation.ads.e;
import com.bytedance.sdk.component.vc.YFl.qsH;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl extends tN {
    private com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl AlY;
    protected List<String> YFl;
    private final Context tN;

    public YFl(Context context, com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl yFl) {
        super(context);
        this.YFl = new ArrayList();
        this.tN = context;
        this.AlY = yFl;
        if (yFl == null) {
            this.AlY = com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl.tN();
        }
    }

    public static String Sg(String str) {
        return e.f("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public byte AlY() {
        return (byte) 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int YFl() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            android.content.Context r2 = r10.wN()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            java.lang.String r3 = r10.Sg()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            java.lang.String r4 = "count(1)"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r0 = com.bytedance.sdk.component.vc.YFl.YFl.YFl.tN.YFl(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            if (r0 == 0) goto L22
            r0.moveToFirst()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            int r1 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
        L22:
            if (r0 == 0) goto L32
        L24:
            r0.close()     // Catch: java.lang.Exception -> L32
            goto L32
        L28:
            r1 = move-exception
            if (r0 == 0) goto L2e
            r0.close()     // Catch: java.lang.Exception -> L2e
        L2e:
            throw r1
        L2f:
            if (r0 == 0) goto L32
            goto L24
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.YFl.YFl():int");
    }

    public byte tN() {
        return (byte) 2;
    }

    public List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl(int i10, String str) {
        String str2;
        String[] strArr;
        String str3;
        String str4;
        Cursor YFl;
        long YFl2 = com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl(i10, wN());
        Sg();
        if (YFl2 <= 0) {
            YFl2 = 1;
        } else if (YFl2 > 100) {
            YFl2 = 100;
        }
        String str5 = str + " DESC limit " + YFl2;
        ArrayList arrayList = new ArrayList();
        this.YFl.clear();
        long lG = qsH.DSW().lG();
        if (lG > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - lG)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.vc.YFl.tN.YFl.AlY() && AlY() == 3) {
            Context wN = wN();
            String Sg = Sg();
            String[] strArr2 = {"id", AppMeasurementSdk.ConditionalUserProperty.VALUE, "encrypt", "channel"};
            str3 = "id";
            str4 = AppMeasurementSdk.ConditionalUserProperty.VALUE;
            YFl = com.bytedance.sdk.component.vc.YFl.YFl.YFl.tN.YFl(wN, Sg, strArr2, str2, strArr, null, null, str5);
        } else {
            str3 = "id";
            str4 = AppMeasurementSdk.ConditionalUserProperty.VALUE;
            YFl = com.bytedance.sdk.component.vc.YFl.YFl.YFl.tN.YFl(wN(), Sg(), new String[]{str3, str4, "encrypt"}, str2, strArr, null, null, str5);
        }
        Cursor cursor = YFl;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.vc.YFl.wN rkt = qsH.DSW().rkt();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str3));
                        String string2 = cursor.getString(cursor.getColumnIndex(str4));
                        int i11 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i12 = (com.bytedance.sdk.component.vc.YFl.tN.YFl.AlY() && AlY() == 3) ? cursor.getInt(cursor.getColumnIndex("channel")) : 0;
                        if (i11 == 1) {
                            try {
                                string2 = rkt.YFl(string2);
                            } catch (Throwable th2) {
                                th = th2;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.YFl.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            com.bytedance.sdk.component.vc.YFl.AlY.YFl.YFl yFl = new com.bytedance.sdk.component.vc.YFl.AlY.YFl.YFl(string, jSONObject);
                            yFl.YFl(AlY());
                            yFl.Sg(tN());
                            if (com.bytedance.sdk.component.vc.YFl.tN.YFl.AlY() && AlY() == 3) {
                                yFl.YFl(i12);
                            }
                            com.bytedance.sdk.component.vc.YFl.tN.YFl.YFl(jSONObject, yFl);
                            arrayList.add(yFl);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } finally {
                try {
                    cursor.close();
                    if (!this.YFl.isEmpty()) {
                        YFl(this.YFl);
                        this.YFl.clear();
                    }
                } catch (Exception unused) {
                }
            }
        }
        Sg();
        arrayList.size();
        return arrayList;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.tN
    public String Sg() {
        com.bytedance.sdk.component.vc.YFl.YFl.wN AlY = qsH.DSW().AlY();
        if (AlY != null) {
            return AlY.Sg();
        }
        return null;
    }

    public void Sg(List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl : list) {
            linkedList.add(yFl.tN());
            com.bytedance.sdk.component.vc.YFl.tN.YFl.nc(yFl);
        }
        Sg();
        linkedList.size();
        com.bytedance.sdk.component.vc.YFl.YFl.YFl.tN.YFl(wN(), "DELETE FROM " + Sg() + " WHERE " + YFl("id", linkedList, 1000, true));
        tN(linkedList);
    }

    private void Sg(int i10, long j3) {
        if (j3 > 0 || i10 > 0) {
            com.bytedance.sdk.component.vc.YFl.YFl.YFl.tN.YFl(wN(), Sg(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j3), String.valueOf(i10)});
            Sg();
        }
    }

    public List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl(String str) {
        com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl yFl = this.AlY;
        if (yFl == null) {
            return new ArrayList();
        }
        return YFl(yFl.Sg(), str);
    }

    public void YFl(List<String> list) {
        Sg();
        list.size();
        com.bytedance.sdk.component.vc.YFl.YFl.YFl.tN.YFl(wN(), "DELETE FROM " + Sg() + " WHERE " + YFl("id", list, 1000, true));
        com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.RX(), list.size());
        tN(list);
    }

    public void YFl(int i10, long j3) {
        Sg(i10, j3);
    }

    public boolean YFl(int i10) {
        if (this.AlY == null) {
            return false;
        }
        int YFl = YFl();
        int YFl2 = this.AlY.YFl();
        Sg();
        return (com.bytedance.sdk.component.vc.YFl.tN.YFl.tN() && (i10 == 1 || i10 == 2)) ? YFl > 0 : YFl >= YFl2;
    }

    private static String YFl(String str, List<?> list, int i10, boolean z10) {
        int i11;
        String str2 = z10 ? " IN " : " NOT IN ";
        String str3 = z10 ? " OR " : " AND ";
        int min = Math.min(i10, 1000);
        int size = list.size();
        if (size % min == 0) {
            i11 = size / min;
        } else {
            i11 = (size / min) + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * min;
            String YFl = YFl(TextUtils.join("','", list.subList(i13, Math.min(i13 + min, size))), "");
            if (i12 != 0) {
                sb2.append(str3);
            }
            sb2.append(str);
            sb2.append(str2);
            sb2.append("('");
            sb2.append(YFl);
            sb2.append("')");
        }
        return YFl(sb2.toString(), a.m(str, str2, "('')"));
    }

    private static String YFl(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
