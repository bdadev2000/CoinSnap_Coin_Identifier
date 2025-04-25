package com.adjust.sdk;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class InstallReferrerHuawei {
    private static final int COLUMN_INDEX_CLICK_TIME = 1;
    private static final int COLUMN_INDEX_INSTALL_TIME = 2;
    private static final int COLUMN_INDEX_REFERRER = 0;
    private static final int COLUMN_INDEX_TRACK_ID = 4;
    private static final String REFERRER_PROVIDER_AUTHORITY = "com.huawei.appmarket.commondata";
    private static final String REFERRER_PROVIDER_URI = "content://com.huawei.appmarket.commondata/item/5";
    private Context context;
    private final InstallReferrerReadListener referrerCallback;
    private ILogger logger = AdjustFactory.getLogger();
    private final AtomicBoolean shouldTryToRead = new AtomicBoolean(true);

    public InstallReferrerHuawei(Context context, InstallReferrerReadListener installReferrerReadListener) {
        this.context = context;
        this.referrerCallback = installReferrerReadListener;
    }

    private boolean isValidReferrerHuaweiAds(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    private boolean isValidReferrerHuaweiAppGallery(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bb, code lost:
    
        if (r10 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d5, code lost:
    
        r19.shouldTryToRead.set(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00da, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d2, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d0, code lost:
    
        if (0 == 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void readReferrer() {
        /*
            r19 = this;
            r1 = r19
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.shouldTryToRead
            boolean r0 = r0.get()
            r2 = 0
            if (r0 != 0) goto L15
            com.adjust.sdk.ILogger r0 = r1.logger
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Should not try to read Install referrer Huawei"
            r0.debug(r3, r2)
            return
        L15:
            android.content.Context r0 = r1.context
            java.lang.String r3 = "com.huawei.appmarket.commondata"
            boolean r0 = com.adjust.sdk.Util.resolveContentProvider(r0, r3)
            if (r0 != 0) goto L20
            return
        L20:
            java.lang.String r0 = "content://com.huawei.appmarket.commondata/item/5"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Context r3 = r1.context
            android.content.ContentResolver r3 = r3.getContentResolver()
            android.content.Context r4 = r1.context
            java.lang.String r4 = r4.getPackageName()
            java.lang.String[] r7 = new java.lang.String[]{r4}
            r6 = 0
            r8 = 0
            r9 = 1
            r10 = 0
            r5 = 0
            r4 = r0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            r3 = 2
            if (r10 == 0) goto La4
            boolean r4 = r10.moveToFirst()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            if (r4 == 0) goto La4
            java.lang.String r12 = r10.getString(r2)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            r0 = 4
            java.lang.String r0 = r10.getString(r0)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            com.adjust.sdk.ILogger r4 = r1.logger     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            java.lang.String r5 = "InstallReferrerHuawei reads index_referrer[%s] index_track_id[%s]"
            java.lang.Object[] r6 = new java.lang.Object[]{r12, r0}     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            r4.debug(r5, r6)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            java.lang.String r4 = r10.getString(r9)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            java.lang.String r3 = r10.getString(r3)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            com.adjust.sdk.ILogger r5 = r1.logger     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            java.lang.String r6 = "InstallReferrerHuawei reads clickTime[%s] installTime[%s]"
            java.lang.Object[] r7 = new java.lang.Object[]{r4, r3}     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            r5.debug(r6, r7)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            long r4 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            long r17 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            boolean r3 = r1.isValidReferrerHuaweiAds(r12)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            if (r3 == 0) goto L8e
            com.adjust.sdk.ReferrerDetails r3 = new com.adjust.sdk.ReferrerDetails     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            r11 = r3
            r13 = r4
            r15 = r17
            r11.<init>(r12, r13, r15)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            com.adjust.sdk.InstallReferrerReadListener r6 = r1.referrerCallback     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            java.lang.String r7 = "huawei_ads"
            r6.onInstallReferrerRead(r3, r7)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
        L8e:
            boolean r3 = r1.isValidReferrerHuaweiAppGallery(r0)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            if (r3 == 0) goto Lbb
            com.adjust.sdk.ReferrerDetails r3 = new com.adjust.sdk.ReferrerDetails     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            r13 = r3
            r14 = r0
            r15 = r4
            r13.<init>(r14, r15, r17)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            com.adjust.sdk.InstallReferrerReadListener r0 = r1.referrerCallback     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            java.lang.String r4 = "huawei_app_gallery"
            r0.onInstallReferrerRead(r3, r4)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            goto Lbb
        La4:
            com.adjust.sdk.ILogger r4 = r1.logger     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            java.lang.String r5 = "InstallReferrerHuawei fail to read referrer for package [%s] and content uri [%s]"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            android.content.Context r6 = r1.context     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            r3[r2] = r6     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            r3[r9] = r0     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
            r4.debug(r5, r3)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc0
        Lbb:
            if (r10 == 0) goto Ld5
            goto Ld2
        Lbe:
            r0 = move-exception
            goto Ldb
        Lc0:
            r0 = move-exception
            com.adjust.sdk.ILogger r3 = r1.logger     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = "InstallReferrerHuawei error [%s]"
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> Lbe
            r5[r2] = r0     // Catch: java.lang.Throwable -> Lbe
            r3.debug(r4, r5)     // Catch: java.lang.Throwable -> Lbe
            if (r10 == 0) goto Ld5
        Ld2:
            r10.close()
        Ld5:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.shouldTryToRead
            r0.set(r2)
            return
        Ldb:
            if (r10 == 0) goto Le0
            r10.close()
        Le0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.InstallReferrerHuawei.readReferrer():void");
    }
}
