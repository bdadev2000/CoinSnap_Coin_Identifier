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
import kotlin.UByte;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes4.dex */
final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final Buffer hpackBuffer;
    final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final BufferedSink sink;

    public Http2Writer(BufferedSink bufferedSink, boolean z10) {
        this.sink = bufferedSink;
        this.client = z10;
        Buffer buffer = new Buffer();
        this.hpackBuffer = buffer;
        this.hpackWriter = new Hpack.Writer(buffer);
        this.maxFrameSize = JsonLexerKt.BATCH_SIZE;
    }

    private void writeContinuationFrames(int i10, long j3) throws IOException {
        byte b3;
        while (j3 > 0) {
            int min = (int) Math.min(this.maxFrameSize, j3);
            long j10 = min;
            j3 -= j10;
            if (j3 == 0) {
                b3 = 4;
            } else {
                b3 = 0;
            }
            frameHeader(i10, min, (byte) 9, b3);
            this.sink.write(this.hpackBuffer, j10);
        }
    }

    private static void writeMedium(BufferedSink bufferedSink, int i10) throws IOException {
        bufferedSink.writeByte((i10 >>> 16) & 255);
        bufferedSink.writeByte((i10 >>> 8) & 255);
        bufferedSink.writeByte(i10 & 255);
    }

    public synchronized void applyAndAckSettings(Settings settings) throws IOException {
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
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public synchronized void connectionPreface() throws IOException {
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
    }

    public synchronized void data(boolean z10, int i10, Buffer buffer, int i11) throws IOException {
        byte b3;
        if (!this.closed) {
            if (z10) {
                b3 = (byte) 1;
            } else {
                b3 = 0;
            }
            dataFrame(i10, b3, buffer, i11);
        } else {
            throw new IOException("closed");
        }
    }

    public void dataFrame(int i10, byte b3, Buffer buffer, int i11) throws IOException {
        frameHeader(i10, i11, (byte) 0, b3);
        if (i11 > 0) {
            this.sink.write(buffer, i11);
        }
    }

    public synchronized void flush() throws IOException {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public void frameHeader(int i10, int i11, byte b3, byte b10) throws IOException {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.frameLog(false, i10, i11, b3, b10));
        }
        int i12 = this.maxFrameSize;
        if (i11 <= i12) {
            if ((Integer.MIN_VALUE & i10) == 0) {
                writeMedium(this.sink, i11);
                this.sink.writeByte(b3 & UByte.MAX_VALUE);
                this.sink.writeByte(b10 & UByte.MAX_VALUE);
                this.sink.writeInt(i10 & Integer.MAX_VALUE);
                return;
            }
            throw Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i10));
        }
        throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
    }

    public synchronized void goAway(int i10, ErrorCode errorCode, byte[] bArr) throws IOException {
        if (!this.closed) {
            if (errorCode.httpCode != -1) {
                frameHeader(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.sink.writeInt(i10);
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
    }

    public synchronized void headers(int i10, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(false, i10, list);
        } else {
            throw new IOException("closed");
        }
    }

    public int maxDataLength() {
        return this.maxFrameSize;
    }

    public synchronized void ping(boolean z10, int i10, int i11) throws IOException {
        byte b3;
        if (!this.closed) {
            if (z10) {
                b3 = 1;
            } else {
                b3 = 0;
            }
            frameHeader(0, 8, (byte) 6, b3);
            this.sink.writeInt(i10);
            this.sink.writeInt(i11);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void pushPromise(int i10, int i11, List<Header> list) throws IOException {
        byte b3;
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int min = (int) Math.min(this.maxFrameSize - 4, size);
            long j3 = min;
            if (size == j3) {
                b3 = 4;
            } else {
                b3 = 0;
            }
            frameHeader(i10, min + 4, (byte) 5, b3);
            this.sink.writeInt(i11 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j3);
            if (size > j3) {
                writeContinuationFrames(i10, size - j3);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void rstStream(int i10, ErrorCode errorCode) throws IOException {
        if (!this.closed) {
            if (errorCode.httpCode != -1) {
                frameHeader(i10, 4, (byte) 3, (byte) 0);
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
        int i10;
        if (!this.closed) {
            frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
            for (int i11 = 0; i11 < 10; i11++) {
                if (settings.isSet(i11)) {
                    if (i11 == 4) {
                        i10 = 3;
                    } else if (i11 == 7) {
                        i10 = 4;
                    } else {
                        i10 = i11;
                    }
                    this.sink.writeShort(i10);
                    this.sink.writeInt(settings.get(i11));
                }
            }
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void synReply(boolean z10, int i10, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(z10, i10, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void synStream(boolean z10, int i10, int i11, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(z10, i10, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void windowUpdate(int i10, long j3) throws IOException {
        if (!this.closed) {
            if (j3 != 0 && j3 <= 2147483647L) {
                frameHeader(i10, 4, (byte) 8, (byte) 0);
                this.sink.writeInt((int) j3);
                this.sink.flush();
            } else {
                throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j3));
            }
        } else {
            throw new IOException("closed");
        }
    }

    public void headers(boolean z10, int i10, List<Header> list) throws IOException {
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int min = (int) Math.min(this.maxFrameSize, size);
            long j3 = min;
            byte b3 = size == j3 ? (byte) 4 : (byte) 0;
            if (z10) {
                b3 = (byte) (b3 | 1);
            }
            frameHeader(i10, min, (byte) 1, b3);
            this.sink.write(this.hpackBuffer, j3);
            if (size > j3) {
                writeContinuationFrames(i10, size - j3);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }
}
