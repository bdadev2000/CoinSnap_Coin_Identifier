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

/* loaded from: classes3.dex */
public final class n extends a<Campaign> {

    /* renamed from: a, reason: collision with root package name */
    private static n f15506a;

    private n(f fVar) {
        super(fVar);
    }

    public static synchronized n a(f fVar) {
        n nVar;
        synchronized (n.class) {
            try {
                if (f15506a == null) {
                    f15506a = new n(fVar);
                }
                nVar = f15506a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    public final synchronized void b(String str) {
        String[] strArr;
        try {
            strArr = new String[]{str};
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e4.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete(MimeTypes.BASE_TYPE_VIDEO, "video_url = ? ", strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.mbridge.msdk.foundation.entity.m a(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.n.a(java.lang.String):com.mbridge.msdk.foundation.entity.m");
    }

    private synchronized boolean b(String str, String str2) {
        String[] strArr;
        String str3;
        try {
            if (TextUtils.isEmpty(str2)) {
                str3 = "SELECT id FROM video WHERE video_url = ? ";
                strArr = new String[]{str};
            } else {
                strArr = new String[]{str, str2};
                str3 = "SELECT id FROM video WHERE video_url = ? AND id = ? ";
            }
            Cursor rawQuery = getReadableDatabase().rawQuery(str3, strArr);
            if (rawQuery != null && rawQuery.getCount() > 0) {
                try {
                    rawQuery.close();
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("VideoDao", e4.getLocalizedMessage());
                    }
                }
                return true;
            }
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Exception e9) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("VideoDao", e9.getLocalizedMessage());
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    public final synchronized long b(String str, long j7) {
        int i9 = -1;
        try {
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e4.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("total_size", Long.valueOf(j7));
        if (b(str, "")) {
            String[] strArr = {str};
            synchronized (new Object()) {
                i9 = getWritableDatabase().update(MimeTypes.BASE_TYPE_VIDEO, contentValues, "video_url = ? ", strArr);
            }
        }
        return i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        if (r0 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        if (r0 != null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.mbridge.msdk.foundation.entity.m a(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L87
            r0 = 0
            if (r7 == 0) goto La
            monitor-exit(r5)
            return r0
        La:
            com.mbridge.msdk.foundation.entity.m r7 = new com.mbridge.msdk.foundation.entity.m     // Catch: java.lang.Throwable -> L87
            r7.<init>()     // Catch: java.lang.Throwable -> L87
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = "SELECT * FROM video WHERE video_url = ? "
            android.database.sqlite.SQLiteDatabase r2 = r5.getReadableDatabase()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            android.database.Cursor r0 = r2.rawQuery(r1, r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            if (r0 == 0) goto L81
            int r6 = r0.getCount()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            if (r6 <= 0) goto L81
        L25:
            boolean r6 = r0.moveToNext()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            if (r6 == 0) goto L81
            java.lang.String r6 = "video_url"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            java.lang.String r6 = r0.getString(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            r7.b(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            java.lang.String r6 = "video_state"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            int r6 = r0.getInt(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            r7.a(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            java.lang.String r6 = "pregeress_size"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            long r1 = r0.getLong(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            r7.b(r1)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            java.lang.String r6 = "total_size"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            int r6 = r0.getInt(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            r7.b(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            java.lang.String r6 = "video_path"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            java.lang.String r6 = r0.getString(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            r7.a(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            java.lang.String r6 = "video_download_start"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            long r1 = r0.getLong(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r7.a(r1)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            goto L25
        L7d:
            r6 = move-exception
            goto L9b
        L7f:
            r6 = move-exception
            goto L89
        L81:
            if (r0 == 0) goto L99
        L83:
            r0.close()     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L99
            goto L99
        L87:
            r6 = move-exception
            goto La1
        L89:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L96
            java.lang.String r1 = "VideoDao"
            java.lang.String r6 = r6.getLocalizedMessage()     // Catch: java.lang.Throwable -> L7d
            com.mbridge.msdk.foundation.tools.ad.b(r1, r6)     // Catch: java.lang.Throwable -> L7d
        L96:
            if (r0 == 0) goto L99
            goto L83
        L99:
            monitor-exit(r5)
            return r7
        L9b:
            if (r0 == 0) goto La0
            r0.close()     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> La0
        La0:
            throw r6     // Catch: java.lang.Throwable -> L87
        La1:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.n.a(java.lang.String, java.lang.String):com.mbridge.msdk.foundation.entity.m");
    }

    public final synchronized void a(String str, long j7) {
        if (j7 == 0) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_download_start", Long.valueOf(j7 / 1000));
            if (b(str, "")) {
                getWritableDatabase().update(MimeTypes.BASE_TYPE_VIDEO, contentValues, "video_url = ? ", new String[]{str});
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e4.getLocalizedMessage());
            }
        }
    }

    public final synchronized long a(CampaignEx campaignEx, long j7, String str, int i9) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
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
                contentValues.put("total_size", Long.valueOf(j7));
                contentValues.put("video_state", Integer.valueOf(i9));
                contentValues.put("video_download_start", Long.valueOf(System.currentTimeMillis() / 1000));
                contentValues.put("ad_bid_token", campaignEx.getBidToken());
                if (!TextUtils.isEmpty(str)) {
                    contentValues.put("video_path", str);
                }
                if (b(campaignEx.getVideoUrlEncode(), campaignEx.getId())) {
                    return 0L;
                }
                return getWritableDatabase().insert(MimeTypes.BASE_TYPE_VIDEO, null, contentValues);
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("VideoDao", e4.getLocalizedMessage());
                }
                return -1L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long a(String str, long j7, int i9) {
        int i10 = -1;
        try {
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e4.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("pregeress_size", Long.valueOf(j7));
        contentValues.put("video_state", Integer.valueOf(i9));
        if (b(str, "")) {
            String[] strArr = {str};
            synchronized (new Object()) {
                i10 = getWritableDatabase().update(MimeTypes.BASE_TYPE_VIDEO, contentValues, "video_url = ? ", strArr);
            }
        }
        return i10;
    }
}
