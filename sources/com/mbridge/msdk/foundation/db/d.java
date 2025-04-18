package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.aj;

/* loaded from: classes4.dex */
public class d extends a<JumpLoaderResult> {
    public static final String a = "d";

    /* renamed from: b, reason: collision with root package name */
    private static d f13111b;

    private d(f fVar) {
        super(fVar);
    }

    public static synchronized d a(f fVar) {
        d dVar;
        synchronized (d.class) {
            if (f13111b == null) {
                f13111b = new d(fVar);
            }
            dVar = f13111b;
        }
        return dVar;
    }

    private synchronized boolean c(String str, String str2) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT id FROM campaignclick WHERE id= ? AND unitid= ?", new String[]{str, str2});
        if (rawQuery != null && rawQuery.getCount() > 0) {
            rawQuery.close();
            return true;
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0062, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r11 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
    
        if (r11 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        r11.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067 A[Catch: all -> 0x006b, TRY_ENTER, TryCatch #2 {, blocks: (B:20:0x0040, B:8:0x0049, B:33:0x0067, B:34:0x006a), top: B:3:0x0002 }] */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.mbridge.msdk.click.entity.JumpLoaderResult b(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.getReadableDatabase()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            java.lang.String r2 = "campaignclick"
            r3 = 0
            java.lang.String r4 = "id=? AND unitid=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r6 = 0
            r5[r6] = r11     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r11 = 1
            r5[r11] = r12     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
            if (r11 == 0) goto L47
            int r12 = r11.getCount()     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L63
            if (r12 <= 0) goto L47
            boolean r12 = r11.moveToFirst()     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L63
            if (r12 == 0) goto L47
            java.lang.String r12 = "result"
            int r12 = r11.getColumnIndex(r12)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L63
            java.lang.String r12 = r11.getString(r12)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L63
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L63
            if (r1 != 0) goto L47
            java.lang.Object r12 = com.mbridge.msdk.foundation.tools.aj.a(r12)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L63
            com.mbridge.msdk.click.entity.JumpLoaderResult r12 = (com.mbridge.msdk.click.entity.JumpLoaderResult) r12     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L63
            r11.close()     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r10)
            return r12
        L45:
            r12 = move-exception
            goto L51
        L47:
            if (r11 == 0) goto L61
        L49:
            r11.close()     // Catch: java.lang.Throwable -> L6b
            goto L61
        L4d:
            r12 = move-exception
            goto L65
        L4f:
            r12 = move-exception
            r11 = r0
        L51:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L5e
            java.lang.String r1 = com.mbridge.msdk.foundation.db.d.a     // Catch: java.lang.Throwable -> L63
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> L63
            com.mbridge.msdk.foundation.tools.ad.b(r1, r12)     // Catch: java.lang.Throwable -> L63
        L5e:
            if (r11 == 0) goto L61
            goto L49
        L61:
            monitor-exit(r10)
            return r0
        L63:
            r12 = move-exception
            r0 = r11
        L65:
            if (r0 == 0) goto L6a
            r0.close()     // Catch: java.lang.Throwable -> L6b
        L6a:
            throw r12     // Catch: java.lang.Throwable -> L6b
        L6b:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.d.b(java.lang.String, java.lang.String):com.mbridge.msdk.click.entity.JumpLoaderResult");
    }

    public final synchronized void a() {
        try {
            getWritableDatabase().delete("campaignclick", " ( " + System.currentTimeMillis() + " - ts) > cti", null);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b(a, e2.getMessage());
            }
        }
    }

    public final synchronized long a(CampaignEx campaignEx, String str) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            String a10 = aj.a(campaignEx.getJumpResult());
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", campaignEx.getId());
            contentValues.put("unitid", str);
            contentValues.put("result", a10);
            contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval() * 1000));
            contentValues.put(CampaignEx.JSON_KEY_PACKAGE_NAME, campaignEx.getPackageName());
            com.mbridge.msdk.c.g b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(System.currentTimeMillis()));
            if (b3 != null && b3.X() > 0) {
                contentValues.put("cpei", Integer.valueOf(b3.X() * 1000));
            }
            if (b3 != null && b3.Y() > 0) {
                contentValues.put("cpoci", Integer.valueOf(b3.Y() * 1000));
            }
            if (c(campaignEx.getId(), str)) {
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                return getWritableDatabase().update("campaignclick", contentValues, "id = ? AND unitid = ? ", new String[]{campaignEx.getId(), str});
            }
            return getWritableDatabase().insert("campaignclick", null, contentValues);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b(a, e2.getMessage());
            }
            return -1L;
        }
    }

    public final synchronized boolean a(String str, String str2) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT id FROM campaignclick WHERE id= ? AND unitid= ? AND cti + ts > " + System.currentTimeMillis(), new String[]{str, str2});
            if (rawQuery != null && rawQuery.getCount() > 0) {
                rawQuery.close();
                return true;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return false;
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b(a, e2.getMessage());
            }
            return false;
        }
    }
}
