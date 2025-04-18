package com.mbridge.msdk.thrid.okhttp.internal.ws;

import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.BufferedSource;
import com.mbridge.msdk.thrid.okio.ByteString;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.UByte;

/* loaded from: classes4.dex */
final class WebSocketReader {
    boolean closed;
    final FrameCallback frameCallback;
    long frameLength;
    final boolean isClient;
    boolean isControlFrame;
    boolean isFinalFrame;
    private final Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    int opcode;
    final BufferedSource source;
    private final Buffer controlFrameBuffer = new Buffer();
    private final Buffer messageFrameBuffer = new Buffer();

    /* loaded from: classes4.dex */
    public interface FrameCallback {
        void onReadClose(int i10, String str);

        void onReadMessage(ByteString byteString) throws IOException;

        void onReadMessage(String str) throws IOException;

        void onReadPing(ByteString byteString);

        void onReadPong(ByteString byteString);
    }

    public WebSocketReader(boolean z10, BufferedSource bufferedSource, FrameCallback frameCallback) {
        byte[] bArr;
        if (bufferedSource != null) {
            if (frameCallback != null) {
                this.isClient = z10;
                this.source = bufferedSource;
                this.frameCallback = frameCallback;
                if (z10) {
                    bArr = null;
                } else {
                    bArr = new byte[4];
                }
                this.maskKey = bArr;
                this.maskCursor = z10 ? null : new Buffer.UnsafeCursor();
                return;
            }
            throw new NullPointerException("frameCallback == null");
        }
        throw new NullPointerException("source == null");
    }

    private void readControlFrame() throws IOException {
        short s5;
        String str;
        long j3 = this.frameLength;
        if (j3 > 0) {
            this.source.readFully(this.controlFrameBuffer, j3);
            if (!this.isClient) {
                this.controlFrameBuffer.readAndWriteUnsafe(this.maskCursor);
                this.maskCursor.seek(0L);
                WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                long size = this.controlFrameBuffer.size();
                if (size != 1) {
                    if (size != 0) {
                        s5 = this.controlFrameBuffer.readShort();
                        str = this.controlFrameBuffer.readUtf8();
                        String closeCodeExceptionMessage = WebSocketProtocol.closeCodeExceptionMessage(s5);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        s5 = 1005;
                        str = "";
                    }
                    this.frameCallback.onReadClose(s5, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.readByteString());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.readByteString());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.opcode));
        }
    }

    /* JADX WARN: Finally extract failed */
    private void readHeader() throws IOException {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        String str;
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int readByte = this.source.readByte() & UByte.MAX_VALUE;
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                this.opcode = readByte & 15;
                boolean z15 = true;
                if ((readByte & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.isFinalFrame = z10;
                if ((readByte & 8) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.isControlFrame = z11;
                if (z11 && !z10) {
                    throw new ProtocolException("Control frames must be final.");
                }
                if ((readByte & 64) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((readByte & 32) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((readByte & 16) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z12 && !z13 && !z14) {
                    int readByte2 = this.source.readByte() & UByte.MAX_VALUE;
                    if ((readByte2 & 128) == 0) {
                        z15 = false;
                    }
                    if (z15 == this.isClient) {
                        if (this.isClient) {
                            str = "Server-sent frames must not be masked.";
                        } else {
                            str = "Client-sent frames must be masked.";
                        }
                        throw new ProtocolException(str);
                    }
                    long j3 = readByte2 & 127;
                    this.frameLength = j3;
                    if (j3 == 126) {
                        this.frameLength = this.source.readShort() & 65535;
                    } else if (j3 == 127) {
                        long readLong = this.source.readLong();
                        this.frameLength = readLong;
                        if (readLong < 0) {
                            throw new ProtocolException("Frame length 0x" + Long.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                        }
                    }
                    if (this.isControlFrame && this.frameLength > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    }
                    if (z15) {
                        this.source.readFully(this.maskKey);
                        return;
                    }
                    return;
                }
                throw new ProtocolException("Reserved flags are unsupported.");
            } catch (Throwable th2) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th2;
            }
        }
        throw new IOException("closed");
    }

    private void readMessage() throws IOException {
        while (!this.closed) {
            long j3 = this.frameLength;
            if (j3 > 0) {
                this.source.readFully(this.messageFrameBuffer, j3);
                if (!this.isClient) {
                    this.messageFrameBuffer.readAndWriteUnsafe(this.maskCursor);
                    this.maskCursor.seek(this.messageFrameBuffer.size() - this.frameLength);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.opcode));
            }
        }
        throw new IOException("closed");
    }

    private void readMessageFrame() throws IOException {
        int i10 = this.opcode;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i10));
        }
        readMessage();
        if (i10 == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.readUtf8());
        } else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.readByteString());
        }
    }

    private void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    public void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
