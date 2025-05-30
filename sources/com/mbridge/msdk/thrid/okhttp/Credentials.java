package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okio.ByteString;
import java.nio.charset.Charset;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2) {
        return basic(str, str2, Util.ISO_8859_1);
    }

    public static String basic(String str, String str2, Charset charset) {
        return AbstractC2914a.d("Basic ", ByteString.encodeString(str + ":" + str2, charset).base64());
    }
}
