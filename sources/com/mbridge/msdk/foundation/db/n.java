package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes4.dex */
public final class n extends a<Campaign> {
    private static n a;

    private n(f fVar) {
        super(fVar);
    }

    public static synchronized n a(f fVar) {
        n nVar;
        synchronized (n.class) {
            if (a == null) {
                a = new n(fVar);
            }
            nVar = a;
        }
        return nVar;
    }

    public final synchronized void b(String str) {
        String[] strArr;
        try {
            strArr = new String[]{str};
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e2.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete(MimeTypes.BASE_TYPE_VIDEO, "video_url = ? ", strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    public final synchronized com.mbridge.msdk.foundation.entity.m a(String str) {
        com.mbridge.msdk.foundation.entity.m mVar;
        Exception e2;
        Cursor cursor;
        ?? r12 = 0;
        r1 = null;
        com.mbridge.msdk.foundation.entity.m mVar2 = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                cursor = getReadableDatabase().rawQuery("SELECT * FROM video WHERE video_url = ? ", new String[]{str});
                if (cursor != null) {
                    try {
                        if (cursor.getCount() > 0) {
                            mVar = new com.mbridge.msdk.foundation.entity.m();
                            while (cursor.moveToNext()) {
                                try {
                                    mVar.b(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_URL)));
                                    mVar.a(cursor.getInt(cursor.getColumnIndex("video_state")));
                                    mVar.b(cursor.getLong(cursor.getColumnIndex("pregeress_size")));
                                    mVar.b(cursor.getInt(cursor.getColumnIndex("total_size")));
                                    mVar.a(cursor.getString(cursor.getColumnIndex("video_path")));
                                    mVar.a(cursor.getLong(cursor.getColumnIndex("video_download_start")) * 1000);
                                } catch (Exception e10) {
                                    e2 = e10;
                                    if (MBridgeConstans.DEBUG) {
                                        ad.b("VideoDao", e2.getLocalizedMessage());
                                    }
                                    if (cursor != null) {
                                        try {
                                            cursor.close();
                                        } catch (Exception e11) {
                                            if (MBridgeConstans.DEBUG) {
                                                ad.b("VideoDao", e11.getLocalizedMessage());
                                            }
                                        }
                                    }
                                    mVar2 = mVar;
                                    return mVar2;
                                }
                            }
                            mVar2 = mVar;
                        }
                    } catch (Exception e12) {
                        e2 = e12;
                        mVar = null;
                    }
                }
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Exception e13) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("VideoDao", e13.getLocalizedMessage());
                        }
                    }
                }
            } catch (Exception e14) {
                mVar = null;
                e2 = e14;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                if (r12 != 0) {
                    try {
                        r12.close();
                    } catch (Exception e15) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("VideoDao", e15.getLocalizedMessage());
                        }
                    }
                }
                throw th;
            }
            return mVar2;
        } catch (Throwable th3) {
            th = th3;
            r12 = str;
        }
    }

    private synchronized boolean b(String str, String str2) {
        String str3;
        String[] strArr;
        if (TextUtils.isEmpty(str2)) {
            str3 = "SELECT id FROM video WHERE video_url = ? ";
            strArr = new String[]{str};
        } else {
            String[] strArr2 = {str, str2};
            str3 = "SELECT id FROM video WHERE video_url = ? AND id = ? ";
            strArr = strArr2;
        }
        Cursor rawQuery = getReadableDatabase().rawQuery(str3, strArr);
        if (rawQuery != null && rawQuery.getCount() > 0) {
            try {
                rawQuery.close();
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("VideoDao", e2.getLocalizedMessage());
                }
            }
            return true;
        }
        if (rawQuery != null) {
            try {
                rawQuery.close();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("VideoDao", e10.getLocalizedMessage());
                }
            }
        }
        return false;
    }

    public final synchronized long b(String str, long j3) {
        int i10 = -1;
        try {
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e2.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("total_size", Long.valueOf(j3));
        if (b(str, "")) {
            String[] strArr = {str};
            synchronized (new Object()) {
                i10 = getWritableDatabase().update(MimeTypes.BASE_TYPE_VIDEO, contentValues, "video_url = ? ", strArr);
            }
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        if (r0 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
    
        if (r0 != null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.mbridge.msdk.foundation.entity.m a(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> La0
            r0 = 0
            if (r7 == 0) goto La
            monitor-exit(r5)
            return r0
        La:
            com.mbridge.msdk.foundation.entity.m r7 = new com.mbridge.msdk.foundation.entity.m     // Catch: java.lang.Throwable -> La0
            r7.<init>()     // Catch: java.lang.Throwable -> La0
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> La0
            r2 = 0
            r1[r2] = r6     // Catch: java.lang.Throwable -> La0
            java.lang.String r6 = "SELECT * FROM video WHERE video_url = ? "
            android.database.sqlite.SQLiteDatabase r2 = r5.getReadableDatabase()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            android.database.Cursor r0 = r2.rawQuery(r6, r1)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            if (r0 == 0) goto L7f
            int r6 = r0.getCount()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            if (r6 <= 0) goto L7f
        L27:
            boolean r6 = r0.moveToNext()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            if (r6 == 0) goto L7f
            java.lang.String r6 = "video_url"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.String r6 = r0.getString(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r7.b(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.String r6 = "video_state"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            int r6 = r0.getInt(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r7.a(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.String r6 = "pregeress_size"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            long r1 = r0.getLong(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r7.b(r1)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.String r6 = "total_size"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            int r6 = r0.getInt(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r7.b(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.String r6 = "video_path"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.String r6 = r0.getString(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r7.a(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.lang.String r6 = "video_download_start"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            long r1 = r0.getLong(r6)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r7.a(r1)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            goto L27
        L7f:
            if (r0 == 0) goto L98
        L81:
            r0.close()     // Catch: java.lang.Exception -> L98 java.lang.Throwable -> La0
            goto L98
        L85:
            r6 = move-exception
            goto L9a
        L87:
            r6 = move-exception
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L95
            java.lang.String r1 = "VideoDao"
            java.lang.String r6 = r6.getLocalizedMessage()     // Catch: java.lang.Throwable -> L85
            com.mbridge.msdk.foundation.tools.ad.b(r1, r6)     // Catch: java.lang.Throwable -> L85
        L95:
            if (r0 == 0) goto L98
            goto L81
        L98:
            monitor-exit(r5)
            return r7
        L9a:
            if (r0 == 0) goto L9f
            r0.close()     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> La0
        L9f:
            throw r6     // Catch: java.lang.Throwable -> La0
        La0:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.n.a(java.lang.String, java.lang.String):com.mbridge.msdk.foundation.entity.m");
    }

    public final synchronized void a(String str, long j3) {
        if (j3 == 0) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_download_start", Long.valueOf(j3 / 1000));
            if (b(str, "")) {
                getWritableDatabase().update(MimeTypes.BASE_TYPE_VIDEO, contentValues, "video_url = ? ", new String[]{str});
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e2.getLocalizedMessage());
            }
        }
    }

    public final synchronized long a(CampaignEx campaignEx, long j3, String str, int i10) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            if (getWritableDatabase() == null) {
                return -1L;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("unitid", campaignEx.getCampaignUnitId());
            contentValues.put("id", campaignEx.getId());
            contentValues.put(CampaignEx.JSON_KEY_PACKAGE_NAME, campaignEx.getPackageName());
            contentValues.put("app_name", campaignEx.getAppName());
            contentValues.put("app_desc", campaignEx.getAppDesc());
            contentValues.put(CampaignEx.JSON_KEY_APP_SIZE, campaignEx.getSize());
            contentValues.put(CampaignEx.JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
            contentValues.put(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, campaignEx.getImageUrl());
            contentValues.put(CampaignEx.JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
            contentValues.put(CampaignEx.JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
            contentValues.put(DownloadModel.DOWNLOAD_URL, campaignEx.getClickURL());
            contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
            contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(campaignEx.getTimestamp()));
            contentValues.put("template", Integer.valueOf(campaignEx.getTemplate()));
            contentValues.put(CampaignEx.JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
            contentValues.put(CampaignEx.JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
            contentValues.put(CampaignEx.JSON_KEY_LINK_TYPE, Integer.valueOf(campaignEx.getLinkType()));
            contentValues.put("star", Double.valueOf(campaignEx.getRating()));
            contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval()));
            contentValues.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(campaignEx.getCacheLevel()));
            contentValues.put("adSource", Integer.valueOf(campaignEx.getType()));
            contentValues.put("ad_call", campaignEx.getAdCall());
            contentValues.put("fc_a", Integer.valueOf(campaignEx.getFca()));
            contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
            contentValues.put(CampaignEx.JSON_KEY_VIDEO_URL, campaignEx.getVideoUrlEncode());
            contentValues.put("total_size", Long.valueOf(j3));
            contentValues.put("video_state", Integer.valueOf(i10));
            contentValues.put("video_download_start", Long.valueOf(System.currentTimeMillis() / 1000));
            contentValues.put("ad_bid_token", campaignEx.getBidToken());
            if (!TextUtils.isEmpty(str)) {
                contentValues.put("video_path", str);
            }
            if (b(campaignEx.getVideoUrlEncode(), campaignEx.getId())) {
                return 0L;
            }
            return getWritableDatabase().insert(MimeTypes.BASE_TYPE_VIDEO, null, contentValues);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e2.getLocalizedMessage());
            }
            return -1L;
        }
    }

    public final synchronized long a(String str, long j3, int i10) {
        int i11 = -1;
        try {
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e2.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("pregeress_size", Long.valueOf(j3));
        contentValues.put("video_state", Integer.valueOf(i10));
        if (b(str, "")) {
            String[] strArr = {str};
            synchronized (new Object()) {
                i11 = getWritableDatabase().update(MimeTypes.BASE_TYPE_VIDEO, contentValues, "video_url = ? ", strArr);
            }
        }
        return i11;
    }
}
