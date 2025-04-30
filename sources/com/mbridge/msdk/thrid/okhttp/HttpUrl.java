package com.mbridge.msdk.thrid.okhttp;

import Q7.n0;
import com.adjust.sdk.Constants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okhttp.internal.publicsuffix.PublicSuffixDatabase;
import com.mbridge.msdk.thrid.okio.Buffer;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class HttpUrl {
    static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    static final String FRAGMENT_ENCODE_SET = "";
    static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    static final String QUERY_ENCODE_SET = " \"'<>#";
    static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    final String host;
    private final String password;
    private final List<String> pathSegments;
    final int port;
    private final List<String> queryNamesAndValues;
    final String scheme;
    private final String url;
    private final String username;

    public HttpUrl(Builder builder) {
        List<String> list;
        this.scheme = builder.scheme;
        this.username = percentDecode(builder.encodedUsername, false);
        this.password = percentDecode(builder.encodedPassword, false);
        this.host = builder.host;
        this.port = builder.effectivePort();
        this.pathSegments = percentDecode(builder.encodedPathSegments, false);
        List<String> list2 = builder.encodedQueryNamesAndValues;
        if (list2 != null) {
            list = percentDecode(list2, true);
        } else {
            list = null;
        }
        this.queryNamesAndValues = list;
        String str = builder.encodedFragment;
        this.fragment = str != null ? percentDecode(str, false) : null;
        this.url = builder.toString();
    }

    public static String canonicalize(String str, int i9, int i10, String str2, boolean z8, boolean z9, boolean z10, boolean z11, Charset charset) {
        int i11 = i9;
        while (i11 < i10) {
            int codePointAt = str.codePointAt(i11);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z11)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z8 && (!z9 || percentEncoded(str, i11, i10)))) && (codePointAt != 43 || !z10))) {
                    i11 += Character.charCount(codePointAt);
                }
            }
            Buffer buffer = new Buffer();
            buffer.writeUtf8(str, i9, i11);
            canonicalize(buffer, str, i11, i10, str2, z8, z9, z10, z11, charset);
            return buffer.readUtf8();
        }
        return str.substring(i9, i10);
    }

    public static int defaultPort(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals(Constants.SCHEME)) {
            return 443;
        }
        return -1;
    }

    public static HttpUrl get(String str) {
        return new Builder().parse(null, str).build();
    }

    public static void namesAndValuesToQueryString(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9 += 2) {
            String str = list.get(i9);
            String str2 = list.get(i9 + 1);
            if (i9 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static HttpUrl parse(String str) {
        try {
            return get(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void pathSegmentsToString(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            sb.append('/');
            sb.append(list.get(i9));
        }
    }

    public static String percentDecode(String str, boolean z8) {
        return percentDecode(str, 0, str.length(), z8);
    }

    public static boolean percentEncoded(String str, int i9, int i10) {
        int i11 = i9 + 2;
        if (i11 < i10 && str.charAt(i9) == '%' && Util.decodeHexDigit(str.charAt(i9 + 1)) != -1 && Util.decodeHexDigit(str.charAt(i11)) != -1) {
            return true;
        }
        return false;
    }

    public static List<String> queryStringToNamesAndValues(String str) {
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 <= str.length()) {
            int indexOf = str.indexOf(38, i9);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i9);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i9, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i9, indexOf));
                arrayList.add(null);
            }
            i9 = indexOf + 1;
        }
        return arrayList;
    }

    public String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        return this.url.substring(this.url.indexOf(35) + 1);
    }

    public String encodedPassword() {
        if (this.password.isEmpty()) {
            return "";
        }
        return this.url.substring(this.url.indexOf(58, this.scheme.length() + 3) + 1, this.url.indexOf(64));
    }

    public String encodedPath() {
        int indexOf = this.url.indexOf(47, this.scheme.length() + 3);
        String str = this.url;
        return this.url.substring(indexOf, Util.delimiterOffset(str, indexOf, str.length(), "?#"));
    }

    public List<String> encodedPathSegments() {
        int indexOf = this.url.indexOf(47, this.scheme.length() + 3);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < delimiterOffset) {
            int i9 = indexOf + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, i9, delimiterOffset, '/');
            arrayList.add(this.url.substring(i9, delimiterOffset2));
            indexOf = delimiterOffset2;
        }
        return arrayList;
    }

    public String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int indexOf = this.url.indexOf(63) + 1;
        String str = this.url;
        return this.url.substring(indexOf, Util.delimiterOffset(str, indexOf, str.length(), '#'));
    }

    public String encodedUsername() {
        if (this.username.isEmpty()) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return this.url.substring(length, Util.delimiterOffset(str, length, str.length(), ":@"));
    }

    public boolean equals(Object obj) {
        if ((obj instanceof HttpUrl) && ((HttpUrl) obj).url.equals(this.url)) {
            return true;
        }
        return false;
    }

    public String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String host() {
        return this.host;
    }

    public boolean isHttps() {
        return this.scheme.equals(Constants.SCHEME);
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.scheme = this.scheme;
        builder.encodedUsername = encodedUsername();
        builder.encodedPassword = encodedPassword();
        builder.host = this.host;
        builder.port = this.port != defaultPort(this.scheme) ? this.port : -1;
        builder.encodedPathSegments.clear();
        builder.encodedPathSegments.addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.encodedFragment = encodedFragment();
        return builder;
    }

    public String password() {
        return this.password;
    }

    public List<String> pathSegments() {
        return this.pathSegments;
    }

    public int pathSize() {
        return this.pathSegments.size();
    }

    public int port() {
        return this.port;
    }

    public String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        namesAndValuesToQueryString(sb, this.queryNamesAndValues);
        return sb.toString();
    }

    public String queryParameter(String str) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i9 = 0; i9 < size; i9 += 2) {
            if (str.equals(this.queryNamesAndValues.get(i9))) {
                return this.queryNamesAndValues.get(i9 + 1);
            }
        }
        return null;
    }

    public String queryParameterName(int i9) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get(i9 * 2);
        }
        throw new IndexOutOfBoundsException();
    }

    public Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.queryNamesAndValues.size();
        for (int i9 = 0; i9 < size; i9 += 2) {
            linkedHashSet.add(this.queryNamesAndValues.get(i9));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public String queryParameterValue(int i9) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i9 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public List<String> queryParameterValues(String str) {
        if (this.queryNamesAndValues == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = this.queryNamesAndValues.size();
        for (int i9 = 0; i9 < size; i9 += 2) {
            if (str.equals(this.queryNamesAndValues.get(i9))) {
                arrayList.add(this.queryNamesAndValues.get(i9 + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public String redact() {
        return newBuilder("/...").username("").password("").build().toString();
    }

    public HttpUrl resolve(String str) {
        Builder newBuilder = newBuilder(str);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public String topPrivateDomain() {
        if (Util.verifyAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.get().getEffectiveTldPlusOne(this.host);
    }

    public URI uri() {
        String builder = newBuilder().reencodeForUri().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e4) {
            try {
                return URI.create(builder.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e4);
            }
        }
    }

    public URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e4) {
            throw new RuntimeException(e4);
        }
    }

    public String username() {
        return this.username;
    }

    /* loaded from: classes3.dex */
    public static final class Builder {
        static final String INVALID_HOST = "Invalid URL host";
        String encodedFragment;
        final List<String> encodedPathSegments;
        List<String> encodedQueryNamesAndValues;
        String host;
        String scheme;
        String encodedUsername = "";
        String encodedPassword = "";
        int port = -1;

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private static String canonicalizeHost(String str, int i9, int i10) {
            return Util.canonicalizeHost(HttpUrl.percentDecode(str, i9, i10, false));
        }

        private boolean isDot(String str) {
            if (!str.equals(".") && !str.equalsIgnoreCase("%2e")) {
                return false;
            }
            return true;
        }

        private boolean isDotDot(String str) {
            if (!str.equals("..") && !str.equalsIgnoreCase("%2e.") && !str.equalsIgnoreCase(".%2e") && !str.equalsIgnoreCase("%2e%2e")) {
                return false;
            }
            return true;
        }

        private static int parsePort(String str, int i9, int i10) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(HttpUrl.canonicalize(str, i9, i10, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        private void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).isEmpty() && !this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.set(r0.size() - 1, "");
            } else {
                this.encodedPathSegments.add("");
            }
        }

        private static int portColonOffset(String str, int i9, int i10) {
            while (i9 < i10) {
                char charAt = str.charAt(i9);
                if (charAt != ':') {
                    if (charAt != '[') {
                        i9++;
                    }
                    do {
                        i9++;
                        if (i9 < i10) {
                        }
                        i9++;
                    } while (str.charAt(i9) != ']');
                    i9++;
                } else {
                    return i9;
                }
            }
            return i10;
        }

        private void push(String str, int i9, int i10, boolean z8, boolean z9) {
            String canonicalize = HttpUrl.canonicalize(str, i9, i10, HttpUrl.PATH_SEGMENT_ENCODE_SET, z9, false, false, true, null);
            if (isDot(canonicalize)) {
                return;
            }
            if (isDotDot(canonicalize)) {
                pop();
                return;
            }
            if (this.encodedPathSegments.get(r11.size() - 1).isEmpty()) {
                this.encodedPathSegments.set(r11.size() - 1, canonicalize);
            } else {
                this.encodedPathSegments.add(canonicalize);
            }
            if (z8) {
                this.encodedPathSegments.add("");
            }
        }

        private void removeAllCanonicalQueryParameters(String str) {
            for (int size = this.encodedQueryNamesAndValues.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.encodedQueryNamesAndValues.get(size))) {
                    this.encodedQueryNamesAndValues.remove(size + 1);
                    this.encodedQueryNamesAndValues.remove(size);
                    if (this.encodedQueryNamesAndValues.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
            }
        }

        private void resolvePath(String str, int i9, int i10) {
            boolean z8;
            if (i9 == i10) {
                return;
            }
            char charAt = str.charAt(i9);
            if (charAt != '/' && charAt != '\\') {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            } else {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i9++;
            }
            while (true) {
                int i11 = i9;
                if (i11 < i10) {
                    i9 = Util.delimiterOffset(str, i11, i10, "/\\");
                    if (i9 < i10) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    push(str, i11, i9, z8, true);
                    if (z8) {
                        i9++;
                    }
                } else {
                    return;
                }
            }
        }

        private static int schemeDelimiterOffset(String str, int i9, int i10) {
            if (i10 - i9 < 2) {
                return -1;
            }
            char charAt = str.charAt(i9);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i9++;
                    if (i9 >= i10) {
                        break;
                    }
                    char charAt2 = str.charAt(i9);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int slashCount(String str, int i9, int i10) {
            int i11 = 0;
            while (i9 < i10) {
                char charAt = str.charAt(i9);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i11++;
                i9++;
            }
            return i11;
        }

        public Builder addEncodedPathSegment(String str) {
            if (str != null) {
                push(str, 0, str.length(), false, true);
                return this;
            }
            throw new NullPointerException("encodedPathSegment == null");
        }

        public Builder addEncodedPathSegments(String str) {
            if (str != null) {
                return addPathSegments(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public Builder addEncodedQueryParameter(String str, String str2) {
            String str3;
            if (str != null) {
                if (this.encodedQueryNamesAndValues == null) {
                    this.encodedQueryNamesAndValues = new ArrayList();
                }
                this.encodedQueryNamesAndValues.add(HttpUrl.canonicalize(str, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true));
                List<String> list = this.encodedQueryNamesAndValues;
                if (str2 != null) {
                    str3 = HttpUrl.canonicalize(str2, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true);
                } else {
                    str3 = null;
                }
                list.add(str3);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public Builder addPathSegment(String str) {
            if (str != null) {
                push(str, 0, str.length(), false, false);
                return this;
            }
            throw new NullPointerException("pathSegment == null");
        }

        public Builder addPathSegments(String str) {
            if (str != null) {
                return addPathSegments(str, false);
            }
            throw new NullPointerException("pathSegments == null");
        }

        public Builder addQueryParameter(String str, String str2) {
            String str3;
            if (str != null) {
                if (this.encodedQueryNamesAndValues == null) {
                    this.encodedQueryNamesAndValues = new ArrayList();
                }
                this.encodedQueryNamesAndValues.add(HttpUrl.canonicalize(str, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, true));
                List<String> list = this.encodedQueryNamesAndValues;
                if (str2 != null) {
                    str3 = HttpUrl.canonicalize(str2, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, true);
                } else {
                    str3 = null;
                }
                list.add(str3);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public HttpUrl build() {
            if (this.scheme != null) {
                if (this.host != null) {
                    return new HttpUrl(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public int effectivePort() {
            int i9 = this.port;
            if (i9 == -1) {
                return HttpUrl.defaultPort(this.scheme);
            }
            return i9;
        }

        public Builder encodedFragment(String str) {
            String str2;
            if (str != null) {
                str2 = HttpUrl.canonicalize(str, "", true, false, false, false);
            } else {
                str2 = null;
            }
            this.encodedFragment = str2;
            return this;
        }

        public Builder encodedPassword(String str) {
            if (str != null) {
                this.encodedPassword = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                return this;
            }
            throw new NullPointerException("encodedPassword == null");
        }

        public Builder encodedPath(String str) {
            if (str != null) {
                if (str.startsWith("/")) {
                    resolvePath(str, 0, str.length());
                    return this;
                }
                throw new IllegalArgumentException("unexpected encodedPath: ".concat(str));
            }
            throw new NullPointerException("encodedPath == null");
        }

        public Builder encodedQuery(String str) {
            List<String> list;
            if (str != null) {
                list = HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(str, HttpUrl.QUERY_ENCODE_SET, true, false, true, true));
            } else {
                list = null;
            }
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public Builder encodedUsername(String str) {
            if (str != null) {
                this.encodedUsername = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                return this;
            }
            throw new NullPointerException("encodedUsername == null");
        }

        public Builder fragment(String str) {
            String str2;
            if (str != null) {
                str2 = HttpUrl.canonicalize(str, "", false, false, false, false);
            } else {
                str2 = null;
            }
            this.encodedFragment = str2;
            return this;
        }

        public Builder host(String str) {
            if (str != null) {
                String canonicalizeHost = canonicalizeHost(str, 0, str.length());
                if (canonicalizeHost != null) {
                    this.host = canonicalizeHost;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            throw new NullPointerException("host == null");
        }

        public Builder parse(HttpUrl httpUrl, String str) {
            int delimiterOffset;
            char c9;
            int i9;
            int skipLeadingAsciiWhitespace = Util.skipLeadingAsciiWhitespace(str, 0, str.length());
            int skipTrailingAsciiWhitespace = Util.skipTrailingAsciiWhitespace(str, skipLeadingAsciiWhitespace, str.length());
            int schemeDelimiterOffset = schemeDelimiterOffset(str, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace);
            if (schemeDelimiterOffset != -1) {
                if (str.regionMatches(true, skipLeadingAsciiWhitespace, "https:", 0, 6)) {
                    this.scheme = Constants.SCHEME;
                    skipLeadingAsciiWhitespace += 6;
                } else if (str.regionMatches(true, skipLeadingAsciiWhitespace, "http:", 0, 5)) {
                    this.scheme = "http";
                    skipLeadingAsciiWhitespace += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, schemeDelimiterOffset) + "'");
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int slashCount = slashCount(str, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace);
            char c10 = '?';
            char c11 = '#';
            if (slashCount < 2 && httpUrl != null && httpUrl.scheme.equals(this.scheme)) {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host;
                this.port = httpUrl.port;
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (skipLeadingAsciiWhitespace == skipTrailingAsciiWhitespace || str.charAt(skipLeadingAsciiWhitespace) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
            } else {
                boolean z8 = false;
                boolean z9 = false;
                int i10 = skipLeadingAsciiWhitespace + slashCount;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(str, i10, skipTrailingAsciiWhitespace, "@/\\?#");
                    if (delimiterOffset != skipTrailingAsciiWhitespace) {
                        c9 = str.charAt(delimiterOffset);
                    } else {
                        c9 = 65535;
                    }
                    if (c9 == 65535 || c9 == c11 || c9 == '/' || c9 == '\\' || c9 == c10) {
                        break;
                    }
                    if (c9 == '@') {
                        if (!z8) {
                            int delimiterOffset2 = Util.delimiterOffset(str, i10, delimiterOffset, ':');
                            i9 = delimiterOffset;
                            String canonicalize = HttpUrl.canonicalize(str, i10, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z9) {
                                canonicalize = n0.l(new StringBuilder(), this.encodedUsername, "%40", canonicalize);
                            }
                            this.encodedUsername = canonicalize;
                            if (delimiterOffset2 != i9) {
                                this.encodedPassword = HttpUrl.canonicalize(str, delimiterOffset2 + 1, i9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z8 = true;
                            }
                            z9 = true;
                        } else {
                            i9 = delimiterOffset;
                            this.encodedPassword += "%40" + HttpUrl.canonicalize(str, i10, i9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i10 = i9 + 1;
                    }
                    c10 = '?';
                    c11 = '#';
                }
                int portColonOffset = portColonOffset(str, i10, delimiterOffset);
                int i11 = portColonOffset + 1;
                if (i11 < delimiterOffset) {
                    this.host = canonicalizeHost(str, i10, portColonOffset);
                    int parsePort = parsePort(str, i11, delimiterOffset);
                    this.port = parsePort;
                    if (parsePort == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i11, delimiterOffset) + '\"');
                    }
                } else {
                    this.host = canonicalizeHost(str, i10, portColonOffset);
                    this.port = HttpUrl.defaultPort(this.scheme);
                }
                if (this.host != null) {
                    skipLeadingAsciiWhitespace = delimiterOffset;
                } else {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i10, portColonOffset) + '\"');
                }
            }
            int delimiterOffset3 = Util.delimiterOffset(str, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace, "?#");
            resolvePath(str, skipLeadingAsciiWhitespace, delimiterOffset3);
            if (delimiterOffset3 < skipTrailingAsciiWhitespace && str.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(str, delimiterOffset3, skipTrailingAsciiWhitespace, '#');
                this.encodedQueryNamesAndValues = HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(str, delimiterOffset3 + 1, delimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, true, null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < skipTrailingAsciiWhitespace && str.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = HttpUrl.canonicalize(str, 1 + delimiterOffset3, skipTrailingAsciiWhitespace, "", true, false, false, false, null);
            }
            return this;
        }

        public Builder password(String str) {
            if (str != null) {
                this.encodedPassword = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        public Builder port(int i9) {
            if (i9 > 0 && i9 <= 65535) {
                this.port = i9;
                return this;
            }
            throw new IllegalArgumentException(o.h(i9, "unexpected port: "));
        }

        public Builder query(String str) {
            List<String> list;
            if (str != null) {
                list = HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(str, HttpUrl.QUERY_ENCODE_SET, false, false, true, true));
            } else {
                list = null;
            }
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public Builder reencodeForUri() {
            int size = this.encodedPathSegments.size();
            for (int i9 = 0; i9 < size; i9++) {
                this.encodedPathSegments.set(i9, HttpUrl.canonicalize(this.encodedPathSegments.get(i9), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, true));
            }
            List<String> list = this.encodedQueryNamesAndValues;
            if (list != null) {
                int size2 = list.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    String str = this.encodedQueryNamesAndValues.get(i10);
                    if (str != null) {
                        this.encodedQueryNamesAndValues.set(i10, HttpUrl.canonicalize(str, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, true));
                    }
                }
            }
            String str2 = this.encodedFragment;
            if (str2 != null) {
                this.encodedFragment = HttpUrl.canonicalize(str2, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, false);
            }
            return this;
        }

        public Builder removeAllEncodedQueryParameters(String str) {
            if (str != null) {
                if (this.encodedQueryNamesAndValues == null) {
                    return this;
                }
                removeAllCanonicalQueryParameters(HttpUrl.canonicalize(str, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true));
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public Builder removeAllQueryParameters(String str) {
            if (str != null) {
                if (this.encodedQueryNamesAndValues == null) {
                    return this;
                }
                removeAllCanonicalQueryParameters(HttpUrl.canonicalize(str, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, true));
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public Builder removePathSegment(int i9) {
            this.encodedPathSegments.remove(i9);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public Builder scheme(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.scheme = "http";
                } else if (str.equalsIgnoreCase(Constants.SCHEME)) {
                    this.scheme = Constants.SCHEME;
                } else {
                    throw new IllegalArgumentException("unexpected scheme: ".concat(str));
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        public Builder setEncodedPathSegment(int i9, String str) {
            if (str != null) {
                String canonicalize = HttpUrl.canonicalize(str, 0, str.length(), HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, true, null);
                this.encodedPathSegments.set(i9, canonicalize);
                if (!isDot(canonicalize) && !isDotDot(canonicalize)) {
                    return this;
                }
                throw new IllegalArgumentException("unexpected path segment: ".concat(str));
            }
            throw new NullPointerException("encodedPathSegment == null");
        }

        public Builder setEncodedQueryParameter(String str, String str2) {
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public Builder setPathSegment(int i9, String str) {
            if (str != null) {
                String canonicalize = HttpUrl.canonicalize(str, 0, str.length(), HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, true, null);
                if (!isDot(canonicalize) && !isDotDot(canonicalize)) {
                    this.encodedPathSegments.set(i9, canonicalize);
                    return this;
                }
                throw new IllegalArgumentException("unexpected path segment: ".concat(str));
            }
            throw new NullPointerException("pathSegment == null");
        }

        public Builder setQueryParameter(String str, String str2) {
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.encodedUsername.isEmpty() || !this.encodedPassword.isEmpty()) {
                sb.append(this.encodedUsername);
                if (!this.encodedPassword.isEmpty()) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.host);
                    sb.append(']');
                } else {
                    sb.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int effectivePort = effectivePort();
                String str3 = this.scheme;
                if (str3 == null || effectivePort != HttpUrl.defaultPort(str3)) {
                    sb.append(':');
                    sb.append(effectivePort);
                }
            }
            HttpUrl.pathSegmentsToString(sb, this.encodedPathSegments);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                HttpUrl.namesAndValuesToQueryString(sb, this.encodedQueryNamesAndValues);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            return sb.toString();
        }

        public Builder username(String str) {
            if (str != null) {
                this.encodedUsername = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }

        private Builder addPathSegments(String str, boolean z8) {
            int i9 = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, i9, str.length(), "/\\");
                push(str, i9, delimiterOffset, delimiterOffset < str.length(), z8);
                i9 = delimiterOffset + 1;
            } while (i9 <= str.length());
            return this;
        }
    }

    public static HttpUrl get(URL url) {
        return parse(url.toString());
    }

    private List<String> percentDecode(List<String> list, boolean z8) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            String str = list.get(i9);
            arrayList.add(str != null ? percentDecode(str, z8) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static HttpUrl get(URI uri) {
        return parse(uri.toString());
    }

    public static String percentDecode(String str, int i9, int i10, boolean z8) {
        for (int i11 = i9; i11 < i10; i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '%' || (charAt == '+' && z8)) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, i9, i11);
                percentDecode(buffer, str, i11, i10, z8);
                return buffer.readUtf8();
            }
        }
        return str.substring(i9, i10);
    }

    public static void canonicalize(Buffer buffer, String str, int i9, int i10, String str2, boolean z8, boolean z9, boolean z10, boolean z11, Charset charset) {
        Buffer buffer2 = null;
        while (i9 < i10) {
            int codePointAt = str.codePointAt(i9);
            if (!z8 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z10) {
                    buffer.writeUtf8(z8 ? "+" : "%2B");
                } else if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z11) && str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z8 && (!z9 || percentEncoded(str, i9, i10)))))) {
                    buffer.writeUtf8CodePoint(codePointAt);
                } else {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    if (charset != null && !charset.equals(Util.UTF_8)) {
                        buffer2.writeString(str, i9, Character.charCount(codePointAt) + i9, charset);
                    } else {
                        buffer2.writeUtf8CodePoint(codePointAt);
                    }
                    while (!buffer2.exhausted()) {
                        byte readByte = buffer2.readByte();
                        buffer.writeByte(37);
                        char[] cArr = HEX_DIGITS;
                        buffer.writeByte((int) cArr[((readByte & 255) >> 4) & 15]);
                        buffer.writeByte((int) cArr[readByte & Ascii.SI]);
                    }
                }
            }
            i9 += Character.charCount(codePointAt);
        }
    }

    public Builder newBuilder(String str) {
        try {
            return new Builder().parse(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void percentDecode(Buffer buffer, String str, int i9, int i10, boolean z8) {
        int i11;
        while (i9 < i10) {
            int codePointAt = str.codePointAt(i9);
            if (codePointAt == 37 && (i11 = i9 + 2) < i10) {
                int decodeHexDigit = Util.decodeHexDigit(str.charAt(i9 + 1));
                int decodeHexDigit2 = Util.decodeHexDigit(str.charAt(i11));
                if (decodeHexDigit != -1 && decodeHexDigit2 != -1) {
                    buffer.writeByte((decodeHexDigit << 4) + decodeHexDigit2);
                    i9 = i11;
                }
                buffer.writeUtf8CodePoint(codePointAt);
            } else {
                if (codePointAt == 43 && z8) {
                    buffer.writeByte(32);
                }
                buffer.writeUtf8CodePoint(codePointAt);
            }
            i9 += Character.charCount(codePointAt);
        }
    }

    public static String canonicalize(String str, String str2, boolean z8, boolean z9, boolean z10, boolean z11, Charset charset) {
        return canonicalize(str, 0, str.length(), str2, z8, z9, z10, z11, charset);
    }

    public static String canonicalize(String str, String str2, boolean z8, boolean z9, boolean z10, boolean z11) {
        return canonicalize(str, 0, str.length(), str2, z8, z9, z10, z11, null);
    }
}
