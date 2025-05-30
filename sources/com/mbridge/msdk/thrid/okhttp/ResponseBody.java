package com.mbridge.msdk.thrid.okhttp;

import Q7.n0;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.BufferedSource;
import com.mbridge.msdk.thrid.okio.ByteString;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import x0.AbstractC2914a;
import y.AbstractC2933a;

/* loaded from: classes3.dex */
public abstract class ResponseBody implements Closeable {
    private Reader reader;

    /* loaded from: classes3.dex */
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final BufferedSource source;

        public BomAwareReader(BufferedSource bufferedSource, Charset charset) {
            this.source = bufferedSource;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i9, int i10) throws IOException {
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.source.inputStream(), Util.bomAwareCharset(this.source, this.charset));
                    this.delegate = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i9, i10);
            }
            throw new IOException("Stream closed");
        }
    }

    private Charset charset() {
        MediaType contentType = contentType();
        if (contentType != null) {
            return contentType.charset(Util.UTF_8);
        }
        return Util.UTF_8;
    }

    public static ResponseBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null) {
            Charset charset2 = mediaType.charset();
            if (charset2 == null) {
                mediaType = MediaType.parse(mediaType + "; charset=utf-8");
            } else {
                charset = charset2;
            }
        }
        Buffer writeString = new Buffer().writeString(str, charset);
        return create(mediaType, writeString.size(), writeString);
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            BufferedSource source = source();
            try {
                byte[] readByteArray = source.readByteArray();
                Util.closeQuietly(source);
                if (contentLength != -1 && contentLength != readByteArray.length) {
                    throw new IOException(AbstractC2914a.g(AbstractC2933a.a("Content-Length (", contentLength, ") and stream length ("), readByteArray.length, ") disagree"));
                }
                return readByteArray;
            } catch (Throwable th) {
                Util.closeQuietly(source);
                throw th;
            }
        }
        throw new IOException(n0.g(contentLength, "Cannot buffer entire body for content length: "));
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader == null) {
            BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
            this.reader = bomAwareReader;
            return bomAwareReader;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract BufferedSource source();

    public final String string() throws IOException {
        BufferedSource source = source();
        try {
            return source.readString(Util.bomAwareCharset(source, charset()));
        } finally {
            Util.closeQuietly(source);
        }
    }

    public static ResponseBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr.length, new Buffer().write(bArr));
    }

    public static ResponseBody create(MediaType mediaType, ByteString byteString) {
        return create(mediaType, byteString.size(), new Buffer().write(byteString));
    }

    public static ResponseBody create(final MediaType mediaType, final long j7, final BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            return new ResponseBody() { // from class: com.mbridge.msdk.thrid.okhttp.ResponseBody.1
                @Override // com.mbridge.msdk.thrid.okhttp.ResponseBody
                public long contentLength() {
                    return j7;
                }

                @Override // com.mbridge.msdk.thrid.okhttp.ResponseBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // com.mbridge.msdk.thrid.okhttp.ResponseBody
                public BufferedSource source() {
                    return bufferedSource;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
}
