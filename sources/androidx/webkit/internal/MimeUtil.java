package androidx.webkit.internal;

import java.net.URLConnection;

/* loaded from: classes7.dex */
class MimeUtil {
    MimeUtil() {
    }

    public static String getMimeFromFileName(String str) {
        if (str == null) {
            return null;
        }
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return guessContentTypeFromName != null ? guessContentTypeFromName : guessHardcodedMime(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x004f, code lost:
    
        if (r5.equals("mhtml") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String guessHardcodedMime(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.webkit.internal.MimeUtil.guessHardcodedMime(java.lang.String):java.lang.String");
    }
}
