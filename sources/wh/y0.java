package wh;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public abstract class y0 implements Closeable {
    public static final x0 Companion = new x0();
    private Reader reader;

    @JvmStatic
    @JvmName(name = "create")
    public static final y0 create(String str, g0 g0Var) {
        Companion.getClass();
        return x0.a(str, g0Var);
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final ki.l byteString() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            ki.k source = source();
            try {
                ki.l readByteString = source.readByteString();
                CloseableKt.closeFinally(source, null);
                int d10 = readByteString.d();
                if (contentLength != -1 && contentLength != d10) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + d10 + ") disagree");
                }
                return readByteString;
            } finally {
            }
        } else {
            throw new IOException(Intrinsics.stringPlus("Cannot buffer entire body for content length: ", Long.valueOf(contentLength)));
        }
    }

    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            ki.k source = source();
            try {
                byte[] readByteArray = source.readByteArray();
                CloseableKt.closeFinally(source, null);
                int length = readByteArray.length;
                if (contentLength != -1 && contentLength != length) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
                }
                return readByteArray;
            } finally {
            }
        } else {
            throw new IOException(Intrinsics.stringPlus("Cannot buffer entire body for content length: ", Long.valueOf(contentLength)));
        }
    }

    public final Reader charStream() {
        Charset a;
        Reader reader = this.reader;
        if (reader == null) {
            ki.k source = source();
            g0 contentType = contentType();
            if (contentType == null) {
                a = null;
            } else {
                a = contentType.a(Charsets.UTF_8);
            }
            if (a == null) {
                a = Charsets.UTF_8;
            }
            reader = new v0(source, a);
            this.reader = reader;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        xh.b.c(source());
    }

    public abstract long contentLength();

    public abstract g0 contentType();

    public abstract ki.k source();

    public final String string() throws IOException {
        Charset a;
        ki.k source = source();
        try {
            g0 contentType = contentType();
            if (contentType == null) {
                a = null;
            } else {
                a = contentType.a(Charsets.UTF_8);
            }
            if (a == null) {
                a = Charsets.UTF_8;
            }
            String readString = source.readString(xh.b.r(source, a));
            CloseableKt.closeFinally(source, null);
            return readString;
        } finally {
        }
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final y0 create(ki.k kVar, g0 g0Var, long j3) {
        Companion.getClass();
        return x0.b(kVar, g0Var, j3);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final y0 create(ki.l lVar, g0 g0Var) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        ki.i iVar = new ki.i();
        iVar.v(lVar);
        return x0.b(iVar, g0Var, lVar.d());
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @JvmStatic
    public static final y0 create(g0 g0Var, long j3, ki.k content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return x0.b(content, g0Var, j3);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final y0 create(g0 g0Var, String content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return x0.a(content, g0Var);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final y0 create(g0 g0Var, ki.l content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        ki.i iVar = new ki.i();
        iVar.v(content);
        return x0.b(iVar, g0Var, content.d());
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final y0 create(g0 g0Var, byte[] content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return x0.c(content, g0Var);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final y0 create(byte[] bArr, g0 g0Var) {
        Companion.getClass();
        return x0.c(bArr, g0Var);
    }
}
