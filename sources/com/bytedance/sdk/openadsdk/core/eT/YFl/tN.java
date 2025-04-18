package com.bytedance.sdk.openadsdk.core.eT.YFl;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.openadsdk.core.lG;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.Set;

/* loaded from: classes.dex */
public class tN {
    private static volatile tN Sg = null;
    public static int YFl = 20;
    private final Object tN = new Object();
    private final LruCache<String, YFl> AlY = new LruCache<String, YFl>(YFl) { // from class: com.bytedance.sdk.openadsdk.core.eT.YFl.tN.1
        @Override // android.util.LruCache
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, YFl yFl) {
            return 1;
        }
    };

    private tN() {
    }

    public static String AlY() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    public static tN YFl() {
        if (Sg == null) {
            synchronized (tN.class) {
                if (Sg == null) {
                    Sg = new tN();
                }
            }
        }
        return Sg;
    }

    public static String tN() {
        return "CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if (r5 == (-1)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        r8 = r1.getColumnIndex("rit");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r8 == (-1)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        r7 = r1.getString(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        r2 = r1.getString(r2);
        r3 = r1.getString(r3);
        r4 = r1.getString(r4);
        r5 = r1.getString(r5);
        r3 = new com.bytedance.sdk.openadsdk.core.eT.YFl.YFl().YFl(r2).Sg(r3).tN(r4).AlY(r5).wN(r7).YFl(java.lang.Long.valueOf(r1.getLong(r6)));
        r0.add(r3);
        r4 = r10.tN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0091, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0092, code lost:
    
        r10.AlY.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0097, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (r1.moveToNext() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r1.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        r2 = r1.getColumnIndex("id");
        r3 = r1.getColumnIndex("md5");
        r4 = r1.getColumnIndex("url");
        r5 = r1.getColumnIndex(com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource.SCHEME_DATA);
        r6 = r1.getColumnIndex("update_time");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003f, code lost:
    
        if (r2 == (-1)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0041, code lost:
    
        if (r3 == (-1)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (r4 == (-1)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        if (r6 == (-1)) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.bytedance.sdk.openadsdk.core.eT.YFl.YFl> Sg() {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bytedance.sdk.openadsdk.multipro.aidl.tN r1 = new com.bytedance.sdk.openadsdk.multipro.aidl.tN
            android.content.Context r2 = com.bytedance.sdk.openadsdk.core.lG.YFl()
            java.lang.String r3 = "ugen_template"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.util.Map r2 = com.bytedance.sdk.openadsdk.multipro.YFl.YFl.YFl(r2, r3, r4, r5, r6, r7, r8, r9)
            r1.<init>(r2)
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto La2
        L20:
            java.lang.String r2 = "id"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.String r3 = "md5"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La6
            java.lang.String r4 = "url"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> La6
            java.lang.String r5 = "data"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> La6
            java.lang.String r6 = "update_time"
            int r6 = r1.getColumnIndex(r6)     // Catch: java.lang.Throwable -> La6
            r7 = -1
            if (r2 == r7) goto L9c
            if (r3 == r7) goto L9c
            if (r4 == r7) goto L9c
            if (r6 == r7) goto L9c
            if (r5 == r7) goto L9c
            java.lang.String r8 = "rit"
            int r8 = r1.getColumnIndex(r8)     // Catch: java.lang.Throwable -> La6
            if (r8 == r7) goto L56
            java.lang.String r7 = r1.getString(r8)     // Catch: java.lang.Throwable -> La6
            goto L57
        L56:
            r7 = 0
        L57:
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> La6
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> La6
            java.lang.String r5 = r1.getString(r5)     // Catch: java.lang.Throwable -> La6
            long r8 = r1.getLong(r6)     // Catch: java.lang.Throwable -> La6
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> La6
            com.bytedance.sdk.openadsdk.core.eT.YFl.YFl r8 = new com.bytedance.sdk.openadsdk.core.eT.YFl.YFl     // Catch: java.lang.Throwable -> La6
            r8.<init>()     // Catch: java.lang.Throwable -> La6
            com.bytedance.sdk.openadsdk.core.eT.YFl.YFl r8 = r8.YFl(r2)     // Catch: java.lang.Throwable -> La6
            com.bytedance.sdk.openadsdk.core.eT.YFl.YFl r3 = r8.Sg(r3)     // Catch: java.lang.Throwable -> La6
            com.bytedance.sdk.openadsdk.core.eT.YFl.YFl r3 = r3.tN(r4)     // Catch: java.lang.Throwable -> La6
            com.bytedance.sdk.openadsdk.core.eT.YFl.YFl r3 = r3.AlY(r5)     // Catch: java.lang.Throwable -> La6
            com.bytedance.sdk.openadsdk.core.eT.YFl.YFl r3 = r3.wN(r7)     // Catch: java.lang.Throwable -> La6
            com.bytedance.sdk.openadsdk.core.eT.YFl.YFl r3 = r3.YFl(r6)     // Catch: java.lang.Throwable -> La6
            r0.add(r3)     // Catch: java.lang.Throwable -> La6
            java.lang.Object r4 = r10.tN     // Catch: java.lang.Throwable -> La6
            monitor-enter(r4)     // Catch: java.lang.Throwable -> La6
            android.util.LruCache<java.lang.String, com.bytedance.sdk.openadsdk.core.eT.YFl.YFl> r5 = r10.AlY     // Catch: java.lang.Throwable -> L99
            r5.put(r2, r3)     // Catch: java.lang.Throwable -> L99
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L99
            goto L9c
        L99:
            r2 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La6
            throw r2     // Catch: java.lang.Throwable -> La6
        L9c:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> La6
            if (r2 != 0) goto L20
        La2:
            r1.close()
            goto Laf
        La6:
            r2 = move-exception
            java.lang.String r3 = "UGTmplDbHelper"
            java.lang.String r4 = "getUgenTemplate error"
            com.bytedance.sdk.component.utils.YoT.YFl(r3, r4, r2)     // Catch: java.lang.Throwable -> Lb0
            goto La2
        Laf:
            return r0
        Lb0:
            r0 = move-exception
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.eT.YFl.tN.Sg():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r0.moveToFirst() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        r11 = r0.getColumnIndex("id");
        r12 = r0.getColumnIndex("md5");
        r2 = r0.getColumnIndex("url");
        r3 = r0.getColumnIndex(com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource.SCHEME_DATA);
        r4 = r0.getColumnIndex("update_time");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r11 == (-1)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r12 == (-1)) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r2 == (-1)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r4 == (-1)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r3 != (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        r6 = r0.getColumnIndex("rit");
        r11 = r0.getString(r11);
        r12 = r0.getString(r12);
        r2 = r0.getString(r2);
        r3 = r0.getString(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        if (r6 == (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        r5 = r0.getString(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        r12 = new com.bytedance.sdk.openadsdk.core.eT.YFl.YFl().YFl(r11).Sg(r12).AlY(r3).tN(r2).wN(r5).YFl(java.lang.Long.valueOf(r0.getLong(r4)));
        r2 = r10.tN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        r10.AlY.put(r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
    
        if (r0.moveToNext() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d2, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009a, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0092, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d9, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.openadsdk.core.eT.YFl.YFl YFl(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.eT.YFl.tN.YFl(java.lang.String, java.lang.String):com.bytedance.sdk.openadsdk.core.eT.YFl.YFl");
    }

    private void Sg(String str) {
        if (!TextUtils.isEmpty(str) && this.AlY.size() > 0) {
            synchronized (this.tN) {
                this.AlY.remove(str);
            }
        }
    }

    public void YFl(YFl yFl) {
        if (yFl == null || TextUtils.isEmpty(yFl.YFl())) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.tN tNVar = new com.bytedance.sdk.openadsdk.multipro.aidl.tN(com.bytedance.sdk.openadsdk.multipro.YFl.YFl.YFl(lG.YFl(), "ugen_template", null, "id=?", new String[]{yFl.YFl()}, null, null, null));
        boolean z10 = tNVar.getCount() > 0;
        try {
            tNVar.close();
        } catch (Throwable unused) {
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", yFl.YFl());
        contentValues.put("md5", yFl.Sg());
        contentValues.put("url", yFl.tN());
        contentValues.put(DataSchemeDataSource.SCHEME_DATA, yFl.wN());
        contentValues.put("rit", yFl.vc());
        contentValues.put("update_time", yFl.AlY());
        if (z10) {
            com.bytedance.sdk.openadsdk.multipro.YFl.YFl.YFl(lG.YFl(), "ugen_template", contentValues, "id=?", new String[]{yFl.YFl()});
        } else {
            com.bytedance.sdk.openadsdk.multipro.YFl.YFl.YFl(lG.YFl(), "ugen_template", contentValues);
        }
        synchronized (this.tN) {
            this.AlY.put(yFl.YFl(), yFl);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r2 == (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r2 = r1.getString(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (android.text.TextUtils.isEmpty(r2) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        r4 = r10.tN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r5 = r10.AlY.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r5 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        r0.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r4 = new com.bytedance.sdk.openadsdk.core.eT.YFl.YFl();
        r5 = r1.getColumnIndex(com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource.SCHEME_DATA);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r5 == (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        r5 = r1.getString(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (android.text.TextUtils.isEmpty(r5) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        r4.AlY(r5);
        r4.YFl(r2);
        r4.wN(r11);
        r5 = r1.getColumnIndex("md5");
        r6 = r1.getColumnIndex("url");
        r7 = r1.getColumnIndex("update_time");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (r5 == (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        r4.Sg(r1.getString(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r6 == (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        r4.tN(r1.getString(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        if (r7 == (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        r4.YFl(java.lang.Long.valueOf(r1.getLong(r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        r0.add(r4);
        r3 = r10.tN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        r10.AlY.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00af, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        if (r1.moveToNext() != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r1.moveToFirst() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        r2 = r1.getColumnIndex("id");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Set<com.bytedance.sdk.openadsdk.core.eT.YFl.YFl> YFl(java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L8
            r11 = 0
            return r11
        L8:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.bytedance.sdk.openadsdk.multipro.aidl.tN r1 = new com.bytedance.sdk.openadsdk.multipro.aidl.tN
            android.content.Context r2 = com.bytedance.sdk.openadsdk.core.lG.YFl()
            java.lang.String r3 = "ugen_template"
            r4 = 0
            java.lang.String r5 = "rit=?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]
            r7 = 0
            r6[r7] = r11
            r7 = 0
            r8 = 0
            r9 = 0
            java.util.Map r2 = com.bytedance.sdk.openadsdk.multipro.YFl.YFl.YFl(r2, r3, r4, r5, r6, r7, r8, r9)
            r1.<init>(r2)
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> Lc1
            if (r2 == 0) goto Lbd
        L2e:
            java.lang.String r2 = "id"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lc1
            r3 = -1
            if (r2 == r3) goto Lb7
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> Lc1
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lc1
            if (r4 != 0) goto Lb7
            java.lang.Object r4 = r10.tN     // Catch: java.lang.Throwable -> Lc1
            monitor-enter(r4)     // Catch: java.lang.Throwable -> Lc1
            android.util.LruCache<java.lang.String, com.bytedance.sdk.openadsdk.core.eT.YFl.YFl> r5 = r10.AlY     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r5 = r5.get(r2)     // Catch: java.lang.Throwable -> Lb4
            com.bytedance.sdk.openadsdk.core.eT.YFl.YFl r5 = (com.bytedance.sdk.openadsdk.core.eT.YFl.YFl) r5     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb4
            if (r5 == 0) goto L53
            r0.add(r5)     // Catch: java.lang.Throwable -> Lc1
            goto Lb7
        L53:
            com.bytedance.sdk.openadsdk.core.eT.YFl.YFl r4 = new com.bytedance.sdk.openadsdk.core.eT.YFl.YFl     // Catch: java.lang.Throwable -> Lc1
            r4.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r5 = "data"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lc1
            if (r5 == r3) goto Lb7
            java.lang.String r5 = r1.getString(r5)     // Catch: java.lang.Throwable -> Lc1
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lc1
            if (r6 != 0) goto Lb7
            r4.AlY(r5)     // Catch: java.lang.Throwable -> Lc1
            r4.YFl(r2)     // Catch: java.lang.Throwable -> Lc1
            r4.wN(r11)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r5 = "md5"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r6 = "url"
            int r6 = r1.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r7 = "update_time"
            int r7 = r1.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lc1
            if (r5 == r3) goto L8e
            java.lang.String r5 = r1.getString(r5)     // Catch: java.lang.Throwable -> Lc1
            r4.Sg(r5)     // Catch: java.lang.Throwable -> Lc1
        L8e:
            if (r6 == r3) goto L97
            java.lang.String r5 = r1.getString(r6)     // Catch: java.lang.Throwable -> Lc1
            r4.tN(r5)     // Catch: java.lang.Throwable -> Lc1
        L97:
            if (r7 == r3) goto La4
            long r5 = r1.getLong(r7)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lc1
            r4.YFl(r3)     // Catch: java.lang.Throwable -> Lc1
        La4:
            r0.add(r4)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r3 = r10.tN     // Catch: java.lang.Throwable -> Lc1
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Lc1
            android.util.LruCache<java.lang.String, com.bytedance.sdk.openadsdk.core.eT.YFl.YFl> r5 = r10.AlY     // Catch: java.lang.Throwable -> Lb1
            r5.put(r2, r4)     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb1
            goto Lb7
        Lb1:
            r11 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc1
            throw r11     // Catch: java.lang.Throwable -> Lc1
        Lb4:
            r11 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc1
            throw r11     // Catch: java.lang.Throwable -> Lc1
        Lb7:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> Lc1
            if (r2 != 0) goto L2e
        Lbd:
            r1.close()
            goto Lca
        Lc1:
            r11 = move-exception
            java.lang.String r2 = "UGTmplDbHelper"
            java.lang.String r3 = "getUgenTemplateFormRit error"
            com.bytedance.sdk.component.utils.YoT.YFl(r2, r3, r11)     // Catch: java.lang.Throwable -> Lcb
            goto Lbd
        Lca:
            return r0
        Lcb:
            r11 = move-exception
            r1.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.eT.YFl.tN.YFl(java.lang.String):java.util.Set");
    }

    public void YFl(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                Sg(str);
                com.bytedance.sdk.openadsdk.multipro.YFl.YFl.YFl(lG.YFl(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }
}
