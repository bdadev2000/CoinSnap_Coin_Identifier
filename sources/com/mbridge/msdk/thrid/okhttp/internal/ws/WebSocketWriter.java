package com.mbridge.msdk.thrid.okhttp.internal.ws;

import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.BufferedSink;
import com.mbridge.msdk.thrid.okio.ByteString;
import com.mbridge.msdk.thrid.okio.Sink;
import com.mbridge.msdk.thrid.okio.Timeout;
import java.io.IOException;
import java.util.Random;

/* loaded from: classes3.dex */
final class WebSocketWriter {
    boolean activeWriter;
    final Buffer buffer = new Buffer();
    final FrameSink frameSink = new FrameSink();
    final boolean isClient;
    private final Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    final Random random;
    final BufferedSink sink;
    final Buffer sinkBuffer;
    boolean writerClosed;

    /* loaded from: classes3.dex */
    public final class FrameSink implements Sink {
        boolean closed;
        long contentLength;
        int formatOpcode;
        boolean isFirstFrame;

        public FrameSink() {
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.size(), this.isFirstFrame, true);
                this.closed = true;
                WebSocketWriter.this.activeWriter = false;
                return;
            }
            throw new IOException("closed");
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.size(), this.isFirstFrame, false);
                this.isFirstFrame = false;
                return;
            }
            throw new IOException("closed");
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink
        public Timeout timeout() {
            return WebSocketWriter.this.sink.timeout();
        }

        @Override // com.mbridge.msdk.thrid.okio.Sink
        public void write(Buffer buffer, long j7) throws IOException {
            boolean z8;
            if (!this.closed) {
                WebSocketWriter.this.buffer.write(buffer, j7);
                if (this.isFirstFrame && this.contentLength != -1 && WebSocketWriter.this.buffer.size() > this.contentLength - 8192) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                long completeSegmentByteCount = WebSocketWriter.this.buffer.completeSegmentByteCount();
                if (completeSegmentByteCount > 0 && !z8) {
                    WebSocketWriter.this.writeMessageFrame(this.formatOpcode, completeSegmentByteCount, this.isFirstFrame, false);
                    this.isFirstFrame = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    public WebSocketWriter(boolean z8, BufferedSink bufferedSink, Random random) {
        byte[] bArr;
        if (bufferedSink != null) {
            if (random != null) {
                this.isClient = z8;
                this.sink = bufferedSink;
                this.sinkBuffer = bufferedSink.buffer();
                this.random = random;
                if (z8) {
                    bArr = new byte[4];
                } else {
                    bArr = null;
                }
                this.maskKey = bArr;
                this.maskCursor = z8 ? new Buffer.UnsafeCursor() : null;
                return;
            }
            throw new NullPointerException("random == null");
        }
        throw new NullPointerException("sink == null");
    }

    private void writeControlFrame(int i9, ByteString byteString) throws IOException {
        if (!this.writerClosed) {
            int size = byteString.size();
            if (size <= 125) {
                this.sinkBuffer.writeByte(i9 | 128);
                if (this.isClient) {
                    this.sinkBuffer.writeByte(size | 128);
                    this.random.nextBytes(this.maskKey);
                    this.sinkBuffer.write(this.maskKey);
                    if (size > 0) {
                        long size2 = this.sinkBuffer.size();
                        this.sinkBuffer.write(byteString);
                        this.sinkBuffer.readAndWriteUnsafe(this.maskCursor);
                        this.maskCursor.seek(size2);
                        WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.writeByte(size);
                    this.sinkBuffer.write(byteString);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    public Sink newMessageSink(int i9, long j7) {
        if (!this.activeWriter) {
            this.activeWriter = true;
            FrameSink frameSink = this.frameSink;
            frameSink.formatOpcode = i9;
            frameSink.contentLength = j7;
            frameSink.isFirstFrame = true;
            frameSink.closed = false;
            return frameSink;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    public void writeClose(int i9, ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.EMPTY;
        if (i9 != 0 || byteString != null) {
            if (i9 != 0) {
                WebSocketProtocol.validateCloseCode(i9);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(i9);
            if (byteString != null) {
                buffer.write(byteString);
            }
            byteString2 = buffer.readByteString();
        }
        try {
            writeControlFrame(8, byteString2);
        } finally {
            this.writerClosed = true;
        }
    }

    public void writeMessageFrame(int i9, long j7, boolean z8, boolean z9) throws IOException {
        if (!this.writerClosed) {
            int i10 = 0;
            if (!z8) {
                i9 = 0;
            }
            if (z9) {
                i9 |= 128;
            }
            this.sinkBuffer.writeByte(i9);
            if (this.isClient) {
                i10 = 128;
            }
            if (j7 <= 125) {
                this.sinkBuffer.writeByte(((int) j7) | i10);
            } else if (j7 <= 65535) {
                this.sinkBuffer.writeByte(i10 | 126);
                this.sinkBuffer.writeShort((int) j7);
            } else {
                this.sinkBuffer.writeByte(i10 | 127);
                this.sinkBuffer.writeLong(j7);
            }
            if (this.isClient) {
                this.random.nextBytes(this.maskKey);
                this.sinkBuffer.write(this.maskKey);
                if (j7 > 0) {
                    long size = this.sinkBuffer.size();
                    this.sinkBuffer.write(this.buffer, j7);
                    this.sinkBuffer.readAndWriteUnsafe(this.maskCursor);
                    this.maskCursor.seek(size);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            } else {
                this.sinkBuffer.write(this.buffer, j7);
            }
            this.sink.emit();
            return;
        }
        throw new IOException("closed");
    }

    public void writePing(ByteString byteString) throws IOException {
        writeControlFrame(9, byteString);
    }

    public void writePong(ByteString byteString) throws IOException {
        writeControlFrame(10, byteString);
    }
}
