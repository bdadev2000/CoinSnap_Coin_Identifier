package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.List;

/* loaded from: classes3.dex */
public class b extends a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f15476a;

    private b(f fVar) {
        super(fVar);
    }

    public static b a(Context context) {
        if (f15476a == null) {
            synchronized (b.class) {
                try {
                    if (f15476a == null) {
                        f15476a = new b(g.a(context));
                    }
                } finally {
                }
            }
        }
        return f15476a;
    }

    public final int b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || getWritableDatabase() == null) {
            return 0;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_replace", (Integer) 1);
            return getWritableDatabase().update("bid_replace_campaign", contentValues, "bid_unit_id = ? AND expect_bid_token = ?", new String[]{str2, str});
        } catch (Exception e4) {
            e4.printStackTrace();
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
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        if (0 == 0) goto L32;
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
            java.lang.Object r2 = new java.lang.Object     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r2.<init>()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            android.database.sqlite.SQLiteDatabase r3 = r8.getReadableDatabase()     // Catch: java.lang.Throwable -> La5
            java.lang.String r4 = "SELECT * FROM bid_replace_campaign WHERE bid_unit_id = ? AND real_request_id = ?"
            java.lang.String[] r9 = new java.lang.String[]{r9, r10}     // Catch: java.lang.Throwable -> La5
            android.database.Cursor r1 = r3.rawQuery(r4, r9)     // Catch: java.lang.Throwable -> La5
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto L9f
            int r9 = r1.getCount()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            if (r9 <= 0) goto L9f
        L31:
            boolean r9 = r1.moveToNext()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            if (r9 == 0) goto L9f
            com.mbridge.msdk.foundation.entity.d r9 = new com.mbridge.msdk.foundation.entity.d     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r9.<init>()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r10 = "bid_unit_id"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r2 = "expect_bid_token"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r3 = "expect_encrypt_price"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r4 = "real_request_id"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r5 = "real_encrypt_price"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r5 = r1.getString(r5)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r6 = "real_token_rule"
            int r6 = r1.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            int r6 = r1.getInt(r6)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            java.lang.String r7 = "is_replace"
            int r7 = r1.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            int r7 = r1.getInt(r7)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r9.a(r10)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r9.b(r2)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r9.c(r3)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r9.e(r4)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r9.d(r5)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r9.b(r6)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r9.a(r7)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            r0.add(r9)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
            goto L31
        L9b:
            r9 = move-exception
            goto Lb5
        L9d:
            r9 = move-exception
            goto La8
        L9f:
            if (r1 == 0) goto Lb4
        La1:
            r1.close()
            goto Lb4
        La5:
            r9 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            throw r9     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9d
        La8:
            java.lang.String r10 = "BidReplaceCampaignDao"
            java.lang.String r9 = r9.getLocalizedMessage()     // Catch: java.lang.Throwable -> L9b
            com.mbridge.msdk.foundation.tools.ad.b(r10, r9)     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto Lb4
            goto La1
        Lb4:
            return r0
        Lb5:
            if (r1 == 0) goto Lba
            r1.close()
        Lba:
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
        } catch (Exception e4) {
            ad.b("BidReplaceCampaignDao", e4.getLocalizedMessage());
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
        } catch (Exception e4) {
            ad.b("BidReplaceCampaignDao", e4.getLocalizedMessage());
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
        } catch (Exception e4) {
            e4.printStackTrace();
            return 0;
        }
    }
}
