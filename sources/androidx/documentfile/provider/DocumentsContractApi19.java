package androidx.documentfile.provider;

import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes4.dex */
class DocumentsContractApi19 {
    /* JADX WARN: Removed duplicated region for block: B:40:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r8, android.net.Uri r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "Failed query: "
            android.content.ContentResolver r1 = r8.getContentResolver()
            r8 = 0
            java.lang.String[] r3 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r9
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            boolean r10 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            if (r10 == 0) goto L2e
            r10 = 0
            boolean r1 = r9.isNull(r10)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            if (r1 != 0) goto L2e
            java.lang.String r8 = r9.getString(r10)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r9.close()     // Catch: java.lang.Exception -> L27 java.lang.RuntimeException -> L28
        L27:
            return r8
        L28:
            r8 = move-exception
            throw r8
        L2a:
            r8 = move-exception
            goto L55
        L2c:
            r10 = move-exception
            goto L3b
        L2e:
            r9.close()     // Catch: java.lang.Exception -> L31 java.lang.RuntimeException -> L32
        L31:
            return r8
        L32:
            r8 = move-exception
            throw r8
        L34:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L55
        L39:
            r10 = move-exception
            r9 = r8
        L3b:
            java.lang.String r1 = "DocumentFile"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            r2.append(r10)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Throwable -> L2a
            android.util.Log.w(r1, r10)     // Catch: java.lang.Throwable -> L2a
            if (r9 == 0) goto L54
            r9.close()     // Catch: java.lang.RuntimeException -> L52 java.lang.Exception -> L54
            goto L54
        L52:
            r8 = move-exception
            throw r8
        L54:
            return r8
        L55:
            if (r9 == 0) goto L5d
            r9.close()     // Catch: java.lang.RuntimeException -> L5b java.lang.Exception -> L5d
            goto L5d
        L5b:
            r8 = move-exception
            throw r8
        L5d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.documentfile.provider.DocumentsContractApi19.a(android.content.Context, android.net.Uri, java.lang.String):java.lang.String");
    }
}
