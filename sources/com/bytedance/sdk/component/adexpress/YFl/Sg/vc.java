package com.bytedance.sdk.component.adexpress.YFl.Sg;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.LruCache;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class vc {
    private static volatile vc Sg = null;
    public static int YFl = 20;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.YFl.tN.tN> wN;
    private final Object AlY = new Object();

    /* renamed from: vc, reason: collision with root package name */
    private AtomicBoolean f10358vc = new AtomicBoolean(false);
    private LruCache<String, com.bytedance.sdk.component.adexpress.YFl.tN.Sg> DSW = new LruCache<String, com.bytedance.sdk.component.adexpress.YFl.tN.Sg>(YFl) { // from class: com.bytedance.sdk.component.adexpress.YFl.Sg.vc.1
        @Override // android.util.LruCache
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.YFl.tN.Sg sg2) {
            return 1;
        }
    };
    private Set<String> tN = Collections.synchronizedSet(new HashSet());

    private vc() {
    }

    private void AlY(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.YFl.tN.Sg> lruCache;
        if (!TextUtils.isEmpty(str) && (lruCache = this.DSW) != null && lruCache.size() > 0) {
            synchronized (this.AlY) {
                this.DSW.remove(str);
            }
        }
    }

    public static void YFl(int i10) {
        YFl = i10;
    }

    public static String tN() {
        return "CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r12.moveToFirst() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r0.add(r12.getString(r12.getColumnIndex("id")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r12.moveToNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Set<java.lang.String> Sg(java.lang.String r12) {
        /*
            r11 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r1 = 0
            if (r0 != 0) goto L63
            com.bytedance.sdk.component.adexpress.YFl.YFl.YFl r0 = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl()
            com.bytedance.sdk.component.adexpress.YFl.YFl.Sg r0 = r0.Sg()
            if (r0 != 0) goto L12
            goto L63
        L12:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.bytedance.sdk.component.adexpress.YFl.YFl.YFl r2 = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl()
            com.bytedance.sdk.component.adexpress.YFl.YFl.Sg r3 = r2.Sg()
            java.lang.String r4 = "template_diff_new"
            r5 = 0
            java.lang.String r6 = "rit=?"
            r2 = 1
            java.lang.String[] r7 = new java.lang.String[r2]
            r2 = 0
            r7[r2] = r12
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r12 = r3.YFl(r4, r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L63
            boolean r2 = r12.moveToFirst()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            if (r2 == 0) goto L50
        L39:
            java.lang.String r2 = "id"
            int r2 = r12.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            java.lang.String r2 = r12.getString(r2)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            r0.add(r2)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            boolean r2 = r12.moveToNext()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            if (r2 != 0) goto L39
            r12.close()
            return r0
        L50:
            r12.close()
            goto L63
        L54:
            r0 = move-exception
            goto L5f
        L56:
            r0 = move-exception
            java.lang.String r2 = "TmplDbHelper"
            java.lang.String r3 = ""
            android.util.Log.e(r2, r3, r0)     // Catch: java.lang.Throwable -> L54
            goto L50
        L5f:
            r12.close()
            throw r0
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.YFl.Sg.vc.Sg(java.lang.String):java.util.Set");
    }

    public static vc YFl() {
        if (Sg == null) {
            synchronized (vc.class) {
                if (Sg == null) {
                    Sg = new vc();
                }
            }
        }
        return Sg;
    }

    public void tN(String str) {
        com.bytedance.sdk.component.adexpress.YFl.tN.tN tNVar;
        try {
            if (this.wN == null || this.wN.isEmpty() || (tNVar = this.wN.get(str)) == null) {
                return;
            }
            if (!TextUtils.isEmpty(tNVar.YFl()) && com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().vc() != null) {
                com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().vc();
            }
            this.wN.remove(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r11.moveToFirst() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        r0 = r11.getString(r11.getColumnIndex("rit"));
        r2 = r11.getString(r11.getColumnIndex("id"));
        r3 = r11.getString(r11.getColumnIndex("md5"));
        r4 = r11.getString(r11.getColumnIndex("url"));
        r5 = r11.getString(r11.getColumnIndex(com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource.SCHEME_DATA));
        r0 = new com.bytedance.sdk.component.adexpress.YFl.tN.Sg().YFl(r0).Sg(r2).tN(r3).AlY(r4).wN(r5).vc(r11.getString(r11.getColumnIndex("version"))).YFl(java.lang.Long.valueOf(r11.getLong(r11.getColumnIndex("update_time"))));
        r3 = r10.AlY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        r10.DSW.put(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bb, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        r10.tN.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
    
        if (r11.moveToNext() != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.YFl.tN.Sg YFl(java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = 0
            if (r0 != 0) goto Le4
            com.bytedance.sdk.component.adexpress.YFl.YFl.YFl r0 = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl()
            com.bytedance.sdk.component.adexpress.YFl.YFl.Sg r0 = r0.Sg()
            if (r0 != 0) goto L13
            goto Le4
        L13:
            java.lang.Object r0 = r10.AlY
            monitor-enter(r0)
            android.util.LruCache<java.lang.String, com.bytedance.sdk.component.adexpress.YFl.tN.Sg> r2 = r10.DSW     // Catch: java.lang.Throwable -> Le1
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> Le1
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> Le1
            com.bytedance.sdk.component.adexpress.YFl.tN.Sg r2 = (com.bytedance.sdk.component.adexpress.YFl.tN.Sg) r2     // Catch: java.lang.Throwable -> Le1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto L26
            return r2
        L26:
            com.bytedance.sdk.component.adexpress.YFl.YFl.YFl r0 = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl()
            com.bytedance.sdk.component.adexpress.YFl.YFl.Sg r2 = r0.Sg()
            java.lang.String r3 = "template_diff_new"
            r4 = 0
            java.lang.String r5 = "id=?"
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]
            r0 = 0
            r6[r0] = r11
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r11 = r2.YFl(r3, r4, r5, r6, r7, r8, r9)
            if (r11 == 0) goto Le0
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> Ld2
            if (r0 == 0) goto Lce
        L48:
            java.lang.String r0 = "rit"
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r0 = r11.getString(r0)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r2 = "id"
            int r2 = r11.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r2 = r11.getString(r2)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r3 = "md5"
            int r3 = r11.getColumnIndex(r3)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r3 = r11.getString(r3)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r4 = "url"
            int r4 = r11.getColumnIndex(r4)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r4 = r11.getString(r4)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r5 = "data"
            int r5 = r11.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r5 = r11.getString(r5)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r6 = "version"
            int r6 = r11.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r6 = r11.getString(r6)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r7 = "update_time"
            int r7 = r11.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Ld2
            long r7 = r11.getLong(r7)     // Catch: java.lang.Throwable -> Ld2
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Ld2
            com.bytedance.sdk.component.adexpress.YFl.tN.Sg r8 = new com.bytedance.sdk.component.adexpress.YFl.tN.Sg     // Catch: java.lang.Throwable -> Ld2
            r8.<init>()     // Catch: java.lang.Throwable -> Ld2
            com.bytedance.sdk.component.adexpress.YFl.tN.Sg r0 = r8.YFl(r0)     // Catch: java.lang.Throwable -> Ld2
            com.bytedance.sdk.component.adexpress.YFl.tN.Sg r0 = r0.Sg(r2)     // Catch: java.lang.Throwable -> Ld2
            com.bytedance.sdk.component.adexpress.YFl.tN.Sg r0 = r0.tN(r3)     // Catch: java.lang.Throwable -> Ld2
            com.bytedance.sdk.component.adexpress.YFl.tN.Sg r0 = r0.AlY(r4)     // Catch: java.lang.Throwable -> Ld2
            com.bytedance.sdk.component.adexpress.YFl.tN.Sg r0 = r0.wN(r5)     // Catch: java.lang.Throwable -> Ld2
            com.bytedance.sdk.component.adexpress.YFl.tN.Sg r0 = r0.vc(r6)     // Catch: java.lang.Throwable -> Ld2
            com.bytedance.sdk.component.adexpress.YFl.tN.Sg r0 = r0.YFl(r7)     // Catch: java.lang.Throwable -> Ld2
            java.lang.Object r3 = r10.AlY     // Catch: java.lang.Throwable -> Ld2
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Ld2
            android.util.LruCache<java.lang.String, com.bytedance.sdk.component.adexpress.YFl.tN.Sg> r4 = r10.DSW     // Catch: java.lang.Throwable -> Lcb
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lcb
            java.util.Set<java.lang.String> r3 = r10.tN     // Catch: java.lang.Throwable -> Ld2
            r3.add(r2)     // Catch: java.lang.Throwable -> Ld2
            boolean r2 = r11.moveToNext()     // Catch: java.lang.Throwable -> Ld2
            if (r2 != 0) goto L48
            r11.close()
            return r0
        Lcb:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld2
            throw r0     // Catch: java.lang.Throwable -> Ld2
        Lce:
            r11.close()
            goto Le0
        Ld2:
            r0 = move-exception
            java.lang.String r2 = "TmplDbHelper"
            java.lang.String r3 = "getTemplate error"
            com.bytedance.sdk.component.utils.YoT.YFl(r2, r3, r0)     // Catch: java.lang.Throwable -> Ldb
            goto Lce
        Ldb:
            r0 = move-exception
            r11.close()
            throw r0
        Le0:
            return r1
        Le1:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        Le4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.YFl.Sg.vc.YFl(java.lang.String):com.bytedance.sdk.component.adexpress.YFl.tN.Sg");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<com.bytedance.sdk.component.adexpress.YFl.tN.Sg> Sg() {
        if (com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().Sg() == null) {
            return null;
        }
        boolean z10 = this.f10358vc.get();
        this.f10358vc.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor YFl2 = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().Sg().YFl("template_diff_new", null, null, null, null, null, null);
        if (YFl2 != null) {
            while (YFl2.moveToNext()) {
                try {
                    String string = YFl2.getString(YFl2.getColumnIndex("rit"));
                    String string2 = YFl2.getString(YFl2.getColumnIndex("id"));
                    String string3 = YFl2.getString(YFl2.getColumnIndex("md5"));
                    String string4 = YFl2.getString(YFl2.getColumnIndex("url"));
                    String string5 = YFl2.getString(YFl2.getColumnIndex(DataSchemeDataSource.SCHEME_DATA));
                    String string6 = YFl2.getString(YFl2.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.YFl.tN.Sg().YFl(string).Sg(string2).tN(string3).AlY(string4).wN(string5).vc(string6).YFl(Long.valueOf(YFl2.getLong(YFl2.getColumnIndex("update_time")))));
                    synchronized (this.AlY) {
                        this.DSW.put(string2, arrayList.get(arrayList.size() - 1));
                    }
                    this.tN.add(string2);
                    if (!z10 && com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().vc() != null) {
                        if (this.wN == null) {
                            this.wN = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.wN.contains(string2)) {
                            this.wN.put(string2, new com.bytedance.sdk.component.adexpress.YFl.tN.tN(string, string2, string3));
                        }
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
        return arrayList;
    }

    public void YFl(com.bytedance.sdk.component.adexpress.YFl.tN.Sg sg2, boolean z10) {
        if (sg2 == null || com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().Sg() == null || TextUtils.isEmpty(sg2.Sg())) {
            return;
        }
        Cursor YFl2 = com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().Sg().YFl("template_diff_new", null, "id=?", new String[]{sg2.Sg()}, null, null, null);
        boolean z11 = YFl2 != null && YFl2.getCount() > 0;
        if (YFl2 != null) {
            try {
                r3 = YFl2.moveToFirst() ? YFl2.getString(YFl2.getColumnIndex("rit")) : null;
                YFl2.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", sg2.YFl());
        contentValues.put("id", sg2.Sg());
        contentValues.put("md5", sg2.tN());
        contentValues.put("url", sg2.AlY());
        contentValues.put(DataSchemeDataSource.SCHEME_DATA, sg2.wN());
        contentValues.put("version", sg2.vc());
        contentValues.put("update_time", sg2.DSW());
        if (z11) {
            com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().Sg().YFl("template_diff_new", contentValues, "id=?", new String[]{sg2.Sg()});
        } else {
            com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().Sg().YFl("template_diff_new", contentValues);
        }
        synchronized (this.AlY) {
            this.DSW.put(sg2.Sg(), sg2);
        }
        this.tN.add(sg2.Sg());
        if (z10) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().vc() == null) {
                return;
            }
            if (this.wN == null) {
                this.wN = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.YFl.tN.tN tNVar = new com.bytedance.sdk.component.adexpress.YFl.tN.tN(sg2.YFl(), sg2.Sg(), sg2.tN());
            this.wN.put(sg2.Sg(), tNVar);
            if (r3 != null) {
                com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().vc();
                tNVar.Sg();
            }
            com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().vc();
            sg2.YFl();
        } catch (Throwable unused2) {
        }
    }

    public void YFl(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().Sg() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                AlY(strArr[i10]);
                com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().Sg().YFl("template_diff_new", "id=?", new String[]{strArr[i10]});
                tN(strArr[i10]);
            }
        }
    }
}
