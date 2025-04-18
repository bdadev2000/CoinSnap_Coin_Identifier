package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Predicate;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import eb.j;
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
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import vd.e;

/* loaded from: classes4.dex */
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
            } catch (Exception e2) {
                Log.e(TAG, "Unexpected error while disconnecting", e2);
            }
            this.connection = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
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
            if (r2 != 0) goto L9b
            java.util.regex.Pattern r2 = com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultHttpDataSource.CONTENT_RANGE_HEADER
            java.util.regex.Matcher r2 = r2.matcher(r11)
            boolean r7 = r2.find()
            if (r7 == 0) goto L9b
            r7 = 2
            java.lang.String r7 = r2.group(r7)     // Catch: java.lang.NumberFormatException -> L87
            long r7 = java.lang.Long.parseLong(r7)     // Catch: java.lang.NumberFormatException -> L87
            r9 = 1
            java.lang.String r2 = r2.group(r9)     // Catch: java.lang.NumberFormatException -> L87
            long r9 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L87
            long r7 = r7 - r9
            r9 = 1
            long r7 = r7 + r9
            r9 = 0
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 >= 0) goto L63
            r5 = r7
            goto L9b
        L63:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L9b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L87
            r2.<init>(r0)     // Catch: java.lang.NumberFormatException -> L87
            r2.append(r1)     // Catch: java.lang.NumberFormatException -> L87
            java.lang.String r0 = "] ["
            r2.append(r0)     // Catch: java.lang.NumberFormatException -> L87
            r2.append(r11)     // Catch: java.lang.NumberFormatException -> L87
            r2.append(r3)     // Catch: java.lang.NumberFormatException -> L87
            java.lang.String r0 = r2.toString()     // Catch: java.lang.NumberFormatException -> L87
            android.util.Log.w(r4, r0)     // Catch: java.lang.NumberFormatException -> L87
            long r0 = java.lang.Math.max(r5, r7)     // Catch: java.lang.NumberFormatException -> L87
            r5 = r0
            goto L9b
        L87:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.<init>(r1)
            r0.append(r11)
            r0.append(r3)
            java.lang.String r11 = r0.toString()
            android.util.Log.e(r4, r11)
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultHttpDataSource.getContentLength(java.net.HttpURLConnection):long");
    }

    private static URL handleRedirect(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!Constants.SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new ProtocolException(e.e("Unsupported protocol redirect: ", protocol));
            }
            return url2;
        }
        throw new ProtocolException("Null location redirect");
    }

    private HttpURLConnection makeConnection(DataSpec dataSpec) throws IOException {
        HttpURLConnection makeConnection;
        URL url = new URL(dataSpec.uri.toString());
        byte[] bArr = dataSpec.postBody;
        long j3 = dataSpec.position;
        long j10 = dataSpec.length;
        boolean isFlagSet = dataSpec.isFlagSet(1);
        if (!this.allowCrossProtocolRedirects) {
            return makeConnection(url, bArr, j3, j10, isFlagSet, true);
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i10 <= 20) {
                long j11 = j3;
                makeConnection = makeConnection(url, bArr, j3, j10, isFlagSet, false);
                int responseCode = makeConnection.getResponseCode();
                if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                    String headerField = makeConnection.getHeaderField("Location");
                    makeConnection.disconnect();
                    url = handleRedirect(url, headerField);
                    bArr = null;
                    i10 = i11;
                    j3 = j11;
                }
            } else {
                throw new NoRouteToHostException(j.i("Too many redirects: ", i11));
            }
        }
        return makeConnection;
    }

    private static void maybeTerminateInputStream(HttpURLConnection httpURLConnection, long j3) {
        int i10 = Util.SDK_INT;
        if (i10 != 19 && i10 != 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j3 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j3 <= MAX_BYTES_TO_DRAIN) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    private int readInternal(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.bytesToRead;
        if (j3 != -1) {
            long j10 = j3 - this.bytesRead;
            if (j10 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j10);
        }
        int read = this.inputStream.read(bArr, i10, i11);
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
            long j3 = this.bytesSkipped;
            long j10 = this.bytesToSkip;
            if (j3 != j10) {
                int read = this.inputStream.read(andSet, 0, (int) Math.min(j10 - j3, andSet.length));
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
        long j3 = this.bytesToRead;
        return j3 == -1 ? j3 : j3 - this.bytesRead;
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
                } catch (IOException e2) {
                    throw new HttpDataSource.HttpDataSourceException(e2, this.dataSpec, 3);
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
        long j3 = 0;
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
                        long j10 = dataSpec.position;
                        if (j10 != 0) {
                            j3 = j10;
                        }
                    }
                    this.bytesToSkip = j3;
                    if (!dataSpec.isFlagSet(1)) {
                        long j11 = dataSpec.length;
                        long j12 = -1;
                        if (j11 != -1) {
                            this.bytesToRead = j11;
                        } else {
                            long contentLength = getContentLength(this.connection);
                            if (contentLength != -1) {
                                j12 = contentLength - this.bytesToSkip;
                            }
                            this.bytesToRead = j12;
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
                    } catch (IOException e2) {
                        closeConnectionQuietly();
                        throw new HttpDataSource.HttpDataSourceException(e2, dataSpec, 1);
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
            } catch (IOException e10) {
                closeConnectionQuietly();
                throw new HttpDataSource.HttpDataSourceException("Unable to connect to " + dataSpec.uri.toString(), e10, dataSpec, 1);
            }
        } catch (IOException e11) {
            throw new HttpDataSource.HttpDataSourceException("Unable to connect to " + dataSpec.uri.toString(), e11, dataSpec, 1);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource, com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public int read(byte[] bArr, int i10, int i11) throws HttpDataSource.HttpDataSourceException {
        try {
            skipInternal();
            return readInternal(bArr, i10, i11);
        } catch (IOException e2) {
            throw new HttpDataSource.HttpDataSourceException(e2, this.dataSpec, 2);
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

    public DefaultHttpDataSource(String str, Predicate<String> predicate, TransferListener<? super DefaultHttpDataSource> transferListener, int i10, int i11) {
        this(str, predicate, transferListener, i10, i11, false, null);
    }

    public DefaultHttpDataSource(String str, Predicate<String> predicate, TransferListener<? super DefaultHttpDataSource> transferListener, int i10, int i11, boolean z10, HttpDataSource.RequestProperties requestProperties) {
        this.userAgent = Assertions.checkNotEmpty(str);
        this.contentTypePredicate = predicate;
        this.listener = transferListener;
        this.requestProperties = new HttpDataSource.RequestProperties();
        this.connectTimeoutMillis = i10;
        this.readTimeoutMillis = i11;
        this.allowCrossProtocolRedirects = z10;
        this.defaultRequestProperties = requestProperties;
    }

    private HttpURLConnection makeConnection(URL url, byte[] bArr, long j3, long j10, boolean z10, boolean z11) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
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
        if (j3 != 0 || j10 != -1) {
            String f10 = a4.j.f("bytes=", j3, "-");
            if (j10 != -1) {
                StringBuilder m10 = j.m(f10);
                m10.append((j3 + j10) - 1);
                f10 = m10.toString();
            }
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, f10);
        }
        httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.userAgent);
        if (!z10) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z11);
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
