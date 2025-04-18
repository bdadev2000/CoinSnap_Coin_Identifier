package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.k;
import okhttp3.Protocol;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import p0.a;
import z0.m;

/* loaded from: classes2.dex */
public final class StatusLine {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;

    @NotNull
    public final String message;

    @NotNull
    public final Protocol protocol;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @NotNull
        public final StatusLine get(@NotNull Response response) {
            a.s(response, "response");
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        @NotNull
        public final StatusLine parse(@NotNull String str) throws IOException {
            Protocol protocol;
            int i2;
            String str2;
            a.s(str, "statusLine");
            if (m.q1(str, "HTTP/1.", false)) {
                i2 = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!m.q1(str, "ICY ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                protocol = Protocol.HTTP_1_0;
                i2 = 4;
            }
            int i3 = i2 + 3;
            if (str.length() < i3) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            try {
                String substring = str.substring(i2, i3);
                a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (str.length() <= i3) {
                    str2 = "";
                } else {
                    if (str.charAt(i3) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                    str2 = str.substring(i2 + 4);
                    a.r(str2, "this as java.lang.String).substring(startIndex)");
                }
                return new StatusLine(protocol, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }
    }

    public StatusLine(@NotNull Protocol protocol, int i2, @NotNull String str) {
        a.s(protocol, "protocol");
        a.s(str, "message");
        this.protocol = protocol;
        this.code = i2;
        this.message = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        String sb2 = sb.toString();
        a.r(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
