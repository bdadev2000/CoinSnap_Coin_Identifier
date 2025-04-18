package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.List;

/* loaded from: classes4.dex */
public class b extends a {
    private static volatile b a;

    private b(f fVar) {
        super(fVar);
    }

    public static b a(Context context) {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b(g.a(context));
                }
            }
        }
        return a;
    }

    public final int b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || getWritableDatabase() == null) {
            return 0;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_replace", (Integer) 1);
            return getWritableDatabase().update("bid_replace_campaign", contentValues, "bid_unit_id = ? AND expect_bid_token = ?", new String[]{str2, str});
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public final void a(String str, List<CampaignEx> list) {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return;
        }
        try {
            String requestId = list.get(0).getRequestId();
            String encryptPrice = list.get(0).getEncryptPrice();
            String campaignUnitId = list.get(0).getCampaignUnitId();
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("bid_unit_id", campaignUnitId);
            contentValues.put("expect_bid_token", str);
            contentValues.put("expect_encrypt_price", "");
            contentValues.put("real_request_id", requestId);
            contentValues.put("real_encrypt_price", encryptPrice);
            contentValues.put("real_token_rule", (Integer) 1);
            contentValues.put("is_replace", (Integer) 0);
            writableDatabase.insert("bid_replace_campaign", null, contentValues);
            ad.b("HBOPTIMIZE", "插入数据到对应关系表 期望 bidToken 值" + str + "+ 用于替换期望Offer 的RequestId " + requestId);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        if (r1 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if (0 == 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.mbridge.msdk.foundation.entity.d> a(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 == 0) goto Lc
            return r0
        Lc:
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 == 0) goto L13
            return r0
        L13:
            r1 = 0
            java.lang.Object r2 = new java.lang.Object     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            r2.<init>()     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            monitor-enter(r2)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            android.database.sqlite.SQLiteDatabase r3 = r8.getReadableDatabase()     // Catch: java.lang.Throwable -> La3
            java.lang.String r4 = "SELECT * FROM bid_replace_campaign WHERE bid_unit_id = ? AND real_request_id = ?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> La3
            r6 = 0
            r5[r6] = r9     // Catch: java.lang.Throwable -> La3
            r9 = 1
            r5[r9] = r10     // Catch: java.lang.Throwable -> La3
            android.database.Cursor r1 = r3.rawQuery(r4, r5)     // Catch: java.lang.Throwable -> La3
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto La0
            int r9 = r1.getCount()     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            if (r9 <= 0) goto La0
        L36:
            boolean r9 = r1.moveToNext()     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            if (r9 == 0) goto La0
            com.mbridge.msdk.foundation.entity.d r9 = new com.mbridge.msdk.foundation.entity.d     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            r9.<init>()     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            java.lang.String r10 = "bid_unit_id"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            java.lang.String r2 = "expect_bid_token"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            java.lang.String r3 = "expect_encrypt_price"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            java.lang.String r4 = "real_request_id"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            java.lang.String r5 = "real_encrypt_price"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            java.lang.String r5 = r1.getString(r5)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            java.lang.String r6 = "real_token_rule"
            int r6 = r1.getColumnIndex(r6)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            int r6 = r1.getInt(r6)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            java.lang.String r7 = "is_replace"
            int r7 = r1.getColumnIndex(r7)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            int r7 = r1.getInt(r7)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            r9.a(r10)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            r9.b(r2)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            r9.c(r3)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            r9.e(r4)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            r9.d(r5)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            r9.b(r6)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            r9.a(r7)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            r0.add(r9)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
            goto L36
        La0:
            if (r1 == 0) goto Lb7
            goto Lb4
        La3:
            r9 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
            throw r9     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La8
        La6:
            r9 = move-exception
            goto Lb8
        La8:
            r9 = move-exception
            java.lang.String r10 = "BidReplaceCampaignDao"
            java.lang.String r9 = r9.getLocalizedMessage()     // Catch: java.lang.Throwable -> La6
            com.mbridge.msdk.foundation.tools.ad.b(r10, r9)     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto Lb7
        Lb4:
            r1.close()
        Lb7:
            return r0
        Lb8:
            if (r1 == 0) goto Lbd
            r1.close()
        Lbd:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.b.a(java.lang.String, java.lang.String):java.util.List");
    }

    public final int a() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return 0;
            }
            return writableDatabase.delete("bid_replace_campaign", "is_replace = 0", null);
        } catch (Exception e2) {
            ad.b("BidReplaceCampaignDao", e2.getLocalizedMessage());
            return 0;
        }
    }

    public final int a(String str) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return 0;
            }
            return writableDatabase.delete("bid_replace_campaign", "real_request_id = ? AND is_replace = 1", new String[]{str});
        } catch (Exception e2) {
            ad.b("BidReplaceCampaignDao", e2.getLocalizedMessage());
            return 0;
        }
    }

    public final int a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || getWritableDatabase() == null) {
            return 0;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("expect_encrypt_price", str3);
            return getWritableDatabase().update("bid_replace_campaign", contentValues, "bid_unit_id = ? AND expect_bid_token = ?", new String[]{str2, str});
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }
}
