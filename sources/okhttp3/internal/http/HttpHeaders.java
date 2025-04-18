package okhttp3.internal.http;

import d0.a;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import z0.m;

/* loaded from: classes3.dex */
public final class HttpHeaders {

    @NotNull
    private static final ByteString QUOTED_STRING_DELIMITERS;

    @NotNull
    private static final ByteString TOKEN_DELIMITERS;

    static {
        ByteString.Companion companion = ByteString.Companion;
        QUOTED_STRING_DELIMITERS = companion.encodeUtf8("\"\\");
        TOKEN_DELIMITERS = companion.encodeUtf8("\t ,=");
    }

    @a
    public static final boolean hasBody(@NotNull Response response) {
        p0.a.s(response, "response");
        return promisesBody(response);
    }

    @NotNull
    public static final List<Challenge> parseChallenges(@NotNull Headers headers, @NotNull String str) {
        p0.a.s(headers, "<this>");
        p0.a.s(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (m.S0(str, headers.name(i2), true)) {
                try {
                    readChallengeHeader(new Buffer().writeUtf8(headers.value(i2)), arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(@NotNull Response response) {
        p0.a.s(response, "<this>");
        if (p0.a.g(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1 && !m.S0("chunked", Response.header$default(response, com.google.common.net.HttpHeaders.TRANSFER_ENCODING, null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b5, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void readChallengeHeader(okio.Buffer r7, java.util.List<okhttp3.Challenge> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2a
            boolean r7 = r7.exhausted()
            if (r7 != 0) goto L1f
            return
        L1f:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            e0.x r0 = e0.x.f30219a
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2a:
            r4 = 61
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L61
            if (r6 != 0) goto L3e
            boolean r2 = r7.exhausted()
            if (r2 == 0) goto L61
        L3e:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r3 = androidx.compose.foundation.text.input.a.q(r3)
            java.lang.String r4 = "="
            java.lang.String r4 = z0.m.i1(r5, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            p0.a.r(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L61:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.Util.skipAll(r7, r4)
            int r6 = r6 + r5
        L6b:
            if (r3 != 0) goto L7c
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 != 0) goto Lb5
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            r6 = r5
        L7c:
            if (r6 == 0) goto Lb5
            r5 = 1
            if (r6 <= r5) goto L82
            return
        L82:
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 == 0) goto L89
            return
        L89:
            r5 = 34
            boolean r5 = startsWith(r7, r5)
            if (r5 == 0) goto L96
            java.lang.String r5 = readQuotedString(r7)
            goto L9a
        L96:
            java.lang.String r5 = readToken(r7)
        L9a:
            if (r5 != 0) goto L9d
            return
        L9d:
            java.lang.Object r3 = r2.put(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto La6
            return
        La6:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lb3
            boolean r3 = r7.exhausted()
            if (r3 != 0) goto Lb3
            return
        Lb3:
            r3 = r0
            goto L6b
        Lb5:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(okio.Buffer, java.util.List):void");
    }

    private static final String readQuotedString(Buffer buffer) throws EOFException {
        if (buffer.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Buffer buffer2 = new Buffer();
        while (true) {
            long indexOfElement = buffer.indexOfElement(QUOTED_STRING_DELIMITERS);
            if (indexOfElement == -1) {
                return null;
            }
            if (buffer.getByte(indexOfElement) == 34) {
                buffer2.write(buffer, indexOfElement);
                buffer.readByte();
                return buffer2.readUtf8();
            }
            if (buffer.size() == indexOfElement + 1) {
                return null;
            }
            buffer2.write(buffer, indexOfElement);
            buffer.readByte();
            buffer2.write(buffer, 1L);
        }
    }

    private static final String readToken(Buffer buffer) {
        long indexOfElement = buffer.indexOfElement(TOKEN_DELIMITERS);
        if (indexOfElement == -1) {
            indexOfElement = buffer.size();
        }
        if (indexOfElement != 0) {
            return buffer.readUtf8(indexOfElement);
        }
        return null;
    }

    public static final void receiveHeaders(@NotNull CookieJar cookieJar, @NotNull HttpUrl httpUrl, @NotNull Headers headers) {
        p0.a.s(cookieJar, "<this>");
        p0.a.s(httpUrl, "url");
        p0.a.s(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.Companion.parseAll(httpUrl, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, parseAll);
    }

    private static final boolean skipCommasAndWhitespace(Buffer buffer) {
        boolean z2 = false;
        while (!buffer.exhausted()) {
            byte b2 = buffer.getByte(0L);
            if (b2 == 44) {
                buffer.readByte();
                z2 = true;
            } else {
                if (b2 != 32 && b2 != 9) {
                    break;
                }
                buffer.readByte();
            }
        }
        return z2;
    }

    private static final boolean startsWith(Buffer buffer, byte b2) {
        return !buffer.exhausted() && buffer.getByte(0L) == b2;
    }
}
