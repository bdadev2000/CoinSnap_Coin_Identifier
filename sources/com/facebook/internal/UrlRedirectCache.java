package com.facebook.internal;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FileLruCache;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class UrlRedirectCache {

    @NotNull
    public static final UrlRedirectCache INSTANCE = new UrlRedirectCache();

    @NotNull
    private static final String redirectContentTag;

    @NotNull
    private static final String tag;

    @Nullable
    private static FileLruCache urlRedirectFileLruCache;

    static {
        String c2 = g0.a(UrlRedirectCache.class).c();
        if (c2 == null) {
            c2 = "UrlRedirectCache";
        }
        tag = c2;
        redirectContentTag = p0.a.z0("_Redirect", c2);
    }

    private UrlRedirectCache() {
    }

    public static final void cacheUriRedirect(@Nullable Uri uri, @Nullable Uri uri2) {
        if (uri == null || uri2 == null) {
            return;
        }
        OutputStream outputStream = null;
        try {
            try {
                FileLruCache cache = getCache();
                String uri3 = uri.toString();
                p0.a.r(uri3, "fromUri.toString()");
                outputStream = cache.openPutStream(uri3, redirectContentTag);
                String uri4 = uri2.toString();
                p0.a.r(uri4, "toUri.toString()");
                byte[] bytes = uri4.getBytes(z0.a.f31458a);
                p0.a.r(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
            } catch (IOException e) {
                Logger.Companion.log(LoggingBehavior.CACHE, 4, tag, p0.a.z0(e.getMessage(), "IOException when accessing cache: "));
            }
        } finally {
            Utility.closeQuietly(outputStream);
        }
    }

    public static final void clearCache() {
        try {
            getCache().clearCache();
        } catch (IOException e) {
            Logger.Companion.log(LoggingBehavior.CACHE, 5, tag, p0.a.z0(e.getMessage(), "clearCache failed "));
        }
    }

    @NotNull
    public static final synchronized FileLruCache getCache() throws IOException {
        FileLruCache fileLruCache;
        synchronized (UrlRedirectCache.class) {
            try {
                fileLruCache = urlRedirectFileLruCache;
                if (fileLruCache == null) {
                    fileLruCache = new FileLruCache(tag, new FileLruCache.Limits());
                }
                urlRedirectFileLruCache = fileLruCache;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileLruCache;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (p0.a.g(r3, r10) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        r5 = r6;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        com.facebook.internal.Logger.Companion.log(com.facebook.LoggingBehavior.CACHE, 6, com.facebook.internal.UrlRedirectCache.tag, "A loop detected in UrlRedirectCache");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
    
        com.facebook.internal.Utility.closeQuietly(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        return null;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0083: MOVE (r0 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:48:0x0083 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.net.Uri getRedirectedUri(@org.jetbrains.annotations.Nullable android.net.Uri r10) {
        /*
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.lang.String r10 = r10.toString()
            java.lang.String r1 = "uri.toString()"
            p0.a.r(r10, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r1.add(r10)
            com.facebook.internal.FileLruCache r2 = getCache()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.lang.String r3 = com.facebook.internal.UrlRedirectCache.redirectContentTag     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.io.InputStream r3 = r2.get(r10, r3)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            r4 = 0
            r5 = r0
            r6 = r4
        L22:
            if (r3 == 0) goto L87
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L85
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L85
            r3 = 128(0x80, float:1.8E-43)
            char[] r5 = new char[r3]     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            r7.<init>()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            int r8 = r6.read(r5, r4, r3)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
        L36:
            if (r8 <= 0) goto L47
            r7.append(r5, r4, r8)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            int r8 = r6.read(r5, r4, r3)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            goto L36
        L40:
            r10 = move-exception
            r0 = r6
            goto Laf
        L44:
            r10 = move-exception
            r5 = r6
            goto L99
        L47:
            com.facebook.internal.Utility.closeQuietly(r6)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            java.lang.String r5 = "urlBuilder.toString()"
            p0.a.r(r3, r5)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            boolean r5 = r1.contains(r3)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            r7 = 1
            if (r5 == 0) goto L73
            boolean r1 = p0.a.g(r3, r10)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            if (r1 == 0) goto L63
            r5 = r6
            r6 = r7
            goto L87
        L63:
            com.facebook.internal.Logger$Companion r10 = com.facebook.internal.Logger.Companion     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            com.facebook.LoggingBehavior r1 = com.facebook.LoggingBehavior.CACHE     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            java.lang.String r2 = com.facebook.internal.UrlRedirectCache.tag     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            java.lang.String r3 = "A loop detected in UrlRedirectCache"
            r4 = 6
            r10.log(r1, r4, r2, r3)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            com.facebook.internal.Utility.closeQuietly(r6)
            return r0
        L73:
            r1.add(r3)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            java.lang.String r10 = com.facebook.internal.UrlRedirectCache.redirectContentTag     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            java.io.InputStream r10 = r2.get(r3, r10)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            r5 = r6
            r6 = r7
            r9 = r3
            r3 = r10
            r10 = r9
            goto L22
        L82:
            r10 = move-exception
            r0 = r5
            goto Laf
        L85:
            r10 = move-exception
            goto L99
        L87:
            if (r6 == 0) goto L91
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> L82 java.io.IOException -> L85
            com.facebook.internal.Utility.closeQuietly(r5)
            return r10
        L91:
            com.facebook.internal.Utility.closeQuietly(r5)
            goto Lae
        L95:
            r10 = move-exception
            goto Laf
        L97:
            r10 = move-exception
            r5 = r0
        L99:
            com.facebook.internal.Logger$Companion r1 = com.facebook.internal.Logger.Companion     // Catch: java.lang.Throwable -> L82
            com.facebook.LoggingBehavior r2 = com.facebook.LoggingBehavior.CACHE     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = com.facebook.internal.UrlRedirectCache.tag     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = "IOException when accessing cache: "
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L82
            java.lang.String r10 = p0.a.z0(r10, r4)     // Catch: java.lang.Throwable -> L82
            r4 = 4
            r1.log(r2, r4, r3, r10)     // Catch: java.lang.Throwable -> L82
            goto L91
        Lae:
            return r0
        Laf:
            com.facebook.internal.Utility.closeQuietly(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.UrlRedirectCache.getRedirectedUri(android.net.Uri):android.net.Uri");
    }
}
