package okhttp3;

import android.support.v4.media.d;
import androidx.compose.ui.platform.j;
import com.applovin.sdk.AppLovinEventParameters;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.safedk.android.analytics.brandsafety.creatives.e;
import e0.w;
import e0.y;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.signature.SignatureVisitor;
import p0.a;
import z0.m;
import z0.n;

/* loaded from: classes.dex */
public final class HttpUrl {

    @NotNull
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    @NotNull
    public static final String FRAGMENT_ENCODE_SET = "";

    @NotNull
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";

    @NotNull
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";

    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";

    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";

    @NotNull
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";

    @NotNull
    public static final String QUERY_ENCODE_SET = " \"'<>#";

    @NotNull
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @Nullable
    private final String fragment;

    @NotNull
    private final String host;
    private final boolean isHttps;

    @NotNull
    private final String password;

    @NotNull
    private final List<String> pathSegments;
    private final int port;

    @Nullable
    private final List<String> queryNamesAndValues;

    @NotNull
    private final String scheme;

    @NotNull
    private final String url;

    @NotNull
    private final String username;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* loaded from: classes.dex */
    public static final class Builder {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        public static final String INVALID_HOST = "Invalid URL host";

        @Nullable
        private String encodedFragment;

        @NotNull
        private final List<String> encodedPathSegments;

        @Nullable
        private List<String> encodedQueryNamesAndValues;

        @Nullable
        private String host;

        @Nullable
        private String scheme;

        @NotNull
        private String encodedUsername = "";

