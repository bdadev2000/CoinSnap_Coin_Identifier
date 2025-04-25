package androidx.core.app;

/* loaded from: classes8.dex */
public class AppLocalesStorageHelper {
    static final String APPLICATION_LOCALES_RECORD_FILE = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";
    static final boolean DEBUG = false;
    static final String LOCALE_RECORD_ATTRIBUTE_TAG = "application_locales";
    static final String LOCALE_RECORD_FILE_TAG = "locales";
    static final String TAG = "AppLocalesStorageHelper";
    private static final Object sAppLocaleStorageSync = new Object();

    private AppLocalesStorageHelper() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r2 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r1.isEmpty() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r8.deleteFile(androidx.core.app.AppLocalesStorageHelper.APPLICATION_LOCALES_RECORD_FILE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003b, code lost:
    
        r1 = r3.getAttributeValue(null, androidx.core.app.AppLocalesStorageHelper.LOCALE_RECORD_ATTRIBUTE_TAG);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0051, code lost:
    
        if (r2 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String readLocales(android.content.Context r8) {
        /*
            java.lang.Object r0 = androidx.core.app.AppLocalesStorageHelper.sAppLocaleStorageSync
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.io.FileNotFoundException -> L68 java.lang.Throwable -> L6a
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
            r6 = 1
            if (r5 == r6) goto L42
            r6 = 3
            if (r5 != r6) goto L28
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
            if (r7 <= r4) goto L42
        L28:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L2e
            goto L18
        L2e:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L4a
        L42:
            if (r2 == 0) goto L54
        L44:
            r2.close()     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L6a
            goto L54
        L48:
            r8 = move-exception
            goto L62
        L4a:
            java.lang.String r3 = "AppLocalesStorageHelper"
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L54
            goto L44
        L54:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6a
            if (r2 != 0) goto L5b
            goto L60
        L5b:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L6a
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            return r1
        L62:
            if (r2 == 0) goto L67
            r2.close()     // Catch: java.io.IOException -> L67 java.lang.Throwable -> L6a
        L67:
            throw r8     // Catch: java.lang.Throwable -> L6a
        L68:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            return r1
        L6a:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.AppLocalesStorageHelper.readLocales(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r5 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
    
        if (r5 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void persistLocales(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = androidx.core.app.AppLocalesStorageHelper.sAppLocaleStorageSync
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L12
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L12:
            r1 = 1
            r2 = 0
            java.lang.String r3 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileOutputStream r5 = r5.openFileOutput(r3, r2)     // Catch: java.io.FileNotFoundException -> L5a java.lang.Throwable -> L6d
            org.xmlpull.v1.XmlSerializer r2 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> L6d
            r3 = 0
            r2.setOutput(r5, r3)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            java.lang.String r4 = "UTF-8"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            r2.startDocument(r4, r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            java.lang.String r1 = "locales"
            r2.startTag(r3, r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            java.lang.String r1 = "application_locales"
            r2.attribute(r3, r1, r6)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            java.lang.String r6 = "locales"
            r2.endTag(r3, r6)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            r2.endDocument()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            if (r5 == 0) goto L52
        L41:
            r5.close()     // Catch: java.io.IOException -> L52 java.lang.Throwable -> L6d
            goto L52
        L45:
            r6 = move-exception
            goto L54
        L47:
            r6 = move-exception
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = "Storing App Locales : Failed to persist app-locales in storage "
            android.util.Log.w(r1, r2, r6)     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L52
            goto L41
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L54:
            if (r5 == 0) goto L59
            r5.close()     // Catch: java.io.IOException -> L59 java.lang.Throwable -> L6d
        L59:
            throw r6     // Catch: java.lang.Throwable -> L6d
        L5a:
            java.lang.String r5 = "AppLocalesStorageHelper"
            java.lang.String r6 = "Storing App Locales : FileNotFoundException: Cannot open file %s for writing "
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r1[r2] = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = java.lang.String.format(r6, r1)     // Catch: java.lang.Throwable -> L6d
            android.util.Log.w(r5, r6)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L6d:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.AppLocalesStorageHelper.persistLocales(android.content.Context, java.lang.String):void");
    }
}
