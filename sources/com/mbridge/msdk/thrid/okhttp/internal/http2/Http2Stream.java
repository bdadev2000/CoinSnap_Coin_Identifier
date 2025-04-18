package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.Headers;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okhttp.internal.http2.Header;
import com.mbridge.msdk.thrid.okio.AsyncTimeout;
import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.BufferedSource;
import com.mbridge.msdk.thrid.okio.Sink;
import com.mbridge.msdk.thrid.okio.Source;
import com.mbridge.msdk.thrid.okio.Timeout;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class Http2Stream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    long bytesLeftInWriteWindow;
    final Http2Connection connection;
    ErrorCode errorCode;
    private boolean hasResponseHeaders;
    private Header.Listener headersListener;
    private final Deque<Headers> headersQueue;

    /* renamed from: id, reason: collision with root package name */
    final int f15359id;
    final StreamTimeout readTimeout;
    final FramingSink sink;
    private final FramingSource source;
    long unacknowledgedBytesRead = 0;
    final StreamTimeout writeTimeout;

    /* loaded from: classes4.dex */
    public final class FramingSink implements Sink {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final long EMIT_BUFFER_SIZE = 16384;
        boolean closed;
        boolean finished;
        private final Buffer sendBuffer = new Buffer();

        public FramingSink() {
        }

        private void emitFrame(boolean z10) throws IOException {
            Http2Stream http2Stream;
            long min;
            Http2Stream http2Stream2;
            boolean z11;
            synchronized (Http2Stream.this) {
                Http2Stream.this.writeTimeout.enter();
                while (true) {
                    try {
                        http2Stream = Http2Stream.this;
                        if (http2Stream.bytesLeftInWriteWindow > 0 || this.finished || this.closed || http2Stream.errorCode != null) {
                            break;
                        } else {
                            http2Stream.waitForIo();
                        }
                    } finally {
                    }
                }
                http2Stream.writeTimeout.exitAndThrowIfTimedOut();
                Http2Stream.this.checkOutNotClosed();
                min = Math.min(Http2Stream.this.bytesLeftInWriteWindow, this.sendBuffer.size());
                http2Stream2 = Http2Stream.this;
                http2Stream2.bytesLeftInWriteWindow -= min;
            }
            http2Stream2.writeTimeout.enter();
            try {
                Http2Stream http2Stream3 = Http2Stream.this;
                Http2Connection http2Connection = http2Stream3.connection;
                int i10 = http2Stream3.f15359id;
                if (z10 && min == this.sendBuffer.size()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                http2Connection.writeData(i10, z11, this.sendBuffer, min);
            } finally {
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (Http2Stream.this) {
                if (this.closed) {
                    return;
                }
                if (!Http2Stream.this.sink.finished) {
                    if (this.sendBuffer.size() > 0) {
                        while (this.sendBuffer.size() > 0) {
                            emitFrame(true);
                        }
                    } else {
                        Http2Stream http2Stream = Http2Stream.this;
                        http2Stream.connection.writeData(http2Stream.f15359id, true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.closed = true;
                }
                Http2Stream.this.connection.flush();
                Http2Stream.this.cancelStreamIfNecessary();
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            synchronized (Http2Stream.this) {
                Http2Stream.this.checkOutNotClosed();
            }
            while (this.sendBuffer.size() > 0) {
                emitFrame(false);
                Http2Stream.this.connection.flush();
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink
        public Timeout timeout() {
            return Http2Stream.this.writeTimeout;
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink
        public void write(Buffer buffer, long j3) throws IOException {
            this.sendBuffer.write(buffer, j3);
            while (this.sendBuffer.size() >= EMIT_BUFFER_SIZE) {
                emitFrame(false);
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class FramingSource implements Source {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        boolean closed;
        boolean finished;
        private final long maxByteCount;
        private final Buffer receiveBuffer = new Buffer();
        private final Buffer readBuffer = new Buffer();

        public FramingSource(long j3) {
            this.maxByteCount = j3;
        }

        private void updateConnectionFlowControl(long j3) {
            Http2Stream.this.connection.updateConnectionFlowControl(j3);
        }

        @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            ArrayList arrayList;
            Header.Listener listener;
            synchronized (Http2Stream.this) {
                this.closed = true;
                size = this.readBuffer.size();
                this.readBuffer.clear();
                if (!Http2Stream.this.headersQueue.isEmpty() && Http2Stream.this.headersListener != null) {
                    arrayList = new ArrayList(Http2Stream.this.headersQueue);
                    Http2Stream.this.headersQueue.clear();
                    listener = Http2Stream.this.headersListener;
                } else {
                    arrayList = null;
                    listener = null;
                }
                Http2Stream.this.notifyAll();
            }
            if (size > 0) {
                updateConnectionFlowControl(size);
            }
            Http2Stream.this.cancelStreamIfNecessary();
            if (listener != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    listener.onHeaders((Headers) it.next());
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:61:0x00d4, code lost:
        
            throw new java.io.IOException("stream closed");
         */
        @Override // com.mbridge.msdk.thrid.okio.Source
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long read(com.mbridge.msdk.thrid.okio.Buffer r18, long r19) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 237
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.Http2Stream.FramingSource.read(com.mbridge.msdk.thrid.okio.Buffer, long):long");
        }

        public void receive(BufferedSource bufferedSource, long j3) throws IOException {
            boolean z10;
            boolean z11;
            boolean z12;
            long j10;
            while (j3 > 0) {
                synchronized (Http2Stream.this) {
                    z10 = this.finished;
                    z11 = true;
                    if (this.readBuffer.size() + j3 > this.maxByteCount) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    bufferedSource.skip(j3);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    bufferedSource.skip(j3);
                    return;
                }
                long read = bufferedSource.read(this.receiveBuffer, j3);
                if (read != -1) {
                    j3 -= read;
                    synchronized (Http2Stream.this) {
                        if (this.closed) {
                            j10 = this.receiveBuffer.size();
                            this.receiveBuffer.clear();
                        } else {
                            if (this.readBuffer.size() != 0) {
                                z11 = false;
                            }
                            this.readBuffer.writeAll(this.receiveBuffer);
                            if (z11) {
                                Http2Stream.this.notifyAll();
                            }
                            j10 = 0;
                        }
                    }
                    if (j10 > 0) {
                        updateConnectionFlowControl(j10);
                    }
                } else {
                    throw new EOFException();
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.Source
        public Timeout timeout() {
            return Http2Stream.this.readTimeout;
        }
    }

    /* loaded from: classes4.dex */
    public class StreamTimeout extends AsyncTimeout {
        public StreamTimeout() {
        }

        public void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.AsyncTimeout
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.mbridge.msdk.thrid.okio.AsyncTimeout
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.connection.sendDegradedPingLater();
        }
    }

    public Http2Stream(int i10, Http2Connection http2Connection, boolean z10, boolean z11, Headers headers) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.headersQueue = arrayDeque;
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        this.errorCode = null;
        if (http2Connection != null) {
            this.f15359id = i10;
            this.connection = http2Connection;
            this.bytesLeftInWriteWindow = http2Connection.peerSettings.getInitialWindowSize();
            FramingSource framingSource = new FramingSource(http2Connection.okHttpSettings.getInitialWindowSize());
            this.source = framingSource;
            FramingSink framingSink = new FramingSink();
            this.sink = framingSink;
            framingSource.finished = z11;
            framingSink.finished = z10;
            if (headers != null) {
                arrayDeque.add(headers);
            }
            if (isLocallyInitiated() && headers != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            if (!isLocallyInitiated() && headers == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
            return;
        }
        throw new NullPointerException("connection == null");
    }

    private boolean closeInternal(ErrorCode errorCode) {
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.finished && this.sink.finished) {
                return false;
            }
            this.errorCode = errorCode;
            notifyAll();
            this.connection.removeStream(this.f15359id);
            return true;
        }
    }

    public void addBytesToWriteWindow(long j3) {
        this.bytesLeftInWriteWindow += j3;
        if (j3 > 0) {
            notifyAll();
        }
    }

    public void cancelStreamIfNecessary() throws IOException {
        boolean z10;
        boolean isOpen;
        synchronized (this) {
            FramingSource framingSource = this.source;
            if (!framingSource.finished && framingSource.closed) {
                FramingSink framingSink = this.sink;
                if (framingSink.finished || framingSink.closed) {
                    z10 = true;
                    isOpen = isOpen();
                }
            }
            z10 = false;
            isOpen = isOpen();
        }
        if (z10) {
            close(ErrorCode.CANCEL);
        } else if (!isOpen) {
            this.connection.removeStream(this.f15359id);
        }
    }

    public void checkOutNotClosed() throws IOException {
        FramingSink framingSink = this.sink;
        if (!framingSink.closed) {
            if (!framingSink.finished) {
                if (this.errorCode == null) {
                    return;
                } else {
                    throw new StreamResetException(this.errorCode);
                }
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public void close(ErrorCode errorCode) throws IOException {
        if (!closeInternal(errorCode)) {
            return;
        }
        this.connection.writeSynReset(this.f15359id, errorCode);
    }

    public void closeLater(ErrorCode errorCode) {
        if (!closeInternal(errorCode)) {
            return;
        }
        this.connection.writeSynResetLater(this.f15359id, errorCode);
    }

    public Http2Connection getConnection() {
        return this.connection;
    }

    public synchronized ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public int getId() {
        return this.f15359id;
    }

    public Sink getSink() {
        synchronized (this) {
            if (!this.hasResponseHeaders && !isLocallyInitiated()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.sink;
    }

    public Source getSource() {
        return this.source;
    }

    public boolean isLocallyInitiated() {
        boolean z10;
        if ((this.f15359id & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.connection.client == z10) {
            return true;
        }
        return false;
    }

    public synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        FramingSource framingSource = this.source;
        if (framingSource.finished || framingSource.closed) {
            FramingSink framingSink = this.sink;
            if (framingSink.finished || framingSink.closed) {
                if (this.hasResponseHeaders) {
                    return false;
                }
            }
        }
        return true;
    }

    public Timeout readTimeout() {
        return this.readTimeout;
    }

    public void receiveData(BufferedSource bufferedSource, int i10) throws IOException {
        this.source.receive(bufferedSource, i10);
    }

    public void receiveFin() {
        boolean isOpen;
        synchronized (this) {
            this.source.finished = true;
            isOpen = isOpen();
            notifyAll();
        }
        if (!isOpen) {
            this.connection.removeStream(this.f15359id);
        }
    }

    public void receiveHeaders(List<Header> list) {
        boolean isOpen;
        synchronized (this) {
            this.hasResponseHeaders = true;
            this.headersQueue.add(Util.toHeaders(list));
            isOpen = isOpen();
            notifyAll();
        }
        if (!isOpen) {
            this.connection.removeStream(this.f15359id);
        }
    }

    public synchronized void receiveRstStream(ErrorCode errorCode) {
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public synchronized void setHeadersListener(Header.Listener listener) {
        this.headersListener = listener;
        if (!this.headersQueue.isEmpty() && listener != null) {
            notifyAll();
        }
    }

    public synchronized Headers takeHeaders() throws IOException {
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo();
            } catch (Throwable th2) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th2;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!this.headersQueue.isEmpty()) {
        } else {
            throw new StreamResetException(this.errorCode);
        }
        return this.headersQueue.removeFirst();
    }

    public void waitForIo() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public void writeHeaders(List<Header> list, boolean z10) throws IOException {
        boolean z11;
        boolean z12;
        boolean z13;
        if (list != null) {
            synchronized (this) {
                z11 = true;
                this.hasResponseHeaders = true;
                if (!z10) {
                    this.sink.finished = true;
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z12;
            }
            if (!z12) {
                synchronized (this.connection) {
                    if (this.connection.bytesLeftInWriteWindow != 0) {
                        z11 = false;
                    }
                }
                z12 = z11;
            }
            this.connection.writeSynReply(this.f15359id, z13, list);
            if (z12) {
                this.connection.flush();
                return;
            }
            return;
        }
        throw new NullPointerException("headers == null");
    }

    public Timeout writeTimeout() {
        return this.writeTimeout;
    }
}