        @NotNull
        private String encodedPassword = "";
        private int port = -1;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i2, int i3) {
                try {
                    int parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i2, i3, "", false, false, false, false, null, 248, null));
                    if (1 > parseInt || parseInt >= 65536) {
                        return -1;
                    }
                    return parseInt;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i2, int i3) {
                while (i2 < i3) {
                    char charAt = str.charAt(i2);
                    if (charAt != '[') {
                        if (charAt == ':') {
                            return i2;
                        }
                        i2++;
                    }
                    do {
                        i2++;
                        if (i2 < i3) {
                        }
                        i2++;
                    } while (str.charAt(i2) != ']');
                    i2++;
                }
                return i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i2, int i3) {
                if (i3 - i2 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i2);
                if ((a.E(charAt, 97) < 0 || a.E(charAt, 122) > 0) && (a.E(charAt, 65) < 0 || a.E(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i2++;
                    if (i2 >= i3) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i2);
                    if ('a' > charAt2 || charAt2 >= '{') {
                        if ('A' > charAt2 || charAt2 >= '[') {
                            if ('0' > charAt2 || charAt2 >= ':') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i2;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i2, int i3) {
                int i4 = 0;
                while (i2 < i3) {
                    char charAt = str.charAt(i2);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i4++;
                    i2++;
                }
                return i4;
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i2 = this.port;
            if (i2 != -1) {
                return i2;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            a.p(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            return a.g(str, ".") || m.S0(str, "%2e", true);
        }

        private final boolean isDotDot(String str) {
            return a.g(str, "..") || m.S0(str, "%2e.", true) || m.S0(str, ".%2e", true) || m.S0(str, "%2e%2e", true);
        }

        private final void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() != 0 || !(!this.encodedPathSegments.isEmpty())) {
                this.encodedPathSegments.add("");
            } else {
                this.encodedPathSegments.set(r0.size() - 1, "");
            }
        }

        private final void push(String str, int i2, int i3, boolean z2, boolean z3) {
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i2, i3, HttpUrl.PATH_SEGMENT_ENCODE_SET, z3, false, false, false, null, 240, null);
            if (isDot(canonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(canonicalize$okhttp$default)) {
                pop();
                return;
            }
            if (((CharSequence) androidx.compose.foundation.text.input.a.g(this.encodedPathSegments, 1)).length() == 0) {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, canonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(canonicalize$okhttp$default);
            }
            if (z2) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            a.p(list);
            int size = list.size() - 2;
            int f2 = q.f(size, 0, -2);
            if (f2 > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                a.p(list2);
                if (a.g(str, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    a.p(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    a.p(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    a.p(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == f2) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        private final void resolvePath(String str, int i2, int i3) {
            if (i2 == i3) {
                return;
            }
            char charAt = str.charAt(i2);
            if (charAt == '/' || charAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i2++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i4 = i2;
                while (i4 < i3) {
                    i2 = Util.delimiterOffset(str, "/\\", i4, i3);
                    boolean z2 = i2 < i3;
                    push(str, i4, i2, z2, true);
                    if (z2) {
                        i4 = i2 + 1;
                    }
                }
                return;
            }
        }

        @NotNull
        public final Builder addEncodedPathSegment(@NotNull String str) {
            a.s(str, "encodedPathSegment");
            push(str, 0, str.length(), false, true);
            return this;
        }

        @NotNull
        public final Builder addEncodedPathSegments(@NotNull String str) {
            a.s(str, "encodedPathSegments");
            return addPathSegments(str, true);
        }

        @NotNull
        public final Builder addEncodedQueryParameter(@NotNull String str, @Nullable String str2) {
            a.s(str, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            a.p(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            a.p(list2);
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null) : null);
            return this;
        }

        @NotNull
        public final Builder addPathSegment(@NotNull String str) {
            a.s(str, "pathSegment");
            push(str, 0, str.length(), false, false);
            return this;
        }

        @NotNull
        public final Builder addPathSegments(@NotNull String str) {
            a.s(str, "pathSegments");
            return addPathSegments(str, false);
        }

        @NotNull
        public final Builder addQueryParameter(@NotNull String str, @Nullable String str2) {
            a.s(str, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            a.p(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            a.p(list2);
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null);
            return this;
        }

        @NotNull
        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.Companion;
            String percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
            String percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int effectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(e0.q.M(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                List<String> list3 = list2;
                arrayList = new ArrayList(e0.q.M(list3, 10));
                for (String str3 : list3) {
                    arrayList.add(str3 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, percentDecode$okhttp$default, percentDecode$okhttp$default2, str2, effectivePort, arrayList2, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, false, 7, null) : null, toString());
        }

        @NotNull
        public final Builder encodedFragment(@Nullable String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, null, Opcodes.PUTSTATIC, null) : null;
            return this;
        }

        @NotNull
        public final Builder encodedPassword(@NotNull String str) {
            a.s(str, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @NotNull
        public final Builder encodedPath(@NotNull String str) {
            a.s(str, "encodedPath");
            if (!m.q1(str, RemoteSettings.FORWARD_SLASH_STRING, false)) {
                throw new IllegalArgumentException("unexpected encodedPath: ".concat(str).toString());
            }
            resolvePath(str, 0, str.length());
            return this;
        }

        @NotNull
        public final Builder encodedQuery(@Nullable String str) {
            List<String> list;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        @NotNull
        public final Builder encodedUsername(@NotNull String str) {
            a.s(str, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @NotNull
        public final Builder fragment(@Nullable String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, null, Opcodes.NEW, null) : null;
            return this;
        }

        @Nullable
        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        @NotNull
        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        @NotNull
        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        @Nullable
        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        @NotNull
        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        @Nullable
        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        @Nullable
        public final String getScheme$okhttp() {
            return this.scheme;
        }

        @NotNull
        public final Builder host(@NotNull String str) {
            a.s(str, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, 0, 0, false, 7, null));
            if (canonicalHost == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.host = canonicalHost;
            return this;
        }

        @NotNull
        public final Builder parse$okhttp(@Nullable HttpUrl httpUrl, @NotNull String str) {
            int delimiterOffset;
            int i2;
            int i3;
            boolean z2;
            int i4;
            boolean z3;
            String str2 = str;
            a.s(str2, "input");
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(str2, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(str2, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int schemeDelimiterOffset = companion.schemeDelimiterOffset(str2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            boolean z4 = true;
            char c2 = 65535;
            if (schemeDelimiterOffset != -1) {
                if (m.p1(str2, "https:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = TournamentShareDialogURIBuilder.scheme;
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!m.p1(str2, "http:", indexOfFirstNonAsciiWhitespace$default, true)) {
                        StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String substring = str2.substring(0, schemeDelimiterOffset);
                        a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(substring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.scheme = e.e;
                    indexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (httpUrl == null) {
                    if (str.length() > 6) {
                        str2 = n.A1(6, str2).concat("...");
                    }
                    throw new IllegalArgumentException(j.b("Expected URL scheme 'http' or 'https' but no scheme was found for ", str2));
                }
                this.scheme = httpUrl.scheme();
            }
            int slashCount = companion.slashCount(str2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c3 = '?';
            char c4 = '#';
            if (slashCount >= 2 || httpUrl == null || !a.g(httpUrl.scheme(), this.scheme)) {
                boolean z5 = false;
                boolean z6 = false;
                int i5 = indexOfFirstNonAsciiWhitespace$default + slashCount;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(str2, "@/\\?#", i5, indexOfLastNonAsciiWhitespace$default);
                    char charAt = delimiterOffset != indexOfLastNonAsciiWhitespace$default ? str2.charAt(delimiterOffset) : c2;
                    if (charAt == c2 || charAt == c4 || charAt == '/' || charAt == '\\' || charAt == c3) {
                        break;
                    }
                    if (charAt == '@') {
                        if (z5) {
                            i3 = delimiterOffset;
                            z2 = z4;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            i4 = indexOfLastNonAsciiWhitespace$default;
                            sb2.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i5, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                        } else {
                            int delimiterOffset2 = Util.delimiterOffset(str2, ':', i5, delimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            z2 = z4;
                            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, str, i5, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z6) {
                                canonicalize$okhttp$default = this.encodedUsername + "%40" + canonicalize$okhttp$default;
                            }
                            this.encodedUsername = canonicalize$okhttp$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                i3 = delimiterOffset;
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, str, delimiterOffset2 + 1, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z3 = z2;
                            } else {
                                i3 = delimiterOffset;
                                z3 = z5;
                            }
                            z5 = z3;
                            i4 = indexOfLastNonAsciiWhitespace$default;
                            z6 = z2;
                        }
                        i5 = i3 + 1;
                        indexOfLastNonAsciiWhitespace$default = i4;
                        z4 = z2;
                        c4 = '#';
                        c3 = '?';
                        c2 = 65535;
                    }
                }
                i2 = indexOfLastNonAsciiWhitespace$default;
                Companion companion3 = Companion;
                int portColonOffset = companion3.portColonOffset(str2, i5, delimiterOffset);
                int i6 = portColonOffset + 1;
                if (i6 < delimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, i5, portColonOffset, false, 4, null));
                    int parsePort = companion3.parsePort(str2, i6, delimiterOffset);
                    this.port = parsePort;
                    if (parsePort == -1) {
                        StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                        String substring2 = str2.substring(i6, delimiterOffset);
                        a.r(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(substring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, str, i5, portColonOffset, false, 4, null));
                    String str3 = this.scheme;
                    a.p(str3);
                    this.port = companion4.defaultPort(str3);
                }
                if (this.host == null) {
                    StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                    String substring3 = str2.substring(i5, portColonOffset);
                    a.r(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb4.append(substring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || str2.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i2 = indexOfLastNonAsciiWhitespace$default;
            }
            int i7 = i2;
            int delimiterOffset3 = Util.delimiterOffset(str2, "?#", indexOfFirstNonAsciiWhitespace$default, i7);
            resolvePath(str2, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < i7 && str2.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(str2, '#', delimiterOffset3, i7);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str, delimiterOffset3 + 1, delimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < i7 && str2.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, delimiterOffset3 + 1, i7, "", true, false, false, true, null, Opcodes.ARETURN, null);
            }
            return this;
        }

        @NotNull
        public final Builder password(@NotNull String str) {
            a.s(str, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        @NotNull
        public final Builder port(int i2) {
            if (1 > i2 || i2 >= 65536) {
                throw new IllegalArgumentException(d.i("unexpected port: ", i2).toString());
            }
            this.port = i2;
            return this;
        }

        @NotNull
        public final Builder query(@Nullable String str) {
            List<String> list;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        @NotNull
        public final Builder reencodeForUri$okhttp() {
            String str;
            String str2 = this.host;
            if (str2 != null) {
                Pattern compile = Pattern.compile("[\"<>^`{|}]");
                a.r(compile, "compile(...)");
                str = compile.matcher(str2).replaceAll("");
                a.r(str, "replaceAll(...)");
            } else {
                str = null;
            }
            this.host = str;
            int size = this.encodedPathSegments.size();
            for (int i2 = 0; i2 < size; i2++) {
                List<String> list = this.encodedPathSegments;
                list.set(i2, Companion.canonicalize$okhttp$default(HttpUrl.Companion, list.get(i2), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str3 = list2.get(i3);
                    list2.set(i3, str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str3, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, Opcodes.MONITOREXIT, null) : null);
                }
            }
            String str4 = this.encodedFragment;
            this.encodedFragment = str4 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str4, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, Opcodes.IF_ICMPGT, null) : null;
            return this;
        }

        @NotNull
        public final Builder removeAllEncodedQueryParameters(@NotNull String str) {
            a.s(str, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        @NotNull
        public final Builder removeAllQueryParameters(@NotNull String str) {
            a.s(str, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        @NotNull
        public final Builder removePathSegment(int i2) {
            this.encodedPathSegments.remove(i2);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        @NotNull
        public final Builder scheme(@NotNull String str) {
            a.s(str, "scheme");
            if (m.S0(str, e.e, true)) {
                this.scheme = e.e;
            } else {
                if (!m.S0(str, TournamentShareDialogURIBuilder.scheme, true)) {
                    throw new IllegalArgumentException("unexpected scheme: ".concat(str));
                }
                this.scheme = TournamentShareDialogURIBuilder.scheme;
            }
            return this;
        }

        public final void setEncodedFragment$okhttp(@Nullable String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(@NotNull String str) {
            a.s(str, "<set-?>");
            this.encodedPassword = str;
        }

        @NotNull
        public final Builder setEncodedPathSegment(int i2, @NotNull String str) {
            a.s(str, "encodedPathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(i2, canonicalize$okhttp$default);
            if (isDot(canonicalize$okhttp$default) || isDotDot(canonicalize$okhttp$default)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(str).toString());
            }
            return this;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@Nullable List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        @NotNull
        public final Builder setEncodedQueryParameter(@NotNull String str, @Nullable String str2) {
            a.s(str, "encodedName");
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final void setEncodedUsername$okhttp(@NotNull String str) {
            a.s(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(@Nullable String str) {
            this.host = str;
        }

        @NotNull
        public final Builder setPathSegment(int i2, @NotNull String str) {
            a.s(str, "pathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (isDot(canonicalize$okhttp$default) || isDotDot(canonicalize$okhttp$default)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(str).toString());
            }
            this.encodedPathSegments.set(i2, canonicalize$okhttp$default);
            return this;
        }

        public final void setPort$okhttp(int i2) {
            this.port = i2;
        }

        @NotNull
        public final Builder setQueryParameter(@NotNull String str, @Nullable String str2) {
            a.s(str, "name");
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final void setScheme$okhttp(@Nullable String str) {
            this.scheme = str;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                if (m.N0(str2, ':')) {
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
                if (str3 == null || effectivePort != HttpUrl.Companion.defaultPort(str3)) {
                    sb.append(':');
                    sb.append(effectivePort);
                }
            }
            Companion companion = HttpUrl.Companion;
            companion.toPathString$okhttp(this.encodedPathSegments, sb);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                List<String> list = this.encodedQueryNamesAndValues;
                a.p(list);
                companion.toQueryString$okhttp(list, sb);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            String sb2 = sb.toString();
            a.r(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }

        @NotNull
        public final Builder username(@NotNull String str) {
            a.s(str, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        private final Builder addPathSegments(String str, boolean z2) {
            int i2 = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, "/\\", i2, str.length());
                push(str, i2, delimiterOffset, delimiterOffset < str.length(), z2);
                i2 = delimiterOffset + 1;
            } while (i2 <= str.length());
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z4, boolean z5, Charset charset, int i4, Object obj) {
            return companion.canonicalize$okhttp(str, (i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? str.length() : i3, str2, (i4 & 8) != 0 ? false : z2, (i4 & 16) != 0 ? false : z3, (i4 & 32) != 0 ? false : z4, (i4 & 64) != 0 ? false : z5, (i4 & 128) != 0 ? null : charset);
        }

        private final boolean isPercentEncoded(String str, int i2, int i3) {
            int i4 = i2 + 2;
            return i4 < i3 && str.charAt(i2) == '%' && Util.parseHexDigit(str.charAt(i2 + 1)) != -1 && Util.parseHexDigit(str.charAt(i4)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i2, int i3, boolean z2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = str.length();
            }
            if ((i4 & 4) != 0) {
                z2 = false;
            }
            return companion.percentDecode$okhttp(str, i2, i3, z2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
        
            if (isPercentEncoded(r15, r4, r17) == false) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void writeCanonicalized(okio.Buffer r14, java.lang.String r15, int r16, int r17, java.lang.String r18, boolean r19, boolean r20, boolean r21, boolean r22, java.nio.charset.Charset r23) {
            /*
                r13 = this;
                r0 = r14
                r1 = r15
                r2 = r17
                r3 = r23
                r4 = 0
                r5 = r4
                r4 = r16
            La:
                if (r4 >= r2) goto Lb9
                int r6 = r15.codePointAt(r4)
                if (r19 == 0) goto L27
                r7 = 9
                if (r6 == r7) goto L22
                r7 = 10
                if (r6 == r7) goto L22
                r7 = 12
                if (r6 == r7) goto L22
                r7 = 13
                if (r6 != r7) goto L27
            L22:
                r7 = r13
                r9 = r18
                goto Lb2
            L27:
                r7 = 43
                if (r6 != r7) goto L38
                if (r21 == 0) goto L38
                if (r19 == 0) goto L32
                java.lang.String r7 = "+"
                goto L34
            L32:
                java.lang.String r7 = "%2B"
            L34:
                r14.writeUtf8(r7)
                goto L22
            L38:
                r7 = 32
                r8 = 37
                if (r6 < r7) goto L49
                r7 = 127(0x7f, float:1.78E-43)
                if (r6 == r7) goto L49
                r7 = 128(0x80, float:1.8E-43)
                if (r6 < r7) goto L4d
                if (r22 == 0) goto L49
                goto L4d
            L49:
                r7 = r13
                r9 = r18
                goto L6c
            L4d:
                char r7 = (char) r6
                r9 = r18
                boolean r7 = z0.m.N0(r9, r7)
                if (r7 != 0) goto L66
                if (r6 != r8) goto L64
                if (r19 == 0) goto L66
                if (r20 == 0) goto L64
                r7 = r13
                boolean r10 = r13.isPercentEncoded(r15, r4, r2)
                if (r10 != 0) goto L68
                goto L6c
            L64:
                r7 = r13
                goto L68
            L66:
                r7 = r13
                goto L6c
            L68:
                r14.writeUtf8CodePoint(r6)
                goto Lb2
            L6c:
                if (r5 != 0) goto L73
                okio.Buffer r5 = new okio.Buffer
                r5.<init>()
            L73:
                if (r3 == 0) goto L87
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = p0.a.g(r3, r10)
                if (r10 == 0) goto L7e
                goto L87
            L7e:
                int r10 = java.lang.Character.charCount(r6)
                int r10 = r10 + r4
                r5.writeString(r15, r4, r10, r3)
                goto L8a
            L87:
                r5.writeUtf8CodePoint(r6)
            L8a:
                boolean r10 = r5.exhausted()
                if (r10 != 0) goto Lb2
                byte r10 = r5.readByte()
                r11 = r10 & 255(0xff, float:3.57E-43)
                r14.writeByte(r8)
                char[] r12 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                int r11 = r11 >> 4
                r11 = r11 & 15
                char r11 = r12[r11]
                r14.writeByte(r11)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                r10 = r10 & 15
                char r10 = r11[r10]
                r14.writeByte(r10)
                goto L8a
            Lb2:
                int r6 = java.lang.Character.charCount(r6)
                int r4 = r4 + r6
                goto La
            Lb9:
                r7 = r13
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(okio.Buffer, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(Buffer buffer, String str, int i2, int i3, boolean z2) {
            int i4;
            while (i2 < i3) {
                int codePointAt = str.codePointAt(i2);
                if (codePointAt != 37 || (i4 = i2 + 2) >= i3) {
                    if (codePointAt == 43 && z2) {
                        buffer.writeByte(32);
                        i2++;
                    }
                    buffer.writeUtf8CodePoint(codePointAt);
                    i2 += Character.charCount(codePointAt);
                } else {
                    int parseHexDigit = Util.parseHexDigit(str.charAt(i2 + 1));
                    int parseHexDigit2 = Util.parseHexDigit(str.charAt(i4));
                    if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                        buffer.writeByte((parseHexDigit << 4) + parseHexDigit2);
                        i2 = Character.charCount(codePointAt) + i4;
                    }
                    buffer.writeUtf8CodePoint(codePointAt);
                    i2 += Character.charCount(codePointAt);
                }
            }
        }

        @d0.a
        @NotNull
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m700deprecated_get(@NotNull String str) {
            a.s(str, "url");
            return get(str);
        }

        @d0.a
        @Nullable
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m703deprecated_parse(@NotNull String str) {
            a.s(str, "url");
            return parse(str);
        }

        @NotNull
        public final String canonicalize$okhttp(@NotNull String str, int i2, int i3, @NotNull String str2, boolean z2, boolean z3, boolean z4, boolean z5, @Nullable Charset charset) {
            a.s(str, "<this>");
            a.s(str2, "encodeSet");
            int i4 = i2;
            while (i4 < i3) {
                int codePointAt = str.codePointAt(i4);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z5) && !m.N0(str2, (char) codePointAt))) {
                    if (codePointAt == 37) {
                        if (z2) {
                            if (z3) {
                                if (!isPercentEncoded(str, i4, i3)) {
                                    Buffer buffer = new Buffer();
                                    buffer.writeUtf8(str, i2, i4);
                                    writeCanonicalized(buffer, str, i4, i3, str2, z2, z3, z4, z5, charset);
                                    return buffer.readUtf8();
                                }
                                if (codePointAt != 43 && z4) {
                                    Buffer buffer2 = new Buffer();
                                    buffer2.writeUtf8(str, i2, i4);
                                    writeCanonicalized(buffer2, str, i4, i3, str2, z2, z3, z4, z5, charset);
                                    return buffer2.readUtf8();
                                }
                                i4 += Character.charCount(codePointAt);
                            }
                        }
                    }
                    if (codePointAt != 43) {
                    }
                    i4 += Character.charCount(codePointAt);
                }
                Buffer buffer22 = new Buffer();
                buffer22.writeUtf8(str, i2, i4);
                writeCanonicalized(buffer22, str, i4, i3, str2, z2, z3, z4, z5, charset);
                return buffer22.readUtf8();
            }
            String substring = str.substring(i2, i3);
            a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final int defaultPort(@NotNull String str) {
            a.s(str, "scheme");
            if (a.g(str, e.e)) {
                return 80;
            }
            return a.g(str, TournamentShareDialogURIBuilder.scheme) ? 443 : -1;
        }

        @NotNull
        public final HttpUrl get(@NotNull String str) {
            a.s(str, "<this>");
            return new Builder().parse$okhttp(null, str).build();
        }

        @Nullable
        public final HttpUrl parse(@NotNull String str) {
            a.s(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @NotNull
        public final String percentDecode$okhttp(@NotNull String str, int i2, int i3, boolean z2) {
            a.s(str, "<this>");
            for (int i4 = i2; i4 < i3; i4++) {
                char charAt = str.charAt(i4);
                if (charAt == '%' || (charAt == '+' && z2)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i2, i4);
                    writePercentDecoded(buffer, str, i4, i3, z2);
                    return buffer.readUtf8();
                }
            }
            String substring = str.substring(i2, i3);
            a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final void toPathString$okhttp(@NotNull List<String> list, @NotNull StringBuilder sb) {
            a.s(list, "<this>");
            a.s(sb, "out");
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append(list.get(i2));
            }
        }

        @NotNull
        public final List<String> toQueryNamesAndValues$okhttp(@NotNull String str) {
            a.s(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 <= str.length()) {
                int W0 = m.W0(str, '&', i2, false, 4);
                if (W0 == -1) {
                    W0 = str.length();
                }
                int W02 = m.W0(str, SignatureVisitor.INSTANCEOF, i2, false, 4);
                if (W02 == -1 || W02 > W0) {
                    String substring = str.substring(i2, W0);
                    a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = str.substring(i2, W02);
                    a.r(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(W02 + 1, W0);
                    a.r(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i2 = W0 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(@NotNull List<String> list, @NotNull StringBuilder sb) {
            a.s(list, "<this>");
            a.s(sb, "out");
            w0.e y02 = a.y0(a.F0(0, list.size()), 2);
            int i2 = y02.f31406a;
            int i3 = y02.f31407b;
            int i4 = y02.f31408c;
            if ((i4 <= 0 || i2 > i3) && (i4 >= 0 || i3 > i2)) {
                return;
            }
            while (true) {
                String str = list.get(i2);
                String str2 = list.get(i2 + 1);
                if (i2 > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append(SignatureVisitor.INSTANCEOF);
                    sb.append(str2);
                }
                if (i2 == i3) {
                    return;
                } else {
                    i2 += i4;
                }
            }
        }

        @d0.a
        @Nullable
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m702deprecated_get(@NotNull URL url) {
            a.s(url, "url");
            return get(url);
        }

        @Nullable
        public final HttpUrl get(@NotNull URL url) {
            a.s(url, "<this>");
            String url2 = url.toString();
            a.r(url2, "toString()");
            return parse(url2);
        }

        @d0.a
        @Nullable
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m701deprecated_get(@NotNull URI uri) {
            a.s(uri, ShareConstants.MEDIA_URI);
            return get(uri);
        }

        @Nullable
        public final HttpUrl get(@NotNull URI uri) {
            a.s(uri, "<this>");
            String uri2 = uri.toString();
            a.r(uri2, "toString()");
            return parse(uri2);
        }
    }

    public HttpUrl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i2, @NotNull List<String> list, @Nullable List<String> list2, @Nullable String str5, @NotNull String str6) {
        a.s(str, "scheme");
        a.s(str2, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        a.s(str3, "password");
        a.s(str4, "host");
        a.s(list, "pathSegments");
        a.s(str6, "url");
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i2;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = a.g(str, TournamentShareDialogURIBuilder.scheme);
    }

    public static final int defaultPort(@NotNull String str) {
        return Companion.defaultPort(str);
    }

    @NotNull
    public static final HttpUrl get(@NotNull String str) {
        return Companion.get(str);
    }

    @Nullable
    public static final HttpUrl parse(@NotNull String str) {
        return Companion.parse(str);
    }

    @d0.a
    @Nullable
    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m681deprecated_encodedFragment() {
        return encodedFragment();
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m682deprecated_encodedPassword() {
        return encodedPassword();
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m683deprecated_encodedPath() {
        return encodedPath();
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m684deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @d0.a
    @Nullable
    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m685deprecated_encodedQuery() {
        return encodedQuery();
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m686deprecated_encodedUsername() {
        return encodedUsername();
    }

    @d0.a
    @Nullable
    /* renamed from: -deprecated_fragment, reason: not valid java name */
    public final String m687deprecated_fragment() {
        return this.fragment;
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_host, reason: not valid java name */
    public final String m688deprecated_host() {
        return this.host;
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_password, reason: not valid java name */
    public final String m689deprecated_password() {
        return this.password;
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m690deprecated_pathSegments() {
        return this.pathSegments;
    }

    @d0.a
    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m691deprecated_pathSize() {
        return pathSize();
    }

    @d0.a
    /* renamed from: -deprecated_port, reason: not valid java name */
    public final int m692deprecated_port() {
        return this.port;
    }

    @d0.a
    @Nullable
    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m693deprecated_query() {
        return query();
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m694deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @d0.a
    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m695deprecated_querySize() {
        return querySize();
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m696deprecated_scheme() {
        return this.scheme;
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m697deprecated_uri() {
        return uri();
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m698deprecated_url() {
        return url();
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_username, reason: not valid java name */
    public final String m699deprecated_username() {
        return this.username;
    }

    @Nullable
    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String substring = this.url.substring(m.W0(this.url, '#', 0, false, 6) + 1);
        a.r(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @NotNull
    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        String substring = this.url.substring(m.W0(this.url, ':', this.scheme.length() + 3, false, 4) + 1, m.W0(this.url, '@', 0, false, 6));
        a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public final String encodedPath() {
        int W0 = m.W0(this.url, '/', this.scheme.length() + 3, false, 4);
        String str = this.url;
        String substring = this.url.substring(W0, Util.delimiterOffset(str, "?#", W0, str.length()));
        a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public final List<String> encodedPathSegments() {
        int W0 = m.W0(this.url, '/', this.scheme.length() + 3, false, 4);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", W0, str.length());
        ArrayList arrayList = new ArrayList();
        while (W0 < delimiterOffset) {
            int i2 = W0 + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, '/', i2, delimiterOffset);
            String substring = this.url.substring(i2, delimiterOffset2);
            a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            W0 = delimiterOffset2;
        }
        return arrayList;
    }

    @Nullable
    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int W0 = m.W0(this.url, '?', 0, false, 6) + 1;
        String str = this.url;
        String substring = this.url.substring(W0, Util.delimiterOffset(str, '#', W0, str.length()));
        a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String substring = this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
        a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof HttpUrl) && a.g(((HttpUrl) obj).url, this.url);
    }

    @Nullable
    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @NotNull
    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    @NotNull
    public final String password() {
        return this.password;
    }

    @NotNull
    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    @Nullable
    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    @Nullable
    public final String queryParameter(@NotNull String str) {
        a.s(str, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        w0.e y02 = a.y0(a.F0(0, list.size()), 2);
        int i2 = y02.f31406a;
        int i3 = y02.f31407b;
        int i4 = y02.f31408c;
        if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
            while (!a.g(str, this.queryNamesAndValues.get(i2))) {
                if (i2 != i3) {
                    i2 += i4;
                }
            }
            return this.queryNamesAndValues.get(i2 + 1);
        }
        return null;
    }

    @NotNull
    public final String queryParameterName(int i2) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i2 * 2);
        a.p(str);
        return str;
    }

    @NotNull
    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return y.f30220a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        w0.e y02 = a.y0(a.F0(0, this.queryNamesAndValues.size()), 2);
        int i2 = y02.f31406a;
        int i3 = y02.f31407b;
        int i4 = y02.f31408c;
        if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
            while (true) {
                String str = this.queryNamesAndValues.get(i2);
                a.p(str);
                linkedHashSet.add(str);
                if (i2 == i3) {
                    break;
                }
                i2 += i4;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        a.r(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @Nullable
    public final String queryParameterValue(int i2) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i2 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @NotNull
    public final List<String> queryParameterValues(@NotNull String str) {
        a.s(str, "name");
        if (this.queryNamesAndValues == null) {
            return w.f30218a;
        }
        ArrayList arrayList = new ArrayList();
        w0.e y02 = a.y0(a.F0(0, this.queryNamesAndValues.size()), 2);
        int i2 = y02.f31406a;
        int i3 = y02.f31407b;
        int i4 = y02.f31408c;
        if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
            while (true) {
                if (a.g(str, this.queryNamesAndValues.get(i2))) {
                    arrayList.add(this.queryNamesAndValues.get(i2 + 1));
                }
                if (i2 == i3) {
                    break;
                }
                i2 += i4;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        a.r(unmodifiableList, "unmodifiableList(result)");
        return unmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @NotNull
    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        a.p(newBuilder);
        return newBuilder.username("").password("").build().toString();
    }

    @Nullable
    public final HttpUrl resolve(@NotNull String str) {
        a.s(str, "link");
        Builder newBuilder = newBuilder(str);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    @NotNull
    public final String scheme() {
        return this.scheme;
    }

    @NotNull
    public String toString() {
        return this.url;
    }

    @Nullable
    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    @NotNull
    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                Pattern compile = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                a.r(compile, "compile(...)");
                a.s(builder, "input");
                String replaceAll = compile.matcher(builder).replaceAll("");
                a.r(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                a.r(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    @NotNull
    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @NotNull
    public final String username() {
        return this.username;
    }

    @Nullable
    public static final HttpUrl get(@NotNull URI uri) {
        return Companion.get(uri);
    }

    @Nullable
    public static final HttpUrl get(@NotNull URL url) {
        return Companion.get(url);
    }

    @Nullable
    public final Builder newBuilder(@NotNull String str) {
        a.s(str, "link");
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
