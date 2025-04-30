package com.adjust.sdk;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b9, code lost:
    
        if (r8 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d0, code lost:
    
        r15.shouldTryToRead.set(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cd, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cb, code lost:
    
        if (0 == 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void readReferrer() {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r15.shouldTryToRead
            boolean r0 = r0.get()
            r1 = 0
            if (r0 != 0) goto L13
            com.adjust.sdk.ILogger r0 = r15.logger
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Should not try to read Install referrer Huawei"
            r0.debug(r2, r1)
            return
        L13:
            android.content.Context r0 = r15.context
            java.lang.String r2 = "com.huawei.appmarket.commondata"
            boolean r0 = com.adjust.sdk.Util.resolveContentProvider(r0, r2)
            if (r0 != 0) goto L1e
            return
        L1e:
            java.lang.String r0 = "content://com.huawei.appmarket.commondata/item/5"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Context r2 = r15.context
            android.content.ContentResolver r2 = r2.getContentResolver()
            android.content.Context r3 = r15.context
            java.lang.String r3 = r3.getPackageName()
            java.lang.String[] r6 = new java.lang.String[]{r3}
            r5 = 0
            r7 = 0
            r8 = 0
            r4 = 0
            r3 = r0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            if (r8 == 0) goto La4
            boolean r2 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            if (r2 == 0) goto La4
            java.lang.String r10 = r8.getString(r1)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            r0 = 4
            java.lang.String r3 = r8.getString(r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            com.adjust.sdk.ILogger r0 = r15.logger     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            java.lang.String r2 = "InstallReferrerHuawei reads index_referrer[%s] index_track_id[%s]"
            java.lang.Object[] r4 = new java.lang.Object[]{r10, r3}     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            r0.debug(r2, r4)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            r0 = 1
            java.lang.String r0 = r8.getString(r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            r2 = 2
            java.lang.String r2 = r8.getString(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            com.adjust.sdk.ILogger r4 = r15.logger     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            java.lang.String r5 = "InstallReferrerHuawei reads clickTime[%s] installTime[%s]"
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r2}     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            r4.debug(r5, r6)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            long r4 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            long r6 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            boolean r0 = r15.isValidReferrerHuaweiAds(r10)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            if (r0 == 0) goto L90
            com.adjust.sdk.ReferrerDetails r0 = new com.adjust.sdk.ReferrerDetails     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            r9 = r0
            r11 = r4
            r13 = r6
            r9.<init>(r10, r11, r13)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            com.adjust.sdk.InstallReferrerReadListener r2 = r15.referrerCallback     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            java.lang.String r9 = "huawei_ads"
            r2.onInstallReferrerRead(r0, r9)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            goto L90
        L8c:
            r0 = move-exception
            goto Ld6
        L8e:
            r0 = move-exception
            goto Lbc
        L90:
            boolean r0 = r15.isValidReferrerHuaweiAppGallery(r3)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            if (r0 == 0) goto Lb9
            com.adjust.sdk.ReferrerDetails r0 = new com.adjust.sdk.ReferrerDetails     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            r2 = r0
            r2.<init>(r3, r4, r6)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            com.adjust.sdk.InstallReferrerReadListener r2 = r15.referrerCallback     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            java.lang.String r3 = "huawei_app_gallery"
            r2.onInstallReferrerRead(r0, r3)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            goto Lb9
        La4:
            com.adjust.sdk.ILogger r2 = r15.logger     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            java.lang.String r3 = "InstallReferrerHuawei fail to read referrer for package [%s] and content uri [%s]"
            android.content.Context r4 = r15.context     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0}     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
            r2.debug(r3, r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8e
        Lb9:
            if (r8 == 0) goto Ld0
            goto Lcd
        Lbc:
            com.adjust.sdk.ILogger r2 = r15.logger     // Catch: java.lang.Throwable -> L8c
            java.lang.String r3 = "InstallReferrerHuawei error [%s]"
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L8c
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L8c
            r2.debug(r3, r0)     // Catch: java.lang.Throwable -> L8c
            if (r8 == 0) goto Ld0
        Lcd:
            r8.close()
        Ld0:
            java.util.concurrent.atomic.AtomicBoolean r0 = r15.shouldTryToRead
            r0.set(r1)
            return
        Ld6:
            if (r8 == 0) goto Ldb
            r8.close()
        Ldb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.InstallReferrerHuawei.readReferrer():void");
    }
}
