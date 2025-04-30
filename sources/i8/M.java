package i8;

import com.applovin.sdk.AppLovinEventTypes;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class M implements Closeable {
    public static final L Companion = new Object();
    private Reader reader;

    public static final M create(x xVar, long j7, w8.h hVar) {
        Companion.getClass();
        G7.j.e(hVar, AppLovinEventTypes.USER_VIEWED_CONTENT);
        return L.b(hVar, xVar, j7);
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final w8.i byteString() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            w8.h source = source();
            try {
                w8.i readByteString = source.readByteString();
                android.support.v4.media.session.a.f(source, null);
                int c9 = readByteString.c();
                if (contentLength != -1 && contentLength != c9) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + c9 + ") disagree");
                }
                return readByteString;
            } finally {
            }
        } else {
            throw new IOException(G7.j.j(Long.valueOf(contentLength), "Cannot buffer entire body for content length: "));
        }
    }

    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            w8.h source = source();
            try {
                byte[] readByteArray = source.readByteArray();
                android.support.v4.media.session.a.f(source, null);
                int length = readByteArray.length;
                if (contentLength != -1 && contentLength != length) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
                }
                return readByteArray;
            } finally {
            }
        } else {
            throw new IOException(G7.j.j(Long.valueOf(contentLength), "Cannot buffer entire body for content length: "));
        }
    }

    public final Reader charStream() {
        Charset a6;
        Reader reader = this.reader;
        if (reader == null) {
            w8.h source = source();
            x contentType = contentType();
            if (contentType == null) {
                a6 = null;
            } else {
                a6 = contentType.a(O7.a.f2244a);
            }
            if (a6 == null) {
                a6 = O7.a.f2244a;
            }
            reader = new J(source, a6);
            this.reader = reader;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        j8.b.c(source());
    }

    public abstract long contentLength();

    public abstract x contentType();

    public abstract w8.h source();

    public final String string() throws IOException {
        Charset a6;
        w8.h source = source();
        try {
            x contentType = contentType();
            if (contentType == null) {
                a6 = null;
            } else {
                a6 = contentType.a(O7.a.f2244a);
            }
            if (a6 == null) {
                a6 = O7.a.f2244a;
            }
            String readString = source.readString(j8.b.r(source, a6));
            android.support.v4.media.session.a.f(source, null);
            return readString;
        } finally {
        }
    }

    public static final M create(x xVar, String str) {
        Companion.getClass();
        G7.j.e(str, AppLovinEventTypes.USER_VIEWED_CONTENT);
        return L.a(str, xVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, w8.h, w8.f] */
    public static final M create(x xVar, w8.i iVar) {
        Companion.getClass();
        G7.j.e(iVar, AppLovinEventTypes.USER_VIEWED_CONTENT);
        ?? obj = new Object();
        obj.l(iVar);
        return L.b(obj, xVar, iVar.c());
    }

    public static final M create(x xVar, byte[] bArr) {
        Companion.getClass();
        G7.j.e(bArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
        return L.c(bArr, xVar);
    }

    public static final M create(String str, x xVar) {
        Companion.getClass();
        return L.a(str, xVar);
    }

    public static final M create(w8.h hVar, x xVar, long j7) {
        Companion.getClass();
        return L.b(hVar, xVar, j7);
    }

    public static final M create(byte[] bArr, x xVar) {
        Companion.getClass();
        return L.c(bArr, xVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, w8.h, w8.f] */
    public static final M create(w8.i iVar, x xVar) {
        Companion.getClass();
        G7.j.e(iVar, "<this>");
        ?? obj = new Object();
        obj.l(iVar);
        return L.b(obj, xVar, iVar.c());
    }
}
