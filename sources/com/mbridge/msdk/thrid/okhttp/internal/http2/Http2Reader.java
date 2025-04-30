package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okhttp.internal.http2.Hpack;
import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.BufferedSource;
import com.mbridge.msdk.thrid.okio.ByteString;
import com.mbridge.msdk.thrid.okio.Source;
import com.mbridge.msdk.thrid.okio.Timeout;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Http2Reader implements Closeable {
    static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private final ContinuationSource continuation;
    final Hpack.Reader hpackReader;
    private final BufferedSource source;

    /* loaded from: classes3.dex */
    public static final class ContinuationSource implements Source {
        byte flags;
        int left;
        int length;
        short padding;
        private final BufferedSource source;
        int streamId;

        public ContinuationSource(BufferedSource bufferedSource) {
            this.source = bufferedSource;
        }

        private void readContinuationHeader() throws IOException {
            int i9 = this.streamId;
            int readMedium = Http2Reader.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            byte readByte = (byte) (this.source.readByte() & 255);
            this.flags = (byte) (this.source.readByte() & 255);
            Logger logger = Http2Reader.logger;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.frameLog(true, this.streamId, this.length, readByte, this.flags));
            }
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = readInt;
            if (readByte == 9) {
                if (readInt == i9) {
                    return;
                } else {
                    throw Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
                }
            }
            throw Http2.ioException("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
        }

        @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // com.mbridge.msdk.thrid.okio.Source
        public long read(Buffer buffer, long j7) throws IOException {
            while (true) {
                int i9 = this.left;
                if (i9 == 0) {
                    this.source.skip(this.padding);
                    this.padding = (short) 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    readContinuationHeader();
                } else {
                    long read = this.source.read(buffer, Math.min(j7, i9));
                    if (read == -1) {
                        return -1L;
                    }
                    this.left = (int) (this.left - read);
                    return read;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.Source
        public Timeout timeout() {
            return this.source.timeout();
        }
    }

    /* loaded from: classes3.dex */
    public interface Handler {
        void ackSettings();

        void alternateService(int i9, String str, ByteString byteString, String str2, int i10, long j7);

        void data(boolean z8, int i9, BufferedSource bufferedSource, int i10) throws IOException;

        void goAway(int i9, ErrorCode errorCode, ByteString byteString);

        void headers(boolean z8, int i9, int i10, List<Header> list);

        void ping(boolean z8, int i9, int i10);

        void priority(int i9, int i10, int i11, boolean z8);

        void pushPromise(int i9, int i10, List<Header> list) throws IOException;

        void rstStream(int i9, ErrorCode errorCode);

        void settings(boolean z8, Settings settings);

        void windowUpdate(int i9, long j7);
    }

    public Http2Reader(BufferedSource bufferedSource, boolean z8) {
        this.source = bufferedSource;
        this.client = z8;
        ContinuationSource continuationSource = new ContinuationSource(bufferedSource);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(4096, continuationSource);
    }

    public static int lengthWithoutPadding(int i9, byte b, short s5) throws IOException {
        if ((b & 8) != 0) {
            i9--;
        }
        if (s5 <= i9) {
            return (short) (i9 - s5);
        }
        throw Http2.ioException("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s5), Integer.valueOf(i9));
    }

    private void readData(Handler handler, int i9, byte b, int i10) throws IOException {
        boolean z8;
        short s5 = 0;
        if (i10 != 0) {
            if ((b & 1) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((b & 32) == 0) {
                if ((b & 8) != 0) {
                    s5 = (short) (this.source.readByte() & 255);
                }
                handler.data(z8, i10, this.source, lengthWithoutPadding(i9, b, s5));
                this.source.skip(s5);
                return;
            }
            throw Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        throw Http2.ioException("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    private void readGoAway(Handler handler, int i9, byte b, int i10) throws IOException {
        if (i9 >= 8) {
            if (i10 == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                int i11 = i9 - 8;
                ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt2);
                if (fromHttp2 != null) {
                    ByteString byteString = ByteString.EMPTY;
                    if (i11 > 0) {
                        byteString = this.source.readByteString(i11);
                    }
                    handler.goAway(readInt, fromHttp2, byteString);
                    return;
                }
                throw Http2.ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            }
            throw Http2.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        throw Http2.ioException("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i9));
    }

    private List<Header> readHeaderBlock(int i9, short s5, byte b, int i10) throws IOException {
        ContinuationSource continuationSource = this.continuation;
        continuationSource.left = i9;
        continuationSource.length = i9;
        continuationSource.padding = s5;
        continuationSource.flags = b;
        continuationSource.streamId = i10;
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private void readHeaders(Handler handler, int i9, byte b, int i10) throws IOException {
        boolean z8;
        short s5 = 0;
        if (i10 != 0) {
            if ((b & 1) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((b & 8) != 0) {
                s5 = (short) (this.source.readByte() & 255);
            }
            if ((b & 32) != 0) {
                readPriority(handler, i10);
                i9 -= 5;
            }
            handler.headers(z8, i10, -1, readHeaderBlock(lengthWithoutPadding(i9, b, s5), s5, b, i10));
            return;
        }
        throw Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    public static int readMedium(BufferedSource bufferedSource) throws IOException {
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    private void readPing(Handler handler, int i9, byte b, int i10) throws IOException {
        if (i9 == 8) {
            boolean z8 = false;
            if (i10 == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                if ((b & 1) != 0) {
                    z8 = true;
                }
                handler.ping(z8, readInt, readInt2);
                return;
            }
            throw Http2.ioException("TYPE_PING streamId != 0", new Object[0]);
        }
        throw Http2.ioException("TYPE_PING length != 8: %s", Integer.valueOf(i9));
    }

    private void readPriority(Handler handler, int i9, byte b, int i10) throws IOException {
        if (i9 != 5) {
            throw Http2.ioException("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i9));
        }
        if (i10 != 0) {
            readPriority(handler, i10);
            return;
        }
        throw Http2.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
    }

    private void readPushPromise(Handler handler, int i9, byte b, int i10) throws IOException {
        short s5 = 0;
        if (i10 != 0) {
            if ((b & 8) != 0) {
                s5 = (short) (this.source.readByte() & 255);
            }
            handler.pushPromise(i10, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(lengthWithoutPadding(i9 - 4, b, s5), s5, b, i10));
            return;
        }
        throw Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    private void readRstStream(Handler handler, int i9, byte b, int i10) throws IOException {
        if (i9 == 4) {
            if (i10 != 0) {
                int readInt = this.source.readInt();
                ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt);
                if (fromHttp2 != null) {
                    handler.rstStream(i10, fromHttp2);
                    return;
                }
                throw Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
            throw Http2.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        throw Http2.ioException("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i9));
    }

    private void readSettings(Handler handler, int i9, byte b, int i10) throws IOException {
        if (i10 == 0) {
            if ((b & 1) != 0) {
                if (i9 == 0) {
                    handler.ackSettings();
                    return;
                }
                throw Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            if (i9 % 6 == 0) {
                Settings settings = new Settings();
                for (int i11 = 0; i11 < i9; i11 += 6) {
                    int readShort = this.source.readShort() & 65535;
                    int readInt = this.source.readInt();
                    if (readShort != 2) {
                        if (readShort != 3) {
                            if (readShort != 4) {
                                if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                                    throw Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                                }
                            } else if (readInt >= 0) {
                                readShort = 7;
                            } else {
                                throw Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            }
                        } else {
                            readShort = 4;
                        }
                    } else if (readInt != 0 && readInt != 1) {
                        throw Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    }
                    settings.set(readShort, readInt);
                }
                handler.settings(false, settings);
                return;
            }
            throw Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i9));
        }
        throw Http2.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
    }

    private void readWindowUpdate(Handler handler, int i9, byte b, int i10) throws IOException {
        if (i9 == 4) {
            long readInt = this.source.readInt() & 2147483647L;
            if (readInt != 0) {
                handler.windowUpdate(i10, readInt);
                return;
            }
            throw Http2.ioException("windowSizeIncrement was 0", Long.valueOf(readInt));
        }
        throw Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i9));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public boolean nextFrame(boolean z8, Handler handler) throws IOException {
        try {
            this.source.require(9L);
            int readMedium = readMedium(this.source);
            if (readMedium >= 0 && readMedium <= 16384) {
                byte readByte = (byte) (this.source.readByte() & 255);
                if (z8 && readByte != 4) {
                    throw Http2.ioException("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
                }
                byte readByte2 = (byte) (this.source.readByte() & 255);
                int readInt = this.source.readInt() & Integer.MAX_VALUE;
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Http2.frameLog(true, readInt, readMedium, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        readData(handler, readMedium, readByte2, readInt);
                        return true;
                    case 1:
                        readHeaders(handler, readMedium, readByte2, readInt);
                        return true;
                    case 2:
                        readPriority(handler, readMedium, readByte2, readInt);
                        return true;
                    case 3:
                        readRstStream(handler, readMedium, readByte2, readInt);
                        return true;
                    case 4:
                        readSettings(handler, readMedium, readByte2, readInt);
                        return true;
                    case 5:
                        readPushPromise(handler, readMedium, readByte2, readInt);
                        return true;
                    case 6:
                        readPing(handler, readMedium, readByte2, readInt);
                        return true;
                    case 7:
                        readGoAway(handler, readMedium, readByte2, readInt);
                        return true;
                    case 8:
                        readWindowUpdate(handler, readMedium, readByte2, readInt);
                        return true;
                    default:
                        this.source.skip(readMedium);
                        return true;
                }
            }
            throw Http2.ioException("FRAME_SIZE_ERROR: %s", Integer.valueOf(readMedium));
        } catch (IOException unused) {
            return false;
        }
    }

    public void readConnectionPreface(Handler handler) throws IOException {
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw Http2.ioException("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        BufferedSource bufferedSource = this.source;
        ByteString byteString = Http2.CONNECTION_PREFACE;
        ByteString readByteString = bufferedSource.readByteString(byteString.size());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format("<< CONNECTION %s", readByteString.hex()));
        }
        if (byteString.equals(readByteString)) {
        } else {
            throw Http2.ioException("Expected a connection header but was %s", readByteString.utf8());
        }
    }

    private void readPriority(Handler handler, int i9) throws IOException {
        int readInt = this.source.readInt();
        handler.priority(i9, readInt & Integer.MAX_VALUE, (this.source.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }
}
