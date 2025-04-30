package com.bytedance.sdk.component.adexpress.zp.lMd;

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
public class HWF {
    private static volatile HWF lMd = null;
    public static int zp = 20;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.zp.KS.KS> COT;
    private final Object jU = new Object();
    private AtomicBoolean HWF = new AtomicBoolean(false);
    private LruCache<String, com.bytedance.sdk.component.adexpress.zp.KS.lMd> QR = new LruCache<String, com.bytedance.sdk.component.adexpress.zp.KS.lMd>(zp) { // from class: com.bytedance.sdk.component.adexpress.zp.lMd.HWF.1
        @Override // android.util.LruCache
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.zp.KS.lMd lmd) {
            return 1;
        }
    };
    private Set<String> KS = Collections.synchronizedSet(new HashSet());

    private HWF() {
    }

    private void jU(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.zp.KS.lMd> lruCache;
        if (!TextUtils.isEmpty(str) && (lruCache = this.QR) != null && lruCache.size() > 0) {
            synchronized (this.jU) {
                this.QR.remove(str);
            }
        }
    }

    public static void zp(int i9) {
        zp = i9;
    }

    public void KS(String str) {
        com.bytedance.sdk.component.adexpress.zp.KS.KS ks;
        try {
            if (this.COT == null || this.COT.isEmpty() || (ks = this.COT.get(str)) == null) {
                return;
            }
            if (!TextUtils.isEmpty(ks.zp()) && com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().HWF() != null) {
                com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().HWF();
            }
            this.COT.remove(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        r0.add(r12.getString(r12.getColumnIndex("id")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r12.moveToNext() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r12.moveToFirst() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Set<java.lang.String> lMd(java.lang.String r12) {
        /*
            r11 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r1 = 0
            if (r0 != 0) goto L62
            com.bytedance.sdk.component.adexpress.zp.zp.zp r0 = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp()
            com.bytedance.sdk.component.adexpress.zp.zp.lMd r0 = r0.lMd()
            if (r0 != 0) goto L12
            goto L62
        L12:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.bytedance.sdk.component.adexpress.zp.zp.zp r2 = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp()
            com.bytedance.sdk.component.adexpress.zp.zp.lMd r3 = r2.lMd()
            java.lang.String[] r7 = new java.lang.String[]{r12}
            r9 = 0
            r10 = 0
            java.lang.String r4 = "template_diff_new"
            r5 = 0
            java.lang.String r6 = "rit=?"
            r8 = 0
            android.database.Cursor r12 = r3.zp(r4, r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L62
            boolean r2 = r12.moveToFirst()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            if (r2 == 0) goto L52
        L37:
            java.lang.String r2 = "id"
            int r2 = r12.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.lang.String r2 = r12.getString(r2)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r0.add(r2)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            boolean r2 = r12.moveToNext()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            if (r2 != 0) goto L37
            r12.close()
            return r0
        L4e:
            r0 = move-exception
            goto L5e
        L50:
            r0 = move-exception
            goto L56
        L52:
            r12.close()
            goto L62
        L56:
            java.lang.String r2 = "TmplDbHelper"
            java.lang.String r3 = ""
            android.util.Log.e(r2, r3, r0)     // Catch: java.lang.Throwable -> L4e
            goto L52
        L5e:
            r12.close()
            throw r0
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.zp.lMd.HWF.lMd(java.lang.String):java.util.Set");
    }

    public static HWF zp() {
        if (lMd == null) {
            synchronized (HWF.class) {
                try {
                    if (lMd == null) {
                        lMd = new HWF();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lMd;
    }

    public static String KS() {
        return "CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)";
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r11.moveToFirst() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r0 = r11.getString(r11.getColumnIndex("rit"));
        r2 = r11.getString(r11.getColumnIndex("id"));
        r3 = r11.getString(r11.getColumnIndex("md5"));
        r4 = r11.getString(r11.getColumnIndex("url"));
        r5 = r11.getString(r11.getColumnIndex(com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource.SCHEME_DATA));
        r6 = r11.getString(r11.getColumnIndex("version"));
        r0 = new com.bytedance.sdk.component.adexpress.zp.KS.lMd().zp(r0).lMd(r2).KS(r3).jU(r4).COT(r5).HWF(r6).zp(java.lang.Long.valueOf(r11.getLong(r11.getColumnIndex("update_time"))));
        r3 = r10.jU;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b4, code lost:
    
        r10.QR.put(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b9, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        r10.KS.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
    
        if (r11.moveToNext() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c8, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.zp.KS.lMd zp(java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = 0
            if (r0 != 0) goto Le3
            com.bytedance.sdk.component.adexpress.zp.zp.zp r0 = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp()
            com.bytedance.sdk.component.adexpress.zp.zp.lMd r0 = r0.lMd()
            if (r0 != 0) goto L13
            goto Le3
        L13:
            java.lang.Object r0 = r10.jU
            monitor-enter(r0)
            android.util.LruCache<java.lang.String, com.bytedance.sdk.component.adexpress.zp.KS.lMd> r2 = r10.QR     // Catch: java.lang.Throwable -> Le0
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> Le0
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> Le0
            com.bytedance.sdk.component.adexpress.zp.KS.lMd r2 = (com.bytedance.sdk.component.adexpress.zp.KS.lMd) r2     // Catch: java.lang.Throwable -> Le0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le0
            if (r2 == 0) goto L26
            return r2
        L26:
            com.bytedance.sdk.component.adexpress.zp.zp.zp r0 = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp()
            com.bytedance.sdk.component.adexpress.zp.zp.lMd r2 = r0.lMd()
            java.lang.String r3 = "template_diff_new"
            java.lang.String r5 = "id=?"
            java.lang.String[] r6 = new java.lang.String[]{r11}
            r8 = 0
            r9 = 0
            r4 = 0
            r7 = 0
            android.database.Cursor r11 = r2.zp(r3, r4, r5, r6, r7, r8, r9)
            if (r11 == 0) goto Ldf
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> Lc9
            if (r0 == 0) goto Lce
        L46:
            java.lang.String r0 = "rit"
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = r11.getString(r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = "id"
            int r2 = r11.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = r11.getString(r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = "md5"
            int r3 = r11.getColumnIndex(r3)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = r11.getString(r3)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r4 = "url"
            int r4 = r11.getColumnIndex(r4)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r4 = r11.getString(r4)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r5 = "data"
            int r5 = r11.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r5 = r11.getString(r5)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r6 = "version"
            int r6 = r11.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r6 = r11.getString(r6)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r7 = "update_time"
            int r7 = r11.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lc9
            long r7 = r11.getLong(r7)     // Catch: java.lang.Throwable -> Lc9
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Lc9
            com.bytedance.sdk.component.adexpress.zp.KS.lMd r8 = new com.bytedance.sdk.component.adexpress.zp.KS.lMd     // Catch: java.lang.Throwable -> Lc9
            r8.<init>()     // Catch: java.lang.Throwable -> Lc9
            com.bytedance.sdk.component.adexpress.zp.KS.lMd r0 = r8.zp(r0)     // Catch: java.lang.Throwable -> Lc9
            com.bytedance.sdk.component.adexpress.zp.KS.lMd r0 = r0.lMd(r2)     // Catch: java.lang.Throwable -> Lc9
            com.bytedance.sdk.component.adexpress.zp.KS.lMd r0 = r0.KS(r3)     // Catch: java.lang.Throwable -> Lc9
            com.bytedance.sdk.component.adexpress.zp.KS.lMd r0 = r0.jU(r4)     // Catch: java.lang.Throwable -> Lc9
            com.bytedance.sdk.component.adexpress.zp.KS.lMd r0 = r0.COT(r5)     // Catch: java.lang.Throwable -> Lc9
            com.bytedance.sdk.component.adexpress.zp.KS.lMd r0 = r0.HWF(r6)     // Catch: java.lang.Throwable -> Lc9
            com.bytedance.sdk.component.adexpress.zp.KS.lMd r0 = r0.zp(r7)     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r3 = r10.jU     // Catch: java.lang.Throwable -> Lc9
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Lc9
            android.util.LruCache<java.lang.String, com.bytedance.sdk.component.adexpress.zp.KS.lMd> r4 = r10.QR     // Catch: java.lang.Throwable -> Lcb
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lcb
            java.util.Set<java.lang.String> r3 = r10.KS     // Catch: java.lang.Throwable -> Lc9
            r3.add(r2)     // Catch: java.lang.Throwable -> Lc9
            boolean r2 = r11.moveToNext()     // Catch: java.lang.Throwable -> Lc9
            if (r2 != 0) goto L46
            r11.close()
            return r0
        Lc9:
            r0 = move-exception
            goto Ld2
        Lcb:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc9
            throw r0     // Catch: java.lang.Throwable -> Lc9
        Lce:
            r11.close()
            goto Ldf
        Ld2:
            java.lang.String r2 = "TmplDbHelper"
            java.lang.String r3 = "getTemplate error"
            com.bytedance.sdk.component.utils.tG.zp(r2, r3, r0)     // Catch: java.lang.Throwable -> Lda
            goto Lce
        Lda:
            r0 = move-exception
            r11.close()
            throw r0
        Ldf:
            return r1
        Le0:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        Le3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.zp.lMd.HWF.zp(java.lang.String):com.bytedance.sdk.component.adexpress.zp.KS.lMd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<com.bytedance.sdk.component.adexpress.zp.KS.lMd> lMd() {
        if (com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().lMd() == null) {
            return null;
        }
        boolean z8 = this.HWF.get();
        this.HWF.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor zp2 = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().lMd().zp("template_diff_new", null, null, null, null, null, null);
        if (zp2 != null) {
            while (zp2.moveToNext()) {
                try {
                    String string = zp2.getString(zp2.getColumnIndex("rit"));
                    String string2 = zp2.getString(zp2.getColumnIndex("id"));
                    String string3 = zp2.getString(zp2.getColumnIndex("md5"));
                    String string4 = zp2.getString(zp2.getColumnIndex("url"));
                    String string5 = zp2.getString(zp2.getColumnIndex(DataSchemeDataSource.SCHEME_DATA));
                    String string6 = zp2.getString(zp2.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.zp.KS.lMd().zp(string).lMd(string2).KS(string3).jU(string4).COT(string5).HWF(string6).zp(Long.valueOf(zp2.getLong(zp2.getColumnIndex("update_time")))));
                    synchronized (this.jU) {
                        this.QR.put(string2, arrayList.get(arrayList.size() - 1));
                    }
                    this.KS.add(string2);
                    if (!z8 && com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().HWF() != null) {
                        if (this.COT == null) {
                            this.COT = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.COT.contains(string2)) {
                            this.COT.put(string2, new com.bytedance.sdk.component.adexpress.zp.KS.KS(string, string2, string3));
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

    public void zp(com.bytedance.sdk.component.adexpress.zp.KS.lMd lmd, boolean z8) {
        if (lmd == null || com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().lMd() == null || TextUtils.isEmpty(lmd.lMd())) {
            return;
        }
        Cursor zp2 = com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().lMd().zp("template_diff_new", null, "id=?", new String[]{lmd.lMd()}, null, null, null);
        boolean z9 = zp2 != null && zp2.getCount() > 0;
        if (zp2 != null) {
            try {
                r2 = zp2.moveToFirst() ? zp2.getString(zp2.getColumnIndex("rit")) : null;
                zp2.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", lmd.zp());
        contentValues.put("id", lmd.lMd());
        contentValues.put("md5", lmd.KS());
        contentValues.put("url", lmd.jU());
        contentValues.put(DataSchemeDataSource.SCHEME_DATA, lmd.COT());
        contentValues.put("version", lmd.HWF());
        contentValues.put("update_time", lmd.QR());
        if (z9) {
            com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().lMd().zp("template_diff_new", contentValues, "id=?", new String[]{lmd.lMd()});
        } else {
            com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().lMd().zp("template_diff_new", contentValues);
        }
        synchronized (this.jU) {
            this.QR.put(lmd.lMd(), lmd);
        }
        this.KS.add(lmd.lMd());
        if (z8) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().HWF() == null) {
                return;
            }
            if (this.COT == null) {
                this.COT = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.zp.KS.KS ks = new com.bytedance.sdk.component.adexpress.zp.KS.KS(lmd.zp(), lmd.lMd(), lmd.KS());
            this.COT.put(lmd.lMd(), ks);
            if (r2 != null) {
                com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().HWF();
                ks.lMd();
            }
            com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().HWF();
            lmd.zp();
        } catch (Throwable unused2) {
        }
    }

    public void zp(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().lMd() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i9 = 0; i9 < strArr.length; i9++) {
                jU(strArr[i9]);
                com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().lMd().zp("template_diff_new", "id=?", new String[]{strArr[i9]});
                KS(strArr[i9]);
            }
        }
    }
}
