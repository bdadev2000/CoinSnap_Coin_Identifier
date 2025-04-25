package com.glority.base.utils;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SHAHelper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, d2 = {"Lcom/glority/base/utils/SHAHelper;", "", "<init>", "()V", "fileToSHA1", "", "filePath", "convertHashToString", "hashBytes", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class SHAHelper {
    public static final int $stable = 0;
    public static final SHAHelper INSTANCE = new SHAHelper();

    private SHAHelper() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        if (r1 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String fileToSHA1(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L3c
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L3c
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L3c
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L3d
            java.lang.String r2 = "SHA-1"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L3d
        L12:
            r3 = r1
            java.io.FileInputStream r3 = (java.io.FileInputStream) r3     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L3d
            int r3 = r3.read(r6)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L3d
            if (r3 <= 0) goto L1f
            r4 = 0
            r2.update(r6, r4, r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L3d
        L1f:
            r4 = -1
            if (r3 == r4) goto L23
            goto L12
        L23:
            byte[] r6 = r2.digest()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L3d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L3d
            java.lang.String r0 = r5.convertHashToString(r6)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L3d
        L2e:
            r1.close()     // Catch: java.lang.Exception -> L40
            goto L40
        L32:
            r6 = move-exception
            r0 = r1
            goto L36
        L35:
            r6 = move-exception
        L36:
            if (r0 == 0) goto L3b
            r0.close()     // Catch: java.lang.Exception -> L3b
        L3b:
            throw r6
        L3c:
            r1 = r0
        L3d:
            if (r1 == 0) goto L40
            goto L2e
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.base.utils.SHAHelper.fileToSHA1(java.lang.String):java.lang.String");
    }

    private final String convertHashToString(byte[] hashBytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            String num = Integer.toString(b + 256, 16);
            Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
            String substring = num.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            sb.append(lowerCase);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
