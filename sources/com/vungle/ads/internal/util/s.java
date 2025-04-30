package com.vungle.ads.internal.util;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
public final class s {
    public static final s INSTANCE = new s();

    private s() {
    }

    public final String convertForSending(String str) throws IOException {
        G7.j.e(str, "stringToConvert");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                byte[] bytes = str.getBytes(O7.a.f2244a);
                G7.j.d(bytes, "this as java.lang.String).getBytes(charset)");
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.close();
                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                G7.j.d(encodeToString, "encodeToString(compressed, Base64.NO_WRAP)");
                android.support.v4.media.session.a.f(gZIPOutputStream, null);
                android.support.v4.media.session.a.f(byteArrayOutputStream, null);
                return encodeToString;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                android.support.v4.media.session.a.f(byteArrayOutputStream, th);
                throw th2;
            }
        }
    }
}
