package okhttp3;

import android.support.v4.media.d;
import com.safedk.android.internal.partials.OkHttpNetworkBridge;
import d0.b0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public abstract class ResponseBody implements Closeable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private Reader reader;

    /* loaded from: classes.dex */
    public static final class BomAwareReader extends Reader {

        @NotNull
        private final Charset charset;
        private boolean closed;

        @Nullable
        private Reader delegate;

        @NotNull
        private final BufferedSource source;

        public BomAwareReader(@NotNull BufferedSource bufferedSource, @NotNull Charset charset) {
            a.s(bufferedSource, "source");
            a.s(charset, "charset");
            this.source = bufferedSource;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            b0 b0Var;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                b0Var = b0.f30125a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(@NotNull char[] cArr, int i2, int i3) throws IOException {
            a.s(cArr, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.delegate;
            if (reader == null) {
                reader = new InputStreamReader(this.source.inputStream(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = reader;
            }
            return reader.read(cArr, i2, i3);
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @NotNull
        public final ResponseBody create(@NotNull String str, @Nullable MediaType mediaType) {
            a.s(str, "<this>");
            Charset charset = z0.a.f31458a;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charset$default;
                }
            }
            Buffer writeString = new Buffer().writeString(str, charset);
            return create(writeString, mediaType, writeString.size());
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, BufferedSource bufferedSource, MediaType mediaType, long j2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            if ((i2 & 2) != 0) {
                j2 = -1;
            }
            return companion.create(bufferedSource, mediaType, j2);
        }

        @NotNull
        public final ResponseBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
            a.s(bArr, "<this>");
            return create(new Buffer().write(bArr), mediaType, bArr.length);
        }

        @NotNull
        public final ResponseBody create(@NotNull ByteString byteString, @Nullable MediaType mediaType) {
            a.s(byteString, "<this>");
            return create(new Buffer().write(byteString), mediaType, byteString.size());
        }

        @NotNull
        public final ResponseBody create(@NotNull final BufferedSource bufferedSource, @Nullable final MediaType mediaType, final long j2) {
            a.s(bufferedSource, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j2;
                }

                @Override // okhttp3.ResponseBody
                @Nullable
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                @NotNull
                public BufferedSource source() {
                    return bufferedSource;
                }
            };
        }

        @d0.a
        @NotNull
        public final ResponseBody create(@Nullable MediaType mediaType, @NotNull String str) {
            a.s(str, "content");
            return create(str, mediaType);
        }

        @d0.a
        @NotNull
        public final ResponseBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
            a.s(bArr, "content");
            return create(bArr, mediaType);
        }

        @d0.a
        @NotNull
        public final ResponseBody create(@Nullable MediaType mediaType, @NotNull ByteString byteString) {
            a.s(byteString, "content");
            return create(byteString, mediaType);
        }

        @d0.a
        @NotNull
        public final ResponseBody create(@Nullable MediaType mediaType, long j2, @NotNull BufferedSource bufferedSource) {
            a.s(bufferedSource, "content");
            return create(bufferedSource, mediaType, j2);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType contentType = contentType();
        return (contentType == null || (charset = contentType.charset(z0.a.f31458a)) == null) ? z0.a.f31458a : charset;
    }

    private final <T> T consumeSource(l lVar, l lVar2) {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException(d.m("Cannot buffer entire body for content length: ", contentLength));
        }
        BufferedSource retrofitExceptionCatchingRequestBody_source = OkHttpNetworkBridge.retrofitExceptionCatchingRequestBody_source(this);
        try {
            T t2 = (T) lVar.invoke(retrofitExceptionCatchingRequestBody_source);
            q.b(retrofitExceptionCatchingRequestBody_source, null);
            int intValue = ((Number) lVar2.invoke(t2)).intValue();
            if (contentLength == -1 || contentLength == intValue) {
                return t2;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + intValue + ") disagree");
        } finally {
        }
    }

    @NotNull
    public static final ResponseBody create(@NotNull String str, @Nullable MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    @NotNull
    public final InputStream byteStream() {
        return OkHttpNetworkBridge.retrofitExceptionCatchingRequestBody_source(this).inputStream();
    }

    @NotNull
    public final ByteString byteString() throws IOException {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException(d.m("Cannot buffer entire body for content length: ", contentLength));
        }
        BufferedSource retrofitExceptionCatchingRequestBody_source = OkHttpNetworkBridge.retrofitExceptionCatchingRequestBody_source(this);
        try {
            ByteString readByteString = retrofitExceptionCatchingRequestBody_source.readByteString();
            q.b(retrofitExceptionCatchingRequestBody_source, null);
            int size = readByteString.size();
            if (contentLength == -1 || contentLength == size) {
                return readByteString;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + size + ") disagree");
        } finally {
        }
    }

    @NotNull
    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException(d.m("Cannot buffer entire body for content length: ", contentLength));
        }
        BufferedSource retrofitExceptionCatchingRequestBody_source = OkHttpNetworkBridge.retrofitExceptionCatchingRequestBody_source(this);
        try {
            byte[] readByteArray = retrofitExceptionCatchingRequestBody_source.readByteArray();
            q.b(retrofitExceptionCatchingRequestBody_source, null);
            int length = readByteArray.length;
            if (contentLength == -1 || contentLength == length) {
                return readByteArray;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    @NotNull
    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(OkHttpNetworkBridge.retrofitExceptionCatchingRequestBody_source(this), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(OkHttpNetworkBridge.retrofitExceptionCatchingRequestBody_source(this));
    }

    public abstract long contentLength();

    @Nullable
    public abstract MediaType contentType();

    @NotNull
    public abstract BufferedSource source();

    @NotNull
    public final String string() throws IOException {
        BufferedSource retrofitExceptionCatchingRequestBody_source = OkHttpNetworkBridge.retrofitExceptionCatchingRequestBody_source(this);
        try {
            String readString = retrofitExceptionCatchingRequestBody_source.readString(Util.readBomAsCharset(retrofitExceptionCatchingRequestBody_source, charset()));
            q.b(retrofitExceptionCatchingRequestBody_source, null);
            return readString;
        } finally {
        }
    }

    @d0.a
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, long j2, @NotNull BufferedSource bufferedSource) {
        return Companion.create(mediaType, j2, bufferedSource);
    }

    @d0.a
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull String str) {
        return Companion.create(mediaType, str);
    }

    @d0.a
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull ByteString byteString) {
        return Companion.create(mediaType, byteString);
    }

    @d0.a
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    @NotNull
    public static final ResponseBody create(@NotNull BufferedSource bufferedSource, @Nullable MediaType mediaType, long j2) {
        return Companion.create(bufferedSource, mediaType, j2);
    }

    @NotNull
    public static final ResponseBody create(@NotNull ByteString byteString, @Nullable MediaType mediaType) {
        return Companion.create(byteString, mediaType);
    }

    @NotNull
    public static final ResponseBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }
}
