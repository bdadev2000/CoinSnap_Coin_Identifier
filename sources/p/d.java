package p;

import com.facebook.appevents.AppEventsConstants;
import com.google.common.net.HttpHeaders;
import okhttp3.Headers;
import z0.m;

/* loaded from: classes3.dex */
public abstract class d {
    public static Headers a(Headers headers, Headers headers2) {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            String name = headers.name(i2);
            String value = headers.value(i2);
            if ((!m.S0(HttpHeaders.WARNING, name, true) || !m.q1(value, AppEventsConstants.EVENT_PARAM_VALUE_YES, false)) && (m.S0(HttpHeaders.CONTENT_LENGTH, name, true) || m.S0(HttpHeaders.CONTENT_ENCODING, name, true) || m.S0("Content-Type", name, true) || !b(name) || headers2.get(name) == null)) {
                builder.addUnsafeNonAscii(name, value);
            }
        }
        int size2 = headers2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            String name2 = headers2.name(i3);
            if (!m.S0(HttpHeaders.CONTENT_LENGTH, name2, true) && !m.S0(HttpHeaders.CONTENT_ENCODING, name2, true) && !m.S0("Content-Type", name2, true) && b(name2)) {
                builder.addUnsafeNonAscii(name2, headers2.value(i3));
            }
        }
        return builder.build();
    }

    public static boolean b(String str) {
        return (m.S0(HttpHeaders.CONNECTION, str, true) || m.S0(HttpHeaders.KEEP_ALIVE, str, true) || m.S0(HttpHeaders.PROXY_AUTHENTICATE, str, true) || m.S0(HttpHeaders.PROXY_AUTHORIZATION, str, true) || m.S0(HttpHeaders.TE, str, true) || m.S0("Trailers", str, true) || m.S0(HttpHeaders.TRANSFER_ENCODING, str, true) || m.S0(HttpHeaders.UPGRADE, str, true)) ? false : true;
    }
}
