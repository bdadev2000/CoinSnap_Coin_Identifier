package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okhttp.internal.http2.Hpack;
import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.BufferedSink;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final Buffer hpackBuffer;
    final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final BufferedSink sink;

    public Http2Writer(BufferedSink bufferedSink, boolean z8) {
        this.sink = bufferedSink;
        this.client = z8;
        Buffer buffer = new Buffer();
        this.hpackBuffer = buffer;
        this.hpackWriter = new Hpack.Writer(buffer);
        this.maxFrameSize = 16384;
    }

    private void writeContinuationFrames(int i9, long j7) throws IOException {
        byte b;
        while (j7 > 0) {
            int min = (int) Math.min(this.maxFrameSize, j7);
            long j9 = min;
            j7 -= j9;
            if (j7 == 0) {
                b = 4;
            } else {
                b = 0;
            }
            frameHeader(i9, min, (byte) 9, b);
            this.sink.write(this.hpackBuffer, j9);
        }
    }

    private static void writeMedium(BufferedSink bufferedSink, int i9) throws IOException {
        bufferedSink.writeByte((i9 >>> 16) & 255);
        bufferedSink.writeByte((i9 >>> 8) & 255);
        bufferedSink.writeByte(i9 & 255);
    }

    public synchronized void applyAndAckSettings(Settings settings) throws IOException {
        try {
            if (!this.closed) {
                this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
                if (settings.getHeaderTableSize() != -1) {
                    this.hpackWriter.setHeaderTableSizeSetting(settings.getHeaderTableSize());
                }
                frameHeader(0, 0, (byte) 4, (byte) 1);
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public synchronized void connectionPreface() throws IOException {
        try {
            if (!this.closed) {
                if (!this.client) {
                    return;
                }
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Util.format(">> CONNECTION %s", Http2.CONNECTION_PREFACE.hex()));
                }
                this.sink.write(Http2.CONNECTION_PREFACE.toByteArray());
                this.sink.flush();
                return;
            }
            throw new IOException("closed");
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void data(boolean z8, int i9, Buffer buffer, int i10) throws IOException {
        byte b;
        if (!this.closed) {
            if (z8) {
                b = (byte) 1;
            } else {
                b = 0;
            }
            dataFrame(i9, b, buffer, i10);
        } else {
            throw new IOException("closed");
        }
    }

    public void dataFrame(int i9, byte b, Buffer buffer, int i10) throws IOException {
        frameHeader(i9, i10, (byte) 0, b);
        if (i10 > 0) {
            this.sink.write(buffer, i10);
        }
    }

    public synchronized void flush() throws IOException {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public void frameHeader(int i9, int i10, byte b, byte b8) throws IOException {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.frameLog(false, i9, i10, b, b8));
        }
        int i11 = this.maxFrameSize;
        if (i10 <= i11) {
            if ((Integer.MIN_VALUE & i9) == 0) {
                writeMedium(this.sink, i10);
                this.sink.writeByte(b & 255);
                this.sink.writeByte(b8 & 255);
                this.sink.writeInt(i9 & Integer.MAX_VALUE);
                return;
            }
            throw Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i9));
        }
        throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i11), Integer.valueOf(i10));
    }

    public synchronized void goAway(int i9, ErrorCode errorCode, byte[] bArr) throws IOException {
        try {
            if (!this.closed) {
                if (errorCode.httpCode != -1) {
                    frameHeader(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.sink.writeInt(i9);
                    this.sink.writeInt(errorCode.httpCode);
                    if (bArr.length > 0) {
                        this.sink.write(bArr);
                    }
                    this.sink.flush();
                } else {
                    throw Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void headers(int i9, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(false, i9, list);
        } else {
            throw new IOException("closed");
        }
    }

    public int maxDataLength() {
        return this.maxFrameSize;
    }

    public synchronized void ping(boolean z8, int i9, int i10) throws IOException {
        if (!this.closed) {
            frameHeader(0, 8, (byte) 6, z8 ? (byte) 1 : (byte) 0);
            this.sink.writeInt(i9);
            this.sink.writeInt(i10);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void pushPromise(int i9, int i10, List<Header> list) throws IOException {
        byte b;
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int min = (int) Math.min(this.maxFrameSize - 4, size);
            long j7 = min;
            if (size == j7) {
                b = 4;
            } else {
                b = 0;
            }
            frameHeader(i9, min + 4, (byte) 5, b);
            this.sink.writeInt(i10 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j7);
            if (size > j7) {
                writeContinuationFrames(i9, size - j7);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void rstStream(int i9, ErrorCode errorCode) throws IOException {
        if (!this.closed) {
            if (errorCode.httpCode != -1) {
                frameHeader(i9, 4, (byte) 3, (byte) 0);
                this.sink.writeInt(errorCode.httpCode);
                this.sink.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void settings(Settings settings) throws IOException {
        int i9;
        try {
            if (!this.closed) {
                frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
                for (int i10 = 0; i10 < 10; i10++) {
                    if (settings.isSet(i10)) {
                        if (i10 == 4) {
                            i9 = 3;
                        } else if (i10 == 7) {
                            i9 = 4;
                        } else {
                            i9 = i10;
                        }
                        this.sink.writeShort(i9);
                        this.sink.writeInt(settings.get(i10));
                    }
                }
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void synReply(boolean z8, int i9, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(z8, i9, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void synStream(boolean z8, int i9, int i10, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(z8, i9, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void windowUpdate(int i9, long j7) throws IOException {
        if (!this.closed) {
            if (j7 != 0 && j7 <= 2147483647L) {
                frameHeader(i9, 4, (byte) 8, (byte) 0);
                this.sink.writeInt((int) j7);
                this.sink.flush();
            } else {
                throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j7));
            }
        } else {
            throw new IOException("closed");
        }
    }

    public void headers(boolean z8, int i9, List<Header> list) throws IOException {
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int min = (int) Math.min(this.maxFrameSize, size);
            long j7 = min;
            byte b = size == j7 ? (byte) 4 : (byte) 0;
            if (z8) {
                b = (byte) (b | 1);
            }
            frameHeader(i9, min, (byte) 1, b);
            this.sink.write(this.hpackBuffer, j7);
            if (size > j7) {
                writeContinuationFrames(i9, size - j7);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }
}
