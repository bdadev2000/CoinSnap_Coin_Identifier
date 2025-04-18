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
public class DSW extends tN {
    protected List<String> YFl;
    private com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl tN;

    public DSW(Context context, com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl yFl) {
        super(context);
        this.YFl = new ArrayList();
        this.tN = yFl;
        if (yFl == null) {
            this.tN = com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl.tN();
        }
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
    public int AlY() {
        /*
            r9 = this;
            r0 = 0
            android.content.Context r1 = r9.wN()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = r9.Sg()     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "count(1)"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L27
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = com.bytedance.sdk.component.vc.YFl.YFl.YFl.tN.YFl(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L27
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.DSW.AlY():int");
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.tN
    public String Sg() {
        return qsH.DSW().AlY().AlY();
    }

    public byte YFl() {
        return (byte) 1;
    }

    public byte tN() {
        return (byte) 2;
    }

    public static String tN(String str) {
        return e.f("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> Sg(String str) {
        com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl yFl = this.tN;
        if (yFl == null) {
            return new ArrayList();
        }
        return YFl(yFl.Sg(), str);
    }

    public List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl(int i10, String str) {
        long YFl = com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl(i10, wN());
        if (YFl <= 0) {
            YFl = 1;
        } else if (YFl > 100) {
            YFl = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.YFl.clear();
        Cursor YFl2 = com.bytedance.sdk.component.vc.YFl.YFl.YFl.tN.YFl(wN(), Sg(), new String[]{"id", AppMeasurementSdk.ConditionalUserProperty.VALUE, "encrypt"}, null, null, null, null, str + " DESC limit " + YFl);
        if (YFl2 != null) {
            while (YFl2.moveToNext()) {
                try {
                    try {
                        String string = YFl2.getString(YFl2.getColumnIndex("id"));
                        String string2 = YFl2.getString(YFl2.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        if (YFl2.getInt(YFl2.getColumnIndex("encrypt")) == 1) {
                            string2 = qsH.DSW().rkt().YFl(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.YFl.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.vc.YFl.AlY.YFl.YFl yFl = new com.bytedance.sdk.component.vc.YFl.AlY.YFl.YFl(string, new JSONObject(string2));
                            yFl.Sg(tN());
                            yFl.YFl(YFl());
                            arrayList.add(yFl);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                    try {
                        YFl2.close();
                        if (!this.YFl.isEmpty()) {
                            YFl(this.YFl);
                            this.YFl.clear();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return arrayList;
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
        com.bytedance.sdk.component.vc.YFl.YFl.YFl.tN.YFl(wN(), Sg(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j3), String.valueOf(i10)});
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
        return this.tN != null && AlY() >= this.tN.YFl();
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
