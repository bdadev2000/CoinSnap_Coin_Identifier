package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.applovin.impl.L;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Predicate;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public class DefaultHttpDataSource implements HttpDataSource {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final long MAX_BYTES_TO_DRAIN = 2048;
    private static final int MAX_REDIRECTS = 20;
    private static final String TAG = "DefaultHttpDataSource";
    private final boolean allowCrossProtocolRedirects;
    private long bytesRead;
    private long bytesSkipped;
    private long bytesToRead;
    private long bytesToSkip;
    private final int connectTimeoutMillis;
    private HttpURLConnection connection;
    private final Predicate<String> contentTypePredicate;
    private DataSpec dataSpec;
    private final HttpDataSource.RequestProperties defaultRequestProperties;
    private InputStream inputStream;
    private final TransferListener<? super DefaultHttpDataSource> listener;
    private boolean opened;
    private final int readTimeoutMillis;
    private final HttpDataSource.RequestProperties requestProperties;
    private final String userAgent;
    private static final Pattern CONTENT_RANGE_HEADER = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> skipBufferReference = new AtomicReference<>();

    public DefaultHttpDataSource(String str, Predicate<String> predicate) {
        this(str, predicate, null);
    }

    private void closeConnectionQuietly() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e4) {
                Log.e(TAG, "Unexpected error while disconnecting", e4);
            }
            this.connection = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long getContentLength(java.net.HttpURLConnection r11) {
        /*
            java.lang.String r0 = "Inconsistent headers ["
            java.lang.String r1 = "Content-Length"
            java.lang.String r1 = r11.getHeaderField(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "]"
            java.lang.String r4 = "DefaultHttpDataSource"
            if (r2 != 0) goto L2b
            long r5 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L17
            goto L2d
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Unexpected Content-Length ["
            r2.<init>(r5)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r4, r2)
        L2b:
            r5 = -1
        L2d:
            java.lang.String r2 = "Content-Range"
            java.lang.String r11 = r11.getHeaderField(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            if (r2 != 0) goto L9a
            java.util.regex.Pattern r2 = com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultHttpDataSource.CONTENT_RANGE_HEADER
            java.util.regex.Matcher r2 = r2.matcher(r11)
            boolean r7 = r2.find()
            if (r7 == 0) goto L9a
            r7 = 2
            java.lang.String r7 = r2.group(r7)     // Catch: java.lang.NumberFormatException -> L86
            long r7 = java.lang.Long.parseLong(r7)     // Catch: java.lang.NumberFormatException -> L86
            r9 = 1
            java.lang.String r2 = r2.group(r9)     // Catch: java.lang.NumberFormatException -> L86
            long r9 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L86
            long r7 = r7 - r9
            r9 = 1
            long r7 = r7 + r9
            r9 = 0
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 >= 0) goto L63
            r5 = r7
            goto L9a
        L63:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L9a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L86
            r2.<init>(r0)     // Catch: java.lang.NumberFormatException -> L86
            r2.append(r1)     // Catch: java.lang.NumberFormatException -> L86
            java.lang.String r0 = "] ["
            r2.append(r0)     // Catch: java.lang.NumberFormatException -> L86
            r2.append(r11)     // Catch: java.lang.NumberFormatException -> L86
            r2.append(r3)     // Catch: java.lang.NumberFormatException -> L86
            java.lang.String r0 = r2.toString()     // Catch: java.lang.NumberFormatException -> L86
            android.util.Log.w(r4, r0)     // Catch: java.lang.NumberFormatException -> L86
            long r5 = java.lang.Math.max(r5, r7)     // Catch: java.lang.NumberFormatException -> L86
            goto L9a
        L86:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.<init>(r1)
            r0.append(r11)
            r0.append(r3)
            java.lang.String r11 = r0.toString()
            android.util.Log.e(r4, r11)
        L9a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultHttpDataSource.getContentLength(java.net.HttpURLConnection):long");
    }

    private static URL handleRedirect(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!Constants.SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new ProtocolException(AbstractC2914a.d("Unsupported protocol redirect: ", protocol));
            }
            return url2;
        }
        throw new ProtocolException("Null location redirect");
    }

    private HttpURLConnection makeConnection(DataSpec dataSpec) throws IOException {
        HttpURLConnection makeConnection;
        URL url = new URL(dataSpec.uri.toString());
        byte[] bArr = dataSpec.postBody;
        long j7 = dataSpec.position;
        long j9 = dataSpec.length;
        boolean isFlagSet = dataSpec.isFlagSet(1);
        if (!this.allowCrossProtocolRedirects) {
            return makeConnection(url, bArr, j7, j9, isFlagSet, true);
        }
        int i9 = 0;
        while (true) {
            int i10 = i9 + 1;
            if (i9 <= 20) {
                long j10 = j7;
                makeConnection = makeConnection(url, bArr, j7, j9, isFlagSet, false);
                int responseCode = makeConnection.getResponseCode();
                if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                    String headerField = makeConnection.getHeaderField("Location");
                    makeConnection.disconnect();
                    url = handleRedirect(url, headerField);
                    bArr = null;
                    i9 = i10;
                    j7 = j10;
                }
            } else {
                throw new NoRouteToHostException(o.h(i10, "Too many redirects: "));
            }
        }
        return makeConnection;
    }

    private static void maybeTerminateInputStream(HttpURLConnection httpURLConnection, long j7) {
        int i9 = Util.SDK_INT;
        if (i9 != 19 && i9 != 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j7 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j7 <= MAX_BYTES_TO_DRAIN) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    private int readInternal(byte[] bArr, int i9, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j7 = this.bytesToRead;
        if (j7 != -1) {
            long j9 = j7 - this.bytesRead;
            if (j9 == 0) {
                return -1;
            }
            i10 = (int) Math.min(i10, j9);
        }
        int read = this.inputStream.read(bArr, i9, i10);
        if (read == -1) {
            if (this.bytesToRead == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.bytesRead += read;
        TransferListener<? super DefaultHttpDataSource> transferListener = this.listener;
        if (transferListener != null) {
            transferListener.onBytesTransferred(this, read);
        }
        return read;
    }

    private void skipInternal() throws IOException {
        if (this.bytesSkipped == this.bytesToSkip) {
            return;
        }
        byte[] andSet = skipBufferReference.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j7 = this.bytesSkipped;
            long j9 = this.bytesToSkip;
            if (j7 != j9) {
                int read = this.inputStream.read(andSet, 0, (int) Math.min(j9 - j7, andSet.length));
                if (!Thread.currentThread().isInterrupted()) {
                    if (read != -1) {
                        this.bytesSkipped += read;
                        TransferListener<? super DefaultHttpDataSource> transferListener = this.listener;
                        if (transferListener != null) {
                            transferListener.onBytesTransferred(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    throw new InterruptedIOException();
                }
            } else {
                skipBufferReference.set(andSet);
                return;
            }
        }
    }

    public final long bytesRead() {
        return this.bytesRead;
    }

    public final long bytesRemaining() {
        long j7 = this.bytesToRead;
        if (j7 != -1) {
            return j7 - this.bytesRead;
        }
        return j7;
    }

    public final long bytesSkipped() {
        return this.bytesSkipped;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource
    public void clearRequestProperty(String str) {
        Assertions.checkNotNull(str);
        this.requestProperties.remove(str);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource, com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public void close() throws HttpDataSource.HttpDataSourceException {
        try {
            if (this.inputStream != null) {
                maybeTerminateInputStream(this.connection, bytesRemaining());
                try {
                    this.inputStream.close();
                } catch (IOException e4) {
                    throw new HttpDataSource.HttpDataSourceException(e4, this.dataSpec, 3);
                }
            }
        } finally {
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.opened) {
                this.opened = false;
                TransferListener<? super DefaultHttpDataSource> transferListener = this.listener;
                if (transferListener != null) {
                    transferListener.onTransferEnd(this);
                }
            }
        }
    }

    public final HttpURLConnection getConnection() {
        return this.connection;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource, com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        this.dataSpec = dataSpec;
        long j7 = 0;
        this.bytesRead = 0L;
        this.bytesSkipped = 0L;
        try {
            HttpURLConnection makeConnection = makeConnection(dataSpec);
            this.connection = makeConnection;
            try {
                int responseCode = makeConnection.getResponseCode();
                if (responseCode >= 200 && responseCode <= 299) {
                    String contentType = this.connection.getContentType();
                    Predicate<String> predicate = this.contentTypePredicate;
                    if (predicate != null && !predicate.evaluate(contentType)) {
                        closeConnectionQuietly();
                        throw new HttpDataSource.InvalidContentTypeException(contentType, dataSpec);
                    }
                    if (responseCode == 200) {
                        long j9 = dataSpec.position;
                        if (j9 != 0) {
                            j7 = j9;
                        }
                    }
                    this.bytesToSkip = j7;
                    if (!dataSpec.isFlagSet(1)) {
                        long j10 = dataSpec.length;
                        long j11 = -1;
                        if (j10 != -1) {
                            this.bytesToRead = j10;
                        } else {
                            long contentLength = getContentLength(this.connection);
                            if (contentLength != -1) {
                                j11 = contentLength - this.bytesToSkip;
                            }
                            this.bytesToRead = j11;
                        }
                    } else {
                        this.bytesToRead = dataSpec.length;
                    }
                    try {
                        this.inputStream = this.connection.getInputStream();
                        this.opened = true;
                        TransferListener<? super DefaultHttpDataSource> transferListener = this.listener;
                        if (transferListener != null) {
                            transferListener.onTransferStart(this, dataSpec);
                        }
                        return this.bytesToRead;
                    } catch (IOException e4) {
                        closeConnectionQuietly();
                        throw new HttpDataSource.HttpDataSourceException(e4, dataSpec, 1);
                    }
                }
                Map<String, List<String>> headerFields = this.connection.getHeaderFields();
                closeConnectionQuietly();
                HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = new HttpDataSource.InvalidResponseCodeException(responseCode, headerFields, dataSpec);
                if (responseCode == 416) {
                    invalidResponseCodeException.initCause(new DataSourceException(0));
                    throw invalidResponseCodeException;
                }
                throw invalidResponseCodeException;
            } catch (IOException e9) {
                closeConnectionQuietly();
                throw new HttpDataSource.HttpDataSourceException("Unable to connect to " + dataSpec.uri.toString(), e9, dataSpec, 1);
            }
        } catch (IOException e10) {
            throw new HttpDataSource.HttpDataSourceException("Unable to connect to " + dataSpec.uri.toString(), e10, dataSpec, 1);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource, com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public int read(byte[] bArr, int i9, int i10) throws HttpDataSource.HttpDataSourceException {
        try {
            skipInternal();
            return readInternal(bArr, i9, i10);
        } catch (IOException e4) {
            throw new HttpDataSource.HttpDataSourceException(e4, this.dataSpec, 2);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource
    public void setRequestProperty(String str, String str2) {
        Assertions.checkNotNull(str);
        Assertions.checkNotNull(str2);
        this.requestProperties.set(str, str2);
    }

    public DefaultHttpDataSource(String str, Predicate<String> predicate, TransferListener<? super DefaultHttpDataSource> transferListener) {
        this(str, predicate, transferListener, 8000, 8000);
    }

    public DefaultHttpDataSource(String str, Predicate<String> predicate, TransferListener<? super DefaultHttpDataSource> transferListener, int i9, int i10) {
        this(str, predicate, transferListener, i9, i10, false, null);
    }

    public DefaultHttpDataSource(String str, Predicate<String> predicate, TransferListener<? super DefaultHttpDataSource> transferListener, int i9, int i10, boolean z8, HttpDataSource.RequestProperties requestProperties) {
        this.userAgent = Assertions.checkNotEmpty(str);
        this.contentTypePredicate = predicate;
        this.listener = transferListener;
        this.requestProperties = new HttpDataSource.RequestProperties();
        this.connectTimeoutMillis = i9;
        this.readTimeoutMillis = i10;
        this.allowCrossProtocolRedirects = z8;
        this.defaultRequestProperties = requestProperties;
    }

    private HttpURLConnection makeConnection(URL url, byte[] bArr, long j7, long j9, boolean z8, boolean z9) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(this.connectTimeoutMillis);
        httpURLConnection.setReadTimeout(this.readTimeoutMillis);
        HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            for (Map.Entry<String, String> entry : requestProperties.getSnapshot().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.requestProperties.getSnapshot().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j7 != 0 || j9 != -1) {
            String j10 = L.j("bytes=", j7, "-");
            if (j9 != -1) {
                StringBuilder b = AbstractC2965e.b(j10);
                b.append((j7 + j9) - 1);
                j10 = b.toString();
            }
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, j10);
        }
        httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.userAgent);
        if (!z8) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z9);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }
}
